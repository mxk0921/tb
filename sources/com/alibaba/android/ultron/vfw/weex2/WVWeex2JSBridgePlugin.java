package com.alibaba.android.ultron.vfw.weex2;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.i3x;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WVWeex2JSBridgePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_ACTION_DOWNGRADE = "downgrade";
    private static final String KEY_ACTION_UPDATEHEIGHT = "updateHeight";
    private final IDMComponent mComponent;
    private final FrameLayout mRootView;

    static {
        t2o.a(157286797);
    }

    public WVWeex2JSBridgePlugin(FrameLayout frameLayout, IDMComponent iDMComponent) {
        this.mRootView = frameLayout;
        this.mComponent = iDMComponent;
    }

    public static /* synthetic */ Object ipc$super(WVWeex2JSBridgePlugin wVWeex2JSBridgePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/WVWeex2JSBridgePlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("downgrade".equals(str)) {
            i3x.a(this.mRootView, this.mComponent);
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (!KEY_ACTION_UPDATEHEIGHT.equals(str) || !i3x.c(this.mRootView, this.mComponent, str2)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        }
    }
}
