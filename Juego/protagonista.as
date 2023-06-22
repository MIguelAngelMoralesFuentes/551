package {
 import flash.display.MovieClip;
 import flash.events.Event;
 import flash.events.KeyboardEvent; //librerias 
 import flash.events.KeyboardEvent; //llamaado de teclas
	
 public class protagonista extends MovieClip{
  private var vel: int=15;//velocidad de movimiento
  private var der: Boolean = false;//cuando presiona la tecla se vuelve true
  private var izq: Boolean = false;
  private var limite_x_der: int =510;
  private var limite_x_izq: int =35;

  public function protagonista() {
   // constructor code
   addEventListener(Event.ENTER_FRAME, motor);
  }
  
    public function motor(e: Event){
  if( der ){
   x+= vel;
   if(x<=limite_x_der){
    x+=vel;            //movimiento
   }
  } else if( izq ){
   if(x>=limite_x_izq){
   x-= vel; 
  }
  }
  control();
 }
 public function control(){
  stage.addEventListener(KeyboardEvent.KEY_DOWN, key_down);
  stage.addEventListener(KeyboardEvent.KEY_UP, key_up);
 }
 public function key_down(e: KeyboardEvent): void{
  switch(e.keyCode){
   case 39:
   der = true;
   break;
   case 37: //activa el movimiento de teclas con el key event y activa los booleanos
   izq = true;
   break;
    }
 }
 public function key_up(e: KeyboardEvent): void{
  switch(e.keyCode){
   case 39:
   der = false;
   break;//desactiva el movimiento de teclas con el key event y activa los booleanos
   case 37:
   izq = false;
   break;
	
        }
	
         }
   }
   }