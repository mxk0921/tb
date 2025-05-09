package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t21;
import tb.w31;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppCompatEditText extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior, EmojiCompatConfigurationView, TintableCompoundDrawablesView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatEditText> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            int mapObject;
            int mapObject2;
            int mapObject3;
            int mapObject4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ddac953", new Object[]{this, propertyMapper});
                return;
            }
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

        public void readProperties(AppCompatEditText appCompatEditText, PropertyReader propertyReader) {
            ColorStateList compoundDrawableTintList;
            PorterDuff.Mode compoundDrawableTintMode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("953596b7", new Object[]{this, appCompatEditText, propertyReader});
            } else if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatEditText.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatEditText.getBackgroundTintMode());
                int i = this.mDrawableTintId;
                compoundDrawableTintList = appCompatEditText.getCompoundDrawableTintList();
                propertyReader.readObject(i, compoundDrawableTintList);
                int i2 = this.mDrawableTintModeId;
                compoundDrawableTintMode = appCompatEditText.getCompoundDrawableTintMode();
                propertyReader.readObject(i2, compoundDrawableTintMode);
            } else {
                throw t21.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class SuperCaller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public SuperCaller() {
        }

        public TextClassifier getTextClassifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return w31.a(ipChange.ipc$dispatch("e77bd975", new Object[]{this}));
            }
            return AppCompatEditText.access$001(AppCompatEditText.this);
        }

        public void setTextClassifier(TextClassifier textClassifier) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccad2221", new Object[]{this, textClassifier});
            } else {
                AppCompatEditText.access$101(AppCompatEditText.this, textClassifier);
            }
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public static /* synthetic */ TextClassifier access$001(AppCompatEditText appCompatEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return w31.a(ipChange.ipc$dispatch("4f0f7238", new Object[]{appCompatEditText}));
        }
        return super.getTextClassifier();
    }

    public static /* synthetic */ void access$101(AppCompatEditText appCompatEditText, TextClassifier textClassifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9314c991", new Object[]{appCompatEditText, textClassifier});
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    private SuperCaller getSuperCaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SuperCaller) ipChange.ipc$dispatch("ea493045", new Object[]{this});
        }
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new SuperCaller();
        }
        return this.mSuperCaller;
    }

    public static /* synthetic */ Object ipc$super(AppCompatEditText appCompatEditText, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1919838530:
                super.setBackgroundResource(((Number) objArr[0]).intValue());
                return null;
            case -1741850347:
                return super.getCustomSelectionActionModeCallback();
            case -1282673432:
                return new Integer(super.getInputType());
            case -1162739065:
                return super.onCreateInputConnection((EditorInfo) objArr[0]);
            case -914472551:
                return super.getEditableText();
            case -861068767:
                super.setTextClassifier(w31.a(objArr[0]));
                return null;
            case -718650051:
                super.setFocusable(((Boolean) objArr[0]).booleanValue());
                return null;
            case -636489373:
                return new Boolean(super.isClickable());
            case -411313803:
                return super.getTextClassifier();
            case -346750530:
                super.setRawInputType(((Number) objArr[0]).intValue());
                return null;
            case -181800469:
                return new Boolean(super.onTextContextMenuItem(((Number) objArr[0]).intValue()));
            case -91894907:
                return new Boolean(super.onDragEvent((DragEvent) objArr[0]));
            case 245313715:
                return new Boolean(super.isFocusable());
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 714889707:
                super.setCompoundDrawablesRelative((Drawable) objArr[0], (Drawable) objArr[1], (Drawable) objArr[2], (Drawable) objArr[3]);
                return null;
            case 725209897:
                super.setLongClickable(((Boolean) objArr[0]).booleanValue());
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
            case 1565811733:
                return super.getText();
            case 1680936578:
                super.setKeyListener((KeyListener) objArr[0]);
                return null;
            case 1846237511:
                return new Boolean(super.isLongClickable());
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            case 2010225293:
                super.setClickable(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/AppCompatEditText");
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

    public void initEmojiKeyListener(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd14352", new Object[]{this, appCompatEmojiEditTextHelper});
            return;
        }
        KeyListener keyListener = getKeyListener();
        if (appCompatEmojiEditTextHelper.isEmojiCapableKeyListener(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListener2 = appCompatEmojiEditTextHelper.getKeyListener(keyListener);
            if (keyListener2 != keyListener) {
                super.setKeyListener(keyListener2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7057c88e", new Object[]{this})).booleanValue();
        }
        return this.mAppCompatEmojiEditTextHelper.isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] onReceiveContentMimeTypes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputConnection) ipChange.ipc$dispatch("bab20287", new Object[]{this, editorInfo});
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.populateSurroundingTextIfNeeded(this, onCreateInputConnection, editorInfo);
        InputConnection onCreateInputConnection2 = AppCompatHintHelper.onCreateInputConnection(onCreateInputConnection, editorInfo, this);
        if (!(onCreateInputConnection2 == null || Build.VERSION.SDK_INT > 30 || (onReceiveContentMimeTypes = ViewCompat.getOnReceiveContentMimeTypes(this)) == null)) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, onReceiveContentMimeTypes);
            onCreateInputConnection2 = InputConnectionCompat.createWrapper(this, onCreateInputConnection2, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.onCreateInputConnection(onCreateInputConnection2, editorInfo);
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
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    public ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentInfoCompat) ipChange.ipc$dispatch("a5613aba", new Object[]{this, contentInfoCompat});
        }
        return this.mDefaultOnReceiveContentListener.onReceiveContent(this, contentInfoCompat);
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
            this.mAppCompatEmojiEditTextHelper.setEnabled(z);
        }
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64310e82", new Object[]{this, keyListener});
        } else {
            super.setKeyListener(this.mAppCompatEmojiEditTextHelper.getKeyListener(keyListener));
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

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editable) ipChange.ipc$dispatch("5d546415", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa85cb85", new Object[]{this, dragEvent})).booleanValue();
        }
        if (AppCompatReceiveContentHelper.maybeHandleDragEventViaPerformReceiveContent(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f529f1eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (AppCompatReceiveContentHelper.maybeHandleMenuActionViaPerformReceiveContent(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        appCompatTextHelper.applyCompoundDrawablesTints();
        this.mTextClassifierHelper = new AppCompatTextClassifierHelper(this);
        this.mDefaultOnReceiveContentListener = new TextViewOnReceiveContentListener();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this);
        this.mAppCompatEmojiEditTextHelper = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.loadFromAttributes(attributeSet, i);
        initEmojiKeyListener(appCompatEmojiEditTextHelper);
    }
}
