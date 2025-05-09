package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class rsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f27578a;
    public final boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final rsa f27579a = new rsa();

        static {
            t2o.a(989856402);
        }

        public static /* synthetic */ rsa a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rsa) ipChange.ipc$dispatch("820a0113", new Object[0]);
            }
            return f27579a;
        }
    }

    static {
        t2o.a(989856400);
    }

    public static rsa b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rsa) ipChange.ipc$dispatch("6c841379", new Object[0]);
        }
        return b.a();
    }

    public Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        HandlerThread handlerThread = this.f27578a;
        if (handlerThread == null || !this.b) {
            return null;
        }
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            return new Handler(looper);
        }
        lcn.f(RVLLevel.Error, "Themis/Performance/RequestPrefetch", "looper is null");
        return null;
    }

    public rsa() {
        this.b = false;
        try {
            HandlerThread handlerThread = new HandlerThread("wvRequestPrefetch");
            this.f27578a = handlerThread;
            handlerThread.start();
            this.b = true;
        } catch (Exception unused) {
        }
    }
}
