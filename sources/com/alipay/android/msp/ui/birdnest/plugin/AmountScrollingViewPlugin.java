package com.alipay.android.msp.ui.birdnest.plugin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmountScrollingViewPlugin extends AbsFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AmountScrollingView q;
    public Context r;
    public float s;
    public float t;
    public float u;
    public final MspContext v;
    public final int w;

    public AmountScrollingViewPlugin(int i) {
        this.w = i;
        this.v = MspContextManager.getInstance().getMspContextByBizId(i);
    }

    public static /* synthetic */ int access$200(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e2c5ba3", new Object[]{amountScrollingViewPlugin})).intValue();
        }
        return amountScrollingViewPlugin.w;
    }

    public static /* synthetic */ float access$300(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a04388ff", new Object[]{amountScrollingViewPlugin})).floatValue();
        }
        return amountScrollingViewPlugin.t;
    }

    public static /* synthetic */ float access$400(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e25ab65e", new Object[]{amountScrollingViewPlugin})).floatValue();
        }
        return amountScrollingViewPlugin.u;
    }

    public static /* synthetic */ float access$500(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2471e3bd", new Object[]{amountScrollingViewPlugin})).floatValue();
        }
        return amountScrollingViewPlugin.s;
    }

    public static /* synthetic */ Context access$600(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("68ffac24", new Object[]{amountScrollingViewPlugin});
        }
        return amountScrollingViewPlugin.r;
    }

    public static /* synthetic */ MspContext access$700(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("78c98621", new Object[]{amountScrollingViewPlugin});
        }
        return amountScrollingViewPlugin.v;
    }

    public static /* synthetic */ Object ipc$super(AmountScrollingViewPlugin amountScrollingViewPlugin, String str, Object... objArr) {
        if (str.hashCode() == -740778895) {
            return new Boolean(super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/birdnest/plugin/AmountScrollingViewPlugin");
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.q = new AmountScrollingView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.addView(this.q, layoutParams);
        this.r = context;
        return relativeLayout;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("674cf733", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (AmountScrollingView.access$000(this.q) != null) {
            Iterator it = AmountScrollingView.access$000(this.q).iterator();
            while (it.hasNext()) {
                sb.append(((Integer) it.next()).intValue());
            }
        }
        if (AmountScrollingView.access$100(this.q) != null && AmountScrollingView.access$100(this.q).size() > 0) {
            sb.append(".");
            Iterator it2 = AmountScrollingView.access$100(this.q).iterator();
            while (it2.hasNext()) {
                sb.append(((Integer) it2.next()).intValue());
            }
        }
        return sb.toString();
    }

    public final void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57154cf3", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\.");
            if (split.length > 1) {
                this.q.setInitialValue(Long.parseLong(split[0]), split[0].length(), Integer.parseInt(split[1]), split[1].length(), str2);
            } else if (split.length == 0) {
                this.q.setInitialValue(Long.parseLong(split[0]), split[0].length(), 0, 0, str2);
            } else {
                throw new IllegalArgumentException("Wrong amount format");
            }
        } else {
            throw new IllegalArgumentException("Amount is empty");
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.PluginViewDelegate
    public String handleInvoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78f6c325", new Object[]{this, str, str2});
        }
        if (!"getCurrentAmount".equals(str)) {
            return "{}";
        }
        String d = d();
        return "{\"shownAmount\":\"" + d + "\"}";
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d89c71", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        return super.setRect(f, f2, f3, f4);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AmountScrollingView extends View implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mF;
        private final Paint mPaint;
        private int ms;
        private int mt;
        private float mu;
        private float mv;
        private long mw;
        private int mx;
        private int my;
        private String mz;
        private ArrayList<Integer> mA = new ArrayList<>();
        private ArrayList<Integer> mB = new ArrayList<>();
        private ArrayList<Integer> mC = new ArrayList<>();
        private ArrayList<Integer> mD = new ArrayList<>();
        private final Point mE = new Point();
        private final Point mG = new Point();
        private final Rect mH = new Rect();
        private ArrayList<AmountScrollingAnimator> mI = new ArrayList<>();
        private ArrayList<AmountScrollingAnimator> mJ = new ArrayList<>();
        private AnimatorSet mK = new AnimatorSet();
        private ArrayList<Animator> mL = new ArrayList<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class AmountScrollingAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private int f3728a;
            private int b;
            private final ValueAnimator c;
            private int d;
            private int e;
            private int f;
            private int g;
            private int h;
            private int i;
            private int j;
            private int k;
            private boolean l;

            public AmountScrollingAnimator(int i, boolean z) {
                this.f3728a = i;
                this.b = (int) Math.pow(10.0d, i);
                ValueAnimator valueAnimator = new ValueAnimator();
                this.c = valueAnimator;
                valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimator.addUpdateListener(this);
                valueAnimator.addListener(this);
                this.l = z;
            }

            private void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("be5093ae", new Object[]{this, new Integer(i)});
                    return;
                }
                AmountScrollingView.this.onNumberChanged(this, i);
                this.e = i;
                this.d = (i + 9) % 10;
                this.f = (i + 1) % 10;
            }

            private boolean b(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c0056c51", new Object[]{this, new Integer(i)})).booleanValue();
                }
                int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                if (i == this.d) {
                    if (this.i - access$900 > 0) {
                        return true;
                    }
                    return false;
                } else if (i == this.e) {
                    int i2 = this.i;
                    if (i2 > 0 || i2 - AmountScrollingView.access$800(AmountScrollingView.this).y < AmountScrollingView.access$1000(AmountScrollingView.this).height()) {
                        return true;
                    }
                    return false;
                } else if (i != this.f || (this.i + access$900) - AmountScrollingView.access$800(AmountScrollingView.this).y >= AmountScrollingView.access$1000(AmountScrollingView.this).height()) {
                    return false;
                } else {
                    return true;
                }
            }

            private void c(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c1ba44ec", new Object[]{this, new Integer(i)});
                } else if (!this.l) {
                    AmountScrollingView.access$000(AmountScrollingView.this).set((AmountScrollingView.access$1100(AmountScrollingView.this) - this.f3728a) - 1, Integer.valueOf(i));
                } else {
                    AmountScrollingView.access$100(AmountScrollingView.this).set((AmountScrollingView.access$1200(AmountScrollingView.this) - this.f3728a) - 1, Integer.valueOf(i));
                }
            }

            public void drawOnCanvas(Canvas canvas, Paint paint) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("719a5638", new Object[]{this, canvas, paint});
                    return;
                }
                int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                if (b(this.d)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.d);
                    canvas.drawText(sb.toString(), this.g, this.i - access$900, paint);
                    c(this.d);
                }
                if (b(this.e)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.e);
                    canvas.drawText(sb2.toString(), this.g, this.i, paint);
                    c(this.e);
                }
                if (b(this.f)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f);
                    canvas.drawText(sb3.toString(), this.g, this.i + access$900, paint);
                    c(this.f);
                }
            }

            public int getDigit() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("87cb1071", new Object[]{this})).intValue();
                }
                return this.f3728a;
            }

            public int getNumber() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("d6ce4b39", new Object[]{this})).intValue();
                }
                return this.e;
            }

            public ValueAnimator getValueAnimator() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ValueAnimator) ipChange.ipc$dispatch("6d97b4ad", new Object[]{this});
                }
                return this.c;
            }

            public boolean isDecimal() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("59ab23d2", new Object[]{this})).booleanValue();
                }
                return this.l;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                this.i = this.h;
                this.j = 0;
                this.k = 0;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = intValue - this.k;
                if (i != 0) {
                    int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                    this.i += i;
                    int i2 = this.j + i;
                    this.j = i2;
                    int i3 = i2 / access$900;
                    if (i3 != 0) {
                        int i4 = (this.e - i3) % 10;
                        if (i4 < 0) {
                            i4 += 10;
                        }
                        a(i4);
                        this.i -= i3 * access$900;
                        this.j %= access$900;
                    }
                }
                this.k = intValue;
            }

            public void removeNumberChangeListener() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6d5b6d8", new Object[]{this});
                    return;
                }
                this.c.removeListener(this);
                this.c.removeAllUpdateListeners();
            }

            public void setAnimatorValues(int i, int... iArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("faf0191f", new Object[]{this, new Integer(i), iArr});
                    return;
                }
                int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                for (int i2 = 1; i2 < length; i2++) {
                    iArr2[i2] = (i - iArr[i2 - 1]) * access$900;
                }
                this.c.setIntValues(iArr2);
            }

            public void setLocation(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6707581e", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                this.g = i;
                int i3 = i2 - this.h;
                this.h = i2;
                this.i += i3;
            }

            public void setNumberWithValue(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c1399cdd", new Object[]{this, new Long(j)});
                } else {
                    a((int) ((j / this.b) % 10));
                }
            }
        }

        public AmountScrollingView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.mPaint = paint;
            Typeface typeface = PhoneCashierMspEngine.getMspWallet().getTypeface(context, "AlipayNumber", AmountScrollingViewPlugin.access$200(AmountScrollingViewPlugin.this));
            if (typeface != null) {
                paint.setTypeface(typeface);
            }
            paint.setColor(-13421773);
            this.mu = 1.5f;
            this.mv = 1.2f;
        }

        private void a(AmountScrollingAnimator amountScrollingAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("424edaa3", new Object[]{this, amountScrollingAnimator});
                return;
            }
            if (!amountScrollingAnimator.isDecimal()) {
                this.mI.add(0, amountScrollingAnimator);
            } else {
                this.mJ.add(0, amountScrollingAnimator);
            }
            ValueAnimator valueAnimator = amountScrollingAnimator.getValueAnimator();
            valueAnimator.addUpdateListener(this);
            this.mL.add(valueAnimator);
            this.mK.playTogether(this.mL);
        }

        public static /* synthetic */ ArrayList access$000(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("197c770e", new Object[]{amountScrollingView});
            }
            return amountScrollingView.mB;
        }

        public static /* synthetic */ ArrayList access$100(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("8f92996d", new Object[]{amountScrollingView});
            }
            return amountScrollingView.mD;
        }

        public static /* synthetic */ Rect access$1000(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("f2e38a6e", new Object[]{amountScrollingView});
            }
            return amountScrollingView.mH;
        }

        public static /* synthetic */ int access$1100(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("55adeab7", new Object[]{amountScrollingView})).intValue();
            }
            return amountScrollingView.ms;
        }

        public static /* synthetic */ int access$1200(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("362fb296", new Object[]{amountScrollingView})).intValue();
            }
            return amountScrollingView.mt;
        }

        public static /* synthetic */ Point access$800(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Point) ipChange.ipc$dispatch("3b08d6cd", new Object[]{amountScrollingView});
            }
            return amountScrollingView.mE;
        }

        public static /* synthetic */ float access$900(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("643c3bfb", new Object[]{amountScrollingView})).floatValue();
            }
            return amountScrollingView.mu;
        }

        private void e(boolean z) {
            AmountScrollingAnimator amountScrollingAnimator;
            ArrayList<AmountScrollingAnimator> arrayList;
            ArrayList<AmountScrollingAnimator> arrayList2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            } else if (!z && this.mI.isEmpty()) {
            } else {
                if (!z || !this.mJ.isEmpty()) {
                    if (!z && (arrayList2 = this.mI) != null) {
                        amountScrollingAnimator = arrayList2.remove(0);
                    } else if (!z || (arrayList = this.mJ) == null) {
                        amountScrollingAnimator = null;
                    } else {
                        amountScrollingAnimator = arrayList.remove(0);
                    }
                    if (amountScrollingAnimator != null) {
                        ValueAnimator valueAnimator = amountScrollingAnimator.getValueAnimator();
                        valueAnimator.removeUpdateListener(this);
                        this.mL.remove(valueAnimator);
                        this.mK.playTogether(this.mL);
                        amountScrollingAnimator.removeNumberChangeListener();
                    }
                }
            }
        }

        private void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
                return;
            }
            int i = (int) (this.mF + (this.ms * this.mE.x * this.mv));
            if (this.mC.size() > 0) {
                int i2 = this.mt;
                int i3 = this.mE.x;
                float f = this.mv;
                i += (int) ((i2 * i3 * f) + (i3 * f * 0.5d));
            }
            int textSize = (int) this.mPaint.getTextSize();
            int i4 = (textSize - this.mE.y) / 2;
            setPadding(getPaddingLeft(), i4, getPaddingRight(), i4);
            int paddingLeft = getPaddingLeft() + i + getPaddingRight();
            if (z) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = paddingLeft;
                setLayoutParams(layoutParams);
            }
            setMeasuredDimension(paddingLeft, textSize);
        }

        public static /* synthetic */ Object ipc$super(AmountScrollingView amountScrollingView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode == -244855388) {
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            } else if (hashCode == 650865254) {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/ui/birdnest/plugin/AmountScrollingViewPlugin$AmountScrollingView");
            }
        }

        public void clearAllCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4208d55", new Object[]{this});
                return;
            }
            this.mA.clear();
            this.mC.clear();
            this.mB.clear();
            this.mD.clear();
            while (this.mI.size() > 0) {
                e(false);
            }
            while (this.mJ.size() > 0) {
                e(true);
            }
            this.mK = new AnimatorSet();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                invalidate();
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            canvas.save();
            int paddingTop = getPaddingTop();
            Point point = this.mE;
            int i = (int) (point.x * this.mv);
            int i2 = this.mF;
            int i3 = paddingTop + point.y;
            Iterator<AmountScrollingAnimator> it = this.mI.iterator();
            while (it.hasNext()) {
                it.next().setLocation(i2, i3);
                i2 += i;
            }
            this.mG.set(i2, i3);
            int i4 = (int) (i2 + (i * 0.5d));
            Iterator<AmountScrollingAnimator> it2 = this.mJ.iterator();
            while (it2.hasNext()) {
                it2.next().setLocation(i4, i3);
                i4 += i;
            }
            float textSize = this.mPaint.getTextSize();
            if (this.my > 0) {
                this.mPaint.setTextSize(AmountScrollingViewPlugin.access$300(AmountScrollingViewPlugin.this));
                canvas.drawText(this.mz, 0.0f, this.mG.y - AmountScrollingViewPlugin.access$400(AmountScrollingViewPlugin.this), this.mPaint);
            }
            this.mPaint.setTextSize(textSize);
            Paint paint = this.mPaint;
            Iterator<AmountScrollingAnimator> it3 = this.mI.iterator();
            while (it3.hasNext()) {
                it3.next().drawOnCanvas(canvas, paint);
            }
            Iterator<AmountScrollingAnimator> it4 = this.mJ.iterator();
            while (it4.hasNext()) {
                it4.next().drawOnCanvas(canvas, paint);
            }
            if (this.mC.size() > 0) {
                this.mPaint.setTextSize(AmountScrollingViewPlugin.access$500(AmountScrollingViewPlugin.this));
                Point point2 = this.mG;
                canvas.drawText(".", point2.x, point2.y, this.mPaint);
                this.mPaint.setTextSize(textSize);
            }
            canvas.restore();
        }

        @Override // android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            f(true);
            this.mH.set(i, i2, getWidth(), getHeight());
        }

        public void onNumberChanged(AmountScrollingAnimator amountScrollingAnimator, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5c495ab", new Object[]{this, amountScrollingAnimator, new Integer(i)});
            } else if (!amountScrollingAnimator.isDecimal()) {
                this.mA.set((this.ms - amountScrollingAnimator.getDigit()) - 1, Integer.valueOf(i));
                this.mw = a(this.mA);
            } else {
                this.mC.set((this.mt - amountScrollingAnimator.getDigit()) - 1, Integer.valueOf(i));
                this.mx = a(this.mC);
            }
        }

        public void pauseNumberAnimator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4248fe6d", new Object[]{this});
            } else {
                this.mK.pause();
            }
        }

        public void setInitialValue(long j, int i, int i2, int i3, String str) {
            boolean z;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54dbc3ff", new Object[]{this, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), str});
                return;
            }
            setPaintTextSize(AmountScrollingViewPlugin.access$500(AmountScrollingViewPlugin.this));
            long j2 = this.mw;
            if ((j2 == 0 || j == j2) && (((i4 = this.mx) == 0 || i2 == i4) && (TextUtils.isEmpty(this.mz) || TextUtils.equals(str, this.mz)))) {
                z = false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(str)) {
                this.mz = str;
                this.my = str.length();
            }
            clearAllCache();
            this.ms = i;
            for (int i5 = 0; i5 < this.ms; i5++) {
                a(new AmountScrollingAnimator(i5, false));
            }
            this.mt = i3;
            for (int i6 = 0; i6 < this.mt; i6++) {
                a(new AmountScrollingAnimator(i6, true));
            }
            this.mw = j;
            a(j, this.mA, this.ms);
            a(this.mw, this.mB, this.ms);
            this.mx = i2;
            a(i2, this.mC, this.mt);
            a(this.mx, this.mD, this.mt);
            Iterator<AmountScrollingAnimator> it = this.mI.iterator();
            while (it.hasNext()) {
                it.next().setNumberWithValue(j);
            }
            Iterator<AmountScrollingAnimator> it2 = this.mJ.iterator();
            while (it2.hasNext()) {
                it2.next().setNumberWithValue(i2);
            }
            if (z) {
                f(true);
            }
        }

        public void setNumberAnimatorDuration(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4403d0d7", new Object[]{this, new Long(j)});
            } else {
                this.mK.setDuration(j);
            }
        }

        public void setNumberAnimatorValues(long j, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5435e4", new Object[]{this, new Long(j), new Integer(i), str});
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                this.mz = str;
                this.my = str.length();
                f(true);
            }
            for (int i2 = 0; i2 < this.mI.size(); i2++) {
                this.mI.get(i2).setAnimatorValues(this.mA.get(i2).intValue(), (int) ((j / Math.pow(10.0d, (this.mI.size() - i2) - 1)) % 10.0d));
            }
            for (int i3 = 0; i3 < this.mJ.size(); i3++) {
                this.mJ.get(i3).setAnimatorValues(this.mC.get(i3).intValue(), (int) ((i / Math.pow(10.0d, (this.mJ.size() - i3) - 1)) % 10.0d));
            }
            if (this.ms < String.valueOf(j).length()) {
                for (int i4 = this.ms; i4 < String.valueOf(j).length(); i4++) {
                    this.ms++;
                    this.mA.add(0, 0);
                    this.mB.add(0, 0);
                    AmountScrollingAnimator amountScrollingAnimator = new AmountScrollingAnimator(i4, false);
                    amountScrollingAnimator.setNumberWithValue(0L);
                    amountScrollingAnimator.setAnimatorValues(0, (int) ((j / Math.pow(10.0d, i4)) % 10.0d));
                    a(amountScrollingAnimator);
                }
                f(true);
            } else if (this.ms > String.valueOf(j).length()) {
                int i5 = this.ms;
                for (int i6 = 0; i6 < i5 - String.valueOf(j).length(); i6++) {
                    this.ms--;
                    e(false);
                    this.mA.remove(0);
                    this.mB.remove(0);
                }
                f(true);
            }
        }

        public void setPaintTextSize(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1aee4f", new Object[]{this, new Float(f)});
                return;
            }
            this.mPaint.setTextSize(f);
            Rect rect = new Rect();
            this.mPaint.getTextBounds("0", 0, 1, rect);
            this.mE.set(rect.width(), rect.height());
        }

        public void startNumberAnimator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("463159d9", new Object[]{this});
            } else {
                this.mK.start();
            }
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(i, i2);
            Rect rect = new Rect();
            if (this.my > 0) {
                this.mPaint.setTextSize(AmountScrollingViewPlugin.access$300(AmountScrollingViewPlugin.this));
                this.mPaint.getTextBounds(this.mz, 0, this.my, rect);
                this.mF = rect.width() + ((int) TypedValue.applyDimension(1, 4.0f, AmountScrollingViewPlugin.access$600(AmountScrollingViewPlugin.this).getResources().getDisplayMetrics()));
                this.mPaint.setTextSize(AmountScrollingViewPlugin.access$500(AmountScrollingViewPlugin.this));
            } else {
                AmountScrollingViewPlugin.access$700(AmountScrollingViewPlugin.this).getStatisticInfo().addError(ErrorType.DEFAULT, "AmountScrollingViewPlugin:updateCurrencySymbolWidth", "mCurrencySymbol is empty");
            }
            f(false);
        }

        private static void a(long j, ArrayList<Integer> arrayList, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6da078f5", new Object[]{new Long(j), arrayList, new Integer(i)});
                return;
            }
            for (int i2 = i - 1; i2 >= 0; i2--) {
                arrayList.add(0, Integer.valueOf((int) (j % 10)));
                j /= 10;
            }
        }

        private static int a(ArrayList<Integer> arrayList) {
            int i = 0;
            int i2 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfaf7e35", new Object[]{arrayList})).intValue();
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                i += arrayList.get(size).intValue() * i2;
                i2 *= 10;
            }
            return i;
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (!"src".equals(str)) {
            return false;
        }
        try {
            LogUtil.record(4, "AmountScrollingAnimationPlugin updateAttr_src", str2);
            parseObject = JSON.parseObject(str2);
        } catch (Throwable th) {
            MspContext mspContext = this.v;
            if (mspContext != null) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "AmountScrollingViewPlugin:updateAttr", th.getMessage());
            }
            LogUtil.printExceptionStackTrace(th);
        }
        if (!parseObject.containsKey("data")) {
            return true;
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        if (!jSONObject.containsKey("currency") || !jSONObject.containsKey(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT) || !jSONObject.containsKey("preAmount") || !jSONObject.containsKey("currencyMarginBottom") || !jSONObject.containsKey("duration") || !jSONObject.containsKey("amountFontSize") || !jSONObject.containsKey("currencyFontSize") || !jSONObject.containsKey("runAnim")) {
            LogUtil.record(8, "AmountScrollingAnimationPlugin", "Lack of amount details");
            throw new IllegalArgumentException("Lack of amount details");
        }
        Boolean bool = jSONObject.getBoolean("runAnim");
        String string = jSONObject.getString("currency");
        String string2 = jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT);
        String string3 = jSONObject.getString("preAmount");
        this.u = jSONObject.getFloat("currencyMarginBottom").floatValue();
        int intValue = jSONObject.getInteger("duration").intValue();
        float floatValue = jSONObject.getFloat("amountFontSize").floatValue();
        float floatValue2 = jSONObject.getFloat("currencyFontSize").floatValue();
        Context context = this.r;
        if (!(context == null || context.getResources() == null || this.r.getResources().getDisplayMetrics() == null)) {
            this.s = TypedValue.applyDimension(1, floatValue, this.r.getResources().getDisplayMetrics());
            this.t = TypedValue.applyDimension(1, floatValue2, this.r.getResources().getDisplayMetrics());
        }
        if (!TextUtils.isEmpty(string2)) {
            if (Build.VERSION.SDK_INT < 24) {
                e(string2, string);
            } else if (!bool.booleanValue()) {
                this.q.pauseNumberAnimator();
                e(string2, string);
                return true;
            } else {
                if (!TextUtils.isEmpty(string3) && !string2.equals(string3)) {
                    e(string3, string);
                    this.q.setNumberAnimatorDuration(intValue);
                    String[] split = string2.split("\\.");
                    if (string3.split("\\.").length == split.length) {
                        if (split.length > 1) {
                            this.q.setNumberAnimatorValues(Long.parseLong(split[0]), Integer.parseInt(split[1]), string);
                        } else if (split.length == 1) {
                            this.q.setNumberAnimatorValues(Long.parseLong(split[0]), 0, string);
                        } else {
                            throw new IllegalArgumentException("Wrong amount format");
                        }
                        this.q.startNumberAnimator();
                    } else {
                        throw new IllegalArgumentException("Amount decimal length changed!");
                    }
                }
                e(string2, string);
            }
            return true;
        }
        throw new IllegalArgumentException("Amount is empty");
    }
}
