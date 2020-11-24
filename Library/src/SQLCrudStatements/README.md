# Library SQL CRUD Statements
This is the package for Objects handling SQL Operations mainly dealing with the CREATE and READ statements. This Object is defined as our SQL statement backend handler to fully operate each and every statement that our data entry module requires.

Each files are documented of what their operations are and how to work with them. This consist of 11 object classes mainly for handling MySQL statements.

### Breakdown
Each class has a pattern used for defining their functions.

They have three main variables to regulate the statements handled:
```
static Connection conn = null;
static PreparedStatement objPreparedStatementObject = null;
static ResultSet ojbResultSetObject = null;
```

Currently, Each Object has 4 methods to regulate the INSERT statement. The READ statement will come afterwards after the update to our Base system.
```
public static void setFields ()
public static  String funcSetFields()
public static  String funcSetValues()
public static int funcCreate<objectname w/out class>Obj
```
