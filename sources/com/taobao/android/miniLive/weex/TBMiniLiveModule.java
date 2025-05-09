package com.taobao.android.miniLive.weex;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.HashMap;
import java.util.Map;
import tb.efs;
import tb.f3s;
import tb.gsq;
import tb.mmr;
import tb.t2o;
import tb.w6f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBMiniLiveModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBMiniLiveModule";
    private Map<String, Map<String, String>> cachedMap;

    static {
        t2o.a(779092106);
        a.a("com.taobao.taolive", null);
    }

    public static /* synthetic */ Object ipc$super(TBMiniLiveModule tBMiniLiveModule, String str, Object... objArr) {
        if (str.hashCode() == -17468269) {
            super.onActivityDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/weex/TBMiniLiveModule");
    }

    @JSMethod(uiThread = true)
    public void closeMiniLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d51f02", new Object[]{this});
        } else if (!f3s.u()) {
            efs.a(TAG, "hideMiniLive openShopMiniLive = false");
        } else {
            mmr.p().s();
        }
    }

    @JSMethod(uiThread = true)
    public void hideMiniLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b97f4c", new Object[]{this});
        } else if (!f3s.u()) {
            efs.a(TAG, "hideMiniLive openShopMiniLive = false");
        } else {
            mmr.p().s();
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        Map<String, Map<String, String>> map = this.cachedMap;
        if (map != null) {
            map.clear();
        }
        this.cachedMap = null;
    }

    @JSMethod(uiThread = true)
    public void sendBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8680220", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(w6f.PAGE_RESUME_ACTION);
        LocalBroadcastManager.getInstance(this.mWXSDKInstance.getContext().getApplicationContext()).sendBroadcast(intent);
    }

    @JSMethod(uiThread = true)
    public void setMiniLive(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc950799", new Object[]{this, map});
            return;
        }
        efs.a(TAG, "setMiniLive");
        if (map != null) {
            String str = map.get("shopId");
            if (!TextUtils.isEmpty(str)) {
                efs.a(TAG, "setMiniLive shopId " + str);
                if (this.cachedMap == null) {
                    this.cachedMap = new HashMap();
                }
                this.cachedMap.put(str, map);
            }
        }
    }

    @JSMethod(uiThread = true)
    public void showMiniLive(Map<String, String> map) {
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94da01e", new Object[]{this, map});
        } else if (!f3s.u()) {
            efs.a(TAG, "showMiniLive openShopMiniLive = false");
        } else if (map != null) {
            efs.a(TAG, "showMiniLive ");
            String str = map.get("shopId");
            if (this.cachedMap != null && !TextUtils.isEmpty(str) && (map2 = this.cachedMap.get(str)) != null) {
                String str2 = map2.get("liveId");
                efs.a(TAG, "showMiniLive liveId = " + str2);
                mmr.p().J(this.mWXSDKInstance.getContext(), str2, map2);
            }
        }
    }

    @JSMethod(uiThread = true)
    public void startMiniLive(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a6ff99", new Object[]{this, map});
        } else if (!f3s.u()) {
            efs.a(TAG, "startMiniLive openShopMiniLive = false");
        } else if (map != null) {
            efs.a(TAG, "startMiniLive");
            mmr.p().J(this.mWXSDKInstance.getContext(), map.get("liveId"), map);
        }
    }

    @JSMethod(uiThread = true)
    public void updateLivePosition(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b19ddc0", new Object[]{this, map});
        } else if (!f3s.u()) {
            efs.a(TAG, "updateLivePosition openShopMiniLive = false");
        } else {
            mmr.p().N(gsq.b(map, "x"), gsq.b(map, "y"));
        }
    }
}
