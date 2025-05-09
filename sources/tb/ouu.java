package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import java.util.List;
import tb.bvu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ouu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINodeGroup f25667a;
    public final bvu b;
    public final bvu c;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ouu.b
        public void a(bvu.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b02522d", new Object[]{this, bVar});
            } else {
                ouu.a(ouu.this).d(bVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(bvu.b bVar);
    }

    static {
        t2o.a(986710065);
    }

    public ouu(UINodeGroup uINodeGroup) {
        this.f25667a = uINodeGroup;
        this.b = new bvu(uINodeGroup);
        bvu bvuVar = new bvu(uINodeGroup);
        this.c = bvuVar;
        bvuVar.k(new a());
    }

    public static /* synthetic */ bvu a(ouu ouuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bvu) ipChange.ipc$dispatch("4b15e881", new Object[]{ouuVar});
        }
        return ouuVar.b;
    }

    public void b(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else {
            e().b(i, uINode);
        }
    }

    public void c(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
        } else {
            e().c(uINode);
        }
    }

    public void d(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefd8b2f", new Object[]{this, list});
        } else {
            this.c.f(list);
        }
    }

    public bvu e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bvu) ipChange.ipc$dispatch("ba5cd956", new Object[]{this});
        }
        if (hxh.a()) {
            return this.b;
        }
        if (!this.f25667a.getInstance().isUIReady()) {
            return this.b;
        }
        if (!this.d) {
            this.b.e(this.c);
            this.d = true;
        }
        return this.c;
    }

    public UINode f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        return e().g(i);
    }

    public int g(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        return e().h(uINode);
    }

    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            e().i(i, i2);
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else {
            e().j(i);
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return e().l();
    }
}
