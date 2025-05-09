package tb;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sw9 implements adf<Fragment> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ix9 f28315a;

    static {
        t2o.a(676331609);
        t2o.a(676331614);
    }

    public sw9(ix9 ix9Var) {
        this.f28315a = ix9Var;
    }

    /* renamed from: b */
    public Fragment a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c9d24232", new Object[]{this});
        }
        try {
            if (!(this.f28315a.c() == null || this.f28315a.c().get() == null || TextUtils.isEmpty(this.f28315a.d()))) {
                ((cad) bcq.a()).i().n(this.f28315a.c().get(), this.f28315a.d());
            }
            if (this.f28315a.c() != null && this.f28315a.c().get() != null) {
                Fragment instantiate = Fragment.instantiate(this.f28315a.c().get(), this.f28315a.b(), this.f28315a.a());
                if (this.f28315a.e() != null) {
                    this.f28315a.e().b(instantiate, this.f28315a.a());
                }
                return instantiate;
            } else if (this.f28315a.e() == null) {
                return null;
            } else {
                this.f28315a.e().a("context has detroy", this.f28315a.a());
                return null;
            }
        } catch (Exception e) {
            if (this.f28315a.e() == null) {
                return null;
            }
            this.f28315a.e().a(e.getMessage(), this.f28315a.a());
            return null;
        }
    }
}
