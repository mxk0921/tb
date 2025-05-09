package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.Map;
import tb.asi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class nxp<D extends a<C, R>, C extends asi, R extends MetaResult<C>> implements vtc<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792888);
        t2o.a(993001495);
    }

    @Override // tb.vtc
    public void b(D d, C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679fd022", new Object[]{this, d, c, new Boolean(z), map});
        } else {
            ckf.g(d, "scopeDataSource");
        }
    }

    public abstract void d(Map<String, String> map, C c, D d, osi<C> osiVar);

    @Override // tb.vtc
    public void f(D d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6b9b53", new Object[]{this, d, new Boolean(z)});
        } else {
            ckf.g(d, "scopeDataSource");
        }
    }

    @Override // tb.vtc
    public void h(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1649746", new Object[]{this, d});
        } else {
            ckf.g(d, "scopeDataSource");
        }
    }

    @Override // tb.vtc
    public void m(D d, C c, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f954c1", new Object[]{this, d, c, new Integer(i)});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(c, "combo");
    }

    public abstract void n(D d, C c);

    public abstract void o(D d, MetaChildPageWidget metaChildPageWidget);

    public abstract boolean p(D d, C c, ListStyle listStyle);
}
