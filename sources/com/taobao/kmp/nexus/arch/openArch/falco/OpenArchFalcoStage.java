package com.taobao.kmp.nexus.arch.openArch.falco;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/falco/OpenArchFalcoStage;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "OpenArchFalcoStageDetail", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchFalcoStage extends Enum<OpenArchFalcoStage> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchFalcoStage[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final OpenArchFalcoStage OpenArchFalcoStageDetail = new OpenArchFalcoStage("OpenArchFalcoStageDetail", 0, "OpenArchFalcoStageDetail");
    private final String rawValue;

    private static final /* synthetic */ OpenArchFalcoStage[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchFalcoStage[]) ipChange.ipc$dispatch("209bd268", new Object[0]) : new OpenArchFalcoStage[]{OpenArchFalcoStageDetail};
    }

    static {
        OpenArchFalcoStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchFalcoStage(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<OpenArchFalcoStage> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchFalcoStage openArchFalcoStage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/falco/OpenArchFalcoStage");
    }

    public static OpenArchFalcoStage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchFalcoStage) ipChange.ipc$dispatch("d4dfc5dd", new Object[]{str});
        }
        return (OpenArchFalcoStage) Enum.valueOf(OpenArchFalcoStage.class, str);
    }

    public static OpenArchFalcoStage[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchFalcoStage[]) ipChange.ipc$dispatch("ce1a630c", new Object[0]);
        }
        return (OpenArchFalcoStage[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
