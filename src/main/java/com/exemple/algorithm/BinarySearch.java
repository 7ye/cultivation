package com.exemple.algorithm;

/**
 * 二分查找
 *
 * 算法思想：
 *   有序序列，每次以序列中间位置的关键字比较，每次缩小一半范围直到匹配成功
 *
 * 优点：
 *   比较次数少、查找速度快、平均性能高
 * 缺点：
 *   要求有序、且插入删除困难，不适用于频繁变动的列表
 *
 * @author Administrator
 */
public class BinarySearch {

    private int[] array;
    private int count;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    /**
     * 二分查找指定数字
     * @param searchNum 查找的数字
     */
    private void binarySearch(int searchNum) {

        // 检索下标
        int index = 0;
        int lastIndex = 0;

        // 用start和end两个索引控制它的查询范围
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length; i++) {

            count++;

            // 取中间数
            index = (start + end) / 2;
            if (index == lastIndex) {
                System.out.println("未找到");
                break;
            }
            lastIndex = index;

            if (array[index] < searchNum) {
                start = index;
            } else if (array[index] > searchNum) {
                end = index;
            } else {
                System.out.println("找到了，位置："+index);
                break;
            }
        }

        System.out.println("检索次数：" + count);
    }

    public static void main(String[] args) {

        int[] array = {1,8,9,15,19,28,31,35,37,39,46,58,63,74,82,91,192,386,453,567,785,912,1000};
        BinarySearch bs = new BinarySearch(array);

        //查找
        bs.binarySearch(192);
    }
}
