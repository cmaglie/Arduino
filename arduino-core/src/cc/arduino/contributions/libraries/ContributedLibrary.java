/*
 * This file is part of Arduino.
 *
 * Copyright 2014 Arduino LLC (http://www.arduino.cc/)
 *
 * Arduino is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * As a special exception, you may use this file as part of a free software
 * library without restriction.  Specifically, if other files instantiate
 * templates or use macros or inline functions from this file, or you compile
 * this file and link it with other files to produce an executable, this
 * file does not by itself cause the resulting executable to be covered by
 * the GNU General Public License.  This exception does not however
 * invalidate any other reasons why the executable file might be covered by
 * the GNU General Public License.
 */

package cc.arduino.contributions.libraries;

import static processing.app.I18n.tr;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cc.arduino.Constants;
import cc.arduino.contributions.DownloadableContribution;
import cc.arduino.contributions.VersionHelper;
import processing.app.I18n;
import processing.app.helpers.PreferencesMap;

public class ContributedLibrary extends DownloadableContribution {

  @JsonProperty("name")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("maintainer")
  private String maintainer;

  public String getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(String maintainer) {
    this.maintainer = maintainer;
  }

  @JsonProperty("author")
  private String author;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @JsonProperty("website")
  private String website;

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  @JsonProperty("category")
  private String category;

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @JsonProperty("license")
  private String license;

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  @JsonProperty("paragraph")
  private String paragraph;

  public String getParagraph() {
    return paragraph;
  }

  public void setParagraph(String paragraph) {
    this.paragraph = paragraph;
  }

  @JsonProperty("sentence")
  private String sentence;

  public String getSentence() {
    return sentence;
  }

  public void setSentence(String sentence) {
    this.sentence = sentence;
  }

  @JsonProperty("architectures")
  private List<String> architectures;

  public List<String> getArchitectures() {
    return architectures;
  }

  public void setArchitectures(List<String> architectures) {
    this.architectures = architectures;
  }

  @JsonProperty("types")
  private List<String> types;

  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  @JsonProperty("requires")
  private List<ContributedLibraryDependency> requires;

  public List<ContributedLibraryDependency> getRequires() {
    return requires;
  }

  public void setRequires(List<ContributedLibraryDependency> requires) {
    this.requires = requires;
  }

  private boolean onGoingDevelopment;

  public void setOnGoingDevelopment(boolean onGoingDevelopment) {
    this.onGoingDevelopment = onGoingDevelopment;
  }

  public boolean isOnGoingDevelopment() {
    return onGoingDevelopment;
  }

  private List<String> declaredTypes;

  public void setDeclaredTypes(List<String> declaredTypes) {
    this.declaredTypes = declaredTypes;
  }

  public List<String> getDeclaredTypes() {
    return declaredTypes;
  }

  private List<String> includes;

  public void setIncludes(List<String> includes) {
    this.includes = includes;
  }

  public List<String> getIncludes() {
    return includes;
  }

  public enum LibraryLayout {
    FLAT, RECURSIVE
  }

  private LibraryLayout layout;

  public void setLayout(LibraryLayout layout) {
    this.layout = layout;
  }

  public LibraryLayout getLayout() {
    return layout;
  }

  public File getSrcFolder() {
    switch (layout) {
      case FLAT:
        return getInstalledFolder();
      case RECURSIVE:
        return new File(getInstalledFolder(), "src");
      default:
        return null;
    }
  }

  public boolean useRecursion() {
    return (layout == LibraryLayout.RECURSIVE);
  }

  public static final Comparator<ContributedLibrary> CASE_INSENSITIVE_ORDER = (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName());

  /**
   * Returns <b>true</b> if the library declares to support the specified
   * architecture (through the "architectures" property field).
   *
   * @param reqArch
   * @return
   */
  public boolean supportsArchitecture(String reqArch) {
    return getArchitectures().contains(reqArch) || getArchitectures().contains("*");
  }

  /**
   * Returns <b>true</b> if the library declares to support at least one of the
   * specified architectures.
   *
   * @param reqArchs A List of architectures to check
   * @return
   */
  public boolean supportsArchitecture(List<String> reqArchs) {
    if (reqArchs.contains("*"))
      return true;
    for (String reqArch : reqArchs)
      if (supportsArchitecture(reqArch))
        return true;
    return false;
  }

  public static ContributedLibrary create(File libFolder) throws IOException {
    // Parse metadata
    File propertiesFile = new File(libFolder, "library.properties");
    PreferencesMap properties = new PreferencesMap();
    properties.load(propertiesFile);

    // Library sanity checks
    // ---------------------

    // Compatibility with 1.5 rev.1 libraries:
    // "email" field changed to "maintainer"
    if (!properties.containsKey("maintainer") && properties.containsKey("email")) {
      properties.put("maintainer", properties.get("email"));
    }

    // Compatibility with 1.5 rev.1 libraries:
    // "arch" folder no longer supported
    File archFolder = new File(libFolder, "arch");
    if (archFolder.isDirectory())
      throw new IOException("'arch' folder is no longer supported! See http://goo.gl/gfFJzU for more information");

    // Check mandatory properties
    for (String p : Constants.LIBRARY_MANDATORY_PROPERTIES)
      if (!properties.containsKey(p))
        throw new IOException("Missing '" + p + "' from library");

    // Check layout
    LibraryLayout layout;
    File srcFolder = new File(libFolder, "src");

    if (srcFolder.exists() && srcFolder.isDirectory()) {
      // Layout with a single "src" folder and recursive compilation
      layout = LibraryLayout.RECURSIVE;
    } else {
      // Layout with source code on library's root and "utility" folders
      layout = LibraryLayout.FLAT;
    }

    // Warn if root folder contains development leftovers
    File[] files = libFolder.listFiles();
    if (files == null) {
      throw new IOException("Unable to list files of library in " + libFolder);
    }

    // Extract metadata info
    String architectures = properties.get("architectures");
    if (architectures == null)
      architectures = "*"; // defaults to "any"
    List<String> archs = new ArrayList<>();
    for (String arch : architectures.split(","))
      archs.add(arch.trim());

    String category = properties.get("category");
    if (category == null) {
      category = "Uncategorized";
    }
    if (!Constants.LIBRARY_CATEGORIES.contains(category)) {
      category = "Uncategorized";
    }

    String license = properties.get("license");
    if (license == null) {
      license = "Unspecified";
    }

    String types = properties.get("types");
    if (types == null) {
      types = "Contributed";
    }
    List<String> typesList = new LinkedList<>();
    for (String type : types.split(",")) {
      typesList.add(type.trim());
    }

    List<String> includes = null;
    if (properties.containsKey("includes")) {
      includes = new ArrayList<>();
      for (String i : properties.get("includes").split(","))
        includes.add(i.trim());
    }

    ContributedLibrary res = new ContributedLibrary();
    res.setInstalledFolder(libFolder);
    res.setInstalled(true);
    res.setName(properties.get("name").trim());
    res.setVersion(properties.get("version").trim());
    res.setAuthor(properties.get("author").trim());
    res.setMaintainer(properties.get("maintainer").trim());
    res.setSentence(properties.get("sentence").trim());
    res.setParagraph(properties.get("paragraph").trim());
    res.setWebsite(properties.get("url").trim());
    res.setCategory(category.trim());
    res.setLicense(license.trim());
    res.setArchitectures(archs);
    res.setLayout(layout);
    res.setDeclaredTypes(typesList);
    res.setOnGoingDevelopment(Files.exists(Paths.get(libFolder.getAbsolutePath(), Constants.LIBRARY_DEVELOPMENT_FLAG_FILE)));
    res.setIncludes(includes);
    return res;
  }

  public static ContributedLibrary createFromLegacyPre15ArduinoIDE(File libFolder) {
    // construct an old style library
    ContributedLibrary res = new ContributedLibrary();
    res.setInstalledFolder(libFolder);
    res.setInstalled(true);
    res.setLayout(LibraryLayout.FLAT);
    res.setName(libFolder.getName());
    res.setTypes(Arrays.asList("Contributed"));
    res.setCategory("Uncategorized");
    res.setArchitectures(Arrays.asList("*"));
    return res;
  }

  @Override
  public String toString() {
    return I18n.format(tr("Version {0}"), getParsedVersion());
  }

  public String info() {
    String res = "";
    res += "  ContributedLibrary : " + getName() + "\n";
    res += "              author : " + getAuthor() + "\n";
    res += "          maintainer : " + getMaintainer() + "\n";
    res += "             version : " + getParsedVersion() + "\n";
    res += "             website : " + getUrl() + "\n";
    res += "            category : " + getCategory() + "\n";
    res += "             license : " + getLicense() + "\n";
    res += "             descrip : " + getSentence() + "\n";
    if (getParagraph() != null && !getParagraph().isEmpty())
      res += "                       " + getParagraph() + "\n";
    res += "       architectures : ";
    if (getArchitectures() != null)
      for (String a : getArchitectures()) {
        res += a + ",";
      }
    res += "\n";
    res += "            requires :\n";
    if (getRequires() != null)
      for (ContributedLibraryDependency r : getRequires()) {
        res += "                       " + r;
      }
    res += "\n";

    // DownloadableContribution
    res += super.toString();

    return res;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof ContributedLibrary)) {
      return false;
    }
    ContributedLibrary other = (ContributedLibrary) obj;
    String thisVersion = getParsedVersion();
    String otherVersion = other.getParsedVersion();

    boolean versionEquals = (thisVersion != null
                             && thisVersion.equals(otherVersion));

    // Important: for legacy libs, versions are null. Two legacy libs must
    // always pass this test.
    if (thisVersion == null && otherVersion == null)
      versionEquals = true;

    String thisName = getName();
    String otherName = other.getName();
    boolean nameEquals = thisName != null && thisName.equals(otherName);

    return versionEquals && nameEquals;
  }

  public boolean isBefore(ContributedLibrary other) {
    return VersionHelper.compare(getVersion(), other.getVersion()) < 0;
  }

  @Override
  public int hashCode() {
    String hashingData = "CONTRIBUTEDLIB" + getName() + getVersion();
    return hashingData.hashCode();
  }
}
