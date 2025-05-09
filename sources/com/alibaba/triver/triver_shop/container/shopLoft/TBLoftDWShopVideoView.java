package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import tb.asc;
import tb.bpp;
import tb.brf;
import tb.ckf;
import tb.cpp;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.npp;
import tb.r54;
import tb.s0m;
import tb.ssq;
import tb.swr;
import tb.t2o;
import tb.tmu;
import tb.vnr;
import tb.wnr;
import tb.xhv;
import tb.xpd;
import tb.yf2;
import tb.z9w;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBLoftDWShopVideoView extends ShopLoftViewNewStyleBaseView implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int B;
    public TUrlImageView C;
    public String r;
    public String s;
    public String t;
    public int v;
    public int w;
    public TUrlImageView x;
    public z9w y;
    public cpp z;
    public final swr q = new swr();
    public float u = 1.7777778f;
    public final int A = kew.p(30);
    public boolean D = true;
    public final String E = "https://img.alicdn.com/imgextra/i3/O1CN01mZTjld1GqHPdygPdg_!!6000000000673-2-tps-84-84.png";
    public final String F = "https://img.alicdn.com/imgextra/i3/O1CN01Dw6Ypv1R3Em1OMooC_!!6000000002055-2-tps-84-84.png";

    static {
        t2o.a(766509201);
        t2o.a(774897787);
    }

    public static final /* synthetic */ void P(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655de65e", new Object[]{tBLoftDWShopVideoView});
        } else {
            tBLoftDWShopVideoView.b0();
        }
    }

    public static final /* synthetic */ void Q(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7e7a01", new Object[]{tBLoftDWShopVideoView});
        } else {
            tBLoftDWShopVideoView.c0();
        }
    }

    public static final /* synthetic */ void R(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4274f617", new Object[]{tBLoftDWShopVideoView});
        } else {
            tBLoftDWShopVideoView.d0();
        }
    }

    public static final /* synthetic */ void S(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37af0163", new Object[]{tBLoftDWShopVideoView});
        } else {
            tBLoftDWShopVideoView.e0();
        }
    }

    public static final /* synthetic */ xpd.c T(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd.c) ipChange.ipc$dispatch("9541dd85", new Object[]{tBLoftDWShopVideoView});
        }
        return tBLoftDWShopVideoView.h();
    }

    public static final /* synthetic */ JSONObject U(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aa3bb54f", new Object[]{tBLoftDWShopVideoView});
        }
        return tBLoftDWShopVideoView.f0();
    }

    public static final /* synthetic */ cpp V(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpp) ipChange.ipc$dispatch("1d8b32cd", new Object[]{tBLoftDWShopVideoView});
        }
        return tBLoftDWShopVideoView.z;
    }

    public static final /* synthetic */ swr W(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swr) ipChange.ipc$dispatch("e277d06e", new Object[]{tBLoftDWShopVideoView});
        }
        return tBLoftDWShopVideoView.q;
    }

    public static final /* synthetic */ String X(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7421af8", new Object[]{tBLoftDWShopVideoView});
        }
        return tBLoftDWShopVideoView.s;
    }

    public static final /* synthetic */ z9w Y(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9w) ipChange.ipc$dispatch("eaea17d3", new Object[]{tBLoftDWShopVideoView});
        }
        return tBLoftDWShopVideoView.y;
    }

    public static final /* synthetic */ String Z(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9547622", new Object[]{tBLoftDWShopVideoView});
        }
        return tBLoftDWShopVideoView.r;
    }

    public static final /* synthetic */ void a0(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5971a0", new Object[]{tBLoftDWShopVideoView});
        } else {
            tBLoftDWShopVideoView.i0();
        }
    }

    public static /* synthetic */ Object ipc$super(TBLoftDWShopVideoView tBLoftDWShopVideoView, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBLoftDWShopVideoView");
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

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c251844", new Object[]{this});
            return;
        }
        this.q.j();
        TUrlImageView tUrlImageView = this.x;
        if (tUrlImageView != null) {
            kew.g0(tUrlImageView);
        } else {
            ckf.y("pauseButton");
            throw null;
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
        TUrlImageView tUrlImageView = this.x;
        if (tUrlImageView != null) {
            kew.C(tUrlImageView);
        } else {
            ckf.y("pauseButton");
            throw null;
        }
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9f60f8", new Object[]{this});
        } else if (j()) {
            this.q.r();
            TUrlImageView tUrlImageView = this.x;
            if (tUrlImageView != null) {
                kew.C(tUrlImageView);
            } else {
                ckf.y("pauseButton");
                throw null;
            }
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    public final void i0() {
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
            this.y = (z9w) a2;
            xpd.a.AbstractC1101a a3 = aVar.a("shopLoftFeedsController");
            if (a3 != null) {
                this.z = (cpp) a3;
                h0();
                g0();
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
        this.q.i(z);
        if (z) {
            b0();
        } else {
            c0();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("417bd825", new Object[]{this});
        }
        final Context m = m();
        return new FrameLayout(m) { // from class: com.alibaba.triver.triver_shop.container.shopLoft.TBLoftDWShopVideoView$getDelegateRooView$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final GestureDetector gestureDetector;
            private final a simpleGestureDetector;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class a extends GestureDetector.SimpleOnGestureListener {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ TBLoftDWShopVideoView f3008a;

                public a(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
                    this.f3008a = tBLoftDWShopVideoView;
                }

                public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBLoftDWShopVideoView$getDelegateRooView$1$simpleGestureDetector$1");
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    } else {
                        TBLoftDWShopVideoView.a0(this.f3008a);
                    }
                }
            }

            {
                a aVar = new a(TBLoftDWShopVideoView.this);
                this.simpleGestureDetector = aVar;
                this.gestureDetector = new GestureDetector(getContext(), aVar);
            }

            public static /* synthetic */ Object ipc$super(TBLoftDWShopVideoView$getDelegateRooView$1 tBLoftDWShopVideoView$getDelegateRooView$1, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBLoftDWShopVideoView$getDelegateRooView$1");
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
                    return (a) ipChange2.ipc$dispatch("bc55700a", new Object[]{this});
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
        d0();
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
            e0();
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
        this.q.j();
        this.q.d();
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        z9w z9wVar = this.y;
        if (z9wVar == null) {
            ckf.y("videoPlayController");
            throw null;
        } else if (z9wVar.e()) {
            r54.C(new TBLoftDWShopVideoView$onMediaComplete$1(this));
        } else {
            play();
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        npp.a aVar = npp.Companion;
        StringBuilder sb = new StringBuilder("onDWError : ");
        sb.append((Object) (iMediaPlayer == null ? null : iMediaPlayer.toString()));
        sb.append(" , ");
        sb.append(i);
        sb.append(" , ");
        sb.append(i2);
        aVar.b(sb.toString());
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopWrapWebView w = w();
        if (w != null) {
            bpp.d(w);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        ShopWrapWebView w = w();
        if (w != null) {
            bpp.e(w, (int) this.q.e(), (int) this.q.c());
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        ShopWrapWebView w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        } else if (this.q.h() && (w = w()) != null) {
            bpp.e(w, (int) this.q.e(), i);
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        ShopWrapWebView w = w();
        if (w != null) {
            bpp.e(w, (int) this.q.e(), (int) this.q.c());
        }
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            d0();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            e0();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3c773c7a", new Object[]{this});
        }
        return brf.a(jpu.a("current_play_time", Long.valueOf(this.q.c())));
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
            M(new ShopLoftNewVideoViewWithDW.NewVideoViewWebView(m()));
            ShopWrapWebView w = w();
            ckf.d(w);
            w.getShopLoftWebViewBizAdapter().q(new TBLoftDWShopVideoView$getWebView$1(this));
            ShopWrapWebView w2 = w();
            ckf.d(w2);
            w2.getShopLoftWebViewBizAdapter().t(new TBLoftDWShopVideoView$getWebView$2(this));
            ShopWrapWebView w3 = w();
            ckf.d(w3);
            w3.getShopLoftWebViewBizAdapter().m(new TBLoftDWShopVideoView$getWebView$3(this));
            ShopWrapWebView w4 = w();
            ckf.d(w4);
            w4.getShopLoftWebViewBizAdapter().l(new TBLoftDWShopVideoView$getWebView$4(this));
            ShopWrapWebView w5 = w();
            ckf.d(w5);
            w5.getShopLoftWebViewBizAdapter().r(new TBLoftDWShopVideoView$getWebView$5(this));
        }
        ShopWrapWebView w6 = w();
        ckf.d(w6);
        return w6;
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf28d9d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.C;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.E);
            this.q.i(true);
            ShopExtKt.e0(true);
            return;
        }
        ckf.y("muteButton");
        throw null;
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6064851a", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.C;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.F);
            this.q.i(false);
            ShopExtKt.e0(false);
            return;
        }
        ckf.y("muteButton");
        throw null;
    }

    public final void h0() {
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
                this.D = ckf.b(string3, "true");
            }
        }
    }

    public final JSONObject f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4c44384c", new Object[]{this});
        }
        return brf.a(jpu.a("totalTime", Long.valueOf(this.q.e())), jpu.a(tmu.CURRENT_TIME, Long.valueOf(this.q.c())), jpu.a("isPlaying", Boolean.valueOf(this.q.h())));
    }

    public final void g0() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map<String, String> T;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
            return;
        }
        this.B = this.A + kew.y(m()) + kew.p(30);
        boolean z = this.D;
        int i = r54.m((Activity) m()).widthPixels;
        int i2 = (this.v == 0 || this.w == 0) ? -2 : (int) (i * this.u);
        this.q.b(m(), new TBLoftDWShopVideoView$initMediaPlayer$1(this, i, i2));
        swr swrVar = this.q;
        JSONObject s = s();
        swrVar.p((s == null || (jSONObject = s.getJSONObject("spmParams")) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null || (T = r54.T(jSONObject2)) == null) ? null : r54.i(T));
        this.q.n(this);
        String str = this.t;
        if (str != null) {
            new TUrlImageView(m()).setImageUrl(str);
            this.q.m(str);
            xhv xhvVar = xhv.INSTANCE;
            if (khu.e()) {
                TUrlImageView tUrlImageView = new TUrlImageView(m());
                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01xenXqr1O62GkoCtKn_!!6000000001655-2-tps-750-1334.png");
                kew.a(l(), tUrlImageView);
            } else {
                ImageView imageView = new ImageView(m());
                s0m.B().T(ImageStrategyDecider.decideUrl(str, 300, 300, null)).bitmapProcessors(new yf2(m(), 15)).into(imageView, 2.0f);
                imageView.setScaleX(3.0f);
                imageView.setScaleY(3.0f);
                kew.a(l(), imageView);
            }
        }
        l().addView(this.q.f(), new FrameLayout.LayoutParams(-1, i2, 17));
        TUrlImageView tUrlImageView2 = new TUrlImageView(m());
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Km8yT71aV1JdMdoKB_!!6000000003334-2-tps-124-140.png");
        kew.C(tUrlImageView2);
        xhv xhvVar2 = xhv.INSTANCE;
        this.x = tUrlImageView2;
        FrameLayout l = l();
        TUrlImageView tUrlImageView3 = this.x;
        if (tUrlImageView3 != null) {
            l.addView(tUrlImageView3, new FrameLayout.LayoutParams(kew.p(47), kew.p(55), 17));
            ClickView clickView = new ClickView(m());
            clickView.setOnClickListener(new vnr(this));
            kew.a(l(), clickView);
            TUrlImageView tUrlImageView4 = new TUrlImageView(m());
            this.C = tUrlImageView4;
            if (z) {
                tUrlImageView4.setImageUrl(this.E);
            } else {
                tUrlImageView4.setImageUrl(this.F);
            }
            tUrlImageView4.setOnClickListener(new wnr(this));
            int p = kew.p(30);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p, p);
            layoutParams.topMargin = this.B;
            layoutParams.gravity = BadgeDrawable.TOP_END;
            layoutParams.rightMargin = kew.p(15);
            l().addView(tUrlImageView4, layoutParams);
            return;
        }
        ckf.y("pauseButton");
        throw null;
    }
}
