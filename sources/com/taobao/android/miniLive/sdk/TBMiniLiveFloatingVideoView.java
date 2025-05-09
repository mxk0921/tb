package com.taobao.android.miniLive.sdk;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import tb.efs;
import tb.f3s;
import tb.gjr;
import tb.iw0;
import tb.jtn;
import tb.obu;
import tb.pg1;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.v4q;
import tb.v74;
import tb.vc;
import tb.vx9;
import tb.y2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBMiniLiveFloatingVideoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView benefitImageView;
    private View favorView;
    private String mAlgParams;
    private String mBizCode;
    private OnJumpLiveRoomListener mClickListener;
    private View.OnClickListener mCloseBtnClickListener;
    private RelativeLayout mCloseSwitchTipLayout;
    private h mFloatingVideoViewLifeCycleCallback;
    private Handler mHandler;
    private int mMaxHeight;
    private jtn mRedPacketRainOverlayControl;
    private int mScreenHeight;
    private int mScreenWidth;
    private TUrlImageView mSwitchTipCloseBtn;
    private float mTouchX;
    private float mTouchY;
    private int mVideoHeight;
    private int mVideoWidth;
    private WindowManager.LayoutParams mWM;
    private int mWidth;
    private int margin;
    private v4q mediaPlayer;
    private View playBtn;
    private int statusBarHeight;
    private gjr tbLiveConfig;
    private TUrlImageView videoCover;
    private float x;
    private float y;
    private WindowManager windowManager = (WindowManager) getContext().getApplicationContext().getSystemService(pg1.ATOM_EXT_window);
    private boolean mIsMute = true;
    private boolean isClickPlay = false;
    private boolean isDestroy = false;
    private boolean userAllowed = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface OnJumpLiveRoomListener {
        void onClick(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v4q f8950a;
        public final /* synthetic */ SimpleLiveInfo b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0466a implements OnJumpLiveRoomListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0466a() {
            }

            @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBMiniLiveFloatingVideoView.access$002(TBMiniLiveFloatingVideoView.this, true);
                v4q v4qVar = a.this.f8950a;
                if (v4qVar != null) {
                    v4qVar.start();
                }
                if (TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) != null) {
                    TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).setVisibility(8);
                }
                TBMiniLiveFloatingVideoView.access$202(TBMiniLiveFloatingVideoView.this, true);
                TBMiniLiveFloatingVideoView.access$300(TBMiniLiveFloatingVideoView.this);
                a aVar = a.this;
                obu.b(aVar.b, "FloatWindowPlay", TBMiniLiveFloatingVideoView.access$400(TBMiniLiveFloatingVideoView.this), TBMiniLiveFloatingVideoView.access$500(TBMiniLiveFloatingVideoView.this));
            }
        }

        public a(v4q v4qVar, SimpleLiveInfo simpleLiveInfo) {
            this.f8950a = v4qVar;
            this.b = simpleLiveInfo;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return TBMiniLiveFloatingVideoView.this.onTouchEvent(motionEvent, new C0466a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f8952a;

        public b(TUrlImageView tUrlImageView) {
            this.f8952a = tUrlImageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TBMiniLiveFloatingVideoView.access$600(TBMiniLiveFloatingVideoView.this) != null) {
                TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = TBMiniLiveFloatingVideoView.this;
                TBMiniLiveFloatingVideoView.access$702(tBMiniLiveFloatingVideoView, true ^ TBMiniLiveFloatingVideoView.access$700(tBMiniLiveFloatingVideoView));
                TBMiniLiveFloatingVideoView.access$600(TBMiniLiveFloatingVideoView.this).setMuted(TBMiniLiveFloatingVideoView.access$700(TBMiniLiveFloatingVideoView.this));
                TUrlImageView tUrlImageView = this.f8952a;
                if (tUrlImageView != null) {
                    if (TBMiniLiveFloatingVideoView.access$700(TBMiniLiveFloatingVideoView.this)) {
                        str = "https://img.alicdn.com/imgextra/i2/O1CN01NR6Eq01YCZzKbGroz_!!6000000003023-2-tps-100-100.png";
                    } else {
                        str = "https://img.alicdn.com/imgextra/i3/O1CN01f42nlW1DdVLAgzBSi_!!6000000000239-2-tps-100-100.png";
                    }
                    tUrlImageView.setImageUrl(str);
                }
                if (TBMiniLiveFloatingVideoView.access$800(TBMiniLiveFloatingVideoView.this) != null) {
                    TBMiniLiveFloatingVideoView.access$800(TBMiniLiveFloatingVideoView.this).onMuteBtnClick(TBMiniLiveFloatingVideoView.access$700(TBMiniLiveFloatingVideoView.this));
                }
                TBMiniLiveFloatingVideoView.access$300(TBMiniLiveFloatingVideoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements IMediaPlayer.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) != null) {
                    TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).setVisibility(0);
                }
                if (TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this) != null) {
                    TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this).setVisibility(0);
                }
            }
        }

        public c() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.f
        public void onPause(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
            } else if (!TBMiniLiveFloatingVideoView.access$900(TBMiniLiveFloatingVideoView.this) && TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) != null) {
                TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements IMediaPlayer.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8955a;
        public final /* synthetic */ v4q b;
        public final /* synthetic */ SimpleLiveInfo c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TBMiniLiveFloatingVideoView.access$200(TBMiniLiveFloatingVideoView.this) || TextUtils.equals(TBMiniLiveFloatingVideoView.access$400(TBMiniLiveFloatingVideoView.this), "zoom") || f3s.b(d.this.f8955a) || TBMiniLiveFloatingVideoView.access$000(TBMiniLiveFloatingVideoView.this)) {
                    if (TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this) != null) {
                        TBMiniLiveFloatingVideoView.access$1000(TBMiniLiveFloatingVideoView.this).setVisibility(8);
                    }
                    if (TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) != null) {
                        TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).setVisibility(8);
                    }
                } else {
                    v4q v4qVar = d.this.b;
                    if (v4qVar != null) {
                        v4qVar.pause();
                        d dVar = d.this;
                        obu.e(dVar.c, "Show-FloatWindowPlay", TBMiniLiveFloatingVideoView.access$400(TBMiniLiveFloatingVideoView.this), TBMiniLiveFloatingVideoView.access$500(TBMiniLiveFloatingVideoView.this));
                    }
                }
            }
        }

        public d(Context context, v4q v4qVar, SimpleLiveInfo simpleLiveInfo) {
            this.f8955a = context;
            this.b = v4qVar;
            this.c = simpleLiveInfo;
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
        public void onStart(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
            } else if (!TBMiniLiveFloatingVideoView.access$900(TBMiniLiveFloatingVideoView.this) && TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this) != null) {
                TBMiniLiveFloatingVideoView.access$100(TBMiniLiveFloatingVideoView.this).post(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SimpleLiveInfo f8957a;

        public e(SimpleLiveInfo simpleLiveInfo) {
            this.f8957a = simpleLiveInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SimpleLiveInfo simpleLiveInfo = this.f8957a;
            if (simpleLiveInfo != null && simpleLiveInfo.defaultImageUrl != null) {
                TBMiniLiveFloatingVideoView.access$1100(TBMiniLiveFloatingVideoView.this).setImageUrl(this.f8957a.defaultImageUrl);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TBMiniLiveFloatingVideoView.access$1200(TBMiniLiveFloatingVideoView.this) != null) {
                TBMiniLiveFloatingVideoView.access$1200(TBMiniLiveFloatingVideoView.this).onClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f8959a;

        public g(WindowManager.LayoutParams layoutParams) {
            this.f8959a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                TBMiniLiveFloatingVideoView.access$1300(TBMiniLiveFloatingVideoView.this, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f8959a.y);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface h {
        void a();

        void onMuteBtnClick(boolean z);
    }

    static {
        t2o.a(779092017);
    }

    public TBMiniLiveFloatingVideoView(Context context, String str, String str2) {
        super(context);
        this.statusBarHeight = 0;
        this.mBizCode = str;
        this.mAlgParams = str2;
        this.statusBarHeight = v74.c(context);
        this.margin = iw0.a(context, 12.0f);
    }

    public static /* synthetic */ boolean access$000(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e10fa913", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue();
        }
        return tBMiniLiveFloatingVideoView.userAllowed;
    }

    public static /* synthetic */ boolean access$002(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f869232b", new Object[]{tBMiniLiveFloatingVideoView, new Boolean(z)})).booleanValue();
        }
        tBMiniLiveFloatingVideoView.userAllowed = z;
        return z;
    }

    public static /* synthetic */ View access$100(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0f2fe30", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.playBtn;
    }

    public static /* synthetic */ TUrlImageView access$1000(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("77c4c1bc", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.videoCover;
    }

    public static /* synthetic */ TUrlImageView access$1100(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("518e8efd", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.benefitImageView;
    }

    public static /* synthetic */ View.OnClickListener access$1200(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("2ce0c6e7", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.mCloseBtnClickListener;
    }

    public static /* synthetic */ void access$1300(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4a4c7d", new Object[]{tBMiniLiveFloatingVideoView, new Integer(i), new Integer(i2)});
        } else {
            tBMiniLiveFloatingVideoView.updateViewPosition(i, i2);
        }
    }

    public static /* synthetic */ boolean access$200(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19eba1d1", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue();
        }
        return tBMiniLiveFloatingVideoView.isClickPlay;
    }

    public static /* synthetic */ boolean access$202(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db0c422d", new Object[]{tBMiniLiveFloatingVideoView, new Boolean(z)})).booleanValue();
        }
        tBMiniLiveFloatingVideoView.isClickPlay = z;
        return z;
    }

    public static /* synthetic */ void access$300(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6599e2c", new Object[]{tBMiniLiveFloatingVideoView});
        } else {
            tBMiniLiveFloatingVideoView.sendMiniLiveStatus();
        }
    }

    public static /* synthetic */ String access$400(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a8f6175", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.mBizCode;
    }

    public static /* synthetic */ String access$500(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327bcef6", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.mAlgParams;
    }

    public static /* synthetic */ v4q access$600(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v4q) ipChange.ipc$dispatch("41c0ea7c", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.mediaPlayer;
    }

    public static /* synthetic */ boolean access$700(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28118fac", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue();
        }
        return tBMiniLiveFloatingVideoView.mIsMute;
    }

    public static /* synthetic */ boolean access$702(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91a40fb2", new Object[]{tBMiniLiveFloatingVideoView, new Boolean(z)})).booleanValue();
        }
        tBMiniLiveFloatingVideoView.mIsMute = z;
        return z;
    }

    public static /* synthetic */ h access$800(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("e2ec17c0", new Object[]{tBMiniLiveFloatingVideoView});
        }
        return tBMiniLiveFloatingVideoView.mFloatingVideoViewLifeCycleCallback;
    }

    public static /* synthetic */ boolean access$900(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60ed886a", new Object[]{tBMiniLiveFloatingVideoView})).booleanValue();
        }
        return tBMiniLiveFloatingVideoView.isDestroy;
    }

    private void initView(Context context, SimpleLiveInfo simpleLiveInfo, v4q v4qVar, boolean z) {
        View view;
        int i;
        int i2;
        List<y2s> list;
        ViewStub viewStub;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9f6ae1", new Object[]{this, context, simpleLiveInfo, v4qVar, new Boolean(z)});
        } else if (v4qVar.getView() != null) {
            if (f3s.o(this.mBizCode)) {
                view = LayoutInflater.from(context).inflate(R.layout.taolive_mini_floatvideo_layout_new, (ViewGroup) this, false);
            } else if (z) {
                view = LayoutInflater.from(context).inflate(R.layout.taolive_mini_floatvideo_land_layout, (ViewGroup) this, false);
            } else {
                view = LayoutInflater.from(context).inflate(R.layout.taolive_mini_floatvideo_layout, (ViewGroup) this, false);
                jtn jtnVar = new jtn(view);
                this.mRedPacketRainOverlayControl = jtnVar;
                jtnVar.p();
            }
            addView(view);
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_weex_video_favor_anim);
            if (tUrlImageView != null) {
                tUrlImageView.setSkipAutoSize(true);
                tUrlImageView.setImageUrl(f3s.g());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById(R.id.taolive_mini_living_tip);
            tUrlImageView2.setSkipAutoSize(true);
            tUrlImageView2.setImageUrl(f3s.h());
            gjr gjrVar = this.tbLiveConfig;
            if (gjrVar == null || gjrVar.d) {
                tUrlImageView2.setVisibility(0);
            } else {
                tUrlImageView2.setVisibility(8);
            }
            this.mCloseSwitchTipLayout = (RelativeLayout) findViewById(R.id.taolive_close_switch_tip_layout);
            this.mSwitchTipCloseBtn = (TUrlImageView) findViewById(R.id.taolive_close_switch_tip_btn);
            View findViewById = findViewById(R.id.taolive_mini_video_play);
            this.playBtn = findViewById;
            findViewById.setVisibility(8);
            ViewProxy.setOnTouchListener(this.playBtn, new a(v4qVar, simpleLiveInfo));
            TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById(R.id.taolive_mini_video_play_icon);
            if (tUrlImageView3 != null) {
                tUrlImageView3.setSkipAutoSize(true);
                tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01c7sTJQ24jcGFAI5xj_!!6000000007427-54-tps-72-72.apng");
            }
            TUrlImageView tUrlImageView4 = (TUrlImageView) findViewById(R.id.taolive_mini_mute_btn);
            if (tUrlImageView4 != null) {
                if (this.mediaPlayer != null) {
                    if (this.mIsMute) {
                        str = "https://img.alicdn.com/imgextra/i2/O1CN01NR6Eq01YCZzKbGroz_!!6000000003023-2-tps-100-100.png";
                    } else {
                        str = "https://img.alicdn.com/imgextra/i3/O1CN01f42nlW1DdVLAgzBSi_!!6000000000239-2-tps-100-100.png";
                    }
                    tUrlImageView4.setImageUrl(str);
                }
                if ("mBizCode".equals(this.mBizCode)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tUrlImageView4.getLayoutParams();
                    layoutParams.topMargin = iw0.a(context, 30.0f);
                    tUrlImageView4.setLayoutParams(layoutParams);
                }
                tUrlImageView4.setOnClickListener(new b(tUrlImageView4));
            }
            if (!(simpleLiveInfo == null || simpleLiveInfo.item == null || (viewStub = (ViewStub) findViewById(R.id.taolive_mini_showcase_viewstub)) == null)) {
                viewStub.setLayoutResource(R.layout.taolive_mini_showcase);
                View inflate = viewStub.inflate();
                ((TextView) inflate.findViewById(R.id.tv_index_new)).setText(String.valueOf(simpleLiveInfo.item.index));
                ((TUrlImageView) inflate.findViewById(R.id.taolive_showcase_item_icon)).setImageUrl(simpleLiveInfo.item.coverImage);
                ((TextView) inflate.findViewById(R.id.taolive_showcase_item_tip_text)).setText(simpleLiveInfo.item.tips);
            }
            this.videoCover = (TUrlImageView) findViewById(R.id.taolive_mini_video_cover);
            v4qVar.q(new c());
            v4qVar.z(new d(context, v4qVar, simpleLiveInfo));
            this.benefitImageView = (TUrlImageView) findViewById(R.id.taolive_mini_bottom_tips);
            this.favorView = findViewById(R.id.taolive_weex_favor_layout);
            if (this.benefitImageView != null) {
                boolean z2 = f3s.z();
                if (simpleLiveInfo != null) {
                    if (z2 && (list = simpleLiveInfo.benefits) != null && list.get(0) != null) {
                        simpleLiveInfo.benefits.get(0).getClass();
                        TextUtils.isEmpty(null);
                    } else if (!TextUtils.isEmpty(simpleLiveInfo.defaultImageUrl)) {
                        this.benefitImageView.setImageUrl(simpleLiveInfo.defaultImageUrl);
                    } else if (TextUtils.isEmpty(simpleLiveInfo.defaultImageUrl)) {
                        this.benefitImageView.setImageUrl("https://gw.alicdn.com/tfs/TB10l6bbz39YK4jSZPcXXXrUFXa-324-96.png");
                    }
                    this.benefitImageView.setVisibility(0);
                } else {
                    gjr gjrVar2 = this.tbLiveConfig;
                    if (gjrVar2 == null || gjrVar2.e) {
                        this.benefitImageView.setImageUrl("https://gw.alicdn.com/tfs/TB10l6bbz39YK4jSZPcXXXrUFXa-324-96.png");
                        this.benefitImageView.setVisibility(0);
                    } else {
                        this.benefitImageView.setVisibility(8);
                    }
                }
            }
            View view2 = this.favorView;
            if (view2 != null) {
                gjr gjrVar3 = this.tbLiveConfig;
                if (gjrVar3 == null || !gjrVar3.b) {
                    if (gjrVar3 != null && !gjrVar3.b) {
                        view2.setVisibility(8);
                    }
                } else if (!gjrVar3.e) {
                    ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = iw0.a(getContext(), 12.0f);
                }
            }
            int videoWidth = v4qVar.getVideoWidth();
            int videoHeight = v4qVar.getVideoHeight();
            if (z) {
                i = 156;
            } else {
                i = 93;
            }
            if (z) {
                i2 = 90;
            } else {
                i2 = 169;
            }
            if (f3s.o(this.mBizCode)) {
                if (z) {
                    i = 175;
                } else {
                    i = 130;
                }
                if (z) {
                    i2 = 129;
                } else {
                    i2 = 228;
                }
            }
            int a2 = iw0.a(getContext(), i);
            this.mVideoWidth = a2;
            if (videoWidth <= 0 || videoHeight <= 0) {
                this.mVideoHeight = iw0.a(getContext(), i2);
            } else {
                this.mVideoHeight = (a2 * videoHeight) / videoWidth;
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.taolive_weex_video_layout);
            if (v4qVar.getView() != null && (v4qVar.getView().getParent() instanceof ViewGroup)) {
                ((ViewGroup) v4qVar.getView().getParent()).removeView(v4qVar.getView());
            }
            if (v4qVar.getView() != null) {
                viewGroup.addView(v4qVar.getView(), 0, new FrameLayout.LayoutParams(-1, -1, 1));
            }
            ViewProxy.setOnClickListener(findViewById(R.id.taolive_mini_close_layout), new f());
            if (simpleLiveInfo != null) {
                obu.e(simpleLiveInfo, "Show-Close", this.mBizCode, this.mAlgParams);
            }
            efs.a("TBMiniLiveFloating", "mVideoWidth = " + this.mVideoWidth + " mVideoHeight = " + this.mVideoHeight);
        }
    }

    public static /* synthetic */ Object ipc$super(TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -349229044) {
            super.onConfigurationChanged((Configuration) objArr[0]);
            return null;
        } else if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/miniLive/sdk/TBMiniLiveFloatingVideoView");
        }
    }

    private void pullToBoundary() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58d6771", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int i2 = layoutParams.x;
        int i3 = (this.mWidth / 2) + i2;
        int i4 = this.mScreenWidth;
        if (i3 >= i4 / 2) {
            i = (i4 - this.margin) - this.mVideoWidth;
        } else {
            i = this.margin;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new g(layoutParams));
        ofInt.start();
    }

    private void sendMiniLiveStatus() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f72764", new Object[]{this});
        } else if (this.mediaPlayer != null && f3s.y()) {
            HashMap hashMap = new HashMap();
            if (this.mediaPlayer.isMuted()) {
                str = "MUTE";
            } else {
                str = "NONMUTE";
            }
            hashMap.put("mute", str);
            if (this.isClickPlay) {
                str2 = "CLICK";
            } else {
                str2 = "AUTO";
            }
            hashMap.put("playType", str2);
            ux9 d2 = vx9.d();
            sjr.g().c("com.taobao.taolive.minilive.mediaplatform_video_mute", hashMap, d2 != null ? d2.C() : null);
        }
    }

    private void updateScreenSize(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i;
        int i2;
        Rect bounds2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c8a4ab", new Object[]{this, context});
        } else if (context != null) {
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = this.windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
                bounds = currentWindowMetrics.getBounds();
                int width = bounds.width();
                i = insetsIgnoringVisibility.left;
                int i5 = width - i;
                i2 = insetsIgnoringVisibility.right;
                point.x = i5 - i2;
                bounds2 = currentWindowMetrics.getBounds();
                int height = bounds2.height();
                i3 = insetsIgnoringVisibility.top;
                i4 = insetsIgnoringVisibility.bottom;
                point.y = (height - i3) - i4;
            } else {
                this.windowManager.getDefaultDisplay().getSize(point);
            }
            this.mScreenWidth = point.x;
            int i6 = point.y;
            this.mScreenHeight = i6;
            this.mMaxHeight = i6 - (this.margin * 6);
            efs.a("TBMiniLiveFloating", "updateScreenSize mScreenWidth = " + this.mScreenWidth + " mScreenHeight = " + this.mScreenHeight);
        }
    }

    private void updateViewPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f517eb5e", new Object[]{this});
        } else if (this.mWM != null && this.windowManager != null) {
            boolean d2 = vc.d(getContext());
            int i = (int) (this.x - this.mTouchX);
            int i2 = (int) (this.y - this.mTouchY);
            if (!d2) {
                int max = Math.max(this.margin, i);
                int max2 = Math.max(this.margin, i2);
                int i3 = this.mScreenWidth - this.mVideoWidth;
                int i4 = this.margin;
                int min = Math.min(i3 - i4, max);
                i2 = Math.min((this.mMaxHeight - this.mVideoHeight) - i4, max2);
                i = min;
            }
            WindowManager.LayoutParams layoutParams = this.mWM;
            layoutParams.x = i;
            layoutParams.y = i2;
            try {
                this.windowManager.updateViewLayout(this, layoutParams);
            } catch (Exception e2) {
                efs.a("TBMiniLiveFloating", "Unable to update view layout: " + e2.getMessage());
            }
            efs.a("TBMiniLiveFloating", "updateViewPosition 2 newX = " + i + " newY = " + i2);
        }
    }

    public void bringsToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edabe214", new Object[]{this});
            return;
        }
        jtn jtnVar = this.mRedPacketRainOverlayControl;
        if (jtnVar != null) {
            jtnVar.E();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.isDestroy = true;
        jtn jtnVar = this.mRedPacketRainOverlayControl;
        if (jtnVar != null) {
            jtnVar.q();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        if (this.windowManager != null) {
            try {
                h hVar = this.mFloatingVideoViewLifeCycleCallback;
                if (hVar != null) {
                    hVar.a();
                }
                this.windowManager.removeView(this);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void init(Context context, SimpleLiveInfo simpleLiveInfo, v4q v4qVar, WindowManager.LayoutParams layoutParams, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10f64d2", new Object[]{this, context, simpleLiveInfo, v4qVar, layoutParams, new Boolean(z), new Boolean(z2)});
        } else if (v4qVar != null) {
            efs.a("TBLiveService", "TBMiniLiveFloatingVideoView init");
            this.mediaPlayer = v4qVar;
            this.mWM = layoutParams;
            this.mIsMute = z2;
            updateScreenSize(context);
            initView(context, simpleLiveInfo, v4qVar, z);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        efs.a("TBLiveService", "TBMiniLiveFloatingVideoView onConfigurationChanged");
        updateScreenSize(getContext());
        if (!vc.d(getContext())) {
            pullToBoundary();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.mWidth = i3 - i;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : onTouchEvent(motionEvent, this.mClickListener);
    }

    public void setClickPlay(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4e5cd3", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.isClickPlay && !z) {
            z2 = false;
        }
        this.isClickPlay = z2;
    }

    public void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556e415c", new Object[]{this, onClickListener});
        } else {
            this.mCloseBtnClickListener = onClickListener;
        }
    }

    public void setFloatingVideoViewLifeCycleCallback(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e7bacf", new Object[]{this, hVar});
        } else {
            this.mFloatingVideoViewLifeCycleCallback = hVar;
        }
    }

    public void setOnViewClickListener(OnJumpLiveRoomListener onJumpLiveRoomListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ad403b", new Object[]{this, onJumpLiveRoomListener});
        } else {
            this.mClickListener = onJumpLiveRoomListener;
        }
    }

    public void setRedPacketRainCallback(jtn.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83789e8", new Object[]{this, dVar});
            return;
        }
        jtn jtnVar = this.mRedPacketRainOverlayControl;
        if (jtnVar != null) {
            jtnVar.z(dVar);
        }
    }

    public void setTbLiveConfig(gjr gjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642c509e", new Object[]{this, gjrVar});
        } else {
            this.tbLiveConfig = gjrVar;
        }
    }

    public void setVideoCover(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae36720f", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.videoCover;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
        }
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2da7f", new Object[]{this, videoInfo});
            return;
        }
        jtn jtnVar = this.mRedPacketRainOverlayControl;
        if (jtnVar != null) {
            jtnVar.A(videoInfo);
        }
    }

    public void showCloseSwitchTips(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9758248b", new Object[]{this, onClickListener});
            return;
        }
        RelativeLayout relativeLayout = this.mCloseSwitchTipLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        TUrlImageView tUrlImageView = this.mSwitchTipCloseBtn;
        if (tUrlImageView != null) {
            tUrlImageView.setOnClickListener(onClickListener);
        }
        View findViewById = findViewById(R.id.taolive_mini_close_layout);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public void updateMuteView(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4cc346", new Object[]{this, new Boolean(z)});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_mini_mute_btn);
        if (tUrlImageView != null) {
            if (z) {
                str = "https://img.alicdn.com/imgextra/i2/O1CN01NR6Eq01YCZzKbGroz_!!6000000003023-2-tps-100-100.png";
            } else {
                str = "https://img.alicdn.com/imgextra/i3/O1CN01f42nlW1DdVLAgzBSi_!!6000000000239-2-tps-100-100.png";
            }
            tUrlImageView.setImageUrl(str);
        }
    }

    public void updateViewPositionOffset(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a63d71", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
            if (layoutParams != null) {
                int i3 = layoutParams.x;
                int i4 = layoutParams.y;
                int i5 = this.statusBarHeight;
                Rect rect = new Rect(i3, i4 + i5, layoutParams.width + i3, i4 + layoutParams.height + i5);
                efs.a("TBMiniLiveFloating", "rect = " + rect + " top = " + i2 + " lp.y = " + (layoutParams.y + this.statusBarHeight));
                if (rect.contains(i, i2)) {
                    int i6 = layoutParams.y;
                    int a2 = ((i2 - layoutParams.height) - this.statusBarHeight) - iw0.a(getContext(), 10.0f);
                    layoutParams.y = a2;
                    if (a2 > i6) {
                        layoutParams.y = i6;
                    }
                    this.windowManager.updateViewLayout(this, layoutParams);
                } else if (layoutParams.y > i2) {
                    layoutParams.y = ((i2 - layoutParams.height) - this.statusBarHeight) - iw0.a(getContext(), 10.0f);
                    this.windowManager.updateViewLayout(this, layoutParams);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent, OnJumpLiveRoomListener onJumpLiveRoomListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76c03c98", new Object[]{this, motionEvent, onJumpLiveRoomListener})).booleanValue();
        }
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        this.x = motionEvent.getRawX();
        this.y = motionEvent.getRawY() - (rect.top - 48);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mTouchX = motionEvent.getX();
            this.mTouchY = motionEvent.getY();
        } else if (action == 1) {
            if (Math.abs(motionEvent.getX() - this.mTouchX) >= 10.0f || Math.abs(motionEvent.getY() - this.mTouchY) >= 10.0f) {
                if (!vc.d(getContext())) {
                    pullToBoundary();
                }
            } else if (onJumpLiveRoomListener != null) {
                onJumpLiveRoomListener.onClick(this);
            }
            this.mTouchY = 0.0f;
            this.mTouchX = 0.0f;
        } else if (action == 2 && (Math.abs(motionEvent.getX() - this.mTouchX) > 10.0f || Math.abs(motionEvent.getY() - this.mTouchY) > 10.0f)) {
            updateViewPosition();
        }
        return true;
    }

    private void updateViewPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ec3e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        layoutParams.x = i;
        layoutParams.y = i2;
        try {
            this.windowManager.updateViewLayout(this, layoutParams);
        } catch (Exception e2) {
            efs.a("TBMiniLiveFloating", e2.getMessage());
        }
    }
}
