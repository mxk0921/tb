package com.taobao.taolive.sdk.ui.media.playercontrol;

import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.timemoveReplay.ReplayTimeMovingBean;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.playercontrol.a;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Locale;
import tb.air;
import tb.cdr;
import tb.d4s;
import tb.h4s;
import tb.hw0;
import tb.ibt;
import tb.k9d;
import tb.kd6;
import tb.m9d;
import tb.o3s;
import tb.pvs;
import tb.qr4;
import tb.rbu;
import tb.sjr;
import tb.t2o;
import tb.t6t;
import tb.up6;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.xtt;
import tb.z1i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PlayerController2 implements SeekBar.OnSeekBarChangeListener, Handler.Callback, IMediaPlayer.b, IMediaPlayer.d, IMediaPlayer.c, IMediaPlayer.h, IMediaPlayer.i, IMediaPlayer.f, IMediaPlayer.g, IMediaPlayer.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_UPDATE_SEEKBAR_PROGRESS = 1;
    private static final float[] PLAY_RATE_ARRAY = {1.0f, 1.5f, 2.0f};
    public static final String PLAY_SPEED_GUIDE_HAS_SHOW = "playSpeedGuideHasShow";
    private static final int PREVIEW_FRAME_ROUNDED_CORNERS = 6;
    public static final int SHOW_ALL = 1;
    public static final int SHOW_FULL_SCREEN_BTN = 3;
    public static final int SHOW_NONE = 4;
    public static final int SHOW_PLAY_CONTROLLER = 2;
    public static final int STEP = 15000;
    public static final String TAG = "PlayerController";
    private static final String TIME_SPLIT_LINE_URL = "https://gw.alicdn.com/imgextra/i3/O1CN019cvwOl1TiZvCmoRp5_!!6000000002416-2-tps-48-48.png";
    private static final int UPDATE_PROGRESS_TIME = 500;
    public String defaultPlayRateViewText;
    private Context mContext;
    private qr4 mControllerHolder;
    private View mDefaultControllerView;
    public ux9 mFrameContext;
    private Handler mHandler;
    private boolean mHasPostMsgToShowShopCard;
    private ReplayTimeMovingBean mLastReplayTimeMovingBean;
    private com.taobao.taolive.sdk.ui.media.playercontrol.a mPlayControlGestureManager;
    private k9d mPlayForwardListener;
    private m mPlayOrPauseButtonListener;
    private n mPlayProgressListener;
    private m9d mPlayRateControlListener;
    private o mPlayStartOrCompletionListener;
    private View mReplayUpdateHalfPlayContainer;
    private r mSeekStopTrackingListener;
    private xtt mTimeMoveReplayModel;
    private s mToggleScreenListener;
    private IPlayPublicService mVideoView;
    public p playerStatusListener;
    private boolean mIsSeekBarOnChange = false;
    private boolean mIsDefaultController = false;
    private boolean mIsPrecisionMode = false;
    private int mShowType = 1;
    private int mPlayRateIndex = 0;
    private boolean mIsDestroyed = false;
    private boolean mIsFullScreen = false;
    private final a.AbstractC0761a mOnUserSeekListener = new i();
    private long newPosition = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC0759a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ReplayTimeMovingBean f13300a;

            public RunnableC0759a(ReplayTimeMovingBean replayTimeMovingBean) {
                this.f13300a = replayTimeMovingBean;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                PlayerController2.access$1400(PlayerController2.this, this.f13300a);
                if (this.f13300a != null && !PlayerController2.access$300(PlayerController2.this)) {
                    long longValue = (this.f13300a.endSeekTime.longValue() * 1000) - PlayerController2.access$600(PlayerController2.this);
                    PlayerController2 playerController2 = PlayerController2.this;
                    PlayerController2.access$1500(playerController2, true, false, PlayerController2.access$1300(playerController2), longValue);
                }
            }
        }

        public a() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.q
        public void a(ReplayTimeMovingBean replayTimeMovingBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5251d46a", new Object[]{this, replayTimeMovingBean});
            } else {
                z1i.a().c(new RunnableC0759a(replayTimeMovingBean));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f13301a;
        public final /* synthetic */ ReplayTimeMovingBean b;
        public final /* synthetic */ long c;

        public b(q qVar, ReplayTimeMovingBean replayTimeMovingBean, long j) {
            this.f13301a = qVar;
            this.b = replayTimeMovingBean;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f13301a != null) {
                this.f13301a.a(PlayerController2.access$2300(PlayerController2.this, this.b, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements IMediaPlayer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            PlayerController2.access$2400(PlayerController2.this);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PlayerController2.access$000(PlayerController2.this).c.setImageResource(PlayerController2.access$000(PlayerController2.this).i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PlayerController2.access$000(PlayerController2.this).c.setImageResource(PlayerController2.access$000(PlayerController2.this).j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (PlayerController2.access$000(PlayerController2.this) != null && PlayerController2.access$000(PlayerController2.this).g != null) {
                PlayerController2.access$000(PlayerController2.this).g.setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/ui/media/playercontrol/PlayerController2$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hw0.b(PlayerController2.access$100(PlayerController2.this), 6.0f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/ui/media/playercontrol/PlayerController2$3");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), hw0.b(PlayerController2.access$100(PlayerController2.this), 6.0f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements a.AbstractC0761a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements q {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2$i$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public class RunnableC0760a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ReplayTimeMovingBean f13310a;

                public RunnableC0760a(ReplayTimeMovingBean replayTimeMovingBean) {
                    this.f13310a = replayTimeMovingBean;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PlayerController2.access$1400(PlayerController2.this, this.f13310a);
                    if (this.f13310a != null && !PlayerController2.access$300(PlayerController2.this)) {
                        PlayerController2.access$1500(PlayerController2.this, true, true, this.f13310a, (this.f13310a.endSeekTime.longValue() * 1000) - PlayerController2.access$600(PlayerController2.this));
                    }
                }
            }

            public a() {
            }

            @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.q
            public void a(ReplayTimeMovingBean replayTimeMovingBean) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5251d46a", new Object[]{this, replayTimeMovingBean});
                } else {
                    z1i.a().c(new RunnableC0760a(replayTimeMovingBean));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class b implements q {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ReplayTimeMovingBean f13312a;

                public a(ReplayTimeMovingBean replayTimeMovingBean) {
                    this.f13312a = replayTimeMovingBean;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PlayerController2.access$1400(PlayerController2.this, this.f13312a);
                    if (PlayerController2.access$300(PlayerController2.this)) {
                        PlayerController2.access$1700(PlayerController2.this, this.f13312a);
                    }
                }
            }

            public b() {
            }

            @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.q
            public void a(ReplayTimeMovingBean replayTimeMovingBean) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5251d46a", new Object[]{this, replayTimeMovingBean});
                } else {
                    z1i.a().c(new a(replayTimeMovingBean));
                }
            }
        }

        public i() {
        }

        public void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1897d", new Object[]{this, new Long(j)});
            } else {
                PlayerController2.access$200(PlayerController2.this, true);
            }
        }

        public void a(boolean z, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5acdc3dc", new Object[]{this, new Boolean(z), new Long(j)});
                return;
            }
            PlayerController2.access$302(PlayerController2.this, true);
            PlayerController2.access$402(PlayerController2.this, z);
            long access$500 = PlayerController2.access$500(PlayerController2.this);
            PlayerController2 playerController2 = PlayerController2.this;
            float f = ((float) j) * 100.0f;
            if (access$500 == 0) {
                access$500 = 1;
            }
            PlayerController2.access$602(playerController2, (int) (f / ((float) access$500)));
            if (PlayerController2.access$000(PlayerController2.this).e != null) {
                PlayerController2.access$000(PlayerController2.this).e.setText(PlayerController2.stringForTime(PlayerController2.access$600(PlayerController2.this)));
            }
            if (PlayerController2.access$000(PlayerController2.this) != null && PlayerController2.access$000(PlayerController2.this).f != null) {
                if (z) {
                    PlayerController2.access$700(PlayerController2.this, "timemoveup");
                    if (PlayerController2.access$000(PlayerController2.this).s instanceof TextView) {
                        ((TextView) PlayerController2.access$000(PlayerController2.this).s).setText("精准调节中");
                    }
                    if (PlayerController2.access$000(PlayerController2.this).t instanceof TUrlImageView) {
                        PlayerController2.access$000(PlayerController2.this).t.setVisibility(8);
                    }
                }
                PlayerController2.access$000(PlayerController2.this).f.setProgress((int) PlayerController2.access$600(PlayerController2.this));
            }
        }

        public void c(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdad334b", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            PlayerController2.access$200(PlayerController2.this, false);
            if (PlayerController2.access$000(PlayerController2.this) != null) {
                if (PlayerController2.access$000(PlayerController2.this).s instanceof TextView) {
                    ((TextView) PlayerController2.access$000(PlayerController2.this).s).setText("上滑精准调节");
                }
                PlayerController2.access$800(PlayerController2.this, false);
                long access$500 = PlayerController2.access$500(PlayerController2.this);
                if ((access$500 <= 0 || PlayerController2.access$600(PlayerController2.this) <= access$500) && PlayerController2.access$900(PlayerController2.this) != null) {
                    PlayerController2.access$900(PlayerController2.this).seekTo(PlayerController2.access$600(PlayerController2.this));
                }
                if (PlayerController2.access$1000(PlayerController2.this) != null) {
                    PlayerController2.access$1000(PlayerController2.this).a(PlayerController2.access$300(PlayerController2.this));
                    PlayerController2.access$1000(PlayerController2.this).c(PlayerController2.access$300(PlayerController2.this), PlayerController2.access$600(PlayerController2.this));
                }
            }
            PlayerController2.access$302(PlayerController2.this, false);
            PlayerController2.access$402(PlayerController2.this, false);
            PlayerController2.access$1100(PlayerController2.this, false);
            PlayerController2.access$1200(PlayerController2.this, false);
            PlayerController2 playerController2 = PlayerController2.this;
            PlayerController2.access$1600(playerController2, PlayerController2.access$600(playerController2), PlayerController2.access$1300(PlayerController2.this), new a());
        }

        public void d(String str, long j, String str2, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0b198b9", new Object[]{this, str, new Long(j), str2, new Long(j2)});
                return;
            }
            if (!PlayerController2.access$300(PlayerController2.this)) {
                PlayerController2.access$700(PlayerController2.this, "timemoveclick");
                PlayerController2.access$800(PlayerController2.this, true);
                PlayerController2.access$1100(PlayerController2.this, true);
                PlayerController2.access$1500(PlayerController2.this, false, false, null, -1L);
            }
            PlayerController2.access$302(PlayerController2.this, true);
            long access$500 = PlayerController2.access$500(PlayerController2.this);
            PlayerController2.access$602(PlayerController2.this, j);
            if (PlayerController2.access$000(PlayerController2.this).e != null) {
                PlayerController2.access$000(PlayerController2.this).e.setText(PlayerController2.stringForTime(PlayerController2.access$600(PlayerController2.this)));
            }
            if (PlayerController2.access$000(PlayerController2.this).d != null) {
                PlayerController2.access$000(PlayerController2.this).d.setText(PlayerController2.stringForTime(access$500));
            }
            if (!(PlayerController2.access$000(PlayerController2.this) == null || PlayerController2.access$000(PlayerController2.this).f == null)) {
                float max = ((float) (j * PlayerController2.access$000(PlayerController2.this).f.getMax())) * 1.0f;
                if (access$500 == 0) {
                    access$500 = 1;
                }
                PlayerController2.access$000(PlayerController2.this).f.setProgress((int) (max / ((float) access$500)));
            }
            PlayerController2 playerController2 = PlayerController2.this;
            PlayerController2.access$1600(playerController2, PlayerController2.access$600(playerController2), PlayerController2.access$1300(PlayerController2.this), new b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (PlayerController2.access$900(PlayerController2.this).isPlaying()) {
                PlayerController2.access$900(PlayerController2.this).k();
                PlayerController2.access$000(PlayerController2.this).c.setImageResource(PlayerController2.access$000(PlayerController2.this).i);
                if (PlayerController2.access$1800(PlayerController2.this) != null) {
                    PlayerController2.access$1800(PlayerController2.this).b();
                }
            } else {
                PlayerController2.access$900(PlayerController2.this).l();
                PlayerController2.access$000(PlayerController2.this).c.setImageResource(PlayerController2.access$000(PlayerController2.this).j);
                if (PlayerController2.access$1800(PlayerController2.this) != null) {
                    PlayerController2.access$1800(PlayerController2.this).a();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            int access$1900 = (PlayerController2.access$1900(PlayerController2.this) + 1) % PlayerController2.access$2000().length;
            float f = PlayerController2.access$2000()[access$1900];
            if (PlayerController2.access$900(PlayerController2.this) != null) {
                PlayerController2.access$900(PlayerController2.this).setPlayRate(f);
                PlayerController2.access$1902(PlayerController2.this, access$1900);
                int access$19002 = PlayerController2.access$1900(PlayerController2.this);
                if (access$19002 == 0) {
                    PlayerController2.access$000(PlayerController2.this).h.setText(R.string.taolive_mediaplay_playrate_normal);
                } else if (access$19002 == 1) {
                    PlayerController2.access$000(PlayerController2.this).h.setText(R.string.taolive_mediaplay_playrate_high);
                } else if (access$19002 == 2) {
                    PlayerController2.access$000(PlayerController2.this).h.setText(R.string.taolive_mediaplay_playrate_uphigh);
                }
                if (PlayerController2.access$2100(PlayerController2.this) != null) {
                    PlayerController2.access$2100(PlayerController2.this).a(PlayerController2.access$1900(PlayerController2.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PlayerController2.this.toggleScreen(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface m {
        void a();

        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface n {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface o {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface p {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface q {
        void a(ReplayTimeMovingBean replayTimeMovingBean);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface r {
        void a(boolean z);

        void c(boolean z, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface s {
        boolean a();

        boolean b();
    }

    static {
        t2o.a(779093507);
        t2o.a(806356438);
        t2o.a(806356440);
        t2o.a(806356439);
        t2o.a(806356444);
        t2o.a(806356437);
        t2o.a(806356446);
        t2o.a(806356442);
        t2o.a(806356443);
        t2o.a(806356441);
    }

    public PlayerController2(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ qr4 access$000(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qr4) ipChange.ipc$dispatch("c8504f88", new Object[]{playerController2});
        }
        return playerController2.mControllerHolder;
    }

    public static /* synthetic */ Context access$100(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f121021c", new Object[]{playerController2});
        }
        return playerController2.mContext;
    }

    public static /* synthetic */ r access$1000(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("f8c2faeb", new Object[]{playerController2});
        }
        return playerController2.mSeekStopTrackingListener;
    }

    public static /* synthetic */ void access$1100(PlayerController2 playerController2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eff2d9f", new Object[]{playerController2, new Boolean(z)});
        } else {
            playerController2.setScreenAndGoodsIconVisibility(z);
        }
    }

    public static /* synthetic */ void access$1200(PlayerController2 playerController2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560b14a0", new Object[]{playerController2, new Boolean(z)});
        } else {
            playerController2.setPreviewFrameVisibility(z);
        }
    }

    public static /* synthetic */ ReplayTimeMovingBean access$1300(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplayTimeMovingBean) ipChange.ipc$dispatch("9bf0c945", new Object[]{playerController2});
        }
        return playerController2.mLastReplayTimeMovingBean;
    }

    public static /* synthetic */ void access$1400(PlayerController2 playerController2, ReplayTimeMovingBean replayTimeMovingBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c14294", new Object[]{playerController2, replayTimeMovingBean});
        } else {
            playerController2.setHasPostMsgToShowShopCard(replayTimeMovingBean);
        }
    }

    public static /* synthetic */ void access$1500(PlayerController2 playerController2, boolean z, boolean z2, ReplayTimeMovingBean replayTimeMovingBean, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24750eb1", new Object[]{playerController2, new Boolean(z), new Boolean(z2), replayTimeMovingBean, new Long(j2)});
        } else {
            playerController2.requestShopCard(z, z2, replayTimeMovingBean, j2);
        }
    }

    public static /* synthetic */ void access$1600(PlayerController2 playerController2, long j2, ReplayTimeMovingBean replayTimeMovingBean, q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9534699f", new Object[]{playerController2, new Long(j2), replayTimeMovingBean, qVar});
        } else {
            playerController2.executeReplayTimeMoveObj(j2, replayTimeMovingBean, qVar);
        }
    }

    public static /* synthetic */ void access$1700(PlayerController2 playerController2, ReplayTimeMovingBean replayTimeMovingBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76fcf71", new Object[]{playerController2, replayTimeMovingBean});
        } else {
            playerController2.bindPlaybackUI(replayTimeMovingBean);
        }
    }

    public static /* synthetic */ m access$1800(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("ca96f39", new Object[]{playerController2});
        }
        return playerController2.mPlayOrPauseButtonListener;
    }

    public static /* synthetic */ int access$1900(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("698726c0", new Object[]{playerController2})).intValue();
        }
        return playerController2.mPlayRateIndex;
    }

    public static /* synthetic */ int access$1902(PlayerController2 playerController2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8db58c4b", new Object[]{playerController2, new Integer(i2)})).intValue();
        }
        playerController2.mPlayRateIndex = i2;
        return i2;
    }

    public static /* synthetic */ void access$200(PlayerController2 playerController2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dfaf31", new Object[]{playerController2, new Boolean(z)});
        } else {
            playerController2.postTouchSeekBarMsg(z);
        }
    }

    public static /* synthetic */ float[] access$2000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("bb80ffc", new Object[0]);
        }
        return PLAY_RATE_ARRAY;
    }

    public static /* synthetic */ m9d access$2100(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9d) ipChange.ipc$dispatch("b7a95d94", new Object[]{playerController2});
        }
        return playerController2.mPlayRateControlListener;
    }

    public static /* synthetic */ k9d access$2200(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k9d) ipChange.ipc$dispatch("8ae21ae4", new Object[]{playerController2});
        }
        return playerController2.mPlayForwardListener;
    }

    public static /* synthetic */ ReplayTimeMovingBean access$2300(PlayerController2 playerController2, ReplayTimeMovingBean replayTimeMovingBean, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplayTimeMovingBean) ipChange.ipc$dispatch("67562d6a", new Object[]{playerController2, replayTimeMovingBean, new Long(j2)});
        }
        return playerController2.getReplayTimeMoveObject(replayTimeMovingBean, j2);
    }

    public static /* synthetic */ void access$2400(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51d8573", new Object[]{playerController2});
        } else {
            playerController2.handleThumbnailError();
        }
    }

    public static /* synthetic */ boolean access$300(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a29c38e6", new Object[]{playerController2})).booleanValue();
        }
        return playerController2.mIsSeekBarOnChange;
    }

    public static /* synthetic */ boolean access$302(PlayerController2 playerController2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7742fcb8", new Object[]{playerController2, new Boolean(z)})).booleanValue();
        }
        playerController2.mIsSeekBarOnChange = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(PlayerController2 playerController2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e4ee3b9", new Object[]{playerController2, new Boolean(z)})).booleanValue();
        }
        playerController2.mIsPrecisionMode = z;
        return z;
    }

    public static /* synthetic */ long access$500(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a731a294", new Object[]{playerController2})).longValue();
        }
        return playerController2.getTotalDuration();
    }

    public static /* synthetic */ long access$600(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("297c5773", new Object[]{playerController2})).longValue();
        }
        return playerController2.newPosition;
    }

    public static /* synthetic */ long access$602(PlayerController2 playerController2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc66759b", new Object[]{playerController2, new Long(j2)})).longValue();
        }
        playerController2.newPosition = j2;
        return j2;
    }

    public static /* synthetic */ void access$700(PlayerController2 playerController2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf11aa8", new Object[]{playerController2, str});
        } else {
            playerController2.replayUpdateTrack(str);
        }
    }

    public static /* synthetic */ void access$800(PlayerController2 playerController2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94271937", new Object[]{playerController2, new Boolean(z)});
        } else {
            playerController2.setControlTipsViewVisibility(z);
        }
    }

    public static /* synthetic */ IPlayPublicService access$900(PlayerController2 playerController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPlayPublicService) ipChange.ipc$dispatch("307766e0", new Object[]{playerController2});
        }
        return playerController2.mVideoView;
    }

    private void bindPlaybackUI(ReplayTimeMovingBean replayTimeMovingBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19893bf5", new Object[]{this, replayTimeMovingBean});
        } else if (pvs.j1() && isHitReplayUpdate() && this.mControllerHolder != null) {
            if (replayTimeMovingBean == null) {
                addVideoPreviewFrame();
            } else if (!this.mIsPrecisionMode || !addVideoPreviewFrame()) {
                View view = this.mControllerHolder.x;
                if (view != null) {
                    ((TextView) view).setText(replayTimeMovingBean.itemTitle);
                }
                if (this.mControllerHolder.v != null && replayTimeMovingBean.itemIndex.intValue() > 0) {
                    TextView textView = (TextView) this.mControllerHolder.v;
                    textView.setText(String.valueOf(replayTimeMovingBean.itemIndex));
                    View view2 = this.mControllerHolder.u;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    textView.setVisibility(0);
                }
                if (this.mControllerHolder.w != null && !TextUtils.isEmpty(replayTimeMovingBean.itemCover)) {
                    ((TUrlImageView) this.mControllerHolder.w).setImageUrl(replayTimeMovingBean.itemCover);
                }
                setVideoPreviewFrameVisibility(true, 0);
            }
        }
    }

    private void changeUIStateAndVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54dbd238", new Object[]{this});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null && !this.mIsDestroyed) {
            if (qr4Var.c != null) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    ((Activity) context).runOnUiThread(new e());
                    o oVar = this.mPlayStartOrCompletionListener;
                    if (oVar != null) {
                        ((kd6) oVar).u();
                    }
                }
            }
            watchTimer();
        }
    }

    private void executeReplayTimeMoveObj(long j2, ReplayTimeMovingBean replayTimeMovingBean, q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807143cb", new Object[]{this, new Long(j2), replayTimeMovingBean, qVar});
        } else if (isHitReplayUpdate()) {
            Coordinator.execute(new b(qVar, replayTimeMovingBean, j2));
        }
    }

    private void firstFrameRendered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861ec7f9", new Object[]{this});
            return;
        }
        o3s.b(TAG, "[Metrics-VideoPrePlay]firstFrameRendered(),receive firstFrame");
        initVideoThumbnail();
    }

    private ReplayTimeMovingBean getReplayTimeMoveObject(ReplayTimeMovingBean replayTimeMovingBean, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplayTimeMovingBean) ipChange.ipc$dispatch("f45ef637", new Object[]{this, replayTimeMovingBean, new Long(j2)});
        }
        if (!pvs.i1() || !isHitReplayUpdate() || this.mTimeMoveReplayModel == null) {
            return null;
        }
        long j3 = ((float) j2) / 1000.0f;
        if (replayTimeMovingBean != null) {
            long longValue = replayTimeMovingBean.endSeekTime.longValue() * 1000;
            long longValue2 = replayTimeMovingBean.StartSeekTime.longValue() * 1000;
            if (j2 <= longValue && j2 >= longValue2) {
                return replayTimeMovingBean;
            }
            ReplayTimeMovingBean a2 = this.mTimeMoveReplayModel.a(j3);
            o3s.b(TAG, "ControlViewManager,回放升级进度条变化 查询到看点小卡数据，当前进度：" + j2 + ",看点小卡结束时间：" + longValue);
            return a2;
        }
        o3s.b(TAG, "ControlViewManager,回放升级进度条变化，首次获取。当前进度：" + j2);
        return this.mTimeMoveReplayModel.a(j3);
    }

    private long getTotalDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3084d8bd", new Object[]{this})).longValue();
        }
        IPlayPublicService iPlayPublicService = this.mVideoView;
        if (iPlayPublicService != null) {
            return iPlayPublicService.getDuration();
        }
        return 0L;
    }

    private void handleThumbnailError() {
        View thumbnailGetView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6a1b4b", new Object[]{this});
            return;
        }
        o3s.b(TAG, "播放器缩略帧错误,handleThumbnailError");
        IPlayPublicService iPlayPublicService = this.mVideoView;
        if (iPlayPublicService != null) {
            iPlayPublicService.M();
        }
        if (this.mControllerHolder.p != null && (thumbnailGetView = thumbnailGetView()) != null) {
            ViewGroup viewGroup = (ViewGroup) thumbnailGetView.getParent();
            ViewGroup viewGroup2 = this.mControllerHolder.p;
            if (viewGroup == viewGroup2) {
                viewGroup2.removeView(thumbnailGetView);
            }
        }
    }

    private void init() {
        TextView textView;
        TextView textView2;
        SeekBar seekBar;
        ImageView imageView;
        TextView textView3;
        ImageView imageView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (!(qr4Var == null || (imageView2 = qr4Var.c) == null)) {
            imageView2.setOnClickListener(new j());
            if (this.mVideoView.isPlaying()) {
                qr4 qr4Var2 = this.mControllerHolder;
                qr4Var2.c.setImageResource(qr4Var2.j);
            } else {
                qr4 qr4Var3 = this.mControllerHolder;
                qr4Var3.c.setImageResource(qr4Var3.i);
            }
        }
        qr4 qr4Var4 = this.mControllerHolder;
        if (!(qr4Var4 == null || (textView3 = qr4Var4.h) == null)) {
            textView3.setOnClickListener(new k());
        }
        qr4 qr4Var5 = this.mControllerHolder;
        if (!(qr4Var5 == null || (imageView = qr4Var5.g) == null)) {
            imageView.setOnClickListener(new l());
        }
        qr4 qr4Var6 = this.mControllerHolder;
        if (!(qr4Var6 == null || (seekBar = qr4Var6.f) == null)) {
            seekBar.setOnSeekBarChangeListener(this);
            this.mControllerHolder.f.setMax(1000);
        }
        qr4 qr4Var7 = this.mControllerHolder;
        if (!(qr4Var7 == null || (textView2 = qr4Var7.e) == null)) {
            textView2.setText(this.mContext.getString(R.string.taolive_mediaplayer_defaulttime));
        }
        qr4 qr4Var8 = this.mControllerHolder;
        if (!(qr4Var8 == null || (textView = qr4Var8.d) == null)) {
            textView.setText(this.mContext.getString(R.string.taolive_mediaplayer_defaulttime));
        }
        com.taobao.taolive.sdk.ui.media.playercontrol.a aVar = this.mPlayControlGestureManager;
        if (aVar != null) {
            aVar.e();
            this.mPlayControlGestureManager.l(this.mOnUserSeekListener);
        }
        watchTimer();
        showController();
    }

    private boolean isHitReplayUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1146f844", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var instanceof cdr) || !((cdr) ux9Var).Y0()) {
            return false;
        }
        return true;
    }

    private boolean isTimeShift(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9367de", new Object[]{this, ux9Var})).booleanValue();
        }
        if (up6.d0(ux9Var) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return true;
        }
        return false;
    }

    private void postPlaySpeedGuideMsg(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5646d165", new Object[]{this, new Long(j2)});
        } else if (isHitReplayUpdate() && !t6t.b("playSpeedGuideHasShow") && j2 / 1000 == pvs.s2()) {
            sjr g2 = sjr.g();
            Boolean bool = Boolean.TRUE;
            ux9 ux9Var = this.mFrameContext;
            g2.c(uyg.EVENT_SHOW_PLAY_SPEED_GUIDE, bool, ux9Var != null ? ux9Var.C() : null);
        }
    }

    private void postPlayerStateMsg(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5796fc2", new Object[]{this, str});
        } else if (isHitReplayUpdate()) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            sjr g2 = sjr.g();
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null) {
                str2 = ux9Var.C();
            } else {
                str2 = null;
            }
            g2.c(uyg.EVENT_SHOW_PLAYER_STATE, hashMap, str2);
        }
    }

    private void postTouchSeekBarMsg(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68b2b68", new Object[]{this, new Boolean(z)});
        } else if (isHitReplayUpdate()) {
            sjr g2 = sjr.g();
            Boolean valueOf = Boolean.valueOf(z);
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null) {
                str = ux9Var.C();
            } else {
                str = null;
            }
            g2.c(uyg.EVENT_SEEK_BAR_TOUCH, valueOf, str);
        }
    }

    private void replayUpdateTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e4dbec", new Object[]{this, str});
        } else {
            rbu.K(this.mFrameContext, str, new HashMap());
        }
    }

    private void setAbilityToggleSwitchVisibility() {
        IPlayPublicService iPlayPublicService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa740ce9", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if ((ux9Var instanceof air) && ((air) ux9Var).A() != null && ((air) this.mFrameContext).A().abilityCompontent != null && !((ibt) ((air) this.mFrameContext).A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate) && (iPlayPublicService = this.mVideoView) != null && iPlayPublicService.getView() != null) {
            this.mVideoView.getView().post(new f());
        }
    }

    private void setControlTipsViewVisibility(boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7888da83", new Object[]{this, new Boolean(z)});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null) {
            ViewGroup viewGroup = qr4Var.q;
            if (viewGroup != null) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                viewGroup.setVisibility(i3);
            }
            if (!isTimeShift(this.mFrameContext)) {
                View view = this.mControllerHolder.s;
                if (view != null) {
                    if (z) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                }
                View view2 = this.mControllerHolder.t;
                if (view2 instanceof TUrlImageView) {
                    ((TUrlImageView) view2).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01W5Ejdb1JemTD9054e_!!6000000001054-2-tps-48-48.png");
                    View view3 = this.mControllerHolder.t;
                    if (!z) {
                        i4 = 8;
                    }
                    view3.setVisibility(i4);
                }
            }
        }
    }

    private void setPreviewFrameVisibility(boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e0c054", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewGroup viewGroup = this.mControllerHolder.n;
        if (viewGroup != null) {
            if (!z) {
                i2 = 8;
            }
            viewGroup.setVisibility(i2);
        }
    }

    private void setScreenAndGoodsIconVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d470b15", new Object[]{this, new Boolean(z)});
        } else if (isHitReplayUpdate() || isTimeShift(this.mFrameContext)) {
            sjr g2 = sjr.g();
            Boolean valueOf = Boolean.valueOf(z);
            ux9 ux9Var = this.mFrameContext;
            g2.c(uyg.EVENT_CLEAR_SCREEN_AND_HIDE_GOODS_ICON, valueOf, ux9Var != null ? ux9Var.C() : null);
            o3s.b(TAG, "设置清屏和隐藏商品" + z);
        }
    }

    private void setShopCardVisibility(ReplayTimeMovingBean replayTimeMovingBean, long j2, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f5df13", new Object[]{this, replayTimeMovingBean, new Long(j2), new Boolean(z)});
        } else if (isHitReplayUpdate()) {
            String str2 = null;
            String valueOf = replayTimeMovingBean != null ? String.valueOf(replayTimeMovingBean.itemId) : null;
            HashMap hashMap = new HashMap();
            if (z) {
                str = "show";
            } else {
                str = "hide";
            }
            hashMap.put("action", str);
            hashMap.put("itemId", valueOf);
            hashMap.put("duration", String.valueOf(j2));
            o3s.b(TAG, "requestShopCard,回放升级进度条变化，shopCardMap：" + hashMap);
            sjr g2 = sjr.g();
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null) {
                str2 = ux9Var.C();
            }
            g2.c(uyg.EVENT_TYPE_PLAYBACK_SHOWCASE_CONTROL, hashMap, str2);
        }
    }

    private void setToggleScreenButtonShow(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7cfff12", new Object[]{this, imageView});
        } else if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    private void setVideoPreviewFrameVisibility(boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d196bd86", new Object[]{this, new Boolean(z), new Integer(i2)});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var.p != null && qr4Var.o != null) {
            if (z) {
                setPreviewFrameVisibility(true);
                if (i2 == 1) {
                    this.mControllerHolder.o.setVisibility(8);
                    this.mControllerHolder.p.setVisibility(0);
                    return;
                }
                this.mControllerHolder.o.setVisibility(0);
                this.mControllerHolder.p.setVisibility(8);
                return;
            }
            setPreviewFrameVisibility(false);
        }
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
    }

    private View thumbnailGetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1daf8c58", new Object[]{this});
        }
        IPlayPublicService iPlayPublicService = this.mVideoView;
        if (iPlayPublicService != null) {
            return iPlayPublicService.x();
        }
        return null;
    }

    private void thumbnailSeekTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e8d426", new Object[]{this});
            return;
        }
        IPlayPublicService iPlayPublicService = this.mVideoView;
        if (iPlayPublicService != null) {
            iPlayPublicService.B(this.newPosition);
        }
    }

    private void updateControllerHolder(qr4 qr4Var, boolean z) {
        View view;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11fffc5", new Object[]{this, qr4Var, new Boolean(z)});
        } else if (qr4Var != null && (view = qr4Var.f26892a) != null) {
            qr4Var.m = view.findViewById(R.id.taolive_video_gesture_layer);
            qr4Var.n = (ViewGroup) view.findViewById(R.id.taolive_video_frame_layout);
            qr4Var.o = (ViewGroup) view.findViewById(R.id.taolive_time_move_preview_frame_layout);
            qr4Var.p = (ViewGroup) view.findViewById(R.id.taolive_video_frame_preview_layer);
            qr4Var.q = (ViewGroup) view.findViewById(R.id.taolive_time_layout);
            qr4Var.r = view.findViewById(R.id.taolive_time_split_line);
            qr4Var.s = view.findViewById(R.id.taolive_video_precision_tips);
            qr4Var.t = view.findViewById(R.id.taolive_video_precision_tips_icon);
            qr4Var.u = view.findViewById(R.id.taolive_video_frame_index_bg);
            qr4Var.v = view.findViewById(R.id.taolive_video_frame_index_text);
            qr4Var.w = view.findViewById(R.id.taolive_video_frame_img);
            qr4Var.x = view.findViewById(R.id.taolive_video_frame_title);
            View view2 = qr4Var.w;
            if (view2 != null) {
                view2.setOutlineProvider(new g());
                qr4Var.w.setClipToOutline(true);
            }
            ViewGroup viewGroup = qr4Var.p;
            if (viewGroup != null) {
                viewGroup.setOutlineProvider(new h());
                qr4Var.p.setClipToOutline(true);
            }
            View view3 = qr4Var.r;
            if (view3 instanceof TUrlImageView) {
                ((TUrlImageView) view3).setImageUrl(TIME_SPLIT_LINE_URL);
            }
            if (z) {
                View inflate = LayoutInflater.from(this.mContext.getApplicationContext()).inflate(R.layout.taolive_video_bottom_fullscreen, (ViewGroup) null, false);
                this.mReplayUpdateHalfPlayContainer = inflate;
                ImageView imageView = (ImageView) inflate.findViewById(R.id.video_controller_fullscreen);
                qr4Var.g = imageView;
                setToggleScreenButtonShow(imageView);
                qr4Var.l = R.drawable.taolive_video_unfullscreen;
                if (isVideoViewNotNull()) {
                    this.mVideoView.getView().addView(this.mReplayUpdateHalfPlayContainer, new FrameLayout.LayoutParams(-1, -1));
                }
            } else if (isVideoViewNotNull() && (findViewById = this.mVideoView.getView().findViewById(R.id.taolive_fullscreen_video_bottom_layer)) != null) {
                this.mVideoView.getView().removeView(findViewById);
            }
            this.mControllerHolder = qr4Var;
        }
    }

    private void watchTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2710b53d", new Object[]{this});
        } else if (this.mHandler == null) {
            Handler handler = new Handler(this);
            this.mHandler = handler;
            handler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    public void addControllerView() {
        View view;
        View view2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692cfee9", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof cdr) {
            z = ((cdr) ux9Var).Y0();
        }
        if (z) {
            if (isVideoViewNotNull() && (view2 = this.mReplayUpdateHalfPlayContainer) != null && view2.getParent() == null) {
                this.mVideoView.getView().addView(this.mReplayUpdateHalfPlayContainer, new FrameLayout.LayoutParams(-1, -1));
            }
        } else if (isVideoViewNotNull() && this.mIsDefaultController && (view = this.mDefaultControllerView) != null && view.getParent() == null) {
            this.mVideoView.getView().addView(this.mDefaultControllerView, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void bindListener(IPlayPublicService iPlayPublicService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a7297e", new Object[]{this, iPlayPublicService});
            return;
        }
        this.mVideoView = iPlayPublicService;
        iPlayPublicService.s(this);
        this.mVideoView.N(this);
        this.mVideoView.d(this);
        this.mVideoView.n(this);
        this.mVideoView.z(this);
        this.mVideoView.q(this);
        this.mVideoView.q(this);
        this.mVideoView.G(this);
        this.mVideoView.f(this);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestroyed = true;
        stopTimer();
        IPlayPublicService iPlayPublicService = this.mVideoView;
        if (iPlayPublicService != null) {
            iPlayPublicService.M();
        }
        if (this.mControllerHolder != null) {
            if (!this.mIsDefaultController || this.mDefaultControllerView == null) {
                hideController();
            } else if (isVideoViewNotNull()) {
                this.mVideoView.getView().removeView(this.mDefaultControllerView);
            }
            p pVar = this.playerStatusListener;
            if (pVar != null) {
                ((kd6) pVar).p();
            }
            if (pvs.P()) {
                this.mContext = null;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1) {
            updateSeekBarProgress();
        }
        return false;
    }

    public void hideController() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null && (view = qr4Var.f26892a) != null) {
            view.setVisibility(8);
        }
    }

    public boolean isVisible() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var == null || (view = qr4Var.f26892a) == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i2) {
        SeekBar seekBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1bdc3a", new Object[]{this, iMediaPlayer, new Integer(i2)});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null && this.mVideoView != null && this.mHandler != null && !this.mIsDestroyed && (seekBar = qr4Var.f) != null) {
            seekBar.setSecondaryProgress(i2 * 10);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.b
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            return;
        }
        resetViewState();
        postPlayerStateMsg("complete");
        requestShopCard(false, false, null, 0L);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
    public boolean onError(IMediaPlayer iMediaPlayer, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        resetViewState();
        postPlayerStateMsg("error");
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
    public void onHighLightLoopCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79317ef2", new Object[]{this, iMediaPlayer});
        } else if (this.mControllerHolder != null && !this.mIsDestroyed) {
            if (this.mFrameContext != null) {
                sjr.g().c(uyg.EVENT_HIGHLIGHT_PLAYER_COMPLETION, null, this.mFrameContext.C());
            }
            o oVar = this.mPlayStartOrCompletionListener;
            if (oVar != null) {
                ((kd6) oVar).t();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j2, long j3, long j4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j2), new Long(j3), new Long(j4), obj})).booleanValue();
        }
        if (((int) j2) == 12101) {
            firstFrameRendered();
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.f
    public void onPause(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
        } else if (this.mControllerHolder != null && !this.mIsDestroyed) {
            postPlayerStateMsg("pause");
            if (this.mControllerHolder.c != null) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    ((Activity) context).runOnUiThread(new d());
                }
            }
            stopTimer();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
    public void onPlay(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9ffab0", new Object[]{this, iMediaPlayer});
            return;
        }
        changeUIStateAndVideoStart();
        postPlayerStateMsg("play");
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
        } else if (this.mControllerHolder != null && !this.mIsDestroyed) {
            resetViewState();
            long duration = this.mVideoView.getDuration();
            if (duration >= 0 && (textView = this.mControllerHolder.d) != null) {
                textView.setText(stringForTime(duration));
            }
            postPlayerStateMsg("prepared");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i2), new Boolean(z)});
        } else if (z) {
            long duration = this.mVideoView.getDuration();
            this.mIsSeekBarOnChange = true;
            long j2 = (int) (((float) duration) * (i2 / 1000.0f));
            this.newPosition = j2;
            TextView textView = this.mControllerHolder.e;
            if (textView != null) {
                textView.setText(stringForTime(j2));
            }
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
            return;
        }
        changeUIStateAndVideoStart();
        postPlayerStateMsg("start");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        long duration = this.mVideoView.getDuration();
        if (duration <= 0 || this.newPosition <= duration) {
            this.mVideoView.seekTo(this.newPosition);
        }
        r rVar = this.mSeekStopTrackingListener;
        if (rVar != null) {
            rVar.a(this.mIsSeekBarOnChange);
            this.mSeekStopTrackingListener.c(this.mIsSeekBarOnChange, this.newPosition);
        }
        this.mIsSeekBarOnChange = false;
    }

    public void refreshController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59867dde", new Object[]{this});
        } else if (this.mControllerHolder != null) {
            if (this.mVideoView.isPlaying()) {
                qr4 qr4Var = this.mControllerHolder;
                ImageView imageView = qr4Var.c;
                if (imageView != null) {
                    imageView.setImageResource(qr4Var.j);
                }
            } else {
                qr4 qr4Var2 = this.mControllerHolder;
                ImageView imageView2 = qr4Var2.c;
                if (imageView2 != null) {
                    imageView2.setImageResource(qr4Var2.i);
                }
            }
            if (this.mIsFullScreen) {
                qr4 qr4Var3 = this.mControllerHolder;
                ImageView imageView3 = qr4Var3.g;
                if (imageView3 != null) {
                    imageView3.setImageResource(qr4Var3.l);
                    return;
                }
                return;
            }
            qr4 qr4Var4 = this.mControllerHolder;
            ImageView imageView4 = qr4Var4.g;
            if (imageView4 != null) {
                imageView4.setImageResource(qr4Var4.k);
            }
        }
    }

    public void removeControllerView() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c96c0c", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof cdr) {
            z = ((cdr) ux9Var).Y0();
        }
        if (z) {
            if (isVideoViewNotNull() && this.mReplayUpdateHalfPlayContainer != null) {
                this.mVideoView.getView().removeView(this.mReplayUpdateHalfPlayContainer);
            }
        } else if (isVideoViewNotNull() && this.mIsDefaultController && this.mDefaultControllerView != null) {
            this.mVideoView.getView().removeView(this.mDefaultControllerView);
        }
    }

    public void resetViewState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1264", new Object[]{this});
        } else if (this.mControllerHolder != null && !this.mIsDestroyed) {
            stopTimer();
            this.newPosition = 0L;
            qr4 qr4Var = this.mControllerHolder;
            ImageView imageView = qr4Var.c;
            if (imageView != null) {
                imageView.setImageResource(qr4Var.i);
            }
            TextView textView = this.mControllerHolder.e;
            if (textView != null) {
                textView.setText(stringForTime(0L));
            }
            SeekBar seekBar = this.mControllerHolder.f;
            if (seekBar != null) {
                seekBar.setProgress(0);
                this.mControllerHolder.f.setSecondaryProgress(0);
            }
        }
    }

    public void setControllerHolder(qr4 qr4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e124608", new Object[]{this, qr4Var});
        } else if (qr4Var != null) {
            removeControllerView();
            this.mControllerHolder = qr4Var;
            this.mIsDefaultController = false;
            init();
        }
    }

    public void setDefaultControllerHolder(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c5b036", new Object[]{this, ux9Var});
            return;
        }
        this.mFrameContext = ux9Var;
        setDefaultControllerHolder();
    }

    public void setFullScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3d7370", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFullScreen = z;
        }
    }

    public void setIPlayForwardListener(k9d k9dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b409088", new Object[]{this, k9dVar});
        } else {
            this.mPlayForwardListener = k9dVar;
        }
    }

    public void setPlayProgressListener(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1e3459", new Object[]{this, nVar});
        } else {
            this.mPlayProgressListener = nVar;
        }
    }

    public void setPlayRateListener(m9d m9dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190e2e25", new Object[]{this, m9dVar});
        } else {
            this.mPlayRateControlListener = m9dVar;
        }
    }

    public void setPlayerStatusListener(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7499", new Object[]{this, pVar});
        } else {
            this.playerStatusListener = pVar;
        }
    }

    public void setSeekStopTrackingListener(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505e6659", new Object[]{this, rVar});
        } else {
            this.mSeekStopTrackingListener = rVar;
        }
    }

    public void setToggleScreenListener(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875fa339", new Object[]{this, sVar});
        } else {
            this.mToggleScreenListener = sVar;
        }
    }

    public void setmPlayOrPauseButtonListener(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad4ec1a", new Object[]{this, mVar});
        } else {
            this.mPlayOrPauseButtonListener = mVar;
        }
    }

    public void setmPlayStartOrCompletionListener(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a462a2", new Object[]{this, oVar});
        } else {
            this.mPlayStartOrCompletionListener = oVar;
        }
    }

    public void showController() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null) {
            View view = qr4Var.f26892a;
            if (view != null) {
                view.setVisibility(0);
            }
            if (vc.a() && vc.h(this.mContext) && (imageView = this.mControllerHolder.g) != null) {
                imageView.setVisibility(8);
            }
        }
    }

    public void toggleScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691bb24d", new Object[]{this, new Boolean(z)});
        } else {
            toggleScreen(z, true ^ this.mIsFullScreen);
        }
    }

    private void initVideoThumbnail() {
        VideoInfo c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e4f7e8", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if ((ux9Var instanceof cdr) && ((cdr) ux9Var).Y0() && d4s.e("enableVideoThumbnail", true) && this.mVideoView != null && (this.mContext instanceof Activity) && (c0 = up6.c0(this.mFrameContext)) != null && !TextUtils.isEmpty(c0.replayCutFrameUrl)) {
            o3s.b(TAG, "初始化播放器缩略帧");
            h4s.b("init_video_thumbnail");
            if (this.mControllerHolder.p != null) {
                this.mVideoView.r(new c());
                this.mVideoView.L(this.mContext, c0.replayCutFrameUrl);
            }
            h4s.e();
        }
    }

    private void setHasPostMsgToShowShopCard(ReplayTimeMovingBean replayTimeMovingBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664610b0", new Object[]{this, replayTimeMovingBean});
            return;
        }
        ReplayTimeMovingBean replayTimeMovingBean2 = this.mLastReplayTimeMovingBean;
        if (!(replayTimeMovingBean2 == null || replayTimeMovingBean == null || replayTimeMovingBean2.itemId.equals(replayTimeMovingBean.itemId))) {
            this.mHasPostMsgToShowShopCard = false;
        }
        this.mLastReplayTimeMovingBean = replayTimeMovingBean;
        o3s.b(TAG, "回放升级进度条变化 mLastReplayTimeMovingBean：" + this.mLastReplayTimeMovingBean);
    }

    public void setPlayRateDefault() {
        TextView textView;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fec5bb2", new Object[]{this});
            return;
        }
        this.mPlayRateIndex = 0;
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null && (textView = qr4Var.h) != null) {
            if (TextUtils.isEmpty(this.defaultPlayRateViewText)) {
                str = "倍速";
            } else {
                str = this.defaultPlayRateViewText;
            }
            textView.setText(str);
        }
    }

    public void setPlayRateViewShow(boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a777a015", new Object[]{this, new Boolean(z)});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null && qr4Var.h != null && v2s.o().I("videoRate")) {
            TextView textView = this.mControllerHolder.h;
            if (!z) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
    }

    public void setUpdateControllerHolder(cdr cdrVar, qr4 qr4Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b612977", new Object[]{this, cdrVar, qr4Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mFrameContext = cdrVar;
        removeControllerView();
        this.mIsDefaultController = false;
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof cdr) {
            this.mTimeMoveReplayModel = ((cdr) ux9Var).k0;
        }
        updateControllerHolder(qr4Var, z);
        this.mPlayControlGestureManager = new com.taobao.taolive.sdk.ui.media.playercontrol.a(this.mControllerHolder, this.mVideoView, isTimeShift(this.mFrameContext));
        init();
        setAbilityToggleSwitchVisibility();
        if (z2) {
            o3s.b(TAG, "已经有首帧，init播放器缩略帧");
            initVideoThumbnail();
        }
    }

    public void toggleScreen(boolean z, boolean z2) {
        s sVar;
        s sVar2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5b4a27", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.mControllerHolder != null) {
            if (z2) {
                if (!z && (sVar2 = this.mToggleScreenListener) != null) {
                    sVar2.a();
                }
            } else if (!z && (sVar = this.mToggleScreenListener) != null) {
                sVar.b();
            }
            this.mIsFullScreen = z2;
            if (z2) {
                qr4 qr4Var = this.mControllerHolder;
                ImageView imageView = qr4Var.g;
                if (imageView != null) {
                    imageView.setImageResource(qr4Var.l);
                }
            } else {
                qr4 qr4Var2 = this.mControllerHolder;
                ImageView imageView2 = qr4Var2.g;
                if (imageView2 != null) {
                    imageView2.setImageResource(qr4Var2.k);
                }
            }
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var instanceof cdr) {
                VideoInfo c0 = up6.c0(ux9Var);
                boolean z4 = c0 != null && c0.landScape && c0.publishCommentsUseMtop && c0.fetchCommentsUseMtop;
                cdr cdrVar = (cdr) this.mFrameContext;
                if (!z4 || !this.mIsFullScreen) {
                    z3 = false;
                }
                cdrVar.f1(z3);
            }
        }
    }

    private boolean addVideoPreviewFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b903e50a", new Object[]{this})).booleanValue();
        }
        if (this.mControllerHolder.p == null) {
            return false;
        }
        View thumbnailGetView = thumbnailGetView();
        if (thumbnailGetView == null) {
            setVideoPreviewFrameVisibility(false, 1);
            o3s.b(TAG, "回放升级_播放器缩略帧，addVideoPreviewFrame，视频缩略图为null");
            return false;
        }
        setVideoPreviewFrameVisibility(true, 1);
        ViewGroup viewGroup = (ViewGroup) thumbnailGetView.getParent();
        if (viewGroup != this.mControllerHolder.p) {
            if (viewGroup != null) {
                viewGroup.removeView(thumbnailGetView);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            o3s.b(TAG, "回放升级_播放器缩略帧，addVideoPreviewFrame");
            this.mControllerHolder.p.addView(thumbnailGetView, layoutParams);
        }
        thumbnailSeekTo();
        return true;
    }

    private boolean isVideoViewNotNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b344ef", new Object[]{this})).booleanValue();
        }
        IPlayPublicService iPlayPublicService = this.mVideoView;
        if (iPlayPublicService == null || iPlayPublicService.getView() == null) {
            return false;
        }
        o3s.b(TAG, "playController2,setDefaultControllerHolder addView:" + this.mVideoView.getView());
        return this.mVideoView.getView() != null;
    }

    private void requestShopCard(boolean z, boolean z2, ReplayTimeMovingBean replayTimeMovingBean, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4b7d86", new Object[]{this, new Boolean(z), new Boolean(z2), replayTimeMovingBean, new Long(j2)});
        } else if (pvs.r1() && isHitReplayUpdate() && this.mControllerHolder != null) {
            if (!z) {
                setShopCardVisibility(replayTimeMovingBean, j2, false);
                return;
            }
            o3s.b(TAG, "requestShopCard,查询商品小看数据,isSeekStop:" + z2 + ",mHasPostMsgToShowShopCard:" + this.mHasPostMsgToShowShopCard);
            if (replayTimeMovingBean != null) {
                long longValue = replayTimeMovingBean.endSeekTime.longValue() * 1000;
                long j3 = this.newPosition;
                if (j3 <= replayTimeMovingBean.StartSeekTime.longValue() * 1000 || j3 >= longValue) {
                    this.mHasPostMsgToShowShopCard = false;
                    setShopCardVisibility(null, j2, false);
                } else if (z2 || !this.mHasPostMsgToShowShopCard) {
                    this.mHasPostMsgToShowShopCard = true;
                    o3s.b(TAG, "ControlViewManager,回放升级进度条变化 查询到宝贝口袋小卡数据，当前进度：" + this.newPosition + ",看点小卡结束时间：" + longValue + ",mLastReplayTimeMovingBean：" + replayTimeMovingBean.toString() + ",timeMovingCardDuration:" + j2);
                    setShopCardVisibility(replayTimeMovingBean, j2, true);
                }
            } else {
                this.mHasPostMsgToShowShopCard = false;
            }
        }
    }

    private void updateSeekBarProgress() {
        IPlayPublicService iPlayPublicService;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3830bec6", new Object[]{this});
        } else if (this.mControllerHolder != null && (iPlayPublicService = this.mVideoView) != null && this.mHandler != null) {
            long currentPosition = iPlayPublicService.getCurrentPosition();
            if (!this.mIsSeekBarOnChange && currentPosition != this.newPosition) {
                this.newPosition = currentPosition;
                long duration = this.mVideoView.getDuration();
                if (duration > 0) {
                    i2 = (int) Math.ceil(((((float) currentPosition) * 1.0f) / ((float) duration)) * 1000.0f);
                }
                TextView textView = this.mControllerHolder.d;
                if (textView != null) {
                    textView.setText(stringForTime(duration));
                }
                TextView textView2 = this.mControllerHolder.e;
                if (textView2 != null) {
                    textView2.setText(stringForTime(currentPosition));
                }
                SeekBar seekBar = this.mControllerHolder.f;
                if (seekBar != null) {
                    seekBar.setProgress(i2);
                }
                n nVar = this.mPlayProgressListener;
                if (nVar != null) {
                    ((kd6) nVar).q(currentPosition);
                }
                o3s.a(TAG, "onProgressChanged:" + i2);
                executeReplayTimeMoveObj(this.newPosition, this.mLastReplayTimeMovingBean, new a());
                postPlaySpeedGuideMsg(this.newPosition);
            }
            try {
                this.mHandler.sendEmptyMessageDelayed(1, 500L);
            } catch (Exception e2) {
                o3s.b(TAG, "onProgressChangedException:" + e2.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDefaultControllerHolder() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.setDefaultControllerHolder():void");
    }

    public static String stringForTime(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a47bf48", new Object[]{new Long(j2)});
        }
        long j3 = j2 / 1000;
        long j4 = j3 % 60;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 / 3600;
        if (j6 > 0) {
            return String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4));
        }
        if (v2s.o().I("showHour")) {
            return String.format(Locale.getDefault(), "%02d:%02d:%02d", Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4));
        }
        return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j5), Long.valueOf(j4));
    }

    public void showController(int i2) {
        ImageView imageView;
        View view;
        View view2;
        View view3;
        View view4;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2ce083", new Object[]{this, new Integer(i2)});
            return;
        }
        qr4 qr4Var = this.mControllerHolder;
        if (qr4Var != null) {
            View view5 = qr4Var.f26892a;
            if (view5 != null) {
                view5.setVisibility(0);
            }
            this.mShowType = i2;
            if (i2 == 1) {
                View view6 = this.mControllerHolder.b;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
                TextView textView = this.mControllerHolder.h;
                if (textView != null) {
                    textView.setVisibility(v2s.o().I("videoRate") ? 0 : 8);
                }
                ImageView imageView2 = this.mControllerHolder.g;
                if (imageView2 != null) {
                    if (!v2s.o().I("changeLandscapeBtn")) {
                        i3 = 8;
                    }
                    imageView2.setVisibility(i3);
                }
                if (this.mIsDefaultController && (view = this.mControllerHolder.f26892a) != null) {
                    view.setBackgroundResource(R.drawable.taolive_video_play_bg);
                }
            } else if (i2 == 2) {
                View view7 = this.mControllerHolder.b;
                if (view7 != null) {
                    view7.setVisibility(0);
                }
                ImageView imageView3 = this.mControllerHolder.g;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
            } else if (i2 == 3) {
                View view8 = this.mControllerHolder.b;
                if (view8 != null) {
                    view8.setVisibility(4);
                }
                ImageView imageView4 = this.mControllerHolder.g;
                if (imageView4 != null) {
                    imageView4.setVisibility(v2s.o().I("changeLandscapeBtn") ? 0 : 8);
                }
                if (this.mIsDefaultController && (view3 = this.mControllerHolder.f26892a) != null) {
                    view3.setBackgroundResource(0);
                }
                if (this.mIsDefaultController && (view2 = this.mControllerHolder.f26892a) != null) {
                    view2.setBackgroundResource(0);
                }
            } else if (i2 == 4) {
                View view9 = this.mControllerHolder.b;
                if (view9 != null) {
                    view9.setVisibility(4);
                }
                ImageView imageView5 = this.mControllerHolder.g;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                if (this.mIsDefaultController && (view4 = this.mControllerHolder.f26892a) != null) {
                    view4.setBackgroundResource(0);
                }
                TextView textView2 = this.mControllerHolder.h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            if (vc.a() && vc.h(this.mContext) && (imageView = this.mControllerHolder.g) != null) {
                imageView.setVisibility(8);
            }
        }
    }
}
