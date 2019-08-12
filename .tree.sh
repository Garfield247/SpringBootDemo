#!/bin/sh

filename="./README.md"
echo '# SpringBoot Demo' > ${filename}


for p in `find ./spring* -maxdepth 1 -type d`;
    do
        if [ -e ${p}/readme.md ]
        then
        echo $p
        index=`cat ${p}/readme.md|sed -n '1p'`
        echo "- [${index:2}](${p})\n" >>${filename}
        fi
    done


echo "\n\n\n<!-- 本目录通过[.tree.sh](./.tree.sh)生成 -->" >> ${filename}
echo "ok!"
