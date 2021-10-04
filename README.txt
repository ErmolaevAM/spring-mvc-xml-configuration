1) Create maven project;
2) Add following content to pom.xml:
    <properties>
        <spring.version>5.0.0.RELEASE</spring.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${spring.version}</version>
        </dependency>
    </dependencies>
3) Create into main/webapp/WEB-INF/ web.xml and [servlet-name]-servlet.xml;
4) Create index.jsp file into WEB-INF/view;
5) Configure web.xml (define DispatcerServlet), and [servlet-name]-servlet.xml (define InternalResourceViewResolver suffix and prefix, and component-scan path)
6) Create class Controller;
7) Run application with Tomcat;
7.1) Download Tomcat, install Smart Tomcat plugin, configure, add goal after build.