package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.FavoriteConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xb0 implements wb0, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f31261a;
    public final Handler b;
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31262a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public String h;
        public long i;
        public long j;

        public static /* synthetic */ a a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("afc343c2", new Object[]{intent});
            }
            return d(intent);
        }

        public static /* synthetic */ String b(Intent intent, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5460b981", new Object[]{intent, str});
            }
            return e(intent, str);
        }

        public static a d(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9aa45bce", new Object[]{intent});
            }
            a aVar = new a();
            aVar.i = SystemClock.uptimeMillis();
            aVar.f31262a = e(intent, FavoriteConstants.QUERY_PARAMS_CREATE_TYPE);
            aVar.h = e(intent, "instanceType");
            aVar.b = intent.getDataString();
            aVar.d = intent.getAction();
            aVar.g = intent.getBooleanExtra("fullyNewInstall", false);
            aVar.e = String.valueOf(intent.getCategories());
            return aVar;
        }

        public static String e(Intent intent, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b718e118", new Object[]{intent, str});
            }
            if (intent == null) {
                return null;
            }
            return intent.getStringExtra(str);
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9ffbfec3", new Object[]{this});
            }
            return "createType=" + this.f31262a + ",duration=" + this.j + ",finishReason=" + this.f + ",newInstall=" + this.g + ",instanceType=" + this.h + ",data=" + this.b + ",action=" + this.d + ",categories=" + this.e + ",referrer=" + this.c;
        }
    }

    public xb0(Looper looper) {
        this.b = new Handler(looper, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        r4 = r4.getReferrer();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.app.Activity r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xb0.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "43643ac3"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            r2 = 0
            if (r0 >= r1) goto L_0x001d
            return r2
        L_0x001d:
            android.net.Uri r4 = tb.hmo.a(r4)
            if (r4 != 0) goto L_0x0024
            return r2
        L_0x0024:
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xb0.c(android.app.Activity):java.lang.String");
    }

    @Override // tb.wb0
    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dadc094", new Object[]{this, activity});
            return;
        }
        whh.a("ActivityMonitor", "onCreate target: " + activity);
        a a2 = a.a(activity.getIntent());
        this.f31261a = a2;
        a2.c = c(activity);
        f();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43396b6", new Object[]{this});
            return;
        }
        whh.a("ActivityMonitor", "FINISH_TIMEOUT");
        g("FINISH_TIMEOUT");
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39174778", new Object[]{this});
            return;
        }
        whh.a("ActivityMonitor", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.LIVE_FINISH_STATUS);
        g(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.LIVE_FINISH_STATUS);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.b.sendEmptyMessageDelayed(100, 20000L);
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9662f97", new Object[]{this, str});
        } else if (this.f31261a != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            a aVar = this.f31261a;
            aVar.j = uptimeMillis - aVar.i;
            String c = aVar.c();
            whh.c("ActivityMonitor", "activityInLog: " + c);
            AppMonitor.Counter.commit(erj.MODULE, "ActivityMonitor", "type=" + str + "," + this.f31261a.c(), 1.0d);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 100) {
            d();
        } else if (i == 101) {
            e();
        }
        return false;
    }

    @Override // tb.wb0
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c2cd6b", new Object[]{this, activity});
        } else if (!this.c) {
            this.c = true;
            whh.a("ActivityMonitor", "onFinish target: " + activity);
            if (this.b == null) {
                whh.a("ActivityMonitor", "already released, lifecycle is ended");
                return;
            }
            a aVar = this.f31261a;
            if (aVar == null) {
                whh.a("ActivityMonitor", "activityIn is null");
                return;
            }
            aVar.f = a.b(activity.getIntent(), "finishReason");
            this.b.removeMessages(100);
            this.b.sendEmptyMessage(101);
        }
    }
}
