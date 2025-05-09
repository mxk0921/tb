package com.taobao.android.fluid.framework.media.miniwindow;

import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ip9;
import tb.pg1;
import tb.pr9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FloatWindow extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout mContentView;
    private final Context mContext;
    private int mEdgeMargin;
    private ImageView mIvPlayPause;
    private ProgressBar mPbProgressBar;
    private float mRawX;
    private float mRawY;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mStatusBarHeight;
    private int mTouchSlop;
    private TextView mTvClose;
    private boolean mUserHasMoved;
    private WindowManager mWindowManager;
    private float mX;
    private float mY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7866a;

        public a(int i) {
            this.f7866a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                FloatWindow.access$000(FloatWindow.this, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f7866a);
            }
        }
    }

    static {
        t2o.a(468714543);
    }

    public FloatWindow(Context context) {
        super(context);
        if (context instanceof Application) {
            this.mContext = context;
            initData();
            initView();
            return;
        }
        throw new RuntimeException("FloatWindow context must be application context");
    }

    public static /* synthetic */ void access$000(FloatWindow floatWindow, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7a2292", new Object[]{floatWindow, new Integer(i), new Integer(i2)});
        } else {
            floatWindow.updateViewPosition(i, i2);
        }
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.mStatusBarHeight = pr9.h(this.mContext);
        this.mEdgeMargin = ip9.FLOAT_WINDOW_PADDING;
        this.mTouchSlop = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        this.mScreenWidth = Math.min(pr9.e(), pr9.f());
        this.mScreenHeight = Math.max(pr9.e(), pr9.f());
        this.mWindowManager = (WindowManager) this.mContext.getSystemService(pg1.ATOM_EXT_window);
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LayoutInflater.from(this.mContext).inflate(R.layout.fluid_sdk_ict_layout_float_window, this);
        this.mPbProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.mContentView = (FrameLayout) findViewById(R.id.container);
        this.mIvPlayPause = (ImageView) findViewById(R.id.play_btn);
        this.mTvClose = (TextView) findViewById(R.id.close);
    }

    public static /* synthetic */ Object ipc$super(FloatWindow floatWindow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/media/miniwindow/FloatWindow");
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
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(new a(i2));
        duration.start();
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
            this.mUserHasMoved = true;
            this.mWindowManager.updateViewLayout(this, layoutParams);
        } catch (Throwable unused) {
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        setKeepScreenOn(false);
        this.mUserHasMoved = false;
    }

    public FrameLayout getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2fdef16a", new Object[]{this});
        }
        return this.mContentView;
    }

    public TextView getTvClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("b7fd545b", new Object[]{this});
        }
        return this.mTvClose;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
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

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        Drawable drawable = this.mIvPlayPause.getDrawable();
        if (drawable != null) {
            drawable.setLevel(2);
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        Drawable drawable = this.mIvPlayPause.getDrawable();
        if (drawable != null) {
            drawable.setLevel(1);
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
        this.mPbProgressBar.setMax(i2);
        this.mPbProgressBar.setProgress(i);
    }

    public boolean userHasMoved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0f7f3af", new Object[]{this})).booleanValue();
        }
        return this.mUserHasMoved;
    }
}
