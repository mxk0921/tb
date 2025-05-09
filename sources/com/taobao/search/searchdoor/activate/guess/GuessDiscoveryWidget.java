package com.taobao.search.searchdoor.activate.guess;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryWidget;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.BaseActivateCellViewHolder;
import tb.a07;
import tb.c2p;
import tb.c4p;
import tb.ckf;
import tb.lzn;
import tb.mzn;
import tb.phw;
import tb.rg3;
import tb.sma;
import tb.t2o;
import tb.ude;
import tb.vfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GuessDiscoveryWidget extends BaseActivateCellViewHolder<GuessDiscoveryCellBean, c2p> implements ude {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final rg3.b p = new rg3.b() { // from class: tb.y7z
        @Override // tb.ay4
        public final WidgetViewHolder a(rg3.c cVar) {
            WidgetViewHolder c2;
            c2 = GuessDiscoveryWidget.c(cVar);
            return c2;
        }
    };
    public phw<GuessDiscoveryCellBean, View, c2p> m;
    public GuessDiscoveryCellBean n;
    public boolean o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792975);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final rg3.b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rg3.b) ipChange.ipc$dispatch("7745c027", new Object[]{this});
            }
            return GuessDiscoveryWidget.I0();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11616a;

        public c(ViewGroup viewGroup) {
            this.f11616a = viewGroup;
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
                return;
            }
            ckf.g(view, "componentView");
            this.f11616a.removeAllViews();
            this.f11616a.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
                return;
            }
            ckf.g(view, "componentView");
            this.f11616a.removeView(view);
        }
    }

    static {
        t2o.a(815792974);
        t2o.a(993002008);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuessDiscoveryWidget(View view, Activity activity, ude udeVar, c2p c2pVar) {
        super(view, activity, udeVar, c2pVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
    }

    public static final /* synthetic */ rg3.b I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg3.b) ipChange.ipc$dispatch("a41ec68c", new Object[0]);
        }
        return p;
    }

    public static final WidgetViewHolder c(rg3.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("8ba0bc10", new Object[]{cVar});
        }
        FrameLayout frameLayout = new FrameLayout(cVar.f27354a);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Activity activity = cVar.f27354a;
        ckf.f(activity, "activity");
        ude udeVar = cVar.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        Object obj = cVar.f;
        ckf.e(obj, "null cannot be cast to non-null type com.taobao.search.searchdoor.sf.widgets.SearchDoorModelAdapter");
        return new GuessDiscoveryWidget(frameLayout, activity, udeVar, (c2p) obj);
    }

    public static /* synthetic */ Object ipc$super(GuessDiscoveryWidget guessDiscoveryWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.r();
            return null;
        } else if (hashCode == 299066517) {
            super.w0();
            return null;
        } else if (hashCode == 593843865) {
            super.i();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/activate/guess/GuessDiscoveryWidget");
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.i();
        phw<GuessDiscoveryCellBean, View, c2p> phwVar = this.m;
        if (phwVar != null) {
            phwVar.onCtxDestroyInternal();
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.r();
        phw<GuessDiscoveryCellBean, View, c2p> phwVar = this.m;
        if (phwVar != null) {
            phwVar.onCtxResumeInternal();
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.w0();
        phw<GuessDiscoveryCellBean, View, c2p> phwVar = this.m;
        if (phwVar != null) {
            phwVar.onCtxPauseInternal();
        }
    }

    /* renamed from: J0 */
    public void H0(int i, GuessDiscoveryCellBean guessDiscoveryCellBean) {
        phw<GuessDiscoveryCellBean, View, c2p> phwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6caa9d9b", new Object[]{this, new Integer(i), guessDiscoveryCellBean});
        } else if (guessDiscoveryCellBean != null) {
            GuessDiscoveryCellBean guessDiscoveryCellBean2 = this.n;
            phw<GuessDiscoveryCellBean, View, c2p> phwVar2 = null;
            if (!(guessDiscoveryCellBean2 == null || ckf.b(guessDiscoveryCellBean2, guessDiscoveryCellBean) || (phwVar = this.m) == null)) {
                phwVar.destroyAndRemoveFromParent();
                this.m = null;
                this.o = false;
                c4p.n("RemoteWidgetCreator", "猜你想搜数据刷新，重建widget");
            }
            this.n = guessDiscoveryCellBean;
            phw<GuessDiscoveryCellBean, View, c2p> phwVar3 = this.m;
            if (phwVar3 == null && !this.o) {
                this.o = true;
                View view = this.itemView;
                ckf.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) view;
                c cVar = new c(viewGroup);
                lzn lznVar = lzn.INSTANCE;
                Activity activity = getActivity();
                ckf.f(activity, "getActivity(...)");
                phw<?, ? extends View, ?> j = lznVar.j("guess_discover", new mzn(activity, this, l0(), viewGroup, cVar));
                if (j instanceof phw) {
                    phwVar2 = j;
                }
                this.m = phwVar2;
                if (phwVar2 == null) {
                    c4p.n("RemoteWidgetCreator", "猜你想搜未发现远程包更新，创建本地widget");
                    Activity activity2 = getActivity();
                    ckf.f(activity2, "getActivity(...)");
                    this.m = new sma(activity2, this, (c2p) l0(), viewGroup, cVar);
                } else {
                    c4p.n("RemoteWidgetCreator", "猜你想搜发现远程包更新，创建远程包widget");
                }
                phw<GuessDiscoveryCellBean, View, c2p> phwVar4 = this.m;
                ckf.d(phwVar4);
                phwVar4.attachToContainer();
                if (this.n != null) {
                    phw<GuessDiscoveryCellBean, View, c2p> phwVar5 = this.m;
                    ckf.d(phwVar5);
                    phwVar5.bindWithData(this.n);
                }
            } else if (phwVar3 != null) {
                phwVar3.bindWithData(guessDiscoveryCellBean);
            }
        }
    }
}
