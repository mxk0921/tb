package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sd0 implements pvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<tvh> f27963a;
    public final int b;

    static {
        t2o.a(982515935);
        t2o.a(982516055);
    }

    public sd0(tvh tvhVar, int i, Object obj) {
        this.f27963a = new WeakReference<>(tvhVar);
        this.b = i;
    }

    @Override // tb.pvh
    public void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
            return;
        }
        tvh c = c();
        if (c != null && !c.isDestroyed()) {
            ((WeexInstanceImpl) c.j()).invokeCallback(this.b, d(objArr), true);
        }
    }

    @Override // tb.pvh
    public void b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
            return;
        }
        tvh tvhVar = this.f27963a.get();
        if (tvhVar != null && !tvhVar.isDestroyed()) {
            ((WeexInstanceImpl) tvhVar.j()).invokeCallback(this.b, d(objArr), false);
        }
    }

    public final tvh c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tvh) ipChange.ipc$dispatch("486ed1b3", new Object[]{this});
        }
        tvh tvhVar = this.f27963a.get();
        if (tvhVar == null) {
            dwh.v("[MUSCallback] MUSCallback is not valid because it is not alive");
            return null;
        } else if (tvhVar.isDestroyed()) {
            return null;
        } else {
            return tvhVar;
        }
    }

    public final WeexValue[] d(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue[]) ipChange.ipc$dispatch("df21c0f", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        WeexValue[] weexValueArr = new WeexValue[objArr.length];
        int i = 0;
        for (Object obj : objArr) {
            if (obj == null) {
                weexValueArr[i] = null;
                i++;
            } else if (!f9x.e(obj)) {
                dwh.h("[WeexCallbackImpl] input data is not supported", new Exception());
                return new WeexValue[0];
            } else {
                weexValueArr[i] = WeexValueImpl.convert(obj);
                i++;
            }
        }
        return weexValueArr;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            if (this.f27963a.get() != null) {
                ((WeexInstanceImpl) this.f27963a.get().j()).removeCallback(this.b);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.pvh
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        tvh c = c();
        if (c != null && !c.isDestroyed()) {
            ((WeexInstanceImpl) c.j()).removeCallback(this.b);
        }
    }
}
