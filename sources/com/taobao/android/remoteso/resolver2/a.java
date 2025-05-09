package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import java.io.File;
import java.util.Map;
import tb.a7o;
import tb.cgd;
import tb.obn;
import tb.rbn;
import tb.z6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d> f9267a;
    public final obn b;
    public final cgd c;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.remoteso.resolver2.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0479a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.a f9268a;

        public C0479a(d.a aVar) {
            this.f9268a = aVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
                return;
            }
            if (a7oVar.j()) {
                a.c(a.this, a7oVar);
            }
            this.f9268a.a(a7oVar);
        }
    }

    public a(Map<String, d> map, obn obnVar, cgd cgdVar) {
        this.f9267a = map;
        this.b = obnVar;
        this.c = cgdVar;
    }

    public static /* synthetic */ void c(a aVar, a7o a7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcafa", new Object[]{aVar, a7oVar});
        } else {
            aVar.d(a7oVar);
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.e
    public void a(z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4f855b", new Object[]{this, z6oVar, aVar});
            return;
        }
        RSoLog.d("DefaultResolveHook, resolve(), " + z6oVar.b());
        d dVar = this.f9267a.get(z6oVar.a());
        if (dVar == null) {
            aVar.a(a7o.a(z6oVar, "manager-peek", RSoException.error(2006, "from = " + z6oVar.a())));
            return;
        }
        dVar.a(z6oVar, new C0479a(aVar));
    }

    @Override // com.taobao.android.remoteso.resolver2.e
    public a7o b(z6o z6oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("aa101ea1", new Object[]{this, z6oVar});
        }
        RSoLog.d("DefaultResolveHook, peek(), " + z6oVar.b());
        SoIndexData.SoFileInfo j = z6oVar.j();
        String e = this.b.e(z6oVar.c(), j.provideStorageKey());
        if (j.j(e, j.getLength()) != null) {
            return j.h(z6oVar, e, "manager-peek");
        }
        return j.f(z6oVar, RSoException.error(6306), "manager-peek");
    }

    public final void d(a7o a7oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c681c1f", new Object[]{this, a7oVar});
        } else if (this.c.a("mark_read_only_disabled", false)) {
            RSoLog.d("DefaultResolveHook, markReadOnly disabled, skipped");
        } else {
            try {
                File file = new File(a7oVar.f());
                if (!file.setReadOnly()) {
                    rbn.e("ResolveHook.setReadOnly.false", "libFile=" + file);
                }
            } catch (Throwable th) {
                rbn.g("ResolveHook.setReadOnly.error", th);
            }
        }
    }
}
