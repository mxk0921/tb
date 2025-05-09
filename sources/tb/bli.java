package tb;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.DaemonWorker;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bli implements ComponentCallbacks2, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static bli f;

    /* renamed from: a  reason: collision with root package name */
    public final int f16465a;
    public volatile boolean b = false;
    public final boolean c;
    public final Handler d;
    public final int e;

    static {
        t2o.a(774897922);
    }

    public bli() {
        this.f16465a = DaemonWorker.MIN_WORK_INTERVAL;
        this.c = false;
        this.e = 2;
        boolean s = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER, "true"));
        this.c = s;
        if (s) {
            if (new Random().nextInt() % 10000 > ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER_PERCENT, "500"))) {
                this.c = false;
                return;
            }
            this.d = new Handler(this);
            this.f16465a = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER_RESTORE_PLAYER_NUM_TIME, "120000"));
            this.e = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_MEMORY_MANAGER_TRIM_NUM, "2"));
        }
    }

    public static synchronized bli a() {
        synchronized (bli.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bli) ipChange.ipc$dispatch("a62ac5da", new Object[0]);
            }
            if (f == null) {
                f = new bli();
            }
            return f;
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94559c0a", new Object[]{this, context});
        } else if (this.c && !this.b) {
            this.b = true;
            try {
                context.getApplicationContext().registerComponentCallbacks(this);
            } catch (Throwable unused) {
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926e6ca", new Object[]{this});
        } else if (this.c) {
            if (this.d.hasMessages(100)) {
                this.d.removeMessages(100);
                this.d.sendEmptyMessageDelayed(100, this.f16465a);
                return;
            }
            int e = pgi.n().e();
            if (e > 2) {
                pgi.n().p(e - this.e);
                this.d.sendEmptyMessageDelayed(100, this.f16465a);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            pgi.n().p(pgi.n().o());
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
        } else if (i == 40 || i == 80 || i == 15) {
            c();
        }
    }
}
