package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.taobao.R;
import tb.mpe;
import tb.nb4;
import tb.oa4;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ProgressBar f6951a;
    public ImageView b;
    public TextView c;
    public int d;
    public a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a();

        void onFinish();
    }

    static {
        t2o.a(912262637);
    }

    public b(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/recommend/RecommendLoadMoreComponent");
    }

    public static /* synthetic */ int u(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("157cec71", new Object[]{bVar})).intValue();
        }
        return bVar.d;
    }

    public static /* synthetic */ int v(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89b57679", new Object[]{bVar})).intValue();
        }
        int i = bVar.d;
        bVar.d = 1 + i;
        return i;
    }

    public static /* synthetic */ a w(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("13e3db05", new Object[]{bVar});
        }
        return bVar.e;
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return x(view);
    }

    public final View x(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.tt_detail_recommend_load_more) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_item_load_more, (ViewGroup) null, false);
        }
        this.f6951a = (ProgressBar) view.findViewById(R.id.pb_detail_item_load);
        this.b = (ImageView) view.findViewById(R.id.iv_detail_item_load);
        this.c = (TextView) view.findViewById(R.id.tv_detail_item_load);
        return view;
    }

    public void y(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa912eb", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3946e77", new Object[]{this});
            return;
        }
        this.f6951a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setText("已浏览完所有推荐商品");
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        this.f6951a.setVisibility(0);
        this.b.setVisibility(8);
        this.c.setText("正在加载推荐的宝贝");
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db064b2", new Object[]{this});
            return;
        }
        this.f6951a.setVisibility(8);
        this.b.setVisibility(0);
        this.c.setText("猜中你的喜好有点难度呢，点我再尝试下吧");
        this.c.setOnClickListener(new com.taobao.android.detail.ttdetail.skeleton.recommend.a(this));
        mpe.m(this.b, "https://img.alicdn.com/imgextra/i3/O1CN01Q24JaH1l4QDVegPB5_!!6000000004765-2-tps-40-40.png");
    }
}
