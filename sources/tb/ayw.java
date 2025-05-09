package tb;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.livephoto.watermask.WaterMaskView;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ayw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements q8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16081a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ Drawable c;
        public final /* synthetic */ String d;
        public final /* synthetic */ nbe e;

        public a(Context context, ImageView imageView, Drawable drawable, String str, nbe nbeVar) {
            this.f16081a = context;
            this.b = imageView;
            this.c = drawable;
            this.d = str;
            this.e = nbeVar;
        }

        @Override // tb.q8d
        public void a(String[] strArr, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e648db2a", new Object[]{this, strArr, iArr});
            } else if (!ayw.a(this.f16081a)) {
                Context context = this.f16081a;
                Toast.makeText(context, context.getString(R.string.request_permission), 1).show();
            } else {
                ayw.f(this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zxw f16082a;

        public b(zxw zxwVar) {
            this.f16082a = zxwVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                this.f16082a.m();
            }
        }
    }

    static {
        t2o.a(732954645);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aac47dff", new Object[]{context})).booleanValue();
        }
        if ((context instanceof Activity) && ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static void d(Bitmap bitmap, String str) throws IOException {
        FileNotFoundException e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8df6c6e", new Object[]{bitmap, str});
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    File file = new File(str);
                    if (file.exists()) {
                        file.delete();
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e2) {
                    AdapterForTLog.loge("VideoWaterMask", "saveBitmapToFile: ", e2);
                    return;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            AdapterForTLog.loge("VideoWaterMask", "saveBitmapToFile: ", e);
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    AdapterForTLog.loge("VideoWaterMask", "saveBitmapToFile: ", e5);
                }
            }
            throw th;
        }
    }

    public static String e(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5a6db9a", new Object[]{context, bitmap});
        }
        if (context == null) {
            return "";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "taobao life");
        contentValues.put("mime_type", "image/jpeg");
        Uri insert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return "";
        }
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
            openOutputStream.close();
            return insert.getPath();
        } catch (IOException e) {
            AdapterForTLog.loge("VideoWaterMask", "savePicBufferToSystemAlbum: ", e);
            return "";
        }
    }

    public static String b(Context context, String str) {
        Throwable th;
        IOException e;
        OutputStream openOutputStream;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f1671d8", new Object[]{context, str});
        }
        if (context == null) {
            return "";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "taobao life");
        contentValues.put("mime_type", "video/mp4");
        Uri insert = context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                openOutputStream = context.getContentResolver().openOutputStream(insert);
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                openOutputStream.write(bArr, 0, read);
            }
            openOutputStream.close();
            fileInputStream.close();
            String path = insert.getPath();
            try {
                fileInputStream.close();
            } catch (IOException e3) {
                AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e3);
            }
            return path;
        } catch (IOException e4) {
            e = e4;
            fileInputStream2 = fileInputStream;
            AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e5) {
                    AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e5);
                }
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e6) {
                    AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e6);
                }
            }
            throw th;
        }
    }

    public static void c(Context context, q8d q8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c184d6", new Object[]{context, q8dVar});
        } else {
            com.taobao.runtimepermission.a.c(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).x(true).w("是否允许保存图片到相册").t("VideoWaterMask").v(q8dVar).m();
        }
    }

    public static boolean f(ImageView imageView, Drawable drawable, String str, nbe nbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d499f893", new Object[]{imageView, drawable, str, nbeVar})).booleanValue();
        }
        if (imageView == null || drawable == null || TextUtils.isEmpty(str) || nbeVar == null) {
            return false;
        }
        Context context = imageView.getContext();
        if (!a(context)) {
            c(context, new a(context, imageView, drawable, str, nbeVar));
            return false;
        }
        String saveBitmapAsFile = WaterMaskView.saveBitmapAsFile(context, drawable, str);
        String str2 = context.getFilesDir().getPath() + File.separator + System.currentTimeMillis() + ".jpg";
        try {
            d(((BitmapDrawable) imageView.getDrawable()).getBitmap(), str2);
        } catch (Exception e) {
            nbeVar.d(e.toString());
            AdapterForTLog.loge("VideoWaterMask", "saveToAlbum: ", e);
        }
        zxw zxwVar = new zxw(context);
        zxwVar.i(str2, saveBitmapAsFile, imageView.getDrawable().getIntrinsicWidth(), imageView.getDrawable().getIntrinsicHeight(), nbeVar);
        imageView.addOnAttachStateChangeListener(new b(zxwVar));
        return true;
    }
}
