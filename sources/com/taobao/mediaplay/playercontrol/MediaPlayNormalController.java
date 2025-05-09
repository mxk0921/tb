package com.taobao.mediaplay.playercontrol;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.media.MediaTimeUtils;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.playercontrol.a;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.asc;
import tb.or4;
import tb.t2o;
import tb.tfb;
import tb.zrc;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaPlayNormalController implements Handler.Callback, asc, SeekBar.OnSeekBarChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HIDE_DELAY_TIME = 4000;
    private static final int MSG_HIDE_CONTROLLER = 0;
    private static final String TAG = "MediaPlayController";
    public int duration;
    public or4 mControllerHolder;
    private MediaContext mDWContext;
    private FrameLayout mHost;
    private zrc mMediaPlayControlListener;
    private b mNormalControllerListener;
    private int mTotalTime;
    public boolean startTracking;
    private boolean mHideControllerView = false;
    private int newPosition = 0;
    private Handler mHandler = new Handler(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (MediaPlayNormalController.access$000(MediaPlayNormalController.this) != null) {
                MediaPlayNormalController.access$000(MediaPlayNormalController.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
    }

    static {
        t2o.a(774897823);
        t2o.a(774897787);
    }

    public MediaPlayNormalController(MediaContext mediaContext) {
        this.mDWContext = mediaContext;
        initView();
    }

    public static /* synthetic */ zrc access$000(MediaPlayNormalController mediaPlayNormalController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zrc) ipChange.ipc$dispatch("5741c398", new Object[]{mediaPlayNormalController});
        }
        return mediaPlayNormalController.mMediaPlayControlListener;
    }

    private void initView() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mHost = (FrameLayout) LayoutInflater.from(this.mDWContext.getContext()).inflate(R.layout.media_play_bottom_controller, (ViewGroup) null, false);
        or4 or4Var = new or4();
        this.mControllerHolder = or4Var;
        FrameLayout frameLayout = this.mHost;
        or4Var.f25589a = frameLayout;
        or4Var.b = frameLayout.findViewById(R.id.mediaplay_controller_layout);
        this.mControllerHolder.d = (TextView) this.mHost.findViewById(R.id.mediaplay_controller_current_time);
        this.mControllerHolder.c = (TextView) this.mHost.findViewById(R.id.mediaplay_controller_total_time);
        this.mControllerHolder.e = (SeekBar) this.mHost.findViewById(R.id.mediaplay_controller_seekBar);
        this.mControllerHolder.g = (FrameLayout) this.mHost.findViewById(R.id.video_controller_fullscreen);
        this.mControllerHolder.f = new ImageView(this.mDWContext.getContext());
        int dip2px = DWViewUtil.dip2px(this.mDWContext.getContext(), 2.0f);
        this.mControllerHolder.f.setPadding(dip2px, dip2px, dip2px, dip2px);
        or4 or4Var2 = this.mControllerHolder;
        or4Var2.g.addView(or4Var2.f, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = this.mControllerHolder.g;
        if (!this.mDWContext.mNeedScreenButton) {
            i = 4;
        }
        frameLayout2.setVisibility(i);
        if (!this.mDWContext.mNeedScreenButton) {
            this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 12.0f);
        }
        SeekBar seekBar = this.mControllerHolder.e;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
            this.mControllerHolder.e.setMax(1000);
        }
        if (this.mDWContext.getVideo() != null) {
            int i2 = this.duration;
            if (i2 == 0) {
                i2 = this.mDWContext.getVideo().getDuration();
            }
            this.duration = i2;
            if (i2 >= 0) {
                this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(i2));
            }
        }
        or4 or4Var3 = this.mControllerHolder;
        int i3 = R.drawable.mediaplay_sdk_fullscreen;
        or4Var3.h = i3;
        or4Var3.i = R.drawable.mediaplay_sdk_unfullscreen;
        or4Var3.f.setImageResource(i3);
        ImageView imageView = this.mControllerHolder.f;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
    }

    private void onVideoFullScreen(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968edf99", new Object[]{this, mediaPlayScreenType});
            return;
        }
        if (MediaPlayScreenType.LANDSCAPE_FULL_SCREEN == mediaPlayScreenType) {
            updatePlayerController(true);
        }
        or4 or4Var = this.mControllerHolder;
        ImageView imageView = or4Var.f;
        if (imageView != null) {
            imageView.setImageResource(or4Var.i);
        }
    }

    private void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        updatePlayerController(false);
        or4 or4Var = this.mControllerHolder;
        ImageView imageView = or4Var.f;
        if (imageView != null) {
            imageView.setImageResource(or4Var.h);
        }
    }

    private void resetViewState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1264", new Object[]{this});
            return;
        }
        this.newPosition = 0;
        this.mControllerHolder.d.setText(MediaTimeUtils.msStringForTime(0));
        this.mControllerHolder.e.setProgress(0);
        this.mControllerHolder.e.setSecondaryProgress(0);
        this.mControllerHolder.e.setEnabled(false);
    }

    private void updatePlayerController(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404bbaa7", new Object[]{this, new Boolean(z)});
            return;
        }
        or4 or4Var = this.mControllerHolder;
        if (or4Var != null) {
            if (z) {
                or4Var.b.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getContext(), 68.0f);
                this.mControllerHolder.d.setTextSize(2, 14.0f);
                this.mControllerHolder.c.setTextSize(2, 14.0f);
                if (this.mDWContext.mNeedScreenButton) {
                    this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 40.0f);
                } else {
                    this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 14.0f);
                }
                this.mControllerHolder.g.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getContext(), 40.0f);
                this.mControllerHolder.f25589a.requestLayout();
                return;
            }
            or4Var.b.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getContext(), 48.0f);
            this.mControllerHolder.d.setTextSize(2, 10.0f);
            this.mControllerHolder.c.setTextSize(2, 10.0f);
            if (this.mDWContext.mNeedScreenButton) {
                this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 30.0f);
            } else {
                this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 12.0f);
            }
            this.mControllerHolder.g.getLayoutParams().height = -1;
            this.mControllerHolder.f25589a.requestLayout();
        }
    }

    public void addFullScreenCustomView(View view) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
        } else if (view != null && (frameLayout = this.mControllerHolder.g) != null) {
            frameLayout.removeAllViews();
            this.mControllerHolder.g.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mHost;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "handleMessage >>> what:" + String.valueOf(message.what) + "," + message.toString());
        }
        if (message.what == 0) {
            hideControllerInner();
        }
        return false;
    }

    public void hideControllerInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76d2ff", new Object[]{this});
        } else if (showing()) {
            this.mControllerHolder.b.setVisibility(8);
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
            }
            b bVar = this.mNormalControllerListener;
            if (bVar != null) {
                ((a.C0596a) bVar).a();
            }
        }
    }

    public void hideControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f2dd4a", new Object[]{this});
            return;
        }
        this.mHideControllerView = true;
        hideControllerInner();
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        } else {
            this.newPosition = 0;
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        } else {
            this.mControllerHolder.e.setEnabled(false);
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else {
            resetViewState();
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
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            int duration = this.mDWContext.getVideo().getDuration();
            this.duration = duration;
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(duration));
        }
        this.mControllerHolder.e.setEnabled(true);
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        this.mControllerHolder.e.setEnabled(true);
        int i = this.duration;
        if (i == 0) {
            i = (int) ((AbstractMediaPlayer) iMediaPlayer).getDuration();
        }
        this.duration = i;
        if (i >= 0) {
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(i));
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.startTracking) {
            this.mTotalTime = i3;
            if (i > i3) {
                i = i3;
            }
            this.mControllerHolder.d.setText(MediaTimeUtils.msStringForTime(i));
            this.mControllerHolder.e.setProgress((int) Math.ceil(((i * 1.0f) / i3) * 1000.0f));
            this.mControllerHolder.e.setSecondaryProgress(i2 * 10);
            this.newPosition = i;
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        } else if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
            onVideoNormalScreen();
        } else {
            onVideoFullScreen(mediaPlayScreenType);
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
        if (!TextUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            int duration = this.mDWContext.getVideo().getDuration();
            this.duration = duration;
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(duration));
        }
        this.mControllerHolder.e.setEnabled(true);
        hideControllerInner();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.mTotalTime;
        if (i2 >= 0 && z) {
            this.newPosition = (int) (i2 * (i / 1000.0f));
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onProgressChanged >>> progress:" + i + ", newPosition:" + this.newPosition);
            }
            or4 or4Var = this.mControllerHolder;
            if (or4Var != null) {
                or4Var.d.setText(MediaTimeUtils.msStringForTime(this.newPosition));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = false;
        zrc zrcVar = this.mMediaPlayControlListener;
        if (zrcVar != null) {
            zrcVar.seekTo(this.newPosition);
        }
        showControllerInner();
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mControllerHolder.g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            or4 or4Var = this.mControllerHolder;
            or4Var.g.addView(or4Var.f);
        }
    }

    public void setIMediaPlayControlListener(zrc zrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847c6f31", new Object[]{this, zrcVar});
        } else {
            this.mMediaPlayControlListener = zrcVar;
        }
    }

    public void setNormalControllerListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a166b155", new Object[]{this, bVar});
        } else {
            this.mNormalControllerListener = bVar;
        }
    }

    public void showControllerInner() {
        or4 or4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb064d64", new Object[]{this});
        } else if (!this.mHideControllerView && !showing() && (or4Var = this.mControllerHolder) != null) {
            or4Var.b.setVisibility(0);
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
                this.mHandler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
            }
            b bVar = this.mNormalControllerListener;
            if (bVar != null) {
                ((a.C0596a) bVar).b();
            }
        }
    }

    public void showControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67080245", new Object[]{this});
            return;
        }
        this.mHideControllerView = false;
        showControllerInner();
    }

    public boolean showing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ce99d0", new Object[]{this})).booleanValue();
        }
        if (this.mControllerHolder.b.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = true;
        if (MediaSystemUtils.isApkDebuggable()) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "onProgressChanged --- onStartTrackingTouch ");
        }
    }
}
