package tb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.PicContainerViewHolder;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yc7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean k = vbl.f1();

    /* renamed from: a  reason: collision with root package name */
    public final Context f31978a;
    public List<md7> b;
    public final HashMap<Integer, kd7> e = new HashMap<>();
    public final HashMap<Integer, Boolean> f = new HashMap<>();
    public boolean g = false;
    public long h = 0;
    public int i = 0;
    public boolean j = false;
    public HashMap<String, Integer> c;
    public final int d = this.c.size() + 5;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31979a;
        public final /* synthetic */ int b;
        public final /* synthetic */ ImageStrategyConfig d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* compiled from: Taobao */
        /* renamed from: tb.yc7$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1106a implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31980a;

            public C1106a(a aVar, String str) {
                this.f31980a = str;
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                tgh.b("DescRecycleEngine", "图文图片提前加载失败" + this.f31980a);
                return true;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31981a;

            public b(String str) {
                this.f31981a = str;
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                tgh.b("DescRecycleEngine", a.this.b + "图文图片提前加载完成" + this.f31981a);
                return true;
            }
        }

        public a(String str, int i, int i2, ImageStrategyConfig imageStrategyConfig, int i3) {
            this.f31979a = str;
            this.e = i;
            this.f = i2;
            this.d = imageStrategyConfig;
            this.b = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageStrategyConfig imageStrategyConfig;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f31979a;
            Integer valueOf = Integer.valueOf(this.e);
            Integer valueOf2 = Integer.valueOf(this.f);
            if (yc7.e()) {
                imageStrategyConfig = this.d;
            } else {
                imageStrategyConfig = null;
            }
            String decideUrl = ImageStrategyDecider.decideUrl(str, valueOf, valueOf2, imageStrategyConfig);
            PhenixCreator addLoaderExtra = s0m.B().T(decideUrl).succListener(new b(decideUrl)).failListener(new C1106a(this, decideUrl)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, PicContainerViewHolder.DETAIL_IMG_BIZ_CODE_STR);
            if (yc7.e()) {
                addLoaderExtra.heightScale(true);
            }
            addLoaderExtra.fetch();
        }
    }

    static {
        t2o.a(912262275);
    }

    public yc7(Context context, List<md7> list) {
        this.f31978a = context;
        this.b = list;
        a();
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return k;
    }

    public final void a() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf45408", new Object[]{this});
            return;
        }
        this.c = new HashMap<>();
        for (md7 md7Var : this.b) {
            if (!this.c.containsKey(md7Var.d())) {
                this.c.put(md7Var.d(), Integer.valueOf(i));
                i++;
            }
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.b.size();
    }

    public List<md7> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb16ea5", new Object[]{this});
        }
        return this.b;
    }

    public Object d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.b.get(i);
    }

    public int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        String d = this.b.get(i).d();
        if (this.c.get(d) != null) {
            return this.c.get(d).intValue();
        }
        return 0;
    }

    public View g(int i, View view, ViewGroup viewGroup) {
        List<md7> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        md7 md7Var = this.b.get(i);
        if (view == null) {
            kd7<? extends md7> b = ld7.b(this.f31978a, md7Var, this.j);
            if (b != null) {
                View o = b.o(md7Var);
                if (o != null) {
                    o.setTag(b);
                    view = o;
                } else {
                    view = new View(this.f31978a);
                }
            } else {
                view = new View(this.f31978a);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbsListView.LayoutParams layoutParams2 = new AbsListView.LayoutParams(-1, -2);
            if (layoutParams != null) {
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            }
            view.setLayoutParams(layoutParams2);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setDescendantFocusability(393216);
            }
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof kd7)) {
            kd7 kd7Var = (kd7) tag;
            kd7Var.u();
            kd7Var.v(i);
            this.e.put(Integer.valueOf(i), kd7Var);
            int i2 = this.i;
            if (i2 > 0 && (kd7Var instanceof PicContainerViewHolder)) {
                ((PicContainerViewHolder) kd7Var).H(i2);
            }
            try {
                kd7Var.g(md7Var);
            } catch (Exception e) {
                tgh.c("DescRecycleEngine", "VessleView bindData异常", e);
            }
            if (this.i > 0 && (list = this.b) != null && list.size() > 0) {
                l(this.i, i);
            }
        }
        if (this.h != 0 && (i == 0 || i == b() - 1)) {
            tgh.b("DescRecycleEngine", "Detail view holder first view time:" + (SystemClock.uptimeMillis() - this.h));
            this.h = 0L;
        }
        return view;
    }

    public kd7 h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kd7) ipChange.ipc$dispatch("9a0ad5ad", new Object[]{this, new Integer(i)});
        }
        if (!this.e.containsKey(Integer.valueOf(i))) {
            return null;
        }
        kd7 kd7Var = this.e.get(Integer.valueOf(i));
        if (kd7Var.i() == i) {
            return kd7Var;
        }
        return null;
    }

    public ArrayList<kd7> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("cf0195c6", new Object[]{this});
        }
        ArrayList<kd7> arrayList = new ArrayList<>();
        arrayList.addAll(this.e.values());
        return arrayList;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b94a38ce", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final void l(int i, int i2) {
        md7 md7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488d5a56", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ImageStrategyConfig a2 = ImageStrategyConfig.v(PicContainerViewHolder.DETAIL_IMG_BIZ_NAME, PicContainerViewHolder.DETAIL_IMG_BIZ_CODE).o(true).a();
        int f = mr7.f(this.f31978a);
        int e = mr7.e(this.f31978a);
        for (int i3 = 1; i3 <= i; i3++) {
            int i4 = i2 + i3;
            if (i4 < this.b.size() && ((this.f.get(Integer.valueOf(i4)) == null || !this.f.get(Integer.valueOf(i4)).booleanValue()) && (md7Var = this.b.get(i4)) != null && md7Var.d().equals("desc_single_image") && (md7Var instanceof n2m))) {
                String str = ((n2m) md7Var).m;
                if (TextUtils.isEmpty(str) || !str.toLowerCase().endsWith(".gif")) {
                    pos.a(new a(str, f, e, a2, i4));
                    this.f.put(Integer.valueOf(i4), Boolean.TRUE);
                }
            }
        }
    }

    public void m(List<md7> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79fbad3", new Object[]{this, list});
            return;
        }
        this.b = list;
        a();
        if (this.d < this.c.size()) {
            this.g = true;
        } else {
            this.g = false;
        }
    }

    public void n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e514220e", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a1448e", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c9f618", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public long q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }
}
