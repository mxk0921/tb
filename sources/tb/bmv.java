package tb;

import com.alibaba.analytics.core.sync.a;
import com.alibaba.analytics.core.sync.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bmv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSGTYPE_BACKGROUND = "bg";
    public static final String MSGTYPE_FOREGROUND = "fg";
    public static final String MSGTYPE_INIT = "init";
    public static final String MSGTYPE_INTERVAL = "i";
    public static final String MSGTYPE_REALTIME = "r";
    public static final String MSGTYPE_START_LOG = "stl";
    private static final String b = "UploadQueueMgr";
    private static BlockingQueue<String> c = new LinkedBlockingQueue();
    private static bmv d = new bmv();

    /* renamed from: a  reason: collision with root package name */
    private boolean f16485a = false;

    static {
        t2o.a(962592966);
    }

    public static bmv b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmv) ipChange.ipc$dispatch("517ad19d", new Object[0]);
        }
        return d;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (!this.f16485a) {
            this.f16485a = true;
            zdt.c().d(null, b(), 0L);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String take;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (this.f16485a) {
            try {
                take = c.take();
            } catch (Throwable th) {
                nhh.h(b, th, new Object[0]);
            }
            if (!MSGTYPE_INTERVAL.equals(take) && !"init".equals(take) && !"fg".equals(take) && !"bg".equals(take)) {
                if ("r".equals(take)) {
                    a.h().j();
                } else if (MSGTYPE_START_LOG.equals(take)) {
                    flv.h().j();
                }
            }
            b.i().m();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59241472", new Object[]{this, str});
        } else if (MSGTYPE_START_LOG.equals(str) || "bg".equals(str)) {
            try {
                nhh.f(b, "queueCache put", str);
                c.put(str);
            } catch (Exception e) {
                nhh.f(b, e);
            }
        } else if (!c.contains(str)) {
            try {
                nhh.f(b, "queueCache put", str);
                c.put(str);
            } catch (Exception e2) {
                nhh.h(b, e2, new Object[0]);
            }
        } else {
            nhh.f(b, "queueCache contains", str);
        }
    }
}
