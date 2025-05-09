package com.alipay.android.msp.ui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.H5Utils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspDialogHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f3737a;
    public MspContext b;
    public final int c;
    public MspLoadingWrapper d;
    public Dialog e;
    public MspProgressDialogWithAction f;
    public Dialog g;
    public boolean h;

    public MspDialogHelper(Activity activity, MspContext mspContext) {
        this.f3737a = activity;
        this.b = mspContext;
        this.c = mspContext.getBizId();
    }

    public static /* synthetic */ void access$100(MspDialogHelper mspDialogHelper, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942dd07d", new Object[]{mspDialogHelper, str, str2, new Long(j)});
        } else {
            mspDialogHelper.a(str, str2, j);
        }
    }

    public static /* synthetic */ FlybirdDialogEventDesc access$200(MspDialogHelper mspDialogHelper, String str, final EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlybirdDialogEventDesc) ipChange.ipc$dispatch("6bd55e24", new Object[]{mspDialogHelper, str, eventAction});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new FlybirdDialogEventDesc(str, new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                UserFeedBackUtil.getInstance().setUserFeedBackTag("");
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspDialogHelper.access$400(MspDialogHelper.this));
                if (eventAction != null && mspContextByBizId != null) {
                    ActionsCreator.get(mspContextByBizId).createEventAction(eventAction);
                }
            }
        });
    }

    public static /* synthetic */ Activity access$300(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c660a433", new Object[]{mspDialogHelper});
        }
        return mspDialogHelper.f3737a;
    }

    public static /* synthetic */ int access$400(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3443fe89", new Object[]{mspDialogHelper})).intValue();
        }
        return mspDialogHelper.c;
    }

    public static /* synthetic */ void access$500(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d80797", new Object[]{mspDialogHelper});
            return;
        }
        if (mspDialogHelper.e == null) {
            mspDialogHelper.e = new Dialog(mspDialogHelper.f3737a, R.style.MspAppTheme);
            if (MiniProgressDialog.isSpecialDevice() && mspDialogHelper.e.getWindow() != null) {
                mspDialogHelper.e.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            if (mspDialogHelper.e.getWindow() != null) {
                mspDialogHelper.e.getWindow().addFlags(134217728);
                mspDialogHelper.e.getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                mspDialogHelper.e.getWindow().setLayout(-1, H5Utils.getScreenHeight(mspDialogHelper.f3737a));
            }
        }
        try {
            LogUtil.record(2, "MspDialogHelper:addMaskView", "act=" + mspDialogHelper.f3737a);
            mspDialogHelper.e.requestWindowFeature(1);
            mspDialogHelper.e.show();
            mspDialogHelper.e.setCanceledOnTouchOutside(false);
            mspDialogHelper.e.setCancelable(false);
            MspContext mspContext = mspDialogHelper.b;
            if (mspContext != null) {
                mspDialogHelper.b.getStatisticInfo().addEvent(new StEvent(mspContext.getCurrentWinTpName(), "dialog", "addMask"));
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public static /* synthetic */ MspProgressDialogWithAction access$700(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspProgressDialogWithAction) ipChange.ipc$dispatch("e833c91d", new Object[]{mspDialogHelper});
        }
        return mspDialogHelper.f;
    }

    public static /* synthetic */ MspProgressDialogWithAction access$702(MspDialogHelper mspDialogHelper, MspProgressDialogWithAction mspProgressDialogWithAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspProgressDialogWithAction) ipChange.ipc$dispatch("d84256db", new Object[]{mspDialogHelper, mspProgressDialogWithAction});
        }
        mspDialogHelper.f = mspProgressDialogWithAction;
        return mspProgressDialogWithAction;
    }

    public static /* synthetic */ Dialog access$800(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("37d0e1b5", new Object[]{mspDialogHelper});
        }
        return mspDialogHelper.g;
    }

    public static /* synthetic */ Dialog access$802(MspDialogHelper mspDialogHelper, Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("e992e49a", new Object[]{mspDialogHelper, dialog});
        }
        mspDialogHelper.g = dialog;
        return dialog;
    }

    public void addMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db286f9", new Object[]{this});
            return;
        }
        Activity activity = this.f3737a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:addMaskView", "return, act=" + this.f3737a);
            return;
        }
        TaskHelper.runOnUIThreadAsFast(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MspDialogHelper.access$500(MspDialogHelper.this);
                }
            }
        });
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        Dialog dialog = this.e;
        if (dialog != null && dialog.isShowing()) {
            this.e.dismiss();
            this.e = null;
        }
        this.b = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.f3737a = null;
    }

    public void dismissLoadingWithAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517d1115", new Object[]{this});
            return;
        }
        MspProgressDialogWithAction mspProgressDialogWithAction = this.f;
        if (mspProgressDialogWithAction != null) {
            mspProgressDialogWithAction.dismiss();
            this.f = null;
        }
    }

    public void dismissWalletLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7168a0", new Object[]{this});
            return;
        }
        try {
            Dialog dialog = this.g;
            if (dialog == null || !dialog.isShowing()) {
                LogUtil.record(2, "MspDialogHelper:dismissWalletLoading", "mDialog=" + this.g);
                return;
            }
            this.g.dismiss();
            this.g = null;
        } catch (Throwable unused) {
        }
    }

    public void removeMaskView(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da57427", new Object[]{this, new Integer(i)});
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspDialogHelper.access$600(MspDialogHelper.this, i);
                    }
                }
            }, i);
        }
    }

    public void setKeepLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84ea018", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void showLoadingWithAction(final Context context, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b799ef3", new Object[]{this, context, onClickListener});
            return;
        }
        Activity activity = this.f3737a;
        if (activity != null && !activity.isFinishing()) {
            final String localizedStringForKey = LanguageHelper.localizedStringForKey("alipay_processing_with_point", this.f3737a.getString(R.string.alipay_processing_with_point), new Object[0]);
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspDialogHelper.this.dismissDefaultLoading();
                    MspDialogHelper.this.dismissWalletLoading();
                    MspDialogHelper.this.dismissLoadingWithAction();
                    MspDialogHelper.access$702(MspDialogHelper.this, new MspProgressDialogWithAction(context));
                    MspDialogHelper.access$700(MspDialogHelper.this).setMessage(localizedStringForKey);
                    MspDialogHelper.access$700(MspDialogHelper.this).setIndeterminate(true);
                    MspDialogHelper.access$700(MspDialogHelper.this).setCanceledOnTouchOutside(true);
                    MspDialogHelper.access$700(MspDialogHelper.this).setProgressVisiable(true);
                    MspDialogHelper.access$700(MspDialogHelper.this).setActionIcon(R.drawable.alipay_msp_close_white);
                    MspDialogHelper.access$700(MspDialogHelper.this).setActionListener(onClickListener);
                    MspDialogHelper.access$700(MspDialogHelper.this).show();
                }
            });
        }
    }

    public void showWalletLoading(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52008e5", new Object[]{this, context, str});
            return;
        }
        Activity activity = this.f3737a;
        if (activity != null && !activity.isFinishing()) {
            final String localizedStringForKey = LanguageHelper.localizedStringForKey("alipay_processing_with_point", this.f3737a.getString(R.string.alipay_processing_with_point), new Object[0]);
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspDialogHelper.this.dismissWalletLoading();
                    if (MspDialogHelper.access$800(MspDialogHelper.this) == null) {
                        MspDialogHelper.access$802(MspDialogHelper.this, new Dialog(context, 16973948));
                        MspDialogHelper.access$800(MspDialogHelper.this).setContentView(R.layout.mini_local_progress_dialog);
                        TextView textView = (TextView) MspDialogHelper.access$800(MspDialogHelper.this).findViewById(R.id.progress_message);
                        if (TextUtils.isEmpty(str)) {
                            str2 = localizedStringForKey;
                        } else {
                            str2 = str;
                        }
                        textView.setText(str2);
                    }
                    MspDialogHelper.access$800(MspDialogHelper.this).setCanceledOnTouchOutside(false);
                    try {
                        MspDialogHelper.access$800(MspDialogHelper.this).show();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
            });
        }
    }

    public void stopDefaultLoadingCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08d3cfb", new Object[]{this});
            return;
        }
        MspLoadingWrapper mspLoadingWrapper = this.d;
        if (mspLoadingWrapper != null) {
            mspLoadingWrapper.stopLoadingCountDown();
            return;
        }
        LogUtil.record(2, "MspDialogHelper:stopDefaultLoadingCountDown", "mProgress=" + this.d);
    }

    public static /* synthetic */ void access$600(MspDialogHelper mspDialogHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e16756b", new Object[]{mspDialogHelper, new Integer(i)});
            return;
        }
        Dialog dialog = mspDialogHelper.e;
        if (dialog == null || !dialog.isShowing()) {
            LogUtil.record(2, "MspDialogHelper:removeMaskView", "else, delay=" + i + " act=" + mspDialogHelper.f3737a);
            return;
        }
        try {
            LogUtil.record(2, "MspDialogHelper:removeMaskView", "delay=" + i + " act=" + mspDialogHelper.f3737a);
            mspDialogHelper.e.dismiss();
            mspDialogHelper.e = null;
            MspContext mspContext = mspDialogHelper.b;
            if (mspContext != null) {
                mspDialogHelper.b.getStatisticInfo().addEvent(new StEvent(mspContext.getCurrentWinTpName(), "dialog", "removeMask"));
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public final void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        dismissDefaultLoading();
        dismissWalletLoading();
        removeMaskView(1500);
        LogUtil.record(2, "MspDialogHelper:showToast ", str + " icon : " + str2);
        if (!TextUtils.isEmpty(str2) && str2.contains("succ")) {
            CustomToast.showToast(this.f3737a, R.drawable.mini_icon_ok, str, j);
        } else if (TextUtils.isEmpty(str2) || !str2.contains("fail")) {
            CustomToast.showTextToastCenter(this.f3737a, str);
        } else {
            CustomToast.showToast(this.f3737a, R.drawable.mini_icon_fail, str, j);
        }
    }

    public void dismissDefaultLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86216ec", new Object[]{this});
            return;
        }
        Activity activity = this.f3737a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:dismissDefaultLoading", "mActivity =" + this.f3737a);
            AlertIntelligenceEngine.startAction(this.b, "loading", "hide", "", "");
            return;
        }
        MspContext mspContext = this.b;
        MspTradeContext mspTradeContext = mspContext instanceof MspTradeContext ? (MspTradeContext) mspContext : null;
        if (this.h) {
            LogUtil.record(2, "MspDialogHelper:dismissDefaultLoading", "handle keepLoading");
            return;
        }
        MspLoadingWrapper mspLoadingWrapper = this.d;
        if (mspLoadingWrapper == null || !mspLoadingWrapper.isShowing() || (mspTradeContext != null && mspTradeContext.isSubmitState())) {
            MspLoadingWrapper mspLoadingWrapper2 = this.d;
            if (mspLoadingWrapper2 == null || !mspLoadingWrapper2.isShowing()) {
                AlertIntelligenceEngine.startAction(this.b, "loading", "hide", "", "");
            }
            LogUtil.record(2, "MspDialogHelper:dismissDefaultLoading", "mProgress=" + this.d + " ,mspTradeContext=" + mspTradeContext);
            return;
        }
        this.h = false;
        AlertIntelligenceEngine.startAction(this.b, "loading", "hide", "", "");
        this.d.dismissLoading();
    }

    public void showDialog(final String str, final String str2, final List<MspDialogButton> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fd9d8b1", new Object[]{this, str, str2, list});
            return;
        }
        Activity activity = this.f3737a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:showDialog", "mActivity=" + this.f3737a);
            return;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MspDialogHelper.this.dismissDefaultLoading();
                MspDialogHelper.this.dismissWalletLoading();
                MspDialogHelper.this.removeMaskView(0);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    MspDialogButton mspDialogButton = (MspDialogButton) list.get(i);
                    FlybirdDialogEventDesc access$200 = MspDialogHelper.access$200(MspDialogHelper.this, mspDialogButton.mText, mspDialogButton.mEventAction);
                    if (access$200 != null) {
                        arrayList.add(access$200);
                    }
                }
                Activity access$300 = MspDialogHelper.access$300(MspDialogHelper.this);
                Activity vidTopActivity = PhoneCashierMspEngine.getMspViSec().getVidTopActivity();
                if (vidTopActivity != null && !vidTopActivity.isFinishing()) {
                    LogUtil.record(4, "showDialog:", "vidActivity != null");
                    access$300 = vidTopActivity;
                }
                FlybirdDialogImpl.showDialog(access$300, str, str2, arrayList);
            }
        });
    }

    public void showToast(final String str, final String str2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e52e1f", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        Activity activity = this.f3737a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:showToast", "mActivity=" + this.f3737a);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            a(str, str2, j);
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspDialogHelper.access$100(MspDialogHelper.this, str, str2, j);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void access$000(MspDialogHelper mspDialogHelper, String[] strArr) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2756d4d", new Object[]{mspDialogHelper, strArr});
            return;
        }
        String str = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        MspLoadingWrapper mspLoadingWrapper = mspDialogHelper.d;
        if (mspLoadingWrapper != null && mspLoadingWrapper.isShowing()) {
            LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "mProgress isShowing =" + mspDialogHelper.d);
            if (!TextUtils.equals(mspDialogHelper.d.getLoadingsMessage(), str)) {
                mspDialogHelper.d.setLoadingMessage(str);
            }
        } else if (mspDialogHelper.b == null) {
            LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "mMspContext null");
        } else {
            mspDialogHelper.dismissDefaultLoading();
            MspWindowClient mspWindowClient = (MspWindowClient) mspDialogHelper.b.getMspUIClient();
            if (mspWindowClient == null || !mspWindowClient.isVidActivityVisible() || !mspWindowClient.isVidExitMode()) {
                activity = mspDialogHelper.f3737a;
            } else {
                activity = mspWindowClient.getVidActivity();
            }
            if (activity == null || activity.isFinishing()) {
                LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "activity =".concat(String.valueOf(activity)));
                return;
            }
            AlertIntelligenceEngine.startAction(mspDialogHelper.b, "loading", "show", "", "");
            mspDialogHelper.h = false;
            mspDialogHelper.d = new MspLoadingWrapper(activity, str, false, mspDialogHelper.c);
            try {
                CustomToast.cancelToast();
                mspDialogHelper.d.showLoading();
                LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "mProgress show =" + mspDialogHelper.d + " ,activity=" + activity);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public void showDefaultLoading(final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ae4220", new Object[]{this, strArr});
            return;
        }
        Activity activity = this.f3737a;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(2, "MspDialogHelper:showDefaultLoading", "mActivity=" + this.f3737a);
        } else if (this.h) {
            this.h = false;
            LogUtil.record(2, "MspDialogHelper:doShowDefaultLoading", "handle keepLoading");
        } else {
            TaskHelper.runOnUIThreadAsFast(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MspDialogHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspDialogHelper.access$000(MspDialogHelper.this, strArr);
                    }
                }
            });
        }
    }
}
