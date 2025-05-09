package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p1m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public w3o f25819a;
    public String b = "";
    public boolean c = false;

    static {
        t2o.a(620757098);
        t2o.a(620757091);
    }

    public p1m(w3o w3oVar) {
        this.f25819a = w3oVar;
    }

    public boolean a() {
        w3o w3oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            w3oVar = this.f25819a;
            this.f25819a = null;
        }
        if (w3oVar != null) {
            w3oVar.b();
        }
        return false;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56fddb5b", new Object[]{this})).booleanValue();
        }
        w3o w3oVar = this.f25819a;
        if (w3oVar == null || w3oVar.j()) {
            return false;
        }
        return true;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb01aea9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (z) {
            this.f25819a = null;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f3cbcc", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.b;
        if (str2 == null || str2.compareToIgnoreCase(str) != 0) {
            return false;
        }
        return true;
    }
}
