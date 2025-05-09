package tb;

import kotlin.time.DurationUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class x08 {
    public static final double a(double d, DurationUnit durationUnit, DurationUnit durationUnit2) {
        ckf.g(durationUnit, "sourceUnit");
        ckf.g(durationUnit2, "targetUnit");
        long convert = durationUnit2.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit.getTimeUnit$kotlin_stdlib());
        if (convert > 0) {
            return d * convert;
        }
        return d / durationUnit.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit2.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        ckf.g(durationUnit, "sourceUnit");
        ckf.g(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long c(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        ckf.g(durationUnit, "sourceUnit");
        ckf.g(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }
}
