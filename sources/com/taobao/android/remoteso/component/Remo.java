package com.taobao.android.remoteso.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.a;
import com.taobao.android.remoteso.component.b;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.List;
import tb.cxn;
import tb.d52;
import tb.dxn;
import tb.gcf;
import tb.i4o;
import tb.rbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Remo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final i4o f9232a = new i4o();
    public static final com.taobao.android.remoteso.component.b b = new com.taobao.android.remoteso.component.b();
    public static final com.taobao.android.remoteso.component.a c = new com.taobao.android.remoteso.component.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Type {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements gcf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.remoteso.component.c f9233a;

        public a(com.taobao.android.remoteso.component.c cVar) {
            this.f9233a = cVar;
        }

        @Override // tb.gcf
        public void a(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ef5050", new Object[]{this, cxnVar});
                return;
            }
            if (cxnVar.d() == 1003) {
                Remo.a().b(this.f9233a);
            }
            dxn.a(this.f9233a, cxnVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements gcf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.remoteso.component.c f9234a;

        public b(com.taobao.android.remoteso.component.c cVar) {
            this.f9234a = cVar;
        }

        @Override // tb.gcf
        public void a(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ef5050", new Object[]{this, cxnVar});
            } else {
                Remo.b().a(this.f9234a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements a.d, b.AbstractC0477b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final com.taobao.android.remoteso.component.c f9235a;
        public final List<String> b;
        public final List<String> c;
        public volatile boolean d;
        public volatile boolean e;

        public c(com.taobao.android.remoteso.component.c cVar) {
            this.f9235a = cVar;
            List<String> t = cVar.t("flexa");
            this.b = t;
            List<String> t2 = cVar.t("rso");
            this.c = t2;
            this.d = t.isEmpty();
            this.e = t2.isEmpty();
            d("flexa", 0);
            d("rso", 0);
        }

        @Override // com.taobao.android.remoteso.component.a.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3b86ee6", new Object[]{this, new Integer(i)});
            } else {
                d("flexa", i);
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25990d4c", new Object[]{this});
            } else if (!this.d || !this.e) {
                RSoLog.d("remo, skip, waiting all module complete");
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.b);
                arrayList.addAll(this.c);
                e(cxn.g(arrayList));
            }
        }

        public final void d(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ae46a7d", new Object[]{this, str, new Integer(i)});
                return;
            }
            RSoLog.d("remo, listener.handleProgress, " + str + "=" + i);
            this.f9235a.x(i);
        }

        public final void e(cxn cxnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dfadcbd", new Object[]{this, cxnVar});
                return;
            }
            RSoLog.d("remo, listener.handleResult = " + cxnVar);
            this.f9235a.y(cxnVar);
        }

        public void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("919ea180", new Object[]{this, new Integer(i)});
            } else {
                d("rso", i);
            }
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            RSoLog.d("remo, listener.onFailure = " + exc);
            e(cxn.c("install-flexa-error=" + exc.toString()));
        }

        @Override // tb.c52
        public void b(d52 d52Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4b58cf", new Object[]{this, d52Var});
                return;
            }
            RSoLog.d("remo, listener.onFetchFinished = " + d52Var);
            if (d52Var.d()) {
                this.e = true;
                c();
                return;
            }
            e(cxn.c("install-rso-error=" + d52Var.b()));
        }

        /* renamed from: g */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                return;
            }
            RSoLog.d("remo, listener.onSuccess = " + num);
            this.d = true;
            c();
        }
    }

    public static /* synthetic */ com.taobao.android.remoteso.component.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.component.a) ipChange.ipc$dispatch("1052b7a8", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ i4o b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i4o) ipChange.ipc$dispatch("1728dd7a", new Object[0]);
        }
        return f9232a;
    }

    public static cxn c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxn) ipChange.ipc$dispatch("73038183", new Object[]{dVar});
        }
        try {
            RSoLog.d("remo,check, enter = " + dVar);
            com.taobao.android.remoteso.component.c cVar = new com.taobao.android.remoteso.component.c(dVar, "check");
            cxn g = g(cVar);
            dxn.a(cVar, g);
            RSoLog.d("remo,check, exit, result = " + g);
            return g;
        } catch (Throwable th) {
            rbn.g("remo,check,error", th);
            return cxn.c("remo,exception=" + th);
        }
    }

    public static com.taobao.android.remoteso.component.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.component.c) ipChange.ipc$dispatch("a141f53a", new Object[0]);
        }
        return f9232a.b();
    }

    public static void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baee9ef1", new Object[]{dVar});
            return;
        }
        try {
            RSoLog.d("remo,install, enter = " + dVar);
            com.taobao.android.remoteso.component.c cVar = new com.taobao.android.remoteso.component.c(dVar, "install");
            cVar.g(new a(cVar));
            if (cVar.w()) {
                RSoLog.d("remo,install, updateRemoBOForUI = " + dVar);
                i(cVar);
            }
            cxn g = g(cVar);
            if (g.a()) {
                RSoLog.d("remo,install, all modules done,  request = " + dVar);
                cVar.y(g);
                return;
            }
            if (cVar.w()) {
                RSoLog.d("remo,install, launchRemoUI with showRemoUI = " + dVar);
                f(cVar);
            }
            c cVar2 = new c(cVar);
            c.e(cVar, cVar2);
            b.c(cVar, cVar2);
            RSoLog.d("remo,install, exit,  request = " + dVar);
        } catch (Throwable th) {
            rbn.g("remo,install,error", th);
            cxn c2 = cxn.c("remo,exception=" + th);
            gcf gcfVar = dVar.f9256a.f;
            if (gcfVar != null) {
                gcfVar.a(c2);
            }
        }
    }

    public static void f(com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa196d4", new Object[]{cVar});
            return;
        }
        Context j = cVar.j();
        if (j instanceof Activity) {
            RSoLog.d("remo,showRemoUI- Activity.startActivity( RemoActivity ) ");
            j.startActivity(new Intent(j, RemoActivity.class));
            return;
        }
        RSoLog.d("remo,showRemoUI- Context.startActivity( RemoActivity ) ");
        j.startActivity(new Intent(j, RemoActivity.class).addFlags(268435456));
    }

    public static cxn g(com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxn) ipChange.ipc$dispatch("ddc4917e", new Object[]{cVar});
        }
        ArrayList arrayList = new ArrayList();
        List<String> a2 = b.a(cVar);
        if (!a2.isEmpty()) {
            cxn c2 = cxn.c("check-failed=" + a2);
            RSoLog.d("remo,performCheck, rso exit, failure = " + c2);
            return c2;
        }
        arrayList.addAll(cVar.t("rso"));
        List<String> c3 = c.c(cVar);
        if (!c3.isEmpty()) {
            cxn c4 = cxn.c("check-failed=" + c3);
            RSoLog.d("remo,performCheck, flexa exit, failure = " + c4);
            return c4;
        }
        arrayList.addAll(cVar.t("flexa"));
        if (!arrayList.isEmpty()) {
            cxn g = cxn.g(arrayList);
            RSoLog.d("remo,performCheck, exit, success = " + g);
            return g;
        }
        RSoLog.g("remo,performCheck, exit, result failure known");
        return cxn.c("unknown");
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("304b4f4a", new Object[]{str});
        }
        String f = c.f(str);
        RSoLog.d("remo,retrieveFlexaState - moduleName=" + str + " got state=" + f);
        return f;
    }

    public static void i(com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2971a6fe", new Object[]{cVar});
        } else if (!f9232a.d(cVar)) {
            cVar.y(cxn.c("requesting_by_other"));
        } else {
            cVar.g(new b(cVar));
        }
    }
}
