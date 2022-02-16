package alvarez.carlos.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numero1: Int = 0

        // 0=ninguna  1=suma  2=resta  3=multiplicacion  4=division
        var oper: Int = 0

        val operaciones: TextView = findViewById(R.id.txtOperaciones)
        val teclado: TextView = findViewById(R.id.txtTeclado)
        val cero: Button = findViewById(R.id.btnCero)
        val uno: Button = findViewById(R.id.btnUno)
        val dos: Button = findViewById(R.id.btnDos)
        val tres: Button = findViewById(R.id.btnTres)
        val cuatro: Button = findViewById(R.id.btnCuatro)
        val cinco: Button = findViewById(R.id.btnCinco)
        val seis: Button = findViewById(R.id.btnSeis)
        val siete: Button = findViewById(R.id.btnSiete)
        val ocho: Button = findViewById(R.id.btnOcho)
        val nueve: Button = findViewById(R.id.btnNueve)
        val mas: Button = findViewById(R.id.btnMas)
        val menos: Button = findViewById(R.id.btnMenos)
        val por: Button = findViewById(R.id.btnMultiplicar)
        val entre: Button = findViewById(R.id.btnEntre)
        val igual: Button = findViewById(R.id.btnResultado)
        val borrar: Button = findViewById(R.id.btnBorrar)



        // Lee las entradas de los numeros presionados
        cero.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "0")
        }
        uno.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "1")
        }
        dos.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "2")
        }
        tres.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "3")
        }
        cuatro.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "4")
        }
        cinco.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "5")
        }
        seis.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "6")
        }
        siete.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "7")
        }
        ocho.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "8")
        }
        nueve.setOnClickListener(){
            teclado.setText(teclado.text.toString() + "9")
        }



        //Lee las entradas de las operaciones presionadas
        borrar.setOnClickListener(){
            operaciones.setText("")
            teclado.setText("")
            numero1 = 0
            oper = 0
        }
        mas.setOnClickListener(){
            if(operaciones.text.toString().equals("") && !teclado.text.toString().equals("")){
                operaciones.setText(teclado.text.toString())
                teclado.setText("")
                oper = 1
            }
            numero1 = operaciones.text.toString().toInt()
            operaciones.setText(operaciones.text.toString() + "+")
            oper = 1
        }
        menos.setOnClickListener(){
            if(operaciones.text.toString().equals("") && !teclado.text.toString().equals("")){
                operaciones.setText(teclado.text.toString())
                teclado.setText("")
                oper = 2
            }
            numero1 = operaciones.text.toString().toInt()
            operaciones.setText(operaciones.text.toString() + "-")
            oper = 2
        }
        por.setOnClickListener(){
            if(operaciones.text.toString().equals("") && !teclado.text.toString().equals("")){
                operaciones.setText(teclado.text.toString())
                teclado.setText("")
                oper = 3
            }
            numero1 = operaciones.text.toString().toInt()
            operaciones.setText(operaciones.text.toString() + "*")
            oper = 3
        }
        entre.setOnClickListener(){
            if(operaciones.text.toString().equals("") && !teclado.text.toString().equals("")){
                operaciones.setText(teclado.text.toString())
                teclado.setText("")
                oper = 4
            }
            numero1 = operaciones.text.toString().toInt()
            operaciones.setText(operaciones.text.toString() + "/")
            oper = 4
        }



        //Lee la entrada de la operacion Igual (para sacar el resultado)
        igual.setOnClickListener(){
            val numero2 = teclado.text.toString().toInt()
            var resp: Int = 0

            if(!(oper == 4 && numero2 == 0)){
                if(operaciones.text.toString().isNullOrEmpty() || operaciones.text.toString().equals("0")){
                    operaciones.setText(numero2.toString())
                    teclado.setText("")
                }else{
                    when(oper){
                        1 -> resp = numero1 + numero2
                        2 -> resp = numero1 - numero2
                        3 -> resp = numero1 * numero2
                        4 -> resp = numero1 / numero2
                    }

                    operaciones.setText(resp.toString())
                    teclado.setText("")
                }
            }
        }
    }

}