package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.mmd.datasource.bean.SearchListBaseBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class lg3<BEAN extends BaseCellBean> extends es1<BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793406);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(lg3 lg3Var, String str, Object... objArr) {
        if (str.hashCode() == 433644561) {
            super.l((JSONObject) objArr[0], (BaseCellBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/datasource/parser/CellAdapterParser");
    }

    @Override // tb.es1
    /* renamed from: l */
    public void i(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d8e411", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        super.l(jSONObject, bean, baseSearchResult);
        if (p()) {
            n(jSONObject, bean, baseSearchResult);
            return;
        }
        String jSONString = jSONObject.toJSONString();
        if (TextUtils.isEmpty(jSONString)) {
            c4p.n("CellAdapterParser", "beanStr is empty");
            return;
        }
        try {
            o(new org.json.JSONObject(jSONString), bean, baseSearchResult);
        } catch (Exception unused) {
            c4p.n("CellAdapterParser", "fail to create old json object");
        }
    }

    public void m(SearchListBaseBean searchListBaseBean, BaseSearchResult baseSearchResult) {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d8a6f2", new Object[]{this, searchListBaseBean, baseSearchResult});
        } else if (searchListBaseBean != null && baseSearchResult != null && (mainInfo = baseSearchResult.getMainInfo()) != null) {
            searchListBaseBean.rn = mainInfo.rn;
            searchListBaseBean.abtest = mainInfo.abtest;
            searchListBaseBean.page = mainInfo.page;
            searchListBaseBean.pagePos = baseSearchResult.getCellsCount();
        }
    }

    public void n(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5763ed", new Object[]{this, jSONObject, bean, baseSearchResult});
        }
    }

    public abstract void o(org.json.JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception;

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbc178f6", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
