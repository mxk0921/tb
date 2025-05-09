package com.taobao.themis.mix.weex_render;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.cbs;
import tb.ckf;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/mix/weex_render/TMSWeexAPIBridge;", "Lcom/taobao/android/weex_framework/module/MUSModule;", "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "Lcom/taobao/android/weex_framework/MUSDKInstance;", "weexInstance", "<init>", "(Ljava/lang/String;Lcom/taobao/android/weex_framework/MUSDKInstance;)V", "Landroid/content/Context;", "context", "Ltb/bbs;", "getInstance", "(Landroid/content/Context;)Ltb/bbs;", "apiName", "Lcom/alibaba/fastjson/JSONObject;", "args", "Ltb/pvh;", "callback", "Ltb/xhv;", "call", "(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;Ltb/pvh;)V", "callSync", "(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)Lcom/alibaba/fastjson/JSONObject;", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "Companion", "a", "themis_mix_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWeexAPIBridge extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "TMSWeexAPIBridge";
    private final MUSDKInstance weexInstance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(840957971);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements TMSJSAPIHandler.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f13604a;

        public b(pvh pvhVar) {
            this.f13604a = pvhVar;
        }

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.c
        public void a(JSONObject jSONObject, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2885e1d1", new Object[]{this, jSONObject, bArr});
            }
        }

        @Override // com.taobao.themis.kernel.ability.TMSJSAPIHandler.c
        public void onCallBack(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
                this.f13604a.release();
            } else {
                this.f13604a.b(jSONObject);
            }
        }
    }

    static {
        t2o.a(840957970);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWeexAPIBridge(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        ckf.g(mUSDKInstance, "weexInstance");
        this.weexInstance = mUSDKInstance;
    }

    private final bbs getInstance(Context context) {
        cbs cbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("b52524bc", new Object[]{this, context});
        }
        if (context instanceof MutableContextWrapper) {
            try {
                Context baseContext = ((MutableContextWrapper) context).getBaseContext();
                if (baseContext != null) {
                    cbsVar = (cbs) baseContext;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.TMSInstanceBinder");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (context instanceof cbs) {
                cbsVar = (cbs) context;
            }
            cbsVar = null;
        }
        if (cbsVar == null) {
            return null;
        }
        return cbsVar.m1();
    }

    public static /* synthetic */ Object ipc$super(TMSWeexAPIBridge tMSWeexAPIBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/weex_render/TMSWeexAPIBridge");
    }

    @MUSMethod(uiThread = false)
    public final void call(String str, JSONObject jSONObject, pvh pvhVar) {
        TMSJSAPIHandler z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d764630a", new Object[]{this, str, jSONObject, pvhVar});
            return;
        }
        ckf.g(pvhVar, "callback");
        Context a2 = this.weexInstance.getContext().a();
        if (a2 != null) {
            bbs instance = getInstance(a2);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (instance == null) {
                pvhVar.b(TMSWeexAPIBridge$call$1.INSTANCE);
                TMSLogger.b(TAG, "can't find instance");
                return;
            }
            TMSLogger.f(TAG, "Weex call api: " + ((Object) str) + ", params: " + jSONObject);
            ITMSPage topPage = instance.W().getTopPage();
            if (topPage != null && (z = topPage.z()) != null) {
                z.callTMSAbilityAsync(str, jSONObject, new b(pvhVar));
            }
        }
    }

    @MUSMethod(uiThread = false)
    public final JSONObject callSync(String str, JSONObject jSONObject) {
        TMSJSAPIHandler z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fecd9766", new Object[]{this, str, jSONObject});
        }
        Context a2 = this.weexInstance.getContext().a();
        if (a2 == null) {
            return null;
        }
        bbs instance = getInstance(a2);
        if (instance == null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", (Object) "-1");
            jSONObject2.put("errorMessage", (Object) "当前环境不支持openApi");
            TMSLogger.b(TAG, "can't find instance");
            return jSONObject2;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        TMSLogger.f(TAG, "Weex callSync api: " + ((Object) str) + ", params: " + jSONObject);
        ITMSPage topPage = instance.W().getTopPage();
        if (topPage == null || (z = topPage.z()) == null) {
            return null;
        }
        return z.callTMSAbilitySync(str, jSONObject);
    }
}
