package tb;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s2r {

    /* renamed from: a  reason: collision with root package name */
    public static final String f27767a = "taobao";
    public static final String b = "taobao_display_default_account";
    public static final String c = "com.android.exchange";
    public static final String d = "淘宝日历";
    public static final String e = "content://com.android.calendar/calendars";

    public final long a(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", f27767a);
        String str = b;
        contentValues.put("account_name", str);
        String str2 = c;
        contentValues.put("account_type", str2);
        contentValues.put("calendar_displayName", d);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", Integer.valueOf((int) tkt.DEFAULT_LINK_COLOR));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", str);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri insert = context.getContentResolver().insert(Uri.parse(e).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", str).appendQueryParameter("account_type", str2).build(), contentValues);
        if (insert == null) {
            return -1L;
        }
        return ContentUris.parseId(insert);
    }

    public int b(Context context) {
        int c2 = c(context);
        if (c2 >= 0) {
            return c2;
        }
        if (a(context) >= 0) {
            return c(context);
        }
        return -1;
    }

    public final int c(Context context) {
        Cursor query = context.getContentResolver().query(Uri.parse(e), null, null, null, null);
        if (query == null) {
            if (query != null) {
            }
            return -1;
        }
        try {
            if (query.getCount() <= 0) {
                return -1;
            }
            query.moveToFirst();
            return query.getInt(query.getColumnIndex("_id"));
        } finally {
            query.close();
        }
    }

    static {
        t2o.a(693108755);
    }
}
