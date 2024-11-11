package EjercicioCompletar

import java.sql.DriverManager

fun main() {
    val url = "jdbc:sqlite:Empleats.sqlite"
    val con = DriverManager.getConnection(url)
    val st = con.createStatement()

    val sentSQL = "CREATE TABLE EMPLEAT (\n" +
            "    num INTEGER CONSTRAINT cp_emp PRIMARY KEY,\n" +
            "    nom TEXT,\n" +
            "    depart INTEGER,\n" +
            "    edat INTEGER,\n" +
            "    sou REAL\n" +
            ");"

    st.executeUpdate(sentSQL)

    st.close()
    con.close()
}