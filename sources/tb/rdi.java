package tb;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import com.huawei.hms.adapter.internal.CommonCode;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class rdi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rdi INSTANCE = new rdi();

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f27296a = {"_id", "_data", "date_modified", "_display_name", "orientation"};
    public static final String[] b = {"_id", "_data", "date_modified", "duration", CommonCode.MapKey.HAS_RESOLUTION};
    public static final Set<String> c = kfp.f("screenshot", "截屏", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap");

    @JvmStatic
    public static final pei f(Activity activity, Uri uri, boolean z) {
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pei) ipChange.ipc$dispatch("b9c9b559", new Object[]{activity, uri, new Boolean(z)});
        }
        ckf.g(activity, "context");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        pei peiVar = null;
        try {
            if (z) {
                cursor = activity.getContentResolver().query(uri, b, null, null, null);
            } else {
                cursor = activity.getContentResolver().query(uri, f27296a, null, null, null);
            }
        } catch (Exception unused) {
            cursor = null;
        }
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                if (z) {
                    peiVar = INSTANCE.g(cursor);
                } else {
                    peiVar = INSTANCE.e(cursor);
                }
            }
            cursor.close();
        }
        return peiVar;
    }

    @JvmStatic
    public static final List<AlbumMediaItem> h(long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7aabd2f1", new Object[]{new Long(j)});
        }
        ArrayList arrayList = new ArrayList();
        if (j <= 0) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 29) {
                ContentResolver contentResolver = caa.c().getContentResolver();
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = f27296a;
                Bundle bundle = new Bundle();
                bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
                bundle.putInt("android:query-arg-sort-direction", 1);
                bundle.putInt("android:query-arg-limit", (int) j);
                xhv xhvVar = xhv.INSTANCE;
                cursor = contentResolver.query(uri, strArr, bundle, null);
            } else {
                cursor = caa.c().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f27296a, null, null, ckf.p("date_added DESC LIMIT ", Long.valueOf(j)));
            }
        } catch (Exception unused) {
        }
        if (cursor != null) {
            while (cursor.moveToNext() && i < j) {
                AlbumMediaItem d = INSTANCE.d(cursor);
                if (d != null) {
                    arrayList.add(d);
                    i++;
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    @JvmStatic
    public static final List<pei> i(Activity activity, boolean z, long j) {
        Uri uri;
        String[] strArr;
        Cursor cursor;
        pei peiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5250fb81", new Object[]{activity, new Boolean(z), new Long(j)});
        }
        ckf.g(activity, "context");
        ArrayList arrayList = new ArrayList();
        if (j <= 0) {
            return arrayList;
        }
        if (!z && wyn.INSTANCE.h()) {
            return arrayList;
        }
        if (z) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        if (z) {
            strArr = f27296a;
        } else {
            strArr = b;
        }
        try {
            cursor = activity.getContentResolver().query(uri, strArr, "date_added >= ?", new String[]{String.valueOf(j / 1000)}, "date_added DESC");
        } catch (Exception unused) {
            cursor = null;
        }
        if (cursor != null) {
            while (cursor.moveToNext()) {
                if (z) {
                    peiVar = INSTANCE.e(cursor);
                } else {
                    peiVar = INSTANCE.g(cursor);
                }
                if (peiVar != null) {
                    arrayList.add(peiVar);
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    public final boolean a(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8762471", new Object[]{this, peiVar})).booleanValue();
        }
        if (peiVar == null) {
            return false;
        }
        String g = peiVar.g();
        if (TextUtils.isEmpty(g)) {
            return false;
        }
        return new File(g).exists();
    }

    public final String b(pei peiVar) {
        String parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcc3df7e", new Object[]{this, peiVar});
        }
        if (peiVar == null || !a(peiVar) || (parent = new File(peiVar.g()).getParent()) == null) {
            return "";
        }
        return parent;
    }

    public final pei g(Cursor cursor) {
        String str;
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pei) ipChange.ipc$dispatch("62af7308", new Object[]{this, cursor});
        }
        try {
            str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            ckf.d(str);
            if (new File(str).exists()) {
                long j3 = 0;
                try {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    try {
                        j2 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
                        try {
                            j3 = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        j2 = 0;
                    }
                } catch (Exception unused4) {
                    j = 0;
                    j2 = 0;
                }
                return new pei(j, str, "", j2, j3, false);
            }
        }
        return null;
    }

    public final AlbumMediaItem d(Cursor cursor) {
        String str;
        long j;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlbumMediaItem) ipChange.ipc$dispatch("2a7599eb", new Object[]{this, cursor});
        }
        try {
            str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            ckf.d(str);
            if (new File(str).exists()) {
                long j2 = 0;
                try {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    try {
                        i = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
                        j2 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    j = 0;
                }
                AlbumMediaItem albumMediaItem = new AlbumMediaItem();
                String valueOf = String.valueOf(j);
                albumMediaItem.id = valueOf;
                albumMediaItem.imgFilePath = str;
                albumMediaItem.imgUri = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, valueOf);
                albumMediaItem.lastUpdateTime = String.valueOf(j2);
                albumMediaItem.orientation = String.valueOf(i);
                return albumMediaItem;
            }
        }
        return null;
    }

    public final pei e(Cursor cursor) {
        String str;
        long j;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pei) ipChange.ipc$dispatch("33f027e8", new Object[]{this, cursor});
        }
        try {
            str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            ckf.d(str);
            if (new File(str).exists()) {
                long j2 = 0;
                try {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    try {
                        i = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
                        j2 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    j = 0;
                }
                return new pei(j, str, i, j2, c(str));
            }
        }
        return null;
    }

    @JvmStatic
    public static final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6894e5", new Object[]{str})).booleanValue();
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            Locale locale = Locale.getDefault();
            ckf.f(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            ckf.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            for (String str2 : c) {
                if (wsq.O(lowerCase, str2, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        t2o.a(481297622);
    }
}
