package com.taobao.tao.adapter.biz.weex.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKInstance;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.d7x;
import tb.f4x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TaopasswordLayerModule2 implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAME = "com.taobao.share.weextool.NotifyModule";
    public static final String PARAMS = "com.taobao.share.weextool.params";

    static {
        t2o.a(793772141);
        t2o.a(982515802);
    }

    public static String handlerCategory(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f462961", new Object[]{wXSDKInstance});
        }
        try {
            return TaopasswordLayerModule2.class.getSimpleName() + File.pathSeparatorChar + wXSDKInstance.toString();
        } catch (Throwable th) {
            TLog.loge("TaopasswordLayerModule", "NotifyModule.handlerCategory error.", th);
            return null;
        }
    }

    @WeexMethod(uiThread = true)
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            WeexBizView.close();
        }
    }

    @WeexMethod(uiThread = true)
    public void closeWithParam(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6822ed50", new Object[]{this, str, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        } catch (Throwable unused) {
        }
        WeexBizView.closeWithParam(str, hashMap);
    }

    @WeexMethod(uiThread = true)
    public void getTPTaoPasswordWeexData(f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4bf6e4b", new Object[]{this, f4xVar});
        } else {
            f4xVar.b(WeexBizView.params);
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
        }
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
