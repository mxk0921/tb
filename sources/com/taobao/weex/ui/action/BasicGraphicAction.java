package com.taobao.weex.ui.action;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.utils.WXLogUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class BasicGraphicAction implements IExecutable, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ActionTypeBatchBegin = 1;
    public static final int ActionTypeBatchEnd = 2;
    public static final int ActionTypeNormal = 0;
    public int mActionType = 0;
    private WXSDKInstance mInstance;
    private final String mRef;

    static {
        t2o.a(985661659);
        t2o.a(985661667);
    }

    public BasicGraphicAction(WXSDKInstance wXSDKInstance, String str) {
        this.mInstance = wXSDKInstance;
        this.mRef = str;
    }

    public void executeActionOnRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd43c07", new Object[]{this});
        } else if (TextUtils.isEmpty(this.mInstance.N())) {
            WXLogUtils.e("[BasicGraphicAction] pageId can not be null");
            if (WXEnvironment.isApkDebugable()) {
                throw new RuntimeException("[" + getClass().getName() + "] pageId can not be null");
            }
        } else {
            WXSDKManager.getInstance().getWXRenderManager().postGraphicAction(this.mInstance.N(), this);
        }
    }

    public final String getPageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.mInstance.N();
    }

    public final String getRef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this});
        }
        return this.mRef;
    }

    public final WXSDKInstance getWXSDKIntance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("412990a0", new Object[]{this});
        }
        return this.mInstance;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            executeAction();
        } catch (Throwable th) {
            if (!WXEnvironment.isApkDebugable()) {
                WXLogUtils.w("BasicGraphicAction", th);
                return;
            }
            WXLogUtils.e("BasicGraphicAction", "SafeRunnable run throw expection:" + th.getMessage());
            throw th;
        }
    }
}
