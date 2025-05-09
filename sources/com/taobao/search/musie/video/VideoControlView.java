package com.taobao.search.musie.video;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.musie.video.a;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import java.util.Formatter;
import java.util.Locale;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class VideoControlView extends FrameLayout implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mCallback;
    private View mCenterPlay;
    private TextView mCurrentTime;
    private View mFullScreenBtn;
    private View mInfoPanel;
    private View mMute;
    private boolean mMuteState;
    private View mPlayBtn;
    private TextView mPlayRate;
    private View mRoot;
    private SeekBar mSeekBar;
    private TextView mTotalTimeTextView;
    private boolean mShown = true;
    private boolean mPlayed = false;
    private boolean mStatePlay = false;
    private boolean mShowCenterPlay = true;
    private float mTotalTime = 0.0f;
    private int newPosition = 0;
    private boolean isTracking = false;
    private final float[] PLAT_RATE_ARRAY = {1.0f, 1.5f, 0.8f};
    private final String[] PLAY_RATE_TEXT_ARRAY = {"1.0X", "1.5X", "0.8X"};
    private int mPlayRateIndex = 0;
    private final Runnable mHideRunnable = new a();
    private StringBuilder mFormatBuilder = new StringBuilder();
    private Formatter mFormatter = new Formatter(this.mFormatBuilder, Locale.getDefault());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (VideoControlView.access$000(VideoControlView.this)) {
                VideoControlView.access$100(VideoControlView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(815792793);
    }

    public VideoControlView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.tbsearch_muise_video_bottom_controller_layout, (ViewGroup) this, true);
        findAllViews();
        stop();
        setOnClickListener(this);
        ViewProxy.setOnClickListener(this.mCenterPlay, this);
        ViewProxy.setOnClickListener(this.mMute, this);
        this.mPlayRate.setOnClickListener(this);
        ViewProxy.setOnClickListener(this.mPlayBtn, this);
        ViewProxy.setOnClickListener(this.mFullScreenBtn, this);
    }

    public static /* synthetic */ boolean access$000(VideoControlView videoControlView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("122f4c93", new Object[]{videoControlView})).booleanValue();
        }
        return videoControlView.mPlayed;
    }

    public static /* synthetic */ void access$100(VideoControlView videoControlView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b83a1d0", new Object[]{videoControlView});
        } else {
            videoControlView.hideControls();
        }
    }

    private void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.mRoot = findViewById(R.id.root_layout);
        this.mCenterPlay = findViewById(R.id.center_play);
        this.mMute = findViewById(R.id.mute_btn);
        this.mPlayBtn = findViewById(R.id.play_btn);
        this.mFullScreenBtn = findViewById(R.id.fullscreen_btn);
        this.mCurrentTime = (TextView) findViewById(R.id.video_controller_current_time);
        this.mTotalTimeTextView = (TextView) findViewById(R.id.video_controller_total_time);
        TextView textView = (TextView) findViewById(R.id.video_controller_playrate);
        this.mPlayRate = textView;
        textView.setVisibility(0);
        SeekBar seekBar = (SeekBar) findViewById(R.id.video_controller_seekBar);
        this.mSeekBar = seekBar;
        seekBar.setMax(100);
        this.mSeekBar.setOnSeekBarChangeListener(this);
        this.mInfoPanel = findViewById(R.id.info_panel);
    }

    private String formatTime2String(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("441dda83", new Object[]{this, new Integer(i)});
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        this.mFormatBuilder.setLength(0);
        if (i5 > 0) {
            return this.mFormatter.format("%02d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString();
        }
        return this.mFormatter.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }

    private void handlePlayRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce65a303", new Object[]{this});
            return;
        }
        b bVar = this.mCallback;
        if (bVar != null) {
            float[] fArr = this.PLAT_RATE_ARRAY;
            int length = (this.mPlayRateIndex + 1) % fArr.length;
            this.mPlayRateIndex = length;
            ((a.C0653a) bVar).d(fArr[length]);
            this.mPlayRate.setText(this.PLAY_RATE_TEXT_ARRAY[this.mPlayRateIndex]);
        }
    }

    private void hideControls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9cde9f", new Object[]{this});
            return;
        }
        this.mShown = false;
        this.mRoot.setVisibility(8);
    }

    public static /* synthetic */ Object ipc$super(VideoControlView videoControlView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/video/VideoControlView");
    }

    private void showControls() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc41bda", new Object[]{this});
            return;
        }
        this.mShown = true;
        this.mRoot.setVisibility(0);
        removeCallbacks(this.mHideRunnable);
        postDelayed(this.mHideRunnable, 3000L);
    }

    private void toggleFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2dab56", new Object[]{this});
            return;
        }
        b bVar = this.mCallback;
        if (bVar != null) {
            ((a.C0653a) bVar).a();
        }
    }

    private void toggleToStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca70c3ba", new Object[]{this});
            return;
        }
        this.mPlayed = true;
        showControls();
        this.mInfoPanel.setVisibility(0);
        if (this.mShowCenterPlay) {
            this.mCenterPlay.setVisibility(0);
        } else {
            this.mCenterPlay.setVisibility(8);
        }
        removeCallbacks(this.mHideRunnable);
        postDelayed(this.mHideRunnable, 3000L);
    }

    private void toggleToStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1f0198", new Object[]{this});
            return;
        }
        this.mPlayed = false;
        showControls();
        this.mInfoPanel.setVisibility(8);
        this.mCenterPlay.setVisibility(0);
        removeCallbacks(this.mHideRunnable);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.center_play || view.getId() == R.id.play_btn) {
            if (this.mStatePlay) {
                pause();
            } else {
                play();
            }
            b bVar = this.mCallback;
            if (bVar != null) {
                ((a.C0653a) bVar).c(this.mStatePlay);
            }
        } else if (view.getId() == R.id.mute_btn) {
            b bVar2 = this.mCallback;
            if (bVar2 != null) {
                ((a.C0653a) bVar2).b(true ^ this.mMuteState);
            }
        } else if (view.getId() == R.id.video_controller_playrate) {
            handlePlayRate();
        } else if (view.getId() == R.id.fullscreen_btn) {
            toggleFullScreen();
        } else {
            removeCallbacks(this.mHideRunnable);
            if (!this.mPlayed) {
                return;
            }
            if (this.mShown) {
                hideControls();
            } else {
                showControls();
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        float f = this.mTotalTime;
        if (f >= 0.0f && z) {
            int i2 = (int) (f * (i / 100.0f));
            this.newPosition = i2;
            this.mCurrentTime.setText(formatTime2String(i2));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
        } else {
            this.isTracking = true;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.isTracking = false;
        b bVar = this.mCallback;
        if (bVar != null) {
            ((a.C0653a) bVar).e(this.newPosition);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        toggleToStart();
        this.mStatePlay = false;
        this.mCenterPlay.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_play));
        this.mPlayBtn.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_small_play));
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        toggleToStart();
        this.mStatePlay = true;
        this.mCenterPlay.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_pause));
        this.mPlayBtn.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_small_pause));
    }

    public void setCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c11ac7f", new Object[]{this, bVar});
        } else {
            this.mCallback = bVar;
        }
    }

    public void setMuteState(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85048537", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMuteState = z;
        View view = this.mMute;
        Resources resources = getContext().getResources();
        if (z) {
            i = R.drawable.alimuise_muted;
        } else {
            i = R.drawable.alimuise_not_muted;
        }
        view.setBackgroundDrawable(resources.getDrawable(i));
    }

    public void setPlayRateVisible(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963f69d1", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.mPlayRate;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setProgress(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c1c52d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.isTracking) {
            this.mTotalTime = i2;
            if (i > i2) {
                i = i2;
            }
            this.mCurrentTime.setText(formatTime2String(i));
            this.mTotalTimeTextView.setText(formatTime2String(i2));
            this.mSeekBar.setProgress((i * 100) / i2);
            this.mSeekBar.setSecondaryProgress(i3);
            this.newPosition = i;
        }
    }

    public void setSeekBarEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66be26e5", new Object[]{this, new Boolean(z)});
        } else {
            this.mSeekBar.setEnabled(z);
        }
    }

    public void setShowCenterPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13f725", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowCenterPlay = z;
        }
    }

    public void setShowFullScreen(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24f87b3", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.mFullScreenBtn;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setShowMute(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5148f5", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.mMute;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setShowPlay(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73e88ba", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.mPlayBtn;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        toggleToStop();
        this.mStatePlay = false;
        this.mCenterPlay.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_play));
        this.mPlayBtn.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.alimuise_small_play));
    }
}
