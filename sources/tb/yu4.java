package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yu4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<fqk> f32353a = new HashSet<>();
    public static final a b = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/flash/CountDownManager$Companion$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            Iterator it = yu4.b().iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                ckf.f(next, "next(...)");
                ((fqk) next).onCountDown();
            }
            if (!yu4.b().isEmpty()) {
                b.a(yu4.Companion);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792368);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc169848", new Object[]{bVar});
            } else {
                bVar.b();
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5962ec1", new Object[]{this});
                return;
            }
            yu4.a().removeMessages(0);
            yu4.a().sendEmptyMessageDelayed(0, 1000L);
        }

        public final void c(fqk fqkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b5d5347", new Object[]{this, fqkVar});
                return;
            }
            ckf.g(fqkVar, DataReceiveMonitor.CB_LISTENER);
            if (yu4.b().isEmpty()) {
                b();
            }
            yu4.b().add(fqkVar);
        }

        public final void d(fqk fqkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a714e60", new Object[]{this, fqkVar});
                return;
            }
            ckf.g(fqkVar, DataReceiveMonitor.CB_LISTENER);
            yu4.b().remove(fqkVar);
            if (yu4.b().isEmpty()) {
                yu4.a().removeMessages(0);
            }
        }

        public b() {
        }
    }

    static {
        t2o.a(815792367);
    }

    public static final /* synthetic */ a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ba0c198a", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ HashSet b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("46e85a0c", new Object[0]);
        }
        return f32353a;
    }
}
