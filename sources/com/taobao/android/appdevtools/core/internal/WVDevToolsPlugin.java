package com.taobao.android.appdevtools.core.internal;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.appdevtools.core.export.DevToolsCoreProvider;
import com.taobao.android.appdevtools.core.model.Config;
import com.taobao.android.appdevtools.core.model.RemoteDebugParam;
import com.taobao.android.riverlogger.RVLLevel;
import kotlin.Metadata;
import org.json.JSONObject;
import tb.g1a;
import tb.kpw;
import tb.lcn;
import tb.lh4;
import tb.rrf;
import tb.sgh;
import tb.t2o;
import tb.xhv;
import tb.xpc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/taobao/android/appdevtools/core/internal/WVDevToolsPlugin;", "Ltb/kpw;", "<init>", "()V", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "Ltb/xhv;", "wrapCallback", "(Landroid/taobao/windvane/jsbridge/WVCallBackContext;)Ltb/g1a;", "", "action", "params", xpc.RECORD_EXECUTE, "(Ljava/lang/String;Ljava/lang/String;Landroid/taobao/windvane/jsbridge/WVCallBackContext;)Z", "appdevtools-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class WVDevToolsPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(998244380);
    }

    public static /* synthetic */ Object ipc$super(WVDevToolsPlugin wVDevToolsPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/WVDevToolsPlugin");
    }

    private final g1a<Boolean, xhv> wrapCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("85904809", new Object[]{this, wVCallBackContext});
        }
        return new WVDevToolsPlugin$wrapCallback$1(wVCallBackContext);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        lcn.a(RVLLevel.Info, sgh.a("WVDevToolsPlugin")).j("apiCall").a("action", str).a("params", str2).f();
        if (!lh4.a()) {
            lcn.f(RVLLevel.Error, sgh.a("WVDevToolsPlugin"), "app_dev_tools is not enabled");
            if (wVCallBackContext != null) {
                wVCallBackContext.error("msg", "app_dev_tools is not enabled");
            }
            return true;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2093946451:
                    if (str.equals("remoteDebug")) {
                        DevToolsCoreProvider.get().e((RemoteDebugParam) rrf.c(str2, RemoteDebugParam.class), new WVDevToolsPlugin$execute$2(wVCallBackContext));
                        return true;
                    }
                    break;
                case -2021969604:
                    if (str.equals("setInjectJs")) {
                        String str3 = null;
                        JSONObject jSONObject = str2 == null ? null : new JSONObject(str2);
                        if (jSONObject != null) {
                            str3 = jSONObject.getString("scriptUrl");
                        }
                        if (str3 == null) {
                            if (wVCallBackContext != null) {
                                wVCallBackContext.error("msg", "scriptUrl is null");
                            }
                            return true;
                        }
                        DevToolsCoreProvider.get().f(str3, wrapCallback(wVCallBackContext));
                        return true;
                    }
                    break;
                case -204089056:
                    if (str.equals("clearRemoteDebug")) {
                        DevToolsCoreProvider.get().g(wrapCallback(wVCallBackContext));
                        return true;
                    }
                    break;
                case 3417674:
                    if (str.equals("open")) {
                        DevToolsCoreProvider.get().d((Config) rrf.c(str2, Config.class), wrapCallback(wVCallBackContext));
                        return true;
                    }
                    break;
                case 94756344:
                    if (str.equals("close")) {
                        DevToolsCoreProvider.get().b(wrapCallback(wVCallBackContext));
                        return true;
                    }
                    break;
                case 126605892:
                    if (str.equals("setConfig")) {
                        DevToolsCoreProvider.get().a((Config) rrf.c(str2, Config.class), wrapCallback(wVCallBackContext));
                        return true;
                    }
                    break;
                case 341222968:
                    if (str.equals("getConfig")) {
                        DevToolsCoreProvider.get().c(new WVDevToolsPlugin$execute$1(wVCallBackContext));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
