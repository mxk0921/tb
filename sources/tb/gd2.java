package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Size;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.JvmStatic;
import tb.bs6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gd2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final gd2 INSTANCE = new gd2();
    public static final String TAG = "BitmapUtil";

    static {
        t2o.a(481297581);
    }

    @JvmStatic
    public static final Bitmap b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5d1eb950", new Object[]{str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            return uaw.b().d(str);
        }
        return uaw.b().a(str);
    }

    @JvmStatic
    public static final String c(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b79d1b44", new Object[]{bitmap, compressFormat, new Integer(i)});
        }
        byte[] a2 = INSTANCE.a(bitmap, compressFormat, i);
        if (a2 == null) {
            return null;
        }
        return Base64.encodeToString(a2, 2);
    }

    @JvmStatic
    public static final Bitmap e(pei peiVar) {
        MediaMetadataRetriever mediaMetadataRetriever;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("14a5d0e6", new Object[]{peiVar});
        }
        ckf.g(peiVar, q0j.SCENE_MEDIA_PLAYER);
        if (!peiVar.p()) {
            return INSTANCE.f(peiVar);
        }
        try {
            return INSTANCE.f(peiVar);
        } catch (IllegalArgumentException unused) {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(peiVar.g());
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    mediaMetadataRetriever.release();
                    return frameAtTime;
                } catch (Throwable unused2) {
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                    }
                    return null;
                }
            } catch (Throwable unused3) {
                mediaMetadataRetriever = null;
            }
        }
    }

    @JvmStatic
    public static final Bitmap g(Uri uri, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cd3bce7d", new Object[]{uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        Bitmap i4 = i(uri, i, i2, lg4.P1());
        if (i4 == null) {
            return null;
        }
        return p(i4, i3);
    }

    @JvmStatic
    public static final Bitmap h(YuvImage yuvImage, int i, boolean z, Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f92b4bb4", new Object[]{yuvImage, new Integer(i), new Boolean(z), size});
        }
        ckf.g(yuvImage, "yuvImage");
        ckf.g(size, "displaySize");
        bs6.c a2 = bs6.a(yuvImage.getYuvData(), yuvImage.getWidth(), yuvImage.getHeight(), i, z);
        if (a2 != null) {
            return ((bs6.b) a2).b(size.getWidth(), size.getHeight()).a();
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.util.DataProjector.CamDataInput");
    }

    @JvmStatic
    public static final Bitmap i(Uri uri, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ee7c5b17", new Object[]{uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (uri == null) {
            return null;
        }
        if (i3 <= 0) {
            i3 = 10;
        }
        if (!ckf.b("content", uri.getScheme())) {
            String uri2 = uri.toString();
            ckf.f(uri2, "picUri.toString()");
            return j(uri2, i, i2, i3);
        } else if (lg4.D0()) {
            return INSTANCE.l(uri, i, i2, i3);
        } else {
            return k(uri, i, i2, i3);
        }
    }

    @JvmStatic
    public static final Bitmap j(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("95c66d9b", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        ckf.g(str, "absPath");
        if (i3 < 0) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = rhi.d(options, i) * i2;
            options.inJustDecodeBounds = false;
            try {
                return BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
                return j(str, i, i2 * 2, i3 - 1);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @JvmStatic
    public static final Bitmap m(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6bd6d5fd", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (max <= i) {
            return bitmap;
        }
        float f = (i * 1.0f) / max;
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    @JvmStatic
    public static final Bitmap n(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("be7b05a2", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return null;
        }
        int c = hfn.c(bitmap.getWidth(), bitmap.getHeight());
        int f = hfn.f(bitmap.getWidth(), bitmap.getHeight());
        if (c <= i && f <= i2) {
            return bitmap;
        }
        float e = hfn.e((i * 1.0f) / c, (i2 * 1.0f) / f);
        Matrix matrix = new Matrix();
        matrix.setScale(e, e);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    @JvmStatic
    public static final Bitmap o(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("69ca2ae8", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() <= i) {
            return bitmap;
        }
        float width = (i * 1.0f) / bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.setScale(width, width);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    @JvmStatic
    public static final Bitmap p(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a6f75e55", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null || i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 2;
        matrix.setRotate(i, bitmap.getWidth() / f, bitmap.getHeight() / f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (ckf.b(bitmap, createBitmap)) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    @JvmStatic
    public static final Bitmap q(Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("11ac386c", new Object[]{bitmap, new Float(f), new Float(f2)});
        }
        if (bitmap == null) {
            return null;
        }
        try {
            Bitmap r = r(bitmap, f, f2);
            if (!ckf.b(r, bitmap)) {
                bitmap.recycle();
            }
            return r;
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    @JvmStatic
    public static final Bitmap r(Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("46eb2301", new Object[]{bitmap, new Float(f), new Float(f2)});
        }
        ckf.g(bitmap, "source");
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public final byte[] a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4ba97adf", new Object[]{this, bitmap, compressFormat, new Integer(i)});
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bitmap == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException unused) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ckf.d(compressFormat);
            bitmap.compress(compressFormat, i, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
            return byteArray;
        } catch (IOException unused3) {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.flush();
                    byteArrayOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public final Bitmap f(pei peiVar) {
        Bitmap loadThumbnail;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1584dd57", new Object[]{this, peiVar});
        }
        if (Build.VERSION.SDK_INT < 29) {
            return MediaStore.Images.Thumbnails.getThumbnail(caa.c().getContentResolver(), peiVar.e(), 1, null);
        }
        loadThumbnail = caa.c().getContentResolver().loadThumbnail(peiVar.b(), new Size(512, 384), null);
        return loadThumbnail;
    }

    public final Bitmap l(Uri uri, int i, int i2, int i3) {
        ParcelFileDescriptor parcelFileDescriptor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5ec055a7", new Object[]{this, uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (uri == null || i3 < 0) {
            return null;
        }
        try {
            parcelFileDescriptor = caa.c().getContentResolver().openFileDescriptor(uri, "r");
        } catch (FileNotFoundException unused) {
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        File createTempFile = File.createTempFile(ckf.p("plt_img_search_", Long.valueOf(System.currentTimeMillis())), null, caa.c().getExternalCacheDir());
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            parcelFileDescriptor.close();
            String absolutePath = createTempFile.getAbsolutePath();
            ckf.f(absolutePath, "tmpFile.absolutePath");
            return j(absolutePath, i, i2, i3);
        } finally {
            fileInputStream.close();
        }
    }

    @JvmStatic
    public static final Bitmap d(Bitmap bitmap, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ee6192c1", new Object[]{bitmap, rectF});
        }
        if (bitmap == null || rectF == null) {
            return null;
        }
        int width = (int) (bitmap.getWidth() * rectF.left);
        int height = (int) (bitmap.getHeight() * rectF.top);
        int f = hfn.f((int) (bitmap.getWidth() * rectF.right), bitmap.getWidth());
        int f2 = hfn.f((int) (bitmap.getHeight() * rectF.bottom), bitmap.getHeight());
        if (width >= f) {
            width = f - 1;
        }
        int c = hfn.c(width, 0);
        if (height >= f2) {
            height = f2 - 1;
        }
        int c2 = hfn.c(height, 0);
        try {
            return Bitmap.createBitmap(bitmap, c, c2, f - c, f2 - c2);
        } catch (Exception unused) {
            String rectF2 = rectF.toString();
            ckf.f(rectF2, "rectF.toString()");
            my4.b(rectF2);
            return null;
        }
    }

    @JvmStatic
    public static final Bitmap k(Uri uri, int i, int i2, int i3) {
        ParcelFileDescriptor parcelFileDescriptor;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5931818c", new Object[]{uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (uri == null || i3 < 0) {
            return null;
        }
        try {
            parcelFileDescriptor = caa.c().getContentResolver().openFileDescriptor(uri, "r");
        } catch (FileNotFoundException unused) {
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
        options.inSampleSize = rhi.d(options, i) * i2;
        options.inJustDecodeBounds = false;
        try {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
            } catch (OutOfMemoryError unused2) {
                bitmap = k(uri, i, i2 * 2, i3 - 1);
            }
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused3) {
                return bitmap;
            }
        } catch (Throwable th) {
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused4) {
            }
            throw th;
        }
    }

    public final boolean s(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0b71ca6", new Object[]{this, context, bitmap})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(bitmap, "sourceBitmap");
        try {
            Object systemService = context.getSystemService(pg1.ATOM_EXT_window);
            if (!(systemService instanceof WindowManager)) {
                agh.r("AutoDetect", TAG, "cropLongImage: wm is null");
                return false;
            }
            Point point = new Point(0, 0);
            ((WindowManager) systemService).getDefaultDisplay().getSize(point);
            return bitmap.getHeight() >= bitmap.getWidth() * 3 && bitmap.getHeight() * point.x >= bitmap.getWidth() * point.y;
        } catch (Exception unused) {
            return false;
        }
    }
}
