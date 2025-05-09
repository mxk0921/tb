package com.taobao.themis.widget.group;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import kotlin.Metadata;
import tb.ckf;
import tb.d7x;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/widget/group/WidgetBridgeModule;", "Lcom/taobao/android/weex/WeexModule;", "<init>", "()V", "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "Ltb/d7x;", "api", "Ltb/xhv;", "onInit", "(Ljava/lang/String;Ltb/d7x;)V", "onJSThreadDestroy", "onMainThreadDestroy", "Lcom/alibaba/fastjson/JSONObject;", "params", "appear", "(Lcom/alibaba/fastjson/JSONObject;)V", "disappear", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;", "mEmbedManager", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WidgetBridgeModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TMSWidgetEngine mEmbedManager;

    static {
        t2o.a(852492345);
        t2o.a(982515802);
    }

    @WeexMethod
    public final void appear(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1361ed4", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject == null ? null : jSONObject.getString("viewId");
        if (string != null) {
            TMSLogger.f("TMSWidget", ckf.p("appear viewId:", string));
            TMSWidgetEngine tMSWidgetEngine = this.mEmbedManager;
            if (tMSWidgetEngine != null) {
                tMSWidgetEngine.r(string);
            }
        }
    }

    @WeexMethod
    public final void disappear(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100c8d86", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject == null ? null : jSONObject.getString("viewId");
        if (string != null) {
            TMSLogger.f("TMSWidget", ckf.p("disappear viewId:", string));
            TMSWidgetEngine tMSWidgetEngine = this.mEmbedManager;
            if (tMSWidgetEngine != null) {
                tMSWidgetEngine.s(string);
            }
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        WeexInstance instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
            return;
        }
        TMSWidgetEngine tMSWidgetEngine = null;
        Object tag = (d7xVar == null || (instance = d7xVar.getInstance()) == null) ? null : instance.getTag("tmsEmbedManager");
        if (tag instanceof TMSWidgetEngine) {
            tMSWidgetEngine = (TMSWidgetEngine) tag;
        }
        this.mEmbedManager = tMSWidgetEngine;
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
}
