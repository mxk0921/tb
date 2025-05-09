package com.alibaba.analytics;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dai.adapter.MRTTaobaoAdapter;
import com.taobao.tao.util.TaoHelper;
import com.tmall.android.dai.DAI;
import java.io.Serializable;
import java.util.HashMap;
import tb.jqv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class InitDai implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitDai";
    private boolean isInit = false;
    private boolean isDebuggable = false;

    private void initDai(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b08c95c", new Object[]{this, application});
            return;
        }
        if (this.isDebuggable) {
            new StringBuilder("initDai isInit=").append(this.isInit);
        }
        synchronized (InitDai.class) {
            try {
                if (!this.isInit) {
                    this.isInit = true;
                    MRTTaobaoAdapter.startMNNRuntime(application, TaoHelper.getTTID(), DAI.newConfigurationBuilder(application).setUserAdapter(jqv.class).setDebugMode(false).create());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e(TAG, "init error: application is null");
            }
            if (hashMap == null) {
                Log.e(TAG, "init error: params is null");
            }
        } else {
            if (hashMap.get("isDebuggable") != null) {
                z = ((Boolean) hashMap.get("isDebuggable")).booleanValue();
            }
            this.isDebuggable = z;
            if (z) {
                StringBuilder sb = new StringBuilder("application:");
                sb.append(application);
                sb.append(",params:");
                sb.append(hashMap);
            }
            if (TextUtils.equals(String.valueOf(hashMap.get("process")), String.valueOf(hashMap.get("packageName")))) {
                initDai(application);
            }
        }
    }
}
