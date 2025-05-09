package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.utils.Global;
import tb.b6x;
import tb.r19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class syj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ND_CLIENT_ALIGN_PREF_HOME_URL = "ndClientAlignPrefHomeUrl";
    public static final String ND_SERVER_FORCE_ALIGN_PREF_HOME_URL = "ndServerAlignPrefHomeUrl";
    public static final String PRELOAD_TYPE_IDLE_TASK = "idleTask";
    public static final String PRELOAD_TYPE_ON_DESTROY = "onDestroy";
    public static final String PRELOAD_TYPE_OUT_PRE_WEEX = "outPreWeex";

    /* renamed from: a  reason: collision with root package name */
    public static volatile b6x.a f28362a = null;
    public static volatile String b = null;
    public static volatile int c = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28363a;

        public a(String str) {
            this.f28363a = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/weex/NewDetailWeexAsyncPreLoadUtil$1");
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "preloadWeexV2FromCache";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else {
                syj.h(this.f28363a);
            }
        }
    }

    static {
        t2o.a(352321748);
    }

    public static boolean a(ue7 ue7Var) {
        CardInnerCommonNode cardInnerCommonNode;
        z4x z4xVar;
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfff5ba4", new Object[]{ue7Var})).booleanValue();
        }
        if (ue7Var == null || (cardInnerCommonNode = ue7Var.r) == null || (z4xVar = cardInnerCommonNode.containerInfo) == null || (c2 = z4xVar.c()) == null) {
            return false;
        }
        if (c2.contains("/newdetail/newflow/prefhome") || c2.contains("/newdetail/newguide/home")) {
            return true;
        }
        return false;
    }

    public static void d() {
        b6x.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbee471", new Object[0]);
        } else if (byj.F0()) {
            txj.e("WeexAsyncPreLoadUtil", "clearCacheInstance-DestroyPreResult cancel for downgrade.");
        } else {
            synchronized (syj.class) {
                txj.e("WeexAsyncPreLoadUtil", "clearCacheInstance-DestroyPreResult url: " + b);
                aVar = f28362a;
                f28362a = null;
                b = null;
            }
            if (aVar != null) {
                aVar.destroy();
            }
        }
    }

    public static MUSDKInstance g(Context context, String str) {
        tvh tvhVar;
        b6x.a aVar;
        b6x.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("9692c6c7", new Object[]{context, str});
        }
        synchronized (syj.class) {
            tvhVar = null;
            if (str != null) {
                try {
                    if (str.equals(b)) {
                        b6x.a aVar3 = f28362a;
                        txj.e("WeexAsyncPreLoadUtil", "getMus-musReuse url: " + b);
                        aVar = aVar3;
                        aVar2 = null;
                        f28362a = null;
                        b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            txj.e("WeexAsyncPreLoadUtil", "getMus-DestroyPreResult url: " + b);
            aVar2 = f28362a;
            aVar = null;
            f28362a = null;
            b = null;
        }
        if (aVar2 != null) {
            aVar2.destroy();
        }
        if (aVar != null && (context instanceof Activity)) {
            long currentTimeMillis = System.currentTimeMillis();
            WeexInstance b2 = aVar.b((Activity) context);
            txj.e("WeexAsyncPreLoadUtil", "result.accept DurationTIme : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            if (b2 == null) {
                return null;
            }
            tvhVar = ((WeexInstanceImpl) b2).getAdapterMUSInstance();
            if (tvhVar == null) {
                txj.e("WeexAsyncPreLoadUtil", "getMusInstance getAdapterMUSInstance return null");
            }
        }
        if (tvhVar == null) {
            txj.e("WeexAsyncPreLoadUtil", "getMusInstance not find musInstance");
        }
        return tvhVar;
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc72f3e3", new Object[]{str});
        } else if (r19.K()) {
            txj.e("WeexAsyncPreLoadUtil", "命中 PreWeexSkip , abort preload .");
        } else if (f28362a != null) {
            txj.e("WeexAsyncPreLoadUtil", "preloadWeexV2FromCache 取消执行。因为已经存在一个 sMusResult 。weexPreloadType:" + str);
        } else {
            txj.e("WeexAsyncPreLoadUtil", "preloadWeexV2FromCache 执行中。preloadType:" + str);
            Application application = Global.getApplication();
            String l = xmo.l(application, xmo.d(application));
            if (TextUtils.isEmpty(l)) {
                txj.e("WeexAsyncPreLoadUtil", "mainPicUrl is empty. weexPreloadType:" + str);
                return;
            }
            try {
                String P0 = byj.P0();
                if (TextUtils.isEmpty(P0)) {
                    txj.e("WeexAsyncPreLoadUtil", "异常: weexFilterInfoStr 为空。未能读取到 Orange 配置信息。preloadType:" + str);
                } else if (c(str, l, P0)) {
                    return;
                }
            } catch (Exception e) {
                txj.e("WeexAsyncPreLoadUtil", "异常: 无效 WeexUrl (weexFilter) 遇未知异常。preloadType:" + str + " errorMsg:" + Log.getStackTraceString(e));
            }
            txj.e("WeexAsyncPreLoadUtil", "start preloadWeexV2Internal , mainPicUrl = " + l + " weexPreloadType:" + str);
            j(application, l);
            if (r19.q0()) {
                mqj.n(l, null);
            }
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0029db", new Object[]{str});
        } else {
            Coordinator.execute(new a(str));
        }
    }

    public static b6x.a k(Context context, String str) {
        b6x.a aVar;
        b6x.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b6x.a) ipChange.ipc$dispatch("aa7d0313", new Object[]{context, str});
        }
        try {
            o2r.a("queryWeexV2Instance");
            synchronized (syj.class) {
                if (str != null && str.equals(b)) {
                    aVar2 = f28362a;
                    aVar = null;
                    f28362a = null;
                    b = null;
                }
                txj.e("WeexAsyncPreLoadUtil", "queryWeexV2Instance-DestroyPreResult url: " + b);
                aVar = f28362a;
                aVar2 = null;
                f28362a = null;
                b = null;
            }
            if (aVar != null) {
                aVar.destroy();
            }
            return aVar2;
        } finally {
            o2r.b();
        }
    }

    public static void l(b6x.a aVar, String str) {
        b6x.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7e142a", new Object[]{aVar, str});
            return;
        }
        synchronized (syj.class) {
            aVar2 = f28362a;
            f28362a = aVar;
            b = str;
        }
        if (aVar2 != null) {
            aVar2.destroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b6x.a e(Context context, String str, JSONObject jSONObject) {
        String str2 = "WeexAsyncPreLoadUtil";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b6x.a) ipChange.ipc$dispatch("38da5316", new Object[]{context, str, jSONObject});
        }
        try {
            o2r.a("directCreateWeexV2InternalWithData");
            try {
                String P0 = byj.P0();
                if (TextUtils.isEmpty(P0)) {
                    txj.e(str2, "异常: weexFilterInfoStr 为空。未能读取到 Orange 配置信息。weexPreloadType:directWithData");
                    str2 = str2;
                } else {
                    boolean c2 = c("directWithData", str, P0);
                    str2 = c2;
                    if (c2 != 0) {
                        o2r.b();
                        return null;
                    }
                }
            } catch (Exception e) {
                txj.e(str2, "异常: 无效 WeexUrl (weexFilter) 遇未知异常。weexPreloadType:directWithData errorMsg:" + Log.getStackTraceString(e));
            }
            WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
            WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
            weexUnicornConfig.k(true);
            weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
            weexInstanceConfig.s(weexUnicornConfig);
            t5x b2 = b.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
            fvo p = xmo.p(context);
            b2.c(p.c, p.b);
            b2.initWithURL(str);
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder("async-direct-");
            int i = c;
            c = 1 + i;
            sb.append(i);
            String sb2 = sb.toString();
            jSONObject2.put("ndWeexInitType", (Object) sb2);
            jSONObject2.putAll(jSONObject);
            if (!r19.C0()) {
                txj.e(txj.TAG_TIP, "Native-ndWeexInitType:" + sb2);
            }
            b2.render(b.e().b(jSONObject2));
            b6x.a a2 = b2.a();
            o2r.b();
            return a2;
        } catch (Throwable th) {
            o2r.b();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b6x.a f(Context context, String str) {
        b6x.a aVar;
        b6x.a aVar2;
        String str2 = "异常: 无效 WeexUrl (weexFilter) 遇未知异常。weexPreloadType:directNoData errorMsg:";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b6x.a) ipChange.ipc$dispatch("c0ae39d3", new Object[]{context, str});
        }
        try {
            o2r.a("directPreloadWeexV2Internal");
            try {
                String P0 = byj.P0();
                if (TextUtils.isEmpty(P0)) {
                    txj.e("WeexAsyncPreLoadUtil", "异常: weexFilterInfoStr 为空。未能读取到 Orange 配置信息。weexPreloadType:directNoData");
                    str2 = str2;
                } else {
                    boolean c2 = c("directNoData", str, P0);
                    str2 = c2;
                    if (c2 != 0) {
                        o2r.b();
                        return null;
                    }
                }
            } catch (Exception e) {
                txj.e("WeexAsyncPreLoadUtil", str2 + Log.getStackTraceString(e));
            }
            synchronized (syj.class) {
                if (str != null && str.equals(b)) {
                    aVar = f28362a;
                    aVar2 = null;
                    f28362a = null;
                    b = null;
                }
                txj.e("WeexAsyncPreLoadUtil", "directPreload-DestroyPreResult url: " + b);
                aVar2 = f28362a;
                aVar = null;
                f28362a = null;
                b = null;
            }
            if (aVar2 != null) {
                aVar2.destroy();
            }
            if (aVar != null) {
                o2r.b();
                return aVar;
            }
            WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
            WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
            weexUnicornConfig.k(true);
            weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
            weexInstanceConfig.s(weexUnicornConfig);
            t5x b2 = b.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
            fvo p = xmo.p(context);
            b2.c(p.c, p.b);
            b2.initWithURL(str);
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder("async-direct-");
            int i = c;
            c = 1 + i;
            sb.append(i);
            String sb2 = sb.toString();
            jSONObject.put("ndWeexInitType", (Object) sb2);
            if (!r19.C0()) {
                txj.e(txj.TAG_TIP, "Native-ndWeexInitType:" + sb2);
            }
            b2.render(b.e().b(jSONObject));
            b6x.a a2 = b2.a();
            o2r.b();
            return a2;
        } catch (Throwable th) {
            o2r.b();
            throw th;
        }
    }

    public static void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda20fa8", new Object[]{context, str});
            return;
        }
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.k(true);
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        weexInstanceConfig.s(weexUnicornConfig);
        t5x b2 = b.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        fvo p = xmo.p(context);
        b2.c(p.c, p.b);
        b2.initWithURL(str);
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder("async-pre-");
        int i = c;
        c = 1 + i;
        sb.append(i);
        String sb2 = sb.toString();
        jSONObject.put("ndWeexInitType", (Object) sb2);
        jSONObject.put("instanceCache", (Object) "true");
        if (!r19.C0()) {
            txj.e(txj.TAG_TIP, "Native-ndWeexInitType:" + sb2);
        }
        b2.render(b.e().b(jSONObject));
        txj.e("WeexAsyncPreLoadUtil", "onInstanceCreatedInMain , result create , url = " + str);
        l(b2.a(), str);
    }

    public static void m(Context context, String str, b6x b6xVar, JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5970f1", new Object[]{context, str, b6xVar, jSONObject, new Integer(i), new Integer(i2)});
            return;
        }
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.k(true);
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        weexInstanceConfig.s(weexUnicornConfig);
        t5x b2 = b.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        if (i > 0 && i2 > 0 && !r19.B()) {
            txj.e("WeexAsyncPreLoadUtil", "WeexUseContainerSize: containerViewWidth:" + i + " containerViewHeight:" + i2);
        } else if (i2 > 0) {
            fvo p = xmo.p(context);
            i = p.c;
            txj.e("WeexAsyncPreLoadUtil", "WeexUseContainerSize: model.mWidth:" + p.c + " containerViewHeight:" + i2);
        } else {
            fvo p2 = xmo.p(context);
            i = p2.c;
            i2 = p2.b;
        }
        b2.c(i, i2);
        b2.initWithURL(str);
        JSONObject jSONObject2 = new JSONObject();
        StringBuilder sb = new StringBuilder("async-cb-");
        int i3 = c;
        c = 1 + i3;
        sb.append(i3);
        String sb2 = sb.toString();
        jSONObject2.put("ndWeexInitType", (Object) sb2);
        if (!r19.C0()) {
            txj.e(txj.TAG_TIP, "Native-ndWeexInitType:" + sb2);
        }
        if (jSONObject != null) {
            if (r19.u()) {
                txj.e(txj.TAG_TIP, "prePutRenderDataAbort: onAsyncCbWeex skip put renderData");
            } else {
                jSONObject2.putAll(jSONObject);
            }
        }
        b2.render(b.e().b(jSONObject2));
        b2.b(b6xVar);
    }

    public static boolean b(JSONObject jSONObject, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f014f00d", new Object[]{jSONObject, ue7Var})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.containsKey(ND_SERVER_FORCE_ALIGN_PREF_HOME_URL)) {
            if (jSONObject == null || !jSONObject.containsKey(ND_CLIENT_ALIGN_PREF_HOME_URL)) {
                if (ue7Var != null) {
                    return a(ue7Var);
                }
                if (r19.F0()) {
                    txj.e(txj.TAG_TIP, "AutoAlignWeexUrl ,  node is null , hitServerWeexUrl true. ");
                    return true;
                }
                txj.e(txj.TAG_TIP, "AutoAlignWeexUrl ,  node is null , hitServerWeexUrl false. ");
                return false;
            } else if ("true".equals(jSONObject.get(ND_CLIENT_ALIGN_PREF_HOME_URL))) {
                return true;
            } else {
                txj.e(txj.TAG_TIP, "ClientAutoAlignWeexUrl，瞬开接口没有支持 prefhome 地址，二跳时接口也不支持。");
                return false;
            }
        } else if ("true".equals(jSONObject.get(ND_SERVER_FORCE_ALIGN_PREF_HOME_URL))) {
            return true;
        } else {
            txj.e(txj.TAG_TIP, "ServerAutoAlignWeexUrl，瞬开接口没有支持 prefhome 地址，二跳时接口也不支持。");
            return false;
        }
    }

    public static boolean c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6c67f7a", new Object[]{str, str2, str3})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str3);
        String string = parseObject.getString("type");
        txj.e("WeexAsyncPreLoadUtil", "准备过滤: weexFilterType: " + string + " preloadType:" + str);
        if ("skipUrl".equals(string)) {
            String string2 = parseObject.getString("downgradeType");
            if (string2 == null || !string2.contains(str)) {
                JSONArray jSONArray = parseObject.getJSONArray("urlList");
                if (jSONArray != null) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        String string3 = jSONArray.getString(i);
                        if (string3 != null && str2 != null && str2.contains(string3)) {
                            String str4 = "命中过滤: weexFilterType:skipUrl preloadType:" + str + " filterUrl:" + string3 + " mainPicUrl:" + str2;
                            txj.e("WeexAsyncPreLoadUtil", str4);
                            String str5 = "Monitor_NewDetail_FilterWeexSkipUrl_" + str;
                            q0j.g("eventProcess", str5, null);
                            qyj.a(str5, str4);
                            return true;
                        }
                    }
                }
            } else {
                txj.e("WeexAsyncPreLoadUtil", "命中降级: weexFilterType: " + string + " preloadType:" + str + " downgradeType:" + string2);
                return false;
            }
        } else if ("checkV2Url".equals(string)) {
            String string4 = parseObject.getString("downgradeType");
            if (string4 != null && string4.contains(str)) {
                txj.e("WeexAsyncPreLoadUtil", "命中降级: weexFilterType: " + string + " preloadType:" + str + " downgradeType:" + string4);
                return false;
            } else if (str2 != null && !jxh.d(str2)) {
                String str6 = "命中过滤: weexFilterType:checkV2Url preloadType:" + str + " mainPicUrl:" + str2;
                txj.e("WeexAsyncPreLoadUtil", str6);
                String str7 = "Monitor_NewDetail_FilterWeexSkipUrl_" + str;
                q0j.g("eventProcess", str7, null);
                qyj.a(str7, str6);
                return true;
            }
        } else {
            txj.e("WeexAsyncPreLoadUtil", "降级:无法识别的类型。weexFilterType:" + string);
        }
        return false;
    }
}
