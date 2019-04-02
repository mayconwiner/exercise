#!/usr/bin/python3
from sqlalchemy import delete
from core import user_table, engine
con = engine.connect()
d = delete(user_table).where(user_table.c.nome=='daniel')



result = con.execute(d)
print(result.rowcount)