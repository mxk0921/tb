package tb;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mvm extends ViewWidget<View, IrpDatasource, mvm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297218);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvm(Activity activity, vz vzVar, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, vzVar, irpDatasource, xfwVar, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(vzVar, a.MSG_SOURCE_PARENT);
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
    }

    public static /* synthetic */ Object ipc$super(mvm mvmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/PreviewMaskWidget");
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget
    public View b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        View view = new View(E());
        int parseColor = Color.parseColor("#0E1119");
        view.setBackgroundColor(Color.argb(127, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor)));
        view.setVisibility(8);
        return view;
    }

    public final void h0(float f) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a311dd4", new Object[]{this, new Float(f)});
            return;
        }
        View X = X();
        if (X != null) {
            float min = Math.min(hfn.b(f, 0.0f), 1.0f);
            X.setAlpha(min);
            if (min <= 0.2f) {
                i = 8;
            }
            X.setVisibility(i);
        }
    }
}
