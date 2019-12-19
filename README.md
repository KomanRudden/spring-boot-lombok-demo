# Spring Boot Lombok Demo     

### Speed up your Spring Boot development
By simply adding the following Maven dependency to your project

    <dependencies>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
    </dependencies>
    
Spring will auto-magically create all the nasty boilerplate code you'd otherwise have to write.

The Lombok annotations I use regularly are

    @Data
    @Builder
    @Log4j
    @NoArgsConstructor
    @AllArgsConstructor
    
### With Lombok

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class ClassWithLombok {
        public String firstName;
        public String surname;
    }
    
### Without Lombok

    import java.util.Objects;
    
    public class ClassWithoutLombok {
        public String firstName;
        public String surname;
    
        public ClassWithoutLombok() {}
        public ClassWithoutLombok(String firstName, String surname) {
            this.firstName = firstName;
            this.surname= surname;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getSurname() {
            return surname;
        }
    
        public void setSurname(String surname) {
            this.surname = surname;
        }
    
        @Override
        public String toString() {
            return "ClassWithoutLombok{" +
                    "firstName='" + firstName + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClassWithoutLombok that = (ClassWithoutLombok) o;
            return getFirstName().equals(that.getFirstName()) &&
                    getSurname().equals(that.getSurname());
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(getFirstName(), getSurname());
        }
    }    

   