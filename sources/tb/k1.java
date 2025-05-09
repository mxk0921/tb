package tb;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k1 extends y00<l1> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k1(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            tb.b55 r8 = new tb.b55
            if (r12 != 0) goto L_0x0009
            java.lang.String r12 = "monitor.db"
        L_0x0007:
            r2 = r12
            goto L_0x0010
        L_0x0009:
            java.lang.String r0 = "_monitor.db"
            java.lang.String r12 = r12.concat(r0)
            goto L_0x0007
        L_0x0010:
            java.lang.String r5 = tb.a55.b(r11)
            java.lang.String r6 = tb.a55.c(r11)
            java.lang.String r7 = tb.a55.a(r11)
            r3 = 0
            r4 = 3
            r0 = r8
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.<init>(r11, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.k1.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: t */
    public ContentValues f(l1 l1Var) {
        if (l1Var == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("strategy", Integer.valueOf(l1Var.c()));
        contentValues.put("timestamp", Long.valueOf(l1Var.d()));
        contentValues.put("content", l1Var.a());
        contentValues.put(RemoteMessageConst.URGENCY, Integer.valueOf(l1Var.m()));
        contentValues.put("upload_flag", Integer.valueOf(l1Var.f()));
        contentValues.put("upload_count", Integer.valueOf(l1Var.e()));
        return contentValues;
    }

    /* renamed from: u */
    public l1 m(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        l1 l1Var = new l1();
        l1Var.h(cursor.getLong(cursor.getColumnIndex("_id")));
        l1Var.i(cursor.getInt(cursor.getColumnIndex("strategy")));
        l1Var.g(cursor.getString(cursor.getColumnIndex("content")));
        l1Var.l(cursor.getInt(cursor.getColumnIndex("upload_flag")));
        l1Var.k(cursor.getInt(cursor.getColumnIndex("upload_count")));
        l1Var.j(cursor.getLong(cursor.getColumnIndex("timestamp")));
        l1Var.n(cursor.getInt(cursor.getColumnIndex(RemoteMessageConst.URGENCY)));
        return l1Var;
    }
}
