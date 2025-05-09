package com.alipay.mobile.verifyidentity.engine;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.ModuleDescription;
import com.alipay.mobile.verifyidentity.module.ModuleLoadException;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ModuleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<MicroModule> f4293a = new Stack<>();
    public final Map<String, MicroModule> b = new HashMap();
    public final List<ModuleDescription> c = new ArrayList();

    public static MicroModule a(ModuleDescription moduleDescription, Bundle bundle) {
        String str;
        VerifyLogCat.d("ModuleManager", "createModuleByDescription: " + moduleDescription.getModuleName());
        StringBuilder sb = new StringBuilder("params is ");
        if (bundle != null) {
            str = "not";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("null");
        VerifyLogCat.d("ModuleManager", sb.toString());
        String className = moduleDescription.getClassName();
        try {
            Object newInstance = Class.forName(className).newInstance();
            if (newInstance instanceof MicroModule) {
                return (MicroModule) newInstance;
            }
            throw new ModuleLoadException("Module " + className + " is not a Module");
        } catch (Throwable th) {
            throw new ModuleLoadException("Module Exception: " + th);
        }
    }

    public static String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        return str + "_" + str2 + "_" + str3;
    }

    public synchronized void addDescription(ModuleDescription... moduleDescriptionArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40b415f", new Object[]{this, moduleDescriptionArr});
            return;
        }
        if (moduleDescriptionArr != null && moduleDescriptionArr.length > 0) {
            ((ArrayList) this.c).addAll(Arrays.asList(moduleDescriptionArr));
        }
    }

    public final synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        MicroModule microModule = (MicroModule) ((HashMap) this.b).get(str);
        if (microModule != null) {
            VerifyLogCat.d("ModuleManager", "finishModule microModule: " + str);
            microModule.destroy();
            return;
        }
        VerifyLogCat.w("ModuleManager", "finishModule can't find microModule: " + str);
    }

    public final synchronized ModuleDescription e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleDescription) ipChange.ipc$dispatch("6876ba95", new Object[]{this, str});
        }
        ModuleDescription moduleDescription = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ModuleDescription moduleDescription2 = (ModuleDescription) it.next();
            if (str.equalsIgnoreCase(moduleDescription2.getModuleName())) {
                moduleDescription = moduleDescription2;
                break;
            }
        }
        return moduleDescription;
    }

    public MicroModule findModule(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("cee7732c", new Object[]{this, str, str2, str3});
        }
        return (MicroModule) ((HashMap) this.b).get(b(str, str2, str3));
    }

    public synchronized void finishAllModules() {
        MicroModule microModule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c167ba0", new Object[]{this});
        } else if (this.b == null) {
            VerifyLogCat.d("ModuleManager", "no microModule need to be finished");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.b);
            for (String str : hashMap.keySet()) {
                if (!VIUtils.isMultiTaskModeEnabled() || (microModule = (MicroModule) hashMap.get(str)) == null || microModule.getTask() == null || !microModule.getTask().keepOnMultiMode()) {
                    c(str);
                }
            }
        }
    }

    public synchronized void finishModule(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6435bb44", new Object[]{this, str, str2, str3});
        } else {
            c(b(str, str2, str3));
        }
    }

    public void finishTask(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc84ded3", new Object[]{this, str, str2});
            return;
        }
        VerifyLogCat.d("ModuleManager", "finishTask verifyId: " + str + " token: " + str2);
        for (MicroModule microModule : ((HashMap) this.b).values()) {
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2) && str2.equals(microModule.getToken())) {
                    microModule.destroy();
                    VerifyLogCat.d("ModuleManager", "finishModule microModule by token: " + microModule.getModuleName());
                }
            } else if (!TextUtils.isEmpty(str) && str.equals(microModule.getVerifyId())) {
                microModule.destroy();
                VerifyLogCat.d("ModuleManager", "finishModule microModule by verifyId: " + microModule.getVerifyId());
            }
        }
    }

    public MicroModule getTopRunningModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("98572ff5", new Object[]{this});
        }
        Stack<MicroModule> stack = this.f4293a;
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return this.f4293a.peek();
    }

    public void notifyModuleResult(String str, String str2, String str3, ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c2af67", new Object[]{this, str, str2, str3, moduleExecuteResult});
            return;
        }
        String b = b(str, str2, str3);
        VerifyLogCat.i("ModuleManager", b + " notifyModuleResult");
        MicroModule microModule = (MicroModule) ((HashMap) this.b).get(b);
        if (microModule != null) {
            microModule.notifyResult(moduleExecuteResult);
        }
    }

    public synchronized void onDestroyModule(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf904be4", new Object[]{this, microModule});
            return;
        }
        this.f4293a.remove(microModule);
        String b = b(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName());
        ((HashMap) this.b).remove(b);
        VerifyLogCat.d("ModuleManager", "onDestroyModule pop microModule: " + b);
    }

    public synchronized void startModule(String str, String str2, String str3, String str4, Bundle bundle, ModuleListener moduleListener, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4cc4e", new Object[]{this, str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask});
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            VerifyLogCat.e("ModuleManager", "token or moduleName should not be empty");
        }
        VerifyLogCat.i("ModuleManager", "startModule(): [token=" + str2 + "], [moduleName=" + str3 + "]");
        d(str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask);
    }

    public synchronized void notifyAndFinishAllModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b2eef3", new Object[]{this});
        } else if (this.b == null) {
            VerifyLogCat.d("ModuleManager", "no microModule need to be finished");
        } else {
            VerifyLogCat.i("ModuleManager", "Now to [notifyAndFinishAllModule]!");
            DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
            if (defaultModuleResult.getExtInfo() == null) {
                defaultModuleResult.setExtInfo(new HashMap<>());
            }
            defaultModuleResult.getExtInfo().put("subCode", "101");
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.b);
            for (String str : hashMap.keySet()) {
                MicroModule microModule = (MicroModule) hashMap.get(str);
                if (microModule != null && (!VIUtils.isMultiTaskModeEnabled() || microModule.getTask() == null || !microModule.getTask().keepOnMultiMode())) {
                    if (microModule.isFindAndPay) {
                        defaultModuleResult.setFindAndPay(true);
                    }
                    if (microModule.getTask() != null) {
                        defaultModuleResult.getExtInfo().put("nextProVid", microModule.getTask().nextProVid);
                    }
                    notifyModuleResult(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName(), defaultModuleResult);
                    finishModule(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName());
                    VerifyLogCat.i("ModuleManager", "Module " + str + " have been finished!");
                }
            }
        }
    }

    public final boolean d(String str, String str2, String str3, String str4, Bundle bundle, ModuleListener moduleListener, VerifyIdentityTask verifyIdentityTask) {
        ModuleDescription moduleDescription;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60e0567f", new Object[]{this, str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask})).booleanValue();
        }
        if (verifyIdentityTask.isDynamicMode) {
            VerifyLogCat.i("ModuleManager", "[startNativeModule] Task is in dynamic mode now. It will use the unified dynamic module!");
            moduleDescription = e(ModuleConstants.VI_MODULE_NAME_DYNAMIC_CENTER);
        } else if (verifyIdentityTask.isIPay) {
            moduleDescription = e(str3 + "_INTERNAL");
        } else {
            moduleDescription = e(str3);
        }
        if (moduleDescription != null) {
            try {
                if (!MicroModuleContext.getInstance().canTaskContinue(verifyIdentityTask)) {
                    VerifyLogCat.w("ModuleManager", "当前任务已过期，无需再启动 [" + str3 + "]");
                } else {
                    MicroModule a2 = a(moduleDescription, bundle);
                    a2.setModuleName(str3);
                    a2.create(str, str2, str4, bundle, moduleListener, verifyIdentityTask);
                    this.f4293a.push(a2);
                    ((HashMap) this.b).put(b(str, str2, str3), a2);
                    VerifyLogCat.i("ModuleManager", "createModule() completed " + moduleDescription);
                    a2.start();
                }
                return true;
            } catch (ModuleLoadException e) {
                VerifyLogCat.e("ModuleManager", e);
            }
        }
        VerifyLogCat.w("ModuleManager", "Failed to find ModuleDescription by [" + str3 + "]");
        if (moduleListener != null) {
            moduleListener.onModuleExecuteResult(str, str2, str3, new DefaultModuleResult("2002"), verifyIdentityTask);
        }
        return false;
    }
}
