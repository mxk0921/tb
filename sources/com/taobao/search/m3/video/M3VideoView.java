package com.taobao.search.m3.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.search.m3.video.M3VideoView;
import tb.a07;
import tb.aub;
import tb.ckf;
import tb.fht;
import tb.g6p;
import tb.p1p;
import tb.paw;
import tb.r4p;
import tb.soc;
import tb.t2o;
import tb.w8e;
import tb.yj4;
import tb.ztb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class M3VideoView extends FrameLayout implements ztb, aub {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    private static final float countDownTranslation = p1p.a(13.0f);
    private final CountDownView countDownView;
    private final M3ImageView cover;
    private long delayTime;
    private boolean hideCountDown;
    private boolean showIcon;
    private String videoId;
    private w8e videoInstance;
    private soc videoListener;
    private String videoUrl;
    private final boolean waterfall;
    private String itemId = "";
    private String rn = "";
    private final int playMsg = 1;
    private float currentRadius = M3ImageView.Companion.c();
    private final c playHandler = new c(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/video/M3VideoView$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), M3VideoView.access$getCurrentRadius$p(M3VideoView.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        static {
            t2o.a(815792468);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/video/M3VideoView$playHandler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                M3VideoView.access$playImpl(M3VideoView.this);
            }
        }
    }

    static {
        t2o.a(815792466);
        t2o.a(452985010);
        t2o.a(452985012);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3VideoView(Context context, boolean z) {
        super(context);
        ckf.g(context, "context");
        this.waterfall = z;
        CountDownView countDownView = new CountDownView(context);
        this.countDownView = countDownView;
        M3ImageView m3ImageView = new M3ImageView(context, z, true);
        this.cover = m3ImageView;
        setClipToOutline(true);
        setOutlineProvider(new a());
        m3ImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(m3ImageView, new FrameLayout.LayoutParams(-1, -1));
        addView(countDownView);
        float f = countDownTranslation;
        countDownView.setTranslationX(f);
        countDownView.setTranslationY(f);
    }

    public static final /* synthetic */ float access$getCurrentRadius$p(M3VideoView m3VideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("311755b6", new Object[]{m3VideoView})).floatValue();
        }
        return m3VideoView.currentRadius;
    }

    public static final /* synthetic */ void access$playImpl(M3VideoView m3VideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53cd79", new Object[]{m3VideoView});
        } else {
            m3VideoView.playImpl();
        }
    }

    public static /* synthetic */ Object ipc$super(M3VideoView m3VideoView, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/video/M3VideoView");
    }

    private final void playImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc351fb", new Object[]{this});
            return;
        }
        w8e w8eVar = this.videoInstance;
        if (w8eVar != null) {
            w8eVar.playVideo();
            return;
        }
        String str = this.videoUrl;
        if (str == null) {
            str = "";
        }
        w8e createDwInstance = createDwInstance(str, this.videoId);
        addView(createDwInstance.getView(), 1, new FrameLayout.LayoutParams(-1, -1));
        this.playHandler.post(new Runnable() { // from class: tb.rbz
            @Override // java.lang.Runnable
            public final void run() {
                M3VideoView.playImpl$lambda$0(M3VideoView.this);
            }
        });
        createDwInstance.start();
        this.videoInstance = createDwInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playImpl$lambda$0(M3VideoView m3VideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9463ee08", new Object[]{m3VideoView});
            return;
        }
        ckf.g(m3VideoView, "this$0");
        m3VideoView.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        w8e w8eVar = this.videoInstance;
        if (w8eVar == null || w8eVar.getView().getVisibility() == 8) {
            canvas.drawColor(M3ImageView.Companion.b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        stop();
        soc socVar = this.videoListener;
        if (socVar != null) {
            socVar.D(false);
        }
    }

    @Override // tb.ztb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        stop();
        soc socVar = this.videoListener;
        if (socVar != null) {
            socVar.D(true);
        }
    }

    @Override // tb.ztb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        stop();
        soc socVar = this.videoListener;
        if (socVar != null) {
            socVar.D(true);
        }
    }

    @Override // tb.ztb
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ztb
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        soc socVar = this.videoListener;
        if (socVar != null) {
            socVar.D(false);
        }
        stop();
    }

    @Override // tb.ztb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ztb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.showIcon) {
            this.countDownView.update(true ^ this.hideCountDown, i3, i);
        }
    }

    @Override // tb.ztb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ztb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        this.playHandler.removeMessages(this.playMsg);
        long j = this.delayTime;
        if (j > 0) {
            this.playHandler.sendEmptyMessageDelayed(this.playMsg, j);
        } else {
            playImpl();
        }
    }

    public final void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.playHandler.removeMessages(this.playMsg);
        w8e w8eVar = this.videoInstance;
        if (w8eVar != null) {
            removeView(w8eVar.getView());
            w8eVar.pauseVideo();
            w8eVar.destroy();
        }
        this.videoInstance = null;
        if (this.showIcon) {
            this.countDownView.update(false, 0, 0);
        }
    }

    private final w8e createDwInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8e) ipChange.ipc$dispatch("2a91f26f", new Object[]{this, str, str2});
        }
        fht fhtVar = new fht(this, this);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "item_id", g6p.d(this.itemId));
        jSONObject.put((JSONObject) yj4.PARAM_SEARCH_KEYWORD_RN, g6p.d(this.rn));
        Context context = getContext();
        ckf.f(context, "getContext(...)");
        fhtVar.f(context, str, true, false, str2, r4p.DEFAULT_VIDEO_BIZ_CODE, "", jSONObject, "cover", getMeasuredWidth(), getMeasuredHeight(), new paw("", "", jSONObject, "cover"));
        return fhtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean update(com.taobao.search.m3.M3CellBean r6, tb.soc r7, com.taobao.search.searchdoor.sf.config.TbSearchStyle r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.video.M3VideoView.update(com.taobao.search.m3.M3CellBean, tb.soc, com.taobao.search.searchdoor.sf.config.TbSearchStyle):boolean");
    }
}
