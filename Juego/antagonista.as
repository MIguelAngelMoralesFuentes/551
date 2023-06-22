package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.utils.Timer; //timer para el tiempo de movimiento en milesimas
	import flash.events.TimerEvent;
	
	
	public class antagonista extends MovieClip {
		private var vel: Number=10; //velocidad de 10
		private var limite_der: int=520;  //limite del antagonista en el escenario
		private var limite_izq: int=30; 
		private var dir: Number=1; 
		private var cambia: Timer = new Timer(200,0);//inicializa el timer a 200
		private var tipos: Number; 
		
		private var lanzar: Timer= new Timer (2000,0);//bala

		public function antagonista() {
			// constructor code
			addEventListener(Event.ENTER_FRAME, actualiza);
			cambia.addEventListener(TimerEvent.TIMER, cambio_dir);//cambia dirrecion del antagonista
			cambia.start();
			lanzar.addEventListener(TimerEvent.TIMER, lanza_bala);//tiempo de lanzar bala
			lanzar.start(); 
			
		}
		public function lanza_bala( TimerEvent){
			
			//trace("lanza bala");
			var bala_nueva = new bala(x,y);
			stage.addChild(bala_nueva); 
			
		}
		public function cambio_dir(e: TimerEvent){
			tipos=Math.floor(Math.random()*8);
			//trace(tipos ); 
			switch(tipos) {
				case 1: 
				dir=1; 
				break; 
				case 2: 
				dir=-1; 
				break; 
			}
		}
		
	public function actualiza (e: Event){
		x+=vel * dir; 
		if(x>=limite_der){ //regresa al antagonista a una posicion
			dir=-1;
		}
		if(x<=limite_izq){
			dir=1;
		}
	}
			public function masvel (e:Event){
		if(setup.puntos==5){
		vel=10;
		}else if(setup.puntos==10){//cada vez que la caja d puntos alcanze el numero asignado aumenta la velocidad del antagonista
			vel=15;
		}else if(setup.puntos==15){
			vel=20;
		}

	}
	
}
}