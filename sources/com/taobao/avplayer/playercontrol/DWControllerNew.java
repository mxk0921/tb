package com.taobao.avplayer.playercontrol;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.media.MediaTimeUtils;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.taobao.R;
import tb.asc;
import tb.f75;
import tb.pr4;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWControllerNew implements SeekBar.OnSeekBarChangeListener, asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private pr4 mControllerHolder;
    private DWContext mDWContext;
    private f75 mDWControllerClickListener;
    private FrameLayout mHost;
    private int mPositionBeforeStart;
    private int mTotalTime;
    private int newPosition = 0;
    public boolean startTracking;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                DWControllerNew.access$000(DWControllerNew.this).c();
            }
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
            } else {
                DWControllerNew.access$100(DWControllerNew.this).b.setImageResource(DWControllerNew.access$100(DWControllerNew.this).g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DWControllerNew.access$100(DWControllerNew.this).b.setImageResource(DWControllerNew.access$100(DWControllerNew.this).f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                DWControllerNew.access$100(DWControllerNew.this).b.setImageResource(DWControllerNew.access$100(DWControllerNew.this).g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
                DWControllerNew.access$100(DWControllerNew.this).b.setImageResource(DWControllerNew.access$100(DWControllerNew.this).f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DWControllerNew.access$100(DWControllerNew.this).b.setImageResource(DWControllerNew.access$100(DWControllerNew.this).g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DWControllerNew.access$100(DWControllerNew.this).b.setImageResource(DWControllerNew.access$100(DWControllerNew.this).f);
            }
        }
    }

    static {
        t2o.a(452985140);
        t2o.a(774897787);
    }

    public DWControllerNew(DWContext dWContext, f75 f75Var) {
        this.mDWContext = dWContext;
        this.mDWControllerClickListener = f75Var;
        initAndGetControllerHolder(dWContext.getActivity());
    }

    public static /* synthetic */ f75 access$000(DWControllerNew dWControllerNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f75) ipChange.ipc$dispatch("a9abfdef", new Object[]{dWControllerNew});
        }
        return dWControllerNew.mDWControllerClickListener;
    }

    public static /* synthetic */ pr4 access$100(DWControllerNew dWControllerNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr4) ipChange.ipc$dispatch("9077f62d", new Object[]{dWControllerNew});
        }
        return dWControllerNew.mControllerHolder;
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

    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.mHost;
    }

    public void initAndGetControllerHolder(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a92eca", new Object[]{this, context});
            return;
        }
        this.mHost = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.tbavsdk_video_bottom_controller, (ViewGroup) null, false);
        pr4 pr4Var = new pr4();
        this.mControllerHolder = pr4Var;
        pr4Var.f26250a = this.mHost.findViewById(R.id.video_controller_layout);
        this.mControllerHolder.d = (TextView) this.mHost.findViewById(R.id.video_controller_current_time);
        this.mControllerHolder.c = (TextView) this.mHost.findViewById(R.id.video_controller_total_time);
        this.mControllerHolder.e = (SeekBar) this.mHost.findViewById(R.id.video_controller_seekBar);
        this.mControllerHolder.e.setEnabled(false);
        pr4 pr4Var2 = this.mControllerHolder;
        pr4Var2.g = R.drawable.avsdk_video_btn_pause;
        pr4Var2.f = R.drawable.avsdk_video_btn_start;
        pr4Var2.b = (ImageView) this.mHost.findViewById(R.id.video_controller_play_btn);
        ImageView imageView = this.mControllerHolder.b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        SeekBar seekBar = this.mControllerHolder.e;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
            this.mControllerHolder.e.setMax(1000);
        }
        ImageView imageView2 = this.mControllerHolder.b;
        if (imageView2 != null) {
            imageView2.bringToFront();
            this.mControllerHolder.b.setOnClickListener(new a());
            pr4 pr4Var3 = this.mControllerHolder;
            pr4Var3.b.setImageResource(pr4Var3.g);
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
            return;
        }
        DWContext dWContext = this.mDWContext;
        if (!dWContext.mLoop && this.mControllerHolder.b != null && (dWContext.getActivity() instanceof Activity)) {
            this.mDWContext.getActivity().runOnUiThread(new e());
        }
        this.mControllerHolder.e.setEnabled(false);
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
        } else if (this.mControllerHolder.b != null && (this.mDWContext.getActivity() instanceof Activity)) {
            this.mDWContext.getActivity().runOnUiThread(new c());
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else if (this.mControllerHolder.b != null && (this.mDWContext.getActivity() instanceof Activity)) {
            this.mDWContext.getActivity().runOnUiThread(new d());
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        this.mControllerHolder.e.setEnabled(true);
        this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(this.mTotalTime));
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.startTracking) {
            if (this.mTotalTime != i3) {
                this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(i3));
                this.mTotalTime = i3;
            }
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
        if (this.mControllerHolder.b != null && (this.mDWContext.getActivity() instanceof Activity)) {
            this.mDWContext.getActivity().runOnUiThread(new b());
        }
        this.mControllerHolder.e.setEnabled(true);
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
            int i3 = (int) (i2 * (i / 1000.0f));
            this.newPosition = i3;
            pr4 pr4Var = this.mControllerHolder;
            if (pr4Var != null) {
                pr4Var.d.setText(MediaTimeUtils.msStringForTime(i3));
            }
            f75 f75Var = this.mDWControllerClickListener;
            if (f75Var != null) {
                f75Var.b(this.newPosition);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = true;
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.getVideo() != null) {
            this.mPositionBeforeStart = this.mDWContext.getVideo().getCurrentPosition();
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
        f75 f75Var = this.mDWControllerClickListener;
        if (f75Var != null) {
            f75Var.seekTo(this.newPosition);
        }
    }

    public void updatePlayOrPauseButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0b59e5", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (this.mControllerHolder.b != null && (this.mDWContext.getActivity() instanceof Activity)) {
                this.mDWContext.getActivity().runOnUiThread(new f());
            }
        } else if (this.mControllerHolder.b != null && (this.mDWContext.getActivity() instanceof Activity)) {
            this.mDWContext.getActivity().runOnUiThread(new g());
        }
    }
}
