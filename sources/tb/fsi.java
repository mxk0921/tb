package tb;

import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ytc f19507a;
    public fsi b;
    public boolean c;
    public MetaLayout d;

    static {
        t2o.a(993001838);
    }

    public fsi(ytc ytcVar) {
        ckf.g(ytcVar, "element");
        this.f19507a = ytcVar;
    }

    public final ytc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytc) ipChange.ipc$dispatch("53d0c6f6", new Object[]{this});
        }
        return this.f19507a;
    }

    public final fsi b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsi) ipChange.ipc$dispatch("67a36245", new Object[]{this});
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13d3d593", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final MetaLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("9a56af06", new Object[]{this});
        }
        MetaLayout metaLayout = this.d;
        if (metaLayout != null) {
            return metaLayout;
        }
        ckf.y(a.MSG_SOURCE_PARENT);
        throw null;
    }

    public final void e(fsi fsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64716a5b", new Object[]{this, fsiVar});
        } else {
            this.b = fsiVar;
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97df599", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f5eaa", new Object[]{this, metaLayout});
            return;
        }
        ckf.g(metaLayout, "<set-?>");
        this.d = metaLayout;
    }
}
