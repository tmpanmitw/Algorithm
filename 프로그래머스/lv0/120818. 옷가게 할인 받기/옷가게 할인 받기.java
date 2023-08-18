class Solution {
    public int solution(int price) {
        int answer = 0;
        double price1 = 0;
        if(price>=500000){
            price1 = price*0.8;
        }else if(price>=300000){
            price1 = price*0.9;
        }else if(price>=100000){
            price1 = price*0.95;
        }else{
            price1 = price;
        }
        answer = (int)price1;
        return answer;
    }
}