package cc.arduino.contributions.libraries;

public class UnavailableContributedLibrary extends ContributedLibrary {

  public UnavailableContributedLibrary(ContributedLibraryDependency dependency) {
    this(dependency.getName(), dependency.getVersionRequired());
  }

  public UnavailableContributedLibrary(String _name, String _version) {
    setName(_name);
    setVersion(_version);
  }

  @Override
  public String toString() {
    return "!" + super.toString();
  }
}
