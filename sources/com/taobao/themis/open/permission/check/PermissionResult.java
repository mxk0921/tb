package com.taobao.themis.open.permission.check;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0012¢\u0006\u0002\u0010\u0002B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/taobao/themis/open/permission/check/PermissionResult;", "", "(Ljava/lang/String;I)V", SimpleProfile.KEY_SIGNATURE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "hasSignature", "", "isSuccess", "()Z", "<set-?>", "getSignature", "()Ljava/lang/String;", "IGNORE", "ALLOW", "DENY", "DENY_N22101", "DENY_N22102", "DENY_N22103", "DENY_N22104", "DENY_N22105", "DENY_N22106", "DENY_N22107", "DENY_N22108", "DENY_N22109", "DENY_N22110", "DENY_N22111", "DENY_N22201", "DENY_N22202", "DENY_N22203", "DENY_N22204", "DENY_N22205", "DENY_N22206", "DENY_N22207", "DENY_N22208", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PermissionResult extends Enum<PermissionResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean hasSignature;
    private String signature;
    public static final PermissionResult IGNORE = new PermissionResult("IGNORE", 0);
    public static final PermissionResult ALLOW = new PermissionResult("ALLOW", 1);
    public static final PermissionResult DENY = new PermissionResult("DENY", 2);
    public static final PermissionResult DENY_N22101 = new PermissionResult("DENY_N22101", 3, "N22101");
    public static final PermissionResult DENY_N22102 = new PermissionResult("DENY_N22102", 4, "N22102");
    public static final PermissionResult DENY_N22103 = new PermissionResult("DENY_N22103", 5, "N22103");
    public static final PermissionResult DENY_N22104 = new PermissionResult("DENY_N22104", 6, "N22104");
    public static final PermissionResult DENY_N22105 = new PermissionResult("DENY_N22105", 7, "N22105");
    public static final PermissionResult DENY_N22106 = new PermissionResult("DENY_N22106", 8, "N22106");
    public static final PermissionResult DENY_N22107 = new PermissionResult("DENY_N22107", 9, "N22107");
    public static final PermissionResult DENY_N22108 = new PermissionResult("DENY_N22108", 10, "N22108");
    public static final PermissionResult DENY_N22109 = new PermissionResult("DENY_N22109", 11, "N22109");
    public static final PermissionResult DENY_N22110 = new PermissionResult("DENY_N22110", 12, "N22110");
    public static final PermissionResult DENY_N22111 = new PermissionResult("DENY_N22111", 13, "N22111");
    public static final PermissionResult DENY_N22201 = new PermissionResult("DENY_N22201", 14, "N22201");
    public static final PermissionResult DENY_N22202 = new PermissionResult("DENY_N22202", 15, "N22202");
    public static final PermissionResult DENY_N22203 = new PermissionResult("DENY_N22203", 16, "N22203");
    public static final PermissionResult DENY_N22204 = new PermissionResult("DENY_N22204", 17, "N22204");
    public static final PermissionResult DENY_N22205 = new PermissionResult("DENY_N22205", 18, "N22205");
    public static final PermissionResult DENY_N22206 = new PermissionResult("DENY_N22206", 19, "N22206");
    public static final PermissionResult DENY_N22207 = new PermissionResult("DENY_N22207", 20, "N22207");
    public static final PermissionResult DENY_N22208 = new PermissionResult("DENY_N22208", 21, "N22208");
    private static final /* synthetic */ PermissionResult[] $VALUES = $values();

    private static final /* synthetic */ PermissionResult[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PermissionResult[]) ipChange.ipc$dispatch("f6d731dd", new Object[0]) : new PermissionResult[]{IGNORE, ALLOW, DENY, DENY_N22101, DENY_N22102, DENY_N22103, DENY_N22104, DENY_N22105, DENY_N22106, DENY_N22107, DENY_N22108, DENY_N22109, DENY_N22110, DENY_N22111, DENY_N22201, DENY_N22202, DENY_N22203, DENY_N22204, DENY_N22205, DENY_N22206, DENY_N22207, DENY_N22208};
    }

    private PermissionResult(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(PermissionResult permissionResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/check/PermissionResult");
    }

    public static PermissionResult valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("194bfa88", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(PermissionResult.class, str);
        }
        return (PermissionResult) valueOf;
    }

    public static PermissionResult[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("75f03b9", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (PermissionResult[]) clone;
    }

    public final String getSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this});
        }
        return this.signature;
    }

    public final boolean hasSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b74e28c9", new Object[]{this})).booleanValue();
        }
        return this.hasSignature;
    }

    public final boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        if (IGNORE == this || ALLOW == this) {
            return true;
        }
        return false;
    }

    private PermissionResult(String str, int i, String str2) {
        this.signature = str2;
        this.hasSignature = true;
    }
}
