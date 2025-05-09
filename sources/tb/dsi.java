package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dsi extends usi<FrameLayout, xtc, wtc, acx<? extends a<asi, MetaResult<asi>>>, bsi> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001557);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsi(Activity activity, ude udeVar, acx<? extends a<asi, MetaResult<asi>>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
    }

    public static /* synthetic */ Object ipc$super(dsi dsiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/state/footer/MetaFootStateWidget");
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MetaFootStateWidget";
    }

    /* renamed from: x2 */
    public wtc q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wtc) ipChange.ipc$dispatch("e1c95eb3", new Object[]{this});
        }
        Object a2 = w2().m().a(w2());
        ckf.f(a2, "create(...)");
        return (wtc) a2;
    }

    /* renamed from: y2 */
    public xtc s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xtc) ipChange.ipc$dispatch("5c29a18d", new Object[]{this});
        }
        Object a2 = w2().n().a(w2());
        ckf.f(a2, "create(...)");
        return (xtc) a2;
    }

    public final void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96950d81", new Object[]{this});
        } else {
            ((wtc) u2()).I();
        }
    }
}
