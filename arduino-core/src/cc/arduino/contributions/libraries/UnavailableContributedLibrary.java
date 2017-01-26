package cc.arduino.contributions.libraries;

import java.util.ArrayList;
import java.util.List;

public class UnavailableContributedLibrary extends ContributedLibrary {

  private String name;
  private String version;

  public UnavailableContributedLibrary(ContributedLibraryDependency dependency) {
    this(dependency.getName(), dependency.getVersionRequired());
  }

  public UnavailableContributedLibrary(String _name, String _version) {
    name = _name;
    version = _version;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getMaintainer() {
    return "Unknown";
  }

  @Override
  public String getAuthor() {
    return "Unknown";
  }

  @Override
  public String getWebsite() {
    return "Unknown";
  }

  @Override
  public String getCategory() {
    return "Uncategorized";
  }

  @Override
  public void setCategory(String category) {
  }

  @Override
  public String getLicense() {
    return "Unknown";
  }

  @Override
  public String getParagraph() {
    return "";
  }

  @Override
  public String getSentence() {
    return "";
  }

  @Override
  public List<String> getArchitectures() {
    return new ArrayList<>();
  }

  @Override
  public List<String> getTypes() {
    return new ArrayList<>();
  }

  @Override
  public List<ContributedLibraryDependency> getRequires() {
    return new ArrayList<>();
  }

  @Override
  public String getUrl() {
    return "";
  }

  @Override
  public String getVersion() {
    return version;
  }

  @Override
  public String getChecksum() {
    return "";
  }

  @Override
  public long getSize() {
    return 0;
  }

  @Override
  public String getArchiveFileName() {
    return "";
  }

  @Override
  public String toString() {
    return "!" + super.toString();
  }
}
