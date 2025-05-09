package tb;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.phenix.loader.file.UnSupportedSchemeException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d17 implements rc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17498a;

    static {
        t2o.a(620757110);
        t2o.a(620757111);
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68f9b12", new Object[]{new Boolean(z)});
        } else {
            f17498a = z;
        }
    }

    @Override // tb.rc9
    public t9o a(uuo uuoVar, String str, Map<String, String> map) throws IOException, Resources.NotFoundException, UnSupportedSchemeException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9o) ipChange.ipc$dispatch("de31fcc4", new Object[]{this, uuoVar, str, map});
        }
        int i2 = uuoVar.f29621a;
        if (i2 != 33) {
            if (i2 == 34) {
                Context b = s0m.B().b();
                if (b != null) {
                    InputStream proxy_open = AssetsDelegate.proxy_open(b.getResources().getAssets(), uuoVar.i);
                    return new t9o(proxy_open, proxy_open.available());
                }
                throw new IOException("Phenix.with(Context) hasn't been called before FileLoader(asset) loading");
            } else if (i2 == 36) {
                Context b2 = s0m.B().b();
                if (b2 != null) {
                    TypedValue typedValue = new TypedValue();
                    InputStream openRawResource = b2.getResources().openRawResource(uuoVar.j, typedValue);
                    return new t9o(openRawResource, openRawResource.available(), typedValue);
                }
                throw new IOException("Phenix.with(Context) hasn't been called before FileLoader(resource) loading");
            } else if (i2 == 40) {
                byte[] decode = Base64.decode(uuoVar.k, 0);
                return new t9o(decode, 0, decode.length);
            } else if (i2 == 48) {
                try {
                    return s0m.B().q().get(uuoVar.l).handleScheme(str);
                } catch (IndexOutOfBoundsException unused) {
                    throw new UnSupportedSchemeException(i2);
                }
            } else {
                throw new UnSupportedSchemeException(i2);
            }
        } else if (str.startsWith("content://")) {
            Context b3 = s0m.B().b();
            if (b3 != null) {
                InputStream openInputStream = b3.getContentResolver().openInputStream(Uri.parse(str));
                if (f17498a && Build.VERSION.SDK_INT >= 29 && ((i = uuoVar.m) == 1 || i == 3)) {
                    byte[] thumbnail = f1m.a(openInputStream).getThumbnail();
                    openInputStream.close();
                    openInputStream = (thumbnail == null || thumbnail.length <= 0) ? b3.getContentResolver().openInputStream(Uri.parse(str)) : new ByteArrayInputStream(thumbnail);
                }
                return new t9o(openInputStream, openInputStream.available());
            }
            throw new IOException("Phenix.with(Context) hasn't been called before FileLoader UriContent loading");
        } else {
            String str2 = uuoVar.i;
            int i3 = uuoVar.m;
            if (i3 == 1 || i3 == 3) {
                Context b4 = s0m.B().b();
                if (b4 != null) {
                    String b5 = b(b4, str2, uuoVar.m, false);
                    if (TextUtils.isEmpty(b5)) {
                        str2 = b(b4, str2, uuoVar.m, true);
                    } else {
                        str2 = b5;
                    }
                    if (TextUtils.isEmpty(str2) || !new File(str2).exists()) {
                        if (uuoVar.n) {
                            str2 = uuoVar.i;
                        } else {
                            throw new IOException("Retrieved thumbnail(type:" + uuoVar.m + ") failed from local path");
                        }
                    }
                } else {
                    throw new IOException("Phenix.with(Context) hasn't been called before FileLoader(thumbnail) loading");
                }
            }
            File file = new File(str2);
            return new t9o(new FileInputStream(file), (int) file.length());
        }
    }

    public String b(Context context, String str, int i, boolean z) {
        Uri uri;
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e02b32bf", new Object[]{this, context, str, new Integer(i), new Boolean(z)});
        }
        if (z) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(uri, new String[]{"_id"}, "_data=?", new String[]{str}, null);
        long j = -1;
        if (query != null) {
            if (query.moveToFirst()) {
                j = query.getInt(query.getColumnIndex("_id"));
            }
            query.close();
        }
        String str2 = null;
        if (j > 0) {
            if (z) {
                cursor = contentResolver.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, new String[]{"_data"}, "video_id=" + j + " AND kind=" + i, null, null);
            } else {
                cursor = MediaStore.Images.Thumbnails.queryMiniThumbnail(contentResolver, j, i, null);
            }
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    str2 = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                }
                cursor.close();
            }
        }
        return str2;
    }
}
