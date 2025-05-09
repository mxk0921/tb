package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.common.NdkCore;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qc1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final qc1 f26665a = new qc1();

        static {
            t2o.a(618659858);
        }

        public static /* synthetic */ qc1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qc1) ipChange.ipc$dispatch("9d6b4347", new Object[0]);
            }
            return f26665a;
        }
    }

    static {
        t2o.a(618659857);
        t2o.a(618659862);
    }

    public static qc1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qc1) ipChange.ipc$dispatch("d9d5c42", new Object[0]);
        }
        return a.a();
    }

    public Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ae725210", new Object[]{this, new Integer(i), new Integer(i2), config});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = config;
        y2r.d(options, true);
        ow6 f = ow6.f();
        int i3 = pc8.FIXED_JPG_LENGTH;
        byte[] a2 = pc8.a(i, i2, f.g(i3));
        if (a2 != null) {
            bitmap = BitmapFactory.decodeByteArray(a2, 0, i3, options);
            ow6.f().k(a2);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            bitmap.setHasAlpha(true);
        }
        return bitmap;
    }

    public Bitmap c(int i, int i2, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("94fc4461", new Object[]{this, new Integer(i), new Integer(i2), config});
        }
        Bitmap b = b(i, i2, config);
        if (b == null) {
            return b;
        }
        try {
            NdkCore.nativePinBitmap(b);
            b.eraseColor(0);
            return b;
        } catch (Throwable th) {
            xv8.c(p0m.TAG, "AshmemBitmapFactory native pin bitmap error=%s", th);
            return null;
        }
    }
}
