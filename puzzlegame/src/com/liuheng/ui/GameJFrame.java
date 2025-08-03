package com.liuheng.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    int[][] datas = new int[4][4];

    // 空白方块
    int x = 0;
    int y = 0;

    public GameJFrame() throws HeadlessException {
        initJFrame();

        initJMenu();

        intDatas();

        initImage();

        this.setVisible(true);
    }

    private void intDatas() {
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        for (int i = 0; i < tempArr.length; i++) {
            Random ra = new Random();
            int index = ra.nextInt(tempArr.length);
            int value0 = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = value0;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] == 0) {
                x = i/4;
                y = i%4;
            }else {
                datas[i/4][i%4] = tempArr[i];
            }

        }
    }

    private void initImage() {
        this.getContentPane().removeAll();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = datas[i][j];
                ImageIcon img = new ImageIcon("puzzlegame\\image\\animal\\animal3\\"+number+".jpg");
                JLabel Jlable = new JLabel(img);
                Jlable.setBounds(j*105+83, i*105+134, 105, 105);
                Jlable.setBorder(new BevelBorder(1));

                this.getContentPane().add(Jlable);
            }
        }

        JLabel Jlable1 = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        Jlable1.setBounds(40, 40, 508, 560);
        this.getContentPane().add(Jlable1);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        this.setSize(603,680);
        // 置顶
        this.setAlwaysOnTop(true);
        // 居中
        this.setLocationRelativeTo(null);
        // 关闭模式
        this.setDefaultCloseOperation(3);
        // 标题
        this.setTitle("拼图游戏");
        // 取消隐藏图层的默认样式
        this.setLayout(null);

        this.addKeyListener(this);
    }

    private void initJMenu() {
        JMenuBar JMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于");

        JMenuItem replayJMenuItem = new JMenuItem("重新游戏");
        JMenuItem reloginJMenuItem = new JMenuItem("重新登录");
        JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");
        JMenuItem accountJMenuItem = new JMenuItem("公众号");

        functionJMenu.add(replayJMenuItem);
        functionJMenu.add(reloginJMenuItem);
        functionJMenu.add(closeJMenuItem);

        aboutJMenu.add(accountJMenuItem);

        JMenuBar.add(functionJMenu);
        JMenuBar.add(aboutJMenu);

        this.setJMenuBar(JMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        System.out.print(code);
        if(code == 38) {
            if(x == 3) {
                return;
            }
            // 向上按键
            datas[x][y] = datas[x+1][y];
            datas[x+1][y] = 0;
            initImage();
            x++;
        }else if(code == 40) {
            if(x == 0) {
                return;
            }
            // 向下按键
            datas[x][y] = datas[x-1][y];
            datas[x-1][y] = 0;
            initImage();
            x--;
        }else if(code == 37) {
            if(y == 3) {
                return;
            }
            // 向左按键
            datas[x][y] = datas[x][y+1];
            datas[x][y+1] = 0;
            initImage();
            y++;
        }else if(code == 39) {
            if(y == 0) {
                return;
            }
            // 向右按键
            datas[x][y] = datas[x][y-1];
            datas[x][y-1] = 0;
            initImage();
            y--;
        }
    }
}
