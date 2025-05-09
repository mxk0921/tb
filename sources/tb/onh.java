package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class onh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<com.taobao.android.weex_framework.a> f25508a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final onh f25509a = new onh();

        static {
            t2o.a(815792830);
        }

        public static /* synthetic */ onh a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (onh) ipChange.ipc$dispatch("fe1a34ac", new Object[0]);
            }
            return f25509a;
        }
    }

    static {
        t2o.a(815792828);
    }

    public static onh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (onh) ipChange.ipc$dispatch("f529b206", new Object[0]);
        }
        return b.a();
    }

    public void a(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d489c7e0", new Object[]{this, aVar});
        } else if (aVar != null) {
            ((ArrayList) this.f25508a).add(aVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f25508a).iterator();
        while (it.hasNext()) {
            com.taobao.android.weex_framework.a aVar = (com.taobao.android.weex_framework.a) it.next();
            if (aVar != null) {
                aVar.destroy();
            }
        }
        ((ArrayList) this.f25508a).clear();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f25508a).size();
    }

    public com.taobao.android.weex_framework.a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("8958811b", new Object[]{this});
        }
        if (((ArrayList) this.f25508a).isEmpty()) {
            return null;
        }
        return (com.taobao.android.weex_framework.a) ((ArrayList) this.f25508a).remove(0);
    }

    public onh() {
        this.f25508a = new ArrayList();
    }
}
