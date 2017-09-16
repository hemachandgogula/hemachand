import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;	
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	//@Override
	public Student[] getStudents() {
		// Add your implementation here
			return students;
	}

	//@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
		throw new IllegalArgumentException("Invalid operation");
		else
		Student[] students=students[100];
	}

	//@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>students.length())
		{
		
		throw new IllegalArgumentException("Invalid index);
		}
		return students[index];
	}

	//@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students[index]==null)
		throw new IllegalArgumentException("Invalid operation");
		else if(index<0||index>students.length())
		throw new IllegalArgumentException("Invalid length");
		else
		students[index]=student;
	}

	//@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students[index]==null)
		throw new IllegalArgumentException("Invalid operation");
		else
		students[0]=student;
		
	}

	//@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students==null)
		throw new IllegalArgumentException("Invalid operation");
		else
		students[students.length()+1]=student;
	}

	//@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(students[index]==null)
		throw new IllegalArgumentException("Invalid operation");
		else if(index<0||index>students.length())
		throw new IllegalArgumentException("Invalid length");
		students[students.length()+1]=student;
	}

	//@Override
	public void remove(int index) {
		// Add your implementation here
	if(index<0||index>students.length())
		throw new IllegalArgumentException("Invalid length");
	else
	{
	int i=index;
	while(i<students.lenth())
	{
	students[i]=student[i+1];
	i++;
	}	
	
	}

	//@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
		throw new IllegalArgumentException("Invalid operation");
		else
		{
			int i=0;
		while(students[i]!=student)
		{
			i++;
		}
		while(i<students.length())
		{	
			student[i]=student[i+1];
			i++;
		}
	}
	//@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	if(index<0||index>students.length())
		throw new IllegalArgumentException("Invalid length");
		students=ArrayUtils.remove(students,index);
	}

	//@Override
	public void removeFromElement(Student student) 
	{
	if(student==null)
		throw new IllegalArgumentException("Invalid operation");
		// Add your implementation here
		students=ArrayUtils.remove(students,student.id);
		
	}

	//@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	if(index<0||index>students.length())
		throw new IllegalArgumentException("Invalid length");
		students=ArrayUtils.remove(students,0,index);
	}

	//@Override
	public void removeToElement(Student student) {
		// Add your implementation here
if(student==null)
		throw new IllegalArgumentException("Invalid operation");
		// Add your implementation here
		students=ArrayUtils.remove(students,0,student.id);
	}

	//@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		Student temp;
		for(i=0;i<student.length();i++)
			{
				for(j=0;j<student.length()-i-1;j++)
				{
					if(students[j].id<students[j+1])
					{
						temp=students[j];
						students[j]=students[j+1];
						students[j+1]=students[j];
					}
				}
			}
	}

	//@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	//@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	//@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	//@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	//@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		int i=0;
		while(students[i])
		{
			if(students[i].age=age)
				return students[i];
			i++;
			
		}
	}

	//@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here

		return null;
	}

	//@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
		throw new IllegalArgumentException("Invalid operation");
		while(students[i]!=student)
		{
		i++;
		}
		return student[i+1];
	}
}
