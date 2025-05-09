package com.alibaba.ability.impl.photo;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.a;
import tb.ckf;
import tb.iih;
import tb.jpu;
import tb.lw3;
import tb.nh9;
import tb.ph9;
import tb.ryp;
import tb.sm8;
import tb.t2o;
import tb.xhv;
import tb.y1m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PhotoTool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PhotoTool INSTANCE = new PhotoTool();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f2016a = a.j(jpu.a(ryp.FILE_TYPE_IMAGE_JPG, "image/jpeg"), jpu.a("jpeg", "image/jpeg"), jpu.a("png", Constants.SHARETYPE_WITH_QRCODE), jpu.a("gif", "image/gif"), jpu.a("bmp", "image/bmp"), jpu.a("webp", "image/webp"), jpu.a("image", "image/*"), jpu.a(ryp.FILE_TYPE_VIDEO_MP4, "video/mp4"), jpu.a("3gp", "video/3gpp"), jpu.a("mkv", "video/x-matroska"), jpu.a("webm", "video/webm"), jpu.a("video", "video/*"));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum PhotoType {
        IMAGE,
        VIDEO;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PhotoType photoType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/photo/PhotoTool$PhotoType");
        }

        public static PhotoType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("2ce08740", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(PhotoType.class, str);
            }
            return (PhotoType) valueOf;
        }
    }

    public final String b(String str, PhotoType photoType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ba20a48", new Object[]{this, str, photoType});
        }
        Map<String, String> map = f2016a;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            ckf.f(lowerCase, "(this as java.lang.String).toLowerCase()");
            String str2 = map.get(lowerCase);
            if (str2 != null) {
                return str2;
            }
            if (photoType == PhotoType.IMAGE) {
                return "image/*";
            }
            return "video/*";
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARN: Finally extract failed */
    public final void c(Context context, byte[] bArr, String str, PhotoType photoType) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549463cf", new Object[]{this, context, bArr, str, photoType});
        } else if (Build.VERSION.SDK_INT < 29) {
            String b = b(str, photoType);
            if (photoType == PhotoType.IMAGE) {
                str2 = Environment.DIRECTORY_PICTURES;
            } else {
                str2 = Environment.DIRECTORY_MOVIES;
            }
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str2);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            File file = new File(externalStoragePublicDirectory, UUID.randomUUID() + '.' + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                xhv xhvVar = xhv.INSTANCE;
                lw3.a(fileOutputStream, null);
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{b}, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    lw3.a(fileOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    public final Pair<Boolean, String> d(Context context, String str, PhotoType photoType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e4b4cb00", new Object[]{this, context, str, photoType});
        }
        ckf.g(context, "context");
        ckf.g(str, "path");
        ckf.g(photoType, "type");
        try {
            File file = new File(str);
            if (!file.exists()) {
                return new Pair<>(Boolean.FALSE, "file not exists, path: ".concat(str));
            }
            if (!file.isFile()) {
                return new Pair<>(Boolean.FALSE, "not a file, path: ".concat(str));
            }
            if (Build.VERSION.SDK_INT >= 29) {
                f(context, nh9.a(file), ph9.g(file), photoType);
            } else {
                c(context, nh9.a(file), ph9.g(file), photoType);
            }
            return new Pair<>(Boolean.TRUE, null);
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a(y1m.TAG_IMG, "save file: " + str + " to album fail: " + sm8.b(th));
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, "save file: " + str + " to album fail: " + th.getMessage());
        }
    }

    public final Pair<Boolean, String> e(Context context, byte[] bArr, String str, PhotoType photoType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("3eb64987", new Object[]{this, context, bArr, str, photoType});
        }
        ckf.g(context, "context");
        ckf.g(bArr, "data");
        ckf.g(str, "dataType");
        ckf.g(photoType, "type");
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                f(context, bArr, str, photoType);
            } else {
                c(context, bArr, str, photoType);
            }
            return new Pair<>(Boolean.TRUE, null);
        } catch (Throwable th) {
            iih.INSTANCE.a(y1m.TAG_IMG, "save to album fail: ".concat(sm8.b(th)));
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, "save to album fail: " + th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.ability.impl.photo.PhotoTool.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "a66c1896"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r9
            r3[r0] = r10
            java.lang.Object r10 = r1.ipc$dispatch(r2, r3)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x0018:
            java.lang.String r1 = "url"
            tb.ckf.g(r10, r1)
            r1 = 0
            java.lang.CharSequence r10 = tb.wsq.Q0(r10)     // Catch: all -> 0x005f
            java.lang.String r10 = r10.toString()     // Catch: all -> 0x005f
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: all -> 0x005f
            java.lang.String r2 = "Uri.parse(url.trim())"
            tb.ckf.f(r10, r2)     // Catch: all -> 0x005f
            java.lang.String r10 = r10.getPath()     // Catch: all -> 0x005f
            if (r10 == 0) goto L_0x0061
            java.lang.String r4 = "."
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r10
            int r2 = tb.wsq.e0(r3, r4, r5, r6, r7, r8)     // Catch: all -> 0x005f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: all -> 0x005f
            int r3 = r2.intValue()     // Catch: all -> 0x005f
            r4 = -1
            if (r3 == r4) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            if (r2 == 0) goto L_0x0061
            int r2 = r2.intValue()     // Catch: all -> 0x005f
            int r2 = r2 + r0
            java.lang.String r10 = r10.substring(r2)     // Catch: all -> 0x005f
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            tb.ckf.f(r10, r0)     // Catch: all -> 0x005f
            goto L_0x0062
        L_0x005f:
            r10 = move-exception
            goto L_0x0067
        L_0x0061:
            r10 = r1
        L_0x0062:
            java.lang.Object r10 = kotlin.Result.m1108constructorimpl(r10)     // Catch: all -> 0x005f
            goto L_0x006f
        L_0x0067:
            java.lang.Object r10 = kotlin.b.a(r10)
            java.lang.Object r10 = kotlin.Result.m1108constructorimpl(r10)
        L_0x006f:
            boolean r0 = kotlin.Result.m1114isFailureimpl(r10)
            if (r0 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r1 = r10
        L_0x0077:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.photo.PhotoTool.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable, java.lang.String, java.lang.String[]] */
    public final void f(Context context, byte[] bArr, String str, PhotoType photoType) {
        Uri uri;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc4c671", new Object[]{this, context, bArr, str, photoType});
            return;
        }
        String b = b(str, photoType);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", b);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (photoType == PhotoType.IMAGE) {
                str2 = Environment.DIRECTORY_PICTURES;
            } else {
                str2 = Environment.DIRECTORY_MOVIES;
            }
            contentValues.put("relative_path", str2);
            contentValues.put("is_pending", (Integer) 1);
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (photoType == PhotoType.IMAGE) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        Uri insert = contentResolver.insert(uri, contentValues);
        if (insert != null) {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
            th = 0;
            if (openOutputStream != null) {
                try {
                    openOutputStream.write(bArr);
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        lw3.a(openOutputStream, th);
                    }
                }
            }
            if (i >= 29) {
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                context.getContentResolver().update(insert, contentValues, th, th);
            }
        }
    }

    static {
        t2o.a(126877725);
    }
}
