package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import tb.gy;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class h6o extends h1i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final hrh g = new hrh(new lrh());

    static {
        t2o.a(815792293);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6o(yko ykoVar) {
        super(ykoVar);
        ckf.g(ykoVar, "core");
    }

    public static /* synthetic */ Object ipc$super(h6o h6oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/datasource/RerankPoolSearchResultAdapter");
    }

    @Override // tb.h1i
    /* renamed from: R */
    public boolean i(CommonSearchResult commonSearchResult, nsj nsjVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6d1679", new Object[]{this, commonSearchResult, nsjVar, map})).booleanValue();
        }
        return false;
    }

    @Override // tb.h1i
    /* renamed from: T */
    public void w(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a2649c", new Object[]{this, commonSearchResult, jSONObject});
        } else if (commonSearchResult != null) {
            yko ykoVar = this.f20955a;
            ckf.f(ykoVar, "mCore");
            MSearchResult mSearchResult = new MSearchResult(ykoVar, commonSearchResult.isNew());
            this.g.e(mSearchResult, jSONObject, this.f20955a);
            commonSearchResult.setTemplates(mSearchResult.getTemplates());
            commonSearchResult.pageInfo = mSearchResult.pageInfo;
            commonSearchResult.pageData = mSearchResult.pageData;
            commonSearchResult.copyPageInfo = mSearchResult.copyPageInfo;
            commonSearchResult.addCells(mSearchResult.getCells());
        }
    }

    @Override // tb.psi, tb.q02
    public r5j.a s(Map<String, String> map, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j.a) ipChange.ipc$dispatch("3dfaf982", new Object[]{this, map, cVar});
        }
        return new r5j.a(f1p.WSEARCH_TPP_API_NAME_VALUE, "1.0", "wsearch");
    }
}
