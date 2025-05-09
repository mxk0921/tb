package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.manager.broadcast.BroadcastManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t2b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile l2b d;

    /* renamed from: a  reason: collision with root package name */
    public final z6d f28424a;
    public BroadcastManager b;
    public lk9 c;

    static {
        t2o.a(729809202);
    }

    public t2b(z6d z6dVar) {
        this.f28424a = z6dVar;
    }

    public static l2b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l2b) ipChange.ipc$dispatch("2b5497c4", new Object[0]);
        }
        if (d == null) {
            synchronized (t2b.class) {
                try {
                    if (d == null) {
                        d = new l2b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public BroadcastManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastManager) ipChange.ipc$dispatch("42127a2", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new BroadcastManager(this);
        }
        return this.b;
    }

    public lk9 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lk9) ipChange.ipc$dispatch("52421870", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new lk9();
        }
        return this.c;
    }

    public z6d d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6d) ipChange.ipc$dispatch("de13c8c1", new Object[]{this});
        }
        return this.f28424a;
    }
}
