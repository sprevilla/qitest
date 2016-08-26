# Setup instructions

QITest is preconfigured to support either MySQL or Postgresql.

Please review `devel.properties` that currently looks like this:

```
dbhost=localhost
dbname=qi_dev
dbuser=jpos
dbpass=password
```

and properly set `dbhost`, `dbname`, `dbuser` and `dbpass`.

If you want to use Postgresql instead of MySQL, edit 
`src/dist/cfg/db.properties`, comment out MySQL configuration and enable Postgresql's.

Build the system using `gradle installApp` and run `build/install/qitest/bin/q2 --cli`

(you can also call `gradle dist` and expand your `build/distributions/qitest-x.x.x.tar.gz) elsewhere and run `bin/q2 --cli`.


Once you get the `q2>` prompt, try:


```
createschema - true
addrole admin login sysadmin sysconfig users.read users.write
addrole test login sysadmin sysconfig users.read users.write
adduser admin -ptest -radmin -rtest -n"System Administrator"
addsysconfig sys.REMEMBER_PASSWORD_ENABLED true
addsysconfig sys.MAX_LOGIN_ATTEMPTS 5
addsysconfig sys.PASSWORD_AGE 90
```

At this point you should be able to log into [locahost:8080](http://localhost:8080) using user `admin` and password `test`.

