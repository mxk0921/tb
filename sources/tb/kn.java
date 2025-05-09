package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderStickyFloatShowType;
import com.alibaba.android.aura.service.render.layout.renderhelper.aura.impl.AURAReverseRenderStickyAccessibilityFixer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AURAReverseRenderStickyAccessibilityFixer f22772a;
    public final List<ln> b;
    public final List<ln> c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public final d k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(boolean z) {
            super(z);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1566030385) {
                super.f((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (com.alibaba.android.ultron.ext.vlayout.b) objArr[5]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/AURAStickyLayoutDelegate$1");
        }

        @Override // tb.lnq, tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
        public void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, com.alibaba.android.ultron.ext.vlayout.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
                return;
            }
            super.f(recycler, state, i, i2, i3, bVar);
            View l = l();
            kn.a(kn.this, l);
            kn.b(kn.this, this, l);
            kn.c(kn.this, this, l);
            kn.d(kn.this, l);
            kn.e(kn.this).c(l);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends en {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1566030385) {
                super.f((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (com.alibaba.android.ultron.ext.vlayout.b) objArr[5]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/AURAStickyLayoutDelegate$2");
        }

        @Override // tb.bj, tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
        public void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, com.alibaba.android.ultron.ext.vlayout.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
                return;
            }
            super.f(recycler, state, i, i2, i3, bVar);
            View l = l();
            kn.a(kn.this, l);
            kn.e(kn.this).c(l);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22773a;

        public c(View view) {
            this.f22773a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View view = this.f22773a;
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        String a(String str, String str2);
    }

    static {
        t2o.a(80740585);
    }

    public kn(d dVar) {
        this.k = dVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.f22772a = new AURAReverseRenderStickyAccessibilityFixer(arrayList, arrayList2);
    }

    public static /* synthetic */ void a(kn knVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9dcb21", new Object[]{knVar, view});
        } else {
            knVar.o(view);
        }
    }

    public static /* synthetic */ void b(kn knVar, ln lnVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9765a3d9", new Object[]{knVar, lnVar, view});
        } else {
            knVar.j(lnVar, view);
        }
    }

    public static /* synthetic */ void c(kn knVar, ln lnVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fe235a", new Object[]{knVar, lnVar, view});
        } else {
            knVar.i(lnVar, view);
        }
    }

    public static /* synthetic */ void d(kn knVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c248be", new Object[]{knVar, view});
        } else {
            knVar.n(view);
        }
    }

    public static /* synthetic */ AURAReverseRenderStickyAccessibilityFixer e(kn knVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAReverseRenderStickyAccessibilityFixer) ipChange.ipc$dispatch("7e953651", new Object[]{knVar});
        }
        return knVar.f22772a;
    }

    public final void f(boolean z, ln lnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea511e38", new Object[]{this, new Boolean(z), lnVar});
        } else if (z) {
            ((ArrayList) this.b).add(lnVar);
        } else {
            ((ArrayList) this.c).add(lnVar);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f = false;
        this.h = 0;
        this.j = 0;
        this.g = 0;
        this.i = 0;
        this.d = false;
        this.e = false;
        ((ArrayList) this.b).clear();
        ((ArrayList) this.c).clear();
    }

    public final void i(ln lnVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc33896a", new Object[]{this, lnVar, view});
        } else if (!this.e) {
            int size = ((ArrayList) this.c).size();
            if (size <= 1) {
                this.e = true;
                return;
            }
            int indexOf = ((ArrayList) this.c).indexOf(lnVar);
            if (indexOf != -1 && indexOf != 0) {
                if (view != null) {
                    for (int i = 0; i < indexOf; i++) {
                        ln lnVar2 = (ln) ((ArrayList) this.c).get(i);
                        lnVar2.l0(lnVar2.n0() + view.getHeight());
                    }
                    int i2 = this.i + 1;
                    this.i = i2;
                    if (i2 >= size - 1) {
                        this.e = true;
                    }
                } else if (!lnVar.k0()) {
                    this.j++;
                }
            }
        }
    }

    public final void j(ln lnVar, View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ededc3ca", new Object[]{this, lnVar, view});
        } else if (!this.d) {
            int size = ((ArrayList) this.b).size();
            if (size <= 1) {
                this.d = true;
                return;
            }
            int indexOf = ((ArrayList) this.b).indexOf(lnVar);
            if (-1 != indexOf && indexOf != size - 1) {
                if (view != null) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= size) {
                            break;
                        }
                        ln lnVar2 = (ln) ((ArrayList) this.b).get(indexOf);
                        lnVar2.l0(lnVar2.n0() + view.getHeight());
                    }
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 >= i) {
                        this.d = true;
                    }
                } else if (!lnVar.k0()) {
                    this.h++;
                }
            }
        }
    }

    public final en l(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (en) ipChange.ipc$dispatch("4ef6bd6c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        b bVar = new b(i2, i3, i4);
        bVar.x0(i);
        return bVar;
    }

    public final void n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79c8a36", new Object[]{this, view});
        } else if (view == null || this.f) {
        } else {
            if (!this.d && this.h < ((ArrayList) this.b).size()) {
                return;
            }
            if (!this.e && this.j < ((ArrayList) this.c).size()) {
                return;
            }
            if (((ArrayList) this.b).size() > 1 || ((ArrayList) this.c).size() > 1) {
                this.f = true;
                view.post(new c(view));
            }
        }
    }

    public final void o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1c4aa7", new Object[]{this, view});
        } else if (view != null) {
            view.setTag(R.id.skip_view_tag_for_pager_snap, "sticky");
        }
    }

    public final int h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49f7cce6", new Object[]{this, str})).intValue();
        }
        try {
            return ai.a(Integer.parseInt(str));
        } catch (Exception unused) {
            ck.g().e("convertDPToPX#marginBottomInDp不是数字类型！", ck.b.b().l("AURAStickyLayoutDelegate").g("marginBottomInDp", str).a());
            return 0;
        }
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c86b47", new Object[]{this})).intValue();
        }
        String a2 = this.k.a("showType", AURARenderStickyFloatShowType.showOnLeave);
        a2.hashCode();
        char c2 = 65535;
        switch (a2.hashCode()) {
            case -1470396265:
                if (a2.equals(AURARenderStickyFloatShowType.hideOnEnter)) {
                    c2 = 0;
                    break;
                }
                break;
            case -961826180:
                if (a2.equals(AURARenderStickyFloatShowType.showOnEnter)) {
                    c2 = 1;
                    break;
                }
                break;
            case -955647397:
                if (a2.equals(AURARenderStickyFloatShowType.showOnLeave)) {
                    c2 = 2;
                    break;
                }
                break;
            case 260532076:
                if (a2.equals(AURARenderStickyFloatShowType.showAlways)) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 2:
            default:
                return 2;
            case 3:
                return 0;
        }
    }

    public sw1 k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sw1) ipChange.ipc$dispatch("ea20b7dc", new Object[]{this});
        }
        String a2 = this.k.a("position", "top");
        int m = m();
        String a3 = this.k.a("marginTop", "0");
        a2.hashCode();
        char c2 = 65535;
        switch (a2.hashCode()) {
            case -1026807403:
                if (a2.equals("floatRightCenter")) {
                    c2 = 0;
                    break;
                }
                break;
            case 2002678695:
                if (a2.equals("floatBottom")) {
                    c2 = 1;
                    break;
                }
                break;
            case 2010102105:
                if (a2.equals("floatTop")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return l(m, 4, h(this.k.a("marginRight", "0")), h(a3));
            case 1:
                String a4 = this.k.a("marginBottom", "0");
                String a5 = this.k.a("showOnce", "false");
                String a6 = this.k.a("stayTime", "0");
                en l = l(m, 2, 0, h(a4));
                if (a5 != null) {
                    l.s0(Boolean.parseBoolean(a5));
                }
                if (a6 != null) {
                    l.t0(pn.d(a6, -1L));
                }
                return l;
            case 2:
                return l(m, 0, 0, h(a3));
            default:
                boolean z = !"bottom".equals(a2);
                a aVar = new a(z);
                f(z, aVar);
                return aVar;
        }
    }
}
