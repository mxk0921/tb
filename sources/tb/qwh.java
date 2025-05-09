package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.List;
import java.util.Map;
import tb.rwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qwh<TYPE extends rwh> implements rwh.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f26970a;
    public TYPE b;
    public TYPE c;
    public boolean d;

    static {
        t2o.a(986710046);
        t2o.a(986710049);
    }

    public qwh(UINode uINode) {
        this.f26970a = uINode;
    }

    @Override // tb.rwh.b
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e97868", new Object[]{this, map});
        } else {
            this.b.b(map);
        }
    }

    public void b(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefd8b2f", new Object[]{this, list});
        } else {
            this.c.e(list);
        }
    }

    public TYPE c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TYPE) ((rwh) ipChange.ipc$dispatch("9e3bfe9", new Object[]{this}));
        }
        if (hxh.a()) {
            return this.b;
        }
        if (!this.f26970a.getInstance().isUIReady()) {
            return this.b;
        }
        if (!this.d) {
            this.b.d(this.c);
            this.d = true;
        }
        return this.c;
    }

    public void d(TYPE type, TYPE type2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44523b7", new Object[]{this, type, type2});
            return;
        }
        this.b = type;
        this.c = type2;
        type2.k(this);
    }
}
