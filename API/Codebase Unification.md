# Unifying your codebase
Instead of updating by the version. Update by the API instead.
> Obviously this can vary based on your dependencies...

## 1.16 is King
As of November 2025, the 1.16 API is compatible up to 1.21.10.

## Why this matters
Unifying your codebase allows you to bugfix multiple MC versions at once.

Reaching larger audiences, shortening devtime, and less resources.

## Pitfalls
Obviously this can vary based on:
- Dependencies
- Deprecations
- Limitations of API
- Missing newer nicer features
- Incompatible syntax
- Java incompatibilities

One issue I found is porting down to 1.16 then going back up can cause issue. The fix:
> Make sure your .iml file is the same as your module then remove any excess iml files.
> 
> then make sure your java version / dependencies are correct.
