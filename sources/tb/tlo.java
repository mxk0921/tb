package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.promotionfilter.SFPromotionFilterBean;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tlo extends ixi<SFPromotionFilterBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793677);
    }

    public static /* synthetic */ Object ipc$super(tlo tloVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/promotionfilter/SFPromotionFilterParser");
    }

    @Override // tb.dx
    public Class<SFPromotionFilterBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return SFPromotionFilterBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_promotionfilter";
    }

    /* renamed from: n */
    public SFPromotionFilterBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFPromotionFilterBean) ipChange.ipc$dispatch("95d6bfa9", new Object[]{this});
        }
        return new SFPromotionFilterBean();
    }

    /* renamed from: o */
    public void l(JSONObject jSONObject, SFPromotionFilterBean sFPromotionFilterBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83e967c", new Object[]{this, jSONObject, sFPromotionFilterBean, commonSearchResult});
        } else {
            sFPromotionFilterBean.oldPromotionFilterBean = PromotionFilterBean.parsePromotionFilter(jSONObject);
        }
    }
}
