package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nug {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int g = eps.r();
    public static final int h = eps.s();

    /* renamed from: a  reason: collision with root package name */
    public nkc f24956a;
    public int b = Integer.MIN_VALUE;
    public int c = 1;
    public int d = 0;
    public long e = 0;
    public final Handler f = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/scrollspeed/ListSpeedJudge$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            nug nugVar = nug.this;
            nug.c(nugVar, 0, nug.a(nugVar), nug.b(nug.this));
        }
    }

    static {
        t2o.a(468714491);
    }

    public static /* synthetic */ int a(nug nugVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cb48ee", new Object[]{nugVar})).intValue();
        }
        return nugVar.b;
    }

    public static /* synthetic */ int b(nug nugVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a7973af", new Object[]{nugVar})).intValue();
        }
        return nugVar.c;
    }

    public static /* synthetic */ void c(nug nugVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6429306", new Object[]{nugVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            nugVar.g(i, i2, i3);
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e00068d", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public void e(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2897b28", new Object[]{this, new Integer(i)});
        } else if (i != this.b) {
            this.f.removeCallbacksAndMessages(null);
            Handler handler = this.f;
            Message obtain = Message.obtain(handler, 0);
            int i3 = h;
            handler.sendMessageDelayed(obtain, i3);
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            this.e = System.currentTimeMillis();
            if (i > this.b) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            this.c = i2;
            this.b = i;
            if (currentTimeMillis <= g) {
                this.d = 2;
                g(2, i, i2);
            } else if (currentTimeMillis >= i3) {
                this.d = 0;
                g(0, i, i2);
            } else {
                this.d = 1;
                g(1, i, i2);
            }
        }
    }

    public void f(nkc nkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35baea80", new Object[]{this, nkcVar});
        } else {
            this.f24956a = nkcVar;
        }
    }

    public final void g(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d730eab", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        nkc nkcVar = this.f24956a;
        if (nkcVar != null) {
            nkcVar.onListSpeedChange(i, i2, i3);
        }
    }
}
