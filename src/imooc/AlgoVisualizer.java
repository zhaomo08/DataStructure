package imooc;

import java.awt.*;

/**
 * @author jiacheng
 * @date 26/6/23 10:21 pm Monday
 * @description :
 */
public class AlgoVisualizer {

    private Circle[] circles;

    private AlgoFrame frame;

    public AlgoVisualizer(int sceneWidth,int sceneHeight,int N){
        // 初始化数据
        circles = new Circle[N];
        int R = 50;
        for (int i = 0; i < N; i++) {
            int x = (int) (Math.random()*(sceneWidth-2*R) +R);
            int y = (int) (Math.random()*(sceneHeight-2*R) +R);
            int vx = (int) (Math.random()*11) -5;
            int vy = (int) (Math.random()*11) -5;
            circles[i] = new Circle(x,y,R,vx,vy);
        }

        EventQueue.invokeLater(() ->{
             frame = new AlgoFrame("Welcome",sceneWidth,sceneHeight);

            new Thread(() ->{
               run();
            }).start();
        });
    }
    private void run(){
        while (true){
            // 绘制数据
            frame.render(circles);
            AlgoVisHelper.pause(20);

            //更新数据
            for (Circle circle : circles) {
                circle.move(0,0,frame.getCanvasWidth(),frame.getCanvasHeight());
            }
        }
    }

}
