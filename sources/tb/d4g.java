package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d4g implements nic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f17567a;
    public nic b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17568a;
        public final /* synthetic */ String[] b;

        public a(String str, String[] strArr) {
            this.f17568a = str;
            this.b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (d4g.b(d4g.this) != null) {
                d4g.b(d4g.this).a(this.f17568a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final d4g f17569a = new d4g(null);

        static {
            t2o.a(1017118807);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1017118808);
        }

        public c(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/monitor/KeyMonitor$MonitorHandler");
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a3198ca", new Object[]{this, runnable});
                return;
            }
            nhh.d();
            if (runnable != null) {
                try {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = runnable;
                    sendMessage(obtain);
                } catch (Exception e) {
                    nhh.h("MonitorHandler", e, new Object[0]);
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                Object obj = message.obj;
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            } catch (Throwable th) {
                nhh.h("MonitorHandler", th, new Object[0]);
            }
            super.handleMessage(message);
        }
    }

    static {
        t2o.a(1017118805);
        t2o.a(1017118804);
    }

    public /* synthetic */ d4g(a aVar) {
        this();
    }

    public static /* synthetic */ nic b(d4g d4gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nic) ipChange.ipc$dispatch("857074b5", new Object[]{d4gVar});
        }
        return d4gVar.b;
    }

    public static d4g e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4g) ipChange.ipc$dispatch("ea0e1881", new Object[0]);
        }
        return b.f17569a;
    }

    @Override // tb.nic
    public void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d00209", new Object[]{this, str, strArr});
        } else if (this.b != null) {
            this.f17567a.a(new a(str, strArr));
        }
    }

    public void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{this, str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(UserTrackLogs.UT_PAGE_NAME, str, str2, str3, str4);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{this, str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, str, str2);
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e18d0b8", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void g(nic nicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc9033a4", new Object[]{this, nicVar});
        } else {
            this.b = nicVar;
        }
    }

    public d4g() {
        this.f17567a = new c(Looper.getMainLooper());
    }
}
