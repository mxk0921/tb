package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.logic.BaseMetaPageController;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import java.util.Map;
import tb.asi;
import tb.gy;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class psi<C extends asi, M extends MetaResult<C>> extends q02<M> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BaseMetaPageController<? extends a<C, M>, C, M> c;

    static {
        t2o.a(993001492);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psi(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
        ckf.g(ykoVar, "core");
    }

    public static /* synthetic */ Object ipc$super(psi psiVar, String str, Object... objArr) {
        if (str.hashCode() == -1735549585) {
            super.w((BaseSearchResult) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/data/MetaSearchResultAdapter");
    }

    public abstract r5j.a B(Map<String, String> map);

    public void C(M m, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a50aa5", new Object[]{this, m, jSONObject});
            return;
        }
        ckf.g(m, "result");
        BaseMetaPageController<? extends a<C, M>, C, M> baseMetaPageController = this.c;
        ckf.d(baseMetaPageController);
        baseMetaPageController.e(m, jSONObject, this.f20955a);
    }

    /* renamed from: D */
    public void w(M m, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853fb236", new Object[]{this, m, jSONObject});
            return;
        }
        ckf.g(m, "result");
        if (this.c != null) {
            C(m, jSONObject);
        } else {
            super.w(m, jSONObject);
        }
    }

    public final void E(BaseMetaPageController<? extends a<C, M>, C, M> baseMetaPageController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb65af0f", new Object[]{this, baseMetaPageController});
        } else {
            this.c = baseMetaPageController;
        }
    }

    @Override // tb.q02
    public r5j.a s(Map<String, String> map, gy.c cVar) {
        osi osiVar;
        asi m;
        r5j.a g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j.a) ipChange.ipc$dispatch("3dfaf982", new Object[]{this, map, cVar});
        }
        if (cVar instanceof osi) {
            osiVar = (osi) cVar;
        } else {
            osiVar = null;
        }
        if (osiVar == null || (m = osiVar.m()) == null || (g = m.g()) == null) {
            return B(map);
        }
        return g;
    }
}
