package com;


public class Basic implements Cloneable{
	int b;
	int c;
	static int a;
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("The A value:"+a);
		Runtime rt= Runtime.getRuntime();
		System.out.println("Runtime"+rt);
		System.out.println("The runtime value:"+rt.freeMemory());
		Basic b = new Basic();
		Basic d = (Basic) b.clone();
		System.out.println("B value"+b.b);
		System.out.println(d.c);
		if(b == d){
			System.out.println("Same memory location");
		}
		if(b.equals(d)){
			
			System.out.println("Same values");
			
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		result = prime * result + c;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Basic other = (Basic) obj;
		if (b != other.b)
			return false;
		if (c != other.c)
			return false;
		return true;
	}

}
