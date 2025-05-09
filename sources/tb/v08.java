package tb;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class v08 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<DecimalFormat>[] f29711a;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f29711a = threadLocalArr;
    }

    public static final DecimalFormat a(int i) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final String b(double d, int i) {
        DecimalFormat decimalFormat;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f29711a;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormat2 = threadLocal.get();
            if (decimalFormat2 == null) {
                decimalFormat2 = a(i);
                threadLocal.set(decimalFormat2);
            }
            decimalFormat = decimalFormat2;
        } else {
            decimalFormat = a(i);
        }
        String format = decimalFormat.format(d);
        ckf.f(format, "format(...)");
        return format;
    }
}
