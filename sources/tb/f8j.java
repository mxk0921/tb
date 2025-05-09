package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f8j extends pq1<MuiseActivateCellBean, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793202);
    }

    public static /* synthetic */ Object ipc$super(f8j f8jVar, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            f8jVar.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/parser/MuiseActivateCellParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "muiseActivateCell";
    }

    /* renamed from: l */
    public MuiseActivateCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MuiseActivateCellBean) ipChange.ipc$dispatch("b1a12f79", new Object[]{this});
        }
        return new MuiseActivateCellBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, MuiseActivateCellBean muiseActivateCellBean, ja0 ja0Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cdc7adb", new Object[]{this, jSONObject, muiseActivateCellBean, ja0Var});
            return;
        }
        k(jSONObject, muiseActivateCellBean, ja0Var);
        MuiseBean muiseBean = new MuiseBean();
        String string = jSONObject.getString("tItemType");
        muiseBean.type = string;
        if (TextUtils.isEmpty(string)) {
            muiseBean.type = jSONObject.getString("type");
        }
        muiseBean.model = jSONObject;
        muiseActivateCellBean.muiseBean = muiseBean;
    }
}
