import java.sql.DriverManager

fun ConexionPostgre() {

    val url = "jdbc:postgresql://89.36.214.106:5432/geo_ad"
    val usuario = "geo_ad"
    val contrasenia = "geo_ad"

    val con = DriverManager.getConnection(url, usuario, contrasenia)
    println("Connexió completada")
    con.close()
}

fun ConexionMySql() {

    val url = "jdbc:mysql://89.36.214.106:3306/factura"
    val usuario = "factura"
    val contrasenia = "factura"

    val con = DriverManager.getConnection(url, usuario, contrasenia)
    println("Connexió completada")
    con.close()
}

fun ConexionSqlLite() {
    val url = "jdbc:sqlite:sqlite.sqlite"

    val con = DriverManager.getConnection(url)
    println("Connexió completada")
    con.close()

}

fun main() {
    //ConexionPostgre()
    //ConexionMySql()
    //ConexionSqlLite()


    /*val url = "jdbc:sqlite:sqlite.sqlite"

    val con = DriverManager.getConnection(url)
    println("Connexió completada")

    val st = con.createStatement()
    st.executeUpdate("CREATE TABLE T2 (c1 TEXT)")
    val rs = st.executeQuery("SELECT * FROM T2")

    while (rs.next()){
        println(rs.getInt("c1"))
    }
    st.close()
    con.close()*/

    /*val url = "jdbc:postgresql://89.36.214.106:5432/geo_ad"
    val usuario = "geo_ad"
    val contrasenia = "geo_ad"

    val con = DriverManager.getConnection(url, usuario, contrasenia)
    println("Connexió completada")

    val st = con.createStatement()
    val rs = st.executeQuery("SELECT * FROM institut")
    while (rs.next()) {
        print("" + rs.getInt(1) + "\t")
        println(rs.getString(2))
    }

    st.close()
    con.close()*/

    val url = "jdbc:mysql://89.36.214.106:3306/factura"
    val usuario = "factura"
    val contrasenia = "factura"

    val con = DriverManager.getConnection(url, usuario, contrasenia)
    println("Connexió completada")

    val st = con.createStatement()
    val rs = st.executeQuery("SELECT * FROM article")
    while (rs.next()) {
        print("" + rs.getString(1) + "\t")
        println(rs.getString(2))
    }
}