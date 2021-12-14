class Animal{
	String type;
	Animal(){
		type = "Wild";
		System.out.println("At first all animals were wild animals");
	}
	
	final void breaths(){
		System.out.println("Animal Breaths");
	} 
}

class Dog extends Animal{
		Dog(String type){
			super();
			this.type = type;
			System.out.println("Dog is a "+type+" animal");
		}
		
		public static void main(String[] args){
			Dog d1 = new Dog("Domestic");
			d1.breaths();
		}
}