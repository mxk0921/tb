package com.alipay.mobile.beehive.eventbus;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ThreadMode {
    UI("ui"),
    BACKGROUND("background"),
    CURRENT("current");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String text;

    ThreadMode(String str) {
        this.text = str;
    }

    public static ThreadMode fromString(String str) {
        ThreadMode[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("20cac67a", new Object[]{str});
        }
        if (str != null) {
            for (ThreadMode threadMode : values()) {
                if (str.equals(threadMode.text)) {
                    return threadMode;
                }
            }
        }
        throw new IllegalArgumentException("No constant with text " + str + " found");
    }

    public static /* synthetic */ Object ipc$super(ThreadMode threadMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/beehive/eventbus/ThreadMode");
    }

    public static ThreadMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("56e536c7", new Object[]{str});
        }
        return (ThreadMode) Enum.valueOf(ThreadMode.class, str);
    }
}
