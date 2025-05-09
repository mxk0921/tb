package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class tv extends ViewWidget<ViewGroup, IrpDatasource, tv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297191);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
    }

    public static /* synthetic */ Object ipc$super(tv tvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/AbsIrpLoadingWidget");
    }

    public abstract void h0();

    public abstract void i0();
}
