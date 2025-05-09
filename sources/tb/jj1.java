package tb;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.augecore.data.GroupData;
import com.taobao.augecore.jsbridge.AugeSDKJSBridge;
import com.taobao.augecore.remote.BroadCastManager;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "auge";

    /* renamed from: a  reason: collision with root package name */
    public Context f22023a;
    public boolean b;
    public HashMap<String, Object> c;
    public final String d;
    public Handler e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22025a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements ry4 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // tb.ry4
            public void a(List<GroupData> list, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bd4c35c3", new Object[]{this, list, str});
                } else {
                    fj1.n().g(list);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i) {
            super(str);
            this.f22025a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/augecore/AugeSdkManager$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hj1.a(jj1.LOG_TAG, "delayRequestRandom === 延迟：" + this.f22025a + "s，请求网络数据");
            gj1.c().d(new a(this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ry4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(jj1 jj1Var) {
        }

        @Override // tb.ry4
        public void a(List<GroupData> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd4c35c3", new Object[]{this, list, str});
            } else {
                fj1.n().g(list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final jj1 f22026a = new jj1(null);

        public static /* synthetic */ jj1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jj1) ipChange.ipc$dispatch("5cb7003e", new Object[0]);
            }
            return f22026a;
        }
    }

    public /* synthetic */ jj1(a aVar) {
        this();
    }

    public static /* synthetic */ void a(jj1 jj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a7f738", new Object[]{jj1Var});
        } else {
            jj1Var.b();
        }
    }

    public static jj1 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj1) ipChange.ipc$dispatch("b16a06f9", new Object[0]);
        }
        return d.a();
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[0]);
            return;
        }
        hj1.f20677a = true;
        hj1.a(LOG_TAG, "turnOnDebug，打开debug模式");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504fd476", new Object[]{this});
            return;
        }
        int g = ej1.g(ej1.c());
        hj1.a(LOG_TAG, "delayRequestRandom === 获取到的打散时间=" + g + "s");
        Coordinator.postTask(new b(LOG_TAG, g), g * 1000);
    }

    public List<String> c(String str, List<String> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb193c8e", new Object[]{this, str, list, str2});
        }
        return fj1.n().j(str, list, str2);
    }

    public boolean d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d996e9f", new Object[]{this, str, str2, str3})).booleanValue();
        }
        return fj1.n().s(str, str2, str3);
    }

    public Handler e() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a253a2e1", new Object[]{this});
        }
        try {
            handler = this.e;
        } catch (Exception e) {
            hj1.a(LOG_TAG, "getHandlerThread == 获取异常：" + e);
        }
        if (handler != null) {
            return handler;
        }
        HashMap<String, Object> hashMap = this.c;
        if (hashMap != null && hashMap.size() > 0 && ((Boolean) this.c.get("isNetWorkInThread")).booleanValue()) {
            HandlerThread handlerThread = new HandlerThread(this.d);
            handlerThread.start();
            this.e = new Handler(handlerThread.getLooper());
        }
        return this.e;
    }

    public void g(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c2bc02", new Object[]{this, context, hashMap});
            return;
        }
        this.c = hashMap;
        f(context);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf30958", new Object[]{this});
            return;
        }
        List<GroupData> c2 = dj1.c(gj1.GROUP_DATA);
        String b2 = dj1.b(gj1.GROUP_DATA_LOW_BUYER, "0");
        if (!fj1.n().t()) {
            hj1.a(LOG_TAG, "prepareData，本地数据为空，并且过期，请求接口");
            if (!TextUtils.isEmpty(ej1.d(h().f22023a))) {
                b();
                return;
            }
            return;
        }
        fj1.n().u(c2);
        fj1.n().y(b2);
        hj1.a(LOG_TAG, "prepareData，本地数据为： " + c2.toString());
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0d49de", new Object[]{this});
        } else {
            c21.c(new a());
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e66a61e", new Object[]{this});
            return;
        }
        hj1.a(LOG_TAG, "触发更新");
        if (!fj1.n().t()) {
            hj1.a(LOG_TAG, "触发更新，本地数据过期，重新拉取数据");
            gj1.c().d(new c(this));
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f36214", new Object[]{this})).booleanValue();
        }
        return fj1.n().w();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1 || i == 2) {
                hj1.a(jj1.LOG_TAG, "前后台切换");
                if (!fj1.n().t()) {
                    hj1.a(jj1.LOG_TAG, "前后台切换,本地数据过期，重新拉取数据");
                    jj1.a(jj1.this);
                }
            }
        }
    }

    public jj1() {
        this.b = false;
        this.d = "AugeNonUIThread";
        this.e = null;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        hj1.a(LOG_TAG, "开始初始化,isInitialed == " + this.b);
        if (!this.b) {
            this.b = true;
            this.f22023a = context;
            dj1.d(context);
            BroadCastManager.c(context);
            fsw.h(AugeSDKJSBridge.NAME, AugeSDKJSBridge.class);
            i();
            ej1.i();
            j();
            hj1.a(LOG_TAG, "结束初始化，isInitialed == " + this.b);
        }
    }
}
