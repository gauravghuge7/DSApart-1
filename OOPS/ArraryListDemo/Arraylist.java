package ArraryListDemo;



class arrayList {
    
    int[] arr = new int[10];

    int index = 0;
    int size = 0;

    
    public void add(int i) {

        if(size== arr.length) {
            int[] brr = new int[arr.length * 2];

            arr = brr;
        }

        arr[size] = i;
        size++;
    }

    public void add(int index, int element) {

        if(arr.length == size) {

            arr[index] = element;
        }
    }

}


class bio {
    String name;
    
}

