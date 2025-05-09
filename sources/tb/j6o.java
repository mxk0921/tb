package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j6o implements b7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f21797a = new ScheduledThreadPoolExecutor(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21798a;
        public final /* synthetic */ String b;

        public a(int i, String str) {
            this.f21798a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                t71.a(this.b, bcq.a().e().j().getResources().getResourceName(this.f21798a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(676331542);
        t2o.a(676331540);
    }

    @Override // tb.b7e
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4f37b", new Object[]{this, str, new Integer(i)});
        } else {
            this.f21797a.schedule(new a(i, str), 500L, TimeUnit.MICROSECONDS);
        }
    }
}
