package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class avr implements d0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16030a = true;
    public final tkc b = new ebp();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16031a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f16031a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = 0;
            boolean z = false;
            while (true) {
                int i2 = i + 1;
                if (i >= 2) {
                    break;
                }
                try {
                    z = avr.b(avr.this, this.f16031a, this.b);
                    if (z) {
                        break;
                    }
                    i = i2;
                } catch (Throwable th) {
                    khh.b(th);
                    return;
                }
            }
            if (!z) {
                avr.c(avr.this, this.f16031a, this.b);
                avr.e(avr.this, true);
            }
            if (z && avr.d(avr.this)) {
                avr.f(avr.this);
                avr.e(avr.this, false);
            }
        }
    }

    public static /* synthetic */ boolean b(avr avrVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b69f8cc2", new Object[]{avrVar, str, str2})).booleanValue();
        }
        return avrVar.h(str, str2);
    }

    public static /* synthetic */ void c(avr avrVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c61c1d", new Object[]{avrVar, str, str2});
        } else {
            avrVar.g(str, str2);
        }
    }

    public static /* synthetic */ boolean d(avr avrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c588a6c", new Object[]{avrVar})).booleanValue();
        }
        return avrVar.f16030a;
    }

    public static /* synthetic */ boolean e(avr avrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1621ff2", new Object[]{avrVar, new Boolean(z)})).booleanValue();
        }
        avrVar.f16030a = z;
        return z;
    }

    public static /* synthetic */ void f(avr avrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8edd47", new Object[]{avrVar});
        } else {
            avrVar.i();
        }
    }

    @Override // tb.d0d
    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4384fd91", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        zq6.a("TBRestSender", str, str2);
        if (o48.f25136a && !z) {
            cst.c(new a(str, str2));
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0885ad", new Object[]{this, str, str2});
            return;
        }
        tkc tkcVar = this.b;
        ((ebp) tkcVar).c(str + "HA_APM_______HA_APM" + str2);
    }

    public final boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22e35942", new Object[]{this, str, str2})).booleanValue();
        }
        return zap.b().d(null, System.currentTimeMillis(), null, 61004, "AliHAMonitor", str2, str, null).booleanValue();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0280bd", new Object[]{this});
            return;
        }
        List<String> d = ((ebp) this.b).d();
        if (d != null) {
            for (String str : d) {
                if (str != null) {
                    String[] split = str.split("HA_APM_______HA_APM");
                    if (split.length >= 2) {
                        h(split[0], split[1]);
                    }
                }
            }
        }
        ((ebp) this.b).b();
    }
}
