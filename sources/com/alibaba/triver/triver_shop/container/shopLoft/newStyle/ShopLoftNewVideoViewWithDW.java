package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.r;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import tb.aqp;
import tb.bpp;
import tb.brf;
import tb.ckf;
import tb.cpp;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.kpp;
import tb.lpp;
import tb.npp;
import tb.r54;
import tb.s0m;
import tb.ssq;
import tb.t2o;
import tb.tmu;
import tb.xhv;
import tb.xpd;
import tb.yf2;
import tb.ytb;
import tb.z9w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftNewVideoViewWithDW extends ShopLoftViewNewStyleBaseView implements ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public cpp A;
    public int C;
    public TUrlImageView D;
    public r q;
    public String r;
    public String s;
    public String t;
    public int v;
    public int w;
    public boolean x;
    public TUrlImageView y;
    public z9w z;
    public float u = 1.7777778f;
    public final int B = kew.p(30);
    public boolean E = true;
    public final String F = "https://img.alicdn.com/imgextra/i3/O1CN01mZTjld1GqHPdygPdg_!!6000000000673-2-tps-84-84.png";
    public final String G = "https://img.alicdn.com/imgextra/i3/O1CN01Dw6Ypv1R3Em1OMooC_!!6000000002055-2-tps-84-84.png";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class NewVideoViewWebView extends ShopWrapWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean hasMove;
        private float moveSize;
        private float startX;
        private float startY;
        private int touchSlop;

        static {
            t2o.a(766509266);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewVideoViewWebView(Context context) {
            super(context);
            ckf.g(context, "context");
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        public static /* synthetic */ Object ipc$super(NewVideoViewWebView newVideoViewWebView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1253202540) {
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode == 143825882) {
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$NewVideoViewWebView");
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
            }
            ckf.g(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                this.moveSize = 0.0f;
                this.hasMove = false;
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                RecyclerView q = kew.q(this);
                if (q != null) {
                    q.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (motionEvent.getAction() == 1) {
                RecyclerView q2 = kew.q(this);
                if (q2 != null) {
                    q2.requestDisallowInterceptTouchEvent(false);
                }
                if (this.hasMove) {
                    return super.coreDispatchTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() == 2 && !this.hasMove && r54.c(this.startX, this.startY, motionEvent.getX(), motionEvent.getY()) >= this.touchSlop) {
                this.hasMove = true;
            }
            return super.coreDispatchTouchEvent(motionEvent);
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            RecyclerView q;
            RecyclerView q2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
            }
            if ((i3 == 0 && i < 0) || (i3 == i5 && i > 0)) {
                return false;
            }
            if (i4 == 0 && i2 <= 0 && (q2 = kew.q(this)) != null) {
                q2.requestDisallowInterceptTouchEvent(false);
            }
            if (i4 == i6 && i2 > 0 && (q = kew.q(this)) != null) {
                q.requestDisallowInterceptTouchEvent(false);
            }
            return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
    }

    static {
        t2o.a(766509265);
        t2o.a(452985011);
    }

    public static final /* synthetic */ void P(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264c2bb8", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.Y();
        }
    }

    public static final /* synthetic */ void Q(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc24261b", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.Z();
        }
    }

    public static final /* synthetic */ void R(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ecc3b1", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.a0();
        }
    }

    public static final /* synthetic */ void S(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5b19fd", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.b0();
        }
    }

    public static final /* synthetic */ r T(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("3b87a613", new Object[]{shopLoftNewVideoViewWithDW});
        }
        return shopLoftNewVideoViewWithDW.q;
    }

    public static final /* synthetic */ JSONObject U(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("370490e9", new Object[]{shopLoftNewVideoViewWithDW});
        }
        return shopLoftNewVideoViewWithDW.c0();
    }

    public static final /* synthetic */ cpp V(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpp) ipChange.ipc$dispatch("22b55127", new Object[]{shopLoftNewVideoViewWithDW});
        }
        return shopLoftNewVideoViewWithDW.A;
    }

    public static final /* synthetic */ z9w W(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9w) ipChange.ipc$dispatch("f9fbd3f9", new Object[]{shopLoftNewVideoViewWithDW});
        }
        return shopLoftNewVideoViewWithDW.z;
    }

    public static final /* synthetic */ void X(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5949db7a", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.f0();
        }
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1087026559:
                super.onDestroyed();
                return null;
            case 50486379:
                super.didDisappear();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1100907343:
                super.initWithData((Context) objArr[0], (JSONObject) objArr[1], (xpd.c) objArr[2], (xpd.a) objArr[3]);
                return null;
            case 1580371323:
                super.didAppear();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW");
        }
    }

    @Override // tb.jht.b
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5b1d67bd", new Object[]{this});
        }
        return q();
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c251844", new Object[]{this});
            return;
        }
        r rVar = this.q;
        if (rVar != null) {
            rVar.W();
        }
        TUrlImageView tUrlImageView = this.y;
        if (tUrlImageView != null) {
            kew.g0(tUrlImageView);
        } else {
            ckf.y("pauseButton");
            throw null;
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9f60f8", new Object[]{this});
        } else if (j()) {
            if (this.x) {
                r rVar = this.q;
                if (rVar != null) {
                    rVar.Y();
                }
            } else {
                r rVar2 = this.q;
                if (rVar2 != null) {
                    rVar2.O0();
                }
            }
            TUrlImageView tUrlImageView = this.y;
            if (tUrlImageView != null) {
                kew.C(tUrlImageView);
            } else {
                ckf.y("pauseButton");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        super.didAppear();
        play();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        super.didDisappear();
        pause();
        TUrlImageView tUrlImageView = this.y;
        if (tUrlImageView != null) {
            kew.C(tUrlImageView);
        } else {
            ckf.y("pauseButton");
            throw null;
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d465101b", new Object[]{this});
            return;
        }
        npp.Companion.b("trigger shop loft video LongClick");
        ShopWrapWebView w = w();
        if (w != null) {
            bpp.c(w);
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        super.initWithData(context, jSONObject, cVar, aVar);
        ckf.d(aVar);
        xpd.a.AbstractC1101a a2 = aVar.a("shopLoftVideoController");
        if (a2 != null) {
            this.z = (z9w) a2;
            xpd.a.AbstractC1101a a3 = aVar.a("shopLoftFeedsController");
            if (a3 != null) {
                this.A = (cpp) a3;
                e0();
                d0();
                C();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftFeedsController");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.newStyle.VideoPlayController");
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        r rVar = this.q;
        if (rVar != null) {
            rVar.V(z);
        }
        if (z) {
            Y();
        } else {
            Z();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("417bd825", new Object[]{this});
        }
        final Context m = m();
        return new FrameLayout(m) { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW$getDelegateRooView$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final GestureDetector gestureDetector;
            private final a simpleGestureDetector;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class a extends GestureDetector.SimpleOnGestureListener {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ShopLoftNewVideoViewWithDW f3025a;

                public a(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
                    this.f3025a = shopLoftNewVideoViewWithDW;
                }

                public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getDelegateRooView$1$simpleGestureDetector$1");
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    } else {
                        ShopLoftNewVideoViewWithDW.X(this.f3025a);
                    }
                }
            }

            {
                a aVar = new a(ShopLoftNewVideoViewWithDW.this);
                this.simpleGestureDetector = aVar;
                this.gestureDetector = new GestureDetector(getContext(), aVar);
            }

            public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW$getDelegateRooView$1 shopLoftNewVideoViewWithDW$getDelegateRooView$1, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoViewWithDW$getDelegateRooView$1");
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                this.gestureDetector.onTouchEvent(motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }

            public final GestureDetector getGestureDetector() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (GestureDetector) ipChange2.ipc$dispatch("82bf1660", new Object[]{this});
                }
                return this.gestureDetector;
            }

            public final a getSimpleGestureDetector() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("12bf9c70", new Object[]{this});
                }
                return this.simpleGestureDetector;
            }
        };
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        a0();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void onActivityResume() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        try {
            b0();
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        super.onDestroyed();
        r rVar = this.q;
        if (rVar != null) {
            rVar.W();
        }
        r rVar2 = this.q;
        if (rVar2 != null) {
            rVar2.y();
        }
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        z9w z9wVar = this.z;
        if (z9wVar == null) {
            ckf.y("videoPlayController");
            throw null;
        } else if (z9wVar.e()) {
            r54.C(new ShopLoftNewVideoViewWithDW$onVideoComplete$1(this));
        } else {
            play();
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        npp.a aVar = npp.Companion;
        StringBuilder sb = new StringBuilder("onDWError : ");
        sb.append((Object) (obj == null ? null : obj.toString()));
        sb.append(" , ");
        sb.append(i);
        sb.append(" , ");
        sb.append(i2);
        aVar.b(sb.toString());
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopWrapWebView w = w();
        if (w != null) {
            bpp.d(w);
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        ShopWrapWebView w = w();
        if (w != null) {
            r rVar = this.q;
            if (rVar == null) {
                i = 0;
            } else {
                i = (int) rVar.C();
            }
            r rVar2 = this.q;
            if (rVar2 != null) {
                i2 = rVar2.B();
            }
            bpp.e(w, i, i2);
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        ShopWrapWebView w;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        r rVar = this.q;
        if (rVar != null && rVar.U() && (w = w()) != null) {
            r rVar2 = this.q;
            if (rVar2 != null) {
                i2 = (int) rVar2.C();
            }
            bpp.e(w, i2, i);
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.x = true;
        ShopWrapWebView w = w();
        if (w != null) {
            r rVar = this.q;
            if (rVar == null) {
                i = 0;
            } else {
                i = (int) rVar.C();
            }
            r rVar2 = this.q;
            if (rVar2 != null) {
                i2 = rVar2.B();
            }
            bpp.e(w, i, i2);
        }
    }

    @Override // tb.xpd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            a0();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            b0();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3c773c7a", new Object[]{this});
        }
        r rVar = this.q;
        if (rVar == null) {
            return null;
        }
        return brf.a(jpu.a("current_play_time", Integer.valueOf(rVar.B())));
    }

    @Override // tb.xpd
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public ShopWrapWebView z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("913f6b8e", new Object[]{this});
        }
        if (w() == null) {
            M(new NewVideoViewWebView(m()));
            ShopWrapWebView w = w();
            ckf.d(w);
            w.getShopLoftWebViewBizAdapter().q(new ShopLoftNewVideoViewWithDW$getWebView$1(this));
            ShopWrapWebView w2 = w();
            ckf.d(w2);
            w2.getShopLoftWebViewBizAdapter().t(new ShopLoftNewVideoViewWithDW$getWebView$2(this));
            ShopWrapWebView w3 = w();
            ckf.d(w3);
            w3.getShopLoftWebViewBizAdapter().m(new ShopLoftNewVideoViewWithDW$getWebView$3(this));
            ShopWrapWebView w4 = w();
            ckf.d(w4);
            w4.getShopLoftWebViewBizAdapter().l(new ShopLoftNewVideoViewWithDW$getWebView$4(this));
            ShopWrapWebView w5 = w();
            ckf.d(w5);
            w5.getShopLoftWebViewBizAdapter().r(new ShopLoftNewVideoViewWithDW$getWebView$5(this));
        }
        ShopWrapWebView w6 = w();
        ckf.d(w6);
        return w6;
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf28d9d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.D;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.F);
            r rVar = this.q;
            if (rVar != null) {
                rVar.V(true);
            }
            ShopExtKt.e0(true);
            return;
        }
        ckf.y("muteButton");
        throw null;
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6064851a", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.D;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.G);
            r rVar = this.q;
            if (rVar != null) {
                rVar.V(false);
            }
            ShopExtKt.e0(false);
            return;
        }
        ckf.y("muteButton");
        throw null;
    }

    public final void e0() {
        Integer m;
        Integer m2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55ed21", new Object[]{this});
            return;
        }
        JSONObject s = s();
        if (s != null) {
            this.s = s.getString("videoId");
            this.r = s.getString("videoUrl");
            this.t = s.getString("picUrl");
            String string = s.getString("height");
            this.v = (string == null || (m2 = ssq.m(string)) == null) ? 0 : m2.intValue();
            String string2 = s.getString("width");
            if (!(string2 == null || (m = ssq.m(string2)) == null)) {
                i = m.intValue();
            }
            this.w = i;
            int i2 = this.v;
            if (!(i2 == 0 || i == 0)) {
                this.u = i2 / i;
            }
            String string3 = s.getString("initMuteStatus");
            if (string3 != null) {
                this.E = ckf.b(string3, "true");
            }
        }
    }

    public final JSONObject c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4c44384c", new Object[]{this});
        }
        r rVar = this.q;
        Boolean bool = null;
        Pair a2 = jpu.a("totalTime", rVar == null ? null : Long.valueOf(rVar.C()));
        r rVar2 = this.q;
        Pair a3 = jpu.a(tmu.CURRENT_TIME, rVar2 == null ? null : Integer.valueOf(rVar2.B()));
        r rVar3 = this.q;
        if (rVar3 != null) {
            bool = Boolean.valueOf(rVar3.U());
        }
        return brf.a(a2, a3, jpu.a("isPlaying", bool));
    }

    public final void d0() {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map<String, String> T;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
            return;
        }
        this.C = this.B + kew.y(m()) + kew.p(30);
        boolean z = this.E;
        r.a aVar = new r.a((Activity) m());
        int i = r54.m((Activity) m()).widthPixels;
        int i2 = (this.v == 0 || this.w == 0) ? -2 : (int) (i * this.u);
        aVar.t(i2);
        aVar.g0(i);
        aVar.b0(this.s);
        aVar.f0(this.r);
        aVar.q(DWInstanceType.VIDEO);
        aqp.a aVar2 = aqp.Companion;
        if (aVar2.o()) {
            aVar.V(true);
        }
        if (aVar2.o()) {
            str = "TRIVER_SHOP_BIGCARD";
        } else {
            str = "TRIVER_SHOP_BIGCARD_TEMP";
        }
        aVar.g(str);
        aVar.d0("TBVideo");
        aVar.A(ShopExtKt.y());
        aVar.Z(DWAspectRatio.DW_CENTER_CROP);
        JSONObject s = s();
        aVar.T((s == null || (jSONObject = s.getJSONObject("spmParams")) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null || (T = r54.T(jSONObject2)) == null) ? null : r54.i(T));
        r h0 = aVar.a();
        this.q = h0;
        if (h0 != null) {
            h0.H0(this);
        }
        String str2 = this.t;
        if (str2 != null) {
            TUrlImageView tUrlImageView = new TUrlImageView(m());
            tUrlImageView.setImageUrl(str2);
            r rVar = this.q;
            if (rVar != null) {
                rVar.x0(tUrlImageView);
            }
            xhv xhvVar = xhv.INSTANCE;
            if (khu.e()) {
                TUrlImageView tUrlImageView2 = new TUrlImageView(m());
                tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01xenXqr1O62GkoCtKn_!!6000000001655-2-tps-750-1334.png");
                kew.a(l(), tUrlImageView2);
            } else {
                ImageView imageView = new ImageView(m());
                s0m.B().T(ImageStrategyDecider.decideUrl(str2, 300, 300, null)).bitmapProcessors(new yf2(m(), 15)).into(imageView, 2.0f);
                imageView.setScaleX(3.0f);
                imageView.setScaleY(3.0f);
                kew.a(l(), imageView);
            }
        }
        r rVar2 = this.q;
        if (rVar2 != null) {
            rVar2.a0();
        }
        r rVar3 = this.q;
        if (rVar3 != null) {
            rVar3.r();
        }
        FrameLayout l = l();
        r rVar4 = this.q;
        l.addView(rVar4 == null ? null : rVar4.K(), new FrameLayout.LayoutParams(-1, i2, 17));
        TUrlImageView tUrlImageView3 = new TUrlImageView(m());
        tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Km8yT71aV1JdMdoKB_!!6000000003334-2-tps-124-140.png");
        kew.C(tUrlImageView3);
        xhv xhvVar2 = xhv.INSTANCE;
        this.y = tUrlImageView3;
        FrameLayout l2 = l();
        TUrlImageView tUrlImageView4 = this.y;
        if (tUrlImageView4 != null) {
            l2.addView(tUrlImageView4, new FrameLayout.LayoutParams(kew.p(47), kew.p(55), 17));
            ClickView clickView = new ClickView(m());
            clickView.setOnClickListener(new kpp(this));
            kew.a(l(), clickView);
            TUrlImageView tUrlImageView5 = new TUrlImageView(m());
            this.D = tUrlImageView5;
            if (z) {
                tUrlImageView5.setImageUrl(this.F);
            } else {
                tUrlImageView5.setImageUrl(this.G);
            }
            tUrlImageView5.setOnClickListener(new lpp(this));
            int p = kew.p(30);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p, p);
            layoutParams.topMargin = this.C;
            layoutParams.gravity = BadgeDrawable.TOP_END;
            layoutParams.rightMargin = kew.p(15);
            l().addView(tUrlImageView5, layoutParams);
            return;
        }
        ckf.y("pauseButton");
        throw null;
    }
}
