package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class z9w implements xpd.a.AbstractC1101a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32638a;

    static {
        t2o.a(766509293);
        t2o.a(766509128);
    }

    public z9w(Context context) {
        ckf.g(context, "context");
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7baf07", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.xpd.a.AbstractC1101a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc7dbde", new Object[]{this});
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("298e6417", new Object[]{this})).booleanValue();
        }
        return this.f32638a;
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d4dd95", new Object[]{this, new Boolean(z)});
        } else {
            this.f32638a = z;
        }
    }
}
