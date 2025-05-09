package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oj {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final oj b = new oj();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Queue<mj>> f25419a = new ConcurrentHashMap<>();

    static {
        t2o.a(79691805);
    }

    public static oj c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oj) ipChange.ipc$dispatch("d714642c", new Object[0]);
        }
        return b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944833fb", new Object[]{this, str});
            return;
        }
        mj g = g(str);
        if (g != null) {
            g.destroy();
        }
    }

    public final mj b(Context context, nj njVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("13cfb5ba", new Object[]{this, context, njVar});
        }
        njVar.g(true);
        mj h = mj.h(new lo(context, njVar.f()));
        IAURAPluginCenter[] b2 = njVar.b();
        if (b2 != null) {
            h.o(b2);
        }
        IAURAInputField<Object> a2 = njVar.a();
        if (a2 != null) {
            h.b(a2);
        }
        String d = njVar.d();
        if (!TextUtils.isEmpty(d)) {
            h.t(d);
        }
        return h;
    }

    public final Queue<mj> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("469cd177", new Object[]{this, str});
        }
        Queue<mj> queue = this.f25419a.get(str);
        if (queue != null) {
            return queue;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f25419a.put(str, concurrentLinkedQueue);
        return concurrentLinkedQueue;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37d2fc0", new Object[]{this, str});
        } else {
            ck.g().e(str, ck.b.b().i("AURA/preInit").a());
        }
    }

    public mj g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("e2740bf7", new Object[]{this, str});
        }
        Queue<mj> queue = this.f25419a.get(str);
        if (queue == null || queue.isEmpty()) {
            return null;
        }
        mj poll = queue.poll();
        if (queue.isEmpty()) {
            this.f25419a.remove(str);
        }
        return poll;
    }

    public void h(Context context, nj njVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f02fc06", new Object[]{this, context, njVar});
            return;
        }
        String c = njVar.c();
        if (!e(c, njVar)) {
            if (this.f25419a.size() > 2) {
                f("preLoadAURAInstance failed, pool is overflow");
            }
            Queue<mj> d = d(c);
            if (d.size() > 0) {
                f("instanceReadyQueue size >= 1,stop pre init");
                return;
            }
            mj b2 = b(context, njVar);
            Collection<String> e = njVar.e();
            if (e != null && !e.isEmpty()) {
                b2.m(e);
            }
            d.add(b2);
            f("aura 实例preInit成功");
        }
    }

    public final boolean e(String str, nj njVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5e3b789", new Object[]{this, str, njVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            f("preLoadAURAInstance failed, bizName is null");
            return true;
        } else if (!TextUtils.isEmpty(njVar.d())) {
            return false;
        } else {
            f("preLoadAURAInstance failed, configAssetFileName is null");
            return true;
        }
    }
}
