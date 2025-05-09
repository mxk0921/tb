package tb;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jp6 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22141a;

    public jp6(Context context) {
        this.f22141a = context;
    }

    public boolean a(int i, String str, ContentValues[] contentValuesArr) {
        Uri uri;
        int bulkInsert;
        if (i == 6) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_" + str);
        } else if (i != 7) {
            uri = null;
        } else {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/STATISTICS_" + str);
        }
        if (uri == null) {
            return false;
        }
        try {
            bulkInsert = this.f22141a.getContentResolver().bulkInsert(uri, contentValuesArr);
            new StringBuilder("insert:").append(bulkInsert);
        } catch (Exception unused) {
            Log.e("VMS_SDK_DB", "return insert is error");
        }
        return bulkInsert != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        if (r8 != null) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r8 == null) goto L_0x009f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x005c
            r1 = 1
            if (r8 == r1) goto L_0x0049
            r1 = 2
            if (r8 == r1) goto L_0x0036
            r1 = 3
            if (r8 == r1) goto L_0x002f
            r1 = 4
            if (r8 == r1) goto L_0x001c
            r9 = 5
            if (r8 == r9) goto L_0x0014
            r2 = r0
            goto L_0x0063
        L_0x0014:
            java.lang.String r8 = "content://com.vivo.abe.exidentifier/guid"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L_0x001a:
            r2 = r8
            goto L_0x0063
        L_0x001c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x001a
        L_0x002f:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/UDID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x001a
        L_0x0036:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x001a
        L_0x0049:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x001a
        L_0x005c:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x001a
        L_0x0063:
            if (r2 != 0) goto L_0x0066
            return r0
        L_0x0066:
            android.content.Context r8 = r7.f22141a     // Catch: all -> 0x0091, Exception -> 0x0093
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: all -> 0x0091, Exception -> 0x0093
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: all -> 0x0091, Exception -> 0x0093
            if (r8 == 0) goto L_0x008b
            boolean r9 = r8.moveToNext()     // Catch: all -> 0x0088, Exception -> 0x0094
            if (r9 == 0) goto L_0x008b
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)     // Catch: all -> 0x0088, Exception -> 0x0094
            java.lang.String r0 = r8.getString(r9)     // Catch: all -> 0x0088, Exception -> 0x0094
            goto L_0x008b
        L_0x0088:
            r9 = move-exception
            r0 = r8
            goto L_0x00a0
        L_0x008b:
            if (r8 == 0) goto L_0x009f
        L_0x008d:
            r8.close()
            goto L_0x009f
        L_0x0091:
            r9 = move-exception
            goto L_0x00a0
        L_0x0093:
            r8 = r0
        L_0x0094:
            java.lang.String r9 = "VMS_SDK_DB"
            java.lang.String r1 = "return cursor is error"
            android.util.Log.e(r9, r1)     // Catch: all -> 0x0088
            if (r8 == 0) goto L_0x009f
            goto L_0x008d
        L_0x009f:
            return r0
        L_0x00a0:
            if (r0 == 0) goto L_0x00a5
            r0.close()
        L_0x00a5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jp6.b(int, java.lang.String):java.lang.String");
    }
}
