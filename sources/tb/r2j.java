package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r2j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final y1r f27058a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f2r f27060a;

        public b(f2r f2rVar) {
            this.f27060a = f2rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            SQLiteDatabase sQLiteDatabase;
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                sQLiteDatabase = r2j.a(r2j.this).getWritableDatabase();
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("service_id", this.f27060a.d());
                    contentValues.put(y1r.COL_STREAM, this.f27060a.e());
                    contentValues.put(y1r.COL_SEQ, Integer.valueOf(this.f27060a.b()));
                    contentValues.put(y1r.COL_MSG_TIME, Long.valueOf(System.currentTimeMillis() / 1000));
                    contentValues.put("data", this.f27060a.c());
                    sQLiteDatabase.insert(y1r.TABLE_PRE_QUEUE, null, contentValues);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        pmo.b("PreQueueDBManager", "insert err", th, new Object[0]);
                    } finally {
                        f2d.a(sQLiteDatabase);
                    }
                }
            }
        }
    }

    static {
        t2o.a(343933188);
    }

    public r2j(Context context) {
        this.f27058a = new y1r(context);
    }

    public static /* synthetic */ y1r a(r2j r2jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y1r) ipChange.ipc$dispatch("1091b04f", new Object[]{r2jVar});
        }
        return r2jVar.f27058a;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd9241a", new Object[]{this, str});
        } else {
            yqt.b().execute(new a(str));
        }
    }

    public void c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fef0afd", new Object[]{this, str, str2, new Integer(i)});
        } else {
            yqt.b().execute(new c(str, str2, i));
        }
    }

    public void d(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc5490d", new Object[]{this, f2rVar});
        } else {
            yqt.b().execute(new b(f2rVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27059a;

        public a(String str) {
            this.f27059a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = r2j.a(r2j.this).getWritableDatabase();
            } finally {
                try {
                } finally {
                }
            }
            if (sQLiteDatabase != null) {
                long currentTimeMillis = (System.currentTimeMillis() - 604800000) / 1000;
                sQLiteDatabase.delete(y1r.TABLE_PRE_QUEUE, "msg_time<? or service_id!=?", new String[]{String.valueOf(currentTimeMillis), this.f27059a});
                pmo.c("PreQueueDBManager", "clean up db messages", "msg_time < ", Long.valueOf(currentTimeMillis), "keepServiceId", this.f27059a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27061a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public c(String str, String str2, int i) {
            this.f27061a = str;
            this.b = str2;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = r2j.a(r2j.this).getWritableDatabase();
            } finally {
                try {
                } finally {
                }
            }
            if (sQLiteDatabase != null) {
                pmo.c("PreQueueDBManager", "delete", "serviceId", this.f27061a, "streamId", this.b, "< endSeq", Integer.valueOf(this.c));
                StringBuilder sb = new StringBuilder("service_id = ? and seq < ?");
                if (!TextUtils.isEmpty(this.b)) {
                    sb.append(" and stream_id = ?");
                    sQLiteDatabase.delete(y1r.TABLE_PRE_QUEUE, sb.toString(), new String[]{this.f27061a, String.valueOf(this.c), this.b});
                } else {
                    sQLiteDatabase.delete(y1r.TABLE_PRE_QUEUE, sb.toString(), new String[]{this.f27061a, String.valueOf(this.c)});
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List, java.util.List<tb.f2r>] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<tb.f2r> e(java.lang.String r24, java.lang.String r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r2j.e(java.lang.String, java.lang.String, int, int):java.util.List");
    }
}
