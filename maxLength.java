public static int maxLength(ArrayList<String> arr){
    int max = 0;
    for(int i = 0; i< arr.size(); i++){
        String x = arr.get(i);
        if(x.length() > max ){ // checks if the length of the longest string is greater than max
            max = x.length();
        }
    }
    return max;
}
