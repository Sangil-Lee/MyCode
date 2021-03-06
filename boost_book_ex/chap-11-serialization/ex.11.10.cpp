#include <boost/archive/text_oarchive.hpp> 
#include <boost/archive/text_iarchive.hpp> 
#include <iostream> 
#include <sstream> 

std::stringstream ss; 

class person 
{ 
public: 
  person() {} 
  person(int age) : age_(age) {} 
  int age() const { return age_; } 

private: 
  friend class boost::serialization::access; 

  template <typename Archive> 
  void serialize(Archive &ar, const unsigned int version) 
  { 
    ar & age_; 
  } 

  int age_; 
}; 

void save() 
{ 
  boost::archive::text_oarchive oa(ss); 
  person p(31); 
  person &pp = p; 
  oa << pp; 
} 

void load() 
{ 
  boost::archive::text_iarchive ia(ss); 
  person p; 
  person &pp = p; 
  ia >> pp; 
  std::cout << pp.age() << std::endl; 
} 

int main() 
{ 
  save(); 
  load(); 
} 