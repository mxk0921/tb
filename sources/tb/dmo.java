package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.topbar.SFTopBarBean;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dmo extends ixi<SFTopBarBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793803);
    }

    public static /* synthetic */ Object ipc$super(dmo dmoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/topbar/SFTopBarParser");
    }

    @Override // tb.dx
    public Class<SFTopBarBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a181f26", new Object[]{this});
        }
        return SFTopBarBean.class;
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_topbar";
    }

    /* renamed from: n */
    public SFTopBarBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SFTopBarBean) ipChange.ipc$dispatch("8cc527a8", new Object[]{this});
        }
        return new SFTopBarBean();
    }

    /* renamed from: o */
    public void l(JSONObject jSONObject, SFTopBarBean sFTopBarBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0edb009", new Object[]{this, jSONObject, sFTopBarBean, commonSearchResult});
            return;
        }
        a9u a9uVar = new a9u();
        sFTopBarBean.traceDigest = a9uVar;
        sFTopBarBean.oldTopBarBean = j3u.e(jSONObject, a9uVar);
    }
}
