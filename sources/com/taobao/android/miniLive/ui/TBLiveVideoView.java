package com.taobao.android.miniLive.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.b3d;
import tb.gjr;
import tb.imr;
import tb.iw0;
import tb.nmr;
import tb.o3s;
import tb.obu;
import tb.prp;
import tb.r4d;
import tb.s7t;
import tb.t2o;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBLiveVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLiveVideoView";
    private RelativeLayout favorLayout;
    private boolean isArtp;
    private boolean isTbTv;
    private TUrlImageView mCoverImageView;
    private TUrlImageView mFavorAnimView;
    private String mPlayUrl;
    private String mSource;
    private VideoInfo mVideoInfo;
    private r4d mVideoView;
    private ImageView muteBtn;
    private ImageView playBtnView;
    private gjr tbLiveConfig;
    public boolean useH264;
    private int index = -1;
    private boolean isMute = true;
    private b3d statusListener = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TBLiveVideoView.access$000(TBLiveVideoView.this) != null) {
                TBLiveVideoView tBLiveVideoView = TBLiveVideoView.this;
                TBLiveVideoView.access$102(tBLiveVideoView, true ^ TBLiveVideoView.access$100(tBLiveVideoView));
                TBLiveVideoView.access$000(TBLiveVideoView.this).setMuted(TBLiveVideoView.access$100(TBLiveVideoView.this));
                if (TBLiveVideoView.access$100(TBLiveVideoView.this)) {
                    i = R.drawable.taolive_mini_live_mute;
                } else {
                    i = R.drawable.taolive_mini_live_voice;
                }
                TBLiveVideoView.access$200(TBLiveVideoView.this).setImageResource(i);
                TBLiveVideoView.access$300(TBLiveVideoView.this, "mute");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8968a;

        public b(Context context) {
            this.f8968a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TBLiveVideoView.access$400(TBLiveVideoView.this) != null) {
                String str = "http://h5.m.taobao.com/taolive/video.html?liveSource=miniLive&id=" + TBLiveVideoView.access$400(TBLiveVideoView.this).liveId + "&entrySource=" + TBLiveVideoView.access$500(TBLiveVideoView.this);
                if (v2s.o().v() != null) {
                    Nav.from(this.f8968a).withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).toUri(str);
                }
                TBLiveVideoView.access$300(TBLiveVideoView.this, "Card");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TBLiveVideoView.access$000(TBLiveVideoView.this) == null) {
            } else {
                if (TBLiveVideoView.access$000(TBLiveVideoView.this).isPlaying()) {
                    TBLiveVideoView.access$300(TBLiveVideoView.this, prp.CARD_MISS_VIDEO_STATUS_PAUSE);
                    TBLiveVideoView.access$000(TBLiveVideoView.this).release();
                    TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                    return;
                }
                if (TextUtils.isEmpty(TBLiveVideoView.access$000(TBLiveVideoView.this).b()) && !TextUtils.isEmpty(TBLiveVideoView.access$700(TBLiveVideoView.this))) {
                    TBLiveVideoView tBLiveVideoView = TBLiveVideoView.this;
                    tBLiveVideoView.playStreamUrl(TBLiveVideoView.access$700(tBLiveVideoView), TBLiveVideoView.access$800(TBLiveVideoView.this), TBLiveVideoView.access$900(TBLiveVideoView.this), TBLiveVideoView.access$1000(TBLiveVideoView.this), TBLiveVideoView.this.useH264);
                    TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_pause);
                } else if (!TextUtils.isEmpty(TBLiveVideoView.access$000(TBLiveVideoView.this).b())) {
                    TBLiveVideoView.this.start();
                    TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_pause);
                } else if (TBLiveVideoView.access$400(TBLiveVideoView.this) != null) {
                    if (TBLiveVideoView.access$400(TBLiveVideoView.this).status != 0) {
                        Toast.makeText(imr.b().a(), "主播暂时离开一会哦", 1).show();
                    }
                    TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                }
                TBLiveVideoView.access$300(TBLiveVideoView.this, "Play");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements b3d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.b3d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b440782", new Object[]{this});
                return;
            }
            if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
            }
            if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }
        }

        @Override // tb.b3d
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("537088aa", new Object[]{this});
                return;
            }
            if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
            }
            if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }
        }

        @Override // tb.b3d
        public boolean c(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f446f10a", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
            }
            return true;
        }

        @Override // tb.b3d
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            } else if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
            }
        }

        @Override // tb.b3d
        public void onEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc72903", new Object[]{this});
            } else if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
            }
        }

        @Override // tb.b3d
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i > -1 || i < -132) {
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                }
            } else if (iw0.k(TBLiveVideoView.this.getContext())) {
                TBLiveVideoView.this.start();
            } else {
                if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
                }
                if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                    TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
                }
            }
            return false;
        }

        @Override // tb.b3d
        public void onPause(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
                return;
            }
            if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(0);
            }
            if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_play);
            }
        }

        @Override // tb.b3d
        public void onPrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc853dc3", new Object[]{this});
            }
        }

        @Override // tb.b3d
        public void onStart(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
                return;
            }
            if (TBLiveVideoView.access$1100(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$1100(TBLiveVideoView.this).setVisibility(8);
            }
            if (TBLiveVideoView.access$600(TBLiveVideoView.this) != null) {
                TBLiveVideoView.access$600(TBLiveVideoView.this).setImageResource(R.drawable.taolive_mini_live_pause);
            }
        }
    }

    static {
        t2o.a(779092079);
    }

    public TBLiveVideoView(Context context) {
        super(context);
    }

    public static /* synthetic */ r4d access$000(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("8febfd86", new Object[]{tBLiveVideoView});
        }
        return tBLiveVideoView.mVideoView;
    }

    public static /* synthetic */ boolean access$100(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33447307", new Object[]{tBLiveVideoView})).booleanValue();
        }
        return tBLiveVideoView.isMute;
    }

    public static /* synthetic */ int access$1000(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8da50e4", new Object[]{tBLiveVideoView})).intValue();
        }
        return tBLiveVideoView.index;
    }

    public static /* synthetic */ boolean access$102(TBLiveVideoView tBLiveVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69819d73", new Object[]{tBLiveVideoView, new Boolean(z)})).booleanValue();
        }
        tBLiveVideoView.isMute = z;
        return z;
    }

    public static /* synthetic */ TUrlImageView access$1100(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("191a848a", new Object[]{tBLiveVideoView});
        }
        return tBLiveVideoView.mCoverImageView;
    }

    public static /* synthetic */ ImageView access$200(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("e3bccbcc", new Object[]{tBLiveVideoView});
        }
        return tBLiveVideoView.muteBtn;
    }

    public static /* synthetic */ void access$300(TBLiveVideoView tBLiveVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e09d00f", new Object[]{tBLiveVideoView, str});
        } else {
            tBLiveVideoView.trackClick(str);
        }
    }

    public static /* synthetic */ VideoInfo access$400(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("94c7dfc3", new Object[]{tBLiveVideoView});
        }
        return tBLiveVideoView.mVideoInfo;
    }

    public static /* synthetic */ String access$500(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65ea5b79", new Object[]{tBLiveVideoView});
        }
        return tBLiveVideoView.mSource;
    }

    public static /* synthetic */ ImageView access$600(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("5b8a6348", new Object[]{tBLiveVideoView});
        }
        return tBLiveVideoView.playBtnView;
    }

    public static /* synthetic */ String access$700(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7fc537", new Object[]{tBLiveVideoView});
        }
        return tBLiveVideoView.mPlayUrl;
    }

    public static /* synthetic */ boolean access$800(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5492c7ce", new Object[]{tBLiveVideoView})).booleanValue();
        }
        return tBLiveVideoView.isArtp;
    }

    public static /* synthetic */ boolean access$900(TBLiveVideoView tBLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7de71d0f", new Object[]{tBLiveVideoView})).booleanValue();
        }
        return tBLiveVideoView.isTbTv;
    }

    public static /* synthetic */ Object ipc$super(TBLiveVideoView tBLiveVideoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/ui/TBLiveVideoView");
    }

    private void trackClick(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361d29ce", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        VideoInfo videoInfo = this.mVideoInfo;
        if (videoInfo != null) {
            hashMap.put("feedId", videoInfo.liveId);
            AccountInfo accountInfo = this.mVideoInfo.broadCaster;
            if (accountInfo != null) {
                hashMap.put("accountId", accountInfo.accountId);
            }
        } else if (!TextUtils.isEmpty(nmr.e().d())) {
            hashMap.put("feedId", nmr.e().d());
        }
        if (this.isMute) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put("mute", str2);
        hashMap.put("source", this.mSource);
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        obu.a(null, str, hashMap);
    }

    private void trackShow(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69083f79", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        VideoInfo videoInfo = this.mVideoInfo;
        if (videoInfo != null) {
            hashMap.put("feedId", videoInfo.liveId);
            AccountInfo accountInfo = this.mVideoInfo.broadCaster;
            if (accountInfo != null) {
                hashMap.put("accountId", accountInfo.accountId);
            }
        }
        if (this.isMute) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put("mute", str2);
        hashMap.put("source", this.mSource);
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        obu.g(null, str, hashMap);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            r4dVar.release();
            this.mVideoView.destroy();
        }
        s7t.j().n(this.statusListener);
        s7t.j().i();
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            ViewGroup viewGroup = (ViewGroup) r4dVar.getVideoView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.mVideoView.getVideoView());
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 1);
            View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_mini_video_layout, (ViewGroup) this, false);
            addView(inflate, layoutParams);
            ((FrameLayout) findViewById(R.id.taolive_weex_video_layout)).addView(this.mVideoView.getVideoView(), 0, layoutParams);
            ImageView imageView = (ImageView) findViewById(R.id.taolive_weex_video_mute);
            this.muteBtn = imageView;
            imageView.setOnClickListener(new a());
            ViewProxy.setOnClickListener(inflate, new b(context));
            trackShow("Show-Card");
            this.favorLayout = (RelativeLayout) findViewById(R.id.taolive_weex_favor_layout);
            this.mCoverImageView = (TUrlImageView) findViewById(R.id.taolive_mini_video_cover);
            ImageView imageView2 = (ImageView) findViewById(R.id.taolive_weex_video_pause);
            this.playBtnView = imageView2;
            imageView2.setOnClickListener(new c());
            gjr gjrVar = this.tbLiveConfig;
            if (gjrVar != null) {
                if (gjrVar.c) {
                    this.playBtnView.setVisibility(0);
                    trackShow("Show-Pause");
                } else {
                    this.playBtnView.setVisibility(8);
                }
                if (this.tbLiveConfig.f20046a) {
                    this.muteBtn.setVisibility(0);
                    trackShow("Show-mute");
                } else {
                    this.muteBtn.setVisibility(8);
                }
                if (this.tbLiveConfig.b) {
                    this.favorLayout.setVisibility(0);
                    TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_weex_video_favor_anim);
                    this.mFavorAnimView = tUrlImageView;
                    tUrlImageView.setSkipAutoSize(true);
                    this.mFavorAnimView.setImageUrl("https://gw.alicdn.com/tfs/TB1ace.u1bviK0jSZFNXXaApXXa-164-380.png");
                    trackShow("Show-Favor");
                } else {
                    this.favorLayout.setVisibility(8);
                }
            }
            s7t.j().l(this.statusListener);
        }
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        return this.isMute;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            return r4dVar.isPlaying();
        }
        return false;
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            r4dVar.release();
        }
    }

    public void playStreamUrl(String str, boolean z, boolean z2, int i, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf0dfd", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Integer(i), new Boolean(z3)});
        } else if (this.mVideoView != null && !TextUtils.isEmpty(str)) {
            this.mPlayUrl = str;
            this.isArtp = z;
            this.isTbTv = z2;
            this.index = i;
            this.useH264 = z3;
            PreloadParams G = new PreloadParams.a(getContext()).F("TBMiniLive").N(isMute()).U(PreloadParams.PlayerType.LIVE_ZOOM_WINDOW_TYPE).T(str).W(i).g0(z3).G();
            o3s.b(TAG, "playStreamUrl,播放器起播之前");
            this.mVideoView.p(G);
        }
    }

    public void setCoverImageVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e233", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.mCoverImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        }
    }

    public void setMuted(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            r4dVar.setMuted(z);
            this.isMute = z;
            if (z) {
                i = R.drawable.taolive_mini_live_mute;
            } else {
                i = R.drawable.taolive_mini_live_voice;
            }
            this.muteBtn.setImageResource(i);
        }
    }

    public void setVideoCover(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae36720f", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.mCoverImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
        }
    }

    public void setVideoDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc14fd", new Object[]{this, str});
            return;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            r4dVar.F(str);
        }
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2da7f", new Object[]{this, videoInfo});
            return;
        }
        this.mVideoInfo = videoInfo;
        if (videoInfo != null && this.mVideoView != null && (imageView = this.playBtnView) != null && videoInfo.status != 0) {
            imageView.setImageResource(R.drawable.taolive_mini_live_play);
        }
    }

    public void setVideoView(r4d r4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e632f", new Object[]{this, r4dVar});
        } else {
            this.mVideoView = r4dVar;
        }
    }

    public void setViewConfig(gjr gjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee52593", new Object[]{this, gjrVar});
            return;
        }
        this.tbLiveConfig = gjrVar;
        this.mSource = gjrVar.f;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        r4d r4dVar = this.mVideoView;
        if (r4dVar != null) {
            r4dVar.start();
            this.mVideoView.setMuted(this.isMute);
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        }
    }

    public TBLiveVideoView(Context context, r4d r4dVar) {
        super(context);
        this.mVideoView = r4dVar;
        init(context);
    }
}
