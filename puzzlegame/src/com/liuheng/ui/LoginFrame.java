package com.liuheng.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginFrame extends JFrame implements MouseListener {
    static ArrayList<User> userList = new ArrayList<>();

    static {
        userList.add(new User("lh", "123456"));
        userList.add(new User("zl", "123456"));
    }

    JButton registerButton = new JButton(new ImageIcon("puzzlegame/image/login/注册按钮.png"));
    JButton loginButton = new JButton(new ImageIcon("puzzlegame/image/login/登录按钮.png"));
    JTextField JTextField = new JTextField();
    JPasswordField JPasswordField = new JPasswordField();
    JTextField checkJTextField = new JTextField();
    JLabel checkNumberJLabel = new JLabel();

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
        
        JTextField.setBounds(160,120,200, 23);
        this.getContentPane().add(JTextField);

        // 密码
        JLabel passwordJLabel = new JLabel(new ImageIcon("puzzlegame/image/login/密码.png"));
        passwordJLabel.setBounds(100,180,32,16);
        this.getContentPane().add(passwordJLabel);
        
        JPasswordField.setBounds(160,180,200, 23);
        this.getContentPane().add(JPasswordField);

        // 验证码输入框
        JLabel checkJLabel = new JLabel(new ImageIcon("puzzlegame/image/login/验证码.png"));
        checkJLabel.setBounds(100,240,56,21);
        this.getContentPane().add(checkJLabel);
        checkJTextField.setBounds(160,240,100, 23);
        this.getContentPane().add(checkJTextField);

        //验证码code
        String code = CodeUtil.getCode();
        checkNumberJLabel.setText(code);
        checkNumberJLabel.setBounds(270,240,50, 23);
        this.getContentPane().add(checkNumberJLabel);

        // 登录按钮
        loginButton.setBounds(100,300,128,47);
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        this.getContentPane().add(loginButton);

        // 注册按钮
        registerButton.setBounds(250,300,128,47);
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        this.getContentPane().add(registerButton);

        JLabel JLabel = new JLabel(new ImageIcon("puzzlegame/image/login/background.png"));
        JLabel.setBounds(0,0,470,390);
        this.getContentPane().add(JLabel);

        loginButton.addMouseListener(this);
        registerButton.addMouseListener(this);
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
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if(obj == loginButton) {
            //System.out.println("鼠标单击");
            loginButton.setIcon(new ImageIcon("puzzlegame/image/login/登录按钮.png"));

            String username = JTextField.getText();
            String password = new String(JPasswordField.getPassword());
            String checknumber = checkJTextField.getText();
            String code = checkNumberJLabel.getText();
            checkLoginInfo(username, password,checknumber, code);
            //System.out.println(username+","+password+","+checknumber+","+code);
        }
    }

    private void checkLoginInfo(String username, String password, String checknumber, String code) {
        System.out.println(password);
        if(!code.equals(checknumber)){
            System.out.println("验证码错误");
            showJDialog("验证码错误");
            return;
        }

        if( username.isEmpty() || password.isEmpty()) {
            System.out.println("用户名或密码不能为空");
            showJDialog("用户名或密码不能为空");
            return;
        }

        User current = null;
        for (int i = 0; i < userList.size(); i++) {
            String userItem = userList.get(i).getName();
            String passItem = userList.get(i).getPassword();
            if(username.equals(userItem) && password.equals(passItem)) {
                current = userList.get(i);
            }
        }
        if(current == null){
            System.out.println("用户名或密码错误");
            showJDialog("用户名或密码错误");
            return;
        }else {
            System.out.println("登录成功");
            this.setVisible(false);
            new GameJFrame();
        }
    }

    private void showJDialog(String cotent) {
        JDialog JDialog = new JDialog();
        JDialog.setSize(200,150);
        JDialog.setAlwaysOnTop(true);
        JDialog.setLocationRelativeTo(null);
        JDialog.setModal(true);

        JLabel warn = new JLabel(cotent);
        warn.setBounds(0,0,200,150);
        JDialog.getContentPane().add(warn);
        JDialog.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object obj = e.getSource();
        if(obj == loginButton) {
            //System.out.println("鼠标按下登录按钮");
            loginButton.setIcon(new ImageIcon("puzzlegame/image/login/登录按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
