package com.alipay.android.app.safepaybase.alikeyboard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.android.app.cctemplate.utils.DrmUtil;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.AntNumKeyboard;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.QwertyKeyboard;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureAccessbilityDelegate;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureQwertyKeyboard;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayKeyboard extends LinearLayout implements OnKeyboardListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object LOCK_SHOW_KEYBOARD = new Object();
    private FrameLayout container;
    private EditText editText;
    private Context mContext;
    private AliKeyboardType currentKeyboard = AliKeyboardType.none;
    private final HashMap<AliKeyboardType, AbstractKeyboard> keyboardMap = new HashMap<>();
    private boolean isShowKeyboard = false;
    private boolean isSwitchedSystemKeyboard = false;
    private AliKeyboardAction cachedKeyboardAction = AliKeyboardAction.None;
    private AlipayKeyboardActionListener mActionListener = null;
    private SourceType mSource = SourceType.msp;
    private boolean isDegradeKeyboardDoneAction = false;

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* renamed from: com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType;

        static {
            int[] iArr = new int[AliKeyboardType.values().length];
            $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType = iArr;
            try {
                iArr[AliKeyboardType.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType[AliKeyboardType.money.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType[AliKeyboardType.num.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType[AliKeyboardType.idcard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType[AliKeyboardType.phone.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType[AliKeyboardType.spwd.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType[AliKeyboardType.abc.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum AliKeyboardAction {
        None,
        Show,
        Hide
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum SourceType {
        msp,
        vi
    }

    public AlipayKeyboard(Context context) {
        super(context);
        this.mContext = context;
        ResUtils.setUiContext(context);
        initConfig();
    }

    public static /* synthetic */ AliKeyboardAction access$000(AlipayKeyboard alipayKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliKeyboardAction) ipChange.ipc$dispatch("b54dcc7e", new Object[]{alipayKeyboard});
        }
        return alipayKeyboard.cachedKeyboardAction;
    }

    public static /* synthetic */ void access$100(AlipayKeyboard alipayKeyboard, AliKeyboardType aliKeyboardType, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3233a57", new Object[]{alipayKeyboard, aliKeyboardType, editText});
        } else {
            alipayKeyboard.showKeyboard(aliKeyboardType, editText);
        }
    }

    private void initConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[]{this});
        } else {
            this.isDegradeKeyboardDoneAction = DrmUtil.isDrmDegraded(this.mContext, "degrade_keyboard_done_action", false, false);
        }
    }

    private void initializeIdcardKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8259ee9", new Object[]{this});
            return;
        }
        removeAllViews();
        HashMap<AliKeyboardType, AbstractKeyboard> hashMap = this.keyboardMap;
        AliKeyboardType aliKeyboardType = AliKeyboardType.idcard;
        if (!hashMap.containsKey(aliKeyboardType)) {
            this.keyboardMap.put(aliKeyboardType, new AntNumKeyboard(getContext(), this, 2));
        }
        addView(this.keyboardMap.get(aliKeyboardType).getView());
    }

    private void initializeMoneyKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c0d081e", new Object[]{this});
            return;
        }
        EditText editText = this.editText;
        if (editText != null) {
            editText.setKeyListener(new MoneyKeyListener());
        }
        removeAllViews();
        HashMap<AliKeyboardType, AbstractKeyboard> hashMap = this.keyboardMap;
        AliKeyboardType aliKeyboardType = AliKeyboardType.money;
        if (!hashMap.containsKey(aliKeyboardType)) {
            this.keyboardMap.put(aliKeyboardType, new AntNumKeyboard(getContext(), this, 3, true));
        }
        addView(this.keyboardMap.get(aliKeyboardType).getView());
    }

    private void initializeNoneKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe428bf6", new Object[]{this});
        } else {
            hideKeyboard();
        }
    }

    private void initializeNumKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dfede4", new Object[]{this});
            return;
        }
        removeAllViews();
        HashMap<AliKeyboardType, AbstractKeyboard> hashMap = this.keyboardMap;
        AliKeyboardType aliKeyboardType = AliKeyboardType.num;
        if (!hashMap.containsKey(aliKeyboardType)) {
            this.keyboardMap.put(aliKeyboardType, new AntNumKeyboard(getContext(), this, 0, false));
        }
        addView(this.keyboardMap.get(aliKeyboardType).getView());
    }

    private void initializePhoneKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b788fcc", new Object[]{this});
            return;
        }
        removeAllViews();
        HashMap<AliKeyboardType, AbstractKeyboard> hashMap = this.keyboardMap;
        AliKeyboardType aliKeyboardType = AliKeyboardType.phone;
        if (!hashMap.containsKey(aliKeyboardType)) {
            this.keyboardMap.put(aliKeyboardType, new AntNumKeyboard(getContext(), this, 1));
        }
        addView(this.keyboardMap.get(aliKeyboardType).getView());
    }

    private void initializeQwertyKeyboard() {
        AbstractKeyboard abstractKeyboard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8810fd6", new Object[]{this});
            return;
        }
        removeAllViews();
        HashMap<AliKeyboardType, AbstractKeyboard> hashMap = this.keyboardMap;
        AliKeyboardType aliKeyboardType = AliKeyboardType.abc;
        if (!hashMap.containsKey(aliKeyboardType)) {
            HashMap<AliKeyboardType, AbstractKeyboard> hashMap2 = this.keyboardMap;
            if (isNeedSecureType()) {
                abstractKeyboard = new SecureQwertyKeyboard(getContext(), this.container, this);
            } else {
                abstractKeyboard = new QwertyKeyboard(getContext(), this.container, this);
            }
            hashMap2.put(aliKeyboardType, abstractKeyboard);
        }
        addView(this.keyboardMap.get(aliKeyboardType).getView());
    }

    private void initializeShortPwdKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d6845f", new Object[]{this});
            return;
        }
        removeAllViews();
        HashMap<AliKeyboardType, AbstractKeyboard> hashMap = this.keyboardMap;
        AliKeyboardType aliKeyboardType = AliKeyboardType.spwd;
        if (!hashMap.containsKey(aliKeyboardType)) {
            this.keyboardMap.put(aliKeyboardType, new AntNumKeyboard(getContext(), this, 4, false));
        }
        addView(this.keyboardMap.get(aliKeyboardType).getView());
    }

    public static /* synthetic */ Object ipc$super(AlipayKeyboard alipayKeyboard, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/safepaybase/alikeyboard/AlipayKeyboard");
    }

    private boolean isNeedSecureType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a3685c", new Object[]{this})).booleanValue();
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return true;
    }

    private boolean isShowCloseButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e5b108e", new Object[]{this})).booleanValue();
        }
        if (SourceType.msp == this.mSource) {
            return true;
        }
        return false;
    }

    private void showKeyboard(AliKeyboardType aliKeyboardType, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b4f9d2", new Object[]{this, aliKeyboardType, editText});
            return;
        }
        LogUtils.record(2, "AlipayKeyboard#showKeyboard", "");
        synchronized (LOCK_SHOW_KEYBOARD) {
            try {
                this.cachedKeyboardAction = AliKeyboardAction.None;
                this.isShowKeyboard = true;
                this.editText = editText;
                if (!(editText == null || aliKeyboardType == AliKeyboardType.money)) {
                    editText.setAccessibilityDelegate(new SecureAccessbilityDelegate());
                }
                if (this.currentKeyboard != aliKeyboardType) {
                    this.currentKeyboard = aliKeyboardType;
                    switchKeyboard();
                }
                setVisibility(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void switchKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ceb8a42", new Object[]{this});
            return;
        }
        LogUtils.record(2, "AlipayKeyboard#switchKeyboard", "currentKeyboard: " + this.currentKeyboard);
        switch (AnonymousClass2.$SwitchMap$com$alipay$android$app$safepaybase$alikeyboard$AliKeyboardType[this.currentKeyboard.ordinal()]) {
            case 1:
                initializeNoneKeyboard();
                return;
            case 2:
                initializeMoneyKeyboard();
                return;
            case 3:
                if (isShowCloseButton()) {
                    initializeNumKeyboard();
                    return;
                } else {
                    initializeShortPwdKeyboard();
                    return;
                }
            case 4:
                initializeIdcardKeyboard();
                return;
            case 5:
                initializePhoneKeyboard();
                return;
            case 6:
                initializeShortPwdKeyboard();
                return;
            default:
                initializeQwertyKeyboard();
                return;
        }
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        LogUtils.record(2, "AlipayKeyboard#hideKeyboard", "");
        synchronized (LOCK_SHOW_KEYBOARD) {
            this.cachedKeyboardAction = AliKeyboardAction.None;
            this.isShowKeyboard = false;
            this.editText = null;
            this.currentKeyboard = AliKeyboardType.none;
            setVisibility(8);
        }
    }

    public void initializeKeyboard(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27299f21", new Object[]{this, frameLayout});
            return;
        }
        this.container = frameLayout;
        setOrientation(1);
        removeAllViews();
    }

    public boolean isShowKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63d205d9", new Object[]{this})).booleanValue();
        }
        return this.isShowKeyboard;
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else {
            hideKeyboard();
        }
    }

    public void onConfigurationChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4d4f64", new Object[]{this});
            return;
        }
        synchronized (LOCK_SHOW_KEYBOARD) {
            try {
                EditText editText = this.editText;
                if (editText != null) {
                    editText.clearFocus();
                }
                this.keyboardMap.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        hideKeyboard();
    }

    public void onConfigurationChangedPauseKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d9aa27", new Object[]{this});
            return;
        }
        synchronized (LOCK_SHOW_KEYBOARD) {
            try {
                EditText editText = this.editText;
                if (editText != null) {
                    editText.clearFocus();
                }
                this.keyboardMap.clear();
                this.isShowKeyboard = false;
                setVisibility(8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConfigurationChangedResumeKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f013adf8", new Object[]{this});
        } else {
            showKeyboard(this.currentKeyboard, this.editText, 200L);
        }
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onDel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf60c33", new Object[]{this});
            return;
        }
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onDel();
        }
        EditText editText = this.editText;
        if (editText != null && editText.getText() != null) {
            int selectionStart = this.editText.getSelectionStart();
            int selectionEnd = this.editText.getSelectionEnd();
            if (selectionStart > 0) {
                if (selectionStart == selectionEnd) {
                    this.editText.getText().delete(selectionStart - 1, selectionStart);
                } else {
                    this.editText.getText().delete(selectionStart, selectionEnd);
                }
            }
        }
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onOK() {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50952b02", new Object[]{this});
            return;
        }
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onOk();
        }
        if (!this.isDegradeKeyboardDoneAction && (editText = this.editText) != null) {
            editText.onEditorAction(6);
        }
        hideKeyboard();
    }

    public void setKeyboardActionListener(AlipayKeyboardActionListener alipayKeyboardActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c3fd9a", new Object[]{this, alipayKeyboardActionListener});
        } else {
            this.mActionListener = alipayKeyboardActionListener;
        }
    }

    public void setSource(SourceType sourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d2f1fd", new Object[]{this, sourceType});
        } else {
            this.mSource = sourceType;
        }
    }

    private void setSelection(EditText editText, int i) {
        Editable editableText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d316f735", new Object[]{this, editText, new Integer(i)});
        } else if (editText != null && (editableText = editText.getEditableText()) != null) {
            int length = editableText.length();
            LogUtils.record(2, "AlipayKeyboard#onInput", "pos: " + length + " newpos: " + i);
            if (AliKeyboardType.num == this.currentKeyboard && editText.getEditableText().toString().matches("^.*\\D.*$")) {
                return;
            }
            if (i < 0 || i > length) {
                Selection.setSelection(editableText, length);
            } else {
                Selection.setSelection(editableText, i);
            }
        }
    }

    @Override // com.alipay.android.app.safepaybase.alikeyboard.OnKeyboardListener
    public void onInput(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe21657c", new Object[]{this, str});
            return;
        }
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onInput(str);
        }
        EditText editText = this.editText;
        if (editText != null) {
            int selectionStart = editText.getSelectionStart();
            LogUtils.record(2, "AlipayKeyboard#onInput", "pos: " + selectionStart);
            if (selectionStart != -1) {
                this.editText.getText().insert(selectionStart, str);
            } else {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "keyboardStart-1", "");
            }
            setSelection(this.editText, selectionStart + str.length());
        }
    }

    public AlipayKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        initConfig();
    }

    public void showKeyboard(final AliKeyboardType aliKeyboardType, final EditText editText, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3eab732", new Object[]{this, aliKeyboardType, editText, new Long(j)});
            return;
        }
        if (this.isSwitchedSystemKeyboard) {
            this.isSwitchedSystemKeyboard = false;
            j = 200;
        }
        if (j <= 0) {
            showKeyboard(aliKeyboardType, editText);
            return;
        }
        this.isShowKeyboard = true;
        this.cachedKeyboardAction = AliKeyboardAction.Show;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AlipayKeyboard.access$000(AlipayKeyboard.this) == AliKeyboardAction.Show) {
                    AlipayKeyboard.access$100(AlipayKeyboard.this, aliKeyboardType, editText);
                } else if (AlipayKeyboard.access$000(AlipayKeyboard.this) == AliKeyboardAction.Hide) {
                    AlipayKeyboard.this.hideKeyboard();
                }
            }
        }, j);
    }
}
