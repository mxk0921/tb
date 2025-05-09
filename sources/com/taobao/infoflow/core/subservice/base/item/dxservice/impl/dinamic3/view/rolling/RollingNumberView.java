package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.fve;
import tb.i4f;
import tb.mfo;
import tb.mve;
import tb.ofo;
import tb.t2o;
import tb.tlp;
import tb.wkd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RollingNumberView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CREATE_NUMBER_COUNT = 20;
    private static final int NEED_CREATE_RANDOM_NUMBER_COUNT = 18;
    private static final int ROLL_NUMBER_INTERVAL = mve.c("rollNumberInterval", 100);
    private static final String TAG = "RollingNumberView";
    private Integer mDoAnimationCount;
    private final Handler mHandler;
    private final List<i4f> mInitPositionList;
    private boolean mIsBold;
    private boolean mIsDoingAnimation;
    private long mLastDoAnimationEndTime;
    private int mRollDuration;
    private int mRollInterval;
    private int mRollNumberViewHeight;
    private int mRollRepetitionCount;
    private int mTextColor;
    private String mTextFont;
    private int mTextSize;
    private int mTextSpace;
    private final List<CustomTextView> mTextViewList;
    private final List<TranslateAnimation> mTranslateAnimationList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10639a;
        public final /* synthetic */ CustomTextView b;
        public final /* synthetic */ String c;

        public a(int i, CustomTextView customTextView, String str) {
            this.f10639a = i;
            this.b = customTextView;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (RollingNumberView.access$000(RollingNumberView.this)) {
                fve.e(RollingNumberView.TAG, "开始动画,当前位置： " + this.f10639a);
                RollingNumberView.access$100(RollingNumberView.this, this.b, this.f10639a, this.c);
            }
        }
    }

    public RollingNumberView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$000(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9afc619", new Object[]{rollingNumberView})).booleanValue();
        }
        return rollingNumberView.mIsDoingAnimation;
    }

    public static /* synthetic */ boolean access$002(RollingNumberView rollingNumberView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ad9221", new Object[]{rollingNumberView, new Boolean(z)})).booleanValue();
        }
        rollingNumberView.mIsDoingAnimation = z;
        return z;
    }

    public static /* synthetic */ void access$100(RollingNumberView rollingNumberView, CustomTextView customTextView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e853c7", new Object[]{rollingNumberView, customTextView, new Integer(i), str});
        } else {
            rollingNumberView.triggerNumberAnimation(customTextView, i, str);
        }
    }

    public static /* synthetic */ Handler access$300(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fe90622e", new Object[]{rollingNumberView});
        }
        return rollingNumberView.mHandler;
    }

    public static /* synthetic */ List access$400(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a66dcd0e", new Object[]{rollingNumberView});
        }
        return rollingNumberView.mTextViewList;
    }

    public static /* synthetic */ int access$500(RollingNumberView rollingNumberView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e48a61d7", new Object[]{rollingNumberView, str})).intValue();
        }
        return rollingNumberView.getAnimationCount(str);
    }

    public static /* synthetic */ long access$600(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ff9250f", new Object[]{rollingNumberView})).longValue();
        }
        return rollingNumberView.mLastDoAnimationEndTime;
    }

    public static /* synthetic */ long access$602(RollingNumberView rollingNumberView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("598fd7bb", new Object[]{rollingNumberView, new Long(j)})).longValue();
        }
        rollingNumberView.mLastDoAnimationEndTime = j;
        return j;
    }

    public static /* synthetic */ Integer access$700(RollingNumberView rollingNumberView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("dce0cfc3", new Object[]{rollingNumberView});
        }
        return rollingNumberView.mDoAnimationCount;
    }

    private Animation.AnimationListener createAnimationListener(TranslateAnimation translateAnimation, int i, int i2, int i3, String str, CustomTextView customTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation.AnimationListener) ipChange.ipc$dispatch("bab34e60", new Object[]{this, translateAnimation, new Integer(i), new Integer(i2), new Integer(i3), str, customTextView});
        }
        return new b(i3, i, customTextView, translateAnimation, i2, str);
    }

    private CustomTextView createTextView(String str, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomTextView) ipChange.ipc$dispatch("51a18c66", new Object[]{this, str, layoutParams});
        }
        CustomTextView customTextView = new CustomTextView(getContext());
        customTextView.setTextSize(0, this.mTextSize);
        customTextView.setTextColor(this.mTextColor);
        customTextView.setText(str);
        customTextView.setGravity(1);
        mfo.f(customTextView, this.mIsBold, this.mTextFont);
        int i = this.mTextSpace;
        if (i != 0) {
            customTextView.setLetterSpacing(i);
        }
        layoutParams.gravity = 80;
        customTextView.setLayoutParams(layoutParams);
        return customTextView;
    }

    private String getText(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = i; i2 <= 9; i2++) {
            sb.append(i2);
            sb.append("\n");
        }
        int i3 = 18 - (9 - i);
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(i4 % 10);
            sb.append("\n");
        }
        sb.append(i);
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(RollingNumberView rollingNumberView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/rolling/RollingNumberView");
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        stopAnimation();
        removeAllViews();
        this.mTextViewList.clear();
        this.mInitPositionList.clear();
    }

    private void triggerNumberAnimation(CustomTextView customTextView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8b649b", new Object[]{this, customTextView, new Integer(i), str});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -customTextView.getHeightBeforeLastLine());
        translateAnimation.setDuration(this.mRollDuration);
        Animation.AnimationListener createAnimationListener = createAnimationListener(translateAnimation, this.mRollRepetitionCount, this.mRollInterval, i, str, customTextView);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setAnimationListener(createAnimationListener);
        customTextView.startAnimation(translateAnimation);
        this.mTranslateAnimationList.add(translateAnimation);
    }

    public void setRollingViewStyleAttributes(wkd wkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713db9d5", new Object[]{this, wkdVar});
            return;
        }
        reset();
        ofo ofoVar = (ofo) wkdVar;
        this.mRollDuration = ofoVar.a();
        this.mRollInterval = ofoVar.b();
        this.mRollRepetitionCount = ofoVar.d();
        this.mRollNumberViewHeight = ofoVar.c();
        this.mTextSize = ofoVar.h();
        this.mTextColor = ofoVar.f();
        this.mTextSpace = ofoVar.i();
        this.mIsBold = ofoVar.j();
        this.mTextFont = ofoVar.g();
        String e = ofoVar.e();
        int a2 = mfo.a(e);
        int a3 = mfo.a(String.valueOf((int) Float.parseFloat(e)));
        createIntegerPartNumber(e, a3);
        if (a2 != a3) {
            createDecimalPartNumber(e, a3, a2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f10640a = 0;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ CustomTextView d;
        public final /* synthetic */ TranslateAnimation e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (RollingNumberView.access$000(RollingNumberView.this)) {
                    b bVar = b.this;
                    bVar.d.startAnimation(bVar.e);
                    fve.e(RollingNumberView.TAG, "执行下一轮动画，当前是第" + b.b(b.this) + "次");
                }
            }
        }

        public b(int i, int i2, CustomTextView customTextView, TranslateAnimation translateAnimation, int i3, String str) {
            this.b = i;
            this.c = i2;
            this.d = customTextView;
            this.e = translateAnimation;
            this.f = i3;
            this.g = str;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9656bfc", new Object[]{bVar})).intValue();
            }
            return bVar.f10640a;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                return;
            }
            fve.e(RollingNumberView.TAG, "开始做动画了，当前的index是：" + this.b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            int i = this.f10640a + 1;
            this.f10640a = i;
            if (i < this.c) {
                RollingNumberView.access$300(RollingNumberView.this).postDelayed(new a(), this.f);
            }
            if (this.f10640a == this.c && this.b == RollingNumberView.access$400(RollingNumberView.this).size() - 1) {
                String str = this.g;
                tlp.c(str, String.valueOf(System.currentTimeMillis()) + '_' + RollingNumberView.access$500(RollingNumberView.this, this.g));
                RollingNumberView.access$002(RollingNumberView.this, false);
                RollingNumberView.access$602(RollingNumberView.this, System.currentTimeMillis());
                fve.e(RollingNumberView.TAG, "记录动画次数，当前动画次数是： " + RollingNumberView.access$700(RollingNumberView.this) + "当前做完动画的时间是： " + RollingNumberView.access$600(RollingNumberView.this));
            }
        }
    }

    public RollingNumberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void createDecimalPartNumber(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79969562", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        addView(createTextView(".", layoutParams));
        while (true) {
            i++;
            if (i <= i2) {
                int numericValue = Character.getNumericValue(str.charAt(i));
                fve.e(TAG, "创建小数部分，当前是第" + i + "个数，当前的数字是：" + numericValue);
                CustomTextView createTextView = createTextView(getText(numericValue), new FrameLayout.LayoutParams(-2, this.mRollNumberViewHeight * 20));
                addView(createTextView);
                this.mTextViewList.add(createTextView);
            } else {
                return;
            }
        }
    }

    public RollingNumberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTranslateAnimationList = new ArrayList();
        this.mTextViewList = new ArrayList();
        this.mInitPositionList = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
        setOrientation(0);
    }

    private void createIntegerPartNumber(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e5974", new Object[]{this, str, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            int numericValue = Character.getNumericValue(str.charAt(i2));
            fve.e(TAG, "创建整数部分，当前是第" + i2 + "个数，当前的数字是：" + numericValue);
            CustomTextView createTextView = createTextView(getText(numericValue), new FrameLayout.LayoutParams(-2, this.mRollNumberViewHeight * 20));
            addView(createTextView);
            this.mTextViewList.add(createTextView);
        }
    }

    private int getAnimationCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ca990a5", new Object[]{this, str})).intValue();
        }
        if (this.mDoAnimationCount == null) {
            this.mDoAnimationCount = Integer.valueOf(getAnimationCountFromSp(str));
        } else if (mfo.e(this.mLastDoAnimationEndTime)) {
            this.mDoAnimationCount = 0;
            fve.e(TAG, "过了0点了，重置疲劳度");
        }
        int intValue = this.mDoAnimationCount.intValue() + 1;
        this.mDoAnimationCount = Integer.valueOf(intValue);
        return intValue;
    }

    private int getAnimationCountFromSp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f300606c", new Object[]{this, str})).intValue();
        }
        String b2 = tlp.b(str, "");
        if (TextUtils.isEmpty(b2)) {
            fve.e(TAG, "value == null");
            return 0;
        }
        String[] split = b2.split("_");
        if (split.length <= 1) {
            fve.e(TAG, "数组长度不符合规范");
            return 0;
        }
        String str2 = split[1];
        String str3 = split[0];
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            fve.e(TAG, "数值异常，number： " + str2);
            return 0;
        } else if (!mfo.e(Long.parseLong(str3))) {
            return Integer.parseInt(str2);
        } else {
            fve.e(TAG, "距离上一次超过24小时了");
            return 0;
        }
    }

    public void startAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927f4253", new Object[]{this, str});
        } else if (this.mIsDoingAnimation) {
            fve.e(TAG, "正在做动画");
        } else if (getMeasuredHeight() <= 0) {
            fve.e(TAG, "视图未渲染出来");
        } else {
            stopAnimation();
            fve.e(TAG, "开始动画");
            this.mIsDoingAnimation = true;
            for (int i = 0; i < this.mTextViewList.size(); i++) {
                CustomTextView customTextView = this.mTextViewList.get(i);
                i4f i4fVar = new i4f(customTextView.getLeft(), customTextView.getTop());
                this.mInitPositionList.add(i4fVar);
                fve.e(TAG, "记录当前数字的起始位置,当前是第： " + i + "个，当前的x轴坐标是：" + i4fVar.a());
                this.mHandler.postDelayed(new a(i, customTextView, str), ((long) i) * ((long) ROLL_NUMBER_INTERVAL));
            }
        }
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        this.mIsDoingAnimation = false;
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.mTranslateAnimationList.isEmpty()) {
            fve.e(TAG, "当前没有在执行的动画");
            return;
        }
        for (int i = 0; i < this.mTranslateAnimationList.size(); i++) {
            this.mTranslateAnimationList.get(i).cancel();
            fve.e(TAG, "取消动画，当前是第：" + i + "个数字");
            if (i < this.mTextViewList.size() && i < this.mInitPositionList.size()) {
                CustomTextView customTextView = this.mTextViewList.get(i);
                i4f i4fVar = this.mInitPositionList.get(i);
                int a2 = i4fVar.a();
                int b2 = i4fVar.b();
                fve.e(TAG, "当前是第：" + i + "个数字,initialX:" + a2 + " ,initialY: " + b2 + "right: " + customTextView.getWidth() + " ,bottom: " + b2 + customTextView.getHeight());
                customTextView.layout(a2, b2, customTextView.getWidth() + a2, customTextView.getHeight() + b2);
            }
        }
        this.mInitPositionList.clear();
        this.mTranslateAnimationList.clear();
        fve.e(TAG, "停止动画");
    }

    static {
        t2o.a(486539430);
    }
}
