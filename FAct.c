#include <stdio.h>

// Function to calculate factorial
int Factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
        f = f * i;
    }
    return f;
}

int main() {
    int num;
    
    // Taking input from user
    printf("Enter a number: ");
    scanf("%d", &num);
    
    // Calculating factorial
    int ans = Factorial(num);
    
    // Printing the result
    printf("Factorial is :: %d\n", ans);

    return 0;
}
