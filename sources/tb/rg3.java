package tb;

import android.app.Activity;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.BlankCellViewHolder;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rg3<BASE_BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b i = new a();

    /* renamed from: a  reason: collision with root package name */
    public final yko f27353a;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public final Map<Class, bpl<b, Integer>> e = new HashMap();
    public final Map<Class, bpl<b, Integer>> f = new HashMap();
    public final Map<Class, bpl<b, Integer>> g = new HashMap();
    public final SparseArray<bpl<b, ListStyle>> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new BlankCellViewHolder(cVar.f27354a, cVar.b, cVar.d, cVar.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b extends ay4<c, WidgetViewHolder> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        /* renamed from: a  reason: collision with root package name */
        public Activity f27354a;
        public ude b;
        public ViewGroup c;
        public ListStyle d;
        public int e;
        public Object f;

        static {
            t2o.a(993001834);
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[0]);
                return;
            }
            c cVar = INSTANCE;
            cVar.f27354a = null;
            cVar.b = null;
            cVar.c = null;
            cVar.d = null;
            cVar.f = null;
        }
    }

    static {
        t2o.a(993001830);
    }

    public rg3(yko ykoVar) {
        SparseArray<bpl<b, ListStyle>> sparseArray = new SparseArray<>();
        this.h = sparseArray;
        sparseArray.put(0, bpl.a(i, null));
        this.f27353a = ykoVar;
    }

    public WidgetViewHolder a(int i2, Activity activity, ude udeVar, ViewGroup viewGroup, int i3, Object obj) {
        WidgetViewHolder widgetViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("f47ff8a0", new Object[]{this, new Integer(i2), activity, udeVar, viewGroup, new Integer(i3), obj});
        }
        bpl<b, ListStyle> bplVar = this.h.get(i2);
        c cVar = c.INSTANCE;
        cVar.f27354a = activity;
        cVar.b = udeVar;
        cVar.c = viewGroup;
        cVar.d = bplVar.b;
        cVar.e = i3;
        cVar.f = obj;
        try {
            widgetViewHolder = bplVar.f16534a.a(cVar);
        } catch (Exception e) {
            this.f27353a.l().e("CellFactory", "Error creating cell", e);
            widgetViewHolder = (WidgetViewHolder) ((a) i).a(cVar);
        }
        c.a();
        return widgetViewHolder;
    }

    public WidgetViewHolder b(int i2, Activity activity, ude udeVar, ViewGroup viewGroup, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("cafd715c", new Object[]{this, new Integer(i2), activity, udeVar, viewGroup, new Integer(i3), obj});
        }
        c cVar = c.INSTANCE;
        cVar.f27354a = activity;
        cVar.b = udeVar;
        cVar.c = viewGroup;
        cVar.d = this.h.get(i2).b;
        cVar.e = i3;
        cVar.f = obj;
        WidgetViewHolder widgetViewHolder = (WidgetViewHolder) ((a) i).a(cVar);
        c.a();
        return widgetViewHolder;
    }

    public bpl<b, Integer> c(ListStyle listStyle, Class cls) {
        Map<Class, bpl<b, Integer>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpl) ipChange.ipc$dispatch("55b3499a", new Object[]{this, listStyle, cls});
        }
        if (listStyle == ListStyle.WATERFALL) {
            map = this.f;
        } else if (listStyle == ListStyle.LIST) {
            map = this.e;
        } else {
            map = this.g;
        }
        return map.get(cls);
    }

    public int d(ListStyle listStyle, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2144ba", new Object[]{this, listStyle, cls})).intValue();
        }
        bpl<b, Integer> c2 = c(listStyle, cls);
        if (c2 != null) {
            return c2.b.intValue();
        }
        this.f27353a.l().d("CellFactory", "No creator for: ".concat(cls.getSimpleName()));
        return 0;
    }

    public void e(ListStyle listStyle, Class<? extends BASE_BEAN> cls, b bVar) {
        int i2;
        Map<Class, bpl<b, Integer>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b98c580", new Object[]{this, listStyle, cls, bVar});
            return;
        }
        if (listStyle == ListStyle.WATERFALL) {
            int i3 = this.b;
            this.b = 1 + i3;
            map = this.f;
            i2 = i3 + 502;
        } else if (listStyle == ListStyle.LIST) {
            int i4 = this.c;
            this.c = 1 + i4;
            map = this.e;
            i2 = i4 + 102;
        } else {
            int i5 = this.d;
            this.d = 1 + i5;
            map = this.g;
            i2 = i5 + 1002;
        }
        if (map.containsKey(cls)) {
            c4p l = this.f27353a.l();
            l.d("CellFactory", "creator is already registered: " + cls);
        }
        map.put(cls, bpl.a(bVar, Integer.valueOf(i2)));
        this.h.put(i2, bpl.a(bVar, listStyle));
    }
}
