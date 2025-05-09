package com.taobao.tao.flexbox.layoutmanager.core;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent;
import com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.IndicatorComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.SliderComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.component.f;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.a5i;
import tb.a5k;
import tb.bh3;
import tb.c0n;
import tb.cb8;
import tb.p5i;
import tb.pay;
import tb.s7p;
import tb.t2o;
import tb.tfs;
import tb.uua;
import tb.vmp;
import tb.xbu;
import tb.yn8;
import tb.yob;
import tb.zf2;
import tb.zk9;
import tb.zr7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f12206a = new HashMap<>();
    public static final List<yob> b = new ArrayList();
    public static final HashMap<String, Class<? extends Component>> c = new HashMap<>();
    public static final HashSet<String> d = new HashSet<>();
    public static final HashMap<String, Boolean> e = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12207a;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        public a(String str, String str2, b bVar) {
            this.f12207a = str;
            this.b = str2;
            this.c = bVar;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else if (cls != null) {
                d.a(this.f12207a, this.b, cls, this.c);
            } else {
                tfs.f("ComponentFactory loadComponent failed,  newInstance failed for type " + this.f12207a);
                b bVar = this.c;
                if (bVar != null) {
                    ((n.a) bVar).a();
                }
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            tfs.f("ComponentFactory loadComponent failed, ClassNotFound for type " + this.f12207a);
            b bVar = this.c;
            if (bVar != null) {
                ((n.a) bVar).a();
            }
            l.g(true, "type", this.b, "error", "ClassNotFound");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    public static /* synthetic */ boolean a(String str, String str2, Class cls, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("948f0c8d", new Object[]{str, str2, cls, bVar})).booleanValue();
        }
        return k(str, str2, cls, bVar);
    }

    public static void b(yob yobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6741f29", new Object[]{yobVar});
        } else {
            b.add(yobVar);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824b9ce6", new Object[0]);
        } else {
            b(new pay());
        }
    }

    public static Component d(String str) {
        if (!TextUtils.isEmpty(str)) {
            Iterator it = ((ArrayList) b).iterator();
            while (it.hasNext()) {
                Component a2 = ((yob) it.next()).a(str);
                if (a2 != null) {
                    a2.name = str;
                    return a2;
                }
            }
        }
        Class<? extends Component> cls = c.get(str);
        if (cls == null) {
            return null;
        }
        try {
            Component component = (Component) cls.newInstance();
            if (component != null) {
                component.name = str;
            }
            return component;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65801f13", new Object[]{str})).booleanValue();
        }
        if (c.containsKey(str)) {
            return true;
        }
        String str2 = f12206a.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return g(str, str2, null);
        }
        return false;
    }

    public static boolean g(String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62c3e327", new Object[]{str, str2, bVar})).booleanValue();
        }
        try {
            Class<?> cls = Class.forName(str2, true, zk9.class.getClassLoader());
            HashMap<String, Boolean> hashMap = e;
            if (hashMap.get(str) == null) {
                hashMap.put(str, Boolean.TRUE);
            }
            return k(str, str2, cls, bVar);
        } catch (Throwable th) {
            tfs.g("ComponentFactory", "loadComponent failed, type:" + str + " name:" + str2 + " msg:" + th.getMessage());
            zk9.b(str2, new a(str, str2, bVar));
            HashMap<String, Boolean> hashMap2 = e;
            if (hashMap2.get(str) == null) {
                hashMap2.put(str, Boolean.FALSE);
            }
            return false;
        }
    }

    public static void h(String str, Class<? extends Component> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9befe1f2", new Object[]{str, cls});
        } else if (c.put(str, cls) != null) {
            tfs.d(str + " already in the factory");
        }
    }

    public static void i(String str, Class<? extends Component> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6eabcf", new Object[]{str, cls});
            return;
        }
        h(str, cls);
        d.add(str);
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79bd404f", new Object[]{str, str2});
        } else {
            f12206a.put(str, str2);
        }
    }

    public static void f(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3ab7f", new Object[]{str, bVar});
            return;
        }
        Component d2 = d(str);
        if (d2 != null) {
            ((n.a) bVar).b(d2);
            return;
        }
        String str2 = f12206a.get(str);
        if (TextUtils.isEmpty(str2)) {
            tfs.f("ComponentFactory loadComponent failed, remoteClassName is NULL for type " + str);
            ((n.a) bVar).a();
            return;
        }
        l.g(false, "type", str2);
        g(str, str2, bVar);
    }

    public static boolean k(String str, String str2, Class cls, b bVar) {
        try {
            c.put(str, cls);
            Component component = (Component) cls.newInstance();
            component.name = str;
            if (bVar != null) {
                ((n.a) bVar).b(component);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            l.g(true, "type", str2, "error", th.toString());
            tfs.f("ComponentFactory loadComponent failed,  newInstance failed for type " + str);
            if (bVar == null) {
                return false;
            }
            ((n.a) bVar).a();
            return false;
        }
    }

    static {
        t2o.a(503317026);
        c();
        i("text", TextComponent.class);
        i("image", com.taobao.tao.flexbox.layoutmanager.component.a.class);
        i("div", zr7.class);
        i("highlight", zr7.class);
        i("input", EditTextComponent.class);
        i("textarea", EditTextComponent.class);
        i("richText", RichTextComponent.class);
        i(Constants.Value.GRID, ListViewComponent.class);
        i("list", ListViewComponent.class);
        i("section", s7p.class);
        i("header", uua.class);
        i("cells", bh3.class);
        i("scrollView", ScrollViewComponent.class);
        i(WXBasicComponentType.SLIDER, SliderComponent.class);
        i("poplayer", PopLayerComponent.class);
        i("TabBar", e.class);
        i("TabBarController", TabBarControllerComponent.class);
        i("TabBarHeader", f.class);
        i("node", a5k.class);
        i("mediaBrowser", BrowserComponent.class);
        i("browserex", BrowserComponent.class);
        i(WXBasicComponentType.INDICATOR, IndicatorComponent.class);
        i("maskLayer", p5i.class);
        i("richtext", RichTextContainerComponent.class);
        i("ellipsize", cb8.class);
        i("expandableView", yn8.class);
        i("expandIndicator", zr7.class);
        i("tracker", xbu.class);
        i("progress", c0n.class);
        i("effectView", zf2.class);
        i("sheet", vmp.class);
        i("marqueeex", a5i.class);
        i("marquee", TextComponent.class);
    }
}
