/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect5;

/**
 *
 * @author Aluminium
 */
public class MinMax {
    int num[] = new int[5];
    int min, max;
    MinmMaxView myMinmMaxView = new MinmMaxView();
    public MinMax()
    {
        

    num[0]=myMinmMaxView.g1;
    num[1]=myMinmMaxView.g2;
    num[2]=myMinmMaxView.g3;
    num[3]=myMinmMaxView.g4;
    num[4]=myMinmMaxView.g5;
//    I would like for the loop to add each element in the array and give me the sum below
    for(int i=0;i <num.length; i++)
        num[i] = num[i]+num[i];
//    Right here I need code by which to divide by num.length and therefore gain my average... I just don't know how to create
//    the sum of my for loop
}
}
