
find . -type d -name ${1} -print0 | xargs -0 rm -rf
