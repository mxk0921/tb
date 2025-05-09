package tb;

import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sy3 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f28350a = new AtomicBoolean(false);
    public static ScheduleComposer b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f28351a;
        public final /* synthetic */ String b;
        public final /* synthetic */ zmj c;
        public final /* synthetic */ Intent d;

        public a(long j, String str, zmj zmjVar, Intent intent) {
            this.f28351a = j;
            this.b = str;
            this.c = zmjVar;
            this.d = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f28351a;
            qfu.a("composed=false,type=nav,dur=" + uptimeMillis + ",url=" + this.b);
            enj.a(this.c, this.d).toUri(this.d.getDataString());
            sy3.a().compareAndSet(false, true);
        }
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return f28350a;
    }

    public static void b(ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad061150", new Object[]{scheduleComposer});
        } else {
            b = scheduleComposer;
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "ColdStartNavigation";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return f28350a.get();
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (b == null) {
            whh.a("ColdStartNavigation", "something went wrong, the schedule composer is null");
            return true;
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            whh.a("ColdStartNavigation", "something went wrong, the navigation is scheduled on wrong thread, it should be main");
            return true;
        } else if (intent.getBooleanExtra("fullyNewInstall", false)) {
            whh.a("ColdStartNavigation", "fullyNewInstall is true, skip cold start navigation");
            return true;
        } else {
            boolean a2 = b.a();
            String dataString = intent.getDataString();
            if (a2) {
                qfu.a("composed=true,type=nav,dur=0,url=" + dataString);
                return true;
            }
            v8n.a(zmjVar.d(), intent.getData());
            return !b.g("ColdStartNavigation", intent, new a(SystemClock.uptimeMillis(), dataString, zmjVar, intent));
        }
    }
}
