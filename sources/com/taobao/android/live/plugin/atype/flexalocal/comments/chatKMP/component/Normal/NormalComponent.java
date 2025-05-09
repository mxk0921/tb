package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.SpaceItemDecoration;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.ChatMenuItem;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.ChatMenuPopupWindow;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.adapter.KMPCommentListAdapter;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentType;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentTrack;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ccc;
import tb.d9m;
import tb.f3c;
import tb.fzf;
import tb.giv;
import tb.hp3;
import tb.hw0;
import tb.i2o;
import tb.jyw;
import tb.jzf;
import tb.kj2;
import tb.liv;
import tb.mde;
import tb.nh4;
import tb.nof;
import tb.o3s;
import tb.os1;
import tb.p44;
import tb.q2o;
import tb.qf1;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.x0d;
import tb.x6k;
import tb.yj4;
import tb.yne;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NormalComponent extends os1 implements s3c, ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public i2o A;
    public Handler B;
    public final ITaoLiveKtCommentTrack D;
    public LinearLayout j;
    public RecyclerView k;
    public RecyclerView.ItemDecoration l;
    public KMPCommentListAdapter m;
    public LinearLayoutManager n;
    public final jzf p;
    public int r;
    public LinearLayout t;
    public x0d u;
    public mde v;
    public fzf w;
    public int o = 0;
    public final AtomicInteger q = new AtomicInteger(0);
    public int s = 0;
    public boolean x = false;
    public boolean y = true;
    public boolean z = true;
    public boolean C = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements nof {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(View view, fzf fzfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a7cc356", new Object[]{this, view, fzfVar});
            } else {
                NormalComponent.k(NormalComponent.this, view, fzfVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements yne {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.yne
        public void a(List<fzf> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97158b76", new Object[]{this, list, new Long(j)});
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                fzf fzfVar = list.get(i);
                NormalComponent.l(NormalComponent.this).M(fzfVar);
                NormalComponent.w(NormalComponent.this);
                NormalComponent normalComponent = NormalComponent.this;
                NormalComponent.y(normalComponent, NormalComponent.z(normalComponent).incrementAndGet());
                if (NormalComponent.A(NormalComponent.this) == null || !NormalComponent.B(NormalComponent.this).h) {
                    if (!NormalComponent.C(NormalComponent.this) && NormalComponent.x(NormalComponent.this) == p44.b) {
                        NormalComponent.D(NormalComponent.this, true);
                        NormalComponent.E(NormalComponent.this).showNoticesIfNeeded();
                    }
                    NormalComponent.F(NormalComponent.this, fzfVar.f19644a);
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r7 != 3) goto L_0x005e;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            /*
                r6 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                r3 = 3
                com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.c.$ipChange
                boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r5 == 0) goto L_0x001f
                java.lang.String r5 = "d4aa3aa4"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r6
                r3[r1] = r7
                r3[r0] = r8
                java.lang.Object r7 = r4.ipc$dispatch(r5, r3)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                return r7
            L_0x001f:
                int r7 = r8.getAction()
                if (r7 == 0) goto L_0x0059
                if (r7 == r1) goto L_0x002c
                if (r7 == r0) goto L_0x0059
                if (r7 == r3) goto L_0x002c
                goto L_0x005e
            L_0x002c:
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.this
                androidx.recyclerview.widget.LinearLayoutManager r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.o(r7)
                int r7 = r7.findLastVisibleItemPosition()
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent r8 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.this
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.adapter.KMPCommentListAdapter r8 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.l(r8)
                int r8 = r8.getItemCount()
                int r8 = r8 - r1
                if (r7 != r8) goto L_0x004e
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.this
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.u(r7, r1)
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.this
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.p(r7)
                goto L_0x005e
            L_0x004e:
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.this
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.u(r7, r2)
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.this
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.v(r7, r2)
                goto L_0x005e
            L_0x0059:
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent r7 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.this
                com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.u(r7, r2)
            L_0x005e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    static {
        t2o.a(295698646);
        t2o.a(806355016);
        t2o.a(806356161);
    }

    public NormalComponent(Context context, View view, ux9 ux9Var) {
        super(context, view, ux9Var);
        Q();
        this.p = new jzf(ux9Var, context);
        if (d9m.f() != null) {
            this.D = d9m.f().getCommentTracker();
        }
    }

    public static /* synthetic */ hp3 A(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hp3) ipChange.ipc$dispatch("23bc5abb", new Object[]{normalComponent});
        }
        return normalComponent.i;
    }

    public static /* synthetic */ hp3 B(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hp3) ipChange.ipc$dispatch("e5bac2bc", new Object[]{normalComponent});
        }
        return normalComponent.i;
    }

    public static /* synthetic */ boolean C(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a19e34df", new Object[]{normalComponent})).booleanValue();
        }
        return normalComponent.C;
    }

    public static /* synthetic */ boolean D(NormalComponent normalComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99385f5f", new Object[]{normalComponent, new Boolean(z)})).booleanValue();
        }
        normalComponent.C = z;
        return z;
    }

    public static /* synthetic */ x0d E(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x0d) ipChange.ipc$dispatch("f4fdb913", new Object[]{normalComponent});
        }
        return normalComponent.u;
    }

    public static /* synthetic */ void F(NormalComponent normalComponent, TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4e7900", new Object[]{normalComponent, taoLiveKtCommentEntity});
        } else {
            normalComponent.G(taoLiveKtCommentEntity);
        }
    }

    public static /* synthetic */ void V(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983a4de3", new Object[]{view, drawable});
        } else {
            view.setBackground(drawable);
        }
    }

    public static /* synthetic */ Object ipc$super(NormalComponent normalComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1761213999:
                super.c((TaoLiveKtCommentEntity) objArr[0]);
                return null;
            case -962057402:
                super.e((TBLiveDataModel) objArr[0]);
                return null;
            case -369075781:
                super.d((hp3) objArr[0]);
                return null;
            case 668633093:
                super.a();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalComponent");
        }
    }

    public static /* synthetic */ void k(NormalComponent normalComponent, View view, fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72101e35", new Object[]{normalComponent, view, fzfVar});
        } else {
            normalComponent.c0(view, fzfVar);
        }
    }

    public static /* synthetic */ KMPCommentListAdapter l(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPCommentListAdapter) ipChange.ipc$dispatch("9e44f7ec", new Object[]{normalComponent});
        }
        return normalComponent.m;
    }

    public static /* synthetic */ int m(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2004d66", new Object[]{normalComponent})).intValue();
        }
        return normalComponent.o;
    }

    public static /* synthetic */ int n(NormalComponent normalComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("951919e5", new Object[]{normalComponent, new Integer(i)})).intValue();
        }
        normalComponent.o = i;
        return i;
    }

    public static /* synthetic */ LinearLayoutManager o(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayoutManager) ipChange.ipc$dispatch("6171aebb", new Object[]{normalComponent});
        }
        return normalComponent.n;
    }

    public static /* synthetic */ void p(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd9c7b1", new Object[]{normalComponent});
        } else {
            normalComponent.M();
        }
    }

    public static /* synthetic */ boolean q(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa4684d4", new Object[]{normalComponent})).booleanValue();
        }
        return normalComponent.H();
    }

    public static /* synthetic */ int r(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67b341e2", new Object[]{normalComponent})).intValue();
        }
        return normalComponent.s;
    }

    public static /* synthetic */ boolean s(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51fff12", new Object[]{normalComponent})).booleanValue();
        }
        return normalComponent.x;
    }

    public static /* synthetic */ Handler t(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4fa82179", new Object[]{normalComponent});
        }
        return normalComponent.B;
    }

    public static /* synthetic */ boolean u(NormalComponent normalComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5645a90e", new Object[]{normalComponent, new Boolean(z)})).booleanValue();
        }
        normalComponent.y = z;
        return z;
    }

    public static /* synthetic */ boolean v(NormalComponent normalComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96708fcf", new Object[]{normalComponent, new Boolean(z)})).booleanValue();
        }
        normalComponent.z = z;
        return z;
    }

    public static /* synthetic */ void w(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7e8340", new Object[]{normalComponent});
        } else {
            normalComponent.n0();
        }
    }

    public static /* synthetic */ int x(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebeb4052", new Object[]{normalComponent})).intValue();
        }
        return normalComponent.r;
    }

    public static /* synthetic */ int y(NormalComponent normalComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("988c8479", new Object[]{normalComponent, new Integer(i)})).intValue();
        }
        normalComponent.r = i;
        return i;
    }

    public static /* synthetic */ AtomicInteger z(NormalComponent normalComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("f5e042e8", new Object[]{normalComponent});
        }
        return normalComponent.q;
    }

    public final void G(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329042d", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        ITaoLiveKtCommentTrack iTaoLiveKtCommentTrack = this.D;
        if (iTaoLiveKtCommentTrack != null) {
            iTaoLiveKtCommentTrack.addDisplayedComment(taoLiveKtCommentEntity);
        }
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("111b135d", new Object[]{this})).booleanValue();
        }
        if ("2".equals(this.d.mVideoInfo.roomStatus) || this.s <= 3) {
            return false;
        }
        return true;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147a50bf", new Object[]{this});
            return;
        }
        ITaoLiveKtCommentTrack iTaoLiveKtCommentTrack = this.D;
        if (iTaoLiveKtCommentTrack != null) {
            iTaoLiveKtCommentTrack.exposeAllDisplayedComment();
        }
    }

    public final Drawable J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("b3eba183", new Object[]{this});
        }
        if (nh4.v()) {
            return this.b.getResources().getDrawable(R.drawable.taolive_comment_denoise_to_new_bg_flexalocal);
        }
        return this.b.getResources().getDrawable(R.drawable.taolive_comment_bg_new_anchor_reply_flexalocal);
    }

    public void K(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32140d68", new Object[]{this, obj});
        } else if (obj instanceof fzf) {
            fzf fzfVar = (fzf) obj;
            this.m.M(fzfVar);
            this.r = this.q.incrementAndGet();
            if (fzfVar.d()) {
                this.s = this.r;
                this.w = fzfVar;
            }
            f0();
        }
    }

    public void L(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d301a388", new Object[]{this, obj});
        } else if (obj instanceof fzf) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((fzf) obj);
            this.p.d(arrayList, this.h, new yne() { // from class: tb.v6k
                @Override // tb.yne
                public final void a(List list, long j) {
                    NormalComponent.this.R(list, j);
                }
            });
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da5e4a", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d313033b", new Object[]{this});
            return;
        }
        this.k = (RecyclerView) this.f25609a.findViewById(R.id.message_recyclerview);
        this.j = (LinearLayout) this.f25609a.findViewById(R.id.message_list_container);
        g0();
        i0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.b);
        this.n = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.n.setStackFromEnd(true);
        this.n.setInitialPrefetchItemCount(5);
        this.k.setLayoutManager(this.n);
        new NormalItemAnimator().setMoveDuration(16L);
        this.k.setItemAnimator(new NormalItemAnimator());
        this.k.setRecycledViewPool(this.c.j().e());
        this.k.setItemViewCacheSize(0);
        SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(hw0.b(this.b, 3.0f), 1);
        this.l = spaceItemDecoration;
        this.k.addItemDecoration(spaceItemDecoration);
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10e21a7", new Object[]{this});
            return;
        }
        q2o q2oVar = new q2o();
        if (giv.c().b()) {
            q2oVar.f26466a = "diantao";
        } else {
            q2oVar.f26466a = "taobao";
        }
        this.A = new i2o(this.b, q2oVar, this.c);
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9d8a18", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f25609a.findViewById(R.id.message_to_new_msg_container);
        this.t = linearLayout;
        linearLayout.setBackground(J());
        TUrlImageView tUrlImageView = (TUrlImageView) this.f25609a.findViewById(R.id.taolive_chat_new_msg_arrow);
        if (nh4.v()) {
            tUrlImageView.setVisibility(8);
            ((TextView) this.f25609a.findViewById(R.id.message_to_new_msg_text)).setTextColor(this.b.getResources().getColor(R.color.tao_live_room_chat_to_new_msg_color));
        } else {
            tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01vomWdC1WX4f1bX6j4_!!6000000002797-2-tps-24-24.png");
        }
        this.t.setOnClickListener(new View.OnClickListener() { // from class: tb.t6k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NormalComponent.this.S(view);
            }
        });
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        N();
        P();
    }

    public final /* synthetic */ void R(List list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6320588", new Object[]{this, list, new Long(j)});
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.m.M((fzf) it.next());
            f0();
        }
    }

    public final /* synthetic */ void S(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80a117", new Object[]{this, view});
            return;
        }
        M();
        if (this.k != null) {
            f0();
        }
        if (giv.f() != null) {
            giv.f().m(this.c, "Comment_BackNew", new HashMap());
        }
    }

    public final /* synthetic */ void T(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad823c9", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("inputtype", "response");
        hashMap.put("replied_comment_id", taoLiveKtCommentEntity.getCommentId());
        hashMap.put("replied_comment_nick", taoLiveKtCommentEntity.getName());
        f3c h = this.c.h();
        String str = kj2.c;
        ux9 ux9Var = this.c;
        h.c(str, hashMap, ux9Var == null ? null : ux9Var.C());
    }

    public final /* synthetic */ void U(TaoLiveKtCommentEntity taoLiveKtCommentEntity, ChatMenuItem chatMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d547fb96", new Object[]{this, taoLiveKtCommentEntity, chatMenuItem});
            return;
        }
        int i = chatMenuItem.position;
        if (i == 0) {
            a0(taoLiveKtCommentEntity);
        } else if (i == 1) {
            Y(taoLiveKtCommentEntity);
        } else if (i == 2) {
            Z(taoLiveKtCommentEntity);
        }
        m0(chatMenuItem);
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cabe2d", new Object[]{this});
        } else {
            this.k.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.3
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
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/Normal/NormalComponent$3");
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
                    NormalComponent.n(NormalComponent.this, i);
                    if (NormalComponent.o(NormalComponent.this) != null && NormalComponent.l(NormalComponent.this) != null && NormalComponent.m(NormalComponent.this) == 0 && NormalComponent.o(NormalComponent.this).findLastVisibleItemPosition() == NormalComponent.l(NormalComponent.this).getItemCount() - 1) {
                        NormalComponent.p(NormalComponent.this);
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
                    if (NormalComponent.q(NormalComponent.this)) {
                        int findFirstVisibleItemPosition = NormalComponent.o(NormalComponent.this).findFirstVisibleItemPosition();
                        if (findFirstVisibleItemPosition == NormalComponent.r(NormalComponent.this) - 1 && !NormalComponent.s(NormalComponent.this)) {
                            NormalComponent.t(NormalComponent.this).removeMessages(2025);
                            NormalComponent.t(NormalComponent.this).sendEmptyMessageDelayed(2025, 500L);
                        } else if (nh4.f() && findFirstVisibleItemPosition == NormalComponent.r(NormalComponent.this) && !NormalComponent.s(NormalComponent.this)) {
                            NormalComponent.t(NormalComponent.this).removeMessages(2025);
                            NormalComponent.t(NormalComponent.this).sendEmptyMessage(2025);
                        }
                    }
                }
            });
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b849c83", new Object[]{this});
        } else {
            this.k.setOnTouchListener(new c());
        }
    }

    public final void Y(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf27cc7", new Object[]{this, taoLiveKtCommentEntity});
        } else if (this.b != null) {
            ((ClipboardManager) this.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", taoLiveKtCommentEntity.getContent()));
        }
    }

    public final void Z(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76148da8", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            this.A.c(taoLiveKtCommentEntity.getCommentId());
        }
    }

    @Override // tb.os1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27da8805", new Object[]{this});
            return;
        }
        super.a();
        KMPCommentListAdapter kMPCommentListAdapter = this.m;
        if (kMPCommentListAdapter != null) {
            kMPCommentListAdapter.N();
        }
        M();
        sjr.g().b(this);
        RecyclerView.ItemDecoration itemDecoration = this.l;
        if (itemDecoration != null) {
            this.k.removeItemDecoration(itemDecoration);
        }
        RecyclerView recyclerView = this.k;
        if (recyclerView != null) {
            recyclerView.swapAdapter(null, true);
        }
        jzf jzfVar = this.p;
        if (jzfVar != null) {
            jzfVar.a();
        }
        Handler handler = this.B;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        I();
    }

    public final void a0(final TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a25ab7b", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.b7k
                @Override // java.lang.Runnable
                public final void run() {
                    NormalComponent.this.T(taoLiveKtCommentEntity);
                }
            }, 200L);
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eb5420", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f);
        this.p.d(arrayList, this.h, new b());
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "NormalComponent";
    }

    @Override // tb.os1
    public void c(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970601d1", new Object[]{this, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity != null) {
            super.c(taoLiveKtCommentEntity);
            b0();
        }
    }

    public final void c0(View view, fzf fzfVar) {
        List<ChatMenuItem> list;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5faf9be6", new Object[]{this, view, fzfVar});
        } else if (fzfVar != null && fzfVar.f19644a != null) {
            TBLiveDataModel tBLiveDataModel = this.d;
            if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || TextUtils.equals(videoInfo.roomStatus, "1")) {
                TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
                if (taoLiveKtCommentEntity.getCommentId() != null) {
                    if ((taoLiveKtCommentEntity.getCommentType() != null && (taoLiveKtCommentEntity.getCommentType().equals(TaoLiveKtCommentType.TopWelcome) || taoLiveKtCommentEntity.getCommentType().equals(TaoLiveKtCommentType.Notice))) || taoLiveKtCommentEntity.getCommentId().equals("0")) {
                        return;
                    }
                    if (taoLiveKtCommentEntity.enhancedTypeValue().isEmpty() || !this.c.c) {
                        if (!taoLiveKtCommentEntity.enhancedTypeValue().isEmpty() && !TextUtils.equals(taoLiveKtCommentEntity.enhancedTypeValue(), "favorHighlightComment")) {
                            list = p44.d(this.c.c);
                        } else if (!TextUtils.isEmpty(taoLiveKtCommentEntity.getCommentId())) {
                            list = p44.c(this.c.c);
                        } else {
                            return;
                        }
                        if (list != null && !list.isEmpty()) {
                            d0(view, list, taoLiveKtCommentEntity);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            o3s.b("NormalComponent", "onItemLongClick not in live");
        }
    }

    @Override // tb.os1
    public void d(hp3 hp3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0059bb", new Object[]{this, hp3Var});
            return;
        }
        super.d(hp3Var);
        hp3 hp3Var2 = this.i;
        if (hp3Var2 != null) {
            if (hp3Var2.g) {
                M();
            }
            if (this.i.h) {
                Handler handler = this.B;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } else if (!this.C) {
                this.C = true;
                this.u.showNoticesIfNeeded();
            }
        }
    }

    public final void d0(View view, List<ChatMenuItem> list, TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a252e8", new Object[]{this, view, list, taoLiveKtCommentEntity});
            return;
        }
        final View d0 = BaseItemViewHolder.d0(view);
        final Drawable background = d0.getBackground();
        d0.setBackground(d0.getResources().getDrawable(R.drawable.taolive_comment_long_click_bg_flexalocal));
        ChatMenuPopupWindow chatMenuPopupWindow = new ChatMenuPopupWindow(this.b, list);
        chatMenuPopupWindow.showAtTopCenter(view);
        chatMenuPopupWindow.setChatItemClickListener(new x6k(this, taoLiveKtCommentEntity));
        chatMenuPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: tb.z6k
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                NormalComponent.V(d0, background);
            }
        });
        this.y = false;
        this.z = false;
        k0(list);
    }

    @Override // tb.os1
    public void e(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a82b46", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.e(tBLiveDataModel);
        jyw jywVar = new jyw(this);
        this.B = jywVar;
        jywVar.sendEmptyMessageDelayed(yj4.MSG_AUTO_RECOMMEND, 3000L);
        KMPCommentListAdapter kMPCommentListAdapter = new KMPCommentListAdapter(this.c, this.d);
        this.m = kMPCommentListAdapter;
        this.k.swapAdapter(kMPCommentListAdapter, true);
        this.m.Q(new a());
        O();
        this.p.b();
        W();
        X();
        sjr.g().a(this);
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584da378", new Object[]{this});
        } else {
            this.m.P();
        }
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f912cd7a", new Object[]{this});
            return;
        }
        this.n.scrollToPosition(this.m.getItemCount() - 1);
        this.z = true;
        this.y = true;
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5aa0d", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = hw0.b(this.b, 180.0f);
            this.j.setLayoutParams(layoutParams);
        }
    }

    public void h0(x0d x0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e977a49", new Object[]{this, x0dVar});
        } else {
            this.u = x0dVar;
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 2024) {
            hp3 hp3Var = this.i;
            if ((hp3Var == null || !hp3Var.h) && !this.C) {
                this.C = true;
                this.u.showNoticesIfNeeded();
            }
        } else if (i == 2025) {
            this.x = true;
            ((qf1) this.v).o(this.w);
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38785f2e", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.k;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Context context = this.b;
            layoutParams.width = hw0.b(context, hw0.t(context, liv.a(context)));
            this.k.setLayoutParams(layoutParams);
        }
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView2.getLayoutParams();
            layoutParams2.height = hw0.b(this.b, 180.0f);
            this.k.setLayoutParams(layoutParams2);
        }
    }

    public void j0(mde mdeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900d9095", new Object[]{this, mdeVar});
        } else {
            this.v = mdeVar;
        }
    }

    public final void k0(List<ChatMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3acff5", new Object[]{this, list});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        if (list.size() > 1) {
            for (ChatMenuItem chatMenuItem : list) {
                sb.append(chatMenuItem.text);
                if (list.indexOf(chatMenuItem) != list.size() - 1) {
                    sb.append("_");
                }
            }
        } else {
            sb.append(list.get(0).text);
        }
        hashMap.put("btn_name", sb.toString());
        if (giv.f() != null) {
            giv.f().p(this.c, "CommentBubbles", hashMap);
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465a8605", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public final void m0(ChatMenuItem chatMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4addfb", new Object[]{this, chatMenuItem});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("btn_name", chatMenuItem.text);
        if (giv.f() != null) {
            giv.f().m(this.c, "CommentBubbles", hashMap);
        }
    }

    public final void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bf7295", new Object[]{this});
        } else if (this.o == 0 && this.y) {
            f0();
            M();
        } else if (!this.z) {
            hp3 hp3Var = this.i;
            if (hp3Var == null || !hp3Var.g) {
                l0();
            }
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_KMP_COMMENT_INSERT_COMMON, uyg.EVENT_KMP_COMMENT_INSERT_PARSE_IMAGE};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.c;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r7.equals(tb.uyg.EVENT_KMP_COMMENT_INSERT_COMMON) == false) goto L_0x0023;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c3897928"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case 1264102105: goto L_0x0039;
                case 1471269786: goto L_0x002e;
                case 1802641472: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r1 = "com.taobao.taolive.room.kmp_comment_insert_common"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0043
            goto L_0x0023
        L_0x002e:
            java.lang.String r0 = "com.taobao.taolive.room.kmp_comment_insert_parse_image"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "com.taobao.taolive.room.insert_comment_item"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x004b;
                case 2: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0052
        L_0x0047:
            r6.K(r8)
            goto L_0x0052
        L_0x004b:
            r6.L(r8)
            goto L_0x0052
        L_0x004f:
            r6.e0()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent.onEvent(java.lang.String, java.lang.Object):void");
    }
}
