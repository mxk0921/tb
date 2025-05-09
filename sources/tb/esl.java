package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.utils.WXLogUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class esl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18795a;
    public int b = 0;
    public final sb1<m1u> c = new sb1<>();
    public final sb1<v1r> d = new sb1<>();

    static {
        t2o.a(985661617);
    }

    public esl(String str) {
        this.f18795a = str;
    }

    public static m1u g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m1u) ipChange.ipc$dispatch("115c5d31", new Object[]{str});
        }
        try {
            return new esl(str).f();
        } catch (Exception e) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e("code " + str, e);
            }
            return new nf2(null, 6);
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8490e8a", new Object[]{this, new Integer(i)});
            return;
        }
        while (this.d.i() > i) {
            a(this.d.f());
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
        }
        if (this.b < this.f18795a.length()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d752f7d7", new Object[]{this})).booleanValue();
        }
        while (c()) {
            if (this.f18795a.charAt(this.b) != ' ') {
                return true;
            }
            this.b++;
        }
        return false;
    }

    public final char e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("81acd03a", new Object[]{this})).charValue();
        }
        char charAt = this.f18795a.charAt(this.b);
        while (charAt == ' ') {
            this.b++;
            int length = this.f18795a.length();
            int i = this.b;
            if (length <= i) {
                break;
            }
            charAt = this.f18795a.charAt(i);
        }
        return charAt;
    }

    public final m1u f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m1u) ipChange.ipc$dispatch("e34eb5bb", new Object[]{this});
        }
        while (d()) {
            l();
        }
        while (!this.d.d()) {
            a(this.d.f());
        }
        if (this.c.i() == 1) {
            return this.c.f();
        }
        return new nf2(this.c.c(), 6);
    }

    public final void h() {
        int i;
        m1u m1uVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3367863", new Object[]{this});
            return;
        }
        int i2 = this.c.i();
        int i3 = this.d.i();
        int i4 = this.b;
        if (i4 - 1 < 0 || !Character.isJavaIdentifierPart(this.f18795a.charAt(i4 - 1))) {
            i = 7;
        } else {
            i = 0;
        }
        this.d.g(new v1r("[", this.c.i()));
        this.b++;
        while (d() && l() != ']') {
        }
        if (this.c.i() <= i2) {
            while (this.d.i() > i3) {
                this.d.f();
            }
            return;
        }
        while (this.d.i() > i3) {
            v1r f = this.d.f();
            if (this.c.i() > i2) {
                a(f);
            }
        }
        ArrayList arrayList = new ArrayList(4);
        for (int i5 = i2; i5 < this.c.i(); i5++) {
            arrayList.add(this.c.b(i5));
        }
        while (this.c.i() > i2) {
            this.c.f();
        }
        if (i == 7 || this.c.i() == 0) {
            this.c.g(new nf2(arrayList, 7));
            return;
        }
        m1u f2 = this.c.f();
        if (arrayList.size() == 1) {
            m1uVar = (m1u) arrayList.get(0);
        } else {
            m1uVar = new nf2(arrayList, 6);
        }
        b7l b7lVar = new b7l(".", i);
        b7lVar.d = f2;
        b7lVar.e = m1uVar;
        this.c.g(b7lVar);
    }

    public final void j() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c2a88d", new Object[]{this});
            return;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        while (c() && Character.isJavaIdentifierPart(this.f18795a.charAt(this.b))) {
            this.b++;
        }
        String substring = this.f18795a.substring(i2, this.b);
        if (substring.startsWith("$")) {
            if (substring.length() != 1) {
                substring = substring.substring(1);
            } else {
                return;
            }
        }
        if (f7l.KEYWORDS.containsKey(substring) && (this.d.d() || !f7l.f(this.d.e().f29737a))) {
            i = 4;
        }
        this.c.g(new m1u(substring, i));
    }

    public void k() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf8dc01", new Object[]{this});
            return;
        }
        b7l b7lVar = new b7l("?", 5);
        b(0);
        if (this.d.i() > 0) {
            i = Math.max(this.d.e().b, 0);
        }
        if (this.c.i() > i) {
            b7lVar.c = this.c.f();
        }
        int i2 = this.c.i();
        int i3 = this.d.i();
        this.b++;
        while (d() && l() != ':') {
        }
        while (this.d.i() > i3) {
            a(this.d.f());
        }
        while (this.c.i() > i2) {
            b7lVar.d = this.c.f();
        }
        int i4 = this.d.i();
        while (d()) {
            l();
            if (d()) {
                l();
            }
            if (this.d.i() <= i4) {
                break;
            }
        }
        b(i4);
        while (this.c.i() > i2) {
            b7lVar.e = this.c.f();
        }
        this.c.g(b7lVar);
    }

    public final char l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("42736cbd", new Object[]{this})).charValue();
        }
        char e = e();
        if (e == '$') {
            this.b++;
            return e;
        }
        if (Character.isJavaIdentifierStart(e)) {
            j();
        } else if (e == '(' || e == '{') {
            i();
        } else if (e == '[') {
            h();
        } else if (e == '\"' || e == '\'') {
            o();
        } else if ((e == '.' && Character.isDigit(this.f18795a.charAt(this.b + 1))) || Character.isDigit(e)) {
            m();
        } else if (e == '?') {
            k();
        } else if (e == ':' || e == ')' || e == '}' || e == ' ' || e == ']') {
            this.b++;
            return e;
        } else {
            n();
        }
        return e;
    }

    public final void m() {
        boolean z;
        m1u m1uVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f740fdad", new Object[]{this});
            return;
        }
        int i = this.b;
        if (this.f18795a.charAt(i) == 'e' || this.f18795a.charAt(this.b) == '.') {
            z = false;
        } else {
            z = true;
        }
        this.b++;
        while (c()) {
            char charAt = this.f18795a.charAt(this.b);
            if (!Character.isDigit(charAt) && charAt != '.' && charAt != 'e') {
                break;
            }
            if (charAt == 'e' || charAt == '.') {
                z = false;
            }
            this.b++;
        }
        String substring = this.f18795a.substring(i, this.b);
        if (!".".equals(substring)) {
            if (z) {
                m1uVar = new m1u(substring, 1);
            } else {
                m1uVar = new m1u(substring, 2);
            }
            this.c.g(m1uVar);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ddde75", new Object[]{this});
            return;
        }
        int i = this.b;
        sb1 sb1Var = new sb1();
        char charAt = this.f18795a.charAt(i);
        sb1Var.g(Character.valueOf(charAt));
        StringBuilder sb = new StringBuilder();
        while (true) {
            this.b = i + 1;
            if (this.b >= this.f18795a.length()) {
                break;
            }
            char charAt2 = this.f18795a.charAt(this.b);
            if (charAt2 != charAt) {
                sb.append(charAt2);
            } else if (this.f18795a.charAt(this.b - 1) != '\\') {
                sb1Var.f();
                if (sb1Var.i() == 0) {
                    this.b++;
                    break;
                }
            } else {
                sb.deleteCharAt(sb.length() - 1);
                sb.append(charAt2);
            }
            i = this.b;
        }
        this.c.g(new m1u(sb.toString(), 3));
    }

    public void a(v1r v1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8efdea", new Object[]{this, v1rVar});
            return;
        }
        String str = v1rVar.f29737a;
        if (!f7l.BRACKET_START_STR.equals(str) && !"{".equals(v1rVar.f29737a) && !"[".equals(v1rVar.f29737a) && !"$".equals(v1rVar.f29737a) && !"{".equals(v1rVar.f29737a)) {
            int i = v1rVar.b;
            int max = Math.max(i - 1, 0);
            if (!this.d.d()) {
                max = Math.max(max, this.d.e().b);
            }
            b7l b7lVar = new b7l(str, 5);
            if (f7l.AND_NOT.equals(str)) {
                if (this.c.i() > i) {
                    b7lVar.c = this.c.h(i);
                    this.c.a(i, b7lVar);
                }
            } else if (this.c.i() > i) {
                b7lVar.e = this.c.h(i);
                if (this.c.i() > max) {
                    b7lVar.d = this.c.h(max);
                } else if (b7lVar.e == null) {
                    return;
                }
                this.c.a(max, b7lVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9097e72", new Object[]{this});
            return;
        }
        int i = this.c.i();
        int i2 = this.d.i();
        if (this.f18795a.charAt(this.b) == '{') {
            this.d.g(new v1r("{", this.c.i()));
            this.b++;
            while (d() && l() != '}') {
            }
        } else {
            this.d.g(new v1r(f7l.BRACKET_START_STR, this.c.i()));
            this.b++;
            while (d() && l() != ')') {
            }
        }
        if (this.c.i() <= i) {
            while (this.d.i() > i2) {
                this.d.f();
            }
            return;
        }
        while (this.d.i() > i2) {
            v1r f = this.d.f();
            if (this.c.i() > i) {
                a(f);
            }
        }
        ArrayList arrayList = new ArrayList(4);
        for (int i3 = i; i3 < this.c.i(); i3++) {
            arrayList.add(this.c.b(i3));
        }
        while (this.c.i() > i) {
            this.c.f();
        }
        if (arrayList.size() == 1) {
            this.c.g(arrayList.get(0));
        } else {
            this.c.g(new nf2(arrayList, 6));
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29750248", new Object[]{this});
            return;
        }
        int i = this.b;
        String substring = this.f18795a.substring(this.b, Math.min(i + 3, this.f18795a.length()));
        if (substring.length() >= 3 && !((HashMap) f7l.f19076a).containsKey(substring)) {
            substring = substring.substring(0, 2);
        }
        if (substring.length() >= 2 && !((HashMap) f7l.f19076a).containsKey(substring)) {
            substring = substring.substring(0, 1);
        }
        HashMap hashMap = (HashMap) f7l.f19076a;
        if (!hashMap.containsKey(substring)) {
            int min = Math.min(i + 1, this.f18795a.length());
            WXLogUtils.e("weex", new IllegalArgumentException(this.f18795a.substring(0, min) + " illegal code operator" + substring));
            this.b = this.b + substring.length();
            return;
        }
        if (!this.d.d() && this.d.e() != null && ((Integer) hashMap.get(this.d.e().f29737a)).intValue() >= ((Integer) hashMap.get(substring)).intValue()) {
            a(this.d.f());
        }
        if (!f7l.j(substring)) {
            this.d.g(new v1r(substring, this.c.i()));
        }
        this.b += substring.length();
    }
}
