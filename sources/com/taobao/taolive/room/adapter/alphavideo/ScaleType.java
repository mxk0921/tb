package com.taobao.taolive.room.adapter.alphavideo;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum ScaleType {
    ScaleToFill(0),
    ScaleAspectFitCenter(1),
    ScaleAspectFill(2),
    TopFill(3),
    BottomFill(4),
    LeftFill(5),
    RightFill(6),
    TopFit(7),
    BottomFit(8),
    LeftFit(9),
    RightFit(10);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int index;

    ScaleType(int i) {
        this.index = i;
    }

    public static ScaleType convertFrom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScaleType) ipChange.ipc$dispatch("35d3f1f4", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
                return ScaleAspectFitCenter;
            case 2:
                return ScaleAspectFill;
            case 3:
                return TopFill;
            case 4:
                return BottomFill;
            case 5:
                return LeftFill;
            case 6:
                return RightFill;
            case 7:
                return TopFit;
            case 8:
                return BottomFit;
            case 9:
                return LeftFit;
            case 10:
                return RightFit;
            default:
                return ScaleToFill;
        }
    }

    public static /* synthetic */ Object ipc$super(ScaleType scaleType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/adapter/alphavideo/ScaleType");
    }

    public static ScaleType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScaleType) ipChange.ipc$dispatch("562f4ffa", new Object[]{str});
        }
        return (ScaleType) Enum.valueOf(ScaleType.class, str);
    }
}
