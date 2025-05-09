package com.alipay.android.msp.ui.views;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.component.JsExceptionReceiver;
import com.alipay.android.msp.core.component.MspNetWorkStateReceiver;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.model.H5PopUpWindowItem;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.perf.ThreadController;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.track.MspTrackInfo;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.NavBarClickAction;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.ui.base.keyboard.KeyboardManager;
import com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin;
import com.alipay.android.msp.ui.contracts.MspMainContract;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.alipay.android.msp.ui.widget.MspRoundRadiusLayout;
import com.alipay.android.msp.ui.widget.UserInfoWidget;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.alipay.android.msp.utils.StatusBarUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.birdnest.view.SystemDefaultDialog;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.mobile.beehive.eventbus.IEventSubscriber;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBTools;
import com.taobao.taobao.R;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.acq;
import tb.pg1;
import tb.slo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspContainerActivity extends MspBaseActivity<MspMainContract.Presenter> implements MspMainContract.View, IEventSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATION_TYPE_NEXT = 1;
    public static final int ANIMATION_TYPE_PRE = 0;
    private MspContext mMspContext;
    private View mNavBarView;
    private View nE;
    private MspRoundRadiusLayout nF;
    private MspDialogHelper nH;
    private NavBarPlugin.OnNavBarShownListener nI;
    private BroadcastReceiver nM;
    private MspNetWorkStateReceiver nR;
    private float nW;
    private float nX;
    private LinearLayout ne;
    private TextView nf;
    private TextView ng;
    private TextView nh;
    private ImageView ni;
    private ImageView nj;
    private RelativeLayout nk;
    private UserInfoWidget nl;
    private View nm;
    private View nn;
    private View nv;
    private View nz;
    private long startTime;
    private boolean nd = false;
    private Animation no = null;
    private Animation np = null;
    private Animation nq = null;
    private String nr = null;
    private String ns = null;
    private String nt = null;
    private int nu = 0;
    private boolean nw = true;
    private boolean nx = false;
    private boolean ny = false;
    private boolean nA = false;
    private boolean nB = false;
    private boolean nC = false;
    private boolean nD = false;
    private String nG = "";
    private String bX = Grammar.ATTR_DEFAULT_VALUE;
    private String nJ = "";
    private boolean nK = false;
    private boolean nL = false;
    private final IntentFilter nN = new IntentFilter(MspGlobalDefine.ASSET_MISS_FILTER);
    private boolean nO = false;
    private boolean nP = false;
    private boolean nQ = false;
    private boolean nS = false;
    private int nT = 25;
    private boolean nU = false;
    private boolean nV = false;
    private int nY = -1;
    private int nZ = -1;
    public final View.OnLayoutChangeListener heightChangeListener = new View.OnLayoutChangeListener() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.13
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            ViewGroup viewGroup = (ViewGroup) MspContainerActivity.this.findViewById(R.id.flybird_userinfo);
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                int[] iArr = new int[2];
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                layoutParams.height = Math.max(iArr2[1] - iArr[1], 0);
                LogUtil.i("MspContainerActivity", "onLayoutChange", "expected lp: " + layoutParams.height + "," + layoutParams.width + " from " + Arrays.toString(iArr) + ", " + Arrays.toString(iArr2));
                UserInfoWidget access$3100 = MspContainerActivity.access$3100(MspContainerActivity.this);
                if (access$3100 != null) {
                    ViewGroup.LayoutParams layoutParams2 = access$3100.getLayoutParams();
                    layoutParams2.height = layoutParams.height;
                    access$3100.setLayoutParams(layoutParams2);
                }
                viewGroup.requestLayout();
            }
        }
    };

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.ui.views.MspContainerActivity$18  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass18 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass18() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                boolean isMspInProcessTask = Utils.isMspInProcessTask(MspContainerActivity.access$100(MspContainerActivity.this).isFromWallet(), MspContainerActivity.this);
                LogUtil.i("MspContainerActivity", "onResume", "isMspInProcessTask".concat(String.valueOf(isMspInProcessTask)));
                MspContainerActivity.access$100(MspContainerActivity.this).getMspUIClient().setMspInProcessTask(isMspInProcessTask);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.alipay.android.msp.core.frame.MspWindowFrame r17, final android.view.View r18, final int r19) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspContainerActivity.a(com.alipay.android.msp.core.frame.MspWindowFrame, android.view.View, int):void");
    }

    public static /* synthetic */ void access$000(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246afa40", new Object[]{mspContainerActivity});
            return;
        }
        try {
            mspContainerActivity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final int latestBizId = MspContextManager.getInstance().getLatestBizId();
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(latestBizId);
                    final MspWindowFrame topTplOrNativeFrame = (mspContextByBizId == null || mspContextByBizId.getWindowStack() == null) ? null : mspContextByBizId.getWindowStack().getTopTplOrNativeFrame();
                    SpmWrapper.onPageExposure(topTplOrNativeFrame, "a283.b18456.c46421", "", "", "", "{}", latestBizId);
                    SystemDefaultDialog.showDialog(MspContainerActivity.access$100(MspContainerActivity.this).getContext(), "", LanguageHelper.localizedStringForKey("alipay_assets_miss_message", MspContainerActivity.access$100(MspContainerActivity.this).getContext().getString(R.string.alipay_assets_miss_message), new Object[0]), LanguageHelper.localizedStringForKey("alipay_assets_miss_confirm", MspContainerActivity.access$100(MspContainerActivity.this).getContext().getString(R.string.alipay_assets_miss_confirm), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.19.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            SpmWrapper.onPageExposure(topTplOrNativeFrame, "a283.b18456.c46421.d94916", "", "", "", "{}", latestBizId);
                            dialogInterface.dismiss();
                            MspContainerActivity.this.finish();
                        }
                    }, "", null);
                }
            });
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ MspContext access$100(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("fd73cf2b", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.mMspContext;
    }

    public static /* synthetic */ boolean access$1000(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe7ce33", new Object[]{mspContainerActivity})).booleanValue();
        }
        return mspContainerActivity.nx;
    }

    public static /* synthetic */ boolean access$1002(MspContainerActivity mspContainerActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c91a4147", new Object[]{mspContainerActivity, new Boolean(z)})).booleanValue();
        }
        mspContainerActivity.nx = z;
        return z;
    }

    public static /* synthetic */ String access$1100(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f1bbf0", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nG;
    }

    public static /* synthetic */ NavBarPlugin.OnNavBarShownListener access$1200(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavBarPlugin.OnNavBarShownListener) ipChange.ipc$dispatch("d636342", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nI;
    }

    public static /* synthetic */ ImageView access$1300(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("c9507c1e", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.ni;
    }

    public static /* synthetic */ void access$1400(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29be5033", new Object[]{mspContainerActivity});
        } else {
            mspContainerActivity.ai();
        }
    }

    public static /* synthetic */ String access$1502(MspContainerActivity mspContainerActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9227220", new Object[]{mspContainerActivity, str});
        }
        mspContainerActivity.nr = str;
        return str;
    }

    public static /* synthetic */ String access$1602(MspContainerActivity mspContainerActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9a439ff", new Object[]{mspContainerActivity, str});
        }
        mspContainerActivity.ns = str;
        return str;
    }

    public static /* synthetic */ String access$1700(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1df9a5aa", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nt;
    }

    public static /* synthetic */ String access$1702(MspContainerActivity mspContainerActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba2601de", new Object[]{mspContainerActivity, str});
        }
        mspContainerActivity.nt = str;
        return str;
    }

    public static /* synthetic */ int access$1802(MspContainerActivity mspContainerActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b0d7e5d", new Object[]{mspContainerActivity, new Integer(i)})).intValue();
        }
        mspContainerActivity.nu = i;
        return i;
    }

    public static /* synthetic */ void access$1900(MspContainerActivity mspContainerActivity, View view, MspWindowFrame mspWindowFrame, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451b0080", new Object[]{mspContainerActivity, view, mspWindowFrame, new Integer(i), new Integer(i2)});
        } else {
            mspContainerActivity.a(view, mspWindowFrame, i, i2);
        }
    }

    public static /* synthetic */ boolean access$200(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99563b46", new Object[]{mspContainerActivity})).booleanValue();
        }
        return mspContainerActivity.nA;
    }

    public static /* synthetic */ void access$2000(MspContainerActivity mspContainerActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c27dc44", new Object[]{mspContainerActivity, view});
        } else {
            mspContainerActivity.removeViewFromMainLayout(view);
        }
    }

    public static /* synthetic */ boolean access$202(MspContainerActivity mspContainerActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d797694", new Object[]{mspContainerActivity, new Boolean(z)})).booleanValue();
        }
        mspContainerActivity.nA = z;
        return z;
    }

    public static /* synthetic */ Animation access$2100(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("fc62a8a7", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.no;
    }

    public static /* synthetic */ View access$2200(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("25dc0312", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nm;
    }

    public static /* synthetic */ void access$2300(MspContainerActivity mspContainerActivity, MspWindowFrame mspWindowFrame, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2843388", new Object[]{mspContainerActivity, mspWindowFrame, view, new Integer(i)});
        } else {
            mspContainerActivity.b(mspWindowFrame, view, i);
        }
    }

    public static /* synthetic */ void access$2400(MspContainerActivity mspContainerActivity, MspWindowFrame mspWindowFrame, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92472749", new Object[]{mspContainerActivity, mspWindowFrame, view, new Integer(i)});
        } else {
            mspContainerActivity.a(mspWindowFrame, view, i);
        }
    }

    public static /* synthetic */ void access$2500(MspContainerActivity mspContainerActivity, MspWindowFrame mspWindowFrame, View view, int i, StEvent stEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9687c0fd", new Object[]{mspContainerActivity, mspWindowFrame, view, new Integer(i), stEvent, new Long(j)});
        } else {
            mspContainerActivity.a(mspWindowFrame, view, i, stEvent, j);
        }
    }

    public static /* synthetic */ RelativeLayout access$2600(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("991172e4", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nk;
    }

    public static /* synthetic */ View access$2700(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("49a86e57", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nv;
    }

    public static /* synthetic */ View access$2702(MspContainerActivity mspContainerActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2978101d", new Object[]{mspContainerActivity, view});
        }
        mspContainerActivity.nv = view;
        return view;
    }

    public static /* synthetic */ Animation access$2802(MspContainerActivity mspContainerActivity, Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("dc1b47fe", new Object[]{mspContainerActivity, animation});
        }
        mspContainerActivity.nq = animation;
        return animation;
    }

    public static /* synthetic */ boolean access$2902(MspContainerActivity mspContainerActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2dbb21f", new Object[]{mspContainerActivity, new Boolean(z)})).booleanValue();
        }
        mspContainerActivity.nw = z;
        return z;
    }

    public static /* synthetic */ TextView access$300(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("9e7e2b37", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nf;
    }

    public static /* synthetic */ void access$3000(MspContainerActivity mspContainerActivity, MspWindowFrame mspWindowFrame, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd6dca4", new Object[]{mspContainerActivity, mspWindowFrame, view, new Integer(i)});
        } else {
            mspContainerActivity.c(mspWindowFrame, view, i);
        }
    }

    public static /* synthetic */ UserInfoWidget access$3100(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserInfoWidget) ipChange.ipc$dispatch("82e1ded6", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nl;
    }

    public static /* synthetic */ View access$3200(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3cf68f1", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nE;
    }

    public static /* synthetic */ MspDialogHelper access$3300(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspDialogHelper) ipChange.ipc$dispatch("f5733d01", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nH;
    }

    public static /* synthetic */ boolean access$400(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e417c48", new Object[]{mspContainerActivity})).booleanValue();
        }
        return mspContainerActivity.nB;
    }

    public static /* synthetic */ boolean access$402(MspContainerActivity mspContainerActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f655d2", new Object[]{mspContainerActivity, new Boolean(z)})).booleanValue();
        }
        mspContainerActivity.nB = z;
        return z;
    }

    public static /* synthetic */ TextView access$500(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("e570639", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.ng;
    }

    public static /* synthetic */ boolean access$600(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832cbd4a", new Object[]{mspContainerActivity})).booleanValue();
        }
        return mspContainerActivity.nC;
    }

    public static /* synthetic */ boolean access$602(MspContainerActivity mspContainerActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee733510", new Object[]{mspContainerActivity, new Boolean(z)})).booleanValue();
        }
        mspContainerActivity.nC = z;
        return z;
    }

    public static /* synthetic */ TextView access$700(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("7e2fe13b", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nh;
    }

    public static /* synthetic */ boolean access$800(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f817fe4c", new Object[]{mspContainerActivity})).booleanValue();
        }
        return mspContainerActivity.nD;
    }

    public static /* synthetic */ boolean access$802(MspContainerActivity mspContainerActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16f0144e", new Object[]{mspContainerActivity, new Boolean(z)})).booleanValue();
        }
        mspContainerActivity.nD = z;
        return z;
    }

    public static /* synthetic */ ImageView access$900(MspContainerActivity mspContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("9ace4e7", new Object[]{mspContainerActivity});
        }
        return mspContainerActivity.nj;
    }

    private void ae() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
            return;
        }
        if (TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_main_layout_use_frame_layout"), "10000") && (this.mMspContext instanceof MspContainerContext)) {
            z = true;
        }
        this.nV = z;
        if (z) {
            setContentView(R.layout.flybird_layout);
        } else {
            setContentView(R.layout.flybird_layout_pre);
        }
    }

    private void af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
            return;
        }
        LogUtil.i("MspContainerActivity", "finishSelfOnEx", toString());
        if ((this instanceof MspUniRenderActivity) && TextUtils.equals(getPackageName(), "com.eg.android.AlipayGphone")) {
            PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
        }
        finish();
    }

    private void ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab633caf", new Object[]{this});
            return;
        }
        try {
            Drawable background = this.mNavBarView.getBackground();
            if (background != null) {
                background.setAlpha(0);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private int aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab715423", new Object[]{this})).intValue();
        }
        return (int) (UIUtil.getDp(this) * 16.0f);
    }

    private boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        try {
            this.mBizId = intent.getIntExtra(MspBaseActivity.KEY_ID, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(this.mBizId);
            LogUtil.i("MspContainerActivity", "init", sb.toString());
            if (this.mBizId != 0) {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
                this.mMspContext = mspContextByBizId;
                if (mspContextByBizId == null) {
                    Object obj = StatisticCollector.GLOBAL_AGENT;
                    StatisticCollector.addError(obj, ErrorType.WARNING, "handleInit", "bizId=" + this.mBizId);
                    return false;
                }
                mspContextByBizId.setTaskId(getTaskId());
                MspContextUtil.resetResource();
                MspTrackInfo.getInstance().resetRefer();
                return true;
            }
            throw new AppErrorException("no biz id(18)");
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "handleInit", e);
            LogUtil.printExceptionStackTrace(e);
            return false;
        }
    }

    private void c(View view) {
        View view2;
        RelativeLayout d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else if (view != null && (view2 = this.nm) != null && (d = d(view2)) != null) {
            this.nw = true;
            float height = this.nm.getHeight();
            float height2 = view.getHeight();
            float abs = Math.abs(height2 - height);
            this.nv = new View(this);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            if (!TextUtils.isEmpty(this.nr)) {
                try {
                    LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "MspContainerActivity::createAnimationBackView", "underGroundColor:" + this.nr);
                    gradientDrawable.setColor(Color.parseColor(this.nr));
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
            gradientDrawable.setCornerRadius(UIUtil.getDp(this) * 8.0f);
            this.nv.setBackgroundDrawable(gradientDrawable);
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "MspContainerActivity::createAnimationBackView", "underGroundHeightPadding:" + this.nu);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (Math.max(height, height2) - ((float) this.nu)));
            layoutParams.addRule(12);
            if (abs < 2.0f) {
                this.nq = new AlphaAnimation(1.0f, 1.0f);
            } else if (height2 > height) {
                this.nq = new TranslateAnimation(0.0f, 0.0f, 0.0f, -abs);
                layoutParams.setMargins(0, 0, 0, -((int) abs));
            } else {
                this.nq = new TranslateAnimation(0.0f, 0.0f, 0.0f, abs);
            }
            this.nq.setDuration(300L);
            this.nq.setInterpolator(new DecelerateInterpolator());
            this.nq.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    if (MspContainerActivity.access$2600(MspContainerActivity.this) != null) {
                        MspContainerActivity.access$2600(MspContainerActivity.this).removeView(MspContainerActivity.access$2700(MspContainerActivity.this));
                    }
                    MspContainerActivity.access$2702(MspContainerActivity.this, null);
                    MspContainerActivity.access$2802(MspContainerActivity.this, null);
                    MspContainerActivity.access$2902(MspContainerActivity.this, false);
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
            this.nv.setLayoutParams(layoutParams);
            d.addView(this.nv, 0);
        }
    }

    private static RelativeLayout d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("18eba6d7", new Object[]{view});
        }
        if (view == null || view.getParent() == null) {
            return null;
        }
        if (view.getParent() instanceof RelativeLayout) {
            return (RelativeLayout) view.getParent();
        }
        if (!(view.getParent() instanceof MspRoundRadiusLayout) || !(view.getParent().getParent() instanceof RelativeLayout)) {
            return null;
        }
        return (RelativeLayout) view.getParent().getParent();
    }

    private void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
        } else if (view != null) {
            try {
                FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(view);
                WindowManager windowManager = (WindowManager) getSystemService(pg1.ATOM_EXT_window);
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    defaultDisplay.getMetrics(new DisplayMetrics());
                    if (this.mMspContext.getGrayOnPadAdaptMode()) {
                        a(view, defaultDisplay, fbContextFromView);
                    } else {
                        a(defaultDisplay, fbContextFromView);
                    }
                    KeyboardManager.getInstance().onConfigurationChanged(this);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MspContainerActivity mspContainerActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1398848845:
                super.onPostResume();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 409508262:
                super.stopLoadingView();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 607721974:
                super.showDialogView((String) objArr[0], (String) objArr[1], (List) objArr[2]);
                return null;
            case 656826868:
                super.showLoadingView((String[]) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 885118356:
                super.finishAndRemoveTask();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 1998923258:
                super.showToastView((String) objArr[0], (String) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/views/MspContainerActivity");
        }
    }

    private void removeViewFromMainLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218880f5", new Object[]{this, view});
        } else if (this.nk != null && view != null) {
            RelativeLayout d = d(view);
            if (d != null) {
                d.removeAllViews();
                this.nk.removeView(d);
            }
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeAllViews();
            }
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void addMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db286f9", new Object[]{this});
        } else if (this.nH != null) {
            LogUtil.i("MspContainerActivity", "addMaskView", "curTplId=" + this.nG + " activity=" + this);
            this.nH.addMaskView();
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void addViewToMainLayout(View view, MspWindowFrame mspWindowFrame, int i) {
        boolean z;
        MspExtSceneManager mspExtSceneManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc2b996", new Object[]{this, view, mspWindowFrame, new Integer(i)});
            return;
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "addViewToMainLayout");
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        if (this.mMspContext.getGrayUnifiedReadPadConfig()) {
            mspExtSceneManager = this.mMspContext.getMspExtSceneManager();
            if (mspExtSceneManager != null) {
                z = mspExtSceneManager.onPadAdaptMode(this, mspWindowFrame.getTplId(), this.mMspContext.getGrayOnPadAdaptMode());
            } else {
                LogUtil.record(1, "MspContainerActivity:addViewToMainLayout", "extSceneManager is null");
                z = false;
            }
        } else {
            mspExtSceneManager = MspExtSceneManager.getInstance(this);
            z = MspExtSceneManager.onPadAdaptMode(this, mspExtSceneManager, mspWindowFrame.getTplId(), this.mMspContext.getGrayOnPadAdaptMode());
        }
        this.nL = z;
        if (this.mMspContext.getGrayUnifiedReadPadConfig()) {
            if (this.mMspContext.getGrayOnPadAdaptMode() && this.nK && !mspWindowFrame.getRerendStatus() && !TextUtils.equals(mspWindowFrame.getActivityConfiguration(), this.nJ) && mspWindowFrame.getInPrevStack() && mspExtSceneManager != null && mspExtSceneManager.isAutoRotatingTpl(mspWindowFrame.getTplId())) {
                e(view);
                LogUtil.record(2, "MspContainerActivity:addViewToMainLayout", "Rerend view curTplId=" + mspWindowFrame.getTplId() + " activity=" + this);
                return;
            }
        } else if (this.mMspContext.getGrayOnPadAdaptMode() && this.nK && !TextUtils.equals(mspWindowFrame.getActivityConfiguration(), this.nJ) && mspWindowFrame.getInPrevStack() && MspExtSceneManager.isAutoRotatingTpl(mspWindowFrame.getTplId(), this)) {
            e(view);
            LogUtil.record(2, "MspContainerActivity:addViewToMainLayout", "Rerend view curTplId=" + mspWindowFrame.getTplId() + " activity=" + this);
            return;
        }
        if (z) {
            if (this.nK && !TextUtils.equals(mspWindowFrame.getActivityConfiguration(), this.nJ)) {
                e(view);
            }
            if (!FlybirdUtil.isFullScreen(view)) {
                MspRoundRadiusLayout mspRoundRadiusLayout = new MspRoundRadiusLayout(this);
                this.nF = mspRoundRadiusLayout;
                mspRoundRadiusLayout.setBackgroundColor(0);
                this.nF.setTopRoundRadius(aj());
                this.nF.setBottomRoundRadius(aj());
                this.nF.addView(view, new FrameLayout.LayoutParams(mspExtSceneManager.getDisplayWidth(this), -2));
                this.nE = this.nF;
            } else {
                this.nE = view;
            }
            if (FlybirdUtil.isFullScreen(view)) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(12);
                relativeLayout.addView(this.nE, layoutParams);
                a(mspWindowFrame, true);
                String str = "";
                if (this.mMspContext.getGrayUnifiedReadPadConfig()) {
                    if (!mspExtSceneManager.isFullScreenTpl(mspWindowFrame.getTplId())) {
                        try {
                            JSONObject parseObject = JSON.parseObject(mspWindowFrame.getTplString());
                            if (parseObject != null && parseObject.size() > 0) {
                                str = parseObject.getString("time");
                            }
                            StatisticInfo statisticInfo = this.mMspContext.getStatisticInfo();
                            statisticInfo.addError(ErrorType.DEFAULT, "render_pad_fs_unexpected", mspWindowFrame.getTplId() + "|" + str);
                            e(view);
                            if (mspExtSceneManager.isAutoRotatingTpl(mspWindowFrame.getTplId())) {
                                return;
                            }
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                    }
                } else if (!MspExtSceneManager.isFullScreenTpl(mspWindowFrame.getTplId(), this)) {
                    try {
                        JSONObject parseObject2 = JSON.parseObject(mspWindowFrame.getTplString());
                        if (parseObject2 != null && parseObject2.size() > 0) {
                            str = parseObject2.getString("time");
                        }
                        StatisticInfo statisticInfo2 = this.mMspContext.getStatisticInfo();
                        statisticInfo2.addError(ErrorType.DEFAULT, "render_pad_fs_unexpected", mspWindowFrame.getTplId() + "|" + str);
                        e(view);
                        if (MspExtSceneManager.isAutoRotatingTpl(mspWindowFrame.getTplId(), this)) {
                            return;
                        }
                    } catch (Throwable th2) {
                        LogUtil.printExceptionStackTrace(th2);
                    }
                }
            } else if (FlybirdUtil.isShowNavBar(mspWindowFrame.getTplId())) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(10);
                relativeLayout.addView(this.nE, layoutParams2);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(13);
                relativeLayout.addView(this.nE, layoutParams3);
                a(mspWindowFrame, true);
            }
        } else {
            if (!FlybirdUtil.isFullScreen(view)) {
                MspRoundRadiusLayout mspRoundRadiusLayout2 = new MspRoundRadiusLayout(this);
                this.nF = mspRoundRadiusLayout2;
                mspRoundRadiusLayout2.setBackgroundColor(0);
                this.nF.setTopRoundRadius(aj());
                this.nF.addView(view, new FrameLayout.LayoutParams(-2, -2));
                this.nE = this.nF;
            } else {
                this.nE = view;
            }
            if (FlybirdUtil.isFullScreen(view)) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams4.addRule(12);
                relativeLayout.addView(this.nE, layoutParams4);
            } else if (FlybirdUtil.isShowNavBar(mspWindowFrame.getTplId())) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams5.addRule(10);
                relativeLayout.addView(this.nE, layoutParams5);
            } else {
                if (this.mMspContext.getGrayUnifiedReadPadConfig()) {
                    if (this.nK && (mspExtSceneManager == null || !mspExtSceneManager.isAutoRotatingTpl(this.nG) || TextUtils.equals(mspWindowFrame.getActivityConfiguration(), this.nJ))) {
                        e(view);
                    }
                } else if (this.nK) {
                    e(view);
                }
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams6.addRule(12);
                relativeLayout.addView(this.nE, layoutParams6);
            }
        }
        relativeLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                }
                return true;
            }
        });
        try {
            RelativeLayout relativeLayout2 = this.nk;
            if (relativeLayout2 != null) {
                relativeLayout2.addView(relativeLayout, -1, -1);
            } else {
                MspContext mspContext2 = this.mMspContext;
                if (mspContext2 == null || mspContext2.isExit()) {
                    MspContext mspContext3 = this.mMspContext;
                    if (mspContext3 != null) {
                        mspContext3.getStatisticInfo().addError(ErrorType.DEFAULT, "addViewNull", "mspContext exit");
                    }
                } else {
                    MspContext mspContext4 = this.mMspContext;
                    if (mspContext4 != null) {
                        mspContext4.getStatisticInfo().addError(ErrorType.DEFAULT, "addViewNull", "mspContext not exit");
                    }
                    RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.flybird_layout);
                    this.nk = relativeLayout3;
                    relativeLayout3.addView(relativeLayout, -1, -1);
                }
            }
        } catch (Throwable th3) {
            MspContext mspContext5 = this.mMspContext;
            if (mspContext5 != null) {
                mspContext5.getStatisticInfo().addError(ErrorType.DEFAULT, "addViewErr", th3);
            }
            LogUtil.printExceptionStackTrace(th3);
        }
        MspContext mspContext6 = this.mMspContext;
        if (mspContext6 != null && mspContext6.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "addViewToMainLayout");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void dismissDefaultLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86216ec", new Object[]{this});
            return;
        }
        MspDialogHelper mspDialogHelper = this.nH;
        if (mspDialogHelper != null) {
            mspDialogHelper.dismissDefaultLoading();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void disposeActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c89bd5", new Object[]{this});
            return;
        }
        LogUtil.i("MspContainerActivity", "disposeActivity", "ctx=" + this.mMspContext);
        try {
            MspContext mspContext = this.mMspContext;
            if (!(mspContext instanceof MspTradeContext)) {
                finish();
            } else if (!TextUtils.isEmpty(((MspTradeContext) mspContext).getSchemeTraceId())) {
                setResult(-3);
                finishAndRemoveTask();
                ah();
            } else if (TextUtils.equals(this.mMspContext.getStatisticInfo().getAttr(Vector.Trade, "bizType"), "pay_and_deduct")) {
                setResult(-3);
                finishAndRemoveTask();
                ah();
            } else {
                finish();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            finish();
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        setResult(-3);
        try {
            super.finish();
            ag();
            ah();
        } catch (Throwable unused) {
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, android.app.Activity
    public void finishAndRemoveTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c1d594", new Object[]{this});
            return;
        }
        super.finishAndRemoveTask();
        ag();
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.mBizId;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public View getCurFlybirdView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23d6dcd0", new Object[]{this});
        }
        return this.nz;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public String getCurTplId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebcf1fd8", new Object[]{this});
        }
        return this.nG;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public View getCurrentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("518ce191", new Object[]{this});
        }
        return this.nm;
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 3000 && i2 == 100) {
            finish();
        }
    }

    @Override // com.alipay.mobile.beehive.eventbus.IEventSubscriber
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else {
            TextUtils.equals(str, MspGlobalDefine.EVENT_H5_ITEM);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        try {
            if (_onKeyDown(i)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725bd6aa", new Object[]{this, new Boolean(z), configuration});
            return;
        }
        StringBuilder sb = new StringBuilder("isInMultiWindowMode: ");
        sb.append(z);
        sb.append(",newConfig: ");
        if (configuration != null) {
            str = configuration.toString();
        } else {
            str = "-";
        }
        sb.append(str);
        LogUtil.i("MspContainerActivity", "onMultiWindowModeChanged", sb.toString());
        MspContext mspContext = this.mMspContext;
        if (mspContext != null) {
            mspContext.getStatisticInfo().addEvent(new StEvent(this.nG, "multiWindow-".concat(String.valueOf(z)), "-"));
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (!b(intent)) {
            af();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9f42b3", new Object[]{this});
            return;
        }
        super.onPostResume();
        View view = this.nm;
        if (view != null) {
            MspContext mspContext = this.mMspContext;
            if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                PluginManager.getRender().callExecuteJs(view, "document.activityResume&&document.activityResume();");
            } else {
                PluginManager.getRender().safeCallExecuteJs(view, "document.activityResume&&document.activityResume();");
            }
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Intent intent = new Intent();
        intent.setAction(MspGlobalDefine.ACTION_FLYBIRD_ACTIVITY_ONRESUME);
        if (this.mMspContext instanceof MspTradeContext) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mMspContext.getBizId());
            intent.putExtra("serviceId", sb.toString());
        }
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        UserFeedBackUtil.getInstance().registerScreenShotObserver(this);
        MspContext mspContext = this.mMspContext;
        if (mspContext == null) {
            return;
        }
        if (!mspContext.isFromWallet()) {
            PhoneCashierMspEngine.getMspViSec().setStartActivityContext(this);
        } else {
            PhoneCashierMspEngine.getMspViSec().setStartActivityContext(null);
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent(MspGlobalDefine.ACTION_FLYBIRD_ACTIVITY_ONSTOP));
        if (!this.nd) {
            BroadcastUtil.notifyFpAuthTimeout(this);
            BroadcastUtil.notifyFpRegisterTimeout(this);
            View view = this.nm;
            if (view != null) {
                MspContext mspContext = this.mMspContext;
                if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                    PluginManager.getRender().callExecuteJs(view, "document.activityStop&&document.activityStop();");
                } else {
                    PluginManager.getRender().safeCallExecuteJs(view, "document.activityStop&&document.activityStop();");
                }
            }
            MspContext mspContext2 = this.mMspContext;
            if (mspContext2 != null) {
                mspContext2.didEnterBackground();
            }
        }
        FlybirdUtil.notifyClientEvent(2);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void preloadAdWebView(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1194cce7", new Object[]{this, jSONArray, new Integer(i)});
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showAdWebView(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f632d1de", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCusLoadingView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb7c42e", new Object[]{this, str});
            return;
        }
        MspDialogHelper mspDialogHelper = this.nH;
        if (mspDialogHelper != null) {
            mspDialogHelper.showWalletLoading(this, str);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showDefaultLoading(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ae4220", new Object[]{this, strArr});
            return;
        }
        MspDialogHelper mspDialogHelper = this.nH;
        if (mspDialogHelper != null) {
            mspDialogHelper.showDefaultLoading(strArr);
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showDialogView(String str, String str2, List<MspDialogButton> list) {
        MspDialogHelper mspDialogHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243919f6", new Object[]{this, str, str2, list});
            return;
        }
        super.showDialogView(str, str2, list);
        if (!isFinishing() && (mspDialogHelper = this.nH) != null) {
            mspDialogHelper.showDialog(str, str2, list);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showH5WebView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6287549a", new Object[]{this, jSONObject});
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showLoadingView(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272661f4", new Object[]{this, strArr});
            return;
        }
        super.showLoadingView(strArr);
        if (!isFinishing()) {
            showDefaultLoading(strArr);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showNavButton(final String str, final NavBarClickAction navBarClickAction, final String str2, final NavBarClickAction navBarClickAction2, final String str3, NavBarPlugin.OnNavBarShownListener onNavBarShownListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcd3a9a", new Object[]{this, str, navBarClickAction, str2, navBarClickAction2, str3, onNavBarShownListener});
        } else if (this.nk == null) {
            LogUtil.w("MspContainerActivity", "showNavButton:", "mMainLayout=null");
        } else {
            this.nI = onNavBarShownListener;
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Drawable drawableId;
                    int i = 0;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject parseObject = JSON.parseObject(str);
                            if (parseObject.containsKey("type") && TextUtils.equals(parseObject.getString("type"), "text")) {
                                MspContainerActivity.access$202(MspContainerActivity.this, true);
                                String string = parseObject.getString("text");
                                try {
                                    if (parseObject.containsKey("textSize")) {
                                        MspContainerActivity.access$300(MspContainerActivity.this).setTextSize(parseObject.getFloat("textSize").floatValue());
                                    }
                                } catch (Exception e) {
                                    LogUtil.printExceptionStackTrace(e);
                                }
                                try {
                                    if (parseObject.containsKey("textColor")) {
                                        MspContainerActivity.access$300(MspContainerActivity.this).setTextColor(Color.parseColor(parseObject.getString("textColor")));
                                    }
                                } catch (Exception e2) {
                                    LogUtil.printExceptionStackTrace(e2);
                                }
                                MspContainerActivity.access$300(MspContainerActivity.this).setText(string);
                                MspContainerActivity.access$300(MspContainerActivity.this).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.3.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.view.View.OnClickListener
                                    public void onClick(View view) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                            return;
                                        }
                                        NavBarClickAction navBarClickAction3 = navBarClickAction;
                                        if (navBarClickAction3 != null) {
                                            navBarClickAction3.onClick();
                                        }
                                    }
                                });
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            JSONObject parseObject2 = JSON.parseObject(str2);
                            String string2 = parseObject2.getString("text");
                            MspContainerActivity.access$402(MspContainerActivity.this, true);
                            try {
                                if (parseObject2.containsKey("textSize")) {
                                    MspContainerActivity.access$500(MspContainerActivity.this).setTextSize(parseObject2.getFloat("textSize").floatValue());
                                }
                            } catch (Exception e3) {
                                LogUtil.printExceptionStackTrace(e3);
                            }
                            try {
                                if (parseObject2.containsKey("textColor")) {
                                    MspContainerActivity.access$500(MspContainerActivity.this).setTextColor(Color.parseColor(parseObject2.getString("textColor")));
                                }
                            } catch (Exception e4) {
                                LogUtil.printExceptionStackTrace(e4);
                            }
                            MspContainerActivity.access$500(MspContainerActivity.this).setText(string2);
                            MspContainerActivity.access$500(MspContainerActivity.this).setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.3.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                        return;
                                    }
                                    NavBarClickAction navBarClickAction3 = navBarClickAction2;
                                    if (navBarClickAction3 != null) {
                                        navBarClickAction3.onClick();
                                    }
                                }
                            });
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            JSONObject parseObject3 = JSON.parseObject(str3);
                            String string3 = parseObject3.getString("text");
                            String string4 = parseObject3.getString("image");
                            MspContainerActivity.access$602(MspContainerActivity.this, true);
                            try {
                                if (parseObject3.containsKey("textSize")) {
                                    MspContainerActivity.access$700(MspContainerActivity.this).setTextSize(parseObject3.getFloat("textSize").floatValue());
                                }
                                if (parseObject3.containsKey("textColor")) {
                                    MspContainerActivity.access$700(MspContainerActivity.this).setTextColor(Color.parseColor(parseObject3.getString("textColor")));
                                }
                                MspContainerActivity.access$700(MspContainerActivity.this).setText(string3);
                            } catch (Exception e5) {
                                LogUtil.printExceptionStackTrace(e5);
                            }
                            if (!TextUtils.isEmpty(string4) && (drawableId = ResUtils.getDrawableId(MspContainerActivity.this, string4)) != null) {
                                MspContainerActivity.access$802(MspContainerActivity.this, true);
                                MspContainerActivity.access$900(MspContainerActivity.this).setImageDrawable(drawableId);
                            }
                            if (parseObject3.containsKey("imageWidth")) {
                                int intValue = parseObject3.getInteger("imageWidth").intValue();
                                ViewGroup.LayoutParams layoutParams = MspContainerActivity.access$900(MspContainerActivity.this).getLayoutParams();
                                float f = intValue;
                                layoutParams.width = (int) (UIUtil.getDp(MspContainerActivity.this) * f);
                                layoutParams.height = (int) (f * UIUtil.getDp(MspContainerActivity.this));
                                MspContainerActivity.access$900(MspContainerActivity.this).setLayoutParams(layoutParams);
                            }
                        }
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                    if (MspContainerActivity.access$1000(MspContainerActivity.this)) {
                        return;
                    }
                    if (FlybirdUtil.isShowNavBar(MspContainerActivity.access$1100(MspContainerActivity.this))) {
                        if (MspContainerActivity.access$1200(MspContainerActivity.this) != null) {
                            MspContainerActivity.access$1200(MspContainerActivity.this).onNavBarShown();
                        }
                        MspContainerActivity.access$300(MspContainerActivity.this).setVisibility(MspContainerActivity.access$200(MspContainerActivity.this) ? 0 : 8);
                        MspContainerActivity.access$500(MspContainerActivity.this).setVisibility(MspContainerActivity.access$400(MspContainerActivity.this) ? 0 : 8);
                        MspContainerActivity.access$700(MspContainerActivity.this).setVisibility(MspContainerActivity.access$600(MspContainerActivity.this) ? 0 : 8);
                        ImageView access$900 = MspContainerActivity.access$900(MspContainerActivity.this);
                        if (!MspContainerActivity.access$800(MspContainerActivity.this)) {
                            i = 8;
                        }
                        access$900.setVisibility(i);
                        return;
                    }
                    MspContainerActivity.access$1300(MspContainerActivity.this).setVisibility(8);
                    MspContainerActivity.access$300(MspContainerActivity.this).setVisibility(8);
                    MspContainerActivity.access$500(MspContainerActivity.this).setVisibility(8);
                    MspContainerActivity.access$700(MspContainerActivity.this).setVisibility(8);
                    MspContainerActivity.access$900(MspContainerActivity.this).setVisibility(8);
                    MspContainerActivity.access$1400(MspContainerActivity.this);
                }
            });
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showToastView(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772525fa", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        super.showToastView(str, str2, j);
        MspDialogHelper mspDialogHelper = this.nH;
        if (mspDialogHelper != null) {
            mspDialogHelper.showToast(str, str2, j);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showUserInfo() {
        TradeLogicData tradeLogicData;
        UserInfoWidget userInfoWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4ad2bd", new Object[]{this});
            return;
        }
        MspContext mspContext = this.mMspContext;
        if ((mspContext instanceof MspTradeContext) && this.nP && (tradeLogicData = ((MspTradeContext) mspContext).getTradeLogicData()) != null) {
            String userName = tradeLogicData.getUserName();
            String userLogoUrl = tradeLogicData.getUserLogoUrl();
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.flybird_userinfo);
            if (viewGroup.getChildCount() > 0) {
                userInfoWidget = (UserInfoWidget) viewGroup.getChildAt(0);
            } else {
                userInfoWidget = new UserInfoWidget(this);
                viewGroup.addView(userInfoWidget);
            }
            if (userInfoWidget != null) {
                userInfoWidget.updateInfo(userName, userLogoUrl);
            }
            this.nl = userInfoWidget;
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopCusLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abc0129", new Object[]{this});
            return;
        }
        MspDialogHelper mspDialogHelper = this.nH;
        if (mspDialogHelper != null) {
            mspDialogHelper.dismissDefaultLoading();
            this.nH.dismissWalletLoading();
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void stopDefaultLoadingCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08d3cfb", new Object[]{this});
            return;
        }
        MspDialogHelper mspDialogHelper = this.nH;
        if (mspDialogHelper != null) {
            mspDialogHelper.stopDefaultLoadingCountDown();
        }
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186899a6", new Object[]{this});
            return;
        }
        super.stopLoadingView();
        if (!isFinishing()) {
            dismissDefaultLoading();
            stopCusLoadingView();
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.ui.views.MspContainerActivity$16  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass16 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ H5PopUpWindowItem val$h5PopUpWindowItem;
        public final /* synthetic */ Map val$pageItemMap;

        public AnonymousClass16(H5PopUpWindowItem h5PopUpWindowItem, Map map) {
            this.val$h5PopUpWindowItem = h5PopUpWindowItem;
            this.val$pageItemMap = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (MspContainerActivity.access$3300(MspContainerActivity.this) != null) {
                MspContainerActivity.access$3300(MspContainerActivity.this).dismissLoadingWithAction();
            }
            H5PopUpWindowItem h5PopUpWindowItem = (H5PopUpWindowItem) this.val$pageItemMap.get(this.val$h5PopUpWindowItem.token);
            if (h5PopUpWindowItem != null) {
                h5PopUpWindowItem.isClickedToClose = true;
                h5PopUpWindowItem.isClickedToShow = false;
                EventBusManager.getInstance().post(h5PopUpWindowItem, MspGlobalDefine.EVENT_H5_ITEM);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.ui.views.MspContainerActivity$17  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass17 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ H5PopUpWindowItem val$h5PopUpWindowItem;
        public final /* synthetic */ Map val$pageItemMap;

        public AnonymousClass17(H5PopUpWindowItem h5PopUpWindowItem, Map map) {
            this.val$h5PopUpWindowItem = h5PopUpWindowItem;
            this.val$pageItemMap = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (MspContainerActivity.access$3300(MspContainerActivity.this) != null) {
                MspContainerActivity.access$3300(MspContainerActivity.this).dismissLoadingWithAction();
            }
            H5PopUpWindowItem h5PopUpWindowItem = (H5PopUpWindowItem) this.val$pageItemMap.get(this.val$h5PopUpWindowItem.token);
            if (h5PopUpWindowItem != null) {
                h5PopUpWindowItem.isClickedToClose = true;
                h5PopUpWindowItem.isClickedToShow = false;
                EventBusManager.getInstance().post(h5PopUpWindowItem, MspGlobalDefine.EVENT_H5_ITEM);
            }
        }
    }

    private void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
        } else if (!MspLowDeviceManager.getInstance().isLowDevice()) {
            overridePendingTransition(0, ResUtils.getResourceId("push_down_out_short", "anim", getPackageName()));
        }
    }

    private void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
            return;
        }
        LogUtil.i("MspContainerActivity", "doFinish", this + " ctx=" + this.mMspContext);
        this.nd = true;
        try {
            MspContext mspContext = this.mMspContext;
            if (!(mspContext == null || mspContext.getStoreCenter() == null)) {
                this.mMspContext.getStoreCenter().doCleanBeforeWindowChange(11);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace("MspContainerActivity", "doFinish, doCleanBeforeWindowChange", e);
        }
        EventBusManager.getInstance().post(Integer.valueOf(this.mBizId), MspGlobalDefine.EVENT_CONTAINER_FINISH);
        PluginManager.getRender().destroy(this.mBizId, hashCode(), this);
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity
    public MspMainContract.Presenter createPresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspMainContract.Presenter) ipChange.ipc$dispatch("1df74eb8", new Object[]{this}) : new MspContainerPresenter();
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        View view = this.nm;
        if (view != null) {
            MspContext mspContext = this.mMspContext;
            if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                PluginManager.getRender().callExecuteJs(view, "document.activityPause&&document.activityPause();");
            } else {
                PluginManager.getRender().safeCallExecuteJs(view, "document.activityPause&&document.activityPause();");
            }
        }
        UserFeedBackUtil.getInstance().unregisterContentObserver(this);
        try {
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    MspWindowClient mspWindowClient;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Activity vidTopActivity = PhoneCashierMspEngine.getMspViSec().getVidTopActivity();
                        if (vidTopActivity != null && MspContainerActivity.access$100(MspContainerActivity.this) != null && (mspWindowClient = (MspWindowClient) MspContainerActivity.access$100(MspContainerActivity.this).getMspUIClient()) != null) {
                            mspWindowClient.setFirstVidActivity(vidTopActivity);
                        }
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            }, 500L);
            if (DrmManager.getInstance(getApplicationContext()).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, getApplicationContext())) {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 500L, TaskHelper.ThreadName.UI_ACTIVITY);
            } else {
                TaskHelper.execute(monitorRunnable, 500L);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        LogUtil.d("MspContainerActivity", "onRestart", "");
        BroadcastUtil.notifyFpAuthTimeout(this);
        BroadcastUtil.notifyFpRegisterTimeout(this);
        FlybirdUtil.notifyClientEvent(1);
        View view = this.nm;
        if (view != null) {
            MspContext mspContext = this.mMspContext;
            if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                PluginManager.getRender().callExecuteJs(view, "document.activityRestart&&document.activityRestart();");
            } else {
                PluginManager.getRender().safeCallExecuteJs(view, "document.activityRestart&&document.activityRestart();");
            }
        }
        MspContext mspContext2 = this.mMspContext;
        if (mspContext2 != null) {
            mspContext2.willEnterForeground();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else if (bundle != null) {
            bundle.putBoolean("saved", true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        LogUtil.record(2, "MspcontainerActivity:onWindowFocusChanged", "mspContext=" + this.mMspContext + ", curtpl=" + this.nG);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void removeMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee44a5c", new Object[]{this});
            return;
        }
        LogUtil.i("MspContainerActivity", "removeMaskView", "mCurrentTplId:" + this.nG + " activity=" + this);
        MspDialogHelper mspDialogHelper = this.nH;
        if (mspDialogHelper != null) {
            mspDialogHelper.removeMaskView(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else if (configuration != null) {
            super.onConfigurationChanged(configuration);
            this.nK = true;
            this.nJ = configuration.toString();
            MspContext mspContext = this.mMspContext;
            if (mspContext != null) {
                StatisticInfo statisticInfo = mspContext.getStatisticInfo();
                String str = this.nG;
                statisticInfo.addEvent(new StEvent(str, "sys_onConfigurationChanged", "width=" + configuration.screenWidthDp));
                if (!this.mMspContext.getGrayUnifiedReadPadConfig()) {
                    MspExtSceneManager.getInstance(this).updateScreenSizeInfo();
                    AlertIntelligenceEngine.startAction(this.mMspContext, "sys", getClass().getSimpleName().concat("_onScreenSizeChange"), MspExtSceneManager.getInstance(this).isBigScreen(), null, null);
                } else if (this.mMspContext.getMspExtSceneManager() != null) {
                    this.mMspContext.getMspExtSceneManager().updateScreenSizeInfo();
                    AlertIntelligenceEngine.startAction(this.mMspContext, "sys", getClass().getSimpleName().concat("_onScreenSizeChange"), this.mMspContext.getMspExtSceneManager().isBigScreen(), null, null);
                    if (this.mMspContext.getMspExtSceneManager().isAutoRotatingTpl(this.nG)) {
                        this.mMspContext.getWindowStack().peekFrame().setRerendStatus(false);
                    }
                } else {
                    LogUtil.record(1, "MspContainerActivity:onConfigurationChanged", "mMspContext.getMspExtSceneManager() is null");
                    AlertIntelligenceEngine.startAction(this.mMspContext, "sys", getClass().getSimpleName().concat("_onScreenSizeChange"), "false", null, null);
                }
            }
            e(this.nz);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #2 {all -> 0x0034, blocks: (B:10:0x0027, B:12:0x002b, B:15:0x0037, B:18:0x0046, B:20:0x007d, B:22:0x0083, B:23:0x0092, B:25:0x009c), top: B:138:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, com.alipay.android.msp.ui.views.AbsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspContainerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, com.alipay.android.msp.ui.views.AbsActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LogUtil.i("MspContainerActivity", "onDestroy", "has been executed, ctx=" + this.mMspContext);
        MspHardwarePayUtil.getInstance().cancel(this);
        JsExceptionReceiver.unregisterReceiver();
        if (this.nM != null) {
            LocalBroadcastManager.getInstance(this.mMspContext.getContext()).unregisterReceiver(this.nM);
            this.nM = null;
        }
        if (this.nd || this.mMspContext == null) {
            MspContext mspContext = this.mMspContext;
            if (mspContext != null && !mspContext.isExit()) {
                MspContextManager.lastContextRemoveTime = SystemClock.elapsedRealtime();
                if (this.nU) {
                    try {
                        LogUtil.w("MspContainerActivity", "onDestroy", "5秒防重退出 cur=" + this.mMspContext + " time=" + MspContextManager.lastContextRemoveTime);
                        this.mMspContext.exit(0, true);
                    } catch (Throwable th) {
                        this.mMspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "exitContextError", th);
                    }
                }
            }
        } else {
            LogUtil.w("MspContainerActivity", "onDestroy", "mIsFinished false");
            this.mMspContext.getStatisticInfo().addEvent(new StEvent(this.nG, "onDestroy", "exit"));
            this.mMspContext.exit(0, true);
        }
        if (!slo.VALUE_YES.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_degrade_opt_destroy_keyboard_10550"))) {
            try {
                PluginManager.getRender().getMspKeyboardService().destroyKeyboardForCashier(getWindow().getDecorView());
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
            }
        }
        if (this.nH != null) {
            dismissDefaultLoading();
            stopLoadingView();
            this.nH.dismissLoadingWithAction();
            this.nH.clear();
            this.nH = null;
        }
        EventBusManager.getInstance().unregister(this);
        PreRendManager.getInstance().removeContext();
        JSPluginManager.getInstanse().cleanUpContextHandlePlugin(this);
        MspContext mspContext2 = this.mMspContext;
        if (!(mspContext2 == null || mspContext2.getMspUIClient() == null || this.mMspContext.getMspUIClient().getFrameStack() == null)) {
            this.mMspContext.getMspUIClient().getFrameStack().clearWin();
        }
        Animation animation = this.no;
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        RelativeLayout relativeLayout = this.nk;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        MspContext mspContext3 = this.mMspContext;
        if (mspContext3 != null) {
            mspContext3.clearWorkerFbDoc();
        }
        this.nm = null;
        this.nz = null;
        this.nk = null;
        this.nn = null;
        this.nI = null;
        this.mMspContext = null;
        MspNetWorkStateReceiver mspNetWorkStateReceiver = this.nR;
        if (mspNetWorkStateReceiver != null) {
            unregisterReceiver(mspNetWorkStateReceiver);
        }
    }

    public boolean _onKeyDown(int i) {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc0625fd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        LogUtil.record(2, "MspContainerActivity:_onKeyDown", "keycode=" + i + ", mspCtx=" + this.mMspContext);
        if (this.mMspContext != null && i == 4) {
            MqpBehavior.getInstance().onBackPressed(this.mMspContext);
        }
        if (i == 4 && (linearLayout = this.ne) != null && linearLayout.getVisibility() == 0) {
            this.ne.setVisibility(8);
            stopLoadingView();
        } else if (i == 4) {
            SpmHelper.spmClickOnKeyBack(this.mMspContext);
            if (this.nm != null && PluginManager.getRender().onBackPressed(this.nm)) {
                return true;
            }
            MspContext mspContext = this.mMspContext;
            if (mspContext != null) {
                mspContext.getStatisticInfo().addEvent(new StEvent(this.nG, "onKeyBack", "exit"));
                this.mMspContext.exit(0);
                return true;
            }
        }
        return false;
    }

    @Override // com.alipay.android.msp.ui.views.MspBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        String str;
        Bundle findConsumingViewContentDescription;
        MspWindowFrameStack windowStack;
        MspWindowFrame topTplOrNativeFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.nZ < 0 || this.nY < 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.nW = motionEvent.getX();
            this.nX = motionEvent.getY();
            this.startTime = SystemClock.elapsedRealtime();
        } else if (action == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
            float abs = Math.abs(motionEvent.getX() - this.nW);
            float abs2 = Math.abs(motionEvent.getY() - this.nX);
            if (elapsedRealtime < this.nZ) {
                int i = this.nY;
                if (abs < i && abs2 < i) {
                    MspContext mspContext = this.mMspContext;
                    if (!(mspContext == null || (windowStack = mspContext.getWindowStack()) == null || (topTplOrNativeFrame = windowStack.getTopTplOrNativeFrame()) == null)) {
                        topTplOrNativeFrame.setClickPos(motionEvent);
                    }
                    try {
                        if (this.nS && motionEvent.getAction() == 1) {
                            View view = this.nz;
                            if (!(this.mMspContext == null || view == null || !(view instanceof ViewGroup))) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                MspContext mspContext2 = this.mMspContext;
                                MspWindowFrame topTplOrNativeFrame2 = (mspContext2 == null || mspContext2.getWindowStack() == null) ? null : this.mMspContext.getWindowStack().getTopTplOrNativeFrame();
                                if (topTplOrNativeFrame2 == null) {
                                    LogUtil.record(8, "MspContainerActivity.monitorFBViewClick", "top frame null");
                                } else {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (UIUtil.isPointInsideView(rawX, rawY, view)) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("pageSize", (Object) (view.getWidth() + "*" + view.getHeight()));
                                        jSONObject.put("clickPoint", (Object) (rawX + "*" + rawY));
                                        int i2 = this.nT;
                                        if (i2 > 0 && (findConsumingViewContentDescription = UIUtil.findConsumingViewContentDescription(rawX, rawY, (ViewGroup) view, i2)) != null) {
                                            String string = findConsumingViewContentDescription.getString("label");
                                            if (!TextUtils.isEmpty(string)) {
                                                if (string.length() > 50) {
                                                    string = string.substring(0, 50);
                                                }
                                                jSONObject.put("clickText", (Object) string);
                                            }
                                            jSONObject.put("clickTextSearchDeep", (Object) findConsumingViewContentDescription.getString("deep"));
                                        }
                                        MspTrackInfo.SpmInfo spmInfo = MspTrackInfo.getInstance().getSpmInfo(topTplOrNativeFrame2);
                                        if (spmInfo != null && !TextUtils.isEmpty(spmInfo.spmId)) {
                                            jSONObject.put("pageSpmId", (Object) spmInfo.spmId);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime2);
                                        jSONObject.put(TrtcConstants.TRTC_PARAMS_ELAPSED, (Object) sb.toString());
                                        MspContext mspContext3 = this.mMspContext;
                                        if (mspContext3 == null) {
                                            str = "pay";
                                        } else {
                                            str = mspContext3.getBizCodeForKeySpm();
                                        }
                                        SpmWrapper.onPageClick(topTplOrNativeFrame2, "a283.b16116.c308484.d320822", str, "", jSONObject.toString(), this.mBizId);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MspContext mspContext4 = this.mMspContext;
                        if (mspContext4 != null) {
                            mspContext4.getStatisticInfo().addError(ErrorType.WARNING, "MonitorFBViewClickEx", th);
                        }
                    }
                }
            }
            LogUtil.record(2, "MSP#dispatchTouchEvent", "no click: " + this.nW + " " + this.nX + " " + elapsedRealtime + " " + this.nZ + " " + abs + " " + this.nY + " " + abs2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showContentView(final View view, int i, final MspWindowFrame mspWindowFrame) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b8f3f", new Object[]{this, view, new Integer(i), mspWindowFrame});
            return;
        }
        LogUtil.i("MspContainerActivity", "showContentView", "animType=" + i + " inAnimation=" + this.no + " " + mspWindowFrame.toString());
        MspContext mspContext = this.mMspContext;
        if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "SHOW_CONTENT_VIEW");
        }
        if (mspWindowFrame.isFirstTplFrame() && (this.mMspContext instanceof MspTradeContext)) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_REND");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_SHOW");
        }
        MspContext mspContext2 = this.mMspContext;
        if (mspContext2 == null || !mspContext2.isUseSafeJsExecute()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(view);
                        if (fbContextFromView != null) {
                            String executeJsWithResult = fbContextFromView.executeJsWithResult("window.amc&&amc.fn&&amc.fn.docConfig&&amc.fn.docConfig();");
                            LogUtil.i("MspContainerActivity", "showContentView", "execute js callback, result=".concat(String.valueOf(executeJsWithResult)));
                            if (executeJsWithResult != null && executeJsWithResult.length() > 0 && executeJsWithResult.charAt(0) == '{') {
                                org.json.JSONObject jSONObject = new org.json.JSONObject(executeJsWithResult);
                                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("navi");
                                if (optJSONObject != null && optJSONObject.has("statusColor")) {
                                    String optString = optJSONObject.optString("statusColor", "");
                                    if (!TextUtils.isEmpty(optString)) {
                                        try {
                                            StatusBarUtil.setColor(MspContainerActivity.this, Color.parseColor(optString), 0);
                                        } catch (Exception e) {
                                            LogUtil.printExceptionStackTrace(e);
                                        }
                                    }
                                }
                                MspContainerActivity.access$1502(MspContainerActivity.this, jSONObject.optString("underGroundColor", null));
                                MspContainerActivity.access$1602(MspContainerActivity.this, jSONObject.optString("halfScreenBackgroundColor", null));
                                MspContainerActivity.access$1702(MspContainerActivity.this, jSONObject.optString("halfScreenParentViewBackgroundColor", null));
                                MspContainerActivity.access$1802(MspContainerActivity.this, jSONObject.optInt("underGroundHeightPadding", 0));
                                String optString2 = jSONObject.optString("registerDataChannel", "");
                                MspContainerActivity.access$100(MspContainerActivity.this).getMspUIClient().getFrameStack().registerFrameOnHash(optString2, mspWindowFrame);
                                mspWindowFrame.setTplHashId(optString2);
                            }
                        }
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        } else {
            try {
                FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(view);
                if (fbContextFromView != null) {
                    fbContextFromView.safeExecuteJs("window.amc&&amc.fn&&amc.fn.docConfig&&amc.fn.docConfig();", FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(1).setBlockTimeoutMs(10000), new FBContext.JsExecCallback() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.template.FBContext.JsExecCallback
                        public void onJsExecuted(int i2, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f3e6d0f", new Object[]{this, new Integer(i2), str2});
                                return;
                            }
                            try {
                                LogUtil.i("MspContainerActivity", "showContentView", "execute js callback, state is " + i2 + " result = " + str2);
                                if (str2 != null && str2.length() > 0 && str2.charAt(0) == '{') {
                                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("navi");
                                    if (optJSONObject != null && optJSONObject.has("statusColor")) {
                                        String optString = optJSONObject.optString("statusColor", "");
                                        if (!TextUtils.isEmpty(optString)) {
                                            try {
                                                StatusBarUtil.setColor(MspContainerActivity.this, Color.parseColor(optString), 0);
                                            } catch (Exception e) {
                                                LogUtil.printExceptionStackTrace(e);
                                            }
                                        }
                                    }
                                    MspContainerActivity.access$1502(MspContainerActivity.this, jSONObject.optString("underGroundColor", null));
                                    MspContainerActivity.access$1602(MspContainerActivity.this, jSONObject.optString("halfScreenBackgroundColor", null));
                                    MspContainerActivity.access$1702(MspContainerActivity.this, jSONObject.optString("halfScreenParentViewBackgroundColor", null));
                                    MspContainerActivity.access$1802(MspContainerActivity.this, jSONObject.optInt("underGroundHeightPadding", 0));
                                    String optString2 = jSONObject.optString("registerDataChannel", "");
                                    MspContainerActivity.access$100(MspContainerActivity.this).getMspUIClient().getFrameStack().registerFrameOnHash(optString2, mspWindowFrame);
                                    mspWindowFrame.setTplHashId(optString2);
                                }
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        final StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
        this.nG = mspWindowFrame.getTplId();
        RelativeLayout relativeLayout = this.nk;
        if (relativeLayout == null) {
            ae();
            this.nk = (RelativeLayout) findViewById(R.id.flybird_layout);
        } else {
            relativeLayout.setVisibility(0);
        }
        try {
            LogUtil.i("MspContainerActivity", "initBackgroundForOutTrade", "mMspContext null");
        } catch (Throwable th2) {
            LogUtil.printExceptionStackTrace(th2);
        }
        try {
            MspContext mspContext3 = this.mMspContext;
            if (mspContext3 != null && this.nP) {
                if (!this.nQ) {
                    BroadcastUtil.sendMspActivityCreateBroadcast(this, mspContext3);
                    this.nQ = true;
                }
                getWindow().setBackgroundDrawableResource(R.color.flybird_out_trade_bg);
                String str2 = this.nG;
                if (view == null || TextUtils.isEmpty(str2)) {
                    LogUtil.i("MspContainerActivity", "adjustBackgroundUserInfo", "missing view" + view + " or tplid " + str2);
                } else {
                    view.addOnLayoutChangeListener(this.heightChangeListener);
                }
            }
        } catch (Throwable th3) {
            LogUtil.printExceptionStackTrace(th3);
        }
        try {
            if (Build.VERSION.SDK_INT >= 29 && DrmManager.getInstance(this).isDegrade(DrmKey.DISABLE_DARK_MODE, false, this) && view != null) {
                view.setForceDarkAllowed(false);
            }
        } catch (Throwable th4) {
            LogUtil.printExceptionStackTrace(th4);
        }
        View view2 = this.nm;
        if (view2 != null) {
            view2.clearFocus();
        }
        if (FlybirdUtil.isFullScreen(view)) {
            view.setBackgroundColor(getResources().getColor(R.color.flybird_fullscreen_bg));
        } else if (!TextUtils.isEmpty(this.ns)) {
            LogUtil.i("MspContainerActivity", "showContentView", "halfScreenBackgroundColor:" + this.ns);
            view.setBackgroundColor(Color.parseColor(this.ns));
        } else {
            view.setBackgroundColor(-1);
        }
        final String str3 = (String) view.getTag(R.id.view_title_id);
        if (!TextUtils.isEmpty(str3)) {
            runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspContainerActivity.this.setTitle(str3);
                    }
                }
            });
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        MspContext mspContext4 = this.mMspContext;
        if (mspContext4 != null && mspContext4.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "SHOW_CONTENT_VIEW");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "SHOW_CONTENT_VIEW_POST");
        }
        final int i2 = mspWindowFrame.getBackAnim() ? 0 : i;
        MspContext mspContext5 = this.mMspContext;
        if (mspContext5 != null && mspContext5.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "SHOW_CONTENT_VIEW_POST");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "SHOW_CONTENT_VIEW_DO");
        }
        if ((this.mMspContext instanceof MspTradeContext) && mspWindowFrame.isFirstTplFrame()) {
            ThreadController.end(ThreadController.CASHIER_SIGN, ThreadController.CASHIER_TRANS_ACTIVITY, ThreadController.CASHIER_SERVICE_PAY, ThreadController.CASHIER_SCHEME_PAY);
        }
        if (mspWindowFrame.isFirstTplFrame()) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_SHOW");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_ADD_VIEW");
        }
        this.nz = view;
        MspContext mspContext6 = this.mMspContext;
        if (mspContext6 == null || !mspContext6.isExit()) {
            if (view.getParent() == null) {
                addViewToMainLayout(view, mspWindowFrame, i2);
            } else {
                removeMaskView();
            }
            if (statisticEvent != null) {
                statisticEvent.onStatistic(StEvent.SHOW_WIN, mspWindowFrame.getTplId());
            }
            view.setVisibility(0);
            RelativeLayout d = d(view);
            if (d != null) {
                d.setVisibility(0);
            }
            if (MspLowDeviceManager.getInstance().isLowDevice()) {
                if (!DrmManager.getInstance(this).isDegrade(DrmKey.DEGRADE_LOW_DEVICE_VIEW_DID_DISAPPEAR, false, this) && this.nm != null) {
                    MspContext mspContext7 = this.mMspContext;
                    if (mspContext7 == null || !mspContext7.isUseSafeJsExecute()) {
                        PluginManager.getRender().callExecuteJs(this.nm, "document.viewDidDisappear&&document.viewDidDisappear();");
                    } else {
                        PluginManager.getRender().safeCallExecuteJs(this.nm, "document.viewDidDisappear&&document.viewDidDisappear();");
                    }
                }
                a(statisticEvent, uptimeMillis, -1L);
                c(mspWindowFrame, view, i2);
                str = "SHOW_CONTENT_VIEW_DO";
            } else {
                a(mspWindowFrame, view, i2);
                if (this.ny) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        str = "SHOW_CONTENT_VIEW_DO";
                        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.9
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                                    return;
                                }
                                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                                if (viewTreeObserver2 != null) {
                                    viewTreeObserver2.removeGlobalOnLayoutListener(this);
                                }
                                MspContainerActivity.access$2400(MspContainerActivity.this, mspWindowFrame, view, i2);
                                MspContainerActivity.access$2500(MspContainerActivity.this, mspWindowFrame, view, i2, statisticEvent, uptimeMillis);
                            }
                        });
                    } else {
                        str = "SHOW_CONTENT_VIEW_DO";
                    }
                } else {
                    str = "SHOW_CONTENT_VIEW_DO";
                    a(mspWindowFrame, view, i2, statisticEvent, uptimeMillis);
                }
            }
            MspContext mspContext8 = this.mMspContext;
            if (mspContext8 != null && mspContext8.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", str);
                PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "SHOW_CONTENT_VIEW_ANI");
            }
            AlertIntelligenceEngine.injectJsCode(this, mspWindowFrame.getTplId(), view);
            return;
        }
        LogUtil.w("MspContainerActivity", "_doShowContentView", "mMspContext already exit");
    }

    private static View b(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a3df6a4b", new Object[]{view}) : (view == null || !(view.getParent() instanceof MspRoundRadiusLayout)) ? view : (MspRoundRadiusLayout) view.getParent();
    }

    private void b(final MspWindowFrame mspWindowFrame, final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2f0620", new Object[]{this, mspWindowFrame, view, new Integer(i)});
        } else if (TaskHelper.isMainThread()) {
            c(mspWindowFrame, view, i);
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspContainerActivity.access$3000(MspContainerActivity.this, mspWindowFrame, view, i);
                    }
                }
            });
        }
    }

    private void c(MspWindowFrame mspWindowFrame, View view, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31dd30e1", new Object[]{this, mspWindowFrame, view, new Integer(i)});
            return;
        }
        this.nx = false;
        MspContext mspContext = this.mMspContext;
        if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
            try {
                String str = this.nG;
                if (str != null && str.startsWith("QUICKPAY@")) {
                    FlybirdUtil.logStubFullLinkId(this, "flt_msp_show".concat(String.valueOf(this.nG.substring(9).replaceAll("-", ""))), "00000317");
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        stopCusLoadingView();
        stopLoadingView();
        try {
            if (mspWindowFrame.isFirstTplFrame()) {
                PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_ADD_VIEW");
                PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "CASHIER_SECOND_LOAD");
                FlybirdUtil.justEndSpider(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
                FlybirdUtil.dumpSpiderwebSpiderForCashier();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        MspContext mspContext2 = this.mMspContext;
        if (mspContext2 != null && mspContext2.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "SHOW_CONTENT_VIEW_ANI");
            PhoneCashierMspEngine.getMspWallet().endSpiderBizType("BIZ_SCAN_JUMP_MSP");
        }
        int i3 = 8;
        if (FlybirdUtil.isShowNavBar(this.nG)) {
            NavBarPlugin.OnNavBarShownListener onNavBarShownListener = this.nI;
            if (onNavBarShownListener != null) {
                onNavBarShownListener.onNavBarShown();
            }
            this.nf.setVisibility(this.nA ? 0 : 8);
            this.ng.setVisibility(this.nB ? 0 : 8);
            this.nh.setVisibility(this.nC ? 0 : 8);
            ImageView imageView = this.nj;
            if (this.nD) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
        } else {
            this.ni.setVisibility(8);
            this.nf.setVisibility(8);
            this.ng.setVisibility(8);
            this.nh.setVisibility(8);
            this.nj.setVisibility(8);
            ai();
        }
        showUserInfo();
        if (TextUtils.isEmpty(this.nt)) {
            i2 = getResources().getColor(R.color.flybird_half_screen_bg);
        } else {
            i2 = Color.parseColor(this.nt);
        }
        a(view, mspWindowFrame, i, i2);
        View view2 = this.nm;
        if (!(view2 == null || this.nk == null)) {
            if (!FlybirdUtil.isFullScreen(view2) || FlybirdUtil.isFullScreen(view) || mspWindowFrame.isNoBack() || i == 0) {
                a(this.nm, mspWindowFrame, i, 0);
                final View view3 = this.nm;
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspContainerActivity.access$2000(MspContainerActivity.this, view3);
                        }
                    }
                });
            } else {
                this.nn = this.nm;
            }
        }
        MspContext mspContext3 = this.mMspContext;
        if (mspContext3 == null || !mspContext3.isUseSafeJsExecute()) {
            PluginManager.getRender().callExecuteJs(this.nz, "document.viewDidAppear&&document.viewDidAppear();");
        } else {
            PluginManager.getRender().safeCallExecuteJs(this.nz, "document.viewDidAppear&&document.viewDidAppear();");
        }
        SpmWrapper.onPageAppear(mspWindowFrame, this.mBizId);
        this.nm = view;
        if (FlybirdUtil.isFullScreen(view)) {
            view.setBackgroundColor(getResources().getColor(R.color.flybird_fullscreen_bg));
        } else if (!TextUtils.isEmpty(this.ns)) {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "MspContainerActivity::doInAnimationFinished", "halfScreenBackgroundColor:" + this.ns);
            view.setBackgroundColor(Color.parseColor(this.ns));
        } else {
            view.setBackgroundColor(-1);
        }
        removeMaskView();
        if (mspWindowFrame.isNoBack()) {
            this.mMspContext.getMspUIClient().getFrameStack().clearDataStack(true);
        }
        MspContext mspContext4 = this.mMspContext;
        if (!(mspContext4 == null || mspContext4.getMspUIClient() == null || this.mMspContext.getMspUIClient().getFrameStack() == null)) {
            this.mMspContext.getMspUIClient().getFrameStack().clearWin();
        }
        if (TextUtils.equals(MspFlybirdDefine.FLYBIRD_RESULT_TPL, mspWindowFrame.getTplId()) || TextUtils.equals(MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL, mspWindowFrame.getTplId())) {
            MspContext mspContext5 = this.mMspContext;
            if (mspContext5 == null || !mspContext5.isUseSafeJsExecute()) {
                PluginManager.getRender().callExecuteJs(view, "mqpOnDisplay && mqpOnDisplay();");
            } else {
                PluginManager.getRender().safeCallExecuteJs(view, "mqpOnDisplay && mqpOnDisplay();");
            }
        }
        if (mspWindowFrame.isFirstTplFrame()) {
            MspContext mspContext6 = this.mMspContext;
            if (mspContext6 instanceof MspTradeContext) {
                BroadcastUtil.sendServerInvokeBroadcast((MspTradeContext) mspContext6, mspContext6.getGlobalSession());
                NativeDynFunManager.processWithFallbackAsync(this.mMspContext.getBizId(), DynConstants.DynFunNames.F_PAY_SERVER_INVOKE, new Object[0], NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
            }
        }
        if (this.mMspContext instanceof MspTradeContext) {
            ThreadController.endWithOutScheme(ThreadController.CASHIER_START_PAY);
        }
    }

    private void a(MspWindowFrame mspWindowFrame, View view, int i, StEvent stEvent, long j) {
        Animation animation;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56556a92", new Object[]{this, mspWindowFrame, view, new Integer(i), stEvent, new Long(j)});
            return;
        }
        View view3 = this.nm;
        if (view3 != null && FlybirdUtil.isFullScreen(view3) && !FlybirdUtil.isFullScreen(view) && !mspWindowFrame.isNoBack() && i != 0) {
            UIUtil.hideKeyboard(this.nm.getWindowToken(), this);
        }
        if (this.nm == null) {
            MspContext mspContext = this.mMspContext;
            if (!(mspContext instanceof MspContainerContext)) {
                this.nx = true;
                a(stEvent, j, SystemClock.uptimeMillis() + this.no.getDuration());
                this.nk.startAnimation(this.no);
                LogUtil.record(1, "MspContainerActivity::startShowAnimation", "mMainLayout.startAnimation :" + this.no);
            } else if (((MspContainerContext) mspContext).forceInAnim() != 0) {
                this.nx = true;
                a(stEvent, j, SystemClock.uptimeMillis() + this.no.getDuration());
                this.nk.startAnimation(this.no);
                LogUtil.record(1, "MspContainerActivity::startShowAnimation container", "mMainLayout.startAnimation :" + this.no);
            } else {
                a(stEvent, j, -1L);
                b(mspWindowFrame, view, i);
            }
        } else if (mspWindowFrame.isDestroyView()) {
            removeViewFromMainLayout(this.nm);
            this.nm = view;
            removeMaskView();
            LogUtil.record(1, "MspContainerActivity::startShowAnimation", "Destroy_showContentView");
        } else {
            if (!(view == null || this.no == null)) {
                this.nx = true;
                a(stEvent, j, SystemClock.uptimeMillis() + this.no.getDuration());
                b(view).startAnimation(this.no);
            }
            View view4 = this.nm;
            if (!(view4 == null || this.np == null)) {
                View b = b(view4);
                b.clearAnimation();
                b.startAnimation(this.np);
            }
            if (this.nw && (animation = this.nq) != null && (view2 = this.nv) != null) {
                view2.startAnimation(animation);
            }
        }
    }

    private static void a(StEvent stEvent, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca7d049", new Object[]{stEvent, new Long(j), new Long(j2)});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = j2 <= 0 ? uptimeMillis : j2;
        long j4 = j3 - j;
        LogUtil.i("MspContainerActivity", "trackShowTime", "show view time: " + j4 + "ms startTime=" + j + ", animationWillEnd=" + j2 + ", endShowContentViewTime=" + uptimeMillis + ", endTime=" + j3);
        if (stEvent != null) {
            stEvent.onStatistic(StEvent.SHOW_TIME, String.valueOf(j4));
        }
    }

    private void a(View view, MspWindowFrame mspWindowFrame, int i, int i2) {
        RelativeLayout d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e340d0", new Object[]{this, view, mspWindowFrame, new Integer(i), new Integer(i2)});
        } else if (view != null && (d = d(view)) != null) {
            View view2 = this.nm;
            if (view2 != null && FlybirdUtil.isFullScreen(view2) && !FlybirdUtil.isFullScreen(view) && !mspWindowFrame.isNoBack() && i != 0) {
                LogUtil.record(2, "MspContainerActivity::setTargetViewParentBackground", "set half screen bg");
                d.setBackgroundColor(i2);
            } else if (!FlybirdUtil.isFullScreen(view) && !this.nP) {
                LogUtil.record(2, "MspContainerActivity::setTargetViewParentBackground", "set half screen bg: isGray");
                d.setBackgroundColor(i2);
            } else if (this.nn != null) {
                LogUtil.record(2, "MspContainerActivity::setTargetViewParentBackground", "set half screen bg : !isDegrade");
                d.setBackgroundColor(i2);
            }
        }
    }

    private void a(View view, Display display, FBContext fBContext) {
        boolean z;
        MspExtSceneManager mspExtSceneManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281a2add", new Object[]{this, view, display, fBContext});
            return;
        }
        MspWindowFrameStack windowStack = this.mMspContext.getWindowStack();
        windowStack.clearAllContentView();
        windowStack.markAllFrame();
        MspWindowFrame peekFrame = windowStack.peekFrame();
        peekFrame.setActivityConfiguration(this.nJ);
        if (this.mMspContext.getGrayUnifiedReadPadConfig()) {
            mspExtSceneManager = this.mMspContext.getMspExtSceneManager();
            if (mspExtSceneManager != null) {
                z = mspExtSceneManager.onPadAdaptMode(this, peekFrame.getTplId(), this.mMspContext.getGrayOnPadAdaptMode());
            } else {
                LogUtil.record(1, "MspContainerActivity:onFBdocSizeChanged", "extSceneManager is null");
                z = false;
            }
        } else {
            mspExtSceneManager = MspExtSceneManager.getInstance(this);
            z = MspExtSceneManager.onPadAdaptMode(this, mspExtSceneManager, peekFrame.getTplId(), this.mMspContext.getGrayOnPadAdaptMode());
        }
        if (this.mMspContext.getGrayUnifiedReadPadConfig() && mspExtSceneManager == null) {
            a(display, fBContext);
        } else if (!mspExtSceneManager.isAutoRotatingTpl(this.nG)) {
            int width = display.getWidth();
            int calcScreenHeight = FBTools.calcScreenHeight(this, display.getHeight());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.nE.getLayoutParams();
            if (z && !FlybirdUtil.isFullScreen(view)) {
                LogUtil.record(2, "MspContainerActivity:onFBdocSizeChanged onPadAdaptMode", "tpl=" + peekFrame.getTplId());
                width = mspExtSceneManager.getDisplayWidth(this);
                view.getLayoutParams().width = width;
                this.nF.setTopRoundRadius(aj());
                this.nF.setBottomRoundRadius(aj());
                layoutParams.addRule(12, 0);
                layoutParams.addRule(13);
                this.nE.setLayoutParams(layoutParams);
                a(display, peekFrame, this.mMspContext, true);
            } else if (this.nL && !FlybirdUtil.isFullScreen(view)) {
                LogUtil.record(2, "MspContainerActivity:onFBdocSizeChanged prevIsOnPadMode", "tpl=" + peekFrame.getTplId());
                view.getLayoutParams().width = width;
                this.nF.setTopRoundRadius(aj());
                this.nF.setBottomRoundRadius(0);
                layoutParams.addRule(13, 0);
                layoutParams.addRule(12);
                this.nE.setLayoutParams(layoutParams);
                a(display, peekFrame, this.mMspContext, false);
            }
            if (mspExtSceneManager.checkCurrentIsBigScreen() && UIUtil.isQuickPayTpl(peekFrame.getTplId()) && FlybirdUtil.isFullScreen(view)) {
                a(display, peekFrame, this.mMspContext, true);
            }
            this.nL = z;
            ((FBDocument) fBContext).onSizeChanged(width, calcScreenHeight, 0, 0);
        } else if (!this.mMspContext.getGrayUnifiedReadPadConfig()) {
            this.mMspContext.getMspUIClient().onWindowChanged(peekFrame);
        } else if (!peekFrame.getRerendStatus()) {
            this.mMspContext.getMspUIClient().onWindowChanged(peekFrame);
            peekFrame.setRerendStatus(true);
        }
    }

    private void a(Display display, FBContext fBContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b069b19f", new Object[]{this, display, fBContext});
        } else {
            ((FBDocument) fBContext).onSizeChanged(display.getWidth(), FBTools.calcScreenHeight(this, display.getHeight()), 0, 0);
        }
    }

    private void a(final Display display, final MspWindowFrame mspWindowFrame, final MspContext mspContext, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569db0f9", new Object[]{this, display, mspWindowFrame, mspContext, new Boolean(z)});
        } else if (!DrmManager.getInstance(this).isGray(DrmKey.DISABLE_PAD_DETECT_ERROR_INFO, false, this) && (mspContext instanceof MspTradeContext)) {
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspContainerActivity.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 370
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspContainerActivity.AnonymousClass14.run():void");
                }
            }, 300L);
            if (DrmManager.getInstance(getApplicationContext()).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, getApplicationContext())) {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 300L, TaskHelper.ThreadName.UI_PAD);
            } else {
                TaskHelper.execute(monitorRunnable, 300L);
            }
        }
    }

    private void a(MspWindowFrame mspWindowFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f117a6a6", new Object[]{this, mspWindowFrame, new Boolean(z)});
            return;
        }
        WindowManager windowManager = (WindowManager) getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            defaultDisplay.getMetrics(new DisplayMetrics());
            a(defaultDisplay, mspWindowFrame, this.mMspContext, z);
        }
    }
}
