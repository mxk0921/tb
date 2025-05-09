package tb;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ryg implements dcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = ryg.class.getSimpleName();
    public static ryg d = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<mlc, mlc> f27672a = new ConcurrentHashMap();
    public final kyw b = new kyw(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f27673a;
        public final Object b;

        static {
            t2o.a(779093244);
        }

        public a(String str, Object obj) {
            this.f27673a = str;
            this.b = obj;
        }
    }

    static {
        t2o.a(779093243);
        t2o.a(806356530);
    }

    public static synchronized ryg b() {
        synchronized (ryg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ryg) ipChange.ipc$dispatch("b994a999", new Object[0]);
            }
            if (d == null) {
                d = new ryg();
            }
            return d;
        }
    }

    public final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3acd77", new Object[]{this, str, obj});
        } else if (!arq.a(str)) {
            Iterator it = new ArrayList(((ConcurrentHashMap) this.f27672a).values()).iterator();
            while (it.hasNext()) {
                mlc mlcVar = (mlc) it.next();
                if (mlcVar != null) {
                    try {
                        mlcVar.onLiveEvent(str, obj);
                    } catch (Exception e) {
                        String str2 = c;
                        TLog.loge(str2, "handler [" + str + "] exp. listener [" + mlcVar + "]", e);
                    }
                }
            }
        }
    }

    public void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdd80cd", new Object[]{this, str, obj});
        } else if (!arq.a(str) && this.b != null) {
            this.b.obtainMessage(10101, new a(str, obj)).sendToTarget();
        }
    }

    public void d(mlc mlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0791eba", new Object[]{this, mlcVar});
        } else if (mlcVar != null) {
            ((ConcurrentHashMap) this.f27672a).put(mlcVar, mlcVar);
        }
    }

    public void e(mlc mlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb19353", new Object[]{this, mlcVar});
        } else if (mlcVar != null) {
            ((ConcurrentHashMap) this.f27672a).remove(mlcVar);
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
                a(aVar.f27673a, aVar.b);
            }
        }
    }
}
