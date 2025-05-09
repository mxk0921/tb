package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.g;
import com.uc.webview.internal.setup.component.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b extends g.b {

    /* renamed from: a  reason: collision with root package name */
    final boolean f14384a;
    volatile boolean f;
    private n h;
    private final r g = new r("U4BaseM", 120, c.f());
    final Set<n> b = new HashSet();
    final Set<n> c = new HashSet();
    final Set<n> d = new HashSet();
    final Map<String, n> e = new HashMap();
    private int i = -10000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements k.b {
        private boolean b;

        private a() {
        }

        private boolean c() {
            if (b.this.f || this.b) {
                return true;
            }
            return false;
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final boolean a(int i) {
            if (c()) {
                return true;
            }
            d.C0841d dVar = new d.C0841d("", i);
            y.d();
            dVar.b();
            b.this.a(-451, dVar);
            return false;
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final void b() {
            if (!c()) {
                this.b = true;
                if (!b.this.f) {
                    b.this.a();
                }
            }
        }

        public /* synthetic */ a(b bVar, byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final boolean a(int i, boolean z) {
            if (c()) {
                return true;
            }
            b.this.a(-455, new d.b(b.this.a(k.a()), b.this.f, b.b(b.this), i, z));
            if (!c() && k.a(i)) {
                b();
            }
            return b.this.f;
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final boolean a() {
            return !c();
        }

        @Override // com.uc.webview.internal.setup.component.k.b
        public final void a(d.h hVar) {
            if (!c()) {
                b.this.a(-450, hVar);
            }
        }
    }

    public b(boolean z) {
        this.f14384a = z;
    }

    private boolean b() {
        for (n nVar : this.b) {
            if (nVar.d == null) {
                return false;
            }
        }
        return true;
    }

    private void c() {
        if (b()) {
            for (n nVar : this.c) {
                f fVar = nVar.d;
                if (fVar != null && b(fVar.g, false) == null) {
                    nVar.d = null;
                }
            }
        }
    }

    private String d() {
        f fVar;
        n nVar = this.h;
        if (nVar == null) {
            return null;
        }
        String b = nVar.d.b();
        Set[] setArr = {this.b, this.c};
        for (int i = 0; i < 2; i++) {
            for (n nVar2 : setArr[i]) {
                if (!(nVar2 == null || (fVar = nVar2.d) == null || !fVar.j.equals(b))) {
                    return nVar2.d.i;
                }
            }
        }
        return null;
    }

    private void e() {
        c.a("U4BaseM", new Runnable() { // from class: com.uc.webview.internal.setup.component.b.2
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        });
    }

    public final void a(int i) {
        a(-101, new d.j("", i));
        c.a("U4BaseM", new Runnable() { // from class: com.uc.webview.internal.setup.component.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                n a2 = com.uc.webview.internal.setup.component.a.a(bVar);
                if (a2 != null) {
                    bVar.b.add(a2);
                    bVar.e.put(a2.f14431a.f, a2);
                }
                int[] b = n.b();
                for (int i2 = 0; i2 < 2; i2++) {
                    n f = n.f(b[i2]);
                    bVar.b.add(f);
                    bVar.e.put(f.f14431a.f, f);
                }
                int[] c = n.c();
                for (int i3 = 0; i3 < 2; i3++) {
                    n f2 = n.f(c[i3]);
                    bVar.c.add(f2);
                    bVar.e.put(f2.f14431a.f, f2);
                }
                n f3 = n.f(n.b(n.a()));
                bVar.d.add(f3);
                bVar.e.put(f3.f14431a.f, f3);
                n f4 = n.f(n.c(n.a()));
                bVar.d.add(f4);
                bVar.e.put(f4.f14431a.f, f4);
                if (bVar.f14384a) {
                    k.a.a(c.a()).a("U4BaseM", new a(bVar, (byte) 0));
                    return;
                }
                bVar.a(k.a());
                if (!bVar.f) {
                    bVar.a();
                }
            }
        });
    }

    private n b(String str, boolean z) {
        for (n nVar : this.b) {
            if (!z || nVar.e()) {
                f fVar = nVar.d;
                if (fVar != null && fVar.j.equals(str)) {
                    return nVar;
                }
            }
        }
        return null;
    }

    public final boolean a(Map<String, k.e> map) {
        n nVar;
        n nVar2;
        f fVar;
        int a2;
        boolean z = false;
        if (this.f) {
            return true;
        }
        if (map == null || map.isEmpty()) {
            return false;
        }
        boolean z2 = false;
        for (String str : map.keySet()) {
            k.e eVar = map.get(str);
            if (!(eVar == null || TextUtils.isEmpty(eVar.d) || (nVar2 = this.e.get(eVar.b)) == null || (a2 = nVar2.a("U4BaseM", (fVar = new f(eVar.d)), this)) == 0 || a2 == -1)) {
                if (!this.d.contains(nVar2) || c.c.equals(fVar.j)) {
                    nVar2.d = fVar;
                    a(-454, new d.f(nVar2));
                    z2 = true;
                } else {
                    h.a("U4BaseM", "不是我要的 %s", eVar);
                }
            }
        }
        if (!z2) {
            return false;
        }
        c();
        this.h = null;
        for (n nVar3 : this.d) {
            f fVar2 = nVar3.d;
            if (fVar2 != null && ((nVar = this.h) == null || y.b(fVar2.i, nVar.d.i) > 0)) {
                this.h = nVar3;
            }
        }
        if (d() != null) {
            z = true;
        }
        this.f = z;
        if (this.f) {
            e();
        }
        return true;
    }

    @Override // com.uc.webview.internal.setup.component.g.b, com.uc.webview.internal.setup.component.g.a
    public final void b(int i) {
        a(i, (d.h) null);
    }

    public static /* synthetic */ boolean b(b bVar) {
        for (n nVar : bVar.b) {
            if (nVar.d != null) {
                return true;
            }
        }
        return false;
    }

    private n a(n nVar) {
        for (n nVar2 : this.c) {
            f fVar = nVar2.d;
            if (fVar != null && fVar.g.equals(nVar.d.j)) {
                return nVar2;
            }
        }
        return null;
    }

    private n a(String str) {
        for (n nVar : this.c) {
            f fVar = nVar.d;
            if (fVar != null && fVar.i.equals(str)) {
                return nVar;
            }
        }
        return null;
    }

    private n a(String str, boolean z) {
        for (n nVar : this.b) {
            if (!z || nVar.e()) {
                f fVar = nVar.d;
                if (fVar != null && fVar.i.equals(str)) {
                    return nVar;
                }
            }
        }
        return null;
    }

    private boolean a(Set<n> set, String str, boolean z) {
        n b;
        n a2 = a(str);
        if (a2 == null || (b = b(a2.d.g, z)) == null || a(a2.d.i, z) != null) {
            return false;
        }
        set.add(b);
        set.add(a2);
        return true;
    }

    public final void a() {
        c();
        e();
    }

    @Override // com.uc.webview.internal.setup.component.g.b, com.uc.webview.internal.setup.component.g.a
    public final void a(int i, d.h hVar) {
        d.a("U4BaseM", i, hVar);
        this.i = i;
        this.g.a(i, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.uc.webview.internal.setup.component.b r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.b.a(com.uc.webview.internal.setup.component.b):void");
    }
}
