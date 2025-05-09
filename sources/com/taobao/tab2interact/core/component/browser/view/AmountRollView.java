package com.taobao.tab2interact.core.component.browser.view;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.fru;
import tb.s6o;
import tb.t2o;
import tb.vgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AmountRollView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHADOW_URL = "https://img.alicdn.com/imgextra/i1/O1CN01CV0ZQl1SAOb7VJALC_!!6000000002206-2-tps-90-90.png";
    private static final String TAG = "AmountRollView";
    private String mAmountDecimalPoint;
    private String mAmountUnit;
    private final Context mContext;
    private int mCurrentAmount;
    private long mCurrentDuration;
    private TextView mDecimalPointTextView;
    private ViewSwitcher.ViewFactory mFactory;
    private long mFragmentDuration;
    private Handler mHandler;
    private boolean mInitAnim;
    private boolean mIsAddingAmount;
    private boolean mIsInitialized;
    private d mListener;
    private long mSingleChangeDuration;
    private boolean mStopAnim;
    private TextSwitcher mSwitchHundreds;
    private TextSwitcher mSwitchOnes;
    private TextSwitcher mSwitchTens;
    private TextSwitcher mSwitchThousands;
    private List<TextSwitcher> mSwitcherList;
    private int mTotalAmount;
    private long mTotalDuration;
    private TextView mUnitTextView;
    private Runnable runnable;

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
            } else if (!AmountRollView.access$000(AmountRollView.this)) {
                if (AmountRollView.access$100(AmountRollView.this) >= AmountRollView.access$200(AmountRollView.this)) {
                    AmountRollView amountRollView = AmountRollView.this;
                    AmountRollView.access$300(amountRollView, AmountRollView.access$200(amountRollView));
                    AmountRollView amountRollView2 = AmountRollView.this;
                    AmountRollView.access$102(amountRollView2, AmountRollView.access$200(amountRollView2));
                    AmountRollView amountRollView3 = AmountRollView.this;
                    AmountRollView.access$402(amountRollView3, AmountRollView.access$400(amountRollView3) + (AmountRollView.access$500(AmountRollView.this) - AmountRollView.access$600(AmountRollView.this)));
                    AmountRollView amountRollView4 = AmountRollView.this;
                    AmountRollView.access$602(amountRollView4, AmountRollView.access$500(amountRollView4));
                    AmountRollView.access$700(AmountRollView.this);
                    vgh.c(this, AmountRollView.TAG, "进行一次金额翻滚，当前金额大于等于总金额，amountRollView=" + AmountRollView.this);
                    return;
                }
                AmountRollView.access$700(AmountRollView.this);
                if (!AmountRollView.access$000(AmountRollView.this)) {
                    AmountRollView amountRollView5 = AmountRollView.this;
                    AmountRollView.access$402(amountRollView5, AmountRollView.access$800(amountRollView5));
                    AmountRollView amountRollView6 = AmountRollView.this;
                    AmountRollView.access$900(amountRollView6, AmountRollView.access$100(amountRollView6), AmountRollView.access$400(AmountRollView.this));
                    AmountRollView amountRollView7 = AmountRollView.this;
                    AmountRollView.access$102(amountRollView7, AmountRollView.access$100(amountRollView7) + 1);
                    AmountRollView amountRollView8 = AmountRollView.this;
                    AmountRollView.access$602(amountRollView8, AmountRollView.access$600(amountRollView8) + AmountRollView.access$400(AmountRollView.this));
                    AmountRollView.access$1000(AmountRollView.this).postDelayed(this, AmountRollView.access$400(AmountRollView.this));
                    vgh.c(this, AmountRollView.TAG, "进行一次金额翻滚，当前金额小于总金额，amountRollView=" + AmountRollView.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f11813a;
        public final /* synthetic */ TextSwitcher b;
        public final /* synthetic */ char c;
        public final /* synthetic */ long d;

        public b(int[] iArr, TextSwitcher textSwitcher, char c, long j) {
            this.f11813a = iArr;
            this.b = textSwitcher;
            this.c = c;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int[] iArr = this.f11813a;
            int i = iArr[0] - 1;
            iArr[0] = i;
            AmountRollView.access$1100(AmountRollView.this, this.b, (char) (((((this.c - '0') - i) + 10) % 10) + 48), this.d);
            if (this.f11813a[0] > 0) {
                AmountRollView.access$1000(AmountRollView.this).postDelayed(this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    static {
        t2o.a(689963057);
    }

    public AmountRollView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$000(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6cc2506", new Object[]{amountRollView})).booleanValue();
        }
        return amountRollView.mStopAnim;
    }

    public static /* synthetic */ boolean access$002(AmountRollView amountRollView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("679b2054", new Object[]{amountRollView, new Boolean(z)})).booleanValue();
        }
        amountRollView.mStopAnim = z;
        return z;
    }

    public static /* synthetic */ int access$100(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da7a4fb6", new Object[]{amountRollView})).intValue();
        }
        return amountRollView.mCurrentAmount;
    }

    public static /* synthetic */ Handler access$1000(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2918bc75", new Object[]{amountRollView});
        }
        return amountRollView.mHandler;
    }

    public static /* synthetic */ int access$102(AmountRollView amountRollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b20dd1", new Object[]{amountRollView, new Integer(i)})).intValue();
        }
        amountRollView.mCurrentAmount = i;
        return i;
    }

    public static /* synthetic */ void access$1100(AmountRollView amountRollView, TextSwitcher textSwitcher, char c2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467e1c3d", new Object[]{amountRollView, textSwitcher, new Character(c2), new Long(j)});
        } else {
            amountRollView.digitalPlusOne(textSwitcher, c2, j);
        }
    }

    public static /* synthetic */ boolean access$1202(AmountRollView amountRollView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9da6b43", new Object[]{amountRollView, new Boolean(z)})).booleanValue();
        }
        amountRollView.mIsAddingAmount = z;
        return z;
    }

    public static /* synthetic */ Context access$1300(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("54b62dec", new Object[]{amountRollView});
        }
        return amountRollView.mContext;
    }

    public static /* synthetic */ int access$200(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e287a77", new Object[]{amountRollView})).intValue();
        }
        return amountRollView.mTotalAmount;
    }

    public static /* synthetic */ int access$202(AmountRollView amountRollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebc93b30", new Object[]{amountRollView, new Integer(i)})).intValue();
        }
        amountRollView.mTotalAmount = i;
        return i;
    }

    public static /* synthetic */ void access$300(AmountRollView amountRollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fe765e", new Object[]{amountRollView, new Integer(i)});
        } else {
            amountRollView.initCurrentValue(i);
        }
    }

    public static /* synthetic */ long access$400(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7584cffa", new Object[]{amountRollView})).longValue();
        }
        return amountRollView.mFragmentDuration;
    }

    public static /* synthetic */ long access$402(AmountRollView amountRollView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ff799b0", new Object[]{amountRollView, new Long(j)})).longValue();
        }
        amountRollView.mFragmentDuration = j;
        return j;
    }

    public static /* synthetic */ long access$500(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a932fabb", new Object[]{amountRollView})).longValue();
        }
        return amountRollView.mTotalDuration;
    }

    public static /* synthetic */ long access$600(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dce1257c", new Object[]{amountRollView})).longValue();
        }
        return amountRollView.mCurrentDuration;
    }

    public static /* synthetic */ long access$602(AmountRollView amountRollView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f425f46e", new Object[]{amountRollView, new Long(j)})).longValue();
        }
        amountRollView.mCurrentDuration = j;
        return j;
    }

    public static /* synthetic */ void access$700(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108f5049", new Object[]{amountRollView});
        } else {
            amountRollView.notifyAmountRollChanged();
        }
    }

    public static /* synthetic */ long access$800(AmountRollView amountRollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("443d7afe", new Object[]{amountRollView})).longValue();
        }
        return amountRollView.mSingleChangeDuration;
    }

    public static /* synthetic */ void access$900(AmountRollView amountRollView, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba7c32c", new Object[]{amountRollView, new Integer(i), new Long(j)});
        } else {
            amountRollView.plusOne(i, j);
        }
    }

    private String autoFillZero(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d4bc355", new Object[]{this, str});
        }
        int length = str.length();
        if (length >= 4) {
            return str;
        }
        int i = 4 - length;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("0");
        }
        sb.append(str);
        return sb.toString();
    }

    private void digitalPlusOne(TextSwitcher textSwitcher, char c2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80134d4", new Object[]{this, textSwitcher, new Character(c2), new Long(j)});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.2f, 0.55f, 0.11f, 1.06f, 1.0f, 1.0f);
        PathInterpolator pathInterpolator = new PathInterpolator(path);
        translateAnimation.setInterpolator(pathInterpolator);
        translateAnimation2.setInterpolator(pathInterpolator);
        translateAnimation.setDuration(j);
        translateAnimation2.setDuration(j);
        textSwitcher.setInAnimation(translateAnimation);
        textSwitcher.setOutAnimation(translateAnimation2);
        if (textSwitcher == this.mSwitchThousands && c2 == '0') {
            textSwitcher.setText("");
        } else {
            textSwitcher.setText(String.valueOf(c2));
        }
    }

    private void initCurrentValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94a9fb4", new Object[]{this, new Integer(i)});
        } else {
            initCurrentValue(String.valueOf(i));
        }
    }

    public static /* synthetic */ Object ipc$super(AmountRollView amountRollView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/view/AmountRollView");
    }

    private void notifyAmountRollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218d513d", new Object[]{this});
        } else if (this.mListener != null) {
            vgh.c(this, TAG, "通知金额翻滚发生改变，amountRollView=" + this);
            ((BrowserBadgeViewController) this.mListener).I(this.mCurrentAmount, this.mTotalAmount, this.mCurrentDuration, this.mTotalDuration, this.mFragmentDuration);
        }
    }

    private void plusOne(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f551ec54", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        initCurrentValue(i);
        String autoFillZero = autoFillZero(String.valueOf(i));
        String autoFillZero2 = autoFillZero(String.valueOf(i + 1));
        for (int i2 = 0; i2 < 4; i2++) {
            if (!TextUtils.equals(String.valueOf(autoFillZero.charAt(i2)), String.valueOf(autoFillZero2.charAt(i2)))) {
                digitalPlusOne(this.mSwitcherList.get(i2), autoFillZero2.charAt(i2), j);
            }
        }
    }

    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
        } else {
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }

    public void setAmountRollChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76811c9f", new Object[]{this, dVar});
        } else {
            this.mListener = dVar;
        }
    }

    public void setAmountUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd5c00f", new Object[]{this, str});
        } else {
            this.mAmountUnit = str;
        }
    }

    public void setDecimalPoint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a195ee12", new Object[]{this, str});
        } else {
            this.mAmountDecimalPoint = str;
        }
    }

    @Override // android.view.View
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{currentAmount=" + this.mCurrentAmount + "，totalAmount=" + this.mTotalAmount + "，singleChangeDuration=" + this.mSingleChangeDuration + "，currentDuration=" + this.mCurrentDuration + "，totalDuration=" + this.mTotalDuration + "，fragmentDuration=" + this.mFragmentDuration + "}";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11814a;
        public final /* synthetic */ int b;

        public c(int i, int i2) {
            this.f11814a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AmountRollView.access$102(AmountRollView.this, this.f11814a);
            AmountRollView.access$202(AmountRollView.this, this.b);
            AmountRollView.access$1000(AmountRollView.this).removeCallbacksAndMessages(null);
            vgh.c(this, AmountRollView.TAG, "一次性地增加金额，金额增加完成，amountRollView=" + AmountRollView.this);
            AmountRollView.access$1202(AmountRollView.this, false);
            if (!AmountRollView.access$000(AmountRollView.this)) {
                AmountRollView.access$002(AmountRollView.this, true);
                AmountRollView.this.startAmountRoll();
            }
        }
    }

    public AmountRollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void pauseAmountRoll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8009a692", new Object[]{this});
            return;
        }
        vgh.c(this, TAG, "暂停金额翻滚");
        if (!this.mIsInitialized) {
            vgh.c(this, TAG, "暂停金额翻滚，未被初始化");
        } else if (!this.mInitAnim) {
            vgh.c(this, TAG, "initAmountRoll not done yet when pauseAmountRoll");
        } else if (this.mStopAnim) {
            vgh.c(this, TAG, "pauseAmountRoll has done");
        } else {
            this.mStopAnim = true;
            if (this.mIsAddingAmount) {
                vgh.c(this, TAG, "is Adding Amount when pauseAmountRoll");
                return;
            }
            this.mHandler.removeCallbacks(this.runnable);
            int i = this.mCurrentAmount;
            int i2 = this.mTotalAmount;
            if (i >= i2) {
                this.mCurrentAmount = i2;
                long j = this.mFragmentDuration;
                long j2 = this.mTotalDuration;
                this.mFragmentDuration = j + (j2 - this.mCurrentDuration);
                this.mCurrentDuration = j2;
            }
            notifyAmountRollChanged();
            vgh.c(this, TAG, "暂停金额翻滚，翻滚已暂停，amountRollView=" + this);
        }
    }

    public void startAmountRoll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e097fe", new Object[]{this});
            return;
        }
        vgh.c(this, TAG, "开启金额翻滚");
        if (!this.mIsInitialized) {
            vgh.c(this, TAG, "开启金额翻滚，未被初始化");
        } else if (!this.mInitAnim) {
            vgh.c(this, TAG, "initAmountRoll not done yet when startAmountRoll");
        } else if (!this.mStopAnim) {
            vgh.c(this, TAG, "startAmountRoll has done");
        } else {
            this.mStopAnim = false;
            if (this.mIsAddingAmount) {
                vgh.c(this, TAG, "is Adding Amount when startAmountRoll");
                return;
            }
            this.mFragmentDuration = 0L;
            this.mHandler.postDelayed(this.runnable, 0L);
            vgh.c(this, TAG, "开启金额翻滚，翻滚已开启，amountRollView=" + this);
        }
    }

    public AmountRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.runnable = new a();
        this.mFactory = new ViewSwitcher.ViewFactory() { // from class: com.taobao.tab2interact.core.component.browser.view.AmountRollView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.ViewSwitcher.ViewFactory
            public View makeView() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
                }
                TextView textView = new TextView(AmountRollView.access$1300(AmountRollView.this));
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 81));
                textView.setGravity(17);
                textView.setTextColor(-1);
                textView.setTextSize(0, s6o.S(AmountRollView.this.getContext(), 26));
                textView.setTypeface(fru.c(AmountRollView.access$1300(AmountRollView.this), "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf", null, false, false));
                return textView;
            }
        };
        this.mContext = context;
        this.mHandler = new Handler();
    }

    private void initCurrentValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275d539", new Object[]{this, str});
            return;
        }
        int length = str.length();
        if (length == 1) {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(0)));
            this.mSwitchTens.setCurrentText("0");
            this.mSwitchHundreds.setCurrentText("0");
            this.mSwitchThousands.setCurrentText("");
        } else if (length == 2) {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(1)));
            this.mSwitchTens.setCurrentText(String.valueOf(str.charAt(0)));
            this.mSwitchHundreds.setCurrentText("0");
            this.mSwitchThousands.setCurrentText("");
        } else if (length == 3) {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(2)));
            this.mSwitchTens.setCurrentText(String.valueOf(str.charAt(1)));
            this.mSwitchHundreds.setCurrentText(String.valueOf(str.charAt(0)));
            this.mSwitchThousands.setCurrentText("");
        } else if (length == 4) {
            this.mSwitchOnes.setCurrentText(String.valueOf(str.charAt(3)));
            this.mSwitchTens.setCurrentText(String.valueOf(str.charAt(2)));
            this.mSwitchHundreds.setCurrentText(String.valueOf(str.charAt(1)));
            this.mSwitchThousands.setCurrentText(String.valueOf(str.charAt(0)));
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        vgh.c(this, TAG, "初始化");
        if (this.mIsInitialized) {
            vgh.c(this, TAG, "初始化，已经被初始化");
            return;
        }
        LayoutInflater.from(this.mContext).inflate(R.layout.browser_badge_amount_roll_layout, this);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.digital_thousands_switch_view);
        this.mSwitchThousands = textSwitcher;
        textSwitcher.setFactory(this.mFactory);
        TextSwitcher textSwitcher2 = (TextSwitcher) findViewById(R.id.digital_hundreds_switch_view);
        this.mSwitchHundreds = textSwitcher2;
        textSwitcher2.setFactory(this.mFactory);
        TextSwitcher textSwitcher3 = (TextSwitcher) findViewById(R.id.digital_tens_switch_view);
        this.mSwitchTens = textSwitcher3;
        textSwitcher3.setFactory(this.mFactory);
        TextSwitcher textSwitcher4 = (TextSwitcher) findViewById(R.id.digital_ones_switch_view);
        this.mSwitchOnes = textSwitcher4;
        textSwitcher4.setFactory(this.mFactory);
        this.mUnitTextView = (TextView) findViewById(R.id.unit_text_view);
        this.mDecimalPointTextView = (TextView) findViewById(R.id.decimal_point_text_view);
        this.mUnitTextView.setTextSize(0, s6o.S(getContext(), 20));
        this.mDecimalPointTextView.setTextSize(0, s6o.S(getContext(), 26));
        Typeface c2 = fru.c(this.mContext, "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf", null, false, false);
        this.mUnitTextView.setTypeface(c2);
        this.mDecimalPointTextView.setTypeface(c2);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.shadow_url_image_view);
        tUrlImageView.setImageUrl(SHADOW_URL);
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        layoutParams.width = s6o.S(getContext(), 90);
        layoutParams.height = s6o.S(getContext(), 90);
        ArrayList arrayList = new ArrayList();
        this.mSwitcherList = arrayList;
        arrayList.add(this.mSwitchThousands);
        this.mSwitcherList.add(this.mSwitchHundreds);
        this.mSwitcherList.add(this.mSwitchTens);
        this.mSwitcherList.add(this.mSwitchOnes);
        this.mIsInitialized = true;
    }

    public void initAmountRoll(int i, int i2, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db7bd38", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        vgh.c(this, TAG, "初始化金额翻滚");
        if (!this.mIsInitialized) {
            vgh.c(this, TAG, "初始化金额翻滚，未被初始化");
            return;
        }
        boolean z = i2 < 0 || i < 0 || i > 9999 || i2 > 9999;
        boolean z2 = j < 0 || j2 < 0 || j > j2 || j3 <= 0;
        if (z || z2) {
            this.mInitAnim = false;
            this.mHandler.removeCallbacksAndMessages(null);
            vgh.c(this, TAG, "initAmountRoll failed. The amount value is invalid.");
            return;
        }
        this.mInitAnim = true;
        this.mStopAnim = true;
        this.mIsAddingAmount = false;
        this.mCurrentAmount = i;
        this.mTotalAmount = i2;
        this.mCurrentDuration = j;
        this.mTotalDuration = j2;
        this.mSingleChangeDuration = j3;
        int i3 = i2 - i;
        if (i3 > 0) {
            long j4 = i3;
            long j5 = j2 - j;
            if (j3 * j4 > j5) {
                this.mSingleChangeDuration = j5 / j4;
            }
        }
        initCurrentValue(i);
        this.mUnitTextView.setText(this.mAmountUnit);
        this.mDecimalPointTextView.setText(this.mAmountDecimalPoint);
        this.mHandler.removeCallbacksAndMessages(null);
        vgh.c(this, TAG, "初始化金额翻滚，初始化成功，amountRollView=" + this);
    }

    public void addAmount(int i) {
        char c2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da03d6a3", new Object[]{this, new Integer(i)});
            return;
        }
        vgh.c(this, TAG, "一次性地增加金额，finalTotalAmount=" + i);
        if (!this.mIsInitialized) {
            vgh.c(this, TAG, "一次性地增加金额，未被初始化");
        } else if (!this.mInitAnim) {
            vgh.c(this, TAG, "initAmountRoll not done yet when addAmount");
        } else if (i <= this.mTotalAmount) {
            vgh.c(this, TAG, "finalTotalAmount is not greater than mTotalAmount when addAmount");
        } else {
            boolean z = this.mStopAnim;
            pauseAmountRoll();
            this.mStopAnim = z;
            this.mIsAddingAmount = true;
            initCurrentValue(this.mCurrentAmount);
            int i2 = this.mCurrentAmount;
            int i3 = (i2 + i) - this.mTotalAmount;
            String autoFillZero = autoFillZero(String.valueOf(i2));
            String autoFillZero2 = autoFillZero(String.valueOf(i3));
            vgh.c(this, TAG, "一次性地增加金额，准备增加金额，amountRollView=" + this);
            int i4 = 0;
            while (i4 < 4) {
                char charAt = autoFillZero.charAt(i4);
                char charAt2 = autoFillZero2.charAt(i4);
                int[] iArr = {((charAt2 - charAt) + 10) % 10};
                int i5 = iArr[c2];
                if (i5 != 0) {
                    this.mHandler.post(new b(iArr, this.mSwitcherList.get(i4), charAt2, this.mSingleChangeDuration / i5));
                }
                i4++;
                c2 = 0;
            }
            this.mHandler.postDelayed(new c(i3, i), this.mSingleChangeDuration);
        }
    }
}
