package tb;

import android.taobao.windvane.connect.HttpConnector;
import android.taobao.windvane.thread.WVThreadPool;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class hi4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static hi4 f20660a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20661a;
        public final /* synthetic */ h7b b;

        public a(String str, h7b h7bVar) {
            this.f20661a = str;
            this.b = h7bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            v7t.a("WVThreadPool", "Task has been executed");
            try {
                new HttpConnector().e(new v7b(this.f20661a), this.b);
            } catch (Exception e) {
                v7t.a("WVThreadPool", "Task exception:" + e.getMessage());
            }
        }
    }

    static {
        t2o.a(989855799);
    }

    public static synchronized hi4 c() {
        synchronized (hi4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hi4) ipChange.ipc$dispatch("959183a7", new Object[0]);
            }
            if (f20660a == null) {
                f20660a = new hi4();
            }
            return f20660a;
        }
    }

    public void a(String str, h7b<b8b> h7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bd01f9", new Object[]{this, str, h7bVar});
        } else {
            b(str, h7bVar, null);
        }
    }

    public void b(String str, h7b<b8b> h7bVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75cff83", new Object[]{this, str, h7bVar, str2});
        } else if (str != null) {
            WVThreadPool.getInstance().execute(new a(str, h7bVar), str2);
        }
    }
}
