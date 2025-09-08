#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector <int> stack;
    stack.push_back(1);
    stack.push_back(2);
    stack.push_back(3);
    stack.pop_back();
    for (int elem : stack) {
        cout << elem << " ";
    }
	

}
