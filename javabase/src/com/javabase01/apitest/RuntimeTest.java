package com.javabase01.apitest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RuntimeTest extends JFrame implements ActionListener {

    JButton JButton = new JButton("点一点，有大惊喜哦！");
    JButton JButton01 = new JButton("好了，不逗你啦！点这里");

    boolean flag = false;

    public RuntimeTest() {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();

        if(flag){
            JButton01.setBounds(150,100, 200, 40);
            this.getContentPane().add(JButton01);
            JButton01.addActionListener(this);
        }

        JButton.setBounds(150,200, 200, 40);
        this.getContentPane().add(JButton);
        JButton.addActionListener(this);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        this.setSize(500,500);

        this.setTitle("恶搞小伙伴");

        this.setLocationRelativeTo(null);

        // 关闭模式
        this.setDefaultCloseOperation(3);
        // 取消隐藏图层的默认样式
        this.setLayout(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == JButton) {
            showJDialog("哈哈，中计了吧！");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        }else if(obj == JButton01) {
            showJDialog("这次饶了你！");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
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
}
