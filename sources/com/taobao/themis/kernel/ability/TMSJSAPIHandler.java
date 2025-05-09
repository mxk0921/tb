package com.taobao.themis.kernel.ability;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import tb.arf;
import tb.jr;
import tb.k8s;
import tb.mcs;
import tb.ncs;
import tb.p8s;
import tb.q9s;
import tb.t2o;
import tb.uq;
import tb.vbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSJSAPIHandler implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOMAIN_KEY = "__canalDomain";
    public static final String DOMAIN_WIDGET_FRAMEWORK = "widgetFramework";
    private static final String TAG = "TMSAbilityHandler";
    private volatile boolean mActive = true;
    private ITMSPage mPage;
    private static List<String> ARRAY_BUFFER_API_LIST = new ArrayList();
    public static final Map<String, Long> API_CALL_TIME_MAP = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13559a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ c d;

        public a(String str, String str2, JSONObject jSONObject, c cVar) {
            this.f13559a = str;
            this.b = str2;
            this.c = jSONObject;
            this.d = cVar;
        }

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                return;
            }
            ITMSPage access$000 = TMSJSAPIHandler.access$000(TMSJSAPIHandler.this);
            if (TMSJSAPIHandler.access$100(TMSJSAPIHandler.this) && access$000 != null && jrVar != null) {
                TMSJSAPIHandler.access$200(TMSJSAPIHandler.this, this.f13559a, this.b, jrVar);
                JSONObject a2 = jrVar.a();
                String string = this.c.getString("action");
                if (a2 == null || string == null || !TMSJSAPIHandler.access$300().contains(string) || !a2.containsKey("dataType") || !a2.containsKey("data") || !TextUtils.equals("ArrayBuffer".toLowerCase(), a2.getString("dataType").toLowerCase()) || !TMSInstanceExtKt.q(access$000.getInstance())) {
                    this.d.onCallBack(a2);
                    return;
                }
                byte[] bytes = a2.getBytes("data");
                a2.remove("data");
                this.d.a(a2, bytes);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13560a;
        public final /* synthetic */ String b;
        public final /* synthetic */ jr c;
        public final /* synthetic */ long d;

        public b(ITMSPage iTMSPage, String str, jr jrVar, long j) {
            this.f13560a = iTMSPage;
            this.b = str;
            this.c = jrVar;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vbs.a(this.f13560a.getInstance(), this.b, this.c.d(), this.d, this.c.b(), this.c.c());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(JSONObject jSONObject, byte[] bArr);

        void onCallBack(JSONObject jSONObject);
    }

    public TMSJSAPIHandler(ITMSPage iTMSPage) {
        this.mPage = iTMSPage;
    }

    public static /* synthetic */ ITMSPage access$000(TMSJSAPIHandler tMSJSAPIHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("7ddeaa6d", new Object[]{tMSJSAPIHandler});
        }
        return tMSJSAPIHandler.mPage;
    }

    public static /* synthetic */ boolean access$100(TMSJSAPIHandler tMSJSAPIHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc65a099", new Object[]{tMSJSAPIHandler})).booleanValue();
        }
        return tMSJSAPIHandler.mActive;
    }

    public static /* synthetic */ void access$200(TMSJSAPIHandler tMSJSAPIHandler, String str, String str2, jr jrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba9a6b5", new Object[]{tMSJSAPIHandler, str, str2, jrVar});
        } else {
            tMSJSAPIHandler.onCallback(str, str2, jrVar);
        }
    }

    public static /* synthetic */ List access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e8603dcd", new Object[0]);
        }
        return ARRAY_BUFFER_API_LIST;
    }

    private void onInvoke(String str, String str2, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8101b86e", new Object[]{this, str, str2, new Boolean(z), jSONObject});
            return;
        }
        ITMSPage iTMSPage = this.mPage;
        API_CALL_TIME_MAP.put(str, Long.valueOf(System.currentTimeMillis()));
        if (iTMSPage != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", (Object) jSONObject.getString("action"));
                jSONObject2.put("name", (Object) str2);
                jSONObject2.put("sync", (Object) Boolean.valueOf(z));
                jSONObject2.put("params", (Object) jSONObject);
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject.getString("api") != null) {
                    jSONObject3.put("api", (Object) jSONObject.getString("api"));
                }
                if (jSONObject.getString("url") != null) {
                    jSONObject3.put("url", (Object) jSONObject.getString("url"));
                }
                jSONObject2.put("extra", (Object) jSONObject3);
                mcs.e(mcs.MODULE_JSBRIDGE, mcs.EVENT_ON_INVOKE, ncs.c(iTMSPage), str, jSONObject2);
            } catch (Throwable th) {
                TMSLogger.c(TAG, "", th);
            }
        }
    }

    public void terminal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26677903", new Object[]{this});
            return;
        }
        this.mActive = false;
        this.mPage = null;
        API_CALL_TIME_MAP.clear();
    }

    private boolean isCallFromFramework(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e57db21", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || !jSONObject.containsKey(DOMAIN_KEY)) {
            return false;
        }
        return "widgetFramework".equals(jSONObject.getString(DOMAIN_KEY));
    }

    public JSONObject callTMSAbilitySync(String str, JSONObject jSONObject) {
        ApiContext.Source source;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aaf8c816", new Object[]{this, str, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (this.mActive && this.mPage != null) {
            if (TextUtils.equals("internalAPI", str)) {
                str = jSONObject.getString("method");
                jSONObject = jSONObject.getJSONObject("param");
            }
            String d = mcs.d(ncs.c(this.mPage));
            if (TextUtils.isEmpty(str)) {
                TMSLogger.b(TAG, "invalid param, api name is null");
                return jSONObject2;
            }
            TMSLogger.a(TAG, "api name: " + str);
            onInvoke(d, str, true, jSONObject);
            ApiContext.a c2 = new ApiContext.a().g(d).b(this.mPage.getInstance().I()).c(this.mPage);
            if (isCallFromFramework(jSONObject)) {
                source = ApiContext.Source.FRAMEWORK;
            } else {
                source = ApiContext.Source.INSTANCE;
            }
            ApiContext.a f = c2.f(source);
            if (q9s.w1()) {
                f.e(true);
            }
            jr g = k8s.j().g(this.mPage, str, jSONObject, f.a(), 3000L);
            jSONObject2.putAll(g.a());
            onCallback(d, str, g);
        }
        return jSONObject2;
    }

    private void onCallback(String str, String str2, jr jrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b5abe0", new Object[]{this, str, str2, jrVar});
            return;
        }
        ITMSPage iTMSPage = this.mPage;
        if (iTMSPage != null && jrVar != null) {
            if ("fsManage".equals(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", (Object) Boolean.valueOf(jrVar.d()));
                jSONObject.put("errorCode", (Object) jrVar.b());
                jSONObject.put("errorMsg", (Object) jrVar.c());
                mcs.e(mcs.MODULE_JSBRIDGE, mcs.EVENT_ON_CALLBACK, ncs.c(iTMSPage), str, arf.b(new Pair("response", jSONObject)));
            } else {
                mcs.e(mcs.MODULE_JSBRIDGE, mcs.EVENT_ON_CALLBACK, ncs.c(iTMSPage), str, arf.b(new Pair("response", jrVar.a())));
            }
            Long l = API_CALL_TIME_MAP.get(str);
            if (l != null) {
                ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new b(iTMSPage, str2, jrVar, System.currentTimeMillis() - l.longValue()));
            }
        }
    }

    public void callTMSAbilityAsync(String str, JSONObject jSONObject, c cVar) {
        ApiContext.Source source;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665dbf2b", new Object[]{this, str, jSONObject, cVar});
            return;
        }
        try {
            if (this.mActive && this.mPage != null) {
                if (TextUtils.equals("internalAPI", str)) {
                    str = jSONObject.getString("method");
                    jSONObject = jSONObject.getJSONObject("param");
                }
                if (TextUtils.isEmpty(str)) {
                    TMSLogger.b(TAG, "invalid param, api name is null");
                    return;
                }
                TMSLogger.a(TAG, "api name: " + str);
                String d = mcs.d(ncs.c(this.mPage));
                onInvoke(d, str, false, jSONObject);
                k8s j = k8s.j();
                ITMSPage iTMSPage = this.mPage;
                ApiContext.a c2 = new ApiContext.a().g(d).d(true ^ TextUtils.equals("internalAPI", str)).b(this.mPage.getInstance().I()).c(this.mPage);
                if (isCallFromFramework(jSONObject)) {
                    source = ApiContext.Source.FRAMEWORK;
                } else {
                    source = ApiContext.Source.INSTANCE;
                }
                j.c(iTMSPage, str, jSONObject, c2.f(source).a(), new a(d, str, jSONObject, cVar));
            }
        } catch (Throwable unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", (Object) Boolean.FALSE);
            try {
                cVar.onCallBack(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(839909418);
        ARRAY_BUFFER_API_LIST.add("readFile");
    }
}
