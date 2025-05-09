package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.resolver2.d;
import java.io.File;
import java.util.HashMap;
import tb.a7o;
import tb.ngd;
import tb.obn;
import tb.rbn;
import tb.trq;
import tb.uos;
import tb.z6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final obn f9283a;
    public final e b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z6o f9284a;
        public final /* synthetic */ d.a b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.remoteso.resolver2.k$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0480a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a7o f9285a;

            public RunnableC0480a(a7o a7oVar) {
                this.f9285a = a7oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.this.f9284a.f().d("end", "begin");
                k.d(k.this, this.f9285a);
            }
        }

        public a(z6o z6oVar, d.a aVar) {
            this.f9284a = z6oVar;
            this.b = aVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
                return;
            }
            a7o c = k.c(k.this, a7oVar);
            rbn.i("ResolverHookTracker.resolve", new RunnableC0480a(c));
            this.b.a(c);
        }
    }

    public k(obn obnVar, e eVar) {
        this.f9283a = obnVar;
        this.b = eVar;
    }

    public static /* synthetic */ a7o c(k kVar, a7o a7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("e909f6c2", new Object[]{kVar, a7oVar});
        }
        return kVar.g(a7oVar);
    }

    public static /* synthetic */ void d(k kVar, a7o a7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70aa13de", new Object[]{kVar, a7oVar});
        } else {
            kVar.f(a7oVar);
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.e
    public void a(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4f855b", new Object[]{this, z6oVar, aVar});
            return;
        }
        z6oVar.f().c("begin");
        e(z6oVar);
        this.b.a(z6oVar, new a(z6oVar, aVar));
    }

    @Override // com.taobao.android.remoteso.resolver2.e
    public a7o b(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("aa101ea1", new Object[]{this, z6oVar});
        }
        return this.b.b(z6oVar);
    }

    public final void e(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fa573b", new Object[]{this, z6oVar});
            return;
        }
        File file = new File(this.f9283a.a(z6oVar.j().provideStorageKey()));
        if (file.exists()) {
            uos.e(file);
            rbn.e("Resolver,clearWrongFile", "libDirPath exist = " + file);
        }
    }

    public final void f(a7o a7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646d6ea3", new Object[]{this, a7oVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ngd.ARGS_LIB_NAME, a7oVar.e());
        hashMap.put("arg_resolve_type", "type");
        hashMap.put("arg_resolve_from", a7oVar.h());
        hashMap.put("arg_resolve_by", a7oVar.g().e());
        hashMap.putAll(a7oVar.g().f().b());
        if (a7oVar.b() == null) {
            rbn.j("remoteso-resolve-core", hashMap);
        } else {
            rbn.h("remoteso-resolve-core", hashMap, a7oVar.b());
        }
    }

    public final a7o g(a7o a7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("cd4c6b2a", new Object[]{this, a7oVar});
        }
        z6o g = a7oVar.g();
        String d = a7oVar.d();
        if (a7oVar.b() != null) {
            String a2 = this.f9283a.a(g.j().provideStorageKey());
            if (trq.e(a2)) {
                File file = new File(a2);
                uos.e(file);
                rbn.e("Resolver:deleteFileOnException", "illegalLibFile = " + file);
            }
            return a7oVar;
        } else if (trq.c(d)) {
            return a7o.a(g, a7oVar.h(), RSoException.error(6097));
        } else {
            return a7oVar;
        }
    }
}
