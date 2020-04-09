# Spring-collections

Dependency: 		

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.2.5.RELEASE</version>
    </dependency>
    
Configuration File:

    <bean id="myPerson" class="com.eflu.beans.Person">
        <property name="country" ref="myCountry"></property>
        <property name="id" value="1"></property>
        <property name="name" value="Edgar"></property>
        <property name="nickName" value="chano"></property>
      </bean>

	<bean id="myCountry" class="com.eflu.beans.Country">
		<property name="name" value="Peru"></property>
		<property name="cityList">
			<list>
				<ref bean="city1" />
				<ref bean="city2" />
				<ref bean="city3" />
			</list>

		</property>
	</bean>

	<bean id="city1" class="com.eflu.beans.City">
		<property name="name" value="Arequipa"></property>
	</bean>

	<bean id="city2" class="com.eflu.beans.City">
		<property name="name" value="Lima"></property>
	</bean>

	<bean id="city3" class="com.eflu.beans.City">
		<property name="name" value="Trujillo"></property>
	</bean>
