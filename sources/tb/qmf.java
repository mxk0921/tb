package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.result.FirstChildOffsetView;
import java.util.List;
import tb.xlf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class qmf extends xlf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297244);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar, xlf.a aVar) {
        super(activity, vzVar, irpDatasource, xfwVar, aVar);
        ckf.g(activity, "activity");
        ckf.g(vzVar, a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
    }

    public static /* synthetic */ Object ipc$super(qmf qmfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/preview/IrpPlaceHolderCropPreviewWidget");
    }

    /* renamed from: B0 */
    public FirstChildOffsetView b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FirstChildOffsetView) ipChange.ipc$dispatch("31aa2d77", new Object[]{this});
        }
        return null;
    }

    @Override // tb.xlf
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299d4ee6", new Object[]{this});
        }
    }

    @Override // tb.xlf
    public View j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5a3f19f", new Object[]{this});
        }
        return null;
    }

    @Override // tb.xlf
    public int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ede02b9d", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.xlf
    public void l0(List<ivn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acea64a3", new Object[]{this, list});
        } else {
            ckf.g(list, "parts");
        }
    }

    @Override // tb.xlf
    public void o0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
        }
    }

    @Override // tb.xlf
    public void q0(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc531d62", new Object[]{this, bitmap, new Boolean(z)});
        }
    }

    @Override // tb.xlf
    public void r0(RectF rectF, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac39201a", new Object[]{this, rectF, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.xlf
    public void s0(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93ca023", new Object[]{this, f});
        }
    }

    @Override // tb.xlf
    public void t0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e4246e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.xlf
    public void u0(List<ivn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aaa6787", new Object[]{this, list});
        }
    }

    @Override // tb.xlf
    public void v0(List<mh7> list, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2697e", new Object[]{this, list, f});
        } else {
            ckf.g(list, "parts");
        }
    }

    @Override // tb.xlf
    public void w0(List<ivn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49043353", new Object[]{this, list});
        } else {
            ckf.g(list, "parts");
        }
    }
}
