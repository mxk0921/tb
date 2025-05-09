package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Kb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static StringBuilder a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("e7c7fe4d", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}
