Spring Core
-----------

Spring 
------

What is Spring framework?

- Its is a Dependency Injection framework
- It compliments the existing Java EE standards and makes it easier to use (J2EE), its better tahn J2EE product

J2EE is a set of specifications, which define the standard for developing multi-tier enterprise applications with Java. The J2EE platform provides a complete framework for design, development, assembly, and deployment of Java applications built on multi-tiered distributed application model.

Inversion of control (Ioc)
--------------------------
- Giving away object creation control from our application code to an external framework or container like Spring (IoC container)

Spring and JEE

UI layer --> service layer --> data access layer --> db layer


Spring Modules
--------------
Core Container (DI and Ioc, object lifecycle)
--------------
beans
core
context
spEL


Data Access/ Integration
------------------------
JDBC (use JDBC API)
ORM (Hibernate)
JMS (Messaaging)
Transaction

AOP (Inject services into objects, logging, security,etc)

Test (testing using JUnit and TestNG)

Web (web oriented features)
---
MVC 
Portlet
Servlet
Web Socket

Spring Container
----------------
- A container is a pre defined progarm or component that comes with the Sprign framework
- It is responsible for creating the objects, holdign them in memory, and also injecting them into other objects as required 
- maintains complete lifecycle of an object from ceartion to destruction
- needs beans (Java class), XML configs specifying the object dependencies

ApplicationContext
- This interface represents a container

- The implementations of this interface: 
	- ClassPathXMLApplicationContext: search for the XML config file on the java classpath
	- AnnotationConfigApplicationContext: used when we configure the beans using Annotations 
	- FileSystemXMLApplicationContext: search for the XML config file on the file system
	
Dependency Injection
---------------------
- It is the process of injecting what an object requires at runtime dynamically, the Spring container does this for us

2 types of DI
--------------

Employee 				Address
	id						street
	name					city
	Address					state
							country
							
Setter Injection
----------------							
- We provide the getter/ setter methods for the fields on our object, 
Spring container will create those dependencies and use the set methods on those fields to set the values

Employee 					Address
	setId						setStreet
	setName						setCity
	setAddress					setState
								setCountry

Constructor Injection
---------------------
- We provide a parameterized constructor instead of setter methods and SPring invokes that constructor at 
runtime and creates the objects

Employee (int id, String name, Address address)
Address (String street, String city, String state, String country)
					

Types of Data
--------------
Primitive type dependencies:
byte, short, int, long, float, double, boolean, char, String

Collection type dependencies:
List, Set, Map, Properties

Reference type dependencies: other object types



Bean Lifecycle  Methods
-----------------------
public void init()
public void destroy()

1. Create bean (object)
2. Set values (dependencies are injected)
3. Call init()
4. read and use the bean
5. destroy() // before destroying the bean (Add shutdown hook to destroy bean)
AbstractApplicationContext --> ctx.registerShutdownHook();

Configuring the lifecycle methods
---------------------------------
1. XML Configuration
2. Implement Spring interfaces --> implements InitializingBean, DisposableBean
3. Annotations --> @PostConstruct  @PreDestroy (pre Java 9) 
	after Java 9, a new mvn dependency needs to be added [javax.annotation:javax.annotation-api:1.3.2]
	support for lifecycle methods annotations:
		<bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>
		
	support for all Spring annotations:	
		<context:annotation-config/>
		
Bean Scopes
-----------

Singleton: (bean is created only 1 tiem , regardless of how many times it read and used in our application)

Proptotype: the container will create  different objects everytime that object is read and used in our app

Request: only relevant for Spring MVC Web Applications, the container will create object per user request

Session: only relevant for Spring MVC Web Applications, a session is everything between a user login and logout, teh contaienr will create an object for the entire session of the user

GlobalSession: the container will create an object for global context, it is only used in Spring MVC Portlet Applications	


Constructor Injection
----------------------
As Tag
------
<constructor-arg>
	<value>a</value>
</constructor-arg>

As Attribute
------------
<constructor-arg value="123"/>
<constructor-arg ref="address"/>

C Schema/ C Namespace
---------------------
<bean name="emp" class="com.constructorInjection.Employee" c:id="3242" c:address-ref="address">


Bean Externalization/ Reading Properties
-----------------------------------------
reading properties from an external properties file
    
<context:property-placeholder location="db.properties"/>

    <bean name="myDAO" class="com.propertyPlaceHolder.MyDAO">
        <constructor-arg>
            <value>${dbServer}</value>
        </constructor-arg>

    </bean>
	
BeanDefinitionStoreException: the property name is not correct/ doesn't exist in the config file/ store	
