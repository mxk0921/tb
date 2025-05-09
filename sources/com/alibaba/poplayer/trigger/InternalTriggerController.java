package com.alibaba.poplayer.trigger;

import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.d;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.adapter.TriggerControllerInfoManager;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.hst;
import tb.ing;
import tb.jd0;
import tb.jem;
import tb.lyv;
import tb.t2o;
import tb.t4f;
import tb.ufu;
import tb.wdm;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InternalTriggerController implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FRAGMENT_KEY_CODE_TAG = "_frg_";
    @Monitor.TargetField
    private static final TriggerControllerInfoManager mTriggerControllerInfo = TriggerControllerInfoManager.instance();
    private volatile WeakReference<Activity> mCurrentActivity;
    private int mPageSwitchTimes = 0;

    static {
        t2o.a(626000014);
    }

    public InternalTriggerController(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        ufu ufuVar = new ufu(this);
        jem.d().h(ufuVar);
        IntentFilter intentFilter = new IntentFilter("com.alibaba.poplayer.PopLayer.action.POP");
        intentFilter.addAction(PopLayer.ACTION_FRAGMENT_SWITCH);
        intentFilter.addAction(PopLayer.ACTION_PRE_DEAL_CUSTOM_TRIGGER);
        LocalBroadcastManager.getInstance(application).registerReceiver(new TriggerBroadcastReceiver(ufuVar), intentFilter);
    }

    private String generateEventUri(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5899936", new Object[]{this, activity, str});
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        String generateUri = PopLayer.getReference().getTriggerAdapter() != null ? PopLayer.getReference().getTriggerAdapter().generateUri(activity, str) : null;
        if (!TextUtils.isEmpty(generateUri)) {
            return generateUri;
        }
        if (isEmpty) {
            return activity.getClass().getName();
        }
        return activity.getClass().getName() + "." + str;
    }

    private String getActivityInfo(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1885a874", new Object[]{this, activity});
        }
        if (activity == null || activity.getIntent() == null) {
            return null;
        }
        return activity.getIntent().getDataString();
    }

    public static String getActivityKeyCode(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb2d5a20", new Object[]{activity});
        }
        return getKeyCode(activity, (String) null);
    }

    public static String getCurActivityInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("700324d2", new Object[0]);
        }
        return mTriggerControllerInfo.getCurActivityInfo();
    }

    public static String getCurActivityKeyCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a619666", new Object[0]);
        }
        return mTriggerControllerInfo.getCurActivityKeyCode();
    }

    public static String getCurKeyCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cddc75b7", new Object[0]);
        }
        return mTriggerControllerInfo.getCurKeyCode();
    }

    public static String getCurUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1819e37", new Object[0]);
        }
        return mTriggerControllerInfo.getCurUri();
    }

    public static String getKeyCode(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39ffe3e7", new Object[]{activity, str});
        }
        if (activity == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append("@");
        sb.append(Integer.toHexString(activity.hashCode()));
        if (!TextUtils.isEmpty(str)) {
            sb.append(FRAGMENT_KEY_CODE_TAG);
            sb.append(str);
        }
        return sb.toString();
    }

    private boolean isAllowedPopupFromFragmentNotice(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90b436fd", new Object[]{this, activity})).booleanValue();
        }
        return activity.getClass().isAnnotationPresent(PopLayer.PopupAllowedFromFragment.class);
    }

    public static boolean isFragmentKeyCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a8bf07", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.contains(FRAGMENT_KEY_CODE_TAG)) {
            return false;
        }
        return true;
    }

    private boolean isManualPopup(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb146a99", new Object[]{this, activity})).booleanValue();
        }
        boolean isAnnotationPresent = activity.getClass().isAnnotationPresent(PopLayer.PopupOnlyManually.class);
        if (PopLayer.getReference().isMunualPopPageContains(activity.getClass().getName()) || isAnnotationPresent) {
            return true;
        }
        return false;
    }

    private boolean isSameActivity(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ccfafe", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.equals(str2);
    }

    private boolean isSameFragmentPage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14ca80ee", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    private boolean isSameKeyCode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ebac43b", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    private boolean isSameUri(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881aa8bb", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityDestroyed$5(Activity activity) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782ecc38", new Object[]{activity});
            return;
        }
        if (activity != null) {
            try {
                name = activity.getClass().getName();
            } catch (Throwable th) {
                wdm.h("EventManager.onActivityDestroyed.clean.error.", th);
                return;
            }
        } else {
            name = "";
        }
        wdm.d("EventManager.onActivityDestroyed.activity{%s}", name);
        if (activity != null) {
            String activityKeyCode = getActivityKeyCode(activity);
            TriggerControllerInfoManager triggerControllerInfoManager = mTriggerControllerInfo;
            PageTriggerService.instance().pageDestroy(activity, getKeyCode(activity, triggerControllerInfoManager.getPreFragmentName(activityKeyCode)));
            d.t().g(activityKeyCode);
            PopLayer.getReference().onPageClean(activity);
            triggerControllerInfoManager.clearKeyCodeMap(activityKeyCode);
        }
    }

    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        return (Activity) lyv.c(this.mCurrentActivity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            hst.b(new Runnable() { // from class: tb.ojf
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.lambda$onActivityDestroyed$5(activity);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            hst.b(new Runnable() { // from class: tb.mjf
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.lambda$onActivityPaused$3(activity);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            hst.b(new Runnable() { // from class: tb.njf
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.this.lambda$onActivityResumed$2(activity);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            hst.b(new Runnable() { // from class: tb.qjf
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.lambda$onActivityStarted$1(activity);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            hst.b(new Runnable() { // from class: tb.pjf
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.this.lambda$onActivityStopped$4(activity);
                }
            });
        }
    }

    public void onFragmentResumed(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de00391", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                onPageResumed(getCurrentActivity(), str, str2, z);
            }
        } catch (Throwable th) {
            wdm.h("EventManager.onFragmentResumed.fail.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityPaused$3(Activity activity) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f8e101", new Object[]{activity});
            return;
        }
        if (activity != null) {
            try {
                name = activity.getClass().getName();
            } catch (Throwable th) {
                wdm.h("EventManager.onActivityPaused.clean.error.", th);
                return;
            }
        } else {
            name = "";
        }
        wdm.d("EventManager.onActivityPaused.activity{%s}", name);
        PageTriggerService.instance().stopAllTimerEvents();
        if (activity != null) {
            PageTriggerService.instance().notifyShowingViewsOnActivityLifeCycle(activity, "pause");
            String activityKeyCode = getActivityKeyCode(activity);
            TriggerControllerInfoManager triggerControllerInfoManager = mTriggerControllerInfo;
            String keyCode = getKeyCode(activity, triggerControllerInfoManager.getCurFragmentName());
            boolean isFinishing = activity.isFinishing();
            triggerControllerInfoManager.updateIsPreActivityFinishing(isFinishing);
            if (isFinishing) {
                PageTriggerService.instance().pageClean(keyCode, activityKeyCode, true);
                d.t().g(activityKeyCode);
                PopLayer.getReference().onPageClean(activity);
                triggerControllerInfoManager.clearKeyCodeMap(activityKeyCode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityResumed$2(Activity activity) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d2c1f3", new Object[]{this, activity});
            return;
        }
        try {
            t4f a2 = t4f.a();
            a2.h(4);
            onPageResumed(activity, null, null, true);
            PageTriggerService.instance().notifyShowingViewsOnActivityLifeCycle(activity, "resume");
            a2.f();
            if (activity != null) {
                str = activity.getClass().getName();
            } else {
                str = "";
            }
            wdm.d("EventManager.onActivityResumed.activity{%s}", str);
        } catch (Throwable th) {
            wdm.h("onActivityResumed error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityStarted$1(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d870dc", new Object[]{activity});
            return;
        }
        try {
            wdm.d("EventManager.onActivityStarted.activity{%s}", activity.getClass().getName());
            PageTriggerService.instance().notifyShowingViewsOnActivityLifeCycle(activity, "start");
        } catch (Throwable th) {
            wdm.h("EventManager.onActivityStarted.error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityStopped$4(Activity activity) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e944a6b", new Object[]{this, activity});
            return;
        }
        if (activity != null) {
            try {
                name = activity.getClass().getName();
            } catch (Throwable th) {
                wdm.h("EventManager.onActivityPaused.clean.error.", th);
                return;
            }
        } else {
            name = "";
        }
        wdm.d("EventManager.onActivityStopped.activity{%s}", name);
        if (activity != null) {
            PageTriggerService.instance().notifyShowingViewsOnActivityLifeCycle(activity, "stop");
            TriggerControllerInfoManager triggerControllerInfoManager = mTriggerControllerInfo;
            String curActivityKeyCode = triggerControllerInfoManager.getCurActivityKeyCode();
            String activityKeyCode = getActivityKeyCode(activity);
            String keyCode = getKeyCode(activityKeyCode, triggerControllerInfoManager.getPreFragmentName(activityKeyCode));
            boolean isSameActivity = isSameActivity(activityKeyCode, curActivityKeyCode);
            boolean isFinishing = activity.isFinishing();
            if (!isSameActivity) {
                PageTriggerService.instance().pageClean(keyCode, activityKeyCode, isFinishing);
            }
            if (isFinishing) {
                d.t().g(activityKeyCode);
                PopLayer.getReference().onPageClean(activity);
                triggerControllerInfoManager.clearKeyCodeMap(activityKeyCode);
            }
        }
    }

    public static String getKeyCode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("922807ef", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(FRAGMENT_KEY_CODE_TAG);
            sb.append(str2);
        }
        return sb.toString();
    }

    private void onPageResumed(Activity activity, String str, String str2, boolean z) {
        Throwable th;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22fa93e", new Object[]{this, activity, str, str2, new Boolean(z)});
            return;
        }
        try {
            boolean isEmpty = TextUtils.isEmpty(str);
            if (!z || !TextUtils.isEmpty(str2)) {
                str3 = str2;
            } else {
                str3 = PopLayer.getReference().getTriggerAdapter() != null ? PopLayer.getReference().getTriggerAdapter().generateActivityInfo(activity) : str2;
                if (TextUtils.isEmpty(str3)) {
                    str3 = getActivityInfo(activity);
                }
            }
            if (!isEmpty) {
                str4 = "[isFragmentResume:true]";
            } else {
                str4 = "";
            }
            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", str4.concat("ActivityResumedTrigger."));
            if (activity == null) {
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", str4.concat("ActivityResumedTrigger.activity is null"));
            } else if (!isEmpty && !isAllowedPopupFromFragmentNotice(activity)) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", str4.concat("ActivityResumedTrigger.sAllowedPopupFromFragmentNotice=false"));
            } else if (!PopLayer.getReference().isValidActivity(activity)) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", str4.concat("ActivityResumedTrigger.is not validActivity."));
            } else {
                boolean isManualPopup = isManualPopup(activity);
                TriggerControllerInfoManager triggerControllerInfoManager = mTriggerControllerInfo;
                String curKeyCode = triggerControllerInfoManager.getCurKeyCode();
                String curActivityKeyCode = triggerControllerInfoManager.getCurActivityKeyCode();
                String curFragmentName = triggerControllerInfoManager.getCurFragmentName();
                String activityKeyCode = getActivityKeyCode(activity);
                String keyCode = getKeyCode(activity, str);
                boolean isSameActivity = isSameActivity(curActivityKeyCode, activityKeyCode);
                boolean isSameFragmentPage = isSameFragmentPage(curFragmentName, str);
                String generateEventUri = generateEventUri(activity, str);
                if (isSameActivity) {
                    if (isEmpty) {
                        if (!isManualPopup) {
                            PageTriggerService.instance().reStartCurPageTimerEvents();
                            wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", str4.concat("ActivityResumedTrigger.isSameActivity."));
                            return;
                        }
                        return;
                    } else if (isSameFragmentPage) {
                        PageTriggerService.instance().reStartCurPageTimerEvents();
                        wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", str4.concat("ActivityResumedTrigger.isSameActivity and isSameFragment."));
                        return;
                    }
                }
                PageTriggerService.instance().pageClean(curKeyCode, curActivityKeyCode, triggerControllerInfoManager.isPreActivityFinishing());
                boolean isSameUri = isSameUri(triggerControllerInfoManager.getCurUri(), generateEventUri);
                boolean isSameKeyCode = isSameKeyCode(triggerControllerInfoManager.getCurKeyCode(), keyCode);
                this.mCurrentActivity = new WeakReference<>(activity);
                try {
                    triggerControllerInfoManager.updateCurPageInfo(activityKeyCode, str, keyCode, generateEventUri, str3, activity.isFinishing());
                    d.t().E(activity, isSameKeyCode, isSameUri, isSameActivity);
                    if (!isManualPopup || !isEmpty) {
                        triggerControllerInfoManager.onPageSwitched();
                        PopLayer.getReference().onSwitchedNewPage(curKeyCode, keyCode);
                        PageTriggerService.instance().passiveAccept();
                        PageTriggerService.instance().reTriggerFutureBroadcastEvent();
                        ing.b().a(generateEventUri, str3);
                        wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", str4 + "ActivityResumedTrigger.posttoService.uri:" + generateEventUri + " param:" + str3);
                        t4f.a().i(generateEventUri);
                        int i = this.mPageSwitchTimes + 1;
                        this.mPageSwitchTimes = i;
                        if (i % jd0.c().a().getFetchOnPageSwitchTimes() == 0) {
                            PopLayer.getReference().getConfigMgr().startFetchConfig(true);
                            return;
                        }
                        return;
                    }
                    wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", str4.concat("ActivityResumedTrigger.isManualPopup."));
                } catch (Throwable th2) {
                    th = th2;
                    wdm.h("EventManager.onActivityOrInnerViewResumed.fail.", th);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
