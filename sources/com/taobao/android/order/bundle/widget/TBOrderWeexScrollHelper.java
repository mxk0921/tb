package com.taobao.android.order.bundle.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.weex2.Weex2ContainerFrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.recycle.OrderLinearLayoutManager;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import java.util.List;
import java.util.Map;
import tb.dde;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderWeexScrollHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public OffsetBodyWrapper f9126a;
    public OrderRecyclerView b;
    public Weex2ContainerFrameLayout c;
    public MUSDKInstance d;
    public boolean e = true;
    public boolean f = true;
    public int g = 0;
    public RecyclerView.OnFlingListener h = new RecyclerView.OnFlingListener() { // from class: com.taobao.android.order.bundle.widget.TBOrderWeexScrollHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/TBOrderWeexScrollHelper$1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
        public boolean onFling(int i, int i2) {
            int i3;
            int i4;
            int i5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8af30028", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (TBOrderWeexScrollHelper.a(TBOrderWeexScrollHelper.this) == null) {
                i3 = 0;
            } else {
                i3 = TBOrderWeexScrollHelper.a(TBOrderWeexScrollHelper.this).computeVerticalScrollRange();
            }
            if (TBOrderWeexScrollHelper.a(TBOrderWeexScrollHelper.this) == null) {
                i4 = 0;
            } else {
                i4 = TBOrderWeexScrollHelper.a(TBOrderWeexScrollHelper.this).computeVerticalScrollOffset();
            }
            if (i2 > 0 && (i5 = i4 + i2) >= i3) {
                TBOrderWeexScrollHelper.c(TBOrderWeexScrollHelper.this, i5 - i3);
            }
            return false;
        }
    };
    public View.OnTouchListener i = new a();
    public RecyclerView.OnScrollListener j = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.order.bundle.widget.TBOrderWeexScrollHelper.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r5, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/widget/TBOrderWeexScrollHelper$3");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this) != null && i == 0) {
                TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this).updateViewport();
                if (TBOrderWeexScrollHelper.h(TBOrderWeexScrollHelper.this, 0)) {
                    TBOrderWeexScrollHelper.i(TBOrderWeexScrollHelper.this, true);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this) == null) {
                TBOrderWeexScrollHelper.j(TBOrderWeexScrollHelper.this);
            }
            boolean h = TBOrderWeexScrollHelper.h(TBOrderWeexScrollHelper.this, i2);
            if (h) {
                recyclerView.scrollBy(0, i2);
                TBOrderWeexScrollHelper.i(TBOrderWeexScrollHelper.this, true);
            } else {
                TBOrderWeexScrollHelper.i(TBOrderWeexScrollHelper.this, false);
            }
            if (i2 > 0 && h && TBOrderWeexScrollHelper.b(TBOrderWeexScrollHelper.this) > 0 && TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this) != null) {
                TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this).scrollToDecelerate((int) (TBOrderWeexScrollHelper.b(TBOrderWeexScrollHelper.this) * 0.5f));
                TBOrderWeexScrollHelper.c(TBOrderWeexScrollHelper.this, 0);
            }
        }
    };
    public dde k = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (!(motionEvent.getPointerCount() > 1 || TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this) == null || TBOrderWeexScrollHelper.e(TBOrderWeexScrollHelper.this) == null)) {
                if (motionEvent.getAction() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    TBOrderWeexScrollHelper.g(TBOrderWeexScrollHelper.this, true);
                }
                if (TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this).getRenderView() == null || !(TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this).getRenderView().getParent() instanceof View)) {
                    return true;
                }
                View view2 = (View) TBOrderWeexScrollHelper.d(TBOrderWeexScrollHelper.this).getRenderView().getParent();
                if (z) {
                    TBOrderWeexScrollHelper.g(TBOrderWeexScrollHelper.this, false);
                }
                if (TBOrderWeexScrollHelper.f(TBOrderWeexScrollHelper.this)) {
                    return true;
                }
                view2.onTouchEvent(motionEvent);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.dde
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
            } else if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        double doubleValue = ((Double) map.get("pixels")).doubleValue();
                        double doubleValue2 = ((Double) map.get("velocity")).doubleValue();
                        if (TextUtils.equals((String) map.get("axis"), "vertical")) {
                            if (doubleValue > vu3.b.GEO_NOT_SUPPORT) {
                                TBOrderWeexScrollHelper.i(TBOrderWeexScrollHelper.this, false);
                            }
                            if (doubleValue2 > 10.0d && TBOrderWeexScrollHelper.a(TBOrderWeexScrollHelper.this) != null) {
                                TBOrderWeexScrollHelper.a(TBOrderWeexScrollHelper.this).fling(0, ((int) doubleValue2) * (-2));
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            $SwitchMap$android$arch$lifecycle$Lifecycle$Event = iArr;
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(713031989);
    }

    public TBOrderWeexScrollHelper(OffsetBodyWrapper offsetBodyWrapper, OrderRecyclerView orderRecyclerView) {
        this.f9126a = offsetBodyWrapper;
        this.b = orderRecyclerView;
        m();
    }

    public static /* synthetic */ OrderRecyclerView a(TBOrderWeexScrollHelper tBOrderWeexScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderRecyclerView) ipChange.ipc$dispatch("6ab9f465", new Object[]{tBOrderWeexScrollHelper});
        }
        return tBOrderWeexScrollHelper.b;
    }

    public static /* synthetic */ int b(TBOrderWeexScrollHelper tBOrderWeexScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36b15250", new Object[]{tBOrderWeexScrollHelper})).intValue();
        }
        return tBOrderWeexScrollHelper.g;
    }

    public static /* synthetic */ int c(TBOrderWeexScrollHelper tBOrderWeexScrollHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("113a2d77", new Object[]{tBOrderWeexScrollHelper, new Integer(i)})).intValue();
        }
        tBOrderWeexScrollHelper.g = i;
        return i;
    }

    public static /* synthetic */ MUSDKInstance d(TBOrderWeexScrollHelper tBOrderWeexScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("8b15bf44", new Object[]{tBOrderWeexScrollHelper});
        }
        return tBOrderWeexScrollHelper.d;
    }

    public static /* synthetic */ Weex2ContainerFrameLayout e(TBOrderWeexScrollHelper tBOrderWeexScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Weex2ContainerFrameLayout) ipChange.ipc$dispatch("80e1c8bf", new Object[]{tBOrderWeexScrollHelper});
        }
        return tBOrderWeexScrollHelper.c;
    }

    public static /* synthetic */ boolean f(TBOrderWeexScrollHelper tBOrderWeexScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0346c24", new Object[]{tBOrderWeexScrollHelper})).booleanValue();
        }
        return tBOrderWeexScrollHelper.f;
    }

    public static /* synthetic */ boolean g(TBOrderWeexScrollHelper tBOrderWeexScrollHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("981a8bf6", new Object[]{tBOrderWeexScrollHelper, new Boolean(z)})).booleanValue();
        }
        tBOrderWeexScrollHelper.f = z;
        return z;
    }

    public static /* synthetic */ boolean h(TBOrderWeexScrollHelper tBOrderWeexScrollHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8a43fc6", new Object[]{tBOrderWeexScrollHelper, new Integer(i)})).booleanValue();
        }
        return tBOrderWeexScrollHelper.o(i);
    }

    public static /* synthetic */ void i(TBOrderWeexScrollHelper tBOrderWeexScrollHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aef3472", new Object[]{tBOrderWeexScrollHelper, new Boolean(z)});
        } else {
            tBOrderWeexScrollHelper.l(z);
        }
    }

    public static /* synthetic */ void j(TBOrderWeexScrollHelper tBOrderWeexScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b785e3", new Object[]{tBOrderWeexScrollHelper});
        } else {
            tBOrderWeexScrollHelper.n();
        }
    }

    public void k(Lifecycle.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14759ed", new Object[]{this, event});
        } else if (this.d != null) {
            int i = c.$SwitchMap$android$arch$lifecycle$Lifecycle$Event[event.ordinal()];
            if (i == 1) {
                this.d.onActivityStart();
            } else if (i == 2) {
                this.d.onActivityResume();
            } else if (i == 3) {
                this.d.onActivityPause();
            } else if (i == 4) {
                this.d.onActivityStop();
            }
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbe64b4", new Object[]{this, new Boolean(z)});
            return;
        }
        OrderRecyclerView orderRecyclerView = this.b;
        if (orderRecyclerView != null && (orderRecyclerView.getLayoutManager() instanceof OrderLinearLayoutManager) && this.d != null) {
            if ((!this.b.getLayoutManager().canScrollVertically()) != z || this.e) {
                this.e = false;
                OffsetBodyWrapper offsetBodyWrapper = this.f9126a;
                if (offsetBodyWrapper != null) {
                    offsetBodyWrapper.setInWeexContainer(z);
                }
                if (z) {
                    this.d.setScrollEnabled(true);
                    ((OrderLinearLayoutManager) this.b.getLayoutManager()).z(false);
                    return;
                }
                this.d.setScrollEnabled(false);
                ((OrderLinearLayoutManager) this.b.getLayoutManager()).z(true);
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a26a416", new Object[]{this});
            return;
        }
        this.b.registerOnFlingListener(this.h);
        this.b.registerOnTouchListener(this.i);
        this.b.addOnScrollListener(this.j);
    }

    public final boolean o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92dacef2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Weex2ContainerFrameLayout weex2ContainerFrameLayout = this.c;
        if (weex2ContainerFrameLayout == null || weex2ContainerFrameLayout.getTop() - i > 0) {
            return false;
        }
        return true;
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f9126a = null;
        OrderRecyclerView orderRecyclerView = this.b;
        if (orderRecyclerView != null) {
            orderRecyclerView.unregisterOnFlingListener();
            this.h = null;
            this.b.unregisterOnTouchListener();
            this.i = null;
            this.b.removeOnScrollListener(this.j);
            this.j = null;
            this.b.removeWeexContainer();
            this.b = null;
        }
        this.c = null;
        this.k = null;
        MUSDKInstance mUSDKInstance = this.d;
        if (mUSDKInstance != null && z) {
            mUSDKInstance.destroy();
        }
        this.d = null;
    }

    public final void n() {
        List<IDMComponent> data;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71354a6d", new Object[]{this});
            return;
        }
        OrderRecyclerView orderRecyclerView = this.b;
        if (!(orderRecyclerView == null || !(orderRecyclerView.getAdapter() instanceof FixedViewAdapter) || !(((FixedViewAdapter) this.b.getAdapter()).N() instanceof RecyclerViewAdapter) || (data = ((RecyclerViewAdapter) ((FixedViewAdapter) this.b.getAdapter()).N()).getData()) == null || data.isEmpty())) {
            for (int size = data.size() - 1; size >= 0; size--) {
                IDMComponent iDMComponent = data.get(size);
                if (!(iDMComponent == null || !iDMComponent.getContainerType().equals("weex2") || iDMComponent.getFields() == null || iDMComponent.getFields().getString("enableNestedScroll") == null || !"true".equalsIgnoreCase(iDMComponent.getFields().getString("enableNestedScroll")) || (findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(size)) == null)) {
                    View view = findViewHolderForAdapterPosition.itemView;
                    if (view instanceof Weex2ContainerFrameLayout) {
                        Weex2ContainerFrameLayout weex2ContainerFrameLayout = (Weex2ContainerFrameLayout) view;
                        this.c = weex2ContainerFrameLayout;
                        this.b.addWeexContainer(weex2ContainerFrameLayout);
                        MUSDKInstance mUSInstance = this.c.getMUSInstance();
                        this.d = mUSInstance;
                        if (mUSInstance != null) {
                            mUSInstance.setWeexScrollListener(this.k);
                        }
                    }
                }
            }
        }
    }
}
