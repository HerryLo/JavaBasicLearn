package com.liuheng.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class LoginFrame extends JFrame implements KeyListener, ActionListener {
    static ArrayList<User> userList = new ArrayList<>();

    static {
        userList.add(new User("lh", "123456"));
        userList.add(new User("zl", "123456"));
    }

    public LoginFrame() throws HeadlessException {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        // 用户名
        JLabel userJLabel = new JLabel(new ImageIcon("puzzlegame/image/login/用户名.png"));
        userJLabel.setBounds(100,120,47,17);
        this.getContentPane().add(userJLabel);
        JTextField JTextField = new JTextField();
        JTextField.setBounds(160,120,200, 23);
        this.getContentPane().add(JTextField);

        // 密码
        JLabel passwordJLabel = new JLabel(new ImageIcon("puzzlegame/image/login/密码.png"));
        passwordJLabel.setBounds(100,180,32,16);
        this.getContentPane().add(passwordJLabel);
        JPasswordField JPasswordField = new JPasswordField();
        JPasswordField.setBounds(160,180,200, 23);
        this.getContentPane().add(JPasswordField);

        // 验证码
        JLabel checkJLabel = new JLabel(new ImageIcon("puzzlegame/image/login/验证码.png"));
        checkJLabel.setBounds(100,240,56,21);
        this.getContentPane().add(checkJLabel);
        JTextField checkJTextField = new JTextField();
        checkJTextField.setBounds(160,240,100, 23);
        checkJTextField.setBounds(160,240,100, 23);
        this.getContentPane().add(checkJTextField);

        // 登录按钮
        JButton loginButton = new JButton(new ImageIcon("puzzlegame/image/login/登录按钮.png"));
        loginButton.setBounds(100,300,128,47);
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        this.getContentPane().add(loginButton);

        // 注册按钮
        JButton registerButton = new JButton(new ImageIcon("puzzlegame/image/login/注册按钮.png"));
        registerButton.setBounds(250,300,128,47);
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        this.getContentPane().add(registerButton);

        JLabel JLabel = new JLabel(new ImageIcon("puzzlegame/image/login/background.png"));
        JLabel.setBounds(0,0,470,390);
        this.getContentPane().add(JLabel);
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
        // 取消隐藏图层的默认样式
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
