package Classics;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/4 12:01
 * @Description: 冒泡算法
 */
public class BubbleSort {

    /**
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 针对所有的元素重复以上的步骤，除了最后一个；
     * 重复步骤1~3，直到排序完成。
     * @param ints
     * @return
     */
    public int[] bubbleSort(int[] ints){
        int len=ints.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1;j++){
                if(ints[j]>ints[j+1]){
                    int temp=ints[j+1]; // 相邻元素两两对比
                    ints[j+1] = ints[j]; // 元素交换
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }
}
