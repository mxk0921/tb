package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class jnq extends ol8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final Object h = new Object();
    public final List<a> i = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f22098a;
        public final Map<String, ?> b;

        public a(int i, Map<String, ?> map) {
            this.f22098a = i;
            this.b = map;
        }
    }

    public jnq(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(jnq jnqVar, String str, Object... objArr) {
        if (str.hashCode() == -1330343191) {
            super.k(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/StickyEventSource");
    }

    @Override // tb.ol8
    public void k(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b492e9", new Object[]{this, new Integer(i), map});
        } else if (this.g.get()) {
            super.k(i, map);
        } else {
            synchronized (this.h) {
                ((ArrayList) this.i).add(new a(i, map));
            }
        }
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
            return;
        }
        this.g.set(true);
        synchronized (this.h) {
            try {
                Iterator it = ((ArrayList) this.i).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    k(aVar.f22098a, aVar.b);
                }
                ((ArrayList) this.i).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.g.set(false);
        }
    }
}
