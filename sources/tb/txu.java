package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class txu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f29025a;
    public a4e b;

    static {
        t2o.a(79691995);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return null;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        throw new NullPointerException("did you forget call setContext");
    }

    @Deprecated
    public <T> T c(String str, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("913956e", new Object[]{this, str, cls});
        }
        HashMap<String, Object> hashMap = this.f29025a;
        if (hashMap == null || (t = (T) hashMap.get(str)) == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            b4e a2 = dxu.a();
            a2.e("UMFRuntimeContext", "getInnerContextObj#cast exception,error=" + th.getMessage());
        }
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        return null;
    }

    public a4e d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a4e) ipChange.ipc$dispatch("fbf925d2", new Object[]{this});
        }
        return this.b;
    }

    public Object e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("49e73c1d", new Object[]{this});
        }
        return null;
    }

    @Deprecated
    public void f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e535dc", new Object[]{this, str, obj});
            return;
        }
        if (this.f29025a == null) {
            this.f29025a = new HashMap<>();
        }
        this.f29025a.put(str, obj);
    }

    public void g(a4e a4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698d7fec", new Object[]{this, a4eVar});
        } else {
            this.b = a4eVar;
        }
    }
}
