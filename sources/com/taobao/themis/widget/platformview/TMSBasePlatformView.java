package com.taobao.themis.widget.platformview;

import android.content.Context;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.HashMap;
import tb.a07;
import tb.ckf;
import tb.h2c;
import tb.hpl;
import tb.jqf;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSBasePlatformView implements BridgeCallback, h2c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TMSBasePlatformView";

    /* renamed from: a  reason: collision with root package name */
    public final Context f13825a;
    public final int b;
    public final BaseEmbedView c;
    public jqf e;
    public final JSONObject d = new JSONObject();
    public final njg f = kotlin.a.b(new TMSBasePlatformView$mRootView$2(this));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(852492385);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(852492384);
        t2o.a(852492380);
    }

    public TMSBasePlatformView(Context context, int i, BaseEmbedView baseEmbedView, String str) {
        ckf.g(context, "context");
        ckf.g(str, hpl.VIEW_TYPE);
        this.f13825a = context;
        this.b = i;
        this.c = baseEmbedView;
    }

    public static final /* synthetic */ BaseEmbedView a(TMSBasePlatformView tMSBasePlatformView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEmbedView) ipChange.ipc$dispatch("4e1af301", new Object[]{tMSBasePlatformView});
        }
        return tMSBasePlatformView.c;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5755b709", new Object[]{this});
            return;
        }
        try {
            BaseEmbedView baseEmbedView = this.c;
            if (baseEmbedView != null) {
                baseEmbedView.onCreate(kotlin.collections.a.h());
            }
        } catch (Throwable th) {
            TMSLogger.c(TAG, "", th);
        }
    }

    public final Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f13825a;
    }

    public final TMSWidgetEmbedInnerFrameLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEmbedInnerFrameLayout) ipChange.ipc$dispatch("47a4e3c2", new Object[]{this});
        }
        return (TMSWidgetEmbedInnerFrameLayout) this.f.getValue();
    }

    @Override // tb.h2c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        BaseEmbedView baseEmbedView = this.c;
        if (baseEmbedView != null) {
            baseEmbedView.onDestroy();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ff60af", new Object[]{this});
            return;
        }
        try {
            BaseEmbedView baseEmbedView = this.c;
            if (baseEmbedView == null) {
                TMSLogger.b(TAG, "embedView created failed! cannot do render");
                return;
            }
            View view = baseEmbedView.getView(d().getWidth(), d().getHeight(), String.valueOf(this.b), "video", new HashMap());
            if (view != null) {
                d().removeAllViews();
                d().addView(view);
                BaseEmbedView baseEmbedView2 = this.c;
                ckf.d(baseEmbedView2);
                baseEmbedView2.onReceivedRender(this.d, this);
            }
        } catch (Throwable th) {
            TMSLogger.c(TAG, "", th);
        }
    }

    @Override // tb.h2c
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        TMSWidgetEmbedInnerFrameLayout d = d();
        ckf.f(d, "mRootView");
        return d;
    }

    @Override // tb.h2c
    public void onAttach(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36039cb", new Object[]{this, mUSDKInstance});
            return;
        }
        ckf.g(mUSDKInstance, "instance");
        b();
    }

    @Override // tb.h2c
    public void onBindData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1fda83", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.d.putAll(jSONObject);
            e();
        }
    }

    @Override // tb.h2c
    public void onReceivedMessage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a306b98", new Object[]{this, str, jSONObject});
            return;
        }
        BaseEmbedView baseEmbedView = this.c;
        if (baseEmbedView == null) {
            TMSLogger.b(TAG, "onReceivedMessage but embedView is null");
        } else {
            baseEmbedView.onReceivedMessage(str, jSONObject, this);
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendBridgeResponse(BridgeResponse bridgeResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9dfe87", new Object[]{this, bridgeResponse});
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3456c918", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.h2c
    public void setJSEventDelegate(jqf jqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936bc4b2", new Object[]{this, jqfVar});
            return;
        }
        ckf.g(jqfVar, "delegate");
        this.e = jqfVar;
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56830cbc", new Object[]{this, jSONObject, new Boolean(z)});
        }
    }
}
