package com.taobao.kmp.remoteinterops.defined;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/remoteinterops/defined/RemoteInteropErrorCode;", "", "code", "", "<init>", "(Ljava/lang/String;IJ)V", "getCode", "()J", "LoaderRemoteModuleError", "LoaderLocalClzError", "LoaderRemoteClzError", "InstantiateObjError", "remote-interops_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteInteropErrorCode extends Enum<RemoteInteropErrorCode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ RemoteInteropErrorCode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long code;
    public static final RemoteInteropErrorCode LoaderRemoteModuleError = new RemoteInteropErrorCode("LoaderRemoteModuleError", 0, -10001);
    public static final RemoteInteropErrorCode LoaderLocalClzError = new RemoteInteropErrorCode("LoaderLocalClzError", 1, -20001);
    public static final RemoteInteropErrorCode LoaderRemoteClzError = new RemoteInteropErrorCode("LoaderRemoteClzError", 2, -20002);
    public static final RemoteInteropErrorCode InstantiateObjError = new RemoteInteropErrorCode("InstantiateObjError", 3, -20003);

    private static final /* synthetic */ RemoteInteropErrorCode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteInteropErrorCode[]) ipChange.ipc$dispatch("77c218fe", new Object[0]) : new RemoteInteropErrorCode[]{LoaderRemoteModuleError, LoaderLocalClzError, LoaderRemoteClzError, InstantiateObjError};
    }

    static {
        RemoteInteropErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RemoteInteropErrorCode(String str, int i, long j) {
        this.code = j;
    }

    public static fg8<RemoteInteropErrorCode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(RemoteInteropErrorCode remoteInteropErrorCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/remoteinterops/defined/RemoteInteropErrorCode");
    }

    public static RemoteInteropErrorCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropErrorCode) ipChange.ipc$dispatch("4bfc9429", new Object[]{str});
        }
        return (RemoteInteropErrorCode) Enum.valueOf(RemoteInteropErrorCode.class, str);
    }

    public static RemoteInteropErrorCode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropErrorCode[]) ipChange.ipc$dispatch("7a159cda", new Object[0]);
        }
        return (RemoteInteropErrorCode[]) $VALUES.clone();
    }

    public final long getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15e", new Object[]{this})).longValue();
        }
        return this.code;
    }
}
