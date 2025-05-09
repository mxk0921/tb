package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.IntFunction;
import tb.t21;
import tb.w31;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatTextView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mAutoSizeMaxTextSizeId;
        private int mAutoSizeMinTextSizeId;
        private int mAutoSizeStepGranularityId;
        private int mAutoSizeTextTypeId;
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            int mapInt;
            int mapInt2;
            int mapInt3;
            int mapIntEnum;
            int mapObject;
            int mapObject2;
            int mapObject3;
            int mapObject4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ddac953", new Object[]{this, propertyMapper});
                return;
            }
            mapInt = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
            this.mAutoSizeMaxTextSizeId = mapInt;
            mapInt2 = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
            this.mAutoSizeMinTextSizeId = mapInt2;
            mapInt3 = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
            this.mAutoSizeStepGranularityId = mapInt3;
            mapIntEnum = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new IntFunction<String>() { // from class: androidx.appcompat.widget.AppCompatTextView.InspectionCompanion.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.function.IntFunction
                public String apply(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("31a0b5b2", new Object[]{this, new Integer(i)});
                    }
                    if (i == 0) {
                        return "none";
                    }
                    if (i != 1) {
                        return String.valueOf(i);
                    }
                    return "uniform";
                }
            });
            this.mAutoSizeTextTypeId = mapIntEnum;
            mapObject = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintId = mapObject;
            mapObject2 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mBackgroundTintModeId = mapObject2;
            mapObject3 = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.mDrawableTintId = mapObject3;
            mapObject4 = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.mDrawableTintModeId = mapObject4;
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatTextView appCompatTextView, PropertyReader propertyReader) {
            ColorStateList compoundDrawableTintList;
            PorterDuff.Mode compoundDrawableTintMode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("363a0812", new Object[]{this, appCompatTextView, propertyReader});
            } else if (this.mPropertiesMapped) {
                propertyReader.readInt(this.mAutoSizeMaxTextSizeId, appCompatTextView.getAutoSizeMaxTextSize());
                propertyReader.readInt(this.mAutoSizeMinTextSizeId, appCompatTextView.getAutoSizeMinTextSize());
                propertyReader.readInt(this.mAutoSizeStepGranularityId, appCompatTextView.getAutoSizeStepGranularity());
                propertyReader.readIntEnum(this.mAutoSizeTextTypeId, appCompatTextView.getAutoSizeTextType());
                propertyReader.readObject(this.mBackgroundTintId, appCompatTextView.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatTextView.getBackgroundTintMode());
                int i = this.mDrawableTintId;
                compoundDrawableTintList = appCompatTextView.getCompoundDrawableTintList();
                propertyReader.readObject(i, compoundDrawableTintList);
                int i2 = this.mDrawableTintModeId;
                compoundDrawableTintMode = appCompatTextView.getCompoundDrawableTintMode();
                propertyReader.readObject(i2, compoundDrawableTintMode);
            } else {
                throw t21.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface SuperCaller {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        TextClassifier getTextClassifier();

        void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i);

        void setAutoSizeTextTypeWithDefaults(int i);

        void setFirstBaselineToTopHeight(int i);

        void setLastBaselineToBottomHeight(int i);

        void setLineHeight(int i, float f);

        void setTextClassifier(TextClassifier textClassifier);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class SuperCallerApi26 implements SuperCaller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public SuperCallerApi26() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeMaxTextSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfa41f26", new Object[]{this})).intValue();
            }
            return AppCompatTextView.access$001(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeMinTextSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d742b14", new Object[]{this})).intValue();
            }
            return AppCompatTextView.access$101(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeStepGranularity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c7590b6", new Object[]{this})).intValue();
            }
            return AppCompatTextView.access$201(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int[] getAutoSizeTextAvailableSizes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("9c3b4281", new Object[]{this});
            }
            return AppCompatTextView.access$301(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeTextType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8d7ede7", new Object[]{this})).intValue();
            }
            return AppCompatTextView.access$401(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public TextClassifier getTextClassifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return w31.a(ipChange.ipc$dispatch("e77bd975", new Object[]{this}));
            }
            return AppCompatTextView.access$501(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d921dd5c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                AppCompatTextView.access$601(AppCompatTextView.this, i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d4273c", new Object[]{this, iArr, new Integer(i)});
            } else {
                AppCompatTextView.access$701(AppCompatTextView.this, iArr, i);
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeWithDefaults(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf2952b", new Object[]{this, new Integer(i)});
            } else {
                AppCompatTextView.access$801(AppCompatTextView.this, i);
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setFirstBaselineToTopHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8c6f34e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLastBaselineToBottomHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9e93a72", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLineHeight(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5d65e61", new Object[]{this, new Integer(i), new Float(f)});
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setTextClassifier(TextClassifier textClassifier) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccad2221", new Object[]{this, textClassifier});
            } else {
                AppCompatTextView.access$901(AppCompatTextView.this, textClassifier);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class SuperCallerApi28 extends SuperCallerApi26 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public SuperCallerApi28() {
            super();
        }

        public static /* synthetic */ Object ipc$super(SuperCallerApi28 superCallerApi28, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/AppCompatTextView$SuperCallerApi28");
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setFirstBaselineToTopHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8c6f34e", new Object[]{this, new Integer(i)});
            } else {
                AppCompatTextView.access$1001(AppCompatTextView.this, i);
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLastBaselineToBottomHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9e93a72", new Object[]{this, new Integer(i)});
            } else {
                AppCompatTextView.access$1101(AppCompatTextView.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class SuperCallerApi34 extends SuperCallerApi28 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public SuperCallerApi34() {
            super();
        }

        public static /* synthetic */ Object ipc$super(SuperCallerApi34 superCallerApi34, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/AppCompatTextView$SuperCallerApi34");
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLineHeight(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5d65e61", new Object[]{this, new Integer(i), new Float(f)});
            } else {
                AppCompatTextView.access$1201(AppCompatTextView.this, i, f);
            }
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$001(AppCompatTextView appCompatTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("658e0c0", new Object[]{appCompatTextView})).intValue();
        }
        return super.getAutoSizeMaxTextSize();
    }

    public static /* synthetic */ void access$1001(AppCompatTextView appCompatTextView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31aedec5", new Object[]{appCompatTextView, new Integer(i)});
        } else {
            super.setFirstBaselineToTopHeight(i);
        }
    }

    public static /* synthetic */ int access$101(AppCompatTextView appCompatTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34317b1f", new Object[]{appCompatTextView})).intValue();
        }
        return super.getAutoSizeMinTextSize();
    }

    public static /* synthetic */ void access$1101(AppCompatTextView appCompatTextView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bee99046", new Object[]{appCompatTextView, new Integer(i)});
        } else {
            super.setLastBaselineToBottomHeight(i);
        }
    }

    public static /* synthetic */ void access$1201(AppCompatTextView appCompatTextView, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38645ed9", new Object[]{appCompatTextView, new Integer(i), new Float(f)});
        } else {
            super.setLineHeight(i, f);
        }
    }

    public static /* synthetic */ int access$201(AppCompatTextView appCompatTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("620a157e", new Object[]{appCompatTextView})).intValue();
        }
        return super.getAutoSizeStepGranularity();
    }

    public static /* synthetic */ int[] access$301(AppCompatTextView appCompatTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6c734e3a", new Object[]{appCompatTextView});
        }
        return super.getAutoSizeTextAvailableSizes();
    }

    public static /* synthetic */ int access$401(AppCompatTextView appCompatTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdbb4a3c", new Object[]{appCompatTextView})).intValue();
        }
        return super.getAutoSizeTextType();
    }

    public static /* synthetic */ TextClassifier access$501(AppCompatTextView appCompatTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return w31.a(ipChange.ipc$dispatch("d4d4ff58", new Object[]{appCompatTextView}));
        }
        return super.getTextClassifier();
    }

    public static /* synthetic */ void access$601(AppCompatTextView appCompatTextView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77dcc47", new Object[]{appCompatTextView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void access$701(AppCompatTextView appCompatTextView, int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e26a8f", new Object[]{appCompatTextView, iArr, new Integer(i)});
        } else {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    public static /* synthetic */ void access$801(AppCompatTextView appCompatTextView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9937de", new Object[]{appCompatTextView, new Integer(i)});
        } else {
            super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static /* synthetic */ void access$901(AppCompatTextView appCompatTextView, TextClassifier textClassifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6786380e", new Object[]{appCompatTextView, textClassifier});
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    private void consumeTextFutureAndSetBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13ac073", new Object[]{this});
            return;
        }
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.setPrecomputedText(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatEmojiTextHelper) ipChange.ipc$dispatch("5beb3cb7", new Object[]{this});
        }
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public static /* synthetic */ Object ipc$super(AppCompatTextView appCompatTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1919838530:
                super.setBackgroundResource(((Number) objArr[0]).intValue());
                return null;
            case -1794512291:
                super.setTypeface((Typeface) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1741850347:
                return super.getCustomSelectionActionModeCallback();
            case -1673837951:
                return super.getAutoSizeTextAvailableSizes();
            case -1653331180:
                return new Integer(super.getAutoSizeMinTextSize());
            case -1244242335:
                super.setLineHeight(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -1175897486:
                super.setLastBaselineToBottomHeight(((Number) objArr[0]).intValue());
                return null;
            case -1162739065:
                return super.onCreateInputConnection((EditorInfo) objArr[0]);
            case -861068767:
                super.setTextClassifier(w31.a(objArr[0]));
                return null;
            case -652092068:
                super.setAutoSizeTextTypeUniformWithConfiguration(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case -542892250:
                return new Integer(super.getAutoSizeMaxTextSize());
            case -411313803:
                return super.getTextClassifier();
            case -389614770:
                super.setFirstBaselineToTopHeight(((Number) objArr[0]).intValue());
                return null;
            case -260017868:
                super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -197017577:
                super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) objArr[0], (Drawable) objArr[1], (Drawable) objArr[2], (Drawable) objArr[3]);
                return null;
            case 4439940:
                super.setFilters((InputFilter[]) objArr[0]);
                return null;
            case 87271555:
                super.setCompoundDrawablesWithIntrinsicBounds((Drawable) objArr[0], (Drawable) objArr[1], (Drawable) objArr[2], (Drawable) objArr[3]);
                return null;
            case 148368871:
                return new Integer(super.getAutoSizeTextType());
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 669999056:
                return super.getText();
            case 714889707:
                super.setCompoundDrawablesRelative((Drawable) objArr[0], (Drawable) objArr[1], (Drawable) objArr[2], (Drawable) objArr[3]);
                return null;
            case 935095605:
                super.setTextAppearance((Context) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 945148159:
                super.setCompoundDrawables((Drawable) objArr[0], (Drawable) objArr[1], (Drawable) objArr[2], (Drawable) objArr[3]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1511089287:
                super.setCustomSelectionActionModeCallback((ActionMode.Callback) objArr[0]);
                return null;
            case 1551208630:
                return new Integer(super.getAutoSizeStepGranularity());
            case 1559401771:
                super.setAutoSizeTextTypeWithDefaults(((Number) objArr[0]).intValue());
                return null;
            case 1641293628:
                super.setAutoSizeTextTypeUniformWithPresetSizes((int[]) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1731819568:
                super.onTextChanged((CharSequence) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            case 1993368013:
                super.setAllCaps(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/AppCompatTextView");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMaxTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfa41f26", new Object[]{this})).intValue();
        }
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeMaxTextSize();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d742b14", new Object[]{this})).intValue();
        }
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeMinTextSize();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c7590b6", new Object[]{this})).intValue();
        }
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeStepGranularity();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9c3b4281", new Object[]{this});
        }
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d7ede7", new Object[]{this})).intValue();
        }
        if (!ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
            if (appCompatTextHelper != null) {
                return appCompatTextHelper.getAutoSizeTextType();
            }
            return 0;
        } else if (getSuperCaller().getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionMode.Callback) ipChange.ipc$dispatch("982d7915", new Object[]{this});
        }
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ea9673c", new Object[]{this})).intValue();
        }
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71c3e98", new Object[]{this})).intValue();
        }
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    public SuperCaller getSuperCaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SuperCaller) ipChange.ipc$dispatch("bdc8d10a", new Object[]{this});
        }
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new SuperCallerApi34();
            } else if (i >= 28) {
                this.mSuperCaller = new SuperCallerApi28();
            } else if (i >= 26) {
                this.mSuperCaller = new SuperCallerApi26();
            }
        }
        return this.mSuperCaller;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("922e88ad", new Object[]{this});
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintList();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("43ef50d5", new Object[]{this});
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintMode();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public ColorStateList getSupportCompoundDrawablesTintList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("c33dbd83", new Object[]{this});
        }
        return this.mTextHelper.getCompoundDrawableTintList();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("e3d1c32b", new Object[]{this});
        }
        return this.mTextHelper.getCompoundDrawableTintMode();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
        }
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return w31.a(ipChange.ipc$dispatch("e77bd975", new Object[]{this}));
        }
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            return getSuperCaller().getTextClassifier();
        }
        return appCompatTextClassifierHelper.getTextClassifier();
    }

    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrecomputedTextCompat.Params) ipChange.ipc$dispatch("7a2b753d", new Object[]{this});
        }
        return TextViewCompat.getTextMetricsParams(this);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7057c88e", new Object[]{this})).booleanValue();
        }
        return getEmojiTextViewHelper().isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputConnection) ipChange.ipc$dispatch("bab20287", new Object[]{this, editorInfo});
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.populateSurroundingTextIfNeeded(this, onCreateInputConnection, editorInfo);
        return AppCompatHintHelper.onCreateInputConnection(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null && !ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && appCompatTextHelper.isAutoSizeEnabled()) {
            this.mTextHelper.autoSizeText();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setAllCaps(z);
        getEmojiTextViewHelper().setAllCaps(z);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d921dd5c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else {
            AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
            if (appCompatTextHelper != null) {
                appCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            }
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d4273c", new Object[]{this, iArr, new Integer(i)});
        } else if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else {
            AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
            if (appCompatTextHelper != null) {
                appCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            }
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf2952b", new Object[]{this, new Integer(i)});
        } else if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i);
        } else {
            AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
            if (appCompatTextHelper != null) {
                appCompatTextHelper.setAutoSizeTextTypeWithDefaults(i);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
            return;
        }
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9196be", new Object[]{this, new Integer(i)});
            return;
        }
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3855d0ff", new Object[]{this, drawable, drawable2, drawable3, drawable4});
            return;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9c59eb", new Object[]{this, drawable, drawable2, drawable3, drawable4});
            return;
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f441c017", new Object[]{this, drawable, drawable2, drawable3, drawable4});
            return;
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533a883", new Object[]{this, drawable, drawable2, drawable3, drawable4});
            return;
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a116487", new Object[]{this, callback});
        } else {
            super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
        }
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a82ad52", new Object[]{this, new Boolean(z)});
        } else {
            getEmojiTextViewHelper().setEnabled(z);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bf84", new Object[]{this, inputFilterArr});
        } else {
            super.setFilters(getEmojiTextViewHelper().getFilters(inputFilterArr));
        }
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c6f34e", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.setFirstBaselineToTopHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e93a72", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.setLastBaselineToBottomHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5030313f", new Object[]{this, new Integer(i)});
        } else {
            TextViewCompat.setLineHeight(this, i);
        }
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b1ebaa", new Object[]{this, precomputedTextCompat});
        } else {
            TextViewCompat.setPrecomputedText(this, precomputedTextCompat);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac460f9", new Object[]{this, colorStateList});
            return;
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a848d4cb", new Object[]{this, mode});
            return;
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329df37b", new Object[]{this, colorStateList});
            return;
        }
        this.mTextHelper.setCompoundDrawableTintList(colorStateList);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f091fcd", new Object[]{this, mode});
            return;
        }
        this.mTextHelper.setCompoundDrawableTintMode(mode);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37bc6d35", new Object[]{this, context, new Integer(i)});
            return;
        }
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetTextAppearance(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccad2221", new Object[]{this, textClassifier});
        } else if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            getSuperCaller().setTextClassifier(textClassifier);
        } else {
            appCompatTextClassifierHelper.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6040e32d", new Object[]{this, future});
            return;
        }
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3192da9b", new Object[]{this, params});
        } else {
            TextViewCompat.setTextMetricsParams(this, params);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
        } else if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i, f);
        } else {
            AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
            if (appCompatTextHelper != null) {
                appCompatTextHelper.setTextSize(i, f);
            }
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
        } else if (!this.mIsSetTypefaceProcessing) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                typeface2 = TypefaceCompat.create(getContext(), typeface, i);
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setLineHeight(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d65e61", new Object[]{this, new Integer(i), new Float(f)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().setLineHeight(i, f);
        } else {
            TextViewCompat.setLineHeight(this, i, f);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        ThemeUtils.checkAppCompatTheme(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        appCompatTextHelper.applyCompoundDrawablesTints();
        this.mTextClassifierHelper = new AppCompatTextClassifierHelper(this);
        getEmojiTextViewHelper().loadFromAttributes(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852b2ac7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        Context context = getContext();
        Drawable drawable = null;
        Drawable drawable2 = i != 0 ? AppCompatResources.getDrawable(context, i) : null;
        Drawable drawable3 = i2 != 0 ? AppCompatResources.getDrawable(context, i2) : null;
        Drawable drawable4 = i3 != 0 ? AppCompatResources.getDrawable(context, i3) : null;
        if (i4 != 0) {
            drawable = AppCompatResources.getDrawable(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d81533", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        Context context = getContext();
        Drawable drawable = null;
        Drawable drawable2 = i != 0 ? AppCompatResources.getDrawable(context, i) : null;
        Drawable drawable3 = i2 != 0 ? AppCompatResources.getDrawable(context, i2) : null;
        Drawable drawable4 = i3 != 0 ? AppCompatResources.getDrawable(context, i3) : null;
        if (i4 != 0) {
            drawable = AppCompatResources.getDrawable(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }
}
