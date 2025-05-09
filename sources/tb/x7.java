package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31187a;
    public final HashMap<String, w8> b = new HashMap<>(50);

    static {
        t2o.a(336592897);
    }

    public x7(String str) {
        this.f31187a = str;
    }

    public static void b(h8 h8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08a5445", new Object[]{h8Var});
            return;
        }
        g8.f(h8Var.f20463a);
        v8 v8Var = h8Var.c;
        if (v8Var != null) {
            g8.b = v8Var;
        }
        y8 y8Var = h8Var.b;
        if (y8Var != null) {
            g8.c = y8Var;
        }
        j8 j8Var = h8Var.d;
        if (j8Var != null) {
            g8.d = j8Var;
        }
        l8 l8Var = h8Var.f;
        if (l8Var != null) {
            g8.f = l8Var;
        }
        bee beeVar = h8Var.e;
        if (beeVar != null) {
            g8.e = beeVar;
        }
    }

    public m8<k8> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8) ipChange.ipc$dispatch("c3b9ef17", new Object[]{this, str});
        }
        w8<Object> w8Var = g8.f19780a.get(str);
        if (w8Var == null) {
            w8Var = this.b.get(str);
        }
        if (w8Var == null) {
            w8Var = i8.INSTANCE.a(str, this.f31187a);
        }
        if (w8Var == null) {
            return null;
        }
        return w8Var.build(null);
    }

    public boolean c(String str, w8 w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("492d64ef", new Object[]{this, str, w8Var})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || g8.f19780a.containsKey(str)) {
            return false;
        }
        this.b.put(str, w8Var);
        return true;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33621783", new Object[]{this, str});
        } else {
            this.f31187a = str;
        }
    }
}
