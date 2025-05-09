package tb;

import android.graphics.Bitmap;
import com.alipay.ma.encode.InputParameters.Gen0InputParameters;
import com.alipay.ma.encode.api.MaEncodeAPI;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.dinamicX.view.barcode.BarcodeFormat;
import com.taobao.android.order.core.dinamicX.view.barcode.EncodeHintType;
import com.taobao.android.order.core.dinamicX.view.barcode.WriterException;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465723);
    }

    public static Bitmap a(String str, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7ff8fa73", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(EncodeHintType.MARGIN, 0);
            qb2 a2 = new a9j().a(str, BarcodeFormat.CODE_128, i, i2, hashMap);
            int e = a2.e();
            int d = a2.d();
            int[] iArr = new int[e * d];
            for (int i4 = 0; i4 < d; i4++) {
                int i5 = i4 * e;
                for (int i6 = 0; i6 < e; i6++) {
                    int i7 = i5 + i6;
                    if (a2.c(i6, i4)) {
                        i3 = -16777216;
                    } else {
                        i3 = -1;
                    }
                    iArr[i7] = i3;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(e, d, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, e, 0, 0, e, d);
            return createBitmap;
        } catch (WriterException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalArgumentException e3) {
            ldv.e(null, "MaEncode", e3.toString(), null);
            return null;
        }
    }

    public static Bitmap b(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1cb3239", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        try {
            Gen0InputParameters gen0InputParameters = new Gen0InputParameters(i, str);
            gen0InputParameters.errorCorrectionLevel = 'H';
            return MaEncodeAPI.encodeMa2(gen0InputParameters);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
