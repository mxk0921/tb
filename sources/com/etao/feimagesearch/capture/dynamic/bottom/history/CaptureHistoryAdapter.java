package com.etao.feimagesearch.capture.dynamic.bottom.history;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumView;
import com.etao.feimagesearch.capture.dynamic.musvh.PltMusCellViewHolder;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.history.object.ScanDo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.a07;
import tb.caa;
import tb.ckf;
import tb.cxc;
import tb.g1a;
import tb.p1p;
import tb.r7m;
import tb.t2o;
import tb.u53;
import tb.uu6;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureHistoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String ICON_BAR_CODE = "https://img.alicdn.com/imgextra/i2/O1CN01sjR7EP1ZpnrQ6Rzz7_!!6000000003244-49-tps-112-112.webp";
    public static final String ICON_QR_CODE = "https://img.alicdn.com/imgextra/i2/O1CN01Z22Tpy1DrFZ6SQwfC_!!6000000000269-49-tps-112-112.webp";
    public static final String ICON_TAOBAO_CODE = "https://img.alicdn.com/imgextra/i2/O1CN01Cxg8l41vZF5Nx7pVr_!!6000000006186-49-tps-112-112.webp";
    public static final int QR_CODE_TYPE_TEXT = 2;
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_MUS = 2;
    public static final int TYPE_TIME = 1;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4651a;
    public final int b;
    public final boolean c;
    public final g1a<? super AuctionItemVO, xhv> d;
    public final g1a<? super ScanDo, xhv> e;
    public final g1a<? super cxc, xhv> f;
    public r7m k;
    public final List<Object> j = new ArrayList();
    public final List<Object> l = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class CaptureHistoryItemViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View f4652a;
        public final TUrlImageView b;
        public final ImageView c;
        public final View d;
        public final TUrlImageView e;
        public final TextView f;

        static {
            t2o.a(481296587);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureHistoryItemViewHolder(View view, int i, boolean z) {
            super(view);
            ckf.g(view, "itemView");
            View findViewById = view.findViewById(R.id.fl_pic_container);
            ckf.f(findViewById, "itemView.findViewById(R.id.fl_pic_container)");
            this.f4652a = findViewById;
            View findViewById2 = view.findViewById(R.id.iv_history);
            ckf.f(findViewById2, "itemView.findViewById(R.id.iv_history)");
            this.b = (TUrlImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.iv_hint);
            ckf.f(findViewById3, "itemView.findViewById(R.id.iv_hint)");
            this.c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ll_code_container);
            ckf.f(findViewById4, "itemView.findViewById(R.id.ll_code_container)");
            this.d = findViewById4;
            View findViewById5 = view.findViewById(R.id.iv_scan_hint);
            ckf.f(findViewById5, "itemView.findViewById(R.id.iv_scan_hint)");
            this.e = (TUrlImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tv_scan_title);
            ((TextView) findViewById6).setTextSize(1, z ? 16.0f : 12.0f);
            ckf.f(findViewById6, "itemView.findViewById<Te…lder) 16f else 12f)\n    }");
            this.f = (TextView) findViewById6;
            view.setTag("pic");
            int h = (caa.h(caa.c()) - ((i - 1) * CaptureAlbumView.Companion.a())) / i;
            view.getLayoutParams().width = h;
            view.getLayoutParams().height = h;
        }

        public static /* synthetic */ Object ipc$super(CaptureHistoryItemViewHolder captureHistoryItemViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryAdapter$CaptureHistoryItemViewHolder");
        }

        public final View b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("41a203e7", new Object[]{this});
            }
            return this.d;
        }

        public final ImageView c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageView) ipChange.ipc$dispatch("9c4aa01f", new Object[]{this});
            }
            return this.c;
        }

        public final TUrlImageView d0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("cc04498a", new Object[]{this});
            }
            return this.b;
        }

        public final View e0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("1e7a79d6", new Object[]{this});
            }
            return this.f4652a;
        }

        public final TUrlImageView f0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("d69c754e", new Object[]{this});
            }
            return this.e;
        }

        public final TextView g0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("a3df9237", new Object[]{this});
            }
            return this.f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class CaptureHistoryTimeViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f4653a;

        static {
            t2o.a(481296588);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureHistoryTimeViewHolder(View view, boolean z) {
            super(view);
            ckf.g(view, "itemView");
            View findViewById = view.findViewById(R.id.tv_time);
            ((TextView) findViewById).setTextSize(1, z ? 20.0f : 16.0f);
            ckf.f(findViewById, "itemView.findViewById<Te…lder) 20f else 16f)\n    }");
            this.f4653a = (TextView) findViewById;
        }

        public static /* synthetic */ Object ipc$super(CaptureHistoryTimeViewHolder captureHistoryTimeViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryAdapter$CaptureHistoryTimeViewHolder");
        }

        public final TextView b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("b2bf4fa0", new Object[]{this});
            }
            return this.f4653a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296589);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ScanDo b;

        public b(ScanDo scanDo) {
            this.b = scanDo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            g1a<ScanDo, xhv> N = CaptureHistoryAdapter.this.N();
            if (N != null) {
                N.invoke(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AuctionItemVO b;

        public c(AuctionItemVO auctionItemVO) {
            this.b = auctionItemVO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            g1a<AuctionItemVO, xhv> O = CaptureHistoryAdapter.this.O();
            if (O != null) {
                O.invoke(this.b);
            }
        }
    }

    static {
        t2o.a(481296586);
    }

    public CaptureHistoryAdapter(Activity activity, int i, boolean z, g1a<? super AuctionItemVO, xhv> g1aVar, g1a<? super ScanDo, xhv> g1aVar2, g1a<? super cxc, xhv> g1aVar3) {
        ckf.g(activity, "activity");
        this.f4651a = activity;
        this.b = i;
        this.c = z;
        this.d = g1aVar;
        this.e = g1aVar2;
        this.f = g1aVar3;
    }

    public static /* synthetic */ Object ipc$super(CaptureHistoryAdapter captureHistoryAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 430758011) {
            super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/bottom/history/CaptureHistoryAdapter");
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
            return;
        }
        ((ArrayList) this.j).clear();
        ((ArrayList) this.l).clear();
        this.k = null;
        notifyDataSetChanged();
    }

    public final g1a<ScanDo, xhv> N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("150d7bb2", new Object[]{this});
        }
        return this.e;
    }

    public final g1a<AuctionItemVO, xhv> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("32e882bc", new Object[]{this});
        }
        return this.d;
    }

    public final int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a1c2e29", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final void S(CaptureHistoryItemViewHolder captureHistoryItemViewHolder, AuctionItemVO auctionItemVO) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e592042c", new Object[]{this, captureHistoryItemViewHolder, auctionItemVO});
            return;
        }
        captureHistoryItemViewHolder.e0().setVisibility(0);
        captureHistoryItemViewHolder.b0().setVisibility(8);
        if (auctionItemVO.isVideo) {
            captureHistoryItemViewHolder.c0().setVisibility(0);
            ImageView c0 = captureHistoryItemViewHolder.c0();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#99000000"));
            c0.setBackground(gradientDrawable);
            captureHistoryItemViewHolder.c0().setImageResource(R.drawable.feis_ic_history_video_hint);
            captureHistoryItemViewHolder.d0().setImageUrl(auctionItemVO.picPath.toString());
        } else {
            captureHistoryItemViewHolder.d0().setImageUrl(auctionItemVO.picPath.toString(), "180x180");
            captureHistoryItemViewHolder.c0().setVisibility(8);
        }
        ViewProxy.setOnClickListener(captureHistoryItemViewHolder.itemView, new c(auctionItemVO));
        String c2 = uu6.c(uu6.INSTANCE.b(), auctionItemVO.timeStr);
        View view = captureHistoryItemViewHolder.itemView;
        StringBuilder sb = new StringBuilder();
        if (auctionItemVO.isVideo) {
            i = R.string.taobao_app_1007_item_video;
        } else {
            i = R.string.taobao_app_1007_item_image;
        }
        sb.append(Localization.q(i));
        sb.append((char) 65292);
        if (TextUtils.isEmpty(c2)) {
            c2 = Localization.q(R.string.taobao_app_1007_unknown_time);
        }
        sb.append((Object) c2);
        sb.append((char) 65292);
        sb.append(Localization.q(R.string.taobao_app_1007_visit));
        view.setContentDescription(sb.toString());
    }

    public final void T(r7m r7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4660064b", new Object[]{this, r7mVar});
            return;
        }
        ckf.g(r7mVar, "allowanceData");
        if (this.k == null && !((ArrayList) this.l).isEmpty()) {
            this.k = r7mVar;
            ((ArrayList) this.j).clear();
            ((ArrayList) this.j).addAll(U(this.l, r7mVar));
            notifyDataSetChanged();
        }
    }

    public final void V(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c1301d", new Object[]{this, list});
            return;
        }
        ckf.g(list, "targetData");
        if (!list.isEmpty()) {
            ((ArrayList) this.l).clear();
            ((ArrayList) this.l).addAll(list);
            ((ArrayList) this.j).clear();
            ((ArrayList) this.j).addAll(U(this.l, this.k));
            notifyDataSetChanged();
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47d822e", new Object[]{this});
            return;
        }
        r7m r7mVar = this.k;
        if (r7mVar != null) {
            ((ArrayList) this.j).remove(r7mVar);
            notifyDataSetChanged();
            this.k = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.j).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Object obj = ((ArrayList) this.j).get(i);
        if (obj instanceof String) {
            return 1;
        }
        if (obj instanceof r7m) {
            return 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        ckf.g(viewHolder, "holder");
        if (viewHolder instanceof CaptureHistoryTimeViewHolder) {
            CaptureHistoryTimeViewHolder captureHistoryTimeViewHolder = (CaptureHistoryTimeViewHolder) viewHolder;
            Object obj = ((ArrayList) this.j).get(captureHistoryTimeViewHolder.getAdapterPosition());
            if (obj instanceof String) {
                captureHistoryTimeViewHolder.b0().setText((CharSequence) obj);
            }
        } else if (viewHolder instanceof PltMusCellViewHolder) {
            PltMusCellViewHolder pltMusCellViewHolder = (PltMusCellViewHolder) viewHolder;
            Object obj2 = ((ArrayList) this.j).get(pltMusCellViewHolder.getAdapterPosition());
            if (obj2 instanceof r7m) {
                pltMusCellViewHolder.b0(pltMusCellViewHolder.getAdapterPosition(), (r7m) obj2);
            }
        } else {
            viewHolder.itemView.setTag("item");
            Object obj3 = ((ArrayList) this.j).get(viewHolder.getAdapterPosition());
            if (obj3 instanceof u53) {
                Object a2 = ((u53) obj3).a();
                if (a2 instanceof AuctionItemVO) {
                    S((CaptureHistoryItemViewHolder) viewHolder, (AuctionItemVO) a2);
                } else if (a2 instanceof ScanDo) {
                    Q((CaptureHistoryItemViewHolder) viewHolder, (ScanDo) a2);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            return;
        }
        ckf.g(viewHolder, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof PltMusCellViewHolder) {
            ((PltMusCellViewHolder) viewHolder).e0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            return;
        }
        ckf.g(viewHolder, "holder");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof PltMusCellViewHolder) {
            ((PltMusCellViewHolder) viewHolder).f0();
        }
    }

    public final List<Object> U(List<Object> list, r7m r7mVar) {
        long j;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("216a1e40", new Object[]{this, list, r7mVar});
        }
        if (r7mVar == null) {
            return list;
        }
        Iterator<Object> it = list.iterator();
        int i2 = 1;
        while (true) {
            if (!it.hasNext()) {
                j = -1;
                break;
            }
            Object next = it.next();
            if (!(next instanceof String)) {
                if (next instanceof u53) {
                    Object a2 = ((u53) next).a();
                    if (a2 instanceof AuctionItemVO) {
                        AuctionItemVO auctionItemVO = (AuctionItemVO) a2;
                        if (auctionItemVO.hasAllowance()) {
                            Long l = auctionItemVO.timeStr;
                            ckf.f(l, "historyItem.timeStr");
                            j = l.longValue();
                            break;
                        }
                    }
                }
                i2++;
            }
            i++;
        }
        if (!uu6.e(Long.valueOf(j))) {
            return list;
        }
        int i3 = this.b;
        int i4 = i2 % i3;
        if (i4 == 0) {
            i++;
        } else {
            int i5 = (i3 - i4) + 1;
            if (1 <= i5) {
                int i6 = 1;
                while (true) {
                    i6++;
                    i++;
                    if (i > list.size() - 1 || (list.get(i) instanceof String) || i6 == i5) {
                        break;
                    }
                }
            }
            i3 = i4;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "spanCount", (String) Integer.valueOf(P()));
        jSONObject.put((JSONObject) "locateIndex", (String) Integer.valueOf(i3));
        r7mVar.e(jSONObject);
        if (i > list.size()) {
            list.add(r7mVar);
        } else {
            list.add(i, r7mVar);
        }
        return list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (i == 1) {
            View inflate = LayoutInflater.from(this.f4651a).inflate(R.layout.feis_item_history_time, viewGroup, false);
            ckf.f(inflate, "from(activity).inflate(R…tory_time, parent, false)");
            return new CaptureHistoryTimeViewHolder(inflate, this.c);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(this.f4651a).inflate(R.layout.feis_item_history, viewGroup, false);
            ckf.f(inflate2, "from(activity).inflate(\n…parent, false\n          )");
            return new CaptureHistoryItemViewHolder(inflate2, this.b, this.c);
        } else {
            PltMusCellViewHolder pltMusCellViewHolder = new PltMusCellViewHolder(this.f4651a, viewGroup, this.c);
            g1a<? super cxc, xhv> g1aVar = this.f;
            if (g1aVar == null) {
                return pltMusCellViewHolder;
            }
            g1aVar.invoke(pltMusCellViewHolder);
            return pltMusCellViewHolder;
        }
    }

    public final void Q(CaptureHistoryItemViewHolder captureHistoryItemViewHolder, ScanDo scanDo) {
        URL url;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01dd1f5", new Object[]{this, captureHistoryItemViewHolder, scanDo});
            return;
        }
        ViewProxy.setOnClickListener(captureHistoryItemViewHolder.itemView, new b(scanDo));
        String c2 = uu6.c(uu6.INSTANCE.b(), Long.valueOf(scanDo.getTime()));
        View view = captureHistoryItemViewHolder.itemView;
        StringBuilder sb = new StringBuilder();
        sb.append(Localization.q(R.string.taobao_app_1007_code_link));
        sb.append((char) 65292);
        if (TextUtils.isEmpty(c2)) {
            c2 = Localization.q(R.string.taobao_app_1007_unknown_time);
        }
        sb.append((Object) c2);
        sb.append((char) 65292);
        sb.append(Localization.q(R.string.taobao_app_1007_visit));
        view.setContentDescription(sb.toString());
        if (scanDo.getType() == 4) {
            captureHistoryItemViewHolder.e0().setVisibility(8);
            captureHistoryItemViewHolder.b0().setVisibility(0);
            ViewGroup.LayoutParams layoutParams = captureHistoryItemViewHolder.f0().getLayoutParams();
            int a2 = p1p.a(25.0f);
            layoutParams.height = a2;
            layoutParams.width = a2;
            captureHistoryItemViewHolder.f0().setLayoutParams(layoutParams);
            captureHistoryItemViewHolder.g0().setText(Localization.q(R.string.taobao_app_1007_1_18969));
            captureHistoryItemViewHolder.f0().setImageUrl(ICON_BAR_CODE);
        } else if (scanDo.getType() == 1) {
            if (scanDo.getProduct() == null || TextUtils.isEmpty(scanDo.getProduct().getPic())) {
                captureHistoryItemViewHolder.e0().setVisibility(8);
                captureHistoryItemViewHolder.b0().setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = captureHistoryItemViewHolder.f0().getLayoutParams();
                layoutParams2.height = p1p.a(20.0f);
                layoutParams2.width = p1p.a(36.0f);
                captureHistoryItemViewHolder.f0().setLayoutParams(layoutParams2);
                captureHistoryItemViewHolder.f0().setImageUrl(ICON_BAR_CODE);
                TextView g0 = captureHistoryItemViewHolder.g0();
                if (TextUtils.isEmpty(scanDo.getTitle())) {
                    str = Localization.q(R.string.taobao_app_1007_1_18912);
                } else {
                    str = scanDo.getLocalizationTitle();
                }
                g0.setText(str);
                return;
            }
            captureHistoryItemViewHolder.e0().setVisibility(0);
            captureHistoryItemViewHolder.b0().setVisibility(8);
            captureHistoryItemViewHolder.c0().setVisibility(0);
            ImageView c0 = captureHistoryItemViewHolder.c0();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#99000000"));
            c0.setBackground(gradientDrawable);
            captureHistoryItemViewHolder.c0().setImageResource(R.drawable.feis_ic_scan_hint);
            captureHistoryItemViewHolder.d0().setImageUrl(scanDo.getProduct().getPic());
        } else if (scanDo.getType() == 2 || scanDo.getType() == 3) {
            captureHistoryItemViewHolder.e0().setVisibility(8);
            captureHistoryItemViewHolder.b0().setVisibility(0);
            ViewGroup.LayoutParams layoutParams3 = captureHistoryItemViewHolder.f0().getLayoutParams();
            int a3 = p1p.a(29.0f);
            layoutParams3.height = a3;
            layoutParams3.width = a3;
            captureHistoryItemViewHolder.f0().setLayoutParams(layoutParams3);
            if (scanDo.getType() == 3) {
                captureHistoryItemViewHolder.g0().setText(Localization.q(R.string.taobao_app_1007_1_18946));
                captureHistoryItemViewHolder.f0().setImageUrl(ICON_TAOBAO_CODE);
            }
            if (scanDo.getImage() == 2) {
                captureHistoryItemViewHolder.g0().setText(Localization.q(R.string.taobao_app_1007_1_18951));
                captureHistoryItemViewHolder.f0().setImageUrl(ICON_QR_CODE);
                return;
            }
            try {
                url = new URL(scanDo.getLink());
            } catch (Exception unused) {
                url = null;
            }
            if (url == null) {
                captureHistoryItemViewHolder.g0().setText(Localization.q(R.string.taobao_app_1007_1_18930));
                captureHistoryItemViewHolder.f0().setImageUrl(ICON_QR_CODE);
                return;
            }
            String link = scanDo.getLink();
            ckf.f(link, "item.link");
            if (wsq.O(link, "taobao", false, 2, null)) {
                captureHistoryItemViewHolder.g0().setText(url.getPath());
                captureHistoryItemViewHolder.f0().setImageUrl(ICON_TAOBAO_CODE);
                return;
            }
            captureHistoryItemViewHolder.g0().setText(scanDo.getLink());
            captureHistoryItemViewHolder.f0().setImageUrl(ICON_QR_CODE);
        } else {
            captureHistoryItemViewHolder.e0().setVisibility(8);
            captureHistoryItemViewHolder.b0().setVisibility(0);
            ViewGroup.LayoutParams layoutParams4 = captureHistoryItemViewHolder.f0().getLayoutParams();
            int a4 = p1p.a(25.0f);
            layoutParams4.height = a4;
            layoutParams4.width = a4;
            captureHistoryItemViewHolder.f0().setLayoutParams(layoutParams4);
            captureHistoryItemViewHolder.f0().setImageUrl(ICON_QR_CODE);
            if (TextUtils.isEmpty(scanDo.getLink())) {
                captureHistoryItemViewHolder.g0().setText(Localization.q(R.string.taobao_app_1007_1_18930));
            } else {
                captureHistoryItemViewHolder.g0().setText(scanDo.getLink());
            }
        }
    }
}
