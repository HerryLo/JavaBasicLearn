package com.liuheng.ui;

import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame {
    public GameJFrame() throws HeadlessException {
        initJFrame();

        initJMenu();

        this.setVisible(true);
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
}
