package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import java.util.HashSet;
import tb.y64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class z64<D extends a<C, R>, C extends y64, R extends MetaResult<C>> extends BaseMetaPageController<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final HashSet<a<?, ?>> e = new HashSet<>();

    static {
        t2o.a(993001481);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(z64 z64Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1920681519) {
            super.n((ksi) objArr[0]);
            return null;
        } else if (hashCode == 1060958575) {
            super.B((a) objArr[0], (MetaChildPageWidget) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/meta/common/CommonSearchController");
        }
    }

    @Override // com.taobao.android.meta.logic.BaseMetaPageController
    public void B(D d, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3cf16f", new Object[]{this, d, metaChildPageWidget});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        super.B(d, metaChildPageWidget);
        if (!this.e.contains(d)) {
            L(d, metaChildPageWidget);
            this.e.add(d);
        }
    }

    public final HashSet<a<?, ?>> M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("254eb5ca", new Object[]{this});
        }
        return this.e;
    }

    /* renamed from: N */
    public void j(D d, C c, C c2, osi<C> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0b2115", new Object[]{this, d, c, c2, osiVar});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(c, "src");
        ckf.g(c2, "incoming");
        ckf.g(osiVar, "config");
        c.x(c2);
    }

    /* renamed from: O */
    public void i(D d, C c, C c2, osi<C> osiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6443b006", new Object[]{this, d, c, c2, osiVar});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(c, "src");
        ckf.g(c2, "incoming");
        ckf.g(osiVar, "config");
        c.R(c2);
    }

    @Override // tb.vtc
    public boolean a(int i, D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ef1ec4c", new Object[]{this, new Integer(i), d})).booleanValue();
        }
        ckf.g(d, "initDataSource");
        if (i == 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.meta.logic.BaseMetaPageController
    public void n(ksi<D, C, ? extends bsi, R> ksiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d84b9d1", new Object[]{this, ksiVar});
            return;
        }
        ckf.g(ksiVar, "widget");
        super.n(ksiVar);
        this.e.add(r());
    }

    public void L(D d, MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b433ce", new Object[]{this, d, metaChildPageWidget});
            return;
        }
        ckf.g(d, "scopeDataSource");
        ckf.g(metaChildPageWidget, "childPage");
        d.doNewSearch(null, true, null);
    }
}
