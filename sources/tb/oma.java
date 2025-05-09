package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryCellBean;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryVO;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oma extends pq1<GuessDiscoveryCellBean, ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792971);
    }

    public static /* synthetic */ Object ipc$super(oma omaVar, String str, Object... objArr) {
        if (str.hashCode() == -4253972) {
            omaVar.k((JSONObject) objArr[0], (ActivateTypedBean) objArr[1], (ja0) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/guess/GuessDiscoveryCellParser");
    }

    @Override // tb.dx
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad31b77e", new Object[]{this});
        }
        return "nt_search_door_guess_discovery";
    }

    /* renamed from: l */
    public GuessDiscoveryCellBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GuessDiscoveryCellBean) ipChange.ipc$dispatch("63f361b8", new Object[]{this});
        }
        return new GuessDiscoveryCellBean();
    }

    /* renamed from: m */
    public void i(JSONObject jSONObject, GuessDiscoveryCellBean guessDiscoveryCellBean, ja0 ja0Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea21a3da", new Object[]{this, jSONObject, guessDiscoveryCellBean, ja0Var});
            return;
        }
        k(jSONObject, guessDiscoveryCellBean, ja0Var);
        guessDiscoveryCellBean.originData = jSONObject;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            guessDiscoveryCellBean.discoveryVO = (GuessDiscoveryVO) JSON.toJavaObject(jSONObject2, GuessDiscoveryVO.class);
            guessDiscoveryCellBean.preload = ja0Var.w;
        }
    }
}
