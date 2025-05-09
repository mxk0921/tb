package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.dinamicX.view.barcode.BarcodeFormat;
import com.taobao.android.order.core.dinamicX.view.barcode.EncodeHintType;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class xwk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465725);
        t2o.a(614465726);
        Pattern.compile("[0-9]+");
    }

    public static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b3219d2", new Object[]{zArr, new Integer(i), iArr, new Boolean(z)})).intValue();
        }
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static qb2 f(boolean[] zArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qb2) ipChange.ipc$dispatch("2cda4c5c", new Object[]{zArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        if (max % i4 != 0) {
            max = i5 * i4;
        }
        int i6 = (max - (length * i5)) / 2;
        qb2 qb2Var = new qb2(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                qb2Var.f(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return qb2Var;
    }

    public qb2 b(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qb2) ipChange.ipc$dispatch("64fb45a5", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            Collection<BarcodeFormat> e = e();
            if (e == null || e.contains(barcodeFormat)) {
                int d = d();
                if (map != null) {
                    EncodeHintType encodeHintType = EncodeHintType.MARGIN;
                    if (map.containsKey(encodeHintType)) {
                        d = Integer.parseInt(map.get(encodeHintType).toString());
                    }
                }
                return f(c(str), i, i2, d);
            }
            throw new IllegalArgumentException("Can only encode " + e + ", but got " + barcodeFormat);
        }
    }

    public abstract boolean[] c(String str);

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db439f93", new Object[]{this})).intValue();
        }
        return 10;
    }

    public abstract Collection<BarcodeFormat> e();
}
