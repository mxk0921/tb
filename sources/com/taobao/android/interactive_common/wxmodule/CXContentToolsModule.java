package com.taobao.android.interactive_common.wxmodule;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.utils.WXViewUtils;
import java.util.HashMap;
import java.util.Map;
import tb.ev4;
import tb.kq9;
import tb.l0u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CXContentToolsModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CXContentToolsModule cXContentToolsModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/wxmodule/CXContentToolsModule");
    }

    @JSMethod
    public void removePreviousImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b162b307", new Object[]{this});
        } else {
            kq9.b("CXContentToolsModule_removePreviousImage", null);
        }
    }

    @JSMethod
    public void getOriginalURL(JSCallback jSCallback) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0910f9", new Object[]{this, jSCallback});
            return;
        }
        kq9.b("CXContentToolsModule_getOriginalURL", null);
        if (jSCallback != null) {
            if (WXEnvironment.isApkDebugable() && (wXSDKInstance = this.mWXSDKInstance) != null) {
                l0u.c(wXSDKInstance.getContext(), "该功能已下线，有疑问请咨询长锋");
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put(TBImageFlowMonitor.INVALID_PARAM_ORIGINAL_URL, "");
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod
    public void getPrefetchData(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3996720a", new Object[]{this, jSCallback});
            return;
        }
        kq9.b("CXContentToolsModule_getPrefetchData", null);
        ev4.a("weex getPrefetchData");
        if (jSCallback != null) {
            jSCallback.invoke(new HashMap(1));
        }
    }

    @JSMethod(uiThread = false)
    public Map getPrefetchDataSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2fb045ee", new Object[]{this});
        }
        kq9.b("CXContentToolsModule_getPrefetchDataSync", null);
        ev4.a("weex getPrefetchDataSync");
        HashMap hashMap = new HashMap(1);
        ev4.a("getPrefetch Over");
        return hashMap;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:23:0x009b). Please submit an issue!!! */
    @JSMethod
    public float getScreenHeight(JSCallback jSCallback) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d97d4b48", new Object[]{this, jSCallback})).floatValue();
        }
        int i3 = 0;
        kq9.b("CXContentToolsModule_getScreenHeight", null);
        try {
            try {
                if (this.mWXSDKInstance.getContext() instanceof CXCommonActivity) {
                    Rect rect = new Rect();
                    ((CXCommonActivity) this.mWXSDKInstance.getContext()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    i3 = rect.height();
                    i = rect.width();
                    try {
                        int identifier = this.mWXSDKInstance.getContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
                        if (identifier > 0) {
                            i2 = this.mWXSDKInstance.getContext().getResources().getDimensionPixelSize(identifier);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    i3 = this.mWXSDKInstance.getContext().getResources().getDisplayMetrics().heightPixels;
                    i = this.mWXSDKInstance.getContext().getResources().getDisplayMetrics().widthPixels;
                }
            } catch (Exception unused2) {
                i = 0;
            }
        } catch (Exception unused3) {
            i = 0;
            i3 = 0;
        }
        float f = ((i3 + i2) * 750) / i;
        HashMap hashMap = new HashMap();
        hashMap.put("screenHeight", Float.valueOf(f));
        if (jSCallback != null) {
            jSCallback.invoke(hashMap);
        }
        return f;
    }

    @JSMethod(uiThread = false)
    public float getScreenHeightSync() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c80ed3db", new Object[]{this})).floatValue();
        }
        int i2 = 0;
        kq9.b("CXContentToolsModule_getScreenHeightSync", null);
        ev4.a("begin getScreenHeightSync");
        try {
            try {
                if (this.mWXSDKInstance.getContext() instanceof CXCommonActivity) {
                    Rect rect = new Rect();
                    ((CXCommonActivity) this.mWXSDKInstance.getContext()).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    i2 = rect.height();
                    rect.width();
                    int identifier = this.mWXSDKInstance.getContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i = this.mWXSDKInstance.getContext().getResources().getDimensionPixelSize(identifier);
                    }
                } else {
                    i2 = this.mWXSDKInstance.getContext().getResources().getDisplayMetrics().heightPixels;
                    int i3 = this.mWXSDKInstance.getContext().getResources().getDisplayMetrics().widthPixels;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            i2 = 0;
        }
        float webPxByWidth = WXViewUtils.getWebPxByWidth(i2 + i);
        ev4.a("end getScreenHeightSync:" + webPxByWidth);
        return webPxByWidth;
    }

    @JSMethod
    public int getStatusBarHeight(JSCallback jSCallback) {
        int identifier;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd90e542", new Object[]{this, jSCallback})).intValue();
        }
        if (this.mWXSDKInstance != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("context", String.valueOf(this.mWXSDKInstance.getContext()));
            hashMap.put("bundleUrl", String.valueOf(this.mWXSDKInstance.getBundleUrl()));
            kq9.b("CXContentToolsModule_getStatusBarHeight", hashMap);
        }
        try {
            if ((this.mWXSDKInstance.getContext() instanceof CXCommonActivity) && (identifier = this.mWXSDKInstance.getContext().getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                i = this.mWXSDKInstance.getContext().getResources().getDimensionPixelSize(identifier);
            }
        } catch (Throwable unused) {
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("statusBarHeight", Integer.valueOf(i));
        jSCallback.invoke(hashMap2);
        return i;
    }

    @JSMethod(uiThread = false)
    public int getStatusBarHeightSync() {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5345cc7", new Object[]{this})).intValue();
        }
        kq9.b("CXContentToolsModule_getStatusBarHeightSync", null);
        ev4.a("getStatusBarHeightSync");
        try {
            if (!(this.mWXSDKInstance.getContext() instanceof CXCommonActivity) || (identifier = this.mWXSDKInstance.getContext().getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.mWXSDKInstance.getContext().getResources().getDimensionPixelSize(identifier);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
