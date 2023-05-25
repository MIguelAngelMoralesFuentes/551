package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		private var piso_new: PISO = new PISO();
	    private var protagonista_new: PROTAGONISTA = new PROTAGONISTA();
		private var antagonista_new: ANTAGONISTA = new  ANTAGONISTA();
		public function setup() {
			// constructor code
			//trace ("hola mundo");
			
			
			addChild (piso_new);
			addChild (protagonista_new);
			addChild (antagonista_new);
			
			
		    piso_new.y=370;
			piso_new.x=275;
			
			protagonista_new.y=296;
			protagonista_new.x=275;;
			
			antagonista_new.y=30;
			antagonista_new.x=275;;
			
		
		}
	}
	
}
