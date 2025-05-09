package com.alipay.ma.decode;

import java.util.ArrayList;

/* JADX WARN: Init of enum ALLBARCODE can be incorrect */
/* JADX WARN: Init of enum ALLCODE can be incorrect */
/* JADX WARN: Init of enum ALLLOTTERYCODE can be incorrect */
/* JADX WARN: Init of enum ALLQRCODE can be incorrect */
/* JADX WARN: Init of enum DEFAULTCODE can be incorrect */
/* JADX WARN: Init of enum EXPRESS can be incorrect */
/* JADX WARN: Init of enum FASTMAIL can be incorrect */
/* JADX WARN: Init of enum MEDICINE can be incorrect */
/* JADX WARN: Init of enum ONECODE can be incorrect */
/* JADX WARN: Init of enum PRODUCT can be incorrect */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum DecodeType {
    EAN13(1),
    EAN8(2),
    UPCA(4),
    UPCE(8),
    EAN14(128),
    CODE39(16),
    CODE93(256),
    CODE128(32),
    ITF(64),
    QRCODE(512),
    DMCODE(1024),
    PDF417(2048),
    GEN3(32768),
    NARROW(131072),
    HMCODE(262144),
    ARCODE(65536),
    WXTINYCODE(524288),
    ONECODE((((((((r0.codeType | r1.codeType) | r4.codeType) | r6.codeType) | r11.codeType) | r7.codeType) | r9.codeType) | r8.codeType) | r12.codeType),
    FASTMAIL(r7.codeType | r11.codeType),
    PRODUCT(r10.codeType),
    MEDICINE(r10.codeType),
    EXPRESS(r10.codeType),
    ALLQRCODE(r13.codeType),
    ALLBARCODE(r10.codeType),
    ALLLOTTERYCODE(r5.codeType | r3.codeType),
    ALLCODE((r14.codeType | ((r10.codeType | r9.codeType) | r5.codeType)) | r3.codeType),
    DEFAULTCODE(r2.codeType | ((((r10.codeType | r9.codeType) | r14.codeType) | r5.codeType) | r3.codeType));
    
    int codeType;

    static {
        DecodeType decodeType = EAN13;
        DecodeType decodeType2 = EAN8;
        DecodeType decodeType3 = UPCA;
        DecodeType decodeType4 = UPCE;
        DecodeType decodeType5 = EAN14;
        DecodeType decodeType6 = CODE39;
        DecodeType decodeType7 = CODE93;
        DecodeType decodeType8 = CODE128;
        DecodeType decodeType9 = ITF;
        DecodeType decodeType10 = QRCODE;
        DecodeType decodeType11 = DMCODE;
        DecodeType decodeType12 = PDF417;
        DecodeType decodeType13 = HMCODE;
        DecodeType decodeType14 = ARCODE;
        DecodeType decodeType15 = ONECODE;
        DecodeType decodeType16 = ALLQRCODE;
    }

    DecodeType(int i) {
        this.codeType = i;
    }

    public int getCodeType() {
        return this.codeType;
    }

    public static int getCode(DecodeType decodeType, String str) {
        if (decodeType == null && str == null) {
            return DEFAULTCODE.getCodeType();
        }
        int codeType = decodeType != null ? decodeType.getCodeType() : 0;
        if (str == null) {
            return codeType;
        }
        if (str.contains("default")) {
            codeType |= DEFAULTCODE.getCodeType();
        }
        if (str.contains("barCode")) {
            codeType |= ALLBARCODE.getCodeType();
        }
        if (str.contains("qrCode")) {
            codeType |= ALLQRCODE.getCodeType();
        }
        if (str.contains("dmCode")) {
            codeType |= DMCODE.getCodeType();
        }
        if (str.contains("pdf417Code")) {
            codeType |= PDF417.getCodeType();
        }
        if (str.contains("narrowCode")) {
            codeType |= NARROW.getCodeType();
        }
        if (str.contains("hmCode")) {
            codeType |= HMCODE.getCodeType();
        }
        return str.contains("wxTinyCode") ? codeType | WXTINYCODE.getCodeType() : codeType;
    }

    public static DecodeType[] getCodeTypes(DecodeType decodeType, String str) {
        if (decodeType == null && str == null) {
            return new DecodeType[]{DEFAULTCODE};
        }
        ArrayList arrayList = new ArrayList();
        if (decodeType != null) {
            arrayList.add(decodeType);
        }
        if (str != null) {
            if (str.contains("default")) {
                arrayList.add(DEFAULTCODE);
            }
            if (str.contains("barCode")) {
                arrayList.add(ALLBARCODE);
            }
            if (str.contains("qrCode")) {
                arrayList.add(ALLQRCODE);
            }
            if (str.contains("dmCode")) {
                arrayList.add(DMCODE);
            }
            if (str.contains("pdf417Code")) {
                arrayList.add(PDF417);
            }
            if (str.contains("narrowCode")) {
                arrayList.add(NARROW);
            }
            if (str.contains("hmCode")) {
                arrayList.add(HMCODE);
            }
        }
        if (str.length() == 0) {
            arrayList.add(DEFAULTCODE);
        }
        return (DecodeType[]) arrayList.toArray(new DecodeType[arrayList.size()]);
    }
}
