package com.taobao.taolive.sdk.controller;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.state.State;
import tb.jae;
import tb.p1j;
import tb.pvs;
import tb.qvs;
import tb.t2o;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BaseListController implements jae {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int C0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13274a;
    public TaoLiveRecyclerView b;
    public TaoLiveLayoutManager c;
    public BaseListAdapter d;
    public int e;
    public int f;
    public boolean k;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public boolean l = true;
    public int m = 0;
    public boolean j = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else {
                BaseListController.this.e = i4 - i2;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements p1j.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25839977", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            BaseListController baseListController = BaseListController.this;
            if (!baseListController.k && i2 < -30 && !baseListController.b.canScrollVertically(1)) {
                BaseListController.this.p();
                BaseListController.this.k = true;
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4824f72", new Object[]{this});
            } else {
                BaseListController.this.k = false;
            }
        }
    }

    static {
        t2o.a(779093423);
        t2o.a(779093430);
        t2o.a(779093432);
    }

    public BaseListController(Context context) {
        this.f13274a = context;
    }

    public static /* synthetic */ void a(BaseListController baseListController, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ff6b15", new Object[]{baseListController, viewHolder});
        } else {
            baseListController.B(viewHolder);
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f = 0;
        this.C0 = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = false;
        this.l = true;
        TaoLiveLayoutManager taoLiveLayoutManager = this.c;
        if (taoLiveLayoutManager != null) {
            taoLiveLayoutManager.y(true);
        }
    }

    public final void B(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399e94ee", new Object[]{this, viewHolder});
            return;
        }
        if (qvs.u()) {
            this.d.a0(viewHolder, State.APPEARED);
        } else {
            this.d.b0(viewHolder, State.APPEARED);
        }
        TaoLiveLayoutManager taoLiveLayoutManager = this.c;
        if (taoLiveLayoutManager != null) {
            taoLiveLayoutManager.y(this.l);
        }
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeda1fb5", new Object[]{this});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794dc532", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b28a82b", new Object[]{this});
        }
    }

    public void l(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1ec26c", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        }
    }

    public void m(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fea474", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        }
    }

    public void n(TaoLiveRecyclerView taoLiveRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2a901e", new Object[]{this, taoLiveRecyclerView});
            return;
        }
        this.b = taoLiveRecyclerView;
        taoLiveRecyclerView.setHasFixedSize(true);
        TaoLiveLayoutManager taoLiveLayoutManager = new TaoLiveLayoutManager(this.f13274a, 1, false, this.b);
        this.c = taoLiveLayoutManager;
        this.b.setLayoutManager(taoLiveLayoutManager);
        if (pvs.R0()) {
            this.b.setOverScrollMode(2);
        }
        this.c.setItemPrefetchEnabled(false);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper() { // from class: com.taobao.taolive.sdk.controller.BaseListController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -1760828615) {
                    return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/controller/BaseListController$1");
            }

            @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
            public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (int[]) ipChange2.ipc$dispatch("970be339", new Object[]{this, layoutManager, view});
                }
                int[] calculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, view);
                if (calculateDistanceToFinalSnap != null) {
                    int i = calculateDistanceToFinalSnap[1];
                    if (i == 0 || BaseListController.this.d == null) {
                        if (i == 0) {
                            BaseListController baseListController = BaseListController.this;
                            if (baseListController.d != null) {
                                baseListController.C0 = 0;
                                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag(R.id.tblive_tag_key_holder);
                                x5t.h(BaseListAdapterV2.TAG, "******calculateDistanceToFinalSnap dis = 0 holder = " + viewHolder + "******");
                                BaseListController.this.h = viewHolder.getAdapterPosition();
                                BaseListController baseListController2 = BaseListController.this;
                                int i2 = baseListController2.h;
                                baseListController2.i = i2;
                                baseListController2.g = i2;
                                BaseListController.a(baseListController2, viewHolder);
                            }
                        }
                    } else if (pvs.e1()) {
                        StringBuilder sb = new StringBuilder("******calculateDistanceToFinalSnap dis != 0 holder = ");
                        int i3 = R.id.tblive_tag_key_holder;
                        sb.append(view.getTag(i3));
                        sb.append("******");
                        x5t.h(BaseListAdapterV2.TAG, sb.toString());
                        RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) view.getTag(i3);
                        if (viewHolder2 != null) {
                            BaseListController.this.d.O(viewHolder2);
                        }
                    }
                }
                return calculateDistanceToFinalSnap;
            }

            @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
            public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
                int i3;
                PointF computeScrollVectorForPosition;
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("bacfeb67", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
                }
                int itemCount = layoutManager.getItemCount();
                if (itemCount == 0 || (i3 = BaseListController.this.g) == -1) {
                    return -1;
                }
                if (!layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0) {
                    z = true;
                }
                if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null || (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f)) {
                    if (z) {
                        return i3 + 1;
                    }
                    return i3;
                } else if (z) {
                    return i3 - 1;
                } else {
                    return i3;
                }
            }
        };
        pagerSnapHelper.attachToRecyclerView(this.b);
        this.b.setItemAnimator(null);
        this.b.setSnapHelper(pagerSnapHelper);
        this.b.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.taolive.sdk.controller.BaseListController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/sdk/controller/BaseListController$2");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                BaseListAdapter baseListAdapter = BaseListController.this.d;
                if (baseListAdapter != null) {
                    baseListAdapter.S(i);
                }
                BaseListController.this.m = i;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                BaseListController baseListController = BaseListController.this;
                baseListController.f += i2;
                int i3 = baseListController.C0 + i2;
                baseListController.C0 = i3;
                if (i3 > pvs.S2() || BaseListController.this.C0 < (-pvs.T2())) {
                    BaseListController.this.f();
                }
                BaseListController baseListController2 = BaseListController.this;
                if (baseListController2.d == null) {
                    return;
                }
                if (baseListController2.j) {
                    baseListController2.j = false;
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager != null) {
                    BaseListController.this.g = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    BaseListController baseListController3 = BaseListController.this;
                    int i4 = baseListController3.g;
                    int i5 = baseListController3.h;
                    if (i4 > i5) {
                        baseListController3.m(false, i4, findLastVisibleItemPosition);
                        BaseListController baseListController4 = BaseListController.this;
                        baseListController4.h = baseListController4.g;
                        baseListController4.i = findLastVisibleItemPosition;
                    } else if (i4 < i5) {
                        baseListController3.l(true, i4, findLastVisibleItemPosition);
                    }
                    BaseListController baseListController5 = BaseListController.this;
                    int i6 = baseListController5.i;
                    if (findLastVisibleItemPosition < i6) {
                        baseListController5.m(true, baseListController5.g, findLastVisibleItemPosition);
                        BaseListController baseListController6 = BaseListController.this;
                        baseListController6.h = baseListController6.g;
                        baseListController6.i = findLastVisibleItemPosition;
                    } else if (findLastVisibleItemPosition > i6) {
                        baseListController5.l(false, baseListController5.g, findLastVisibleItemPosition);
                    }
                }
            }
        });
        this.b.addOnLayoutChangeListener(new a());
        this.b.setOnMoveListener(new b());
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d42326", new Object[]{this});
        }
    }

    public void q(RecyclerView.ViewHolder viewHolder) {
        TaoLiveRoomBaseVH taoLiveRoomBaseVH;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof TaoLiveRoomBaseVH) {
            x5t.h(BaseListAdapterV2.TAG, "******onViewAttachedToWindow holder = " + viewHolder + "******");
            int childCount = this.b.getChildCount();
            if (childCount != 1) {
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.b.getChildAt(i);
                    if (childAt != null) {
                        int i2 = R.id.tblive_tag_key_holder;
                        if ((childAt.getTag(i2) instanceof TaoLiveRoomBaseVH) && (taoLiveRoomBaseVH = (TaoLiveRoomBaseVH) childAt.getTag(i2)) != viewHolder) {
                            if (qvs.u()) {
                                this.d.a0(taoLiveRoomBaseVH, State.TRANSITION);
                            } else {
                                this.d.b0(taoLiveRoomBaseVH, State.TRANSITION);
                            }
                        }
                    }
                }
                if (qvs.u()) {
                    this.d.a0(viewHolder, State.TRANSITION);
                } else {
                    this.d.b0(viewHolder, State.TRANSITION);
                }
            } else if (qvs.u()) {
                this.d.a0(viewHolder, State.APPEARED);
            } else {
                this.d.b0(viewHolder, State.APPEARED);
            }
        }
    }

    public void w(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof TaoLiveRoomBaseVH) {
            x5t.h(BaseListAdapterV2.TAG, "******onViewDetachedFromWindow holder = " + viewHolder + "******");
            c();
            if (qvs.u()) {
                this.d.a0(viewHolder, State.INITIAL);
            } else {
                this.d.b0(viewHolder, State.INITIAL);
            }
        }
    }
}
