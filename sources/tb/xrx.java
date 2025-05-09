package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xrx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f31562a;
    public com.uploader.implement.a b;
    public ThreadPoolExecutor c;
    public ThreadPoolExecutor d;
    public final int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(xrx xrxVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "[aus_multi_phase_task_db]");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(xrx xrxVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "[aus_single_phase_task_db]");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31563a;
        public final /* synthetic */ oet b;

        public c(String str, oet oetVar) {
            this.f31563a = str;
            this.b = oetVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                lyx.a(this.f31563a).e(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lzd f31564a;
        public final /* synthetic */ String b;
        public final /* synthetic */ List c;

        public d(lzd lzdVar, String str, List list) {
            this.f31564a = lzdVar;
            this.b = str;
            this.c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f31564a.a(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31565a;
        public final /* synthetic */ oet b;

        public e(String str, oet oetVar) {
            this.f31565a = str;
            this.b = oetVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                lyx.a(this.f31565a).h(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final xrx f31566a;
        public final int b;
        public final Object[] c;

        public f(int i, xrx xrxVar, Object... objArr) {
            this.b = i;
            this.f31566a = xrxVar;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                switch (this.b) {
                    case 1:
                        xrx xrxVar = this.f31566a;
                        Object[] objArr = this.c;
                        xrx.o(xrxVar, (String) objArr[0], (z6e) objArr[1], ((Boolean) objArr[2]).booleanValue(), (kxx) this.c[3]);
                        break;
                    case 2:
                        xrx xrxVar2 = this.f31566a;
                        Object[] objArr2 = this.c;
                        xrx.r(xrxVar2, (String) objArr2[0], ((Boolean) objArr2[1]).booleanValue());
                        break;
                    case 3:
                        xrx xrxVar3 = this.f31566a;
                        Object[] objArr3 = this.c;
                        xrx.m(xrxVar3, (String) objArr3[0], ((Integer) objArr3[1]).intValue(), ((Long) this.c[2]).longValue(), null, ((Boolean) this.c[3]).booleanValue());
                        break;
                    case 4:
                        xrx xrxVar4 = this.f31566a;
                        Object[] objArr4 = this.c;
                        xrx.n(xrxVar4, (String) objArr4[0], (lzd) objArr4[1], (Handler) objArr4[2], ((Boolean) objArr4[3]).booleanValue());
                        break;
                    case 5:
                        xrx.l(this.f31566a);
                        break;
                    case 6:
                        xrx xrxVar5 = this.f31566a;
                        Object[] objArr5 = this.c;
                        xrx.q(xrxVar5, (String) objArr5[0], (lyx) objArr5[1], ((Boolean) objArr5[2]).booleanValue());
                        break;
                    case 7:
                        xrx xrxVar6 = this.f31566a;
                        Object[] objArr6 = this.c;
                        int intValue = ((Integer) objArr6[1]).intValue();
                        long longValue = ((Long) this.c[2]).longValue();
                        Object[] objArr7 = this.c;
                        xrx.m(xrxVar6, (String) objArr6[0], intValue, longValue, (lyx) objArr7[3], ((Boolean) objArr7[4]).booleanValue());
                        break;
                    case 8:
                        xrx xrxVar7 = this.f31566a;
                        Object[] objArr8 = this.c;
                        xrx.p(xrxVar7, (String) objArr8[0], (kxx) objArr8[1]);
                        break;
                    case 9:
                        xrx.A(this.f31566a);
                        break;
                }
            } catch (Throwable th) {
                if (rtx.d(16)) {
                    rtx.b(16, "TaskDbManager", "HandlerRunnable error, flag=" + this.b, th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final xrx f31567a = new xrx(null);

        public static /* synthetic */ xrx a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xrx) ipChange.ipc$dispatch("77994aa7", new Object[0]);
            }
            return f31567a;
        }
    }

    public /* synthetic */ xrx(a aVar) {
        this();
    }

    public static /* synthetic */ void A(xrx xrxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7972d9a2", new Object[]{xrxVar});
        } else {
            xrxVar.D();
        }
    }

    public static xrx d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xrx) ipChange.ipc$dispatch("77994aa7", new Object[0]);
        }
        return g.a();
    }

    public static /* synthetic */ void l(xrx xrxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9b1da1", new Object[]{xrxVar});
        } else {
            xrxVar.C();
        }
    }

    public static /* synthetic */ void m(xrx xrxVar, String str, int i, long j, lyx lyxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba68a2f", new Object[]{xrxVar, str, new Integer(i), new Long(j), lyxVar, new Boolean(z)});
        } else {
            xrxVar.u(str, i, j, lyxVar, z);
        }
    }

    public static /* synthetic */ void n(xrx xrxVar, String str, lzd lzdVar, Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5923d7d6", new Object[]{xrxVar, str, lzdVar, handler, new Boolean(z)});
        } else {
            xrxVar.v(str, lzdVar, handler, z);
        }
    }

    public static /* synthetic */ void o(xrx xrxVar, String str, z6e z6eVar, boolean z, kxx kxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb885ba", new Object[]{xrxVar, str, z6eVar, new Boolean(z), kxxVar});
        } else {
            xrxVar.w(str, z6eVar, z, kxxVar);
        }
    }

    public static /* synthetic */ void p(xrx xrxVar, String str, kxx kxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dbec33", new Object[]{xrxVar, str, kxxVar});
        } else {
            xrxVar.x(str, kxxVar);
        }
    }

    public static /* synthetic */ void q(xrx xrxVar, String str, lyx lyxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605a27f0", new Object[]{xrxVar, str, lyxVar, new Boolean(z)});
        } else {
            xrxVar.y(str, lyxVar, z);
        }
    }

    public static /* synthetic */ void r(xrx xrxVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8765709", new Object[]{xrxVar, str, new Boolean(z)});
        } else {
            xrxVar.z(str, z);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ThreadPoolExecutor s = s(false);
        if (s != null) {
            s.submit(new f(9, this, new Object[0]));
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f31562a.delete(b(true), "fileCreateTime < ?", new String[]{String.valueOf(System.currentTimeMillis() - (this.b.f14547a.n() * 1000))});
        }
    }

    public final String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    jSONObject.put(key, value);
                }
            }
        } catch (Exception e2) {
            if (rtx.d(16)) {
                rtx.b(16, "TaskDbManager", this.e + " mapToJson error.", e2);
            }
        }
        return jSONObject.toString();
    }

    public final String b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "multi_phase_resume_task";
        }
        return "single_phase_task";
    }

    public final Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (Exception e2) {
            if (rtx.d(16)) {
                rtx.b(16, "TaskDbManager", this.e + " jsonToMap error.", e2);
            }
        }
        return hashMap;
    }

    public void e(Context context, com.uploader.implement.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd02a0a", new Object[]{this, context, aVar});
            return;
        }
        if (rtx.d(4)) {
            rtx.a(4, "TaskDbManager", this.e + " initialize.");
        }
        this.b = aVar;
        this.f31562a = new nxx(context, "aus_uploader.db").getWritableDatabase();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingQueue(1024), new a(this));
        this.d = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingQueue(1024), new b(this));
        this.c.allowCoreThreadTimeOut(true);
        this.d.allowCoreThreadTimeOut(true);
    }

    public void f(String str, int i, long j, lyx lyxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d731e48", new Object[]{this, str, new Integer(i), new Long(j), lyxVar, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor s = s(z);
        if (s != null) {
            s.submit(new f(7, this, str, Integer.valueOf(i), Long.valueOf(j), lyxVar, Boolean.valueOf(z)));
        }
    }

    public void g(String str, lzd lzdVar, Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eec865d", new Object[]{this, str, lzdVar, handler, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor s = s(z);
        if (s != null) {
            s.submit(new f(4, this, str, lzdVar, handler, Boolean.valueOf(z)));
        }
    }

    public void h(String str, z6e z6eVar, boolean z, kxx kxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502ff301", new Object[]{this, str, z6eVar, new Boolean(z), kxxVar});
            return;
        }
        ThreadPoolExecutor s = s(z);
        if (s != null) {
            s.submit(new f(1, this, str, z6eVar, Boolean.valueOf(z), kxxVar));
        }
    }

    public void i(String str, kxx kxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8ff0fa", new Object[]{this, str, kxxVar});
            return;
        }
        ThreadPoolExecutor s = s(true);
        if (s != null) {
            s.submit(new f(8, this, str, kxxVar));
        }
    }

    public void j(String str, lyx lyxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83eee49", new Object[]{this, str, lyxVar, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor s = s(z);
        if (s != null) {
            s.submit(new f(6, this, str, lyxVar, Boolean.valueOf(z)));
        }
    }

    public void k(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor s = s(z);
        if (s != null) {
            s.submit(new f(2, this, str, Boolean.valueOf(z)));
        }
    }

    public final ThreadPoolExecutor s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("8d4317eb", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return this.c;
        }
        return this.d;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ThreadPoolExecutor s = s(true);
        if (s != null) {
            s.submit(new f(5, this, new Object[0]));
        }
    }

    public final void u(String str, int i, long j, lyx lyxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778e9ce7", new Object[]{this, str, new Integer(i), new Long(j), lyxVar, new Boolean(z)});
            return;
        }
        String b2 = b(z);
        ContentValues contentValues = new ContentValues();
        contentValues.put("progress", Integer.valueOf(i));
        contentValues.put("resumeOffset", Long.valueOf(j));
        contentValues.put("uploadStat", lyxVar.j());
        int update = this.f31562a.update(b2, contentValues, "fileId = ?", new String[]{str});
        if (update <= 0 && rtx.d(16)) {
            rtx.a(16, "TaskDbManager", this.e + " DB doUpdateProgress fail. fileId: " + str + ", result: " + update);
        }
    }

    public final void x(String str, kxx kxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88caa27b", new Object[]{this, str, kxxVar});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("phaseIndex", Integer.valueOf(kxxVar.p));
        contentValues.put("md5", kxxVar.g);
        int update = this.f31562a.update("multi_phase_resume_task", contentValues, "fileId = ?", new String[]{str});
        if (update <= 0 && rtx.d(16)) {
            rtx.a(16, "TaskDbManager", this.e + " DB doUpdateTaskPhaseIndex fail. fileId: " + str + ", result: " + update);
        }
    }

    public final void y(String str, lyx lyxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361788a8", new Object[]{this, str, lyxVar, new Boolean(z)});
            return;
        }
        String b2 = b(z);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uploadStat", lyxVar.j());
        int update = this.f31562a.update(b2, contentValues, "fileId = ?", new String[]{str});
        if (update <= 0 && rtx.d(16)) {
            rtx.a(16, "TaskDbManager", this.e + " DB doUpdateUploadStat fail. fileId: " + str + ", result: " + update);
        }
    }

    public final void z(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        int delete = this.f31562a.delete(b(z), "fileId = ?", new String[]{str});
        if (delete <= 0 && rtx.d(16)) {
            rtx.a(16, "TaskDbManager", this.e + " DB doDelete fail. fileId: " + str + ", result: " + delete);
        }
    }

    public xrx() {
        this.e = hashCode();
    }

    public final void w(String str, z6e z6eVar, boolean z, kxx kxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3937b802", new Object[]{this, str, z6eVar, new Boolean(z), kxxVar});
            return;
        }
        String b2 = b(z);
        Cursor query = this.f31562a.query(b2, null, "fileId = ?", new String[]{str}, null, null, null);
        if (query == null || query.getCount() <= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(tep.KEY_TP_RETURN_VIDEO_FILE_ID, str);
            contentValues.put("bizType", z6eVar.getBizType());
            contentValues.put("filePath", z6eVar.getFilePath());
            contentValues.put(v4s.PARAM_UPLOAD_FILE_TYPE, z6eVar.getFileType());
            if (z6eVar.getMetaInfo() != null) {
                contentValues.put("metaInfo", a(z6eVar.getMetaInfo()));
            }
            contentValues.put("resumeOffset", (Integer) 0);
            contentValues.put("progress", (Integer) 0);
            contentValues.put("fileCreateTime", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("env", Integer.valueOf(this.b.b.a().f31379a));
            contentValues.put("phaseIndex", (Integer) 0);
            if (kxxVar != null) {
                contentValues.put("md5", kxxVar.g);
            }
            if (this.f31562a.insert(b2, null, contentValues) == -1 && rtx.d(16)) {
                rtx.a(16, "TaskDbManager", this.e + " DB doInsert fail. fileId: " + str + ", task: " + z6eVar.hashCode());
                return;
            }
            return;
        }
        if (rtx.d(16)) {
            rtx.a(16, "TaskDbManager", this.e + " DB has this record. fileId: " + str + ", task: " + z6eVar.hashCode());
        }
        query.close();
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String b2 = b(false);
        Cursor query = this.f31562a.query(b2, null, "env=?", new String[]{String.valueOf(this.b.b.a().f31379a)}, null, null, null);
        int columnIndex = query.getColumnIndex(tep.KEY_TP_RETURN_VIDEO_FILE_ID);
        int columnIndex2 = query.getColumnIndex("bizType");
        int columnIndex3 = query.getColumnIndex("filePath");
        int columnIndex4 = query.getColumnIndex(v4s.PARAM_UPLOAD_FILE_TYPE);
        int columnIndex5 = query.getColumnIndex("metaInfo");
        int columnIndex6 = query.getColumnIndex("progress");
        int columnIndex7 = query.getColumnIndex("resumeOffset");
        int columnIndex8 = query.getColumnIndex("uploadStat");
        int columnIndex9 = query.getColumnIndex("phaseIndex");
        while (query.moveToNext()) {
            String string = query.getString(columnIndex2);
            String string2 = query.getString(columnIndex);
            String string3 = query.getString(columnIndex3);
            String string4 = query.getString(columnIndex4);
            String string5 = query.getString(columnIndex5);
            int i = query.getInt(columnIndex6);
            long j = query.getLong(columnIndex7);
            String string6 = query.getString(columnIndex8);
            ewx.a(new e(string6, new oet(string, string3, string4, c(string5), string2, j, i, string6, query.getInt(columnIndex9))));
            columnIndex = columnIndex;
        }
        query.close();
        this.f31562a.delete(b2, "env=?", new String[]{String.valueOf(this.b.b.a().f31379a)});
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0220 A[Catch: all -> 0x0210, TRY_LEAVE, TryCatch #8 {all -> 0x0210, blocks: (B:7:0x004c, B:64:0x021a, B:66:0x0220), top: B:92:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r35, tb.lzd r36, android.os.Handler r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xrx.v(java.lang.String, tb.lzd, android.os.Handler, boolean):void");
    }
}
