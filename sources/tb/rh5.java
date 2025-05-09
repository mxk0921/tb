package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rh5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27380a;
    public static long b;
    public static String c;
    public static String d;
    public static String e;

    static {
        t2o.a(444597060);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed0ac055", new Object[0]);
        }
        return " name: " + f27380a + " v: " + b + " threadName: " + d + " pipelineName: " + e + " biz: " + c;
    }

    public static void b(String str, long j, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d8c74", new Object[]{str, new Long(j), str2, str3, str4});
            return;
        }
        f27380a = str;
        b = j;
        c = str2;
        d = str3;
        e = str4;
    }
}
