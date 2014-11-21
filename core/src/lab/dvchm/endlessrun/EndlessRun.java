package lab.dvchm.endlessrun;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class EndlessRun extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Stage stage;
	int frame;
	Music musica;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		stage = new Stage();
		stage.addActor(new Bomba());
		stage.addActor(new Runner());
		stage.addActor(new Croc());
		stage.addActor(new Volador());
		stage.addActor(new Agua());
		
		musica = Gdx.audio.newMusic(Gdx.files.internal("19 Hidden Track.mp3"));
		
		;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(255, 255, 255, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		musica.play();
		stage.draw();
		stage.act();
	
	}
	
}
