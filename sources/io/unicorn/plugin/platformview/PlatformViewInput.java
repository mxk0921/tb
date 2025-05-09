package io.unicorn.plugin.platformview;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TimePicker;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.JSSetter;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.weex.common.Constants;
import io.unicorn.embedding.android.UnicornView;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.dwh;
import tb.pg1;
import tb.t2o;
import tb.w4x;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PlatformViewInput extends WeexPlatformView {
    private static final String BUTTON = "button";
    private static final String CHECKBOX = "checkbox";
    private static final String DATE = "date";
    private static final String DATETIME = "datetime";
    private static final String DEFAULT = "default";
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int DEFAULT_START_YEAR = 1900;
    private static final float DEFAULT_TEXT_SIZE = 14.0f;
    private static final String DONE = "done";
    private static final String EMAIL = "email";
    private static final String FILE = "file";
    private static final String GO = "go";
    private static final String HIDDEN = "hidden";
    private static final String IMAGE = "image";
    private static final String MONTH = "month";
    private static final String NEXT = "next";
    private static final String NUMBER = "number";
    private static final String PASSWORD = "password";
    private static final String RADIO = "radio";
    private static final String RANGE = "range";
    private static final String RESET = "reset";
    private static final String SEARCH = "search";
    private static final String SEND = "send";
    private static final String SUBMIT = "submit";
    private static final String TEL = "tel";
    private static final String TEXT = "text";
    private static final String TIME = "time";
    private static final String URL = "url";
    private static final String WEEK = "week";
    private static final Map<String, Integer> mTypeToInputTypeMap;
    private boolean mAutofocus;
    private Context mContext;
    private int mCurrentInputHeight;
    private int mCurrentViewHeight;
    private boolean mEnableFixInputBlur;
    private boolean mFixOnReturnEventEnable;
    private boolean mIsChangeInputEventSwitch;
    private boolean mIsInputFilterKeyboardEvent;
    private boolean mIsInputFireScrollEventSwitch;
    private boolean mIsInputFixInputSelection;
    private boolean mIsSupportShow;
    private int mMaxHeight;
    private int mMaxLine;
    private int mMinKeyboardHeightDetected;
    private ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    private VideoRootView mRootView;
    private boolean mSupportInputMaxLinesSwitch;
    private UnicornView mUnicornView;
    private EditText mView;
    private static SimpleDateFormat dateFormatter = null;
    private static SimpleDateFormat timeFormatter = null;
    private String mMax = null;
    private String mMin = null;
    private int mMaxLength = 0;
    private String mReturnKeyType = "default";
    private String mType = "text";
    private boolean mFirstAttatched = true;
    private boolean mSingleLine = true;
    private String mEditTextContent = "";
    private String mLastChangeText = "";
    private Rect mVisibleViewArea = new Rect();
    private int mKeyboardHeight = 0;
    private boolean mIsInputCanScroll = false;
    private boolean mIsSendInputEvent = true;
    private TextWatcher mTextWatcher = new g();
    private View.OnFocusChangeListener mOnFocusChangeListener = new h();
    private TextView.OnEditorActionListener mOnEditorActionListener = new TextView.OnEditorActionListener() { // from class: io.unicorn.plugin.platformview.PlatformViewInput.7
        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 == 5) {
                return false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("value", PlatformViewInput.this.getEditText().getText().toString());
            hashMap.put("returnKeyType", PlatformViewInput.this.mReturnKeyType);
            PlatformViewInput.this.fireEvent("return", hashMap);
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                PlatformViewInput.this.fireChangeContent();
            }
            if (i2 == 6 && PlatformViewInput.this.mSingleLine) {
                PlatformViewInput.this.hideSoftKeyboard(true);
            }
            if (!PlatformViewInput.this.mFixOnReturnEventEnable || !PlatformViewInput.this.mSingleLine || (i2 != 2 && i2 != 3 && i2 != 4)) {
                return false;
            }
            return true;
        }
    };
    private View.OnClickListener mOnClickListener = new i();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements TimePickerDialog.OnTimeSetListener {
        public a() {
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            String str;
            String str2;
            if (i < 10) {
                str = "0" + i;
            } else {
                str = String.valueOf(i);
            }
            if (i2 < 10) {
                str2 = "0" + i2;
            } else {
                str2 = String.valueOf(i2);
            }
            PlatformViewInput.this.getEditText().setText(str + ":" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b extends yio {
        public b() {
        }

        @Override // tb.yio
        public void e() {
            PlatformViewInput.this.mView.requestFocus();
            ((InputMethodManager) PlatformViewInput.this.mContext.getSystemService("input_method")).showSoftInput(PlatformViewInput.this.mView, 1);
            if (PlatformViewInput.this.mIsInputFixInputSelection && PlatformViewInput.this.mView.getSelectionStart() == 0 && PlatformViewInput.this.mView.getSelectionEnd() == 0) {
                PlatformViewInput.this.getEditText().setSelection(PlatformViewInput.this.getEditText().getText().length());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements m {
        public c() {
        }

        public void a(int i) {
            PlatformViewInput.this.onVisibilityChanged(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PlatformViewInput.this.checkForKeyboardEventsLegacy();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlatformViewInput platformViewInput = PlatformViewInput.this;
            if (platformViewInput.mSupportInputMaxLinesSwitch && !platformViewInput.mSingleLine && platformViewInput.mMaxLine > 0) {
                platformViewInput.mCurrentInputHeight = i4 - i2;
                platformViewInput.mCurrentViewHeight = platformViewInput.mRootView.getMeasuredHeight();
                int measuredWidth = platformViewInput.mView.getMeasuredWidth();
                int lineCount = platformViewInput.mView.getLineCount();
                if (lineCount <= platformViewInput.mMaxLine) {
                    if (lineCount == platformViewInput.mMaxLine) {
                        platformViewInput.mMaxHeight = platformViewInput.mCurrentInputHeight;
                    }
                    platformViewInput.fireResizeEvent(measuredWidth, platformViewInput.mCurrentInputHeight);
                    return;
                }
                platformViewInput.fireResizeEvent(measuredWidth, platformViewInput.mCurrentInputHeight);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformViewInput.this.showSoftKeyboard();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class h implements View.OnFocusChangeListener {
        public h() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            PlatformViewInput platformViewInput = PlatformViewInput.this;
            if (z) {
                if (platformViewInput.mUnicornView != null) {
                    platformViewInput.mUnicornView.registerEditTextFocusView(platformViewInput.getEditText());
                }
                platformViewInput.fireEvent(Constants.Event.FOCUS);
                platformViewInput.fireEvent("focusin");
                return;
            }
            if (platformViewInput.mUnicornView != null) {
                platformViewInput.mUnicornView.clearCurEditTextFocusView(platformViewInput.getEditText());
            }
            platformViewInput.fireEvent(Constants.Event.BLUR);
            platformViewInput.fireEvent("focusout");
            platformViewInput.fireChangeContent();
            platformViewInput.hideSoftKeyboard(!platformViewInput.mEnableFixInputBlur);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlatformViewInput platformViewInput = PlatformViewInput.this;
            String str = platformViewInput.mType;
            str.hashCode();
            if (str.equals("date")) {
                platformViewInput.processTypeDate();
            } else if (str.equals("time")) {
                platformViewInput.processTypeTime();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class j implements DatePickerDialog.OnDateSetListener {
        public j() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            String str;
            String str2;
            int i4 = i2 + 1;
            if (i4 < 10) {
                str = "0" + i4;
            } else {
                str = String.valueOf(i4);
            }
            if (i3 < 10) {
                str2 = "0" + i3;
            } else {
                str2 = String.valueOf(i3);
            }
            PlatformViewInput.this.getEditText().setText(i + "-" + str + "-" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface k {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface l {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface m {
    }

    static {
        t2o.a(945815823);
        HashMap hashMap = new HashMap(9);
        mTypeToInputTypeMap = hashMap;
        hashMap.put("email", 33);
        hashMap.put("datetime", 4);
        hashMap.put("number", 8194);
        hashMap.put("password", 129);
        hashMap.put("tel", 193);
        hashMap.put("text", 1);
        hashMap.put("url", 17);
        hashMap.put("date", 0);
        hashMap.put("time", 0);
    }

    public PlatformViewInput(Context context, int i2) {
        super(context, i2);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.mIsSupportShow = false;
        this.mFixOnReturnEventEnable = false;
        this.mSupportInputMaxLinesSwitch = true;
        this.mIsInputFilterKeyboardEvent = true;
        this.mIsInputFixInputSelection = true;
        this.mIsInputFireScrollEventSwitch = true;
        this.mEnableFixInputBlur = true;
        this.mIsChangeInputEventSwitch = true;
        this.mContext = context;
        VideoRootView videoRootView = new VideoRootView(context);
        this.mRootView = videoRootView;
        videoRootView.whenVisibilityChanged(new c());
        EditText editText = new EditText(context);
        this.mView = editText;
        editText.setPadding(0, 0, 0, 0);
        this.mView.setBackground(null);
        this.mView.setInputType(1);
        this.mView.setImeOptions(0);
        this.mView.setTextSize(1, DEFAULT_TEXT_SIZE);
        this.mView.setOnEditorActionListener(this.mOnEditorActionListener);
        this.mView.addTextChangedListener(this.mTextWatcher);
        this.mView.setOnFocusChangeListener(this.mOnFocusChangeListener);
        String t = w4x.t("weex_input_show_with_size");
        if (t == null || "true".equals(t)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsSupportShow = z;
        if (z) {
            this.mMinKeyboardHeightDetected = (int) dpToPX(this.mContext, 60.0f);
            this.mOnGlobalLayoutListener = new d();
            this.mView.getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        }
        String t2 = w4x.t("weex_input_fix_on_return");
        if (t2 == null || "true".equals(t2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mFixOnReturnEventEnable = z2;
        String t3 = w4x.t("weex_input_support_max_lines");
        if (t3 == null || "true".equals(t3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mSupportInputMaxLinesSwitch = z3;
        String t4 = w4x.t("input_filter_keyboard_event");
        if (t4 == null || "true".equals(t4)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mIsInputFilterKeyboardEvent = z4;
        String t5 = w4x.t("input_filter_fix_selection");
        if (t5 == null || "true".equals(t5)) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.mIsInputFixInputSelection = z5;
        this.mIsInputFireScrollEventSwitch = w4x.s("input_fire_scroll_event", true, false);
        this.mEnableFixInputBlur = w4x.g();
        this.mIsChangeInputEventSwitch = w4x.s("send_input_change_event", true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r7.mView.getRootView().getRootWindowInsets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r0.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void checkForKeyboardEventsLegacy() {
        /*
            r7 = this;
            android.widget.EditText r0 = r7.mView
            android.view.View r0 = r0.getRootView()
            android.graphics.Rect r1 = r7.mVisibleViewArea
            r0.getWindowVisibleDisplayFrame(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L_0x0029
            android.widget.EditText r0 = r7.mView
            android.view.View r0 = r0.getRootView()
            android.view.WindowInsets r0 = tb.zop.a(r0)
            if (r0 == 0) goto L_0x0029
            android.view.DisplayCutout r0 = tb.sgx.a(r0)
            if (r0 == 0) goto L_0x0029
            int r0 = tb.g3z.a(r0)
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            android.content.Context r1 = r7.mContext
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            android.graphics.Rect r3 = r7.mVisibleViewArea
            int r3 = r3.bottom
            int r1 = r1 - r3
            int r1 = r1 + r0
            int r0 = r7.mKeyboardHeight
            java.lang.String r3 = "keyboard"
            java.lang.String r4 = "keyboardSize"
            java.lang.String r5 = "isShow"
            if (r0 == r1) goto L_0x0085
            int r6 = r7.mMinKeyboardHeightDetected
            if (r1 <= r6) goto L_0x0085
            boolean r0 = r7.mIsInputFilterKeyboardEvent
            if (r0 == 0) goto L_0x0059
            android.widget.EditText r0 = r7.mView
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto L_0x0059
            return
        L_0x0059:
            r7.mKeyboardHeight = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r5, r1)
            int r1 = r7.mKeyboardHeight
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r4, r1)
            android.content.Context r1 = r7.mContext
            int r2 = r7.mKeyboardHeight
            float r1 = r7.px2dipf(r1, r2)
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "size"
            r0.put(r2, r1)
            r7.fireEvent(r3, r0)
            return
        L_0x0085:
            if (r0 == 0) goto L_0x00a3
            int r0 = r7.mMinKeyboardHeightDetected
            if (r1 > r0) goto L_0x00a3
            r7.mKeyboardHeight = r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.put(r5, r1)
            int r1 = r7.mKeyboardHeight
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r4, r1)
            r7.fireEvent(r3, r0)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.plugin.platformview.PlatformViewInput.checkForKeyboardEventsLegacy():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireChangeContent() {
        HashMap hashMap;
        if (!this.mLastChangeText.equals(this.mEditTextContent)) {
            if (!TextUtils.isEmpty(this.mEditTextContent)) {
                hashMap = new HashMap();
                hashMap.put("value", this.mEditTextContent);
                this.mLastChangeText = this.mEditTextContent;
            } else {
                hashMap = null;
            }
            fireEvent("change", hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireResizeEvent(int i2, int i3) {
        if (this.mCurrentViewHeight != i3) {
            HashMap hashMap = new HashMap();
            hashMap.put("width", Float.valueOf(px2dipf(this.mView.getContext(), i2)));
            hashMap.put("height", Float.valueOf(px2dipf(this.mView.getContext(), i3)));
            fireEvent(Constants.Name.RESIZE, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EditText getEditText() {
        return this.mView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSoftKeyboard(boolean z) {
        this.mView.clearFocus();
        if (z) {
            ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
        }
        fireChangeContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVisibilityChanged(int i2) {
        if (this.mFirstAttatched && i2 == 0 && this.mAutofocus) {
            this.mFirstAttatched = false;
            this.mRootView.postDelayed(new f(), 100L);
        }
    }

    private static Date parseDate(String str) {
        if (dateFormatter == null) {
            dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        }
        if (str != null) {
            try {
                return dateFormatter.parse(str);
            } catch (ParseException unused) {
            }
        }
        return new Date();
    }

    private static Date parseTime(String str) {
        if (timeFormatter == null) {
            timeFormatter = new SimpleDateFormat("HH:mm", Locale.getDefault());
        }
        if (str != null) {
            try {
                return timeFormatter.parse(str);
            } catch (ParseException unused) {
            }
        }
        return new Date();
    }

    private void pickDate(String str, String str2, String str3) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(parseDate(str));
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.mView.getContext(), new j(), instance.get(1), instance.get(2), instance.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Calendar instance2 = Calendar.getInstance(Locale.getDefault());
        Calendar instance3 = Calendar.getInstance(Locale.getDefault());
        instance2.set(1900, 0, 1);
        instance3.set(2100, 11, 31);
        if (!TextUtils.isEmpty(str3)) {
            if (datePicker.getMaxDate() >= parseDate(str3).getTime()) {
                datePicker.setMinDate(parseDate(str3).getTime());
            } else {
                datePicker.setMinDate(instance2.getTimeInMillis());
                datePicker.setMaxDate(instance3.getTimeInMillis());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (datePicker.getMinDate() <= parseDate(str2).getTime()) {
                datePicker.setMaxDate(parseDate(str2).getTime());
            } else {
                datePicker.setMinDate(instance2.getTimeInMillis());
                datePicker.setMaxDate(instance3.getTimeInMillis());
            }
        }
        datePickerDialog.show();
    }

    private void pickTime(String str) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(parseTime(str));
        new TimePickerDialog(this.mView.getContext(), new a(), instance.get(11), instance.get(12), false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTypeDate() {
        hideSoftKeyboard(true);
        pickDate(null, this.mMax, this.mMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTypeTime() {
        hideSoftKeyboard(true);
        pickTime(null);
    }

    private void setInnerReturnKeyType(String str) {
        if (!this.mReturnKeyType.equals(str)) {
            this.mReturnKeyType = str;
            if ("default".equals(str)) {
                getEditText().setImeOptions(0);
            } else if (GO.equals(str)) {
                getEditText().setImeOptions(2);
            } else if ("next".equals(str)) {
                getEditText().setImeOptions(5);
            } else if ("search".equals(str)) {
                getEditText().setImeOptions(3);
            } else if ("send".equals(str)) {
                getEditText().setImeOptions(4);
            } else if ("done".equals(str)) {
                getEditText().setImeOptions(6);
            }
            ((InputMethodManager) this.mContext.getSystemService("input_method")).restartInput(this.mView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSoftKeyboard() {
        this.mView.post(new b());
    }

    @JSMethod
    public void blur() {
        hideSoftKeyboard(true);
    }

    @JSMethod
    public void clear() {
        getEditText().setText("");
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void dispose() {
        EditText editText;
        dateFormatter = null;
        timeFormatter = null;
        this.mMin = null;
        this.mMax = null;
        UnicornView unicornView = this.mUnicornView;
        if (unicornView != null) {
            unicornView.clearCurEditTextFocusView(getEditText());
        }
        if (this.mIsSupportShow && this.mOnGlobalLayoutListener != null && (editText = this.mView) != null && editText.getViewTreeObserver() != null) {
            this.mView.getViewTreeObserver().removeOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        }
    }

    public float dpToPX(Context context, float f2) {
        return f2 * context.getResources().getDisplayMetrics().density;
    }

    @JSMethod
    public void focus() {
        showSoftKeyboard();
    }

    @JSGetter(name = "value")
    public String getValue() {
        return getEditText().getText().toString();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        return this.mRootView;
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        super.onCreated();
        if (!this.mSupportInputMaxLinesSwitch || this.mSingleLine || this.mMaxLine <= 0) {
            this.mRootView.addView(this.mView);
            return;
        }
        int maxLines = this.mView.getMaxLines();
        int i2 = this.mMaxLine;
        if (maxLines != i2) {
            this.mView.setMaxLines(i2);
        }
        ScrollView scrollView = new ScrollView(this.mContext);
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.addView(this.mView, new LinearLayout.LayoutParams(-1, -2));
        this.mRootView.addView(scrollView, new FrameLayout.LayoutParams(-1, -2));
        this.mView.addOnLayoutChangeListener(new e());
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public void onFlutterViewAttached(View view) {
        if (view instanceof UnicornView) {
            this.mUnicornView = (UnicornView) view;
        }
    }

    public float px2dipf(Context context, int i2) {
        return i2 / context.getResources().getDisplayMetrics().density;
    }

    @WXComponentProp(name = Constants.Name.AUTOFOCUS)
    public void setAutoFocus(boolean z) {
        if (this.mAutofocus != z) {
            this.mAutofocus = z;
            if (z) {
                this.mView.setFocusable(true);
                this.mView.setFocusableInTouchMode(true);
                this.mView.requestFocus();
                this.mView.requestFocusFromTouch();
            }
        }
    }

    @WXComponentProp(name = "caret-color")
    public void setCursorDrawableColor(long j2) {
        try {
            int intValue = Long.valueOf(j2).intValue();
            if (Build.VERSION.SDK_INT <= 28) {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i2 = declaredField.getInt(getEditText());
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(getEditText());
                Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                Drawable[] drawableArr = {getEditText().getContext().getResources().getDrawable(i2), getEditText().getContext().getResources().getDrawable(i2)};
                Drawable drawable = drawableArr[0];
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(intValue, mode);
                drawableArr[1].setColorFilter(intValue, mode);
                declaredField3.set(obj, drawableArr);
            } else {
                getEditText().setTextCursorDrawable(new ColorDrawable(intValue));
            }
        } catch (Throwable th) {
            dwh.g("Weex", "textInput 游标颜色设置失败", th);
        }
    }

    @WXComponentProp(name = "color")
    public void setFontColor(long j2) {
        getEditText().setTextColor((int) j2);
    }

    @WXComponentProp(name = pg1.ATOM_EXT_UDL_font_size)
    public void setFontSize(float f2) {
        if (f2 > 0.0f) {
            getEditText().setTextSize(1, f2);
        }
    }

    @WXComponentProp(name = "disabled")
    public void setInputDisabled(boolean z) {
        this.mView.setEnabled(!z);
    }

    @WXComponentProp(name = "placeholder")
    public void setInputHint(String str) {
        getEditText().setHint(str);
    }

    @WXComponentProp(name = Constants.Name.PLACEHOLDER_COLOR)
    public void setInputHintColor(long j2) {
        getEditText().setHintTextColor((int) j2);
    }

    @WXComponentProp(name = "readonly")
    public void setInputReadOnly(boolean z) {
        if (z) {
            getEditText().setInputType(0);
            getEditText().setTextIsSelectable(true);
            getEditText().setFocusable(false);
            getEditText().setLongClickable(false);
        }
    }

    @WXComponentProp(name = "type")
    public void setInputType(String str) {
        if (!this.mType.equals(str)) {
            Map<String, Integer> map = mTypeToInputTypeMap;
            if (map.containsKey(str)) {
                this.mView.setInputType(map.get(str).intValue());
            }
            this.mType = str;
            if (str.equals("date") || this.mType.equals("time")) {
                this.mView.setOnClickListener(this.mOnClickListener);
            }
        }
    }

    @WXComponentProp(name = "value")
    public void setInputValue(String str) {
        String obj = getEditText().getText().toString();
        if (!obj.equals(str)) {
            this.mIsSendInputEvent = false;
            getEditText().setText(str);
            this.mIsSendInputEvent = true;
            if (!this.mIsInputFixInputSelection || !TextUtils.isEmpty(obj) || this.mView.isFocused()) {
                getEditText().setSelection(getEditText().getText().length());
            }
        }
    }

    @WXComponentProp(name = "max")
    public void setMax(String str) {
        this.mMax = str;
    }

    @WXComponentProp(name = Constants.Name.MAXLENGTH)
    public void setMaxLength(int i2) {
        if (i2 != this.mMaxLength) {
            this.mMaxLength = i2;
            getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
        }
    }

    @WXComponentProp(name = Constants.Name.MAX_LENGTH)
    public void setMaxLengthStandard(int i2) {
        setMaxLength(i2);
    }

    @WXComponentProp(name = "maxline")
    public void setMaxline(int i2) {
        this.mMaxLine = i2;
        EditText editText = this.mView;
        if (editText != null) {
            editText.setMaxLines(i2);
        }
    }

    @WXComponentProp(name = "min")
    public void setMin(String str) {
        this.mMin = str;
    }

    @WXComponentProp(name = "backgroundColor")
    public void setPlaygroundColor(long j2) {
        getEditText().setBackgroundColor(Long.valueOf(j2).intValue());
    }

    @WXComponentProp(name = pg1.ATOM_EXT_UDL_background_color)
    public void setPlaygroundColor2(long j2) {
        getEditText().setBackgroundColor(Long.valueOf(j2).intValue());
    }

    @WXComponentProp(name = "returnkeytype")
    public void setReturnKeyType(String str) {
        setInnerReturnKeyType(str);
    }

    @WXComponentProp(name = "returnKeyType")
    public void setReturnKeyType1(String str) {
        setInnerReturnKeyType(str);
    }

    @WXComponentProp(name = Constants.Name.SINGLELINE)
    public void setSingleLine(boolean z) {
        this.mSingleLine = z;
        this.mIsSendInputEvent = false;
        getEditText().setSingleLine(z);
        this.mIsSendInputEvent = true;
        getEditText().setGravity(48);
        getEditText().setImeOptions(5);
    }

    @WXComponentProp(name = pg1.ATOM_EXT_UDL_text_align)
    public void setTextAlign(String str) {
        if (TextUtils.equals(str, "left")) {
            getEditText().setTextAlignment(2);
            getEditText().setGravity(19);
        } else if (TextUtils.equals(str, "center")) {
            getEditText().setTextAlignment(4);
            getEditText().setGravity(17);
        } else if (TextUtils.equals(str, "right")) {
            getEditText().setTextAlignment(3);
            getEditText().setGravity(21);
        }
    }

    @JSSetter(name = "value")
    public void setValue(String str) {
        setInputValue(str);
    }

    @WXComponentProp(name = pg1.ATOM_EXT_UDL_vertical_align)
    public void setVerticalAlign(String str) {
        if (TextUtils.equals(str, "top")) {
            getEditText().setGravity(48);
        } else if (TextUtils.equals(str, "middle")) {
            getEditText().setGravity(17);
        } else if (TextUtils.equals(str, "bottom")) {
            getEditText().setGravity(80);
        }
    }

    @JSMethod
    public void unfocus() {
        hideSoftKeyboard(false);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class VideoRootView extends FrameLayout {
        private k mDetachedFromWindowListener;
        private l mSizeChangedListener;
        private m mVisibilityChangedListener;

        static {
            t2o.a(945815838);
        }

        public VideoRootView(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
        }

        @Override // android.view.View
        public void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            m mVar = this.mVisibilityChangedListener;
            if (mVar != null) {
                ((c) mVar).a(i);
            }
        }

        public VideoRootView whenVisibilityChanged(m mVar) {
            this.mVisibilityChangedListener = mVar;
            return this;
        }

        public VideoRootView whenDetachedFromWindow(k kVar) {
            return this;
        }

        public VideoRootView whenSizeChanged(l lVar) {
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            PlatformViewInput platformViewInput = PlatformViewInput.this;
            if (platformViewInput.mIsInputFireScrollEventSwitch) {
                boolean z = true;
                if (!platformViewInput.mView.canScrollVertically(1) && !platformViewInput.mView.canScrollVertically(-1) && !platformViewInput.mView.canScrollHorizontally(1) && !platformViewInput.mView.canScrollHorizontally(-1)) {
                    z = false;
                }
                if (platformViewInput.mIsInputCanScroll != z) {
                    platformViewInput.mIsInputCanScroll = z;
                    HashMap hashMap = new HashMap();
                    hashMap.put("scrollable", Boolean.valueOf(z));
                    platformViewInput.fireEvent("setScrollable", hashMap);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            PlatformViewInput platformViewInput = PlatformViewInput.this;
            if (platformViewInput.mIsSendInputEvent || !platformViewInput.mIsChangeInputEventSwitch) {
                HashMap hashMap = null;
                if (i3 > i2) {
                    String.valueOf(charSequence);
                    str = String.valueOf(charSequence).substring(i, i3 + i);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap = new HashMap();
                    hashMap.put("value", str);
                }
                platformViewInput.fireEvent("input", hashMap);
                platformViewInput.mEditTextContent = String.valueOf(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
