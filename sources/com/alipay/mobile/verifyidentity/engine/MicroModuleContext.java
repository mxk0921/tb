package com.alipay.mobile.verifyidentity.engine;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.injector.StartActivityInjectorUtils;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.ModuleDescription;
import com.alipay.mobile.verifyidentity.module.ModuleLoadException;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.rpc.IRpcService;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceInjector;
import com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper;
import com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MicroModuleContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile MicroModuleContext j;
    public final ModuleManager b;
    public Activity d;
    public Context e;
    public ContextDialogHelper f;
    public String g;
    public IRpcService h;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4288a = new Handler(Looper.getMainLooper()) { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/engine/MicroModuleContext$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1001) {
                MicroModuleContext.access$000(MicroModuleContext.this);
            }
        }
    };
    public WeakReference<Context> i = new WeakReference<>(null);
    public final Map<String, BaseProdManager> c = new HashMap();

    public MicroModuleContext() {
        ModuleManager moduleManager = new ModuleManager();
        this.b = moduleManager;
    }

    public static int a() {
        String reportFlag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            reportFlag = ReportHelper.getReportFlag(ReportHelper.enableMultiCashierFixPolice);
            VerifyLogCat.i("MicroModuleContext", "getStartActivityTimeoutMs config: " + reportFlag);
        } catch (Throwable th) {
            VerifyLogCat.e("MicroModuleContext", "getStartActivityTimeoutMs exp: ", th);
        }
        return "Y".equalsIgnoreCase(reportFlag) ? 10000 : 0;
    }

    public static /* synthetic */ void access$000(MicroModuleContext microModuleContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacf851c", new Object[]{microModuleContext});
            return;
        }
        try {
            VerifyLogCat.i("MicroModuleContext", "handleStartActivityTimeout");
            ModuleManager moduleManager = microModuleContext.b;
            if (moduleManager != null && moduleManager.getTopRunningModule() != null) {
                MicroModule topRunningModule = microModuleContext.b.getTopRunningModule();
                DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
                if (defaultModuleResult.getExtInfo() == null) {
                    defaultModuleResult.setExtInfo(new HashMap<>());
                }
                defaultModuleResult.getExtInfo().put("subCode", CommonConstant.CANCEL_SUB_BY_START_ACTIVITY_TIMEOUT);
                VerifyLogCat.i("MicroModuleContext", "handleStartActivityTimeout verifyId: " + topRunningModule.getVerifyId() + ", token: " + topRunningModule.getToken() + ", moduleName: " + topRunningModule.getModuleName());
                microModuleContext.notifyAndFinishModule(topRunningModule.getVerifyId(), topRunningModule.getToken(), topRunningModule.getModuleName(), defaultModuleResult);
            }
        } catch (Throwable th) {
            VerifyLogCat.e("MicroModuleContext", "handleStartActivityTimeout exp: ", th);
        }
    }

    public static /* synthetic */ ModuleManager access$100(MicroModuleContext microModuleContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleManager) ipChange.ipc$dispatch("bb766d58", new Object[]{microModuleContext});
        }
        return microModuleContext.b;
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return "MicroModuleContext";
    }

    public static MicroModuleContext getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModuleContext) ipChange.ipc$dispatch("51020fa9", new Object[0]);
        }
        if (j == null) {
            synchronized (MicroModuleContext.class) {
                try {
                    if (j == null) {
                        j = new MicroModuleContext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public void addDescription(ModuleDescription... moduleDescriptionArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40b415f", new Object[]{this, moduleDescriptionArr});
        } else {
            this.b.addDescription(moduleDescriptionArr);
        }
    }

    public void addProManager(String str, BaseProdManager baseProdManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a7cbe7", new Object[]{this, str, baseProdManager});
        } else {
            ((HashMap) this.c).put(str, baseProdManager);
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392f581d", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bundle});
        } else if (this.f != null) {
            VerifyLogCat.i("MicroModuleContext", "alert");
            this.f.alert(str, str2, str3, onClickListener, str4, onClickListener2, bundle);
        } else {
            VerifyLogCat.w("MicroModuleContext", "alert error");
        }
    }

    public void attachContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
            return;
        }
        this.e = context;
        this.f = new ContextDialogHelper(context);
    }

    public final Class<?> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("582938df", new Object[]{this, str});
        }
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            Class<?> loadClass = classLoader.loadClass(str);
            Thread.currentThread().setContextClassLoader(classLoader);
            if (loadClass != null) {
                return loadClass;
            }
            throw new ActivityNotFoundException("entry class must be set.");
        } catch (ClassNotFoundException e) {
            throw new ActivityNotFoundException(e.getMessage());
        }
    }

    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else if (this.f != null) {
            VerifyLogCat.i("MicroModuleContext", "dismissProgressDialog");
            this.f.dismissProgressDialog();
        } else {
            VerifyLogCat.w("MicroModuleContext", "dismissProgressDialog error");
        }
    }

    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
        } else {
            exit(false);
        }
    }

    public MicroModule findModule(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("cee7732c", new Object[]{this, str, str2, str3});
        }
        return this.b.findModule(str, str2, str3);
    }

    public BaseProdManager findProManager(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseProdManager) ipChange.ipc$dispatch("6aadfd81", new Object[]{this, str});
        }
        return (BaseProdManager) ((HashMap) this.c).get(str);
    }

    public void finishModule(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6435bb44", new Object[]{this, str, str2, str3});
        } else {
            this.f4288a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MicroModuleContext.access$100(MicroModuleContext.this).finishModule(str, str2, str3);
                    }
                }
            });
        }
    }

    public void finishTask(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc84ded3", new Object[]{this, str, str2});
        } else {
            this.f4288a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MicroModuleContext.access$100(MicroModuleContext.this).finishTask(str, str2);
                    }
                }
            });
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.e == null) {
            VerifyLogCat.i("MicroModuleContext", "核身引擎Context为空，进入致命恢复逻辑");
            try {
                this.e = (Context) ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.ContextUtils", "getContext", null, null);
            } catch (Throwable th) {
                VerifyLogCat.e("MicroModuleContext", "致命恢复失败！！！ ", th);
            }
            Context context = this.e;
            if (context == null) {
                VerifyLogCat.i("MicroModuleContext", "Context为空，致命恢复失败！！！");
            } else {
                VerifyIdentityEngine.getInstance(context);
                VerifyLogCat.i("MicroModuleContext", "致命恢复成功！");
            }
        }
        return this.e;
    }

    public String getEnvType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85aafa08", new Object[]{this});
        }
        return this.g;
    }

    public IRpcService getRpcService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRpcService) ipChange.ipc$dispatch("1ac199ab", new Object[]{this});
        }
        IRpcService rpcService = IRpcServiceInjector.getInstance().getRpcService();
        if (rpcService == null) {
            rpcService = new IRpcServiceImpl();
        }
        this.h = rpcService;
        if (TaskManager.getInstance().getCurrentTask() != null) {
            this.h.setGW(TaskManager.getInstance().getCurrentTask().gwUrl);
        }
        return this.h;
    }

    public WeakReference<Activity> getTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("c699f323", new Object[]{this});
        }
        return new WeakReference<>(this.d);
    }

    public void notifyAndFinishModule(final String str, final String str2, final String str3, final ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8264a80c", new Object[]{this, str, str2, str3, moduleExecuteResult});
        } else {
            this.f4288a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MicroModuleContext.access$100(MicroModuleContext.this).notifyModuleResult(str, str2, str3, moduleExecuteResult);
                    MicroModuleContext.access$100(MicroModuleContext.this).finishModule(str, str2, str3);
                }
            });
        }
    }

    public void notifyModuleResult(final String str, final String str2, final String str3, final ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c2af67", new Object[]{this, str, str2, str3, moduleExecuteResult});
        } else {
            this.f4288a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MicroModuleContext.access$100(MicroModuleContext.this).notifyModuleResult(str, str2, str3, moduleExecuteResult);
                    }
                }
            });
        }
    }

    public void onDestroyModule(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf904be4", new Object[]{this, microModule});
            return;
        }
        ModuleManager moduleManager = this.b;
        if (moduleManager != null) {
            moduleManager.onDestroyModule(microModule);
        }
    }

    public void onDestroyProManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40d4ec2", new Object[]{this});
            return;
        }
        Map<String, BaseProdManager> map = this.c;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public void removeStartActivityMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04bef34", new Object[]{this});
            return;
        }
        try {
            VerifyLogCat.i("MicroModuleContext", "remove msg MSG_START_ACTIVITY_FAIL");
            Handler handler = this.f4288a;
            if (handler != null) {
                handler.removeMessages(1001);
            }
        } catch (Throwable th) {
            VerifyLogCat.e("MicroModuleContext", "removeStartActivityMonitor exp: ", th);
        }
    }

    public void setEnvType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b7cfd6", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void setStartActivityContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb58ec1", new Object[]{this, context});
        } else {
            this.i = new WeakReference<>(context);
        }
    }

    public void setStartActivityMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128c7912", new Object[]{this});
            return;
        }
        try {
            int a2 = a();
            if (a2 > 0 && this.f4288a != null) {
                Message obtain = Message.obtain();
                obtain.what = 1001;
                VerifyLogCat.i("MicroModuleContext", "send msg MSG_START_ACTIVITY_FAIL");
                this.f4288a.sendMessageDelayed(obtain, a2);
            }
        } catch (Throwable th) {
            VerifyLogCat.e("MicroModuleContext", "setStartActivityMonitor exp: ", th);
        }
    }

    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
            return;
        }
        ContextDialogHelper contextDialogHelper = this.f;
        if (contextDialogHelper != null) {
            contextDialogHelper.showProgressDialog(str);
        } else {
            VerifyLogCat.w("MicroModuleContext", "showProgressDialog error");
        }
    }

    public void showProgressProDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e11fd7c", new Object[]{this, str});
            return;
        }
        ContextDialogHelper contextDialogHelper = this.f;
        if (contextDialogHelper != null) {
            contextDialogHelper.showProgressProDialog(str);
        } else {
            VerifyLogCat.w("MicroModuleContext", "showProgressDialog error");
        }
    }

    public void startActivity(MicroModule microModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbf9044", new Object[]{this, microModule, str});
        } else if (microModule == null || TextUtils.isEmpty(str)) {
            VerifyLogCat.w("MicroModuleContext", "startActivity className failed");
        } else {
            Intent intent = new Intent(this.d, b(str));
            intent.putExtra(ActivityHelper.TASK_VERIFYID, microModule.getVerifyId());
            intent.putExtra(ActivityHelper.TASK_TOKEN, microModule.getToken());
            intent.putExtra(ActivityHelper.TASK_MODULENAME, microModule.getModuleName());
            microModule.setIsPrevent(true);
            intent.addFlags(65536);
            if (this.d == null) {
                startActivityByContext(intent);
            } else if (StartActivityInjectorUtils.injectorHandled(intent)) {
                VerifyLogCat.i("MicroModuleContext", "StartActivityInjector HANDLED!!!");
            } else {
                VerifyLogCat.i("MicroModuleContext", "startActivity by VI itself!");
                this.d.startActivity(intent);
            }
        }
    }

    public void startModule(final String str, final String str2, final String str3, final String str4, final Bundle bundle, final ModuleListener moduleListener, final VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4cc4e", new Object[]{this, str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask});
        } else {
            this.f4288a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MicroModuleContext.access$100(MicroModuleContext.this).startModule(str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask);
                    } catch (ModuleLoadException e) {
                        VerifyLogCat.e(MicroModuleContext.access$200(), e);
                    }
                }
            });
        }
    }

    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else if (this.f != null) {
            VerifyLogCat.i("MicroModuleContext", "toast");
            this.f.toast(str, i);
        } else {
            VerifyLogCat.w("MicroModuleContext", "toast error");
        }
    }

    public Activity updateActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c06971b7", new Object[]{this, activity});
        }
        Activity activity2 = this.d;
        this.d = activity;
        return activity2;
    }

    public void exit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8908cf", new Object[]{this, new Boolean(z)});
            return;
        }
        VerifyLogCat.i("MicroModuleContext", "VI exit() called. [rudely]:" + z);
        if (z) {
            TaskManager.getInstance().clearMultiTaskFlag();
        }
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.synKillPre))) {
            ModuleManager moduleManager = this.b;
            if (!(moduleManager == null || moduleManager.getTopRunningModule() == null)) {
                VerifyLogCat.i("MicroModuleContext", "[NEW WAY!] There're modules need to be finished.");
                this.b.notifyAndFinishAllModule();
            }
        } else {
            TaskManager.getInstance().clearAllTasks();
            ModuleManager moduleManager2 = this.b;
            if (!(moduleManager2 == null || moduleManager2.getTopRunningModule() == null)) {
                VerifyLogCat.i("MicroModuleContext", "There're modules need to be finished.");
                this.b.finishAllModules();
            }
        }
        dismissProgressDialog();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startActivityByContext(android.content.Intent r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "7ad5818b"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            java.lang.String r1 = "startActivity by mContext"
            java.lang.String r2 = "MicroModuleContext"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r1)
            boolean r1 = com.alipay.mobile.verifyidentity.injector.StartActivityInjectorUtils.injectorHandled(r6)
            if (r1 == 0) goto L_0x0029
            java.lang.String r6 = "StartActivityInjector HANDLED!!!"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r6)
            return
        L_0x0029:
            java.lang.String r1 = "startActivity by VI itself!"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r1)
            com.alipay.mobile.verifyidentity.engine.TaskManager r1 = com.alipay.mobile.verifyidentity.engine.TaskManager.getInstance()
            com.alipay.mobile.verifyidentity.data.VerifyIdentityTask r1 = r1.getCurrentTask()
            if (r1 == 0) goto L_0x0045
            com.alipay.mobile.verifyidentity.engine.TaskManager r0 = com.alipay.mobile.verifyidentity.engine.TaskManager.getInstance()
            com.alipay.mobile.verifyidentity.data.VerifyIdentityTask r0 = r0.getCurrentTask()
            boolean r0 = r0.getPluginOrProxyMode()
        L_0x0045:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[getValidStartActivityContext] popMode: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r1)
            java.lang.ref.WeakReference<android.content.Context> r1 = r5.i
            if (r1 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r1.get()
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0076
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = "[getValidStartActivityContext] Activity 可用"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r1)
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "getRunningActivity is null"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r2, r0)
            android.content.Context r0 = r5.e
        L_0x0080:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x008d
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r6.addFlags(r1)
            r0.startActivity(r6)
            return
        L_0x008d:
            android.app.Activity r0 = (android.app.Activity) r0
            r0.startActivity(r6)
            r6 = 17432576(0x10a0000, float:2.5346597E-38)
            r1 = 17432577(0x10a0001, float:2.53466E-38)
            r0.overridePendingTransition(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.startActivityByContext(android.content.Intent):void");
    }

    public void startActivityForMsp(MicroModule microModule, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45174376", new Object[]{this, microModule, intent});
        } else if (microModule == null || intent == null) {
            VerifyLogCat.w("MicroModuleContext", "startActivity intent failed");
        } else {
            intent.putExtra(ActivityHelper.TASK_VERIFYID, microModule.getVerifyId());
            intent.putExtra(ActivityHelper.TASK_TOKEN, microModule.getToken());
            intent.putExtra(ActivityHelper.TASK_MODULENAME, microModule.getModuleName());
            microModule.setIsPrevent(true);
            intent.addFlags(65536);
            startActivityByContext(intent);
        }
    }

    public void startProdActivityByContext(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ab0074", new Object[]{this, intent});
            return;
        }
        VerifyLogCat.i("MicroModuleContext", "startActivity by mContext");
        if (StartActivityInjectorUtils.injectorHandled(intent)) {
            VerifyLogCat.i("MicroModuleContext", "StartActivityInjector HANDLED!!!");
            return;
        }
        VerifyLogCat.i("MicroModuleContext", "startActivity by VI itself!");
        intent.putExtra(ActivityHelper.PROD_ACTIVITY, true);
        Context context = this.e;
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
            if (this.e == null) {
                this.e = getContext();
            }
            this.e.startActivity(intent);
            return;
        }
        Activity activity = (Activity) context;
        activity.startActivity(intent);
        activity.overridePendingTransition(17432576, 17432577);
    }

    public boolean canTaskContinue(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10f55f77", new Object[]{this, verifyIdentityTask})).booleanValue();
        }
        if (verifyIdentityTask == null) {
            return false;
        }
        if (VerifyIdentityTask.TaskStatus.OVER.equals(verifyIdentityTask.getTaskStatus())) {
            VerifyLogCat.i("MicroModuleContext", "任务已结束");
            return false;
        }
        VerifyLogCat.i("MicroModuleContext", "任务正常");
        return true;
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else if (this.f != null) {
            VerifyLogCat.i("MicroModuleContext", "showProgressDialog");
            this.f.showProgressDialog(str, z, onCancelListener);
        } else {
            VerifyLogCat.w("MicroModuleContext", "showProgressDialog error");
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else if (this.f != null) {
            VerifyLogCat.i("MicroModuleContext", "alert");
            this.f.alert(str, str2, str3, onClickListener, str4, onClickListener2, null);
        } else {
            VerifyLogCat.w("MicroModuleContext", "alert error");
        }
    }

    public void toast(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22158bd8", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.f != null) {
            VerifyLogCat.i("MicroModuleContext", "toast");
            this.f.toast(str, i, i2);
        } else {
            VerifyLogCat.w("MicroModuleContext", "toast error");
        }
    }

    public void startActivity(MicroModule microModule, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b49aab7", new Object[]{this, microModule, intent});
        } else if (microModule == null || intent == null) {
            VerifyLogCat.w("MicroModuleContext", "startActivity intent failed");
        } else {
            intent.putExtra(ActivityHelper.TASK_VERIFYID, microModule.getVerifyId());
            intent.putExtra(ActivityHelper.TASK_TOKEN, microModule.getToken());
            intent.putExtra(ActivityHelper.TASK_MODULENAME, microModule.getModuleName());
            microModule.setIsPrevent(true);
            intent.addFlags(65536);
            if (this.d == null) {
                startActivityByContext(intent);
            } else if (StartActivityInjectorUtils.injectorHandled(intent)) {
                VerifyLogCat.i("MicroModuleContext", "StartActivityInjector HANDLED!!!");
            } else {
                VerifyLogCat.i("MicroModuleContext", "startActivity by VI itself!");
                this.d.startActivity(intent);
            }
        }
    }
}
