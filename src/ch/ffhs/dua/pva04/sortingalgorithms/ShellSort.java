package ch.ffhs.dua.pva04.sortingalgorithms;

import static ch.ffhs.dua.pva04.sortingalgorithms.SortingUtils.*;

public class ShellSort {
  public static <T extends Comparable<T>> void sort(T[] a){
    int N = a.length;
    int h = 1;
    while(h < N/3) h = 3*h+1;
    while(h >= 1){
      for(int i = h; i < N; i++){
        for(int j = i; j >= h && less(a[j], a[j-h]); j-=h){
          exch(a, j, j-h);
        }
      }
      h=h/3;
    }
  }

}
