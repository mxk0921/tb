package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSStdPopBackgroundMode;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "color", Constants.Event.BLUR, "normal", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSStdPopBackgroundMode extends Enum<KSStdPopBackgroundMode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSStdPopBackgroundMode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSStdPopBackgroundMode color = new KSStdPopBackgroundMode("color", 0, "color");
    public static final KSStdPopBackgroundMode blur = new KSStdPopBackgroundMode(Constants.Event.BLUR, 1, Constants.Event.BLUR);
    public static final KSStdPopBackgroundMode normal = new KSStdPopBackgroundMode("normal", 2, "normal");

    private static final /* synthetic */ KSStdPopBackgroundMode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSStdPopBackgroundMode[]) ipChange.ipc$dispatch("e0be1ce1", new Object[0]) : new KSStdPopBackgroundMode[]{color, blur, normal};
    }

    static {
        KSStdPopBackgroundMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSStdPopBackgroundMode(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSStdPopBackgroundMode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSStdPopBackgroundMode kSStdPopBackgroundMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSStdPopBackgroundMode");
    }

    public static KSStdPopBackgroundMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSStdPopBackgroundMode) ipChange.ipc$dispatch("93d30716", new Object[]{str});
        }
        return (KSStdPopBackgroundMode) Enum.valueOf(KSStdPopBackgroundMode.class, str);
    }

    public static KSStdPopBackgroundMode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSStdPopBackgroundMode[]) ipChange.ipc$dispatch("28db1485", new Object[0]);
        }
        return (KSStdPopBackgroundMode[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
