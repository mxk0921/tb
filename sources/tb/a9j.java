package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.dinamicX.view.barcode.BarcodeFormat;
import com.taobao.android.order.core.dinamicX.view.barcode.Code128Writer;
import com.taobao.android.order.core.dinamicX.view.barcode.EncodeHintType;
import com.taobao.android.order.core.dinamicX.view.barcode.WriterException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class a9j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465724);
        t2o.a(614465726);
    }

    public qb2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qb2) ipChange.ipc$dispatch("64fb45a5", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return new Code128Writer().b(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("No encoder available for format " + barcodeFormat);
    }
}
