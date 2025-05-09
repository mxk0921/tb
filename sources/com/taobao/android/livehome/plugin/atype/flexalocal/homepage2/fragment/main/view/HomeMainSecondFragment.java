package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.adapter.LiveRecyclerAdapter;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.FeedListResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component.HomeSecondTabView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.TemplateObject;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b0h;
import tb.cmb;
import tb.dbf;
import tb.fkx;
import tb.j00;
import tb.lqc;
import tb.lrq;
import tb.mbu;
import tb.nvs;
import tb.owg;
import tb.owo;
import tb.p0;
import tb.p9m;
import tb.q1b;
import tb.qw0;
import tb.qyg;
import tb.r0h;
import tb.sj7;
import tb.t2o;
import tb.v2s;
import tb.vu3;
import tb.wca;
import tb.y5c;
import tb.yh6;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeMainSecondFragment extends HomeLazyLoadFragment implements cmb, y5c, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String F = HomeMainSecondFragment.class.getSimpleName();
    public View A;
    public View B;
    public Activity h;
    public View i;
    public final String j;
    public b0h l;
    public RecyclerView m;
    public StaggeredGridLayoutManager n;
    public BaseOutDo p;
    public LiveRecyclerAdapter q;
    public lqc r;
    public final HomeSecondTabView.SecondTab s;
    public long t;
    public JSONObject u;
    public JSONArray v;
    public Handler w;
    public TUrlImageView x;
    public View y;
    public View z;
    public boolean k = false;
    public final List<IMTOPDataObject> o = new ArrayList();
    public BroadcastReceiver C = new BroadcastReceiver() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainSecondFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/HomeMainSecondFragment$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !lrq.a(intent.getAction())) {
                try {
                    if (intent.getAction().equals("com.taobao.taolive.room.service.VisitedList")) {
                        HomeMainSecondFragment.A2(HomeMainSecondFragment.this, JSON.parseArray(intent.getStringExtra("feedList")));
                    }
                } catch (Exception e) {
                    String access$100 = HomeMainSecondFragment.access$100();
                    r0h.c(access$100, "login receive exp. Action: " + intent.getAction(), e);
                }
            }
        }
    };
    public int D = 0;
    public int E = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class InnerScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378800);
        }

        public InnerScrollListener() {
        }

        public static /* synthetic */ Object ipc$super(InnerScrollListener innerScrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/HomeMainSecondFragment$InnerScrollListener");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            } else {
                HomeMainSecondFragment.C2(HomeMainSecondFragment.this, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else {
                HomeMainSecondFragment.B2(HomeMainSecondFragment.this, recyclerView.getScrollState(), i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HomeMainSecondFragment.this.O2(false, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (HomeMainSecondFragment.D2(HomeMainSecondFragment.this) != null) {
                HomeMainSecondFragment.D2(HomeMainSecondFragment.this).l(HomeMainSecondFragment.E2(HomeMainSecondFragment.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HomeMainSecondFragment.this.O2(false, false);
            }
        }
    }

    static {
        t2o.a(310378793);
        t2o.a(310378760);
        t2o.a(310378770);
    }

    public HomeMainSecondFragment(b0h b0hVar, HomeSecondTabView.SecondTab secondTab) {
        this.j = "all";
        B3(b0hVar);
        this.s = secondTab;
        this.j = secondTab.subChannelType;
    }

    public static /* synthetic */ JSONArray A2(HomeMainSecondFragment homeMainSecondFragment, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("18ed78e5", new Object[]{homeMainSecondFragment, jSONArray});
        }
        homeMainSecondFragment.v = jSONArray;
        return jSONArray;
    }

    public static /* synthetic */ void B2(HomeMainSecondFragment homeMainSecondFragment, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cb7b72", new Object[]{homeMainSecondFragment, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            homeMainSecondFragment.l3(i, i2, i3);
        }
    }

    public static /* synthetic */ void C2(HomeMainSecondFragment homeMainSecondFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d85c993", new Object[]{homeMainSecondFragment, new Integer(i)});
        } else {
            homeMainSecondFragment.k3(i);
        }
    }

    public static /* synthetic */ lqc D2(HomeMainSecondFragment homeMainSecondFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lqc) ipChange.ipc$dispatch("cfaabfe7", new Object[]{homeMainSecondFragment});
        }
        return homeMainSecondFragment.c3();
    }

    public static /* synthetic */ String E2(HomeMainSecondFragment homeMainSecondFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("181cfb33", new Object[]{homeMainSecondFragment});
        }
        return homeMainSecondFragment.j;
    }

    public static /* synthetic */ b0h J2(HomeMainSecondFragment homeMainSecondFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("a0438f91", new Object[]{homeMainSecondFragment});
        }
        return homeMainSecondFragment.l;
    }

    public static /* synthetic */ int K2(HomeMainSecondFragment homeMainSecondFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dee3238b", new Object[]{homeMainSecondFragment, new Integer(i)})).intValue();
        }
        return homeMainSecondFragment.X2(i);
    }

    public static /* synthetic */ LiveRecyclerAdapter M2(HomeMainSecondFragment homeMainSecondFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveRecyclerAdapter) ipChange.ipc$dispatch("12879fe6", new Object[]{homeMainSecondFragment});
        }
        return homeMainSecondFragment.q;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return F;
    }

    public static /* synthetic */ Object ipc$super(HomeMainSecondFragment homeMainSecondFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/HomeMainSecondFragment");
        }
    }

    public void A3(JSONObject jSONObject) {
        List<IMTOPDataObject> T;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cbad85", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null && this.q != null) {
            String string = jSONObject.getString("uniqueID");
            if (!lrq.a(string) && (T = this.q.T()) != null && T.size() > 0) {
                Iterator<IMTOPDataObject> it = T.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    IMTOPDataObject next = it.next();
                    if (next instanceof DinamicDataObject) {
                        DinamicDataObject dinamicDataObject = (DinamicDataObject) next;
                        if (!lrq.a(dinamicDataObject.uniqueId) && dinamicDataObject.uniqueId.equals(string)) {
                            jSONObject.put("currentCardIndex", (Object) Integer.valueOf(dinamicDataObject.mPosition));
                            break;
                        }
                    }
                }
            }
        }
        this.u = jSONObject;
    }

    public void B3(b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e78edcc", new Object[]{this, b0hVar});
        } else {
            this.l = b0hVar;
        }
    }

    public final void C3() {
        HomeSecondTabView.SecondTab secondTab;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cd5ac7", new Object[]{this});
            return;
        }
        b0h b0hVar = this.l;
        if (b0hVar != null && !b0hVar.u() && (secondTab = this.s) != null && (jSONObject = secondTab.tabShowMaidian) != null) {
            p9m.f(jSONObject.getString("name"), this.s.tabShowMaidian.getString("params"));
        }
    }

    public void D3(String str) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (activity = this.h) != null) {
            Toast makeText = Toast.makeText(activity, str, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    public final void E3() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf3057a", new Object[]{this});
            return;
        }
        if (this.E > 600) {
            z = true;
        }
        qyg.c().e("com.taobao.taolive.faxian.scrollInnerOffsetYChange", Boolean.valueOf(z));
    }

    public final void N2(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c0b782", new Object[]{this, list});
        } else if (list != null) {
            Iterator<IMTOPDataObject> it = list.iterator();
            while (it.hasNext()) {
                ((DinamicDataObject) it.next()).mFeedbackCallback = this;
            }
            LiveRecyclerAdapter liveRecyclerAdapter = this.q;
            if (liveRecyclerAdapter != null) {
                liveRecyclerAdapter.O(list);
            }
            b0h b0hVar = this.l;
            if (!(b0hVar == null || b0hVar.g() == null)) {
                this.l.g().c();
            }
            ((ArrayList) this.o).clear();
            ((ArrayList) this.o).addAll(list);
            b0h b0hVar2 = this.l;
            if (b0hVar2 != null && b0hVar2.g() != null) {
                this.l.g().e(list, p0.i(this.l.f(), this.l.t(), this.j));
            }
        } else {
            LiveRecyclerAdapter liveRecyclerAdapter2 = this.q;
            if (liveRecyclerAdapter2 != null) {
                liveRecyclerAdapter2.l0();
            }
        }
    }

    public void O2(boolean z, boolean z2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3466d88a", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!sj7.a()) {
            b0h b0hVar = this.l;
            if ((b0hVar == null || !b0hVar.u()) && (staggeredGridLayoutManager = this.n) != null) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                this.n.findLastVisibleItemPositions(iArr2);
                b0h b0hVar2 = this.l;
                if (b0hVar2 != null && b0hVar2.r() != null) {
                    this.l.r().c(this.m, this.l, this.j, Math.min(iArr[0], iArr[1]), Math.max(iArr2[0], iArr2[1]), z, z2);
                }
            }
        }
    }

    public final void Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace80637", new Object[]{this});
        } else {
            x3(null);
        }
    }

    public final StaggeredGridLayoutManager R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaggeredGridLayoutManager) ipChange.ipc$dispatch("48d19408", new Object[]{this});
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        staggeredGridLayoutManager.setGapStrategy(0);
        return staggeredGridLayoutManager;
    }

    public final LiveRecyclerAdapter S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveRecyclerAdapter) ipChange.ipc$dispatch("8d925e5c", new Object[]{this});
        }
        return new LiveRecyclerAdapter(getContext(), this.l, this);
    }

    public final View T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6379fb10", new Object[]{this});
        }
        if (this.z == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_home_main_load_layout_flexalocal, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.live_home_main_load_text)).setText("");
            this.z = inflate;
        }
        return this.z;
    }

    public final View U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e61312e5", new Object[]{this});
        }
        if (this.A == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_home_main_follow_error_flexalocal, (ViewGroup) null);
            ((TUrlImageView) inflate.findViewById(R.id.live_home_main_error_img)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN019hOWs91lKS90kC7Gp_!!6000000004800-2-tps-420-300.png");
            TextView textView = (TextView) inflate.findViewById(R.id.live_home_main_error_title);
            TextView textView2 = (TextView) inflate.findViewById(R.id.live_home_main_error_subTitle);
            if (lrq.a(this.j) || !"subChannelFollow".equals(this.j)) {
                textView.setText("暂无数据");
                textView2.setText("请稍后再来吧");
            } else {
                textView.setText("暂无关注");
                textView2.setText("看看其他主播吧");
            }
            ((FrameLayout) inflate.findViewById(R.id.live_home_main_error_click_retry)).setVisibility(8);
            this.A = inflate;
        }
        return this.A;
    }

    public final int X2(int i) {
        List<IMTOPDataObject> T;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf8607c", new Object[]{this, new Integer(i)})).intValue();
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView == null || recyclerView.getScrollState() != 0 || !(this.m.getLayoutManager() instanceof StaggeredGridLayoutManager) || (T = this.q.T()) == null || T.size() <= 0 || (findViewHolderForAdapterPosition = this.m.findViewHolderForAdapterPosition(i)) == null || !(findViewHolderForAdapterPosition.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return 0;
        }
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition.itemView.getLayoutParams()).getSpanIndex();
        if (T.size() <= i + 3) {
            return 0;
        }
        int i3 = spanIndex % 2;
        if (i3 == 0) {
            i2 = i + 1;
            while (i2 < i + 4) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.m.findViewHolderForAdapterPosition(i2);
                if (findViewHolderForAdapterPosition2 == null || !(findViewHolderForAdapterPosition2.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) || ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition2.itemView.getLayoutParams()).getSpanIndex() % 2 != 0) {
                    i2++;
                }
            }
            return 0;
        } else if (i3 != 1) {
            return 0;
        } else {
            i2 = i + 1;
            while (i2 < i + 4) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition3 = this.m.findViewHolderForAdapterPosition(i2);
                if (findViewHolderForAdapterPosition3 == null || !(findViewHolderForAdapterPosition3.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) || ((StaggeredGridLayoutManager.LayoutParams) findViewHolderForAdapterPosition3.itemView.getLayoutParams()).getSpanIndex() % 2 != 1) {
                    i2++;
                }
            }
            return 0;
        }
        return i2 - i;
    }

    public final int a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return R.layout.live_dx_main_recyclerview_flexalocal;
    }

    public final View b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8f93c19f", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_home_main_load_layout_flexalocal, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.live_home_main_load_text)).setText("更多加载中...");
        return inflate;
    }

    public final lqc c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lqc) ipChange.ipc$dispatch("5794e536", new Object[]{this});
        }
        lqc lqcVar = this.r;
        if (lqcVar != null) {
            return lqcVar;
        }
        b0h b0hVar = this.l;
        if (b0hVar == null || b0hVar.l() == null) {
            return null;
        }
        lqc l = this.l.l();
        this.r = l;
        return l;
    }

    public final View d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("63e98224", new Object[]{this});
        }
        if (this.B == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_home_main_load_layout_flexalocal, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.live_home_main_load_text)).setText("- 到底了，看看其他频道吧 -");
            this.B = inflate;
        }
        return this.B;
    }

    public RecyclerView e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.m;
    }

    public String f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca3f8f66", new Object[]{this});
        }
        HomeSecondTabView.SecondTab secondTab = this.s;
        if (secondTab == null) {
            return null;
        }
        return secondTab.subChannelType;
    }

    public boolean h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f06f3410", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 100) {
            x3(null);
        }
        return false;
    }

    public final void i3(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.live_list_recycler_view);
        this.m = recyclerView;
        if (recyclerView != null) {
            this.q = S2();
            StaggeredGridLayoutManager R2 = R2();
            this.n = R2;
            this.m.setLayoutManager(R2);
            this.m.addItemDecoration(m3(), 0);
            this.m.setAdapter(this.q);
            this.m.setItemAnimator(null);
            this.m.addOnScrollListener(new InnerScrollListener());
        }
        LiveRecyclerAdapter liveRecyclerAdapter = this.q;
        if (liveRecyclerAdapter != null && liveRecyclerAdapter.X() == 0) {
            this.q.h0(b3(), new q1b(this));
        }
    }

    public final void j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562dcbcb", new Object[]{this});
            return;
        }
        LiveRecyclerAdapter liveRecyclerAdapter = this.q;
        if (liveRecyclerAdapter != null && liveRecyclerAdapter.V() == 0) {
            z3();
            n3(this.p, this.l.u());
            r0h.b("TaoLiveHomepage", "TaoLiveHomepageProcessor lazyLoadData");
        }
    }

    public final RecyclerView.ItemDecoration m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("26208679", new Object[]{this});
        }
        b0h b0hVar = this.l;
        if (b0hVar == null || !p0.i(b0hVar.f(), this.l.t(), this.j)) {
            return new HomeMainRecyclerDecoration(owo.e(getContext(), "8ap", 0), owo.e(getContext(), "4ap", 0), owo.e(getContext(), "8ap", 0), false);
        }
        return new HomeMainRecyclerDecoration(owo.e(getContext(), "8ap", 0), owo.e(getContext(), "4ap", 0), owo.e(getContext(), "8ap", 0), true);
    }

    public void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26bade6", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.x;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
        LiveRecyclerAdapter liveRecyclerAdapter = this.q;
        if (liveRecyclerAdapter == null) {
            return;
        }
        if (liveRecyclerAdapter.V() == 0) {
            this.q.e0(U2());
            this.q.j0();
            return;
        }
        this.q.f0(T2());
        this.q.k0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        Q2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.h = (Activity) context;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.w = new Handler(Looper.getMainLooper());
        if (this.g == null) {
            this.g = new FrameLayout(layoutInflater.getContext());
            this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.C != null) {
            LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.C, new IntentFilter("com.taobao.taolive.room.service.VisitedList"));
        }
        super.onCreateView(layoutInflater, this.g, bundle);
        return this.g;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.g = null;
        this.i = null;
        this.h = null;
        Handler handler = this.w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.C != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.C);
            this.C = null;
        }
    }

    public void onPageEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7729b6f4", new Object[]{this});
            return;
        }
        LiveRecyclerAdapter liveRecyclerAdapter = this.q;
        if (liveRecyclerAdapter != null) {
            liveRecyclerAdapter.i0(d3());
            this.q.l0();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    public void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab32521", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.x;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
        LiveRecyclerAdapter liveRecyclerAdapter = this.q;
        if (liveRecyclerAdapter == null) {
            return;
        }
        if (liveRecyclerAdapter.V() == 0) {
            this.q.g0(W2());
            this.q.d0();
            return;
        }
        this.q.f0(T2());
        this.q.k0();
    }

    public void q3(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39bf869", new Object[]{this, baseOutDo});
        } else if (baseOutDo instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.q != null && feedListResponse.getData() != null) {
                N2(feedListResponse.getData().dataList);
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment
    public void r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1d5741", new Object[]{this});
        }
    }

    public void r3(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1932ef0", new Object[]{this, baseOutDo});
            return;
        }
        this.p = baseOutDo;
        if (baseOutDo instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            this.k = true;
            if (this.q != null && feedListResponse.getData() != null) {
                if (feedListResponse.getData().dataList != null) {
                    if (feedListResponse.getData().dataList.size() == 1 && g3(feedListResponse.getData().dataList.get(0))) {
                        o3();
                        return;
                    }
                } else if (this.q.V() == 0) {
                    o3();
                    return;
                }
                y3(feedListResponse.getData().dataList);
            }
        }
    }

    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cbe05a", new Object[]{this});
            return;
        }
        C3();
        z3();
        E3();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment
    public void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void u3(DinamicDataObject dinamicDataObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14fb91a", new Object[]{this, dinamicDataObject, new Integer(i)});
            return;
        }
        LiveRecyclerAdapter liveRecyclerAdapter = this.q;
        if (liveRecyclerAdapter != null) {
            liveRecyclerAdapter.m0(dinamicDataObject, i);
            this.q.notifyItemChanged(i);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment
    public void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        C3();
        if (this.m != null) {
            b0h b0hVar = this.l;
            if (!(b0hVar == null || b0hVar.r() == null)) {
                this.l.r().h();
            }
            this.w.postDelayed(new a(), 500L);
        }
    }

    public void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede548eb", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
            this.E = 0;
        }
    }

    public final void w3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ff551a", new Object[]{this, new Integer(i)});
            return;
        }
        LiveRecyclerAdapter liveRecyclerAdapter = this.q;
        if (liveRecyclerAdapter != null) {
            int V = liveRecyclerAdapter.V();
            if (p0.i(this.l.f(), this.l.t(), this.j)) {
                if (V >= 7 && i >= V - 3 && c3() != null) {
                    c3().onLoadMore();
                }
            } else if (V >= 20 && i >= V - 6 && c3() != null) {
                c3().onLoadMore();
            }
        }
    }

    public final void y3(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e99e91", new Object[]{this, list});
            return;
        }
        TUrlImageView tUrlImageView = this.x;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
        this.q.Q();
        N2(list);
        this.m.invalidateItemDecorations();
        this.q.notifyItemRangeChanged(0, list.size());
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment
    public void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304d5bd2", new Object[]{this});
        } else {
            z3();
        }
    }

    public final void z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7641b957", new Object[]{this});
            return;
        }
        b0h b0hVar = this.l;
        if (!(b0hVar == null || b0hVar.r() == null)) {
            this.l.r().h();
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView != null) {
            recyclerView.postDelayed(new c(), 50L);
        }
    }

    public final View W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f6c59be0", new Object[]{this});
        }
        if (this.y == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_home_main_follow_error_flexalocal, (ViewGroup) null);
            ((TUrlImageView) inflate.findViewById(R.id.live_home_main_error_img)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN019RWgWu1v3BMpFCEzp_!!6000000006116-2-tps-420-300.png");
            ((TextView) inflate.findViewById(R.id.live_home_main_error_title)).setText("网络不太好");
            ((TextView) inflate.findViewById(R.id.live_home_main_error_subTitle)).setText("尝试刷新一下吧");
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.live_home_main_error_click_retry);
            frameLayout.setOnClickListener(new b());
            frameLayout.setVisibility(0);
            this.y = inflate;
        }
        return this.y;
    }

    public void s3(j00 j00Var, DinamicDataObject dinamicDataObject) {
        b0h b0hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9d82fe", new Object[]{this, j00Var, dinamicDataObject});
        } else if (dinamicDataObject != null && dinamicDataObject.data != null && (b0hVar = this.l) != null && b0hVar.g() != null && !lrq.a(this.j)) {
            this.l.g().f(dinamicDataObject, true ^ "subChannelFollow".equals(this.j), p0.i(this.l.f(), this.l.t(), this.j));
        }
    }

    public final boolean g3(IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9519243", new Object[]{this, iMTOPDataObject})).booleanValue();
        }
        if (!(iMTOPDataObject instanceof DinamicDataObject)) {
            return false;
        }
        DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
        return !lrq.a(dinamicDataObject.templateName) && dinamicDataObject.templateName.equals("taolive_channel_follow_subtab_other_empty_card");
    }

    public void n3(BaseOutDo baseOutDo, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cda1bf", new Object[]{this, baseOutDo, new Boolean(z)});
            return;
        }
        this.p = baseOutDo;
        if (baseOutDo instanceof FeedListResponse) {
            this.k = true;
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.q != null && feedListResponse.getData() != null) {
                if (feedListResponse.getData().dataList == null) {
                    o3();
                } else if (feedListResponse.getData().dataList.size() != 1 || !g3(feedListResponse.getData().dataList.get(0))) {
                    if (z) {
                        str = "homeMain_cache_feedArea_render_start";
                    } else {
                        str = "homeMain_mtop_feedArea_render_start";
                    }
                    mbu.b(str, this.l);
                    y3(feedListResponse.getData().dataList);
                    if (this.h != null && feedListResponse.getData().toastInfo != null && !TextUtils.isEmpty(feedListResponse.getData().toastInfo.getString("text"))) {
                        String string = feedListResponse.getData().toastInfo.getString("text");
                        D3(string);
                        if (v2s.o().s() != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("toast", string);
                            v2s.o().s().a("tbLiveHome_single_sjsd_toast", "Page_TaobaoLive", hashMap);
                        }
                    }
                } else {
                    o3();
                }
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeLazyLoadFragment
    public boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9abbaa05", new Object[]{this})).booleanValue();
        }
        b0h b0hVar = this.l;
        if (b0hVar != null && b0hVar.u() && !lrq.a(this.j) && this.j.equals("subChannelFollow")) {
            return false;
        }
        if (this.g != null && this.i == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(a3(), this.g, false);
            this.i = inflate;
            if (inflate != null && p0.i("", this.l.t(), this.j)) {
                this.i.setBackgroundColor(Color.parseColor("#F3F6F8"));
            }
            this.g.addView(this.i, new ViewGroup.LayoutParams(-1, -1));
            this.x = (TUrlImageView) this.i.findViewById(R.id.live_dx_main_skeletonImg);
            if (lrq.a(this.j) || !this.j.equals("subChannelFollow")) {
                b0h b0hVar2 = this.l;
                if (b0hVar2 == null || !p0.i(b0hVar2.f(), this.l.t(), this.j)) {
                    this.x.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01MRF2Yd1GPibhpItME_!!6000000000615-2-tps-750-1686.png");
                } else {
                    this.x.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01eF80pl1KZZb4uE5LV_!!6000000001178-2-tps-750-1430.png");
                }
            } else {
                this.x.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01zAfWZn1exejfxNQiW_!!6000000003938-2-tps-750-1860.png");
            }
            i3(this.g);
            j3();
        }
        return true;
    }

    public final void k3(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57be9ce4", new Object[]{this, new Integer(i)});
            return;
        }
        String str = F;
        r0h.b(str, "taolivehomeOnscroll notifyOnScrollStateChanged：" + i);
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.n;
        if (!(staggeredGridLayoutManager == null || this.m == null)) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            this.n.findLastVisibleItemPositions(iArr2);
            for (int min = Math.min(iArr[0], iArr[1]); min <= Math.max(iArr2[0], iArr2[1]); min++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.m.findViewHolderForAdapterPosition(min);
                if (findViewHolderForAdapterPosition instanceof HomeMainListViewHolder) {
                    ((HomeMainListViewHolder) findViewHolderForAdapterPosition).onScrollStateChanged(i);
                }
            }
            this.n.findFirstCompletelyVisibleItemPositions(iArr);
            if (i == 0 && (iArr[0] == 1 || iArr[1] == 1)) {
                this.n.invalidateSpanAssignments();
            }
            boolean z2 = this.D < 0;
            if (i != 0) {
                z = true;
            }
            O2(z2, z);
        }
    }

    public final void l3(int i, int i2, int i3) {
        double d;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b678ee8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        String str = F;
        r0h.b(str, "taolivehomeOnscroll notifyOnScrolled：" + i);
        this.E = this.E + i3;
        this.D = i3;
        E3();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.t;
        if (j < 60000) {
            if ((i3 != 0) && (j > 0)) {
                d = Math.round((float) ((Math.abs(i3) * 1000) / j)) / 1.0d;
                this.t = currentTimeMillis;
                r0h.b(str, "notifyOnScrolled：" + this.E);
                staggeredGridLayoutManager = this.n;
                if (!(staggeredGridLayoutManager == null || this.m == null)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                    this.n.findLastVisibleItemPositions(iArr2);
                    for (int min = Math.min(iArr[0], iArr[1]); min <= Math.max(iArr2[0], iArr2[1]); min++) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.m.findViewHolderForAdapterPosition(min);
                        if (findViewHolderForAdapterPosition instanceof HomeMainListViewHolder) {
                            ((HomeMainListViewHolder) findViewHolderForAdapterPosition).g0(i);
                        }
                    }
                    w3(iArr2[1]);
                    if (d < nvs.i0()) {
                        boolean z2 = i3 < 0;
                        if (i != 0) {
                            z = true;
                        }
                        O2(z2, z);
                        return;
                    }
                    return;
                }
            }
        }
        d = vu3.b.GEO_NOT_SUPPORT;
        this.t = currentTimeMillis;
        r0h.b(str, "notifyOnScrolled：" + this.E);
        staggeredGridLayoutManager = this.n;
        if (staggeredGridLayoutManager == null) {
        }
    }

    public final void x3(JSONObject jSONObject) {
        b0h b0hVar;
        Integer integer;
        final int intValue;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a04c58c", new Object[]{this, jSONObject});
        } else if (this.u != null && (b0hVar = this.l) != null && b0hVar.q() != null && (intValue = (integer = this.u.getInteger("currentCardIndex")).intValue()) >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("feedList", (Object) this.v);
            jSONObject2.put("tppParam", (Object) JSON.toJSONString(jSONObject3));
            jSONObject2.put("sessionId", (Object) wca.b());
            jSONObject2.put("userId", (Object) Login.getUserId());
            jSONObject2.putAll(this.u);
            if (jSONObject != null) {
                jSONObject2.put("walleResponseInfo", (Object) jSONObject);
            }
            dbf dbfVar = new dbf(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainSecondFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        r0h.b(HomeMainSecondFragment.access$100(), "procNormal insert request onError");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        r0h.b(HomeMainSecondFragment.access$100(), "procNormal insert request onSystemError");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject d;
                    JSONArray jSONArray;
                    int i3;
                    TemplateObject template;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    r0h.b(HomeMainSecondFragment.access$100(), "procNormal insert request success");
                    if (mtopResponse != null && mtopResponse.getBytedata() != null && (d = fkx.d(new String(mtopResponse.getBytedata()))) != null && d.getJSONObject("data") != null && (jSONArray = d.getJSONObject("data").getJSONArray("cardList")) != null && jSONArray.size() > 0) {
                        String c2 = owg.c(HomeMainSecondFragment.this.getContext(), "liveHomeLastInsertInfo");
                        long currentTimeMillis = System.currentTimeMillis();
                        JSONObject jSONObject4 = new JSONObject();
                        if (!lrq.a(c2)) {
                            jSONObject4 = JSON.parseObject(c2);
                            i3 = ((Integer) jSONObject4.get("insertCount")).intValue();
                        } else {
                            i3 = 0;
                        }
                        jSONObject4.put("lastInsertTimeStamp", (Object) Long.valueOf(currentTimeMillis));
                        jSONObject4.put("insertCount", (Object) Integer.valueOf(i3 + 1));
                        owg.e(HomeMainSecondFragment.this.getContext(), "liveHomeLastInsertInfo", JSON.toJSONString(jSONObject4));
                        JSONObject jSONObject5 = jSONArray.getJSONObject(0);
                        if (jSONObject5 != null) {
                            DinamicDataObject dinamicDataObject = new DinamicDataObject();
                            dinamicDataObject.type = jSONObject5.getString("type");
                            dinamicDataObject.templateName = jSONObject5.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                            if (jSONObject5.get("noLeftRightSpace") != null) {
                                dinamicDataObject.noLeftRightSpace = jSONObject5.getBoolean("noLeftRightSpace").booleanValue();
                            }
                            if (!TextUtils.isEmpty(dinamicDataObject.templateName) && (template = HomeMainSecondFragment.J2(HomeMainSecondFragment.this).q().getTemplate(dinamicDataObject.templateName)) != null) {
                                dinamicDataObject.span = template.span;
                            }
                            dinamicDataObject.uniqueId = jSONObject5.getString("uniqueID");
                            HashMap<String, JSONObject> hashMap = new HashMap<>(1);
                            dinamicDataObject.data = hashMap;
                            hashMap.put("data", jSONObject5);
                            int i4 = intValue;
                            dinamicDataObject.mPosition = i4 + HomeMainSecondFragment.K2(HomeMainSecondFragment.this, i4);
                            if (HomeMainSecondFragment.M2(HomeMainSecondFragment.this) != null) {
                                HomeMainSecondFragment.M2(HomeMainSecondFragment.this).n0(dinamicDataObject.mPosition, dinamicDataObject);
                            }
                        }
                    }
                }
            });
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("itemAbBucketId", (Object) "1");
            jSONObject4.put("abBucketId", (Object) "3");
            b0h b0hVar2 = this.l;
            if (!(b0hVar2 == null || b0hVar2.d() == null)) {
                jSONObject4.put("scmPre", (Object) this.l.d().getString("scm"));
                jSONObject4.putAll(this.l.d().getJSONObject("extendParams"));
                if (this.l.d().get("originalQuery") instanceof JSONObject) {
                    jSONObject4.put("utparamPre", (Object) this.l.d().getJSONObject("originalQuery").getString(yj4.PARAM_UT_PARAMS));
                }
                jSONObject4.put("isPad", (Object) Boolean.valueOf(this.l.d().getBoolean("pad").booleanValue() || this.l.d().getBoolean("foldDevice").booleanValue()));
            }
            jSONObject4.put("deviceLevel", (Object) Integer.valueOf(qw0.e()));
            jSONObject4.put("requestType", (Object) 3);
            jSONObject4.put("bxFeature", (Object) BUFS.getFeature(new BUFS.QueryArgs(), "mtop.mediaplatform.alive.recommend.lives", "Page_TaobaoLive", "Page_TaobaoLive"));
            jSONObject4.put("currentSceneUUID", (Object) UUID.randomUUID());
            jSONObject4.put("enableInsertAbBucketId", (Object) "true");
            jSONObject4.put("itemAtmosphereVersion", (Object) 1);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("requestType", (Object) 3);
            if (this.l.g() != null) {
                jSONObject5.put("realExpoItemList", (Object) this.l.g().d);
                jSONObject5.put("lastRefreshTime", (Object) Long.valueOf(System.currentTimeMillis() - (this.l.g().e / 1000)));
                jSONObject4.put("realExpoInfo", (Object) jSONObject5);
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("currentCardIndex", (Object) integer);
            jSONObject6.put("algoExtendMap", this.u.get("algoExtendMap"));
            String c2 = owg.c(getContext(), "liveHomeLastInsertInfo");
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject7 = new JSONObject();
            if (!lrq.a(c2)) {
                jSONObject7 = JSON.parseObject(c2);
                if (currentTimeMillis - ((Long) jSONObject7.get("lastInsertTimeStamp")).longValue() < 86400000) {
                    i = ((Integer) jSONObject7.get("insertCount")).intValue();
                }
            }
            jSONObject7.put("lastInsertTimeStamp", (Object) Long.valueOf(currentTimeMillis));
            jSONObject7.put("insertCount", (Object) Integer.valueOf(i));
            owg.e(getContext(), "liveHomeLastInsertInfo", JSON.toJSONString(jSONObject7));
            jSONObject6.put("insertCount", (Object) Integer.valueOf(i));
            jSONObject6.put("channelCardType", this.u.get("channelCardType"));
            jSONObject6.put("liveId", this.u.get("liveId"));
            jSONObject6.put(yj4.PARAM_ITEM_IDS, this.u.get(yj4.PARAM_ITEM_IDS));
            jSONObject6.putAll(jSONObject2);
            dbfVar.j(this.l, this.h, jSONObject4, jSONObject6, intValue);
            this.u = null;
            this.v = null;
        }
    }
}
