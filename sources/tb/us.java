package tb;

import android.content.Context;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;
import tb.icu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class us implements wab {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_DOWNGRADE_CODE = "F-10000-00-15-002";
    public static final int ERROR_419 = 419;
    public static final String ERROR_DOMAIN = "TaobaoPurchaseExt";

    /* renamed from: a  reason: collision with root package name */
    public lo f29580a;
    public hbb b;
    public AURAGlobalData c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f29581a;

        public a(us usVar, Context context) {
            this.f29581a = context;
        }

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
                return;
            }
            icuVar.f();
            hh.d(this.f29581a);
        }
    }

    static {
        t2o.a(708837476);
        t2o.a(79691951);
    }

    public AURAGlobalData B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this});
        }
        return this.c;
    }

    public lo L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("fc4bf91a", new Object[]{this});
        }
        return this.f29580a;
    }

    public void m0(Context context, MtopResponse mtopResponse, String str, String str2, String str3, boolean z, boolean z2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7241dd4", new Object[]{this, context, mtopResponse, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        AliBuyPresenterImpl aliBuyPresenterImpl = (AliBuyPresenterImpl) this.f29580a.g(AliBuyPresenterImpl.class.getSimpleName(), AliBuyPresenterImpl.class);
        if (!y8r.c() || aliBuyPresenterImpl == null) {
            icu icuVar = new icu(context);
            icuVar.v(str);
            icuVar.q(str3);
            icuVar.n(str2);
            icuVar.s(new a(this, context));
            icuVar.x();
            return;
        }
        pm0 pm0Var = new pm0();
        pm0Var.c(mtopResponse.getApi()).f(x8r.a(mtopResponse)).i(str).g(str2).h(str3);
        if (z2 && "true".equals(y8r.g("enableRefresh", "true")) && (str2.equals("-202AEC10001") || str2.equals("200AES20001"))) {
            pm0Var.a(Localization.q(R.string.purchase_action_back), r("pop")).b(Localization.q(R.string.purchase_taobao_app_1029_1_19078), r("refresh")).h(k5n.ERROR_MSG_NETWORK_TIMEOUT);
        }
        if (z) {
            jSONObject = pm0Var.d();
        } else {
            jSONObject = pm0Var.e();
        }
        aliBuyPresenterImpl.e(jSONObject);
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f29580a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.b = hbbVar;
        this.c = aURAGlobalData;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public hbb x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbb) ipChange.ipc$dispatch("482c0947", new Object[]{this});
        }
        return this.b;
    }

    public final JSONArray r(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7f09ebed", new Object[]{this, strArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }
}
