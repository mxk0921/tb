package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fl9 implements b4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b4d f19386a;
    public final jvc b = (jvc) d62.a(jvc.class, new Object[0]);

    static {
        t2o.a(680525827);
        t2o.a(676331644);
    }

    @Override // tb.b4d
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2a58283", new Object[]{this, str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = this.f19386a.a(str);
        this.b.b("md5_java", true, "md5", System.currentTimeMillis() - currentTimeMillis, 2, "", 0L);
        return a2;
    }

    public void c(b4d b4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51427b62", new Object[]{this, b4dVar});
        } else {
            this.f19386a = b4dVar;
        }
    }

    @Override // tb.b4d
    public boolean b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c81d05d3", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean b = this.f19386a.b(str, str2, str3, str4);
        this.b.b("mergePatchAndVerify_java", b, "mergePatchAndVerify", System.currentTimeMillis() - currentTimeMillis, 0, "", 0L);
        return b;
    }
}
