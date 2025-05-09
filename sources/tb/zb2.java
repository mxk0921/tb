package tb;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class zb2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946256);
        new LruCache(10);
    }

    public static byte[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8271217", new Object[]{bitmap});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = null;
        try {
            if (bitmap != null) {
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (OutOfMemoryError e) {
                        e.printStackTrace();
                        byteArrayOutputStream.close();
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    throw th;
                }
            } else {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return bArr;
    }
}
