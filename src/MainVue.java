import java.awt.Frame;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainVue implements GLEventListener {
	public float rq=0.0f, rq2=0.0f, rq3=0.0f;
	public static void main(String[] args) {
        GLProfile glp = GLProfile.getDefault();
        GLCapabilities caps = new GLCapabilities(glp);
        GLCanvas canvas = new GLCanvas(caps);

        Frame frame = new Frame("AWT Window Test");
        frame.setSize(400, 400);
        frame.add(canvas);
        frame.setVisible(true);
        
        // by default, an AWT Frame doesn't do anything when you click
        // the close button; this bit of code will terminate the program when
        // the window is asked to close
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        FPSAnimator fAnim = new FPSAnimator(canvas, 60);
        fAnim.start();
        
        canvas.addGLEventListener(new MainVue());
    }

	public void display(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();

		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
	    update();
	    render(drawable);
	    
	  
	    
	}
	
	private void update() {
	    // nothing to update yet
	}
	
	private void render(GLAutoDrawable drawable) {
	   
	    
//	    // draw a triangle filling the window
//	    gl.glBegin(GL.GL_TRIANGLES);
//	    gl.glColor3f(1, 0, 0);
//	    gl.glVertex2f(-1, -1);
//	    gl.glColor3f(0, 1, 0);
//	    gl.glVertex2f(0, 1);
//	    gl.glColor3f(0, 0, 1);
//	    gl.glVertex2f(1, -1);
//	    gl.glEnd();
		GL2 gl = drawable.getGL().getGL2();
		
		 gl.glLoadIdentity();
	    gl.glRotatef((float)rq, 0.0f, 1.0f, 0.0f);
	    gl.glBegin(GL2.GL_QUADS);
	    //front
	    gl.glColor3f(0, 1, 2); gl.glVertex3d(0.0f, 0.0f, 0.0f);gl.glColor3f(1, 0, 1);gl.glVertex3d(-0.5f, 0f, 0f);
	    gl.glColor3f(1, 0, 1);gl.glVertex3d(-0.5f, -0.5f, 0.0f);gl.glColor3f(1, 0, 1);gl.glVertex3d(0f, -0.5f, 0f);
	    gl.glEnd();
	   
	    //back
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(1, 0, 0);gl.glVertex3d(0f, 0f, -0.5f);gl.glColor3f(1, 0, 0);gl.glVertex3d(-0.5f, 0f, -0.5f);
	    gl.glColor3f(1, 0, 0);gl.glVertex3d(-0.5f, -0.5f, -0.5f);gl.glColor3f(1, 0, 0);gl.glVertex3d(0f, -0.5f, -0.5f);
	    gl.glEnd();
	    
	    //right
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(0, 0, 1);gl.glVertex3d(0f, 0f, 0f);gl.glColor3f(0, 0, 1);gl.glVertex3d(0f, 0f, -0.5f);
	    gl.glColor3f(0, 0, 1);gl.glVertex3d(0f, -0.5f, -0.5f);gl.glColor3f(0, 0, 1);gl.glVertex3d(0f, -0.5f, 0f);
	    gl.glEnd();
	    
	    //left
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(1, 1, 0);gl.glVertex3d(-0.5f, 0f, 0f);gl.glColor3f(1, 1, 0);gl.glVertex3d(-0.5f, 0f, -0.5f);
	    gl.glColor3f(1, 1, 0);gl.glVertex3d(-0.5f, -0.5f, -0.5f);gl.glColor3f(1, 1, 0);gl.glVertex3d(-0.5f, -0.5f, 0f);
	    gl.glEnd();
	    
	    //top
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(0, 1, 1);gl.glVertex3d(-0.5f, 0f, -0.5f);gl.glColor3f(0, 1, 1);gl.glVertex3d(0f, 0f, -0.5f);
	    gl.glColor3f(0, 1, 1);gl.glVertex3d(0f, 0f, 0f);gl.glColor3f(0, 1, 1);gl.glVertex3d(-0.5f, 0f, 0f);
	    gl.glEnd();
	    
	    //down
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(0, 1, 0);gl.glVertex3d(0f, -0.5f, 0f);gl.glColor3f(0, 1, 0);gl.glVertex3d(-0.5f, -0.5f, 0f);
	    gl.glColor3f(0, 1, 0);gl.glVertex3d(-0.5f, -0.5f, -0.5f);gl.glColor3f(0, 1, 0);gl.glVertex3d(0f, -0.5f, -0.5f);
	    gl.glEnd();
//	    gl.glFlush();
	    
	    //cube 2
	    gl.glLoadIdentity();
	   
	    gl.glRotatef((float)rq2, 0.1f, 0f, 0.0f);
	    	//front
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(0, 1, 2); gl.glVertex3d(0.25f, 0.25f, 0f);gl.glColor3f(1, 0, 1);gl.glVertex3d(0f, 0.25f, 0f);
	    gl.glColor3f(1, 0, 1);gl.glVertex3d(0f, 0.5f, 0f);gl.glColor3f(1, 0, 1);gl.glVertex3d(0.25f, 0.5f, 0f);
	    gl.glEnd();
	   
	   
	    //back
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(1, 0, 0);gl.glVertex3d(0.25f, 0.25f, 0.25f);gl.glColor3f(1, 0, 0);gl.glVertex3d(0f, 0.25f, 0.25f);
	    gl.glColor3f(1, 0, 0);gl.glVertex3d(0f, 0.5f, 0.25f);gl.glColor3f(1, 0, 0);gl.glVertex3d(0.25f, 0.5f, 0.25f);
	    gl.glEnd();
	    
	    	//right
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.25f, 0.25f);gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.25f, 0f);
	    gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.5f, 0f);gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.5f, 0.25f);
	    gl.glEnd();
	    
	    	//left
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(1, 1, 0);gl.glVertex3d(0f, 0.5f, 0f);gl.glColor3f(1, 1, 0);gl.glVertex3d(0f, 0.5f, 0.25f);
	    gl.glColor3f(1, 1, 0);gl.glVertex3d(0f, 0.25f, 0.25f);gl.glColor3f(1, 1, 0);gl.glVertex3d(0f, 0.25f, 0f);
	    gl.glEnd();
	    
	    	//top
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(0, 1, 1);gl.glVertex3d(0f, 0.5f, 0f);gl.glColor3f(0, 1, 1);gl.glVertex3d(0.25f, 0.5f, 0f);
	    gl.glColor3f(0, 1, 1);gl.glVertex3d(0.25f, 0.5f, 0.25f);gl.glColor3f(0, 1, 1);gl.glVertex3d(0f, 0.5f, 0.25f);
	    gl.glEnd();
	    
	    	//down
	    gl.glBegin(GL2.GL_QUADS);
	    gl.glColor3f(0, 1, 0);gl.glVertex3d(0f, 0.25f, 0f);gl.glColor3f(0, 1, 0);gl.glVertex3d(0.25f, 0.25f, 0f);
	    gl.glColor3f(0, 1, 0);gl.glVertex3d(0.25f, 0.25f, 0.25f);gl.glColor3f(0, 1, 0);gl.glVertex3d(0f, 0.25f, 0.25f);
	    gl.glEnd();
	    gl.glFlush();
	    
	    
	    //cube 3
	    gl.glLoadIdentity();
	    gl.glRotatef((float)rq3, 0f, 0f, 0.5f);
    	//front
    gl.glBegin(GL2.GL_QUADS);
    gl.glColor3f(0, 1, 2); gl.glVertex3d(0.25f, 0.75f, 0f);gl.glColor3f(1, 0, 1);gl.glVertex3d(0.125f, 0.75f, 0f);
    gl.glColor3f(1, 0, 1);gl.glVertex3d(0.125f, 0.625f, 0f);gl.glColor3f(1, 0, 1);gl.glVertex3d(0.25f, 0.625f, 0f);
    gl.glEnd();
   
   
    //back
    gl.glBegin(GL2.GL_QUADS);
    gl.glColor3f(1, 0, 0);gl.glVertex3d(0.25f, 0.75f, 0.125f);gl.glColor3f(1, 0, 0);gl.glVertex3d(0.125f, 0.75f, 0.125f);
    gl.glColor3f(1, 0, 0);gl.glVertex3d(0.125f, 0.625f, 0.125f);gl.glColor3f(1, 0, 0);gl.glVertex3d(0.25f, 0.625f, 0.125f);
    gl.glEnd();
    
    	//right
    gl.glBegin(GL2.GL_QUADS);
    gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.75f, 0.125f);gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.75f, 0f);
    gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.625f, 0f);gl.glColor3f(0, 0, 1);gl.glVertex3d(0.25f, 0.625f, 0.125f);
    gl.glEnd();
    
    	//left
    gl.glBegin(GL2.GL_QUADS);
    gl.glColor3f(1, 1, 0);gl.glVertex3d(0.125f, 0.75f, 0f);gl.glColor3f(1, 1, 0);gl.glVertex3d(0.125f, 0.75f, 0.125f);
    gl.glColor3f(1, 1, 0);gl.glVertex3d(0.125f, 0.625f, 0.125f);gl.glColor3f(1, 1, 0);gl.glVertex3d(0.125f, 0.625f, 0f);
    gl.glEnd();
    
    	//top
    gl.glBegin(GL2.GL_QUADS);
    gl.glColor3f(0, 1, 1);gl.glVertex3d(0.25f, 0.75f, 0f);gl.glColor3f(0, 1, 1);gl.glVertex3d(0.125f, 0.75f, 0f);
    gl.glColor3f(0, 1, 1);gl.glVertex3d(0.125f, 0.75f, 0.125f);gl.glColor3f(0, 1, 1);gl.glVertex3d(0.25f, 0.75f, 0.125f);
    gl.glEnd();
    
    	//down
    gl.glBegin(GL2.GL_QUADS);
    gl.glColor3f(0, 1, 0);gl.glVertex3d(0.25f, 0.625f, 0f);gl.glColor3f(0, 1, 0);gl.glVertex3d(0.125f, 0.625f, 0f);
    gl.glColor3f(0, 1, 0);gl.glVertex3d(0.125f, 0.625f, 0.125f);gl.glColor3f(0, 1, 0);gl.glVertex3d(0.25f, 0.625f, 0.125f);
    gl.glEnd();
    gl.glFlush();
    
    rq3 +=0.5f;
    rq2 -=0.4f;
    rq -=0.5f;
    
	}
	
	

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		final GL2 gl = drawable.getGL().getGL2();
		// TODO Auto-generated method stub
		gl.glShadeModel(GL2.GL_SMOOTH);
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		gl.glClearDepth(1.0f);
		gl.glEnable(GL2.GL_DEPTH_TEST);
		gl.glDepthFunc(GL2.GL_LEQUAL);
		gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST);
		
		
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int drawable1, int drawable2, int width, int height) {
		// TODO Auto-generated method stub
		GL2 gl = drawable.getGL().getGL2();
		gl.glViewport(0,0,width,height);
//		gl.glMatrixMode(gl.GL_PROJECTION);
		gl.glLoadIdentity();
		(new GLU()).gluPerspective(45.0f,(float)width/(float)height,1.0f,1000.0f);
		gl.glMatrixMode(gl.GL_MODELVIEW);
		gl.glLoadIdentity();
		
	}
}

