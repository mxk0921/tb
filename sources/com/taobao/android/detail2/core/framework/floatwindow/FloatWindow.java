package com.taobao.android.detail2.core.framework.floatwindow;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.ec7;
import tb.oj7;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FloatWindow extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 200;
    public static final String TAG = "FloatWindow";
    private FrameLayout mContentView;
    private Context mContext;
    private int mEdgeMargin;
    private ImageView mIvPlayPause;
    private View.OnTouchListener mOnMaskViewTouchListener = new a();
    private ProgressBar mProgressBar;
    private float mRawX;
    private float mRawY;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mStatusBarHeight;
    private int mTouchSlop;
    private TextView mTvClose;
    private ValueAnimator mValueAnimator;
    private WindowManager mWindowManager;
    private float mX;
    private float mY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return FloatWindow.access$000(FloatWindow.this, motionEvent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7130a;

        public b(int i) {
            this.f7130a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                FloatWindow.access$100(FloatWindow.this, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f7130a);
            }
        }
    }

    static {
        t2o.a(352321830);
    }

    public FloatWindow(Context context) {
        super(context);
        this.mContext = context;
        initData();
        initView();
    }

    public static /* synthetic */ boolean access$000(FloatWindow floatWindow, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("753671fa", new Object[]{floatWindow, motionEvent})).booleanValue();
        }
        return floatWindow.handleTouchEvent(motionEvent);
    }

    public static /* synthetic */ void access$100(FloatWindow floatWindow, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dad8a0", new Object[]{floatWindow, new Integer(i), new Integer(i2)});
        } else {
            floatWindow.updateViewPosition(i, i2);
        }
    }

    private boolean handleTouchEvent(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07fef83", new Object[]{this, motionEvent})).booleanValue();
        }
        int abs = (int) Math.abs(motionEvent.getRawX() - this.mRawX);
        int abs2 = (int) Math.abs(motionEvent.getRawY() - this.mRawY);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
            this.mRawX = motionEvent.getRawX();
            this.mRawY = motionEvent.getRawY();
        } else if (action == 1) {
            int i2 = this.mTouchSlop;
            if (abs >= i2 || abs2 >= i2) {
                pullToBoundary();
            } else {
                performClick();
            }
            this.mRawY = 0.0f;
            this.mRawX = 0.0f;
            this.mY = 0.0f;
            this.mX = 0.0f;
        } else if (action == 2 && (abs >= (i = this.mTouchSlop) || abs2 >= i)) {
            updateViewPosition((int) (motionEvent.getRawX() - this.mX), (int) ((motionEvent.getRawY() - this.mStatusBarHeight) - this.mY));
        }
        return true;
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.mStatusBarHeight = oj7.f(this.mContext);
        this.mEdgeMargin = ec7.a(this.mContext, 10.0f);
        this.mTouchSlop = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        this.mScreenWidth = Math.min(ec7.b(this.mContext), ec7.c(this.mContext));
        this.mScreenHeight = Math.max(ec7.b(this.mContext), ec7.c(this.mContext));
        this.mWindowManager = (WindowManager) this.mContext.getSystemService(pg1.ATOM_EXT_window);
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LayoutInflater.from(this.mContext).inflate(R.layout.detail_video_float_window, this);
        this.mContentView = (FrameLayout) findViewById(R.id.card_float_window);
        this.mIvPlayPause = (ImageView) findViewById(R.id.iv_float_pause);
        this.mTvClose = (TextView) findViewById(R.id.tv_float_close);
        this.mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        ViewProxy.setOnTouchListener(findViewById(R.id.view_mask), this.mOnMaskViewTouchListener);
    }

    public static /* synthetic */ Object ipc$super(FloatWindow floatWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/floatwindow/FloatWindow");
    }

    private void pullToBoundary() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58d6771", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        int i2 = layoutParams.y;
        int width = layoutParams.x + (getWidth() / 2);
        int i3 = this.mScreenWidth;
        if (width >= i3 / 2) {
            i = i3;
        }
        ValueAnimator duration = ValueAnimator.ofInt(layoutParams.x, i).setDuration(200L);
        this.mValueAnimator = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mValueAnimator.addUpdateListener(new b(i2));
        this.mValueAnimator.start();
    }

    private void updateViewPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ec3e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) getLayoutParams();
        layoutParams.x = Math.min(Math.max(i, this.mEdgeMargin), (this.mScreenWidth - getWidth()) - this.mEdgeMargin);
        layoutParams.y = Math.min(Math.max(i2, this.mEdgeMargin), ((this.mScreenHeight - this.mStatusBarHeight) - getHeight()) - this.mEdgeMargin);
        try {
            this.mWindowManager.updateViewLayout(this, layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addVideoView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a9f3ec", new Object[]{this, view});
        } else {
            this.mContentView.addView(view, 0, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mContext = null;
    }

    public void onPauseStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a60e230", new Object[]{this});
        } else {
            this.mIvPlayPause.setImageResource(R.drawable.tbvideo_ict_fullscreen_play);
        }
    }

    public void onPlayStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ca98c", new Object[]{this});
        } else {
            this.mIvPlayPause.setImageResource(R.drawable.tbvideo_ict_fullscreen_pause);
        }
    }

    public void setCloseOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4887274b", new Object[]{this, onClickListener});
            return;
        }
        TextView textView = this.mTvClose;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setPlayPauseOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc45c1f5", new Object[]{this, onClickListener});
            return;
        }
        ImageView imageView = this.mIvPlayPause;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setProgress(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216c096", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mProgressBar.setMax(i2);
        this.mProgressBar.setProgress(i);
    }
}
