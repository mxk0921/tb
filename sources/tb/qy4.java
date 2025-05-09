package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.sf.widgets.list.listcell.crosstips.CrossTipsBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qy4 extends es1<CrossTipsBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793629);
    }

    public static /* synthetic */ Object ipc$super(qy4 qy4Var, String str, Object... objArr) {
        if (str.hashCode() == 433644561) {
            super.l((JSONObject) objArr[0], (BaseCellBean) objArr[1], (BaseSearchResult) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/crosstips/CrossTipsParser");
    }

    @Override // tb.dx
    public Class<CrossTipsBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return CrossTipsBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_cross_tips";
    }

    /* renamed from: m */
    public CrossTipsBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CrossTipsBean) ipChange.ipc$dispatch("e7f1d1a7", new Object[]{this});
        }
        return new CrossTipsBean();
    }

    /* renamed from: n */
    public void i(JSONObject jSONObject, CrossTipsBean crossTipsBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36673d9f", new Object[]{this, jSONObject, crossTipsBean, baseSearchResult});
            return;
        }
        super.l(jSONObject, crossTipsBean, baseSearchResult);
        crossTipsBean.title = jSONObject.getString("title");
        crossTipsBean.isFullspan = true;
    }
}
