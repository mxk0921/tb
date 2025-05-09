package tb;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.appcompat.taobao.util.Globals;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_TEMP_DIR = "shareTempCache";

    static {
        t2o.a(665845815);
    }

    public static void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9a5ee2", new Object[]{file});
        } else if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                b(file2);
            }
        }
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258726ad", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            a(file);
        }
        try {
            return file.delete();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Uri c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("20a44530", new Object[0]);
        }
        if (g()) {
            return MediaStore.Images.Media.getContentUri(UiUtil.INPUT_TYPE_VALUE_EXTERNAL);
        }
        return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    public static String d(Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d71b07", new Object[]{context, cursor});
        }
        if (!g()) {
            return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        }
        File h = h(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))), context);
        if (h != null) {
            return h.getAbsolutePath();
        }
        return null;
    }

    public static Uri e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ed29a922", new Object[0]);
        }
        if (g()) {
            return MediaStore.Images.Media.getContentUri("internal");
        }
        return MediaStore.Images.Media.INTERNAL_CONTENT_URI;
    }

    public static String f(Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac798e27", new Object[]{context, cursor});
        }
        if (!g()) {
            return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        }
        File h = h(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))), context);
        if (h != null) {
            return h.getAbsolutePath();
        }
        return null;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ed4783", new Object[0])).booleanValue();
        }
        if (Globals.getApplication().getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public static File h(Uri uri, Context context) {
        ContentResolver contentResolver;
        IOException e;
        InputStream openInputStream;
        File file;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f3afc26b", new Object[]{uri, context});
        }
        File file2 = null;
        if (uri == null || uri.getScheme() == null) {
            return null;
        }
        if (uri.getPath() != null && uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals("content")) {
            return null;
        }
        String str = (System.currentTimeMillis() + Math.round((Math.random() + 1.0d) * 1000.0d)) + "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            File file3 = new File(context.getCacheDir(), SHARE_TEMP_DIR);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            file = new File(file3, str);
            fileOutputStream = new FileOutputStream(file);
            if (openInputStream != null) {
                FileUtils.copy(openInputStream, fileOutputStream);
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            fileOutputStream.close();
            if (openInputStream != null) {
                openInputStream.close();
            }
            return file;
        } catch (IOException e3) {
            e = e3;
            file2 = file;
            e.printStackTrace();
            return file2;
        }
    }
}
