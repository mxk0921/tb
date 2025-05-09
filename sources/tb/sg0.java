package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet<c> f28027a = new CopyOnWriteArraySet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f28028a;

        public a(Map map) {
            this.f28028a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator it = sg0.a().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).b(this.f28028a);
                }
            } catch (Throwable unused) {
                vp9.b("linkx", "AfcFlowStatusHelper === notifyForFlowEnter error");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f28029a;

        public b(Map map) {
            this.f28029a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator it = sg0.a().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(this.f28029a);
                }
            } catch (Throwable unused) {
                vp9.b("linkx", "AfcFlowStatusHelper === notifyForFlowLeave error");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(Map<String, Object> map);

        void b(Map<String, Object> map);
    }

    static {
        t2o.a(467664968);
    }

    public static /* synthetic */ CopyOnWriteArraySet a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("5205e0b2", new Object[0]);
        }
        return f28027a;
    }

    public static void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e58ae74", new Object[]{map});
        } else {
            zsa.b.a(new a(map));
        }
    }

    public static void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da8c435", new Object[]{map});
        } else {
            zsa.b.a(new b(map));
        }
    }

    public static void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965fc0c5", new Object[]{cVar});
        } else if (cVar != null) {
            f28027a.add(cVar);
        }
    }
}
