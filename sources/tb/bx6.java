package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class bx6 implements a.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a.h f16696a;

    static {
        t2o.a(157286662);
        t2o.a(157286653);
    }

    public bx6(a.h hVar) {
        this.f16696a = hVar;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.a.h
    public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
            return;
        }
        a.h hVar = this.f16696a;
        if (hVar != null) {
            hVar.a(list, et6Var, u55Var);
        }
    }
}
