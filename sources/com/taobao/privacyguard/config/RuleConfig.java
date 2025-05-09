package com.taobao.privacyguard.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RuleConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean enable = false;
    public String hashRate = "100_-1_100";
    public List<String> permissionCheckList = null;
    public List<String> reportActivityBlackList = null;
    public long permissionCheckInterval = -1;
    public boolean reportStack = true;
    public boolean reportParams = true;
    public int stackLevel = -1;
    public String abComponent = "privacy_guard_performance_v2";
    public boolean reportPermissionCheck = true;

    static {
        t2o.a(757071884);
    }

    public String getHashRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f375e0f5", new Object[]{this});
        }
        return this.hashRate;
    }

    public List<String> getPermissionCheckList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14ec1fbf", new Object[]{this});
        }
        return this.permissionCheckList;
    }

    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return this.enable;
    }

    public boolean isReportParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43d148af", new Object[]{this})).booleanValue();
        }
        return this.reportParams;
    }

    public boolean isReportPermissionCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d78ca6", new Object[]{this})).booleanValue();
        }
        return this.reportPermissionCheck;
    }

    public boolean isReportStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbd199b5", new Object[]{this})).booleanValue();
        }
        return this.reportStack;
    }
}
