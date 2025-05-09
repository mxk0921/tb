package com.taobao.nanocompose.megability.annotation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/nanocompose/megability/annotation/AnnotationThreadMode;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "ANY", "WORKER", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class AnnotationThreadMode extends Enum<AnnotationThreadMode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ AnnotationThreadMode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AnnotationThreadMode MAIN = new AnnotationThreadMode("MAIN", 0);
    public static final AnnotationThreadMode ANY = new AnnotationThreadMode("ANY", 1);
    public static final AnnotationThreadMode WORKER = new AnnotationThreadMode("WORKER", 2);

    private static final /* synthetic */ AnnotationThreadMode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnnotationThreadMode[]) ipChange.ipc$dispatch("b7fd4ce9", new Object[0]) : new AnnotationThreadMode[]{MAIN, ANY, WORKER};
    }

    static {
        AnnotationThreadMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AnnotationThreadMode(String str, int i) {
    }

    public static fg8<AnnotationThreadMode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(AnnotationThreadMode annotationThreadMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/annotation/AnnotationThreadMode");
    }

    public static AnnotationThreadMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnnotationThreadMode) ipChange.ipc$dispatch("a578149e", new Object[]{str});
        }
        return (AnnotationThreadMode) Enum.valueOf(AnnotationThreadMode.class, str);
    }

    public static AnnotationThreadMode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnnotationThreadMode[]) ipChange.ipc$dispatch("33cdd28d", new Object[0]);
        }
        return (AnnotationThreadMode[]) $VALUES.clone();
    }
}
