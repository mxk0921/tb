package com.taobao.themis.kernel.extension.page.tab;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TabSwitchSource extends Enum<TabSwitchSource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TabSwitchSource USER_CLICK = new TabSwitchSource("USER_CLICK", 0);
    public static final TabSwitchSource API = new TabSwitchSource("API", 1);
    private static final /* synthetic */ TabSwitchSource[] $VALUES = $values();

    private static final /* synthetic */ TabSwitchSource[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabSwitchSource[]) ipChange.ipc$dispatch("54d37b9f", new Object[0]) : new TabSwitchSource[]{USER_CLICK, API};
    }

    private TabSwitchSource(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(TabSwitchSource tabSwitchSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/tab/TabSwitchSource");
    }

    public static TabSwitchSource valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("9176f14", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(TabSwitchSource.class, str);
        }
        return (TabSwitchSource) valueOf;
    }

    public static TabSwitchSource[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("2520c43", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (TabSwitchSource[]) clone;
    }
}
