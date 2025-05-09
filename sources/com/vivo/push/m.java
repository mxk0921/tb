package com.vivo.push;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity;
import com.taobao.android.dinamicx.f;
import com.vivo.push.b.b;
import com.vivo.push.b.c;
import com.vivo.push.b.g;
import com.vivo.push.b.n;
import com.vivo.push.b.z;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.aa;
import com.vivo.push.util.ad;
import com.vivo.push.util.ag;
import com.vivo.push.util.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static volatile m f14613a;
    private Context h;
    private String j;
    private Boolean m;
    private Long n;
    private boolean o;
    private int q;
    private long b = -1;
    private long c = -1;
    private long d = -1;
    private long e = -1;
    private long f = -1;
    private long g = -1;
    private boolean i = true;
    private SparseArray<a> k = new SparseArray<>();
    private int l = 0;
    private IPushClientFactory p = new l();

    private m() {
    }

    public static List<String> c() {
        String g = com.vivo.push.restructure.a.a().e().g();
        ArrayList arrayList = new ArrayList();
        try {
        } catch (JSONException unused) {
            com.vivo.push.restructure.a.a().e().h();
            arrayList.clear();
            u.d("PushClientManager", "getTags error");
        }
        if (TextUtils.isEmpty(g)) {
            return arrayList;
        }
        Iterator<String> keys = new JSONObject(g).keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        return arrayList;
    }

    private boolean l() {
        boolean z;
        if (this.m == null) {
            if (k() < 1230 || !ag.d(this.h)) {
                z = false;
            } else {
                z = true;
            }
            this.m = Boolean.valueOf(z);
        }
        return this.m.booleanValue();
    }

    public final boolean d() {
        if (this.h == null) {
            u.d("PushClientManager", "support:context is null");
            return false;
        }
        Boolean valueOf = Boolean.valueOf(l());
        this.m = valueOf;
        return valueOf.booleanValue();
    }

    public final void e() {
        this.j = null;
        com.vivo.push.restructure.a.a().e().j();
    }

    public final boolean f() {
        return this.o;
    }

    public final boolean g() {
        return this.i;
    }

    public final Context h() {
        return this.h;
    }

    public final String i() {
        return this.j;
    }

    public final int j() {
        return this.q;
    }

    public final long k() {
        Context context = this.h;
        if (context == null) {
            return -1L;
        }
        if (this.n == null) {
            this.n = Long.valueOf(ag.a(context));
        }
        return this.n.longValue();
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f14613a == null) {
                    f14613a = new m();
                }
                mVar = f14613a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public final void b() throws VivoPushException {
        Context context = this.h;
        if (context != null) {
            ag.b(context);
        }
    }

    public static void b(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() > 0) {
                String g = com.vivo.push.restructure.a.a().e().g();
                if (TextUtils.isEmpty(g)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(g);
                }
                for (String str : list) {
                    jSONObject.remove(str);
                }
                String jSONObject2 = jSONObject.toString();
                if (TextUtils.isEmpty(jSONObject2)) {
                    com.vivo.push.restructure.a.a().e().h();
                } else {
                    com.vivo.push.restructure.a.a().e().d(jSONObject2);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            com.vivo.push.restructure.a.a().e().h();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private IPushActionListener f14614a;
        private c b;
        private IPushActionListener c;
        private Runnable d;
        private Object[] e;

        public a(c cVar, IPushActionListener iPushActionListener) {
            this.b = cVar;
            this.f14614a = iPushActionListener;
        }

        public final void a(int i, Object... objArr) {
            this.e = objArr;
            IPushActionListener iPushActionListener = this.c;
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(i);
            }
            IPushActionListener iPushActionListener2 = this.f14614a;
            if (iPushActionListener2 != null) {
                iPushActionListener2.onStateChanged(i);
            }
        }

        public final Object[] b() {
            return this.e;
        }

        public final void a(Runnable runnable) {
            this.d = runnable;
        }

        public final void a() {
            Runnable runnable = this.d;
            if (runnable == null) {
                u.a("PushClientManager", "task is null");
            } else {
                runnable.run();
            }
        }

        public final void a(IPushActionListener iPushActionListener) {
            this.c = iPushActionListener;
        }
    }

    public final synchronized void a(Context context) {
        if (this.h == null) {
            this.h = ContextDelegate.getContext(context);
            this.o = aa.c(context, context.getPackageName());
            ad.b().a(this.h);
            a(new g());
            this.j = com.vivo.push.restructure.a.a().e().i();
        }
    }

    public final void c(List<String> list) {
        if (list.contains(this.j)) {
            e();
        }
    }

    public static void a(List<String> list) {
        JSONObject jSONObject;
        try {
            if (list.size() > 0) {
                String g = com.vivo.push.restructure.a.a().e().g();
                if (TextUtils.isEmpty(g)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(g);
                }
                for (String str : list) {
                    jSONObject.put(str, System.currentTimeMillis());
                }
                String jSONObject2 = jSONObject.toString();
                if (TextUtils.isEmpty(jSONObject2)) {
                    com.vivo.push.restructure.a.a().e().h();
                } else {
                    com.vivo.push.restructure.a.a().e().d(jSONObject2);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            com.vivo.push.restructure.a.a().e().h();
        }
    }

    public final void c(IPushActionListener iPushActionListener, String str, String str2) {
        a(iPushActionListener, str, str2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        t.a(new r(this, str));
    }

    public final void b(IPushActionListener iPushActionListener, String str, String str2) {
        a(iPushActionListener, str, str2, 11);
    }

    public final void b(String str, String str2, String str3, IPushActionListener iPushActionListener) {
        if (this.h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (TextUtils.isEmpty(this.j)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(0);
            }
        } else if (TextUtils.isEmpty(str)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(f.DXError_EngineInitException);
            }
        } else if (str.length() > 70) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(f.DXError_EngineSizeException);
            }
        } else if (a(this.e)) {
            if (this.o) {
                if (!l()) {
                    if (iPushActionListener != null) {
                        iPushActionListener.onStateChanged(101);
                        return;
                    }
                    return;
                } else if (TextUtils.isEmpty(com.vivo.push.restructure.a.a().h().b())) {
                    if (iPushActionListener != null) {
                        iPushActionListener.onStateChanged(30001);
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            com.vivo.push.b.a aVar = new com.vivo.push.b.a(false, this.h.getPackageName(), arrayList);
            aVar.b(100);
            aVar.c(str2);
            aVar.d(str3);
            this.e = SystemClock.elapsedRealtime();
            String a2 = a(new a(aVar, iPushActionListener));
            aVar.b(a2);
            a(aVar);
            c(a2);
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(1002);
        }
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void a(IPushActionListener iPushActionListener, String str, String str2) {
        if (this.h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (!a(str, str2)) {
            com.vivo.push.restructure.a.a().h().b();
            if (a(this.b)) {
                this.b = SystemClock.elapsedRealtime();
                String packageName = this.h.getPackageName();
                a aVar = null;
                if (this.h != null) {
                    b bVar = new b(true, packageName);
                    bVar.e();
                    bVar.c(str);
                    bVar.d(str2);
                    bVar.b(100);
                    if (!this.o) {
                        aVar = a(bVar, iPushActionListener);
                    } else if (l()) {
                        aVar = a(bVar, iPushActionListener);
                    } else if (iPushActionListener != null) {
                        iPushActionListener.onStateChanged(101);
                    }
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(102);
                }
                if (aVar != null) {
                    aVar.a(new n(this, aVar, str, str2));
                    aVar.a();
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(10001);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized a b(String str) {
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                a aVar = this.k.get(parseInt);
                this.k.delete(parseInt);
                return aVar;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private a a(b bVar, IPushActionListener iPushActionListener) {
        a aVar = new a(bVar, iPushActionListener);
        String a2 = a(aVar);
        bVar.b(a2);
        aVar.a(new o(this, bVar, a2));
        return aVar;
    }

    public final void b(ArrayList<String> arrayList, String str, String str2, IPushActionListener iPushActionListener) {
        if (this.h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (a(this.g)) {
            this.g = SystemClock.elapsedRealtime();
            if (arrayList.size() >= 0) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().length() > 70) {
                        if (iPushActionListener != null) {
                            iPushActionListener.onStateChanged(BaseBioNavigatorActivity.p);
                            return;
                        }
                        return;
                    }
                }
                if (this.o) {
                    if (!l()) {
                        if (iPushActionListener != null) {
                            iPushActionListener.onStateChanged(101);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(com.vivo.push.restructure.a.a().h().b())) {
                        if (iPushActionListener != null) {
                            iPushActionListener.onStateChanged(20001);
                            return;
                        }
                        return;
                    }
                }
                z zVar = new z(false, this.h.getPackageName(), arrayList);
                zVar.b(500);
                zVar.c(str);
                zVar.d(str2);
                String a2 = a(new a(zVar, iPushActionListener));
                zVar.b(a2);
                a(zVar);
                c(a2);
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(20002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(1002);
        }
    }

    private void a(IPushActionListener iPushActionListener, String str, String str2, int i) {
        if (this.h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (a(str, str2)) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(10001);
            }
        } else if (a(this.c)) {
            this.c = SystemClock.elapsedRealtime();
            a a2 = a(iPushActionListener, this.h.getPackageName(), str, str2, i);
            if (a2 != null) {
                a2.a(new p(this));
                a2.a();
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(1002);
        }
    }

    private a a(IPushActionListener iPushActionListener, String str, String str2, String str3, int i) {
        if (this.h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
            return null;
        }
        b bVar = new b(false, str);
        bVar.c(str2);
        bVar.d(str3);
        if (i > 0) {
            bVar.a(i);
        }
        bVar.e();
        bVar.b(100);
        if (this.o) {
            if (!l()) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(101);
                }
                return null;
            }
            a aVar = new a(bVar, iPushActionListener);
            String a2 = a(aVar);
            bVar.b(a2);
            aVar.a(new q(this, bVar, a2));
            return aVar;
        } else if (bVar.a(this.h) == 2) {
            return a(bVar, iPushActionListener);
        } else {
            return a(bVar, iPushActionListener);
        }
    }

    public final void a(String str, int i, Object... objArr) {
        a b = b(str);
        if (b != null) {
            b.a(i, objArr);
        } else {
            u.d("PushClientManager", "notifyApp token is null");
        }
    }

    public final void a(String str, String str2, String str3, IPushActionListener iPushActionListener) {
        if (this.h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (TextUtils.isEmpty(this.j) || !this.j.equals(str)) {
            if (TextUtils.isEmpty(str)) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(f.DXError_EngineInitException);
                }
            } else if (str.length() > 70) {
                if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(f.DXError_EngineSizeException);
                }
            } else if (a(this.d)) {
                if (this.o) {
                    if (!l()) {
                        if (iPushActionListener != null) {
                            iPushActionListener.onStateChanged(101);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(com.vivo.push.restructure.a.a().h().b())) {
                        if (iPushActionListener != null) {
                            iPushActionListener.onStateChanged(30001);
                            return;
                        }
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                com.vivo.push.b.a aVar = new com.vivo.push.b.a(true, this.h.getPackageName(), arrayList);
                aVar.b(100);
                aVar.c(str2);
                aVar.d(str3);
                this.d = SystemClock.elapsedRealtime();
                String a2 = a(new a(aVar, iPushActionListener));
                aVar.b(a2);
                a(aVar);
                c(a2);
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(1002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(0);
        }
    }

    private static boolean a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return j == -1 || elapsedRealtime <= j || elapsedRealtime >= j + 2000;
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2);
    }

    public final void a(String str) {
        this.j = str;
        com.vivo.push.restructure.a.a().e().e(str);
    }

    public final void a(String str, int i) {
        a b = b(str);
        if (b != null) {
            b.a(i, new Object[0]);
        } else {
            u.d("PushClientManager", "notifyStatusChanged token is null");
        }
    }

    private synchronized String a(a aVar) {
        int i;
        this.k.put(this.l, aVar);
        i = this.l;
        this.l = i + 1;
        return Integer.toString(i);
    }

    public final void a(ArrayList<String> arrayList, String str, String str2, IPushActionListener iPushActionListener) {
        if (this.h == null) {
            if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(102);
            }
        } else if (a(this.f)) {
            this.f = SystemClock.elapsedRealtime();
            if (arrayList.size() >= 0) {
                if (arrayList.size() + c().size() <= 500) {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().length() > 70) {
                            if (iPushActionListener != null) {
                                iPushActionListener.onStateChanged(BaseBioNavigatorActivity.p);
                                return;
                            }
                            return;
                        }
                    }
                    if (this.o) {
                        if (!l()) {
                            if (iPushActionListener != null) {
                                iPushActionListener.onStateChanged(101);
                                return;
                            }
                            return;
                        } else if (TextUtils.isEmpty(com.vivo.push.restructure.a.a().h().b())) {
                            if (iPushActionListener != null) {
                                iPushActionListener.onStateChanged(20001);
                                return;
                            }
                            return;
                        }
                    }
                    z zVar = new z(true, this.h.getPackageName(), arrayList);
                    zVar.b(500);
                    zVar.c(str);
                    zVar.d(str2);
                    String a2 = a(new a(zVar, iPushActionListener));
                    zVar.b(a2);
                    a(zVar);
                    c(a2);
                } else if (iPushActionListener != null) {
                    iPushActionListener.onStateChanged(BaseBioNavigatorActivity.q);
                }
            } else if (iPushActionListener != null) {
                iPushActionListener.onStateChanged(20002);
            }
        } else if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(1002);
        }
    }

    public final int a(Intent intent, PushMessageCallback pushMessageCallback) {
        v createReceiverCommand = this.p.createReceiverCommand(intent);
        Context context = a().h;
        if (createReceiverCommand == null) {
            u.a("PushClientManager", "sendCommand, null command!");
            if (context == null) {
                return 2805;
            }
            u.c(context, "[执行指令失败]指令空！");
            return 2805;
        }
        com.vivo.push.f.aa createReceiveTask = this.p.createReceiveTask(createReceiverCommand);
        if (createReceiveTask == null) {
            u.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(createReceiverCommand)));
            if (context == null) {
                return 2806;
            }
            u.c(context, "[执行指令失败]指令" + createReceiverCommand + "任务空！");
            return 2806;
        }
        if (context != null && !(createReceiverCommand instanceof n)) {
            u.a(context, "[接收指令]".concat(String.valueOf(createReceiverCommand)));
        }
        createReceiveTask.a(pushMessageCallback);
        createReceiveTask.run();
        return createReceiveTask.c();
    }

    public final void a(v vVar) {
        Context context = a().h;
        if (vVar == null) {
            u.a("PushClientManager", "sendCommand, null command!");
            if (context != null) {
                u.c(context, "[执行指令失败]指令空！");
                return;
            }
            return;
        }
        s createTask = this.p.createTask(vVar);
        if (createTask == null) {
            u.a("PushClientManager", "sendCommand, null command task! pushCommand = ".concat(String.valueOf(vVar)));
            if (context != null) {
                u.c(context, "[执行指令失败]指令" + vVar + "任务空！");
                return;
            }
            return;
        }
        u.d("PushClientManager", "client--sendCommand, command = ".concat(String.valueOf(vVar)));
        t.a(createTask);
    }
}
