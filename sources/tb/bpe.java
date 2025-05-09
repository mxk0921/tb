package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bpe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Image_Tag = "TuCaoBaImage";

    /* renamed from: a  reason: collision with root package name */
    public static Handler f16527a;
    public static x6e b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f16528a;
        private final String b;
        private final mzd c;

        /* compiled from: Taobao */
        /* renamed from: tb.bpe$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0883a implements z6e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0883a() {
            }

            @Override // tb.z6e
            public String getBizType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
                }
                return a.a(a.this);
            }

            @Override // tb.z6e
            public String getFilePath() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
                }
                return a.b(a.this);
            }

            @Override // tb.z6e
            public String getFileType() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
                }
                return ".jpg";
            }

            @Override // tb.z6e
            public Map<String, String> getMetaInfo() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
                }
                return null;
            }
        }

        static {
            t2o.a(913309707);
        }

        public a(String str, String str2, mzd mzdVar) {
            this.f16528a = str;
            this.b = str2;
            this.c = mzdVar;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("30f34bc7", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("19fb10c8", new Object[]{aVar});
            }
            return aVar.f16528a;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                bpe.b().uploadAsync(new C0883a(), this.c, bpe.a());
            }
        }
    }

    static {
        t2o.a(913309706);
    }

    public static /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1907942d", new Object[0]);
        }
        return f16527a;
    }

    public static /* synthetic */ x6e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x6e) ipChange.ipc$dispatch("b731e3cd", new Object[0]);
        }
        return b;
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2565d7cc", new Object[]{str, str2})).booleanValue();
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile == null) {
                return false;
            }
            int e = e(str);
            if (e != 0) {
                decodeFile = h(decodeFile, e);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException unused) {
            TLog.loge(uov.INSTANCE.b(), "ImageConversionUtils", "Failed to convert image to JPG");
            return false;
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1647bd", new Object[]{str});
            return;
        }
        File file = new File(str);
        if (file.exists() && file.length() != 0) {
            if (file.delete()) {
                String b2 = uov.INSTANCE.b();
                TLog.loge(b2, Image_Tag, "deleteImageInApp: success: " + str);
                return;
            }
            String b3 = uov.INSTANCE.b();
            TLog.loge(b3, Image_Tag, "deleteImageInApp: error: " + str);
        }
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1932583", new Object[]{str})).intValue();
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            TLog.loge(uov.INSTANCE.b(), "getRotationAngle error: ", e.toString());
            return 0;
        }
    }

    public static String f(Context context, String str) {
        String str2;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("536890a1", new Object[]{context, str});
        }
        String str3 = "";
        if (str == null || str.length() <= 0) {
            str2 = str3;
        } else {
            str2 = new File(str).getName();
        }
        File dir = context.getDir("images", 0);
        if (str2.length() > 0 && (lastIndexOf = str2.lastIndexOf(46)) != -1) {
            str3 = str2.substring(0, lastIndexOf);
        }
        return new File(dir, str3 + ".jpg").getAbsolutePath();
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9de496", new Object[0]);
            return;
        }
        f16527a = new Handler(Looper.getMainLooper());
        b = omv.a();
    }

    public static Bitmap h(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ddbfca24", new Object[]{bitmap, new Integer(i)});
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void i(String str, String str2, mzd mzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e160058", new Object[]{str, str2, mzdVar});
            return;
        }
        g();
        if (c(str, str2)) {
            str = str2;
        } else {
            TLog.loge(uov.INSTANCE.b(), "ImageConversionUtils", "Failed to convert image to JPG");
        }
        new Thread(new a(str, "mtopupload", mzdVar), "TuCaoBaUploadImageForOffline").start();
    }
}
