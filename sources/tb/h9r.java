package tb;

import android.content.Context;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.pay.PayTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f20486a;
    public static gh b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20487a;

        public a(Context context) {
            this.f20487a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h9r.a(h9r.b(null, this.f20487a));
            ck.g().c("TBBuyResourcePreLoader", "getAlipayExtInfo", "已经预加载好");
        }
    }

    static {
        t2o.a(708837596);
    }

    public static /* synthetic */ JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b24106b7", new Object[]{jSONObject});
        }
        f20486a = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject b(Map map, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9127e9bb", new Object[]{map, context});
        }
        return d(map, context);
    }

    public static JSONObject c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("33a2e192", new Object[]{context});
        }
        JSONObject jSONObject = f20486a;
        if (jSONObject != null) {
            return jSONObject;
        }
        ck.g().c("TBBuyResourcePreLoader", "getAlipayExtInfo", "没有预加载好");
        return d(null, context);
    }

    public static JSONObject d(Map<String, String> map, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("12958cf0", new Object[]{map, context});
        }
        return PayTask.getPreposeCashierRequestParams(map, context);
    }

    public static AURAPluginContainerNodeModel e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("e71b8fb8", new Object[0]);
        }
        gh ghVar = b;
        if (ghVar == null || ghVar.g() == null) {
            ck.g().c("TBBuyResourcePreLoader", "getConfigNodeModel", "没有预加载好");
        }
        gh ghVar2 = b;
        if (ghVar2 == null) {
            return null;
        }
        return ghVar2.g();
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fcb7b8", new Object[]{context});
            return;
        }
        if (b == null) {
            b = new gh("TBBuyResourcePreLoader-config");
        }
        if (b.g() == null) {
            b.c(context, AliBuyPresenterImpl.DEFAULT_AURA_BUY_CONFIG);
        }
        f20486a = null;
        dn.d(1, 1, 5L, TimeUnit.SECONDS, "TBBuyResourcePreLoader-AlipayExtInfo").execute(new a(context));
    }
}
