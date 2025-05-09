package tb;

import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.Map;
import tb.asi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface vtc<D extends a<C, R>, C extends asi, R extends MetaResult<C>> extends utc<C, R> {
    boolean a(int i, D d);

    void b(D d, C c, boolean z, Map<String, String> map);

    acx<D> c(int i, TabBean tabBean, D d);

    void f(D d, boolean z);

    void g(D d, MetaChildPageWidget metaChildPageWidget);

    void h(D d);

    void i(D d, C c, C c2, osi<C> osiVar);

    void j(D d, C c, C c2, osi<C> osiVar);

    void k(D d, C c, boolean z, boolean z2, osi<C> osiVar);

    void l(D d, boolean z);

    void m(D d, C c, int i);
}
