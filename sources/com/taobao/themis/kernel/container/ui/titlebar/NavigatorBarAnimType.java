package com.taobao.themis.kernel.container.ui.titlebar;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class NavigatorBarAnimType extends Enum<NavigatorBarAnimType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final NavigatorBarAnimType ALPHA = new NavigatorBarAnimType("ALPHA", 0);
    public static final NavigatorBarAnimType TRANS = new NavigatorBarAnimType("TRANS", 1);
    public static final NavigatorBarAnimType NULL = new NavigatorBarAnimType("NULL", 2);
    public static final NavigatorBarAnimType OTHER = new NavigatorBarAnimType("OTHER", 3);
    private static final /* synthetic */ NavigatorBarAnimType[] $VALUES = $values();

    private static final /* synthetic */ NavigatorBarAnimType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NavigatorBarAnimType[]) ipChange.ipc$dispatch("59163eab", new Object[0]) : new NavigatorBarAnimType[]{ALPHA, TRANS, NULL, OTHER};
    }

    private NavigatorBarAnimType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(NavigatorBarAnimType navigatorBarAnimType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType");
    }

    public static NavigatorBarAnimType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("d2fded20", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(NavigatorBarAnimType.class, str);
        }
        return (NavigatorBarAnimType) valueOf;
    }

    public static NavigatorBarAnimType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("22dbeb4f", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (NavigatorBarAnimType[]) clone;
    }
}
