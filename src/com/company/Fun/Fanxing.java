package com.company.Fun;

public class Fanxing {
    class Fruit{
        @Override
        public String toString() {
            return "fruit";
        }
    }

    class Apple extends Fruit{
        @Override
        public String toString() {
            return "apple";
        }
    }

    class Person{
        @Override
        public String toString() {
            return "Person";
        }
    }

    class GenerateTest<T>{
        public void show_1(T t){
            System.out.println(t.toString());
        }

        //�ڷ�������������һ�����ͷ�����ʹ�÷���E�����ַ���E����Ϊ�������͡�����������T��ͬ��Ҳ���Բ�ͬ��
        //���ڷ��ͷ�����������ʱ�����������<E>����˼�ʹ�ڷ������в�δ�������ͣ�������Ҳ�ܹ���ȷʶ���ͷ�����ʶ��ķ��͡�
        public <E> void show_3(E t){
            System.out.println(t.toString());
        }

        //�ڷ�������������һ�����ͷ�����ʹ�÷���T��ע�����T��һ��ȫ�µ����ͣ������뷺������������T����ͬһ�����͡�
        @SuppressWarnings("hiding")
		public <T> void show_2(T t){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
    	Fanxing fx = new Fanxing();
        Apple apple = fx.new Apple();
        Person person = fx.new Person();

        GenerateTest<Fruit> generateTest = fx.new GenerateTest<Fruit>();
        //apple��Fruit�����࣬�����������
        System.out.println("-------------11111--------------");
        generateTest.show_1(apple);
        //�������ᱨ����Ϊ��������ʵ��ָ������Fruit���������ʵ������Person
        //generateTest.show_1(person);

        //ʹ�����������������Գɹ�
        System.out.println("--------------222222-------------");
        generateTest.show_2(apple);
        generateTest.show_2(person);

        //ʹ������������Ҳ�����Գɹ�
        System.out.println("--------------333333---------");
        generateTest.show_3(apple);
        generateTest.show_3(person);
    }
}