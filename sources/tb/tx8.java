package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tx8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<px8<?>> f29016a = Collections.synchronizedSet(new HashSet());

    static {
        t2o.a(615514192);
    }

    public <T> void a(px8<T> px8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a6cdac", new Object[]{this, px8Var});
            return;
        }
        px8<?> d = d(px8Var.a());
        if (d != null) {
            g(d);
        }
        this.f29016a.add(px8Var);
    }

    public void b(tx8 tx8Var) {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314c9b11", new Object[]{this, tx8Var});
        } else if (Build.VERSION.SDK_INT <= 23) {
            try {
                for (Object obj : tx8Var.f29016a.toArray()) {
                    if (obj instanceof px8) {
                        this.f29016a.add((px8) obj);
                    }
                }
            } catch (Exception e) {
                idh.c("Facts", "add", e);
            }
        } else {
            this.f29016a.addAll(tx8Var.f29016a);
        }
    }

    public <T> T c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        px8<?> d = d(str);
        if (d != null) {
            return (T) d.b();
        }
        return null;
    }

    public px8<?> d(String str) {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (px8) ipChange.ipc$dispatch("985ee877", new Object[]{this, str});
        }
        if (this.f29016a.size() == 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                for (Object obj : this.f29016a.toArray()) {
                    if (obj instanceof px8) {
                        px8<?> px8Var = (px8) obj;
                        if (str != null && str.equals(px8Var.a())) {
                            return px8Var;
                        }
                    }
                }
            } catch (Exception e) {
                idh.c("Facts", "getFact", e);
            }
        } else {
            for (px8<?> px8Var2 : this.f29016a) {
                if (str != null && str.equals(px8Var2.a())) {
                    return px8Var2;
                }
            }
        }
        return null;
    }

    public <T> void e(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, t});
        } else {
            a(new px8<>(str, t));
        }
    }

    public void f(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27aed4af", new Object[]{this, map});
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            e(entry.getKey(), entry.getValue());
        }
    }

    public <T> void g(px8<T> px8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2385ea69", new Object[]{this, px8Var});
        } else {
            this.f29016a.remove(px8Var);
        }
    }

    public String toString() {
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("[");
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                for (Object obj : this.f29016a.toArray()) {
                    if (obj instanceof px8) {
                        sb.append(((px8) obj).toString());
                        sb.append(",");
                    }
                }
            } catch (Exception e) {
                idh.c("Facts", "toString", e);
            }
        } else {
            Iterator<px8<?>> it = this.f29016a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                if (it.hasNext()) {
                    sb.append(",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
