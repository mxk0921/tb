package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.sft;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class phe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zpt f26092a = (zpt) c62.getInstance(zpt.class);
    public final sft b = sft.createInstance();
    public final Map<String, sft.c> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Map.Entry entry : phe.access$000(phe.this).entrySet()) {
                String str = (String) entry.getKey();
                ((sft.c) entry.getValue()).run();
            }
            phe.access$100(phe.this).shutDown();
        }
    }

    static {
        t2o.a(954204162);
    }

    public static /* synthetic */ Map access$000(phe pheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fa3181f", new Object[]{pheVar});
        }
        return pheVar.c;
    }

    public static /* synthetic */ sft access$100(phe pheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sft) ipChange.ipc$dispatch("d61a0ae1", new Object[]{pheVar});
        }
        return pheVar.b;
    }

    public void addTask(String str, sft.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f0daf8", new Object[]{this, str, cVar});
        } else {
            ((ConcurrentHashMap) this.c).put(str, cVar);
        }
    }

    public sft getTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sft) ipChange.ipc$dispatch("9b9dea95", new Object[]{this});
        }
        return this.b;
    }

    public void idleRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6bca31e", new Object[]{this});
        } else {
            this.f26092a.execute(new a());
        }
    }
}
