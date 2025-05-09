package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.message.sp.category.transformer.UpdateDownloadProgressTransformer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.kew;
import tb.npp;
import tb.nxn;
import tb.r54;
import tb.t2o;
import tb.ups;
import tb.w1a;
import tb.wpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RemoteClassDelegateContentRender extends BaseShopContentRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context g;
    public final ups h;
    public final d1a<wpd> i;
    public final w1a<d1a<xhv>, d1a<xhv>, g1a<? super Integer, xhv>, xhv> j;
    public final FrameLayout k;
    public wpd l;
    public final RemoteLoadingView m;
    public final ArrayList<Runnable> n = new ArrayList<>();
    public boolean o;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.provider.RemoteClassDelegateContentRender$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
            super(0, remoteClassDelegateContentRender, RemoteClassDelegateContentRender.class, "remoteClassInitFinish", "remoteClassInitFinish()V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/RemoteClassDelegateContentRender$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                RemoteClassDelegateContentRender.D((RemoteClassDelegateContentRender) this.receiver);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.provider.RemoteClassDelegateContentRender$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass2(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
            super(0, remoteClassDelegateContentRender, RemoteClassDelegateContentRender.class, "remoteClassInitFailed", "remoteClassInitFailed()V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/RemoteClassDelegateContentRender$2");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                RemoteClassDelegateContentRender.C((RemoteClassDelegateContentRender) this.receiver);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.provider.RemoteClassDelegateContentRender$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements g1a<Integer, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
            super(1, remoteClassDelegateContentRender, RemoteClassDelegateContentRender.class, UpdateDownloadProgressTransformer.NAME, "updateProgress(I)V", 0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/RemoteClassDelegateContentRender$3");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
            invoke(num.intValue());
            return xhv.INSTANCE;
        }

        public final void invoke(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
            } else {
                RemoteClassDelegateContentRender.G((RemoteClassDelegateContentRender) this.receiver, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            wpd z = RemoteClassDelegateContentRender.z(RemoteClassDelegateContentRender.this);
            if (z != null) {
                z.j();
            }
        }
    }

    static {
        t2o.a(766510127);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteClassDelegateContentRender(Context context, ups upsVar, d1a<? extends wpd> d1aVar, w1a<? super d1a<xhv>, ? super d1a<xhv>, ? super g1a<? super Integer, xhv>, xhv> w1aVar) {
        super(context, upsVar);
        ckf.g(context, "context");
        ckf.g(upsVar, "tabBarItemDataModel");
        ckf.g(d1aVar, "targetContentRenderGetter");
        ckf.g(w1aVar, "initRemoteClassFunction");
        this.g = context;
        this.h = upsVar;
        this.i = d1aVar;
        this.j = w1aVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-1);
        xhv xhvVar = xhv.INSTANCE;
        this.k = frameLayout;
        RemoteLoadingView remoteLoadingView = new RemoteLoadingView(context, new LoadConfig.b().l());
        this.m = remoteLoadingView;
        kew.a(frameLayout, remoteLoadingView);
        w1aVar.invoke(new AnonymousClass1(this), new AnonymousClass2(this), new AnonymousClass3(this));
    }

    public static final /* synthetic */ d1a A(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("1e54aa2f", new Object[]{remoteClassDelegateContentRender});
        }
        return remoteClassDelegateContentRender.i;
    }

    public static final /* synthetic */ void B(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b6e98b", new Object[]{remoteClassDelegateContentRender});
        } else {
            remoteClassDelegateContentRender.H();
        }
    }

    public static final /* synthetic */ void C(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11af24e", new Object[]{remoteClassDelegateContentRender});
        } else {
            remoteClassDelegateContentRender.I();
        }
    }

    public static final /* synthetic */ void D(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b412438", new Object[]{remoteClassDelegateContentRender});
        } else {
            remoteClassDelegateContentRender.J();
        }
    }

    public static final /* synthetic */ void E(RemoteClassDelegateContentRender remoteClassDelegateContentRender, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb89a98", new Object[]{remoteClassDelegateContentRender, new Boolean(z)});
        } else {
            remoteClassDelegateContentRender.o = z;
        }
    }

    public static final /* synthetic */ void F(RemoteClassDelegateContentRender remoteClassDelegateContentRender, wpd wpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f6427b", new Object[]{remoteClassDelegateContentRender, wpdVar});
        } else {
            remoteClassDelegateContentRender.l = wpdVar;
        }
    }

    public static final /* synthetic */ void G(RemoteClassDelegateContentRender remoteClassDelegateContentRender, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ce52ac", new Object[]{remoteClassDelegateContentRender, new Integer(i)});
        } else {
            remoteClassDelegateContentRender.K(i);
        }
    }

    public static /* synthetic */ Object ipc$super(RemoteClassDelegateContentRender remoteClassDelegateContentRender, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1143432274) {
            return new Boolean(super.o());
        }
        if (hashCode == 877680342) {
            super.k();
            return null;
        } else if (hashCode == 1065519279) {
            super.j();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/provider/RemoteClassDelegateContentRender");
        }
    }

    public static final /* synthetic */ Context v(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8f64a2e0", new Object[]{remoteClassDelegateContentRender});
        }
        return remoteClassDelegateContentRender.g;
    }

    public static final /* synthetic */ RemoteLoadingView w(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteLoadingView) ipChange.ipc$dispatch("b52f2aae", new Object[]{remoteClassDelegateContentRender});
        }
        return remoteClassDelegateContentRender.m;
    }

    public static final /* synthetic */ FrameLayout x(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("13486b9a", new Object[]{remoteClassDelegateContentRender});
        }
        return remoteClassDelegateContentRender.k;
    }

    public static final /* synthetic */ ups y(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("5b5845f0", new Object[]{remoteClassDelegateContentRender});
        }
        return remoteClassDelegateContentRender.h;
    }

    public static final /* synthetic */ wpd z(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wpd) ipChange.ipc$dispatch("9d48d3b3", new Object[]{remoteClassDelegateContentRender});
        }
        return remoteClassDelegateContentRender.l;
    }

    public final void H() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c495f249", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.n.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }
        this.n.clear();
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d72d0e6", new Object[]{this});
            return;
        }
        npp.Companion.b("remote class init failed");
        r54.C(new RemoteClassDelegateContentRender$remoteClassInitFailed$1(this));
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9065ae3c", new Object[]{this});
            return;
        }
        npp.Companion.b("remote class init success");
        r54.C(new RemoteClassDelegateContentRender$remoteClassInitFinish$1(this));
    }

    public final void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
        } else {
            this.m.updateProgress(i);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        wpd wpdVar = this.l;
        if (wpdVar != null) {
            wpdVar.destroyView();
        }
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.k;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        a aVar = new a();
        if (this.o) {
            aVar.run();
        } else {
            this.n.add(aVar);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        super.k();
        wpd wpdVar = this.l;
        if (wpdVar != null) {
            wpdVar.k();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender
    public boolean o() {
        BaseShopContentRender a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd89bae", new Object[]{this})).booleanValue();
        }
        wpd wpdVar = this.l;
        Boolean bool = null;
        if (!(wpdVar == null || (a2 = nxn.a(wpdVar)) == null)) {
            bool = Boolean.valueOf(a2.o());
        }
        if (bool == null) {
            return super.o();
        }
        return bool.booleanValue();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        wpd wpdVar = this.l;
        if (wpdVar != null) {
            wpdVar.onPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        wpd wpdVar = this.l;
        if (wpdVar != null) {
            wpdVar.onResume();
        }
    }
}
