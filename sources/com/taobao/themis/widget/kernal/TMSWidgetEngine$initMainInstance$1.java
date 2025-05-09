package com.taobao.themis.widget.kernal;

import android.os.Build;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.b;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import com.taobao.weex.common.WXConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.c7o;
import tb.ckf;
import tb.d1a;
import tb.ekd;
import tb.p8s;
import tb.q9s;
import tb.qu3;
import tb.r8s;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetEngine$initMainInstance$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ byte[] $apiExt;
    public final /* synthetic */ byte[] $apiFramework;
    public final /* synthetic */ byte[] $jsFramework;
    public final /* synthetic */ TMSWidgetEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWidgetEngine$initMainInstance$1(TMSWidgetEngine tMSWidgetEngine, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(0);
        this.this$0 = tMSWidgetEngine;
        this.$jsFramework = bArr;
        this.$apiFramework = bArr2;
        this.$apiExt = bArr3;
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetEngine$initMainInstance$1 tMSWidgetEngine$initMainInstance$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/TMSWidgetEngine$initMainInstance$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        c7o c7oVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        b.d().c(((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext());
        JSONObject jSONObject = new JSONObject();
        TMSWidgetEngine tMSWidgetEngine = this.this$0;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "os", "android");
        jSONObject3.put((JSONObject) WXConfig.sysVersion, Build.VERSION.RELEASE);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject2.put((JSONObject) "widgetMainConfig", (String) jSONObject3);
        jSONObject.put((JSONObject) "canal_config", (String) jSONObject2);
        jSONObject.put((JSONObject) "debugUrl", "https://canal/3.0/main_debug");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(qu3.MNN);
        jSONArray.add("wasm_binding");
        jSONObject.put((JSONObject) "required_plugin", (String) jSONArray);
        String b = TMSWidgetEngine.b(tMSWidgetEngine);
        if (b != null) {
            jSONObject.put((JSONObject) "debugServerUrl", b);
        }
        this.this$0.K(MUSEngine.hasJSBindingPlugin(qu3.MNN));
        this.this$0.L(MUSEngine.hasJSBindingPlugin("wasm_binding"));
        TMSWidgetEngine tMSWidgetEngine2 = this.this$0;
        TMSWidgetEngine.n(tMSWidgetEngine2, b.a(tMSWidgetEngine2.u(), "http://m.duanqu.com/canal/main", WeexInstanceMode.CANAL, WeexRenderType.UNICORN, jSONObject, null));
        WeexInstance h = TMSWidgetEngine.h(this.this$0);
        ckf.d(h);
        h.initWithEmpty();
        WeexInstance h2 = TMSWidgetEngine.h(this.this$0);
        ckf.d(h2);
        h2.execute(TMSWidgetEngine.a(this.this$0), ckf.p("http://m.duanqu.com/canal/main", "/navigator.js"));
        WeexInstance h3 = TMSWidgetEngine.h(this.this$0);
        ckf.d(h3);
        h3.execute(this.$jsFramework, ckf.p("http://m.duanqu.com/canal/main", "/weex-vue.min.v20.wlm"));
        WeexInstance h4 = TMSWidgetEngine.h(this.this$0);
        ckf.d(h4);
        h4.execute(this.$apiFramework, ckf.p("http://m.duanqu.com/canal/main", "/tb-widget.min.v20.wlm"));
        List<PluginModel> n = r8s.n(TMSWidgetEngine.g(this.this$0));
        if (n != null) {
            TMSWidgetEngine tMSWidgetEngine3 = this.this$0;
            for (Object obj : n) {
                i++;
                c7o c7oVar2 = null;
                if (i >= 0) {
                    PluginModel pluginModel = (PluginModel) obj;
                    ekd ekdVar = (ekd) TMSWidgetEngine.g(tMSWidgetEngine3).getExtension(ekd.class);
                    if (ekdVar == null) {
                        c7oVar = null;
                    } else {
                        String appId = pluginModel.getAppId();
                        ckf.f(appId, "pluginModel.appId");
                        c7oVar = ekdVar.n(appId, "api-extension.min.v20.wlm");
                    }
                    if (c7oVar == null) {
                        ekd ekdVar2 = (ekd) TMSWidgetEngine.g(tMSWidgetEngine3).getExtension(ekd.class);
                        if (ekdVar2 != null) {
                            String appId2 = pluginModel.getAppId();
                            ckf.f(appId2, "pluginModel.appId");
                            c7oVar2 = ekdVar2.n(appId2, "api-extension.min.js");
                        }
                        if (c7oVar2 != null) {
                            c7oVar = c7oVar2;
                        }
                    }
                    WeexInstance h5 = TMSWidgetEngine.h(tMSWidgetEngine3);
                    ckf.d(h5);
                    h5.execute(c7oVar.getBytes(), "http://m.duanqu.com/canal/main/" + ((Object) pluginModel.getAppId()) + "/api-extension.min.v20.wlm");
                } else {
                    yz3.p();
                    throw null;
                }
            }
        }
        byte[] bArr = this.$apiExt;
        if (bArr != null) {
            WeexInstance h6 = TMSWidgetEngine.h(this.this$0);
            ckf.d(h6);
            h6.execute(bArr, ckf.p("http://m.duanqu.com/canal/main", "/jsapi-extension-mock"));
        }
        TMSWidgetEngine.m(this.this$0, true);
        TMSWidgetEngine.b d = TMSWidgetEngine.d(this.this$0);
        if (d != null) {
            d.a();
        }
        for (Runnable runnable : TMSWidgetEngine.j(this.this$0)) {
            runnable.run();
        }
        TMSWidgetEngine.j(this.this$0).clear();
        if (q9s.m()) {
            TMSWidgetEngine.g(this.this$0).destroy();
        }
    }
}
