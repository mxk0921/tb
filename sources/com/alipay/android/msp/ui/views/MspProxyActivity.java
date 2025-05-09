package com.alipay.android.msp.ui.views;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.msp.core.component.JsExceptionReceiver;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.NavBarClickAction;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.contracts.MspMainContract;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.utils.H5Utils;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspProxyActivity implements MspBaseContract.IView, MspMainContract.View {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspContainerPresenter f3732a;
    public Activity b;
    public final int c;
    public final MspExtSceneManager d;
    public MspDialogHelper e;
    public final MspContainerContext f;
    public View i;
    public final MspContext j;
    public final ComponentCallbacks l;
    public final Application.ActivityLifecycleCallbacks m;
    public OnResultReceived mOnResultReceived;
    public final Stack<View> g = new Stack<>();
    public boolean h = false;
    public boolean k = false;

    public MspProxyActivity(Activity activity, int i) {
        ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                    return;
                }
                if (MspProxyActivity.access$000(MspProxyActivity.this) != null) {
                    MspProxyActivity.access$000(MspProxyActivity.this).updateScreenSizeInfo(configuration, MspProxyActivity.access$100(MspProxyActivity.this));
                }
                Iterator it = MspProxyActivity.access$200(MspProxyActivity.this).iterator();
                while (it.hasNext()) {
                    MspProxyActivity.access$300(MspProxyActivity.this, (View) it.next(), configuration);
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
                }
            }
        };
        this.l = componentCallbacks;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity2, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity2, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity2});
                } else if (MspProxyActivity.access$100(MspProxyActivity.this) != null && MspProxyActivity.access$100(MspProxyActivity.this) == activity2) {
                    MspProxyActivity.this.onDestroy();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity2});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity2) {
                OnResultReceived onResultReceived;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity2});
                } else if (MspProxyActivity.access$100(MspProxyActivity.this) != null && MspProxyActivity.access$100(MspProxyActivity.this) == activity2 && (onResultReceived = MspProxyActivity.this.mOnResultReceived) != null) {
                    onResultReceived.onReceiveResult("");
                    MspProxyActivity.this.mOnResultReceived = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity2, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity2});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity2});
                }
            }
        };
        this.m = activityLifecycleCallbacks;
        this.b = activity;
        this.c = i;
        MspContainerPresenter mspContainerPresenter = new MspContainerPresenter();
        this.f3732a = mspContainerPresenter;
        mspContainerPresenter.attachIView(this);
        MspContainerContext renderContextByBizId = MspContextManager.getInstance().getRenderContextByBizId(i);
        this.f = renderContextByBizId;
        if (renderContextByBizId != null) {
            this.e = new MspDialogHelper(this.b, renderContextByBizId);
        }
        this.b.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        this.j = mspContextByBizId;
        if (mspContextByBizId.getGrayUnifiedReadPadConfig()) {
            this.d = mspContextByBizId.getMspExtSceneManager();
        } else {
            this.d = new MspExtSceneManager(this.b);
        }
        if (mspContextByBizId.getGrayOnPadAdaptMode()) {
            this.b.getApplication().registerComponentCallbacks(componentCallbacks);
        }
    }

    public static /* synthetic */ MspExtSceneManager access$000(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("f0b22d1", new Object[]{mspProxyActivity});
        }
        return mspProxyActivity.d;
    }

    public static /* synthetic */ Activity access$100(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("99dacff4", new Object[]{mspProxyActivity});
        }
        return mspProxyActivity.b;
    }

    public static /* synthetic */ Stack access$200(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("70a0cf3e", new Object[]{mspProxyActivity});
        }
        return mspProxyActivity.g;
    }

    public static /* synthetic */ View access$400(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("491706b9", new Object[]{mspProxyActivity});
        }
        return mspProxyActivity.i;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab715423", new Object[]{this})).intValue();
        }
        return (int) (UIUtil.getDp(this.b) * 16.0f);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void addMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db286f9", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "addMaskView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void addViewToMainLayout(View view, MspWindowFrame mspWindowFrame, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc2b996", new Object[]{this, view, mspWindowFrame, new Integer(i)});
        } else {
            LogUtil.record(2, "MspProxyActivity", "addViewToMainLayout");
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7f6bb1", new Object[]{this});
            return;
        }
        View pop = this.g.pop();
        LogUtil.record(2, "MspProxyActivity::removeMspView", String.valueOf(pop));
        ViewGroup viewGroup = (ViewGroup) pop.getParent();
        pop.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, H5Utils.getScreenHeight(this.b));
        translateAnimation.setDuration(100L);
        viewGroup.setAnimation(translateAnimation);
        FrameLayout frameLayout = (FrameLayout) this.b.findViewById(16908290);
        frameLayout.removeView(viewGroup);
        if (this.j.getGrayOnPadAdaptMode() && this.g.size() > 0) {
            this.i = this.g.peek();
        }
        if (!this.k && Boolean.parseBoolean(MspExtSceneManager.getInstance(this.b).isAccessibilityEnabled())) {
            int childCount = frameLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = frameLayout.getChildAt(i);
                if (childAt != null) {
                    childAt.setImportantForAccessibility(1);
                }
            }
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void dismissDefaultLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86216ec", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "dismissDefaultLoading");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void disposeActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c89bd5", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "disposeActivity");
        }
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        LogUtil.record(2, "MspProxyActivity", "getBizId" + this.c);
        return this.c;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public View getCurFlybirdView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23d6dcd0", new Object[]{this});
        }
        LogUtil.record(2, "MspProxyActivity", "getCurFlybirdView");
        if (this.g.empty()) {
            return null;
        }
        return this.g.peek();
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public String getCurTplId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebcf1fd8", new Object[]{this});
        }
        LogUtil.record(2, "MspProxyActivity", "getCurTplId");
        return null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public View getCurrentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("518ce191", new Object[]{this});
        }
        LogUtil.record(2, "MspProxyActivity", "getCurrentView");
        if (this.g.empty()) {
            return null;
        }
        return this.g.peek();
    }

    public MspContainerPresenter getPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerPresenter) ipChange.ipc$dispatch("494d8600", new Object[]{this});
        }
        return this.f3732a;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void openActivity(final Intent intent, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67402bc8", new Object[]{this, intent, onResultReceived});
            return;
        }
        try {
            if (onResultReceived != null) {
                this.mOnResultReceived = onResultReceived;
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspProxyActivity.access$100(MspProxyActivity.this).startActivityForResult(intent, 0);
                        }
                    }
                });
                return;
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspProxyActivity.access$100(MspProxyActivity.this).startActivity(intent);
                    }
                }
            });
        } catch (Throwable th) {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.c);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, th.getClass().getName(), th);
            }
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void removeMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee44a5c", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "removeMaskView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCusLoadingView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb7c42e", new Object[]{this, str});
            return;
        }
        MspDialogHelper mspDialogHelper = this.e;
        if (mspDialogHelper != null) {
            mspDialogHelper.showWalletLoading(this.b, str);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showDialogView(String str, String str2, List<MspDialogButton> list) {
        MspDialogHelper mspDialogHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243919f6", new Object[]{this, str, str2, list});
            return;
        }
        Activity activity = this.b;
        if ((activity == null || !activity.isFinishing()) && (mspDialogHelper = this.e) != null) {
            mspDialogHelper.showDialog(str, str2, list);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showNavButton(String str, NavBarClickAction navBarClickAction, String str2, NavBarClickAction navBarClickAction2, String str3, NavBarPlugin.OnNavBarShownListener onNavBarShownListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcd3a9a", new Object[]{this, str, navBarClickAction, str2, navBarClickAction2, str3, onNavBarShownListener});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showToastView(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772525fa", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        LogUtil.d("MspProxyActivity", "showToastView", str);
        MspDialogHelper mspDialogHelper = this.e;
        if (mspDialogHelper != null) {
            mspDialogHelper.showToast(str, str2, j);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4ad2bd", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopCusLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abc0129", new Object[]{this});
            return;
        }
        MspDialogHelper mspDialogHelper = this.e;
        if (mspDialogHelper != null) {
            mspDialogHelper.dismissDefaultLoading();
            this.e.dismissWalletLoading();
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void stopDefaultLoadingCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08d3cfb", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "stopDefaultLoadingCountDown");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186899a6", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "stopLoadingView");
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.b != null) {
            LogUtil.record(4, "phonecashiermsp#flybird", "MspProxyActivity.onDestroy", "has been executed, ctx=" + this.b);
            FrameLayout frameLayout = (FrameLayout) this.b.findViewById(16908290);
            while (!this.g.empty()) {
                try {
                    frameLayout.removeView((ViewGroup) this.g.pop().getParent());
                } catch (Throwable th) {
                    LogUtil.record(2, "MspProxyActivity::onDestroy", "如果现在鸟巢栈没了，那么下面的相关错误可以忽略。 size:" + this.g.size());
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            MspHardwarePayUtil.getInstance().cancel(this.b);
            JsExceptionReceiver.unregisterReceiver();
            MspDialogHelper mspDialogHelper = this.e;
            if (mspDialogHelper != null) {
                mspDialogHelper.clear();
                this.e = null;
            }
            MspContainerContext mspContainerContext = this.f;
            if (mspContainerContext != null) {
                StatisticInfo statisticInfo = mspContainerContext.getStatisticInfo();
                StringBuilder sb = new StringBuilder();
                sb.append(this.g.size());
                statisticInfo.addEvent(new StEvent(CountValue.T_TPL, "destroy", sb.toString()));
                LogUtil.record(4, "MspProxyActivity:onDestroy", "mIsFinished false");
                this.f.exit(0);
            }
            MspContainerContext mspContainerContext2 = this.f;
            if (!(mspContainerContext2 == null || mspContainerContext2.getMspUIClient() == null || this.f.getMspUIClient().getFrameStack() == null)) {
                this.f.getMspUIClient().getFrameStack().clearWin();
            }
            PreRendManager.getInstance().removeContext();
            JSPluginManager.getInstanse().cleanUpContextHandlePlugin(this.b);
            PluginManager.getRender().destroy(this.c, this.b.hashCode(), this.b);
            this.b.getApplication().unregisterActivityLifecycleCallbacks(this.m);
            if (this.j.getGrayOnPadAdaptMode()) {
                this.b.getApplication().unregisterComponentCallbacks(this.l);
            }
            this.b = null;
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void preloadAdWebView(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1194cce7", new Object[]{this, jSONArray, new Integer(i)});
        } else {
            LogUtil.record(2, "MspProxyActivity", "preloadAdWebView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showAdWebView(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f632d1de", new Object[]{this, str, str2, str3});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showAdWebView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCustomOptDialog(String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81c9ab9", new Object[]{this, str, str2, list});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showCustomOptDialog");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showDefaultLoading(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ae4220", new Object[]{this, strArr});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showDefaultLoading");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showH5WebView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6287549a", new Object[]{this, jSONObject});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showH5WebView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showLoadingView(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272661f4", new Object[]{this, strArr});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showLoadingView");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x001d, B:11:0x0021, B:16:0x002f, B:19:0x0045, B:21:0x0071, B:23:0x007f, B:25:0x0090, B:27:0x0099, B:29:0x00a5, B:32:0x00b5, B:36:0x00bc, B:41:0x00d3, B:43:0x00d9, B:46:0x00e3, B:48:0x00fc, B:49:0x0102, B:51:0x0108, B:53:0x010c, B:55:0x0118, B:57:0x011e, B:59:0x0124, B:60:0x014d, B:61:0x0161, B:62:0x0165, B:64:0x0169, B:66:0x016f, B:67:0x0190, B:68:0x0192, B:69:0x0197), top: B:73:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void access$300(com.alipay.android.msp.ui.views.MspProxyActivity r10, android.view.View r11, android.content.res.Configuration r12) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspProxyActivity.access$300(com.alipay.android.msp.ui.views.MspProxyActivity, android.view.View, android.content.res.Configuration):void");
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public boolean openUrl(String str, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a04f493", new Object[]{this, str, onResultReceived})).booleanValue();
        }
        this.mOnResultReceived = onResultReceived;
        LogUtil.record(2, "MspProxyActivity:openUrl", "url=".concat(String.valueOf(str)));
        try {
            return PhoneCashierMspEngine.getMspJump().processUrl(this.b, str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.c);
            if (mspContextByBizId == null) {
                return false;
            }
            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "openUrlFail", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0178 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:15:0x0046, B:18:0x0059, B:20:0x0070, B:22:0x0078, B:28:0x0086, B:30:0x0094, B:33:0x00ab, B:34:0x00bc, B:35:0x00c1, B:36:0x00c7, B:37:0x00c9, B:39:0x00d1, B:40:0x00e0, B:41:0x00e5, B:43:0x00e9, B:45:0x00ef, B:46:0x00f5, B:49:0x00fe, B:50:0x0104, B:51:0x0107, B:53:0x0162, B:55:0x0172, B:57:0x0178, B:60:0x0180, B:62:0x0186, B:63:0x0188, B:65:0x01d4, B:66:0x01e3, B:67:0x01e8), top: B:79:0x0046 }] */
    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showContentView(final android.view.View r18, int r19, com.alipay.android.msp.core.frame.MspWindowFrame r20) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspProxyActivity.showContentView(android.view.View, int, com.alipay.android.msp.core.frame.MspWindowFrame):void");
    }
}
