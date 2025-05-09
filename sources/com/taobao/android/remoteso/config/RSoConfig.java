package com.taobao.android.remoteso.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.jcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RSoConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_KEEP_IN_APK = "KeepInApk";
    public static final String ACTION_REMOVE_FROM_APK = "RemoveFromApk";
    public static final String TYPE_COMPRESSED = "compressed";
    public static final String TYPE_INAPK = "inapk";
    public static final String TYPE_REMOTE = "remote";
    private String abiName;
    private String afterProcessAction;
    private String libPureName;
    private String processType;
    private File soLibFile;

    private RSoConfig() {
    }

    private static String buildSoFileName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680ceb5e", new Object[]{str});
        }
        return "lib" + str + jcq.SO_EXTENSION;
    }

    public static RSoConfig parseOneConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoConfig) ipChange.ipc$dispatch("11531642", new Object[]{str});
        }
        String[] split = str.split(":");
        if (split.length >= 3) {
            RSoConfig rSoConfig = new RSoConfig();
            rSoConfig.libPureName = split[0];
            rSoConfig.abiName = split[1];
            rSoConfig.processType = split[2];
            if (split.length > 3) {
                rSoConfig.afterProcessAction = split[3];
            } else {
                rSoConfig.afterProcessAction = ACTION_REMOVE_FROM_APK;
            }
            return rSoConfig;
        }
        throw new IllegalArgumentException("illegal config format, not supported.   config=".concat(str));
    }

    public String getAbiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62b4dc3c", new Object[]{this});
        }
        return this.abiName;
    }

    public String getLibFullName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e232870", new Object[]{this});
        }
        return buildSoFileName(this.libPureName);
    }

    public String getLibPureName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26373427", new Object[]{this});
        }
        return this.libPureName;
    }

    public String getProcessType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fad90fc6", new Object[]{this});
        }
        return this.processType;
    }

    public File getSoLibFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2c7d12d7", new Object[]{this});
        }
        return this.soLibFile;
    }

    public boolean isActionRemoveFromApk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da6fc259", new Object[]{this})).booleanValue();
        }
        return ACTION_REMOVE_FROM_APK.equals(this.afterProcessAction);
    }

    public void setSoLibFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1d8061", new Object[]{this, file});
        } else {
            this.soLibFile = file;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RSoConfig{libPureName='" + this.libPureName + "', abiName='" + this.abiName + "', processType='" + this.processType + "', afterProcessAction='" + this.afterProcessAction + "', soLibFile=" + this.soLibFile + '}';
    }
}
