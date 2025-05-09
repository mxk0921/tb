package com.alipay.android.msp.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BitmapUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static String getFilePathFromContentUri(String str, ContentResolver contentResolver) {
        Throwable th;
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2131bdad", new Object[]{str, contentResolver});
        }
        String str2 = null;
        if (str == null || contentResolver == null) {
            return null;
        }
        try {
            cursor = MediaStore.Images.Media.query(contentResolver, Uri.parse(str), new String[]{"_data"});
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                str2 = cursor.getString(cursor.getColumnIndex("_data"));
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                LogUtil.printExceptionStackTrace(th);
                return str2;
            } finally {
                FileUtils.close(cursor);
            }
        }
        return str2;
    }

    public static Bitmap getHttpBitmap(String str) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d68e9f7c", new Object[]{str});
        }
        Bitmap bitmap = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    inputStream = httpURLConnection.getInputStream();
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } catch (IOException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            inputStream = null;
        }
        try {
            bitmap = BitmapFactory.decodeStream(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            httpURLConnection.disconnect();
        } catch (Throwable th4) {
            th = th4;
            try {
                LogUtil.printExceptionStackTrace(th);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return bitmap;
            } catch (Throwable th5) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        LogUtil.printExceptionStackTrace(e2);
                        throw th5;
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th5;
            }
        }
        return bitmap;
    }

    public static Bitmap getRoundedBitmap(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("493cc940", new Object[]{bitmap, new Integer(i)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    private static String insertPicture(Context context, Bitmap bitmap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22d90eda", new Object[]{context, bitmap, str, str2});
        }
        tryInitPicturesDir();
        return MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, str, str2);
    }

    public static String saveBitmap(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbcdc53d", new Object[]{context, bitmap, str});
        }
        String str2 = null;
        if (context == null || bitmap == null) {
            return null;
        }
        try {
            str2 = insertPicture(context, bitmap, str, "");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return getFilePathFromContentUri(str2, context.getContentResolver());
    }

    private static void tryInitPicturesDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab02c8b4", new Object[0]);
            return;
        }
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static Bitmap zoomImage(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1d9abdbd", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
