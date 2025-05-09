package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import anet.channel.util.ErrorConstant;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.g;
import com.uc.webview.internal.setup.component.k;
import com.uc.webview.internal.setup.q;
import java.io.File;
import java.util.List;
import tb.f7l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n {
    static final /* synthetic */ boolean e = true;

    /* renamed from: a  reason: collision with root package name */
    final p f14431a;
    final boolean b;
    final boolean c;
    f d;

    private n(p pVar, boolean z, boolean z2) {
        this.f14431a = pVar;
        this.b = z;
        this.c = z2;
    }

    public static int a(int i) {
        return 110;
    }

    public static int b(int i) {
        return i == 110 ? 101 : 102;
    }

    public static int c(int i) {
        return i == 110 ? 109 : 108;
    }

    public static boolean d(int i) {
        int[] iArr = {1, 2};
        for (int i2 = 0; i2 < 2; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static String e(int i) {
        String str;
        if (g(i)) {
            return q.f14437a[i].f;
        }
        if (i == 101) {
            str = "U4Patch${ARCH}1";
        } else if (i == 102) {
            str = "U4Patch${ARCH}3";
        } else if (i == 108) {
            str = "U4Patch${ARCH}2";
        } else if (i != 109) {
            str = "Unknown";
        } else {
            str = "U4Patch${ARCH}0";
        }
        return y.a(str, "");
    }

    public static n f(int i) {
        p pVar;
        String str;
        if (g(i)) {
            pVar = q.f14437a[i];
        } else if (i == 100) {
            pVar = new p("U4Lite", i);
        } else {
            String str2 = q.f14437a[1].g;
            String substring = str2.substring(0, str2.lastIndexOf(47));
            if (i == 101) {
                str = "U4PatchOnBase";
            } else if (i == 102) {
                str = "U4Patch1OnBase";
            } else if (i == 108) {
                str = "U4Patch1OnLite";
            } else if (i != 109) {
                str = "U4Unknown";
            } else {
                str = "U4PatchOnLite";
            }
            pVar = new p(str, i, 1, e(i), substring);
        }
        if (g(i)) {
            return new n(pVar, null, false, true);
        }
        if (i != 100) {
            return new n(pVar, false, false);
        }
        f fVar = new f(pVar, "U4Lite-" + c.b + "-" + c.c);
        File a2 = q.c.f14495a.a();
        fVar.c = a2;
        if (e || a2 != null) {
            return new n(pVar, fVar, true, true);
        }
        throw new AssertionError();
    }

    private static boolean g(int i) {
        if (d(i)) {
            return true;
        }
        int[] iArr = {3, 4};
        for (int i2 = 0; i2 < 2; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        if (d.f14396a) {
            if (this.d == null) {
                return this.f14431a.f14436a;
            }
            return this.f14431a.f14436a + ": {ver: " + this.d.c() + ", fname: " + this.d.d + ", fpath: " + this.d.c + "}";
        } else if (this.d == null) {
            return this.f14431a.f14436a;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14431a.f14436a);
            sb.append(f7l.BRACKET_START_STR);
            sb.append(this.d.c());
            sb.append(f7l.BRACKET_END_STR);
            if (this.d.c != null) {
                str = "↓";
            } else {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public static List<String> a(List<String> list) {
        int[][] iArr = {new int[]{1, 2}, new int[]{3, 4}, new int[]{101, 109}, null};
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = iArr[i];
            if (iArr2 != null) {
                for (int i2 : iArr2) {
                    list.add(e(i2));
                }
            }
        }
        return list;
    }

    public static int[] b() {
        return new int[]{1, 2};
    }

    public static int[] c() {
        return new int[]{3, 4};
    }

    public final void b(String str) {
        if (this.f14431a.b != 100) {
            if (this.d != null) {
                h.a(str, "删除文件及信息 %s", this);
            }
            p pVar = this.f14431a;
            if (pVar.b == 99) {
                a(this);
            } else {
                k.b(pVar);
            }
            this.d = null;
        }
    }

    public final boolean d() {
        int[] iArr = {1, 2};
        for (int i = 0; i < 2; i++) {
            if (this.f14431a.b == iArr[i]) {
                return true;
            }
        }
        return false;
    }

    public n(p pVar, f fVar, boolean z, boolean z2) {
        this(pVar, z, z2);
        this.d = fVar;
    }

    public final int a(String str, f fVar, g.a aVar) {
        k.f b;
        int i = 2;
        if (e || this.f14431a.f.equals(fVar.e)) {
            f fVar2 = this.d;
            if (fVar2 == null || !fVar2.equals(fVar)) {
                f fVar3 = this.d;
                if (fVar3 == null) {
                    this.d = fVar;
                    i = 1;
                } else {
                    h.a(str, "FileInfo changed: %s <- %s", fVar, fVar3);
                    this.d.a(fVar);
                }
            } else {
                i = 0;
            }
            File file = this.d.c;
            if ((file != null && file.exists()) || (b = k.b(this.f14431a.g)) == null || TextUtils.isEmpty(b.f14427a) || a(b) == -9) {
                return i;
            }
            if (aVar == null) {
                return -1;
            }
            aVar.a(-5, new d.f(this.f14431a, fVar));
            return -1;
        }
        throw new AssertionError("want " + this.f14431a.f + ", got: " + fVar.e);
    }

    public final boolean e() {
        f fVar = this.d;
        return (fVar == null || fVar.c == null) ? false : true;
    }

    public final int a(k.f fVar) {
        if (!e && this.d.c != null) {
            throw new AssertionError("fpath: " + this.d.c);
        } else if (fVar == null || TextUtils.isEmpty(fVar.f14427a)) {
            return -6;
        } else {
            if (!new File(fVar.f14427a).exists()) {
                return ErrorConstant.ERROR_SOCKET_TIME_OUT;
            }
            f a2 = f.a(this.f14431a, fVar);
            if (!this.d.d().equals(a2.d())) {
                return -251;
            }
            this.d.a(a2);
            if (this.f14431a.h == -1) {
                return -9;
            }
            String absolutePath = this.d.c.getAbsolutePath();
            if (GlobalSettings.get(this.f14431a.h, "").equals(absolutePath)) {
                return -9;
            }
            GlobalSettings.set(this.f14431a.h, absolutePath);
            return -9;
        }
    }

    private static void a(n nVar) {
        File file;
        f fVar = nVar.d;
        if (fVar != null && (file = fVar.c) != null) {
            try {
                fVar.c = null;
                file.delete();
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str) {
        if (this.f14431a.b != 100) {
            f fVar = this.d;
            if (!(fVar == null || fVar.c == null)) {
                h.a(str, "删除文件 %s", this);
            }
            p pVar = this.f14431a;
            if (pVar.b == 99) {
                a(this);
                return;
            }
            k.a(pVar);
            f fVar2 = this.d;
            if (fVar2 != null) {
                fVar2.c = null;
            }
        }
    }

    public static int a() {
        return a(q.a.f14493a);
    }
}
