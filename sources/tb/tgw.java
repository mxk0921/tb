package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tgw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ASPECT_MODE_16_9 = 3;
    public static final int ASPECT_MODE_1_1 = 1;
    public static final int ASPECT_MODE_3_4 = 2;
    public static final int ASPECT_MODE_4_3 = 8;
    public static final int ASPECT_MODE_9_16 = 0;

    static {
        t2o.a(793772109);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c0a4b01", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("611edc6b", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        double d = i / i2;
        if (d < 0.65625d) {
            return 0;
        }
        if (d < 0.875d) {
            return 2;
        }
        if (d < 1.167d) {
            return 1;
        }
        if (d < 1.55d) {
            return 8;
        }
        return 3;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static GradientDrawable e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("f4333585", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i2, i3);
        return gradientDrawable;
    }

    public static boolean f(Bitmap bitmap, String str) throws IOException {
        Throwable th;
        FileNotFoundException e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8df6c72", new Object[]{bitmap, str})).booleanValue();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return true;
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }
}
