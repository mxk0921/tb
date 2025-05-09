package com.taobao.mytaobao.basement.weex;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.BasementViewController;
import com.taobao.mytaobao.basement.a;
import com.taobao.tao.Globals;
import com.taobao.tao.MytaobaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.br0;
import tb.ckf;
import tb.f3j;
import tb.i59;
import tb.lgj;
import tb.p3j;
import tb.pvh;
import tb.rb;
import tb.s0j;
import tb.s0m;
import tb.s32;
import tb.sc;
import tb.suv;
import tb.t2o;
import tb.tsq;
import tb.uj3;
import tb.uuu;
import tb.uv6;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BasementFeedDataProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DB_KEY_FEED_DATA = "mtbBasementFeedData";
    public static final BasementFeedDataProvider INSTANCE = new BasementFeedDataProvider();
    public static final String PRELOAD_TYPE_DELAY = "delay";
    public static final String PRELOAD_TYPE_INTIME = "inTime";

    /* renamed from: a  reason: collision with root package name */
    public static volatile i59 f11184a;
    public static volatile pvh b;
    public static volatile int c;
    public static volatile boolean d;
    public static volatile long e;
    public static volatile String f;
    public static volatile JSONObject g;
    public static boolean h;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TLog.loge("BasementFeedDP", "删磁盘");
            lgj.d(BasementFeedDataProvider.DB_KEY_FEED_DATA);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11185a;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f11186a;

            public a(List list) {
                this.f11186a = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (String str : this.f11186a) {
                    TLog.loge("BasementFeedDP", "img预请求:" + str);
                    s0m.B().T(str).releasableDrawable(true).fetch();
                }
            }
        }

        public b(String str) {
            this.f11185a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONArray jSONArray;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = JSON.parseObject(this.f11185a).getJSONObject("data");
                if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray("imgJsonPath")) == null)) {
                    ArrayList arrayList = new ArrayList();
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (!(jSONObject2 == null || (string = jSONObject2.getString("keyPath")) == null)) {
                            Object k = BasementFeedDataProvider.k(BasementFeedDataProvider.INSTANCE, jSONObject, string);
                            if (!(k instanceof String)) {
                                k = null;
                            }
                            String str = (String) k;
                            if (str != null) {
                                TLog.loge("BasementFeedDP", "imgUrl=" + str);
                                if (!TextUtils.isEmpty(str)) {
                                    arrayList.add(str + "_760x760q90.jpg_.webp");
                                }
                            }
                        }
                    }
                    Log.e("dsw", "img预请求请求222");
                    uuu.b.post(new a(arrayList));
                }
            } catch (Throwable th) {
                TLog.loge("BasementFeedDP", "considerPreloadFirstCardImg onError, " + th);
            }
        }
    }

    static {
        t2o.a(745537629);
    }

    public static final /* synthetic */ void a(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42423c3", new Object[]{basementFeedDataProvider});
        } else {
            basementFeedDataProvider.q();
        }
    }

    public static final /* synthetic */ MtopRequest b(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("d7ea814a", new Object[]{basementFeedDataProvider});
        }
        return basementFeedDataProvider.r();
    }

    public static final /* synthetic */ boolean c(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdace3c", new Object[]{basementFeedDataProvider})).booleanValue();
        }
        return basementFeedDataProvider.s();
    }

    public static final /* synthetic */ void d(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ace29b", new Object[]{basementFeedDataProvider});
        } else {
            basementFeedDataProvider.u();
        }
    }

    public static final /* synthetic */ boolean e(BasementFeedDataProvider basementFeedDataProvider, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cbf97f0", new Object[]{basementFeedDataProvider, str})).booleanValue();
        }
        return basementFeedDataProvider.v(str);
    }

    public static final /* synthetic */ int f(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6734b233", new Object[]{basementFeedDataProvider})).intValue();
        }
        return c;
    }

    public static final /* synthetic */ boolean g(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa3bd0e4", new Object[]{basementFeedDataProvider})).booleanValue();
        }
        return d;
    }

    public static final /* synthetic */ i59 h(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i59) ipChange.ipc$dispatch("41be21d4", new Object[]{basementFeedDataProvider});
        }
        return f11184a;
    }

    public static final /* synthetic */ String i(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b09f69", new Object[]{basementFeedDataProvider});
        }
        return f;
    }

    public static final /* synthetic */ String j(BasementFeedDataProvider basementFeedDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3f1e215", new Object[]{basementFeedDataProvider});
        }
        return basementFeedDataProvider.C();
    }

    public static final /* synthetic */ Object k(BasementFeedDataProvider basementFeedDataProvider, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ee6a568", new Object[]{basementFeedDataProvider, jSONObject, str});
        }
        return basementFeedDataProvider.D(jSONObject, str);
    }

    public static final /* synthetic */ boolean l(BasementFeedDataProvider basementFeedDataProvider, i59 i59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("935f710c", new Object[]{basementFeedDataProvider, i59Var})).booleanValue();
        }
        return basementFeedDataProvider.E(i59Var);
    }

    public static final /* synthetic */ void m(BasementFeedDataProvider basementFeedDataProvider, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc200a9", new Object[]{basementFeedDataProvider, jSONObject});
        } else {
            basementFeedDataProvider.G(jSONObject);
        }
    }

    public static final /* synthetic */ void n(BasementFeedDataProvider basementFeedDataProvider, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51210cf", new Object[]{basementFeedDataProvider, new Integer(i)});
        } else {
            c = i;
        }
    }

    public static final /* synthetic */ void o(BasementFeedDataProvider basementFeedDataProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73d6700", new Object[]{basementFeedDataProvider, new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static final /* synthetic */ void p(BasementFeedDataProvider basementFeedDataProvider, i59 i59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef6e2f0", new Object[]{basementFeedDataProvider, i59Var});
        } else {
            f11184a = i59Var;
        }
    }

    public final i59 A(String str, String str2, Long l) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i59) ipChange.ipc$dispatch("8c2e086", new Object[]{this, str, str2, l});
        }
        ckf.h(str, "feedData");
        ckf.h(str2, PreloadTaskEntity.SOURCE_FROM);
        if (l != null) {
            return new i59(str, str2, l.longValue());
        }
        try {
            Long l2 = JSON.parseObject(str).getJSONObject("data").getLong("timestamp");
            ckf.c(l2, "JSONObject.parseObject(f…ta\").getLong(\"timestamp\")");
            j = l2.longValue();
        } catch (Throwable unused) {
            j = 0;
        }
        return new i59(str, str2, j);
    }

    public final String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        JSONObject jSONObject = g;
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("initApi");
        String string = jSONObject2 != null ? jSONObject2.getString("unitStrategy") : null;
        if (ckf.b(string, "GUIDE_ONLINE_DOMAIN")) {
            return "UNIT_GUIDE";
        }
        if (ckf.b(string, "TRADE_ONLINE_DOMAIN")) {
            return "UNIT_TRADE";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public final Object D(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("59e2ee11", new Object[]{this, jSONObject, str});
        }
        for (String str2 : wsq.z0(str, new String[]{"."}, false, 0, 6, null)) {
            if (!tsq.I(str2, "[", false, 2, null) || !tsq.w(str2, "]", false, 2, null)) {
                boolean z = jSONObject instanceof JSONObject;
                JSONObject jSONObject2 = jSONObject;
                if (!z) {
                    jSONObject2 = null;
                }
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null || (jSONObject = jSONObject3.get(str2)) == null) {
                    return null;
                }
            } else {
                String substring = str2.substring(1, str2.length() - 1);
                ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (!(jSONObject instanceof JSONArray)) {
                    jSONObject = null;
                }
                JSONArray jSONArray = (JSONArray) jSONObject;
                if (jSONArray == null || (jSONObject = jSONArray.get(parseInt)) == null) {
                    return null;
                }
            }
        }
        return jSONObject;
    }

    public final void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab38b19", new Object[]{this, jSONObject});
            return;
        }
        if (f == null) {
            y(jSONObject);
        }
        if (f == null) {
            TLog.loge("BasementFeedDP", "loadBasementFeedDataWhenOpenPage,preloadType is null");
            return;
        }
        if (f11184a != null) {
            i59 i59Var = f11184a;
            if (i59Var == null) {
                ckf.s();
                throw null;
            } else if (!E(i59Var)) {
                TLog.loge("BasementFeedDP", "页面进入，feed数据数据过期");
                f11184a = null;
            }
        }
        if (ckf.b(f, PRELOAD_TYPE_INTIME)) {
            f11184a = null;
        }
        BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1 basementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1 = BasementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1.INSTANCE;
        if (f11184a != null) {
            uuu.b.postDelayed(basementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1, 3000L);
        } else {
            basementFeedDataProvider$loadBasementFeedDataWhenOpenPage$task$1.run();
        }
    }

    public final void G(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847b0ea0", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                JSONObject a2 = com.taobao.mytaobao.basement.a.a(jSONObject.getJSONObject("data"));
                if (a2 != null) {
                    g = a2;
                    y(g);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final JSONObject H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e0bd068", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put("data", (Object) str);
            jSONObject.put((JSONObject) "preloadData", jSONObject2.toJSONString());
            jSONObject.put((JSONObject) rb.RESULT_KEY, "HY_SUCCESS");
        }
        return jSONObject;
    }

    public final suv.a I(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suv.a) ipChange.ipc$dispatch("685c70e0", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("pageUTParams") : null;
        String name = BasementViewController.class.getName();
        if (jSONObject2 == null || (str = jSONObject2.getString("pageName")) == null) {
            str = s32.MODULE_NAME;
        }
        if (jSONObject2 == null || (str2 = jSONObject2.getString("spm")) == null) {
            str2 = "friendsquare.27994277.0.0";
        }
        return new suv.a(name, str, str2);
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50576c", new Object[]{this});
        } else {
            Coordinator.execute(a.INSTANCE);
        }
    }

    public final void t(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6c7ab5", new Object[]{this, str});
            return;
        }
        TLog.loge("BasementFeedDP", "launch, isPageCreated=" + MytaobaoApplication.isPageCreated);
        if (!MytaobaoApplication.isPageCreated) {
            p3j.g(new Runnable() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str2 = str;
                    JSONObject parseObject = str2 == null ? null : JSON.parseObject(str2);
                    BasementFeedDataProvider basementFeedDataProvider = BasementFeedDataProvider.INSTANCE;
                    BasementFeedDataProvider.m(basementFeedDataProvider, parseObject);
                    if (ckf.b(BasementFeedDataProvider.i(basementFeedDataProvider), "delay")) {
                        String c2 = lgj.c(BasementFeedDataProvider.DB_KEY_FEED_DATA);
                        i59 A = c2 != null ? basementFeedDataProvider.A(c2, i59.SOURCE_FROM_DISK, null) : null;
                        if (A != null && BasementFeedDataProvider.l(basementFeedDataProvider, A)) {
                            TLog.loge("BasementFeedDP", "launch,本地有可用数据，则不需要预请求");
                            BasementFeedDataProvider.p(basementFeedDataProvider, A);
                        } else if (BasementFeedDataProvider.f(basementFeedDataProvider) >= 1 || a.g()) {
                            TLog.loge("BasementFeedDP", "launch,加载中 or 降级， 不预先请求");
                        } else {
                            BasementFeedDataProvider.n(basementFeedDataProvider, 1);
                            MtopRequest b2 = BasementFeedDataProvider.b(basementFeedDataProvider);
                            if (b2 == null) {
                                TLog.loge("BasementFeedDP", "预加载API不正确");
                                BasementFeedDataProvider.n(basementFeedDataProvider, 0);
                                return;
                            }
                            Application application = Globals.getApplication();
                            ckf.c(application, "Globals.getApplication()");
                            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), b2, TaoHelper.getTTID());
                            String j = BasementFeedDataProvider.j(basementFeedDataProvider);
                            if (j != null) {
                                build.setUnitStrategy(j);
                            }
                            IRemoteBaseListener basementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1$run$mTopListener$1 = new IRemoteBaseListener() { // from class: com.taobao.mytaobao.basement.weex.BasementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1$run$mTopListener$1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                                    byte[] bArr;
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    String str3 = null;
                                    if (mtopResponse != null) {
                                        bArr = mtopResponse.getBytedata();
                                    } else {
                                        bArr = null;
                                    }
                                    if (bArr != null) {
                                        BasementFeedDataProvider basementFeedDataProvider2 = BasementFeedDataProvider.INSTANCE;
                                        BasementFeedDataProvider.p(basementFeedDataProvider2, basementFeedDataProvider2.A(new String(bArr, uj3.UTF_8), i59.SOURCE_FROM_LAUNCH_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                                    }
                                    BasementFeedDataProvider basementFeedDataProvider3 = BasementFeedDataProvider.INSTANCE;
                                    BasementFeedDataProvider.n(basementFeedDataProvider3, 2);
                                    i59 h2 = BasementFeedDataProvider.h(basementFeedDataProvider3);
                                    if (h2 != null) {
                                        str3 = h2.f21099a;
                                    }
                                    BasementFeedDataProvider.e(basementFeedDataProvider3, str3);
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                                    byte[] bArr;
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    String str3 = null;
                                    if (mtopResponse != null) {
                                        bArr = mtopResponse.getBytedata();
                                    } else {
                                        bArr = null;
                                    }
                                    if (bArr != null) {
                                        BasementFeedDataProvider basementFeedDataProvider2 = BasementFeedDataProvider.INSTANCE;
                                        BasementFeedDataProvider.p(basementFeedDataProvider2, basementFeedDataProvider2.A(new String(bArr, uj3.UTF_8), i59.SOURCE_FROM_LAUNCH_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                                    }
                                    BasementFeedDataProvider basementFeedDataProvider3 = BasementFeedDataProvider.INSTANCE;
                                    BasementFeedDataProvider.n(basementFeedDataProvider3, 2);
                                    i59 h2 = BasementFeedDataProvider.h(basementFeedDataProvider3);
                                    if (h2 != null) {
                                        str3 = h2.f21099a;
                                    }
                                    BasementFeedDataProvider.e(basementFeedDataProvider3, str3);
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                        return;
                                    }
                                    TLog.loge("BasementFeedDP", "launch,预请求成功");
                                    byte[] bytedata = mtopResponse != null ? mtopResponse.getBytedata() : null;
                                    if (bytedata != null) {
                                        BasementFeedDataProvider basementFeedDataProvider2 = BasementFeedDataProvider.INSTANCE;
                                        BasementFeedDataProvider.p(basementFeedDataProvider2, basementFeedDataProvider2.A(new String(bytedata, uj3.UTF_8), i59.SOURCE_FROM_LAUNCH_PRELOAD, Long.valueOf(System.currentTimeMillis())));
                                    }
                                    BasementFeedDataProvider basementFeedDataProvider3 = BasementFeedDataProvider.INSTANCE;
                                    BasementFeedDataProvider.n(basementFeedDataProvider3, 2);
                                    i59 h2 = BasementFeedDataProvider.h(basementFeedDataProvider3);
                                    boolean e2 = BasementFeedDataProvider.e(basementFeedDataProvider3, h2 != null ? h2.f21099a : null);
                                    if (BasementFeedDataProvider.h(basementFeedDataProvider3) == null) {
                                        return;
                                    }
                                    if (e2) {
                                        BasementFeedDataProvider.a(basementFeedDataProvider3);
                                        return;
                                    }
                                    i59 h3 = BasementFeedDataProvider.h(basementFeedDataProvider3);
                                    if (h3 != null) {
                                        String str3 = h3.f21099a;
                                        ckf.c(str3, "mFeedDataModel!!.feedData");
                                        basementFeedDataProvider3.w(str3);
                                        TLog.loge("BasementFeedDP", "launch,存磁盘");
                                        i59 h4 = BasementFeedDataProvider.h(basementFeedDataProvider3);
                                        if (h4 != null) {
                                            JSONObject parseObject2 = JSON.parseObject(h4.f21099a);
                                            if (!parseObject2.getJSONObject("data").containsKey("timestamp")) {
                                                parseObject2.getJSONObject("data").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                                            }
                                            lgj.e(BasementFeedDataProvider.DB_KEY_FEED_DATA, parseObject2.toJSONString());
                                            return;
                                        }
                                        ckf.s();
                                        throw null;
                                    }
                                    ckf.s();
                                    throw null;
                                }
                            };
                            try {
                                MtopResponse syncRequest = build.syncRequest();
                                if (syncRequest == null || !syncRequest.isApiSuccess()) {
                                    basementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1$run$mTopListener$1.onError(build.getRequestType(), syncRequest, null);
                                } else {
                                    basementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1$run$mTopListener$1.onSuccess(build.getRequestType(), syncRequest, null, null);
                                }
                            } catch (Throwable unused) {
                                BasementFeedDataProvider.n(BasementFeedDataProvider.INSTANCE, 2);
                                ckf.c(build, "business");
                                basementFeedDataProvider$considerLoadBasementFeedDataWhenAppLaunch$task$1$run$mTopListener$1.onError(build.getRequestType(), null, null);
                            }
                        }
                    }
                }
            });
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec193c4", new Object[]{this});
        } else if (!ckf.b("delay", f)) {
            TLog.loge("BasementFeedDP", "considerLoadNextOnceData return");
        } else {
            p3j.a(BasementFeedDataProvider$considerLoadNextOnceData$1.INSTANCE, 3000L);
        }
    }

    public final void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c437e44", new Object[]{this, str});
            return;
        }
        ckf.h(str, "feedDataStr");
        Log.e("dsw", "img预请求请求");
        Coordinator.execute(new b(str));
    }

    public final void y(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94835f01", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("initApi")) != null && (jSONObject3 = jSONObject2.getJSONObject("params")) != null) {
            f = jSONObject3.getString(s0j.MTS_TAG_PRELOAD_TYPE);
            e = jSONObject3.getLongValue("preloadExpireTime");
            if (ckf.b(f, PRELOAD_TYPE_INTIME) && MtbGlobalEnv.v()) {
                f = "delay";
                e = 86400L;
            }
        }
    }

    public final void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b24946e", new Object[]{this, new Boolean(z)});
            return;
        }
        b = null;
        if (!z) {
            c = 0;
            d = false;
            f11184a = null;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f11187a;

        public c(pvh pvhVar) {
            this.f11187a = pvhVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f11187a.b(BasementFeedDataProvider.INSTANCE.H(null));
            TLog.loge("BasementFeedDP", "删磁盘");
            lgj.d(BasementFeedDataProvider.DB_KEY_FEED_DATA);
        }
    }

    public final void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbd0155", new Object[]{this, new Integer(i)});
        } else if (!h) {
            h = true;
            f3j.a(s32.MODULE_NAME, "feedDataHitStatus", "{\"state\":" + i + '}', 1.0d);
        }
    }

    public final boolean E(i59 i59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9aa9b03", new Object[]{this, i59Var})).booleanValue();
        }
        if (ckf.b(i59Var.b, i59.SOURCE_FROM_PAGE_PRELOAD) || ckf.b(f, PRELOAD_TYPE_INTIME)) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = i59Var.c;
        long j2 = (currentTimeMillis - j) / 1000;
        if (j > 0 && j2 < e) {
            return true;
        }
        Log.e("BasementFeedData", "过期过期 delta=" + j2 + " preloadExpireTime=" + e);
        return false;
    }

    public final MtopRequest r() {
        JSONObject jSONObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("d4a6ac73", new Object[]{this});
        }
        JSONObject jSONObject2 = g;
        MtopRequest mtopRequest = null;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("initApi")) == null)) {
            String string = jSONObject.getString("apiMethod");
            String string2 = jSONObject.getString("apiVersion");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                mtopRequest = new MtopRequest();
                mtopRequest.setApiName(string);
                mtopRequest.setVersion(string2);
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put((JSONObject) "personalization", (String) Boolean.valueOf(br0.c().j("AliPrivacySDK")));
                Application application = Globals.getApplication();
                ckf.c(application, "Globals.getApplication()");
                if (ContextCompat.checkSelfPermission(application.getApplicationContext(), "android.permission.READ_CONTACTS") == 0) {
                    z = true;
                }
                jSONObject4.put((JSONObject) "allowContactAccess", (String) Boolean.valueOf(z));
                jSONObject4.put((JSONObject) "deviceLevel", (String) Integer.valueOf(!MtbGlobalEnv.v() ? 1 : 0));
                jSONObject4.put((JSONObject) "isWeex", "true");
                JSONObject jSONObject5 = jSONObject.getJSONObject("params");
                if (jSONObject5 != null) {
                    jSONObject4.putAll(jSONObject5);
                }
                jSONObject3.put((JSONObject) "cursor", jSONObject4.toJSONString());
                mtopRequest.setData(jSONObject3.toJSONString());
            }
        }
        return mtopRequest;
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("575dd0e5", new Object[]{this})).booleanValue();
        }
        i59 i59Var = f11184a;
        if (i59Var == null) {
            return false;
        }
        if (!E(i59Var)) {
            f11184a = null;
            return false;
        }
        c = 2;
        TLog.loge("BasementFeedDP", "page 读内存成功");
        boolean v = v(i59Var.f21099a);
        sc.c("basementPreloadData");
        if (v) {
            q();
        }
        u();
        return true;
    }

    public final boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd4c3d9", new Object[]{this, str})).booleanValue();
        }
        if (b == null) {
            return false;
        }
        TLog.loge("BasementFeedDP", "缓存的weex callback异步回调");
        pvh pvhVar = b;
        if (pvhVar != null) {
            pvhVar.b(H(str));
        }
        uv6.k("给前端成功");
        b = null;
        return true;
    }

    public final JSONObject B(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f14d64b9", new Object[]{this, pvhVar});
        }
        ckf.h(pvhVar, "callback");
        uv6.i("BasementFeedDP", "前端问数据");
        String str = null;
        if (f11184a != null) {
            i59 i59Var = f11184a;
            if (i59Var == null) {
                ckf.s();
                throw null;
            } else if (!E(i59Var)) {
                TLog.loge("BasementFeedDP", "前端问客户端要feed数据,数据过期");
                f11184a = null;
            }
        }
        i59 i59Var2 = f11184a;
        String str2 = i59Var2 != null ? i59Var2.f21099a : null;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder("前端问客户端要feed数据, 内存存在可用数据，数据来源：");
            i59 i59Var3 = f11184a;
            if (i59Var3 != null) {
                str = i59Var3.b;
            }
            sb.append(str);
            TLog.loge("BasementFeedDP", sb.toString());
            q();
            x(2);
            return H(str2);
        } else if (c == 1) {
            TLog.loge("BasementFeedDP", "前端问客户端要feed数据, 数据加载中，hold住");
            b = pvhVar;
            x(1);
            return null;
        } else {
            Coordinator.execute(new c(pvhVar));
            TLog.loge("BasementFeedDP", "前端问客户端要feed数据, 客户端啥都没有");
            x(0);
            return null;
        }
    }
}
