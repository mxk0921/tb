package com.meizu.cloud.pushsdk.e.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.NetworkOnMainThreadException;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.e.b.c;
import com.meizu.cloud.pushsdk.e.c.a;
import com.meizu.cloud.pushsdk.e.d.k;
import com.meizu.cloud.pushsdk.e.h.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static int a(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = i4 / i3;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = i2;
                return ((double) i) * d < d2 ? (int) (d2 / d) : i;
            }
            double d3 = i2;
            return ((double) i) * d > d3 ? (int) (d3 / d) : i;
        }
    }

    public static a b(a aVar) {
        aVar.a(0);
        aVar.b("parseError");
        aVar.a(aVar.getMessage());
        return aVar;
    }

    public static c<Bitmap> a(k kVar, int i, int i2, Bitmap.Config config, ImageView.ScaleType scaleType) {
        Bitmap bitmap;
        byte[] bArr = new byte[0];
        try {
            bArr = g.a(kVar.a().f()).b();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int a2 = a(i, i2, i3, i4, scaleType);
            int a3 = a(i2, i, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i3, i4, a2, a3);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (a(decodeByteArray, a2, a3)) {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, a2, a3, true);
                decodeByteArray.recycle();
            } else {
                bitmap = decodeByteArray;
            }
        }
        return bitmap == null ? c.a(b(new a(kVar))) : c.a(bitmap);
    }

    public static a a(a aVar) {
        aVar.b("connectionError");
        aVar.a(0);
        aVar.a(aVar.getMessage());
        return aVar;
    }

    public static a a(a aVar, com.meizu.cloud.pushsdk.e.b.b bVar, int i) {
        a a2 = bVar.a(aVar);
        a2.a(i);
        a2.b("responseFromServerError");
        return a2;
    }

    public static a a(Exception exc) {
        a aVar = new a(exc);
        aVar.b(exc instanceof NetworkOnMainThreadException ? "networkOnMainThreadError" : "connectionError");
        aVar.a(0);
        return aVar;
    }

    public static String a(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        return contentTypeFor == null ? UploadConstants.FILE_CONTENT_TYPE : contentTypeFor;
    }

    public static void a(k kVar, String str, String str2) throws IOException {
        Throwable th;
        InputStream inputStream;
        byte[] bArr = new byte[2048];
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = kVar.a().e();
            try {
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str2));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                fileOutputStream2.flush();
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    private static boolean a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return false;
        }
        return bitmap.getWidth() > i || bitmap.getHeight() > i2;
    }
}
