package com.taobao.android.label;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.cjc;
import tb.ejc;
import tb.f7l;
import tb.pfg;
import tb.pj7;
import tb.s0m;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TextLabel extends LinearLayout implements ejc, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LABEL_HEIGHT = 20;
    private static final String TAG = "TextLabel";
    private int mAnchorWidth;
    private GestureDetector mAppGesture;
    private float mDownX;
    private float mDownY;
    private Rect mExtendIndicatorClickArea;
    private View mIconContainer;
    private View mIndicatorLeft;
    private ImageView mIndicatorLeftIcon;
    private View mIndicatorLeftLine;
    private View mIndicatorRight;
    private ImageView mIndicatorRightIcon;
    private View mIndicatorRightLine;
    private View mLabelContainer;
    private LabelData mLabelData;
    private int mLabelHeight;
    private ImageView mLabelIcon;
    private LinearLayout mLabelRoot;
    private pfg mLabelRotateListener;
    private TextView mLabelTextView;
    private float mLastX;
    private float mLastY;
    private cjc mListener;
    private int mOriginTextWidth;
    private LabelContainer mParent;
    private int mWithoutTextWidth;
    private boolean mEnableMove = true;
    private boolean mEnableRotate = true;
    private boolean mOutOfRange = false;
    private Rect mTouchDownPosition = new Rect();
    private boolean mGestureMove = false;
    private Rect mCurrentPosition = new Rect();
    private boolean mIsInDeleteRegion = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(926941207);
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2043089436) {
                super.onLongPress((MotionEvent) objArr[0]);
                return null;
            } else if (hashCode == -782828477) {
                return new Boolean(super.onSingleTapConfirmed((MotionEvent) objArr[0]));
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/label/TextLabel$AppGesture");
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (!TextLabel.access$000(TextLabel.this)) {
                if (TextLabel.access$700(TextLabel.this) != null) {
                    TextLabel.access$700(TextLabel.this).i(TextLabel.access$400(TextLabel.this), TextLabel.access$800(TextLabel.this), TextLabel.access$900(TextLabel.this));
                }
                TextLabel.access$002(TextLabel.this, true);
                if (TextLabel.access$700(TextLabel.this) != null) {
                    cjc access$700 = TextLabel.access$700(TextLabel.this);
                    TextLabel textLabel = TextLabel.this;
                    access$700.g(textLabel, TextLabel.access$400(textLabel));
                }
                super.onLongPress(motionEvent);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            if (TextLabel.access$000(TextLabel.this)) {
                return false;
            }
            Rect rect = new Rect();
            TextLabel.access$100(TextLabel.this).getHitRect(rect);
            Rect rect2 = new Rect();
            TextLabel.access$200(TextLabel.this).getHitRect(rect2);
            if (TextLabel.access$300(TextLabel.this) != null) {
                rect.set(rect.left - TextLabel.access$300(TextLabel.this).left, rect.top - TextLabel.access$300(TextLabel.this).top, rect.right + TextLabel.access$300(TextLabel.this).right, rect.bottom + TextLabel.access$300(TextLabel.this).bottom);
                rect2.set(rect2.left - TextLabel.access$300(TextLabel.this).left, rect2.top - TextLabel.access$300(TextLabel.this).top, rect2.right + TextLabel.access$300(TextLabel.this).right, rect2.bottom + TextLabel.access$300(TextLabel.this).bottom);
            }
            TextLabel textLabel = TextLabel.this;
            if (!TextLabel.access$500(textLabel, TextLabel.access$400(textLabel).direction) || !rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                TextLabel textLabel2 = TextLabel.this;
                if (TextLabel.access$500(textLabel2, TextLabel.access$400(textLabel2).direction) || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    if (TextLabel.access$700(TextLabel.this) != null) {
                        TextLabel.access$700(TextLabel.this).b(TextLabel.access$400(TextLabel.this));
                    }
                    return super.onSingleTapConfirmed(motionEvent);
                }
            }
            TextLabel.this.rotateLabel();
            if (TextLabel.access$600(TextLabel.this) != null) {
                TextLabel.access$600(TextLabel.this).d(TextLabel.access$400(TextLabel.this));
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    static {
        t2o.a(926941206);
        t2o.a(926941190);
    }

    public TextLabel(Context context, LabelContainer labelContainer) {
        super(context);
        this.mParent = labelContainer;
        initViews(context);
        this.mAppGesture = new GestureDetector(context, new a(), new Handler());
        setOnTouchListener(this);
    }

    public static /* synthetic */ boolean access$000(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21d07b71", new Object[]{textLabel})).booleanValue();
        }
        return textLabel.mGestureMove;
    }

    public static /* synthetic */ boolean access$002(TextLabel textLabel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270a0f49", new Object[]{textLabel, new Boolean(z)})).booleanValue();
        }
        textLabel.mGestureMove = z;
        return z;
    }

    public static /* synthetic */ View access$100(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1f4792f0", new Object[]{textLabel});
        }
        return textLabel.mIndicatorLeft;
    }

    public static /* synthetic */ View access$200(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d9bd3371", new Object[]{textLabel});
        }
        return textLabel.mIndicatorRight;
    }

    public static /* synthetic */ Rect access$300(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("2ccdb4f9", new Object[]{textLabel});
        }
        return textLabel.mExtendIndicatorClickArea;
    }

    public static /* synthetic */ LabelData access$400(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LabelData) ipChange.ipc$dispatch("96191664", new Object[]{textLabel});
        }
        return textLabel.mLabelData;
    }

    public static /* synthetic */ boolean access$500(TextLabel textLabel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6dd7415", new Object[]{textLabel, new Integer(i)})).booleanValue();
        }
        return textLabel.isLeftDirection(i);
    }

    public static /* synthetic */ pfg access$600(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfg) ipChange.ipc$dispatch("1b15cd7d", new Object[]{textLabel});
        }
        return textLabel.mLabelRotateListener;
    }

    public static /* synthetic */ cjc access$700(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjc) ipChange.ipc$dispatch("e6a8987c", new Object[]{textLabel});
        }
        return textLabel.mListener;
    }

    public static /* synthetic */ float access$800(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bdbf165", new Object[]{textLabel})).floatValue();
        }
        return textLabel.mLastX;
    }

    public static /* synthetic */ float access$900(TextLabel textLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("311d6026", new Object[]{textLabel})).floatValue();
        }
        return textLabel.mLastY;
    }

    private float calTextLength(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dff85116", new Object[]{this, textView, str})).floatValue();
        }
        return textView.getPaint().measureText(str);
    }

    private void changeViewWidth(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6040c9", new Object[]{this, view, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    private void checkOutOfRange(FrameLayout.LayoutParams layoutParams, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67121db1", new Object[]{this, layoutParams, new Integer(i)});
            return;
        }
        if (layoutParams.leftMargin >= this.mParent.getLabelRegion().left && layoutParams.leftMargin + i <= this.mParent.getLabelRegion().right) {
            z = false;
        }
        this.mOutOfRange = z;
    }

    private void initViews(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cbdea3", new Object[]{this, context});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.tm_fun_mark_layout, (ViewGroup) this, true);
        this.mLabelRoot = (LinearLayout) viewGroup.findViewById(R.id.ll_label_root);
        this.mLabelTextView = (TextView) viewGroup.findViewById(R.id.label_text);
        this.mIndicatorRight = viewGroup.findViewById(R.id.indicator_right);
        this.mIndicatorRightIcon = (ImageView) viewGroup.findViewById(R.id.indicator_right_icon);
        this.mIndicatorRightLine = viewGroup.findViewById(R.id.indicator_right_line);
        this.mIndicatorLeft = viewGroup.findViewById(R.id.indicator_left);
        this.mIndicatorLeftIcon = (ImageView) viewGroup.findViewById(R.id.indicator_left_icon);
        this.mIndicatorLeftLine = viewGroup.findViewById(R.id.indicator_left_line);
        this.mIconContainer = viewGroup.findViewById(R.id.label_icon_container);
        this.mLabelIcon = (ImageView) viewGroup.findViewById(R.id.label_icon);
        this.mLabelContainer = viewGroup.findViewById(R.id.label_container);
        this.mLabelHeight = pj7.a(context, 20.0f);
        this.mAnchorWidth = this.mParent.getAnchorWidth();
        this.mIndicatorRightIcon.getLayoutParams().width = this.mAnchorWidth;
        this.mIndicatorRightIcon.getLayoutParams().height = this.mAnchorWidth;
        this.mIndicatorLeftIcon.getLayoutParams().width = this.mAnchorWidth;
        this.mIndicatorLeftIcon.getLayoutParams().height = this.mAnchorWidth;
    }

    private int inverseDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af00a280", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 1;
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(TextLabel textLabel, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/label/TextLabel");
    }

    private Rect isEnterForbidRegion(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("9e22bfe6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (this.mOutOfRange) {
            if (isLeftDirection(this.mLabelData.direction)) {
                i = i3 - this.mIndicatorRightIcon.getWidth();
            } else {
                i3 = this.mIndicatorLeftIcon.getWidth() + i;
            }
            for (Rect rect : this.mParent.getForbidRegions()) {
                if (rect.intersects(i, i2, i3, i4)) {
                    return rect;
                }
            }
            return null;
        }
        for (Rect rect2 : this.mParent.getForbidRegions()) {
            if (rect2.intersects(i, i2, i3, i4)) {
                return rect2;
            }
        }
        return null;
    }

    private boolean isInLabelRegion(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fafdac64", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        if (!this.mOutOfRange) {
            return this.mParent.getLabelRegion().contains(i, i2, i3, i4);
        }
        if (isLeftDirection(this.mLabelData.direction)) {
            i = i3 - this.mIndicatorRightIcon.getWidth();
        } else {
            i3 = this.mIndicatorLeftIcon.getWidth() + i;
        }
        return this.mParent.getLabelRegion().contains(i, i2, i3, i4);
    }

    private boolean isLeftDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19af35f2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    private int mostLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c0235a4", new Object[]{this})).intValue();
        }
        if (!this.mOutOfRange) {
            return this.mParent.getLabelRegion().left;
        }
        if (isLeftDirection(this.mLabelData.direction)) {
            return this.mParent.getLabelRegion().left - (getWidth() - this.mIndicatorRightIcon.getWidth());
        }
        return this.mParent.getLabelRegion().left;
    }

    private int mostRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91ad0053", new Object[]{this})).intValue();
        }
        if (!this.mOutOfRange) {
            return this.mParent.getLabelRegion().right - getWidth();
        }
        if (isLeftDirection(this.mLabelData.direction)) {
            return this.mParent.getLabelRegion().right - getWidth();
        }
        return this.mParent.getLabelRegion().right - this.mIndicatorLeftIcon.getWidth();
    }

    private void reCalculatePosition(FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eee81f6", new Object[]{this, layoutParams});
            return;
        }
        this.mLabelData.y = (layoutParams.topMargin - this.mParent.getLabelRegion().top) + (this.mLabelHeight / 2);
        LabelData labelData = this.mLabelData;
        labelData.posY = (labelData.y * 1.0f) / this.mParent.getLabelRegion().height();
        if (isLeftDirection(this.mLabelData.direction)) {
            this.mLabelData.x = (layoutParams.leftMargin - this.mParent.getLabelRegion().left) + (getMeasuredWidth() - (this.mAnchorWidth / 2));
        } else {
            this.mLabelData.x = (layoutParams.leftMargin - this.mParent.getLabelRegion().left) + (this.mAnchorWidth / 2);
        }
        LabelData labelData2 = this.mLabelData;
        labelData2.posX = (labelData2.x * 1.0f) / this.mParent.getLabelRegion().width();
        Log.e(TAG, String.format("label x,y change to (%d, %d), posx,posy change to (%f, %f)", Integer.valueOf(this.mLabelData.x), Integer.valueOf(this.mLabelData.y), Double.valueOf(this.mLabelData.posX), Double.valueOf(this.mLabelData.posY)));
    }

    private FrameLayout.LayoutParams reGenerateLayoutParams() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("c03ce708", new Object[]{this});
        }
        resetLayoutParams(this);
        resetLayoutParams(this.mLabelTextView);
        measure(0, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.mOriginTextWidth = this.mLabelTextView.getMeasuredWidth();
        this.mWithoutTextWidth = getMeasuredWidth() - this.mOriginTextWidth;
        int measuredWidth = getMeasuredWidth();
        LabelData labelData = this.mLabelData;
        if (labelData.posX > vu3.b.GEO_NOT_SUPPORT || labelData.posY > vu3.b.GEO_NOT_SUPPORT) {
            i2 = (int) (this.mParent.getLabelRegion().width() * this.mLabelData.posX);
            i = (int) (this.mParent.getLabelRegion().height() * this.mLabelData.posY);
        } else {
            i2 = labelData.x;
            i = labelData.y;
            labelData.posX = (i2 * 1.0f) / this.mParent.getLabelRegion().width();
            LabelData labelData2 = this.mLabelData;
            labelData2.posY = (labelData2.y * 1.0f) / this.mParent.getLabelRegion().height();
        }
        if (isLeftDirection(this.mLabelData.direction)) {
            int i3 = i2 + (this.mAnchorWidth / 2);
            int i4 = i - (this.mLabelHeight / 2);
            layoutParams.leftMargin = (i3 - measuredWidth) + this.mParent.getLabelRegion().left;
            layoutParams.topMargin = i4 + this.mParent.getLabelRegion().top;
        } else {
            int i5 = i2 - (this.mAnchorWidth / 2);
            int i6 = i - (this.mLabelHeight / 2);
            layoutParams.leftMargin = i5 + this.mParent.getLabelRegion().left;
            layoutParams.topMargin = i6 + this.mParent.getLabelRegion().top;
            layoutParams.rightMargin = Math.min((this.mParent.getLabelRegion().right - layoutParams.leftMargin) - measuredWidth, 0);
        }
        checkOutOfRange(layoutParams, measuredWidth);
        return layoutParams;
    }

    private void resetLayoutParams(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be21dcc", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
    }

    @Override // tb.ejc
    public void enableMove(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845bbb9", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableMove = z;
        }
    }

    @Override // tb.ejc
    public void enableMoveToOutSide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a017b7", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ejc
    public void enableRotate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacf052f", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableRotate = z;
        }
    }

    public FrameLayout.LayoutParams generateLayoutParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("c44a9631", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return reGenerateLayoutParams();
        }
        return generateLayoutParams();
    }

    public LabelData getLabelData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LabelData) ipChange.ipc$dispatch("725b6d86", new Object[]{this});
        }
        return this.mLabelData;
    }

    public boolean isOutofRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("433666ed", new Object[]{this})).booleanValue();
        }
        return this.mOutOfRange;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // tb.ejc
    public boolean rotateLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c4f8264", new Object[]{this})).booleanValue();
        }
        if (!this.mEnableRotate) {
            return false;
        }
        int left = getLeft();
        int right = getRight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (isLeftDirection(this.mLabelData.direction)) {
            int width = right - this.mIndicatorRightIcon.getWidth();
            if (this.mParent.getLabelRegion().right - width < getWidth() && !this.mOutOfRange) {
                width = this.mParent.getLabelRegion().right - getWidth();
            }
            layoutParams.leftMargin = width;
            setLayoutParams(layoutParams);
            if (this.mLabelData.labelStyle.showDot()) {
                this.mIndicatorLeft.setVisibility(0);
                this.mIndicatorRight.setVisibility(8);
            }
            this.mLabelContainer.setBackgroundResource(this.mLabelData.labelStyle.labelBgRight);
        } else {
            int width2 = (left - getWidth()) + this.mIndicatorLeftIcon.getWidth();
            if (width2 < this.mParent.getLabelRegion().left && !this.mOutOfRange) {
                width2 = this.mParent.getLabelRegion().left;
            }
            layoutParams.leftMargin = width2;
            setLayoutParams(layoutParams);
            if (this.mLabelData.labelStyle.showDot()) {
                this.mIndicatorLeft.setVisibility(8);
                this.mIndicatorRight.setVisibility(0);
            }
            this.mLabelContainer.setBackgroundResource(this.mLabelData.labelStyle.labelBgLeft);
        }
        LabelData labelData = this.mLabelData;
        labelData.direction = inverseDirection(labelData.direction);
        reCalculatePosition(layoutParams);
        checkOutOfRange(layoutParams, getWidth());
        return true;
    }

    public void setExtendIndicatorClickArea(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219234d0", new Object[]{this, rect});
        } else {
            this.mExtendIndicatorClickArea = rect;
        }
    }

    public <T extends LabelData> void setLabelData(T t) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e3ca2", new Object[]{this, t});
            return;
        }
        this.mLabelData = t;
        if (t.labelStyle == null) {
            t.labelStyle = new LabelStyle();
            LabelStyle labelStyle = this.mLabelData.labelStyle;
            int i3 = R.drawable.tm_fun_mark_shape_rect;
            labelStyle.labelBgLeft = i3;
            labelStyle.labelBgRight = i3;
            labelStyle.dotSrc = R.drawable.icon_anchor;
        }
        LabelData labelData = this.mLabelData;
        if (labelData.labelType == 1 && TextUtils.isEmpty(labelData.iconUrl)) {
            this.mLabelData.labelStyle.iconSrc = R.drawable.icon_item_tag;
        }
        LabelData labelData2 = this.mLabelData;
        LabelStyle labelStyle2 = labelData2.labelStyle;
        labelStyle2.iconUrl = labelData2.iconUrl;
        if (labelStyle2.showDot()) {
            View view = this.mIndicatorRight;
            if (isLeftDirection(this.mLabelData.direction)) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = this.mIndicatorLeft;
            if (isLeftDirection(this.mLabelData.direction)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
            if (this.mLabelData.labelStyle.showLine()) {
                this.mIndicatorLeftLine.setVisibility(0);
                this.mIndicatorRightLine.setVisibility(0);
                this.mIndicatorLeftLine.setBackgroundColor(this.mLabelData.labelStyle.lineColor);
                this.mIndicatorRightLine.setBackgroundColor(this.mLabelData.labelStyle.lineColor);
            } else {
                this.mIndicatorLeftLine.setVisibility(4);
                this.mIndicatorRightLine.setVisibility(4);
            }
            this.mIndicatorRightIcon.setImageResource(this.mLabelData.labelStyle.dotSrc);
            this.mIndicatorLeftIcon.setImageResource(this.mLabelData.labelStyle.dotSrc);
        } else {
            this.mIndicatorLeft.setVisibility(8);
            this.mIndicatorRight.setVisibility(8);
        }
        LabelData labelData3 = this.mLabelData;
        LabelStyle labelStyle3 = labelData3.labelStyle;
        if (!(labelStyle3.labelBgRight == 0 || labelStyle3.labelBgLeft == 0)) {
            if (isLeftDirection(labelData3.direction)) {
                this.mLabelContainer.setBackgroundResource(this.mLabelData.labelStyle.labelBgLeft);
            } else {
                this.mLabelContainer.setBackgroundResource(this.mLabelData.labelStyle.labelBgRight);
            }
        }
        if (this.mLabelData.labelStyle.showIcon()) {
            this.mIconContainer.setVisibility(0);
            this.mLabelIcon.setVisibility(0);
            LabelStyle labelStyle4 = this.mLabelData.labelStyle;
            int i4 = labelStyle4.iconSrc;
            if (i4 != 0) {
                this.mLabelIcon.setImageResource(i4);
            } else if (!TextUtils.isEmpty(labelStyle4.iconUrl)) {
                s0m.B().T(this.mLabelData.labelStyle.iconUrl).into(this.mLabelIcon);
            }
        } else {
            this.mIconContainer.setVisibility(8);
            this.mLabelIcon.setVisibility(8);
        }
        if (!this.mLabelData.labelStyle.showDot()) {
            this.mIndicatorRight.setVisibility(8);
            this.mIndicatorLeft.setVisibility(8);
        } else if (isLeftDirection(this.mLabelData.direction)) {
            this.mIndicatorLeft.setVisibility(8);
            this.mIndicatorRight.setVisibility(0);
        } else {
            this.mIndicatorLeft.setVisibility(0);
            this.mIndicatorRight.setVisibility(8);
        }
        if (this.mLabelData.labelStyle.height > 0) {
            this.mLabelHeight = pj7.a(getContext(), this.mLabelData.labelStyle.height);
            ViewGroup.LayoutParams layoutParams = this.mLabelRoot.getLayoutParams();
            layoutParams.height = this.mLabelHeight;
            this.mLabelRoot.setLayoutParams(layoutParams);
        }
        if (this.mLabelData.labelStyle.lineWidth > 0) {
            int a2 = pj7.a(getContext(), this.mLabelData.labelStyle.lineWidth);
            int i5 = (this.mAnchorWidth / 2) + a2;
            changeViewWidth(this.mIndicatorRightLine, a2);
            changeViewWidth(this.mIndicatorLeftLine, a2);
            changeViewWidth(this.mIndicatorLeft, i5);
            changeViewWidth(this.mIndicatorRight, i5);
        }
        this.mLabelTextView.setTextColor(this.mLabelData.labelStyle.textColor);
        this.mLabelTextView.setTextSize(this.mLabelData.labelStyle.textSize);
        this.mLabelTextView.setText(t.content);
    }

    public void setLabelEventListener(cjc cjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def9e7d", new Object[]{this, cjcVar});
        } else {
            this.mListener = cjcVar;
        }
    }

    public void setLabelRotateListener(pfg pfgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c6e3c2", new Object[]{this, pfgVar});
        } else {
            this.mLabelRotateListener = pfgVar;
        }
    }

    @Deprecated
    public void setLabelStyle(LabelStyle labelStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1692f0", new Object[]{this, labelStyle});
        }
    }

    @Override // tb.ejc
    public <T extends LabelData> void updateLabel(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58be12d1", new Object[]{this, t});
            return;
        }
        this.mLabelTextView.setText(t.content);
        this.mOriginTextWidth = (int) calTextLength(this.mLabelTextView, t.content);
    }

    public FrameLayout.LayoutParams generateLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("96a86cb5", new Object[]{this});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.mLabelData.x + this.mParent.getLabelRegion().left;
        layoutParams.topMargin = this.mLabelData.y + this.mParent.getLabelRegion().right;
        if (getMeasuredWidth() == 0) {
            measure(0, 0);
            this.mOriginTextWidth = this.mLabelTextView.getMeasuredWidth();
            this.mWithoutTextWidth = getMeasuredWidth() - this.mOriginTextWidth;
        }
        return layoutParams;
    }

    public void updateLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2207c3fc", new Object[]{this, str});
            return;
        }
        this.mLabelTextView.setText(str);
        this.mOriginTextWidth = (int) calTextLength(this.mLabelTextView, str);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        cjc cjcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        this.mAppGesture.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                if (!this.mEnableMove) {
                    return true;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                int i = layoutParams.leftMargin;
                int i2 = layoutParams.topMargin;
                int width = getWidth() + i;
                int height = getHeight() + i2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
                if (this.mParent.getDeleteRegion() != null && this.mParent.getDeleteRegion().contains(i, i2, width, height)) {
                    String shortString = this.mParent.getDeleteRegion().toShortString();
                    Log.e(TAG, "remove to delete region(" + shortString + f7l.BRACKET_END_STR);
                    Rect rect = this.mTouchDownPosition;
                    layoutParams2.leftMargin = rect.left;
                    layoutParams2.topMargin = rect.top;
                    setLayoutParams(layoutParams2);
                } else if (!isInLabelRegion(i, i2, width, height)) {
                    Rect rect2 = this.mTouchDownPosition;
                    layoutParams2.leftMargin = rect2.left;
                    layoutParams2.topMargin = rect2.top;
                    setLayoutParams(layoutParams2);
                } else {
                    layoutParams2.leftMargin = getLeft();
                    layoutParams2.topMargin = getTop();
                    setLayoutParams(layoutParams2);
                }
                reCalculatePosition(layoutParams2);
                cjc cjcVar2 = this.mListener;
                if (cjcVar2 != null && this.mGestureMove) {
                    cjcVar2.c(this.mLabelData, motionEvent.getRawX(), motionEvent.getRawY());
                }
            } else if (action != 2) {
                if (action == 3 && (cjcVar = this.mListener) != null && this.mGestureMove) {
                    cjcVar.c(this.mLabelData, motionEvent.getRawX(), motionEvent.getRawY());
                }
            } else if (!this.mEnableMove) {
                return true;
            } else {
                float rawX = motionEvent.getRawX() - this.mLastX;
                float rawY = motionEvent.getRawY() - this.mLastY;
                this.mLastX = motionEvent.getRawX();
                this.mLastY = motionEvent.getRawY();
                if (Math.pow(this.mDownX - this.mLastX, 2.0d) + Math.pow(this.mDownY - this.mLastY, 2.0d) > Math.pow(ViewConfiguration.get(getContext()).getScaledTouchSlop(), 2.0d) / 4.0d) {
                    cjc cjcVar3 = this.mListener;
                    if (cjcVar3 != null && !this.mGestureMove) {
                        cjcVar3.i(this.mLabelData, this.mLastX, this.mLastY);
                    }
                    this.mGestureMove = true;
                }
                if (this.mGestureMove) {
                    adjustLabelPosition(rawX, rawY);
                    cjc cjcVar4 = this.mListener;
                    if (cjcVar4 != null) {
                        cjcVar4.f(this.mLabelData, rawX, rawY);
                    }
                }
                return true;
            }
            return true;
        } else if (!this.mEnableMove) {
            return true;
        } else {
            this.mGestureMove = false;
            this.mLastX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            this.mLastY = rawY2;
            this.mDownX = this.mLastX;
            this.mDownY = rawY2;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.mTouchDownPosition.set(getLeft(), getTop(), getRight(), getBottom());
            return true;
        }
    }

    private void adjustLabelPosition(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c911cd35", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        Log.e(TAG, String.format("will move label from (%d,%d,%d,%d) to (%f,%f,%f,%f)", Integer.valueOf(layoutParams.leftMargin), Integer.valueOf(layoutParams.topMargin), Integer.valueOf(layoutParams.leftMargin + getWidth()), Integer.valueOf(layoutParams.topMargin + getHeight()), Float.valueOf(layoutParams.leftMargin + f), Float.valueOf(layoutParams.topMargin + f2), Float.valueOf(layoutParams.leftMargin + f + getWidth()), Float.valueOf(layoutParams.topMargin + f2 + getHeight())));
        int i = layoutParams.leftMargin + ((int) f);
        int i2 = layoutParams.topMargin;
        int width = getWidth() + i;
        int height = getHeight() + i2;
        Rect isEnterForbidRegion = isEnterForbidRegion(i, i2, width, height);
        if (isEnterForbidRegion != null) {
            if (f < 0.0f) {
                i = mostLeft();
            } else {
                i = mostRight();
            }
            width = getWidth() + i;
            Log.e(TAG, String.format("[warning] (%d, %d, %d, %d) (%f, %f) enter horizontal forbid region->(%s)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(f), Float.valueOf(f2), isEnterForbidRegion.toShortString()));
        }
        int i3 = (int) (layoutParams.topMargin + f2);
        int height2 = getHeight() + i3;
        Rect isEnterForbidRegion2 = isEnterForbidRegion(i, i3, width, height2);
        if (isEnterForbidRegion2 != null) {
            int i4 = layoutParams.topMargin;
            height2 = getHeight() + i4;
            Log.e(TAG, String.format("[warning] (%d, %d, %d, %d) (%f, %f) enter vertical forbid region->(%s)", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(width), Integer.valueOf(height2), Float.valueOf(f), Float.valueOf(f2), isEnterForbidRegion2.toShortString()));
            i3 = i4;
        }
        Log.e(TAG, String.format("getHeight = (%d)", Integer.valueOf(getMeasuredHeight())));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
        Log.e("TextLabelTOUCH", String.format("isLeft=%b, getLeft,Right=%d_%d, labelRegionLeft,Right=%d_%d, txtWidth=%d, texOriginWith=%d", Boolean.valueOf(isLeftDirection(this.mLabelData.direction)), Integer.valueOf(getLeft()), Integer.valueOf(getRight()), Integer.valueOf(this.mParent.getLabelRegion().left), Integer.valueOf(this.mParent.getLabelRegion().right), Integer.valueOf(this.mLabelTextView.getWidth()), Integer.valueOf(this.mOriginTextWidth)));
        layoutParams2.leftMargin = i;
        layoutParams2.topMargin = i3;
        checkOutOfRange(layoutParams2, getWidth());
        this.mCurrentPosition.set(i, i3, width, height2);
        if (!this.mIsInDeleteRegion && this.mParent.getDeleteRegion() != null && this.mParent.getDeleteRegion().contains(this.mCurrentPosition.centerX(), this.mCurrentPosition.centerY())) {
            cjc cjcVar = this.mListener;
            if (cjcVar != null) {
                cjcVar.e(this.mLabelData);
            }
            this.mIsInDeleteRegion = true;
        } else if (this.mIsInDeleteRegion && this.mParent.getDeleteRegion() != null && !this.mParent.getDeleteRegion().contains(this.mCurrentPosition.centerX(), this.mCurrentPosition.centerY())) {
            cjc cjcVar2 = this.mListener;
            if (cjcVar2 != null) {
                cjcVar2.a(this.mLabelData);
            }
            this.mIsInDeleteRegion = false;
        }
        setLayoutParams(layoutParams2);
    }
}
