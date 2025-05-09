package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailVerticalRecyclerView.c f17105a;
    public final dh7 b;
    public final cxj c;
    public bjw d;

    static {
        t2o.a(352321970);
    }

    public cjw(dh7 dh7Var, cxj cxjVar) {
        this.b = dh7Var;
        this.c = cxjVar;
    }

    public static /* synthetic */ cxj a(cjw cjwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("17a8193c", new Object[]{cjwVar});
        }
        return cjwVar.c;
    }

    public static /* synthetic */ dh7 b(cjw cjwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("87957c79", new Object[]{cjwVar});
        }
        return cjwVar.b;
    }

    public static /* synthetic */ bjw c(cjw cjwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjw) ipChange.ipc$dispatch("dfb382e7", new Object[]{cjwVar});
        }
        return cjwVar.d;
    }

    public static /* synthetic */ void d(cjw cjwVar, RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31975c8", new Object[]{cjwVar, viewHolder, new Boolean(z)});
        } else {
            cjwVar.g(viewHolder, z);
        }
    }

    public static /* synthetic */ void e(cjw cjwVar, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2066cf3", new Object[]{cjwVar, recyclerView, new Integer(i)});
        } else {
            cjwVar.f(recyclerView, i);
        }
    }

    public final void g(RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61124042", new Object[]{this, viewHolder, new Boolean(z)});
        } else if (viewHolder instanceof VerticalAbsViewHolder) {
            VerticalAbsViewHolder verticalAbsViewHolder = (VerticalAbsViewHolder) viewHolder;
            if (this.d.c() != viewHolder) {
                this.d.h(verticalAbsViewHolder);
            }
            if (z) {
                verticalAbsViewHolder.f1();
            } else {
                verticalAbsViewHolder.g1();
            }
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe9cab2", new Object[]{this, str});
            return;
        }
        txj.e("VisibilityHandler", "生命周期，processVisibility，cardType:" + str);
        this.d = new bjw();
        i();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977fc05b", new Object[]{this});
        } else if (this.f17105a == null) {
            a aVar = new a();
            this.f17105a = aVar;
            this.b.p(aVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends com.taobao.android.detail2.core.framework.view.feeds.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17106a;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/visibility/VisibilityHandler$1");
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void a(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b2f49e4", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else if (!cjw.a(cjw.this).r() || !cjw.a(cjw.this).j().N().g0() || !cjw.b(cjw.this).r0()) {
                this.f17106a = i2;
                if (recyclerView.getScrollState() == 1 && i2 != 0) {
                    cjw.e(cjw.this, recyclerView, i2);
                    cjw.c(cjw.this).g(true);
                }
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb463c7", new Object[]{this, str});
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            } else if ((!cjw.a(cjw.this).r() || !cjw.a(cjw.this).j().N().g0() || !cjw.b(cjw.this).r0()) && i == 2) {
                txj.e("VisibilityHandler", "生命周期，用户松手,recyclerViewDy:" + this.f17106a);
                if (cjw.c(cjw.this) != null) {
                    if (this.f17106a < 0 && cjw.c(cjw.this).c() != null) {
                        cjw cjwVar = cjw.this;
                        cjw.d(cjwVar, cjw.c(cjwVar).c(), false);
                    }
                    cjw.c(cjw.this).a();
                }
                this.f17106a = 0;
            }
        }
    }

    public final void f(RecyclerView recyclerView, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1849ce50", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                if (TextUtils.equals(this.d.d(), "none")) {
                    if (i > 0) {
                        str = "up";
                    } else {
                        str = "down";
                    }
                    this.d.i(str);
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int i2 = TextUtils.equals(str, "up") ? findFirstVisibleItemPosition : findLastVisibleItemPosition;
                    this.d.f(i2);
                    txj.e("VisibilityHandler", "生命周期，mCurrentPosition初始化:" + i2 + "，lastVisibleItemPosition：" + findLastVisibleItemPosition + "，firstVisibleItemPosition：" + findFirstVisibleItemPosition + ",mStartUp:" + str);
                }
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.d.b());
                if (findViewHolderForAdapterPosition == null) {
                    txj.e("VisibilityHandler", "生命周期，currentViewHolder为null，" + this.d.b());
                    return;
                }
                View view = findViewHolderForAdapterPosition.itemView;
                boolean z = view.getBottom() > 1 && view.getBottom() < recyclerView.getHeight();
                boolean z2 = view.getTop() - 1 > 0 && view.getTop() < recyclerView.getHeight();
                txj.e("VisibilityHandler", "生命周期，区域，top:" + view.getTop() + "，bottom:" + view.getBottom() + ",height:" + recyclerView.getHeight());
                if (z) {
                    txj.e("VisibilityHandler", "生命周期，上滑未离屏:");
                    this.d.j(linearLayoutManager.findLastVisibleItemPosition());
                } else if (z2) {
                    txj.e("VisibilityHandler", "生命周期，下滑未离屏:");
                    this.d.j(linearLayoutManager.findFirstVisibleItemPosition());
                } else {
                    this.d.i("none");
                    txj.e("VisibilityHandler", "生命周期，离屏更换当前position:" + this.d.b());
                    if (this.d.c() != null) {
                        g(this.d.c(), false);
                        return;
                    }
                }
                if (this.d.e() >= 0 && this.d.e() < linearLayoutManager.getItemCount()) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(this.d.e());
                    if (findViewHolderForAdapterPosition2 == null) {
                        txj.e("VisibilityHandler", "生命周期，willDisplayViewHolder为null，" + this.d.e());
                        return;
                    }
                    txj.e("VisibilityHandler", "生命周期，mVisibilityData:" + this.d.toString() + ",isNextItemPartiallyVisible:" + z + ",isPreItemPartiallyVisible:" + z2 + ",willDisplayViewHolder:" + findViewHolderForAdapterPosition2);
                    g(findViewHolderForAdapterPosition2, true);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
