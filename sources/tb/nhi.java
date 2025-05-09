package tb;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nhi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d22 f24738a;
    public att b;

    static {
        t2o.a(481296480);
    }

    public nhi(d22 d22Var) {
        ckf.g(d22Var, "thumbnailExecutor");
        this.f24738a = d22Var;
    }

    public final void a(pei peiVar, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3608c8ce", new Object[]{this, peiVar, imageView});
        } else if (peiVar != null && imageView != null) {
            b();
            att attVar = new att(peiVar, imageView);
            this.f24738a.b(attVar);
            this.b = attVar;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b65384", new Object[]{this});
            return;
        }
        att attVar = this.b;
        if (attVar != null) {
            this.f24738a.a(attVar);
            this.b = null;
        }
    }
}
