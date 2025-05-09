package com.taobao.taolivecontainer.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import java.util.HashMap;
import java.util.Iterator;
import tb.ajr;
import tb.brq;
import tb.ch8;
import tb.kpw;
import tb.m09;
import tb.nkr;
import tb.rrb;
import tb.t2o;
import tb.v7t;
import tb.xud;
import tb.z1e;
import tb.zmr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveBasePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_ERROR_IS_NOT_TBLIVEH5CONTAINER = "{\"result\":\"is_not_TBLiveH5Container\"}";
    private static final String NO_ERROR_IS_NULL_BUILDER = "{\"result\":\"TBLiveH5Container.Builder is null\"}";
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";
    private static final String TAG = "TBLiveBasePlugin";
    private static long sLastGetTemperatureTime = 0;
    private static float sLastGetTemperature = 0.0f;

    static {
        t2o.a(1027604496);
    }

    private xud getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xud) ipChange.ipc$dispatch("6c498db9", new Object[]{this});
        }
        IWVWebView iWVWebView = this.mWebView;
        if (iWVWebView instanceof TBLiveH5Container) {
            return (TBLiveH5Container) iWVWebView;
        }
        if (!(iWVWebView instanceof WVUCWebView)) {
            return null;
        }
        Object externalContext = ((WVUCWebView) iWVWebView).getExternalContext("themis_data_extension");
        if (!(externalContext instanceof rrb)) {
            return null;
        }
        Object n0 = ((rrb) externalContext).n0(zmr.TB_LIVE_THEMIS_CONTAINER);
        if (n0 instanceof zmr) {
            return (zmr) n0;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TBLiveBasePlugin tBLiveBasePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivecontainer/jsbridge/TBLiveBasePlugin");
    }

    private void tlog(z1e z1eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd391f9a", new Object[]{this, z1eVar, str, str2});
        } else if (z1eVar != null) {
            z1eVar.b(nkr.Flag_TaobaoLiveContainer, "TBLiveBasePlugin_" + str, str2);
        }
    }

    private float getTemperature(Context context, long j) {
        Intent registerReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e24971", new Object[]{this, context, new Long(j)})).floatValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastGetTemperatureTime <= j || (registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -2.14748365E9f;
        }
        sLastGetTemperatureTime = currentTimeMillis;
        sLastGetTemperature = registerReceiver.getIntExtra("temperature", 0) / 10.0f;
        v7t.d(TAG, "getThermalLevel " + sLastGetTemperature);
        return sLastGetTemperature;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ajr ajrVar = new ajr(str, str2, wVCallBackContext);
        xud container = getContainer();
        if (container != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -996946781:
                    if (str.equals("getThermalLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -780995390:
                    if (str.equals("NotifyPreRenderStatus")) {
                        c = 1;
                        break;
                    }
                    break;
                case -153529056:
                    if (str.equals("UTShowExpose")) {
                        c = 2;
                        break;
                    }
                    break;
                case 242587193:
                    if (str.equals("getAppInfo")) {
                        c = 3;
                        break;
                    }
                    break;
                case 723633289:
                    if (str.equals("UTControlClicked")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1536672141:
                    if (str.equals("renderSuccess")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    v7t.i(TAG, "getThermalLevel");
                    JSONObject jSONObject = new JSONObject();
                    Context context = container.getContext();
                    long j = (container.getBuilder() == null || container.getBuilder().c() == null) ? 5000L : container.getBuilder().c().f;
                    JSONObject e = brq.e(str2);
                    if (!(context == null || e == null || !e.containsKey("thresholds"))) {
                        JSONObject jSONObject2 = e.getJSONObject("thresholds");
                        float temperature = getTemperature(this.mContext, j);
                        Iterator<String> it = jSONObject2.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String next = it.next();
                                if (temperature < jSONObject2.getFloat(next).floatValue()) {
                                    jSONObject.put(m09.TASK_TYPE_LEVEL, (Object) next);
                                }
                            }
                        }
                    }
                    String jSONString = jSONObject.toJSONString();
                    ajrVar.d(jSONString);
                    v7t.d(TAG, "getThermalLevel " + jSONString);
                    return true;
                case 1:
                    v7t.i(TAG, "NotifyPreRenderStatus");
                    int i2 = R.id.taolive_container_prerender_status;
                    if (container.getTag(i2) == null || container.isAttachedToWindow() || !((Boolean) container.getTag(i2)).booleanValue()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WebView Attached: " + container.isAttachedToWindow());
                        sb.append("params from JS: " + str2.toString());
                        v7t.d(TAG, sb.toString());
                        ajrVar.b("不是预渲染状态");
                        return false;
                    } else if (container.getBuilder() != null) {
                        nkr builder = container.getBuilder();
                        JSONObject e2 = brq.e(str2);
                        if (e2 == null || e2.getString("status") == null) {
                            ajrVar.b("status is null!");
                            return false;
                        }
                        String string = e2.getString("status");
                        if ("success".equals(string)) {
                            builder.b(true, e2);
                            i = 0;
                        } else {
                            i = 0;
                            builder.b(false, e2);
                        }
                        if (ch8.j(getContext())) {
                            Context context2 = getContext();
                            Toast.makeText(context2, "终端容器预渲染结束，状态：" + string, i).show();
                        }
                        ajrVar.c();
                        return true;
                    } else {
                        ajrVar.b(NO_ERROR_IS_NULL_BUILDER);
                        return false;
                    }
                case 2:
                    if (container.getBuilder() != null) {
                        z1e h = container.getBuilder().h();
                        tlog(h, "UTShowExpose", str2);
                        JSONObject e3 = brq.e(str2);
                        if (e3 != null) {
                            String string2 = e3.getString("pageName");
                            String string3 = e3.getString("arg1");
                            HashMap<String, String> b = brq.b(e3.getJSONObject("args"));
                            if (TextUtils.isEmpty(string2)) {
                                string2 = nkr.PAGE_TAOBAOLIVECONTAINER;
                            }
                            h.a(string2, string3, b);
                            ajrVar.c();
                            return true;
                        }
                        ajrVar.b("parseObject fail");
                        tlog(h, "UTShowExpose", "parseObject fail");
                        return false;
                    }
                    ajrVar.b(NO_ERROR_IS_NULL_BUILDER);
                    return false;
                case 3:
                    v7t.i(TAG, "getAppInfo");
                    JSONObject b2 = ch8.b(container.getContext());
                    if (b2 != null) {
                        ajrVar.d(b2.toJSONString());
                        return true;
                    }
                    ajrVar.a();
                    return true;
                case 4:
                    if (container.getBuilder() != null) {
                        z1e h2 = container.getBuilder().h();
                        tlog(h2, "UTControlClicked", str2);
                        JSONObject e4 = brq.e(str2);
                        if (e4 != null) {
                            String string4 = e4.getString("pageName");
                            String string5 = e4.getString("arg1");
                            HashMap<String, String> b3 = brq.b(e4.getJSONObject("args"));
                            if (TextUtils.isEmpty(string4)) {
                                string4 = nkr.PAGE_TAOBAOLIVECONTAINER;
                            }
                            h2.c(string4, string5, b3);
                            ajrVar.c();
                            return true;
                        }
                        ajrVar.b("parseObject fail");
                        tlog(h2, "UTControlClicked", "parseObject fail");
                        return false;
                    }
                    ajrVar.b(NO_ERROR_IS_NULL_BUILDER);
                    return false;
                case 5:
                    v7t.i(TAG, "renderSuccess");
                    container.renderSuccess(brq.e(str2));
                    return true;
                default:
                    ajrVar.b(NO_FUNCTION);
                    return false;
            }
        } else {
            ajrVar.b(NO_ERROR_IS_NOT_TBLIVEH5CONTAINER);
            return false;
        }
    }
}
