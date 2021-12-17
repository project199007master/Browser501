package ch18.mvc.vo;

public class EmpDTO {

	private int empno;
	private String ename;
	private int sal;
	private int deptno;
	
	public EmpDTO() {}
	
	public EmpDTO(int empno, String ename, int sal, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public String printField() {
		return empno + "/" + ename + "/" + sal + "/" + deptno; 
	}
	
	
	
}
