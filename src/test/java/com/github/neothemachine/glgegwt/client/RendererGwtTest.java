package com.github.neothemachine.glgegwt.client;

import org.junit.Test;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.dom.client.CanvasElement;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * This test suite is non-functional.
 * 
 * HtmlUnit doesn't support JavaScript's typed arrays (Float32Array etc.) yet.
 * 
 * @author maik
 *
 */
public class RendererGwtTest extends GWTTestCase {

	private GLGECanvas canvas = null;
	
	@Override
	public String getModuleName() {
		return "com.github.neothemachine.glgegwt.GLGEGWT";
	}
	
	@Override
	protected void gwtSetUp() throws Exception {
		canvas = new GLGECanvas();
		RootPanel.get().add(canvas);
	}
	
	@Test
	public void testRenderer() {
		Scene scene = Scene.create();
		canvas.getRenderer().setScene(scene);
		
		scene.setBackgroundColor("rgba(0,0,0,0)");
		
		Camera cam = scene.getCamera();
		cam.setType(Camera.ORTHO);
		
		cam.setProjectionMatrix(GLGE.makeOrtho(0, 1000, 0, 1000, -10000, 10000));
		cam.setLoc(-100, -100, 0);
		
		Light light = Light.create();
		light.setType(Light.DIR);
		light.setAttenuation(0.1, 0, 0);
		scene.addChild(light);
		
		for (int x=0; x < 10; x++) {
			canvas.getRenderer().render();
		}
	}

}
