package com.alipay.ma.decode;

import com.alipay.ma.common.result.ResultMaType;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecodeResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -1127433175886611037L;
    public int bitErrors;
    public byte[] bytes;
    public float codeProportion;
    public byte[] decodeBytes;
    public char ecLevel;
    public String encodeCharset;
    public float errPercent;
    public int height;
    public String hiddenData;
    public long qrSize;
    public ResultMaType resultMaType;
    public String strCode;
    public long strLen;
    public int strategy;
    public int subType;
    public int type;
    public String typeName;
    public int version;
    public int width;
    public int x;
    public int[] xCorner;
    public int y;
    public int[] yCorner;

    public DecodeResult(int i, int i2, byte[] bArr, int i3, int i4, int i5, int i6, byte[] bArr2, String str) {
        this.type = i;
        this.subType = i2;
        this.bytes = bArr;
        this.x = i3;
        this.y = i4;
        this.width = i5;
        this.height = i6;
        this.decodeBytes = bArr2;
        this.hiddenData = str;
        this.xCorner = new int[4];
        this.yCorner = new int[4];
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DecodeResult [type=" + this.type + ", subType=" + this.subType + ", strCode=" + this.strCode + ", bytes=" + Arrays.toString(this.bytes) + ", x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + "hiddenData=" + this.hiddenData + "]";
    }

    public DecodeResult(int i, int i2, byte[] bArr) {
        this.type = i;
        this.subType = i2;
        this.bytes = bArr;
    }
}
