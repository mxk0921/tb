package tb;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.common.BundleMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.rrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lb0 extends com.taobao.monitor.impl.trace.a<a> implements rrt.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void B(Activity activity, Map<String, Object> map, long j);

        void D(Activity activity, long j);

        void d(Activity activity, long j);

        void h(Activity activity, long j);

        void j(Activity activity, long j);

        void k(Activity activity, long j);
    }

    public lb0() {
        rrt.a().e(this);
    }

    public static /* synthetic */ Object ipc$super(lb0 lb0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/ActivityLifeCycleDispatcher");
    }

    @Override // tb.rrt.a
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e56de46e", new Object[]{this});
        }
        return new int[]{130, 131, 132, 133, 134, 135};
    }

    public void e(Activity activity, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7c62f2", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 130;
        obtain.obj = activity;
        Bundle b = rrt.a().b();
        b.putSerializable("params", new BundleMap(map));
        b.putLong("time", j);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    public void f(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d13ac0", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 135;
        obtain.obj = activity;
        Bundle b = rrt.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    public void g(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84c3aef", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 133;
        obtain.obj = activity;
        Bundle b = rrt.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    public void h(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cd9fc2", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 132;
        obtain.obj = activity;
        Bundle b = rrt.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    public void i(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622b42d8", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 131;
        obtain.obj = activity;
        Bundle b = rrt.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    public void j(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84a820c", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 134;
        obtain.obj = activity;
        Bundle b = rrt.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        rrt.a().d(obtain);
    }

    @Override // tb.rrt.a
    public void a(int i, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ebbf64", new Object[]{this, new Integer(i), message});
            return;
        }
        try {
            Bundle data = message.getData();
            switch (i) {
                case 130:
                    Iterator it = ((ArrayList) this.f11091a).iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).B((Activity) message.obj, ((BundleMap) data.getSerializable("params")).getData(), data.getLong("time"));
                    }
                    return;
                case 131:
                    Iterator it2 = ((ArrayList) this.f11091a).iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).k((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 132:
                    Iterator it3 = ((ArrayList) this.f11091a).iterator();
                    while (it3.hasNext()) {
                        ((a) it3.next()).D((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 133:
                    Iterator it4 = ((ArrayList) this.f11091a).iterator();
                    while (it4.hasNext()) {
                        ((a) it4.next()).j((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 134:
                    Iterator it5 = ((ArrayList) this.f11091a).iterator();
                    while (it5.hasNext()) {
                        ((a) it5.next()).h((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 135:
                    Iterator it6 = ((ArrayList) this.f11091a).iterator();
                    while (it6.hasNext()) {
                        ((a) it6.next()).d((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            zq6.a("ActivityLifeCycleDispatcher", e);
        }
    }
}
