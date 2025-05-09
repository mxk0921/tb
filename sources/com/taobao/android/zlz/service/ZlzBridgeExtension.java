package com.taobao.android.zlz.service;

import android.util.Log;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ea8;
import tb.efe;
import tb.fa8;
import tb.ga8;
import tb.pu1;
import tb.tqx;
import tb.y1c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ZlzBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebServiceImpl";
    public static final int ZLZ_CALLBACK_ERROR = 10000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements efe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f10039a;

        public a(ZlzBridgeExtension zlzBridgeExtension, BridgeCallback bridgeCallback) {
            this.f10039a = bridgeCallback;
        }

        @Override // tb.efe
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef6534f2", new Object[]{this, new Boolean(z)});
                return;
            }
            new StringBuilder("zlzDownloadFaceModel: success=").append(z);
            this.f10039a.sendBridgeResponse(new BridgeResponse.NamedValue("result", Boolean.valueOf(z)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements y1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f10040a;

        public b(ZlzBridgeExtension zlzBridgeExtension, BridgeCallback bridgeCallback) {
            this.f10040a = bridgeCallback;
        }

        @Override // tb.y1c
        public void a(ga8 ga8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d76c595", new Object[]{this, ga8Var});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) Integer.valueOf(ga8Var.f19831a));
            jSONObject.put("subCode", (Object) ga8Var.b);
            jSONObject.put("result", (Object) ga8Var.c);
            jSONObject.put("extInfo", (Object) null);
            this.f10040a.sendJSONResponse(jSONObject);
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public Boolean zlzCheckModelReady(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cd0e278e", new Object[]{this, page, bridgeCallback});
        }
        try {
            return Boolean.valueOf(ea8.o().k());
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when get metainfo:" + e.getMessage()));
            return Boolean.FALSE;
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void zlzDownloadFaceModel(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebfc953", new Object[]{this, page, bridgeCallback});
            return;
        }
        try {
            ea8.o().q(page.getApp().getAppContext().getContext(), new a(this, bridgeCallback));
        } catch (Exception e) {
            Log.e("WebServiceImpl", "zlzDownloadFaceModel: exception", e);
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when get metainfo:" + e.getMessage()));
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void zlzGetMetaInfo(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb6df78", new Object[]{this, page, bridgeCallback});
            return;
        }
        try {
            tqx.b().c(page.getApp().getAppContext().getContext());
            String b2 = pu1.b(page.getApp().getAppContext().getContext());
            if (b2 != null && !"".equals(b2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("metaInfo", (Object) b2);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "metainfo is null"));
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when get metainfo:" + e.getMessage()));
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void zlzStartEkyc(@BindingNode(Page.class) Page page, @BindingParam(name = {"eKYCId"}) String str, @BindingParam(name = {"eKYCConfig"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331576cd", new Object[]{this, page, str, str2, bridgeCallback});
            return;
        }
        fa8 fa8Var = new fa8();
        fa8Var.f19139a = str;
        fa8Var.d = str2;
        ((HashMap) fa8Var.c).put("hummerContext", page.getApp().getAppContext().getContext());
        try {
            ea8.o().r(fa8Var, new b(this, bridgeCallback));
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when start ekyc:" + e.getMessage()));
        }
    }
}
