#include <boost/date_time/posix_time/posix_time.hpp> 
#include <iostream> 

int main() 
{ 
  boost::posix_time::ptime pt1(boost::gregorian::date(2009, 1, 05), 
    boost::posix_time::time_duration(12, 0, 0)); 
  boost::posix_time::time_duration td(6, 30, 0); 
  boost::posix_time::ptime pt2 = pt1 + td; 
  std::cout << pt2.time_of_day() << std::endl; 
} 