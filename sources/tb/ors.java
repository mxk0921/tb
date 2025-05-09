package tb;

import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.service.multitab.adapter.MultiTabAdapter;
import com.taobao.android.turbo.view.ScrollControlViewPager;
import java.util.Iterator;
import java.util.List;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ors implements g7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public ScrollControlViewPager f25603a;
    public MultiTabAdapter b;
    public boolean c;
    public final qpu d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455566);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455565);
        t2o.a(919601343);
    }

    public ors(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.d = qpuVar;
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f96ace", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        MultiTabAdapter multiTabAdapter = this.b;
        return b(multiTabAdapter != null ? multiTabAdapter.h(str) : -1);
    }

    public final void d(MultiTabAdapter multiTabAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d8ac0b", new Object[]{this, multiTabAdapter});
        } else {
            this.b = multiTabAdapter;
        }
    }

    public final void e(ScrollControlViewPager scrollControlViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b46cfe", new Object[]{this, scrollControlViewPager});
        } else {
            this.f25603a = scrollControlViewPager;
        }
    }

    @Override // tb.g7e
    public void z0(prv prvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f9dc49", new Object[]{this, prvVar});
            return;
        }
        ckf.g(prvVar, "user");
        this.c = false;
    }

    public final boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffde1207", new Object[]{this, new Integer(i)})).booleanValue();
        }
        ScrollControlViewPager scrollControlViewPager = this.f25603a;
        if (scrollControlViewPager != null && i >= 0) {
            PagerAdapter adapter = scrollControlViewPager.getAdapter();
            if (i < (adapter != null ? adapter.getCount() : 0)) {
                if (scrollControlViewPager.getCurrentItem() == i) {
                    tpu.a.b(tpu.Companion, "TabSelectHelper", "选择指定Tab，指定Tab已选中", null, 4, null);
                    return false;
                }
                scrollControlViewPager.setCurrentItem(i, false);
                return true;
            }
        }
        tpu.a.b(tpu.Companion, "TabSelectHelper", "选择指定Tab，viewPager为空或位置无效", null, 4, null);
        return false;
    }

    public final void a(List<TabModel> list, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c78ce33", new Object[]{this, list, new Boolean(z)});
            return;
        }
        ckf.g(list, "data");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TabSelectHelper", "选择初始Tab", null, 4, null);
        if (this.c) {
            tpu.a.b(aVar, "TabSelectHelper", "选择初始Tab，已完成", null, 4, null);
            return;
        }
        vmd vmdVar = (vmd) this.d.getService(vmd.class);
        nuo d1 = vmdVar.d1(nuo.MSG_SELECT_TAB);
        Iterator<TabModel> it = list.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (ckf.b(it.next().getId(), d1 != null ? d1.d() : null)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "TabSelectHelper", "选择初始Tab，通过选择Tab消息获取，index=" + i2, null, 4, null);
            b(i2);
            this.c = true;
            return;
        }
        nuo h0 = vmdVar.h0(nuo.MSG_ICON_CHANGE);
        Iterator<TabModel> it2 = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            }
            if (ckf.b(it2.next().getId(), h0 != null ? h0.d() : null)) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            tpu.a aVar3 = tpu.Companion;
            tpu.a.b(aVar3, "TabSelectHelper", "选择初始Tab，通过icon变化消息获取位置，index=" + i3, null, 4, null);
            b(i3);
            this.c = true;
            return;
        }
        Iterator<TabModel> it3 = list.iterator();
        int i4 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i4 = -1;
                break;
            } else if (it3.next().getSelected()) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            tpu.a aVar4 = tpu.Companion;
            tpu.a.b(aVar4, "TabSelectHelper", "选择初始Tab，通过是否选中字段获取位置，index=" + i4 + "，isCache=" + z, null, 4, null);
            b(i4);
            if (!z) {
                this.c = true;
                return;
            }
            return;
        }
        Iterator<TabModel> it4 = list.iterator();
        int i5 = 0;
        while (true) {
            if (!it4.hasNext()) {
                break;
            } else if (ckf.b(it4.next().getId(), "video")) {
                i = i5;
                break;
            } else {
                i5++;
            }
        }
        if (i >= 0) {
            tpu.a aVar5 = tpu.Companion;
            tpu.a.b(aVar5, "TabSelectHelper", "选择初始Tab，通过默认Tab id获取位置，index=" + i, null, 4, null);
            b(i);
            return;
        }
        b(0);
    }
}
