SpringBoot Version: 2.3.12.RELEASE  
SpringCloud Version: Hoxton.SR12  
SpringCloud Alibaba Version: 2.2.10  
Tracer Sofa Boot Starter Version: 3.11.0  

sofa-tracer-spring-cloud-plugin需升级到3.1.3版本 
```
<dependency>
    <groupId>com.alipay.sofa</groupId>
    <artifactId>tracer-sofa-boot-starter</artifactId>
    <version>3.11.0</version>
    <exclusions>
        <exclusion>
            <groupId>com.alipay.sofa</groupId>
            <artifactId>sofa-tracer-spring-cloud-plugin</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<dependency>
    <groupId>com.alipay.sofa</groupId>
    <artifactId>sofa-tracer-spring-cloud-plugin</artifactId>
    <version>3.1.3</version>
</dependency>
```
https://github.com/sofastack/sofa-tracer/pull/477  
https://github.com/sofastack/sofa-tracer/issues/447  
