package com.taobao.interact.publish.service;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum Ratio {
    CROP_RATIO_FREE(0, 0),
    CROP_RATIO_1x1(1, 1),
    CROP_RATIO_3x4(3, 4),
    CROP_RATIO_4x3(4, 3),
    CROP_RATIO_16x9(16, 9),
    CROP_RATIO_9x16(9, 16);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int ratioX;
    private int ratioY;

    Ratio(int i, int i2) {
        this.ratioX = i;
        this.ratioY = i2;
    }

    public static /* synthetic */ Object ipc$super(Ratio ratio, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/publish/service/Ratio");
    }

    public static AspectRatio parseRatio(Ratio ratio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AspectRatio) ipChange.ipc$dispatch("12ab9dd5", new Object[]{ratio});
        }
        return new AspectRatio(ratio.ratioX, ratio.ratioY);
    }

    public static Ratio valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ratio) ipChange.ipc$dispatch("e76b739f", new Object[]{str});
        }
        return (Ratio) Enum.valueOf(Ratio.class, str);
    }
}
