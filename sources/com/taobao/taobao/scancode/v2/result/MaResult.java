package com.taobao.taobao.scancode.v2.result;

import java.io.Serializable;
import java.util.Arrays;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.eyh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MaResult implements IMTOPDataObject, Serializable {
    private int height;
    private String text;
    private MaType type;
    private int width;
    private int x;
    private int[] xCorner;
    private int y;
    private int[] yCorner;

    static {
        t2o.a(760217790);
        t2o.a(589299906);
    }

    public MaResult() {
    }

    public int getHeight() {
        return this.height;
    }

    public String getText() {
        return this.text;
    }

    public MaType getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public int getX() {
        return this.x;
    }

    public int[] getXCorner() {
        return this.xCorner;
    }

    public int getY() {
        return this.y;
    }

    public int[] getYCorner() {
        return this.yCorner;
    }

    public int[] getxCorner() {
        return this.xCorner;
    }

    public int[] getyCorner() {
        return this.yCorner;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(MaType maType) {
        this.type = maType;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setX(int i) {
        this.x = i;
    }

    public void setXCorner(int[] iArr) {
        this.xCorner = iArr;
    }

    public void setY(int i) {
        this.y = i;
    }

    public void setYCorner(int[] iArr) {
        this.yCorner = iArr;
    }

    public void setxCorner(int[] iArr) {
        this.xCorner = iArr;
    }

    public void setyCorner(int[] iArr) {
        this.yCorner = iArr;
    }

    public String toString() {
        return "MaResult{type=" + this.type + ", text='" + this.text + "', x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", xCorner=" + Arrays.toString(this.xCorner) + ", yCorner=" + Arrays.toString(this.yCorner) + '}';
    }

    public MaResult(MaType maType, String str) {
        this.type = maType;
        this.text = str;
    }

    public MaResult(MaType maType, String str, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        this.type = maType;
        this.text = str;
        this.xCorner = iArr;
        this.yCorner = iArr2;
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public MaResult(eyh eyhVar) {
        this(eyhVar.f, eyhVar.c, eyhVar.k, eyhVar.l, eyhVar.g, eyhVar.h, eyhVar.i, eyhVar.j);
    }
}
