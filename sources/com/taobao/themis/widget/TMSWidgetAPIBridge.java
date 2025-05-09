package com.taobao.themis.widget;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.a07;
import tb.cfs;
import tb.d7x;
import tb.f4x;
import tb.t2o;
import tb.wi3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/widget/TMSWidgetAPIBridge;", "Lcom/taobao/android/weex/WeexModule;", "<init>", "()V", "Lcom/alibaba/fastjson/JSONObject;", "jsonObject", "Ltb/f4x;", "callback", "Ltb/xhv;", "callAriverAPI", "(Lcom/alibaba/fastjson/JSONObject;Ltb/f4x;)V", "callAriverAPISync", "(Lcom/alibaba/fastjson/JSONObject;)Lcom/alibaba/fastjson/JSONObject;", "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "Ltb/d7x;", "api", "onInit", "(Ljava/lang/String;Ltb/d7x;)V", "onJSThreadDestroy", "onMainThreadDestroy", "Lcom/taobao/themis/kernel/ability/TMSJSAPIHandler;", "mJSHandler", "Lcom/taobao/themis/kernel/ability/TMSJSAPIHandler;", "Companion", "a", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetAPIBridge implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TMSWidgetAPIBridge";
    private TMSJSAPIHandler mJSHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(852492293);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(852492292);
        t2o.a(982515802);
    }

    @WeexMethod(uiThread = false)
    public final JSONObject callAriverAPISync(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("edf8649d", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = null;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("callbackId");
            } catch (Throwable th) {
                TMSLogger.c(TAG, "", th);
            }
        }
        if (string == null) {
            TMSLogger.b(TAG, "callbackId is null");
            return jSONObject2;
        }
        jSONObject2.put((JSONObject) wi3.ResponseId, string);
        String string2 = jSONObject.getString("handlerName");
        if (string2 == null) {
            TMSLogger.b(TAG, "handlerName is null");
            return jSONObject2;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        TMSJSAPIHandler tMSJSAPIHandler = this.mJSHandler;
        if (tMSJSAPIHandler != null) {
            jSONObject3 = tMSJSAPIHandler.callTMSAbilitySync(string2, jSONObject4);
        }
        jSONObject2.put((JSONObject) "responseData", (String) jSONObject3);
        return jSONObject2;
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        WeexInstance instance;
        ITMSPage b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
            return;
        }
        TMSJSAPIHandler tMSJSAPIHandler = null;
        if (!(d7xVar == null || (instance = d7xVar.getInstance()) == null || (b2 = cfs.b(instance)) == null)) {
            tMSJSAPIHandler = b2.z();
        }
        this.mJSHandler = tMSJSAPIHandler;
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements TMSJSAPIHandler.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13803a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ f4x c;

        public b(JSONObject jSONObject, boolean z, f4x f4xVar) {
            this.f13803a = jSONObject;
            this.b = z;
            this.c = f4xVar;
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
                return;
            }
            this.f13803a.put((JSONObject) "responseData", (String) jSONObject);
            if (this.b) {
                f4x f4xVar = this.c;
                if (f4xVar != null) {
                    f4xVar.a(this.f13803a);
                    return;
                }
                return;
            }
            f4x f4xVar2 = this.c;
            if (f4xVar2 != null) {
                f4xVar2.b(this.f13803a);
            }
        }
    }

    @WeexMethod(uiThread = false)
    public final void callAriverAPI(JSONObject jSONObject, f4x f4xVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cba4e46", new Object[]{this, jSONObject, f4xVar});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("callbackId");
            } catch (Throwable unused) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put((JSONObject) "success", (String) Boolean.FALSE);
                jSONObject2.put((JSONObject) "responseData", (String) jSONObject3);
                if (f4xVar != null) {
                    f4xVar.b(jSONObject2);
                    return;
                }
                return;
            }
        }
        if (string == null) {
            TMSLogger.b(TAG, "callbackId is null");
            return;
        }
        String string2 = jSONObject.getString("handlerName");
        if (string2 == null) {
            TMSLogger.b(TAG, "handlerName is null");
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        Boolean bool = jSONObject4.getBoolean("keepAlive");
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        jSONObject2.put((JSONObject) wi3.ResponseId, string);
        TMSJSAPIHandler tMSJSAPIHandler = this.mJSHandler;
        if (tMSJSAPIHandler != null) {
            tMSJSAPIHandler.callTMSAbilityAsync(string2, jSONObject4, new b(jSONObject2, booleanValue, f4xVar));
        }
    }
}
