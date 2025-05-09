package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.hk8;
import tb.iqs;
import tb.ir2;
import tb.jfw;
import tb.nwv;
import tb.ol4;
import tb.sxo;
import tb.t2o;
import tb.ut2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BrowserComponent extends Component<BrowserViewPager, f> implements ViewPager.OnPageChangeListener, ol4, iqs, j, sxo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_ITEM_ADD = 1;
    public static final int FLAG_ITEM_CHANGED = 4;
    public static final int FLAG_ITEM_MOVE = 8;
    public static final int FLAG_ITEM_REMOVED = 2;

    /* renamed from: a  reason: collision with root package name */
    public BrowserAdapter f12022a;
    public long c;
    public long d;
    public int b = 0;
    public boolean e = false;
    public final e f = new e();
    public final List<ScrollChangeListener> g = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12027a;

        public a(int i) {
            this.f12027a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BrowserComponent.h(BrowserComponent.this, this.f12027a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12028a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public b(n nVar, String str, Map map) {
            this.f12028a = nVar;
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BrowserComponent.this.sendMessage(34, this.f12028a, this.b, null, this.c, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12029a;
        public final /* synthetic */ n.g b;

        public c(n nVar, n.g gVar) {
            this.f12029a = nVar;
            this.b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BrowserComponent browserComponent = BrowserComponent.this;
            n nVar = this.f12029a;
            n.g gVar = this.b;
            browserComponent.sendMessage(130, nVar, gVar.d, null, gVar.e, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12030a;
        public final /* synthetic */ n.g b;

        public d(n nVar, n.g gVar) {
            this.f12030a = nVar;
            this.b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BrowserComponent browserComponent = BrowserComponent.this;
            n nVar = this.f12030a;
            n.g gVar = this.b;
            browserComponent.sendMessage(Component.MSG_FLAG_DISAPPEAR, nVar, gVar.d, null, gVar.e, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12031a = 0;
        public int b = -1;
        public int c = -1;
        public final Set d = new HashSet();

        static {
            t2o.a(503316700);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9f3b675", new Object[]{this})).booleanValue();
            }
            if (this.f12031a != 0) {
                return true;
            }
            return false;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f12031a = 0;
            this.b = -1;
            this.c = -1;
            ((HashSet) this.d).clear();
        }
    }

    static {
        t2o.a(503316691);
        t2o.a(503317030);
        t2o.a(503317201);
        t2o.a(503317092);
        t2o.a(503317117);
    }

    public static /* synthetic */ void h(BrowserComponent browserComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cb2ac9", new Object[]{browserComponent, new Integer(i)});
        } else {
            browserComponent.A(i);
        }
    }

    public static /* synthetic */ long i(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbe6e81f", new Object[]{browserComponent})).longValue();
        }
        return browserComponent.doubleClickTimeStamp;
    }

    public static /* synthetic */ Object ipc$super(BrowserComponent browserComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1619485803:
                return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
            case -1047517042:
                super.handleChildAdded((n) objArr[0], ((Number) objArr[1]).intValue(), (n) objArr[2]);
                return null;
            case -703216504:
                super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -97641899:
                super.handleChildDeleted((n) objArr[0], ((Number) objArr[1]).intValue(), (n) objArr[2]);
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1238389670:
                super.handleChildMoved((n) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (n) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/BrowserComponent");
        }
    }

    public static /* synthetic */ View.OnClickListener j(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("d3448df3", new Object[]{browserComponent});
        }
        return browserComponent.clickListener;
    }

    public static /* synthetic */ n k(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("1d0c91eb", new Object[]{browserComponent});
        }
        return browserComponent.node;
    }

    public static /* synthetic */ n l(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("7c7c6cca", new Object[]{browserComponent});
        }
        return browserComponent.node;
    }

    public static /* synthetic */ e m(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b36a26f7", new Object[]{browserComponent});
        }
        return browserComponent.f;
    }

    public static /* synthetic */ n n(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("374e4219", new Object[]{browserComponent});
        }
        return browserComponent.node;
    }

    public static /* synthetic */ n o(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("96be1cf8", new Object[]{browserComponent});
        }
        return browserComponent.node;
    }

    public static /* synthetic */ n p(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("f62df7d7", new Object[]{browserComponent});
        }
        return browserComponent.node;
    }

    public static /* synthetic */ n q(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("559dd2b6", new Object[]{browserComponent});
        }
        return browserComponent.node;
    }

    public static /* synthetic */ boolean r(BrowserComponent browserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2c72997", new Object[]{browserComponent})).booleanValue();
        }
        return browserComponent.e;
    }

    public static /* synthetic */ boolean s(BrowserComponent browserComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c762227", new Object[]{browserComponent, new Boolean(z)})).booleanValue();
        }
        browserComponent.e = z;
        return z;
    }

    public static /* synthetic */ long t(BrowserComponent browserComponent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa8db409", new Object[]{browserComponent, new Long(j)})).longValue();
        }
        browserComponent.doubleClickTimeStamp = j;
        return j;
    }

    public final void A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f18f92", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        n i0 = this.node.i0(i);
        if (i0 != null) {
            hashMap.put("type", "item");
            sendMessage(130, i0, "onwillappear", null, hashMap, null);
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7d13", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(this.b));
        n i0 = this.node.i0(this.b);
        if (i0 != null) {
            hashMap.put("type", "item");
            sendMessage(Component.MSG_FLAG_DISAPPEAR, i0, "onwilldisappear", null, hashMap, null);
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dee32fd1", new Object[]{this})).booleanValue();
        }
        return this.f12022a.l(this.node.d);
    }

    public void D(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff879b6c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        e eVar = this.f;
        eVar.f12031a |= i;
        if ((1 & i) != 0) {
            if (eVar.b == -1) {
                eVar.b = i2;
            }
        } else if ((2 & i) != 0) {
            if (eVar.c == -1) {
                eVar.c = i2;
            }
        } else if ((i & 4) != 0) {
            ((HashSet) eVar.d).add(Integer.valueOf(i2));
        }
    }

    public final void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c4b5d6", new Object[]{this, new Boolean(z)});
        } else if (((BrowserViewPager) this.view).getAdapter() == null) {
            ((BrowserViewPager) this.view).setAdapter(this.f12022a);
            f fVar = (f) this.viewParams;
            ((BrowserViewPager) this.view).setCurrentItem(fVar.I0, fVar.T0);
            n i0 = this.node.i0(((f) this.viewParams).I0);
            if (i0 != null) {
                BrowserAdapter.h(this.f12022a, (ViewGroup) this.view, null, i0);
            }
        } else {
            n i02 = this.node.i0(((BrowserViewPager) this.view).getCurrentItem());
            if (i02 != null) {
                boolean D0 = i02.D0();
                if (D0) {
                    i02.M0(i02.Y().S().f27261a, i02.Y().S().b);
                }
                if (!i02.A0() || D0 || i02.F0()) {
                    i02.b1(((BrowserViewPager) this.view).getContext());
                }
            }
            if (z) {
                f fVar2 = (f) this.viewParams;
                ((BrowserViewPager) this.view).setCurrentItem(fVar2.I0, fVar2.T0);
            }
        }
    }

    public void addScrollStateListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3bab80f", new Object[]{this, scrollChangeListener});
        } else if (!((ArrayList) this.g).contains(scrollChangeListener)) {
            ((ArrayList) this.g).add(scrollChangeListener);
        }
    }

    @Override // tb.sxo
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue();
        }
        return this.node.k0();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(n nVar, int i, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c190288e", new Object[]{this, nVar, new Integer(i), nVar2});
            return;
        }
        super.handleChildAdded(nVar, i, nVar2);
        D(1, i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(n nVar, int i, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2e1a55", new Object[]{this, nVar, new Integer(i), nVar2});
            return;
        }
        super.handleChildDeleted(nVar, i, nVar2);
        D(2, i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(n nVar, int i, int i2, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d053a6", new Object[]{this, nVar, new Integer(i), new Integer(i2), nVar2});
            return;
        }
        super.handleChildMoved(nVar, i, i2, nVar2);
        D(8, i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void notifyScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7722bf83", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            ((ScrollChangeListener) it.next()).onScrollStateChanged(i, 0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        B();
        sendSelectedMessage(i);
        nwv.y0(new a(i));
        this.b = i;
        this.c = System.currentTimeMillis();
    }

    public void removeScrollStateListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e645988c", new Object[]{this, scrollChangeListener});
        } else {
            ((ArrayList) this.g).remove(scrollChangeListener);
        }
    }

    @Override // tb.sxo
    public void scrollBy(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // tb.sxo
    public void scrollTo(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // tb.sxo
    public void scrollToPosition(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            scrollToPositionWithNumber(i, z, i2, 0);
        }
    }

    @Override // tb.sxo
    public void scrollToPositionWithNumber(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            ((BrowserViewPager) v).setCurrentItem(i, z);
        }
    }

    public final void sendSelectedMessage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268d9198", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("oldIndex", Integer.valueOf(this.b));
        hashMap.put("newIndex", Integer.valueOf(i));
        hashMap.put("pageHeight", Integer.valueOf(this.measureResult.b));
        hashMap.put("group", ((f) this.viewParams).J0);
        if ("browserex".equals(this.name)) {
            sendMessage(getNode(), "onpageselected", null, hashMap, null);
        } else {
            sendMessage(getNode(), "onbrowserselected", null, hashMap, null);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, tb.w91
    public boolean sendViewAppearForAdd(n nVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a1a1f5", new Object[]{this, nVar})).booleanValue();
        }
        n nVar2 = this.node;
        V v = this.view;
        if (v != 0) {
            i = ((BrowserViewPager) v).getCurrentItem();
        } else {
            i = 0;
        }
        if (nVar == nVar2.i0(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public void applyAttrForView(BrowserViewPager browserViewPager, f fVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e62d46", new Object[]{this, browserViewPager, fVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(browserViewPager, fVar, map, z);
        ((BrowserViewPager) this.view).setEdgePan(((f) this.viewParams).R0);
        ((BrowserViewPager) this.view).setEnableSwipe(((f) this.viewParams).S0);
        E(C());
        this.f.b();
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81535092", new Object[]{this})).booleanValue();
        }
        if (((BrowserViewPager) this.view).getCurrentItem() != 0 || ((f) this.viewParams).L0 <= 0 || System.currentTimeMillis() - this.c >= ((f) this.viewParams).L0) {
            return false;
        }
        return true;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35fb7ad1", new Object[]{this})).booleanValue();
        }
        if (((BrowserViewPager) this.view).getCurrentItem() != ((ArrayList) this.node.d).size() - 1) {
            return false;
        }
        long max = Math.max(this.d, this.c);
        if (((f) this.viewParams).K0 <= 0 || System.currentTimeMillis() - max >= ((f) this.viewParams).K0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public f generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2891a868", new Object[]{this});
        }
        return new f();
    }

    public n y() {
        int currentItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("1e22d9ee", new Object[]{this});
        }
        V v = this.view;
        if (v == 0 || (currentItem = ((BrowserViewPager) v).getCurrentItem()) < 0 || currentItem >= ((ArrayList) this.node.d).size()) {
            return null;
        }
        return (n) ((ArrayList) this.node.d).get(currentItem);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class BrowserAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12023a = 0;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12024a;

            public a(int i) {
                this.f12024a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BrowserComponent.h(BrowserComponent.this, this.f12024a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b extends GestureDetector.SimpleOnGestureListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ n f12025a;

            public b(n nVar) {
                this.f12025a = nVar;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/BrowserComponent$BrowserAdapter$2");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("886c5d07", new Object[]{this, motionEvent})).booleanValue();
                }
                if (BrowserAdapter.i(BrowserAdapter.this, this.f12025a, 2) != null) {
                    return true;
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
                }
                if (BrowserComponent.j(BrowserComponent.this) != null) {
                    return true;
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                String I;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    return;
                }
                n i = BrowserAdapter.i(BrowserAdapter.this, this.f12025a, 1);
                if (i != null && (I = nwv.I(i.H("onlongpress"), null)) != null) {
                    BrowserComponent.this.sendMessage(i, "onlongpress", I, null, null);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                n i = BrowserAdapter.i(BrowserAdapter.this, this.f12025a, 2);
                if (i != null) {
                    String I = nwv.I(i.H("ondblclick"), null);
                    if (I != null) {
                        BrowserComponent.this.sendMessage(i, "ondblclick", I, null, null);
                    }
                    BrowserComponent.t(BrowserComponent.this, System.currentTimeMillis());
                }
                return i != null;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                }
                n i = BrowserAdapter.i(BrowserAdapter.this, this.f12025a, 0);
                if (i != null && System.currentTimeMillis() - BrowserComponent.i(BrowserComponent.this) > ViewConfiguration.getDoubleTapTimeout() * 2) {
                    if (i.H("trackinfo") != null) {
                        BrowserComponent.this.sendMessage(i, "click", null, null, null);
                    }
                    String I = nwv.I(i.H("onclick"), null);
                    if (I != null) {
                        BrowserComponent.this.sendMessage(i, "onclick", I, null, null);
                    }
                }
                return i != null;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class c implements View.OnTouchListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GestureDetector f12026a;

            public c(BrowserAdapter browserAdapter, GestureDetector gestureDetector) {
                this.f12026a = gestureDetector;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                return this.f12026a.onTouchEvent(motionEvent);
            }
        }

        static {
            t2o.a(503316696);
        }

        public BrowserAdapter() {
        }

        public static /* synthetic */ void h(BrowserAdapter browserAdapter, ViewGroup viewGroup, ViewGroup viewGroup2, n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aae68828", new Object[]{browserAdapter, viewGroup, viewGroup2, nVar});
            } else {
                browserAdapter.k(viewGroup, viewGroup2, nVar);
            }
        }

        public static /* synthetic */ n i(BrowserAdapter browserAdapter, n nVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("45c49ee6", new Object[]{browserAdapter, nVar, new Integer(i)});
            }
            return browserAdapter.j(nVar, i);
        }

        public static /* synthetic */ Object ipc$super(BrowserAdapter browserAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/BrowserComponent$BrowserAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            View view = (View) obj;
            viewGroup.removeView(view);
            if (view.getTag() instanceof n) {
                view.setTag(null);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (BrowserComponent.n(BrowserComponent.this).d == null) {
                return 0;
            }
            return ((ArrayList) BrowserComponent.o(BrowserComponent.this).d).size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            viewGroup.addView(frameLayout);
            n i0 = BrowserComponent.q(BrowserComponent.this).i0(i);
            if (i0 != null) {
                k(viewGroup, frameLayout, i0);
                frameLayout.setTag(i0);
                if (i == BrowserComponent.this.getView().getCurrentItem() && !BrowserComponent.r(BrowserComponent.this)) {
                    BrowserComponent.s(BrowserComponent.this, true);
                    nwv.y0(new a(i));
                }
                if (i0.w0() != null && !i0.K().hasComponentClickTouchListener()) {
                    frameLayout.setOnTouchListener(new c(this, new GestureDetector(frameLayout.getContext(), new b(i0))));
                }
            }
            return frameLayout;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }

        public final void k(ViewGroup viewGroup, ViewGroup viewGroup2, n nVar) {
            ViewGroup viewGroup3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8bc687", new Object[]{this, viewGroup, viewGroup2, nVar});
                return;
            }
            boolean D0 = nVar.D0();
            if (D0) {
                nVar.M0(BrowserComponent.k(BrowserComponent.this).S().f27261a, BrowserComponent.l(BrowserComponent.this).S().b);
            }
            if (!nVar.A0() || D0 || nVar.F0()) {
                nVar.b1(viewGroup.getContext());
            }
            if (viewGroup2 != null && viewGroup2 != (viewGroup3 = (ViewGroup) nVar.w0().getParent())) {
                viewGroup2.removeAllViews();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(nVar.w0());
                }
                viewGroup2.addView(nVar.w0());
            }
        }

        public boolean l(List<n> list) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba1ea0fa", new Object[]{this, list})).booleanValue();
            }
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            boolean a2 = BrowserComponent.m(BrowserComponent.this).a();
            if (i == this.f12023a && !a2) {
                return false;
            }
            this.f12023a = i;
            notifyDataSetChanged();
            return true;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            n i0 = BrowserComponent.p(BrowserComponent.this).i0(i);
            if (i0 != null) {
                k(viewGroup, (ViewGroup) obj, i0);
            }
        }

        public final n j(n nVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("3bd07ccf", new Object[]{this, nVar, new Integer(i)});
            }
            while (true) {
                nVar = nVar.Y();
                if (nVar == null) {
                    return null;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2 && nVar.H("ondblclick") != null) {
                            return nVar;
                        }
                    } else if (nVar.H("onlongpress") != null) {
                        return nVar;
                    }
                } else if (nVar.H("onclick") != null) {
                    return nVar;
                }
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar.d.equals("onwillappear")) {
            n i0 = this.node.i0(((BrowserViewPager) this.view).getCurrentItem());
            if (i0 != null) {
                if (i0.A0()) {
                    sendMessage(130, i0, gVar.d, null, gVar.e, null);
                } else {
                    nwv.y0(new c(i0, gVar));
                }
            }
            return false;
        } else if (!gVar.d.equals("onwilldisappear")) {
            return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
        } else {
            n i02 = this.node.i0(((BrowserViewPager) this.view).getCurrentItem());
            if (i02 != null) {
                if (i02.A0()) {
                    sendMessage(Component.MSG_FLAG_DISAPPEAR, i02, gVar.d, null, gVar.e, null);
                } else {
                    nwv.y0(new d(i02, gVar));
                }
            }
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        postMessage(this.node, "onscrollstatechanged", ((f) this.viewParams).N0, hashMap, null);
        if (i == 0) {
            if (((f) this.viewParams).P0 != null) {
                postMessage(this.node, "onenddragging", null, null, null);
            }
        } else if (i == 1 && ((f) this.viewParams).O0 != null) {
            postMessage(this.node, "onbegindragging", null, null, null);
        }
        notifyScrollStateChanged(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        BrowserAdapter browserAdapter = this.f12022a;
        if (browserAdapter != null) {
            browserAdapter.l(null);
        }
        V v = this.view;
        if (v != 0) {
            ((BrowserViewPager) v).setAdapter(null);
            ((BrowserViewPager) this.view).removeOnPageChangeListener(this);
            ut2.C((BrowserViewPager) this.view);
        }
        o.t T = this.node.T();
        if (T != null) {
            T.a("onpageselected", this);
        }
        super.detach(z);
        if (this.node.d != null) {
            for (int i = 0; i < ((ArrayList) this.node.d).size(); i++) {
                ((n) ((ArrayList) this.node.d).get(i)).n(z);
            }
        }
    }

    /* renamed from: z */
    public BrowserViewPager onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserViewPager) ipChange.ipc$dispatch("5ffe29a1", new Object[]{this, context});
        }
        BrowserViewPager m = ut2.m(context);
        m.addOnPageChangeListener(this);
        if ("preload".equals(((f) this.viewParams).M0)) {
            m.setOffscreenPageLimit(2);
        } else {
            m.setOffscreenPageLimit(1);
        }
        this.f12022a = new BrowserAdapter();
        this.d = System.currentTimeMillis();
        if (((f) this.viewParams).Q0) {
            m.enableEdgeEffect();
        }
        o.t T = this.node.T();
        if (T != null) {
            T.b("onpageselected", this);
        }
        return m;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(d.j jVar, String str, JSONObject jSONObject, d.k kVar) {
        int i = 2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f789b95", new Object[]{this, jVar, str, jSONObject, kVar})).booleanValue();
        }
        str.hashCode();
        if (!str.equals("scrollToPosition")) {
            z = false;
        } else {
            int t = nwv.t(jSONObject.get("index"), -1);
            int t2 = nwv.t(jSONObject.get("jumpNumber"), 0);
            boolean o = nwv.o(jSONObject.get("animated"), true);
            String I = nwv.I(jSONObject.get("position"), "none");
            if ("middle".equals(I)) {
                i = 1;
            } else if (!"bottom".equals(I)) {
                i = 0;
            }
            scrollToPositionWithNumber(t, o, i, t2);
        }
        return !z ? super.invoke(jVar, str, jSONObject, kVar) : z;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f extends ScrollViewComponent.n {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MODE_FAST = "fast";
        public static final String MODE_NONE = "none";
        public static final String MODE_PRELOAD = "preload";
        public String[] J0;
        public int K0;
        public int L0;
        public String N0;
        public String O0;
        public String P0;
        public int I0 = 0;
        public String M0 = "preload";
        public boolean Q0 = true;
        public int R0 = 0;
        public boolean S0 = true;
        public boolean T0 = true;

        static {
            t2o.a(503316701);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/BrowserComponent$ViewPagerParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
            if (r9.equals("onbegindragging") == false) goto L_0x0027;
         */
        @Override // com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.n, tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.BrowserComponent.f.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        n i0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        if (str.equals("onpageappear") || str.equals("onwillappear") || str.equals("onpagedisappear") || str.equals("onwilldisappear")) {
            V v = this.view;
            if (!(v == 0 || (i0 = nVar2.i0(((BrowserViewPager) v).getCurrentItem())) == null)) {
                if (i0.A0()) {
                    sendMessage(34, i0, str, null, map, null);
                } else {
                    nwv.y0(new b(i0, str, map));
                }
            }
            return !str.equals("onwilldisappear") && !str.equals("onwillappear");
        }
        if (str.equals("onpageselected") && ir2.b(nwv.J(map.get("group"), null), ((f) this.viewParams).J0) && nVar != getNode()) {
            int intValue = ((Integer) map.get("newIndex")).intValue();
            V v2 = this.view;
            if (v2 != 0) {
                ((BrowserViewPager) v2).setCurrentItem(intValue, ((f) this.viewParams).T0);
            }
        }
        return false;
    }
}
