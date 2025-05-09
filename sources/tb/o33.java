package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.f0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o33 implements f0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25119a;
    public final String b;
    public final String c;
    public final String d;

    static {
        t2o.a(834666529);
        t2o.a(839909568);
    }

    public o33(String str, String str2, String str3, String str4) {
        ckf.g(str, "url");
        ckf.g(str2, "sessionId");
        ckf.g(str3, "frameId");
        ckf.g(str4, "loaderId");
        this.f25119a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            f0d.a.b(this, iTMSPage);
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            f0d.a.c(this);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            f0d.a.a(this);
        }
    }

    @Override // tb.f0d
    public e0d x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0d) ipChange.ipc$dispatch("96e58ef2", new Object[]{this});
        }
        return new n33(this.f25119a, this.b, this.c, this.d);
    }
}
