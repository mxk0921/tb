package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSUTStatus;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "UT_H5_IN_WebView", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSUTStatus extends Enum<KSUTStatus> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSUTStatus[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final KSUTStatus UT_H5_IN_WebView = new KSUTStatus("UT_H5_IN_WebView", 0, "UT_H5_IN_WebView");
    private final String rawValue;

    private static final /* synthetic */ KSUTStatus[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSUTStatus[]) ipChange.ipc$dispatch("8e52a40f", new Object[0]) : new KSUTStatus[]{UT_H5_IN_WebView};
    }

    static {
        KSUTStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSUTStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSUTStatus> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSUTStatus kSUTStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSUTStatus");
    }

    public static KSUTStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSUTStatus) ipChange.ipc$dispatch("497575c4", new Object[]{str});
        }
        return (KSUTStatus) Enum.valueOf(KSUTStatus.class, str);
    }

    public static KSUTStatus[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSUTStatus[]) ipChange.ipc$dispatch("b58af1b3", new Object[0]);
        }
        return (KSUTStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
