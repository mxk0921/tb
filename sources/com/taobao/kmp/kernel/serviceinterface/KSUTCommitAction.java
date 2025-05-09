package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSUTCommitAction;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "click", "componentExposure", "pageExposure", "custom", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSUTCommitAction extends Enum<KSUTCommitAction> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSUTCommitAction[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSUTCommitAction click = new KSUTCommitAction("click", 0, "click");
    public static final KSUTCommitAction componentExposure = new KSUTCommitAction("componentExposure", 1, "componentExposure");
    public static final KSUTCommitAction pageExposure = new KSUTCommitAction("pageExposure", 2, "pageExposure");
    public static final KSUTCommitAction custom = new KSUTCommitAction("custom", 3, "custom");

    private static final /* synthetic */ KSUTCommitAction[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSUTCommitAction[]) ipChange.ipc$dispatch("3fe7f494", new Object[0]) : new KSUTCommitAction[]{click, componentExposure, pageExposure, custom};
    }

    static {
        KSUTCommitAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSUTCommitAction(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSUTCommitAction> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSUTCommitAction kSUTCommitAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSUTCommitAction");
    }

    public static KSUTCommitAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSUTCommitAction) ipChange.ipc$dispatch("f6b1ea89", new Object[]{str});
        }
        return (KSUTCommitAction) Enum.valueOf(KSUTCommitAction.class, str);
    }

    public static KSUTCommitAction[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSUTCommitAction[]) ipChange.ipc$dispatch("40707738", new Object[0]);
        }
        return (KSUTCommitAction[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
