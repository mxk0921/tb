package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.UCClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f2701a = "g";
    public static String b;
    public static String c;

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (!Environment.getExternalStorageState().equals("mounted") || context.getExternalCacheDir() == null) {
            b = context.getFilesDir().getAbsolutePath() + File.separator + "verify";
        } else {
            b = context.getExternalCacheDir().getAbsolutePath() + File.separator + "verify";
        }
        return b;
    }

    public static String a(String str, Context context) {
        InputStream inputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7da5f8a", new Object[]{str, context});
        }
        String str2 = a(str) + str.substring(str.lastIndexOf("."));
        String a2 = a(context);
        File file = new File(a2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(a2, str2);
        if (file2.exists()) {
            return file2.getPath();
        }
        FileOutputStream fileOutputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            if (httpURLConnection.getResponseCode() != 200) {
                return "";
            }
            inputStream = httpURLConnection.getInputStream();
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                    String path = file2.getPath();
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                    return path;
                } catch (Exception unused3) {
                    fileOutputStream = fileOutputStream2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (fileOutputStream == null) {
                        return "";
                    }
                    try {
                        fileOutputStream.close();
                        return "";
                    } catch (IOException unused5) {
                        return "";
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused8) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused9) {
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9952961c", new Object[]{bitmap, new Integer(i)});
        }
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth(), bitmap.getHeight());
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap == createBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String a(byte[] bArr, Context context) {
        FileOutputStream fileOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17776e47", new Object[]{bArr, context});
        }
        String valueOf = String.valueOf((int) (((Math.random() * 9.0d) + 1.0d) * 1.0E7d));
        String b2 = b(context);
        File file = new File(b2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(b2, valueOf);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (IOException unused) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
            String path = file2.getPath();
            try {
                fileOutputStream.close();
            } catch (IOException unused2) {
            }
            return path;
        } catch (IOException unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!Environment.getExternalStorageState().equals("mounted") || context.getExternalCacheDir() == null) {
            c = context.getFilesDir().getAbsolutePath() + File.separator + UCClient.UI_PARAMS_KEY_GESTURE;
        } else {
            c = context.getExternalCacheDir().getAbsolutePath() + File.separator + UCClient.UI_PARAMS_KEY_GESTURE;
        }
        return c;
    }

    public static byte[] a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("805d4780", new Object[]{bitmap, new Integer(i)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length / 1024 > i && i2 >= 0) {
            byteArrayOutputStream.reset();
            i2 -= 10;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5eec20f0", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (str != null && new File(str).exists()) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                options.inSampleSize = a(options, i, i2);
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                return BitmapFactory.decodeStream(new FileInputStream(str), null, options);
            } catch (Exception e) {
                a.a(f2701a, e);
            }
        }
        return null;
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860e8a99", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (i6 / i3 > i2 && i7 / i3 > i) {
                i3 *= 2;
            }
        }
        return i3;
    }
}
