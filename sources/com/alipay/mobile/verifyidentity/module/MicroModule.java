package com.alipay.mobile.verifyidentity.module;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ModuleListener b;
    public String c;
    public String e;
    public boolean f;
    public String h;
    public VerifyIdentityTask i;
    public BroadcastReceiver j;
    public String d = "";
    public AtomicBoolean needKeepInside = new AtomicBoolean(false);
    public boolean isFindAndPay = false;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<WeakReference<Activity>> f4307a = new Stack<>();
    public final MicroModuleContext g = MicroModuleContext.getInstance();

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "MicroModule";
    }

    public static /* synthetic */ void access$100(MicroModule microModule, String str, String str2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12c1f05", new Object[]{microModule, str, str2, hashMap});
            return;
        }
        try {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, microModule.getToken(), microModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.w("MicroModule", "logBehavior Exception", th);
        }
    }

    public static /* synthetic */ VerifyIdentityTask access$200(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("c7e85dad", new Object[]{microModule});
        }
        return microModule.i;
    }

    public static /* synthetic */ ModuleListener access$300(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleListener) ipChange.ipc$dispatch("b7bc4705", new Object[]{microModule});
        }
        return microModule.b;
    }

    public static /* synthetic */ String access$400(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21224f89", new Object[]{microModule});
        }
        return microModule.d;
    }

    public static /* synthetic */ String access$500(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21f0ce0a", new Object[]{microModule});
        }
        return microModule.c;
    }

    public final synchronized void destroy() {
        WeakReference<Activity> pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.needKeepInside.get()) {
            VerifyLogCat.i("MicroModule", "needKeepInside为true！模块需要保留，忽略这次的destroy()！");
        } else {
            VerifyLogCat.d("MicroModule", "micromodule: " + getModuleName() + " destroy");
            while (!this.f4307a.isEmpty() && (pop = this.f4307a.pop()) != null) {
                Activity activity = pop.get();
                if (activity != null && !activity.isFinishing() && !this.needKeepInside.get()) {
                    activity.finish();
                }
            }
            MicroModuleContext.getInstance().onDestroyModule(this);
            onDestroy();
            if (this.j != null) {
                LocalBroadcastManager.getInstance(this.g.getContext()).unregisterReceiver(this.j);
            }
        }
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this});
        }
        return this.d;
    }

    public MicroModuleContext getMicroModuleContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModuleContext) ipChange.ipc$dispatch("e3291d3f", new Object[]{this});
        }
        return this.g;
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.c;
    }

    public VerifyIdentityTask getTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("413c5404", new Object[]{this});
        }
        return this.i;
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.e;
    }

    public String getVerifyId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8b1b04f", new Object[]{this});
        }
        return this.h;
    }

    public boolean isNeedReportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3529ed29", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final synchronized void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
        } else if (this.b != null) {
            VerifyLogCat.d("MicroModule", getModuleName() + " notifyResult");
            if (!TextUtils.isEmpty(this.d)) {
                VerifyLogCat.d("MicroModule", "notifyResult [logicModuleName] :" + this.d);
                moduleExecuteResult.setLogicModuleName(this.d);
            }
            this.b.onModuleExecuteResult(this.h, this.e, this.c, moduleExecuteResult, this.i);
            this.b = null;
        } else {
            VerifyLogCat.w("MicroModule", getModuleName() + " mListener is null");
        }
    }

    public abstract void onCreate(String str, String str2, String str3, Bundle bundle);

    public abstract void onDestroy();

    public abstract void onStart();

    public final synchronized void pushActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf58dfa2", new Object[]{this, activity});
            return;
        }
        if (!this.f4307a.isEmpty() && this.f4307a.peek().get() == null) {
            this.f4307a.pop();
        }
        this.f4307a.push(new WeakReference<>(activity));
        VerifyLogCat.v("MicroModule", "pushActivity(): " + activity.getComponentName().getClassName());
    }

    public synchronized void removeActivity(Activity activity) {
        WeakReference<Activity> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765c4e8c", new Object[]{this, activity});
            return;
        }
        if (activity != null) {
            Iterator<WeakReference<Activity>> it = this.f4307a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    weakReference = null;
                    break;
                }
                weakReference = it.next();
                if (weakReference.get() == activity) {
                    break;
                }
            }
            this.f4307a.remove(weakReference);
            VerifyLogCat.d("MicroModule", "remove Activity:" + activity.getClass().getName());
        }
    }

    public void setIsPrevent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c93f7a1", new Object[]{this, new Boolean(z)});
        }
    }

    public void setLogicModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555882a4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d5f6ea", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setNeedReportVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf25f87", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        VerifyLogCat.d("MicroModule", "micromodule: " + getModuleName() + " start");
        onStart();
    }

    public final void create(String str, String str2, String str3, Bundle bundle, ModuleListener moduleListener, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9b9cca", new Object[]{this, str, str2, str3, bundle, moduleListener, verifyIdentityTask});
            return;
        }
        VerifyLogCat.d("MicroModule", "micromodule: " + getModuleName() + " create");
        this.b = moduleListener;
        this.h = str;
        this.e = str2;
        this.i = verifyIdentityTask;
        if (bundle != null) {
            this.f = bundle.getBoolean(ModuleConstants.VI_MODULE_IS_FIRST, false);
            bundle.remove(ModuleConstants.VI_MODULE_IS_FIRST);
        }
        if (verifyIdentityTask.getPluginOrProxyMode()) {
            this.j = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.MicroModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str4, Object... objArr) {
                    str4.hashCode();
                    int hashCode = str4.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/MicroModule$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    final String str4;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    if (intent == null) {
                        str4 = "";
                    } else {
                        str4 = intent.getAction();
                    }
                    String access$000 = MicroModule.access$000();
                    VerifyLogCat.i(access$000, "Module中收到收银台退出广播：" + str4);
                    HashMap hashMap = new HashMap();
                    hashMap.put("source", "module");
                    MicroModule.access$100(MicroModule.this, "syttcgb", "UC-MobileIC-170505-5", hashMap);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.MicroModule.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                if (MicroModule.access$200(MicroModule.this) != null && MicroModule.access$200(MicroModule.this).getPluginOrProxyMode()) {
                                    if (MicroModule.access$300(MicroModule.this) == null) {
                                        VerifyLogCat.i(MicroModule.access$000(), "PoP模式下，发现当前module已经回调过");
                                    }
                                    MicroModule.this.needKeepInside.set(false);
                                    if ("KExitMiniPayViewNotification".equalsIgnoreCase(str4)) {
                                        VerifyLogCat.i(MicroModule.access$000(), "开始兜底清理！");
                                    } else if (MspGlobalDefine.EXIT_VID_ACTION.equalsIgnoreCase(str4)) {
                                        VerifyLogCat.i(MicroModule.access$000(), "收银台通知核身关闭页面！");
                                    }
                                    DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
                                    String access$0002 = MicroModule.access$000();
                                    VerifyLogCat.i(access$0002, "logicModuleName:" + MicroModule.access$400(MicroModule.this) + ", moduleName:" + MicroModule.access$500(MicroModule.this));
                                    if (TextUtils.isEmpty(MicroModule.access$400(MicroModule.this)) && MicroModule.access$500(MicroModule.this) != null && ModuleConstants.VI_MODULE_NAME_PAY_PWD.equalsIgnoreCase(MicroModule.access$500(MicroModule.this))) {
                                        VerifyIdentityTask task = MicroModule.this.getTask();
                                        if (task.getExtParams() == null) {
                                            task.setExtParams(new Bundle());
                                        }
                                        if (TextUtils.isEmpty(task.getExtParams().getString(CommonConstant.PRO_VERIFY_TYPE))) {
                                            task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, "pwd");
                                        }
                                    }
                                    MicroModule.this.notifyResult(defaultModuleResult);
                                    MicroModule.this.destroy();
                                    return;
                                }
                                VerifyLogCat.i(MicroModule.access$000(), "普通模式不需要做兜底清理");
                            } catch (Exception e) {
                                VerifyLogCat.w(MicroModule.access$000(), "接到收银台广播后，1s后处理时出现异常： ", e);
                            }
                        }
                    }, 1500L);
                }
            };
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.g.getContext());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("KExitMiniPayViewNotification");
            intentFilter.addAction(MspGlobalDefine.EXIT_VID_ACTION);
            instance.registerReceiver(this.j, intentFilter);
        }
        onCreate(str, str2, str3, bundle);
    }
}
