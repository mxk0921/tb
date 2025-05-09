package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.search.sf.datasource.CommonSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class csh extends h1i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792882);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csh(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
        ckf.g(ykoVar, "core");
    }

    public static /* synthetic */ Object ipc$super(csh cshVar, String str, Object... objArr) {
        if (str.hashCode() == 1487211173) {
            super.C((MetaResult) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSRequestAdapter");
    }

    @Override // tb.h1i
    /* renamed from: T */
    public void w(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a2649c", new Object[]{this, commonSearchResult, jSONObject});
        } else {
            C(commonSearchResult, jSONObject);
        }
    }

    /* renamed from: Y */
    public void C(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fcc0cd", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        if (!this.f20955a.k()) {
            this.f20955a.s();
        }
        super.C(commonSearchResult, jSONObject);
        U(commonSearchResult, jSONObject);
    }
}
