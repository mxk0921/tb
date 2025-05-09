package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tj0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<zs9> f28744a;
    public final LinkedList<pei> b;
    public zs9 c;

    static {
        t2o.a(481296448);
    }

    public tj0(List<zs9> list, LinkedList<pei> linkedList) {
        this.f28744a = list;
        this.b = linkedList;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f28744a.clear();
        this.b.clear();
    }

    public List<zs9> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6029bd3d", new Object[]{this});
        }
        return this.f28744a;
    }

    public zs9 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs9) ipChange.ipc$dispatch("e5431861", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (zs9 zs9Var : this.f28744a) {
            if (str.equals(zs9Var.h())) {
                return zs9Var;
            }
        }
        return null;
    }

    public zs9 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zs9) ipChange.ipc$dispatch("6a268c5e", new Object[]{this});
        }
        if (this.c == null) {
            this.c = c("/" + Localization.q(R.string.taobao_app_1007_1_18952));
        }
        return this.c;
    }

    public LinkedList<pei> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("6a81770", new Object[]{this});
        }
        return this.b;
    }
}
