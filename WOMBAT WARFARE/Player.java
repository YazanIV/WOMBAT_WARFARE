import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{

    private int fallSpeed = 0;
    private int acceleration = 1;
    boolean isJumping=false;

    public void act() 
    {
        move();  //manage the motion horizontally
        drop();  //manage the motion vertically
    }    

    
    // If no block is beneath the Player, then drop
    public void drop(){
        if(isJumping==true) jump();
        else if(onGround()==false) {fall();}
        else standOn();
    }

    public boolean onGround(){
        Object t1=(Object)getOneObjectAtOffset(-getImage().getWidth()/2+5, getImage().getHeight()/2 , Object.class);
        Object t2=(Object)getOneObjectAtOffset(getImage().getWidth()/2-5, getImage().getHeight()/2 , Object.class);
        if(t1!=null||t2!=null) return true;
        else return false;
    }

    public void standOn(){
        Object t1=(Object)getOneObjectAtOffset(-getImage().getWidth()/2+5, getImage().getHeight()/2 , Object.class);
        Object t2=(Object)getOneObjectAtOffset(getImage().getWidth()/2-5, getImage().getHeight()/2 , Object.class);
        if(t1!=null)
            setLocation ( getX(), t1.getY()-t1.getImage().getHeight()/2-getImage().getHeight()/2+2);
        else if(t2!=null)
            setLocation ( getX(), t2.getY()-t2.getImage().getHeight()/2-getImage().getHeight()/2+2);

        fallSpeed=0;

        if (Greenfoot.isKeyDown("up")){
            fallSpeed = -15;
            isJumping=true;
        }
    }

    public void fall(){
        setLocation(getX(),getY() + fallSpeed);
        fallSpeed = fallSpeed + acceleration;
    }

    public void jump(){

        setLocation(getX(),getY() + fallSpeed);
        fallSpeed = fallSpeed + acceleration;

        if(fallSpeed>=0)
            isJumping=false;

        Object t1=(Object)getOneObjectAtOffset(-getImage().getWidth()/2+5 ,-getImage().getHeight()/2, Object.class);
        Object t2=(Object)getOneObjectAtOffset(getImage().getWidth()/2-5 ,-getImage().getHeight()/2, Object.class);
        if (t1!=null) {
            setLocation ( getX(), t1.getY() + t1.getImage().getHeight()/2+getImage().getHeight()/2+1);
            fallSpeed=0;
        }
        else if(t2!=null){
            setLocation ( getX(), t2.getY() + t2.getImage().getHeight()/2+getImage().getHeight()/2+1);
            fallSpeed=0;
        }
    }

    public void move(){

        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
            setImage("soldier2.png");   
        }
        Object t=(Object)getOneObjectAtOffset(-getImage().getWidth()/2 ,0, Object.class);
        if (t!=null) 
            setLocation ( t.getX()+t.getImage().getWidth()/2+getImage().getWidth()/2, getY() );
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
            setImage("soldier1.png"); 
        }
        t=(Object)getOneObjectAtOffset(getImage().getWidth()/2 ,0, Object.class);
        if (t!=null) 
            setLocation ( t.getX()-t.getImage().getWidth()/2-getImage().getWidth()/2, getY() );
    }
}
