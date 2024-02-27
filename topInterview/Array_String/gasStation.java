package topInterview.Array_String;

public class gasStation {
    public static void main(String[] args) {
        int gas[] = {2,3,4};
        int cost[] = {3,4,3};
        System.out.println(costs(gas, cost));
        
    }
    public static int costs(int[] gas,int[] cost){
        int n = gas.length;
        int rem_fuel = 0;
        int startStation = 0;
        int totalGas = 0;
        for(int i = 0;i<n;i++){
            rem_fuel += gas[i] - cost[i];
            totalGas += rem_fuel;
            if(rem_fuel < 0){
                startStation = i + 1;
                rem_fuel = 0;
            }
        }
        if(totalGas < 0){
          return -1;
        }
        return startStation;
    }
}
