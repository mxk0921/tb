package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.view.ContentOffsetView;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class rmf extends ylf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297260);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmf(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar);
        ckf.g(activity, "activity");
        ckf.g(vzVar, a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
    }

    public static /* synthetic */ Object ipc$super(rmf rmfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/IrpPlaceHolderTitleBarWidget");
    }

    @Override // tb.ylf
    public void A0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a432185f", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ylf
    public void B0(RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c156873f", new Object[]{this, rectF, new Boolean(z)});
        }
    }

    @Override // tb.ylf
    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3498b50c", new Object[]{this});
        }
    }

    @Override // tb.ylf
    public void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a670c62", new Object[]{this});
        }
    }

    @Override // tb.ylf
    public void E0(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcbf3f4", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    /* renamed from: F0 */
    public ContentOffsetView b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentOffsetView) ipChange.ipc$dispatch("9599a722", new Object[]{this});
        }
        return new ContentOffsetView(E(), null);
    }

    @Override // tb.ylf
    public void h0(List<mh7> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ec9921", new Object[]{this, list});
        }
    }

    @Override // tb.ylf
    public void i0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c52d4d5", new Object[]{this, rectF});
        }
    }

    @Override // tb.ylf
    public int j0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93b23a73", new Object[]{this, rectF})).intValue();
        }
        return 0;
    }

    @Override // tb.ylf
    public Bitmap k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bd9231c7", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ylf
    public int l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.ylf
    public int n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9332553", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.ylf
    public LinkedList<p9j> o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("8847d4ab", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ylf
    public int p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fb2bb8", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.ylf
    public void q0(List<mh7> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e751c1a", new Object[]{this, list, new Integer(i)});
        }
    }

    @Override // tb.ylf
    public boolean r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a70437", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ylf
    public boolean s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5242a8f4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ylf
    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326d413c", new Object[]{this});
        }
    }

    @Override // tb.ylf
    public void x0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede5fbdf", new Object[]{this, bitmap});
        }
    }

    @Override // tb.ylf
    public void y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
        }
    }

    @Override // tb.ylf
    public void z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b729aa24", new Object[]{this, str});
        }
    }
}
