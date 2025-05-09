package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wvt extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SparseIntArray f30960a;
    public final long b;
    public boolean c = true;
    public a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        int b();
    }

    static {
        t2o.a(779093665);
    }

    public wvt(a aVar, long j, Looper looper) {
        super(looper);
        this.d = aVar;
        this.b = j;
    }

    public static /* synthetic */ Object ipc$super(wvt wvtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/utils/TimerHandler");
    }

    public final long a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4acb9cc2", new Object[]{this, new Integer(i)})).longValue();
        }
        long j = this.b;
        SparseIntArray sparseIntArray = this.f30960a;
        if (sparseIntArray == null) {
            return j;
        }
        long j2 = sparseIntArray.get(i, -1);
        if (j2 > 0) {
            return j2;
        }
        return j;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d2044e", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bad8f3", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void d(SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a217947", new Object[]{this, sparseIntArray});
        } else {
            this.f30960a = sparseIntArray;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0bd302", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f898a7df", new Object[]{this, new Integer(i)});
        } else {
            sendEmptyMessageDelayed(87208, a(i));
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (87208 == message.what && (aVar = this.d) != null) {
            int b = aVar.b();
            try {
                this.d.a();
            } catch (Exception e) {
                TLog.loge("live_uikit.TimerHandler", "handlerMessage exp.", e);
            }
            f(b);
        }
    }
}
