package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView;
import tb.q4g;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.xea;
import tb.zga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodListSearchPopView extends BasePopupView implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GoodListSearchView mGoodListSearchView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements GoodListSearchView.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchPopView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0448a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0448a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    GoodListSearchPopView.this.destroy();
                }
            }
        }

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb0255e8", new Object[]{this});
                return;
            }
            q4g.a(GoodListSearchPopView.access$000(GoodListSearchPopView.this), null);
            GoodListSearchPopView.access$100(GoodListSearchPopView.this).postDelayed(new RunnableC0448a(), 300L);
        }
    }

    static {
        t2o.a(295699379);
        t2o.a(806355016);
    }

    public GoodListSearchPopView(xea xeaVar, ViewGroup viewGroup) {
        super(xeaVar, viewGroup);
        if (zga.b()) {
            sjr.g().a(this);
        }
    }

    public static /* synthetic */ ViewGroup access$000(GoodListSearchPopView goodListSearchPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("38d5ca7f", new Object[]{goodListSearchPopView});
        }
        return goodListSearchPopView.mViewGroup;
    }

    public static /* synthetic */ ViewGroup access$100(GoodListSearchPopView goodListSearchPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("81ecd11e", new Object[]{goodListSearchPopView});
        }
        return goodListSearchPopView.mViewGroup;
    }

    public static /* synthetic */ Object ipc$super(GoodListSearchPopView goodListSearchPopView, String str, Object... objArr) {
        if (str.hashCode() == -1775111991) {
            super.hide();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/search/GoodListSearchPopView");
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "GoodListSearchPopView";
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ViewGroup viewGroup2 = this.mViewGroup;
        if (!(viewGroup2 == null || (viewGroup = this.mContentView) == null)) {
            viewGroup2.removeView(viewGroup);
        }
        GoodListSearchView goodListSearchView = this.mGoodListSearchView;
        if (goodListSearchView != null) {
            goodListSearchView.destroy();
        }
        if (zga.b()) {
            sjr.g().b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        q4g.a(this.mContentView, null);
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.live.search.refresh.list.inner"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return xea.E(((BasePopupView) this).mGoodLiveContext);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        this.mGoodListSearchView = new GoodListSearchView(((BasePopupView) this).mGoodLiveContext);
        viewGroup.addView(this.mGoodListSearchView, new FrameLayout.LayoutParams(-1, -1));
        this.mGoodListSearchView.setCancelClickListener(new a());
        return this.mGoodListSearchView;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        GoodListSearchView goodListSearchView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        str.hashCode();
        if (str.equals("com.taobao.taolive.live.search.refresh.list.inner") && (goodListSearchView = this.mGoodListSearchView) != null && goodListSearchView.getAdapter() != null) {
            this.mGoodListSearchView.getAdapter().notifyDataSetChanged();
        }
    }
}
