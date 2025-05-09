package tb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.android.behavir.util.b;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a74 implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SensorManager f15579a;
    public b.a c;
    public b.a d;
    public CopyOnWriteArrayList<d> e;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/observer/CommonSensorObserver$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                a74.b(a74.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/observer/CommonSensorObserver$2");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            a74.g(a74.this, true);
            TLog.logd("BX", nbp.TAG, "进入到下一循环");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/observer/CommonSensorObserver$3");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                a74.g(a74.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a();

        void b();

        void onSensorChanged(SensorEvent sensorEvent);
    }

    static {
        t2o.a(404750557);
    }

    public static /* synthetic */ void b(a74 a74Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfb5e66", new Object[]{a74Var, new Boolean(z)});
        } else {
            a74Var.h(z);
        }
    }

    public static /* synthetic */ void g(a74 a74Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fcb005", new Object[]{a74Var, new Boolean(z)});
        } else {
            a74Var.c(z);
        }
    }

    public abstract int a();

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (i() > 0) {
            Iterator<d> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        m();
        a aVar = new a(z);
        this.d = aVar;
        com.taobao.android.behavir.util.b.a(aVar, i());
    }

    public abstract boolean d(SensorEvent sensorEvent);

    public void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30431846", new Object[]{this, dVar});
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArrayList<>();
        }
        if (!this.e.contains(dVar)) {
            this.e.add(dVar);
        }
    }

    public abstract int f();

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        p();
        TLog.logd("BX", nbp.TAG, "当前循环停止");
        if (!z) {
            b.a aVar = this.c;
            if (aVar != null) {
                com.taobao.android.behavir.util.b.d(aVar);
            }
            b.a aVar2 = this.d;
            if (aVar2 != null) {
                com.taobao.android.behavir.util.b.d(aVar2);
                return;
            }
            return;
        }
        this.c = new b();
        if (i() > 0) {
            Iterator<d> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        com.taobao.android.behavir.util.b.a(this.c, f());
    }

    public abstract int i();

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else if (this.f.compareAndSet(true, false)) {
            h(false);
        }
    }

    public abstract void l();

    public abstract void m();

    public void n(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de614083", new Object[]{this, dVar});
            return;
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList = this.e;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(dVar);
        }
    }

    public void o(boolean z) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f66680b", new Object[]{this, new Boolean(z)});
            return;
        }
        j();
        if (this.f.compareAndSet(false, true) && (a2 = a()) >= 0) {
            com.taobao.android.behavir.util.b.a(new c(z), a2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
        } else if (!d(sensorEvent) && (copyOnWriteArrayList = this.e) != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<d> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().onSensorChanged(sensorEvent);
            }
        }
    }

    public abstract void p();

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (f82.d() != null && this.b.compareAndSet(false, true)) {
            this.f15579a = (SensorManager) f82.d().getSystemService(APower.TYPE_SENSOR);
            l();
        }
    }
}
