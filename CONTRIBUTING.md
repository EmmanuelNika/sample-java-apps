# Contributing guide

**Want to contribute to sample-java-applications? That's awesome!**

We try to make it easy, and all contributions, even the smaller ones, are more than welcome.
This includes bug reports, fixes, documentation, new quickstarts...

But first, please read this page.

## Reporting an issue

This project uses GitHub issues to manage the issues. Open an issue directly in GitHub.

## Before you contribute and structure of the repository

To contribute, use GitHub Pull Requests, from your **own** fork.

* The `main` branch contains approved requests.
* The `development` branch contains requests under testing and review.

All contributions must target the `development` branch. The `main` branch is reset for complete work.

**All changes made only to the `main` branch will be definitely lost.**

For pull requests depending on features not yet merged in Quarkus, prepend the title with "[DO NOT MERGE]".

### Code reviews

All submissions, including submissions by project members, need to be reviewed before being merged.

### Continuous Integration

Because we are all humans, the project use a continuous integration approach and each pull request triggers a full
build.
Please make sure to monitor the output of the build and act accordingly.

### Tests and documentation are not optional

* All applications must contain unit tests,
* All applications supporting the native mode must contain native tests,
* If your applications does not work in native mode, point it out in the pull request,
* New applications must be listed in the [README.md](./README.md) page

## Build with Maven

* Clone the repository: `git clone https://github.com/EmmanuelNika/sample-java-apps`
* Navigate to the directory: `cd sample-java-apps`

```bash
git clone https://github.com/EmmanuelNika/sample-java-apps
cd sample-java-apps
```

## The small print

This project is an open source project, please act responsibly, be nice, polite and enjoy!
