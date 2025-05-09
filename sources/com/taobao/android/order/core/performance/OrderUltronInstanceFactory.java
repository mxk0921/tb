package com.taobao.android.order.core.performance;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.container.UltronListProxy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.cdl;
import tb.ckf;
import tb.gav;
import tb.hav;
import tb.pav;
import tb.pl4;
import tb.rcl;
import tb.rn2;
import tb.t2o;
import tb.uel;
import tb.v4s;
import tb.wbl;
import tb.ykl;
import tb.z7v;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\f\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u0003J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060!H\u0007¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/taobao/android/order/core/performance/OrderUltronInstanceFactory;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", v4s.PARAM_UPLOAD_STAGE, "sceneName", "", "params", "Ltb/xhv;", "preCreateUltronInstance", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/content/Context;", "context", "Lcom/alibaba/fastjson/JSONObject;", "protocolJSONObject", "(Landroid/content/Context;Lcom/alibaba/fastjson/JSONObject;)V", "Lcom/alibaba/android/ultron/vfw/instance/a;", "createInstance", "(Landroid/content/Context;)Lcom/alibaba/android/ultron/vfw/instance/a;", "", "isInstanceExist", "()Z", "clearInstance", "Lcom/taobao/android/order/core/container/UltronListProxy;", "getUltronListProxy", "()Lcom/taobao/android/order/core/container/UltronListProxy;", "getInstance", "()Lcom/alibaba/android/ultron/vfw/instance/a;", "enablePreCreateInstance", "(Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/util/Pair;", pl4.KEY_CACHE_DATA, "parseCacheResponse", "(Landroid/util/Pair;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "instance", "Lcom/alibaba/android/ultron/vfw/instance/a;", "ultronProxy", "Lcom/taobao/android/order/core/container/UltronListProxy;", "order-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OrderUltronInstanceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final OrderUltronInstanceFactory INSTANCE = new OrderUltronInstanceFactory();
    private static final String TAG = "OrderUltronInstanceFactory";
    private static com.alibaba.android.ultron.vfw.instance.a instance;
    private static UltronListProxy ultronProxy;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.android.ultron.vfw.instance.a f9146a;
        public final /* synthetic */ JSONObject b;

        public a(com.alibaba.android.ultron.vfw.instance.a aVar, JSONObject jSONObject) {
            this.f9146a = aVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                rcl.a(this.f9146a.G(), false, this.b);
            }
        }
    }

    static {
        t2o.a(614465737);
    }

    private OrderUltronInstanceFactory() {
    }

    @JvmStatic
    public static final void clearInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77eec589", new Object[0]);
        } else {
            instance = null;
        }
    }

    private final com.alibaba.android.ultron.vfw.instance.a createInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("8b61e574", new Object[]{this, context});
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = instance;
        if (aVar != null) {
            hav.d(TAG, "instance is exist");
            return aVar;
        }
        UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
        OrderConfigs.BizNameType bizNameType = OrderConfigs.BizNameType.ORDER_LIST;
        UltronInstanceConfig z = ultronInstanceConfig.z(bizNameType.getBizName());
        DXEngineConfig.b bVar = new DXEngineConfig.b(bizNameType.getBizName());
        bVar.U(cdl.c());
        bVar.K(cdl.b());
        z7v i = new z7v.b().m(wbl.t()).o(wbl.q()).l(bVar).i();
        ckf.f(z, "config");
        z.E(wbl.w());
        if (ykl.a()) {
            bVar.H(true, true);
        }
        z.G(i);
        com.alibaba.android.ultron.vfw.instance.a q = com.alibaba.android.ultron.vfw.instance.a.q(z, context);
        instance = q;
        return q;
    }

    @JvmStatic
    public static final com.alibaba.android.ultron.vfw.instance.a getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("2b1c7b32", new Object[0]);
        }
        return instance;
    }

    @JvmStatic
    public static final UltronListProxy getUltronListProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronListProxy) ipChange.ipc$dispatch("71f648ac", new Object[0]);
        }
        UltronListProxy ultronListProxy = ultronProxy;
        ultronProxy = null;
        return ultronListProxy;
    }

    @JvmStatic
    public static final boolean isInstanceExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14206ae3", new Object[0])).booleanValue();
        }
        if (instance != null) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final void parseCacheResponse(Pair<JSONObject, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59993503", new Object[]{pair});
            return;
        }
        ckf.g(pair, pl4.KEY_CACHE_DATA);
        if (cdl.c()) {
            com.alibaba.android.ultron.vfw.instance.a aVar = instance;
            if (aVar != null) {
                aVar.R((JSONObject) pair.first, (String) pair.second);
                aVar.T(new rn2(new gav.g.a().d(true).c()));
            }
            cdl.d(instance);
        }
    }

    @TradeHybridCustomAnnotation
    @JvmStatic
    public static final void preCreateUltronInstance(Activity activity, String str, String str2, Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65557fb0", new Object[]{activity, str, str2, map});
        } else if (uel.l("enableOnStageCreateInstance", true) && activity != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            OrderUltronInstanceFactory orderUltronInstanceFactory = INSTANCE;
            ckf.d(str);
            ckf.d(str2);
            if (orderUltronInstanceFactory.enablePreCreateInstance(str, str2)) {
                hav.d(TAG, "hybridStage preCreateInstance start");
                Context applicationContext = activity.getApplicationContext();
                ckf.f(applicationContext, "activity.applicationContext");
                com.alibaba.android.ultron.vfw.instance.a createInstance = orderUltronInstanceFactory.createInstance(applicationContext);
                hav.d(TAG, "hybridStage preCreateInstance end");
                if (createInstance != null) {
                    ultronProxy = new UltronListProxy(activity.getApplicationContext(), createInstance);
                    rcl.c(createInstance.G(), false, null, 6, null);
                }
            }
        }
    }

    private final boolean enablePreCreateInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5176b110", new Object[]{this, str, str2})).booleanValue();
        }
        return ckf.b("mytaobao", str2) && ckf.b(UltronTradeHybridStage.ON_CONTAINER_RESUME, str);
    }

    @JvmStatic
    public static final void preCreateUltronInstance(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c447f7", new Object[]{context, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(jSONObject, "protocolJSONObject");
        hav.d(TAG, "onNav preCreateInstance start");
        OrderUltronInstanceFactory orderUltronInstanceFactory = INSTANCE;
        Context applicationContext = context.getApplicationContext();
        ckf.f(applicationContext, "context.applicationContext");
        com.alibaba.android.ultron.vfw.instance.a createInstance = orderUltronInstanceFactory.createInstance(applicationContext);
        hav.d(TAG, "onNav preCreateInstance end");
        if (createInstance != null) {
            ultronProxy = new UltronListProxy(context.getApplicationContext(), createInstance);
            pav.k(new a(createInstance, jSONObject));
        }
    }
}
