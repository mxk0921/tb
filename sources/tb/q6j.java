package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q6j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26548a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        t2o.a(993001945);
    }

    public static q6j a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q6j) ipChange.ipc$dispatch("9c3de314", new Object[]{str, str2, str3, str4});
        }
        q6j q6jVar = new q6j();
        q6jVar.f26548a = false;
        q6jVar.b = str;
        q6jVar.c = str2;
        q6jVar.d = str3;
        q6jVar.e = str4;
        return q6jVar;
    }

    public static q6j b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q6j) ipChange.ipc$dispatch("25785e84", new Object[]{str, str2});
        }
        q6j q6jVar = new q6j();
        q6jVar.f26548a = true;
        q6jVar.b = str;
        q6jVar.c = str2;
        q6jVar.d = null;
        q6jVar.e = null;
        return q6jVar;
    }
}
