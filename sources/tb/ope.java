package tb;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ope {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(945815602);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd39b635", new Object[]{str});
        }
        if (TextUtils.equals(Constants.SHARETYPE_WITH_QRCODE, str)) {
            return "png";
        }
        if (TextUtils.equals("image/jpeg", str)) {
            return ryp.FILE_TYPE_IMAGE_JPG;
        }
        return "";
    }

    public static String d(byte[] bArr, int i, int i2, int i3, int i4, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9deeaa", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Float(f)});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.equals(Constants.SHARETYPE_WITH_QRCODE, str) && !TextUtils.equals("image/jpeg", str)) {
            return "";
        }
        byte[] a2 = a(bArr, i, i2, i3, i4, b(str), f);
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        String str2 = "data:" + str + ";base64,";
        String encodeToString = Base64.encodeToString(a2, 2);
        if (TextUtils.isEmpty(encodeToString)) {
            return "";
        }
        sb.append(str2);
        sb.append(encodeToString);
        return sb.toString();
    }

    public static String e(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str2, float f, boolean z2) {
        Context context;
        Bitmap bitmap;
        Bitmap.CompressFormat compressFormat;
        OutputStream outputStream;
        Throwable th;
        int i7;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("462f0347", new Object[]{str, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), str2, new Float(f), new Boolean(z2)});
        }
        TextureView b = u33.a().b(str);
        if (b == null || (context = b.getContext()) == null || (bitmap = b.getBitmap()) == null) {
            return null;
        }
        int i8 = (int) (f * 100.0f);
        if (TextUtils.equals(str2.toLowerCase(), "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        try {
            if (!(context instanceof Activity)) {
                return null;
            }
            if (z2) {
                ContentResolver contentResolver = context.getContentResolver();
                ContentValues contentValues = new ContentValues();
                i7 = i8;
                contentValues.put("_display_name", "canvas-dat-" + System.currentTimeMillis() + "." + str2);
                contentValues.put("mime_type", compressFormat == Bitmap.CompressFormat.JPEG ? "image/jpeg" : Constants.SHARETYPE_WITH_QRCODE);
                Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (insert == null) {
                    return null;
                }
                outputStream = contentResolver.openOutputStream(insert);
                try {
                    Cursor query = contentResolver.query(insert, new String[]{"_data"}, null, null, null);
                    if (query != null) {
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                        query.moveToFirst();
                        String string = query.getString(columnIndexOrThrow);
                        query.close();
                        file = new File(string);
                    } else if (outputStream == null) {
                        return null;
                    } else {
                        try {
                            outputStream.close();
                            return null;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Log.e("ImageUtils", "unable to save image data", th);
                        if (outputStream == null) {
                            return null;
                        }
                        try {
                            outputStream.close();
                            return null;
                        } catch (Exception unused2) {
                            return null;
                        }
                    } finally {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            } else {
                i7 = i8;
                File filesDir = context.getFilesDir();
                file = new File(filesDir, "canvas-dat-" + System.currentTimeMillis() + "." + str2);
                outputStream = new FileOutputStream(file);
            }
            Matrix matrix = new Matrix();
            int min = Math.min(i3, bitmap.getWidth());
            int min2 = Math.min(i4, bitmap.getHeight());
            matrix.postScale(Math.min(i5, bitmap.getWidth()) / min, Math.min(i6, bitmap.getHeight()) / min2);
            Bitmap.createBitmap(bitmap, Math.max(0, i), Math.max(0, i2), Math.max(0, min), Math.max(0, min2), matrix, false).compress(compressFormat, i7, outputStream);
            if (outputStream != null) {
                outputStream.flush();
            }
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            context.sendBroadcast(intent);
            return file.getAbsolutePath();
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    public static byte[] a(byte[] bArr, int i, int i2, int i3, int i4, String str, float f) {
        Bitmap.CompressFormat compressFormat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("40b01dd8", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Float(f)});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = (int) (f * 100.0f);
        if (TextUtils.equals(str.toLowerCase(), "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        Bitmap.createScaledBitmap(createBitmap, i3, i4, true).compress(compressFormat, i5, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String c(String str, String str2, float f) {
        String str3;
        Bitmap.CompressFormat compressFormat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e5e6d6f", new Object[]{str, str2, new Float(f)});
        }
        if ("png".equalsIgnoreCase(str2)) {
            str3 = "png";
        } else {
            str3 = ryp.FILE_TYPE_IMAGE_JPG;
        }
        TextureView b = u33.a().b(str);
        Bitmap bitmap = b != null ? b.getBitmap() : null;
        if (bitmap == null) {
            return "data:,";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = (int) (f * 100.0f);
        if (TextUtils.equals(str3.toLowerCase(), "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length > 0) {
            String str4 = "data:" + str3 + ";base64,";
            String encodeToString = Base64.encodeToString(byteArray, 2);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(encodeToString)) {
                sb.append(str4);
                sb.append(encodeToString);
                return sb.toString();
            }
        }
        return "data:,";
    }
}
