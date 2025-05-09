package com.taobao.android.fluid.framework.deprecated.message.module.proxy;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.RectData;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import tb.d69;
import tb.hmi;
import tb.ir9;
import tb.loa;
import tb.t2o;
import tb.vrp;
import tb.xyw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortVideoJsBridgeProxy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoJsBridgeProxy";
    private static final Type mRectDataType = new a().getType();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends TypeReference<List<RectData>> {
    }

    static {
        t2o.a(468714349);
    }

    public ShortVideoJsBridgeProxy() {
        ir9.b(TAG, "新架构初始化 ShortVideoJsBridgeProxy");
    }

    public boolean postMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fb451d9", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (webview instanceof WVUCWebView) {
            Object tag = ((WVUCWebView) webview).getTag();
            if (tag instanceof xyw) {
                vrp vrpVar = new vrp(JSON.parseObject(str), new loa(wVCallBackContext));
                ((xyw) tag).s1(vrpVar);
                ir9.b(TAG, "新架构游戏卡 Web 页面发送消息：" + vrpVar);
            }
        }
        return true;
    }

    public boolean sendMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46fe07f1", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext != null) {
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview instanceof WVUCWebView) {
                Object tag = ((WVUCWebView) webview).getTag();
                if (tag instanceof hmi) {
                    vrp vrpVar = new vrp(JSON.parseObject(str), new loa(wVCallBackContext));
                    ((hmi) tag).f(vrpVar);
                    ir9.b(TAG, "新架构 Web 页面发送消息：" + vrpVar);
                }
            }
        }
        return true;
    }

    public boolean parseTrusteeshipTouchRectData(String str, WVCallBackContext wVCallBackContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dba5935e", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (!(webview instanceof WVUCWebView)) {
            return false;
        }
        WVUCWebView wVUCWebView = (WVUCWebView) webview;
        if (!(wVUCWebView.getParent() instanceof DWPenetrateFrameLayout) || TextUtils.isEmpty(str) || !d69.e()) {
            return false;
        }
        DWPenetrateFrameLayout dWPenetrateFrameLayout = (DWPenetrateFrameLayout) wVUCWebView.getParent();
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject != null) {
            JSONArray jSONArray = parseObject.getJSONArray("rects");
            FluidContext fluidContext = (FluidContext) wVUCWebView.getTag(R.id.fluid_sdk_fluid_intance);
            if (jSONArray != null) {
                List<RectData> list = (List) JSON.parseObject(jSONArray.toJSONString(), mRectDataType, new Feature[0]);
                StringBuilder sb = new StringBuilder("parse rect data, rectListData: ");
                sb.append(list != null ? list.toString() : null);
                ir9.a(TAG, sb.toString());
                dWPenetrateFrameLayout.setChildTrusteeshipTouchRect(fluidContext, list);
                ir9.b(TAG, "新架构 Web 页面解析托管区域数据：" + str);
                return z;
            }
        }
        z = false;
        ir9.b(TAG, "新架构 Web 页面解析托管区域数据：" + str);
        return z;
    }
}
