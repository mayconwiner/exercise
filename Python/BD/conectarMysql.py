#!/usr/bin/python3
# -*- coding: utf-8 -*-
import MySQLdb
try:
    con = MySQLdb.connect(host='localhost', user='admin',
                          passwd='Italofilho', db='projetos')
    cur = con.cursor()
except Exception as e:
    print ("Erro {} ".format(e))
    exit()
cur.execute("insert into usuarios(nome) values('Wanderson Michel');")
print("OK....")
con.commit()
cur.close()
con.close()
