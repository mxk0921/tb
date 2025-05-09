package com.alipay.android.msp.ui.widget;

import android.content.Context;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspLoadingWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MiniProgressDialog f3738a;
    public final boolean b;
    public volatile boolean c;

    public MspLoadingWrapper(Context context, String str, boolean z) {
        this(context, str, z, -1);
    }

    public CharSequence getLoadingsMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1d1363f9", new Object[]{this});
        }
        MiniProgressDialog miniProgressDialog = this.f3738a;
        if (miniProgressDialog != null) {
            return miniProgressDialog.getProgressMessage();
        }
        return "";
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        LogUtil.record(2, "MspLoadingWrapper:isShowing", "dialog.isShowing=" + this.f3738a.isShowing() + " isShowingLoading:" + this.c);
        MiniProgressDialog miniProgressDialog = this.f3738a;
        if (miniProgressDialog == null) {
            return false;
        }
        if (this.b) {
            return miniProgressDialog.isShowing();
        }
        return this.c;
    }

    public void setLoadingMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4f7afe", new Object[]{this, str});
            return;
        }
        MiniProgressDialog miniProgressDialog = this.f3738a;
        if (miniProgressDialog != null) {
            miniProgressDialog.setMessage(str);
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspLoadingWrapper:showLoading", "");
        MiniProgressDialog miniProgressDialog = this.f3738a;
        if (miniProgressDialog != null) {
            try {
                miniProgressDialog.show();
                this.c = true;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public void stopLoadingCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e839159e", new Object[]{this});
            return;
        }
        MiniProgressDialog miniProgressDialog = this.f3738a;
        if (miniProgressDialog != null) {
            miniProgressDialog.stopProgressCountDown();
        } else {
            LogUtil.record(2, "MspLoadingWrapper:stopLoadingCountDown", "mProgress=null");
        }
    }

    public MspLoadingWrapper(Context context, String str, boolean z, int i) {
        this.b = false;
        this.c = false;
        if (this.f3738a == null) {
            MiniProgressDialog miniProgressDialog = new MiniProgressDialog(context, i);
            this.f3738a = miniProgressDialog;
            miniProgressDialog.setCancelable(z);
            miniProgressDialog.setMessage(str);
        }
        this.b = DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_MSP_LOADING_SHOW_FIX, false, context);
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspLoadingWrapper:dismissLoading", "");
        MiniProgressDialog miniProgressDialog = this.f3738a;
        if (miniProgressDialog == null || !miniProgressDialog.isShowing()) {
            LogUtil.record(2, "MspLoadingWrapper:dismissLoading", "mProgress=" + this.f3738a);
            return;
        }
        this.f3738a.dismiss();
        this.c = false;
    }
}
