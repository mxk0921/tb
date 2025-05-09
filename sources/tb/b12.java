package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import tb.acx;
import tb.ddd;
import tb.p9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class b12<V extends View, IV extends p9e, IP extends ddd, MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>, BEAN> extends sxh<V, IV, IP, MODEL, BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001699);
    }

    public b12(Activity activity, ude udeVar, MODEL model, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, model, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(b12 b12Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/widget/BaseSrpWidget");
    }

    public x02 v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x02) ipChange.ipc$dispatch("15e5665d", new Object[]{this});
        }
        return new x02(getActivity(), this, (acx) getModel());
    }
}
