package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.state.page.MetaPageStateWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jsi extends ox<nuc, MetaPageStateWidget> implements muc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001559);
        t2o.a(993001548);
    }

    public static /* synthetic */ Object ipc$super(jsi jsiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/state/page/MetaPageStatePresenter");
    }

    @Override // tb.muc
    public a<? extends asi, ? extends MetaResult<? extends asi>> J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("176c25a3", new Object[]{this});
        }
        o02 e = ((acx) getWidget().getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        return (a) e;
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }
}
