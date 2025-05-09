package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.util.ClientSKUUtils;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rrh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "rrh";
    public static rrh d;

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<urh> f27565a = new LinkedBlockingQueue();
    public final Map<String, urh> b = new ConcurrentHashMap();
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            urh urhVar = (urh) rrh.a(rrh.this).poll();
            if (urhVar != null) {
                rrh.b(rrh.this, urhVar);
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                rrh.c(rrh.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ urh f27567a;
        public final /* synthetic */ Map b;

        public b(urh urhVar, Map map) {
            this.f27567a = urhVar;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f27567a.i.onSuccess(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ urh f27568a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Map e;

        public c(urh urhVar, String str, String str2, boolean z, Map map) {
            this.f27568a = urhVar;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f27568a.i.onFail(this.b, this.c, this.d, this.e);
            }
        }
    }

    public static /* synthetic */ BlockingQueue a(rrh rrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("795ce62", new Object[]{rrhVar});
        }
        return rrhVar.f27565a;
    }

    public static /* synthetic */ void b(rrh rrhVar, urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842e564e", new Object[]{rrhVar, urhVar});
        } else {
            rrhVar.m(urhVar);
        }
    }

    public static /* synthetic */ void c(rrh rrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84121221", new Object[]{rrhVar});
        } else {
            rrhVar.f();
        }
    }

    public static rrh e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrh) ipChange.ipc$dispatch("3757f1ec", new Object[0]);
        }
        if (d == null) {
            synchronized (rrh.class) {
                try {
                    if (d == null) {
                        d = new rrh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c5d93d", new Object[]{this, str});
            return;
        }
        try {
            ((wrh) vf1.b("com.taobao.android.msoa", "com.taobao.android.msoa.MSOAServiceImpl")).cancelTimeoutTask(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d45dfa", new Object[]{this});
        } else {
            AsyncTask.execute(new a());
        }
    }

    public void g(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5777a9ef", new Object[]{this, str, str2, str3, map});
        } else {
            j(str, str2, str3, false, map);
        }
    }

    public void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc5fc93", new Object[]{this, str, str2, str3});
            return;
        }
        urh urhVar = (urh) ((ConcurrentHashMap) this.b).remove(str);
        if (urhVar != null) {
            pbu.c(urhVar.b, urhVar.c, urhVar.d, urhVar.e, urhVar.f29570a, String.valueOf(System.currentTimeMillis() - urhVar.h), str2, str3, "MSOA_RequestFailure");
            if (pal.a() && "2.0".equals(urhVar.p)) {
                zrh.f(urhVar.d, urhVar.b, urhVar.c, str2, str3, urhVar.l, urhVar.m, urhVar.n, urhVar.o, urhVar.e, urhVar.p);
            }
            p(urhVar);
        }
        d(str);
    }

    public void i(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5616c692", new Object[]{this, str, str2, str3, map});
        } else {
            j(str, str2, str3, true, map);
        }
    }

    public final void j(String str, String str2, String str3, boolean z, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b1cc4", new Object[]{this, str, str2, str3, new Boolean(z), map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" client listener fail ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        urh urhVar = (urh) ((ConcurrentHashMap) this.b).get(str);
        if (urhVar != null && urhVar.i != null) {
            this.c.post(new c(urhVar, str2, str3, z, map));
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de2a084", new Object[]{this, str});
            return;
        }
        urh urhVar = (urh) ((ConcurrentHashMap) this.b).remove(str);
        if (urhVar != null) {
            pbu.c(urhVar.b, urhVar.c, urhVar.d, urhVar.e, urhVar.f29570a, String.valueOf(System.currentTimeMillis() - urhVar.h), null, null, "MSOA_RequestSuccess");
            if (pal.a() && "2.0".equals(urhVar.p)) {
                zrh.g(urhVar.d, urhVar.b, urhVar.c, urhVar.l, urhVar.m, urhVar.n, urhVar.o, urhVar.e, urhVar.p);
            }
            p(urhVar);
        }
        d(str);
    }

    public void l(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b411a281", new Object[]{this, str, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" client listener success ");
        urh urhVar = (urh) ((ConcurrentHashMap) this.b).get(str);
        if (urhVar != null && urhVar.i != null) {
            this.c.post(new b(urhVar, map));
        }
    }

    public final void m(urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df321596", new Object[]{this, urhVar});
        } else if (urhVar != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(urhVar.f29570a);
                sb.append(" client real request");
                ((wrh) vf1.b("com.taobao.android.msoa", "com.taobao.android.msoa.MSOAServiceImpl")).requestService(urhVar);
            } catch (Exception e) {
                e.printStackTrace();
                j(urhVar.f29570a, "msoa_error_execute_fail", "execute service fail", false, null);
            }
        }
    }

    public void o(vrh vrhVar, MSOAServiceListener mSOAServiceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06ce1a9", new Object[]{this, vrhVar, mSOAServiceListener});
        } else if (vrhVar != null) {
            urh request = vrhVar.getRequest();
            if (request != null) {
                ClientSKUUtils.c(request.b, request.f);
                ClientSKUUtils.f(request);
                ClientSKUUtils.a(request.f, null);
            }
            n(request, mSOAServiceListener);
        } else if (mSOAServiceListener != null) {
            mSOAServiceListener.onFail("msoa_error_invalid_param", "invalid parameter", false, null);
        }
    }

    public final void p(urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42fac83", new Object[]{this, urhVar});
            return;
        }
        try {
            ((wrh) vf1.b("com.taobao.android.msoa", "com.taobao.android.msoa.MSOAServiceImpl")).tryUnbindService(urhVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void n(urh urhVar, MSOAServiceListener mSOAServiceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28eb1705", new Object[]{this, urhVar, mSOAServiceListener});
        } else if (urhVar != null && !TextUtils.isEmpty(urhVar.b) && !TextUtils.isEmpty(urhVar.c) && !TextUtils.isEmpty(urhVar.d)) {
            ClientSKUUtils.f(urhVar);
            ClientSKUUtils.a(urhVar.f, null);
            ClientSKUUtils.m(urhVar.b, urhVar.c);
            ClientSKUUtils.c(urhVar.b, urhVar.f);
            urhVar.f29570a = pbu.a(urhVar.b);
            urhVar.h = System.currentTimeMillis();
            if (mSOAServiceListener != null) {
                mSOAServiceListener = (MSOAServiceListener) Proxy.newProxyInstance(mSOAServiceListener.getClass().getClassLoader(), new Class[]{MSOAServiceListener.class}, new yrh(mSOAServiceListener, urhVar.f29570a));
            }
            urhVar.i = mSOAServiceListener;
            pbu.c(urhVar.b, urhVar.c, urhVar.d, urhVar.e, urhVar.f29570a, null, null, null, "MSOA_RequestService");
            if (((LinkedBlockingQueue) this.f27565a).offer(urhVar)) {
                ((ConcurrentHashMap) this.b).put(urhVar.f29570a, urhVar);
                f();
            } else if (mSOAServiceListener != null) {
                mSOAServiceListener.onFail("msoa_error_queue_full", "queue full", false, null);
            }
        } else if (mSOAServiceListener != null) {
            mSOAServiceListener.onFail("msoa_error_invalid_param", "invalid parameter", false, null);
        }
    }
}
