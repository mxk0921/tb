package com.taobao.android.dressup.common.view.video;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.VideoModel;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.kirinvideoengine.model.ConfigModel;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.schedule.ViewProxy;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a07;
import tb.at4;
import tb.ckf;
import tb.eub;
import tb.i5g;
import tb.qic;
import tb.ric;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001IB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\t\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u0019J\r\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010\u0019J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010\u0019J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010\u0019J\u0019\u0010'\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010%2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J;\u00102\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010%2\u0006\u0010+\u001a\u00020/2\u0006\u0010,\u001a\u00020/2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0004\b5\u0010\u0019J\u0019\u00107\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J'\u00109\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0016H\u0016¢\u0006\u0004\b;\u0010\u0019J\u000f\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010\u0019J\u0017\u0010=\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\u0017J\u000f\u0010>\u001a\u00020\u0016H\u0016¢\u0006\u0004\b>\u0010\u0019J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010G¨\u0006J"}, d2 = {"Lcom/taobao/android/dressup/common/view/video/VideoView;", "Landroid/widget/FrameLayout;", "Ltb/ric;", "Ltb/eub;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "mute", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "createMuteIcon", "(Landroid/content/Context;Z)Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "", "getMuteUrl", "(Z)Ljava/lang/String;", "createPlayIcon", "(Landroid/content/Context;)Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "Lcom/taobao/android/dressup/common/model/VideoModel;", "videoModel", "createCoverView", "(Landroid/content/Context;Lcom/taobao/android/dressup/common/model/VideoModel;)Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "Ltb/xhv;", "(Z)V", "showPlayIcon", "()V", "hideCoverView", "hidePlayIcon", "Ltb/qic;", "prepare", "(Landroid/content/Context;Lcom/taobao/android/dressup/common/model/VideoModel;)Ltb/qic;", "setVideoModel", "(Lcom/taobao/android/dressup/common/model/VideoModel;)V", "start", "pause", "resume", "destroy", "", "mp", "onVideoPrepared", "(Ljava/lang/Object;)V", "p0", "", p1.d, "p2", "onVideoError", "(Ljava/lang/Object;II)V", "", "p3", "p4", "onVideoInfo", "(Ljava/lang/Object;JJJLjava/lang/Object;)V", "onVideoComplete", "onVideoClose", "Lcom/taobao/avplayer/DWVideoScreenType;", "onVideoScreenChanged", "(Lcom/taobao/avplayer/DWVideoScreenType;)V", "onVideoProgressChanged", "(III)V", "onVideoRecycled", "onVideoStart", "onVideoPause", "onVideoPlay", "onVideoSeekTo", "(I)V", "videoInstance", "Ltb/qic;", "muteIcon", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "playIcon", "cover", "Lcom/taobao/android/dressup/common/model/VideoModel;", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class VideoView extends FrameLayout implements ric, eub {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static boolean muteState = true;
    private TUrlImageView cover;
    private TUrlImageView muteIcon;
    private TUrlImageView playIcon;
    private qic videoInstance;
    private VideoModel videoModel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552816);
        }

        public a() {
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3006ecd", new Object[]{this})).booleanValue();
            }
            return VideoView.access$getMuteState$cp();
        }

        public final void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85048537", new Object[]{this, new Boolean(z)});
            } else {
                VideoView.access$setMuteState$cp(z);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f7588a;
        public final /* synthetic */ VideoView b;

        public b(TUrlImageView tUrlImageView, VideoView videoView, boolean z, Context context) {
            this.f7588a = tUrlImageView;
            this.b = videoView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a aVar = VideoView.Companion;
            aVar.b(true ^ aVar.a());
            VideoView.access$mute(this.b, aVar.a());
            this.f7588a.setImageUrl(VideoView.access$getMuteUrl(this.b, aVar.a()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            qic access$getVideoInstance$p = VideoView.access$getVideoInstance$p(VideoView.this);
            if (access$getVideoInstance$p == null || access$getVideoInstance$p.getVideoState() != 2) {
                qic access$getVideoInstance$p2 = VideoView.access$getVideoInstance$p(VideoView.this);
                if (access$getVideoInstance$p2 != null && access$getVideoInstance$p2.getVideoState() == 1) {
                    VideoView.this.pause();
                    return;
                }
                return;
            }
            VideoView.this.resume();
        }
    }

    static {
        t2o.a(918552815);
        t2o.a(500170807);
        t2o.a(452985016);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ boolean access$getMuteState$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c9ffeda", new Object[0])).booleanValue();
        }
        return muteState;
    }

    public static final /* synthetic */ String access$getMuteUrl(VideoView videoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69d4474c", new Object[]{videoView, new Boolean(z)});
        }
        return videoView.getMuteUrl(z);
    }

    public static final /* synthetic */ qic access$getVideoInstance$p(VideoView videoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qic) ipChange.ipc$dispatch("fa97623b", new Object[]{videoView});
        }
        return videoView.videoInstance;
    }

    public static final /* synthetic */ void access$mute(VideoView videoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f7e2cbb", new Object[]{videoView, new Boolean(z)});
        } else {
            videoView.mute(z);
        }
    }

    public static final /* synthetic */ void access$setMuteState$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f69b32", new Object[]{new Boolean(z)});
        } else {
            muteState = z;
        }
    }

    public static final /* synthetic */ void access$setVideoInstance$p(VideoView videoView, qic qicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea917cb", new Object[]{videoView, qicVar});
        } else {
            videoView.videoInstance = qicVar;
        }
    }

    private final TUrlImageView createCoverView(Context context, VideoModel videoModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("4644fe34", new Object[]{this, context, videoModel});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setImageUrl(videoModel.getMainPicUrl());
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return tUrlImageView;
    }

    private final TUrlImageView createMuteIcon(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("944005bb", new Object[]{this, context, new Boolean(z)});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setImageUrl(getMuteUrl(z));
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        at4.a aVar = at4.Companion;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 50, false, 4, null), at4.a.c(aVar, context, 50, false, 4, null));
        layoutParams.gravity = 53;
        layoutParams.topMargin = at4.a.c(aVar, context, 24, false, 4, null);
        layoutParams.rightMargin = at4.a.c(aVar, context, 34, false, 4, null);
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setOnClickListener(new b(tUrlImageView, this, z, context));
        return tUrlImageView;
    }

    private final TUrlImageView createPlayIcon(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("79303e24", new Object[]{this, context});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01x0A55n1LJpFKycXHE_!!6000000001279-2-tps-195-195.png");
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        at4.a aVar = at4.Companion;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(at4.a.c(aVar, context, 100, false, 4, null), at4.a.c(aVar, context, 100, false, 4, null));
        layoutParams.gravity = 17;
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        return tUrlImageView;
    }

    private final String getMuteUrl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a173", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "https://img.alicdn.com/tfs/TB1xMdZUrY1gK0jSZTEXXXDQVXa-75-75.png";
        }
        return "https://img.alicdn.com/tfs/TB1HZzqiggP7K4jSZFqXXamhVXa-75-75.png";
    }

    private final void hideCoverView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964a6361", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.cover;
        if (tUrlImageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tUrlImageView, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        }
    }

    private final void hidePlayIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868cb636", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.playIcon;
        if (tUrlImageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tUrlImageView, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        }
    }

    public static /* synthetic */ Object ipc$super(VideoView videoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/video/VideoView");
    }

    private final void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        qic qicVar = this.videoInstance;
        if (qicVar != null) {
            qicVar.setMute(z);
        }
    }

    private final void showPlayIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b3f371", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.playIcon;
        if (tUrlImageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tUrlImageView, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        }
    }

    public final void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qic qicVar = this.videoInstance;
        if (qicVar != null) {
            qicVar.destroy();
        }
        this.videoInstance = null;
    }

    @Override // tb.ric
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ric
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ric
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ric
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ric
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else {
            showPlayIcon();
        }
    }

    @Override // tb.ric
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        hidePlayIcon();
        hideCoverView();
    }

    @Override // tb.ric
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        hideCoverView();
        hidePlayIcon();
    }

    @Override // tb.ric
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.eub
    public void onVideoRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3803834", new Object[]{this});
        }
    }

    @Override // tb.ric
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ric
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ric
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        qic qicVar = this.videoInstance;
        if (qicVar != null) {
            qicVar.pause();
        }
    }

    public final void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        qic qicVar = this.videoInstance;
        if (qicVar != null) {
            qicVar.play();
        }
    }

    public final void setVideoModel(VideoModel videoModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce247ffe", new Object[]{this, videoModel});
            return;
        }
        ckf.g(videoModel, "videoModel");
        this.videoModel = videoModel;
        Context context = getContext();
        ckf.f(context, "context");
        TUrlImageView createCoverView = createCoverView(context, videoModel);
        this.cover = createCoverView;
        ckf.d(createCoverView);
        addView(createCoverView);
        Context context2 = getContext();
        ckf.f(context2, "context");
        TUrlImageView createPlayIcon = createPlayIcon(context2);
        this.playIcon = createPlayIcon;
        ckf.d(createPlayIcon);
        addView(createPlayIcon);
        Context context3 = getContext();
        ckf.f(context3, "context");
        TUrlImageView createMuteIcon = createMuteIcon(context3, muteState);
        this.muteIcon = createMuteIcon;
        ckf.d(createMuteIcon);
        addView(createMuteIcon);
    }

    public final void start() {
        ViewParent viewParent;
        ViewParent viewParent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (this.videoInstance == null) {
            Context context = getContext();
            VideoModel videoModel = this.videoModel;
            ckf.d(videoModel);
            this.videoInstance = prepare(context, videoModel);
        }
        qic qicVar = this.videoInstance;
        if (qicVar == null || qicVar.getVideoState() != 2) {
            qic qicVar2 = this.videoInstance;
            ckf.d(qicVar2);
            qicVar2.start();
        } else {
            resume();
        }
        qic qicVar3 = this.videoInstance;
        ckf.d(qicVar3);
        View a2 = qicVar3.a();
        if (a2 != null) {
            ViewProxy.setOnClickListener(a2, new c());
        }
        ViewGroup viewGroup = null;
        if (a2 != null) {
            viewParent = a2.getParent();
        } else {
            viewParent = null;
        }
        if (!ckf.b(viewParent, this)) {
            if (a2 != null) {
                viewParent2 = a2.getParent();
            } else {
                viewParent2 = null;
            }
            if (viewParent2 instanceof ViewGroup) {
                viewGroup = viewParent2;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.removeView(a2);
            }
            addView(a2, 0);
        }
    }

    private final qic prepare(Context context, VideoModel videoModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qic) ipChange.ipc$dispatch("953513d6", new Object[]{this, context, videoModel});
        }
        EngineModel engineModel = new EngineModel();
        ConfigModel.a aVar = new ConfigModel.a();
        aVar.l(true);
        engineModel.configModel = aVar.i();
        DWAspectRatio dWAspectRatio = DWAspectRatio.DW_FIT_CENTER;
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put("optSourcerPipeSize", "true");
        MediaModel.b bVar = new MediaModel.b(videoModel.getVideoId());
        bVar.f0(videoModel.getVideoUrl()).H("guangguang").J(videoModel.getVideoId()).b0(videoModel.getVideoId()).T("DWVideo").g0(videoModel.getDisplayWidth()).a0(videoModel.getDisplayHeight()).Z(dWAspectRatio).e0(videoModel.getVideoSource()).c0(videoModel.getVideoPlayScenes()).W(videoModel.getBizCode()).M(true).N(true).K(hashMap).O(false);
        bVar.U(Boolean.valueOf(muteState));
        bVar.P(Boolean.TRUE);
        bVar.V(Boolean.FALSE);
        bVar.L("pic");
        engineModel.utParams = videoModel.getUtParams();
        engineModel.mediaModel = bVar.G();
        qic m = new i5g(context).m(engineModel, null);
        m.E(this);
        m.A(this);
        return m;
    }
}
