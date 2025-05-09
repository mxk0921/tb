package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.legacy.widget.Space;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.schedule.ViewProxy;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import java.util.ArrayList;
import java.util.List;
import tb.lxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class kds implements lxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22596a;
    public LinearLayout b;
    public RelativeLayout c;
    public lxd.b d;
    public xps e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            lxd.b a2 = kds.a(kds.this);
            if (a2 != null) {
                a2.D(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            lxd.b a2 = kds.a(kds.this);
            if (a2 != null) {
                a2.D(this.b);
            }
        }
    }

    static {
        t2o.a(839909699);
        t2o.a(839909523);
    }

    public kds(Context context) {
        ckf.g(context, "context");
        this.f22596a = context;
    }

    public static final /* synthetic */ lxd.b a(kds kdsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxd.b) ipChange.ipc$dispatch("6b6a77b4", new Object[]{kdsVar});
        }
        return kdsVar.d;
    }

    public final void b() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        int i2;
        int i3;
        String label;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            xps xpsVar = this.e;
            if (xpsVar != null) {
                xpsVar.e().clear();
                if (xpsVar.a()) {
                    i = xcs.a(this.f22596a, 64.0f);
                } else {
                    i = xcs.a(this.f22596a, 50.0f);
                }
                RelativeLayout relativeLayout = this.c;
                if (relativeLayout == null) {
                    layoutParams = null;
                } else {
                    layoutParams = relativeLayout.getLayoutParams();
                }
                if (layoutParams != null) {
                    layoutParams.height = i;
                }
                int d = xpsVar.d() / 2;
                int i4 = 0;
                for (Object obj : xpsVar.c()) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        TabBarItem tabBarItem = (TabBarItem) obj;
                        if (d != i4 || !xpsVar.a()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2 = xcs.a(this.f22596a, 63.0f);
                        } else {
                            i2 = xcs.a(this.f22596a, 49.0f);
                        }
                        if (z) {
                            i3 = xcs.a(this.f22596a, 63.0f);
                        } else {
                            i3 = xcs.a(this.f22596a, 49.0f);
                        }
                        lds ldsVar = new lds(tabBarItem, this.f22596a, z);
                        View c2 = ldsVar.c();
                        if (q9s.i2() && (label = tabBarItem.getLabel()) != null) {
                            c2.setContentDescription(label);
                        }
                        ViewProxy.setOnClickListener(c2, new c(i4));
                        linearLayout.addView(new Space(c2.getContext()), new LinearLayout.LayoutParams(0, -1, 1.0f));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i2);
                        layoutParams2.gravity = 80;
                        linearLayout.addView(c2, layoutParams2);
                        linearLayout.addView(new Space(c2.getContext()), new LinearLayout.LayoutParams(0, -1, 1.0f));
                        xpsVar.e().add(ldsVar);
                        if (i4 == xpsVar.b()) {
                            ldsVar.f(true);
                        }
                        i4 = i5;
                    } else {
                        yz3.p();
                        throw null;
                    }
                }
            }
        }
    }

    public final void c(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e742dd0e", new Object[]{this, new Integer(i)});
            return;
        }
        xps xpsVar = this.e;
        if (xpsVar != null && i >= 0 && i < xpsVar.e().size()) {
            lds ldsVar = xpsVar.e().get(i);
            if (i != xpsVar.b()) {
                z = false;
            }
            ldsVar.f(z);
        }
    }

    @Override // tb.lxd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a9b4a2", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    @Override // tb.lxd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.lxd
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return 49;
    }

    @Override // tb.lxd
    public void k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c9afde", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        xps xpsVar = this.e;
        if (xpsVar != null && i >= 0 && i < xpsVar.d() && i2 >= 0 && i2 < xpsVar.d() && i != i2) {
            int b2 = xpsVar.b();
            if (b2 == i) {
                xpsVar.g(i2);
            } else if (b2 == i2) {
                xpsVar.g(i);
            }
            TabBarItem tabBarItem = xpsVar.c().get(i);
            ckf.f(tabBarItem, "tabBarState.tabBarItemModels[originIndex]");
            TabBarItem tabBarItem2 = xpsVar.c().get(i2);
            ckf.f(tabBarItem2, "tabBarState.tabBarItemModels[targetIndex]");
            xpsVar.c().set(i, tabBarItem2);
            xpsVar.c().set(i2, tabBarItem);
            b();
        }
    }

    @Override // tb.lxd
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beee64a7", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    @Override // tb.lxd
    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210663ed", new Object[]{this, new Integer(i)});
            return;
        }
        xps xpsVar = this.e;
        if (xpsVar != null && i >= 0 && i < xpsVar.d() && xpsVar.b() != i) {
            int b2 = xpsVar.b();
            xpsVar.g(i);
            c(b2);
            c(i);
        }
    }

    @Override // tb.lxd
    public boolean removeTabBarBadge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c312d1f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        xps xpsVar = this.e;
        if (xpsVar != null && i >= 0 && i < xpsVar.e().size()) {
            return xpsVar.e().get(i).d();
        }
        return false;
    }

    @Override // tb.lxd
    public boolean removeTabItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd32b6bc", new Object[]{this, new Integer(i)})).booleanValue();
        }
        xps xpsVar = this.e;
        if (xpsVar == null || i < 0 || i >= xpsVar.d() || i == xpsVar.b() || xpsVar.d() <= 2) {
            return false;
        }
        if (i < xpsVar.b()) {
            xpsVar.g(xpsVar.b() - 1);
        }
        xpsVar.c().remove(i);
        b();
        return true;
    }

    @Override // tb.lxd
    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1afa86f6", new Object[]{this})).booleanValue();
        }
        return lxd.a.a(this);
    }

    @Override // tb.lxd
    public boolean q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd19b287", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        ckf.g(str, "text");
        xps xpsVar = this.e;
        if (xpsVar != null && i >= 0 && i < xpsVar.e().size()) {
            return xpsVar.e().get(i).e(str);
        }
        return false;
    }

    @Override // tb.lxd
    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d084b58", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "mode");
        xps xpsVar = this.e;
        if (xpsVar == null) {
            return false;
        }
        boolean a2 = xpsVar.a();
        xpsVar.f(ckf.b(str, "bulge"));
        if (a2 != xpsVar.a()) {
            b();
        }
        return true;
    }

    @Override // tb.lxd
    public boolean j(int i, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83744cc", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "tabBarItemModel");
        xps xpsVar = this.e;
        if (xpsVar == null || i < 0 || i >= xpsVar.d()) {
            return false;
        }
        xpsVar.c().set(i, tabBarItem);
        b();
        return true;
    }

    @Override // tb.lxd
    public boolean m(int i, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2b87fff", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "tabBarItemModel");
        xps xpsVar = this.e;
        if (xpsVar == null || i < 0 || i > xpsVar.d() || xpsVar.d() >= 5) {
            return false;
        }
        if (i <= xpsVar.b()) {
            xpsVar.g(xpsVar.b() + 1);
        }
        xpsVar.c().add(i, tabBarItem);
        b();
        return true;
    }

    @Override // tb.lxd
    public void s(TabBar tabBar) {
        List<TabBarItem> list;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9e055f", new Object[]{this, tabBar});
            return;
        }
        ckf.g(tabBar, "tabBar");
        boolean invisible = tabBar.getInvisible();
        boolean isBulge = tabBar.isBulge();
        List<TabBarItem> items = tabBar.getItems();
        if (items == null) {
            list = yz3.i();
        } else {
            list = items;
        }
        this.e = new xps(0, new ArrayList(list), isBulge, new ArrayList());
        int generateViewId = View.generateViewId();
        LinearLayout linearLayout = new LinearLayout(this.f22596a);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setClipChildren(false);
        linearLayout.setId(generateViewId);
        linearLayout.setOnClickListener(b.INSTANCE);
        this.b = linearLayout;
        View view = new View(this.f22596a);
        try {
            i = Color.parseColor("#e9e9e9");
        } catch (Exception unused) {
            i = tkt.DEFAULT_SHADOW_COLOR;
        }
        view.setBackgroundColor(i);
        RelativeLayout relativeLayout = new RelativeLayout(this.f22596a);
        relativeLayout.setClipChildren(false);
        relativeLayout.setBackgroundColor(0);
        if (invisible) {
            i2 = 8;
        }
        relativeLayout.setVisibility(i2);
        this.c = relativeLayout;
        LinearLayout linearLayout2 = this.b;
        if (linearLayout2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, xcs.a(this.f22596a, 49.0f));
            layoutParams.addRule(12);
            RelativeLayout relativeLayout2 = this.c;
            if (relativeLayout2 != null) {
                relativeLayout2.addView(linearLayout2, layoutParams);
            }
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, xcs.a(this.f22596a, 1.0f));
        layoutParams2.addRule(2, generateViewId);
        RelativeLayout relativeLayout3 = this.c;
        if (relativeLayout3 != null) {
            relativeLayout3.addView(view, layoutParams2);
        }
        LinearLayout linearLayout3 = this.b;
        if (linearLayout3 != null) {
            linearLayout3.bringToFront();
        }
        b();
    }

    @Override // tb.lxd
    public void t(lxd.b bVar) {
        ArrayList<lds> e;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da89bb4b", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        this.d = bVar;
        xps xpsVar = this.e;
        if (!(xpsVar == null || (e = xpsVar.e()) == null)) {
            for (Object obj : e) {
                i++;
                if (i >= 0) {
                    ViewProxy.setOnClickListener(((lds) obj).c(), new a(i));
                } else {
                    yz3.p();
                    throw null;
                }
            }
        }
    }
}
