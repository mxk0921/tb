package com.taobao.tao.flexbox.layoutmanager.component;

import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.f;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.NestViewPager;
import com.taobao.weex.common.Constants;
import java.util.Map;
import tb.ir2;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements n.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f12161a;

        public a(String[] strArr) {
            this.f12161a = strArr;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            return ir2.b(((e) ((n) obj).K()).getViewParams().I0, this.f12161a);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            n nVar = (n) obj;
            if (nVar.r0().equals(Constants.Value.GRID) || nVar.r0().equals("list")) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements n.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f12162a;

        public b(String[] strArr) {
            this.f12162a = strArr;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            return ir2.b(((f.b) ((n) obj).K().getViewParams()).w0, this.f12162a);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements n.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f12163a;

        public c(String[] strArr) {
            this.f12163a = strArr;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            return ir2.b(((f.b) ((n) obj).K().getViewParams()).w0, this.f12163a);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            n nVar = (n) obj;
            if (nVar.r0().equals(Constants.Value.GRID) || nVar.r0().equals("list")) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements n.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12164a;

        public d(View view) {
            this.f12164a = view;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22da08ac", new Object[]{this, obj})).booleanValue();
            }
            return h.a((NestViewPager) ((n) obj).w0(), this.f12164a);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.n.e
        public boolean b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70812ce6", new Object[]{this, obj})).booleanValue();
            }
            n nVar = (n) obj;
            if (nVar.r0().equals(Constants.Value.GRID) || nVar.r0().equals("list")) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(503316876);
    }

    public static /* synthetic */ boolean a(ViewPager viewPager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85e56876", new Object[]{viewPager, view})).booleanValue();
        }
        return g(viewPager, view);
    }

    public static TabBarControllerComponent b(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarControllerComponent) ipChange.ipc$dispatch("99b606a9", new Object[]{nVar});
        }
        n z = nVar.P().d0().z(TabBarControllerComponent.class, new d(nVar.w0()), false);
        if (z != null) {
            return (TabBarControllerComponent) z.K();
        }
        return null;
    }

    public static f c(n nVar, String[] strArr, boolean z) {
        n nVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2f3ec4fe", new Object[]{nVar, strArr, new Boolean(z)});
        }
        if (z) {
            nVar2 = nVar.z(f.class, new b(strArr), true);
        } else {
            nVar2 = nVar.P().d0().z(f.class, new c(strArr), false);
        }
        if (nVar2 != null) {
            return (f) nVar2.K();
        }
        return null;
    }

    public static e d(n nVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b4243530", new Object[]{nVar, strArr});
        }
        n e = e(nVar, strArr);
        if (e != null) {
            return (e) e.K();
        }
        return null;
    }

    public static n e(n nVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("bbcc20d1", new Object[]{nVar, strArr});
        }
        return nVar.P().d0().z(e.class, new a(strArr), false);
    }

    public static boolean g(ViewPager viewPager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("949bf4ee", new Object[]{viewPager, view})).booleanValue();
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == viewPager) {
                return true;
            }
            if ((parent instanceof ViewPager) && parent != viewPager) {
                return false;
            }
        }
        return false;
    }

    public static void f(String str, Map map, Component component, String[] strArr, g gVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dbf124", new Object[]{str, map, component, strArr, gVar});
        } else if (gVar != null) {
            if (component instanceof e) {
                z = true ^ ((e) component).f;
            }
            if (str.equals("weexfoldtab")) {
                if (ir2.b(nwv.J(map.get("group"), null), strArr) && z) {
                    gVar.m(map);
                }
            } else if (str.equals("foldtab") || str.equals("onscroll")) {
                if (ir2.b(nwv.J(map.get("group"), null), strArr) && z) {
                    gVar.l(map);
                }
            } else if (str.equals("canscrollvertical") && ir2.b(nwv.J(map.get("group"), null), strArr) && z && map.containsKey("canScrollVertically") && map.get("canScrollVertically").equals("-1")) {
                gVar.k();
            }
        }
    }
}
