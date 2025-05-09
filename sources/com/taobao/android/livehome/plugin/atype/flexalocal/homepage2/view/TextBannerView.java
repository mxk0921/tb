package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.ReMeasureLinearlayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.b0e;
import tb.ixf;
import tb.nvs;
import tb.qw0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TextBannerView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DIRECTION_BOTTOM_TO_TOP = 0;
    private static final int DIRECTION_LEFT_TO_RIGHT = 3;
    private static final int DIRECTION_RIGHT_TO_LEFT = 2;
    private static final int DIRECTION_TOP_TO_BOTTOM = 1;
    private static final int GRAVITY_CENTER = 1;
    private static final int GRAVITY_LEFT = 0;
    private static final int GRAVITY_RIGHT = 2;
    private static final int STRIKE = 0;
    private static final int TYPE_BOLD = 1;
    private static final int TYPE_ITALIC = 2;
    private static final int TYPE_ITALIC_BOLD = 3;
    private static final int TYPE_NORMAL = 0;
    private static final int UNDER_LINE = 1;
    private int animDuration;
    private boolean canAnimation;
    private int direction;
    private boolean hasSetAnimDuration;
    private boolean hasSetDirection;
    private int inAnimResId;
    private boolean isDetachedFromWindow;
    private boolean isNewSingleChannel;
    private boolean isSingleLine;
    private boolean isStarted;
    private int mFlags;
    private int mGravity;
    private int mInterval;
    private int mLabelTextColor;
    private int mLabelTextSize;
    private b0e mListener;
    private b mRunnable;
    private List<TaoliveSearchHotWords> mTaoliveSearchHotWords;
    private int mTextColor;
    private int mTextSize;
    private int mTypeface;
    private ViewFlipper mViewFlipper;
    private int outAnimResId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            int displayedChild = TextBannerView.access$000(TextBannerView.this).getDisplayedChild();
            if (TextBannerView.access$100(TextBannerView.this) != null && TextBannerView.access$200(TextBannerView.this) != null && TextBannerView.access$200(TextBannerView.this).size() > displayedChild) {
                HashMap hashMap = new HashMap();
                hashMap.put("query", ((TaoliveSearchHotWords) TextBannerView.access$200(TextBannerView.this).get(displayedChild)).word);
                hashMap.put("shaded_word_type", ((TaoliveSearchHotWords) TextBannerView.access$200(TextBannerView.this).get(displayedChild)).source);
                hashMap.putAll(ixf.a(((TaoliveSearchHotWords) TextBannerView.access$200(TextBannerView.this).get(displayedChild)).utParams));
                TextBannerView.access$100(TextBannerView.this).a(hashMap, displayedChild);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378896);
        }

        private b() {
        }

        public /* synthetic */ b(TextBannerView textBannerView, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextBannerView.access$400(TextBannerView.this)) {
                TextBannerView.this.stopViewAnimator();
            } else if (TextBannerView.access$200(TextBannerView.this) != null && TextBannerView.access$200(TextBannerView.this).size() >= 2 && TextBannerView.access$500(TextBannerView.this)) {
                TextBannerView textBannerView = TextBannerView.this;
                TextBannerView.access$800(textBannerView, TextBannerView.access$600(textBannerView), TextBannerView.access$700(TextBannerView.this));
                TextBannerView.access$000(TextBannerView.this).showNext();
                if (TextBannerView.access$100(TextBannerView.this) != null && (TextBannerView.access$000(TextBannerView.this).getCurrentView() instanceof ReMeasureLinearlayout)) {
                    HashMap hashMap = new HashMap();
                    if (TextBannerView.access$000(TextBannerView.this).getCurrentView().getTag() != null && (TextBannerView.access$000(TextBannerView.this).getCurrentView().getTag() instanceof TaoliveSearchHotWords)) {
                        TaoliveSearchHotWords taoliveSearchHotWords = (TaoliveSearchHotWords) TextBannerView.access$000(TextBannerView.this).getCurrentView().getTag();
                        hashMap.put("query", taoliveSearchHotWords.word);
                        hashMap.put("shaded_word_type", taoliveSearchHotWords.source);
                        hashMap.putAll(ixf.a(taoliveSearchHotWords.utParams));
                        TextBannerView.access$100(TextBannerView.this).b(hashMap);
                    }
                }
                TextBannerView textBannerView2 = TextBannerView.this;
                textBannerView2.postDelayed(this, TextBannerView.access$900(textBannerView2) + TextBannerView.access$1000(TextBannerView.this));
            } else if (TextBannerView.access$200(TextBannerView.this) != null && TextBannerView.access$200(TextBannerView.this).size() == 1 && TextBannerView.access$100(TextBannerView.this) != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("query", ((TaoliveSearchHotWords) TextBannerView.access$200(TextBannerView.this).get(0)).word);
                hashMap2.put("shaded_word_type", ((TaoliveSearchHotWords) TextBannerView.access$200(TextBannerView.this).get(0)).source);
                hashMap2.putAll(ixf.a(((TaoliveSearchHotWords) TextBannerView.access$200(TextBannerView.this).get(0)).utParams));
                TextBannerView.access$100(TextBannerView.this).b(hashMap2);
            }
        }
    }

    static {
        t2o.a(310378894);
    }

    public TextBannerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ ViewFlipper access$000(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewFlipper) ipChange.ipc$dispatch("da9dd66b", new Object[]{textBannerView});
        }
        return textBannerView.mViewFlipper;
    }

    public static /* synthetic */ b0e access$100(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0e) ipChange.ipc$dispatch("e89a6715", new Object[]{textBannerView});
        }
        return textBannerView.mListener;
    }

    public static /* synthetic */ int access$1000(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769146de", new Object[]{textBannerView})).intValue();
        }
        return textBannerView.animDuration;
    }

    public static /* synthetic */ List access$200(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("293d48f", new Object[]{textBannerView});
        }
        return textBannerView.mTaoliveSearchHotWords;
    }

    public static /* synthetic */ boolean access$400(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7da86cfa", new Object[]{textBannerView})).booleanValue();
        }
        return textBannerView.isStarted;
    }

    public static /* synthetic */ boolean access$500(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5994819", new Object[]{textBannerView})).booleanValue();
        }
        return textBannerView.canAnimation;
    }

    public static /* synthetic */ int access$600(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8a2327", new Object[]{textBannerView})).intValue();
        }
        return textBannerView.inAnimResId;
    }

    public static /* synthetic */ int access$700(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("257afe46", new Object[]{textBannerView})).intValue();
        }
        return textBannerView.outAnimResId;
    }

    public static /* synthetic */ void access$800(TextBannerView textBannerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e9a552", new Object[]{textBannerView, new Integer(i), new Integer(i2)});
        } else {
            textBannerView.setInAndOutAnimation(i, i2);
        }
    }

    public static /* synthetic */ int access$900(TextBannerView textBannerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("955cb484", new Object[]{textBannerView})).intValue();
        }
        return textBannerView.mInterval;
    }

    private List<String> getTextList(List<TaoliveSearchHotWords> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4012934e", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                arrayList.add(list.get(i).word);
            }
        }
        return arrayList;
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextBannerViewStyle, i, 0);
        this.mInterval = obtainStyledAttributes.getInteger(R.styleable.TextBannerViewStyle_setInterval, this.mInterval);
        this.isSingleLine = obtainStyledAttributes.getBoolean(R.styleable.TextBannerViewStyle_setSingleLine, false);
        this.mTextColor = obtainStyledAttributes.getColor(R.styleable.TextBannerViewStyle_setTextColor, this.mTextColor);
        this.mLabelTextColor = obtainStyledAttributes.getColor(R.styleable.TextBannerViewStyle_setLabelTextColor, this.mLabelTextColor);
        int i2 = R.styleable.TextBannerViewStyle_setTextSize;
        if (obtainStyledAttributes.hasValue(i2)) {
            int dimension = (int) obtainStyledAttributes.getDimension(i2, this.mTextSize);
            this.mTextSize = dimension;
            this.mTextSize = qw0.t(context, dimension);
        }
        int i3 = R.styleable.TextBannerViewStyle_setLabelTextSize;
        if (obtainStyledAttributes.hasValue(i3)) {
            int dimension2 = (int) obtainStyledAttributes.getDimension(i3, this.mLabelTextSize);
            this.mLabelTextSize = dimension2;
            this.mLabelTextSize = qw0.t(context, dimension2);
        }
        int i4 = obtainStyledAttributes.getInt(R.styleable.TextBannerViewStyle_setGravity, 0);
        if (i4 == 0) {
            this.mGravity = 19;
        } else if (i4 == 1) {
            this.mGravity = 17;
        } else if (i4 == 2) {
            this.mGravity = 21;
        }
        int i5 = R.styleable.TextBannerViewStyle_setAnimDuration;
        this.hasSetAnimDuration = obtainStyledAttributes.hasValue(i5);
        this.animDuration = obtainStyledAttributes.getInt(i5, this.animDuration);
        int i6 = R.styleable.TextBannerViewStyle_setDirection;
        this.hasSetDirection = obtainStyledAttributes.hasValue(i6);
        int i7 = obtainStyledAttributes.getInt(i6, this.direction);
        this.direction = i7;
        if (!this.hasSetDirection) {
            this.inAnimResId = R.anim.anim_right_in_flexalocal;
            this.outAnimResId = R.anim.anim_left_out_flexalocal;
        } else if (i7 == 0) {
            this.inAnimResId = R.anim.anim_bottom_in_flexalocal;
            this.outAnimResId = R.anim.anim_top_out_flexalocal;
        } else if (i7 == 1) {
            this.inAnimResId = R.anim.anim_top_in_flexalocal;
            this.outAnimResId = R.anim.anim_bottom_out_flexalocal;
        } else if (i7 == 2) {
            this.inAnimResId = R.anim.anim_right_in_flexalocal;
            this.outAnimResId = R.anim.anim_left_out_flexalocal;
        } else if (i7 == 3) {
            this.inAnimResId = R.anim.anim_left_in_flexalocal;
            this.outAnimResId = R.anim.anim_right_out_flexalocal;
        }
        int i8 = obtainStyledAttributes.getInt(R.styleable.TextBannerViewStyle_setFlags, this.mFlags);
        this.mFlags = i8;
        if (i8 == 0) {
            this.mFlags = 17;
        } else if (i8 != 1) {
            this.mFlags = 1;
        } else {
            this.mFlags = 9;
        }
        int i9 = obtainStyledAttributes.getInt(R.styleable.TextBannerViewStyle_setTypeface, this.mTypeface);
        this.mTypeface = i9;
        if (i9 == 1) {
            this.mTypeface = 1;
        } else if (i9 == 2) {
            this.mTypeface = 2;
        } else if (i9 == 3) {
            this.mTypeface = 3;
        }
        ViewFlipper viewFlipper = new ViewFlipper(getContext());
        this.mViewFlipper = viewFlipper;
        viewFlipper.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.mViewFlipper);
        startViewAnimator();
        if (nvs.Q()) {
            this.mViewFlipper.setOnClickListener(new a());
        }
    }

    public static /* synthetic */ Object ipc$super(TextBannerView textBannerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/view/TextBannerView");
        }
    }

    private void setInAndOutAnimation(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea75c1cd", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setDuration(this.animDuration);
        this.mViewFlipper.setInAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), i2);
        loadAnimation2.setDuration(this.animDuration);
        this.mViewFlipper.setOutAnimation(loadAnimation2);
    }

    public TaoliveSearchHotWords getClickItemData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveSearchHotWords) ipChange.ipc$dispatch("eef3c13a", new Object[]{this});
        }
        int displayedChild = this.mViewFlipper.getDisplayedChild();
        List<TaoliveSearchHotWords> list = this.mTaoliveSearchHotWords;
        if (list == null || list.size() <= displayedChild) {
            return null;
        }
        return this.mTaoliveSearchHotWords.get(displayedChild);
    }

    public int getClickItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7974f7c8", new Object[]{this})).intValue();
        }
        return this.mViewFlipper.getDisplayedChild();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isDetachedFromWindow = false;
        startViewAnimator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isDetachedFromWindow = true;
        stopViewAnimator();
    }

    public void setCanAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03829d7", new Object[]{this, new Boolean(z)});
        } else {
            this.canAnimation = z;
        }
    }

    public void setDatasWithDrawableIcon(List<TaoliveSearchHotWords> list, Drawable drawable, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b574e200", new Object[]{this, list, drawable, new Integer(i), new Integer(i2)});
            return;
        }
        this.mTaoliveSearchHotWords = list;
        if (list != null) {
            this.mViewFlipper.removeAllViews();
            for (int i3 = 0; i3 < this.mTaoliveSearchHotWords.size(); i3++) {
                TextView textView = new TextView(getContext());
                setTextView(textView, i3);
                textView.setCompoundDrawablePadding(8);
                int i4 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
                drawable.setBounds(0, 0, i4, i4);
                if (i2 == 3) {
                    textView.setCompoundDrawables(drawable, null, null, null);
                } else if (i2 == 48) {
                    textView.setCompoundDrawables(null, drawable, null, null);
                } else if (i2 == 5) {
                    textView.setCompoundDrawables(null, null, drawable, null);
                } else if (i2 == 80) {
                    textView.setCompoundDrawables(null, null, null, drawable);
                }
                ReMeasureLinearlayout reMeasureLinearlayout = new ReMeasureLinearlayout(getContext());
                reMeasureLinearlayout.setOrientation(0);
                reMeasureLinearlayout.setGravity(this.mGravity);
                reMeasureLinearlayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
                this.mViewFlipper.addView(reMeasureLinearlayout, i3);
            }
        }
    }

    public void setItemListener(b0e b0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f912a28", new Object[]{this, b0eVar});
        } else {
            this.mListener = b0eVar;
        }
    }

    public void setNewSingleChannel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd55af0", new Object[]{this, new Boolean(z)});
        } else {
            this.isNewSingleChannel = z;
        }
    }

    public void setWithLabelDatas(List<TaoliveSearchHotWords> list) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd164d5", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            this.mTaoliveSearchHotWords = list;
            this.mViewFlipper.removeAllViews();
            for (int i2 = 0; i2 < this.mTaoliveSearchHotWords.size(); i2++) {
                ReMeasureLinearlayout reMeasureLinearlayout = new ReMeasureLinearlayout(getContext());
                reMeasureLinearlayout.setOrientation(0);
                reMeasureLinearlayout.setGravity(16);
                TextView textView = new TextView(getContext());
                setTextView(textView, i2);
                reMeasureLinearlayout.addView(textView);
                reMeasureLinearlayout.setTag(this.mTaoliveSearchHotWords.get(i2));
                if (this.mTaoliveSearchHotWords.get(i2).rightInfo != null) {
                    String str = this.mTaoliveSearchHotWords.get(i2).rightInfo.reasonShort;
                    if (!TextUtils.isEmpty(str)) {
                        TextView textView2 = new TextView(getContext());
                        ReMeasureLinearlayout.LayoutParams layoutParams = new ReMeasureLinearlayout.LayoutParams(-2, -2);
                        ((LinearLayout.LayoutParams) layoutParams).leftMargin = qw0.d(getContext(), 3.0f);
                        setLabelTextView(textView2, str);
                        textView2.setLayoutParams(layoutParams);
                        reMeasureLinearlayout.addView(textView2);
                        if (this.isNewSingleChannel) {
                            i = 6;
                        } else {
                            i = 8;
                        }
                        int length = i - str.length();
                        if (length < 0) {
                            length = 1;
                        }
                        String charSequence = textView.getText().toString();
                        if (charSequence.length() > length) {
                            charSequence = charSequence.substring(0, length);
                        }
                        textView.setText(charSequence);
                    } else {
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                    }
                } else {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
                this.mViewFlipper.addView(reMeasureLinearlayout, i2);
            }
        }
    }

    public void startViewAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fea7b5", new Object[]{this});
        } else if (!this.isStarted && !this.isDetachedFromWindow) {
            this.isStarted = true;
            postDelayed(this.mRunnable, this.mInterval);
        }
    }

    public void stopViewAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeeab55", new Object[]{this});
        } else if (this.isStarted) {
            removeCallbacks(this.mRunnable);
            this.isStarted = false;
        }
    }

    public TextBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInterval = 3000;
        this.isSingleLine = false;
        this.mTextColor = -16777216;
        this.mLabelTextColor = -16777216;
        this.mTextSize = 16;
        this.mLabelTextSize = 12;
        this.mGravity = 19;
        this.hasSetDirection = false;
        this.direction = 0;
        this.inAnimResId = R.anim.anim_right_in_flexalocal;
        this.outAnimResId = R.anim.anim_left_out_flexalocal;
        this.hasSetAnimDuration = false;
        this.animDuration = 500;
        this.mFlags = -1;
        this.mTypeface = 0;
        this.canAnimation = true;
        this.mRunnable = new b(this, null);
        init(context, attributeSet, 0);
    }

    private void setTextView(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910bfffa", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setText(this.mTaoliveSearchHotWords.get(i).word);
        textView.setSingleLine(this.isSingleLine);
        ReMeasureLinearlayout.LayoutParams layoutParams = new ReMeasureLinearlayout.LayoutParams(-2, -2);
        if (this.mTaoliveSearchHotWords.get(i).rightInfo != null) {
            layoutParams.setFinalMeasure(true);
        }
        textView.setLayoutParams(layoutParams);
        textView.setEllipsize(null);
        textView.setTag("tblSearchText");
        textView.setTextColor(this.mTextColor);
        textView.setTextSize(this.mTextSize);
        textView.setGravity(this.mGravity);
        textView.getPaint().setFlags(this.mFlags);
        textView.setTypeface(null, this.mTypeface);
    }

    private void setLabelTextView(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557d4c63", new Object[]{this, textView, str});
            return;
        }
        textView.setText(str);
        textView.setSingleLine(this.isSingleLine);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag("tblSearchText");
        textView.setTextColor(this.mLabelTextColor);
        textView.setTextSize(this.mLabelTextSize);
        textView.setGravity(this.mGravity);
        textView.setPadding(qw0.d(getContext(), 3.0f), 0, qw0.d(getContext(), 3.0f), 0);
        textView.setBackground(getResources().getDrawable(R.drawable.live_search_hotsell_bg_flexalocal));
        textView.setTypeface(null, 1);
        textView.getPaint().setFlags(this.mFlags);
        textView.setTypeface(null, this.mTypeface);
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            try {
                this.mTextColor = i;
                ViewFlipper viewFlipper = this.mViewFlipper;
                ((TextView) viewFlipper.getChildAt(viewFlipper.getDisplayedChild()).findViewWithTag("tblSearchText")).setTextColor(i);
                for (int i2 = 0; i2 < this.mTaoliveSearchHotWords.size(); i2++) {
                    if (this.mViewFlipper.getChildAt(i2) != null) {
                        ((TextView) this.mViewFlipper.getChildAt(i2).findViewWithTag("tblSearchText")).setTextColor(i);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
