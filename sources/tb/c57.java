package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c57 implements ifo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IDMComponent f16868a;
    public final fdd b;

    static {
        t2o.a(155189346);
        t2o.a(155189348);
    }

    public c57(IDMComponent iDMComponent, fdd fddVar) {
        this.f16868a = iDMComponent;
        this.b = fddVar;
        if (iDMComponent != null) {
            iDMComponent.record();
        }
    }

    @Override // tb.ifo
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1678716b", new Object[]{this});
            return;
        }
        IDMComponent iDMComponent = this.f16868a;
        if (iDMComponent != null) {
            iDMComponent.rollBack();
        }
        fdd fddVar = this.b;
        if (fddVar != null) {
            fddVar.e().G();
        }
    }
}
