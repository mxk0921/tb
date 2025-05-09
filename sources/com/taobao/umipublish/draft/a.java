package com.taobao.umipublish.draft;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ali.alidatabasees.CallableStatement;
import com.ali.alidatabasees.Database;
import com.ali.alidatabasees.PreparedStatement;
import com.ali.alidatabasees.Result;
import com.ali.alidatabasees.ResultSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftModel;
import com.taobao.umipublish.draft.b;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.cg9;
import tb.dw7;
import tb.f7l;
import tb.odg;
import tb.t2o;
import tb.ydv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] e = {"guangguang", "guangguang_asyncpublish"};
    public final Context b;
    public final DraftMediaHelper c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Database> f13981a = new HashMap();
    public final Map<String, Collection<DraftModel>> d = new HashMap();

    static {
        t2o.a(944766984);
        t2o.a(944767000);
    }

    public a(Context context) {
        this.b = context;
        this.c = new DraftMediaHelper(context);
    }

    public final DraftModel a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("4c5ccaae", new Object[]{this, bArr});
        }
        DraftModel parseFromJsonString = DraftModel.parseFromJsonString(new String(bArr));
        if (m(parseFromJsonString)) {
            return this.c.a(parseFromJsonString);
        }
        return parseFromJsonString;
    }

    public synchronized b.a b(String str, String str2, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("62255bdd", new Object[]{this, str, str2, collection});
        } else if (f(str, str2)) {
            Collection<DraftModel> p = p(str, str2, collection);
            if (p != null && !p.isEmpty()) {
                return d(str, str2, p);
            }
            UmiPublishMonitor.B("DbDraftStore", "delete draft, but draft is empty, biz:" + str + ", userId:" + str2);
            return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
        } else {
            UmiPublishMonitor.B("DbDraftStore", "ensureTable error, biz:" + str + ", userId:" + str2);
            return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
        }
    }

    public final String e(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("498194de", new Object[]{this, collection});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append("'");
            sb.append(str);
            sb.append("',");
        }
        if (collection.size() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public final String h(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86ef5e9d", new Object[]{this, str, str2, new Long(j)});
        }
        return str + "_" + str2 + "_" + j;
    }

    public final byte[] i(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8d90c08e", new Object[]{this, draftModel});
        }
        return draftModel.toString().getBytes();
    }

    public final synchronized Collection<DraftModel> n(PreparedStatement preparedStatement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("3f05d2bc", new Object[]{this, preparedStatement});
        } else if (preparedStatement == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            UmiPublishMonitor.B("DbDraftStore", "queryAndConvert start.");
            ResultSet c = preparedStatement.c();
            UmiPublishMonitor.B("DbDraftStore", "queryAndConvert end.");
            if (c != null) {
                while (c.i()) {
                    arrayList.add(a(c.c(3)));
                }
            }
            return arrayList;
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef17cb34", new Object[]{this});
            return;
        }
        File a2 = dw7.a(dw7.CACHE_DRAFT_PATH);
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        String str = File.separator;
        sb.append(str);
        sb.append("umi_draft.db");
        cg9.i(sb.toString());
        cg9.i(a2 + str + "umi_draft.db-shm");
        cg9.i(a2 + str + "umi_draft.db-wal");
    }

    public synchronized void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        try {
            if (!((HashMap) this.f13981a).isEmpty()) {
                for (Database database : ((HashMap) this.f13981a).values()) {
                    database.b();
                }
            }
            ((HashMap) this.f13981a).clear();
        } catch (Throwable unused) {
        }
    }

    public synchronized b.a c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("bb9c5a77", new Object[]{this, str, str2});
        }
        if (f(str, str2)) {
            Collection<DraftModel> q = q(str, str2);
            CallableStatement c = ((Database) ((HashMap) this.f13981a).get(str)).c("delete from " + str + "_" + str2);
            if (c == null) {
                return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
            }
            UmiPublishMonitor.B("DbDraftStore", "deleteAll start.");
            Result d = c.d();
            UmiPublishMonitor.B("DbDraftStore", "deleteAll start.");
            if (d != null) {
                odg.b(DraftManager.TAG, "deleteAll success:  biz = " + str + ", userId = " + str2);
                if (this.c.f(q)) {
                    return new b.a(true);
                }
            }
        }
        return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    public final synchronized b.a d(String str, String str2, Collection<DraftModel> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("7fd9e1af", new Object[]{this, str, str2, collection});
        }
        ArrayList arrayList = new ArrayList();
        for (DraftModel draftModel : collection) {
            arrayList.add(draftModel.draftId);
        }
        String e2 = e(arrayList);
        CallableStatement c = ((Database) ((HashMap) this.f13981a).get(str)).c("delete from " + str + "_" + str2 + " where draftId in (" + e2 + f7l.BRACKET_END_STR);
        if (c == null) {
            UmiPublishMonitor.B("DbDraftStore", "delete draft, but statement is empty, biz:" + str + ", userId:" + str2);
            return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
        }
        UmiPublishMonitor.B("DbDraftStore", "deleteDrafts start.");
        Result d = c.d();
        UmiPublishMonitor.B("DbDraftStore", "deleteDrafts end");
        if (d != null) {
            odg.b(DraftManager.TAG, "delete success:  biz = " + str + ", userId = " + str2 + ", deleted = " + Arrays.toString(arrayList.toArray()));
            if (this.c.f(collection)) {
                return new b.a(true);
            }
            UmiPublishMonitor.B("DbDraftStore", "delete draft, deleteMediasOfDraft failed, biz:" + str + ", userId:" + str2);
        } else {
            UmiPublishMonitor.B("DbDraftStore", "delete draft, result is empty, biz:" + str + ", userId:" + str2);
        }
        return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    public synchronized int g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("792509f2", new Object[]{this, str, str2})).intValue();
        }
        if (f(str, str2)) {
            PreparedStatement e2 = ((Database) ((HashMap) this.f13981a).get(str)).e("select count(1) from " + str + "_" + str2);
            if (e2 == null) {
                return 0;
            }
            UmiPublishMonitor.B("DbDraftStore", "getDraftCount start.");
            ResultSet c = e2.c();
            UmiPublishMonitor.B("DbDraftStore", "getDraftCount end.");
            if (c != null && c.i()) {
                int d = c.d(0);
                odg.b(DraftManager.TAG, "query draft count: " + d);
                return d;
            }
        }
        return 0;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31aa6a74", new Object[]{this})).booleanValue();
        }
        File a2 = dw7.a(dw7.CACHE_DRAFT_PATH);
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        String str = File.separator;
        sb.append(str);
        sb.append("umi_draft.db");
        if (!cg9.l(sb.toString())) {
            return false;
        }
        if (!cg9.l(a2 + str + "umi_draft.db-shm")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a2);
        sb2.append(str);
        sb2.append("umi_draft.db-wal");
        return cg9.l(sb2.toString());
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f37c2", new Object[]{this})).booleanValue();
        }
        File b = dw7.b(dw7.CACHE_DRAFT_PATH);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        String str = File.separator;
        sb.append(str);
        sb.append("umi_draft.db");
        if (!cg9.l(sb.toString())) {
            return false;
        }
        if (!cg9.l(b + str + "umi_draft.db-shm")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b);
        sb2.append(str);
        sb2.append("umi_draft.db-wal");
        return cg9.l(sb2.toString());
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb41d505", new Object[]{this})).booleanValue();
        }
        File a2 = dw7.a(dw7.CACHE_DRAFT_PATH);
        File b = dw7.b(dw7.CACHE_DRAFT_PATH);
        String[] strArr = {"umi_draft.db", "umi_draft.db-shm", "umi_draft.db-wal"};
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(str);
            String sb2 = sb.toString();
            String str3 = b + str2 + str;
            String str4 = b + str2 + "temp_" + str;
            if (!cg9.f(sb2, str4) || !cg9.n(new File(sb2), new File(str4)) || !new File(str4).renameTo(new File(str3))) {
                return false;
            }
        }
        odg.c("DbDraftStore", "move db to internal store. cost: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        return true;
    }

    public final boolean m(DraftModel draftModel) {
        DraftModel.Meta meta;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6746a98", new Object[]{this, draftModel})).booleanValue();
        }
        return draftModel != null && (meta = draftModel.meta) != null && !TextUtils.equals(meta.mode, "lite") && !TextUtils.equals(draftModel.meta.mode, "quick");
    }

    public synchronized DraftModel o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("4f982056", new Object[]{this, str, str2, str3});
        }
        DraftModel draftModel = null;
        if (!f(str, str2)) {
            return null;
        }
        PreparedStatement e2 = ((Database) ((HashMap) this.f13981a).get(str)).e("select * from " + str + "_" + str2 + " where draftId = ?");
        if (e2 == null) {
            return null;
        }
        e2.i(1, str3);
        Collection<DraftModel> n = n(e2);
        if (n == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(n);
        if (!arrayList.isEmpty()) {
            draftModel = (DraftModel) arrayList.get(0);
        }
        if (draftModel != null) {
            odg.b(DraftManager.TAG, "read success:  biz = " + str + ", userId = " + str2 + ", result = " + draftModel.toString());
        }
        return draftModel;
    }

    public synchronized Collection<DraftModel> p(String str, String str2, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("79758565", new Object[]{this, str, str2, collection});
        } else if (f(str, str2)) {
            String e2 = e(collection);
            PreparedStatement e3 = ((Database) ((HashMap) this.f13981a).get(str)).e("select * from " + str + "_" + str2 + " where draftId in (" + e2 + f7l.BRACKET_END_STR);
            if (e3 == null) {
                UmiPublishMonitor.B("DbDraftStore", "queryStatement is empty");
                return null;
            }
            Collection<DraftModel> n = n(e3);
            odg.b(DraftManager.TAG, "readAll success:  biz = " + str + ", userId = " + str2 + ", result = " + Arrays.toString(n.toArray()));
            return n;
        } else {
            UmiPublishMonitor.B("DbDraftStore", "ensureTable failed.");
            return null;
        }
    }

    public synchronized Collection<DraftModel> q(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("fbfd7141", new Object[]{this, str, str2});
        } else if (!f(str, str2)) {
            return null;
        } else {
            Collection<DraftModel> n = n(((Database) ((HashMap) this.f13981a).get(str)).e("select * from " + str + "_" + str2 + " order by mTime desc"));
            StringBuilder sb = new StringBuilder("readAll success:  biz = ");
            sb.append(str);
            sb.append(", userId = ");
            sb.append(str2);
            sb.append(", result = ");
            if (n == null) {
                str3 = "null";
            } else {
                str3 = Arrays.toString(n.toArray());
            }
            sb.append(str3);
            odg.b(DraftManager.TAG, sb.toString());
            return n;
        }
    }

    public synchronized DraftModel r(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("53895ebc", new Object[]{this, str, str2});
        }
        if (f(str, str2)) {
            Collection<DraftModel> n = n(((Database) ((HashMap) this.f13981a).get(str)).e("select * from " + str + "_" + str2 + " order by mTime desc limit 1"));
            StringBuilder sb = new StringBuilder("readLastOne success:  biz = ");
            sb.append(str);
            sb.append(", userId = ");
            sb.append(str2);
            sb.append(", result = ");
            if (n == null) {
                str3 = "null";
            } else {
                str3 = Arrays.toString(n.toArray());
            }
            sb.append(str3);
            odg.b(DraftManager.TAG, sb.toString());
            if (n != null && n.iterator().hasNext()) {
                return n.iterator().next();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0271 A[Catch: all -> 0x02b4, TryCatch #4 {, blocks: (B:4:0x000b, B:6:0x0011, B:10:0x002a, B:32:0x014f, B:34:0x0155, B:36:0x015b, B:38:0x0161, B:39:0x0171, B:42:0x019b, B:53:0x01fd, B:70:0x0309, B:72:0x0313, B:54:0x021d, B:57:0x023a, B:59:0x0240, B:60:0x026b, B:62:0x0271, B:64:0x02ac, B:66:0x02b8, B:68:0x02be, B:12:0x0034, B:14:0x003e, B:16:0x004c, B:18:0x0069, B:20:0x0094, B:22:0x009a, B:23:0x00b9, B:25:0x00bf, B:26:0x00cd, B:28:0x00fd, B:30:0x0103), top: B:83:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0313 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x000b, B:6:0x0011, B:10:0x002a, B:32:0x014f, B:34:0x0155, B:36:0x015b, B:38:0x0161, B:39:0x0171, B:42:0x019b, B:53:0x01fd, B:70:0x0309, B:72:0x0313, B:54:0x021d, B:57:0x023a, B:59:0x0240, B:60:0x026b, B:62:0x0271, B:64:0x02ac, B:66:0x02b8, B:68:0x02be, B:12:0x0034, B:14:0x003e, B:16:0x004c, B:18:0x0069, B:20:0x0094, B:22:0x009a, B:23:0x00b9, B:25:0x00bf, B:26:0x00cd, B:28:0x00fd, B:30:0x0103), top: B:83:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0330 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean f(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.draft.a.f(java.lang.String, java.lang.String):boolean");
    }

    public synchronized b.a u(String str, String str2, DraftModel draftModel) {
        String str3;
        PreparedStatement preparedStatement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("58302699", new Object[]{this, str, str2, draftModel});
        }
        if (f(str, str2)) {
            boolean isEmpty = TextUtils.isEmpty(draftModel.draftId);
            int g = g(str, str2);
            if (!isEmpty || g < ydv.k(str)) {
                long currentTimeMillis = System.currentTimeMillis();
                draftModel.modificationTimestamp = currentTimeMillis;
                if (isEmpty) {
                    draftModel.creationTimestamp = currentTimeMillis;
                    draftModel.draftId = h(str, str2, currentTimeMillis);
                    if (draftModel.meta == null) {
                        draftModel.meta = new DraftModel.Meta();
                    }
                    draftModel.meta.draftId = draftModel.draftId;
                    this.c.b(draftModel, null);
                    str3 = "save success: isNew = ";
                    preparedStatement = ((Database) ((HashMap) this.f13981a).get(str)).e(String.format(Locale.getDefault(), "insert into %s_%s(draftId, cTime, mTime, content) values('%s', %d, %d, ?)", str, str2, draftModel.draftId, Long.valueOf(draftModel.creationTimestamp), Long.valueOf(draftModel.modificationTimestamp)));
                    if (preparedStatement != null) {
                        preparedStatement.f(1, i(draftModel));
                    }
                } else {
                    str3 = "save success: isNew = ";
                    preparedStatement = ((Database) ((HashMap) this.f13981a).get(str)).e(String.format(Locale.getDefault(), "update %s_%s set mTime=%d, content = ? where draftId = ?", str, str2, Long.valueOf(draftModel.modificationTimestamp)));
                    if (preparedStatement != null) {
                        this.c.b(draftModel, o(str, str2, draftModel.draftId));
                        preparedStatement.f(1, i(draftModel));
                        preparedStatement.i(2, draftModel.draftId);
                    }
                }
                UmiPublishMonitor.B("DbDraftStore", "save draft start.");
                if (!(preparedStatement == null || preparedStatement.d() == null)) {
                    UmiPublishMonitor.B("DbDraftStore", "save draft success: isNew = " + isEmpty + ", biz = " + str + ", userId = " + str2 + ", draftModel = " + draftModel.toString());
                    odg.b(DraftManager.TAG, str3 + isEmpty + ", biz = " + str + ", userId = " + str2 + ", draftModel = " + draftModel.toString());
                    return new b.a(draftModel, g + 1);
                }
            } else {
                return new b.a("103", b.a.ERROR_MSG_DRAFT_LIMIT);
            }
        }
        return new b.a("104", b.a.ERROR_MSG_DRAFT_SAVE_FAILED);
    }
}
