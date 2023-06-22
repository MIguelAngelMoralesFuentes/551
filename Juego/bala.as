package  {
	import flash.display.MovieClip;
	import flash.events.Event; 
	
	public class bala extends MovieClip{
		private var vel: Number=5; 

		public function bala(pos_x,pos_y) {
			// constructor code
			x = pos_x; 
			y = pos_y + 30;//posicion de vala
			this.addEventListener(Event.ENTER_FRAME, mover); 
		}
		
		
		public function mover(e: Event){
			y += vel;
			if(y>=385){
				vel=0; 
				this.removeEventListener(Event.ENTER_FRAME, mover); //quita la bañla de escena
				stage.removeChild(this); 
			}
			if(this.hitTestObject(setup.protagonista_new)){
				vel=0;			
				stage.removeChild(this);
				this.removeEventListener(Event.ENTER_FRAME, mover);//suma los puntos cuando el protagonista toca la bala
				setup.puntos+=1;
				//trace(setup.puntos);
				
				}
							
		}

	}
	
}
