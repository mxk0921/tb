package com.taobao.tao.sharepanel.normal.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.tao.sharepanel.common.CommonAdapter;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.gjp;
import tb.hpd;
import tb.lkp;
import tb.lr7;
import tb.ma4;
import tb.mip;
import tb.mjp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ChannelPanel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f12760a;
    public RecyclerView b;
    public RecyclerView c;
    public CommonAdapter d;
    public View e;
    public View f;
    public TextView g;
    public View h;
    public View i;
    public View j;
    public TUrlImageView k;
    public TextView l;
    public String m;
    public boolean n;
    public boolean o;
    public RelativeLayout p;
    public RelativeLayout q;
    public hpd r;
    public TextView s;
    public View t;
    public int u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (ChannelPanel.a(ChannelPanel.this) != null) {
                ChannelPanel.a(ChannelPanel.this).a(new mjp(ComponentType.CONTACT_ITEM.desc, null), ChannelPanel.b(ChannelPanel.this), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12763a;
        public final /* synthetic */ String b;

        public b(int i, String str) {
            this.f12763a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ChannelPanel.c(ChannelPanel.this, this.f12763a, this.b);
            }
        }
    }

    static {
        t2o.a(666894565);
        t2o.a(666894558);
    }

    public static /* synthetic */ hpd a(ChannelPanel channelPanel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpd) ipChange.ipc$dispatch("4b382cf8", new Object[]{channelPanel});
        }
        return channelPanel.r;
    }

    public static /* synthetic */ Context b(ChannelPanel channelPanel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("30454312", new Object[]{channelPanel});
        }
        return channelPanel.f12760a;
    }

    public static /* synthetic */ void c(ChannelPanel channelPanel, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eac752", new Object[]{channelPanel, new Integer(i), str});
        } else {
            channelPanel.o(i, str);
        }
    }

    public static /* synthetic */ RecyclerView d(ChannelPanel channelPanel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("43974ac3", new Object[]{channelPanel});
        }
        return channelPanel.c;
    }

    public static /* synthetic */ View e(ChannelPanel channelPanel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("403e935f", new Object[]{channelPanel});
        }
        return channelPanel.t;
    }

    public void f(List<ma4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7bae48", new Object[]{this, list});
        } else if (list == null) {
            this.b.setVisibility(8);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f12760a);
            linearLayoutManager.setOrientation(0);
            this.b.setLayoutManager(linearLayoutManager);
            CommonAdapter commonAdapter = new CommonAdapter(this.f12760a, list);
            this.d = commonAdapter;
            this.b.setAdapter(commonAdapter);
            this.d.notifyDataSetChanged();
        }
    }

    public void g(List<ma4> list, BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c742d7", new Object[]{this, list, bubbleTipsBean});
            return;
        }
        if (!this.n) {
            this.e.setVisibility(8);
        } else if (TextUtils.isEmpty(ShareBizAdapter.getInstance().getLogin().getUserId())) {
            this.f.setVisibility(0);
            ViewProxy.setOnClickListener(this.f, new a());
            this.c.setVisibility(4);
            this.e.setVisibility(8);
            return;
        } else if (list == null || list.size() <= 0) {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            ViewProxy.setOnClickListener(this.f, null);
            this.g.setText(Localization.q(R.string.taobao_app_1010_1_17886));
        } else {
            this.c.setVisibility(0);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f12760a);
            linearLayoutManager.setOrientation(0);
            this.c.setLayoutManager(linearLayoutManager);
            this.c.setAdapter(new CommonAdapter(this.f12760a, list));
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        }
        l(bubbleTipsBean);
    }

    public View h(Context context) {
        int i;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.f12760a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.share_new_channel_layout, (ViewGroup) null);
        this.t = inflate;
        this.h = inflate.findViewById(R.id.share_channel_items_layout);
        this.q = (RelativeLayout) this.t.findViewById(R.id.rl_share_detail);
        this.b = (RecyclerView) this.t.findViewById(R.id.share_new_chanel_view);
        this.c = (RecyclerView) this.t.findViewById(R.id.share_new_contact_view);
        this.p = (RelativeLayout) this.t.findViewById(R.id.rl_contacts);
        this.e = this.t.findViewById(R.id.share_contact_loading);
        this.f = this.t.findViewById(R.id.share_contact_no_login);
        this.g = (TextView) this.t.findViewById(R.id.share_contact_no_login_tips);
        this.i = this.t.findViewById(R.id.share_save_img_state_layout);
        this.l = (TextView) this.t.findViewById(R.id.share_save_img_tips_view);
        this.j = this.t.findViewById(R.id.share_save_img_progressbar);
        this.k = (TUrlImageView) this.t.findViewById(R.id.share_save_img_finish);
        this.s = (TextView) this.t.findViewById(R.id.tv_cancel_share_common);
        if (this.o) {
            i = 0;
        } else {
            i = 55;
        }
        this.u = i;
        if (TextUtils.equals(this.m, "common")) {
            this.s.setVisibility(0);
            if (this.n) {
                this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, lr7.b(context, 208.0f)));
                this.h.setPadding(0, lr7.b(context, 15.0f), 0, 0);
                this.p.setVisibility(0);
            } else {
                i();
            }
        } else {
            this.s.setVisibility(0);
            if (!this.n) {
                j();
            } else {
                this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, lr7.b(context, 260 - this.u)));
                View view = this.h;
                if (this.o) {
                    f = 60.0f;
                } else {
                    f = 0.0f;
                }
                view.setPadding(0, lr7.b(context, f), 0, 0);
            }
        }
        int j = lkp.b.j();
        if (j != -1) {
            Drawable indeterminateDrawable = ((ProgressBar) this.j).getIndeterminateDrawable();
            DrawableCompat.setTint(indeterminateDrawable, j);
            ((ProgressBar) this.j).setIndeterminateDrawable(indeterminateDrawable);
        }
        String i2 = lkp.b.i();
        if (!TextUtils.isEmpty(i2)) {
            this.k.setImageUrl(i2);
        }
        return this.t;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b38458", new Object[]{this});
            return;
        }
        this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, lr7.b(this.f12760a, 137.0f)));
        this.h.setPadding(0, lr7.b(this.f12760a, 5.0f), 0, 0);
        this.p.setVisibility(8);
    }

    public final void j() {
        int i;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68121904", new Object[]{this});
            return;
        }
        this.p.setVisibility(8);
        Context context = this.f12760a;
        if (this.o) {
            i = 0;
        } else {
            i = 45;
        }
        this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, lr7.b(context, 177 - i)));
        View view = this.h;
        Context context2 = this.f12760a;
        if (this.o) {
            f = 45.0f;
        } else {
            f = 0.0f;
        }
        view.setPadding(0, lr7.b(context2, f), 0, 0);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b6d38", new Object[]{this});
            return;
        }
        this.n = false;
        if (TextUtils.equals(this.m, "common")) {
            this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, lr7.b(this.f12760a, 137.0f)));
            this.h.setPadding(0, lr7.b(this.f12760a, 5.0f), 0, 0);
            this.p.setVisibility(8);
            return;
        }
        j();
    }

    public final void l(BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bafd199", new Object[]{this, bubbleTipsBean});
        } else if (bubbleTipsBean != null && mip.q() && this.c != null) {
            String index = bubbleTipsBean.getIndex();
            final String text = bubbleTipsBean.getText();
            try {
                final int parseInt = Integer.parseInt(index);
                if (!TextUtils.isEmpty(text) && parseInt >= 0) {
                    this.c.post(new b(parseInt, text));
                    this.c.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.sharepanel.normal.view.ChannelPanel.3
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
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/sharepanel/normal/view/ChannelPanel$3");
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
                                RecyclerView.LayoutManager layoutManager = ChannelPanel.d(ChannelPanel.this).getLayoutManager();
                                if (layoutManager instanceof LinearLayoutManager) {
                                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                    int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                                    int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                                    int i2 = parseInt;
                                    if (i2 >= findFirstCompletelyVisibleItemPosition && i2 <= findLastCompletelyVisibleItemPosition) {
                                        ChannelPanel.c(ChannelPanel.this, i2 - findFirstCompletelyVisibleItemPosition, text);
                                    }
                                }
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
                            if (i > 0) {
                                ((BubbleContainer) ChannelPanel.e(ChannelPanel.this)).hideBubble(0L);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    public void m(hpd hpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85a7f8a", new Object[]{this, hpdVar});
        } else {
            this.r = hpdVar;
        }
    }

    public void n(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d1ab72", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.m = str;
        this.n = z;
        this.o = z2;
    }

    public final void o(int i, String str) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2428cb8b", new Object[]{this, new Integer(i), str});
        } else if (i >= 0 && i < this.c.getChildCount()) {
            View childAt = this.c.getChildAt(i);
            int left = (childAt.getLeft() + (childAt.getWidth() / 2)) - lr7.b(gjp.a().getApplicationContext(), 26.0f);
            if (TextUtils.equals(this.m, "common")) {
                i2 = lr7.b(gjp.a().getApplicationContext(), 0.0f);
            } else {
                i2 = this.p.getBottom();
            }
            ((BubbleContainer) this.t).showBubble(left, i2, str);
            ((BubbleContainer) this.t).hideBubble(5000L);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a88899", new Object[]{this});
            return;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(0);
        String a2 = lkp.b.a();
        if (TextUtils.isEmpty(a2)) {
            this.l.setText(Localization.q(R.string.taobao_app_1010_1_17839));
        } else {
            this.l.setText(a2);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3de56d", new Object[]{this});
            return;
        }
        String c = lkp.b.c(1);
        if (TextUtils.isEmpty(c)) {
            this.l.setText(Localization.q(R.string.taobao_app_1010_1_17881));
        } else {
            this.l.setText(c);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584d519b", new Object[]{this});
            return;
        }
        String c = lkp.b.c(3);
        if (TextUtils.isEmpty(c)) {
            this.l.setText(Localization.q(R.string.taobao_app_1010_1_17881));
        } else {
            this.l.setText(c);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726dc637", new Object[]{this});
            return;
        }
        String c = lkp.b.c(2);
        if (TextUtils.isEmpty(c)) {
            this.l.setText(Localization.q(R.string.taobao_app_1010_1_17879));
        } else {
            this.l.setText(c);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10072b9e", new Object[]{this});
            return;
        }
        this.h.setVisibility(4);
        this.i.setVisibility(0);
        String c = lkp.b.c(1);
        if (!TextUtils.isEmpty(c)) {
            this.l.setText(c);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ea2591", new Object[]{this});
            return;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(0);
        String c = lkp.b.c(4);
        if (TextUtils.isEmpty(c)) {
            this.l.setText(Localization.q(R.string.taobao_app_1010_1_17839));
        } else {
            this.l.setText(c);
        }
    }
}
