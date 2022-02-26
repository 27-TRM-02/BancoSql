
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author trm
 */
public class GestorConexiones {

    // Variables globales
    Connection conexion;
    // String conexion bbdd banco
    String urlBBDD = "jdbc:mysql://localhost:3306/banco?serverTimezone=UTC";

    /**
     * Abre un pool de conexiones con la bbdd
     *
     * @return 0 si ha ido bien; -1 error
     */
    public int poolConexiones() {
        BasicDataSource fuenteDatos = new BasicDataSource();
        fuenteDatos.setUrl(urlBBDD);
        fuenteDatos.setUsername("root");
        fuenteDatos.setPassword("root");
        try {
            conexion = fuenteDatos.getConnection();
            if (conexion != null) {
                System.out.println("Conexion a la BBDD creada");
            }
            return 0;
        } catch (Exception e) {
            System.err.println("Error: " + e.toString());
            System.out.println("No se puede crear la conexión");
            return -1;
        }
    }

    /**
     * Cierra conexion con la bbdd
     *
     * @return 0 si ha ido bien; -1 error
     */
    public int cerrar_conexion() {
        try {
            conexion.close();
            System.out.println("Desconectado de la BBDD");
            return 0;
        } catch (SQLException e) {
            System.out.println("ERROR");
            return -1;
        }
    }

    /**
     * @return Lista con dnis con cuentas
     */
    public ArrayList<String> consultaDnis() {
        ArrayList<String> dnis = new ArrayList<>();
        String consulta = "SELECT * FROM cuenta ORDER BY cuenta.dni_cuenta ASC";
        try {
            Statement dniCombo = conexion.createStatement();
            ResultSet res = dniCombo.executeQuery(consulta);
            while (res.next()) {
                dnis.add(res.getString("dni_cuenta"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return dnis;
    }

    /**
     * @return Lista con dnis con cuentas
     */
    public ArrayList<Integer> consultaSucursales() {
        ArrayList<Integer> lista = new ArrayList<>();
        String consulta = "SELECT * FROM sucursal ORDER BY sucursal.id_sucursal ASC";
        try {
            Statement dniCombo = conexion.createStatement();
            ResultSet res = dniCombo.executeQuery(consulta);
            while (res.next()) {
                lista.add(res.getInt("id_sucursal"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    /**
     * @return Lista con dnis de clientes
     */
    public ArrayList<String> consultaDnisClientes() {
        ArrayList<String> lista = new ArrayList<>();
        String consulta = "SELECT * FROM cliente ORDER BY cliente.dni ASC";
        try {
            Statement dniCombo = conexion.createStatement();
            ResultSet res = dniCombo.executeQuery(consulta);
            while (res.next()) {
                lista.add(res.getString("dni"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    /**
     *
     * @return Tabla modelo con datos Consulta clientes
     */
    public DefaultTableModel consultaTodosLosClientes() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Fecha nacimiento");

        Statement c;
        Object datos[] = new Object[4];
        String consulta = "SELECT * FROM cliente;";
        try {
            c = conexion.createStatement();
            ResultSet res = c.executeQuery(consulta);
            while (res.next()) {
                datos[0] = res.getString("dni");
                datos[1] = res.getString("nombre");
                datos[2] = res.getString("apellidos");
                datos[3] = res.getString("fecha_nacimiento");
                modelo.addRow(datos);
            }
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     *
     * @return Tabla modelo con datos Consulta Cuentas
     */
    public DefaultTableModel consultaTodosLasCuentas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cuenta");
        modelo.addColumn("Número Cuenta");
        modelo.addColumn("Propietario");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Saldo");

        Statement c;
        Object datos[] = new Object[5];
        String consulta = "SELECT * FROM cuenta;";
        try {
            c = conexion.createStatement();
            ResultSet res = c.executeQuery(consulta);
            while (res.next()) {
                datos[0] = res.getInt("id_cuenta");
                datos[1] = res.getInt("numero_cuenta");
                datos[2] = res.getString("dni_cuenta");
                datos[3] = res.getInt("id_sucursal");
                datos[4] = res.getInt("saldo");
                modelo.addRow(datos);
            }
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     *
     * @return Tabla modelo con datos Consulta sucursales
     */
    public DefaultTableModel consultaTodosLasSucursales() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Sucursal");
        modelo.addColumn("Dirección");

        Statement c;
        Object datos[] = new Object[2];
        String consulta = "SELECT * FROM sucursal;";
        try {
            c = conexion.createStatement();
            ResultSet res = c.executeQuery(consulta);
            while (res.next()) {
                datos[0] = res.getInt("id_sucursal");
                datos[1] = res.getString("direccion");
                modelo.addRow(datos);
            }
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     *
     * @return Tabla modelo con datos Consulta movimientos
     */
    public DefaultTableModel consultaTodosLosMovimientos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Movimiento");
        modelo.addColumn("ID Cuenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cantidad");

        Statement c;
        Object datos[] = new Object[4];
        String consulta = "SELECT * FROM movimientos;";
        try {
            c = conexion.createStatement();
            ResultSet res = c.executeQuery(consulta);
            while (res.next()) {
                datos[0] = res.getInt("id_movimiento");
                datos[1] = res.getInt("id_cuenta");
                datos[2] = res.getString("fecha");
                datos[3] = res.getInt("cantidad");
                modelo.addRow(datos);
            }
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     * @param id_cuenta
     * @return modelo Tabla con datos de movimientos
     */
    public DefaultTableModel consultaMovPorIdCuenta(int id_cuenta) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Movimiento");
        modelo.addColumn("ID Cuenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cantidad");

        PreparedStatement c;
        Object datos[] = new Object[4];
        String consulta = "SELECT * FROM movimientos WHERE id_cuenta = ?;";
        try {
            c = conexion.prepareStatement(consulta);
            c.setInt(1, id_cuenta);
            ResultSet res = c.executeQuery();
            while (res.next()) {
                datos[0] = res.getInt("id_movimiento");
                datos[1] = res.getInt("id_cuenta");
                datos[2] = res.getString("fecha");
                datos[3] = res.getInt("cantidad");
                modelo.addRow(datos);
            }
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     * 
     * @param id_movimiento
     * @return modelo Tabla con datos de movimientos
     */
    public DefaultTableModel consultaMovPorId(int id_movimiento) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Movimiento");
        modelo.addColumn("ID Cuenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cantidad");

        PreparedStatement c;
        Object datos[] = new Object[4];
        String consulta = "SELECT * FROM movimientos WHERE id_movimiento = ?;";
        try {
            c = conexion.prepareStatement(consulta);
            c.setInt(1, id_movimiento);
            ResultSet res = c.executeQuery();
            while (res.next()) {
                datos[0] = res.getInt("id_movimiento");
                datos[1] = res.getInt("id_cuenta");
                datos[2] = res.getString("fecha");
                datos[3] = res.getInt("cantidad");
                modelo.addRow(datos);
            }
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     * Insertar nuevo Cliente a la tabla
     *
     * @return 0 si ha ido bien; -1 error
     */
    public int insertarCliente(String dni, String nombre, String apellidos, String fechaNacimiento) {
        PreparedStatement i;
        try {
            i = conexion.prepareStatement("INSERT INTO cliente VALUES (?, ?, ?, ?);");
            i.setString(1, dni);
            i.setString(2, nombre);
            i.setString(3, apellidos);
            i.setString(4, fechaNacimiento);
            i.executeUpdate();
            System.out.println("Se ha añadido el artista correctamente");
            i.close();
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }
    
    /**
     * Insertar nueva Sucursal a la tabla
     *
     * @return 0 si ha ido bien; -1 error
     */
    public int insertarSucursal(String direccion) {
        PreparedStatement i;
        try {
            i = conexion.prepareStatement("INSERT INTO sucursal(direccion) VALUES (?);");
            i.setString(1, direccion);
            i.executeUpdate();
            System.out.println("Se ha añadido el sucursal correctamente");
            i.close();
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }
    
    /**
     * Insertar nueva Cuenta a la tabla
     *
     * @return 0 si ha ido bien; -1 error
     */
    public int insertarCuenta(String numero_cuenta, String dni_cuenta, String id_sucursal) {
        PreparedStatement i;
        int cuenta = Integer.valueOf(numero_cuenta);
        int sucursal = Integer.valueOf(id_sucursal);
        try {
            i = conexion.prepareStatement("INSERT INTO cuenta(numero_cuenta, dni_cuenta, id_sucursal) VALUES (?, ?, ?);");
            i.setInt(1, cuenta);
            i.setString(2, dni_cuenta);
            i.setInt(3, sucursal);
            i.executeUpdate();
            System.out.println("Se ha añadido el cuenta correctamente");
            i.close();
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }

    /**
     * 
     * @param id_cuenta
     * @return cantidad saldo actual de la cuenta
     */
    public int cantidadCliente(int id_cuenta) {
        int cantidadActual = 0;
        PreparedStatement m;
        String query = "SELECT * FROM cuenta WHERE id_cuenta = ?;";
        try {
            m = conexion.prepareStatement(query);
            m.setInt(1, id_cuenta);
            ResultSet res = m.executeQuery();
            if (res.next()) {
                cantidadActual = res.getInt("saldo");
                System.out.println("La cantidad se ha leido bien");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cantidadActual;
    }

    /**
     * 
     * @param id_cuenta
     * @param fecha
     * @param cantidad
     * @return 0 si ha ido bien; -1 error
     */
    public int insertarMovimiento(int id_cuenta, String fecha, int cantidad) {
        PreparedStatement m;
        String addMov = "INSERT INTO movimientos(id_cuenta, fecha, cantidad) VALUE (?, ?, ?);";
        String updateCantidadCliente = "UPDATE cuenta SET saldo = ? WHERE id_cuenta = ?";
        try {
            // Autocommit false para poder hacer un rollback
            conexion.setAutoCommit(false);
            m = conexion.prepareStatement(addMov);
            m.setInt(1, id_cuenta);
            m.setString(2, fecha);
            m.setInt(3, cantidad);
            // Primera query
            m.executeUpdate();
            // Calculamos saldo despues del movimiento
            int saldo = cantidadCliente(id_cuenta);
            int saldoFinal = saldo + cantidad;
            // Segunda query
            m = conexion.prepareStatement(updateCantidadCliente);
            m.setInt(1, saldoFinal);
            m.setInt(2, id_cuenta);
            m.executeUpdate();
            // Cerramos la conexion           
            m.close();
            // Hacemos commit de los datos si no ha habido fallos
            conexion.commit();
            return 0;
        } catch (SQLException e) {
            System.out.println(e.toString());
            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
            return -1;
        }
    }

    /**
     * Consulta Clientes por DNI
     *
     * @param dni
     * @return modelo tabla con datos de cliente
     */
    public DefaultTableModel consultaClientePorDni(String dni) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Fecha nacimiento");

        PreparedStatement c;
        Object datos[] = new Object[4];
        String consulta = "SELECT * FROM cliente WHERE dni = ?;";
        try {
            c = conexion.prepareStatement(consulta);
            c.setString(1, dni);
            ResultSet res = c.executeQuery();

            while (res.next()) {
                datos[0] = res.getString("dni");
                datos[1] = res.getString("nombre");
                datos[2] = res.getString("apellidos");
                datos[3] = res.getString("fecha_nacimiento");
                modelo.addRow(datos);
            }
            System.out.println("Se ha realizado la consulta bien");
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     * Consulta cuentas por Id cuenta
     *
     * @param dni
     * @return tabla modelo con datos
     */
    public DefaultTableModel consultaCuentaPorId(String id_cuenta) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cuenta");
        modelo.addColumn("Número Cuenta");
        modelo.addColumn("Propietario");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Saldo");
        // Cambiamos de String a int
        int id = Integer.valueOf(id_cuenta);
        PreparedStatement c;
        Object datos[] = new Object[5];
        String consulta = "SELECT * FROM cuenta WHERE id_cuenta = ?;";
        try {
            c = conexion.prepareStatement(consulta);
            c.setInt(1, id);
            ResultSet res = c.executeQuery();

            while (res.next()) {
                datos[0] = res.getInt("id_cuenta");
                datos[1] = res.getInt("numero_cuenta");
                datos[2] = res.getString("dni_cuenta");
                datos[3] = res.getInt("id_sucursal");
                datos[4] = res.getInt("saldo");
                modelo.addRow(datos);
            }
            System.out.println("Se ha realizado la consulta bien");
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     * Consulta cuentas por Id sucursal
     *
     * @param dni
     * @return tabla con datos
     */
    public DefaultTableModel consultaCuentaPorSucursal(String id_sucursal) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cuenta");
        modelo.addColumn("Número Cuenta");
        modelo.addColumn("Propietario");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Saldo");
        // Cambiamos de String a int
        int id = Integer.valueOf(id_sucursal);
        PreparedStatement c;
        Object datos[] = new Object[5];
        String consulta = "SELECT * FROM cuenta WHERE id_sucursal = ?;";
        try {
            c = conexion.prepareStatement(consulta);
            c.setInt(1, id);
            ResultSet res = c.executeQuery();

            while (res.next()) {
                datos[0] = res.getInt("id_cuenta");
                datos[1] = res.getInt("numero_cuenta");
                datos[2] = res.getString("dni_cuenta");
                datos[3] = res.getInt("id_sucursal");
                datos[4] = res.getInt("saldo");
                modelo.addRow(datos);
            }
            System.out.println("Se ha realizado la consulta bien");
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     * Consulta cliente por nombre
     * @param nombre
     * @return tabla con datos
     */
    public DefaultTableModel consultaClientePorNombre(String nombre) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Fecha nacimiento");

        PreparedStatement c;
        Object datos[] = new Object[4];
        String consulta = "SELECT * FROM cliente WHERE nombre = ?;";
        try {
            c = conexion.prepareStatement(consulta);
            c.setString(1, nombre);
            ResultSet res = c.executeQuery();

            while (res.next()) {
                datos[0] = res.getString("dni");
                datos[1] = res.getString("nombre");
                datos[2] = res.getString("apellidos");
                datos[3] = res.getString("fecha_nacimiento");
                modelo.addRow(datos);
            }
            System.out.println("Se ha realizado la consulta bien");
            res.close();
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return modelo;
    }

    /**
     * Borra cliente por dni cliente
     * @param dni
     * @return 0 si ha ido bien; -1 error
     */
    public int borrarClienteporDni(String dni) {
        PreparedStatement i;
        try {
            i = conexion.prepareStatement("DELETE FROM cliente WHERE dni = ?");
            i.setString(1, dni);
            i.executeUpdate();
            System.out.println("Se ha borrado correctamente");
            i.close();
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }

    /**
     * Modifica Nombre del cliente por dni 
     * @param dni
     * @param nombre
     * @return 0 si ha ido bien; -1 error
     */
    public int modificarNombreClienteporDni(String dni, String nombre) {
        PreparedStatement i;
        try {
            i = conexion.prepareStatement("UPDATE cliente SET nombre = ? WHERE dni = ?");
            i.setString(1, nombre);
            i.setString(2, dni);
            i.executeUpdate();
            System.out.println("Se ha modificado correctamente");
            i.close();
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }

    /**
     * Modifica Apellidos del Cliente por el dni
     * @param dni
     * @param apellidos
     * @return 0 si ha ido bien; -1 error
     */
    public int modificarApellidosClienteporDni(String dni, String apellidos) {
        PreparedStatement i;
        try {
            i = conexion.prepareStatement("UPDATE cliente SET apellidos = ? WHERE dni = ?");
            i.setString(1, apellidos);
            i.setString(2, dni);
            i.executeUpdate();
            System.out.println("Se ha modificado correctamente");
            i.close();
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }

    /**
     * Modifica Nacimiento de Cliente por dni
     * @param dni
     * @param fecha_nacimiento
     * @return 0 si ha ido bien; -1 error
     */
    public int modificarNacimientoClienteporDni(String dni, String fecha_nacimiento) {
        PreparedStatement i;
        try {
            i = conexion.prepareStatement("UPDATE cliente SET fecha_nacimiento = ? WHERE dni = ?");
            i.setString(1, fecha_nacimiento);
            i.setString(2, dni);
            i.executeUpdate();
            System.out.println("Se ha modificado correctamente");
            i.close();
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }

}
