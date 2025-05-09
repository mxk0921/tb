package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import tb.rib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class du implements jsd, lsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final rib.a f18066a;
    public final qh2 b;
    public final lh2 c;
    public final xiq d;
    public int e;
    public final a29 f;
    public final Handler g = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/arch/flow/state/lifestate/AbsBaseState$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            removeCallbacksAndMessages(null);
            tm1.a("2ARCH_AbsBaseState", "handleMessage result: " + message.what + " , 超时状态 state: " + du.this.getState());
            du.this.f();
        }
    }

    static {
        t2o.a(736100405);
        t2o.a(736100409);
        t2o.a(736100388);
    }

    public du(qh2 qh2Var, lh2 lh2Var, a29 a29Var, xiq xiqVar, rib.a aVar) {
        this.b = qh2Var;
        this.c = lh2Var;
        this.d = xiqVar;
        this.f = a29Var;
        this.f18066a = aVar;
    }

    @Override // tb.lsd
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83eb919", new Object[]{this, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_AbsBaseState", "notifyViewShown 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // tb.lsd
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29190544", new Object[]{this, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_AbsBaseState", "notifyTerminate 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // tb.lsd
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fab6572", new Object[]{this, new Integer(i)});
            return;
        }
        tm1.a("2ARCH_AbsBaseState", "notifyViewCreate 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    @Override // tb.lsd
    public void d(BootImageInfo bootImageInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d6b375", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
            return;
        }
        tm1.a("2ARCH_AbsBaseState", "notifyOnStart 停止计时: ");
        this.g.removeCallbacksAndMessages(null);
    }

    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc60f4f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e = i2;
        tm1.a("2ARCH_AbsBaseState", "handleState current state: " + i + " 开始超时计时");
        this.g.sendEmptyMessageDelayed(2000, 500L);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47459e9", new Object[]{this});
        } else {
            this.g.sendEmptyMessageDelayed(2000, 500L);
        }
    }
}
