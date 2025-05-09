package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.ShopIndexNavCycleComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kwj implements qjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22968a;
    public final ShopDataParser b;
    public final boolean c;
    public final u1a<Integer, Boolean, xhv> d;
    public final HashMap<Integer, Integer> e = new HashMap<>();
    public final ShopIndexNavCycleComponent f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ork {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ork
        public void onItemClick(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
                return;
            }
            u1a g = kwj.g(kwj.this);
            if (g != null) {
                g.invoke(Integer.valueOf(i), Boolean.TRUE);
            }
        }
    }

    static {
        t2o.a(766509575);
        t2o.a(766509572);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kwj(Context context, ShopDataParser shopDataParser, boolean z, u1a<? super Integer, ? super Boolean, xhv> u1aVar) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopDataParser");
        this.f22968a = context;
        this.b = shopDataParser;
        this.c = z;
        this.d = u1aVar;
        ShopIndexNavCycleComponent shopIndexNavCycleComponent = new ShopIndexNavCycleComponent();
        JSONArray W = shopDataParser.W();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = W.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                String string = ((JSONObject) next).getString("title");
                arrayList.add(string == null ? "" : string);
            }
        }
        ShopDataParser shopDataParser2 = this.b;
        shopIndexNavCycleComponent.k(shopDataParser2, this.f22968a, shopDataParser2.j(shopDataParser2.d0(), this.b.f0()), arrayList, new a(), this.c);
        xhv xhvVar = xhv.INSTANCE;
        this.f = shopIndexNavCycleComponent;
    }

    public static final /* synthetic */ u1a g(kwj kwjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("fee4ec6b", new Object[]{kwjVar});
        }
        return kwjVar.d;
    }

    @Override // tb.qjb
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20b3fb5", new Object[]{this});
        }
        return this.f.j();
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
        this.f.m(i);
    }

    @Override // tb.qjb
    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122ed26d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.put(Integer.valueOf(i), Integer.valueOf(this.b.i(i2)));
        this.f.l(i2);
        this.f.m(i);
    }

    @Override // tb.qjb
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2963cb", new Object[]{this, new Boolean(z)});
        } else {
            ShopIndexNavCycleComponent.o(this.f, Boolean.valueOf(z), null, null, null, null, Boolean.TRUE, 30, null);
        }
    }

    @Override // tb.qjb
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef6f6214", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.qjb
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826d24c0", new Object[]{this, new Boolean(z)});
        } else {
            this.f.q(z);
        }
    }
}
