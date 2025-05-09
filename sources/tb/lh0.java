package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.util.Map;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lhd f23331a;
    public qjd.b b;
    public JSONObject c;
    public Boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qjd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.qjd.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.qjd.b
        public void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d586a494", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
                return;
            }
            AwesomeGetContainerData a2 = lh0.a(lh0.this, str, awesomeGetData);
            if (a2 == null) {
                uqa.b("buyAfterRecommend", "createRequestListener", "awesomeGetContainerData == null");
            } else if (!lh0.b(lh0.this, a2)) {
                uqa.b("buyAfterRecommend", "createRequestListener", "不是第一页");
            } else {
                lh0 lh0Var = lh0.this;
                lh0.c(lh0Var, lh0.d(lh0Var, a2));
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = a2.base;
                if (awesomeGetContainerInnerData != null && (jSONObject = awesomeGetContainerInnerData.ext) != null) {
                    lh0.f(lh0.this, Boolean.valueOf(jSONObject.getBooleanValue(oh0.KEY_ENABLE_AFTER_BUY_NEW_FRAMEWORK)));
                    oh0.b(str, lh0.e(lh0.this));
                }
            }
        }

        @Override // tb.qjd.b
        public void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c78df556", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
            }
        }
    }

    static {
        t2o.a(729809940);
    }

    public lh0(lhd lhdVar) {
        this.f23331a = lhdVar;
        m();
    }

    public static /* synthetic */ AwesomeGetContainerData a(lh0 lh0Var, String str, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("f212527b", new Object[]{lh0Var, str, awesomeGetData});
        }
        return lh0Var.i(str, awesomeGetData);
    }

    public static /* synthetic */ boolean b(lh0 lh0Var, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9adf7d", new Object[]{lh0Var, awesomeGetContainerData})).booleanValue();
        }
        return lh0Var.n(awesomeGetContainerData);
    }

    public static /* synthetic */ JSONObject c(lh0 lh0Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("79212836", new Object[]{lh0Var, jSONObject});
        }
        lh0Var.c = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject d(lh0 lh0Var, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dfbcbb57", new Object[]{lh0Var, awesomeGetContainerData});
        }
        return lh0Var.o(awesomeGetContainerData);
    }

    public static /* synthetic */ Boolean e(lh0 lh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("95561897", new Object[]{lh0Var});
        }
        return lh0Var.d;
    }

    public static /* synthetic */ Boolean f(lh0 lh0Var, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c0ca5b32", new Object[]{lh0Var, bool});
        }
        lh0Var.d = bool;
        return bool;
    }

    public final qjd.b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjd.b) ipChange.ipc$dispatch("dd6fe33e", new Object[]{this});
        }
        return new a();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            p();
        }
    }

    public final AwesomeGetContainerData i(String str, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("1f94ecc6", new Object[]{this, str, awesomeGetData});
        }
        Map<String, AwesomeGetContainerData> containers = awesomeGetData.getContainers();
        if (containers != null && !containers.isEmpty()) {
            return containers.get(str);
        }
        uqa.b("buyAfterRecommend", "parseColdEffectConfig", "containerDataMap == null");
        return null;
    }

    public final JSONObject j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("168643ba", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject("firstScreenEffectConfig");
        }
        uqa.b("buyAfterRecommend", "getFirstScreenConfigFromExt", "ext == null");
        return null;
    }

    public final JSONObject k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f908ad63", new Object[]{this, str});
        }
        imn d = zza.d(str);
        if (d == null) {
            uqa.b("buyAfterRecommend", "getColdEffectConfigFromGateway", "recmdDataSource == null");
            return null;
        }
        AwesomeGetContainerInnerData q = d.q(str);
        if (q == null) {
            uqa.b("buyAfterRecommend", "getColdEffectConfigFromGateway", "awesomeGetContainerInnerData == null");
            return null;
        }
        AwesomeGetPageData pageParams = q.getPageParams();
        if (pageParams == null) {
            uqa.b("buyAfterRecommend", "getColdEffectConfigFromGateway", "pageData == null");
            return null;
        } else if (pageParams.getPageNum() == 0) {
            return j(q.getExt());
        } else {
            uqa.b("buyAfterRecommend", "getColdEffectConfigFromGateway", "不是第一页");
            return null;
        }
    }

    public JSONObject l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4acba4a", new Object[]{this, str});
        }
        JSONObject k = k(str);
        if (k != null) {
            return k;
        }
        return this.c;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c696e897", new Object[]{this});
        } else if (this.f23331a != null) {
            qjd.b g = g();
            this.b = g;
            this.f23331a.m(g);
        }
    }

    public final boolean n(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6ca3dc", new Object[]{this, awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData.getPageNum() == 0) {
            return true;
        }
        return false;
    }

    public final JSONObject o(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ec79ced", new Object[]{this, awesomeGetContainerData});
        }
        return j(awesomeGetContainerData.getExt());
    }

    public final void p() {
        qjd.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        lhd lhdVar = this.f23331a;
        if (lhdVar != null && (bVar = this.b) != null) {
            lhdVar.r(bVar);
        }
    }
}
