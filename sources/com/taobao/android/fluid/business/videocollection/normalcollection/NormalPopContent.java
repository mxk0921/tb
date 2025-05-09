package com.taobao.android.fluid.business.videocollection.normalcollection;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.interact.IInteractService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.business.videocollection.PopupDialog;
import com.taobao.android.fluid.business.videocollection.common.view.CollectionTabLayout;
import com.taobao.android.fluid.business.videocollection.normalcollection.view.CollectionAdapter;
import com.taobao.android.fluid.business.videocollection.normalcollection.view.SpeedAdustableRecylerView;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.bob;
import tb.dz3;
import tb.gt9;
import tb.h1u;
import tb.ir9;
import tb.kon;
import tb.lak;
import tb.mz3;
import tb.nwv;
import tb.nz3;
import tb.pr9;
import tb.r6k;
import tb.sv2;
import tb.t2o;
import tb.v7c;
import tb.yao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NormalPopContent implements bob, v7c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOADING_URL = "https://img.alicdn.com/imgextra/i2/O1CN01lrb2WY1tpbkpCc3L1_!!6000000005951-54-tps-117-117.apng";
    public static final int PRELOAD_SIZE = 100;
    public static final String START_INDEX = "1";
    public static final int TABS_COUNT = 2;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7730a;
    public final PopupDialog b;
    public ArrayList<dz3> c;
    public r6k d;
    public CollectionTabLayout e;
    public SpeedAdustableRecylerView f;
    public TUrlImageView g;
    public TextView h;
    public TUrlImageView i;
    public ImageView u;
    public Runnable w;
    public View j = null;
    public TUrlImageView k = null;
    public TextView l = null;
    public TextView m = null;
    public View n = null;
    public TextView o = null;
    public View p = null;
    public com.taobao.android.fluid.framework.data.datamodel.a q = null;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public final List v = new ArrayList();
    public final Handler x = new Handler(Looper.getMainLooper());
    public final SpeedAdustableRecylerView.AbstractEndlessScrollListener y = new SpeedAdustableRecylerView.AbstractEndlessScrollListener() { // from class: com.taobao.android.fluid.business.videocollection.normalcollection.NormalPopContent.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass7 r5, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/videocollection/normalcollection/NormalPopContent$7");
            }
        }

        @Override // com.taobao.android.fluid.business.videocollection.normalcollection.view.SpeedAdustableRecylerView.AbstractEndlessScrollListener, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
            } else {
                super.onScrollStateChanged(recyclerView, i2);
            }
        }

        @Override // com.taobao.android.fluid.business.videocollection.normalcollection.view.SpeedAdustableRecylerView.AbstractEndlessScrollListener, androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
            } else {
                super.onScrolled(recyclerView, i2, i3);
            }
        }

        @Override // com.taobao.android.fluid.business.videocollection.normalcollection.view.SpeedAdustableRecylerView.AbstractEndlessScrollListener
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16c4f6ae", new Object[]{this});
            } else if (!NormalPopContent.p(NormalPopContent.this).isEmpty()) {
                int a2 = ((dz3) NormalPopContent.p(NormalPopContent.this).get(NormalPopContent.p(NormalPopContent.this).size() - 1)).a() + 1;
                if (a2 > NormalPopContent.s(NormalPopContent.this).j()) {
                    ir9.b("NormalPopContent", "最后一个元素触发应请求拦截" + a2);
                    return;
                }
                ir9.b("NormalPopContent", "onLoadDown" + a2);
                NormalPopContent.this.getClass();
                NormalPopContent.s(NormalPopContent.this).m(a2, false);
            }
        }

        @Override // com.taobao.android.fluid.business.videocollection.normalcollection.view.SpeedAdustableRecylerView.AbstractEndlessScrollListener
        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd521967", new Object[]{this});
            } else if (NormalPopContent.p(NormalPopContent.this).size() != 0) {
                int a2 = ((dz3) NormalPopContent.p(NormalPopContent.this).get(0)).a() - 1;
                ir9.b("NormalPopContent", "onLoadUp" + a2);
                if (a2 > 0) {
                    NormalPopContent.s(NormalPopContent.this).m(a2, true);
                }
            }
        }
    };
    public final LockableRecycerView.a z = new l();
    public final RecyclerView.OnChildAttachStateChangeListener A = new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.taobao.android.fluid.business.videocollection.normalcollection.NormalPopContent.9
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("517542da", new Object[]{this, view});
            } else if (!NormalPopContent.v(NormalPopContent.this) && !NormalPopContent.t(NormalPopContent.this).isInLayout()) {
                NormalPopContent.s(NormalPopContent.this).q(view);
                NormalPopContent.this.y();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
            } else if (!NormalPopContent.v(NormalPopContent.this) && !NormalPopContent.t(NormalPopContent.this).isInLayout()) {
                NormalPopContent.this.y();
            }
        }
    };
    public final mz3 B = new b();
    public final CollectionTabLayout.g C = new c();

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
                NormalPopContent.w(NormalPopContent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements mz3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.mz3
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d39939a", new Object[]{this, new Boolean(z)});
                return;
            }
            NormalPopContent.j(NormalPopContent.this, z);
            NormalPopContent.k(NormalPopContent.this, true);
        }

        @Override // tb.mz3
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82349a61", new Object[]{this, new Integer(i)});
            } else if (NormalPopContent.g(NormalPopContent.this) != null) {
                NormalPopContent.g(NormalPopContent.this).setVisibility(i);
            }
        }

        @Override // tb.mz3
        public void c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("add78dd8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            NormalPopContent normalPopContent = NormalPopContent.this;
            NormalPopContent.h(normalPopContent, i, NormalPopContent.t(normalPopContent), i2);
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
            if (!NormalPopContent.i(NormalPopContent.this)) {
                NormalPopContent.m(NormalPopContent.this);
            } else {
                NormalPopContent.n(NormalPopContent.this);
            }
            NormalPopContent.s(NormalPopContent.this).o(NormalPopContent.i(NormalPopContent.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements sv2<yao> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MediaContentDetailData.Account f7736a;

        public e(MediaContentDetailData.Account account) {
            this.f7736a = account;
        }

        /* renamed from: b */
        public void a(yao yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("850591d8", new Object[]{this, yaoVar});
            } else if (yaoVar == null || !yaoVar.g()) {
                h1u.d(NormalPopContent.q(NormalPopContent.this).getContext(), "取消关注失败");
                MediaContentDetailData.Account account = this.f7736a;
                Boolean bool = Boolean.TRUE;
                account.followed = bool;
                NormalPopContent.o(NormalPopContent.this, bool);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements sv2<yao> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MediaContentDetailData.Account f7737a;

        public f(MediaContentDetailData.Account account) {
            this.f7737a = account;
        }

        /* renamed from: b */
        public void a(yao yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("850591d8", new Object[]{this, yaoVar});
            } else if (yaoVar == null || !yaoVar.g()) {
                h1u.d(NormalPopContent.q(NormalPopContent.this).getContext(), "关注失败");
                MediaContentDetailData.Account account = this.f7737a;
                Boolean bool = Boolean.FALSE;
                account.followed = bool;
                NormalPopContent.o(NormalPopContent.this, bool);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a f7738a;

        public g(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            this.f7738a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NormalPopContent.e(NormalPopContent.this, this.f7738a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NormalPopContent.f(NormalPopContent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements CollectionAdapter.CollectionViewHolder.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
            } else if (i < NormalPopContent.p(NormalPopContent.this).size()) {
                dz3 dz3Var = (dz3) NormalPopContent.p(NormalPopContent.this).get(i);
                String d = dz3Var.d();
                int a2 = dz3Var.a();
                nz3.l(NormalPopContent.q(NormalPopContent.this), i, dz3Var.a());
                if (nz3.g(((IDataService) NormalPopContent.q(NormalPopContent.this).getService(IDataService.class)).getCurrentMediaSetData()) == a2) {
                    NormalPopContent.r(NormalPopContent.this).s2(false);
                    return;
                }
                ((ICollectionService) NormalPopContent.q(NormalPopContent.this).getService(ICollectionService.class)).updateDetailListAndScrollTo(d, dz3Var.a());
                NormalPopContent.r(NormalPopContent.this).s2(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NormalPopContent.r(NormalPopContent.this).s2(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MediaContentDetailData.Account f7742a;

        public k(MediaContentDetailData.Account account) {
            this.f7742a = account;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!TextUtils.isEmpty(this.f7742a.targetUrl)) {
                FluidSDK.getNavAdapter().nav(NormalPopContent.q(NormalPopContent.this), NormalPopContent.q(NormalPopContent.this).getContext(), this.f7742a.targetUrl, null);
            }
        }
    }

    static {
        t2o.a(468713724);
        t2o.a(468713663);
        t2o.a(468713528);
    }

    public NormalPopContent(FluidContext fluidContext, PopupDialog popupDialog) {
        this.f7730a = fluidContext;
        this.b = popupDialog;
    }

    public static /* synthetic */ void e(NormalPopContent normalPopContent, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2883b9", new Object[]{normalPopContent, aVar});
        } else {
            normalPopContent.H(aVar);
        }
    }

    public static /* synthetic */ void f(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d503d", new Object[]{normalPopContent});
        } else {
            normalPopContent.D();
        }
    }

    public static /* synthetic */ TUrlImageView g(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("dbae408d", new Object[]{normalPopContent});
        }
        return normalPopContent.g;
    }

    public static /* synthetic */ boolean h(NormalPopContent normalPopContent, int i2, RecyclerView recyclerView, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5c35445", new Object[]{normalPopContent, new Integer(i2), recyclerView, new Integer(i3)})).booleanValue();
        }
        return normalPopContent.E(i2, recyclerView, i3);
    }

    public static /* synthetic */ boolean i(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64684dd1", new Object[]{normalPopContent})).booleanValue();
        }
        return normalPopContent.s;
    }

    public static /* synthetic */ boolean j(NormalPopContent normalPopContent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4f7302d", new Object[]{normalPopContent, new Boolean(z)})).booleanValue();
        }
        normalPopContent.s = z;
        return z;
    }

    public static /* synthetic */ boolean k(NormalPopContent normalPopContent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa28cae", new Object[]{normalPopContent, new Boolean(z)})).booleanValue();
        }
        normalPopContent.t = z;
        return z;
    }

    public static /* synthetic */ List l(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("80fe5e5c", new Object[]{normalPopContent});
        }
        return normalPopContent.v;
    }

    public static /* synthetic */ void m(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61dbfbea", new Object[]{normalPopContent});
        } else {
            normalPopContent.G();
        }
    }

    public static /* synthetic */ void n(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61028b49", new Object[]{normalPopContent});
        } else {
            normalPopContent.J();
        }
    }

    public static /* synthetic */ void o(NormalPopContent normalPopContent, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765123a5", new Object[]{normalPopContent, bool});
        } else {
            normalPopContent.I(bool);
        }
    }

    public static /* synthetic */ ArrayList p(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("72edd76", new Object[]{normalPopContent});
        }
        return normalPopContent.c;
    }

    public static /* synthetic */ FluidContext q(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("3834986d", new Object[]{normalPopContent});
        }
        return normalPopContent.f7730a;
    }

    public static /* synthetic */ PopupDialog r(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupDialog) ipChange.ipc$dispatch("eb7417c4", new Object[]{normalPopContent});
        }
        return normalPopContent.b;
    }

    public static /* synthetic */ r6k s(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r6k) ipChange.ipc$dispatch("55f7b10b", new Object[]{normalPopContent});
        }
        return normalPopContent.d;
    }

    public static /* synthetic */ SpeedAdustableRecylerView t(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeedAdustableRecylerView) ipChange.ipc$dispatch("576c12c7", new Object[]{normalPopContent});
        }
        return normalPopContent.f;
    }

    public static /* synthetic */ CollectionTabLayout u(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectionTabLayout) ipChange.ipc$dispatch("e331c2ba", new Object[]{normalPopContent});
        }
        return normalPopContent.e;
    }

    public static /* synthetic */ boolean v(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b3bda", new Object[]{normalPopContent})).booleanValue();
        }
        return normalPopContent.r;
    }

    public static /* synthetic */ void w(NormalPopContent normalPopContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc1cb35", new Object[]{normalPopContent});
        } else {
            normalPopContent.z();
        }
    }

    public final void A(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cfdd52", new Object[]{this, aVar});
            return;
        }
        this.q = aVar;
        MediaContentDetailData.Account account = aVar.i().account;
        if (account == null || TextUtils.isEmpty(account.name)) {
            this.j.setVisibility(8);
            return;
        }
        this.j.setVisibility(0);
        this.k.setImageUrl(account.avatar);
        this.l.setText(account.name);
        if (TextUtils.isEmpty(account.followCountFmt)) {
            str = account.iconExtraText;
        } else {
            str = account.followCountFmt;
        }
        if (TextUtils.isEmpty(str)) {
            this.m.setVisibility(8);
        } else {
            this.m.setVisibility(0);
            this.m.setText(str);
        }
        I(account.followed);
        ViewProxy.setOnClickListener(this.j, new k(account));
    }

    public void B(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af74c9", new Object[]{this, view});
        } else {
            ((LinearLayout) view.findViewById(R.id.collectCollection)).setOnClickListener(new d());
        }
    }

    public final void D() {
        MediaContentDetailData.Account account;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6543117f", new Object[]{this});
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a aVar = this.q;
        if (aVar != null && (account = aVar.i().account) != null && (bool = account.followed) != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean valueOf = Boolean.valueOf(true ^ account.followed.booleanValue());
            account.followed = valueOf;
            I(valueOf);
            if (booleanValue) {
                ((IInteractService) this.f7730a.getService(IInteractService.class)).cancelFollow(account.idStr, account.keyName, this.q.d(), new e(account));
            } else {
                ((IInteractService) this.f7730a.getService(IInteractService.class)).follow(account.idStr, account.keyName, this.q.d(), new f(account));
            }
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f64ee7a", new Object[]{this});
        } else if (this.d.h() != null) {
            if (!this.t) {
                this.s = nwv.o(this.d.h().get("collectionSubscribe"), false);
                this.t = true;
            }
            if (this.s) {
                G();
            } else {
                J();
            }
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a14d4c", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.i;
        if (tUrlImageView != null) {
            tUrlImageView.setImageDrawable(this.f7730a.getContext().getResources().getDrawable(R.drawable.fluid_sdk_collection_collected));
            this.h.setText("已收藏");
            this.h.setTextColor(Color.parseColor("#7C889C"));
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e997f654", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.i;
        if (tUrlImageView != null) {
            tUrlImageView.setImageDrawable(this.f7730a.getContext().getResources().getDrawable(R.drawable.fluid_sdk_collection_collect));
            this.h.setText("收藏合集");
            this.h.setTextColor(Color.parseColor("#11192D"));
        }
    }

    @Override // tb.v7c
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2297e432", new Object[]{this, str, new Boolean(z)});
        } else {
            I(Boolean.valueOf(z));
        }
    }

    @Override // tb.bob
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f66f029", new Object[]{this});
        }
    }

    @Override // tb.bob
    public void d(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e030105a", new Object[]{this, hVar});
            return;
        }
        int collectionTotal = ((ICollectionService) this.f7730a.getService(ICollectionService.class)).getCollectionTotal();
        if (((IDataService) this.f7730a.getService(IDataService.class)).getMediaSetList().size() >= 4 || collectionTotal < 4) {
            this.d.r(hVar);
        }
    }

    @Override // tb.bob
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            ((IInteractService) this.f7730a.getService(IInteractService.class)).addFollowStateChangeListener(this);
        }
    }

    @Override // tb.bob
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            ((IInteractService) this.f7730a.getService(IInteractService.class)).removeFollowStateChangeListener(this);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f8b27c", new Object[]{this});
            return;
        }
        this.f.addOnScrollListener(this.y);
        this.f.addOnChildAttachStateChangeListener(this.A);
        this.f.addOnDragListener(this.z);
        this.e.setOnTabSelectedListener(this.C);
        ((CollectionAdapter) this.f.getAdapter()).O(new i());
        this.u.setOnClickListener(new j());
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca2a18d", new Object[]{this});
            return;
        }
        Runnable runnable = this.w;
        if (runnable == null) {
            this.w = new a();
        } else {
            this.x.removeCallbacks(runnable);
        }
        this.x.postDelayed(this.w, 100L);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements LockableRecycerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54b330fc", new Object[]{this});
            }
        }

        @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
        public void onDragUp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76868f35", new Object[]{this});
                return;
            }
            int findLastVisibleItemPosition = ((LinearLayoutManager) NormalPopContent.t(NormalPopContent.this).getLayoutManager()).findLastVisibleItemPosition();
            if (NormalPopContent.p(NormalPopContent.this) != null && findLastVisibleItemPosition >= 0 && findLastVisibleItemPosition == NormalPopContent.p(NormalPopContent.this).size() - 1 && !((IDataService) NormalPopContent.q(NormalPopContent.this).getService(IDataService.class)).isLoadingMore() && NormalPopContent.u(NormalPopContent.this) != null && NormalPopContent.u(NormalPopContent.this).getTabsContainer().getChildCount() >= 2) {
                int a2 = ((dz3) NormalPopContent.p(NormalPopContent.this).get(findLastVisibleItemPosition)).a() + 1;
                ir9.b("NormalPopContent", "最后一个元素ondrag发起请求" + a2);
                NormalPopContent.s(NormalPopContent.this).m(a2, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements CollectionTabLayout.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.fluid.business.videocollection.common.view.CollectionTabLayout.g
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eec0d40b", new Object[]{this, new Integer(i)});
            } else if (i >= 0 && i < NormalPopContent.l(NormalPopContent.this).size()) {
                String i2 = r6k.i((JSONObject) NormalPopContent.l(NormalPopContent.this).get(i));
                int c = lak.c(i2);
                NormalPopContent normalPopContent = NormalPopContent.this;
                if (NormalPopContent.h(normalPopContent, c, NormalPopContent.t(normalPopContent), 0)) {
                    NormalPopContent.g(NormalPopContent.this).setVisibility(8);
                    return;
                }
                ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> collectionDataCache = ((ICollectionService) NormalPopContent.q(NormalPopContent.this).getService(ICollectionService.class)).getCollectionDataCache(c);
                if (collectionDataCache == null || collectionDataCache.isEmpty()) {
                    NormalPopContent.g(NormalPopContent.this).setVisibility(0);
                    boolean[] zArr = {false, false};
                    NormalPopContent.s(NormalPopContent.this).n(false, c, c, zArr, 0);
                    if (TextUtils.equals(i2, "1")) {
                        NormalPopContent.s(NormalPopContent.this).n(false, c + 4, c, zArr, 1);
                    } else {
                        NormalPopContent.s(NormalPopContent.this).n(true, c, c, zArr, 1);
                    }
                    ir9.b("NormalPopContent", "onTabSelected，发起recommend请求" + i);
                    return;
                }
                NormalPopContent.s(NormalPopContent.this).e(collectionDataCache, false, true);
                NormalPopContent normalPopContent2 = NormalPopContent.this;
                NormalPopContent.h(normalPopContent2, c, NormalPopContent.t(normalPopContent2), 0);
                NormalPopContent.g(NormalPopContent.this).setVisibility(8);
                ir9.b("NormalPopContent", "onTabSelected 从缓存加载了数据");
            }
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1356bdda", new Object[]{this, layoutInflater, viewGroup});
        }
        View inflate = layoutInflater.inflate(R.layout.fluid_sdk_collection_normal_dialog, viewGroup, false);
        this.f = (SpeedAdustableRecylerView) inflate.findViewById(R.id.collectionDialog_recyclerView_remote);
        this.e = (CollectionTabLayout) inflate.findViewById(R.id.collectionDialog_tab_layout_remote);
        this.u = (ImageView) inflate.findViewById(R.id.collectionDialog_close);
        this.h = (TextView) inflate.findViewById(R.id.collectionDialog_collect_text);
        this.i = (TUrlImageView) inflate.findViewById(R.id.collectionDialog_collect_img);
        ((TextView) inflate.findViewById(R.id.collectionDialog_update_text)).setText("共" + ((ICollectionService) this.f7730a.getService(ICollectionService.class)).getCollectionTotal() + "集");
        if (!this.s) {
            J();
        } else {
            G();
        }
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.collectionDialog_loading_gif);
        this.g = tUrlImageView;
        tUrlImageView.setSkipAutoSize(true);
        this.g.setImageUrl(LOADING_URL);
        this.g.setVisibility(0);
        this.j = inflate.findViewById(R.id.layout_authorContainer);
        this.k = (TUrlImageView) inflate.findViewById(R.id.img_authorAvatar);
        this.l = (TextView) inflate.findViewById(R.id.tv_authorName);
        this.m = (TextView) inflate.findViewById(R.id.tv_authorDesc);
        View findViewById = inflate.findViewById(R.id.layout_followContainer);
        this.n = findViewById;
        ViewProxy.setOnClickListener(findViewById, new h());
        this.p = inflate.findViewById(R.id.img_addFollow);
        this.o = (TextView) inflate.findViewById(R.id.tv_followStatus);
        return inflate;
    }

    public final boolean E(int i2, RecyclerView recyclerView, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6c0f2a0", new Object[]{this, new Integer(i2), recyclerView, new Integer(i3)})).booleanValue();
        }
        if (this.c.isEmpty()) {
            return false;
        }
        int i4 = 0;
        while (i4 < this.c.size()) {
            int a2 = this.c.get(i4).a();
            if (a2 == i2) {
                int i5 = i4 > 0 ? i4 - i3 : i4;
                if (i5 >= 0 && recyclerView.getAdapter() != null && i5 < recyclerView.getAdapter().getItemCount()) {
                    ir9.b("NormalPopContent", "scrolltoCollectionCellsIndex:" + a2 + "position:" + i5);
                    this.r = true;
                    ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(i5, 0);
                    this.r = false;
                    return true;
                }
            }
            i4++;
        }
        ir9.b("NormalPopContent", "scrolltoCollectionCellsIndex:没有找到" + i2);
        return false;
    }

    public final void H(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97204454", new Object[]{this, aVar});
        } else if (!this.c.isEmpty() && aVar != null && aVar.e() != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.c.size()) {
                    i2 = -1;
                    break;
                } else if (TextUtils.equals(this.c.get(i3).d(), aVar.e().f())) {
                    ir9.b("NormalPopContent", "updateCurrentCell:" + this.c.get(i3).a());
                    ((CollectionAdapter) this.f.getAdapter()).Q(this.c.get(i3).d());
                    i2 = this.c.get(i3).a();
                    this.f.getAdapter().notifyDataSetChanged();
                    break;
                } else {
                    i3++;
                }
            }
            E(i2, this.f, 1);
            for (int i4 = 0; i4 < ((ArrayList) this.v).size(); i4++) {
                JSONObject jSONObject = (JSONObject) ((ArrayList) this.v).get(i4);
                String i5 = r6k.i(jSONObject);
                String string = jSONObject.getString("end");
                if (i2 >= lak.c(i5) && i2 <= lak.c(string)) {
                    ir9.b("NormalPopContent", "tablayot应该滑动到" + i4);
                    this.e.setScrollPosition(i4, false);
                    return;
                }
            }
        }
    }

    @Override // tb.bob
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ir9.b("NormalPopContent", "onCreateView");
        this.c = new ArrayList<>();
        View C = C(layoutInflater, viewGroup);
        this.d = new r6k(this.c, this.f, this.f7730a, this.e, this.B, this.v);
        this.f.setLayoutManager(new LinearLayoutManager(this, layoutInflater.getContext(), 1, false) { // from class: com.taobao.android.fluid.business.videocollection.normalcollection.NormalPopContent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1545422228) {
                    return new Integer(super.getExtraLayoutSpace((RecyclerView.State) objArr[0]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/normalcollection/NormalPopContent$1");
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public int getExtraLayoutSpace(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("5c1d4594", new Object[]{this, state})).intValue();
                }
                return super.getExtraLayoutSpace(state) + 100;
            }
        });
        CollectionAdapter collectionAdapter = new CollectionAdapter(this.c);
        int collectionTotal = ((ICollectionService) this.f7730a.getService(ICollectionService.class)).getCollectionTotal();
        collectionAdapter.P(collectionTotal);
        this.d.p(collectionTotal);
        this.f.setAdapter(collectionAdapter);
        x();
        this.d.k(C, this.b);
        B(C);
        return C;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a9798e", new Object[]{this});
            return;
        }
        SpeedAdustableRecylerView speedAdustableRecylerView = this.f;
        if (!(speedAdustableRecylerView == null || speedAdustableRecylerView.getLayoutManager() == null)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            ArrayList<dz3> arrayList = this.c;
            if (arrayList != null && findLastVisibleItemPosition >= 0 && findLastVisibleItemPosition <= arrayList.size() && findFirstVisibleItemPosition >= 0 && findFirstVisibleItemPosition <= this.c.size()) {
                if (findLastVisibleItemPosition == this.c.size()) {
                    findLastVisibleItemPosition--;
                }
                ir9.b("NormalPopContent", "firstVisiblePosition" + this.c.get(findFirstVisibleItemPosition).a() + "lastVisiblePosition" + this.c.get(findLastVisibleItemPosition).a());
                int a2 = this.c.get(findFirstVisibleItemPosition).a();
                if (this.e.getSelectedTabPosition() < ((ArrayList) this.v).size()) {
                    JSONObject jSONObject = (JSONObject) ((ArrayList) this.v).get(this.e.getSelectedTabPosition());
                    if (a2 >= lak.c(r6k.i(jSONObject)) && a2 <= lak.c(jSONObject.getString("end"))) {
                        return;
                    }
                }
                for (int i2 = 0; i2 < ((ArrayList) this.v).size(); i2++) {
                    JSONObject jSONObject2 = (JSONObject) ((ArrayList) this.v).get(i2);
                    String i3 = r6k.i(jSONObject2);
                    String string = jSONObject2.getString("end");
                    int a3 = this.c.get(findFirstVisibleItemPosition).a();
                    int a4 = this.c.get(findLastVisibleItemPosition).a();
                    if (a3 < lak.c(i3) || a3 > lak.c(string)) {
                        if (a4 >= lak.c(i3) && a4 <= lak.c(string)) {
                            ir9.b("NormalPopContent", "末尾元素触发应该滑动到" + i2);
                            this.e.setScrollPosition(i2, true);
                        }
                    } else {
                        ir9.b("NormalPopContent", "首个元素触发应该滑动到" + i2);
                        this.e.setScrollPosition(i2, true);
                        return;
                    }
                }
            }
        }
    }

    @Override // tb.bob
    public void b(com.taobao.android.fluid.framework.data.datamodel.a aVar, Map<String, Object> map) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46dbb5f", new Object[]{this, aVar, map});
            return;
        }
        if (map != null) {
            Object obj = map.get("businessExtraMap");
            if ((obj instanceof Map) && (list = (List) ((Map) obj).get("rangeList")) != null) {
                ((ArrayList) this.v).clear();
                ((ArrayList) this.v).addAll(list);
            }
        }
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
        A(aVar);
        if (((ArrayList) this.v).size() == 1) {
            this.e.addTab("选集");
        } else {
            for (int i2 = 0; i2 < ((ArrayList) this.v).size(); i2++) {
                JSONObject jSONObject = (JSONObject) ((ArrayList) this.v).get(i2);
                String i3 = r6k.i(jSONObject);
                String string = jSONObject.getString("end");
                CollectionTabLayout collectionTabLayout = this.e;
                collectionTabLayout.addTab(i3 + "-" + string);
            }
        }
        if (this.e.getTabsContainer().getChildCount() < 2) {
            this.e.setVisibility(8);
        }
        this.d.e(((IDataService) this.f7730a.getService(IDataService.class)).getMediaSetList(), false, false);
        nwv.y0(new g(aVar));
        F();
    }

    public final void I(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1d6115", new Object[]{this, bool});
            return;
        }
        View view = this.n;
        if (view == null) {
            return;
        }
        if (bool != null) {
            view.setVisibility(0);
            float c2 = pr9.c(this.n.getContext(), 4);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{c2, c2, c2, c2, c2, c2, c2, c2}, null, null));
            if (bool.booleanValue()) {
                shapeDrawable.getPaint().setColor(-3485737);
                this.n.setBackground(shapeDrawable);
                this.o.setText(gt9.TEXT_FOLLOW_DEFAULT);
                this.p.setVisibility(8);
                return;
            }
            shapeDrawable.getPaint().setColor(b0.DEFAULT_COLOR);
            this.n.setBackground(shapeDrawable);
            this.o.setText(gt9.TEXT_UNFOLLOW_DEFAULT);
            this.p.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }
}
