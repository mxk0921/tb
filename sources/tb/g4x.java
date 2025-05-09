package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g4x implements f4x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<WeexInstance> f19728a;
    public final int b;

    static {
        t2o.a(982515925);
        t2o.a(982515732);
    }

    public g4x(WeexInstance weexInstance, long j) {
        this.f19728a = new WeakReference<>(weexInstance);
        this.b = Long.valueOf(j).intValue();
    }

    @Override // tb.f4x
    public void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
            return;
        }
        WeexInstance c = c();
        if (c != null) {
            ((WeexInstanceImpl) c).invokeCallback(this.b, d(objArr), true);
        }
    }

    @Override // tb.f4x
    public void b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
            return;
        }
        WeexInstance weexInstance = this.f19728a.get();
        if (weexInstance != null) {
            ((WeexInstanceImpl) weexInstance).invokeCallback(this.b, d(objArr), false);
        }
    }

    public final WeexInstance c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("f590be30", new Object[]{this});
        }
        WeexInstance weexInstance = this.f19728a.get();
        if (weexInstance != null) {
            return weexInstance;
        }
        dwh.v("[WeexCallbackImpl] WeexCallbackImpl is not valid because it is not alive");
        return null;
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
            if (this.f19728a.get() != null) {
                ((WeexInstanceImpl) this.f19728a.get()).removeCallback(this.b);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.f4x
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        WeexInstance c = c();
        if (c != null) {
            ((WeexInstanceImpl) c).removeCallback(this.b);
        }
    }
}
