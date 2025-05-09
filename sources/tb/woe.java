package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alipay.ma.util.ImageTool;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class woe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final woe INSTANCE = new woe();

    static {
        t2o.a(126877714);
    }

    public final int d(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32e74357", new Object[]{this, str})).intValue();
        }
        int i = -1;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(str);
                } catch (Throwable unused) {
                }
            } catch (IOException unused2) {
            }
            try {
                i = fileInputStream.available();
                fileInputStream.close();
            } catch (Throwable unused3) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return i;
            }
        }
        return i;
    }

    public final boolean f(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beb29f8f", new Object[]{this, context, bitmap})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(bitmap, "bmp");
        if (Build.VERSION.SDK_INT < 29) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File file = new File(externalStoragePublicDirectory, String.valueOf(System.currentTimeMillis()) + ".jpg");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"image/jpeg"}, null);
                return true;
            } catch (FileNotFoundException | IOException unused) {
                return false;
            }
        } else if (!g(context, bitmap)) {
            return false;
        } else {
            return true;
        }
    }

    public final String e(String str, Integer num, BitmapFactory.Options options) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae4bd7d0", new Object[]{this, str, num, options});
        }
        ckf.g(options, "options");
        try {
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (num != null) {
                int intValue = num.intValue();
                int i = 100;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                while (byteArrayOutputStream.size() > intValue && i > 0) {
                    byteArrayOutputStream.reset();
                    i -= 10;
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                }
            } else {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream);
            }
            bitmap.recycle();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable th) {
            iih.INSTANCE.a(ImageTool.TAG, "base64 error = " + th);
            return null;
        }
    }

    public final Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("96ec018d", new Object[]{this, str});
        }
        ckf.g(str, "url");
        String substring = str.substring(wsq.Y(str, ",", 0, false, 6, null) + 1);
        ckf.f(substring, "(this as java.lang.String).substring(startIndex)");
        try {
            byte[] bytes = substring.getBytes(uj3.UTF_8);
            ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] decode = Base64.decode(bytes, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Bitmap b(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b4a623ef", new Object[]{this, str});
        }
        ckf.g(str, "url");
        Response syncSend = new DegradableNetwork(null).syncSend(new RequestImpl(str), null);
        if (syncSend == null || syncSend.getStatusCode() != 200 || syncSend.getBytedata() == null) {
            return null;
        }
        byte[] bytedata = syncSend.getBytedata();
        ckf.f(bytedata, "response.bytedata");
        if (bytedata.length != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(syncSend.getBytedata());
            Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
            lw3.a(byteArrayInputStream, null);
            return decodeStream;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Pair<byte[], String> c(String str) {
        Object obj;
        byte[] bytedata;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e18ba0b7", new Object[]{this, str});
        }
        ckf.g(str, "url");
        try {
            Response syncSend = new DegradableNetwork(null).syncSend(new RequestImpl(str), null);
            if (syncSend != null) {
                if (!((syncSend.getStatusCode() == 200 ? syncSend : null) == null || (bytedata = syncSend.getBytedata()) == null)) {
                    if (bytedata.length != 0) {
                        z = false;
                    }
                    if (z) {
                        bytedata = null;
                    }
                    if (bytedata != null) {
                        List<String> list = syncSend.getConnHeadFields().get("Content-Type");
                        return new Pair<>(bytedata, list != null ? (String) i04.c0(list) : null);
                    }
                }
            }
            iih iihVar = iih.INSTANCE;
            StringBuilder sb = new StringBuilder("getByteDataFromUrl url= ");
            sb.append(str);
            sb.append(" statusCode= ");
            sb.append(syncSend != null ? Integer.valueOf(syncSend.getStatusCode()) : null);
            iihVar.a(ImageTool.TAG, sb.toString());
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            iih.INSTANCE.a(ImageTool.TAG, "getByteDataFromUrl fail, stack : ".concat(sm8.b(th2)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6 A[Catch: IOException -> 0x00d9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00d9, blocks: (B:33:0x00ce, B:35:0x00d6), top: B:42:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.content.Context r11, android.graphics.Bitmap r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.woe.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "e5fdee24"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r11 = 2
            r4[r11] = r12
            java.lang.Object r11 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = android.os.Environment.DIRECTORY_PICTURES
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "mega_save_image"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "_display_name"
            r3.put(r5, r4)
            java.lang.String r4 = "mime_type"
            java.lang.String r5 = "image/jpeg"
            r3.put(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "is_pending"
            r3.put(r5, r4)
            java.lang.String r4 = "relative_path"
            r3.put(r4, r2)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r2 = r11.insert(r2, r3)
            if (r2 != 0) goto L_0x0070
            return r1
        L_0x0070:
            r4 = 0
            java.lang.String r6 = "w"
            android.os.ParcelFileDescriptor r6 = r11.openFileDescriptor(r2, r6, r4)     // Catch: all -> 0x00b6, IOException -> 0x00b9
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: all -> 0x00b2, IOException -> 0x00b4
            tb.ckf.d(r6)     // Catch: all -> 0x00b2, IOException -> 0x00b4
            java.io.FileDescriptor r8 = r6.getFileDescriptor()     // Catch: all -> 0x00b2, IOException -> 0x00b4
            r7.<init>(r8)     // Catch: all -> 0x00b2, IOException -> 0x00b4
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: all -> 0x00af, IOException -> 0x00bb
            r9 = 100
            boolean r12 = r12.compress(r8, r9, r7)     // Catch: all -> 0x00af, IOException -> 0x00bb
            if (r12 != 0) goto L_0x0098
            r7.flush()     // Catch: IOException -> 0x0097
            r7.close()     // Catch: IOException -> 0x0097
            r6.close()     // Catch: IOException -> 0x0097
        L_0x0097:
            return r1
        L_0x0098:
            r3.clear()     // Catch: all -> 0x00af, IOException -> 0x00bb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch: all -> 0x00af, IOException -> 0x00bb
            r3.put(r5, r12)     // Catch: all -> 0x00af, IOException -> 0x00bb
            r11.update(r2, r3, r4, r4)     // Catch: all -> 0x00af, IOException -> 0x00bb
            r7.flush()     // Catch: IOException -> 0x00ae
            r7.close()     // Catch: IOException -> 0x00ae
            r6.close()     // Catch: IOException -> 0x00ae
        L_0x00ae:
            return r0
        L_0x00af:
            r11 = move-exception
            r4 = r7
            goto L_0x00cc
        L_0x00b2:
            r11 = move-exception
            goto L_0x00cc
        L_0x00b4:
            r7 = r4
            goto L_0x00bb
        L_0x00b6:
            r11 = move-exception
            r6 = r4
            goto L_0x00cc
        L_0x00b9:
            r6 = r4
            r7 = r6
        L_0x00bb:
            r11.delete(r2, r4, r4)     // Catch: all -> 0x00af
            if (r7 == 0) goto L_0x00c6
            r7.flush()     // Catch: IOException -> 0x00cb
            r7.close()     // Catch: IOException -> 0x00cb
        L_0x00c6:
            if (r6 == 0) goto L_0x00cb
            r6.close()     // Catch: IOException -> 0x00cb
        L_0x00cb:
            return r1
        L_0x00cc:
            if (r4 == 0) goto L_0x00d4
            r4.flush()     // Catch: IOException -> 0x00d9
            r4.close()     // Catch: IOException -> 0x00d9
        L_0x00d4:
            if (r6 == 0) goto L_0x00d9
            r6.close()     // Catch: IOException -> 0x00d9
        L_0x00d9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.woe.g(android.content.Context, android.graphics.Bitmap):boolean");
    }
}
