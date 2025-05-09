package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ad2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cd2 implements ad2.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final cd2 f16988a = new cd2();

    static {
        t2o.a(620757010);
        t2o.a(620757009);
    }

    public static cd2 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cd2) ipChange.ipc$dispatch("d35fc594", new Object[0]);
        }
        return f16988a;
    }

    @Override // tb.ad2.a
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d5404837", new Object[]{this, new Integer(i), new Integer(i2), config});
        }
        if (p0m.m()) {
            bitmap = qc1.a().c(i, i2, config);
        } else {
            xc2 a2 = s0m.B().c().a();
            if (a2 != null) {
                bitmap = a2.g(i, i2, config);
            } else {
                bitmap = null;
            }
        }
        if (bitmap == null) {
            return Bitmap.createBitmap(i, i2, config);
        }
        return bitmap;
    }
}
