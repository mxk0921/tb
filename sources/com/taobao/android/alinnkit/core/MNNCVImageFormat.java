package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum MNNCVImageFormat {
    RGBA(0),
    RGB(1),
    BGR(2),
    GRAY(3),
    BGRA(4),
    YUV_NV21(11);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int format;

    MNNCVImageFormat(int i) {
        this.format = i;
    }

    public static /* synthetic */ Object ipc$super(MNNCVImageFormat mNNCVImageFormat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/MNNCVImageFormat");
    }

    public static MNNCVImageFormat valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MNNCVImageFormat) ipChange.ipc$dispatch("2c2716c", new Object[]{str});
        }
        return (MNNCVImageFormat) Enum.valueOf(MNNCVImageFormat.class, str);
    }
}
