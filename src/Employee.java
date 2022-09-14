public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public  Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

        toYaz();
    }

    public double tax(){
        if (this.salary<1000){
            return 0;
        } else{
            return this.salary*0.03;
        }
    }

    public int bonus(){
        if(this.workHours<=40){
            return 0;
        }else{
            return (this.workHours-40)*30;
        }
    }

    public double raiseSalary() {
        if (2022 - this.hireYear < 10) {
            return this.hireYear * 0.05;
        } else if (2022 - this.hireYear < 20) {
            return this.hireYear * 0.10;
        } else {
            return this.hireYear * 0.15;
        }
    }
        public String toYaz(){
            System.out.println("Adı:"+this.name);
            System.out.println("Maaşı:"+this.salary);
            System.out.println("Çalışma Saati:"+this.workHours);
            System.out.println("BaşlangıçYılı :"+this.hireYear);
            System.out.println("Versgi:"+tax());
            System.out.println("Bonus :"+bonus());
            System.out.println("Maaş Artışı :"+(bonus()+raiseSalary()-tax()));
            System.out.println("Vergi Ve Bonusla ile birlikte maaş:"+(this.salary+bonus()-tax()));
            System.out.println("Toplam Maaş :"+(this.salary+bonus()+raiseSalary()-tax()));

            return null;

        }
    }


