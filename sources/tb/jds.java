package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.legacy.widget.Space;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.schedule.ViewProxy;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.lxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jds implements lxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21938a;
    public RelativeLayout b;
    public boolean e;
    public lxd.b i;
    public final List<lds> c = new ArrayList();
    public int d = -1;
    public int f = -1;
    public int g = -1;
    public final ArrayList<TabBarItem> h = new ArrayList<>();

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
            lxd.b a2 = jds.a(jds.this);
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

    static {
        t2o.a(839909696);
        t2o.a(839909523);
    }

    public jds(Context context) {
        ckf.g(context, "context");
        this.f21938a = context;
    }

    public static final /* synthetic */ lxd.b a(jds jdsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxd.b) ipChange.ipc$dispatch("6c8ec670", new Object[]{jdsVar});
        }
        return jdsVar.i;
    }

    public final void b(LinearLayout linearLayout, Context context, TabBarItem tabBarItem, boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e37c93", new Object[]{this, linearLayout, context, tabBarItem, new Boolean(z)});
            return;
        }
        if (z) {
            i = xcs.a(context, 63.0f);
        } else {
            i = xcs.a(context, 49.0f);
        }
        if (z) {
            i2 = xcs.a(context, 49.0f);
        } else {
            i2 = i;
        }
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(0, -1, 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        lds ldsVar = new lds(tabBarItem, context, z);
        ((ArrayList) this.c).add(ldsVar);
        if (z) {
            linearLayout.addView(new Space(context), layoutParams);
        } else {
            linearLayout.addView(ldsVar.c(), layoutParams);
        }
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    public final void c(RelativeLayout relativeLayout, Context context, List<TabBarItem> list) {
        Integer num;
        boolean z;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918df7c2", new Object[]{this, relativeLayout, context, list});
            return;
        }
        int generateViewId = View.generateViewId();
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(generateViewId);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(0);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(b.INSTANCE);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                TabBarItem tabBarItem = (TabBarItem) obj;
                if (i2 == this.f) {
                    z = true;
                } else {
                    z = false;
                }
                b(linearLayout, context, tabBarItem, z);
                i2 = i3;
            } else {
                yz3.p();
                throw null;
            }
        }
        relativeLayout.addView(linearLayout);
        View view = new View(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, xcs.a(context, 1.0f));
        layoutParams2.addRule(2, generateViewId);
        view.setLayoutParams(layoutParams2);
        try {
            num = Integer.valueOf(Color.parseColor("#e9e9e9"));
        } catch (Exception unused) {
            num = Integer.valueOf((int) tkt.DEFAULT_SHADOW_COLOR);
        }
        view.setBackgroundColor(num.intValue());
        relativeLayout.addView(view);
        if (this.e) {
            View c = ((lds) ((ArrayList) this.c).get(this.f)).c();
            int a2 = xcs.a(context, 63.0f);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams3.addRule(2, generateViewId);
            layoutParams3.addRule(14);
            layoutParams3.setMargins(0, 0, 0, -xcs.a(context, 49.0f));
            c.setLayoutParams(layoutParams3);
            relativeLayout.addView(c);
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i + 1;
            if (i >= 0) {
                ViewProxy.setOnClickListener(((lds) next).c(), new a(i));
                i = i4;
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    public final RelativeLayout d(Context context, List<TabBarItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("fa76defe", new Object[]{this, context, list});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        c(relativeLayout, context, list);
        return relativeLayout;
    }

    @Override // tb.lxd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a9b4a2", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.b;
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
        return this.b;
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
        } else if (i >= 0 && i < ((ArrayList) this.c).size() && i2 >= 0 && i2 < ((ArrayList) this.c).size()) {
            TabBarItem b2 = ((lds) ((ArrayList) this.c).get(i)).b();
            TabBarItem b3 = ((lds) ((ArrayList) this.c).get(i2)).b();
            int i3 = this.d;
            if (i3 == i) {
                this.d = i2;
            } else if (i3 == i2) {
                this.d = i;
            }
            j(i, b3);
            j(i2, b2);
        }
    }

    @Override // tb.lxd
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beee64a7", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.b;
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
        int i2 = this.d;
        if (i2 >= 0 && i2 < ((ArrayList) this.c).size()) {
            ((lds) ((ArrayList) this.c).get(i2)).f(false);
        }
        if (i >= 0 && i < ((ArrayList) this.c).size()) {
            ((lds) ((ArrayList) this.c).get(i)).f(true);
        }
        this.d = i;
    }

    @Override // tb.lxd
    public boolean removeTabBarBadge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c312d1f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= ((ArrayList) this.c).size()) {
            return false;
        }
        return ((lds) ((ArrayList) this.c).get(i)).d();
    }

    @Override // tb.lxd
    public boolean removeTabItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd32b6bc", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.lxd
    public void t(lxd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da89bb4b", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        this.i = bVar;
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
    public boolean m(int i, TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2b87fff", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "tabBarItemModel");
        return false;
    }

    @Override // tb.lxd
    public boolean q(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd19b287", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        ckf.g(str, "text");
        if (i < 0 || i >= ((ArrayList) this.c).size()) {
            return false;
        }
        return ((lds) ((ArrayList) this.c).get(i)).e(str);
    }

    @Override // tb.lxd
    public boolean i(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d084b58", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "mode");
        if ((!this.e && ckf.b(str, "bulge") && ((i = this.g) == 3 || i == 5)) || (this.e && !ckf.b(str, "bulge"))) {
            boolean b2 = ckf.b(str, "bulge");
            this.e = b2;
            this.f = b2 ? (this.g - 1) / 2 : -1;
            ((ArrayList) this.c).clear();
            RelativeLayout relativeLayout = this.b;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                c(relativeLayout, this.f21938a, this.h);
                int i2 = this.d;
                if (i2 >= 0 && i2 < ((ArrayList) this.c).size()) {
                    ((lds) ((ArrayList) this.c).get(this.d)).f(true);
                }
            }
        }
        return true;
    }

    @Override // tb.lxd
    public boolean j(int i, TabBarItem tabBarItem) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83744cc", new Object[]{this, new Integer(i), tabBarItem})).booleanValue();
        }
        ckf.g(tabBarItem, "tabBarItemModel");
        if (i < 0 || i >= ((ArrayList) this.c).size()) {
            return false;
        }
        TabBarItem tabBarItem2 = this.h.get(i);
        ckf.f(tabBarItem2, "tabBarItems[index]");
        TabBarItem tabBarItem3 = tabBarItem2;
        TabBarItem tabBarItem4 = new TabBarItem();
        String pageId = tabBarItem.getPageId();
        if (pageId == null) {
            pageId = tabBarItem3.getPageId();
        }
        tabBarItem4.setPageId(pageId);
        String iconNormal = tabBarItem.getIconNormal();
        if (iconNormal == null) {
            iconNormal = tabBarItem3.getIconNormal();
        }
        tabBarItem4.setIconNormal(iconNormal);
        String iconSelected = tabBarItem.getIconSelected();
        if (iconSelected == null) {
            iconSelected = tabBarItem3.getIconSelected();
        }
        tabBarItem4.setIconSelected(iconSelected);
        QueryPass queryPass = tabBarItem.getQueryPass();
        if (queryPass == null) {
            queryPass = tabBarItem3.getQueryPass();
        }
        tabBarItem4.setQueryPass(queryPass);
        this.h.set(i, tabBarItem4);
        lds ldsVar = (lds) ((ArrayList) this.c).get(i);
        ldsVar.g(tabBarItem4);
        if (i == this.d) {
            z = true;
        }
        ldsVar.f(z);
        return true;
    }

    @Override // tb.lxd
    public void s(TabBar tabBar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9e055f", new Object[]{this, tabBar});
            return;
        }
        ckf.g(tabBar, "tabBar");
        List<TabBarItem> items = tabBar.getItems();
        if (items != null) {
            this.h.addAll(items);
        }
        boolean isBulge = tabBar.isBulge();
        this.e = isBulge;
        this.f = isBulge ? this.h.size() / 2 : -1;
        int size = this.h.size();
        this.g = size;
        if (size >= 2) {
            RelativeLayout d = d(this.f21938a, this.h);
            if (tabBar.getInvisible()) {
                i = 8;
            }
            d.setVisibility(i);
            this.b = d;
        } else if (o9s.h(this.f21938a)) {
            Toast.makeText(this.f21938a, "⚠️ 当配置 >= 2 的 Items 时 TabBar 才会展示", 0).show();
        }
    }
}
