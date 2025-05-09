package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.provider.MediaStore;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ed2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f18492a;

    static {
        t2o.a(511705596);
        Paint paint = new Paint();
        f18492a = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
    }

    public static byte[] a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b56549a0", new Object[]{bitmap});
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        byte[] bArr = new byte[(array.length / 4) * 3];
        int length = array.length / 4;
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            int i3 = i * 4;
            bArr[i2] = array[i3];
            bArr[i2 + 1] = array[i3 + 1];
            bArr[i2 + 2] = array[i3 + 2];
        }
        return bArr;
    }

    public static int b(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b37ce", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            while (true) {
                if (i4 / i3 <= i2 && i5 / i3 <= i) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    public static void c(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String d(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fda0ed1", new Object[]{activity, str, new Integer(i)});
        }
        String e = i8g.e(activity);
        if (activity == null || TextUtils.isEmpty(e)) {
            return "";
        }
        String file = new File(e).getAbsoluteFile().toString();
        Size k = k(str);
        if (r(e(str, i(k.getWidth(), k.getHeight(), i)), file, 90)) {
            return file;
        }
        return str;
    }

    public static Bitmap e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("28b50113", new Object[]{str, new Integer(i)});
        }
        return f(str, i, true);
    }

    public static Bitmap f(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6bc45a1d", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        Pair<Bitmap, String> g = g(str, i, z);
        if (g != null) {
            return (Bitmap) g.first;
        }
        return null;
    }

    public static Pair<Bitmap, String> h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d5d97b06", new Object[]{str, new Integer(i)});
        }
        return g(str, i, true);
    }

    public static int i(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c7e010", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int max = Math.max(i, i2);
        int i4 = i * i2;
        if (i4 > i3) {
            return (int) (max * Math.sqrt(i3 / i4));
        }
        return max;
    }

    public static int j(float f) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcd1124", new Object[]{new Float(f)})).intValue();
        }
        int round = Math.round(f);
        if (round <= 1) {
            return round;
        }
        while (round >= Math.pow(2.0d, i)) {
            i++;
        }
        return (int) Math.pow(2.0d, i - 1);
    }

    public static Size k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("d2dfd597", new Object[]{str});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Size(options.outWidth, options.outHeight);
    }

    public static Bitmap l(boolean z, long j, int i, boolean z2) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("34fa3bb3", new Object[]{new Boolean(z), new Long(j), new Integer(i), new Boolean(z2)});
        }
        if (j <= 0) {
            return null;
        }
        try {
            if (z) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 1, null);
                if (bitmap == null) {
                    bitmap = MediaStore.Video.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 2, null);
                }
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 1, null);
                if (bitmap == null) {
                    bitmap = MediaStore.Images.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 2, null);
                }
            }
            if (!(bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0)) {
                if (!z2) {
                    return bitmap;
                }
                int min = Math.min(i, bitmap.getWidth());
                return Bitmap.createScaledBitmap(bitmap, min, (bitmap.getHeight() * min) / bitmap.getWidth(), false);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            odg.c("MediaUtils", "getThumbnail Fail:" + e.getMessage());
            return null;
        }
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba92e74a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(decodeFile, 0.0f, 0.0f, f18492a);
        String e = i8g.e(Globals.getApplication());
        if (r(createBitmap, e, 90)) {
            return e;
        }
        return null;
    }

    public static void n(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1308731", new Object[]{bitmap});
        } else if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static Bitmap o(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ddbfca24", new Object[]{bitmap, new Integer(i)});
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap p(Context context, Bitmap bitmap, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b194cacb", new Object[]{context, bitmap, new Integer(i), new Float(f)});
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f), Math.round(bitmap.getHeight() * f), false);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.setRadius(i);
        create2.forEach(createTyped);
        createTyped.copyTo(createScaledBitmap);
        create.destroy();
        return createScaledBitmap;
    }

    public static boolean q(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc40b09", new Object[]{bitmap, str})).booleanValue();
        }
        return r(bitmap, str, 100);
    }

    public static boolean r(Bitmap bitmap, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8bdc8a2", new Object[]{bitmap, str, new Integer(i)})).booleanValue();
        }
        return s(bitmap, str, i, false);
    }

    public static boolean s(Bitmap bitmap, String str, int i, boolean z) {
        Bitmap.CompressFormat compressFormat;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5efbfdfa", new Object[]{bitmap, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (bitmap == null) {
            return false;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (z) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            bitmap.compress(compressFormat, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile2.write(byteArray);
                    c(byteArrayOutputStream);
                    c(randomAccessFile2);
                    return true;
                } catch (Exception unused) {
                    randomAccessFile = randomAccessFile2;
                    c(byteArrayOutputStream);
                    c(randomAccessFile);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    c(byteArrayOutputStream);
                    c(randomAccessFile);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e) {
            odg.c(gd2.TAG, "saveBitmap. Exception:" + Log.getStackTraceString(e));
            return false;
        }
    }

    public static Pair<Bitmap, String> g(String str, int i, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("2951b475", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        if (i <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        int r = cg9.r(str);
        if (z) {
            float f2 = i;
            f = Math.max((i2 * 1.0f) / f2, (i3 * 1.0f) / f2);
        } else {
            float f3 = i;
            f = Math.min((i2 * 1.0f) / f3, (i3 * 1.0f) / f3);
        }
        int j = j(Math.max(1.0f, f));
        odg.d(gd2.TAG, "decodeBitmap. picInfo(path:" + str + ", width:" + i2 + ", height:" + i3 + ", rotate:" + r + ", sampleSize:" + j + f7l.BRACKET_END_STR);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options2.inSampleSize = j;
            options2.inMutable = true;
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options2);
            c(fileInputStream);
            if (decodeStream == null) {
                odg.c(gd2.TAG, "decodeBitmap. decode error.");
                return null;
            }
            int height = decodeStream.getHeight();
            int width = decodeStream.getWidth();
            if (r != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(r);
                decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, width, height, matrix, true);
            }
            odg.d(gd2.TAG, "decodeBitmap. decodeInfo(path:" + str + ", width:" + width + ", height:" + height + ", decodeCost:" + (System.currentTimeMillis() - currentTimeMillis) + "ms)");
            return new Pair<>(decodeStream, str2);
        } catch (FileNotFoundException unused) {
            odg.c(gd2.TAG, "decodeBitmap. file not found. path : picPath");
            return null;
        }
    }
}
