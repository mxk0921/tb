package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Comparator<UINode> h = new a();
    public static final Comparator<UINode> i = new b();
    public static final Comparator<UINode> j = new c();
    public static final Comparator<UINode> k = new d();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<UINode> f31618a = new ArrayList<>(1);
    public final ArrayList<UINode> b = new ArrayList<>(1);
    public final ArrayList<UINode> c = new ArrayList<>(1);
    public final ArrayList<UINode> d = new ArrayList<>(1);
    public boolean e = true;
    public boolean f = true;
    public ywh g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Comparator<UINode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(UINode uINode, UINode uINode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ff3cdf", new Object[]{this, uINode, uINode2})).intValue();
            }
            int i = uINode.getGlobalVisibleRect().top;
            int i2 = uINode2.getGlobalVisibleRect().top;
            if (i == i2) {
                return 0;
            }
            return i - i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Comparator<UINode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(UINode uINode, UINode uINode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ff3cdf", new Object[]{this, uINode, uINode2})).intValue();
            }
            int i = uINode.getGlobalVisibleRect().bottom;
            int i2 = uINode2.getGlobalVisibleRect().bottom;
            if (i == i2) {
                return 0;
            }
            return i - i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Comparator<UINode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(UINode uINode, UINode uINode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ff3cdf", new Object[]{this, uINode, uINode2})).intValue();
            }
            int i = uINode.getGlobalVisibleRect().left;
            int i2 = uINode2.getGlobalVisibleRect().left;
            if (i == i2) {
                return 0;
            }
            return i - i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements Comparator<UINode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(UINode uINode, UINode uINode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ff3cdf", new Object[]{this, uINode, uINode2})).intValue();
            }
            int i = uINode.getGlobalVisibleRect().right;
            int i2 = uINode2.getGlobalVisibleRect().right;
            if (i == i2) {
                return 0;
            }
            return i - i2;
        }
    }

    static {
        t2o.a(986710069);
    }

    public void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        uINode.added = true;
        this.f31618a.add(uINode);
        if (this.g.v()) {
            this.b.add(uINode);
            this.c.add(uINode);
            this.d.add(uINode);
            this.e = true;
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14def59", new Object[]{this});
        } else {
            this.f = true;
        }
    }

    public ywh c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywh) ipChange.ipc$dispatch("deb460c1", new Object[]{this});
        }
        return this.g;
    }

    public UINode d(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i2)});
        }
        return this.f31618a.get(i2);
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return this.f31618a.size();
    }

    public List<UINode> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b338d676", new Object[]{this});
        }
        return this.b;
    }

    public List<UINode> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("41244dd2", new Object[]{this});
        }
        return this.c;
    }

    public List<UINode> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7a9453ab", new Object[]{this});
        }
        return this.d;
    }

    public List<UINode> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc1294e4", new Object[]{this});
        }
        return this.f31618a;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("278b3153", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55482d05", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public void l(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37f03e9", new Object[]{this, uINode});
            return;
        }
        uINode.added = false;
        this.f31618a.remove(uINode);
        if (this.g.v()) {
            this.b.remove(uINode);
            this.c.remove(uINode);
            this.d.remove(uINode);
        }
        b();
    }

    public void m(ywh ywhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c00767", new Object[]{this, ywhVar});
        } else {
            this.g = ywhVar;
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fb7b25", new Object[]{this});
        } else if (this.g.v() && this.e) {
            this.e = false;
            if (this.f31618a.size() > 1) {
                Collections.sort(this.f31618a, h);
                Collections.sort(this.b, i);
                Collections.sort(this.c, j);
                Collections.sort(this.d, k);
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b91230", new Object[]{this});
        } else {
            this.f = false;
        }
    }
}
