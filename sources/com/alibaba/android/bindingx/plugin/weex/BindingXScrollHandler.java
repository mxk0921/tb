package com.alibaba.android.bindingx.plugin.weex;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.appbar.AppBarLayout;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.ui.component.WXRefresh;
import com.taobao.weex.ui.component.WXScroller;
import com.taobao.weex.ui.component.list.WXListComponent;
import com.taobao.weex.ui.view.WXHorizontalScrollView;
import com.taobao.weex.ui.view.WXScrollView;
import com.taobao.weex.ui.view.listview.WXRecyclerView;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import com.taobao.weex.ui.view.refresh.wrapper.BounceRecyclerView;
import com.taobao.weex.ui.view.refresh.wrapper.BounceScrollerView;
import com.taobao.weex.utils.WXUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bb2;
import tb.fr8;
import tb.gfh;
import tb.j30;
import tb.vu3;
import tb.zuw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BindingXScrollHandler extends j30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, b> w = new HashMap<>();
    public RecyclerView.OnScrollListener q;
    public WXSwipeLayout.OnRefreshOffsetChangedListener r;
    public WXScrollView.WXScrollViewListener s;
    public WXHorizontalScrollView.ScrollViewListener t;
    public boolean u = false;
    public String v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2175a;
        public int b;

        public b(int i, int i2) {
            this.f2175a = i;
            this.b = i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements WXScrollView.WXScrollViewListener, WXHorizontalScrollView.ScrollViewListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2178a;
        public int b;
        public int c;
        public int d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f2179a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.f2179a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d dVar = d.this;
                BindingXScrollHandler.D(BindingXScrollHandler.this, d.b(dVar), d.a(d.this), this.f2179a, this.b, this.c, this.d);
            }
        }

        public d() {
            this.f2178a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }

        public static /* synthetic */ int a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e3ab9653", new Object[]{dVar})).intValue();
            }
            return dVar.b;
        }

        public static /* synthetic */ int b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6740c06d", new Object[]{dVar})).intValue();
            }
            return dVar.f2178a;
        }

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScroll(WXScrollView wXScrollView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0964985", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
            } else {
                c(i, i2);
            }
        }

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScrollChanged(WXScrollView wXScrollView, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40baada1", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScrollStopped(WXScrollView wXScrollView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("253d571a", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.weex.ui.view.WXScrollView.WXScrollViewListener
        public void onScrollToBottom(WXScrollView wXScrollView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3770d2b", new Object[]{this, wXScrollView, new Integer(i), new Integer(i2)});
            }
        }

        public void onScrollChanged(WXHorizontalScrollView wXHorizontalScrollView, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3f3241d", new Object[]{this, wXHorizontalScrollView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                c(i, i2);
            }
        }

        public final void c(int i, int i2) {
            int i3;
            int i4;
            int i5;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9072c8d0", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int i6 = i - this.f2178a;
            int i7 = i2 - this.b;
            this.f2178a = i;
            this.b = i2;
            if (i6 != 0 || i7 != 0) {
                if (!BindingXScrollHandler.Q(BindingXScrollHandler.this, i7, this.d)) {
                    this.c = this.b;
                } else {
                    z = false;
                }
                int i8 = this.f2178a;
                int i9 = this.b;
                int i10 = i9 - this.c;
                this.d = i7;
                if (z) {
                    double d = i8;
                    i3 = i8;
                    i5 = i6;
                    i4 = i7;
                    BindingXScrollHandler.U(BindingXScrollHandler.this, "turn", d, i9, i6, i7, d, i10, new Object[0]);
                } else {
                    i5 = i6;
                    i4 = i7;
                    i3 = i8;
                }
                WXBridgeManager.getInstance().post(new a(i5, i4, i3, i10), BindingXScrollHandler.E(BindingXScrollHandler.this));
            }
        }
    }

    public BindingXScrollHandler(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
        super(context, aVar, objArr);
    }

    public static /* synthetic */ void D(BindingXScrollHandler bindingXScrollHandler, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e1b3da", new Object[]{bindingXScrollHandler, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            bindingXScrollHandler.B(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ String E(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f555e6", new Object[]{bindingXScrollHandler});
        }
        return bindingXScrollHandler.e;
    }

    public static /* synthetic */ int F(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32db452e", new Object[]{bindingXScrollHandler})).intValue();
        }
        return bindingXScrollHandler.n;
    }

    public static /* synthetic */ void G(BindingXScrollHandler bindingXScrollHandler, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6184c54a", new Object[]{bindingXScrollHandler, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            bindingXScrollHandler.A(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ int H(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f932abb0", new Object[]{bindingXScrollHandler})).intValue();
        }
        return bindingXScrollHandler.n;
    }

    public static /* synthetic */ void I(BindingXScrollHandler bindingXScrollHandler, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b8aae0", new Object[]{bindingXScrollHandler, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            bindingXScrollHandler.B(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ String J(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5317df20", new Object[]{bindingXScrollHandler});
        }
        return bindingXScrollHandler.e;
    }

    public static /* synthetic */ String K(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b572f5ff", new Object[]{bindingXScrollHandler});
        }
        return bindingXScrollHandler.v;
    }

    public static /* synthetic */ HashMap L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7085dfa8", new Object[0]);
        }
        return w;
    }

    public static /* synthetic */ boolean M(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eece939c", new Object[]{bindingXScrollHandler})).booleanValue();
        }
        return bindingXScrollHandler.u;
    }

    public static /* synthetic */ void N(BindingXScrollHandler bindingXScrollHandler, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a2d4ee", new Object[]{bindingXScrollHandler, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            bindingXScrollHandler.A(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ void O(BindingXScrollHandler bindingXScrollHandler, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1cff7d", new Object[]{bindingXScrollHandler, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            bindingXScrollHandler.B(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ String P(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77697663", new Object[]{bindingXScrollHandler});
        }
        return bindingXScrollHandler.e;
    }

    public static /* synthetic */ boolean Q(BindingXScrollHandler bindingXScrollHandler, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d01dd70", new Object[]{bindingXScrollHandler, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return bindingXScrollHandler.V(i, i2);
    }

    public static /* synthetic */ void R(BindingXScrollHandler bindingXScrollHandler, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7881d9", new Object[]{bindingXScrollHandler, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            bindingXScrollHandler.A(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ void S(BindingXScrollHandler bindingXScrollHandler, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0dd1670", new Object[]{bindingXScrollHandler, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else {
            bindingXScrollHandler.B(i, i2, i3, i4, i5, i6);
        }
    }

    public static /* synthetic */ String T(BindingXScrollHandler bindingXScrollHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7f9990", new Object[]{bindingXScrollHandler});
        }
        return bindingXScrollHandler.e;
    }

    public static /* synthetic */ void U(BindingXScrollHandler bindingXScrollHandler, String str, double d2, double d3, double d4, double d5, double d6, double d7, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1d3a55", new Object[]{bindingXScrollHandler, str, new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), objArr});
        } else {
            bindingXScrollHandler.A(str, d2, d3, d4, d5, d6, d7, objArr);
        }
    }

    public static /* synthetic */ Object ipc$super(BindingXScrollHandler bindingXScrollHandler, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1101783380:
                bindingXScrollHandler.B(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
                return null;
            case -899050889:
                super.c((Map) objArr[0]);
                return null;
            case -189097425:
                super.p((String) objArr[0], (Map) objArr[1], (fr8) objArr[2], (List) objArr[3], (bb2.g) objArr[4]);
                return null;
            case 662235432:
                return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
            case 2097714154:
                bindingXScrollHandler.A((String) objArr[0], ((Number) objArr[1]).doubleValue(), ((Number) objArr[2]).doubleValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).doubleValue(), ((Number) objArr[6]).doubleValue(), (Object[]) objArr[7]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/plugin/weex/BindingXScrollHandler");
        }
    }

    public final boolean V(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6b2309a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i > 0 && i2 > 0) {
            return true;
        }
        if (i >= 0 || i2 >= 0) {
            return false;
        }
        return true;
    }

    @Override // tb.j30, tb.i3c
    public boolean b(String str, String str2) {
        String str3;
        BounceRecyclerView bounceRecyclerView;
        RecyclerView.OnScrollListener onScrollListener;
        WXHorizontalScrollView.ScrollViewListener scrollViewListener;
        WXScrollView.WXScrollViewListener wXScrollViewListener;
        WXSwipeLayout swipeLayout;
        WXSwipeLayout.OnRefreshOffsetChangedListener onRefreshOffsetChangedListener;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        super.b(str, str2);
        HashMap<String, b> hashMap = w;
        if (!(hashMap == null || TextUtils.isEmpty(this.v) || (bVar = hashMap.get(this.v)) == null)) {
            bVar.f2175a = this.n;
            bVar.b = this.o;
        }
        if (TextUtils.isEmpty(this.f)) {
            str3 = this.e;
        } else {
            str3 = this.f;
        }
        WXScroller a2 = zuw.a(str3, str);
        if (a2 == null) {
            gfh.b("[ExpressionScrollHandler]source component not found.");
            return false;
        }
        if (a2 instanceof WXScroller) {
            WXScroller wXScroller = a2;
            BounceScrollerView bounceScrollerView = (ViewGroup) wXScroller.getHostView();
            if (!(bounceScrollerView == null || !(bounceScrollerView instanceof BounceScrollerView) || (swipeLayout = bounceScrollerView.getSwipeLayout()) == null || (onRefreshOffsetChangedListener = this.r) == null)) {
                swipeLayout.removeOnRefreshOffsetChangedListener(onRefreshOffsetChangedListener);
            }
            WXHorizontalScrollView innerView = wXScroller.getInnerView();
            if (innerView != null && (innerView instanceof WXScrollView) && (wXScrollViewListener = this.s) != null) {
                ((WXScrollView) innerView).removeScrollViewListener(wXScrollViewListener);
                return true;
            } else if (!(innerView == null || !(innerView instanceof WXHorizontalScrollView) || (scrollViewListener = this.t) == null)) {
                innerView.removeScrollViewListener(scrollViewListener);
                return true;
            }
        } else if ((a2 instanceof WXListComponent) && (bounceRecyclerView = (BounceRecyclerView) ((WXListComponent) a2).getHostView()) != null) {
            if (!(bounceRecyclerView.getSwipeLayout() == null || this.r == null)) {
                bounceRecyclerView.getSwipeLayout().removeOnRefreshOffsetChangedListener(this.r);
            }
            WXRecyclerView innerView2 = bounceRecyclerView.getInnerView();
            if (!(innerView2 == null || (onScrollListener = this.q) == null)) {
                innerView2.removeOnScrollListener(onScrollListener);
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca699277", new Object[]{this, map});
            return;
        }
        super.c(map);
        if (map != null) {
            this.u = WXUtils.getBoolean(map.get("disabledNormalize"), Boolean.FALSE).booleanValue();
        }
    }

    @Override // tb.i3c
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b9cde", new Object[]{this, str, str2});
        }
    }

    @Override // tb.i3c
    public boolean j(String str, String str2) {
        String str3;
        boolean z;
        WXSwipeLayout swipeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            str3 = this.e;
        } else {
            str3 = this.f;
        }
        WXScroller a2 = zuw.a(str3, str);
        if (a2 == null) {
            gfh.b("[ExpressionScrollHandler]source component not found.");
            return false;
        }
        this.v = str;
        if (a2 instanceof WXScroller) {
            WXScroller wXScroller = a2;
            BounceScrollerView bounceScrollerView = (ViewGroup) wXScroller.getHostView();
            if (!(bounceScrollerView == null || !(bounceScrollerView instanceof BounceScrollerView) || (swipeLayout = bounceScrollerView.getSwipeLayout()) == null)) {
                e eVar = new e();
                this.r = eVar;
                swipeLayout.addOnRefreshOffsetChangedListener(eVar);
            }
            WXHorizontalScrollView innerView = wXScroller.getInnerView();
            if (innerView != null && (innerView instanceof WXScrollView)) {
                d dVar = new d();
                this.s = dVar;
                ((WXScrollView) innerView).addScrollViewListener(dVar);
                return true;
            } else if (innerView != null && (innerView instanceof WXHorizontalScrollView)) {
                d dVar2 = new d();
                this.t = dVar2;
                innerView.addScrollViewListener(dVar2);
                return true;
            }
        } else if (a2 instanceof WXListComponent) {
            WXListComponent wXListComponent = (WXListComponent) a2;
            BounceRecyclerView bounceRecyclerView = (BounceRecyclerView) wXListComponent.getHostView();
            if (bounceRecyclerView != null) {
                WXSwipeLayout swipeLayout2 = bounceRecyclerView.getSwipeLayout();
                if (swipeLayout2 != null) {
                    e eVar2 = new e();
                    this.r = eVar2;
                    swipeLayout2.addOnRefreshOffsetChangedListener(eVar2);
                }
                WXRecyclerView innerView2 = bounceRecyclerView.getInnerView();
                if (wXListComponent.getOrientation() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (innerView2 != null) {
                    HashMap<String, b> hashMap = w;
                    if (hashMap != null && hashMap.get(str) == null) {
                        hashMap.put(str, new b(0, 0));
                    }
                    InnerListScrollListener innerListScrollListener = new InnerListScrollListener(z, new WeakReference(wXListComponent));
                    this.q = innerListScrollListener;
                    innerView2.addOnScrollListener(innerListScrollListener);
                    return true;
                }
            }
        } else if (a2.getHostView() != null && (a2.getHostView() instanceof AppBarLayout)) {
            ((AppBarLayout) a2.getHostView()).addOnOffsetChangedListener((AppBarLayout.d) new c());
            return true;
        }
        return false;
    }

    @Override // tb.i3c
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // tb.i3c
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // tb.j30, com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.q = null;
        this.s = null;
        HashMap<String, b> hashMap = w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void p(String str, Map<String, Object> map, fr8 fr8Var, List<Map<String, Object>> list, bb2.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ba9a2f", new Object[]{this, str, map, fr8Var, list, gVar});
        } else {
            super.p(str, map, fr8Var, list, gVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements AppBarLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2176a;
        public int b;
        public int c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f2177a;
            public final /* synthetic */ int b;

            public a(int i, int i2) {
                this.f2177a = i;
                this.b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                BindingXScrollHandler.S(BindingXScrollHandler.this, 0, c.b(cVar), 0, this.f2177a, 0, this.b);
            }
        }

        public c() {
            this.f2176a = 0;
            this.b = 0;
            this.c = 0;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("412b4aa4", new Object[]{cVar})).intValue();
            }
            return cVar.f2176a;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1579d24", new Object[]{this, appBarLayout, new Integer(i)});
                return;
            }
            int i2 = -i;
            int i3 = i2 - this.f2176a;
            this.f2176a = i2;
            if (i3 != 0) {
                if (!BindingXScrollHandler.Q(BindingXScrollHandler.this, i3, this.c)) {
                    this.b = this.f2176a;
                } else {
                    z = false;
                }
                int i4 = this.f2176a;
                int i5 = i4 - this.b;
                this.c = i3;
                if (z) {
                    BindingXScrollHandler.R(BindingXScrollHandler.this, "turn", vu3.b.GEO_NOT_SUPPORT, i4, vu3.b.GEO_NOT_SUPPORT, i3, vu3.b.GEO_NOT_SUPPORT, i5, new Object[0]);
                }
                WXBridgeManager.getInstance().post(new a(i3, i5), BindingXScrollHandler.T(BindingXScrollHandler.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements WXSwipeLayout.OnRefreshOffsetChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2180a;
        public int b;
        public int c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f2181a;
            public final /* synthetic */ int b;

            public a(int i, int i2) {
                this.f2181a = i;
                this.b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BindingXScrollHandler bindingXScrollHandler = BindingXScrollHandler.this;
                BindingXScrollHandler.I(bindingXScrollHandler, BindingXScrollHandler.H(bindingXScrollHandler), e.a(e.this), 0, this.f2181a, 0, this.b);
            }
        }

        public e() {
            this.f2180a = 0;
            this.b = 0;
            this.c = 0;
        }

        public static /* synthetic */ int a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1687ba96", new Object[]{eVar})).intValue();
            }
            return eVar.f2180a;
        }

        @Override // com.taobao.weex.ui.view.refresh.core.WXSwipeLayout.OnRefreshOffsetChangedListener
        public void onOffsetChanged(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f4d19a", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = -i;
            int i3 = i2 - this.f2180a;
            this.f2180a = i2;
            if (i3 != 0) {
                if (!BindingXScrollHandler.Q(BindingXScrollHandler.this, i3, this.c)) {
                    this.b = this.f2180a;
                } else {
                    z = false;
                }
                int i4 = this.f2180a - this.b;
                this.c = i3;
                if (z) {
                    BindingXScrollHandler bindingXScrollHandler = BindingXScrollHandler.this;
                    BindingXScrollHandler.G(bindingXScrollHandler, "turn", BindingXScrollHandler.F(bindingXScrollHandler), this.f2180a, vu3.b.GEO_NOT_SUPPORT, i3, vu3.b.GEO_NOT_SUPPORT, i4, new Object[0]);
                }
                WXBridgeManager.getInstance().post(new a(i3, i4), BindingXScrollHandler.J(BindingXScrollHandler.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class InnerListScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2173a;
        public int b;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public final boolean g;
        public final WeakReference<WXListComponent> h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f2174a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.f2174a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                InnerListScrollListener innerListScrollListener = InnerListScrollListener.this;
                BindingXScrollHandler.O(BindingXScrollHandler.this, InnerListScrollListener.b(innerListScrollListener), InnerListScrollListener.o(InnerListScrollListener.this), this.f2174a, this.b, this.c, this.d);
            }
        }

        public InnerListScrollListener(boolean z, WeakReference<WXListComponent> weakReference) {
            b bVar;
            this.f2173a = 0;
            this.b = 0;
            this.g = z;
            this.h = weakReference;
            if (!TextUtils.isEmpty(BindingXScrollHandler.K(BindingXScrollHandler.this)) && BindingXScrollHandler.L() != null && (bVar = (b) BindingXScrollHandler.L().get(BindingXScrollHandler.K(BindingXScrollHandler.this))) != null) {
                this.f2173a = bVar.f2175a;
                this.b = bVar.b;
            }
        }

        public static /* synthetic */ int b(InnerListScrollListener innerListScrollListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("788e2b5c", new Object[]{innerListScrollListener})).intValue();
            }
            return innerListScrollListener.f2173a;
        }

        public static /* synthetic */ Object ipc$super(InnerListScrollListener innerListScrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/plugin/weex/BindingXScrollHandler$InnerListScrollListener");
        }

        public static /* synthetic */ int o(InnerListScrollListener innerListScrollListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a0d46b9d", new Object[]{innerListScrollListener})).intValue();
            }
            return innerListScrollListener.b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            WeakReference<WXListComponent> weakReference;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            if (!ViewCompat.isInLayout(recyclerView) || (weakReference = this.h) == null || weakReference.get() == null) {
                this.b += i2;
            } else if (!BindingXScrollHandler.M(BindingXScrollHandler.this)) {
                WXListComponent wXListComponent = this.h.get();
                this.b = Math.abs(wXListComponent.calcContentOffset(recyclerView)) - ((wXListComponent.getChild(0) == null || !(wXListComponent.getChild(0) instanceof WXRefresh)) ? 0 : (int) wXListComponent.getChild(0).getLayoutHeight());
            } else {
                this.b += i2;
            }
            this.f2173a += i;
            if (BindingXScrollHandler.Q(BindingXScrollHandler.this, i, this.e) || this.g) {
                z = false;
            } else {
                this.c = this.f2173a;
                z = true;
            }
            if (!BindingXScrollHandler.Q(BindingXScrollHandler.this, i2, this.f) && this.g) {
                this.d = this.b;
            }
            int i3 = this.f2173a;
            int i4 = i3 - this.c;
            int i5 = this.b;
            int i6 = i5 - this.d;
            this.e = i;
            this.f = i2;
            if (z) {
                BindingXScrollHandler.N(BindingXScrollHandler.this, "turn", i3, i5, i, i2, i4, i6, new Object[0]);
            }
            WXBridgeManager.getInstance().post(new a(i, i2, i4, i6), BindingXScrollHandler.P(BindingXScrollHandler.this));
        }
    }
}
