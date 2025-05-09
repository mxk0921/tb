package com.taobao.tao.recommend4.recyclerview.notify.sub.nativeconatiner;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import tb.bqa;
import tb.t2o;
import tb.z4a;
import tb.zpk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NativeCompleteVisibleStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HomeChildRecyclerView f12723a;
    public RecyclerView.OnScrollListener b;
    public HomeChildRecyclerView.a c;
    public String d = "notALlVisible";
    public final ViewPageTabChange e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements HomeChildRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeChildRecyclerView f12725a;
        public final /* synthetic */ zpk b;

        public a(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
            this.f12725a = homeChildRecyclerView;
            this.b = zpkVar;
        }

        @Override // com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.a
        public void onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            } else if (motionEvent.getAction() == 2) {
                NativeCompleteVisibleStatus nativeCompleteVisibleStatus = NativeCompleteVisibleStatus.this;
                NativeCompleteVisibleStatus.c(nativeCompleteVisibleStatus, NativeCompleteVisibleStatus.b(nativeCompleteVisibleStatus, this.f12725a), this.b);
            }
        }
    }

    static {
        t2o.a(729810078);
    }

    public NativeCompleteVisibleStatus(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar, z4a z4aVar) {
        this.f12723a = homeChildRecyclerView;
        l(homeChildRecyclerView, zpkVar);
        m(homeChildRecyclerView, zpkVar);
        if (j(z4aVar)) {
            this.e = new ViewPageTabChange(zpkVar, homeChildRecyclerView);
        }
    }

    public static /* synthetic */ HomeChildRecyclerView a(NativeCompleteVisibleStatus nativeCompleteVisibleStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeChildRecyclerView) ipChange.ipc$dispatch("5a5610e2", new Object[]{nativeCompleteVisibleStatus});
        }
        return nativeCompleteVisibleStatus.f12723a;
    }

    public static /* synthetic */ boolean b(NativeCompleteVisibleStatus nativeCompleteVisibleStatus, HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbdc39b", new Object[]{nativeCompleteVisibleStatus, homeChildRecyclerView})).booleanValue();
        }
        return nativeCompleteVisibleStatus.i(homeChildRecyclerView);
    }

    public static /* synthetic */ void c(NativeCompleteVisibleStatus nativeCompleteVisibleStatus, boolean z, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d2fc03", new Object[]{nativeCompleteVisibleStatus, new Boolean(z), zpkVar});
        } else {
            nativeCompleteVisibleStatus.k(z, zpkVar);
        }
    }

    public final HomeChildRecyclerView.a d(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeChildRecyclerView.a) ipChange.ipc$dispatch("984503b3", new Object[]{this, homeChildRecyclerView, zpkVar});
        }
        return new a(homeChildRecyclerView, zpkVar);
    }

    public final RecyclerView.OnScrollListener e(final zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("ded618ec", new Object[]{this, zpkVar});
        }
        return new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.recommend4.recyclerview.notify.sub.nativeconatiner.NativeCompleteVisibleStatus.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1177043419) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/recommend4/recyclerview/notify/sub/nativeconatiner/NativeCompleteVisibleStatus$1");
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
                if (i == 0) {
                    NativeCompleteVisibleStatus nativeCompleteVisibleStatus = NativeCompleteVisibleStatus.this;
                    NativeCompleteVisibleStatus.c(nativeCompleteVisibleStatus, NativeCompleteVisibleStatus.b(nativeCompleteVisibleStatus, NativeCompleteVisibleStatus.a(nativeCompleteVisibleStatus)), zpkVar);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                NativeCompleteVisibleStatus nativeCompleteVisibleStatus = NativeCompleteVisibleStatus.this;
                NativeCompleteVisibleStatus.c(nativeCompleteVisibleStatus, NativeCompleteVisibleStatus.b(nativeCompleteVisibleStatus, NativeCompleteVisibleStatus.a(nativeCompleteVisibleStatus)), zpkVar);
            }
        };
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        n(this.f12723a);
        o(this.f12723a);
        ViewPageTabChange viewPageTabChange = this.e;
        if (viewPageTabChange != null) {
            viewPageTabChange.d();
        }
    }

    public final int g(RecyclerView recyclerView) {
        int[] findLastVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d614315", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int i = -1;
            for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null)) {
                if (i2 >= 0 && (i == -1 || i < i2)) {
                    i = i2;
                }
            }
            return i;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            try {
                return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            } catch (Exception e) {
                bqa.d("NativeCompleteVisibleStatus", "RecommendViewExposureListener getLastVisiblePos exception:" + e.getMessage());
                return -1;
            }
        }
    }

    public final int h(HomeChildRecyclerView homeChildRecyclerView) {
        RecyclerView recyclerView;
        int g;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79af6a8f", new Object[]{this, homeChildRecyclerView})).intValue();
        }
        ViewParent parent = homeChildRecyclerView.getParent();
        if ((parent instanceof RecyclerView) && (g = g((recyclerView = (RecyclerView) parent))) == recyclerView.getAdapter().getItemCount() - 1 && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(g)) != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
            return recyclerView.getHeight() - view.getTop();
        }
        return -1;
    }

    public final boolean i(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca4e9c92", new Object[]{this, homeChildRecyclerView})).booleanValue();
        }
        int h = h(homeChildRecyclerView);
        ViewParent parent = homeChildRecyclerView.getParent();
        if ((parent instanceof RecyclerView) && h >= ((RecyclerView) parent).getHeight()) {
            return true;
        }
        return false;
    }

    public final void k(boolean z, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7986dc", new Object[]{this, new Boolean(z), zpkVar});
            return;
        }
        if (z && "notALlVisible".equals(this.d)) {
            zpkVar.b();
            this.d = "allVisible";
            bqa.d("NativeCompleteVisibleStatus", "通知是全屏展示了");
        }
        if (!z && "allVisible".equals(this.d)) {
            zpkVar.a();
            this.d = "notALlVisible";
            bqa.d("NativeCompleteVisibleStatus", "通知不是全屏展示了");
        }
    }

    public final void l(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7f1b16", new Object[]{this, homeChildRecyclerView, zpkVar});
        } else if (homeChildRecyclerView == null) {
            bqa.d("NativeCompleteVisibleStatus", "homeChildRecyclerView == null");
        } else {
            this.b = e(zpkVar);
            ViewParent parent = homeChildRecyclerView.getParent();
            if (parent instanceof RecyclerView) {
                ((RecyclerView) parent).addOnScrollListener(this.b);
            }
        }
    }

    public final void m(HomeChildRecyclerView homeChildRecyclerView, zpk zpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48abbf08", new Object[]{this, homeChildRecyclerView, zpkVar});
            return;
        }
        HomeChildRecyclerView.a d = d(homeChildRecyclerView, zpkVar);
        this.c = d;
        homeChildRecyclerView.addDispatchTouchEventListener(d);
    }

    public final void n(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11fafa46", new Object[]{this, homeChildRecyclerView});
        } else if (this.b == null) {
            bqa.d("NativeCompleteVisibleStatus", "mScrollListener == null");
        } else {
            ViewParent parent = homeChildRecyclerView.getParent();
            if (parent instanceof RecyclerView) {
                ((RecyclerView) parent).removeOnScrollListener(this.b);
            }
        }
    }

    public final void o(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cb7e94", new Object[]{this, homeChildRecyclerView});
        } else {
            homeChildRecyclerView.removeDispatchTouchEventListener(this.c);
        }
    }

    public final boolean j(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af62cdc6", new Object[]{this, z4aVar})).booleanValue();
        }
        bqa.d("NativeCompleteVisibleStatus", "当前的容器类型是：" + z4aVar.f());
        return z4aVar == z4a.REC_ORDER_LIST_CATAPULT || z4aVar == z4a.REC_ORDER_LIST;
    }
}
