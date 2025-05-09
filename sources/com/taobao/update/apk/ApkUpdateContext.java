package com.taobao.update.apk;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hdt;
import tb.nkv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ApkUpdateContext extends hdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apkPath;
    public boolean background;
    public boolean hasNotified;
    public boolean isDownloadError;
    public MainUpdateData mainUpdate;
    public NotifyPolicy notifyPolicy = NotifyPolicy.DEFAULT;
    public Boolean exceedUpdateTimes = Boolean.FALSE;
    public NotifySource updateAlertSource = NotifySource.UPDATE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum NotifyPolicy {
        DEFAULT,
        SCENCE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NotifyPolicy notifyPolicy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/apk/ApkUpdateContext$NotifyPolicy");
        }

        public static NotifyPolicy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotifyPolicy) ipChange.ipc$dispatch("d97cc53b", new Object[]{str});
            }
            return (NotifyPolicy) Enum.valueOf(NotifyPolicy.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum NotifySource {
        UPDATE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NotifySource notifySource, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/apk/ApkUpdateContext$NotifySource");
        }

        public static NotifySource valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NotifySource) ipChange.ipc$dispatch("78b25f72", new Object[]{str});
            }
            return (NotifySource) Enum.valueOf(NotifySource.class, str);
        }
    }

    static {
        t2o.a(953155587);
    }

    public static /* synthetic */ Object ipc$super(ApkUpdateContext apkUpdateContext, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/apk/ApkUpdateContext");
    }

    public boolean isDefaultUpdate() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941cb1eb", new Object[]{this})).booleanValue();
        }
        if (2 != nkv.getNetworkType() && (3 == (i = this.mainUpdate.remindStrategy) || 5 == i)) {
            return true;
        }
        if (2 == nkv.getNetworkType() && 8 == this.mainUpdate.remindStrategy) {
            return true;
        }
        return false;
    }

    public boolean isForceUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ebe9f95", new Object[]{this})).booleanValue();
        }
        if (2 == this.mainUpdate.remindStrategy) {
            return true;
        }
        if (2 == nkv.getNetworkType() && 3 == this.mainUpdate.remindStrategy) {
            return true;
        }
        return false;
    }

    public boolean isSilentUpdate() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c2b853", new Object[]{this})).booleanValue();
        }
        if (6 == this.mainUpdate.remindStrategy) {
            return true;
        }
        if (2 == nkv.getNetworkType() && (4 == (i = this.mainUpdate.remindStrategy) || 5 == i)) {
            return true;
        }
        return false;
    }

    public boolean skipUpdate() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d86c5fb3", new Object[]{this})).booleanValue();
        }
        if (7 == this.mainUpdate.remindStrategy) {
            return true;
        }
        if (2 == nkv.getNetworkType() || (4 != (i = this.mainUpdate.remindStrategy) && 8 != i)) {
            return false;
        }
        return true;
    }
}
