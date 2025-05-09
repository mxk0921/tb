package com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class StackLayoutManager extends RecyclerView.LayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f7491a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum ScrollOrientation {
        RIGHT,
        LEFT,
        BOTTOM,
        TOP,
        NONE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ScrollOrientation scrollOrientation, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/stacklayoutmanager/StackLayoutManager$ScrollOrientation");
        }

        public static ScrollOrientation valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScrollOrientation) ipChange.ipc$dispatch("44f85814", new Object[]{str});
            }
            return (ScrollOrientation) Enum.valueOf(ScrollOrientation.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation;

        static {
            int[] iArr = new int[ScrollOrientation.values().length];
            $SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation = iArr;
            try {
                iArr[ScrollOrientation.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation[ScrollOrientation.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation[ScrollOrientation.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation[ScrollOrientation.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(444597609);
    }

    public static /* synthetic */ ScrollOrientation A(StackLayoutManager stackLayoutManager, ScrollOrientation scrollOrientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollOrientation) ipChange.ipc$dispatch("4e97ff37", new Object[]{stackLayoutManager, scrollOrientation});
        }
        stackLayoutManager.getClass();
        return scrollOrientation;
    }

    public static /* synthetic */ int B(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74417ec3", new Object[]{stackLayoutManager})).intValue();
        }
        return stackLayoutManager.f7491a;
    }

    public static /* synthetic */ boolean C(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac3259f3", new Object[]{stackLayoutManager})).booleanValue();
        }
        return stackLayoutManager.b;
    }

    public static /* synthetic */ boolean D(StackLayoutManager stackLayoutManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac2920cb", new Object[]{stackLayoutManager, new Boolean(z)})).booleanValue();
        }
        stackLayoutManager.b = z;
        return z;
    }

    public static /* synthetic */ void E(StackLayoutManager stackLayoutManager, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d32a9", new Object[]{stackLayoutManager, recyclerView});
        } else {
            stackLayoutManager.H(recyclerView);
        }
    }

    public static /* synthetic */ int F(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c141020", new Object[]{stackLayoutManager})).intValue();
        }
        return stackLayoutManager.J();
    }

    public static /* synthetic */ void G(StackLayoutManager stackLayoutManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c98f137", new Object[]{stackLayoutManager, new Integer(i)});
        } else {
            stackLayoutManager.S(i);
        }
    }

    public static /* synthetic */ Object ipc$super(StackLayoutManager stackLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1468828374) {
            super.smoothScrollToPosition((RecyclerView) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1242672066) {
            super.onAttachedToWindow((RecyclerView) objArr[0]);
            return null;
        } else if (hashCode == 1604649632) {
            super.requestLayout();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/recycler/stacklayoutmanager/StackLayoutManager");
        }
    }

    public static /* synthetic */ boolean y(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc6eed77", new Object[]{stackLayoutManager})).booleanValue();
        }
        stackLayoutManager.getClass();
        return false;
    }

    public static /* synthetic */ ScrollOrientation z(StackLayoutManager stackLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollOrientation) ipChange.ipc$dispatch("4bea306d", new Object[]{stackLayoutManager});
        }
        stackLayoutManager.getClass();
        return null;
    }

    public final void H(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a350386", new Object[]{this, recyclerView});
        }
    }

    public float I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c56e0e0", new Object[]{this})).floatValue();
        }
        if (getWidth() == 0 || getHeight() == 0) {
            return 0.0f;
        }
        int[] iArr = a.$SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation;
        throw null;
    }

    public final int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2605220e", new Object[]{this})).intValue();
        }
        if (getWidth() == 0 || getHeight() == 0) {
            return 0;
        }
        int[] iArr = a.$SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation;
        throw null;
    }

    public final int K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9f96bbc", new Object[]{this})).intValue();
        }
        return Math.min(J(), getItemCount() - 1);
    }

    public final int L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("104bc67d", new Object[]{this, new Integer(i)})).intValue();
        }
        int[] iArr = a.$SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation;
        throw null;
    }

    public final int M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("788fe876", new Object[]{this, new Integer(i)})).intValue();
        }
        int[] iArr = a.$SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation;
        throw null;
    }

    public final int N(int i, RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d6a6f19", new Object[]{this, new Integer(i), recycler})).intValue();
        }
        int i2 = this.f7491a + i;
        int M = M(i2);
        this.f7491a = M;
        int i3 = (M - i2) + i;
        if (i3 == 0) {
            return 0;
        }
        detachAndScrapAttachedViews(recycler);
        O(recycler);
        return i3;
    }

    public final void O(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe06dafb", new Object[]{this, recycler});
            return;
        }
        int J = J();
        int min = Math.min(K(), getItemCount() - 1);
        I();
        for (int i = min; i >= J; i--) {
            View viewForPosition = recycler.getViewForPosition(i);
            if (viewForPosition != null) {
                addView(viewForPosition);
                measureChild(viewForPosition, 0, 0);
                throw null;
            }
        }
        int i2 = J - 1;
        if (i2 >= 0) {
            P(recycler, recycler.getViewForPosition(i2));
        }
        int i3 = min + 1;
        if (i3 < getItemCount()) {
            P(recycler, recycler.getViewForPosition(i3));
        }
    }

    public final void P(RecyclerView.Recycler recycler, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6b1ee9", new Object[]{this, recycler, view});
        } else if (view != null) {
            Q(view);
            removeAndRecycleView(view, recycler);
        }
    }

    public final void Q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e350b609", new Object[]{this, view});
            return;
        }
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    public final void R(int i, RecyclerView recyclerView, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17765215", new Object[]{this, new Integer(i), recyclerView, bool});
            return;
        }
        L(i);
        int[] iArr = a.$SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation;
        throw null;
    }

    public final void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece3aa3f", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        if (ScrollOrientation.RIGHT == null || ScrollOrientation.LEFT == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (ScrollOrientation.BOTTOM == null || ScrollOrientation.TOP == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutParams) ipChange.ipc$dispatch("1f17b458", new Object[]{this});
        }
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a11abc2", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToWindow(recyclerView);
        recyclerView.setOnFlingListener(new RecyclerView.OnFlingListener() { // from class: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/stacklayoutmanager/StackLayoutManager$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
            public boolean onFling(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("8af30028", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (StackLayoutManager.y(StackLayoutManager.this)) {
                    int i3 = a.$SwitchMap$com$taobao$android$dinamicx$widget$recycler$stacklayoutmanager$StackLayoutManager$ScrollOrientation[StackLayoutManager.z(StackLayoutManager.this).ordinal()];
                    if (i3 == 1 || i3 == 3) {
                        if (i > 0) {
                            StackLayoutManager.A(StackLayoutManager.this, ScrollOrientation.LEFT);
                        } else if (i < 0) {
                            StackLayoutManager.A(StackLayoutManager.this, ScrollOrientation.RIGHT);
                        } else {
                            StackLayoutManager.A(StackLayoutManager.this, ScrollOrientation.NONE);
                        }
                        if (StackLayoutManager.B(StackLayoutManager.this) >= 1 && StackLayoutManager.B(StackLayoutManager.this) < StackLayoutManager.this.getWidth() * (StackLayoutManager.this.getItemCount() - 1)) {
                            StackLayoutManager.D(StackLayoutManager.this, true);
                        }
                    } else {
                        if (i2 > 0) {
                            StackLayoutManager.A(StackLayoutManager.this, ScrollOrientation.TOP);
                        } else if (i2 < 0) {
                            StackLayoutManager.A(StackLayoutManager.this, ScrollOrientation.BOTTOM);
                        } else {
                            StackLayoutManager.A(StackLayoutManager.this, ScrollOrientation.NONE);
                        }
                        if (StackLayoutManager.B(StackLayoutManager.this) >= 1 && StackLayoutManager.B(StackLayoutManager.this) < StackLayoutManager.this.getHeight() * (StackLayoutManager.this.getItemCount() - 1)) {
                            StackLayoutManager.D(StackLayoutManager.this, true);
                        }
                    }
                    StackLayoutManager.E(StackLayoutManager.this, recyclerView);
                }
                return StackLayoutManager.y(StackLayoutManager.this);
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/stacklayoutmanager/StackLayoutManager$2");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                int i2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                if (i == 0) {
                    StackLayoutManager stackLayoutManager = StackLayoutManager.this;
                    if (stackLayoutManager.getItemCount() > 0) {
                        i2 = StackLayoutManager.F(StackLayoutManager.this) % StackLayoutManager.this.getItemCount();
                    } else {
                        i2 = StackLayoutManager.F(StackLayoutManager.this);
                    }
                    StackLayoutManager.G(stackLayoutManager, i2);
                    if (!StackLayoutManager.C(StackLayoutManager.this)) {
                        StackLayoutManager.D(StackLayoutManager.this, true);
                        StackLayoutManager.E(StackLayoutManager.this, recyclerView);
                        return;
                    }
                    StackLayoutManager.D(StackLayoutManager.this, false);
                } else if (i == 1) {
                    StackLayoutManager.D(StackLayoutManager.this, false);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else {
            super.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3806060", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        return N(i, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= getItemCount()) {
            throw new ArrayIndexOutOfBoundsException("$position is out of bound [0..$itemCount-1]");
        } else {
            this.b = true;
            this.f7491a = L(i);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        return N(i, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        super.smoothScrollToPosition(recyclerView, state, i);
        if (i < 0 || i >= getItemCount()) {
            throw new ArrayIndexOutOfBoundsException("$position is out of bound [0..$itemCount-1]");
        }
        this.b = true;
        R(i, recyclerView, Boolean.TRUE);
    }
}
