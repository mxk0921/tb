package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rhi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297696);
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5b556542", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        return c(bitmap, i, i2, i3, i4, true);
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8d307bce", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
        if (bitmap == null) {
            return null;
        }
        return b(bitmap, i, i2, i3, i4, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), z);
    }

    public static int d(BitmapFactory.Options options, int i) {
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d72d401b", new Object[]{options, new Integer(i)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i5 > i4) {
            i2 = (int) (i * ((i5 * 1.0f) / i4) * 1.0f);
        } else {
            i2 = i;
            i = (int) (i * ((i4 * 1.0f) / i5) * 1.0f);
        }
        if (i4 > i || i5 > i2) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (i6 / i3 > i && i7 / i3 > i2) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static Bitmap e(Context context, Uri uri, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("eaa17e5a", new Object[]{context, uri, new Integer(i)});
        }
        return f(context, uri, i, 1);
    }

    public static Bitmap f(Context context, Uri uri, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("190568e5", new Object[]{context, uri, new Integer(i), new Integer(i2)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (uri.getScheme() == null) {
            BitmapFactory.decodeFile(uri.getPath(), options);
            options.inSampleSize = d(options, i) * i2;
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(uri.getPath(), options);
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null) {
                return null;
            }
            FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            int d = d(options, i) * i2;
            options.inSampleSize = d;
            options.inJustDecodeBounds = false;
            agh.h("MediaUtil", "inSampleSize:" + d + ",targetShortEdgeLength:" + i);
            try {
                try {
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    try {
                        openFileDescriptor.close();
                    } catch (Exception unused) {
                    }
                    return decodeFileDescriptor;
                } catch (OutOfMemoryError unused2) {
                    Bitmap f = f(context, uri, i, 2);
                    try {
                        openFileDescriptor.close();
                    } catch (Exception unused3) {
                    }
                    return f;
                }
            } catch (Throwable th) {
                try {
                    openFileDescriptor.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            return null;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2, int i3, int i4, Rect rect, boolean z) {
        Matrix matrix;
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("48d3ab9d", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rect, new Boolean(z)});
        }
        if (bitmap == null || rect == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f3 = 1.0f;
        if (width >= height) {
            if (width > i4) {
                f = i4 * 1.0f;
                f2 = width;
                f3 = f / f2;
            }
            matrix = new Matrix();
            matrix.postRotate(i);
            matrix.postScale(i2 * f3, i3 * f3);
            StringBuilder sb = new StringBuilder("height:");
            sb.append(height);
            sb.append(",width:");
            sb.append(width);
            sb.append(",scale:");
            sb.append(f3);
            try {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right, rect.bottom, matrix, true);
                    if (z && !bitmap.isRecycled() && bitmap != createBitmap) {
                        bitmap.recycle();
                    }
                    return createBitmap;
                } catch (OutOfMemoryError unused) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right / 2, rect.bottom / 2, matrix, true);
                    if (z && !bitmap.isRecycled() && bitmap != createBitmap2) {
                        bitmap.recycle();
                    }
                    return createBitmap2;
                }
            } catch (Throwable th) {
                if (z && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                throw th;
            }
        } else {
            if (height > i4) {
                f = i4 * 1.0f;
                f2 = height;
                f3 = f / f2;
            }
            matrix = new Matrix();
            matrix.postRotate(i);
            matrix.postScale(i2 * f3, i3 * f3);
            StringBuilder sb2 = new StringBuilder("height:");
            sb2.append(height);
            sb2.append(",width:");
            sb2.append(width);
            sb2.append(",scale:");
            sb2.append(f3);
            Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right, rect.bottom, matrix, true);
            if (z) {
                bitmap.recycle();
            }
            return createBitmap3;
        }
    }
}
