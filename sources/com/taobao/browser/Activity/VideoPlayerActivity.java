package com.taobao.browser.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VideoPlayerActivity extends BaseActivity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VideoView f10225a;
    public Dialog b;
    public ImageView c;
    public int d = 0;
    public Handler e;
    public Runnable f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements DialogInterface.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
            }
            if (i != 4) {
                return false;
            }
            dialogInterface.dismiss();
            VideoPlayerActivity.this.finish();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int currentPosition = VideoPlayerActivity.l3(VideoPlayerActivity.this).getCurrentPosition();
            if (VideoPlayerActivity.m3(VideoPlayerActivity.this) != currentPosition) {
                VideoPlayerActivity.n3(VideoPlayerActivity.this, currentPosition);
                if (VideoPlayerActivity.o3(VideoPlayerActivity.this) != null && VideoPlayerActivity.o3(VideoPlayerActivity.this).isShowing()) {
                    VideoPlayerActivity.o3(VideoPlayerActivity.this).dismiss();
                }
            } else if (VideoPlayerActivity.o3(VideoPlayerActivity.this) != null && !VideoPlayerActivity.o3(VideoPlayerActivity.this).isShowing()) {
                VideoPlayerActivity.o3(VideoPlayerActivity.this).show();
            }
            if (VideoPlayerActivity.p3(VideoPlayerActivity.this) != null) {
                VideoPlayerActivity.p3(VideoPlayerActivity.this).postDelayed(VideoPlayerActivity.q3(VideoPlayerActivity.this), 500L);
            }
        }
    }

    static {
        t2o.a(619708417);
    }

    public static /* synthetic */ Object ipc$super(VideoPlayerActivity videoPlayerActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 188604040) {
            super.onStop();
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/Activity/VideoPlayerActivity");
        }
    }

    public static /* synthetic */ VideoView l3(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoView) ipChange.ipc$dispatch("5f4004ab", new Object[]{videoPlayerActivity});
        }
        return videoPlayerActivity.f10225a;
    }

    public static /* synthetic */ int m3(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef220237", new Object[]{videoPlayerActivity})).intValue();
        }
        return videoPlayerActivity.d;
    }

    public static /* synthetic */ int n3(VideoPlayerActivity videoPlayerActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47c763b4", new Object[]{videoPlayerActivity, new Integer(i)})).intValue();
        }
        videoPlayerActivity.d = i;
        return i;
    }

    public static /* synthetic */ Dialog o3(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("a507288c", new Object[]{videoPlayerActivity});
        }
        return videoPlayerActivity.b;
    }

    public static /* synthetic */ Handler p3(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("6077b384", new Object[]{videoPlayerActivity});
        }
        return videoPlayerActivity.e;
    }

    public static /* synthetic */ Runnable q3(VideoPlayerActivity videoPlayerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("79b4d513", new Object[]{videoPlayerActivity});
        }
        return videoPlayerActivity.f;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807e65", new Object[]{this, mediaPlayer});
        } else {
            finish();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getSupportActionBar().hide();
        setContentView(R.layout.video_player);
        this.c = (ImageView) findViewById(R.id.video_play);
        ProgressDialog show = ProgressDialog.show(this, "视频加载中....", "亲，请您稍候");
        this.b = show;
        show.setOnKeyListener(new a());
        s3();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6fc624", new Object[]{this, mediaPlayer});
            return;
        }
        r3();
        Handler handler = this.e;
        if (handler != null) {
            handler.post(this.f);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        Dialog dialog = this.b;
        if (dialog != null) {
            dialog.dismiss();
            this.b = null;
        }
        super.onStop();
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.f);
            this.e = null;
            this.f = null;
        }
        finish();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            if (this.f10225a.isPlaying()) {
                this.f10225a.pause();
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(this.f);
                }
                this.c.setVisibility(0);
            } else {
                this.f10225a.start();
                this.c.setVisibility(8);
                Handler handler2 = this.e;
                if (handler2 != null) {
                    handler2.postDelayed(this.f, 500L);
                }
            }
        }
        return true;
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6307f5a0", new Object[]{this});
            return;
        }
        this.e = new Handler();
        this.f = new b();
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfa5052", new Object[]{this});
            return;
        }
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        this.f10225a = videoView;
        videoView.setVideoPath(getIntent().getExtras().getString("video_url"));
        this.f10225a.requestFocus();
        this.f10225a.setOnTouchListener(this);
        this.f10225a.setOnPreparedListener(this);
        this.f10225a.setOnErrorListener(this);
        this.f10225a.setOnCompletionListener(this);
        this.f10225a.start();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3e3b6fb", new Object[]{this, mediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        BrowserUtil.x(this, "亲，非常抱歉，视频无法播放!");
        finish();
        return true;
    }
}
