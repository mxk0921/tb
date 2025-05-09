package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.g;
import com.uc.webview.internal.setup.component.i;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w {
    static final /* synthetic */ boolean f = true;

    /* renamed from: a  reason: collision with root package name */
    final i f14444a;
    final n b;
    final String c;
    int d;
    boolean e;
    private final String g;
    private final String h;
    private d.i i;

    private w(String str, i iVar, n nVar, String str2, String str3) {
        this.g = str;
        this.f14444a = iVar;
        this.b = nVar;
        this.c = str2;
        this.h = str3;
        a(iVar.b[0], (n) null);
    }

    private d.i d() {
        if (this.i == null) {
            this.i = new d.i(this);
        }
        return this.i;
    }

    public final void a(n nVar, n nVar2) {
        int i = nVar.f14431a.b;
        if (i == 100) {
            this.d = 0;
        } else if (i != 99) {
            if (nVar2 == null) {
                this.d = 1;
            } else {
                this.d = 2;
            }
        } else if (nVar2 == null) {
            this.d = 3;
        } else {
            this.d = 4;
        }
    }

    public final int b() {
        f fVar = this.b.d;
        if (fVar == null) {
            return 0;
        }
        if (GlobalSettings.isAccessible(264, fVar.i)) {
            return -262;
        }
        if (!(TextUtils.isEmpty(this.c) || this.b.d.j.equals(this.c))) {
            return -261;
        }
        i iVar = this.f14444a;
        n nVar = this.b;
        n a2 = iVar.a(nVar.d.g, true);
        if (a2 == null) {
            if (iVar.a(nVar, true)) {
                return 0;
            }
            a2 = iVar.a(nVar.d.g, false);
            if (a2 == null && iVar.a(nVar, false)) {
                return 0;
            }
        }
        if (a2 != null) {
            i.b bVar = iVar.c;
            bVar.f14412a = a2;
            bVar.b = null;
            return 0;
        }
        for (n nVar2 : iVar.f14410a) {
            if (nVar2.d == null) {
                return 0;
            }
        }
        return -260;
    }

    public final boolean c() {
        i.b bVar = this.f14444a.c;
        n nVar = bVar.f14412a;
        if (nVar == null || nVar.d == null) {
            return false;
        }
        n nVar2 = bVar.b;
        if ((nVar2 == null || nVar2.d != null) && this.b.d != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "{" + this.f14444a.c + ", " + this.b + "}";
    }

    public final Collection<n> a() {
        n[] nVarArr;
        ArrayList arrayList = new ArrayList();
        for (n nVar : this.f14444a.b) {
            if (!(nVar.f14431a.b == 100 || nVar.d == null)) {
                arrayList.add(nVar);
            }
        }
        n nVar2 = this.b;
        if (nVar2.d != null) {
            arrayList.add(nVar2);
        }
        return arrayList;
    }

    public final n a(String str) {
        n nVar;
        i iVar = this.f14444a;
        n nVar2 = null;
        if (!iVar.a()) {
            n[] nVarArr = iVar.b;
            int length = nVarArr.length;
            for (int i = 0; i < length; i++) {
                nVar = nVarArr[i];
                if (nVar.f14431a.f.equals(str)) {
                    break;
                }
            }
        }
        nVar = null;
        if (nVar != null) {
            return nVar;
        }
        if (this.b.f14431a.f.equals(str)) {
            nVar2 = this.b;
        }
        return nVar2;
    }

    public final boolean a(g.a aVar) {
        int b = b();
        if (b != 0) {
            aVar.a(b, new d.l(this, b));
            if (b != -260 || this.f14444a.a()) {
                this.b.b(this.g);
            }
        }
        return b == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.uc.webview.internal.setup.component.g.a r14, com.uc.webview.internal.setup.component.u r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.w.a(com.uc.webview.internal.setup.component.g$a, com.uc.webview.internal.setup.component.u):boolean");
    }

    public static w a(String str, int i, String str2, String str3, g.a aVar) {
        return new w(str, new i(i, aVar), n.f(i), str2, str3);
    }
}
