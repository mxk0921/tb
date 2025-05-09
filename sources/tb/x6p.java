package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SharedMemory;
import android.util.Base64;
import android.util.Log;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.SecCamManager;
import com.ifaa.seccam.a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c66040fb", new Object[]{bitmap, new Integer(i)});
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static boolean b(Context context, pi4 pi4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f76cf5c", new Object[]{context, pi4Var})).booleanValue();
        }
        return a.f(context, pi4Var);
    }

    public static String c(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d05e0270", new Object[]{bitmap, new Integer(i)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static synchronized SharedMemory d(byte[] bArr) {
        SharedMemory create;
        ByteBuffer mapReadWrite;
        synchronized (x6p.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return sec.a(ipChange.ipc$dispatch("c2d15d61", new Object[]{bArr}));
            }
            try {
                create = SharedMemory.create("secccam", 524288);
                mapReadWrite = create.mapReadWrite();
                mapReadWrite.putInt(bArr.length);
                mapReadWrite.put(bArr);
                return create;
            } catch (Exception e) {
                Log.e("SecCamUtils", "str2Sm error ! e = ", e);
                return null;
            }
        }
    }

    public static Bitmap e(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c2872846", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f);
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        canvas.drawBitmap(createBitmap2, new Rect(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight()), new Rect(0, 0, i, i2), (Paint) null);
        return createBitmap;
    }

    public static Bitmap f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("14cf6bed", new Object[]{bArr});
        }
        Bitmap j = j(bArr, 640, 480);
        if (j != null) {
            return j;
        }
        return null;
    }

    public static boolean h(s6p s6pVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9d3855", new Object[]{s6pVar, bArr})).booleanValue();
        }
        if (bArr == null) {
            return false;
        }
        int i = 0;
        while (i < bArr.length) {
            try {
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, i, bArr2, 0, 4);
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr, i + 4, bArr3, 0, 4);
                int i2 = i + 8;
                int m = m(bArr2, 0);
                int m2 = m(bArr3, 0);
                if (m == 0) {
                    break;
                } else if (m == 1) {
                    byte[] bArr4 = new byte[m2];
                    System.arraycopy(bArr, i2, bArr4, 0, m2);
                    i = i2 + m2;
                    s6pVar.e(bArr4);
                } else if (m == 2) {
                    byte[] bArr5 = new byte[m2];
                    System.arraycopy(bArr, i2, bArr5, 0, m2);
                    i = i2 + m2;
                    s6pVar.g(bArr5);
                } else if (m != 3) {
                    if (m == 4) {
                        System.arraycopy(bArr, i2, new byte[m2], 0, m2);
                    }
                    i = i2 + m2;
                } else {
                    byte[] bArr6 = new byte[m2];
                    System.arraycopy(bArr, i2, bArr6, 0, m2);
                    i = i2 + m2;
                    s6pVar.i(bArr6);
                }
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        return true;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[0])).booleanValue();
        }
        if (SecCamManager.h().c == null || !SecCamManager.h().c.asBinder().isBinderAlive()) {
            return false;
        }
        v6p.a("SecCamUtils", " aidl :: connected");
        return true;
    }

    public static Bitmap j(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("61d311df", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        return l(bArr, i, i2, 0, 1);
    }

    public static synchronized byte[] k(SharedMemory sharedMemory) {
        ByteBuffer mapReadWrite;
        synchronized (x6p.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("af786c54", new Object[]{sharedMemory});
            }
            try {
                mapReadWrite = sharedMemory.mapReadWrite();
                int i = mapReadWrite.getInt();
                byte[] bArr = new byte[i];
                mapReadWrite.get(bArr, 0, i);
                return bArr;
            } catch (Exception e) {
                e.toString();
                return null;
            }
        }
    }

    public static Bitmap l(byte[] bArr, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f78d1173", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        int i5 = i * i2;
        int[] iArr = new int[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = 0;
            while (i8 < i) {
                int i9 = (bArr[i5 + i3] & 255) + cq1.SIGN;
                int i10 = (bArr[i5 + i4] & 255) + cq1.SIGN;
                int i11 = (bArr[i6] & 255) * 1192;
                int i12 = (i10 * 1634) + i11;
                int i13 = (i11 - (i10 * 833)) - (i9 * 400);
                int i14 = i11 + (i9 * 2066);
                if (i12 < 0) {
                    i12 = 0;
                } else if (i12 > 262143) {
                    i12 = 262143;
                }
                if (i13 < 0) {
                    i13 = 0;
                } else if (i13 > 262143) {
                    i13 = 262143;
                }
                if (i14 < 0) {
                    i14 = 0;
                } else if (i14 > 262143) {
                    i14 = 262143;
                }
                iArr[i6] = ((i12 << 6) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((i13 >> 2) & 65280) | ((i14 >> 10) & 255);
                int i15 = i6 + 1;
                if ((i6 & 1) == 1) {
                    i5 += 2;
                }
                i8++;
                i6 = i15;
            }
            if ((i7 & 1) == 0) {
                i5 -= i;
            }
        }
        return e(a(Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.RGB_565), -90), 480, 640);
    }

    public static int m(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46cbab34", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return ((bArr[i + 3] & 255) << 24) + ((bArr[2 + i] & 255) << 16) + ((bArr[1 + i] & 255) << 8) + (bArr[i] & 255);
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17da9bc", new Object[]{context})).booleanValue();
        }
        return context.getPackageManager().checkPermission("android.permission.RECORD_AUDIO", "packageName") == 0;
    }
}
