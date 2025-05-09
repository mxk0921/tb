package com.taobao.runtimepermission;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.runtimepermission.config.RPConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ean;
import tb.gjb;
import tb.gjo;
import tb.he2;
import tb.ij7;
import tb.ndh;
import tb.q8d;
import tb.qzl;
import tb.szl;
import tb.u71;
import tb.ub1;
import tb.v4s;
import tb.wor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OVERLAY_PERMISSION_REQ_CODE = 123;
    public static final int PERMISSION_BIZ_DENIED = -2;
    public static final int PERMISSION_FORCE_DENIED = -3;
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_REQ_CODE = 1096;
    public static final int PERMISSION_SYS_DENIED = -1;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, C0649a> f11503a = new ConcurrentHashMap<>();
    public static final List<gjo> b = new LinkedList();

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("4672ac80", new Object[0]);
        }
        return f11503a;
    }

    public static void b(gjo gjoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a92b130", new Object[]{gjoVar});
        } else {
            ((LinkedList) b).add(gjoVar);
        }
    }

    public static C0649a c(Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0649a) ipChange.ipc$dispatch("d71563e4", new Object[]{context, strArr});
        }
        if (context == null) {
            throw new NullPointerException("context can not be null");
        } else if (strArr == null || strArr.length == 0) {
            throw new NullPointerException("permissions can not be null");
        } else {
            C0649a aVar = new C0649a();
            if (context instanceof Application) {
                C0649a.b(aVar, context);
            } else {
                C0649a.b(aVar, context.getApplicationContext());
            }
            C0649a.c(aVar, strArr);
            return aVar;
        }
    }

    public static qzl d(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzl) ipChange.ipc$dispatch("6304ef7", new Object[]{context, str, strArr});
        }
        if (context == null || TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return null;
        }
        String l = ean.h().l(str);
        int[] iArr = new int[ub1.a(strArr)];
        List<String> list = ean.h().i().rollbackBizList;
        if (list == null || !list.contains(l)) {
            boolean k = ean.h().k(l);
            for (int i = 0; i < strArr.length; i++) {
                if (ContextCompat.checkSelfPermission(context, strArr[i]) != 0) {
                    iArr[i] = -1;
                } else if (k || he2.b(context, l, strArr[i])) {
                    iArr[i] = 0;
                } else {
                    iArr[i] = -2;
                }
            }
        } else {
            Arrays.fill(iArr, -3);
        }
        qzl a2 = qzl.a(strArr, iArr);
        u71.b(str, l, a2);
        return a2;
    }

    public static void e(int i, int i2, int i3, Intent intent) {
        boolean canDrawOverlays;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889dcb4e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), intent});
            return;
        }
        C0649a remove = f11503a.remove(Integer.valueOf(i));
        if (remove != null) {
            canDrawOverlays = Settings.canDrawOverlays(C0649a.a(remove));
            if (!canDrawOverlays) {
                i4 = -1;
            }
            C0649a.d(remove, canDrawOverlays, new String[]{"android.permission.SYSTEM_ALERT_WINDOW"}, new int[]{i4});
        }
    }

    public static void f(C0649a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c49a1d", new Object[]{aVar});
            return;
        }
        RPConfig i = ean.h().i();
        if (C0649a.e(aVar) && !TextUtils.isEmpty(C0649a.g(aVar))) {
            List<String> list = i.callbackBizBlackList;
            if (list == null || !list.contains(C0649a.g(aVar))) {
                for (gjo gjoVar : b) {
                    try {
                        gjoVar.a(C0649a.a(aVar), C0649a.j(aVar), C0649a.k(aVar), C0649a.i(aVar));
                    } catch (Throwable th) {
                        ndh.a("PermissionUtil", String.format("onAfterPermissionGrant: execute listener %s with exception %s!", gjoVar, th));
                    }
                }
            }
        }
    }

    public static void g(int i, int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fa3115", new Object[]{new Integer(i), new Integer(i2), strArr, iArr});
            return;
        }
        C0649a remove = f11503a.remove(Integer.valueOf(i));
        if (remove != null) {
            C0649a.d(remove, h(iArr), strArr, iArr);
            if (C0649a.e(remove) && C0649a.f(remove)) {
                he2.c(C0649a.a(remove), C0649a.g(remove), strArr, iArr);
                f(remove);
                u71.d(C0649a.h(remove), C0649a.g(remove), C0649a.i(remove));
            }
        }
    }

    public static boolean h(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ed827e4", new Object[]{iArr})).booleanValue();
        }
        if (iArr.length < 1) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.runtimepermission.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class C0649a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AtomicInteger t = new AtomicInteger(0);
        public Context b;
        public String[] c;
        public qzl g;
        public Runnable p;
        public Runnable q;
        public q8d r;
        public gjb s;

        /* renamed from: a  reason: collision with root package name */
        public final int f11504a = t.getAndIncrement();
        public final List<String> d = new ArrayList();
        public final List<String> e = new ArrayList();
        public final List<String> f = new ArrayList();
        public String h = null;
        public String i = null;
        public String j = null;
        public boolean k = false;
        public boolean l = false;
        public boolean m = false;
        public long n = -1;
        public boolean o = false;

        public static /* synthetic */ Context a(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("bc0a7ab5", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ Context b(C0649a aVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("9c55b7a5", new Object[]{aVar, context});
            }
            aVar.b = context;
            return context;
        }

        public static /* synthetic */ String[] c(C0649a aVar, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("abfd61d4", new Object[]{aVar, strArr});
            }
            aVar.c = strArr;
            return strArr;
        }

        public static /* synthetic */ void d(C0649a aVar, boolean z, String[] strArr, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60a998d4", new Object[]{aVar, new Boolean(z), strArr, iArr});
            } else {
                aVar.q(z, strArr, iArr);
            }
        }

        public static /* synthetic */ boolean e(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("20ce2e1e", new Object[]{aVar})).booleanValue();
            }
            return aVar.l;
        }

        public static /* synthetic */ boolean f(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b3f273d", new Object[]{aVar})).booleanValue();
            }
            return aVar.m;
        }

        public static /* synthetic */ String g(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d7f38f48", new Object[]{aVar});
            }
            return aVar.h;
        }

        public static /* synthetic */ String h(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9e1e1809", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ qzl i(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qzl) ipChange.ipc$dispatch("e5c7cce0", new Object[]{aVar});
            }
            return aVar.g;
        }

        public static /* synthetic */ List j(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("55cd45f2", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ List k(C0649a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("3ed50af3", new Object[]{aVar});
            }
            return aVar.f;
        }

        public C0649a A(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("260c258f", new Object[]{this, runnable});
            }
            this.p = runnable;
            return this;
        }

        public C0649a B(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("c06a2754", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            if (this.k) {
                this.m = false;
            }
            return this;
        }

        public final void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
        }

        public final boolean n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("437c9ad0", new Object[]{this})).booleanValue();
            }
            boolean d = ij7.d();
            if (d) {
                r(this.q, null, -1);
            }
            return d;
        }

        public final boolean o(String[] strArr, int i, String[] strArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c6080c93", new Object[]{this, strArr, new Integer(i), strArr2})).booleanValue();
            }
            boolean d = ij7.d();
            if (d) {
                Runnable runnable = this.q;
                if (runnable != null) {
                    runnable.run();
                }
                int length = strArr.length + strArr2.length;
                String[] strArr3 = new String[length];
                ub1.d(strArr3, strArr, strArr2);
                if (this.r != null) {
                    int[] iArr = new int[length];
                    Arrays.fill(iArr, 0, i, -1);
                    Arrays.fill(iArr, i, length, 0);
                    this.r.a(strArr3, iArr);
                }
                if (this.s != null) {
                    int[] iArr2 = new int[length];
                    Arrays.fill(iArr2, 0, i, -1);
                    Arrays.fill(iArr2, i, strArr.length, -2);
                    Arrays.fill(iArr2, strArr.length, length, 0);
                    this.s.a(qzl.a(strArr, iArr2));
                }
            }
            return d;
        }

        public final int p(Context context, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a33b9ce9", new Object[]{this, context, new Boolean(z), str, str2})).intValue();
            }
            if (ContextCompat.checkSelfPermission(context, str2) != 0) {
                return 8291;
            }
            if (!z || he2.b(context, str, str2)) {
                return 8290;
            }
            return 8292;
        }

        public final void q(boolean z, String[] strArr, int[] iArr) {
            String[] strArr2;
            String[] strArr3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e0bdeed", new Object[]{this, new Boolean(z), strArr, iArr});
                return;
            }
            if (z) {
                Runnable runnable = this.p;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                Runnable runnable2 = this.q;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            if (!(this.r == null || (strArr2 = this.c) == null)) {
                int[] iArr2 = new int[strArr2.length];
                int i = 0;
                while (true) {
                    strArr3 = this.c;
                    if (i >= strArr3.length) {
                        break;
                    }
                    iArr2[i] = ContextCompat.checkSelfPermission(this.b, strArr3[i]);
                    i++;
                }
                this.r.a(strArr3, iArr2);
            }
            int[] iArr3 = new int[((ArrayList) this.d).size()];
            Arrays.fill(iArr3, 0);
            String[] strArr4 = new String[ub1.a(this.c)];
            int[] iArr4 = new int[ub1.a(this.c)];
            ub1.d(strArr4, ((ArrayList) this.d).toArray(new String[0]), strArr);
            ub1.e(iArr4, iArr3, iArr);
            qzl a2 = qzl.a(strArr4, iArr4);
            this.g = a2;
            gjb gjbVar = this.s;
            if (gjbVar != null) {
                gjbVar.a(a2);
            }
            l();
        }

        public final void r(Runnable runnable, gjb gjbVar, int i) {
            String[] strArr;
            String[] strArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b19aab27", new Object[]{this, runnable, gjbVar, new Integer(i)});
                return;
            }
            if (runnable != null) {
                runnable.run();
            }
            if (!(this.r == null || (strArr2 = this.c) == null)) {
                int[] iArr = new int[strArr2.length];
                Arrays.fill(iArr, i);
                this.r.a(this.c, iArr);
            }
            if (gjbVar != null && (strArr = this.c) != null) {
                int[] iArr2 = new int[strArr.length];
                Arrays.fill(iArr2, i);
                gjbVar.a(qzl.a(this.c, iArr2));
            }
        }

        public C0649a s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("d244b0cd", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public C0649a t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("e56e2551", new Object[]{this, str});
            }
            this.i = str;
            this.h = ean.h().l(str);
            boolean k = ean.h().k(this.h);
            this.k = k;
            if (k) {
                this.m = false;
            }
            return this;
        }

        public C0649a u(gjb gjbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("509420e1", new Object[]{this, gjbVar});
            }
            this.s = gjbVar;
            return this;
        }

        @Deprecated
        public C0649a v(q8d q8dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("47b064d3", new Object[]{this, q8dVar});
            }
            this.r = q8dVar;
            return this;
        }

        public C0649a w(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("c7fa1b36", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public C0649a x(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("c8a47204", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public C0649a y(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("bd255095", new Object[]{this, new Long(j)});
            }
            this.n = j;
            return this;
        }

        public C0649a z(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0649a) ipChange.ipc$dispatch("872d7f79", new Object[]{this, runnable});
            }
            this.q = runnable;
            return this;
        }

        public void m() {
            String[] strArr;
            List<String> list;
            boolean canDrawOverlays;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            } else if (Build.VERSION.SDK_INT >= 23) {
                String[] strArr2 = this.c;
                if (strArr2.length != 1 || !strArr2[0].equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    RPConfig i = ean.h().i();
                    List<String> list2 = i.rollbackBizList;
                    if (list2 == null || !list2.contains(this.h)) {
                        if (!i.enable || (((list = i.sameScreenPopBizBlackList) != null && list.contains(this.h)) || TextUtils.isEmpty(this.h) || TextUtils.isEmpty(this.j))) {
                            this.l = false;
                        }
                        for (String str : this.c) {
                            int p = p(this.b, this.l && this.m, this.h, str);
                            if (p == 8291) {
                                ((ArrayList) this.e).add(str);
                            } else if (p == 8292) {
                                ((ArrayList) this.f).add(str);
                            } else {
                                ((ArrayList) this.d).add(str);
                            }
                        }
                        if (!this.l && ((ArrayList) this.e).size() == 0) {
                            r(this.p, null, 0);
                        } else if (this.l && ((ArrayList) this.e).size() == 0 && ((ArrayList) this.f).size() == 0) {
                            r(this.p, this.s, 0);
                        } else {
                            String[] strArr3 = new String[((ArrayList) this.e).size() + ((ArrayList) this.f).size()];
                            ub1.d(strArr3, ((ArrayList) this.e).toArray(new String[0]), ((ArrayList) this.f).toArray(new String[0]));
                            if (!o(strArr3, ((ArrayList) this.e).size(), (String[]) ((ArrayList) this.d).toArray(new String[0]))) {
                                Intent intent = new Intent();
                                intent.setClass(this.b, PermissionActivity.class);
                                if (!(this.b instanceof Activity)) {
                                    intent.addFlags(268435456);
                                }
                                intent.putExtra("sysPermissions", (String[]) ((ArrayList) this.e).toArray(new String[0]));
                                intent.putExtra("bizPermissions", (String[]) ((ArrayList) this.f).toArray(new String[0]));
                                intent.putExtra("bizName", this.h);
                                intent.putExtra("originBizName", this.i);
                                intent.putExtra(TBRunTimePermission.EXPLAIN_PARAM_NAME, new szl().a(this.b, strArr3, this.j));
                                intent.putExtra("showRational", this.l);
                                intent.putExtra(TBRunTimePermission.SILENCE_INTERVAL_NAME, this.n);
                                intent.putExtra("transparentBackground", this.o);
                                intent.putExtra(v4s.PARAM_TASK_ID, this.f11504a);
                                intent.putExtra("pageName", ij7.a());
                                intent.putExtra("pageUrl", ij7.b());
                                a.a().put(Integer.valueOf(this.f11504a), this);
                                this.b.startActivity(intent);
                            }
                        }
                    } else {
                        a.a().put(Integer.valueOf(this.f11504a), this);
                        int[] iArr = new int[ub1.a(this.c)];
                        Arrays.fill(iArr, -3);
                        a.g(this.f11504a, a.PERMISSION_REQ_CODE, this.c, iArr);
                    }
                } else {
                    canDrawOverlays = Settings.canDrawOverlays(this.b);
                    if (canDrawOverlays) {
                        r(this.p, null, 0);
                    } else if (!n()) {
                        Intent intent2 = new Intent();
                        intent2.setClass(this.b, PermissionActivity.class);
                        intent2.putExtra("permissions", this.c);
                        intent2.putExtra(v4s.PARAM_TASK_ID, this.f11504a);
                        intent2.addFlags(268435456);
                        a.a().put(Integer.valueOf(this.f11504a), this);
                        this.b.startActivity(intent2);
                    }
                }
            } else if (wor.a(this.b, this.c)) {
                r(this.p, this.s, 0);
            } else {
                r(this.q, this.s, -1);
            }
        }
    }
}
