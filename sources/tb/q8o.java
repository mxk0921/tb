package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ekd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class q8o implements ekd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public s8o f26582a;
    public s8o c;
    public String e;
    public String f;
    public final List<s8o> b = new CopyOnWriteArrayList();
    public final Map<String, s8o> d = new ConcurrentHashMap();

    static {
        t2o.a(843055394);
        t2o.a(843055259);
    }

    public q8o(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
    }

    @Override // tb.ekd
    public Long G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("de76731f", new Object[]{this});
        }
        s8o s8oVar = this.f26582a;
        if (s8oVar == null) {
            return null;
        }
        return s8oVar.c();
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            ekd.a.a(this, bbsVar);
        }
    }

    @Override // tb.ekd
    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a517314", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // tb.ekd
    public void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896e02bc", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            ekd.a.b(this);
        }
    }

    @Override // tb.ekd
    public String c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16856bfa", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.ekd
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28706aa2", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.ekd
    public void l0(s8o s8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b37a8b", new Object[]{this, s8oVar});
            return;
        }
        ckf.g(s8oVar, "resourcePackage");
        this.f26582a = s8oVar;
    }

    @Override // tb.ekd
    public void m(s8o s8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2e99df", new Object[]{this, s8oVar});
            return;
        }
        ckf.g(s8oVar, "resourcePackage");
        ((CopyOnWriteArrayList) this.b).add(s8oVar);
    }

    @Override // tb.ekd
    public c7o n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c7o) ipChange.ipc$dispatch("7b6a29b3", new Object[]{this, str, str2});
        }
        ckf.g(str, gcn.PLUGIN_ID);
        ckf.g(str2, "resourceName");
        s8o s8oVar = (s8o) ((ConcurrentHashMap) this.d).get(str);
        if (s8oVar == null) {
            return null;
        }
        return s8oVar.b(str2);
    }

    @Override // tb.ekd
    public c7o o0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c7o) ipChange.ipc$dispatch("2154a43e", new Object[]{this, str});
        }
        ckf.g(str, "resourceName");
        s8o s8oVar = this.c;
        if (s8oVar == null) {
            return null;
        }
        return s8oVar.b(str);
    }

    @Override // tb.ekd
    public void r(s8o s8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18e8baa", new Object[]{this, s8oVar});
            return;
        }
        ckf.g(s8oVar, "resourcePackage");
        this.c = s8oVar;
    }

    @Override // tb.ekd
    public void u(s8o s8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611c37d1", new Object[]{this, s8oVar});
            return;
        }
        ckf.g(s8oVar, "resourcePackage");
        ((ConcurrentHashMap) this.d).put(s8oVar.a().b(), s8oVar);
    }

    @Override // tb.ekd
    public c7o B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c7o) ipChange.ipc$dispatch("33711b2a", new Object[]{this, str});
        }
        ckf.g(str, "name");
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            s8o s8oVar = (s8o) it.next();
            c7o b = s8oVar.b(str);
            if (b == null) {
                String substring = str.substring(1);
                ckf.f(substring, "this as java.lang.String).substring(startIndex)");
                b = s8oVar.b(substring);
                continue;
            }
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // tb.ekd
    public c7o Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c7o) ipChange.ipc$dispatch("c4678f77", new Object[]{this, str});
        }
        ckf.g(str, "name");
        s8o s8oVar = this.f26582a;
        c7o b = s8oVar == null ? null : s8oVar.b(str);
        if (b == null) {
            s8o s8oVar2 = this.f26582a;
            if (s8oVar2 == null) {
                b = null;
            } else {
                String substring = str.substring(1);
                ckf.f(substring, "this as java.lang.String).substring(startIndex)");
                b = s8oVar2.b(substring);
            }
        }
        if (b != null) {
            return b;
        }
        return null;
    }
}
