package com.taobao.android.hudong.bridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.json.JSONObject;
import tb.ckf;
import tb.dxo;
import tb.jpu;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.v3i;
import tb.wk8;
import tb.xpc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/android/hudong/bridge/LumosWVPlugin;", "Ltb/kpw;", "<init>", "()V", "", "action", "params", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "callback", "", xpc.RECORD_EXECUTE, "(Ljava/lang/String;Ljava/lang/String;Landroid/taobao/windvane/jsbridge/WVCallBackContext;)Z", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "hudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LumosWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "LumosWVPlugin";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends TypeReference<Map<String, ? extends String>> {
    }

    static {
        t2o.a(1031798801);
    }

    public static /* synthetic */ Object ipc$super(LumosWVPlugin lumosWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/hudong/bridge/LumosWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        Map<String, ? extends Object> map = (Map) JSON.parseObject(str2, new a(), new Feature[0]);
        if (str != null) {
            switch (str.hashCode()) {
                case -1881717868:
                    if (str.equals("setNavigationBarStyle")) {
                        wk8.INSTANCE.c(wk8.EVENT_SET_NAV_BAR_STYLE, map);
                        break;
                    }
                    break;
                case -794464810:
                    if (str.equals("showBackButton")) {
                        wk8.INSTANCE.c(wk8.EVENT_SHOW_BACK_ICON, null);
                        break;
                    }
                    break;
                case -62820472:
                    if (str.equals("checkTinyAppPermission") && wVCallBackContext != null) {
                        nsw nswVar = new nsw();
                        nswVar.j("HY_SUCCESS");
                        nswVar.k();
                        nswVar.h(new JSONObject(v3i.f(jpu.a("success", Boolean.TRUE))));
                        wVCallBackContext.success(nswVar);
                        break;
                    }
                    break;
                case 344806259:
                    if (str.equals("getSystemInfo") && wVCallBackContext != null) {
                        nsw nswVar2 = new nsw();
                        nswVar2.j("HY_SUCCESS");
                        nswVar2.k();
                        Pair a2 = jpu.a("titleBarHeight", 44);
                        dxo dxoVar = dxo.INSTANCE;
                        Context applicationContext = getContext().getApplicationContext();
                        ckf.f(applicationContext, "context.applicationContext");
                        nswVar2.h(new JSONObject(kotlin.collections.a.j(a2, jpu.a("statusBarHeight", Integer.valueOf(dxoVar.b(applicationContext))))));
                        wVCallBackContext.success(nswVar2);
                        break;
                    }
                    break;
                case 1038753243:
                    if (str.equals("hideBackButton")) {
                        wk8.INSTANCE.c(wk8.EVENT_HIDE_BACK_ICON, null);
                        break;
                    }
                    break;
            }
        }
        return true;
    }
}
