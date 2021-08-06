/* Encapsulation using getter and setter */

class Students {
  protected String Name;
  protected int Age;
  protected String Address;

  Students(String name, int age, String add)
  {
    this.Name=name;
    this.Age = age;
    this.Address = add;
  }
  // Getters
  public String getName()
  {
    return Name;
  }
  public int getAge()
  {
    return Age;
  }
  public String getAddress()
  {
    return Address;
  }

  //setters
  private void setName(String name)
  {
    this.Name=name;
  }
  private void setAge(int age)
  {
    this.Age=age;
  }
  private void setAddress(String add)
  {
    this.Address=add;
  }

  public static void main(String[] args)
  {
    Students s1 = new Students("laya",40,"chennai");
    System.out.println("Student name is "+ s1.getName() + " "+ "age is " +s1.getAge());
    s1.setAddress("Kerala");
    System.out.println("Student address is " + s1.getAddress());
}
}
