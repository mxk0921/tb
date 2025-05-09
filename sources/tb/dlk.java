package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Observer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dlk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String SCOPE_GLOBAL = "global";
    public static final String SCOPE_PAGE = "page";

    /* renamed from: a  reason: collision with root package name */
    public final String f17901a;
    public final HashMap<String, clk> b = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793489);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793488);
    }

    public dlk(String str) {
        ckf.g(str, "mScope");
        this.f17901a = str;
    }

    public final boolean a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("306e525d", new Object[]{this, str, str2, obj})).booleanValue();
        }
        ckf.g(str, "namespace");
        ckf.g(str2, "key");
        ckf.g(obj, "value");
        clk clkVar = this.b.get(str);
        if (clkVar == null) {
            clkVar = new clk(str, this.f17901a);
            this.b.put(str, clkVar);
        }
        return clkVar.c(str2, obj);
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf68c68", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "namespace");
        ckf.g(str2, "key");
        clk clkVar = this.b.get(str);
        if (clkVar != null) {
            clkVar.d(str2);
        }
    }

    public final void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41382e6f", new Object[]{this, str, new Integer(i)});
            return;
        }
        ckf.g(str, "namespace");
        clk clkVar = this.b.get(str);
        if (clkVar == null) {
            clkVar = new clk(str, this.f17901a);
            this.b.put(str, clkVar);
        }
        clkVar.e(i);
    }

    public final void d(String str, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b31269", new Object[]{this, str, observer});
            return;
        }
        ckf.g(str, "namespace");
        ckf.g(observer, "observer");
        clk clkVar = this.b.get(str);
        if (clkVar == null) {
            clkVar = new clk(str, this.f17901a);
            this.b.put(str, clkVar);
        }
        clkVar.addObserver(observer);
        observer.update(clkVar, clkVar.a("SUCCESS"));
    }

    public final void e(String str, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7716d030", new Object[]{this, str, observer});
            return;
        }
        ckf.g(str, "namespace");
        ckf.g(observer, "observer");
        clk clkVar = this.b.get(str);
        if (clkVar != null) {
            clkVar.deleteObserver(observer);
        }
    }
}
