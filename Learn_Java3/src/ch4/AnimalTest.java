package ch4;

import java.util.ArrayList;
// 다형성 테스트 
//1. 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
//2. 같은 코드에서 여러 다른 실행 결과가 나옴
//3. 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
//4. 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음
public class AnimalTest {
    public static void main(String[] args){

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);


        ArrayList<Animal> AniList = new ArrayList<>();

        AniList.add(hAnimal);
        AniList.add(tAnimal);
        AniList.add(eAnimal);

        for(Animal Ani : AniList){
            Ani.move();
        }

        test.testDownCasting(AniList);
    }

    public void moveAnimal(Animal element){
        element.move();
    }


    //instanceof를 통해  인스턴스의 형이 맞는지 여부를 체크하며 키워드 맞으면 true 아니면 false를 반환한다.
    public void testDownCasting(ArrayList<Animal> Anilist){

        for(int i =0; i<Anilist.size(); i++) {
			Animal animal = Anilist.get(i);
		
			if ( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		
		}

    }
    
}
