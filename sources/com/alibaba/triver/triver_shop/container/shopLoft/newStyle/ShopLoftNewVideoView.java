package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
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
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import tb.aqp;
import tb.asc;
import tb.bpp;
import tb.brf;
import tb.ckf;
import tb.gpp;
import tb.hpp;
import tb.ipp;
import tb.jpp;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.npp;
import tb.r54;
import tb.s0m;
import tb.ssq;
import tb.t2o;
import tb.tmu;
import tb.xhv;
import tb.xpd;
import tb.yf2;
import tb.z9w;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftNewVideoView extends ShopLoftViewNewStyleBaseView implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean C;
    public MediaPlayCenter q;
    public String r;
    public String s;
    public String t;
    public int v;
    public int w;
    public TUrlImageView x;
    public TUrlImageView y;
    public z9w z;
    public float u = 1.7777778f;
    public final String A = "https://img.alicdn.com/imgextra/i3/O1CN01mZTjld1GqHPdygPdg_!!6000000000673-2-tps-84-84.png";
    public final String B = "https://img.alicdn.com/imgextra/i3/O1CN01Dw6Ypv1R3Em1OMooC_!!6000000002055-2-tps-84-84.png";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class NewVideoViewWebView extends ShopWrapWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean hasMove;
        private float moveSize;
        private float startX;
        private float startY;
        public final /* synthetic */ ShopLoftNewVideoView this$0;
        private int touchSlop;

        static {
            t2o.a(766509257);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewVideoViewWebView(ShopLoftNewVideoView shopLoftNewVideoView, Context context) {
            super(context);
            ckf.g(shopLoftNewVideoView, "this$0");
            ckf.g(context, "context");
            this.this$0 = shopLoftNewVideoView;
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoView$NewVideoViewWebView");
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
        t2o.a(766509256);
        t2o.a(774897787);
    }

    public static final /* synthetic */ void P(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99260111", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.W();
        }
    }

    public static final /* synthetic */ void Q(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459641b4", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.X();
        }
    }

    public static final /* synthetic */ void R(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973247ca", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.Y();
        }
    }

    public static final /* synthetic */ void S(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7824716", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.Z();
        }
    }

    public static final /* synthetic */ MediaPlayCenter T(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayCenter) ipChange.ipc$dispatch("bc3fbc5e", new Object[]{shopLoftNewVideoView});
        }
        return shopLoftNewVideoView.q;
    }

    public static final /* synthetic */ JSONObject U(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6887e302", new Object[]{shopLoftNewVideoView});
        }
        return shopLoftNewVideoView.b0();
    }

    public static final /* synthetic */ z9w V(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z9w) ipChange.ipc$dispatch("50e6bdc0", new Object[]{shopLoftNewVideoView});
        }
        return shopLoftNewVideoView.z;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoView shopLoftNewVideoView, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftNewVideoView");
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c251844", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.q;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.pause();
            TUrlImageView tUrlImageView = this.x;
            if (tUrlImageView != null) {
                kew.g0(tUrlImageView);
            } else {
                ckf.y("pauseButton");
                throw null;
            }
        } else {
            ckf.y("mediaPlayCenter");
            throw null;
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9f60f8", new Object[]{this});
        } else if (j()) {
            MediaPlayCenter mediaPlayCenter = this.q;
            if (mediaPlayCenter != null) {
                mediaPlayCenter.start();
                TUrlImageView tUrlImageView = this.x;
                if (tUrlImageView != null) {
                    kew.C(tUrlImageView);
                } else {
                    ckf.y("pauseButton");
                    throw null;
                }
            } else {
                ckf.y("mediaPlayCenter");
                throw null;
            }
        }
    }

    public final boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f970299", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        super.didAppear();
        boolean y = ShopExtKt.y();
        this.C = y;
        if (y) {
            W();
        } else {
            X();
        }
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

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
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
            d0();
            c0();
            C();
            return;
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
        MediaPlayCenter mediaPlayCenter = this.q;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.mute(z);
        } else {
            ckf.y("mediaPlayCenter");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        Y();
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
            Z();
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
        MediaPlayCenter mediaPlayCenter = this.q;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.pause();
            MediaPlayCenter mediaPlayCenter2 = this.q;
            if (mediaPlayCenter2 != null) {
                mediaPlayCenter2.destroy();
            } else {
                ckf.y("mediaPlayCenter");
                throw null;
            }
        } else {
            ckf.y("mediaPlayCenter");
            throw null;
        }
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
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        }
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
            MediaPlayCenter mediaPlayCenter = this.q;
            if (mediaPlayCenter != null) {
                int duration = mediaPlayCenter.getDuration();
                MediaPlayCenter mediaPlayCenter2 = this.q;
                if (mediaPlayCenter2 != null) {
                    bpp.e(w, duration, mediaPlayCenter2.getCurrentPosition());
                } else {
                    ckf.y("mediaPlayCenter");
                    throw null;
                }
            } else {
                ckf.y("mediaPlayCenter");
                throw null;
            }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            return;
        }
        ShopWrapWebView w = w();
        if (w != null) {
            MediaPlayCenter mediaPlayCenter = this.q;
            if (mediaPlayCenter != null) {
                bpp.e(w, mediaPlayCenter.getDuration(), i);
            } else {
                ckf.y("mediaPlayCenter");
                throw null;
            }
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
            MediaPlayCenter mediaPlayCenter = this.q;
            if (mediaPlayCenter != null) {
                int duration = mediaPlayCenter.getDuration();
                MediaPlayCenter mediaPlayCenter2 = this.q;
                if (mediaPlayCenter2 != null) {
                    bpp.e(w, duration, mediaPlayCenter2.getCurrentPosition());
                } else {
                    ckf.y("mediaPlayCenter");
                    throw null;
                }
            } else {
                ckf.y("mediaPlayCenter");
                throw null;
            }
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
            Y();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            Z();
        }
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
            M(new NewVideoViewWebView(this, m()));
            ShopWrapWebView w = w();
            ckf.d(w);
            w.getShopLoftWebViewBizAdapter().q(new ShopLoftNewVideoView$getWebView$1(this));
            ShopWrapWebView w2 = w();
            ckf.d(w2);
            w2.getShopLoftWebViewBizAdapter().t(new ShopLoftNewVideoView$getWebView$2(this));
        }
        ShopWrapWebView w3 = w();
        ckf.d(w3);
        return w3;
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf28d9d", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.y;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.A);
            MediaPlayCenter mediaPlayCenter = this.q;
            if (mediaPlayCenter != null) {
                mediaPlayCenter.mute(true);
                ShopExtKt.e0(true);
                this.C = true;
                return;
            }
            ckf.y("mediaPlayCenter");
            throw null;
        }
        ckf.y("muteButton");
        throw null;
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6064851a", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.y;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(this.B);
            MediaPlayCenter mediaPlayCenter = this.q;
            if (mediaPlayCenter != null) {
                mediaPlayCenter.mute(false);
                ShopExtKt.e0(false);
                this.C = false;
                return;
            }
            ckf.y("mediaPlayCenter");
            throw null;
        }
        ckf.y("muteButton");
        throw null;
    }

    public final void d0() {
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
            if (i2 != 0 && i != 0) {
                this.u = i2 / i;
            }
        }
    }

    public final JSONObject b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4c44384c", new Object[]{this});
        }
        MediaPlayCenter mediaPlayCenter = this.q;
        if (mediaPlayCenter != null) {
            Pair a2 = jpu.a("totalTime", Integer.valueOf(mediaPlayCenter.getDuration()));
            MediaPlayCenter mediaPlayCenter2 = this.q;
            if (mediaPlayCenter2 != null) {
                Pair a3 = jpu.a(tmu.CURRENT_TIME, Integer.valueOf(mediaPlayCenter2.getCurrentPosition()));
                MediaPlayCenter mediaPlayCenter3 = this.q;
                if (mediaPlayCenter3 != null) {
                    return brf.a(a2, a3, jpu.a("isPlaying", Boolean.valueOf(mediaPlayCenter3.isPlaying())));
                }
                ckf.y("mediaPlayCenter");
                throw null;
            }
            ckf.y("mediaPlayCenter");
            throw null;
        }
        ckf.y("mediaPlayCenter");
        throw null;
    }

    public final void c0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23416bc", new Object[]{this});
            return;
        }
        int p = kew.p(30) + kew.y(m()) + kew.p(30);
        this.C = ShopExtKt.y();
        MediaPlayCenter mediaPlayCenter = new MediaPlayCenter(m());
        this.q = mediaPlayCenter;
        String str2 = this.r;
        mediaPlayCenter.setMediaId(this.s);
        MediaPlayCenter mediaPlayCenter2 = this.q;
        if (mediaPlayCenter2 != null) {
            mediaPlayCenter2.setMediaUrl(str2);
            MediaPlayCenter mediaPlayCenter3 = this.q;
            if (mediaPlayCenter3 != null) {
                mediaPlayCenter3.setMediaType(MediaType.VIDEO);
                MediaPlayCenter mediaPlayCenter4 = this.q;
                if (mediaPlayCenter4 != null) {
                    mediaPlayCenter4.setConfigGroup("DW");
                    MediaPlayCenter mediaPlayCenter5 = this.q;
                    if (mediaPlayCenter5 != null) {
                        mediaPlayCenter5.setNeedPlayControlView(false);
                        MediaPlayCenter mediaPlayCenter6 = this.q;
                        if (mediaPlayCenter6 != null) {
                            mediaPlayCenter6.hideController();
                            MediaPlayCenter mediaPlayCenter7 = this.q;
                            if (mediaPlayCenter7 != null) {
                                mediaPlayCenter7.setBusinessId("shop_mini_video");
                                aqp.a aVar = aqp.Companion;
                                if (aVar.o()) {
                                    MediaPlayCenter mediaPlayCenter8 = this.q;
                                    if (mediaPlayCenter8 != null) {
                                        mediaPlayCenter8.setUseShortAudioFocus(true);
                                    } else {
                                        ckf.y("mediaPlayCenter");
                                        throw null;
                                    }
                                }
                                MediaPlayCenter mediaPlayCenter9 = this.q;
                                if (mediaPlayCenter9 != null) {
                                    if (aVar.o()) {
                                        str = "TRIVER_SHOP_BIGCARD";
                                    } else {
                                        str = "TRIVER_SHOP_BIGCARD_TEMP";
                                    }
                                    mediaPlayCenter9.setBizCode(str);
                                    MediaPlayCenter mediaPlayCenter10 = this.q;
                                    if (mediaPlayCenter10 != null) {
                                        mediaPlayCenter10.setMediaSource("CDNVideo");
                                        MediaPlayCenter mediaPlayCenter11 = this.q;
                                        if (mediaPlayCenter11 != null) {
                                            mediaPlayCenter11.setPlayerType(3);
                                            MediaPlayCenter mediaPlayCenter12 = this.q;
                                            if (mediaPlayCenter12 != null) {
                                                mediaPlayCenter12.setScenarioType(0);
                                                MediaPlayCenter mediaPlayCenter13 = this.q;
                                                if (mediaPlayCenter13 != null) {
                                                    mediaPlayCenter13.setVideoLoop(true);
                                                    MediaPlayCenter mediaPlayCenter14 = this.q;
                                                    if (mediaPlayCenter14 != null) {
                                                        mediaPlayCenter14.setMute(this.C);
                                                        MediaPlayCenter mediaPlayCenter15 = this.q;
                                                        if (mediaPlayCenter15 != null) {
                                                            mediaPlayCenter15.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
                                                            MediaPlayCenter mediaPlayCenter16 = this.q;
                                                            if (mediaPlayCenter16 != null) {
                                                                mediaPlayCenter16.setVideoRecycleListener(gpp.INSTANCE);
                                                                String str3 = this.t;
                                                                if (str3 != null) {
                                                                    s0m.B().T(str3).succListener(new hpp(this)).fetch();
                                                                    if (khu.e()) {
                                                                        TUrlImageView tUrlImageView = new TUrlImageView(m());
                                                                        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01xenXqr1O62GkoCtKn_!!6000000001655-2-tps-750-1334.png");
                                                                        kew.a(l(), tUrlImageView);
                                                                    } else {
                                                                        ImageView imageView = new ImageView(m());
                                                                        s0m.B().T(ImageStrategyDecider.decideUrl(str3, 300, 300, null)).bitmapProcessors(new yf2(m(), 15)).into(imageView, 2.0f);
                                                                        imageView.setScaleX(3.0f);
                                                                        imageView.setScaleY(3.0f);
                                                                        kew.a(l(), imageView);
                                                                    }
                                                                }
                                                                MediaPlayCenter mediaPlayCenter17 = this.q;
                                                                if (mediaPlayCenter17 != null) {
                                                                    mediaPlayCenter17.setup();
                                                                    MediaPlayCenter mediaPlayCenter18 = this.q;
                                                                    if (mediaPlayCenter18 != null) {
                                                                        mediaPlayCenter18.prepareToFirstFrame();
                                                                        int i = (this.v == 0 || this.w == 0) ? -2 : (int) (r54.m((Activity) m()).widthPixels * this.u);
                                                                        FrameLayout l = l();
                                                                        MediaPlayCenter mediaPlayCenter19 = this.q;
                                                                        if (mediaPlayCenter19 != null) {
                                                                            l.addView(mediaPlayCenter19.getView(), new FrameLayout.LayoutParams(-1, i, 17));
                                                                            TUrlImageView tUrlImageView2 = new TUrlImageView(m());
                                                                            tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Km8yT71aV1JdMdoKB_!!6000000003334-2-tps-124-140.png");
                                                                            kew.C(tUrlImageView2);
                                                                            xhv xhvVar = xhv.INSTANCE;
                                                                            this.x = tUrlImageView2;
                                                                            FrameLayout l2 = l();
                                                                            TUrlImageView tUrlImageView3 = this.x;
                                                                            if (tUrlImageView3 != null) {
                                                                                l2.addView(tUrlImageView3, new FrameLayout.LayoutParams(kew.p(47), kew.p(55), 17));
                                                                                ClickView clickView = new ClickView(m());
                                                                                clickView.setOnClickListener(new ipp(this));
                                                                                kew.a(l(), clickView);
                                                                                MediaPlayCenter mediaPlayCenter20 = this.q;
                                                                                if (mediaPlayCenter20 != null) {
                                                                                    mediaPlayCenter20.setMediaLifecycleListener(this);
                                                                                    TUrlImageView tUrlImageView4 = new TUrlImageView(m());
                                                                                    this.y = tUrlImageView4;
                                                                                    if (a0()) {
                                                                                        tUrlImageView4.setImageUrl(this.A);
                                                                                    } else {
                                                                                        tUrlImageView4.setImageUrl(this.B);
                                                                                    }
                                                                                    tUrlImageView4.setOnClickListener(new jpp(this));
                                                                                    int p2 = kew.p(30);
                                                                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p2, p2);
                                                                                    layoutParams.topMargin = p;
                                                                                    layoutParams.gravity = BadgeDrawable.TOP_END;
                                                                                    layoutParams.rightMargin = kew.p(15);
                                                                                    l().addView(tUrlImageView4, layoutParams);
                                                                                    return;
                                                                                }
                                                                                ckf.y("mediaPlayCenter");
                                                                                throw null;
                                                                            }
                                                                            ckf.y("pauseButton");
                                                                            throw null;
                                                                        }
                                                                        ckf.y("mediaPlayCenter");
                                                                        throw null;
                                                                    }
                                                                    ckf.y("mediaPlayCenter");
                                                                    throw null;
                                                                }
                                                                ckf.y("mediaPlayCenter");
                                                                throw null;
                                                            }
                                                            ckf.y("mediaPlayCenter");
                                                            throw null;
                                                        }
                                                        ckf.y("mediaPlayCenter");
                                                        throw null;
                                                    }
                                                    ckf.y("mediaPlayCenter");
                                                    throw null;
                                                }
                                                ckf.y("mediaPlayCenter");
                                                throw null;
                                            }
                                            ckf.y("mediaPlayCenter");
                                            throw null;
                                        }
                                        ckf.y("mediaPlayCenter");
                                        throw null;
                                    }
                                    ckf.y("mediaPlayCenter");
                                    throw null;
                                }
                                ckf.y("mediaPlayCenter");
                                throw null;
                            }
                            ckf.y("mediaPlayCenter");
                            throw null;
                        }
                        ckf.y("mediaPlayCenter");
                        throw null;
                    }
                    ckf.y("mediaPlayCenter");
                    throw null;
                }
                ckf.y("mediaPlayCenter");
                throw null;
            }
            ckf.y("mediaPlayCenter");
            throw null;
        }
        ckf.y("mediaPlayCenter");
        throw null;
    }
}
