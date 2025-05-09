package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;
import com.etao.feimagesearch.view.ContentOffsetView;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ylf extends ViewWidget<ContentOffsetView, IrpDatasource, ylf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Activity l;
    public a m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void m();

        void p(p9j p9jVar);

        void z();
    }

    static {
        t2o.a(481297258);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "ctx");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.l = activity;
    }

    public static /* synthetic */ Object ipc$super(ylf ylfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/IrpBaseTitleBarWidget");
    }

    public abstract void A0(int i);

    public abstract void B0(RectF rectF, boolean z);

    public abstract void C0();

    public abstract void D0();

    public abstract void E0(boolean z, boolean z2);

    public abstract void h0(List<mh7> list);

    public abstract void i0(RectF rectF);

    public abstract int j0(RectF rectF);

    public abstract Bitmap k0();

    public abstract int l0();

    public final a m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e715b087", new Object[]{this});
        }
        return this.m;
    }

    public abstract int n0();

    public abstract LinkedList<p9j> o0();

    public abstract int p0();

    public abstract void q0(List<mh7> list, int i);

    public abstract boolean r0();

    public abstract boolean s0();

    public final boolean t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4ca4e92", new Object[]{this})).booleanValue();
        }
        Activity activity = this.l;
        if (activity instanceof oxb) {
            return ((oxb) activity).E1();
        }
        return false;
    }

    public abstract void u0();

    public void v0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
        }
    }

    public final void w0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e9fe17", new Object[]{this, aVar});
        } else {
            this.m = aVar;
        }
    }

    public abstract void x0(Bitmap bitmap);

    public abstract void y0(String str);

    public abstract void z0(String str);
}
