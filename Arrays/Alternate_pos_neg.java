package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
//Note :for equal no of pos and neg elem's only
import java.util.Collections;

public class Alternate_pos_neg {

    public static ArrayList<Integer> RearrangebySignBrute(ArrayList<Integer> A){
        int n = A.size();

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int elem:A){
            if(elem>0){
                pos.add(elem);
            }
            else{
                neg.add(elem);
            }
        }
        int nidx=0;
        int pindx=0;
        int index=0;
        while(pindx<pos.size() && nidx<neg.size()){
            A.set(index,pos.get(pindx));
            index++;
            pindx++;

            A.set(index,neg.get(nidx));
            index++;
            nidx++;

        }

        return A;

    }

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n,0));

        int posidx=0,negidx=1;
        for(int i=0;i<n;i++){
            if(A.get(i)<0 && negidx<n){
                list.set(negidx,A.get(i));
                negidx+=2;
            }
            else if(A.get(i)>=0 && posidx<n){
                list.set(posidx,A.get(i));
                posidx+=2;
            }
        }

        return list;
    }



    public static void main(String[] args) {
        // Array Initialization.
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-3,-1,-2,3));
        ArrayList<Integer> ans = RearrangebySign(A);
        ArrayList<Integer> ans2 = RearrangebySignBrute(A);
       

        for (int i = 0; i < ans2.size(); i++) {
            System.out.print(ans2.get(i) + " ");
        }
    }

}
