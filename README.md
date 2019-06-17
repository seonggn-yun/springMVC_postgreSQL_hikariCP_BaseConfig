springMVC_postgreSQL_hikariCP_BasisSetting
==========================================
The basis for springMVC (spring 5) + postgresql 9.6 + hikariCP 2.7.4 Projects.
------------------------------------------------------------------------------

## Development Environment
 - Eclipse Jee 2019-03
 - JDK 1.8
 - SpringFramework 5.1.8
 - HikariCP 2.7.8
 - Postgresql 9.6
 - postgresql-9.4-1206-jdbc41
 - lombok 1.18.0
 - mybatis 3.4.6
 
 ## 1. You mush modify the following:
 
 ### src/main/webapp/WEB-INF/spring/root-context.xml
  ```html
  <bean class="com.zaxxer.hikari.HikariConfig">
	            <constructor-arg>
	                <props>
	                    <prop key="jdbcUrl">jdbc:log4jdbc:postgresql://localhost:5432/{your_schema}</prop>
	                    <prop key="username">postgres</prop>
	                    <prop key="password">password</prop>
	                </props>
  ```
 ### src/main/resources/hikari_pgsql.properties
  ```java
  dataSourceClassName=org.postgresql.ds.PGSimpleDataSource
  dataSource.url=jdbc:postgresql://localhost:5432/{your_schema}
  dataSource.user=postgres
  dataSource.password=password
  maximumPoolSize=10
  ```
 ## 2. You mush test the following:
  - src/test/java/org/spring/app/JDBCTests.java
  - src/test/java/org/spring/app/DataSourceTests.java
  - **Run As - JUnit Test**

## 3. You have now set up your project base. Now go ahead with your project.
