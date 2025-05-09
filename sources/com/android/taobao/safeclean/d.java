package com.android.taobao.safeclean;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.CleanList;
import com.android.taobao.safeclean.a;
import com.android.taobao.safeclean.b;
import com.android.taobao.safeclean.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.aaq;
import tb.apo;
import tb.ist;
import tb.mal;
import tb.o7h;
import tb.o9h;
import tb.pbo;
import tb.pq6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class d implements pq6<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DO_CLEAN = 0;
    public static final int DO_STORE = 1;
    public static Application d;

    /* renamed from: a  reason: collision with root package name */
    public final com.android.taobao.safeclean.a f4596a;
    public final aaq b;
    public final c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements a.AbstractC0232a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f4597a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(AtomicReference atomicReference, String str, String str2) {
            this.f4597a = atomicReference;
            this.b = str;
            this.c = str2;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d83f47c", new Object[]{this});
            } else if (!((Boolean) this.f4597a.get()).booleanValue()) {
                d.e(d.this, this.b);
                if (this.c.equalsIgnoreCase("local")) {
                    o7h.b().a("local");
                }
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67153f91", new Object[]{this, new Integer(i)});
                return;
            }
            this.f4597a.set(Boolean.TRUE);
            apo.c(String.valueOf(i), "-1", "delete failed");
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52cb9225", new Object[]{this, new Integer(i)});
                return;
            }
            if (pbo.b(i) > 3) {
                Log.e("SimpleCleaner", "miss id:" + i + " limited");
                o7h.b().i(i);
            } else {
                pbo.a(i);
                this.f4597a.set(Boolean.TRUE);
            }
            Log.e("SimpleCleaner", "miss id:" + i + " file not exit");
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("816e96d9", new Object[]{this, new Integer(i)});
                return;
            }
            o7h.b().i(i);
            apo.d(String.valueOf(i));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final d f4598a = new d(null);

        static {
            t2o.a(654311459);
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e7ac1bd0", new Object[0]);
            }
            return f4598a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<com.android.taobao.safeclean.b> f4599a;

        static {
            t2o.a(654311460);
        }

        public c() {
            ArrayList arrayList = new ArrayList();
            this.f4599a = arrayList;
            arrayList.add(new b.C0233b());
            arrayList.add(new b.a());
        }

        public final void a(CleanList cleanList, SparseBooleanArray sparseBooleanArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd50d81", new Object[]{this, cleanList, sparseBooleanArray});
                return;
            }
            List<CleanList.CleanModel> list = cleanList.cleanDataList;
            if (!(list == null || list.size() == 0)) {
                ArrayList arrayList = new ArrayList();
                for (CleanList.CleanModel cleanModel : cleanList.cleanDataList) {
                    if (sparseBooleanArray.get(cleanModel.dataId)) {
                        Log.e("SimpleCleaner", "filtered sucess Id:" + cleanModel.dataId);
                        arrayList.add(cleanModel);
                    }
                }
                cleanList.cleanDataList.removeAll(arrayList);
            }
        }

        public boolean b(String str, CleanList cleanList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3efcc7f9", new Object[]{this, str, cleanList})).booleanValue();
            }
            if (cleanList == null || cleanList.cleanDataList.size() == 0) {
                return false;
            }
            Iterator it = ((ArrayList) this.f4599a).iterator();
            while (it.hasNext()) {
                com.android.taobao.safeclean.b bVar = (com.android.taobao.safeclean.b) it.next();
                if ((bVar instanceof b.C0233b) && !((b.C0233b) bVar).a(str, o7h.b().f())) {
                    return false;
                }
                if ((bVar instanceof b.a) && !((b.a) bVar).a(cleanList.appVersion, o7h.b().g())) {
                    return false;
                }
            }
            a(cleanList, o7h.b().e());
            if (cleanList.cleanDataList.size() > 0) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(654311457);
        t2o.a(654311440);
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    public static /* synthetic */ void e(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9db415", new Object[]{dVar, str});
        } else {
            dVar.o(str);
        }
    }

    public static d i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("aad4f755", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ void l(CleanList cleanList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d170bc7", new Object[]{cleanList});
        } else {
            o7h.b().l("local", JSON.toJSONString(cleanList));
        }
    }

    public final void f(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c80ef0b", new Object[]{this, application, str});
        } else if (application.getPackageName().equals(str)) {
            new o9h();
            ist.d(new Runnable() { // from class: tb.axp
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.k();
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public final CleanList g(CleanList cleanList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CleanList) ipChange.ipc$dispatch("35282627", new Object[]{this, cleanList, new Integer(i)});
        }
        CleanList cleanList2 = new CleanList();
        cleanList2.appVersion = cleanList.appVersion;
        for (CleanList.CleanModel cleanModel : cleanList.cleanDataList) {
            if (cleanModel.strategy == i) {
                cleanList2.cleanDataList.add(cleanModel);
            }
        }
        return cleanList2;
    }

    public String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b9d1cf", new Object[]{this, context});
        }
        int myPid = Process.myPid();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public void j(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        String h = h(application);
        d = application;
        f(application, h);
    }

    public final /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("311b2b69", new Object[]{this});
        } else if (this.b.a()) {
            new mal();
        }
    }

    public final /* synthetic */ void m(CleanList cleanList, AtomicReference atomicReference, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fea1c99", new Object[]{this, cleanList, atomicReference, str, str2});
        } else {
            this.f4596a.c(cleanList.cleanDataList, new a(atomicReference, str, str2));
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dc0ec", new Object[]{this, str});
        } else {
            o7h.b().j(str);
        }
    }

    public d() {
        this.f4596a = new com.android.taobao.safeclean.a();
        this.c = new c();
        this.b = new aaq();
    }

    /* renamed from: n */
    public synchronized void a(final String str, final String str2, String str3) {
        CleanList cleanList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c735f00e", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str3)) {
            try {
                cleanList = (CleanList) JSON.parseObject(str3, CleanList.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.c.b(str2, cleanList)) {
                final CleanList g = g(cleanList, 1);
                final CleanList g2 = g(cleanList, 0);
                if (str.equals("local")) {
                    g2.cleanDataList.addAll(g.cleanDataList);
                    g.cleanDataList.clear();
                }
                final AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
                Runnable runnable = null;
                Runnable bxpVar = (g == null || g.cleanDataList.size() <= 0) ? null : new Runnable() { // from class: tb.bxp
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.l(CleanList.this);
                    }
                };
                if (g2 != null && g2.cleanDataList.size() > 0) {
                    runnable = new Runnable() { // from class: tb.cxp
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.this.m(g2, atomicReference, str2, str);
                        }
                    };
                }
                if (runnable != null) {
                    runnable.run();
                }
                if (bxpVar != null) {
                    ist.b(bxpVar);
                }
            }
        }
    }
}
