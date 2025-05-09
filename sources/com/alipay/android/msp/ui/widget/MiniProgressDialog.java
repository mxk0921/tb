package com.alipay.android.msp.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.Animation;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import anet.channel.Constants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.H5Utils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MiniProgressDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_BIZ_ID = -1;
    public static long f = 15000;

    /* renamed from: a  reason: collision with root package name */
    public final MiniProgressLottieView f3736a;
    public Context b;
    public long c;
    public final int d;
    public final Handler e;

    public MiniProgressDialog(Context context) {
        super(context, R.style.ProgressDialog);
        this.c = -1L;
        this.d = -1;
        this.e = new Handler(Looper.getMainLooper()) { // from class: com.alipay.android.msp.ui.widget.MiniProgressDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/MiniProgressDialog$1");
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                MspContext mspContextByBizId;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (MiniProgressDialog.access$000(MiniProgressDialog.this) == -1 || currentTimeMillis - MiniProgressDialog.access$000(MiniProgressDialog.this) <= MiniProgressDialog.access$100()) {
                    sendEmptyMessageDelayed(1, 1000L);
                    return;
                }
                LogUtil.record(4, "MiniProgressDialog:dispatchMessage", "超时");
                if (!(MiniProgressDialog.access$200(MiniProgressDialog.this) == -1 || (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MiniProgressDialog.access$200(MiniProgressDialog.this))) == null)) {
                    if (!(mspContextByBizId instanceof MspTradeContext)) {
                        StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                        StringBuilder sb = new StringBuilder();
                        sb.append(mspContextByBizId.getBizId());
                        statisticInfo.addError(ErrorType.DEFAULT, "LoadingTimeout", sb.toString());
                        ActionsCreator.get(mspContextByBizId).createExceptionAction(new RuntimeException("请求处理超时"));
                    } else if (((MspTradeContext) mspContextByBizId).isHasRPC()) {
                        removeMessages(1);
                    } else if (MiniProgressDialog.access$100() < Constants.RECV_TIMEOUT) {
                        MiniProgressDialog.access$102(Constants.RECV_TIMEOUT);
                        sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                }
                removeMessages(1);
                MiniProgressDialog.access$002(MiniProgressDialog.this, -1L);
            }
        };
        this.b = context;
        String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_MiniPDialog_outtime");
        if (walletConfig != null && walletConfig.length() > 0) {
            try {
                f = Long.parseLong(walletConfig);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        this.f3736a = new MiniProgressLottieView(this.b);
    }

    public static /* synthetic */ long access$000(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dff0e166", new Object[]{miniProgressDialog})).longValue();
        }
        return miniProgressDialog.c;
    }

    public static /* synthetic */ long access$002(MiniProgressDialog miniProgressDialog, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f975d08", new Object[]{miniProgressDialog, new Long(j)})).longValue();
        }
        miniProgressDialog.c = j;
        return j;
    }

    public static /* synthetic */ long access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ac", new Object[0])).longValue();
        }
        return f;
    }

    public static /* synthetic */ long access$102(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49363c3e", new Object[]{new Long(j)})).longValue();
        }
        f = j;
        return j;
    }

    public static /* synthetic */ int access$200(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebf87823", new Object[]{miniProgressDialog})).intValue();
        }
        return miniProgressDialog.d;
    }

    public static /* synthetic */ void access$300(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1fc438f", new Object[]{miniProgressDialog});
        } else {
            miniProgressDialog.a();
        }
    }

    public static /* synthetic */ MiniProgressLottieView access$400(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniProgressLottieView) ipChange.ipc$dispatch("bf6f024b", new Object[]{miniProgressDialog});
        }
        return miniProgressDialog.f3736a;
    }

    public static /* synthetic */ void access$500(MiniProgressDialog miniProgressDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe03da4d", new Object[]{miniProgressDialog});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:doDismissSelf", "");
        try {
            miniProgressDialog.e.removeMessages(1);
            if (super.isShowing()) {
                super.dismiss();
            }
            miniProgressDialog.c = -1L;
        } catch (Exception unused) {
        }
        miniProgressDialog.b = null;
        miniProgressDialog.f3736a.stopAnimation();
    }

    public static /* synthetic */ Object ipc$super(MiniProgressDialog miniProgressDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1373052399:
                super.dismiss();
                return null;
            case -742181306:
                return new Boolean(super.isShowing());
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/MiniProgressDialog");
        }
    }

    public static boolean isSpecialDevice() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7cbd70", new Object[0])).booleanValue();
        }
        String str2 = Build.MANUFACTURER;
        if (!(str2 == null || (str = Build.MODEL) == null)) {
            String lowerCase = str2.toLowerCase();
            String lowerCase2 = str.toLowerCase();
            if (lowerCase.contains("lenovo") && lowerCase2.contains("a820t")) {
                return true;
            }
            if (lowerCase.contains("meizu") && lowerCase2.contains("m040")) {
                return true;
            }
            if (lowerCase.contains("vivo") && lowerCase2.contains("y11")) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc5e136", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:doDismiss", "");
        this.f3736a.startDismissAnimation(new Animation.AnimationListener() { // from class: com.alipay.android.msp.ui.widget.MiniProgressDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                LogUtil.record(2, "MiniProgressDialog:doDismiss:onAnimationEnd", "");
                MiniProgressDialog.access$400(MiniProgressDialog.this).setVisibility(4);
                MiniProgressDialog.access$500(MiniProgressDialog.this);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (TaskHelper.isMainThread()) {
            a();
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.MiniProgressDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MiniProgressDialog.access$300(MiniProgressDialog.this);
                    }
                }
            });
        }
    }

    public String getProgressMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94705a95", new Object[]{this});
        }
        return this.f3736a.getProgressMessage();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        LogUtil.record(2, "MiniProgressDialog:onCreate", "");
        setContentView(this.f3736a);
        if (getWindow() != null) {
            getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            getWindow().setLayout(-1, H5Utils.getScreenHeight(this.b));
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public MiniProgressDialog setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniProgressDialog) ipChange.ipc$dispatch("7d437a69", new Object[]{this, charSequence});
        }
        this.f3736a.setMessage(charSequence);
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        this.c = System.currentTimeMillis();
        this.e.sendEmptyMessageDelayed(1, 1000L);
    }

    public void stopProgressCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7e9a49", new Object[]{this});
            return;
        }
        try {
            this.e.removeMessages(1);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public MiniProgressDialog(Context context, int i) {
        this(context);
        this.d = i;
    }
}
