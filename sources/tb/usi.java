package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import tb.acx;
import tb.bsi;
import tb.ddd;
import tb.p9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class usi<V extends View, IV extends p9e<?, ?>, IP extends ddd<?, ?>, MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>, CONFIG extends bsi> extends b12<V, IV, IP, MODEL, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001515);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usi(Activity activity, ude udeVar, MODEL model, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, model, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(model, "baseSearchResultWrap");
    }

    public static /* synthetic */ Object ipc$super(usi usiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/MetaWidget");
    }

    public final CONFIG w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CONFIG) ((bsi) ipChange.ipc$dispatch("1ffd1048", new Object[]{this}));
        }
        CONFIG config = (CONFIG) ((acx) getModel()).c();
        ckf.e(config, "null cannot be cast to non-null type CONFIG of com.taobao.android.meta.structure.MetaWidget");
        return config;
    }
}
