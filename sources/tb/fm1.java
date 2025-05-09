package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.b;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayDeque;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fm1 implements gm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hm1 f19401a = new hm1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BHREvent b;

        public a(BHREvent bHREvent) {
            this.b = bHREvent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/decision/BHRDecisionEngine$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            BehaviR.getInstance().getConfigCenter();
            this.b.addBrMark();
            fm1.this.h(this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fm1 f19402a = fm1.b();

        static {
            t2o.a(404750369);
        }

        public static /* synthetic */ fm1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fm1) ipChange.ipc$dispatch("2bb99da3", new Object[0]);
            }
            return f19402a;
        }
    }

    static {
        t2o.a(404750367);
        t2o.a(404750371);
    }

    public fm1() {
        new ArrayDeque();
    }

    public static /* synthetic */ fm1 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fm1) ipChange.ipc$dispatch("2bb99da3", new Object[0]);
        }
        return d();
    }

    public static fm1 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fm1) ipChange.ipc$dispatch("3c6f6a64", new Object[0]);
        }
        return new fm1();
    }

    public static fm1 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fm1) ipChange.ipc$dispatch("418d26cd", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.gm1
    public void a(BHREvent bHREvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955fbb75", new Object[]{this, bHREvent});
        } else {
            c(bHREvent, false);
        }
    }

    public final void c(BHREvent bHREvent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fa06dd", new Object[]{this, bHREvent, new Boolean(z)});
        } else if (bHREvent != null) {
            a aVar = new a(bHREvent);
            if (z) {
                com.taobao.android.behavir.util.b.c(aVar);
            } else {
                com.taobao.android.behavir.util.b.b(aVar);
            }
        }
    }

    public BHREvent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHREvent) ipChange.ipc$dispatch("60975971", new Object[]{this});
        }
        return g();
    }

    public BHREvent g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHREvent) ipChange.ipc$dispatch("5e487275", new Object[]{this});
        }
        return this.f19401a.b();
    }

    public void h(BHREvent bHREvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e54fc2e", new Object[]{this, bHREvent});
        } else if (bHREvent != null) {
            if (!f82.j()) {
                UtUtils.e("UCP", 19999, TLogTracker.SCENE_EXCEPTION, NativeBroadcast.MAKE_DECISION, bHREvent.actionName, "");
            } else {
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.MAKE_DECISION, bHREvent.toJsonObject(), null);
            }
        }
    }
}
