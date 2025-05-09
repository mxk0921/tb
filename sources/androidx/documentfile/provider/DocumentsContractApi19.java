package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DocumentsContractApi19 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    private DocumentsContractApi19() {
    }

    public static boolean canRead(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd42950", new Object[]{context, uri})).booleanValue();
        }
        if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(getRawType(context, uri))) {
            return true;
        }
        return false;
    }

    private static void closeQuietly(AutoCloseable autoCloseable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8532ddc2", new Object[]{autoCloseable});
        } else if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long getFlags(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7eaccd4b", new Object[]{context, uri})).longValue();
        }
        return queryForLong(context, uri, "flags", 0L);
    }

    public static String getName(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("435e4bf9", new Object[]{context, uri});
        }
        return queryForString(context, uri, "_display_name", null);
    }

    private static String getRawType(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a46ae4e", new Object[]{context, uri});
        }
        return queryForString(context, uri, "mime_type", null);
    }

    public static String getType(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("479a5d6a", new Object[]{context, uri});
        }
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static boolean isDirectory(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88db296d", new Object[]{context, uri})).booleanValue();
        }
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static long lastModified(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adf8bb79", new Object[]{context, uri})).longValue();
        }
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c82016a0", new Object[]{context, uri})).longValue();
        }
        return queryForLong(context, uri, "_size", 0L);
    }

    private static int queryForInt(Context context, Uri uri, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99473ad8", new Object[]{context, uri, str, new Integer(i)})).intValue();
        }
        return (int) queryForLong(context, uri, str, i);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a48424cb", new Object[]{context, uri, str, new Long(j)})).longValue();
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (!cursor.moveToFirst() || cursor.isNull(0)) {
                return j;
            }
            return cursor.getLong(0);
        } catch (Exception e) {
            new StringBuilder("Failed query: ").append(e);
            return j;
        } finally {
            closeQuietly(cursor);
        }
    }

    private static String queryForString(Context context, Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5a583f4", new Object[]{context, uri, str, str2});
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (!cursor.moveToFirst() || cursor.isNull(0)) {
                return str2;
            }
            return cursor.getString(0);
        } catch (Exception e) {
            new StringBuilder("Failed query: ").append(e);
            return str2;
        } finally {
            closeQuietly(cursor);
        }
    }

    public static boolean exists(Context context, Uri uri) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8e9b1a6", new Object[]{context, uri})).booleanValue();
        }
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
            if (cursor.getCount() <= 0) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            new StringBuilder("Failed query: ").append(e);
            return false;
        } finally {
            closeQuietly(cursor);
        }
    }

    public static boolean isFile(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdffa590", new Object[]{context, uri})).booleanValue();
        }
        String rawType = getRawType(context, uri);
        return !"vnd.android.document/directory".equals(rawType) && !TextUtils.isEmpty(rawType);
    }

    public static boolean isVirtual(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbae2b0b", new Object[]{context, uri})).booleanValue();
        }
        return DocumentsContract.isDocumentUri(context, uri) && (getFlags(context, uri) & 512) != 0;
    }

    public static boolean canWrite(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73603df9", new Object[]{context, uri})).booleanValue();
        }
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int queryForInt = queryForInt(context, uri, "flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((queryForInt & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(rawType) || (queryForInt & 8) == 0) {
            return !TextUtils.isEmpty(rawType) && (queryForInt & 2) != 0;
        }
        return true;
    }
}
