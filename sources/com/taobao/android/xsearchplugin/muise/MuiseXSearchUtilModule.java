package com.taobao.android.xsearchplugin.muise;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.mtop.MUSMtopModule;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.HashMap;
import tb.cnx;
import tb.f64;
import tb.fj4;
import tb.j3p;
import tb.l8j;
import tb.p80;
import tb.pvh;
import tb.t2o;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MuiseXSearchUtilModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String METHOD_COMMIT_CLICK = "commitClick";
    public static final String METHOD_COMMIT_EXPOSE = "commitExpose";
    public static final String METHOD_REQUEST_LOST_FOCUS = "requestLostFocus";
    public static final String METHOD_UPDATE_STORAGE = "updateStorage";
    public static final String MODULE_NAME = "xsearchUtil";
    public static boolean REGISTERED = false;
    public static volatile fj4 sConstantAdapter;
    private MUSMtopModule mtopDelegate;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements pvh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f10037a;

        public a(MuiseXSearchUtilModule muiseXSearchUtilModule, pvh pvhVar) {
            this.f10037a = pvhVar;
        }

        @Override // tb.pvh
        public void a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
            } else {
                this.f10037a.a(objArr);
            }
        }

        @Override // tb.pvh
        public void b(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
            } else {
                this.f10037a.b(objArr);
            }
        }

        @Override // tb.pvh
        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else {
                this.f10037a.release();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements pvh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f10038a;

        public b(MuiseXSearchUtilModule muiseXSearchUtilModule, pvh pvhVar) {
            this.f10038a = pvhVar;
        }

        @Override // tb.pvh
        public void a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
            } else {
                this.f10038a.a(objArr);
            }
        }

        @Override // tb.pvh
        public void b(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
            } else {
                this.f10038a.b(objArr);
            }
        }

        @Override // tb.pvh
        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else {
                this.f10038a.release();
            }
        }
    }

    static {
        t2o.a(993002152);
    }

    public MuiseXSearchUtilModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private void ensureMtopDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a4f1d2", new Object[]{this});
        } else if (this.mtopDelegate == null) {
            this.mtopDelegate = new MUSMtopModule("mtop", (MUSDKInstance) getInstance());
        }
    }

    private String extractRequestAlias(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b21ceb19", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("alias");
        return TextUtils.isEmpty(string) ? "muise" : string;
    }

    public static /* synthetic */ Object ipc$super(MuiseXSearchUtilModule muiseXSearchUtilModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/MuiseXSearchUtilModule");
    }

    private void performAction(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f368568", new Object[]{this, str, jSONObject, aVar, aVar2});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (tag instanceof cnx) {
            ((cnx) tag).K(str, jSONObject, aVar, aVar2);
        }
    }

    @MUSMethod
    public void click(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fe32c1", new Object[]{this, jSONObject});
        } else {
            performAction("commitClick", jSONObject, null, null);
        }
    }

    @MUSMethod
    public void expose(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9705a05", new Object[]{this, jSONObject});
        } else {
            performAction("commitExpose", jSONObject, null, null);
        }
    }

    @MUSMethod(uiThread = false)
    public JSONObject getLocalParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b66d71c2", new Object[]{this});
        }
        String a2 = sConstantAdapter.a();
        String utdid = sConstantAdapter.getUtdid();
        String ttid = sConstantAdapter.getTtid();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(a2)) {
            jSONObject.put("sversion", (Object) a2);
            jSONObject.put("utd_id", (Object) utdid);
            jSONObject.put("ttid", (Object) ttid);
        }
        return jSONObject;
    }

    @MUSMethod(uiThread = false)
    public void request(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f22d2c", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        ensureMtopDelegate();
        rewriteRequestParams(jSONObject, extractRequestAlias(jSONObject));
        this.mtopDelegate.request(jSONObject, new b(this, pvhVar), pvhVar2);
    }

    @MUSMethod(uiThread = true)
    public void requestLostFocus(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb29c6b5", new Object[]{this, pvhVar});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (tag instanceof cnx) {
            ((cnx) tag).K("requestLostFocus", null, l8j.a(pvhVar), null);
        }
    }

    @MUSMethod(uiThread = false)
    public void send(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afb396a", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        ensureMtopDelegate();
        rewriteRequestParams(jSONObject, extractRequestAlias(jSONObject));
        this.mtopDelegate.send(jSONObject.toString(), new a(this, pvhVar));
    }

    @MUSMethod(uiThread = true)
    public void updateStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b3a517", new Object[]{this, jSONObject});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (tag instanceof cnx) {
            ((cnx) tag).K("updateStorage", jSONObject, null, null);
        }
    }

    public static void install(fj4 fj4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ead74", new Object[]{fj4Var});
        } else if (!REGISTERED) {
            REGISTERED = true;
            sConstantAdapter = fj4Var;
            MUSEngine.registerModule("xsearchUtil", MuiseXSearchUtilModule.class);
        }
    }

    private void rewriteRequestParams(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea96bea", new Object[]{this, jSONObject, str});
            return;
        }
        yko g = j3p.g();
        if (g != null && !g.g().isDebug()) {
            HashMap hashMap = new HashMap();
            p80.p(g, hashMap, str, false);
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            jSONObject3.putAll(hashMap);
            Object obj = jSONObject3.get("params");
            if (obj != null && (jSONObject2 = jSONObject3.getJSONObject("params")) != null) {
                jSONObject2.putAll(hashMap);
                if (obj instanceof String) {
                    jSONObject3.put("params", (Object) jSONObject2.toJSONString());
                } else if (obj instanceof JSONObject) {
                    jSONObject3.put("params", (Object) jSONObject2);
                }
            }
        }
    }

    @MUSMethod
    public void reportChituSE(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907049c6", new Object[]{this, jSONObject});
            return;
        }
        yko g = j3p.g();
        if (g != null) {
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string) && (jSONObject2 = jSONObject.getJSONObject("response")) != null) {
                String string2 = jSONObject.getString("alias");
                if (TextUtils.isEmpty(string2)) {
                    string2 = "xsl";
                }
                g.c().f(string, jSONObject2.toString().getBytes(), string2, true);
                p80.b(j3p.g(), string, string2, jSONObject2);
            }
        }
    }
}
