package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.nbf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSStdPopAnimationMode;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "fadeInOut", nbf.STDPOP_ANIMATION_BOTTOM, "topInOut", "leftInOut", "rightInOut", nbf.STDPOP_ANIMATION_NON, "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSStdPopAnimationMode extends Enum<KSStdPopAnimationMode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSStdPopAnimationMode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSStdPopAnimationMode fadeInOut = new KSStdPopAnimationMode("fadeInOut", 0, "fadeInOut");
    public static final KSStdPopAnimationMode bottomInOut = new KSStdPopAnimationMode(nbf.STDPOP_ANIMATION_BOTTOM, 1, nbf.STDPOP_ANIMATION_BOTTOM);
    public static final KSStdPopAnimationMode topInOut = new KSStdPopAnimationMode("topInOut", 2, "topInOut");
    public static final KSStdPopAnimationMode leftInOut = new KSStdPopAnimationMode("leftInOut", 3, "leftInOut");
    public static final KSStdPopAnimationMode rightInOut = new KSStdPopAnimationMode("rightInOut", 4, "rightInOut");
    public static final KSStdPopAnimationMode noneInOut = new KSStdPopAnimationMode(nbf.STDPOP_ANIMATION_NON, 5, nbf.STDPOP_ANIMATION_NON);

    private static final /* synthetic */ KSStdPopAnimationMode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSStdPopAnimationMode[]) ipChange.ipc$dispatch("be047c7d", new Object[0]) : new KSStdPopAnimationMode[]{fadeInOut, bottomInOut, topInOut, leftInOut, rightInOut, noneInOut};
    }

    static {
        KSStdPopAnimationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSStdPopAnimationMode(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSStdPopAnimationMode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSStdPopAnimationMode kSStdPopAnimationMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSStdPopAnimationMode");
    }

    public static KSStdPopAnimationMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSStdPopAnimationMode) ipChange.ipc$dispatch("923ef7a8", new Object[]{str});
        }
        return (KSStdPopAnimationMode) Enum.valueOf(KSStdPopAnimationMode.class, str);
    }

    public static KSStdPopAnimationMode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSStdPopAnimationMode[]) ipChange.ipc$dispatch("c0580059", new Object[0]);
        }
        return (KSStdPopAnimationMode[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
