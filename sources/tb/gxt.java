package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.sf.widgets.list.listcell.tips.TipsCellBean;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gxt extends lg3<TipsCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793648);
    }

    public static /* synthetic */ Object ipc$super(gxt gxtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/tips/TipsCellParser");
    }

    @Override // tb.dx
    public Class<TipsCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return TipsCellBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_tips";
    }

    /* renamed from: q */
    public TipsCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsCellBean) ipChange.ipc$dispatch("32259537", new Object[]{this});
        }
        return new TipsCellBean();
    }

    /* renamed from: r */
    public void o(JSONObject jSONObject, TipsCellBean tipsCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5b7d1d", new Object[]{this, jSONObject, tipsCellBean, baseSearchResult});
            return;
        }
        tipsCellBean.listTipBean = ih1.a(jSONObject);
        tipsCellBean.fullSpan = jSONObject.optBoolean("fullSpan");
        m(tipsCellBean.listTipBean, baseSearchResult);
    }
}
