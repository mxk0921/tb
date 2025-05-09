package com.taobao.taobao.scancode.v2.result;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum MaType {
    PRODUCT(0, 255),
    MEDICINE(2, 255),
    EXPRESS(2, 255),
    QR(1, 512),
    TB_ANTI_FAKE(1, 512),
    TB_4G(1, 2048),
    DM(1, 1024),
    GEN3(1, 32768);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int discernType;
    private int type;

    MaType(int i, int i2) {
        this.type = i;
        this.discernType = i2;
    }

    public static /* synthetic */ Object ipc$super(MaType maType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/v2/result/MaType");
    }

    public static MaType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaType) ipChange.ipc$dispatch("56048e6", new Object[]{str});
        }
        return (MaType) Enum.valueOf(MaType.class, str);
    }

    public int getDiscernType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d86cc84a", new Object[]{this})).intValue();
        }
        return this.discernType;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public void setDiscernType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9294a98", new Object[]{this, new Integer(i)});
        } else {
            this.discernType = i;
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }
}
