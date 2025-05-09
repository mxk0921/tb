package com.taobao.themis.mix.h5_render;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.TMSJSAPIHandler;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.bbs;
import tb.cbs;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSTinyH5APIBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMSH5APIHandler";
    private WVUCWebView mWebView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements TMSJSAPIHandler.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f13603a;

        public a(TMSTinyH5APIBridge tMSTinyH5APIBridge, WVCallBackContext wVCallBackContext) {
            this.f13603a = wVCallBackContext;
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
            org.json.JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                Object obj = jSONObject.get("error");
                try {
                    jSONObject2 = new org.json.JSONObject(jSONObject.toJSONString());
                } catch (Exception e) {
                    TMSLogger.c(TMSTinyH5APIBridge.TAG, "execute: result parse error", e);
                    jSONObject2 = null;
                }
                if (obj != null) {
                    nsw nswVar = new nsw();
                    nswVar.j("HY_FAILED");
                    nswVar.h(jSONObject2);
                    this.f13603a.error(nswVar);
                    return;
                }
                nsw nswVar2 = new nsw();
                nswVar2.j("HY_SUCCESS");
                nswVar2.k();
                nswVar2.h(jSONObject2);
                this.f13603a.success(nswVar2);
            } else {
                this.f13603a.error();
            }
        }
    }

    static {
        t2o.a(840957959);
    }

    private bbs getInstance(Context context) {
        cbs cbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("b52524bc", new Object[]{this, context});
        }
        if (context instanceof MutableContextWrapper) {
            try {
                cbsVar = (cbs) ((MutableContextWrapper) context).getBaseContext();
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

    private ITMSPage getPage(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("f1947174", new Object[]{this, wVUCWebView});
        }
        Object externalContext = wVUCWebView.getExternalContext("themis_page");
        if (externalContext instanceof ITMSPage) {
            return (ITMSPage) externalContext;
        }
        bbs instance = getInstance(wVUCWebView.getContext());
        if (instance != null) {
            return instance.W().getTopPage();
        }
        return null;
    }

    private void invalidEnvironmentCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e468f45", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_FAILED");
        nswVar.b("error", "10");
        nswVar.b("errorMessage", "INVALID_ENVIRONMENT");
        wVCallBackContext.error(nswVar);
        TMSLogger.b(TAG, "execute: app is null");
    }

    public static /* synthetic */ Object ipc$super(TMSTinyH5APIBridge tMSTinyH5APIBridge, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/h5_render/TMSTinyH5APIBridge");
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (iWVWebView instanceof WVUCWebView) {
            this.mWebView = (WVUCWebView) iWVWebView;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r6, java.lang.String r7, android.taobao.windvane.jsbridge.WVCallBackContext r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = "bcd41fd1"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            r6 = 3
            r4[r6] = r8
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x0022:
            java.lang.String r2 = "TMSH5APIHandler"
            if (r8 != 0) goto L_0x002c
            java.lang.String r6 = "execute: wvCallBackContext is null"
            com.taobao.themis.kernel.basic.TMSLogger.b(r2, r6)
            return r1
        L_0x002c:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x003d
            java.lang.String r6 = "invalid action"
            r8.error(r6)
            java.lang.String r6 = "execute: action is null"
            com.taobao.themis.kernel.basic.TMSLogger.b(r2, r6)
            return r1
        L_0x003d:
            android.taobao.windvane.webview.IWVWebView r3 = r8.getWebview()
            if (r3 != 0) goto L_0x004f
            java.lang.String r6 = "system error"
            r8.error(r6)
            java.lang.String r6 = "execute: wvCallBackContext.getWebview() is null"
            com.taobao.themis.kernel.basic.TMSLogger.b(r2, r6)
            return r1
        L_0x004f:
            android.taobao.windvane.webview.IWVWebView r1 = r8.getWebview()
            android.content.Context r1 = r1.getContext()
            android.taobao.windvane.extra.uc.WVUCWebView r3 = r5.mWebView
            if (r3 == 0) goto L_0x0060
            tb.bbs r1 = r5.getInstance(r3)
            goto L_0x0064
        L_0x0060:
            tb.bbs r1 = r5.getInstance(r1)
        L_0x0064:
            if (r1 != 0) goto L_0x006a
            r5.invalidEnvironmentCallback(r8)
            return r0
        L_0x006a:
            boolean r3 = com.taobao.themis.kernel.utils.TMSInstanceExtKt.r(r1)
            if (r3 != 0) goto L_0x0074
            r5.invalidEnvironmentCallback(r8)
            return r0
        L_0x0074:
            android.taobao.windvane.extra.uc.WVUCWebView r3 = r5.mWebView
            if (r3 == 0) goto L_0x007d
            com.taobao.themis.kernel.page.ITMSPage r3 = r5.getPage(r3)
            goto L_0x0085
        L_0x007d:
            tb.swd r3 = r1.W()
            com.taobao.themis.kernel.page.ITMSPage r3 = r3.getTopPage()
        L_0x0085:
            if (r3 != 0) goto L_0x008b
            r5.invalidEnvironmentCallback(r8)
            return r0
        L_0x008b:
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L_0x009c
            com.alibaba.fastjson.JSONObject r7 = com.alibaba.fastjson.JSON.parseObject(r7)     // Catch: Exception -> 0x0096
            goto L_0x009d
        L_0x0096:
            r7 = move-exception
            java.lang.String r4 = "execute: params parse error"
            com.taobao.themis.kernel.basic.TMSLogger.c(r2, r4, r7)
        L_0x009c:
            r7 = 0
        L_0x009d:
            if (r7 != 0) goto L_0x00a4
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
        L_0x00a4:
            com.taobao.themis.kernel.solution.TMSSolutionType r1 = r1.a0()
            com.taobao.themis.kernel.solution.TMSSolutionType r2 = com.taobao.themis.kernel.solution.TMSSolutionType.MINIGAME
            if (r1 != r2) goto L_0x00b4
            java.lang.String r1 = "__canalDomain"
            java.lang.String r2 = "widgetFramework"
            r7.put(r1, r2)
        L_0x00b4:
            com.taobao.themis.kernel.ability.TMSJSAPIHandler r1 = r3.z()
            com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge$a r2 = new com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge$a
            r2.<init>(r5, r8)
            r1.callTMSAbilityAsync(r6, r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private bbs getInstance(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("83e761df", new Object[]{this, wVUCWebView});
        }
        ITMSPage page = getPage(wVUCWebView);
        if (page != null) {
            return page.getInstance();
        }
        return null;
    }
}
