package com.javabase01.object;

import java.util.Objects;
import java.util.Random;

public class Role {
    // 玩家姓名和血量,长相，性别
    private String name;
    private int blood;
    private String face;
    private String gender;

    // 男生长相描述数组
    private String[] maleAppearances = {
            "英俊潇洒",
            "阳光帅气",
            "硬朗挺拔",
            "成熟稳重",
            "温文尔雅",
            "高大威猛",
            "清秀俊朗",
            "粗犷豪放",
            "风度翩翩",
            "棱角分明"
    };

    // 女生长相描述数组
    private String[] femaleAppearances = {
            "美丽动人",
            "清秀可人",
            "温婉大方",
            "甜美可爱",
            "气质非凡",
            "明艳照人",
            "清纯秀丽",
            "妩媚动人",
            "端庄优雅",
            "娇俏可人"
    };

    // 攻击动作描述数组
    String[] ATTACK_DESCRIPTIONS = {
            // 初始试探性攻击
            "%s以「青蛇吐信」起手，剑尖轻颤直取对手手腕",
            "%s身形微转，右掌如刀劈向对方肩颈要害",
            "%s突然变招，化拳为爪，直取咽喉要穴",

            // 中等强度攻击
            "%s内力灌注剑身，一招「白虹贯日」直刺心窝",
            "%s连环三掌拍出，掌风呼啸，封住左右退路",
            "%s剑招突变，使出「暴雨梨花」剑法，剑影如雨点般笼罩对手",

            // 高强度杀招
            "%s凝聚十成功力，双掌赤红如血，使出「烈焰焚心掌」",
            "%s剑身嗡鸣，人剑合一化作一道寒光直射对手眉心",
            "%s突然近身，指如疾风点向周身三十六处大穴",
            "%s运起独门秘技「天罗地网式」，掌影漫天无处可避"
    };

    // 受伤状态描述数组
    String[] INJURY_DESCRIPTIONS = {
            // 轻微伤势
            "%s手腕被划破一道血痕，急忙撤招后退",
            "%s肩部中掌，踉跄两步立即调整姿态",
            "%s颈部被抓出三道血痕，险险避过致命一击",

            // 中等伤势
            "%s胸口被剑气所伤，衣衫破裂渗出血迹",
            "%s连中两掌，嘴角溢出一丝鲜血",
            "%s身上多处被剑锋划伤，动作明显迟缓",

            // 严重伤势
            "%s胸口中掌，皮肤焦黑一片，口吐鲜血",
            "%s眉心被剑气所伤，鲜血顺着鼻梁流下",
            "%s穴道被封，半边身子麻痹无法动弹",
            "%s全身要害同时中招，如断线风筝般倒飞出去"
    };

    public Role() {}

    public Role(String name, int blood, String gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public int getBlood() {
        return blood;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFace(String gender) {
        Random ra = new Random();
        if(Objects.equals(gender, "男")) {
            int index = ra.nextInt(maleAppearances.length);
            this.face = maleAppearances[index];
        }else if(Objects.equals(gender, "女")) {
            int index = ra.nextInt(femaleAppearances.length);
            this.face = femaleAppearances[index];
        }else {
            this.face = "丑陋无比";
        }
    }

    public String getFace() {
        return face;
    }

    public void attack(Role ro) {
        Random ra = new Random();


        // 伤害值随机0-20
        int blood = ro.getBlood();
        int hurtCount = ra.nextInt(20);
        blood = blood - hurtCount;
        blood = Math.max(blood, 0);
        ro.setBlood(blood);

        // 攻击描述
        int attackIndex = ra.nextInt(ATTACK_DESCRIPTIONS.length);
        System.out.printf(ATTACK_DESCRIPTIONS[attackIndex], this.name);
        System.out.println();

        // 受伤描述
        System.out.printf(INJURY_DESCRIPTIONS[attackIndex], ro.getName());
        System.out.println();
    }

    public void getRoleInfo() {
        System.out.println("姓名："+this.name);
        System.out.println("性别："+this.gender);
        System.out.println("血量："+this.blood);
        System.out.println("长相："+this.face);
    }
}
