package com.liuheng.ui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    public LoginFrame() throws HeadlessException {
        initJFrame();
    }

    private void initJFrame() {
        this.setSize(488,430);
        // 置顶
        this.setAlwaysOnTop(true);
        // 居中
        this.setLocationRelativeTo(null);
        // 关闭模式
        this.setDefaultCloseOperation(3);
        // 标题
        this.setTitle("拼图登录");

        this.setVisible(true);
    }
}
