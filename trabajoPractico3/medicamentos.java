
public static void main(String[] args) throws Exception {
Connection conn = null;
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection(url,login,password);

Statement st = conn.createStatement();
st.executeUpdate( "CREATE TABLE medicamento("
+ "id INT AUTO_INCREMENT, "
+ "PRIMARY KEY(id), "
+ "nombre VARCHAR(20), "
+ "composicion VARCHAR(20), "
+ "precio VARCHAR(10))" );
System.out.println("Creada tabla medicamento");

String nombre[]={"J","","",""};
String composicion[]={"","","",""};
String precio[]={"90","70","90",""};
for (int i=0;i < nombre.length;i++) {
st.executeUpdate("INSERT INTO medicamento ("
+ "nombre, "+ "composicion, "+ "precio) "+ "VALUES ("+ "'"+nombre[i]+"','"+composicion[i]+"','"+precio[i]+"' )");
}
System.out.println("Añadir registros a la tabla - Ok");

System.out.println("Consultar medicamentos registrados:");
ResultSet rs = st.executeQuery ("select * from medicamento");
while (rs.next()) {
System.out.println (
rs.getString (1) + " " +
rs.getString (2) + " " +
rs.getString (3) + " " +
rs.getString (4)
);
}

st.executeUpdate("DROP TABLE medicamento");
System.out.println("Borrar tabla ");

}
} catch(SQLException ex) { System.out.println(ex); }
}