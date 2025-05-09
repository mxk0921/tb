package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.ContactsContract;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.thread.WVThreadPool;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dqw;
import tb.hzl;
import tb.kpw;
import tb.lqw;
import tb.nsw;
import tb.t2o;
import tb.v7t;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVContacts extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE = "phone";
    private static final String[] PHONES_PROJECTION = {"display_name", "data1"};
    public static final String RATIONAL_STR = "方便发现更多通讯录好友，与好友分享、互动、参与活动、购买宝贝和充值话费";
    private static final String TAG = "WVContacts";
    public static final String TITLE_STR = "“淘宝”想要访问你的通讯录";
    private WVCallBackContext mCallback = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1798a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f1798a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVContacts.access$000(WVContacts.this, this.f1798a, 4003);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1799a;
        public final /* synthetic */ WVCallBackContext b;

        public b(String str, WVCallBackContext wVCallBackContext) {
            this.f1799a = str;
            this.b = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVContacts.access$100(WVContacts.this, this.f1799a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1800a;

        public c(WVCallBackContext wVCallBackContext) {
            this.f1800a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVContacts.access$200(WVContacts.this, this.f1800a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f1801a;

        public d(Runnable runnable) {
            this.f1801a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVThreadPool.getInstance().execute(this.f1801a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class e extends AsyncTask<Void, Integer, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1802a;

        public e(WVCallBackContext wVCallBackContext) {
            this.f1802a = wVCallBackContext;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVContacts$5");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Cursor cursor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            nsw nswVar = new nsw();
            try {
                cursor = WVContacts.access$300(WVContacts.this).getContentResolver().query(Uri.parse("content://com.android.contacts/contacts"), new String[]{"_id"}, null, null, null);
            } catch (Exception unused) {
                cursor = null;
            }
            if (cursor == null) {
                nswVar.b("isAuthed", "0");
            } else {
                nswVar.b("isAuthed", "1");
            }
            this.f1802a.success(nswVar);
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused2) {
                }
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public String f1803a;
        public String b;

        static {
            t2o.a(989856273);
        }

        public f(WVContacts wVContacts) {
        }

        public /* synthetic */ f(WVContacts wVContacts, a aVar) {
            this(wVContacts);
        }
    }

    public static /* synthetic */ void access$000(WVContacts wVContacts, WVCallBackContext wVCallBackContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5b673c", new Object[]{wVContacts, wVCallBackContext, new Integer(i)});
        } else {
            wVContacts.choose(wVCallBackContext, i);
        }
    }

    public static /* synthetic */ void access$100(WVContacts wVContacts, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ee0a90", new Object[]{wVContacts, str, wVCallBackContext});
        } else {
            wVContacts.find(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$200(WVContacts wVContacts, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42d0365", new Object[]{wVContacts, wVCallBackContext});
        } else {
            wVContacts.authStatus(wVCallBackContext);
        }
    }

    public static /* synthetic */ Context access$300(WVContacts wVContacts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6c2dacff", new Object[]{wVContacts});
        }
        return wVContacts.mContext;
    }

    private void authStatus(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fdcbfe", new Object[]{this, wVCallBackContext});
        } else {
            new e(wVCallBackContext).execute(new Void[0]);
        }
    }

    private void choose(WVCallBackContext wVCallBackContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b1308", new Object[]{this, wVCallBackContext, new Integer(i)});
            return;
        }
        this.mCallback = wVCallBackContext;
        Intent intent = new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        Context context = this.mContext;
        if (context instanceof Activity) {
            try {
                ((Activity) context).startActivityForResult(intent, i);
            } catch (Exception e2) {
                v7t.d(TAG, "open pick activity fail, " + e2.getMessage());
                wVCallBackContext.error();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void find(java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r8 = this;
            java.lang.String r0 = "phone"
            java.lang.String r1 = "name"
            java.lang.String r2 = "WVContacts"
            com.android.alibaba.ip.runtime.IpChange r3 = android.taobao.windvane.jsbridge.api.WVContacts.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0020
            java.lang.String r0 = "1af6c5c7"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            r3.ipc$dispatch(r0, r1)
            return
        L_0x0020:
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: JSONException -> 0x0038
            r4.<init>(r9)     // Catch: JSONException -> 0x0038
            java.lang.String r5 = "filter"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: JSONException -> 0x0038
            if (r4 == 0) goto L_0x003a
            java.lang.String r5 = r4.optString(r1)     // Catch: JSONException -> 0x0038
            java.lang.String r9 = r4.optString(r0)     // Catch: JSONException -> 0x003d
            goto L_0x0050
        L_0x0038:
            r5 = r3
            goto L_0x003d
        L_0x003a:
            r9 = r3
            r5 = r9
            goto L_0x0050
        L_0x003d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "find contacts when parse params to JSON error, params="
            r4.<init>(r6)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            tb.v7t.d(r2, r9)
            r9 = r3
        L_0x0050:
            java.util.List r9 = r8.getPhoneContacts(r3, r5, r9)
            if (r9 != 0) goto L_0x0065
            java.lang.String r9 = "find contacts failed"
            tb.v7t.n(r2, r9)
            tb.nsw r9 = new tb.nsw
            r9.<init>()
            r10.error(r9)
            return
        L_0x0065:
            tb.nsw r3 = new tb.nsw
            r3.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r9 = r9.iterator()     // Catch: JSONException -> 0x0092
        L_0x0073:
            boolean r5 = r9.hasNext()     // Catch: JSONException -> 0x0092
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r9.next()     // Catch: JSONException -> 0x0092
            android.taobao.windvane.jsbridge.api.WVContacts$f r5 = (android.taobao.windvane.jsbridge.api.WVContacts.f) r5     // Catch: JSONException -> 0x0092
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: JSONException -> 0x0092
            r6.<init>()     // Catch: JSONException -> 0x0092
            java.lang.String r7 = r5.f1803a     // Catch: JSONException -> 0x0092
            r6.put(r1, r7)     // Catch: JSONException -> 0x0092
            java.lang.String r5 = r5.b     // Catch: JSONException -> 0x0092
            r6.put(r0, r5)     // Catch: JSONException -> 0x0092
            r4.put(r6)     // Catch: JSONException -> 0x0092
            goto L_0x0073
        L_0x0092:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "put contacts error, "
            r0.<init>(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            tb.v7t.d(r2, r9)
        L_0x00a9:
            java.lang.String r9 = "contacts"
            r3.c(r9, r4)
            r10.success(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVContacts.find(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    public static /* synthetic */ Object ipc$super(WVContacts wVContacts, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVContacts");
    }

    private void requestPermissionAndRun(WVCallBackContext wVCallBackContext, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81c454", new Object[]{this, wVCallBackContext, runnable});
        } else {
            requestPermissionAndRun(wVCallBackContext, runnable, new dqw(wVCallBackContext, "NO_PERMISSION"));
        }
    }

    private void requestPermissionAndRun(WVCallBackContext wVCallBackContext, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48973cd2", new Object[]{this, wVCallBackContext, runnable, runnable2});
            return;
        }
        hzl.a h = hzl.b(this.mContext, new String[]{"android.permission.READ_CONTACTS"}).i(new d(runnable)).h(runnable2);
        vpw.b();
        if (vpw.commonConfig.G0) {
            h.j(TITLE_STR).g(RATIONAL_STR);
        }
        h.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<android.taobao.windvane.jsbridge.api.WVContacts.f> getPhoneContacts(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVContacts.getPhoneContacts(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        Boolean bool;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("choose".equals(str)) {
            try {
                bool = JSON.parseObject(str2).getBoolean(TBRunTimePermission.REQUEST_PERMISSION_API_NAME);
            } catch (Exception unused) {
                bool = null;
            }
            if (bool != null && !bool.equals(Boolean.TRUE)) {
                choose(wVCallBackContext, 4004);
            }
            requestPermissionAndRun(wVCallBackContext, new a(wVCallBackContext));
        } else if ("find".equals(str)) {
            requestPermissionAndRun(wVCallBackContext, new b(str2, wVCallBackContext));
        } else if (!"authStatus".equals(str)) {
            return false;
        } else {
            try {
                z = new JSONObject(str2).optBoolean("autoAskAuth", true);
            } catch (JSONException unused2) {
                v7t.d(TAG, "authStatus when parse params to JSON error, params=" + str2);
                z = true;
            }
            if (!z) {
                authStatus(wVCallBackContext);
            } else {
                try {
                    c cVar = new c(wVCallBackContext);
                    if (!vpw.commonConfig.Z || Build.VERSION.SDK_INT < 27) {
                        requestPermissionAndRun(wVCallBackContext, cVar, cVar);
                    } else if (ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_CONTACTS") == 0) {
                        authStatus(wVCallBackContext);
                    } else {
                        requestPermissionAndRun(wVCallBackContext, cVar, cVar);
                    }
                } catch (Exception e2) {
                    v7t.d(TAG, "authStatus :");
                    e2.printStackTrace();
                }
            }
            lqw.d().e(3014);
            return true;
        }
        lqw.d().e(3014);
        return true;
    }

    static {
        t2o.a(989856267);
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVCallBackContext wVCallBackContext = this.mCallback;
        Cursor cursor = null;
        if (i != 4004 || wVCallBackContext == null) {
            if (i == 4003 && wVCallBackContext != null) {
                if (i2 == -1) {
                    if (intent == null || (data = intent.getData()) == null) {
                        v7t.n(TAG, "contact data is null");
                        return;
                    }
                    String lastPathSegment = data.getLastPathSegment();
                    if (!TextUtils.isEmpty(lastPathSegment)) {
                        List<f> phoneContacts = getPhoneContacts(lastPathSegment, null, null);
                        if (phoneContacts == null || phoneContacts.isEmpty()) {
                            v7t.n(TAG, "contact result is empty");
                            this.mCallback.error(new nsw());
                            return;
                        }
                        f fVar = phoneContacts.get(0);
                        if (!TextUtils.isEmpty(fVar.b)) {
                            nsw nswVar = new nsw();
                            nswVar.b("name", fVar.f1803a);
                            nswVar.b("phone", fVar.b);
                            this.mCallback.success(nswVar);
                            return;
                        }
                    }
                }
                if (v7t.h()) {
                    v7t.a(TAG, "choose contact failed");
                }
                this.mCallback.error(new nsw());
            }
        } else if (i2 != -1 || intent == null) {
            nsw nswVar2 = new nsw();
            nswVar2.b("msg", "denied by the user");
            wVCallBackContext.error(nswVar2);
        } else {
            try {
                Cursor query = this.mContext.getContentResolver().query(intent.getData(), null, null, null, null);
                if (query == null || query.getCount() <= 0) {
                    wVCallBackContext.error(new nsw("HY_NO_PERMISSION"));
                    return;
                }
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex("data1"));
                String string2 = query.getString(query.getColumnIndex("display_name"));
                nsw nswVar3 = new nsw();
                nswVar3.b("name", string2);
                nswVar3.b("phone", string);
                wVCallBackContext.success(nswVar3);
            } catch (Exception e2) {
                if (0 != 0) {
                    try {
                        cursor.close();
                    } catch (Exception unused) {
                    }
                }
                nsw nswVar4 = new nsw();
                nswVar4.b("msg", "exception: " + e2.getMessage());
                wVCallBackContext.error(nswVar4);
            }
        }
    }
}
