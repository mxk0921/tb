package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hie implements hpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hpc f20664a;

    static {
        t2o.a(815792600);
        t2o.a(982516043);
    }

    @Override // tb.hpc
    public void a(String str, hpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1979048", new Object[]{this, str, aVar});
        } else {
            d().a(str, aVar);
        }
    }

    @Override // tb.hpc
    public void b(Context context, String str, hpc.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe36e64", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            d().b(context, str, aVar, mUSImageQuality);
        }
    }

    @Override // tb.hpc
    public void c(Drawable drawable, hpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed62d3", new Object[]{this, drawable, aVar});
        } else {
            d().c(drawable, aVar);
        }
    }

    public final hpc d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpc) ipChange.ipc$dispatch("6a398fd3", new Object[]{this});
        }
        if (this.f20664a == null) {
            this.f20664a = new mwl();
        }
        return this.f20664a;
    }

    public void e(Context context, String str, hpc.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f84e5f", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            ((mwl) d()).p(context, str, aVar, mUSImageQuality);
        }
    }
}
