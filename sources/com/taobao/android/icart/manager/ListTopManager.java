package com.taobao.android.icart.manager;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.icart.widget.CartLinearLayout;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.fsb;
import tb.guk;
import tb.hmb;
import tb.imb;
import tb.kmb;
import tb.lcu;
import tb.mc3;
import tb.qtd;
import tb.sca;
import tb.t2o;
import tb.ux;
import tb.ykl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ListTopManager implements hmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f8009a;
    public PopupWindow b;
    public int c;
    public final Context d;
    public final View.OnClickListener e;
    public int f;
    public final OnScreenChangedListener g;
    public int h;
    public int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/ListTopManager$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            } else {
                ListTopManager.this.a(true);
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                ListTopManager.this.a(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements imb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.imb.b
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                ListTopManager.b(ListTopManager.this);
            }
        }

        @Override // tb.imb.b
        public void onShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            } else {
                ListTopManager.c(ListTopManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements qtd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.qtd
        public void a(lcu lcuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaee5f8e", new Object[]{this, lcuVar});
            } else if (lcuVar != null) {
                switch (((Integer) lcuVar.e("lifecycle")).intValue()) {
                    case 10003:
                    case 10007:
                        ListTopManager.b(ListTopManager.this);
                        return;
                    case 10004:
                    default:
                        return;
                    case 10005:
                    case 10008:
                        ListTopManager.c(ListTopManager.this);
                        return;
                    case 10006:
                        if (ListTopManager.f(ListTopManager.this) != null) {
                            TBAutoSizeConfig.x().h0(ListTopManager.f(ListTopManager.this));
                            return;
                        }
                        return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements CartLinearLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CartLinearLayout f8014a;

        public d(CartLinearLayout cartLinearLayout) {
            this.f8014a = cartLinearLayout;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73c37cf6", new Object[]{this});
                return;
            }
            int measuredHeight = this.f8014a.getMeasuredHeight();
            if (measuredHeight != ListTopManager.g(ListTopManager.this)) {
                ListTopManager.h(ListTopManager.this, measuredHeight);
                ListTopManager.this.a(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else {
                ListTopManager.this.a(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ListTopManager.c(ListTopManager.this);
            }
        }
    }

    static {
        t2o.a(478150816);
        t2o.a(479199630);
    }

    public ListTopManager(kmb kmbVar, View.OnClickListener onClickListener) {
        this.f8009a = kmbVar;
        this.h = kmbVar.e().d0(12.0f);
        Activity context = kmbVar.getContext();
        this.d = context;
        this.i = TBAutoSizeConfig.x().H(context);
        this.e = onClickListener;
        ((RecyclerView) kmbVar.e().o()).addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.manager.ListTopManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/manager/ListTopManager$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                } else {
                    ListTopManager.b(ListTopManager.this);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    ListTopManager.b(ListTopManager.this);
                }
            }
        });
        kmbVar.d().q(new a());
        kmbVar.e().h0().h(new b());
        kmbVar.g().c("cartLifecycle", new c());
        ViewGroup q = kmbVar.e().q();
        if (q instanceof CartLinearLayout) {
            CartLinearLayout cartLinearLayout = (CartLinearLayout) q;
            cartLinearLayout.setChangeMeasureListener(new d(cartLinearLayout));
        }
        if (ykl.a()) {
            if (this.g == null) {
                this.g = new e();
            }
            TBAutoSizeConfig.x().d0(this.g);
        }
    }

    public static /* synthetic */ void b(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c452ccd9", new Object[]{listTopManager});
        } else {
            listTopManager.t();
        }
    }

    public static /* synthetic */ void c(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5891fb8", new Object[]{listTopManager});
        } else {
            listTopManager.q();
        }
    }

    public static /* synthetic */ int d(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2aeff7d", new Object[]{listTopManager})).intValue();
        }
        return listTopManager.c;
    }

    public static /* synthetic */ int e(ListTopManager listTopManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5da0f2e", new Object[]{listTopManager, new Integer(i)})).intValue();
        }
        listTopManager.c = i;
        return i;
    }

    public static /* synthetic */ OnScreenChangedListener f(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnScreenChangedListener) ipChange.ipc$dispatch("161de3b7", new Object[]{listTopManager});
        }
        return listTopManager.g;
    }

    public static /* synthetic */ int g(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7f5c569", new Object[]{listTopManager})).intValue();
        }
        return listTopManager.f;
    }

    public static /* synthetic */ int h(ListTopManager listTopManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("896c06c2", new Object[]{listTopManager, new Integer(i)})).intValue();
        }
        listTopManager.f = i;
        return i;
    }

    public static /* synthetic */ kmb i(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("d21ccde", new Object[]{listTopManager});
        }
        return listTopManager.f8009a;
    }

    public static /* synthetic */ boolean j(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca626b38", new Object[]{listTopManager})).booleanValue();
        }
        return listTopManager.r();
    }

    public static /* synthetic */ int k(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb98be06", new Object[]{listTopManager})).intValue();
        }
        return listTopManager.i;
    }

    public static /* synthetic */ int l(ListTopManager listTopManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa2821c5", new Object[]{listTopManager, new Integer(i)})).intValue();
        }
        listTopManager.i = i;
        return i;
    }

    public static /* synthetic */ Context m(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ea5439ea", new Object[]{listTopManager});
        }
        return listTopManager.d;
    }

    public static /* synthetic */ int n(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce0563c4", new Object[]{listTopManager})).intValue();
        }
        return listTopManager.h;
    }

    public static /* synthetic */ int o(ListTopManager listTopManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("455033c7", new Object[]{listTopManager, new Integer(i)})).intValue();
        }
        listTopManager.h = i;
        return i;
    }

    public static /* synthetic */ PopupWindow p(ListTopManager listTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("449b4004", new Object[]{listTopManager});
        }
        return listTopManager.b;
    }

    @Override // tb.hmb
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee80c4d3", new Object[]{this, new Boolean(z)});
            return;
        }
        String r = sca.r(this.f8009a.d());
        if (r == null || r()) {
            q();
            return;
        }
        int d0 = this.f8009a.e().d0(43.0f);
        ViewGroup q = this.f8009a.e().q();
        int d02 = this.f8009a.e().d0(20.0f) + d0;
        if (this.f8009a.e().r0()) {
            s(r, d0);
            if (z || !this.b.isShowing()) {
                q.post(new f(q, d0, d02));
                return;
            }
            return;
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow != null && popupWindow.isShowing()) {
            q.post(new g());
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.b;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.b.dismiss();
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e76bf9", new Object[]{this})).booleanValue();
        }
        if (this.f8009a.e().y() || mc3.m(null)) {
            return true;
        }
        return false;
    }

    public final void s(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c32572", new Object[]{this, str, new Integer(i)});
        } else if (this.b == null) {
            this.b = new PopupWindow();
            TUrlImageView tUrlImageView = new TUrlImageView(this.d);
            tUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            tUrlImageView.setEnableLayoutOptimize(true);
            PopupWindow popupWindow = new PopupWindow((View) tUrlImageView, i, i, true);
            this.b = popupWindow;
            popupWindow.setFocusable(false);
            this.b.setOutsideTouchable(false);
            this.b.setBackgroundDrawable(new BitmapDrawable());
            tUrlImageView.setOnClickListener(this.e);
            tUrlImageView.setContentDescription(Localization.q(R.string.taobao_app_1028_1_21637));
            View contentView = this.b.getContentView();
            if (contentView instanceof TUrlImageView) {
                ((TUrlImageView) contentView).setImageUrl(str);
            }
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a463221", new Object[]{this});
        } else {
            a(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8016a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public f(View view, int i, int i2) {
            this.f8016a = view;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!ListTopManager.i(ListTopManager.this).R().isResumed()) {
                UnifyLog.e("ListTopManager", "pop return, fragment is not resume");
            } else if (ListTopManager.j(ListTopManager.this)) {
                ListTopManager.c(ListTopManager.this);
            } else {
                int[] iArr = new int[2];
                this.f8016a.getLocationOnScreen(iArr);
                if (ykl.a()) {
                    ListTopManager.l(ListTopManager.this, TBAutoSizeConfig.x().H(ListTopManager.m(ListTopManager.this)));
                    ListTopManager listTopManager = ListTopManager.this;
                    ListTopManager.o(listTopManager, ListTopManager.i(listTopManager).e().d0(12.0f));
                }
                int k = (ListTopManager.k(ListTopManager.this) - ListTopManager.n(ListTopManager.this)) - this.b;
                int i = iArr[1] - this.c;
                if (ListTopManager.p(ListTopManager.this).isShowing() && ListTopManager.d(ListTopManager.this) != i) {
                    ListTopManager.c(ListTopManager.this);
                }
                try {
                    ListTopManager.p(ListTopManager.this).showAtLocation(this.f8016a, 0, k, i);
                } catch (Throwable unused) {
                }
                ListTopManager.e(ListTopManager.this, i);
            }
        }
    }
}
