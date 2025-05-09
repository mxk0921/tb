package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.gde;
import tb.pvh;
import tb.r4x;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WeexModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WeexModule";

    static {
        t2o.a(502268152);
    }

    public WeexModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(WeexModule weexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/module/WeexModule");
    }

    @MUSMethod(uiThread = true)
    public void postMessage(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936d3001", new Object[]{this, str, pvhVar});
            return;
        }
        try {
            tfs.e(TAG, "postMessage, message=" + str);
            a instance = getInstance();
            if (instance != null) {
                Object tag = instance.getTag("WeexComponent");
                Object tag2 = instance.getTag("WeexSubPageComponent");
                JSONObject parseObject = JSON.parseObject(str);
                tfs.e(TAG, "postMessage, weexComponent=" + tag + ", weexSubPageComponent=" + tag2 + ", messageJSONObject=" + parseObject);
                if (tag instanceof r4x) {
                    ((r4x) tag).L("onmessage", parseObject);
                } else if (!(tag2 instanceof gde) || parseObject == null) {
                    tfs.e(TAG, "postMessage, weexComponent or weexSubPageComponent or messageJSONObject is invalid");
                } else {
                    ((gde) tag2).onWeexMessage(parseObject);
                }
            } else {
                tfs.e(TAG, "postMessage, musInstance is null");
            }
            pvhVar.b(new Object[0]);
        } catch (Throwable th) {
            tfs.e(TAG, th.getMessage());
        }
    }
}
