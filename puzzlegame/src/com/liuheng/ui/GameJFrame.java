package com.liuheng.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;
import java.util.Random;
import java.util.StringJoiner;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] datas = new int[4][4];

    // 空白方块
    int x = 0;
    int y = 0;

    // 图片地址
    String path = "puzzlegame\\image\\animal\\animal3\\";

    int[][] wins = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0},
    };

    // 步数统计
    int step = 0;

    JMenuItem replayJMenuItem = new JMenuItem("重新游戏");
    JMenuItem reloginJMenuItem = new JMenuItem("重新登录");
    JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");
    JMenuItem accountJMenuItem = new JMenuItem("公众号");
    JMenuItem beautyJMenuItem = new JMenuItem("美女");
    JMenuItem animalJMenuItem = new JMenuItem("动物");
    JMenuItem sportJMenuItem = new JMenuItem("运动");

    final String AnimalType = "animal";
    final String GirlType = "girl";
    final String SportType = "sport";

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
                x = i / 4;
                y = i % 4;
            }
            datas[i/4][i%4] = tempArr[i];
        }
    }

    private void initImage() {
        this.getContentPane().removeAll();

        if(checkWin()) {
            ImageIcon img = new ImageIcon("puzzlegame/image/win.png");
            JLabel Jlable = new JLabel(img);
            Jlable.setBounds(203, 283, 197, 73);

            this.getContentPane().add(Jlable);
        }

        JLabel Jlablestep = new JLabel("步数："+step);
        Jlablestep.setBounds(50, 30, 100, 20);
        this.getContentPane().add(Jlablestep);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = datas[i][j];
                ImageIcon img = new ImageIcon(path+number+".jpg");
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
        JMenu changeJMenu = new JMenu("更换图片");

        changeJMenu.add(beautyJMenuItem);
        changeJMenu.add(animalJMenuItem);
        changeJMenu.add(sportJMenuItem);

        functionJMenu.add(replayJMenuItem);
        functionJMenu.add(reloginJMenuItem);
        functionJMenu.add(closeJMenuItem);
        functionJMenu.add(changeJMenu);

        aboutJMenu.add(accountJMenuItem);

        replayJMenuItem.addActionListener(this);
        reloginJMenuItem.addActionListener(this);
        closeJMenuItem.addActionListener(this);
        accountJMenuItem.addActionListener(this);
        beautyJMenuItem.addActionListener(this);
        animalJMenuItem.addActionListener(this);
        sportJMenuItem.addActionListener(this);

        JMenuBar.add(functionJMenu);
        JMenuBar.add(aboutJMenu);

        this.setJMenuBar(JMenuBar);
    }

    private boolean checkWin() {
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if(datas[i][j] != wins[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 长按不松
    @Override
    public void keyPressed(KeyEvent e) {
        if(checkWin()) {
            return;
        }

        int code = e.getKeyCode();
        //System.out.println(code);
        if(code == 65) {
            // 键盘A展示全图
            this.getContentPane().removeAll();

            ImageIcon img = new ImageIcon(path+"all.jpg");
            JLabel Jlable = new JLabel(img);
            Jlable.setBounds(83, 134, 420, 420);
            this.getContentPane().add(Jlable);

            JLabel Jlable1 = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            Jlable1.setBounds(40, 40, 508, 560);
            this.getContentPane().add(Jlable1);

            this.getContentPane().repaint();
        }
    }

    // 按下
    @Override
    public void keyReleased(KeyEvent e) {
        if(checkWin()) {
            return;
        }

        int code = e.getKeyCode();
        //System.out.println(code);
        if(code == 38) {
            if(x == 3) {
                return;
            }
            // 向上按键
            datas[x][y] = datas[x+1][y];
            datas[x+1][y] = 0;
            x++;
            step++;
            initImage();
        }else if(code == 40) {
            if(x == 0) {
                return;
            }
            // 向下按键
            datas[x][y] = datas[x-1][y];
            datas[x-1][y] = 0;
            x--;
            step++;
            initImage();
        }else if(code == 37) {
            if(y == 3) {
                return;
            }
            // 向左按键
            datas[x][y] = datas[x][y+1];
            datas[x][y+1] = 0;
            y++;
            step++;
            initImage();
        }else if(code == 39) {
            if(y == 0) {
                return;
            }
            // 向右按键
            datas[x][y] = datas[x][y-1];
            datas[x][y-1] = 0;
            y--;
            step++;
            initImage();
        }else if(code == 65) {
            initImage();
        }else if(code == 87){
            datas = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},
            };
            initImage();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayJMenuItem){
            System.out.println("重新游戏");
            reset();
        }else if(obj == reloginJMenuItem) {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginFrame();
        }else if(obj == closeJMenuItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }else if(obj == accountJMenuItem){
            System.out.println("公众号");
            JDialog JDialog = new JDialog();
            JLabel JLabel = new JLabel(new ImageIcon("puzzlegame/image/about.png"));
            JLabel.setBounds(0,0, 258,258);
            JDialog.getContentPane().add(JLabel);
            JDialog.setSize(344,344);
            JDialog.setAlwaysOnTop(true);
            JDialog.setLocationRelativeTo(null);
            JDialog.setModal(true);
            JDialog.setVisible(true);
        }else if(obj == beautyJMenuItem){
            int index = randomIndex(GirlType);
            path = "puzzlegame\\image\\"+GirlType+"\\"+GirlType+index+"\\";
            reset();
        }else if(obj == animalJMenuItem) {
            int index = randomIndex(AnimalType);
            path = "puzzlegame\\image\\"+AnimalType+"\\"+AnimalType+index+"\\";
            reset();
        }else if(obj == sportJMenuItem) {
            int index = randomIndex(SportType);
            path = "puzzlegame\\image\\"+SportType+"\\"+SportType+index+"\\";
            reset();
        }
    }

    private int randomIndex(String type) {
        Random ra = new Random();
        if(type == AnimalType){
            int index = ra.nextInt(8)+1;
            return index;
        } else if (type == GirlType) {
            int index = ra.nextInt(12)+1;
            return index;
        } else if(type == SportType) {
            int index = ra.nextInt(9)+1;
            return index;
        }
        return 1;
    }

    private void reset() {
        step = 0;
        intDatas();
        initImage();
    }
}
