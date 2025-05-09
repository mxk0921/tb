package com.alibaba.ariver.kernel.api.security;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ApiPermissionCheckResult {
    IGNORE,
    ALLOW,
    DENY,
    DENY_N22101("N22101"),
    DENY_N22102("N22102"),
    DENY_N22103("N22103"),
    DENY_N22104("N22104"),
    DENY_N22105("N22105"),
    DENY_N22106("N22106"),
    DENY_N22107("N22107"),
    DENY_N22108("N22108"),
    DENY_N22109("N22109"),
    DENY_N22110("N22110"),
    DENY_N22111("N22111"),
    DENY_N22201("N22201"),
    DENY_N22202("N22202"),
    DENY_N22203("N22203"),
    DENY_N22204("N22204"),
    DENY_N22205("N22205"),
    DENY_N22206("N22206"),
    DENY_N22207("N22207"),
    DENY_N22208("N22208");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean hasSignature = false;
    private String signature;

    ApiPermissionCheckResult() {
    }

    public static /* synthetic */ Object ipc$super(ApiPermissionCheckResult apiPermissionCheckResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/api/security/ApiPermissionCheckResult");
    }

    public static ApiPermissionCheckResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiPermissionCheckResult) ipChange.ipc$dispatch("b34f0d43", new Object[]{str});
        }
        return (ApiPermissionCheckResult) Enum.valueOf(ApiPermissionCheckResult.class, str);
    }

    public String getSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this});
        }
        return this.signature;
    }

    public boolean hasSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b74e28c9", new Object[]{this})).booleanValue();
        }
        return this.hasSignature;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        if (IGNORE == this || ALLOW == this) {
            return true;
        }
        return false;
    }

    ApiPermissionCheckResult(String str) {
        this.signature = str;
    }
}
