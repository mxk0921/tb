package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rrt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WHAT_ASYNC_LIFECYCLE_CREATE = 130;
    public static final int WHAT_ASYNC_LIFECYCLE_DESTROY = 135;
    public static final int WHAT_ASYNC_LIFECYCLE_PAUSE = 133;
    public static final int WHAT_ASYNC_LIFECYCLE_RESUME = 132;
    public static final int WHAT_ASYNC_LIFECYCLE_START = 131;
    public static final int WHAT_ASYNC_LIFECYCLE_STOP = 134;
    public static final int WHAT_BLOCK_FPS = 121;
    public static final int WHAT_FPS = 120;
    public static final int WHAT_HITCH_RATE = 122;
    public static final rrt c = new rrt();
    public static final Queue<Bundle> d = new LinkedList();

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f27573a = new ArrayList();
    public Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(int i, Message message);

        int[] b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<a> f27574a;

        public b(Looper looper, List<a> list) {
            super(looper);
            this.f27574a = list;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/common/ThreadSwitcher$ThreadMsgProcessorHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int[] b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            List<a> list = this.f27574a;
            if (!(list == null || message == null)) {
                for (a aVar : list) {
                    for (int i : aVar.b()) {
                        if (i == message.what) {
                            aVar.a(i, message);
                        }
                    }
                }
            }
        }
    }

    public static rrt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrt) ipChange.ipc$dispatch("707043e5", new Object[0]);
        }
        return c;
    }

    public Bundle b() {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("57d5ebd2", new Object[]{this});
        }
        Queue<Bundle> queue = d;
        synchronized (queue) {
            try {
                bundle = (Bundle) ((LinkedList) queue).poll();
                if (bundle == null) {
                    bundle = new Bundle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public void c(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46909458", new Object[]{this, bundle});
        } else if (bundle != null) {
            bundle.clear();
            Queue<Bundle> queue = d;
            synchronized (queue) {
                if (((LinkedList) queue).size() < 100) {
                    ((LinkedList) queue).add(bundle);
                }
            }
        }
    }

    public void d(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e2feb9", new Object[]{this, message});
        } else {
            this.b.sendMessage(message);
        }
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec922132", new Object[]{this, aVar});
        } else if (aVar != null) {
            ((ArrayList) this.f27573a).add(aVar);
        }
    }

    public void f(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64e7e0b", new Object[]{this, looper});
        } else {
            this.b = new b(looper, this.f27573a);
        }
    }
}
