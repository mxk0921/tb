package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f23454a;
    public String b;
    public String c;
    public final Map<String, Object> d;
    public nbb e;

    static {
        t2o.a(79691816);
    }

    public lo(Context context, Map<String, Object> map) {
        this.f23454a = context;
        if (map == null) {
            this.d = new HashMap();
        } else {
            this.d = map;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caed17af", new Object[]{this, context});
            return;
        }
        m(context);
        this.f23454a = context;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.f23454a != null) {
            qj.h().e(this.f23454a, this.e);
        }
        this.f23454a = null;
        this.e = null;
    }

    public nbb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbb) ipChange.ipc$dispatch("8f54a9fa", new Object[]{this});
        }
        return this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            return "defaultNone";
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        String str = this.c;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f23454a;
    }

    public <T> T g(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("227a7b1b", new Object[]{this, str, cls});
        }
        T t = (T) this.d.get(str);
        if (t == null || cls == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public <T> T h(String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1430f67f", new Object[]{this, str, cls, t});
        }
        T t2 = (T) this.d.get(str);
        if (t2 == null || cls == null || !cls.isAssignableFrom(t2.getClass())) {
            return t;
        }
        return t2;
    }

    public Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1d70d2a", new Object[]{this});
        }
        return this.d;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ck.g().b("AURAUserContext", "setBizCode", "bizCode为空");
        }
        this.b = str;
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void l(nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977bda57", new Object[]{this, nbbVar});
            return;
        }
        this.e = nbbVar;
        qj.h().a(this.f23454a, this.e);
    }

    public final void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316739a7", new Object[]{this, context});
            return;
        }
        if (this.f23454a != null) {
            qj.h().e(this.f23454a, this.e);
        }
        qj.h().a(context, this.e);
    }
}
