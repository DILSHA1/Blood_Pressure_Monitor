package model;

import java.util.Calendar;

public class BloodPressure {
    private int id;
    private String name;
    private int yob;
    private int systolic;
    private int diastolic;

    public BloodPressure(int id, String name, int yob, int systolic, int diastolic) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }
    
    public void calculate() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - yob;
        
        System.out.println("Blood Pressure Category:");

        if (systolic < 120 && diastolic < 80) {
            System.out.println("1. Normal");
        } else if (systolic >= 120 && systolic <= 129 && diastolic < 80) {
            System.out.println("2. Elevated");
        } else if ((systolic >= 130 && systolic <= 139) || (diastolic >= 80 && diastolic <= 89)) {
            System.out.println("3. Hypertension Stage 1");
        } else if (systolic >= 140 || diastolic >= 90) {
            System.out.println("4. Hypertension Stage 2");
        } else {
            System.out.println("5. Hypertensive crisis (requires medical attention)");
        }
        
        if (age == 1) {
            if (systolic < 75 || diastolic < 50) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 90 && diastolic <= 60) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 100 && diastolic <= 75) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age > 1 && age <= 5) {
            if (systolic < 80 || diastolic < 55) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 95 && diastolic <= 65) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 110 && diastolic <= 79) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 6 && age <= 13) {
            if (systolic < 90 || diastolic < 60) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 105 && diastolic <= 70) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 115 && diastolic <= 80) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 14 && age <= 19) {
            if (systolic < 105 || diastolic < 73) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 117 && diastolic <= 77) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 120 && diastolic <= 81) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } else if (age >= 20 && age <= 24) {
            if (systolic < 108 || diastolic < 75) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 120 && diastolic <= 79) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 132 && diastolic <= 83) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 25 && age <= 29) {
            if (systolic < 109 || diastolic < 76) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 121 && diastolic <= 80) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 133 && diastolic <= 84) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 30 && age <= 34) {
            if (systolic < 110 || diastolic < 77) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 122 && diastolic <= 81) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 134 && diastolic <= 85) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 35 && age <= 39) {
            if (systolic < 111 || diastolic < 78) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 123 && diastolic <= 82) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 135 && diastolic <= 86) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 40 && age <= 44) {
            if (systolic < 112 || diastolic < 79) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 125 && diastolic <= 83) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 137 && diastolic <= 87) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 45 && age <= 39) {
            if (systolic < 115 || diastolic < 80) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 127 && diastolic <= 84) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 139 && diastolic <= 88) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 50 && age <= 54) {
            if (systolic < 116 || diastolic < 81) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 129 && diastolic <= 85) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 142 && diastolic <= 89) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 55 && age <= 59) {
            if (systolic < 118 || diastolic < 82) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 131 && diastolic <= 86) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 144 && diastolic <= 90) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        } if (age >= 60 && age <= 64) {
            if (systolic < 121 || diastolic < 83) {
                System.out.println("Blood pressure is minimum by age.");
            } else if (systolic <= 134 && diastolic <= 87) {
                System.out.println("Blood pressure is normal by age.");
            } else if (systolic <= 147 && diastolic <= 91) {
                System.out.println("Blood pressure is maximum by age.");
            } else {
                System.out.println("Blood pressure is higher than maximum level by age.");
            }
        }
    }
    
    public void display() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - yob;
        System.out.println("");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Systolic: " + systolic);
        System.out.println("Diastolic: " + diastolic);
        calculate();
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
    }
}
