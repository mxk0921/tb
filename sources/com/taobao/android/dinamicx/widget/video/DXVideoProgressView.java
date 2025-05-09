package com.taobao.android.dinamicx.widget.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.video.DXVideoProgressSeekBar;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;
import com.taobao.media.MediaTimeUtils;
import com.taobao.taobao.R;
import tb.h36;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXVideoProgressView extends FrameLayout implements SeekBar.OnSeekBarChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TextView currentTimeTv;
    private float mDownY;
    private final Handler mHandler;
    private SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener;
    private boolean mStartTracking;
    private int mTotalTime;
    private final float mTouchSlop;
    private b mVideoSeekToCallback;
    private int newPosition;
    private double progressRate;
    private final LinearLayout timeLayout;
    private final TextView totalTimeTv;
    private final DXVideoProgressSeekBar tsVideoProgressSeekBar;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/video/DXVideoProgressView$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (DXVideoProgressView.access$000(DXVideoProgressView.this) != null) {
                DXVideoProgressView.access$000(DXVideoProgressView.this).setThumbState(DXVideoProgressSeekBar.ThumbState.NORMAL);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    public DXVideoProgressView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ DXVideoProgressSeekBar access$000(DXVideoProgressView dXVideoProgressView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoProgressSeekBar) ipChange.ipc$dispatch("84cf3cf7", new Object[]{dXVideoProgressView});
        }
        return dXVideoProgressView.tsVideoProgressSeekBar;
    }

    public static /* synthetic */ Object ipc$super(DXVideoProgressView dXVideoProgressView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/video/DXVideoProgressView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownY = motionEvent.getRawY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
            if (dXVideoProgressSeekBar == null || !dXVideoProgressSeekBar.isTouching()) {
                z = false;
            } else {
                z = true;
            }
            if (Math.abs(this.mDownY - motionEvent.getRawY()) > this.mTouchSlop) {
                z2 = true;
            } else {
                z2 = false;
            }
            ViewParent parent = getParent();
            if (!z && z2) {
                z3 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z3);
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar2 = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar2 != null) {
            return dXVideoProgressSeekBar2.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getProgressByRate(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac19c570", new Object[]{this, new Double(d)})).intValue();
        }
        return (int) Math.ceil(d * 1.0d * 1000.0d);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
        int i2 = this.mTotalTime;
        if (i2 >= 0 && z) {
            double d = i / 1000.0d;
            this.progressRate = d;
            this.newPosition = (int) (i2 * d);
            if (DinamicXEngine.j0()) {
                String simpleName = getClass().getSimpleName();
                h36.g(simpleName, "onProgressChanged >>> progress:" + i + ", newPosition:" + this.newPosition);
            }
            this.currentTimeTv.setText(MediaTimeUtils.msStringForTime(this.newPosition));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.mHandler.removeMessages(0);
        this.mStartTracking = true;
        LinearLayout linearLayout = this.timeLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar != null) {
            dXVideoProgressSeekBar.setThumbState(DXVideoProgressSeekBar.ThumbState.TOUCH);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.mStartTracking = false;
        LinearLayout linearLayout = this.timeLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        b bVar = this.mVideoSeekToCallback;
        if (bVar != null) {
            ((DXVideoViewWidgetNode.a) bVar).a(this.newPosition, this.progressRate);
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar != null) {
            dXVideoProgressSeekBar.setThumbState(DXVideoProgressSeekBar.ThumbState.MIDDLE);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(0), 3000L);
        }
    }

    public void onVideoProgressChanged(int i, int i2, int i3, DXProgressBarWidgetNode dXProgressBarWidgetNode) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec28ad94", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), dXProgressBarWidgetNode});
            return;
        }
        this.totalTimeTv.setText(MediaTimeUtils.msStringForTime(i3));
        if (!this.mStartTracking) {
            this.mTotalTime = i3;
            if (i3 > 0) {
                double d = i / i3;
                this.progressRate = d;
                i4 = getProgressByRate(d);
                if (dXProgressBarWidgetNode != null) {
                    dXProgressBarWidgetNode.setValue(this.progressRate);
                }
            }
            setProgress(i4);
            setNewPosition(i);
            setProgressSeekEnable(true);
        }
    }

    public void setHintTextVisible(boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fea3f1", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.timeLayout;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        linearLayout.setAlpha(f);
    }

    public void setNewPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16825e95", new Object[]{this, new Integer(i)});
        } else if (this.tsVideoProgressSeekBar != null) {
            this.newPosition = i;
        }
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29144588", new Object[]{this, onSeekBarChangeListener});
        } else {
            this.mOnSeekBarChangeListener = onSeekBarChangeListener;
        }
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
            return;
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar != null) {
            dXVideoProgressSeekBar.setProgress(i);
        }
    }

    public void setProgressSeekEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b233543", new Object[]{this, new Boolean(z)});
            return;
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar != null) {
            dXVideoProgressSeekBar.setEnabled(z);
        }
    }

    public void setTouchMaxY(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba3094b", new Object[]{this, new Long(j)});
            return;
        }
        DXVideoProgressSeekBar dXVideoProgressSeekBar = this.tsVideoProgressSeekBar;
        if (dXVideoProgressSeekBar != null) {
            dXVideoProgressSeekBar.setTouchMaxY(j);
        }
    }

    public void setVideoSeekToCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b57a6b", new Object[]{this, bVar});
        } else {
            this.mVideoSeekToCallback = bVar;
        }
    }

    public DXVideoProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXVideoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new a(Looper.getMainLooper());
        View.inflate(context, R.layout.dx_video_view_progress, this);
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.timeLayout = (LinearLayout) findViewById(R.id.video_time_layout);
        this.currentTimeTv = (TextView) findViewById(R.id.video_cTime);
        this.totalTimeTv = (TextView) findViewById(R.id.video_tTime);
        DXVideoProgressSeekBar dXVideoProgressSeekBar = (DXVideoProgressSeekBar) findViewById(R.id.video_progress_seekBar);
        this.tsVideoProgressSeekBar = dXVideoProgressSeekBar;
        if (dXVideoProgressSeekBar != null) {
            dXVideoProgressSeekBar.setEnabled(false);
            dXVideoProgressSeekBar.setOnSeekBarChangeListener(this);
        }
    }
}
