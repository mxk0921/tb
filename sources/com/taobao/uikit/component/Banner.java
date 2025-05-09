package com.taobao.uikit.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.component.LoopViewPager;
import com.taobao.uikit.utils.HandlerTimer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Banner extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CYCLE_INTERVAL_MILLS = 3000;
    public IndicatorView mIndicator;
    private float mRatio;
    private HandlerTimer mTimer;
    public LoopViewPager mViewPager;
    private int mScrollInterval = 3000;
    private boolean mAutoScroll = false;

    static {
        t2o.a(931135493);
    }

    public Banner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i);
    }

    private void doTimerEvent(MotionEvent motionEvent) {
        HandlerTimer handlerTimer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d625591c", new Object[]{this, motionEvent});
        } else if (motionEvent.getAction() == 0) {
            HandlerTimer handlerTimer2 = this.mTimer;
            if (handlerTimer2 != null) {
                handlerTimer2.stop();
            }
        } else if ((motionEvent.getAction() == 3 || motionEvent.getAction() == 4 || motionEvent.getAction() == 1) && (handlerTimer = this.mTimer) != null) {
            handlerTimer.start();
        }
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        initAttr(context, attributeSet, i);
        View.inflate(context, R.layout.uik_banner, this);
        initView();
    }

    private void initAttr(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d31a655", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Banner, i, 0);
        if (obtainStyledAttributes != null) {
            this.mScrollInterval = obtainStyledAttributes.getInt(R.styleable.Banner_uik_autoScrollInterval, 3000);
            this.mAutoScroll = obtainStyledAttributes.getBoolean(R.styleable.Banner_uik_autoScroll, false);
            this.mRatio = obtainStyledAttributes.getFloat(R.styleable.Banner_uik_ratio, 0.3125f);
            obtainStyledAttributes.recycle();
        }
    }

    private void initTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3ce1c", new Object[]{this});
            return;
        }
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null) {
            handlerTimer.stop();
            this.mTimer = null;
        }
        if (this.mAutoScroll) {
            HandlerTimer handlerTimer2 = new HandlerTimer(this.mScrollInterval, new Runnable() { // from class: com.taobao.uikit.component.Banner.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int count;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LoopViewPager loopViewPager = Banner.this.mViewPager;
                    if (loopViewPager != null && loopViewPager.getAdapter() != null && (count = Banner.this.mViewPager.getAdapter().getCount()) != 0) {
                        Banner.this.mViewPager.setCurrentItem((Banner.this.mViewPager.getCurrentItem() + 1) % count, true);
                    }
                }
            });
            this.mTimer = handlerTimer2;
            handlerTimer2.start();
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        LoopViewPager loopViewPager = (LoopViewPager) findViewById(R.id.viewpager);
        this.mViewPager = loopViewPager;
        loopViewPager.setRatio(this.mRatio);
        this.mIndicator = (IndicatorView) findViewById(R.id.indicator);
        this.mViewPager.setOnPageChangeListener(new LoopViewPager.OnPageChangeListener() { // from class: com.taobao.uikit.component.Banner.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else {
                    Banner.this.mIndicator.setIndex(i);
                }
            }
        });
    }

    public static /* synthetic */ Object ipc$super(Banner banner, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/component/Banner");
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null) {
            handlerTimer.stop();
            this.mTimer = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        doTimerEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        initTimer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        HandlerTimer handlerTimer = this.mTimer;
        if (handlerTimer != null) {
            handlerTimer.stop();
            this.mTimer = null;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.mTimer == null) {
            return;
        }
        if (isShown()) {
            this.mTimer.start();
        } else {
            this.mTimer.stop();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            HandlerTimer handlerTimer = this.mTimer;
            if (handlerTimer != null) {
                handlerTimer.stop();
            }
        } else if (this.mTimer != null && isShown()) {
            this.mTimer.start();
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d478923", new Object[]{this, pagerAdapter});
            return;
        }
        this.mViewPager.setAdapter(pagerAdapter);
        this.mIndicator.setTotal(pagerAdapter.getCount());
        this.mIndicator.setIndex(0);
    }

    public void setAutoScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cf328f", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mAutoScroll = z;
        initTimer();
    }

    public void setLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54ca8b0", new Object[]{this, new Integer(i)});
        } else {
            setLayout(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
        }
    }

    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
            return;
        }
        this.mRatio = f;
        this.mViewPager.setRatio(f);
    }

    public void setScrollInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d322e828", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollInterval = i;
        initTimer();
    }

    public void setLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66bbd3f", new Object[]{this, view});
        } else if (view.findViewById(R.id.viewpager) == null || view.findViewById(R.id.indicator) == null) {
            throw new RuntimeException("banner need two views which's are viewpager and indicator");
        } else {
            removeAllViews();
            addView(view);
            initView();
        }
    }

    public Banner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    public Banner(Context context) {
        super(context);
        init(context, null, 0);
    }
}
