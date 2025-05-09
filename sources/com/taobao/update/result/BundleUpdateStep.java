package com.taobao.update.result;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum BundleUpdateStep implements Serializable {
    STEP0("MtopRequest", "发送Mtop请求"),
    STEP1("Request", "发送http请求"),
    STEP2("DiskCheck", "磁盘空间检查"),
    STEP3("BundleDownload", "bundle下载"),
    STEP4("Renamer", "patch重命名"),
    STEP5("PatchMerge", "patchMerge"),
    STEP6("BundleInstall", "bundle安装"),
    STEP7("AllFinish", "动态部署成功"),
    STEP8("Reboot", "重启校验");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String desc;
    private String msg;
    private String step;
    private boolean success;

    BundleUpdateStep(String str, String str2) {
        this.step = str;
        this.desc = str2;
    }

    public static /* synthetic */ Object ipc$super(BundleUpdateStep bundleUpdateStep, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/result/BundleUpdateStep");
    }

    public static BundleUpdateStep valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleUpdateStep) ipChange.ipc$dispatch("37b08b14", new Object[]{str});
        }
        return (BundleUpdateStep) Enum.valueOf(BundleUpdateStep.class, str);
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.desc;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.msg;
    }

    public String getStep() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b4b3cf7", new Object[]{this});
        }
        return this.step;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void setMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965d110", new Object[]{this, str});
        } else {
            this.msg = str;
        }
    }

    public void success(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64d090a", new Object[]{this, new Boolean(z)});
        } else {
            this.success = z;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.step + ":" + this.desc + "->" + this.success + "->" + this.msg;
    }
}
