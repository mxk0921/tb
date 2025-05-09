package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.TBMainHost;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lcv INSTANCE = new lcv();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "mytaobao", null);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f23264a;

        public b(JSONObject jSONObject) {
            this.f23264a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f23264a.put((JSONObject) ccv.PARAM_ASYNC_DATA_SOURCE, "true");
            qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_RESUME, "mytaobao", this.f23264a);
            hav.g("UltronTradeHybridTabManager", "mytaobaoStageResume:", "start hybrid opt");
        }
    }

    static {
        t2o.a(157286852);
    }

    @JvmStatic
    public static final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d1d298", new Object[0]);
            return;
        }
        TBMainHost b2 = TBMainHost.b();
        ckf.f(b2, "TBMainHost.get()");
        Context context = b2.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "context", (String) activity);
            qbv j = qbv.j();
            ckf.f(j, "UltronTradeHybridManager.getInstance()");
            bbv g = j.g();
            ckf.f(g, "UltronTradeHybridManager…etInstance().cacheManager");
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enablePreRequestRefund", true) && g.c("first_data", ae2.BizKeyRefund)) {
                jSONObject.put((JSONObject) "enablePreRequestRefund", (String) Boolean.TRUE);
            }
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enablePreRequestOrderList", true)) {
                List<String> n = p9b.Companion.n();
                m9v d = m9v.d("order_list");
                ckf.f(d, "UltronMMKV.get(\"order_list\")");
                String userId = Login.getUserId();
                int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "maxWotaoRequestNum", 4);
                for (String str : n) {
                    if (e > 0) {
                        if (g.a(userId + str, dbv.BIZ_ORDER_LIST) == null) {
                            if (d.l(userId + str) == null) {
                                e--;
                                jSONObject.put((JSONObject) ("enablePreRequestListCode" + str), (String) Boolean.TRUE);
                            }
                        }
                    }
                }
            }
            pav.i(new b(jSONObject), v9v.f(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "onMyTaobaoOptDelayMills", 0L));
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b0f73c", new Object[]{this});
        } else {
            pav.i(a.INSTANCE, 0L);
        }
    }

    public final void c(Integer num) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5c408", new Object[]{this, num});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableAddTabListener", true)) {
            if (num != null && num.intValue() == 0) {
                a();
                str = "tabHomepage";
            } else if (num != null && num.intValue() == 1) {
                a();
                str = "tabGuangGuang";
            } else if (num != null && num.intValue() == 2) {
                yxr.b(15);
                a();
                str = "tabMessage";
            } else if (num != null && num.intValue() == 3) {
                yxr.b(1);
                a();
                str = "tabCart";
            } else {
                yxr.b(9);
                b();
                if (v9v.i("ultronX_android", "enable_preload_so", true)) {
                    dng.j();
                }
                str = "mytaobao";
            }
            qbv.j().a(UltronTradeHybridStage.ON_TAB_CHANGE, str, null);
        }
    }
}
