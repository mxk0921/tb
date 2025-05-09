package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jvf f22357a;
    public final nm4 b;
    public yuv c;
    public sxl d;

    static {
        t2o.a(490733613);
    }

    public k1x(String str) {
        ckf.g(str, "mBusinessId");
        jvf jvfVar = new jvf(str);
        this.f22357a = jvfVar;
        this.b = new nm4(jvfVar, str);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f22357a.c();
        this.b.c();
        yuv yuvVar = this.c;
        if (yuvVar != null) {
            yuvVar.g();
        }
        sxl sxlVar = this.d;
        if (sxlVar != null) {
            sxlVar.i();
        }
    }

    public final jvf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvf) ipChange.ipc$dispatch("1761cd0b", new Object[]{this});
        }
        return this.f22357a;
    }

    public final sxl c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxl) ipChange.ipc$dispatch("605df0d7", new Object[]{this});
        }
        return this.d;
    }

    public final yuv d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yuv) ipChange.ipc$dispatch("130044c9", new Object[]{this});
        }
        return this.c;
    }

    public final void e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72712a5", new Object[]{this, context, str, str2});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "containerType");
        ckf.g(str2, "businessId");
        this.c = new yuv(this.f22357a, context);
        this.d = new sxl(this.f22357a, str, str2);
    }
}
