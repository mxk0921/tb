package tb;

import android.os.Handler;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ixx implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mzd f21637a;
    public final z6e b;
    public final Object c;
    public final int d;

    private ixx(int i, z6e z6eVar, mzd mzdVar, Object obj) {
        this.d = i;
        this.b = z6eVar;
        this.f21637a = mzdVar;
        this.c = obj;
    }

    public static void a(Handler handler, int i, z6e z6eVar, mzd mzdVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78d85a1", new Object[]{handler, new Integer(i), z6eVar, mzdVar, obj});
        } else if (mzdVar != null) {
            ixx ixxVar = new ixx(i, z6eVar, mzdVar, obj);
            if (handler == null) {
                ewx.a(ixxVar);
            } else {
                handler.post(ixxVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        switch (this.d) {
            case 0:
                this.f21637a.onSuccess(this.b, (ozd) this.c);
                return;
            case 1:
                this.f21637a.onCancel(this.b);
                return;
            case 2:
                this.f21637a.onFailure(this.b, (ndt) this.c);
                return;
            case 3:
                this.f21637a.onProgress(this.b, ((Integer) ((Pair) this.c).first).intValue());
                return;
            case 4:
                this.f21637a.onPause(this.b);
                return;
            case 5:
                this.f21637a.onStart(this.b);
                return;
            case 6:
                this.f21637a.onResume(this.b);
                return;
            case 7:
                this.f21637a.onWait(this.b);
                return;
            default:
                return;
        }
    }
}
