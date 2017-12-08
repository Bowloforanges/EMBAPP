public class Informacion_del_Empleado {
private int ID_E,age,totalExp,currentLvl;
private String name,password,Puesto,Fecha_ingreso,gender,score,exp_total,bracket_emp,cumplimiento, anndate, tridate,Last_Name;
public int getId() {
	return ID_E;
}
public void setId(int ID_E) {
	this.ID_E = ID_E;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLast_Name() {
	return Last_Name;
}
public void setLast_Name(String Last_Name) {
	this.Last_Name = Last_Name;
}
public String getBracketName() {
	return bracket_emp;
}
public void setBracketName(String bracket_emp) {
	this.bracket_emp = bracket_emp;
}
public String getCumplimiento() {
	return cumplimiento;
}
public void setCumplimiento(String cumplimiento) {
	this.cumplimiento = cumplimiento;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getScore() {
	return score;
}
public void setScore(String score) {
	this.score = score;
}
public String getExp() {
	return exp_total;
}
public void setExp(String exp_total) {
	this.exp_total = exp_total;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPuesto() {
	return Puesto;
}
public void setPuesto(String Puesto) {
	this.Puesto = Puesto;
}
public String getFecha() {
	return Fecha_ingreso;
}
public void setFecha(String Fecha_ingreso) {
	this.Fecha_ingreso = Fecha_ingreso;
}

public String getAnnDate(){
        return anndate;
}

public void setAnnDate(String anndate){
        this.anndate = anndate;
}

public String getTriDate(){
        return tridate;
}

public void setTriDate(String tridate){
        this.tridate = tridate;
}

public int getTotalExp(){
        return totalExp;
}

public void setTotalExp(int totalExp){
        this.totalExp = totalExp;
}

public int getCurrentLvl(){
        return currentLvl;
}

public void setCurrentLvl(int currentLvl){
        this.currentLvl = currentLvl;
}


}