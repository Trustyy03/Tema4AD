package EjercicioCompletar

import java.sql.DriverManager

fun ModificacioDades() {

    val url = "jdbc:sqlite:Empleats.sqlite"
    val con = DriverManager.getConnection(url)
    val st = con.createStatement()

    st.executeUpdate("UPDATE EMPLEAT SET sou = sou * 1.05")
    st.executeUpdate("UPDATE EMPLEAT SET depart = 20 WHERE num = 3")

    st.close()
    con.close()

}