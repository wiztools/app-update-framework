App Update Framework
====================

This project aims to define set of interfaces and web-service formats for applications that need the auto-update feature.

### Version Naming

The only applicable versioning pattern is:

`major`.`minor`.`patch`

Anything that does not comply to this naming will not comply to this framework. `minor` and `patch` components in the version name are optional.

### Update Web Service

There is only one service endpoint, that mentions the latest version of the app:

```json
{
    "version": "3.4.0",
    "dl_url": "http://www.example.com/app-version.tgz",
    "release_notes_url": "http://www.example.com/release-version.txt",
    "least_version_required": "3.3"
}
```

The content-type of this response must be `application/json`.
