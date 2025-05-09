package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.ut.share.business.ShareContent;
import java.io.Serializable;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import tb.asc;
import tb.ckf;
import tb.fsc;
import tb.swr;
import tb.t2o;
import tb.tuc;
import tb.xhv;
import tb.xpd;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBMiniShopVideoView implements tuc, asc, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private xpd.c actionCallback;
    private Context context;
    private String coverUrl;
    private JSONObject params;
    private String url;
    private MediaAspectRatio aspectRatio = MediaAspectRatio.DW_CENTER_CROP;
    private final swr tbShopVideo = new swr();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements fsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xpd.c f3012a;

        public a(xpd.c cVar) {
            this.f3012a = cVar;
        }

        @Override // tb.fsc
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f38cbe1d", new Object[]{this});
                return;
            }
            xpd.c cVar = this.f3012a;
            if (cVar != null) {
                cVar.p("onPause", null);
            }
        }
    }

    static {
        t2o.a(766509220);
        t2o.a(766509125);
        t2o.a(774897787);
    }

    public static final /* synthetic */ String access$getUrl$p(TBMiniShopVideoView tBMiniShopVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a96131e", new Object[]{tBMiniShopVideoView});
        }
        return tBMiniShopVideoView.url;
    }

    private final void registerAutoRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfea16bc", new Object[]{this});
            return;
        }
        final Context context = this.context;
        if (context instanceof FragmentActivity) {
            ((FragmentActivity) context).getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.TBMiniShopVideoView$registerAutoRelease$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroyed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                        return;
                    }
                    ((FragmentActivity) context).getLifecycle().removeObserver(this);
                    try {
                        this.onDestroyed();
                        Result.m1108constructorimpl(xhv.INSTANCE);
                    } catch (Throwable th) {
                        Result.m1108constructorimpl(b.a(th));
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public final void onPaused() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c47335f4", new Object[]{this});
                        return;
                    }
                    try {
                        Result.m1108constructorimpl(xhv.INSTANCE);
                    } catch (Throwable th) {
                        Result.m1108constructorimpl(b.a(th));
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                        return;
                    }
                    try {
                        Result.m1108constructorimpl(xhv.INSTANCE);
                    } catch (Throwable th) {
                        Result.m1108constructorimpl(b.a(th));
                    }
                }
            });
        }
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        } else {
            play();
        }
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        } else {
            pause();
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    public MediaAspectRatio getAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaAspectRatio) ipChange.ipc$dispatch("dd8523ae", new Object[]{this});
        }
        return this.aspectRatio;
    }

    @Override // tb.xpd
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        return null;
    }

    @Override // tb.xpd
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return null;
    }

    @Override // tb.xpd
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        return null;
    }

    @Override // tb.xpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.tbShopVideo.f();
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.context = context;
        this.params = jSONObject;
        this.actionCallback = cVar;
        parseParams();
        this.tbShopVideo.b(context, new TBMiniShopVideoView$initWithData$1(this));
        this.tbShopVideo.q(new a(cVar));
        this.tbShopVideo.n(this);
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.tbShopVideo.i(z);
        }
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            this.tbShopVideo.j();
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            this.tbShopVideo.r();
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        this.tbShopVideo.j();
        this.tbShopVideo.d();
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
        xpd.c cVar = this.actionCallback;
        if (cVar != null) {
            cVar.p("onFinish", null);
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(',');
        sb.append(i2);
        jSONObject.put((JSONObject) "errorCode", sb.toString());
        xpd.c cVar = this.actionCallback;
        if (cVar != null) {
            cVar.p("onError", jSONObject);
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
        xpd.c cVar = this.actionCallback;
        if (cVar != null) {
            cVar.p("onPause", null);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        xpd.c cVar = this.actionCallback;
        if (cVar != null) {
            cVar.p("onPlay", null);
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
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        xpd.c cVar = this.actionCallback;
        if (cVar != null) {
            cVar.p("onPlay", null);
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
            this.tbShopVideo.j();
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            this.tbShopVideo.r();
        }
    }

    @Override // tb.tuc
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else {
            this.tbShopVideo.k();
        }
    }

    @Override // tb.tuc
    public void setAspectRatio(MediaAspectRatio mediaAspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f4294", new Object[]{this, mediaAspectRatio});
            return;
        }
        ckf.g(mediaAspectRatio, "<set-?>");
        this.aspectRatio = mediaAspectRatio;
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

    private final void parseParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e136be20", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.params;
        String str = null;
        this.url = jSONObject == null ? null : jSONObject.getString("videoUrl");
        JSONObject jSONObject2 = this.params;
        if (jSONObject2 != null) {
            str = jSONObject2.getString("coverPicUrl");
        }
        this.coverUrl = str;
        JSONObject jSONObject3 = this.params;
        if (jSONObject3 != null && jSONObject3.containsKey("autoRelease")) {
            registerAutoRelease();
        }
    }
}
