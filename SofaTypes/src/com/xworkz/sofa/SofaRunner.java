package com.xworkz.sofa;

public class SofaRunner {

//	public class SectionalSofaImpl implements SectionalSofa{
//
//		@Override
//		public void toSeating() {
//			System.out.println("These sofas are comfortable to seating and lounging");
//		}	
//	}
//	
//	public class TuxedoSofaImpl implements TuxedoSofa{
//
//		@Override
//		public void toSleep() {	
//			System.out.println("We can use day and night also");
//		}	
//	}
//	
//	public class ReclinerSofaImpl implements ReclinerSofa{
//
//		@Override
//		public void comfortableToWork() {
//			System.out.println("We can use for office Work as a chair");	
//		}	
//	}  

	public static void main(String[] args) {

//			SectionalSofa sofa = new SectionalSofa() {
//				@Override
//				public void toSeating() {
//					System.out.println("These sofas are comfortable to seating and lounging");	
//				}
//			};

		SectionalSofa sofa = () -> {
			System.out.println("These sofas are comfortable to seating and lounging");

		};

		sofa.toSeating();

		TuxedoSofa tuxedoSofa = () -> {
			System.out.println("We can use day and night also");
		};

		tuxedoSofa.toSleep();

		ReclinerSofa recliner = () -> {
			System.out.println("We can use for office Work as a chair");
		};

		recliner.comfortableToWork();
	}

}
