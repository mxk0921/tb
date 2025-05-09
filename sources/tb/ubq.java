package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.ShopIndexNavNativeComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ubq implements qjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29281a;
    public final ShopDataParser b;
    public final boolean c;
    public final u1a<Integer, Boolean, xhv> d;
    public final FrameLayout f;
    public final HashMap<Integer, Integer> e = new HashMap<>();
    public final ArrayList<ShopIndexNavNativeComponent> g = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements mrk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // tb.mrk
        public void onItemClick(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
                return;
            }
            u1a h = ubq.h(ubq.this);
            if (h != null) {
                h.invoke(Integer.valueOf(ubq.g(ubq.this).j(this.b, i)), Boolean.TRUE);
            }
        }
    }

    static {
        t2o.a(766509583);
        t2o.a(766509572);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ubq(Context context, ShopDataParser shopDataParser, boolean z, u1a<? super Integer, ? super Boolean, xhv> u1aVar) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopDataParser");
        this.f29281a = context;
        this.b = shopDataParser;
        this.c = z;
        this.d = u1aVar;
        this.f = new FrameLayout(context);
        int i = 0;
        for (Object obj : shopDataParser.u1()) {
            i++;
            if (i >= 0) {
                ShopIndexNavNativeComponent shopIndexNavNativeComponent = new ShopIndexNavNativeComponent();
                ArrayList arrayList = new ArrayList();
                if (obj instanceof JSONArray) {
                    Iterator<Object> it = ((JSONArray) obj).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            String string = ((JSONObject) next).getString("title");
                            arrayList.add(string == null ? "" : string);
                        }
                    }
                } else {
                    npp.Companion.b("status error : TabBarViewModelArray item is not array");
                }
                shopIndexNavNativeComponent.i(this.b, this.f29281a, 0, arrayList, new a(i), this.c);
                kew.a(this.f, shopIndexNavNativeComponent.h());
                if (this.b.d0() != i || shopIndexNavNativeComponent.g() <= 1) {
                    kew.C(shopIndexNavNativeComponent.h());
                } else {
                    kew.g0(shopIndexNavNativeComponent.h());
                }
                this.g.add(shopIndexNavNativeComponent);
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    public static final /* synthetic */ ShopDataParser g(ubq ubqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("6b62bc7f", new Object[]{ubqVar});
        }
        return ubqVar.b;
    }

    public static final /* synthetic */ u1a h(ubq ubqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("e302f671", new Object[]{ubqVar});
        }
        return ubqVar.d;
    }

    @Override // tb.qjb
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20b3fb5", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.qjb
    public void b(int i, boolean z) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2cce4b", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (this.e.containsKey(Integer.valueOf(i))) {
            num = this.e.get(Integer.valueOf(i));
            if (num == null) {
                num = 0;
            }
        } else {
            num = 0;
        }
        int j = this.b.j(i, num.intValue());
        c(i, j);
        u1a<Integer, Boolean, xhv> u1aVar = this.d;
        if (u1aVar != null) {
            u1aVar.invoke(Integer.valueOf(j), Boolean.valueOf(z));
        }
    }

    @Override // tb.qjb
    public void c(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122ed26d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i4 = this.b.i(i2);
        this.e.put(Integer.valueOf(i), Integer.valueOf(i4));
        ShopIndexNavNativeComponent shopIndexNavNativeComponent = (ShopIndexNavNativeComponent) r54.J(this.g, i);
        if (shopIndexNavNativeComponent != null) {
            shopIndexNavNativeComponent.j(i4);
            shopIndexNavNativeComponent.k(i);
        }
        Iterator<ShopIndexNavNativeComponent> it = this.g.iterator();
        while (it.hasNext()) {
            ShopIndexNavNativeComponent next = it.next();
            int i5 = i3 + 1;
            if (i3 >= 0) {
                ShopIndexNavNativeComponent shopIndexNavNativeComponent2 = next;
                if (i3 != i || shopIndexNavNativeComponent2.g() <= 1) {
                    kew.B(shopIndexNavNativeComponent2.h());
                } else {
                    kew.g0(shopIndexNavNativeComponent2.h());
                }
                i3 = i5;
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    @Override // tb.qjb
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2963cb", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator<ShopIndexNavNativeComponent> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().n(z);
        }
    }

    @Override // tb.qjb
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef6f6214", new Object[]{this})).booleanValue();
        }
        if (this.g.get(this.b.C()).g() <= 1) {
            return true;
        }
        return false;
    }

    @Override // tb.qjb
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826d24c0", new Object[]{this, new Boolean(z)});
            return;
        }
        Iterator<ShopIndexNavNativeComponent> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().p(z);
        }
    }
}
