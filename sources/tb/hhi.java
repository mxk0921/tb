package tb;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.util.Constants;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hhi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845944);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("969d5d97", new Object[0])).booleanValue();
        }
        if (ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public static String b(boolean z, Bitmap bitmap, File file, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf7faf9c", new Object[]{new Boolean(z), bitmap, file, context});
        }
        return c(z, bitmap, file, context, Boolean.FALSE, true);
    }

    public static String d(Bitmap bitmap, File file, long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e825cb3", new Object[]{bitmap, file, new Long(j), context});
        }
        long j2 = j / 1000;
        try {
            ContentValues contentValues = new ContentValues();
            ContentResolver contentResolver = ShareBizAdapter.getInstance().getAppEnv().getApplication().getContentResolver();
            contentValues.put("_data", file.getAbsolutePath());
            contentValues.put("title", file.getName());
            contentValues.put("_display_name", file.getName());
            contentValues.put("datetaken", Long.valueOf(j));
            contentValues.put("date_added", Long.valueOf(j2));
            contentValues.put("date_modified", Long.valueOf(j2));
            contentValues.put("mime_type", Constants.SHARETYPE_WITH_QRCODE);
            contentValues.put("width", Integer.valueOf(bitmap.getWidth()));
            contentValues.put("height", Integer.valueOf(bitmap.getHeight()));
            contentValues.put("_size", Long.valueOf(file.length()));
            Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            fwr.b("MediaStoreUtil", "file.length=" + file.length() + "  uri=" + insert);
            String absolutePath = file.getAbsolutePath();
            fwr.b("MediaStoreUtil", "saveToMediaStore absolutePath=" + absolutePath);
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + absolutePath)));
            return absolutePath;
        } catch (Exception e) {
            fwr.b("MediaStoreUtil", "saveToMediaStore to Mediastore failed: " + e.toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(boolean r7, android.graphics.Bitmap r8, java.io.File r9, android.content.Context r10, java.lang.Boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hhi.c(boolean, android.graphics.Bitmap, java.io.File, android.content.Context, java.lang.Boolean, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(android.graphics.Bitmap r11, java.io.File r12, long r13, boolean r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hhi.e(android.graphics.Bitmap, java.io.File, long, boolean):java.lang.String");
    }
}
