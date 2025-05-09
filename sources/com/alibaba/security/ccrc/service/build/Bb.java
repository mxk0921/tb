package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Bb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, yb> f2544a = new HashMap();

    public static yb a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (yb) ipChange.ipc$dispatch("69ebbd9f", new Object[]{str}) : f2544a.get(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            f2544a.remove(str);
        }
    }

    public static void a(String str, yb ybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c40d0ed", new Object[]{str, ybVar});
        } else {
            f2544a.put(str, ybVar);
        }
    }
}
