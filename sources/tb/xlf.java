package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.result.FirstChildOffsetView;
import com.etao.feimagesearch.struct.ViewWidget;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class xlf extends ViewWidget<FirstChildOffsetView, IrpDatasource, xlf> implements ph7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a();

        void b(RectF rectF, mh7 mh7Var);

        void e(RectF rectF, mh7 mh7Var);
    }

    static {
        t2o.a(481297242);
        t2o.a(481297235);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar, a aVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.l = aVar;
    }

    public static /* synthetic */ Object ipc$super(xlf xlfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/preview/IrpBaseCropPreviewWidget");
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f4d19a", new Object[]{this, new Integer(i)});
        }
    }

    public final void d(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa29c575", new Object[]{this, bitmap});
        }
    }

    public void e(RectF rectF, mh7 mh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d98b96f", new Object[]{this, rectF, mh7Var});
            return;
        }
        my4.d(true);
        a aVar = this.l;
        if (aVar != null) {
            aVar.e(rectF, mh7Var);
        }
    }

    public abstract void h0();

    public final a i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9592827f", new Object[]{this});
        }
        return this.l;
    }

    public abstract View j0();

    public abstract int k0();

    public abstract void l0(List<ivn> list);

    public void m0(RectF rectF, mh7 mh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b1e807", new Object[]{this, rectF, mh7Var});
            return;
        }
        my4.d(true);
        a aVar = this.l;
        if (aVar != null) {
            aVar.b(rectF, mh7Var);
        }
    }

    public abstract void o0(Integer num);

    public abstract void q0(Bitmap bitmap, boolean z);

    public abstract void r0(RectF rectF, int i, int i2);

    public abstract void s0(Float f);

    public abstract void t0(boolean z);

    public abstract void u0(List<ivn> list);

    public abstract void v0(List<mh7> list, Float f);

    public abstract void w0(List<ivn> list);
}
