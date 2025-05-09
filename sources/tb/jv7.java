package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jv7 implements fgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f22235a = uos.b();
    public long b = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xan f22236a;
        public final /* synthetic */ RSoException b;

        public a(xan xanVar, RSoException rSoException) {
            this.f22236a = xanVar;
            this.b = rSoException;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String h = this.f22236a.h();
            HashMap hashMap = new HashMap();
            hashMap.put(ngd.ARGS_LIB_NAME, h);
            hashMap.put(ngd.ARGS_DOWNLOAD_DURATION, Long.valueOf(uos.b() - jv7.d(jv7.this)));
            hashMap.put("args_real_download_duration", Long.valueOf(uos.b() - jv7.e(jv7.this)));
            RSoException rSoException = this.b;
            if (rSoException == null) {
                RSoLog.d("download -> finished, libName=" + this.f22236a.d());
                rbn.j(ngd.POINT_DOWNLOAD, hashMap);
                return;
            }
            RSoLog.h("download -> error", rSoException);
            rbn.h(ngd.POINT_DOWNLOAD, hashMap, this.b);
        }
    }

    public static /* synthetic */ long d(jv7 jv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5dc667d", new Object[]{jv7Var})).longValue();
        }
        return jv7Var.f22235a;
    }

    public static /* synthetic */ long e(jv7 jv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed0548be", new Object[]{jv7Var})).longValue();
        }
        return jv7Var.b;
    }

    @Override // tb.fgd
    public void a(xan xanVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dd4cf", new Object[]{this, xanVar, rSoException});
        } else {
            rbn.i("download-tracker", new a(xanVar, rSoException));
        }
    }

    @Override // tb.fgd
    public void b(xan xanVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34782f22", new Object[]{this, xanVar, new Integer(i)});
        }
    }

    @Override // tb.fgd
    public void c(xan xanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a71c947", new Object[]{this, xanVar});
        } else {
            this.b = uos.b();
        }
    }
}
