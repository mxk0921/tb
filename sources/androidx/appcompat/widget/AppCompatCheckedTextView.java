package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckedTextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t21;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatCheckedTextViewHelper mCheckedHelper;
    private final AppCompatTextHelper mTextHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatCheckedTextView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mCheckMarkTintId;
        private int mCheckMarkTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            int mapObject;
            int mapObject2;
            int mapObject3;
            int mapObject4;
            int mapObject5;
            int mapObject6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ddac953", new Object[]{this, propertyMapper});
                return;
            }
            mapObject = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintId = mapObject;
            mapObject2 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mBackgroundTintModeId = mapObject2;
            mapObject3 = propertyMapper.mapObject("checkMarkTint", R.attr.checkMarkTint);
            this.mCheckMarkTintId = mapObject3;
            mapObject4 = propertyMapper.mapObject("checkMarkTintMode", R.attr.checkMarkTintMode);
            this.mCheckMarkTintModeId = mapObject4;
            mapObject5 = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.mDrawableTintId = mapObject5;
            mapObject6 = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.mDrawableTintModeId = mapObject6;
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatCheckedTextView appCompatCheckedTextView, PropertyReader propertyReader) {
            ColorStateList compoundDrawableTintList;
            PorterDuff.Mode compoundDrawableTintMode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("237df537", new Object[]{this, appCompatCheckedTextView, propertyReader});
            } else if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatCheckedTextView.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatCheckedTextView.getBackgroundTintMode());
                propertyReader.readObject(this.mCheckMarkTintId, appCompatCheckedTextView.getCheckMarkTintList());
                propertyReader.readObject(this.mCheckMarkTintModeId, appCompatCheckedTextView.getCheckMarkTintMode());
                int i = this.mDrawableTintId;
                compoundDrawableTintList = appCompatCheckedTextView.getCompoundDrawableTintList();
                propertyReader.readObject(i, compoundDrawableTintList);
                int i2 = this.mDrawableTintModeId;
                compoundDrawableTintMode = appCompatCheckedTextView.getCompoundDrawableTintMode();
                propertyReader.readObject(i2, compoundDrawableTintMode);
            } else {
                throw t21.a();
            }
        }
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatEmojiTextHelper) ipChange.ipc$dispatch("5beb3cb7", new Object[]{this});
        }
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    public static /* synthetic */ Object ipc$super(AppCompatCheckedTextView appCompatCheckedTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1919838530:
                super.setBackgroundResource(((Number) objArr[0]).intValue());
                return null;
            case -1741850347:
                return super.getCustomSelectionActionModeCallback();
            case -1162739065:
                return super.onCreateInputConnection((EditorInfo) objArr[0]);
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 714889707:
                super.setCompoundDrawablesRelative((Drawable) objArr[0], (Drawable) objArr[1], (Drawable) objArr[2], (Drawable) objArr[3]);
                return null;
            case 935095605:
                super.setTextAppearance((Context) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 945148159:
                super.setCompoundDrawables((Drawable) objArr[0], (Drawable) objArr[1], (Drawable) objArr[2], (Drawable) objArr[3]);
                return null;
            case 1428060828:
                super.setCheckMarkDrawable((Drawable) objArr[0]);
                return null;
            case 1511089287:
                super.setCustomSelectionActionModeCallback((ActionMode.Callback) objArr[0]);
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            case 1993368013:
                super.setAllCaps(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/AppCompatCheckedTextView");
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.applyCheckMarkTint();
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

    @Override // androidx.core.widget.TintableCheckedTextView
    public ColorStateList getSupportCheckMarkTintList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("a5dac158", new Object[]{this});
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.getSupportCheckMarkTintList();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PorterDuff.Mode) ipChange.ipc$dispatch("c017b840", new Object[]{this});
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.getSupportCheckMarkTintMode();
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
        return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551e7a9c", new Object[]{this, drawable});
            return;
        }
        super.setCheckMarkDrawable(drawable);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.onSetCheckMarkDrawable();
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

    @Override // androidx.core.widget.TintableCheckedTextView
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84893646", new Object[]{this, colorStateList});
            return;
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.setSupportCheckMarkTintList(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bec9958", new Object[]{this, mode});
            return;
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.mCheckedHelper;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.setSupportCheckMarkTintMode(mode);
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

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        appCompatTextHelper.applyCompoundDrawablesTints();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = new AppCompatCheckedTextViewHelper(this);
        this.mCheckedHelper = appCompatCheckedTextViewHelper;
        appCompatCheckedTextViewHelper.loadFromAttributes(attributeSet, i);
        getEmojiTextViewHelper().loadFromAttributes(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae552e8b", new Object[]{this, new Integer(i)});
        } else {
            setCheckMarkDrawable(AppCompatResources.getDrawable(getContext(), i));
        }
    }
}
