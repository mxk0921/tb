package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ple {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217665);
    }

    public static byte[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5f41a59e", new Object[]{bitmap});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap b(Drawable drawable) {
        Bitmap.Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b4f077ac", new Object[]{drawable});
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static BitmapHolder c(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapHolder) ipChange.ipc$dispatch("2fe515d1", new Object[]{str, num});
        }
        try {
            Bitmap a2 = zxh.a(num.intValue(), str);
            if (a2 != null) {
                return new BitmapHolder(a2);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static synchronized Bitmap d(String str) {
        synchronized (ple.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("7721252c", new Object[]{str});
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                if (!file.exists()) {
                    return null;
                }
                return BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
