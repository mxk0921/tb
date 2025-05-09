package tb;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qyg implements dcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = qyg.class.getSimpleName();
    public static qyg d = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<nlc, nlc> f27004a = new ConcurrentHashMap();
    public final kyw b = new kyw(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f27005a;
        public final Object b;

        static {
            t2o.a(806355485);
        }

        public a(String str, Object obj) {
            this.f27005a = str;
            this.b = obj;
        }
    }

    static {
        t2o.a(806355484);
        t2o.a(806356530);
    }

    public static synchronized void a() {
        synchronized (qyg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[0]);
                return;
            }
            qyg qygVar = d;
            if (qygVar != null) {
                qygVar.g();
            }
            d = null;
        }
    }

    public static synchronized qyg c() {
        synchronized (qyg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qyg) ipChange.ipc$dispatch("ea890b10", new Object[0]);
            }
            if (d == null) {
                d = new qyg();
            }
            return d;
        }
    }

    public final void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3acd77", new Object[]{this, str, obj});
        } else if (!arq.a(str)) {
            Iterator it = new ArrayList(((ConcurrentHashMap) this.f27004a).values()).iterator();
            while (it.hasNext()) {
                nlc nlcVar = (nlc) it.next();
                if (nlcVar != null) {
                    try {
                        nlcVar.onLiveEvent(str, obj);
                    } catch (Exception e) {
                        String str2 = c;
                        r0h.c(str2, "handler [" + str + "] exp. listener [" + nlcVar + "]", e);
                    }
                }
            }
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0d9b31", new Object[]{this, str});
        } else {
            e(str, null);
        }
    }

    public void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdd80cd", new Object[]{this, str, obj});
        } else if (!arq.a(str) && this.b != null) {
            this.b.obtainMessage(10101, new a(str, obj)).sendToTarget();
        }
    }

    public void f(nlc nlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d10fd15", new Object[]{this, nlcVar});
        } else if (nlcVar != null) {
            ((ConcurrentHashMap) this.f27004a).put(nlcVar, nlcVar);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        kyw kywVar = this.b;
        if (kywVar != null) {
            kywVar.removeCallbacksAndMessages(null);
        }
        ((ConcurrentHashMap) this.f27004a).clear();
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f6f649", new Object[]{this, str});
        } else {
            i(str, null);
        }
    }

    @Override // tb.dcc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (10101 == message.what) {
            Object obj = message.obj;
            if (obj instanceof a) {
                a aVar = (a) obj;
                b(aVar.f27005a, aVar.b);
            }
        }
    }

    public void i(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63f45e5", new Object[]{this, str, obj});
        } else if (!arq.a(str)) {
            b(str, obj);
        }
    }

    public void j(nlc nlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9a03dc", new Object[]{this, nlcVar});
        } else if (nlcVar != null) {
            ((ConcurrentHashMap) this.f27004a).remove(nlcVar);
        }
    }
}
