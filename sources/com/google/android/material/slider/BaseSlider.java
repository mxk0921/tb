package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tooltip.TooltipDrawable;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.bai;
import tb.dfw;
import tb.f7l;
import tb.ffw;
import tb.ofg;
import tb.ogw;
import tb.qd7;
import tb.qy1;
import tb.ry1;
import tb.u9i;
import tb.xot;
import tb.zx7;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends qy1<S>, T extends ry1<S>> extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private static final String WARNING_FLOATING_POINT_ERRROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.";
    private BaseSlider<S, L, T>.b accessibilityEventSender;
    private final c accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final Paint activeTicksPaint;
    private final Paint activeTrackPaint;
    private final List<L> changeListeners;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private ofg formatter;
    private ColorStateList haloColor;
    private final Paint haloPaint;
    private int haloRadius;
    private final Paint inactiveTicksPaint;
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private final d labelMaker;
    private int labelPadding;
    private final List<TooltipDrawable> labels;
    private MotionEvent lastEvent;
    private final int scaledTouchSlop;
    private float stepSize;
    private final MaterialShapeDrawable thumbDrawable;
    private boolean thumbIsPressed;
    private final Paint thumbPaint;
    private int thumbRadius;
    private ColorStateList tickColorActive;
    private ColorStateList tickColorInactive;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final List<T> touchListeners;
    private float touchPosition;
    private ColorStateList trackColorActive;
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackSidePadding;
    private int trackTop;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Parcelable.Creator<SliderState> {
            /* renamed from: a */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, null);
            }

            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AttributeSet f5127a;
        public final /* synthetic */ int b;

        public a(AttributeSet attributeSet, int i) {
            this.f5127a = attributeSet;
            this.b = i;
        }

        public TooltipDrawable a() {
            BaseSlider baseSlider = BaseSlider.this;
            TypedArray h = xot.h(baseSlider.getContext(), this.f5127a, R.styleable.Slider, this.b, BaseSlider.DEF_STYLE_RES, new int[0]);
            TooltipDrawable parseLabelDrawable = BaseSlider.parseLabelDrawable(baseSlider.getContext(), h);
            h.recycle();
            return parseLabelDrawable;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c extends ExploreByTouchHelper {
        public final BaseSlider<?, ?, ?> e;
        public final Rect f = new Rect();

        public c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.e = baseSlider;
        }

        public final String a(int i) {
            BaseSlider<?, ?, ?> baseSlider = this.e;
            if (i == baseSlider.getValues().size() - 1) {
                return baseSlider.getContext().getString(R.string.material_slider_range_end);
            }
            if (i == 0) {
                return baseSlider.getContext().getString(R.string.material_slider_range_start);
            }
            return "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            int i = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.e;
                if (i >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.f;
                baseSlider.updateBoundsForVirturalViewId(i, rect);
                if (rect.contains((int) f, (int) f2)) {
                    return i;
                }
                i++;
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 0; i < this.e.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            BaseSlider<?, ?, ?> baseSlider = this.e;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float calculateStepIncrement = baseSlider.calculateStepIncrement(20);
                if (i2 == 8192) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (baseSlider.isRtl()) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (!baseSlider.snapThumbToValue(i, MathUtils.clamp(baseSlider.getValues().get(i).floatValue() + calculateStepIncrement, baseSlider.getValueFrom(), baseSlider.getValueTo()))) {
                    return false;
                }
                baseSlider.updateHaloHotspot();
                baseSlider.postInvalidate();
                invalidateVirtualView(i);
                return true;
            } else if (i2 != 16908349 || bundle == null || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || !baseSlider.snapThumbToValue(i, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                return false;
            } else {
                baseSlider.updateHaloHotspot();
                baseSlider.postInvalidate();
                invalidateVirtualView(i);
                return true;
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            BaseSlider<?, ?, ?> baseSlider = this.e;
            List<Float> values = baseSlider.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb.append(baseSlider.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(a(i));
                sb.append(baseSlider.formatValue(floatValue));
            }
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            Rect rect = this.f;
            baseSlider.updateBoundsForVirturalViewId(i, rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface d {
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.w0(ogw.d(this));
    }

    private Float calculateIncrementForKey(int i) {
        float f;
        if (this.isLongPress) {
            f = calculateStepIncrement(20);
        } else {
            f = calculateStepIncrement();
        }
        if (i == 21) {
            if (!isRtl()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 22) {
            if (isRtl()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 69) {
            return Float.valueOf(-f);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(f);
            }
            return null;
        }
    }

    private float calculateStepIncrement() {
        float f = this.stepSize;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    private void calculateTicksCoordinates() {
        validateConfigurationIfDirty();
        int min = Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / (this.trackHeight * 2)) + 1);
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != min * 2) {
            this.ticksCoordinates = new float[min * 2];
        }
        float f = this.trackWidth / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i] = this.trackSidePadding + ((i / 2) * f);
            fArr2[i + 1] = calculateTop();
        }
    }

    private int calculateTop() {
        int i = this.trackTop;
        int i2 = 0;
        if (this.labelBehavior == 1) {
            i2 = this.labels.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> subList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            subList.clear();
        }
        while (this.labels.size() < this.values.size()) {
            TooltipDrawable a2 = ((a) this.labelMaker).a();
            this.labels.add(a2);
            if (ViewCompat.isAttachedToWindow(this)) {
                attachLabelToContentView(a2);
            }
        }
        int i = 1;
        if (this.labels.size() == 1) {
            i = 0;
        }
        for (TooltipDrawable tooltipDrawable2 : this.labels) {
            tooltipDrawable2.i0(i);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ffw e = ogw.e(this);
        if (e != null) {
            ((dfw) e).b(tooltipDrawable);
            tooltipDrawable.s0(ogw.d(this));
        }
    }

    private void dispatchOnChangedFromUser(int i) {
        for (L l : this.changeListeners) {
            l.a(this, this.values.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            scheduleAccessibilityEventSender(i);
        }
    }

    private void dispatchOnChangedProgramatically() {
        for (L l : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void drawActiveTrack(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.trackSidePadding;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (activeRange[0] * f), f2, i3 + (activeRange[1] * f), f2, this.activeTrackPaint);
    }

    private void drawInactiveTrack(Canvas canvas, int i, int i2) {
        int i3;
        float[] activeRange = getActiveRange();
        float f = i;
        float f2 = this.trackSidePadding + (activeRange[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.inactiveTrackPaint);
        }
        int i4 = this.trackSidePadding;
        float f4 = i4 + (activeRange[0] * f);
        if (f4 > i4) {
            float f5 = i2;
            canvas.drawLine(i4, f5, f4, f5, this.inactiveTrackPaint);
        }
    }

    private void drawThumbs(Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.trackSidePadding + (normalizeValue(it.next().floatValue()) * i), i2, this.thumbRadius, this.thumbPaint);
            }
        }
        Iterator<Float> it2 = this.values.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(it2.next().floatValue()) * i));
            int i3 = this.thumbRadius;
            canvas.translate(normalizeValue - i3, i2 - i3);
            this.thumbDrawable.draw(canvas);
            canvas.restore();
        }
    }

    private void drawTicks(Canvas canvas) {
        float[] activeRange = getActiveRange();
        int pivotIndex = pivotIndex(this.ticksCoordinates, activeRange[0]);
        int pivotIndex2 = pivotIndex(this.ticksCoordinates, activeRange[1]);
        int i = pivotIndex * 2;
        canvas.drawPoints(this.ticksCoordinates, 0, i, this.inactiveTicksPaint);
        int i2 = pivotIndex2 * 2;
        canvas.drawPoints(this.ticksCoordinates, i, i2 - i, this.activeTicksPaint);
        float[] fArr = this.ticksCoordinates;
        canvas.drawPoints(fArr, i2, fArr.length - i2, this.inactiveTicksPaint);
    }

    private void ensureLabels() {
        if (this.labelBehavior != 2) {
            Iterator<TooltipDrawable> it = this.labels.iterator();
            for (int i = 0; i < this.values.size() && it.hasNext(); i++) {
                if (i != this.focusedThumbIdx) {
                    setValueForLabel(it.next(), this.values.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
                return;
            }
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
        }
    }

    private void focusThumbOnFocusGained(int i) {
        if (i == 1) {
            moveFocus(Integer.MAX_VALUE);
        } else if (i == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i == 17) {
            moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        } else if (i == 66) {
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f) {
        String str;
        if (!hasLabelFormatter()) {
            if (((int) f) == f) {
                str = "%.0f";
            } else {
                str = "%.2f";
            }
            return String.format(str, Float.valueOf(f));
        }
        throw null;
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.values.size() == 1) {
            floatValue2 = this.valueFrom;
        }
        float normalizeValue = normalizeValue(floatValue2);
        float normalizeValue2 = normalizeValue(floatValue);
        return isRtl() ? new float[]{normalizeValue2, normalizeValue} : new float[]{normalizeValue, normalizeValue2};
    }

    private float getClampedValue(int i, float f) {
        float f2;
        float f3;
        int i2 = i + 1;
        if (i2 >= this.values.size()) {
            f2 = this.valueTo;
        } else {
            f2 = this.values.get(i2).floatValue();
        }
        int i3 = i - 1;
        if (i3 < 0) {
            f3 = this.valueFrom;
        } else {
            f3 = this.values.get(i3).floatValue();
        }
        return MathUtils.clamp(f, f3, f2);
    }

    private int getColorForState(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float getValueOfTouchPosition() {
        double snapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            snapPosition = 1.0d - snapPosition;
        }
        float f = this.valueTo;
        float f2 = this.valueFrom;
        return (float) ((snapPosition * (f - f2)) + f2);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.touchPosition;
        if (isRtl()) {
            f = 1.0f - f;
        }
        float f2 = this.valueTo;
        float f3 = this.valueFrom;
        return (f * (f2 - f3)) + f3;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackHeight);
        this.activeTrackPaint.setStrokeWidth(this.trackHeight);
        this.inactiveTicksPaint.setStrokeWidth(this.trackHeight / 2.0f);
        this.activeTicksPaint.setStrokeWidth(this.trackHeight / 2.0f);
    }

    private boolean isInScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void loadResources(Resources resources) {
        this.widgetHeight = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        this.trackSidePadding = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.trackTop = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_top);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    private void maybeDrawHalo(Canvas canvas, int i, int i2) {
        if (shouldDrawCompatHalo()) {
            int normalizeValue = (int) (this.trackSidePadding + (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.haloRadius;
                canvas.clipRect(normalizeValue - i3, i2 - i3, normalizeValue + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(normalizeValue, i2, this.haloRadius, this.haloPaint);
        }
    }

    private boolean moveFocus(int i) {
        int i2 = this.focusedThumbIdx;
        int clamp = (int) MathUtils.clamp(i2 + i, 0L, this.values.size() - 1);
        this.focusedThumbIdx = clamp;
        if (clamp == i2) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = clamp;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i) {
        if (isRtl()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return moveFocus(i);
    }

    private float normalizeValue(float f) {
        float f2 = this.valueFrom;
        float f3 = (f - f2) / (this.valueTo - f2);
        if (isRtl()) {
            return 1.0f - f3;
        }
        return f3;
    }

    private Boolean onKeyDownNoActiveThumb(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        moveFocus(-1);
                        return Boolean.TRUE;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                moveFocusInAbsoluteDirection(-1);
                                return Boolean.TRUE;
                            case 22:
                                moveFocusInAbsoluteDirection(1);
                                return Boolean.TRUE;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                moveFocus(1);
                return Boolean.TRUE;
            }
            this.activeThumbIdx = this.focusedThumbIdx;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(moveFocus(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(moveFocus(-1));
            }
            return Boolean.FALSE;
        }
    }

    private void onStartTrackingTouch() {
        for (T t : this.touchListeners) {
            t.a(this);
        }
    }

    private void onStopTrackingTouch() {
        for (T t : this.touchListeners) {
            t.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TooltipDrawable parseLabelDrawable(Context context, TypedArray typedArray) {
        return TooltipDrawable.q0(context, null, 0, typedArray.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip));
    }

    private static int pivotIndex(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray h = xot.h(context, attributeSet, R.styleable.Slider, i, DEF_STYLE_RES, new int[0]);
        this.valueFrom = h.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = h.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        this.stepSize = h.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        int i4 = R.styleable.Slider_trackColor;
        boolean hasValue = h.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = R.styleable.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i4 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList a2 = u9i.a(context, h, i2);
        if (a2 == null) {
            a2 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a2);
        ColorStateList a3 = u9i.a(context, h, i4);
        if (a3 == null) {
            a3 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(a3);
        this.thumbDrawable.W(u9i.a(context, h, R.styleable.Slider_thumbColor));
        ColorStateList a4 = u9i.a(context, h, R.styleable.Slider_haloColor);
        if (a4 == null) {
            a4 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(a4);
        int i5 = R.styleable.Slider_tickColor;
        boolean hasValue2 = h.hasValue(i5);
        if (hasValue2) {
            i3 = i5;
        } else {
            i3 = R.styleable.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i5 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList a5 = u9i.a(context, h, i3);
        if (a5 == null) {
            a5 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a5);
        ColorStateList a6 = u9i.a(context, h, i5);
        if (a6 == null) {
            a6 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a6);
        setThumbRadius(h.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(h.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(h.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(h.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        this.labelBehavior = h.getInt(R.styleable.Slider_labelBehavior, 0);
        if (!h.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        h.recycle();
    }

    private void scheduleAccessibilityEventSender(int i) {
        BaseSlider<S, L, T>.b bVar = this.accessibilityEventSender;
        if (bVar == null) {
            this.accessibilityEventSender = new b(this, null);
        } else {
            removeCallbacks(bVar);
        }
        this.accessibilityEventSender.a(i);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.x0(formatValue(f));
        int normalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int calculateTop = calculateTop() - (this.labelPadding + this.thumbRadius);
        tooltipDrawable.setBounds(normalizeValue, calculateTop - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + normalizeValue, calculateTop);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        qd7.c(ogw.d(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ((dfw) ogw.e(this)).a(tooltipDrawable);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.values.size() != arrayList.size() || !this.values.equals(arrayList)) {
                this.values = arrayList;
                this.dirtyConfig = true;
                this.focusedThumbIdx = 0;
                updateHaloHotspot();
                createLabelPool();
                dispatchOnChangedProgramatically();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private boolean shouldDrawCompatHalo() {
        if (this.forceDrawCompatHalo || !(getBackground() instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    private boolean snapActiveThumbToValue(float f) {
        return snapThumbToValue(this.activeThumbIdx, f);
    }

    private double snapPosition(float f) {
        float f2 = this.stepSize;
        if (f2 <= 0.0f) {
            return f;
        }
        int i = (int) ((this.valueTo - this.valueFrom) / f2);
        return Math.round(f * i) / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i, float f) {
        if (Math.abs(f - this.values.get(i).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i, Float.valueOf(getClampedValue(i, f)));
        this.focusedThumbIdx = i;
        dispatchOnChangedFromUser(i);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (!shouldDrawCompatHalo() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int normalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding);
                int calculateTop = calculateTop();
                int i = this.haloRadius;
                DrawableCompat.setHotspotBounds(background, normalizeValue - i, calculateTop - i, normalizeValue + i, calculateTop + i);
            }
        }
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateStepSize() {
        if (this.stepSize > 0.0f && !valueLandsOnTick(this.valueTo)) {
            String f = Float.toString(this.stepSize);
            String f2 = Float.toString(this.valueFrom);
            String f3 = Float.toString(this.valueTo);
            throw new IllegalStateException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + f2 + ")-valueTo(" + f3 + ") range");
        }
    }

    private void validateValueFrom() {
        if (this.valueFrom >= this.valueTo) {
            String f = Float.toString(this.valueFrom);
            String f2 = Float.toString(this.valueTo);
            throw new IllegalStateException("valueFrom(" + f + ") must be smaller than valueTo(" + f2 + f7l.BRACKET_END_STR);
        }
    }

    private void validateValueTo() {
        if (this.valueTo <= this.valueFrom) {
            String f = Float.toString(this.valueTo);
            String f2 = Float.toString(this.valueFrom);
            throw new IllegalStateException("valueTo(" + f + ") must be greater than valueFrom(" + f2 + f7l.BRACKET_END_STR);
        }
    }

    private void validateValues() {
        Iterator<Float> it = this.values.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.valueFrom || next.floatValue() > this.valueTo) {
                String f = Float.toString(next.floatValue());
                String f2 = Float.toString(this.valueFrom);
                String f3 = Float.toString(this.valueTo);
                throw new IllegalStateException("Slider value(" + f + ") must be greater or equal to valueFrom(" + f2 + "), and lower or equal to valueTo(" + f3 + f7l.BRACKET_END_STR);
            } else if (this.stepSize > 0.0f && !valueLandsOnTick(next.floatValue())) {
                String f4 = Float.toString(next.floatValue());
                String f5 = Float.toString(this.valueFrom);
                String f6 = Float.toString(this.stepSize);
                String f7 = Float.toString(this.stepSize);
                throw new IllegalStateException("Value(" + f4 + ") must be equal to valueFrom(" + f5 + ") plus a multiple of stepSize(" + f6 + ") when using stepSize(" + f7 + f7l.BRACKET_END_STR);
            }
        }
    }

    private boolean valueLandsOnTick(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.valueFrom))).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < THRESHOLD) {
            return true;
        }
        return false;
    }

    private float valueToX(float f) {
        return (normalizeValue(f) * this.trackWidth) + this.trackSidePadding;
    }

    private void warnAboutFloatingPointError() {
        float f = this.stepSize;
        if (f != 0.0f) {
            if (((int) f) != f) {
                StringBuilder sb = new StringBuilder("Floating point value used for stepSize(");
                sb.append(f);
                sb.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.");
            }
            float f2 = this.valueFrom;
            if (((int) f2) != f2) {
                StringBuilder sb2 = new StringBuilder("Floating point value used for valueFrom(");
                sb2.append(f2);
                sb2.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.");
            }
            float f3 = this.valueTo;
            if (((int) f3) != f3) {
                StringBuilder sb3 = new StringBuilder("Floating point value used for valueTo(");
                sb3.append(f3);
                sb3.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.");
            }
        }
    }

    public void addOnChangeListener(L l) {
        this.changeListeners.add(l);
    }

    public void addOnSliderTouchListener(T t) {
        this.touchListeners.add(t);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.thumbDrawable.isStateful()) {
            this.thumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    public void forceDrawCompatHalo(boolean z) {
        this.forceDrawCompatHalo = z;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    public int getHaloRadius() {
        return this.haloRadius;
    }

    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.thumbDrawable.w();
    }

    public int getThumbRadius() {
        return this.thumbRadius;
    }

    public ColorStateList getThumbTintList() {
        return this.thumbDrawable.x();
    }

    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    public int getTrackHeight() {
        return this.trackHeight;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return false;
    }

    public final boolean isRtl() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (TooltipDrawable tooltipDrawable : this.labels) {
            attachLabelToContentView(tooltipDrawable);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.b bVar = this.accessibilityEventSender;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        for (TooltipDrawable tooltipDrawable : this.labels) {
            detachLabelFromContentView(tooltipDrawable);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            if (this.stepSize > 0.0f) {
                calculateTicksCoordinates();
            }
        }
        super.onDraw(canvas);
        int calculateTop = calculateTop();
        drawInactiveTrack(canvas, this.trackWidth, calculateTop);
        if (((Float) Collections.max(getValues())).floatValue() > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, calculateTop);
        }
        if (this.stepSize > 0.0f) {
            drawTicks(canvas);
        }
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawHalo(canvas, this.trackWidth, calculateTop);
            if (this.activeThumbIdx != -1) {
                ensureLabels();
            }
        }
        drawThumbs(canvas, this.trackWidth, calculateTop);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.activeThumbIdx = -1;
            for (TooltipDrawable tooltipDrawable : this.labels) {
                ((dfw) ogw.e(this)).b(tooltipDrawable);
            }
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
            return;
        }
        focusThumbOnFocusGained(i);
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean onKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i, keyEvent);
            if (onKeyDownNoActiveThumb != null) {
                return onKeyDownNoActiveThumb.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float calculateIncrementForKey = calculateIncrementForKey(i);
        if (calculateIncrementForKey != null) {
            if (snapActiveThumbToValue(this.values.get(this.activeThumbIdx).floatValue() + calculateIncrementForKey.floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return moveFocus(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return moveFocus(-1);
                }
                return false;
            }
        }
        this.activeThumbIdx = -1;
        for (TooltipDrawable tooltipDrawable : this.labels) {
            ((dfw) ogw.e(this)).b(tooltipDrawable);
        }
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.widgetHeight;
        int i4 = 0;
        if (this.labelBehavior == 1) {
            i4 = this.labels.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
        dispatchOnChangedProgramatically();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.trackWidth = Math.max(i - (this.trackSidePadding * 2), 0);
        if (this.stepSize > 0.0f) {
            calculateTicksCoordinates();
        }
        updateHaloHotspot();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f;
        float max = Math.max(0.0f, f);
        this.touchPosition = max;
        this.touchPosition = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownX = x;
            if (!isInScrollingContainer()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                    onStartTrackingTouch();
                }
            }
        } else if (actionMasked == 1) {
            this.thumbIsPressed = false;
            MotionEvent motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop) {
                pickActiveThumb();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                this.activeThumbIdx = -1;
            }
            for (TooltipDrawable tooltipDrawable : this.labels) {
                ((dfw) ogw.e(this)).b(tooltipDrawable);
            }
            onStopTrackingTouch();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.thumbIsPressed) {
                if (Math.abs(x - this.touchDownX) < this.scaledTouchSlop) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                onStartTrackingTouch();
            }
            if (pickActiveThumb()) {
                this.thumbIsPressed = true;
                snapTouchPosition();
                updateHaloHotspot();
                invalidate();
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    public boolean pickActiveThumb() {
        boolean z;
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float valueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float abs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.values.size(); i++) {
            float abs2 = Math.abs(this.values.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float valueToX2 = valueToX(this.values.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!isRtl() ? valueToX2 - valueToX >= 0.0f : valueToX2 - valueToX <= 0.0f) {
                z = false;
            } else {
                z = true;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.activeThumbIdx = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(valueToX2 - valueToX) < this.scaledTouchSlop) {
                    this.activeThumbIdx = -1;
                    return false;
                } else if (z) {
                    this.activeThumbIdx = i;
                }
            }
            abs = abs2;
        }
        if (this.activeThumbIdx != -1) {
            return true;
        }
        return false;
    }

    public void removeOnChangeListener(L l) {
        this.changeListeners.remove(l);
    }

    public void removeOnSliderTouchListener(T t) {
        this.touchListeners.remove(t);
    }

    public void setActiveThumbIndex(int i) {
        this.activeThumbIdx = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setHaloRadius(int i) {
        if (i != this.haloRadius) {
            this.haloRadius = i;
            Drawable background = getBackground();
            if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                zx7.a((RippleDrawable) background, this.haloRadius);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.haloColor)) {
            this.haloColor = colorStateList;
            Drawable background = getBackground();
            if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
                this.haloPaint.setColor(getColorForState(colorStateList));
                this.haloPaint.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.labelBehavior != i) {
            this.labelBehavior = i;
            requestLayout();
        }
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            String f2 = Float.toString(f);
            String f3 = Float.toString(this.valueFrom);
            String f4 = Float.toString(this.valueTo);
            throw new IllegalArgumentException("The stepSize(" + f2 + ") must be 0, or a factor of the valueFrom(" + f3 + ")-valueTo(" + f4 + ") range");
        } else if (this.stepSize != f) {
            this.stepSize = f;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.thumbDrawable.V(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i != this.thumbRadius) {
            this.thumbRadius = i;
            MaterialShapeDrawable materialShapeDrawable = this.thumbDrawable;
            a.b a2 = com.google.android.material.shape.a.a();
            a2.p(0, this.thumbRadius);
            materialShapeDrawable.setShapeAppearanceModel(a2.m());
            MaterialShapeDrawable materialShapeDrawable2 = this.thumbDrawable;
            int i2 = this.thumbRadius * 2;
            materialShapeDrawable2.setBounds(0, 0, i2, i2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.thumbDrawable.W(colorStateList);
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.tickColorActive)) {
            this.tickColorActive = colorStateList;
            this.activeTicksPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.tickColorInactive)) {
            this.tickColorInactive = colorStateList;
            this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.trackColorActive)) {
            this.trackColorActive = colorStateList;
            this.activeTrackPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.trackHeight != i) {
            this.trackHeight = i;
            invalidateTrack();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.trackColorInactive)) {
            this.trackColorInactive = colorStateList;
            this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.valueFrom = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.valueTo = f;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void updateBoundsForVirturalViewId(int i, Rect rect) {
        int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i).floatValue()) * this.trackWidth));
        int calculateTop = calculateTop();
        int i2 = this.thumbRadius;
        rect.set(normalizeValue - i2, calculateTop - i2, normalizeValue + i2, calculateTop + i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        int f5128a;

        private b() {
            this.f5128a = -1;
        }

        public void a(int i) {
            this.f5128a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.f5128a, 4);
        }

        public /* synthetic */ b(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i) {
        float f;
        float f2;
        float calculateStepIncrement = calculateStepIncrement();
        return (this.valueTo - this.valueFrom) / calculateStepIncrement <= i ? calculateStepIncrement : Math.round(f / f2) * calculateStepIncrement;
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(bai.c(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.isLongPress = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.thumbDrawable = materialShapeDrawable;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.inactiveTrackPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.activeTrackPaint = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.thumbPaint = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.haloPaint = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.inactiveTicksPaint = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.activeTicksPaint = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        loadResources(context2.getResources());
        this.labelMaker = new a(attributeSet, i);
        processAttributes(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.d0(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.accessibilityHelper = cVar;
        ViewCompat.setAccessibilityDelegate(this, cVar);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.values.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setLabelFormatter(ofg ofgVar) {
    }
}
