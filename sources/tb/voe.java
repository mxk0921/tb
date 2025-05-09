package tb;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.AndroidRuntimeException;
import android.util.Base64;
import android.webkit.URLUtil;
import com.alipay.ma.util.ImageTool;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class voe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a extends h7b<b8b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30138a;
        public final /* synthetic */ c b;

        public a(Context context, c cVar) {
            this.f30138a = context;
            this.b = cVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/util/ImageTool$1");
        }

        @Override // tb.h7b
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            c cVar = this.b;
            if (cVar != null) {
                cVar.error("error get resource, code=[" + i + "],msg=[" + str + "]");
            }
        }

        /* renamed from: e */
        public void b(b8b b8bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("696fd54d", new Object[]{this, b8bVar, new Integer(i)});
                return;
            }
            try {
                if (!b8bVar.e() || !"mounted".equals(Environment.getExternalStorageState()) || !voe.e(this.f30138a, BitmapFactory.decodeStream(new ByteArrayInputStream(b8bVar.b())))) {
                    c cVar = this.b;
                    if (cVar != null) {
                        cVar.error("bad resource");
                        return;
                    }
                    return;
                }
                c cVar2 = this.b;
                if (cVar2 != null) {
                    cVar2.a();
                }
            } catch (Exception e) {
                c cVar3 = this.b;
                if (cVar3 != null) {
                    cVar3.error(e.getMessage());
                }
            } catch (OutOfMemoryError e2) {
                c cVar4 = this.b;
                if (cVar4 != null) {
                    cVar4.error(e2.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f30139a;

        public b(Handler handler) {
            this.f30139a = handler;
        }

        @Override // tb.voe.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
                return;
            }
            Handler handler = this.f30139a;
            if (handler != null) {
                handler.sendEmptyMessage(404);
            }
        }

        @Override // tb.voe.c
        public void error(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
                return;
            }
            Handler handler = this.f30139a;
            if (handler != null) {
                handler.sendEmptyMessage(405);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface c {
        void a();

        void error(String str);
    }

    static {
        t2o.a(989856433);
    }

    public static byte[] a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("374edd52", new Object[]{bitmap, compressFormat});
        }
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap d(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a6f75e55", new Object[]{bitmap, new Integer(i)});
        }
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap != createBitmap) {
                return createBitmap;
            }
            return bitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static void g(Context context, String str, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5d8c7f", new Object[]{context, str, handler});
        } else {
            h(context, str, new b(handler));
        }
    }

    public static Drawable i(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bd9b712f", new Object[]{resources, str});
        }
        if (str == null) {
            return null;
        }
        try {
            try {
                return new BitmapDrawable(resources, BitmapFactory.decodeStream(new ByteArrayInputStream(Base64.decode(str, 0))));
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return null;
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public static Bitmap j(Bitmap bitmap, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("15244c9c", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i2 = width;
        } else {
            i2 = height;
        }
        if (i2 <= i) {
            return bitmap;
        }
        float f = i / i2;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap k(Bitmap bitmap, long j, long j2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("68fe7b03", new Object[]{bitmap, new Long(j), new Long(j2)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i2 = width;
            i = height;
        } else {
            i = width;
            i2 = height;
        }
        if (i2 <= j && i <= j2) {
            return bitmap;
        }
        float f = ((float) j) / i2;
        float f2 = ((float) j2) / i;
        if (f >= f2) {
            f = f2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9f91da4", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static Bitmap c(String str, int i) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ddc46cde", new Object[]{str, new Integer(i)});
        }
        if (i > 10240) {
            i = AccsConnection.DATA_PACKAGE_MAX;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i4) {
            i3 = i4;
        }
        int round = Math.round(i3 / i);
        if (round >= 1) {
            i2 = round;
        }
        options.inSampleSize = i2;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static boolean e(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beb29f8f", new Object[]{context, bitmap})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 29) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File file = new File(externalStoragePublicDirectory, String.valueOf(System.currentTimeMillis()) + ".jpg");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"image/jpeg"}, null);
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        } else if (f(context, bitmap)) {
            return true;
        } else {
            v7t.d(ImageTool.TAG, "save image failed");
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00ba: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:24:0x00ba */
    public static boolean f(Context context, Bitmap bitmap) {
        Throwable th;
        ParcelFileDescriptor parcelFileDescriptor;
        IOException e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5fdee24", new Object[]{context, bitmap})).booleanValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", String.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + "wv_save_image");
        Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(contentUri, contentValues);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (insert == null) {
                    new AndroidRuntimeException("android Q: save image error for uri is null").printStackTrace();
                    return false;
                }
                parcelFileDescriptor = contentResolver.openFileDescriptor(insert, "w", null);
                try {
                    fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                    try {
                        if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream)) {
                            new AndroidRuntimeException("android Q: save image failed").printStackTrace();
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                parcelFileDescriptor.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            return false;
                        }
                        contentValues.clear();
                        contentValues.put("is_pending", (Integer) 0);
                        contentResolver.update(insert, contentValues, null, null);
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            parcelFileDescriptor.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return true;
                    } catch (IOException e4) {
                        e = e4;
                        e.printStackTrace();
                        contentResolver.delete(insert, null, null);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                                return false;
                            }
                        }
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        return false;
                    }
                } catch (IOException e6) {
                    e = e6;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e8) {
            e = e8;
            parcelFileDescriptor = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = null;
        }
    }

    public static void h(Context context, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0dc71b", new Object[]{context, str, cVar});
        } else if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            hi4.c().a(str, new a(context, cVar));
        } else if (str.startsWith("data:")) {
            try {
                byte[] decode = Base64.decode(str.substring(str.indexOf(",") + 1).getBytes(), 0);
                if (e(context, BitmapFactory.decodeByteArray(decode, 0, decode.length)) && cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                if (cVar != null) {
                    cVar.error(th.getMessage());
                }
            }
        }
    }
}
