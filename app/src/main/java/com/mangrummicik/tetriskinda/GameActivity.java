package com.mangrummicik.tetriskinda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class GameActivity extends Activity {

    ImageView iv000, iv001, iv002, iv003, iv004, iv005, iv006, iv007, iv008, iv009;
    ImageView iv010, iv011, iv012, iv013, iv014, iv015, iv016, iv017, iv018, iv019;
    ImageView iv020, iv021, iv022, iv023, iv024, iv025, iv026, iv027, iv028, iv029;
    ImageView iv030, iv031, iv032, iv033, iv034, iv035, iv036, iv037, iv038, iv039;
    ImageView iv040, iv041, iv042, iv043, iv044, iv045, iv046, iv047, iv048, iv049;
    ImageView iv050, iv051, iv052, iv053, iv054, iv055, iv056, iv057, iv058, iv059;
    ImageView iv060, iv061, iv062, iv063, iv064, iv065, iv066, iv067, iv068, iv069;
    ImageView iv070, iv071, iv072, iv073, iv074, iv075, iv076, iv077, iv078, iv079;
    ImageView iv080, iv081, iv082, iv083, iv084, iv085, iv086, iv087, iv088, iv089;
    ImageView iv090, iv091, iv092, iv093, iv094, iv095, iv096, iv097, iv098, iv099;
    ImageView iv100, iv101, iv102, iv103, iv104, iv105, iv106, iv107, iv108, iv109;
    ImageView iv110, iv111, iv112, iv113, iv114, iv115, iv116, iv117, iv118, iv119;
    ImageView iv120, iv121, iv122, iv123, iv124, iv125, iv126, iv127, iv128, iv129;
    ImageView iv130, iv131, iv132, iv133, iv134, iv135, iv136, iv137, iv138, iv139;
    ImageView iv140, iv141, iv142, iv143, iv144, iv145, iv146, iv147, iv148, iv149;
    ImageView iv150, iv151, iv152, iv153, iv154, iv155, iv156, iv157, iv158, iv159;

    ImageButton leftIb, rightIb, downIb, rotateIb;

    int speed = 1000;
    int score = 0;
    int level = 1;
    int tiles;
    char brickStatus;
    boolean brickTile[][] = new boolean[10][16];
    boolean carryStatus[][] = new boolean[10][16];
    boolean displayShape[][] = new boolean[10][16];

    int blockColor;

    int blueBlock = R.drawable.blue;
    int redBlock = R.drawable.red;
    int yellowBlock = R.drawable.yellow;
    int grayBlock = R.drawable.gray;
    int brownBlock = R.drawable.brown;
    int greenBlock = R.drawable.green;
    int purpleBlock = R.drawable.purple;
    int blankBlock = R.drawable.blank;

    AtomicBoolean isRunning = new AtomicBoolean((false));
    AtomicBoolean isRunning1 = new AtomicBoolean((false));
    AtomicBoolean isRunning2 = new AtomicBoolean((false));
    AtomicBoolean isRunning3 = new AtomicBoolean((false));
    AtomicBoolean isRunning4 = new AtomicBoolean((false));

    public Handler myHandle = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            gameBoardRefresh();
        }
    };

    public Handler myHandle1 = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            gameBoardRefresh();
        }
    };

    public Handler myHandle2 = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            gameBoardRefresh();
        }
    };

    public Handler myHandle3 = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            gameBoardRefresh();
        }
    };

    public Handler myHandle4 = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            gameBoardRefresh();
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        iv000 = findViewById(R.id.imageView);
        iv001 = findViewById(R.id.imageView2);
        iv002 = findViewById(R.id.imageView3);
        iv003 = findViewById(R.id.imageView4);
        iv004 = findViewById(R.id.imageView5);
        iv005 = findViewById(R.id.imageView6);
        iv006 = findViewById(R.id.imageView7);
        iv007 = findViewById(R.id.imageView8);
        iv008 = findViewById(R.id.imageView9);
        iv009 = findViewById(R.id.imageView10);

        iv010 = findViewById(R.id.imageView11);
        iv011 = findViewById(R.id.imageView12);
        iv012 = findViewById(R.id.imageView13);
        iv013 = findViewById(R.id.imageView14);
        iv014 = findViewById(R.id.imageView15);
        iv015 = findViewById(R.id.imageView16);
        iv016 = findViewById(R.id.imageView17);
        iv017 = findViewById(R.id.imageView18);
        iv018 = findViewById(R.id.imageView19);
        iv019 = findViewById(R.id.imageView20);

        iv020 = findViewById(R.id.imageView21);
        iv021 = findViewById(R.id.imageView22);
        iv022 = findViewById(R.id.imageView23);
        iv023 = findViewById(R.id.imageView24);
        iv024 = findViewById(R.id.imageView25);
        iv025 = findViewById(R.id.imageView26);
        iv026 = findViewById(R.id.imageView27);
        iv027 = findViewById(R.id.imageView28);
        iv028 = findViewById(R.id.imageView29);
        iv029 = findViewById(R.id.imageView30);

        iv030 = findViewById(R.id.imageView31);
        iv031 = findViewById(R.id.imageView32);
        iv032 = findViewById(R.id.imageView33);
        iv033 = findViewById(R.id.imageView34);
        iv034 = findViewById(R.id.imageView35);
        iv035 = findViewById(R.id.imageView36);
        iv036 = findViewById(R.id.imageView37);
        iv037 = findViewById(R.id.imageView38);
        iv038 = findViewById(R.id.imageView39);
        iv039 = findViewById(R.id.imageView40);

        iv040 = findViewById(R.id.imageView41);
        iv041 = findViewById(R.id.imageView42);
        iv042 = findViewById(R.id.imageView43);
        iv043 = findViewById(R.id.imageView44);
        iv044 = findViewById(R.id.imageView45);
        iv045 = findViewById(R.id.imageView46);
        iv046 = findViewById(R.id.imageView47);
        iv047 = findViewById(R.id.imageView48);
        iv048 = findViewById(R.id.imageView49);
        iv049 = findViewById(R.id.imageView50);

        iv050 = findViewById(R.id.imageView51);
        iv051 = findViewById(R.id.imageView52);
        iv052 = findViewById(R.id.imageView53);
        iv053 = findViewById(R.id.imageView54);
        iv054 = findViewById(R.id.imageView55);
        iv055 = findViewById(R.id.imageView56);
        iv056 = findViewById(R.id.imageView57);
        iv057 = findViewById(R.id.imageView58);
        iv058 = findViewById(R.id.imageView59);
        iv059 = findViewById(R.id.imageView60);

        iv060 = findViewById(R.id.imageView61);
        iv061 = findViewById(R.id.imageView62);
        iv062 = findViewById(R.id.imageView63);
        iv063 = findViewById(R.id.imageView64);
        iv064 = findViewById(R.id.imageView65);
        iv065 = findViewById(R.id.imageView66);
        iv066 = findViewById(R.id.imageView67);
        iv067 = findViewById(R.id.imageView68);
        iv068 = findViewById(R.id.imageView69);
        iv069 = findViewById(R.id.imageView70);

        iv070 = findViewById(R.id.imageView71);
        iv071 = findViewById(R.id.imageView72);
        iv072 = findViewById(R.id.imageView73);
        iv073 = findViewById(R.id.imageView74);
        iv074 = findViewById(R.id.imageView75);
        iv075 = findViewById(R.id.imageView76);
        iv076 = findViewById(R.id.imageView77);
        iv077 = findViewById(R.id.imageView78);
        iv078 = findViewById(R.id.imageView79);
        iv079 = findViewById(R.id.imageView80);

        iv080 = findViewById(R.id.imageView81);
        iv081 = findViewById(R.id.imageView82);
        iv082 = findViewById(R.id.imageView83);
        iv083 = findViewById(R.id.imageView84);
        iv084 = findViewById(R.id.imageView85);
        iv085 = findViewById(R.id.imageView86);
        iv086 = findViewById(R.id.imageView87);
        iv087 = findViewById(R.id.imageView88);
        iv088 = findViewById(R.id.imageView89);
        iv089 = findViewById(R.id.imageView90);

        iv090 = findViewById(R.id.imageView91);
        iv091 = findViewById(R.id.imageView92);
        iv092 = findViewById(R.id.imageView93);
        iv093 = findViewById(R.id.imageView94);
        iv094 = findViewById(R.id.imageView95);
        iv095 = findViewById(R.id.imageView96);
        iv096 = findViewById(R.id.imageView97);
        iv097 = findViewById(R.id.imageView98);
        iv098 = findViewById(R.id.imageView99);
        iv099 = findViewById(R.id.imageView100);

        iv100 = findViewById(R.id.imageView101);
        iv101 = findViewById(R.id.imageView102);
        iv102 = findViewById(R.id.imageView103);
        iv103 = findViewById(R.id.imageView104);
        iv104 = findViewById(R.id.imageView105);
        iv105 = findViewById(R.id.imageView106);
        iv106 = findViewById(R.id.imageView107);
        iv107 = findViewById(R.id.imageView108);
        iv108 = findViewById(R.id.imageView109);
        iv109 = findViewById(R.id.imageView110);

        iv110 = findViewById(R.id.imageView111);
        iv111 = findViewById(R.id.imageView112);
        iv112 = findViewById(R.id.imageView113);
        iv113 = findViewById(R.id.imageView114);
        iv114 = findViewById(R.id.imageView115);
        iv115 = findViewById(R.id.imageView116);
        iv116 = findViewById(R.id.imageView117);
        iv117 = findViewById(R.id.imageView118);
        iv118 = findViewById(R.id.imageView119);
        iv119 = findViewById(R.id.imageView120);

        iv120 = findViewById(R.id.imageView121);
        iv121 = findViewById(R.id.imageView122);
        iv122 = findViewById(R.id.imageView123);
        iv123 = findViewById(R.id.imageView124);
        iv124 = findViewById(R.id.imageView125);
        iv125 = findViewById(R.id.imageView126);
        iv126 = findViewById(R.id.imageView127);
        iv127 = findViewById(R.id.imageView128);
        iv128 = findViewById(R.id.imageView129);
        iv129 = findViewById(R.id.imageView130);

        iv130 = findViewById(R.id.imageView131);
        iv131 = findViewById(R.id.imageView132);
        iv132 = findViewById(R.id.imageView133);
        iv133 = findViewById(R.id.imageView134);
        iv134 = findViewById(R.id.imageView135);
        iv135 = findViewById(R.id.imageView136);
        iv136 = findViewById(R.id.imageView137);
        iv137 = findViewById(R.id.imageView138);
        iv138 = findViewById(R.id.imageView139);
        iv139 = findViewById(R.id.imageView140);

        iv140 = findViewById(R.id.imageView141);
        iv141 = findViewById(R.id.imageView142);
        iv142 = findViewById(R.id.imageView143);
        iv143 = findViewById(R.id.imageView144);
        iv144 = findViewById(R.id.imageView145);
        iv145 = findViewById(R.id.imageView146);
        iv146 = findViewById(R.id.imageView147);
        iv147 = findViewById(R.id.imageView148);
        iv148 = findViewById(R.id.imageView149);
        iv149 = findViewById(R.id.imageView150);

        iv150 = findViewById(R.id.imageView151);
        iv151 = findViewById(R.id.imageView152);
        iv152 = findViewById(R.id.imageView153);
        iv153 = findViewById(R.id.imageView154);
        iv154 = findViewById(R.id.imageView155);
        iv155 = findViewById(R.id.imageView156);
        iv156 = findViewById(R.id.imageView157);
        iv157 = findViewById(R.id.imageView158);
        iv158 = findViewById(R.id.imageView159);
        iv159 = findViewById(R.id.imageView160);

        leftIb = findViewById(R.id.leftImageButton);
        downIb = findViewById(R.id.downImageButton);
        rotateIb = findViewById(R.id.rotateImageButton);
        rightIb = findViewById(R.id.rightImageButton);

        newBrick();
        gameUpdate();

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    SystemClock.sleep(speed);
                    Message msg = myHandle.obtainMessage();
                    msg.arg1 = 1;
                    myHandle.sendMessage(msg);
                    moveDown();
                }
            }
        });
        isRunning.set(true);
        th.start();

        leftIb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Thread th1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(1);
                        Message msg = myHandle1.obtainMessage();
                        msg.arg1 = 1;
                        myHandle.sendMessage(msg);
                        moveLeft();
                    }
                });
                isRunning1.set(true);
                th1.start();
            }
        });

        rightIb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Thread th2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(1);
                        Message msg = myHandle2.obtainMessage();
                        msg.arg1 = 1;
                        myHandle.sendMessage(msg);
                        moveRight();
                    }
                });
                isRunning2.set(true);
                th2.start();
            }
        });

        rotateIb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Thread th3 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(1);
                        Message msg = myHandle3.obtainMessage();
                        msg.arg1 = 1;
                        myHandle.sendMessage(msg);
                        rotateTiles();
                    }
                });
                isRunning3.set(true);
                th3.start();
            }
        });

        downIb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Thread th4 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SystemClock.sleep(1);
                        Message msg = myHandle4.obtainMessage();
                        msg.arg1 = 1;
                        myHandle.sendMessage(msg);
                        moveDown();
                    }
                });
                isRunning4.set(true);
                th4.start();

            }
        });
    }

    boolean moveLeft() {
        int i;
        int j;
        if (emptySpaceLeft()) {
            for (i = 0; i < 9; i++) {
                for (j = 0; j < 16; j++) {
                    brickTile[i][j] = brickTile[i + 1][j];
                }
            }
            for (j = 0; j < 16; j++) {
                brickTile[9][j] = false;
            }

            gameUpdate();
            return true;
        }
        return false;
    }

    boolean moveRight() {
        if (emptySpaceRight()) {
            int i;
            int j;
            for (i = 9; i > 0; i--) {
                for (j = 0; j < 16; j++) {
                    brickTile[i][j] = brickTile[i - 1][j];
                }
            }
            for (j = 0; j < 16; j++) {
                brickTile[0][j] = false;
            }
            gameUpdate();
            return true;
        }
        return false;
    }

    void gameUpdate() {
        int i;
        int j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 16; j++) {
                displayShape[i][j] = brickTile[i][j] | carryStatus[i][j];
            }
        }
    }

    void rotateTiles() {
        //if tiles is O tile, do not rotate
        if (tiles == 3) {
            return;
        }
        int xi = 0;
        int yi = 0;
        int i;
        int j;

        for (i = 9; i >= 0; i--) {
            for (j = 0; j < 16; j++) {
                if (brickTile[i][j]) {
                    xi = i;
                }
            }
        }

        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]) {
                    yi = i;
                }
            }
        }
        if (tiles == 0) {
            if (brickStatus == 0) {
                if (!emptySpaceLeft()) {
                    if (emptySpaceRight3()) {
                        if (!moveRight()) {
                            return;
                        }
                        xi++;
                    } else {
                        return;
                    }
                } else if (!emptySpaceRight()) {
                    if (emptySpaceLeft3()) {
                        if (!moveLeft()) {
                            return;
                        }
                        xi--;
                    } else {
                        return;
                    }
                } else if (!emptySpaceRight2()) {
                    if (emptySpaceLeft2()) {
                        if (!moveLeft()) {
                            return;
                        }
                        xi--;
                    } else {
                        return;
                    }
                }
                brickTile[xi][yi] = false;
                brickTile[xi][yi + 2] = false;
                brickTile[xi][yi + 3] = false;

                brickTile[xi - 1][yi + 1] = true;
                brickTile[xi + 1][yi + 1] = true;
                brickTile[xi + 2][yi + 1] = true;

                brickStatus = 1;
            } else {
                brickTile[xi][yi] = false;
                brickTile[xi + 2][yi] = false;
                brickTile[xi + 3][yi] = false;

                brickTile[xi + 1][yi - 1] = true;
                brickTile[xi + 1][yi + 1] = true;
                brickTile[xi + 1][yi + 2] = true;

                brickStatus = 0;
            }
        }

        xi++;
        yi++;
        if (tiles == 1) {
            if (brickStatus == 0) {
                brickTile[xi - 1][yi - 1] = false;
                brickTile[xi - 1][yi] = false;
                brickTile[xi + 1][yi] = false;

                brickTile[xi][yi - 1] = true;
                brickTile[xi + 1][yi - 1] = true;
                brickTile[xi][yi + 1] = true;

                brickStatus = 1;
            } else if (brickStatus == 1) {
                if (!emptySpaceLeft()) {
                    if (!moveRight()) {
                        return;
                    }
                    xi++;
                }
                xi--;

                brickTile[xi][yi - 1] = false;
                brickTile[xi + 1][yi - 1] = false;
                brickTile[xi][yi + 1] = false;

                brickTile[xi - 1][yi] = true;
                brickTile[xi + 1][yi] = true;
                brickTile[xi + 1][yi + 1] = true;

                brickStatus = 2;
            } else if (brickStatus == 2) {
                yi--;

                brickTile[xi - 1][yi] = false;
                brickTile[xi + 1][yi] = false;
                brickTile[xi + 1][yi + 1] = false;

                brickTile[xi][yi - 1] = true;
                brickTile[xi][yi + 1] = true;
                brickTile[xi - 1][yi + 1] = true;

                brickStatus = 3;
            } else {
                if (!emptySpaceRight()) {
                    if (!moveLeft()) {
                        return;
                    }
                    xi--;
                }
                brickTile[xi][yi - 1] = false;
                brickTile[xi][yi + 1] = false;
                brickTile[xi - 1][yi - 1] = false;

                brickTile[xi + 1][yi - 1] = true;
                brickTile[xi - 1][yi] = true;
                brickTile[xi + 1][yi] = true;

                brickStatus = 0;
            }
        }
        if (tiles == 2) {
            if (brickStatus == 0) {
                brickTile[xi + 1][yi - 1] = false;
                brickTile[xi - 1][yi] = false;
                brickTile[xi + 1][yi] = false;

                brickTile[xi][yi - 1] = true;
                brickTile[xi + 1][yi + 1] = true;
                brickTile[xi][yi + 1] = true;

                brickStatus = 1;
            } else if (brickStatus == 1) {
                if (!emptySpaceLeft()) {
                    if (!moveRight()) {
                        return;
                    }
                    xi++;
                }
                xi--;

                brickTile[xi][yi - 1] = false;
                brickTile[xi + 1][yi + 1] = false;
                brickTile[xi][yi + 1] = false;

                brickTile[xi - 1][yi] = true;
                brickTile[xi + 1][yi] = true;
                brickTile[xi - 1][yi + 1] = true;

                brickStatus = 2;
            } else if (brickStatus == 2) {
                yi--;

                brickTile[xi - 1][yi] = false;
                brickTile[xi + 1][yi] = false;
                brickTile[xi - 1][yi + 1] = false;

                brickTile[xi][yi - 1] = true;
                brickTile[xi][yi + 1] = true;
                brickTile[xi - 1][yi - 1] = true;

                brickStatus = 3;
            } else {
                if (!emptySpaceRight()) {
                    if (!moveLeft()) {
                        return;
                    }
                    xi--;
                }
                brickTile[xi][yi - 1]= false;
                brickTile[xi][yi + 1] = false;
                brickTile[xi - 1][yi - 1] = false;

                brickTile[xi + 1][yi - 1] = true;
                brickTile[xi - 1][yi] = true;
                brickTile[xi + 1][yi] = true;

                brickStatus = 0;
            }
        }
        if (tiles == 4) {
            if (brickStatus == 0) {
                brickTile[xi + 1][yi - 1] = false;
                brickTile[xi - 1][yi] = false;

                brickTile[xi + 1][yi] = true;
                brickTile[xi + 1][yi + 1] = true;

                brickStatus = 1;
            } else {
                if (!emptySpaceLeft()) {
                    if (!moveRight()) {
                        return;
                    }
                    xi++;
                }
                xi--;

                brickTile[xi + 1][yi] = false;
                brickTile[xi + 1][yi + 1] = false;

                brickTile[xi - 1][yi] = true;
                brickTile[xi + 1][yi + 1] = true;

                brickStatus = 0;
            }
        }
        if (tiles == 5) {
            if (brickStatus == 0) {
                brickTile[xi][yi - 1] = false;
                brickTile[xi - 1][yi] = false;
                brickTile[xi + 1][yi] = false;

                brickTile[xi][yi - 1] = true;
                brickTile[xi + 1][yi] = true;
                brickTile[xi][yi + 1] = true;

                brickStatus = 1;
            } else if (brickStatus == 1) {
                if (!emptySpaceLeft()) {
                    if (!moveRight()) {
                        return;
                    }
                    xi++;
                }
                xi--;

                brickTile[xi][yi - 1] = false;
                brickTile[xi + 1][yi] = false;
                brickTile[xi][yi + 1] = false;

                brickTile[xi - 1][yi] = true;
                brickTile[xi + 1][yi] = true;
                brickTile[xi][yi + 1] = true;

                brickStatus = 2;
            } else if (brickStatus == 2) {
                yi--;

                brickTile[xi - 1][yi] = false;
                brickTile[xi + 1][yi] = false;
                brickTile[xi][yi + 1] = false;

                brickTile[xi][yi - 1] = true;
                brickTile[xi - 1][yi] = true;
                brickTile[xi][yi + 1] = true;

                brickStatus = 3;
            } else {
                if (!emptySpaceRight()) {
                    if (!moveLeft()) {
                        return;
                    }
                    xi--;
                }
                brickTile[xi][yi - 1] = false;
                brickTile[xi - 1][yi] = false;
                brickTile[xi][yi + 1] = false;

                brickTile[xi][yi - 1] = true;
                brickTile[xi - 1][yi] = true;
                brickTile[xi + 1][yi] = true;

                brickStatus = 0;
            }
        }
        if (tiles == 6) {
            if (brickStatus == 0) {
                brickTile[xi -1][yi -1] = false;
                brickTile[xi][yi - 1] = false;

                brickTile[xi + 1][yi -1] = true;
                brickTile[xi][yi + 1] = true;

                brickStatus = 1;
            } else {
                if (!emptySpaceLeft()) {
                    if (!moveRight()) {
                        return;
                    }
                    xi++;
                }
                xi--;

                brickTile[xi + 1][yi - 1] = false;
                brickTile[xi][yi + 1] = false;

                brickTile[xi - 1][yi - 1] = true;
                brickTile[xi][yi - 1] = true;

                brickStatus = 0;
            }
        }
        while (!checkDuplicate()) {
            for (i = 0; i < 16; i++) {
                for (j = 0; j < 10; j++) {
                    brickTile[j][i] = brickTile[j][i + 1];
                }
            }
        }
        gameUpdate();
    }

    void moveDown() {
        if (emptySpaceBelow()) {
            int i;
            for (i = 15; i > 0; i--) {
                int j;
                for (j = 0; j < 10; j++) {
                    brickTile[j][i] = brickTile[j][i - 1];
                }
            }
            for (i = 0; i < 9; i++) {
                brickTile[i][0] = false;
            }
        }
        else {
            int i;
            int j;
            for (i = 0; i < 10; i++) {
                for (j = 0; j < 16; j++) {
                    if (brickTile[i][j]) {
                        carryStatus[i][j] = true;
                        brickTile[i][j] = false;
                    }
                }
            }
            newBrick();
        }
        gameUpdate();
    }

    boolean checkDuplicate() {
        int i;
        int j;
        for (i = 0; i < 16; i++) {
            for (j = 0; j < 9; j++) {
                if (brickTile[j][i]) {
                    if (carryStatus[j][i]) {
                        return false;
                    }
                }
            }
        }
        for (i = 14; i < 16; i++) {
            for (j = 0; j < 9; j++) {
                if (brickTile[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    void checkGameover() {
        int i;
        int j;
        int count;
        for (i = 15; i >= 0; i--) {
            count = 0;
            for (j = 0; j < 10; j++) {
                if (carryStatus[j][i]) {
                    count++;
                }
            }
            if (count == 10) {
                for (j = 0; j < 10; j++) {
                    carryStatus[j][i] = false;
                }
                gameUpdate();

                int k;
                for (k = i; k > 0; k--) {
                    for (j = 0; j < 10; j++) {
                        carryStatus[j][k] = carryStatus[j][k - 1];
                    }
                }
                for (j = 0; j < 10; j++) {
                    carryStatus[j][0] = false;
                }
                score += 10;

                if ((score == 100) || (score == 200) || (score == 300) || (score == 400) || (score == 500 || score == 600 || score == 700 || score == 800 || score == 900 || score == 1000)) {
                    level++;
                }
                gameUpdate();
                i++;
            }
        }
        for (i = 0; i < 10; i++) {
            if (carryStatus[i][0]) {
                gameover();
            }
        }
    }

    void gameover() {
        int x;
        int y;
        for (x = 0; x < 10; x++) {
            for (y = 0; y < 16; y++) {
                if (brickTile[x][y]) {
                    brickTile[x][y] = false;
                }
            }
        }
        for (x = 0; x < 10; x++) {
            for (y = 0; y < 16; y++) {
                carryStatus[x][y] = false;
                displayShape[x][y] = false;
            }
        }
        level = 1;
        score = 0;
        startActivity(new Intent(GameActivity.this, GameOver.class));
        GameActivity.this.finish();
    }
    void newBrick() {
        checkGameover();
        Random r = new Random();
        tiles = r.nextInt(6);
        if (tiles == 0) {
            // I
            blockColor = blueBlock;
            brickTile[3][0] = true;
            brickTile[3][1] = true;
            brickTile[3][2] = true;
            brickTile[3][3] = true;
        }
        if (tiles == 1) {
            // L reverse
            blockColor = brownBlock;
            brickTile[2][0] = true;
            brickTile[2][1] = true;
            brickTile[3][1] = true;
            brickTile[4][1] = true;
        }
        if (tiles == 2) {
            // L
            blockColor = grayBlock;
            brickTile[4][0] = true;
            brickTile[2][1] = true;
            brickTile[3][1] = true;
            brickTile[4][1] = true;
        }
        if (tiles == 3) {
            // O
            blockColor = yellowBlock;
            brickTile[3][0] = true;
            brickTile[3][1] = true;
            brickTile[4][0] = true;
            brickTile[4][1] = true;
        }
        if (tiles == 4) {
            // S
            blockColor = redBlock;
            brickTile[4][0] = true;
            brickTile[5][0] = true;
            brickTile[3][1] = true;
            brickTile[4][1] = true;
        }
        if (tiles == 5) {
            // T
            blockColor = purpleBlock;
            brickTile[4][0] = true;
            brickTile[3][1] = true;
            brickTile[4][1] = true;
            brickTile[5][1] = true;
        }
        if (tiles == 6) {
            // 2
            blockColor = greenBlock;
            brickTile[3][0] = true;
            brickTile[4][0] = true;
            brickTile[4][1] = true;
            brickTile[5][1] = true;
        }
        brickStatus = 0;
    }

    boolean emptySpaceBelow() {
        int i;
        int j;
        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]) {
                    if (i == 15) {
                        return false;
                    }
                    if (carryStatus[j][i + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean emptySpaceLeft2() {
        int i;
        int j;
        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]) {
                    if (j == 0 || j == 1) {
                        return false;
                    }
                    if (carryStatus[j - 1][i] || carryStatus[j - 2][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean emptySpaceLeft3() {
        int i;
        int j;
        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]){
                    if (j == 0 || j == 1 || j == 2) {
                        return false;
                    }
                    if (carryStatus[j -1][i] || carryStatus[j - 2][i] || carryStatus[j - 3][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean emptySpaceLeft() {
        int i;
        int j;
        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]) {
                    if ( j == 0) {
                        return false;
                    }
                    if (carryStatus[j -1][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean emptySpaceRight() {
        int i;
        int j;
        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]) {
                    if (j == 9) {
                        return false;
                    }
                    if (carryStatus[j + 1][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean emptySpaceRight3() {
        int i;
        int j;
        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]) {
                    if (j == 9 || j == 8 || j == 7) {
                        return false;
                    }
                    if (carryStatus[j + 1][i] || carryStatus[j + 2][i] || carryStatus[j + 3][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean emptySpaceRight2() {
        int i;
        int j;
        for (i = 15; i >= 0; i--) {
            for (j = 0; j < 10; j++) {
                if (brickTile[j][i]) {
                    if (j == 9 || j == 8) {
                        return false;
                    }
                    if ( carryStatus[j + 1][i] || carryStatus[j + 2][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    void gameBoardRefresh() {
        int col, row;
        for (col = 0; col < 10; col++) {
            for (row = 0; row < 16; row++) {
                if (displayShape[col][row]) {
                    occupiedTiles(row, col);
                } else {
                    blankTiles(row, col);
                }
            }
        }

        TextView levelTv = findViewById(R.id.levelTextView);
        levelTv.setText("Level:  " + level);

        TextView scoreTv = findViewById(R.id.scoreTextView);
        scoreTv.setText("Score: " + score);

        if (level == 2) {
            speed = 950;
        } else if (level == 3) {
            speed = 900;
        } else if (level == 4) {
            speed = 850;
        } else if (level == 5) {
            speed = 800;
        } else if (level == 6) {
            speed = 750;
        } else if (level == 7) {
            speed = 700;
        } else if (level == 8) {
            speed = 650;
        } else if (level == 9) {
            speed = 600;
        } else if (level == 10) {
            speed = 550;
        }
    }

    void occupiedTiles(int row, int col) {

        if ((row == 0) && (col == 0)) {iv000.setImageResource(blockColor);}
        else if ((row == 0) && (col == 1)) {iv001.setImageResource(blockColor);}
        else if ((row == 0) && (col == 2)) {iv002.setImageResource(blockColor);}
        else if ((row == 0) && (col == 3)) {iv003.setImageResource(blockColor);}
        else if ((row == 0) && (col == 4)) {iv004.setImageResource(blockColor);}
        else if ((row == 0) && (col == 5)) {iv005.setImageResource(blockColor);}
        else if ((row == 0) && (col == 6)) {iv006.setImageResource(blockColor);}
        else if ((row == 0) && (col == 7)) {iv007.setImageResource(blockColor);}
        else if ((row == 0) && (col == 8)) {iv008.setImageResource(blockColor);}
        else if ((row == 0) && (col == 9)) {iv009.setImageResource(blockColor);}

        else if ((row == 1) && (col == 0)) {iv010.setImageResource(blockColor);}
        else if ((row == 1) && (col == 1)) {iv011.setImageResource(blockColor);}
        else if ((row == 1) && (col == 2)) {iv012.setImageResource(blockColor);}
        else if ((row == 1) && (col == 3)) {iv013.setImageResource(blockColor);}
        else if ((row == 1) && (col == 4)) {iv014.setImageResource(blockColor);}
        else if ((row == 1) && (col == 5)) {iv015.setImageResource(blockColor);}
        else if ((row == 1) && (col == 6)) {iv016.setImageResource(blockColor);}
        else if ((row == 1) && (col == 7)) {iv017.setImageResource(blockColor);}
        else if ((row == 1) && (col == 8)) {iv018.setImageResource(blockColor);}
        else if ((row == 1) && (col == 9)) {iv019.setImageResource(blockColor);}

        else if ((row == 2) && (col == 0)) {iv020.setImageResource(blockColor);}
        else if ((row == 2) && (col == 1)) {iv021.setImageResource(blockColor);}
        else if ((row == 2) && (col == 2)) {iv022.setImageResource(blockColor);}
        else if ((row == 2) && (col == 3)) {iv023.setImageResource(blockColor);}
        else if ((row == 2) && (col == 4)) {iv024.setImageResource(blockColor);}
        else if ((row == 2) && (col == 5)) {iv025.setImageResource(blockColor);}
        else if ((row == 2) && (col == 6)) {iv026.setImageResource(blockColor);}
        else if ((row == 2) && (col == 7)) {iv027.setImageResource(blockColor);}
        else if ((row == 2) && (col == 8)) {iv028.setImageResource(blockColor);}
        else if ((row == 2) && (col == 9)) {iv029.setImageResource(blockColor);}

        else if ((row == 3) && (col == 0)) {iv030.setImageResource(blockColor);}
        else if ((row == 3) && (col == 1)) {iv031.setImageResource(blockColor);}
        else if ((row == 3) && (col == 2)) {iv032.setImageResource(blockColor);}
        else if ((row == 3) && (col == 3)) {iv033.setImageResource(blockColor);}
        else if ((row == 3) && (col == 4)) {iv034.setImageResource(blockColor);}
        else if ((row == 3) && (col == 5)) {iv035.setImageResource(blockColor);}
        else if ((row == 3) && (col == 6)) {iv036.setImageResource(blockColor);}
        else if ((row == 3) && (col == 7)) {iv037.setImageResource(blockColor);}
        else if ((row == 3) && (col == 8)) {iv038.setImageResource(blockColor);}
        else if ((row == 3) && (col == 9)) {iv039.setImageResource(blockColor);}

        else if ((row == 4) && (col == 0)) {iv040.setImageResource(blockColor);}
        else if ((row == 4) && (col == 1)) {iv041.setImageResource(blockColor);}
        else if ((row == 4) && (col == 2)) {iv042.setImageResource(blockColor);}
        else if ((row == 4) && (col == 3)) {iv043.setImageResource(blockColor);}
        else if ((row == 4) && (col == 4)) {iv044.setImageResource(blockColor);}
        else if ((row == 4) && (col == 5)) {iv045.setImageResource(blockColor);}
        else if ((row == 4) && (col == 6)) {iv046.setImageResource(blockColor);}
        else if ((row == 4) && (col == 7)) {iv047.setImageResource(blockColor);}
        else if ((row == 4) && (col == 8)) {iv048.setImageResource(blockColor);}
        else if ((row == 4) && (col == 9)) {iv049.setImageResource(blockColor);}

        else if ((row == 5) && (col == 0)) {iv050.setImageResource(blockColor);}
        else if ((row == 5) && (col == 1)) {iv051.setImageResource(blockColor);}
        else if ((row == 5) && (col == 2)) {iv052.setImageResource(blockColor);}
        else if ((row == 5) && (col == 3)) {iv053.setImageResource(blockColor);}
        else if ((row == 5) && (col == 4)) {iv054.setImageResource(blockColor);}
        else if ((row == 5) && (col == 5)) {iv055.setImageResource(blockColor);}
        else if ((row == 5) && (col == 6)) {iv056.setImageResource(blockColor);}
        else if ((row == 5) && (col == 7)) {iv057.setImageResource(blockColor);}
        else if ((row == 5) && (col == 8)) {iv058.setImageResource(blockColor);}
        else if ((row == 5) && (col == 9)) {iv059.setImageResource(blockColor);}

        else if ((row == 6) && (col == 0)) {iv060.setImageResource(blockColor);}
        else if ((row == 6) && (col == 1)) {iv061.setImageResource(blockColor);}
        else if ((row == 6) && (col == 2)) {iv062.setImageResource(blockColor);}
        else if ((row == 6) && (col == 3)) {iv063.setImageResource(blockColor);}
        else if ((row == 6) && (col == 4)) {iv064.setImageResource(blockColor);}
        else if ((row == 6) && (col == 5)) {iv065.setImageResource(blockColor);}
        else if ((row == 6) && (col == 6)) {iv066.setImageResource(blockColor);}
        else if ((row == 6) && (col == 7)) {iv067.setImageResource(blockColor);}
        else if ((row == 6) && (col == 8)) {iv068.setImageResource(blockColor);}
        else if ((row == 6) && (col == 9)) {iv069.setImageResource(blockColor);}

        else if ((row == 7) && (col == 0)) {iv070.setImageResource(blockColor);}
        else if ((row == 7) && (col == 1)) {iv071.setImageResource(blockColor);}
        else if ((row == 7) && (col == 2)) {iv072.setImageResource(blockColor);}
        else if ((row == 7) && (col == 3)) {iv073.setImageResource(blockColor);}
        else if ((row == 7) && (col == 4)) {iv074.setImageResource(blockColor);}
        else if ((row == 7) && (col == 5)) {iv075.setImageResource(blockColor);}
        else if ((row == 7) && (col == 6)) {iv076.setImageResource(blockColor);}
        else if ((row == 7) && (col == 7)) {iv077.setImageResource(blockColor);}
        else if ((row == 7) && (col == 8)) {iv078.setImageResource(blockColor);}
        else if ((row == 7) && (col == 9)) {iv079.setImageResource(blockColor);}

        else if ((row == 8) && (col == 0)) {iv080.setImageResource(blockColor);}
        else if ((row == 8) && (col == 1)) {iv081.setImageResource(blockColor);}
        else if ((row == 8) && (col == 2)) {iv082.setImageResource(blockColor);}
        else if ((row == 8) && (col == 3)) {iv083.setImageResource(blockColor);}
        else if ((row == 8) && (col == 4)) {iv084.setImageResource(blockColor);}
        else if ((row == 8) && (col == 5)) {iv085.setImageResource(blockColor);}
        else if ((row == 8) && (col == 6)) {iv086.setImageResource(blockColor);}
        else if ((row == 8) && (col == 7)) {iv087.setImageResource(blockColor);}
        else if ((row == 8) && (col == 8)) {iv088.setImageResource(blockColor);}
        else if ((row == 8) && (col == 9)) {iv089.setImageResource(blockColor);}

        else if ((row == 9) && (col == 0)) {iv090.setImageResource(blockColor);}
        else if ((row == 9) && (col == 1)) {iv091.setImageResource(blockColor);}
        else if ((row == 9) && (col == 2)) {iv092.setImageResource(blockColor);}
        else if ((row == 9) && (col == 3)) {iv093.setImageResource(blockColor);}
        else if ((row == 9) && (col == 4)) {iv094.setImageResource(blockColor);}
        else if ((row == 9) && (col == 5)) {iv095.setImageResource(blockColor);}
        else if ((row == 9) && (col == 6)) {iv096.setImageResource(blockColor);}
        else if ((row == 9) && (col == 7)) {iv097.setImageResource(blockColor);}
        else if ((row == 9) && (col == 8)) {iv098.setImageResource(blockColor);}
        else if ((row == 9) && (col == 9)) {iv099.setImageResource(blockColor);}

        else if ((row == 10) && (col == 0)) {iv100.setImageResource(blockColor);}
        else if ((row == 10) && (col == 1)) {iv101.setImageResource(blockColor);}
        else if ((row == 10) && (col == 2)) {iv102.setImageResource(blockColor);}
        else if ((row == 10) && (col == 3)) {iv103.setImageResource(blockColor);}
        else if ((row == 10) && (col == 4)) {iv104.setImageResource(blockColor);}
        else if ((row == 10) && (col == 5)) {iv105.setImageResource(blockColor);}
        else if ((row == 10) && (col == 6)) {iv106.setImageResource(blockColor);}
        else if ((row == 10) && (col == 7)) {iv107.setImageResource(blockColor);}
        else if ((row == 10) && (col == 8)) {iv108.setImageResource(blockColor);}
        else if ((row == 10) && (col == 9)) {iv109.setImageResource(blockColor);}

        else if ((row == 11) && (col == 0)) {iv110.setImageResource(blockColor);}
        else if ((row == 11) && (col == 1)) {iv111.setImageResource(blockColor);}
        else if ((row == 11) && (col == 2)) {iv112.setImageResource(blockColor);}
        else if ((row == 11) && (col == 3)) {iv113.setImageResource(blockColor);}
        else if ((row == 11) && (col == 4)) {iv114.setImageResource(blockColor);}
        else if ((row == 11) && (col == 5)) {iv115.setImageResource(blockColor);}
        else if ((row == 11) && (col == 6)) {iv116.setImageResource(blockColor);}
        else if ((row == 11) && (col == 7)) {iv117.setImageResource(blockColor);}
        else if ((row == 11) && (col == 8)) {iv118.setImageResource(blockColor);}
        else if ((row == 11) && (col == 9)) {iv119.setImageResource(blockColor);}

        else if ((row == 12) && (col == 0)) {iv120.setImageResource(blockColor);}
        else if ((row == 12) && (col == 1)) {iv121.setImageResource(blockColor);}
        else if ((row == 12) && (col == 2)) {iv122.setImageResource(blockColor);}
        else if ((row == 12) && (col == 3)) {iv123.setImageResource(blockColor);}
        else if ((row == 12) && (col == 4)) {iv124.setImageResource(blockColor);}
        else if ((row == 12) && (col == 5)) {iv125.setImageResource(blockColor);}
        else if ((row == 12) && (col == 6)) {iv126.setImageResource(blockColor);}
        else if ((row == 12) && (col == 7)) {iv127.setImageResource(blockColor);}
        else if ((row == 12) && (col == 8)) {iv128.setImageResource(blockColor);}
        else if ((row == 12) && (col == 9)) {iv129.setImageResource(blockColor);}

        else if ((row == 13) && (col == 0)) {iv130.setImageResource(blockColor);}
        else if ((row == 13) && (col == 1)) {iv131.setImageResource(blockColor);}
        else if ((row == 13) && (col == 2)) {iv132.setImageResource(blockColor);}
        else if ((row == 13) && (col == 3)) {iv133.setImageResource(blockColor);}
        else if ((row == 13) && (col == 4)) {iv134.setImageResource(blockColor);}
        else if ((row == 13) && (col == 5)) {iv135.setImageResource(blockColor);}
        else if ((row == 13) && (col == 6)) {iv136.setImageResource(blockColor);}
        else if ((row == 13) && (col == 7)) {iv137.setImageResource(blockColor);}
        else if ((row == 13) && (col == 8)) {iv138.setImageResource(blockColor);}
        else if ((row == 13) && (col == 9)) {iv139.setImageResource(blockColor);}

        else if ((row == 14) && (col == 0)) {iv140.setImageResource(blockColor);}
        else if ((row == 14) && (col == 1)) {iv141.setImageResource(blockColor);}
        else if ((row == 14) && (col == 2)) {iv142.setImageResource(blockColor);}
        else if ((row == 14) && (col == 3)) {iv143.setImageResource(blockColor);}
        else if ((row == 14) && (col == 4)) {iv144.setImageResource(blockColor);}
        else if ((row == 14) && (col == 5)) {iv145.setImageResource(blockColor);}
        else if ((row == 14) && (col == 6)) {iv146.setImageResource(blockColor);}
        else if ((row == 14) && (col == 7)) {iv147.setImageResource(blockColor);}
        else if ((row == 14) && (col == 8)) {iv148.setImageResource(blockColor);}
        else if ((row == 14) && (col == 9)) {iv149.setImageResource(blockColor);}

        else if ((row == 15) && (col == 0)) {iv150.setImageResource(blockColor);}
        else if ((row == 15) && (col == 1)) {iv151.setImageResource(blockColor);}
        else if ((row == 15) && (col == 2)) {iv152.setImageResource(blockColor);}
        else if ((row == 15) && (col == 3)) {iv153.setImageResource(blockColor);}
        else if ((row == 15) && (col == 4)) {iv154.setImageResource(blockColor);}
        else if ((row == 15) && (col == 5)) {iv155.setImageResource(blockColor);}
        else if ((row == 15) && (col == 6)) {iv156.setImageResource(blockColor);}
        else if ((row == 15) && (col == 7)) {iv157.setImageResource(blockColor);}
        else if ((row == 15) && (col == 8)) {iv158.setImageResource(blockColor);}
        else if ((row == 15) && (col == 9)) {iv159.setImageResource(blockColor);}
    }

    void blankTiles(int row, int col) {

        if ((row == 0) && (col == 0)) {iv000.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 1)) {iv001.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 2)) {iv002.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 3)) {iv003.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 4)) {iv004.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 5)) {iv005.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 6)) {iv006.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 7)) {iv007.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 8)) {iv008.setImageResource(blankBlock);}
        else if ((row == 0) && (col == 9)) {iv009.setImageResource(blankBlock);}

        else if ((row == 1) && (col == 0)) {iv010.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 1)) {iv011.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 2)) {iv012.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 3)) {iv013.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 4)) {iv014.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 5)) {iv015.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 6)) {iv016.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 7)) {iv017.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 8)) {iv018.setImageResource(blankBlock);}
        else if ((row == 1) && (col == 9)) {iv019.setImageResource(blankBlock);}

        else if ((row == 2) && (col == 0)) {iv020.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 1)) {iv021.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 2)) {iv022.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 3)) {iv023.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 4)) {iv024.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 5)) {iv025.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 6)) {iv026.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 7)) {iv027.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 8)) {iv028.setImageResource(blankBlock);}
        else if ((row == 2) && (col == 9)) {iv029.setImageResource(blankBlock);}

        else if ((row == 3) && (col == 0)) {iv030.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 1)) {iv031.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 2)) {iv032.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 3)) {iv033.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 4)) {iv034.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 5)) {iv035.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 6)) {iv036.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 7)) {iv037.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 8)) {iv038.setImageResource(blankBlock);}
        else if ((row == 3) && (col == 9)) {iv039.setImageResource(blankBlock);}

        else if ((row == 4) && (col == 0)) {iv040.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 1)) {iv041.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 2)) {iv042.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 3)) {iv043.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 4)) {iv044.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 5)) {iv045.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 6)) {iv046.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 7)) {iv047.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 8)) {iv048.setImageResource(blankBlock);}
        else if ((row == 4) && (col == 9)) {iv049.setImageResource(blankBlock);}

        else if ((row == 5) && (col == 0)) {iv050.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 1)) {iv051.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 2)) {iv052.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 3)) {iv053.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 4)) {iv054.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 5)) {iv055.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 6)) {iv056.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 7)) {iv057.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 8)) {iv058.setImageResource(blankBlock);}
        else if ((row == 5) && (col == 9)) {iv059.setImageResource(blankBlock);}

        else if ((row == 6) && (col == 0)) {iv060.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 1)) {iv061.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 2)) {iv062.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 3)) {iv063.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 4)) {iv064.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 5)) {iv065.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 6)) {iv066.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 7)) {iv067.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 8)) {iv068.setImageResource(blankBlock);}
        else if ((row == 6) && (col == 9)) {iv069.setImageResource(blankBlock);}

        else if ((row == 7) && (col == 0)) {iv070.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 1)) {iv071.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 2)) {iv072.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 3)) {iv073.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 4)) {iv074.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 5)) {iv075.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 6)) {iv076.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 7)) {iv077.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 8)) {iv078.setImageResource(blankBlock);}
        else if ((row == 7) && (col == 9)) {iv079.setImageResource(blankBlock);}

        else if ((row == 8) && (col == 0)) {iv080.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 1)) {iv081.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 2)) {iv082.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 3)) {iv083.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 4)) {iv084.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 5)) {iv085.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 6)) {iv086.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 7)) {iv087.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 8)) {iv088.setImageResource(blankBlock);}
        else if ((row == 8) && (col == 9)) {iv089.setImageResource(blankBlock);}

        else if ((row == 9) && (col == 0)) {iv090.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 1)) {iv091.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 2)) {iv092.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 3)) {iv093.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 4)) {iv094.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 5)) {iv095.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 6)) {iv096.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 7)) {iv097.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 8)) {iv098.setImageResource(blankBlock);}
        else if ((row == 9) && (col == 9)) {iv099.setImageResource(blankBlock);}

        else if ((row == 10) && (col == 0)) {iv100.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 1)) {iv101.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 2)) {iv102.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 3)) {iv103.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 4)) {iv104.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 5)) {iv105.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 6)) {iv106.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 7)) {iv107.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 8)) {iv108.setImageResource(blankBlock);}
        else if ((row == 10) && (col == 9)) {iv109.setImageResource(blankBlock);}

        else if ((row == 11) && (col == 0)) {iv110.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 1)) {iv111.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 2)) {iv112.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 3)) {iv113.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 4)) {iv114.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 5)) {iv115.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 6)) {iv116.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 7)) {iv117.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 8)) {iv118.setImageResource(blankBlock);}
        else if ((row == 11) && (col == 9)) {iv119.setImageResource(blankBlock);}

        else if ((row == 12) && (col == 0)) {iv120.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 1)) {iv121.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 2)) {iv122.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 3)) {iv123.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 4)) {iv124.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 5)) {iv125.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 6)) {iv126.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 7)) {iv127.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 8)) {iv128.setImageResource(blankBlock);}
        else if ((row == 12) && (col == 9)) {iv129.setImageResource(blankBlock);}

        else if ((row == 13) && (col == 0)) {iv130.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 1)) {iv131.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 2)) {iv132.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 3)) {iv133.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 4)) {iv134.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 5)) {iv135.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 6)) {iv136.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 7)) {iv137.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 8)) {iv138.setImageResource(blankBlock);}
        else if ((row == 13) && (col == 9)) {iv139.setImageResource(blankBlock);}

        else if ((row == 14) && (col == 0)) {iv140.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 1)) {iv141.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 2)) {iv142.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 3)) {iv143.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 4)) {iv144.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 5)) {iv145.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 6)) {iv146.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 7)) {iv147.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 8)) {iv148.setImageResource(blankBlock);}
        else if ((row == 14) && (col == 9)) {iv149.setImageResource(blankBlock);}

        else if ((row == 15) && (col == 0)) {iv150.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 1)) {iv151.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 2)) {iv152.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 3)) {iv153.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 4)) {iv154.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 5)) {iv155.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 6)) {iv156.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 7)) {iv157.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 8)) {iv158.setImageResource(blankBlock);}
        else if ((row == 15) && (col == 9)) {iv159.setImageResource(blankBlock);}
    }
}
