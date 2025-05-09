package tb;

import android.app.Application;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.base.taobao.TriverRemoteManager;
import com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWXModule;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWXView;
import com.alibaba.triver.triver_weex.WXAriverComponent;
import com.alibaba.triver.triver_weex.evagraft.WVEvaGraftView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.Remo;
import com.taobao.android.remoteso.component.d;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.weex.WXSDKEngine;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class nhu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TriverInitializer";
    public static final String TLOG_MODULE = "Triver";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements gcf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.gcf
        public void a(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ef5050", new Object[]{this, cxnVar});
                return;
            }
            try {
                WXSDKEngine.registerComponent("ariver", WXAriverComponent.class);
            } catch (Throwable th) {
                RVLogger.e(RVConstants.TAG, "Register ariver component failed");
                RVLogger.e(RVConstants.TAG, th);
            }
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        vxm.b.e().a("triver_remote_state", TriverRemoteManager.getInstance().checkTriverState());
        b();
        if (AdapterForTLog.isValid()) {
            s4s.e().a("Triver", LogLevel.D);
        }
        if (!a0r.a(".closeTriverInit").booleanValue()) {
            TriverRemoteManager.getInstance().install(TAG, "", ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, null, new a(application));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c9d079", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("triver-widget", TRWidgetWXModule.class);
            IpChange ipChange2 = TRWidgetWVEmbedView.$ipChange;
            fqw.g("widget", TRWidgetWVEmbedView.class, true);
        } catch (Throwable th) {
            RVLogger.e("TRiverSDK", "register TRWidgetWVEmbedView failed " + th);
        }
        fsw.h("triver-widget", TRWidgetJsPlugin.class);
        try {
            WXSDKEngine.registerComponent("canal", TRWidgetWXView.class);
            WXSDKEngine.registerComponent("widget", TRWidgetWXView.class);
        } catch (Throwable th2) {
            RVLogger.e("TRiverSDK", "register FCanvasWeexComponent failed " + th2);
        }
        try {
            IpChange ipChange3 = WVEvaGraftView.$ipChange;
            fqw.g("evagraftview", WVEvaGraftView.class, true);
        } catch (Throwable th3) {
            RVLogger.e("TRiverSDK", "register TRWidgetWVEmbedView failed " + th3);
        }
        c();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee26d6", new Object[0]);
        } else {
            Remo.e(d.a().a("flexa", "taobao_weex_adapter").g(false).c(new b()).b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements ITriverRemoteProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f24742a;

        public a(Application application) {
            this.f24742a = application;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            } else {
                TLog.loge("Triver", nhu.TAG, str);
            }
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onSuccess() {
            try {
                Class.forName("com.alibaba.triver.TriverInitializerImpl").getMethod("init", Application.class).invoke(null, this.f24742a);
            } catch (Throwable th) {
                TLog.loge("Triver", nhu.TAG, th);
            }
        }
    }
}
