package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class sga implements a.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28038a;

    static {
        t2o.a(295699192);
        t2o.a(157286653);
    }

    public sga(String str) {
        this.f28038a = str;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.a.h
    public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
        } else {
            et6Var.l(u55Var.e(this.f28038a));
        }
    }
}
