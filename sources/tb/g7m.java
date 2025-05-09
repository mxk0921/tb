package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.r;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.player.IPlayBack;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g7m implements eaw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String image_test_biz_name = "guangguangvideo";
    public static final int image_test_optimise_biz_code = 9103;
    public static final int image_test_origin_biz_code = 9104;
    public static int j = 1;
    public static boolean k = false;
    public static float l = 0.5f;
    public static g7m m = null;

    /* renamed from: a  reason: collision with root package name */
    public dhb f19771a;
    public d c;
    public e d;
    public Map<String, Object> e;
    public WeakReference<Context> h;
    public boolean b = false;
    public final HashMap<String, c> f = new HashMap<>(j);
    public String g = "";
    public final Map<String, b> i = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19772a;

        public a(Context context) {
            this.f19772a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (akt.p2("fixAppSettingProvider", true)) {
                    g7m.a(g7m.this, j9t.e(this.f19772a, "tab2").b());
                } else {
                    g7m.a(g7m.this, new n81(this.f19772a));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f19773a;

        static {
            t2o.a(502268289);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final IPlayBack f19774a;
        public final TBVideoComponent b;
        public final String c;

        static {
            t2o.a(502268290);
        }

        public c(IPlayBack iPlayBack, TBVideoComponent tBVideoComponent, String str) {
            this.f19774a = iPlayBack;
            this.b = tBVideoComponent;
            this.c = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
    }

    static {
        t2o.a(502268287);
        t2o.a(502268294);
    }

    public g7m() {
        Variation variation;
        VariationSet activate = UTABTest.activate("Android_guangguang", "multiplay");
        if (!(activate == null || (variation = activate.getVariation("count")) == null)) {
            j = variation.getValueAsInt(1);
        }
        VariationSet activate2 = UTABTest.activate("Android_guangguang", "autoplay_strategy");
        if (activate2 != null) {
            Variation variation2 = activate2.getVariation("scrollPlayNextEnable");
            if (variation2 != null) {
                k = variation2.getValueAsBoolean(false);
            }
            Variation variation3 = activate2.getVariation("areaRate");
            if (variation3 != null) {
                l = 1.0f - variation3.getValueAsFloat(0.5f);
            }
        }
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ebee55", new Object[0])).booleanValue();
        }
        chb g = c21.g();
        if (g == null || g.getInt("deviceLevel", -1) != 2) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ dhb a(g7m g7mVar, dhb dhbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhb) ipChange.ipc$dispatch("f6aa0d95", new Object[]{g7mVar, dhbVar});
        }
        g7mVar.f19771a = dhbVar;
        return dhbVar;
    }

    public static synchronized g7m o() {
        synchronized (g7m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g7m) ipChange.ipc$dispatch("7f2d6a9c", new Object[0]);
            }
            if (m == null) {
                m = new g7m();
            }
            return m;
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06f3906", new Object[]{this})).booleanValue();
        }
        c(false);
        return sz3.c(this.f, j);
    }

    public boolean B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5473778", new Object[]{this, context})).booleanValue();
        }
        if (G()) {
            return false;
        }
        dhb dhbVar = this.f19771a;
        if (dhbVar != null) {
            return dhbVar.isAutoPlayVideoUnderCurrentNetwork(context);
        }
        if (!this.b) {
            AsyncTask.execute(new a(context));
        }
        this.b = true;
        return false;
    }

    public boolean C(String str) {
        IPlayBack iPlayBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aefa29e0", new Object[]{this, str})).booleanValue();
        }
        c cVar = this.f.get(str);
        if (cVar == null || (iPlayBack = cVar.f19774a) == null || (!iPlayBack.o() && !cVar.f19774a.m())) {
            return false;
        }
        return true;
    }

    public boolean D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91bd3661", new Object[]{this, str})).booleanValue();
        }
        return this.f.containsKey(str);
    }

    public boolean E() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4bcb004", new Object[]{this})).booleanValue();
        }
        Iterator<c> it = this.f.values().iterator();
        while (true) {
            if (it.hasNext()) {
                c next = it.next();
                if (next != null && (next.f19774a instanceof w9w)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return !z;
    }

    public boolean F(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6f14f7a", new Object[]{this, context})).booleanValue();
        }
        WeakReference<Context> weakReference = this.h;
        if (weakReference == null || weakReference.get() == context) {
            z = true;
        } else {
            z = false;
        }
        if (!z() || !z) {
            return false;
        }
        return true;
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81c29", new Object[]{this, str});
            return;
        }
        c cVar = this.f.get(str);
        if (cVar != null) {
            IPlayBack iPlayBack = cVar.f19774a;
            if (iPlayBack instanceof w9w) {
                ((w9w) iPlayBack).x();
                this.h = new WeakReference<>(cVar.b.getNode().N());
            }
        }
    }

    public final void J(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79773a1c", new Object[]{this, bVar, str});
        } else if (bVar != null && !TextUtils.isEmpty(str)) {
            ((HashMap) this.i).put(str, bVar);
        }
    }

    public final void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c096492", new Object[]{this, str});
            return;
        }
        c cVar = this.f.get(str);
        if (cVar != null) {
            IPlayBack iPlayBack = cVar.f19774a;
            if (!(iPlayBack instanceof w9w)) {
                return;
            }
            if (((w9w) iPlayBack).o() || ((w9w) cVar.f19774a).m()) {
                b bVar = new b();
                bVar.f19773a = ((w9w) cVar.f19774a).p();
                J(bVar, cVar.c);
                return;
            }
            L(cVar.c);
        }
    }

    public final void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c57476", new Object[]{this, str});
        } else {
            ((HashMap) this.i).remove(str);
        }
    }

    public boolean M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6670a4", new Object[]{this, str})).booleanValue();
        }
        c cVar = this.f.get(str);
        if (cVar != null) {
            IPlayBack iPlayBack = cVar.f19774a;
            if (iPlayBack instanceof w9w) {
                ((w9w) iPlayBack).s();
                this.h = null;
                return true;
            }
        }
        return false;
    }

    public void N(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bddc9c1", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public void O(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fc1191", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    public void P(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227d617f", new Object[]{this, eVar});
        } else {
            this.d = eVar;
        }
    }

    public void Q(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a95085", new Object[]{this, new Boolean(z), str});
            return;
        }
        c cVar = this.f.get(str);
        if (cVar != null) {
            cVar.f19774a.j(z);
        }
    }

    public final void R(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921c236f", new Object[]{this, cVar, str});
            return;
        }
        c cVar2 = this.f.get(str);
        if (cVar != cVar2) {
            if (cVar2 == null || cVar == null || cVar2.b != cVar.b) {
                if (this.f.size() >= j && this.f.containsKey(this.g)) {
                    f(this.g);
                }
                this.g = str;
                this.f.put(str, cVar);
            }
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e764c0", new Object[]{this, str})).booleanValue();
        }
        if (m(str) > 0) {
            return true;
        }
        return false;
    }

    public void c(boolean z) {
        TBVideoComponent tBVideoComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb0286", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, c> entry : this.f.entrySet()) {
                c value = entry.getValue();
                if (!(value == null || value.f19774a == null || (tBVideoComponent = value.b) == null)) {
                    if (!tBVideoComponent.y0()) {
                        if (z && akt.a() && value.b.isHalfHide()) {
                        }
                        if (TBVideoComponent.i0() && value.f19774a.f()) {
                        }
                    }
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f((String) it.next());
            }
        } catch (Throwable th) {
            tfs.d("checkValidVideo " + th.getMessage());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de64f685", new Object[]{this});
            return;
        }
        Map<String, b> map = this.i;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public void e(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24930005", new Object[]{this, new Boolean(z), str});
            return;
        }
        c cVar = this.f.get(str);
        if (cVar != null && cVar.c.equals(str)) {
            if (cVar.f19774a != null) {
                TBVideoComponent tBVideoComponent = cVar.b;
                if (tBVideoComponent != null) {
                    tBVideoComponent.X0();
                    cVar.b.f0(cVar.f19774a.w());
                }
                L(cVar.c);
            }
            this.h = null;
            this.f.remove(str);
        }
    }

    public c f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("96417141", new Object[]{this, str});
        }
        return g(false, str);
    }

    public c g(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("46635f3d", new Object[]{this, new Boolean(z), str});
        }
        c cVar = this.f.get(str);
        if (cVar == null || !cVar.c.equals(str)) {
            return null;
        }
        IPlayBack iPlayBack = cVar.f19774a;
        if (iPlayBack != null) {
            TBVideoComponent tBVideoComponent = cVar.b;
            if (tBVideoComponent != null) {
                tBVideoComponent.f0(iPlayBack.w());
            }
            cVar.f19774a.a(z, cVar.b.r0());
            K(str);
        }
        this.h = null;
        return this.f.remove(str);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35582f0c", new Object[]{this})).booleanValue();
        }
        return "true".equals(vfs.g().e("weitao_switch", "liveplayer_degrade", "false"));
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25f72780", new Object[]{this})).booleanValue();
        }
        return "true".equals(vfs.g().e("weitao_switch", "fix_liveplayer_black", "true"));
    }

    public HashMap<String, c> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("960c88bf", new Object[]{this});
        }
        c(false);
        return this.f;
    }

    public int l(String str) {
        IPlayBack iPlayBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d8ccd10", new Object[]{this, str})).intValue();
        }
        c cVar = this.f.get(str);
        if (cVar == null || (iPlayBack = cVar.f19774a) == null) {
            return 0;
        }
        return iPlayBack.d;
    }

    public int m(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39ba9cb9", new Object[]{this, str})).intValue();
        }
        if (!TextUtils.isEmpty(str) && (bVar = (b) ((HashMap) this.i).get(str)) != null) {
            return bVar.f19773a;
        }
        return 0;
    }

    public Map<String, Object> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("38aa2205", new Object[]{this});
        }
        return this.e;
    }

    public boolean p(h7w h7wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b006979", new Object[]{this, h7wVar})).booleanValue();
        }
        switch (h7wVar.b) {
            case 0:
                return v(h7wVar);
            case 1:
                return x(h7wVar);
            case 2:
                return s(h7wVar);
            case 3:
                return q(h7wVar);
            case 4:
                return w(h7wVar);
            case 5:
                return t(h7wVar);
            case 6:
                return u(h7wVar);
            case 7:
                return r(h7wVar);
            case 8:
                return y(h7wVar);
            default:
                return false;
        }
    }

    public final boolean q(h7w h7wVar) {
        c next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d94b16c", new Object[]{this, h7wVar})).booleanValue();
        }
        Iterator<c> it = this.f.values().iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            TBVideoComponent tBVideoComponent = next.b;
            if (tBVideoComponent != null) {
                return tBVideoComponent.d0(null);
            }
        }
        return false;
    }

    public final boolean u(h7w h7wVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a202fb", new Object[]{this, h7wVar})).booleanValue();
        }
        for (c cVar : this.f.values()) {
            if (cVar != null && cVar.f19774a == h7wVar.f20461a) {
                d dVar = this.c;
                if (dVar != null) {
                    ((TBVideoComponent.q) dVar).b(true);
                    tfs.c("AVSDK_PlayerManagerSharePlayer", "handleVideoFirstFrameRender 首帧加载成功");
                }
                e eVar = this.d;
                if (eVar != null) {
                    ((TBVideoComponent.f) eVar).a(cVar);
                    tfs.c("TNodePlayerPrefetchManager", "handleVideoFirstFrameRender 首帧加载成功");
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean x(h7w h7wVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11342252", new Object[]{this, h7wVar})).booleanValue();
        }
        for (c cVar : this.f.values()) {
            int m2 = m(cVar.c);
            if (m2 > 1000) {
                IPlayBack iPlayBack = cVar.f19774a;
                if (h7wVar != null && h7wVar.f20461a == iPlayBack && m2 != iPlayBack.p() && iPlayBack.g()) {
                    iPlayBack.t(m2);
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean z() {
        IPlayBack iPlayBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d22f3bfe", new Object[]{this})).booleanValue();
        }
        c(false);
        for (c cVar : this.f.values()) {
            if (!(cVar == null || (iPlayBack = cVar.f19774a) == null || !iPlayBack.m())) {
                return true;
            }
        }
        return false;
    }

    public List<n> i(Component component, boolean z) {
        n y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b1674186", new Object[]{this, component, new Boolean(z)});
        }
        ListViewComponent.RecyclerViewAdapter recyclerViewAdapter = null;
        if (component == null || component.getView() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (component instanceof ListViewComponent) {
            ListViewComponent listViewComponent = (ListViewComponent) component;
            int[] findVisibleItemPositionRange = listViewComponent.getView().findVisibleItemPositionRange(true);
            RecyclerView.Adapter adapter = listViewComponent.getView().getAdapter();
            if (adapter instanceof ListViewComponent.RecyclerViewAdapter) {
                recyclerViewAdapter = (ListViewComponent.RecyclerViewAdapter) adapter;
            } else if (adapter instanceof TRecyclerView.HeaderViewAdapter) {
                RecyclerView.Adapter wrappedAdapter = ((TRecyclerView.HeaderViewAdapter) adapter).getWrappedAdapter();
                if (wrappedAdapter instanceof ListViewComponent.RecyclerViewAdapter) {
                    recyclerViewAdapter = (ListViewComponent.RecyclerViewAdapter) wrappedAdapter;
                }
            }
            if (recyclerViewAdapter != null) {
                for (int i = findVisibleItemPositionRange[0]; i <= findVisibleItemPositionRange[1] && i >= 0; i++) {
                    n d0 = recyclerViewAdapter.d0(i);
                    if (d0 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        d0.B("tbplayer", 2, arrayList2, false, false);
                        arrayList.addAll(arrayList2);
                    }
                }
            }
        } else if (component instanceof ScrollViewComponent) {
            List<n> findVisibleItems = ((ScrollViewComponent) component).findVisibleItems();
            if (findVisibleItems != null) {
                for (n nVar : findVisibleItems) {
                    ArrayList arrayList3 = new ArrayList();
                    nVar.B("tbplayer", 2, arrayList3, false, false);
                    arrayList.addAll(arrayList3);
                }
            }
        } else if ((component instanceof BrowserComponent) && (y = ((BrowserComponent) component).y()) != null) {
            ArrayList arrayList4 = new ArrayList();
            y.B("tbplayer", 2, arrayList4, false, false);
            arrayList.addAll(arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            Component K = nVar2.K();
            boolean z2 = K instanceof TBVideoComponent;
            if (!z2 || !((TBVideoComponent) K).B0()) {
                if (arrayList5.size() > 0 && z2) {
                    TBVideoComponent tBVideoComponent = (TBVideoComponent) K;
                    if (tBVideoComponent.g) {
                        tBVideoComponent.g = false;
                    }
                }
                if (z2 && ((TBVideoComponent) K).C0()) {
                    arrayList6.add(nVar2);
                }
            } else {
                arrayList5.add(nVar2);
            }
        }
        return z ? arrayList5 : arrayList6;
    }

    public final boolean r(h7w h7wVar) {
        IPlayBack iPlayBack;
        TBVideoComponent tBVideoComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52a59efa", new Object[]{this, h7wVar})).booleanValue();
        }
        if (!(h7wVar == null || (iPlayBack = h7wVar.f20461a) == null || (tBVideoComponent = iPlayBack.f12345a) == null)) {
            n node = tBVideoComponent.getNode();
            if (node.H(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("state", "destroy");
                tBVideoComponent.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                return true;
            }
        }
        return false;
    }

    public final boolean s(h7w h7wVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a24ab6f9", new Object[]{this, h7wVar})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f.values()) {
            if (cVar != null && cVar.f19774a == h7wVar.f20461a) {
                n node = cVar.b.getNode();
                if (node.H(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "complete");
                    cVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
            IPlayBack iPlayBack = cVar.f19774a;
            if (iPlayBack != null && h7wVar.f20461a == iPlayBack) {
                arrayList.add(cVar.c);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f((String) it.next());
        }
        return z;
    }

    public final boolean t(h7w h7wVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd83d4ec", new Object[]{this, h7wVar})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f.values()) {
            if (cVar != null && cVar.f19774a == h7wVar.f20461a) {
                n node = cVar.b.getNode();
                if (node.H(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "error");
                    cVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
            IPlayBack iPlayBack = cVar.f19774a;
            if (iPlayBack != null && h7wVar.f20461a == iPlayBack) {
                arrayList.add(cVar.c);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f((String) it.next());
        }
        return z;
    }

    public final boolean v(h7w h7wVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7787b43e", new Object[]{this, h7wVar})).booleanValue();
        }
        for (c cVar : this.f.values()) {
            if (cVar != null && cVar.f19774a == h7wVar.f20461a) {
                n node = cVar.b.getNode();
                if (node.H(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "pause");
                    cVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean w(h7w h7wVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47b9c33a", new Object[]{this, h7wVar})).booleanValue();
        }
        for (c cVar : this.f.values()) {
            if (cVar != null && cVar.f19774a == h7wVar.f20461a) {
                n node = cVar.b.getNode();
                if (node.H(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "play");
                    cVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean y(h7w h7wVar) {
        IPlayBack iPlayBack;
        TBVideoComponent tBVideoComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69759578", new Object[]{this, h7wVar})).booleanValue();
        }
        if (!(h7wVar == null || (iPlayBack = h7wVar.f20461a) == null || (tBVideoComponent = iPlayBack.f12345a) == null)) {
            n node = tBVideoComponent.getNode();
            if (node.H(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("state", csp.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE);
                hashMap.put(tmu.CURRENT_TIME, Integer.valueOf(h7wVar.f20461a.d));
                tBVideoComponent.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                return true;
            }
        }
        return false;
    }

    public boolean I(TBVideoComponent tBVideoComponent, Context context, int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        j2h j2hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b9f07ae", new Object[]{this, tBVideoComponent, context, new Integer(i), new Integer(i2), str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)})).booleanValue();
        }
        TBVideoComponent.u viewParams = tBVideoComponent.getViewParams();
        c cVar = this.f.get(str);
        if (cVar != null) {
            tfs.e("PlayerManager", "视频存在，直接播放视频" + str);
            cVar.f19774a.s();
            this.g = str;
            return true;
        }
        if (viewParams.L()) {
            if (TextUtils.isEmpty(viewParams.j1)) {
                tfs.f("playVideo failed for liveUrl empty");
                return false;
            }
        } else if (TextUtils.isEmpty(viewParams.A0) && TextUtils.isEmpty(viewParams.z0)) {
            tfs.f("playVideo failed for videoId empty");
            return false;
        }
        if (viewParams.L() && h()) {
            tfs.f("playVideo failed for downgrade live");
            return false;
        } else if (tBVideoComponent.y0()) {
            tfs.f("playVideo failed for host isFinishing");
            return false;
        } else {
            if (viewParams.L()) {
                j2hVar = new j2h(tBVideoComponent);
            } else {
                w9w w9wVar = new w9w(tBVideoComponent);
                w9wVar.l(z2);
                j2hVar = w9wVar;
            }
            c cVar2 = new c(j2hVar, tBVideoComponent, str);
            r q = j2hVar.q(context, i, i2, b(str), z, tBVideoComponent, z3, z4);
            j2hVar.h(this);
            R(cVar2, str);
            c cVar3 = this.f.get(str);
            if (cVar3 != null) {
                cVar3.f19774a.n(cVar3.b.r0());
            }
            try {
                d dVar = this.c;
                if (!(dVar == null || q == null)) {
                    ((TBVideoComponent.q) dVar).c(q.I());
                    ((TBVideoComponent.q) this.c).a(q);
                }
            } catch (Throwable th) {
                tfs.e("PlayerManager", th.getMessage());
            }
            return true;
        }
    }
}
