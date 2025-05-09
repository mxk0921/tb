package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.nbf;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/StdPopAnimationMode;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "fadeInOut", nbf.STDPOP_ANIMATION_BOTTOM, "topInOut", "leftInOut", "rightInOut", nbf.STDPOP_ANIMATION_NON, "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class StdPopAnimationMode extends Enum<StdPopAnimationMode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ StdPopAnimationMode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final StdPopAnimationMode fadeInOut = new StdPopAnimationMode("fadeInOut", 0, "fadeInOut");
    public static final StdPopAnimationMode bottomInOut = new StdPopAnimationMode(nbf.STDPOP_ANIMATION_BOTTOM, 1, nbf.STDPOP_ANIMATION_BOTTOM);
    public static final StdPopAnimationMode topInOut = new StdPopAnimationMode("topInOut", 2, "topInOut");
    public static final StdPopAnimationMode leftInOut = new StdPopAnimationMode("leftInOut", 3, "leftInOut");
    public static final StdPopAnimationMode rightInOut = new StdPopAnimationMode("rightInOut", 4, "rightInOut");
    public static final StdPopAnimationMode noneInOut = new StdPopAnimationMode(nbf.STDPOP_ANIMATION_NON, 5, nbf.STDPOP_ANIMATION_NON);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361924);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ StdPopAnimationMode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StdPopAnimationMode[]) ipChange.ipc$dispatch("70106f11", new Object[0]) : new StdPopAnimationMode[]{fadeInOut, bottomInOut, topInOut, leftInOut, rightInOut, noneInOut};
    }

    static {
        StdPopAnimationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private StdPopAnimationMode(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<StdPopAnimationMode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(StdPopAnimationMode stdPopAnimationMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/StdPopAnimationMode");
    }

    public static StdPopAnimationMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopAnimationMode) ipChange.ipc$dispatch("23255946", new Object[]{str});
        }
        return (StdPopAnimationMode) Enum.valueOf(StdPopAnimationMode.class, str);
    }

    public static StdPopAnimationMode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopAnimationMode[]) ipChange.ipc$dispatch("b82d66b5", new Object[0]);
        }
        return (StdPopAnimationMode[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
