#include <boost/algorithm/minmax_element.hpp> 
#include <boost/array.hpp> 
#include <utility> 
#include <iostream> 

int main() 
{ 
  typedef boost::array<int, 4> array; 
  array a = { { 2, 3, 0, 1 } }; 

  std::pair<array::iterator, array::iterator> p = 
    boost::minmax_element(a.begin(), a.end()); 

  std::cout << *p.first << std::endl; 
  std::cout << *p.second << std::endl; 
} 