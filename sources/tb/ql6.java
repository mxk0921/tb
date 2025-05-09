package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ql6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a d = new a();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, fw5> f26807a = new ConcurrentHashMap();
    public final Map<String, Object> b = new ConcurrentHashMap();
    public final Map<String, Object> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        static {
            t2o.a(444597422);
        }
    }

    static {
        t2o.a(444597421);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a28a04c", new Object[]{this});
        } else {
            ((ConcurrentHashMap) this.b).clear();
        }
    }

    public ql6 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ql6) ipChange.ipc$dispatch("46156216", new Object[]{this});
        }
        ql6 ql6Var = new ql6();
        ql6Var.f26807a = this.f26807a;
        return ql6Var;
    }

    public Object c(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1db5229f", new Object[]{this, str, dXRuntimeContext});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (((ConcurrentHashMap) this.b).containsKey(str)) {
            return ((ConcurrentHashMap) this.b).get(str);
        }
        fw5 fw5Var = this.f26807a.get(str);
        if (fw5Var == null) {
            return null;
        }
        Object b = fw5Var.b(null, dXRuntimeContext);
        if (b == null) {
            b = d;
        }
        ((ConcurrentHashMap) this.b).put(str, b);
        return b;
    }

    public Object d(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3818ef53", new Object[]{this, str, dXRuntimeContext});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (((ConcurrentHashMap) this.c).containsKey(str)) {
            return ((ConcurrentHashMap) this.c).get(str);
        }
        fw5 fw5Var = this.f26807a.get(str);
        if (fw5Var == null) {
            return null;
        }
        Object b = fw5Var.b(null, dXRuntimeContext);
        if (b == null) {
            b = d;
        }
        ((ConcurrentHashMap) this.c).put(str, b);
        return b;
    }

    public void e(String str, fw5 fw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64790f30", new Object[]{this, str, fw5Var});
        } else {
            this.f26807a.put(str, fw5Var);
        }
    }

    public void f(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b0143", new Object[]{this, new Byte(b)});
        }
    }

    public void g(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b636bd", new Object[]{this, new Byte(b)});
        }
    }
}
