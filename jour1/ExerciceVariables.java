class ExerciceVariables{
	public static void main(String[] args){
		int num1=5;
		int num2=10;
		System.out.println("La valeur de num1 est de "+num1+" et la valeur de num2 est de "+num2);
		int temp1;
		int temp2 = num2;
		num2=num1;
		num1=temp2;
		System.out.println("La valeur de num1 est de "+num1+" et la valeur de num2 est de "+num2);
	};
};
