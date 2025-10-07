class SalaryCal{

    public static void main(String[] args) {
        int salary = 600000;
        double monthlySalary=salary/12;
        double weeklySalary=salary/52;
        double dailySalary=salary/365;
        double hourlySalary=dailySalary/8;
        double minutu_salary=hourlySalary/60;
        System.out.println("Monthly Salary : "+monthlySalary);
        System.out.println("Weekly Salary : "+weeklySalary);
        System.out.println("Daily Salary : "+dailySalary);
        System.out.println("Hourly Salary : "+hourlySalary);
        System.out.println("Minute Salary : "+minutu_salary);
    }

}