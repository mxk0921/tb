package com.taobao.android.live.plugin.atype.flexalocal.recommendpop;

import android.content.Context;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendRecyclerView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.amr;
import tb.b0d;
import tb.eon;
import tb.fkx;
import tb.jw1;
import tb.ll6;
import tb.m;
import tb.nw0;
import tb.t2o;
import tb.ub5;
import tb.vc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ListItemPopView extends jw1 implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup n;
    public List<ListItemInfo> o;
    public RecommendRecyclerView p;
    public ItemListPopAdapter q;
    public eon t;
    public CountDownTimer w;
    public int r = 1;
    public final JSONArray s = new JSONArray();
    public boolean u = false;
    public boolean v = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ItemListPopAdapter extends RecyclerView.Adapter<ItemListPopHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699675);
        }

        public ItemListPopAdapter() {
        }

        public static /* synthetic */ Object ipc$super(ItemListPopAdapter itemListPopAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/ListItemPopView$ItemListPopAdapter");
        }

        /* renamed from: M */
        public void onBindViewHolder(ItemListPopHolder itemListPopHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41eb6e3f", new Object[]{this, itemListPopHolder, new Integer(i)});
                return;
            }
            ListItemInfo listItemInfo = (ListItemInfo) ListItemPopView.M(ListItemPopView.this).get(itemListPopHolder.getAdapterPosition());
            if (listItemInfo != null && (itemListPopHolder.itemView instanceof DXRootView)) {
                ll6.d(ListItemPopView.this.b.v(), (DXRootView) itemListPopHolder.itemView, listItemInfo.ori, ListItemPopView.this.b.F());
                ListItemPopView.this.b.Z("Newfans_exposure_item", listItemInfo);
            }
        }

        /* renamed from: N */
        public ItemListPopHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ItemListPopHolder) ipChange.ipc$dispatch("fc8886f5", new Object[]{this, viewGroup, new Integer(i)});
            }
            ub5 v = ListItemPopView.this.b.v();
            ListItemPopView listItemPopView = ListItemPopView.this;
            View a2 = ll6.a(v, listItemPopView.f22251a, listItemPopView.g);
            ListItemPopView listItemPopView2 = ListItemPopView.this;
            if (a2 == null) {
                a2 = new View(ListItemPopView.this.f22251a);
            }
            return new ItemListPopHolder(listItemPopView2, a2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return ListItemPopView.M(ListItemPopView.this).size();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ItemListPopHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(295699676);
        }

        public ItemListPopHolder(ListItemPopView listItemPopView, View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ListItemInfo extends ItemInfo {
        public String itemId;
        public JSONObject ori;

        static {
            t2o.a(295699677);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ListItemPopView.this.b.I(true, true);
            ListItemPopView listItemPopView = ListItemPopView.this;
            listItemPopView.b.W(listItemPopView.m(), null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(ListItemPopView listItemPopView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements RecommendRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendRecyclerView.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e067b313", new Object[]{this, new Boolean(z)});
                return;
            }
            ListItemPopView listItemPopView = ListItemPopView.this;
            if (listItemPopView.b != null && !ListItemPopView.E(listItemPopView) && !ListItemPopView.F(ListItemPopView.this)) {
                ListItemPopView.I(ListItemPopView.this);
                ListItemPopView listItemPopView2 = ListItemPopView.this;
                ListItemPopView.L(listItemPopView2, String.valueOf(ListItemPopView.G(listItemPopView2)), String.valueOf(ListItemPopView.J(ListItemPopView.this)), ListItemPopView.K(ListItemPopView.this).toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ListItemPopView.this.b.I(true, true);
            ListItemPopView listItemPopView = ListItemPopView.this;
            listItemPopView.b.W(listItemPopView.m(), null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f8653a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ListItemPopView listItemPopView, long j, long j2, TextView textView) {
            super(j, j2);
            this.f8653a = textView;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/ListItemPopView$6");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                this.f8653a.setText("00:00:00后失效");
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Object obj;
            Object obj2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                return;
            }
            long j2 = (j % 60000) / 1000;
            long j3 = j / 60000;
            TextView textView = this.f8653a;
            StringBuilder sb = new StringBuilder("00:");
            if (j3 < 10) {
                obj = "0" + j3;
            } else {
                obj = Long.valueOf(j3);
            }
            sb.append(obj);
            sb.append(":");
            if (j2 < 10) {
                obj2 = "0" + j2;
            } else {
                obj2 = Long.valueOf(j2);
            }
            sb.append(obj2);
            sb.append("后失效");
            textView.setText(sb.toString());
        }
    }

    static {
        t2o.a(295699668);
        t2o.a(806355932);
    }

    public ListItemPopView(Context context, amr amrVar, String str) {
        super(context, amrVar, str);
    }

    public static /* synthetic */ boolean E(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("717a6b33", new Object[]{listItemPopView})).booleanValue();
        }
        return listItemPopView.u;
    }

    public static /* synthetic */ boolean F(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2966d8b4", new Object[]{listItemPopView})).booleanValue();
        }
        return listItemPopView.v;
    }

    public static /* synthetic */ int G(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1534624", new Object[]{listItemPopView})).intValue();
        }
        return listItemPopView.r;
    }

    public static /* synthetic */ int I(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d32142c", new Object[]{listItemPopView})).intValue();
        }
        int i = listItemPopView.r;
        listItemPopView.r = 1 + i;
        return i;
    }

    public static /* synthetic */ int J(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("993fb3a5", new Object[]{listItemPopView})).intValue();
        }
        listItemPopView.getClass();
        return 10;
    }

    public static /* synthetic */ JSONArray K(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c3ab92ab", new Object[]{listItemPopView});
        }
        return listItemPopView.s;
    }

    public static /* synthetic */ void L(ListItemPopView listItemPopView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a2c192", new Object[]{listItemPopView, str, str2, str3});
        } else {
            listItemPopView.O(str, str2, str3);
        }
    }

    public static /* synthetic */ List M(ListItemPopView listItemPopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("209c4572", new Object[]{listItemPopView});
        }
        return listItemPopView.o;
    }

    public static /* synthetic */ Object ipc$super(ListItemPopView listItemPopView, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.j();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/ListItemPopView");
    }

    @Override // tb.jw1
    public void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f583c0", new Object[]{this, new Boolean(z)});
        }
    }

    public final void N(JSONArray jSONArray) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b540938f", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                ListItemInfo listItemInfo = (ListItemInfo) fkx.j(jSONObject, ListItemInfo.class);
                listItemInfo.ori = jSONObject;
                JSONObject jSONObject3 = listItemInfo.item;
                if (jSONObject3 != null) {
                    str = jSONObject3.getString("id");
                } else {
                    str = "";
                }
                listItemInfo.itemId = str;
                this.o.add(listItemInfo);
                jSONObject2.put("itemId", (Object) listItemInfo.itemId);
                this.s.add(jSONObject2);
                if (this.s.size() > 50) {
                    this.s.remove(0);
                }
            }
        }
    }

    public final void O(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2443bb", new Object[]{this, str, str2, str3});
            return;
        }
        this.u = true;
        eon eonVar = this.t;
        if (eonVar != null) {
            eonVar.destroy();
        }
        eon eonVar2 = new eon(this);
        this.t = eonVar2;
        String B = this.b.B();
        String t = this.b.t();
        amr amrVar = this.b;
        String str4 = amrVar.n;
        String str5 = amrVar.p;
        String str6 = amrVar.e;
        String str7 = amrVar.f;
        String str8 = amrVar.q;
        String str9 = amrVar.r;
        String jSONString = amrVar.t.toJSONString();
        amr amrVar2 = this.b;
        eonVar2.L(B, t, str4, str5, str6, str7, str8, str9, jSONString, amrVar2.m, amrVar2.D(), str, str2, str3, false);
    }

    @Override // tb.jw1
    public void h() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e322dc8", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.d.getJSONArray("cardInfoList");
        this.o = new ArrayList();
        N(jSONArray);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f22251a).inflate(R.layout.taolive_recommend_pop_list_layout_flexalocal, (ViewGroup) null);
        this.n = viewGroup;
        if (viewGroup != null) {
            FrameLayout frameLayout = new FrameLayout(this.f22251a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (vc.i(this.f22251a) || vc.e(this.f22251a)) {
                i = nw0.d(this.f22251a, 588.0f);
            } else {
                i = (int) (nw0.g() * 0.725d);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
            layoutParams.gravity = 80;
            frameLayout.addView(this.n, layoutParams);
            this.c.addView(frameLayout);
            frameLayout.setOnClickListener(new a());
            this.n.setOnClickListener(new b(this));
            RecommendRecyclerView recommendRecyclerView = (RecommendRecyclerView) this.n.findViewById(R.id.recommend_pop_list_recycler);
            this.p = recommendRecyclerView;
            recommendRecyclerView.setLayoutManager(new GridLayoutManager(this.f22251a, 2));
            RecommendRecyclerView recommendRecyclerView2 = this.p;
            ItemListPopAdapter itemListPopAdapter = new ItemListPopAdapter();
            this.q = itemListPopAdapter;
            recommendRecyclerView2.setAdapter(itemListPopAdapter);
            this.p.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/ListItemPopView$3");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
                        return;
                    }
                    int d2 = nw0.d(ListItemPopView.this.f22251a, 3.0f);
                    rect.set(d2, d2, d2, d2);
                }
            });
            this.p.setLoadMoreListener(new c());
            JSONObject jSONObject = this.d.getJSONObject("displayStyleExtend");
            if (jSONObject != null) {
                AliUrlImageView aliUrlImageView = (AliUrlImageView) this.n.findViewById(R.id.recommend_pop_list_bg);
                aliUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                aliUrlImageView.setSkipAutoSize(true);
                aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01dy37kx1tmP7uhit7U_!!6000000005944-2-tps-1125-1371.png");
                ((TUrlImageView) this.n.findViewById(R.id.recommend_pop_list_title_img)).setImageUrl(jSONObject.getString("headTitleImgUrl"));
                ((TextView) this.n.findViewById(R.id.recommend_pop_list_title_txt_dec)).setText(jSONObject.getString("headSubtitle"));
                AliUrlImageView aliUrlImageView2 = (AliUrlImageView) this.n.findViewById(R.id.recommend_pop_list_title_close);
                aliUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                aliUrlImageView2.setSkipAutoSize(true);
                aliUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN012pDne31WbCBsgThq7_!!6000000002806-2-tps-26-26.png");
                aliUrlImageView2.setOnClickListener(new d());
                String string = jSONObject.getString("benefitIcon");
                String string2 = jSONObject.getString("benefitTitle");
                if (!TextUtils.isEmpty(string2)) {
                    ((LinearLayout) this.n.findViewById(R.id.recommend_pop_list_red_package_layout)).setVisibility(0);
                    ((TUrlImageView) this.n.findViewById(R.id.recommend_pop_list_red_package_img)).setImageUrl(string);
                    ((TextView) this.n.findViewById(R.id.recommend_pop_list_red_package_txt)).setText(string2);
                    TextView textView = (TextView) this.n.findViewById(R.id.recommend_pop_list_red_sec);
                    CountDownTimer countDownTimer = this.w;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    e eVar = new e(this, m.CONFIG_TRACK_1022_INTERVAL_TIME, 1000L, textView);
                    this.w = eVar;
                    eVar.start();
                }
            }
            this.b.Z(r(), null);
        }
    }

    @Override // tb.jw1
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.j();
        List<ListItemInfo> list = this.o;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        eon eonVar = this.t;
        if (eonVar != null) {
            eonVar.destroy();
            this.t = null;
        }
        CountDownTimer countDownTimer = this.w;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.w = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    @Override // tb.jw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo n(tb.uv5 r6) {
        /*
            r5 = this;
            r0 = 2
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "45ddda38"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r5
            r3 = 1
            r0[r3] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r0)
            com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo r6 = (com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo) r6
            return r6
        L_0x0018:
            java.lang.Object[] r6 = r6.f29630a
            int r1 = r6.length
            java.lang.String r2 = ""
            r3 = 4
            if (r1 <= r3) goto L_0x0029
            r1 = r6[r3]
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x0029
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            int r3 = r6.length
            if (r3 <= r0) goto L_0x0036
            r6 = r6[r0]
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0036
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
        L_0x0036:
            java.util.List<com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView$ListItemInfo> r6 = r5.o
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x003e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r6.next()
            com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView$ListItemInfo r0 = (com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.ListItemInfo) r0
            java.lang.String r3 = r0.itemId
            boolean r3 = android.text.TextUtils.equals(r1, r3)
            if (r3 != 0) goto L_0x0062
            com.alibaba.fastjson.JSONObject r3 = r0.card
            if (r3 == 0) goto L_0x003e
            java.lang.String r4 = "detailUrl"
            java.lang.String r3 = r3.getString(r4)
            boolean r3 = android.text.TextUtils.equals(r2, r3)
            if (r3 == 0) goto L_0x003e
        L_0x0062:
            return r0
        L_0x0063:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView.n(tb.uv5):com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo");
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            this.v = true;
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if (!(!(netBaseOutDo instanceof MtopTbliveRecommendPopviewQueryResponse) || (data = ((MtopTbliveRecommendPopviewQueryResponse) netBaseOutDo).getData()) == null || this.c == null)) {
            JSONArray jSONArray = data.getJSONArray("cardInfoList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                this.v = true;
            } else {
                N(jSONArray);
                this.q.notifyDataSetChanged();
                this.v = false;
            }
        }
        this.u = false;
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            this.v = true;
        }
    }

    @Override // tb.jw1
    public View p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.jw1
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9b29a2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.jw1
    public void y(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e111022", new Object[]{this, str, obj});
        }
    }
}
