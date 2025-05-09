package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kvf implements JSCallback, pvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSCallback f22948a;
    public final pvh b;

    public kvf(pvh pvhVar) {
        this.b = pvhVar;
    }

    @Override // tb.pvh
    public void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
        }
    }

    @Override // tb.pvh
    public void b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
        }
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f22948a;
        if (jSCallback != null) {
            jSCallback.invoke(obj);
        }
        pvh pvhVar = this.b;
        if (pvhVar != null) {
            pvhVar.b(obj);
        }
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invokeAndKeepAlive(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a8ac", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f22948a;
        if (jSCallback != null) {
            jSCallback.invokeAndKeepAlive(obj);
        }
        pvh pvhVar = this.b;
        if (pvhVar != null) {
            pvhVar.a(obj);
        }
    }

    @Override // tb.pvh
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        pvh pvhVar = this.b;
        if (pvhVar != null) {
            pvhVar.release();
        }
    }

    public kvf(JSCallback jSCallback) {
        this.f22948a = jSCallback;
    }
}
