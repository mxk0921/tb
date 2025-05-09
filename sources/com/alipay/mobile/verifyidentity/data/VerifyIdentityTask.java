package com.alipay.mobile.verifyidentity.data;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyIdentityTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static long TASK_TIMEOUT = 10000;
    public String b;
    public String bizId;
    public String bizRequestData;
    public String c;
    public String d;
    public VerifyIdentityListener e;
    public String entryModuleData;
    public String entryModuleName;
    public String gwUrl;
    public Bundle h;
    public VerifyType i;
    public boolean isIPay;
    public boolean isLoginRPC;
    public String j;
    public VIListenerByVerifyId k;
    public VIMessageChannel l;
    public boolean resetCookie;
    public String sceneId;

    /* renamed from: a  reason: collision with root package name */
    public final String f4287a = VerifyIdentityTask.class.getSimpleName();
    public TaskStatus f = TaskStatus.WAIT;
    public long g = SystemClock.elapsedRealtime();
    public boolean needReportEnvInfo = true;
    public long taskPrepareStartTime = -1;
    public long taskPrepareEndTime = -1;
    public long initRpcStartTime = SystemClock.elapsedRealtime();
    public long initRpcEndTime = SystemClock.elapsedRealtime();
    public long mTaskStartTime = SystemClock.elapsedRealtime();
    public boolean isDynamicMode = false;
    public boolean m = false;
    public boolean canNotUseRpcChannel = false;
    public boolean showEngineError = false;
    public boolean isMultiTaskEnabled = false;
    public boolean canMultiTaskEnableOnPoP = false;
    public String nextProVid = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TaskStatus {
        WAIT,
        RUN,
        OVER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TaskStatus taskStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/data/VerifyIdentityTask$TaskStatus");
        }

        public static TaskStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaskStatus) ipChange.ipc$dispatch("8462a64e", new Object[]{str});
            }
            return (TaskStatus) Enum.valueOf(TaskStatus.class, str);
        }
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.d;
    }

    public String getCompatibleVerifyType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6596f55c", new Object[]{this});
        }
        VerifyType verifyType = this.i;
        if (verifyType == null || verifyType.equals(VerifyType.VERIFYID) || this.i.equals(VerifyType.TOKEN)) {
            return "standard";
        }
        if (this.i.equals(VerifyType.FAST_INIT)) {
            return "verify_init";
        }
        if (this.i.equals(VerifyType.FAST_DIRECT)) {
            return "verify_module";
        }
        return "";
    }

    public Bundle getExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d78bef1c", new Object[]{this});
        }
        return this.h;
    }

    public VerifyIdentityListener getListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityListener) ipChange.ipc$dispatch("b5795781", new Object[]{this});
        }
        return this.e;
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.c;
    }

    public boolean getPluginOrProxyMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9158eb0", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public long getTaskCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("186fc8bf", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public synchronized TaskStatus getTaskStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStatus) ipChange.ipc$dispatch("55a460e9", new Object[]{this});
        }
        return this.f;
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.b;
    }

    public VIMessageChannel getVIMessageChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VIMessageChannel) ipChange.ipc$dispatch("31008be1", new Object[]{this});
        }
        return this.l;
    }

    public String getVerifyId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8b1b04f", new Object[]{this});
        }
        return this.j;
    }

    public VerifyType getVerifyType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyType) ipChange.ipc$dispatch("511e0c40", new Object[]{this});
        }
        return this.i;
    }

    public VIListenerByVerifyId getVidListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VIListenerByVerifyId) ipChange.ipc$dispatch("69bd7b75", new Object[]{this});
        }
        return this.k;
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setEntryModuleData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff38f97", new Object[]{this, str});
        } else {
            this.entryModuleData = str;
        }
    }

    public void setEntryModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872c4bb8", new Object[]{this, str});
        } else {
            this.entryModuleName = str;
        }
    }

    public void setListener(VerifyIdentityListener verifyIdentityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfc8739", new Object[]{this, verifyIdentityListener});
        } else {
            this.e = verifyIdentityListener;
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

    public void setTaskCreateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ce86cd", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public synchronized void setTaskStatus(TaskStatus taskStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a92045", new Object[]{this, taskStatus});
        } else {
            this.f = taskStatus;
        }
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setVIMessageChannel(VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b16ea0d", new Object[]{this, vIMessageChannel});
            return;
        }
        this.l = vIMessageChannel;
        if (vIMessageChannel != null) {
            this.m = true;
        }
    }

    public void setVerifyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e861b407", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void setVerifyType(VerifyType verifyType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f090d6", new Object[]{this, verifyType});
        } else {
            this.i = verifyType;
        }
    }

    public void setVidListener(VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c38ebf", new Object[]{this, vIListenerByVerifyId});
        } else {
            this.k = vIListenerByVerifyId;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (SystemClock.elapsedRealtime() - this.taskPrepareStartTime <= 2100000) {
            return false;
        }
        VerifyLogCat.i(this.f4287a, "当前多实例任务已超时");
        return true;
    }

    public boolean keepOnMultiMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40e27b23", new Object[]{this})).booleanValue();
        }
        boolean z = !a() && this.canMultiTaskEnableOnPoP;
        if ((!this.isMultiTaskEnabled || a() || getPluginOrProxyMode()) && !z) {
            return false;
        }
        String str = this.f4287a;
        VerifyLogCat.i(str, "多实例任务不清理 " + getVerifyId());
        return true;
    }

    public void setExtParams(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b51a88", new Object[]{this, bundle});
            return;
        }
        this.h = bundle;
        if (bundle != null) {
            String string = bundle.getString("gwUrl");
            if (!TextUtils.isEmpty(string)) {
                String str = this.f4287a;
                VerifyLogCat.i(str, "外部注入了网关: " + string);
                this.gwUrl = string;
            }
            if (this.h.getBoolean("resetCookie", false)) {
                VerifyLogCat.i(this.f4287a, "resetCookie: true");
                this.resetCookie = true;
            }
            if (this.h.getBoolean("isLoginRPC", false)) {
                VerifyLogCat.i(this.f4287a, "isLoginRPC: true");
                this.isLoginRPC = true;
            }
            String string2 = this.h.getString("VIE_envType");
            if (!TextUtils.isEmpty(string2)) {
                MicroModuleContext.getInstance().setEnvType(string2);
            }
            if ("Y".equalsIgnoreCase(this.h.getString("VIE_useBird"))) {
                this.isDynamicMode = true;
            } else {
                this.isDynamicMode = false;
            }
            if (this.h.getBoolean(VIFBPluginManager.KEY_IS_PLUGIN_MODE)) {
                VerifyLogCat.i(this.f4287a, "本次校验为插件模式");
                this.m = true;
            }
            if (this.h.containsKey("showEngineError")) {
                this.showEngineError = Boolean.valueOf(String.valueOf(this.h.get("showEngineError"))).booleanValue();
                String str2 = this.f4287a;
                VerifyLogCat.i(str2, "showEngineError: " + this.showEngineError);
            }
        }
    }
}
