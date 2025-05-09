package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gog implements f4x, JSCallback, pvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pvh f20131a;
    public final f4x b;

    static {
        t2o.a(708837404);
        t2o.a(982515732);
        t2o.a(985661544);
        t2o.a(982516055);
    }

    public gog(pvh pvhVar) {
        this.f20131a = pvhVar;
    }

    @Override // tb.f4x
    public void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
            return;
        }
        pvh pvhVar = this.f20131a;
        if (pvhVar != null) {
            pvhVar.a(objArr);
        }
        f4x f4xVar = this.b;
        if (f4xVar != null) {
            f4xVar.a(objArr);
        }
    }

    @Override // tb.f4x
    public void b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
            return;
        }
        pvh pvhVar = this.f20131a;
        if (pvhVar != null) {
            pvhVar.b(objArr);
        }
        f4x f4xVar = this.b;
        if (f4xVar != null) {
            f4xVar.b(objArr);
        }
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
            return;
        }
        pvh pvhVar = this.f20131a;
        if (pvhVar != null) {
            pvhVar.b(obj);
        }
        f4x f4xVar = this.b;
        if (f4xVar != null) {
            f4xVar.b(obj);
        }
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invokeAndKeepAlive(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a8ac", new Object[]{this, obj});
            return;
        }
        pvh pvhVar = this.f20131a;
        if (pvhVar != null) {
            pvhVar.a(obj);
        }
        f4x f4xVar = this.b;
        if (f4xVar != null) {
            f4xVar.a(obj);
        }
    }

    @Override // tb.f4x
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        pvh pvhVar = this.f20131a;
        if (pvhVar != null) {
            pvhVar.release();
        }
        f4x f4xVar = this.b;
        if (f4xVar != null) {
            f4xVar.release();
        }
    }

    public gog(f4x f4xVar) {
        this.b = f4xVar;
    }
}
