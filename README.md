[![Build Status](https://travis-ci.org/bellabling/friendly-time.svg?branch=master)](https://travis-ci.org/bellabling/friendly-time)
[![codecov](https://codecov.io/gh/bellabling/friendly-time/branch/master/graph/badge.svg)](https://codecov.io/gh/bellabling/friendly-time)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Join the chat at https://gitter.im/friendly-time/Lobby](https://badges.gitter.im/friendly-time/Lobby.svg)](https://gitter.im/friendly-time/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)



# FriendlyTime

Provides casual time strings for events in the past. E.g. "about 10 minutes ago".

To use:

```
long timeNow = System.currentTimeMillis();
long timeThen = timeNow - 5000;
String friendlyTime = FriendlyTime.getFriendlyTime(timeNow, timeThen));

//friendlyTime has value "seconds ago"
```

See also the unit tests.
