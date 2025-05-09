package com.taobao.android.detail.ttdetail.bridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.eo9;
import tb.koh;
import tb.q84;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTFloatViewWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_ID_PREFIX = "detail_floatweex_instance";
    private static final String TAG = "TTFloatViewWeexModule";

    static {
        t2o.a(912261338);
    }

    public static String generateChannelId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c876686", new Object[]{str});
        }
        return CHANNEL_ID_PREFIX + koh.d(str);
    }

    public static /* synthetic */ Object ipc$super(TTFloatViewWeexModule tTFloatViewWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bridge/TTFloatViewWeexModule");
    }

    @JSMethod
    public void dispatchMessage(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763590d1", new Object[]{this, map});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null) {
            String bundleUrl = wXSDKInstance.getBundleUrl();
            tgh.b(TAG, "js向native发送消息 url=" + bundleUrl);
            q84.f(this.mWXSDKInstance.getContext(), new eo9(generateChannelId(bundleUrl), map));
        }
    }

    @JSMethod
    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        tgh.b(TAG, "js:" + str);
    }

    @JSMethod
    public void onMessage(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce0e879", new Object[]{this, jSCallback});
        }
    }
}
