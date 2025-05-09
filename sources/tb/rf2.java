package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rf2 implements jjb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ADDITION = "addition";
    public static final String KEY_BLOCK_STACK = "block_stack";
    public static final List<Map<String, ?>> b = new ArrayList();
    public static int c = 0;
    public static final rf2 d = new rf2();

    /* renamed from: a  reason: collision with root package name */
    public jjb f27330a;

    public static rf2 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rf2) ipChange.ipc$dispatch("d8a12bd5", new Object[0]);
        }
        return d;
    }

    @Override // tb.jjb
    public synchronized void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0cb5f4", new Object[]{this, str, obj});
            return;
        }
        jjb jjbVar = this.f27330a;
        if (jjbVar != null) {
            jjbVar.a(str, obj);
        }
    }

    @Override // tb.jjb
    public synchronized void b(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8224fd", new Object[]{this, map});
            return;
        }
        jjb jjbVar = this.f27330a;
        if (jjbVar != null) {
            jjbVar.b(map);
        } else {
            ((ArrayList) b).set(c, map);
            c = (c + 1) % 10;
        }
    }

    public synchronized void d(jjb jjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5178186d", new Object[]{this, jjbVar});
            return;
        }
        this.f27330a = jjbVar;
        List<Map<String, ?>> list = b;
        if (((ArrayList) list).size() > 0) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                b((Map) it.next());
            }
            ((ArrayList) b).clear();
        }
    }
}
