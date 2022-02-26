
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 * @author trm
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Variables globales
    Boolean estadoConexion = false;
    GestorConexiones bbdd = new GestorConexiones();

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        conexionButton.setBackground(Color.green);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupClientesConsultas = new javax.swing.ButtonGroup();
        buttonGroupClientesModif = new javax.swing.ButtonGroup();
        consultasMovs = new javax.swing.ButtonGroup();
        buttonGroupCuentas = new javax.swing.ButtonGroup();
        estadoConexionLabel = new javax.swing.JLabel();
        conexionButton = new javax.swing.JButton();
        tabPrincipal = new javax.swing.JTabbedPane();
        clientesPanel = new javax.swing.JPanel();
        clientesPane = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dniClientText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreClienteText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidosClientText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        diaClienteText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        annoClientText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mesClientText = new javax.swing.JTextField();
        addClienteButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nombreConsultaRB = new javax.swing.JRadioButton();
        dniConsultaRB = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        consultaClienteText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        consultaClienteButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        modifClienteText = new javax.swing.JTextField();
        modificarClienteButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        eliminarClienteButton = new javax.swing.JButton();
        nombreModifRB = new javax.swing.JRadioButton();
        apellidosModifCliente = new javax.swing.JRadioButton();
        fNacimientoRB = new javax.swing.JRadioButton();
        dniClientesBorrar = new javax.swing.JComboBox<>();
        dniClientesModif = new javax.swing.JComboBox<>();
        cuentasPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comoBoxCuentasDNI = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        nCuentaText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        addCuentaButton = new javax.swing.JButton();
        comboBoxIdSucursales = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cuentaConsultaText = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        consultaCuentaButton = new javax.swing.JButton();
        idCuentaCuenta = new javax.swing.JRadioButton();
        sucursalCuenta = new javax.swing.JRadioButton();
        sucursalesPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSucursales = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        direccionText = new javax.swing.JTextField();
        addSucursalButton = new javax.swing.JButton();
        movimientosPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        comboBoxMovsId = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cantidadMovText = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fechaMovText = new javax.swing.JTextField();
        addMovimientoButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        consultaMovsText = new javax.swing.JTextField();
        idCuentaConsulta = new javax.swing.JRadioButton();
        idMovsConsulta = new javax.swing.JRadioButton();
        consultaMovsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        estadoConexionLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        estadoConexionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadoConexionLabel.setText("Desconectado de la BBDD");

        conexionButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        conexionButton.setForeground(new java.awt.Color(1, 1, 1));
        conexionButton.setText("Conectar BBDD");
        conexionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexionButtonActionPerformed(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        clientesPane.setViewportView(tablaClientes);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO CLIENTE");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel2.setText("DNI*:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel3.setText("Nombre*:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel5.setText("Día:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de nacimiento*:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel7.setText("Año:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel8.setText("Mes:");

        addClienteButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        addClienteButton.setText("AÑADIR");
        addClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClienteButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CONSULTAR CLIENTES");

        buttonGroupClientesConsultas.add(nombreConsultaRB);
        nombreConsultaRB.setText("Por Nombre");

        buttonGroupClientesConsultas.add(dniConsultaRB);
        dniConsultaRB.setText("Por DNI");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel10.setText("Buscar Por*:");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MODIFICAR POR DNI");

        consultaClienteButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        consultaClienteButton.setText("BUSCAR");
        consultaClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClienteButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel14.setText("*DNI:");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel15.setText("Nuevo*:");

        modificarClienteButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        modificarClienteButton.setText("MODIFICAR");
        modificarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarClienteButtonActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ELIMINAR CLIENTE");

        jLabel18.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel18.setText("DNI*:");

        eliminarClienteButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        eliminarClienteButton.setText("ELIMINAR");
        eliminarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteButtonActionPerformed(evt);
            }
        });

        buttonGroupClientesModif.add(nombreModifRB);
        nombreModifRB.setText("Nombre");

        buttonGroupClientesModif.add(apellidosModifCliente);
        apellidosModifCliente.setText("Apellidos");

        buttonGroupClientesModif.add(fNacimientoRB);
        fNacimientoRB.setText("Fecha de nacimiento");

        dniClientesBorrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dniClientesModif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout clientesPanelLayout = new javax.swing.GroupLayout(clientesPanel);
        clientesPanel.setLayout(clientesPanelLayout);
        clientesPanelLayout.setHorizontalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addComponent(clientesPane)
                        .addContainerGap())
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dniClientText))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreClienteText))
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidosClientText))
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesClientText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(annoClientText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addClienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(dniClientesBorrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(consultaClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesPanelLayout.createSequentialGroup()
                                .addComponent(nombreConsultaRB)
                                .addGap(46, 46, 46)
                                .addComponent(dniConsultaRB))
                            .addComponent(consultaClienteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarClienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifClienteText))
                            .addComponent(modificarClienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dniClientesModif, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addComponent(nombreModifRB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellidosModifCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fNacimientoRB)))))
        );
        clientesPanelLayout.setVerticalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dniClientText)
                            .addComponent(nombreConsultaRB)
                            .addComponent(dniConsultaRB))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dniClientesModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombreClienteText)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(consultaClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreModifRB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidosModifCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellidosClientText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(consultaClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fNacimientoRB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaClienteText)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesClientText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(annoClientText)
                            .addComponent(addClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modifClienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(clientesPanelLayout.createSequentialGroup()
                                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dniClientesBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(clientesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPrincipal.addTab("Clientes", clientesPanel);

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaCuentas);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel12.setText("DNI Cliente*:");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("NUEVA CUENTA");

        comoBoxCuentasDNI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel16.setText("Nº Cuenta*:");

        jLabel19.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel19.setText("Id Sucursal*:");

        addCuentaButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        addCuentaButton.setText("CREAR CUENTA");
        addCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCuentaButtonActionPerformed(evt);
            }
        });

        comboBoxIdSucursales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel28.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("CONSULTAR CUENTAS");

        jLabel29.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel29.setText("Buscar Por*:");

        consultaCuentaButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        consultaCuentaButton.setText("BUSCAR");
        consultaCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCuentaButtonActionPerformed(evt);
            }
        });

        buttonGroupCuentas.add(idCuentaCuenta);
        idCuentaCuenta.setText("Por Id cuenta");

        buttonGroupCuentas.add(sucursalCuenta);
        sucursalCuenta.setText("Por sucursal");

        javax.swing.GroupLayout cuentasPanelLayout = new javax.swing.GroupLayout(cuentasPanel);
        cuentasPanel.setLayout(cuentasPanelLayout);
        cuentasPanelLayout.setHorizontalGroup(
            cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(cuentasPanelLayout.createSequentialGroup()
                        .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cuentasPanelLayout.createSequentialGroup()
                                .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuentasPanelLayout.createSequentialGroup()
                                        .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comoBoxCuentasDNI, 0, 161, Short.MAX_VALUE)
                                            .addComponent(nCuentaText)))
                                    .addGroup(cuentasPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxIdSucursales, 0, 161, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addGroup(cuentasPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cuentaConsultaText))
                                    .addComponent(consultaCuentaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(cuentasPanelLayout.createSequentialGroup()
                                        .addComponent(idCuentaCuenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sucursalCuenta)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cuentasPanelLayout.setVerticalGroup(
            cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuentasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comoBoxCuentasDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCuentaCuenta)
                    .addComponent(sucursalCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuentasPanelLayout.createSequentialGroup()
                        .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nCuentaText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxIdSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cuentasPanelLayout.createSequentialGroup()
                        .addGroup(cuentasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuentaConsultaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultaCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPrincipal.addTab("Cuentas", cuentasPanel);

        tablaSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaSucursales);

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("NUEVA SUCURSAL");

        jLabel21.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel21.setText("Dirección*:");

        addSucursalButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        addSucursalButton.setText("CREAR SUCURSAL");
        addSucursalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSucursalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sucursalesPanelLayout = new javax.swing.GroupLayout(sucursalesPanel);
        sucursalesPanel.setLayout(sucursalesPanelLayout);
        sucursalesPanelLayout.setHorizontalGroup(
            sucursalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sucursalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sucursalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(sucursalesPanelLayout.createSequentialGroup()
                        .addGroup(sucursalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sucursalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addSucursalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(sucursalesPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(23, 23, 23)
                                    .addComponent(direccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sucursalesPanelLayout.setVerticalGroup(
            sucursalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sucursalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sucursalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSucursalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPrincipal.addTab("Sucursales", sucursalesPanel);

        tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaMovimientos);

        jLabel22.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel22.setText("Id Cuenta*:");

        comboBoxMovsId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("NUEVO MOVIMIENTO");

        jLabel24.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel24.setText("Cantidad(€)*:");

        jLabel25.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel25.setText("Fecha:");

        addMovimientoButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        addMovimientoButton.setText("GENERAR MOVIMIENTO");
        addMovimientoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovimientoButtonActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CONSULTAR MOVIMIENTOS");

        jLabel27.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel27.setText("Buscar Por*:");

        consultasMovs.add(idCuentaConsulta);
        idCuentaConsulta.setText("Por Id Cuenta");

        consultasMovs.add(idMovsConsulta);
        idMovsConsulta.setText("Por Id Mov.");

        consultaMovsButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        consultaMovsButton.setText("CONSULTAR");
        consultaMovsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMovsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout movimientosPanelLayout = new javax.swing.GroupLayout(movimientosPanel);
        movimientosPanel.setLayout(movimientosPanelLayout);
        movimientosPanelLayout.setHorizontalGroup(
            movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movimientosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(movimientosPanelLayout.createSequentialGroup()
                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addMovimientoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(movimientosPanelLayout.createSequentialGroup()
                                .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movimientosPanelLayout.createSequentialGroup()
                                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fechaMovText)
                                            .addComponent(comboBoxMovsId, 0, 149, Short.MAX_VALUE)
                                            .addComponent(cantidadMovText))))
                                .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(movimientosPanelLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(movimientosPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(consultaMovsText))
                                            .addGroup(movimientosPanelLayout.createSequentialGroup()
                                                .addComponent(idCuentaConsulta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(idMovsConsulta))
                                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(movimientosPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(consultaMovsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        movimientosPanelLayout.setVerticalGroup(
            movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movimientosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(movimientosPanelLayout.createSequentialGroup()
                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxMovsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaMovText)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movimientosPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idCuentaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idMovsConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultaMovsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(movimientosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMovText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaMovsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMovimientoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPrincipal.addTab("Movimientos", movimientosPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conexionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoConexionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(tabPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoConexionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conexionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Conectar/Desconectar
    private void conexionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexionButtonActionPerformed
        if (!estadoConexion) {
            bbdd.poolConexiones();
            conexionButton.setText("Desconectar BBDD");
            conexionButton.setBackground(Color.red);
            estadoConexionLabel.setText("Conectado a la BBDD");
            estadoConexion = true;
            // Mostramos todos los registros de clientes
            DefaultTableModel modeloClientes = bbdd.consultaTodosLosClientes();
            tablaClientes.setModel(modeloClientes);
            // Mostramos todos los registros de cuentas
            DefaultTableModel modeloCuentas = bbdd.consultaTodosLasCuentas();
            tablaCuentas.setModel(modeloCuentas);
            // Mostramos todos los registros de cuentas
            DefaultTableModel modeloSucursales = bbdd.consultaTodosLasSucursales();
            tablaSucursales.setModel(modeloSucursales);
            // Mostramos todos los registros de cuentas
            DefaultTableModel modeloMovimientos = bbdd.consultaTodosLosMovimientos();
            tablaMovimientos.setModel(modeloMovimientos);
            // Añadimos dnis de cuentas al combo box
            comoBoxCuentasDNI.removeAllItems();
            ArrayList<String> dnis = new ArrayList<>();
            dnis = bbdd.consultaDnis();
            for (int i = 0; i < dnis.size(); i++) {
                comoBoxCuentasDNI.addItem(dnis.get(i));
            }
            // Añadimos id_sucursales de sucursales al combo box
            comboBoxIdSucursales.removeAllItems();
            ArrayList<Integer> id_sucursales = new ArrayList<>();
            id_sucursales = bbdd.consultaSucursales();
            for (int i = 0; i < id_sucursales.size(); i++) {
                comboBoxIdSucursales.addItem(id_sucursales.get(i).toString());
            }
            // Añadimos id_sucursales de sucursales al combo box
            comboBoxMovsId.removeAllItems();
            id_sucursales = bbdd.consultaSucursales();
            for (int i = 0; i < id_sucursales.size(); i++) {
                comboBoxMovsId.addItem(id_sucursales.get(i).toString());
            }
            // Añadimos dnis de clientes al combo box borrar
            dniClientesBorrar.removeAllItems();
            ArrayList<String> dnis_clientes = new ArrayList<>();
            dnis_clientes = bbdd.consultaDnisClientes();
            for (int i = 0; i < dnis_clientes.size(); i++) {
                dniClientesBorrar.addItem(dnis_clientes.get(i).toString());
            }
            // Añadimos dnis de clientes al combo box modificar
            dniClientesModif.removeAllItems();
            dnis_clientes = bbdd.consultaDnisClientes();
            for (int i = 0; i < dnis_clientes.size(); i++) {
                dniClientesModif.addItem(dnis_clientes.get(i).toString());
            }

        } else { // Cerrar conexion
            bbdd.cerrar_conexion();
            conexionButton.setBackground(Color.green);
            conexionButton.setText("Conectar BBDD");
            estadoConexionLabel.setText("Desconectado a la BBDD");
            estadoConexion = false;
        }
    }//GEN-LAST:event_conexionButtonActionPerformed

    // Boton añadir Cliente
    private void addClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClienteButtonActionPerformed
        // TODO add your handling code here:
        int res = -1;
        String dni = dniClientText.getText();
        String nombre = nombreClienteText.getText();
        String apellidos = apellidosClientText.getText();
        String f_nacimiento = diaClienteText.getText() + "/" + mesClientText.getText() + "/" + annoClientText.getText();
        if (dni.isEmpty() || nombre.isEmpty()) {
            estadoConexionLabel.setText("Faltan campos por rellenar");
        } else {
            res = bbdd.insertarCliente(dni, nombre, apellidos, f_nacimiento);
        }
        if (res == 0) {
            estadoConexionLabel.setText("Se ha añadido cliente");
        } else {
            estadoConexionLabel.setText("Error");
        }
    }//GEN-LAST:event_addClienteButtonActionPerformed

    // Boton consulta cliente
    private void consultaClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClienteButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel consultaCliModelo;
        String consultaCliente = consultaClienteText.getText();
        if (!consultaCliente.isEmpty()) {
            if (nombreConsultaRB.isSelected()) {
                consultaCliModelo = bbdd.consultaClientePorNombre(consultaCliente);
                tablaClientes.setModel(consultaCliModelo);
                estadoConexionLabel.setText("Consulta realizada");
            } else if (dniConsultaRB.isSelected()) {
                consultaCliModelo = bbdd.consultaClientePorDni(consultaCliente);
                tablaClientes.setModel(consultaCliModelo);
                estadoConexionLabel.setText("Consulta realizada");
            }
        } else {
            estadoConexionLabel.setText("Falta rellenar campos");
        }

    }//GEN-LAST:event_consultaClienteButtonActionPerformed

    // Boton modificar Cliente
    private void modificarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarClienteButtonActionPerformed
        // TODO add your handling code here:
        String nuevo = modifClienteText.getText();
        String dni = dniClientesModif.getSelectedItem().toString();
        if (nuevo.isEmpty() || dni.isEmpty()) {
            estadoConexionLabel.setText("Faltan campos por rellenar");
        } else {
            if (nombreModifRB.isSelected()) {
                int res = bbdd.modificarNombreClienteporDni(dni, nuevo);
                if (res == 0) {
                    estadoConexionLabel.setText("Se ha modicado correctamente");
                } else {
                    estadoConexionLabel.setText("Error");
                }
            } else if (apellidosModifCliente.isSelected()) {
                int res = bbdd.modificarApellidosClienteporDni(dni, nuevo);
                if (res == 0) {
                    estadoConexionLabel.setText("Se ha modicado correctamente");
                } else {
                    estadoConexionLabel.setText("Error");
                }
            } else if (fNacimientoRB.isSelected()) {
                int res = bbdd.modificarNacimientoClienteporDni(dni, nuevo);
                if (res == 0) {
                    estadoConexionLabel.setText("Se ha modicado correctamente");
                } else {
                    estadoConexionLabel.setText("Error");
                }
            }

        }

    }//GEN-LAST:event_modificarClienteButtonActionPerformed

    // Boton eliminar cliente
    private void eliminarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteButtonActionPerformed
        String dni = dniClientesBorrar.getSelectedItem().toString();
        if (!dni.isEmpty()) {
            int res = bbdd.borrarClienteporDni(dni);
            if (res == 0) {
                estadoConexionLabel.setText("Se ha borrado correctamente");
            }
        } else {
            estadoConexionLabel.setText("Rellenar DNI");
        }
    }//GEN-LAST:event_eliminarClienteButtonActionPerformed

    // Boton añadir movimiento
    private void addMovimientoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovimientoButtonActionPerformed
        // TODO add your handling code here:
        int id_cuenta = Integer.valueOf(comboBoxMovsId.getSelectedItem().toString());
        String fecha = fechaMovText.getText();
        int cantidad = Integer.valueOf(cantidadMovText.getValue().toString());
        int res = bbdd.insertarMovimiento(id_cuenta, fecha, cantidad);
        if (res == 0) {
            estadoConexionLabel.setText("Movimiento generado");
        } else {
            estadoConexionLabel.setText("No hay saldo suficiente");
        }
    }//GEN-LAST:event_addMovimientoButtonActionPerformed

    // Boton consulta Movimiento
    private void consultaMovsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMovsButtonActionPerformed
        // TODO add your handling code here:
        String text = consultaMovsText.getText();
        if (!text.isEmpty()) {
            int idConsulta = Integer.valueOf(text);
            if (idCuentaConsulta.isSelected()) {
                tablaMovimientos.setModel(bbdd.consultaMovPorIdCuenta(idConsulta));
                estadoConexionLabel.setText("Consulta realizada");
            } else if (idMovsConsulta.isSelected()) {
                tablaMovimientos.setModel(bbdd.consultaMovPorId(idConsulta));
                estadoConexionLabel.setText("Consulta realizada");
            }
        } else {
            estadoConexionLabel.setText("Rellena campos");
        }
    }//GEN-LAST:event_consultaMovsButtonActionPerformed

    // Boton Consulta Cuenta
    private void consultaCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaCuentaButtonActionPerformed
        // TODO add your handling code here:
        String text = cuentaConsultaText.getText();
        if (!text.isEmpty()) {
            if (idCuentaCuenta.isSelected()) {
                tablaCuentas.setModel(bbdd.consultaCuentaPorId(text));
                estadoConexionLabel.setText("Consulta realizada");
            } else if (sucursalCuenta.isSelected()) {
                tablaCuentas.setModel(bbdd.consultaCuentaPorSucursal(text));
                estadoConexionLabel.setText("Consulta realizada");
            }
        } else {
            estadoConexionLabel.setText("Rellena campos");
        }
    }//GEN-LAST:event_consultaCuentaButtonActionPerformed

    // Boton añadir cuenta
    private void addCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCuentaButtonActionPerformed
        String numero_cuenta = nCuentaText.getText();
        String dni_cuenta = comoBoxCuentasDNI.getSelectedItem().toString();
        String id_sucursal = comboBoxIdSucursales.getSelectedItem().toString();
        if (!numero_cuenta.isEmpty()){
            int res = bbdd.insertarCuenta(numero_cuenta, dni_cuenta, id_sucursal);
            if (res==0){
                estadoConexionLabel.setText("Se ha insertado bien");
            }else{
                estadoConexionLabel.setText("Error");
            }
        }else{
            estadoConexionLabel.setText("Rellena campos");
        }
    }//GEN-LAST:event_addCuentaButtonActionPerformed

    // Boton añadir sucursal
    private void addSucursalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSucursalButtonActionPerformed
        // TODO add your handling code here:
        String direccion = direccionText.getText();
        if (!direccion.isEmpty()){
            int res = bbdd.insertarSucursal(direccion);
            if (res==0){
                estadoConexionLabel.setText("Se ha insertado bien");
            }else{
                estadoConexionLabel.setText("Error");
            }
        }else{
            estadoConexionLabel.setText("Rellena campos");
        }
    }//GEN-LAST:event_addSucursalButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClienteButton;
    private javax.swing.JButton addCuentaButton;
    private javax.swing.JButton addMovimientoButton;
    private javax.swing.JButton addSucursalButton;
    private javax.swing.JTextField annoClientText;
    private javax.swing.JTextField apellidosClientText;
    private javax.swing.JRadioButton apellidosModifCliente;
    private javax.swing.ButtonGroup buttonGroupClientesConsultas;
    private javax.swing.ButtonGroup buttonGroupClientesModif;
    private javax.swing.ButtonGroup buttonGroupCuentas;
    private javax.swing.JSpinner cantidadMovText;
    private javax.swing.JScrollPane clientesPane;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JComboBox<String> comboBoxIdSucursales;
    private javax.swing.JComboBox<String> comboBoxMovsId;
    private javax.swing.JComboBox<String> comoBoxCuentasDNI;
    private javax.swing.JButton conexionButton;
    private javax.swing.JButton consultaClienteButton;
    private javax.swing.JTextField consultaClienteText;
    private javax.swing.JButton consultaCuentaButton;
    private javax.swing.JButton consultaMovsButton;
    private javax.swing.JTextField consultaMovsText;
    private javax.swing.ButtonGroup consultasMovs;
    private javax.swing.JTextField cuentaConsultaText;
    private javax.swing.JPanel cuentasPanel;
    private javax.swing.JTextField diaClienteText;
    private javax.swing.JTextField direccionText;
    private javax.swing.JTextField dniClientText;
    private javax.swing.JComboBox<String> dniClientesBorrar;
    private javax.swing.JComboBox<String> dniClientesModif;
    private javax.swing.JRadioButton dniConsultaRB;
    private javax.swing.JButton eliminarClienteButton;
    private javax.swing.JLabel estadoConexionLabel;
    private javax.swing.JRadioButton fNacimientoRB;
    private javax.swing.JTextField fechaMovText;
    private javax.swing.JRadioButton idCuentaConsulta;
    private javax.swing.JRadioButton idCuentaCuenta;
    private javax.swing.JRadioButton idMovsConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField mesClientText;
    private javax.swing.JTextField modifClienteText;
    private javax.swing.JButton modificarClienteButton;
    private javax.swing.JPanel movimientosPanel;
    private javax.swing.JTextField nCuentaText;
    private javax.swing.JTextField nombreClienteText;
    private javax.swing.JRadioButton nombreConsultaRB;
    private javax.swing.JRadioButton nombreModifRB;
    private javax.swing.JRadioButton sucursalCuenta;
    private javax.swing.JPanel sucursalesPanel;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaCuentas;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.JTable tablaSucursales;
    // End of variables declaration//GEN-END:variables
}
