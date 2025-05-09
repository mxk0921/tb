package com.taobao.umipublish.extension.windvane.call;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.nsw;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH$¢\u0006\u0004\b\u000f\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/call/WindvaneCall;", "Ljava/io/Serializable;", "<init>", "()V", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "callback", "Landroid/content/Context;", "context", "Ltb/xhv;", "setContext", "(Landroid/taobao/windvane/jsbridge/WVCallBackContext;Landroid/content/Context;)V", "Lcom/alibaba/fastjson/JSONObject;", "params", "call", "(Lcom/alibaba/fastjson/JSONObject;)V", "onExecute", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "getCallback", "()Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "setCallback", "(Landroid/taobao/windvane/jsbridge/WVCallBackContext;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "(Landroid/content/Context;)V", "Companion", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class WindvaneCall implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    public static final String K_RET_CODE = "errorCode";
    public static final String K_RET_MSG = "message";
    public static final String TAG = "WindvaneCall";
    private WVCallBackContext callback;
    private Context context;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/call/WindvaneCall$Companion;", "", "()V", "K_RET_CODE", "", "K_RET_MSG", RPCDataItems.SWITCH_TAG_LOG, "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Companion {
        static {
            t2o.a(944767212);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(944767211);
    }

    public final void call(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a4ebab", new Object[]{this, jSONObject});
            return;
        }
        try {
            onExecute(jSONObject);
        } catch (Throwable th) {
            WVCallBackContext wVCallBackContext = this.callback;
            if (wVCallBackContext != null) {
                nsw nswVar = new nsw("HY_FAILED");
                nswVar.b("errorCode", "-1");
                nswVar.b("errorMsg", Log.getStackTraceString(th));
                xhv xhvVar = xhv.INSTANCE;
                wVCallBackContext.error(nswVar);
            }
        }
    }

    public final WVCallBackContext getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("d7f8ea11", new Object[]{this});
        }
        return this.callback;
    }

    public final Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.context;
    }

    public abstract void onExecute(JSONObject jSONObject);

    public final void setCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0e440b", new Object[]{this, wVCallBackContext});
        } else {
            this.callback = wVCallBackContext;
        }
    }

    public final void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.context = context;
        }
    }

    public final void setContext(WVCallBackContext wVCallBackContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5a1ab7", new Object[]{this, wVCallBackContext, context});
            return;
        }
        ckf.g(wVCallBackContext, "callback");
        ckf.g(context, "context");
        this.callback = wVCallBackContext;
        this.context = context;
    }
}
