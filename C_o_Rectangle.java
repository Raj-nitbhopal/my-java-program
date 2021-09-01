/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_o_rectangle;
class Rectangle
{
    public int length,width;
    public void getData(int x, int y){
        length = x;
        width = y;
    }
    public int rectArea(){
        //int area = length*width;
        return length*width;
    }
    public int perimeter(){
        //int p = 2*(length + width);
        return 2*(length + width);
    }
    public int diagonal(){
        return (int)Math.sqrt(Math.pow(length,2)+ Math.pow(width, 2));
        //return dg;
    }
}
class C_o_Rectangle
{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length = 10;
        rect1.width = 30;
        System.out.println("Area of Rectangle = " + rect1.length * rect1.width);
        rect2.getData(3, 4);
        //int area2 = rect2.rectArea();
        //int peri = rect2.perimeter();
        System.out.println("Area of Rectangle = " + rect2.rectArea());
        System.out.println("Perimeter of Rectangle = " + rect2.perimeter());
        //int dag = rect2.diagonal();
        System.out.println("Diagonal of Rectangle= " + rect2.diagonal());
    }
}
