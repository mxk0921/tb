package tb;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tmx extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCEL = "cancel";
    public static final String FAILURE = "failure";
    public static final String SUCCESS = "success";
    public static final String TAG = "XRateWindvaneV2Ability";
    public static final long XRATEWINDVANEV2 = -2207554980288952361L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IJsApiFailedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f28811a;
        public final /* synthetic */ esw b;
        public final /* synthetic */ spw c;

        public a(tmx tmxVar, u8 u8Var, esw eswVar, spw spwVar) {
            this.f28811a = u8Var;
            this.b = eswVar;
            this.c = spwVar;
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public void fail(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
                return;
            }
            JSONObject i = tmx.i(str);
            if (i == null || !TextUtils.equals(i.getString("errorCode"), PreRequestPresenter.SOURCE_RATE_HISTORY)) {
                str2 = "failure";
            } else {
                str2 = "cancel";
            }
            tmx.j(str2, i, this.f28811a, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IJsApiSucceedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f28812a;
        public final /* synthetic */ esw b;
        public final /* synthetic */ spw c;

        public b(tmx tmxVar, u8 u8Var, esw eswVar, spw spwVar) {
            this.f28812a = u8Var;
            this.b = eswVar;
            this.c = spwVar;
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            } else {
                tmx.j("success", tmx.i(str), this.f28812a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public tmx build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tmx) ipChange.ipc$dispatch("ee8b5cfc", new Object[]{this, obj});
            }
            return new tmx();
        }
    }

    public static /* synthetic */ JSONObject i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf2b48a1", new Object[]{str});
        }
        return l(str);
    }

    public static /* synthetic */ Object ipc$super(tmx tmxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/XRateWindvaneV2Ability");
    }

    public static /* synthetic */ void j(String str, JSONObject jSONObject, u8 u8Var, esw eswVar, spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f9f3b5", new Object[]{str, jSONObject, u8Var, eswVar, spwVar});
        } else {
            k(str, jSONObject, u8Var, eswVar, spwVar);
        }
    }

    public static void k(String str, JSONObject jSONObject, u8 u8Var, esw eswVar, spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b2273a", new Object[]{str, jSONObject, u8Var, eswVar, spwVar});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("status", (Object) str);
        jSONObject2.put("result", (Object) jSONObject);
        m(str, jSONObject2, u8Var, eswVar, spwVar);
    }

    public static JSONObject l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4cf0182e", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public static void m(String str, JSONObject jSONObject, u8 u8Var, esw eswVar, spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f159291", new Object[]{str, jSONObject, u8Var, eswVar, spwVar});
            return;
        }
        u8Var.callback(str, new f8(jSONObject));
        n(eswVar, spwVar);
    }

    public static void n(esw eswVar, spw spwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8647dcf1", new Object[]{eswVar, spwVar});
        } else if (eswVar != null && spwVar != null) {
            Object b2 = eswVar.b(spwVar.d);
            if (b2 instanceof kpw) {
                ((kpw) b2).onDestroy();
            }
        }
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        Log.e(TAG, "onExecuteWithData: " + n8Var);
        if (n8Var == null || n8Var.h() == null) {
            u8Var.callback("failure", new f8(new JSONObject()));
            return new f8();
        }
        JSONObject h = n8Var.h();
        String string = h.getString("pluginName");
        String string2 = h.getString(FluidException.METHOD_NAME);
        JSONObject jSONObject = h.getJSONObject("params");
        spw spwVar = new spw();
        spwVar.d = string;
        spwVar.e = string2;
        esw eswVar = new esw(k8Var.d(), null);
        a aVar = new a(this, u8Var, eswVar, spwVar);
        b bVar = new b(this, u8Var, eswVar, spwVar);
        if (jSONObject != null) {
            try {
                spwVar.f = jSONObject.toJSONString();
            } catch (Throwable th) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) ("call windvane failed :" + th.getMessage()));
                k("failure", jSONObject2, u8Var, eswVar, spwVar);
            }
        }
        WVJsBridge.g().f(eswVar, spwVar, aVar, bVar);
        return new f8();
    }
}
