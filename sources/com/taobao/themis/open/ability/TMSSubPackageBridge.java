package com.taobao.themis.open.ability;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.extension.IJSRuntimeFactoryExtension;
import java.io.File;
import tb.bbs;
import tb.c7o;
import tb.c9d;
import tb.ekd;
import tb.j8s;
import tb.jkl;
import tb.n5d;
import tb.nc9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSSubPackageBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements n5d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f13617a;

        public a(BridgeCallback bridgeCallback) {
            this.f13617a = bridgeCallback;
        }

        @Override // tb.n5d.b
        public void a(String str, boolean z) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a53ae29", new Object[]{this, str, new Boolean(z)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.TRUE);
            if (!TextUtils.isEmpty(str)) {
                try {
                    File file = new File(str);
                    if (file.isFile()) {
                        jSONObject.put("fileSize", (Object) Long.valueOf(nc9.c(file)));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (z) {
                str2 = "onlineLoad";
            } else {
                str2 = "localLoad";
            }
            jSONObject.put("strategy", (Object) str2);
            this.f13617a.sendJSONResponse(jSONObject);
        }

        @Override // tb.n5d.b
        public void b(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f34c6e45", new Object[]{this, new Integer(i), str});
            } else {
                this.f13617a.sendBridgeResponse(new BridgeResponse.Error(i, str));
            }
        }

        @Override // tb.n5d.b
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }
    }

    static {
        t2o.a(843055124);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void loadSubPackage(@BindingApiContext ApiContext apiContext, @BindingParam(required = true, value = {"packages"}) JSONArray jSONArray, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5942a864", new Object[]{this, apiContext, jSONArray, bridgeCallback});
        } else if (apiContext == null || !(apiContext.b() instanceof bbs)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            bbs b = apiContext.b();
            String string = jSONArray.getString(0);
            if (TextUtils.isEmpty(string)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else {
                loadSubPackage(b, string, bridgeCallback);
            }
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void requireSubPackage(@BindingApiContext ApiContext apiContext, @BindingParam({"name"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337538e3", new Object[]{this, apiContext, str, bridgeCallback});
        } else if (apiContext == null || !(apiContext.b() instanceof bbs)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            bbs b = apiContext.b();
            if (b == null || b.getExtension(c9d.class) == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            ITMSPage c = apiContext.c();
            if (c == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else if (TextUtils.isEmpty(str)) {
                TMSLogger.b("TMSSubPackageBridge", "loadSubPackage...non getSubPackages" + b.U());
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "非分包模式_3"));
            } else {
                ekd ekdVar = (ekd) b.getExtension(ekd.class);
                if (ekdVar == null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    return;
                }
                IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension = (IJSRuntimeFactoryExtension) b.getExtension(IJSRuntimeFactoryExtension.class);
                if (iJSRuntimeFactoryExtension != null && iJSRuntimeFactoryExtension.q() == IJSRuntimeFactoryExtension.Type.Qking) {
                    c7o B = ekdVar.B(str + "/gm.v20.wlm");
                    if (!(B == null || B.getBytes() == null)) {
                        byte[] bytes = B.getBytes();
                        c.r(bytes, str + "/gm.v20.wlm");
                        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                        return;
                    }
                }
                c7o B2 = ekdVar.B(str + "/gm.js");
                if (B2 == null || B2.getString() == null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    return;
                }
                String string = B2.getString();
                c.n(string, str + "/gm.js");
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    public static void loadSubPackage(bbs bbsVar, String str, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198a0e43", new Object[]{bbsVar, str, bridgeCallback});
            return;
        }
        c9d c9dVar = (c9d) bbsVar.getExtension(c9d.class);
        if (c9dVar == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        String m0 = c9dVar.m0(str);
        if (TextUtils.isEmpty(m0)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        jkl jklVar = new jkl(bbsVar.L(), bbsVar.L(), "*", m0, null);
        n5d n5dVar = (n5d) bbsVar.getExtension(n5d.class);
        if (n5dVar == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            n5dVar.k0(jklVar, new a(bridgeCallback));
        }
    }
}
