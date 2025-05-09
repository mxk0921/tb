package com.alipay.android.msp.ui.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FlybirdDialogImpl extends FlybirdDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FlybirdDialogImpl flybirdDialogImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/dialog/FlybirdDialogImpl");
    }

    public static Dialog showAntUIDialog(Context context, String str, String str2, String str3, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("339d8185", new Object[]{context, str, str2, str3, list});
        }
        return null;
    }

    public static Dialog showDialog(Context context, String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("9521f44e", new Object[]{context, str, str2, list}) : showDialog(context, str, str2, null, list);
    }

    public static Dialog showAntUIDialog(Context context, String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("c22cc1cf", new Object[]{context, str, str2, list}) : showAntUIDialog(context, str, str2, null, list);
    }

    public static Dialog showDialog(Context context, String str, String str2, String str3, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("61f0b244", new Object[]{context, str, str2, str3, list});
        }
        try {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspContextManager.getInstance().getLatestBizId());
            if (mspContextByBizId != null) {
                String str4 = !TextUtils.isEmpty(str) ? str : null;
                if (TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str2)) {
                    str4 = str2;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "null";
                }
                AlertIntelligenceEngine.startAction(mspContextByBizId, "dialog", str4, "", "");
            } else {
                LogUtil.record(8, "AntDialogBuilder:buildAndShow", "latest mspContext is null");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return FlybirdDialog.showDialogV2(context, str, str2, list);
    }

    public static boolean antDialogEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("911a25f3", new Object[]{context})).booleanValue();
        }
        return context != null && DrmManager.getInstance(context).isGray(DrmKey.GRAY_ANT_UI_FOR_DIALOG, false, context);
    }
}
