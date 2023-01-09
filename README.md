## OOP Bootcamp Abstraction

This is a study purpose project with an abstraction of a back end bootcamp using Object Oriented Programming.

## Classes

### Bootcamp
Content containing the start and end date, developers enrolled and the content in the bootcamp.

### Dev
The developers containing their names, enrolled content, concluded content and total XP.
#### Methods
- enrollBootcamp: Enroll the developer in a bootcamp.
- progressContent: Conclude the next content in bootcamp.

### Content
An abstract class to generate Course and Mentoring classes.
#### Methods: 
- determineXp: Calculate the gained xp for those who conclude.

### Course
A course containing description, name and hours.

### Mentoring
A mentoring containing desciption, name and date.
