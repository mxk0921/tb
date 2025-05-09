package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fxb;
import tb.im6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qm6 implements im6.k<iew, exb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f26824a;

    static {
        t2o.a(444597110);
        t2o.a(444597104);
    }

    public qm6(float f) {
        this.f26824a = f;
    }

    /* renamed from: b */
    public boolean a(exb exbVar, fxb.a<iew> aVar) {
        View c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8627b72", new Object[]{this, exbVar, aVar})).booleanValue();
        }
        if (aVar == null || (c = aVar.a().c()) == null) {
            return true;
        }
        return zgw.a(c, this.f26824a);
    }
}
