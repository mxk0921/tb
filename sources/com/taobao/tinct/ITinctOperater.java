package com.taobao.tinct;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bi3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ITinctOperater {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ITinctOperater getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITinctOperater) ipChange.ipc$dispatch("c7573efc", new Object[0]);
        }
        return bi3.g().i();
    }

    public abstract String getTinctInfo(String str);

    public abstract void markABUsed(String str, String str2, String str3, String str4);

    public abstract void markBatchTouchStoneUsed(String str, String str2);

    public abstract void markChanged(String str, String str2, String str3, String str4, Boolean bool);

    public abstract void markOrangeUsed(String str, String str2);

    public void markUsed(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f5cf1b", new Object[]{this, str, str2, str3, str4, new Boolean(z)});
        } else {
            markChanged(str, str2, str3, str4, Boolean.valueOf(z));
        }
    }

    public void markUsed(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9362bed9", new Object[]{this, str, str2, str3, str4});
        } else {
            markChanged(str, str2, str3, str4, null);
        }
    }
}
