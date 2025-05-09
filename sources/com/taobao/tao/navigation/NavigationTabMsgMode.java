package com.taobao.tao.navigation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Init of enum DEFAULT can be incorrect */
/* JADX WARN: Init of enum GUARDIAN_DEFAULT can be incorrect */
/* JADX WARN: Init of enum GUARDIAN_NUM can be incorrect */
/* JADX WARN: Init of enum GUARDIAN_TEXT can be incorrect */
/* JADX WARN: Init of enum NONE can be incorrect */
/* JADX WARN: Init of enum RED_POINT_INDICATOR can be incorrect */
/* JADX WARN: Init of enum TEXT can be incorrect */
/* JADX WARN: Init of enum USE_LAST can be incorrect */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum NavigationTabMsgMode {
    DEFAULT(r1),
    GUARDIAN_DEFAULT(r1),
    RED_POINT_INDICATOR(r1),
    TEXT(r1),
    NONE(r1),
    GUARDIAN_NUM(r1),
    GUARDIAN_TEXT(r1),
    USE_LAST(r1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Gravity mGravity;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum Gravity {
        TOP_RIGHT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Gravity gravity, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/NavigationTabMsgMode$Gravity");
        }

        public static Gravity valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Gravity) ipChange.ipc$dispatch("ceaecc4", new Object[]{str});
            }
            return (Gravity) Enum.valueOf(Gravity.class, str);
        }
    }

    static {
        Gravity gravity = Gravity.TOP_RIGHT;
    }

    NavigationTabMsgMode(Gravity gravity) {
        this.mGravity = gravity;
    }

    public static /* synthetic */ Object ipc$super(NavigationTabMsgMode navigationTabMsgMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/NavigationTabMsgMode");
    }

    public static NavigationTabMsgMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabMsgMode) ipChange.ipc$dispatch("713a980e", new Object[]{str});
        }
        return (NavigationTabMsgMode) Enum.valueOf(NavigationTabMsgMode.class, str);
    }
}
