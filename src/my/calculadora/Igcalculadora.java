/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.calculadora;

/**
 *
 * @author Daniel Meneses
 */
public class Igcalculadora extends javax.swing.JFrame {

    calculadora objeto=new calculadora();
    boolean f=false ;
    int select=0;
    
    public Igcalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        texto = new javax.swing.JTextField();
        numero0 = new javax.swing.JButton();
        botonpunto = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        botonans = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        multiplicado = new javax.swing.JButton();
        dividido = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        borrartodo = new javax.swing.JButton();
        apagar = new javax.swing.JToggleButton();
        botontangente = new javax.swing.JButton();
        botoniva = new javax.swing.JButton();
        botonpotencia = new javax.swing.JButton();
        botonseno = new javax.swing.JButton();
        botoncoseno = new javax.swing.JButton();
        botonoraiz = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(75, 146, 140));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 51)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        texto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        texto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        numero0.setText("0\n");
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });

        botonpunto.setText(".");
        botonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpuntoActionPerformed(evt);
            }
        });

        jButton12.setText("x10");

        botonans.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonans.setText("ANS");
        botonans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonansActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });

        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });

        multiplicado.setText("X");
        multiplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicadoActionPerformed(evt);
            }
        });

        dividido.setText("/");
        dividido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divididoActionPerformed(evt);
            }
        });

        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });

        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });

        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });

        borrartodo.setText("AC");
        borrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrartodoActionPerformed(evt);
            }
        });

        apagar.setBackground(new java.awt.Color(255, 51, 51));
        apagar.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        apagar.setText("OFF");
        apagar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        botontangente.setBackground(new java.awt.Color(102, 102, 102));
        botontangente.setText("TAN");
        botontangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontangenteActionPerformed(evt);
            }
        });

        botoniva.setText("IVA");
        botoniva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonivaActionPerformed(evt);
            }
        });

        botonpotencia.setText("^");
        botonpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpotenciaActionPerformed(evt);
            }
        });

        botonseno.setBackground(new java.awt.Color(102, 102, 102));
        botonseno.setLabel("SIN");
        botonseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsenoActionPerformed(evt);
            }
        });

        botoncoseno.setBackground(new java.awt.Color(102, 102, 102));
        botoncoseno.setText("COS");
        botoncoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncosenoActionPerformed(evt);
            }
        });

        botonoraiz.setText("???");
        botonoraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonoraizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numero7)
                        .addGap(18, 18, 18)
                        .addComponent(numero8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multiplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dividido, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(numero0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonpunto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(numero1)
                                .addGap(6, 6, 6)))
                        .addGap(7, 7, 7)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numero4)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero6)
                            .addComponent(numero3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonans, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonseno)
                            .addComponent(botonoraiz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botoniva)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botoncoseno)
                                .addGap(18, 18, 18)
                                .addComponent(botontangente)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrartodo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonseno)
                    .addComponent(botoncoseno)
                    .addComponent(botontangente)
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonoraiz)
                    .addComponent(botonpotencia)
                    .addComponent(botoniva)
                    .addComponent(borrartodo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero7)
                    .addComponent(numero8)
                    .addComponent(numero9)
                    .addComponent(multiplicado)
                    .addComponent(dividido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero4)
                    .addComponent(numero5)
                    .addComponent(numero6)
                    .addComponent(mas)
                    .addComponent(menos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1)
                    .addComponent(numero2)
                    .addComponent(numero3)
                    .addComponent(botonans))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonpunto)
                    .addComponent(numero0)
                    .addComponent(jButton12)
                    .addComponent(igual))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
       
    }//GEN-LAST:event_textoActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        texto.setText(texto.getText()+"2");
        
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        texto.setText(texto.getText()+"5");
        
    }//GEN-LAST:event_numero5ActionPerformed

    private void borrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrartodoActionPerformed
        texto.setText("");
        objeto.dato1=0;
        objeto.dato2=0;
        f=false;
    }//GEN-LAST:event_borrartodoActionPerformed

    private void botonivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonivaActionPerformed
        f=true;
        select=10;
    }//GEN-LAST:event_botonivaActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        f=true;
        objeto.dato1=Float.parseFloat(texto.getText());
            //en esta linea se convierte el dato tipo string ingresado mediante los botones
            // a un dato de tipo float para poder realizar las operaciones
        texto.setText("+");
        select=1;
    }//GEN-LAST:event_masActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
      texto.setText(texto.getText()+"7");
      
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        texto.setText(texto.getText()+"1");
        //el gettext se usa para que no se sobreescriba un valor por encima de otro
        //sino que se pueda concatenar con el valor anterior
        if(f==false)
        {
            objeto.dato1=Float.parseFloat(texto.getText());
            //en esta linea se convierte el dato tipo string ingresado mediante los botones
            // a un dato de tipo float para poder realizar las operaciones
        }
        else
            objeto.dato2=1;
    }//GEN-LAST:event_numero1ActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        switch(select)
        {
            case 1:
                objeto.dato2=Float.parseFloat(texto.getText());
                texto.setText(String.valueOf(objeto.suma(objeto.dato1,objeto.dato2)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 2:
                objeto.dato2=Float.parseFloat(texto.getText());
                texto.setText(String.valueOf(objeto.resta(objeto.dato1,objeto.dato2)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 3:
                objeto.dato2=Float.parseFloat(texto.getText());
                texto.setText(String.valueOf(objeto.mult(objeto.dato1,objeto.dato2)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 4:
                objeto.dato2=Float.parseFloat(texto.getText());
               if(objeto.dato2!=0)
                {
                texto.setText(String.valueOf(objeto.div(objeto.dato1,objeto.dato2)));
                }
                else
                    texto.setText("MATH ERROR");
               objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 5:
                objeto.dato1=Float.parseFloat(texto.getText());
                texto.setText(String.valueOf(objeto.sin(objeto.dato1)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 6:  
                objeto.dato1=Float.parseFloat(texto.getText());
                texto.setText(String.valueOf(objeto.cos(objeto.dato1)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 7:
                objeto.dato1=Float.parseFloat(texto.getText());
                 if(objeto.dato1==90)
                {
                    texto.setText("INDETERMINATED");
                }
                else
                texto.setText(String.valueOf(objeto.tan(objeto.dato1)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 8:
                objeto.dato2=Float.parseFloat(texto.getText());
                texto.setText(String.valueOf(objeto.pot(objeto.dato1,objeto.dato2)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 9:
                objeto.dato2=Float.parseFloat(texto.getText());
                if(objeto.dato2>0)
                {
                texto.setText(String.valueOf(objeto.raiz(objeto.dato2,objeto.dato1)));
                }
                else
                    texto.setText("COMPLEX NUMBER");
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
            case 10:
                objeto.dato1=Float.parseFloat(texto.getText());
                texto.setText(String.valueOf(objeto.iva(objeto.dato1)));
                objeto.dato3=Float.parseFloat(texto.getText());
                break;
        }
        f=false;
    }//GEN-LAST:event_igualActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        texto.setText(texto.getText()+"3");
         
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        texto.setText(texto.getText()+"4");
         
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        texto.setText(texto.getText()+"6");
        
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        texto.setText(texto.getText()+"8");
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        texto.setText(texto.getText()+"9");
        
    }//GEN-LAST:event_numero9ActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_apagarActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        if(f==false)
        {
        f=true;
        objeto.dato1=Float.parseFloat(texto.getText());
        texto.setText("");
        select=2;
        }
        else
            texto.setText(texto.getText()+"-");
    }//GEN-LAST:event_menosActionPerformed

    private void multiplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicadoActionPerformed
        f=true;
        objeto.dato1=Float.parseFloat(texto.getText());
        texto.setText("");
        select=3;
    }//GEN-LAST:event_multiplicadoActionPerformed

    private void divididoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divididoActionPerformed
        f=true;
        objeto.dato1=Float.parseFloat(texto.getText());
        texto.setText("");
        select=4;
    }//GEN-LAST:event_divididoActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed
         texto.setText(texto.getText()+"0");
    }//GEN-LAST:event_numero0ActionPerformed

    private void botonansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonansActionPerformed
       texto.setText(String.valueOf(objeto.dato3));
       
    }//GEN-LAST:event_botonansActionPerformed

    private void botonoraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonoraizActionPerformed
       f=true;
       objeto.dato1=Float.parseFloat(texto.getText());
       texto.setText("");
        select=9;
    }//GEN-LAST:event_botonoraizActionPerformed

    private void botonpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpotenciaActionPerformed
        f=true;
        objeto.dato1=Float.parseFloat(texto.getText());
        texto.setText("");
        select=8;
    }//GEN-LAST:event_botonpotenciaActionPerformed

    private void botonsenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsenoActionPerformed
        f=true;
        select=5;
    }//GEN-LAST:event_botonsenoActionPerformed

    private void botoncosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncosenoActionPerformed
        f=true;
        select=6;
        //se asigna valor en el switchgit
    }//GEN-LAST:event_botoncosenoActionPerformed

    private void botontangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontangenteActionPerformed
        if(!"90".equals(texto.getText()))
        {
        f=true;
        select=7;
        }
        else
            texto.setText("INDETERMINATED");
    }//GEN-LAST:event_botontangenteActionPerformed

    private void botonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpuntoActionPerformed
        texto.setText(texto.getText()+".");
    }//GEN-LAST:event_botonpuntoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Igcalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Igcalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Igcalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Igcalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Igcalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton apagar;
    private javax.swing.JButton borrartodo;
    private javax.swing.JButton botonans;
    private javax.swing.JButton botoncoseno;
    private javax.swing.JButton botoniva;
    private javax.swing.JButton botonoraiz;
    private javax.swing.JButton botonpotencia;
    private javax.swing.JButton botonpunto;
    private javax.swing.JButton botonseno;
    private javax.swing.JButton botontangente;
    private javax.swing.JButton dividido;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton12;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton multiplicado;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
