package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.topbar.SFInshopTopBarBean;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class llo extends ixi<SFInshopTopBarBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793801);
    }

    public static /* synthetic */ Object ipc$super(llo lloVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/topbar/SFInshopTopBarParser");
    }

    @Override // tb.dx
    public Class<SFInshopTopBarBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return SFInshopTopBarBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_inshop_topbar";
    }

    /* renamed from: n */
    public SFInshopTopBarBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFInshopTopBarBean) ipChange.ipc$dispatch("9f521acd", new Object[]{this});
        }
        return new SFInshopTopBarBean();
    }

    /* renamed from: o */
    public void l(JSONObject jSONObject, SFInshopTopBarBean sFInshopTopBarBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b2402e", new Object[]{this, jSONObject, sFInshopTopBarBean, commonSearchResult});
            return;
        }
        a9u a9uVar = new a9u();
        sFInshopTopBarBean.traceDigest = a9uVar;
        sFInshopTopBarBean.oldTopBarBean = j3u.e(jSONObject, a9uVar);
    }
}
