package com.taobao.kmp.remoteinterops.defined;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/kmp/remoteinterops/defined/RemoteInteropErrorDomain;", "", "domain", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "ModuleLoadError", "PerformInvokeError", "remote-interops_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteInteropErrorDomain extends Enum<RemoteInteropErrorDomain> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ RemoteInteropErrorDomain[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RemoteInteropErrorDomain ModuleLoadError = new RemoteInteropErrorDomain("ModuleLoadError", 0, "Remote Module Load Error");
    public static final RemoteInteropErrorDomain PerformInvokeError = new RemoteInteropErrorDomain("PerformInvokeError", 1, "Perform Remote Invoke Error");
    private final String domain;

    private static final /* synthetic */ RemoteInteropErrorDomain[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteInteropErrorDomain[]) ipChange.ipc$dispatch("c503c907", new Object[0]) : new RemoteInteropErrorDomain[]{ModuleLoadError, PerformInvokeError};
    }

    static {
        RemoteInteropErrorDomain[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RemoteInteropErrorDomain(String str, int i, String str2) {
        this.domain = str2;
    }

    public static fg8<RemoteInteropErrorDomain> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(RemoteInteropErrorDomain remoteInteropErrorDomain, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/remoteinterops/defined/RemoteInteropErrorDomain");
    }

    public static RemoteInteropErrorDomain valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropErrorDomain) ipChange.ipc$dispatch("748c2572", new Object[]{str});
        }
        return (RemoteInteropErrorDomain) Enum.valueOf(RemoteInteropErrorDomain.class, str);
    }

    public static RemoteInteropErrorDomain[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropErrorDomain[]) ipChange.ipc$dispatch("8085c5e3", new Object[0]);
        }
        return (RemoteInteropErrorDomain[]) $VALUES.clone();
    }

    public final String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.domain;
    }
}
