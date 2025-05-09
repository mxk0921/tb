package com.alipay.mobile.antui.keyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.antui.service.AntuiServiceAdapter;
import com.alipay.mobile.antui.service.IAntuiLogger;
import com.alipay.mobile.antui.utils.SdkUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AUNumberKeyboardView extends LinearLayout implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLOSE_KEYBOARD_VIBRATOR_CONFIG_KEY = "AUNumberKeyboardView_closeKeyboardVibrator";
    private static final String CONFIG_KEY = "AUNumberKeyboardView_ENABLE_OLD_LAYOUT";
    public static final int KEYBOARD_THEME_V2 = 2;
    public static final int KEYBOARD_THEME_V2_BIG = 4;
    public static final int KEYBOARD_THEME_V2_SMALL = 3;
    private static final String[] NUM = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public static final int STYLE_NONE = 3;
    public static final int STYLE_PHONE = 4;
    public static final int STYLE_POINT = 1;
    public static final int STYLE_X = 2;
    public static final String TAG = "AUNumberKeyboardView";
    private OnActionClickListener actionClickListener;
    private boolean bigKeyboard;
    private boolean closeVibrator;
    private ImageView closeView;
    private OnConfirmClickListener confirmClickListener;
    private FrameLayout deleteView;
    private TextView keyConfirm;
    private KeyboardStateChangeListener keyboardStateChangeListener;
    private int keyboardTheme;
    private boolean mIsOldLayout;
    private List<TextView> numViewList;
    private boolean startLongDelete;
    private TextView styleView;
    private View topBar;
    private View topDividerLine;
    private FrameLayout topLayout;
    private View.OnTouchListener vibrateToucheListener;
    private Vibrator vibrator;
    private WindowStateChangeListener windowStateChangeListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface BackspaceButtonSetting {
        void setBackspaceButtonSetting(TextView textView, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnActionClickListener {
        void onCloseClick(View view);

        void onConfirmClick(View view);

        void onDeleteClick(View view);

        void onNumClick(View view, CharSequence charSequence);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnConfirmClickListener {
        void onConfirmClick(View view);
    }

    public AUNumberKeyboardView(Context context) {
        this(context, null, 1, false, null);
    }

    public static /* synthetic */ void access$000(AUNumberKeyboardView aUNumberKeyboardView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ed61cf", new Object[]{aUNumberKeyboardView, view});
        } else {
            aUNumberKeyboardView.vibrate(view);
        }
    }

    public static /* synthetic */ boolean access$100(AUNumberKeyboardView aUNumberKeyboardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfea55c6", new Object[]{aUNumberKeyboardView})).booleanValue();
        }
        return aUNumberKeyboardView.startLongDelete;
    }

    public static /* synthetic */ OnActionClickListener access$200(AUNumberKeyboardView aUNumberKeyboardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnActionClickListener) ipChange.ipc$dispatch("679a3bc8", new Object[]{aUNumberKeyboardView});
        }
        return aUNumberKeyboardView.actionClickListener;
    }

    private boolean checkIfUseOldLayout(AttributeSet attributeSet) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b59e5fc", new Object[]{this, attributeSet})).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(AntuiServiceAdapter.getAntuiSwitch().getConfig(CONFIG_KEY));
        } catch (Exception e) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            antuiLogger.error(TAG, "ConfigService 配置错误: " + e);
            z = false;
        }
        if (z || attributeSet == null) {
            return z;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AUNumberKeyboardView);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.AUNumberKeyboardView_usingOldLayout, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    private int checkType(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28577e78", new Object[]{this, attributeSet})).intValue();
        }
        if (attributeSet == null) {
            return -1;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AUNumberKeyboardView);
        int i = obtainStyledAttributes.getInt(R.styleable.AUNumberKeyboardView_keyboardType, -1);
        obtainStyledAttributes.recycle();
        return i;
    }

    private String getRandomNum(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5495f3b", new Object[]{this, list});
        }
        int random = (int) (Math.random() * list.size());
        String str = list.get(random);
        list.remove(random);
        return str;
    }

    private void hideStyleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a29935b", new Object[]{this});
        } else if (this.styleView.getVisibility() == 0) {
            this.styleView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.deleteView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).weight = 2.0f;
                this.deleteView.setLayoutParams(layoutParams);
            }
            if (this.closeView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = 0.5f;
                this.closeView.setLayoutParams(layoutParams2);
            }
        }
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        if (checkIfUseOldLayout(attributeSet) || this.mIsOldLayout) {
            z = true;
        }
        this.mIsOldLayout = z;
        this.keyboardTheme = checkKeyboardTheme(attributeSet);
        int checkType = checkType(attributeSet);
        if (checkType != -1) {
            i = checkType;
        }
        initNewTheme(this.keyboardTheme, context);
        View findViewById = findViewById(R.id.topBar);
        this.topBar = findViewById;
        findViewById.setOnClickListener(this);
        this.topLayout = (FrameLayout) findViewById(R.id.topLayout);
        this.topDividerLine = findViewById(R.id.topDividerLine);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(R.color.au_keyboard_bg_color));
        setClickable(true);
        this.numViewList.add((TextView) findViewById(R.id.au_num_0));
        this.numViewList.add((TextView) findViewById(R.id.au_num_1));
        this.numViewList.add((TextView) findViewById(R.id.au_num_2));
        this.numViewList.add((TextView) findViewById(R.id.au_num_3));
        this.numViewList.add((TextView) findViewById(R.id.au_num_4));
        this.numViewList.add((TextView) findViewById(R.id.au_num_5));
        this.numViewList.add((TextView) findViewById(R.id.au_num_6));
        this.numViewList.add((TextView) findViewById(R.id.au_num_7));
        this.numViewList.add((TextView) findViewById(R.id.au_num_8));
        this.numViewList.add((TextView) findViewById(R.id.au_num_9));
        Typeface numberTypeface = AntuiServiceAdapter.getAntuiKeyboardConfig().getNumberTypeface(context);
        for (TextView textView : this.numViewList) {
            textView.setOnClickListener(this);
            textView.setOnTouchListener(this.vibrateToucheListener);
            if (numberTypeface != null) {
                textView.setTypeface(numberTypeface);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.au_num_style);
        this.styleView = textView2;
        textView2.setOnClickListener(this);
        this.styleView.setOnTouchListener(this.vibrateToucheListener);
        if (numberTypeface != null) {
            this.styleView.setTypeface(numberTypeface);
        }
        this.closeView = (ImageView) findViewById(R.id.au_key_close);
        Drawable downArrowDrawable = AntuiServiceAdapter.getAntuiKeyboardConfig().getDownArrowDrawable(context);
        if (downArrowDrawable != null) {
            this.closeView.setImageDrawable(downArrowDrawable);
        }
        ImageView imageView = (ImageView) findViewById(R.id.au_key_delete_iconview);
        Drawable backspaceDrawable = AntuiServiceAdapter.getAntuiKeyboardConfig().getBackspaceDrawable(context, this.bigKeyboard);
        if (backspaceDrawable != null) {
            imageView.setImageDrawable(backspaceDrawable);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.au_key_delete);
        this.deleteView = frameLayout;
        frameLayout.setOnClickListener(this);
        this.deleteView.setOnLongClickListener(this);
        this.deleteView.setOnTouchListener(this);
        if (!this.mIsOldLayout) {
            TextView textView3 = (TextView) findViewById(R.id.au_key_confirm);
            this.keyConfirm = textView3;
            textView3.setOnClickListener(this);
            this.keyConfirm.setOnTouchListener(this.vibrateToucheListener);
        }
        setStyle(i);
    }

    public static /* synthetic */ Object ipc$super(AUNumberKeyboardView aUNumberKeyboardView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/antui/keyboard/AUNumberKeyboardView");
    }

    private void onNumClick(View view, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2f91ce", new Object[]{this, view, charSequence});
            return;
        }
        OnActionClickListener onActionClickListener = this.actionClickListener;
        if (onActionClickListener != null) {
            onActionClickListener.onNumClick(view, charSequence);
        }
    }

    private void showStyleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde9fd80", new Object[]{this});
        } else if (this.styleView.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams = this.deleteView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
                this.deleteView.setLayoutParams(layoutParams);
            }
            this.styleView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = this.closeView.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.weight = 1.0f;
                this.closeView.setLayoutParams(layoutParams3);
            }
        }
    }

    private void vibrate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bd9e9c", new Object[]{this, view});
        } else if (!this.closeVibrator) {
            int id = view.getId();
            if (id == R.id.au_key_delete || id == R.id.au_key_confirm || (view instanceof TextView)) {
                try {
                    if (this.vibrator == null) {
                        this.vibrator = (Vibrator) getContext().getSystemService("vibrator");
                    }
                    this.vibrator.vibrate(20L);
                } catch (Throwable th) {
                    IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
                    antuiLogger.error(TAG, "数字键盘震动异常:" + th);
                }
            }
        }
    }

    public TextView getConfirmButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("38eb8c57", new Object[]{this});
        }
        return this.keyConfirm;
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        int visibility = getVisibility();
        setVisibility(8);
        WindowStateChangeListener windowStateChangeListener = this.windowStateChangeListener;
        if (windowStateChangeListener != null) {
            windowStateChangeListener.stateChange(false, 0);
        }
        KeyboardStateChangeListener keyboardStateChangeListener = this.keyboardStateChangeListener;
        if (keyboardStateChangeListener != null && visibility != 8) {
            keyboardStateChangeListener.onKeyboardStageChanged(false);
        }
    }

    public void hideAlipaySafeTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fc4989", new Object[]{this});
        }
    }

    public void hideTopDividerLine(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ac2b73", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.topDividerLine;
        if (view != null) {
            if (z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void hideTopbar(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c6c0ad", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.topBar;
        if (view != null) {
            if (z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public boolean isShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc734052", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.topBar) {
            OnActionClickListener onActionClickListener = this.actionClickListener;
            if (onActionClickListener != null) {
                onActionClickListener.onCloseClick(view);
            }
        } else if (id == R.id.au_key_delete) {
            if (this.actionClickListener != null) {
                AntuiServiceAdapter.getAntuiLogger().debug(TAG, "onClick");
                this.actionClickListener.onDeleteClick(view);
            }
        } else if (id == R.id.au_key_confirm) {
            OnActionClickListener onActionClickListener2 = this.actionClickListener;
            if (onActionClickListener2 != null) {
                onActionClickListener2.onConfirmClick(view);
            }
            OnConfirmClickListener onConfirmClickListener = this.confirmClickListener;
            if (onConfirmClickListener != null) {
                onConfirmClickListener.onConfirmClick(view);
            }
        } else if (view instanceof TextView) {
            onNumClick(view, ((TextView) view).getText());
        }
    }

    public void setActionClickListener(OnActionClickListener onActionClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56aabccc", new Object[]{this, onActionClickListener});
        } else {
            this.actionClickListener = onActionClickListener;
        }
    }

    public void setActionTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bbe42b", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.keyConfirm;
        if (textView instanceof TextView) {
            textView.setText(charSequence);
        }
    }

    public void setBackspaceButtonSetting(BackspaceButtonSetting backspaceButtonSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3982bb", new Object[]{this, backspaceButtonSetting});
        } else if (backspaceButtonSetting != null) {
            this.deleteView.removeAllViews();
            TextView textView = new TextView(getContext());
            textView.setGravity(17);
            backspaceButtonSetting.setBackspaceButtonSetting(textView, true ^ this.bigKeyboard);
            this.deleteView.addView(textView, -1, -1);
        }
    }

    public void setConfirmClickListener(OnConfirmClickListener onConfirmClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36a4ffc", new Object[]{this, onConfirmClickListener});
        } else {
            this.confirmClickListener = onConfirmClickListener;
        }
    }

    public void setConfirmKeyEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1216fcad", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.keyConfirm;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public void setCustomerTopView(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab5d3868", new Object[]{this, view, layoutParams});
        } else if (this.topLayout != null) {
            for (int i = 0; i < this.topLayout.getChildCount(); i++) {
                if (!(this.topLayout.getChildAt(i) == this.topBar || this.topLayout.getChildAt(i) == null)) {
                    this.topLayout.removeViewAt(i);
                }
            }
            hideAlipaySafeTip();
            this.closeView.setVisibility(8);
            if (view != null) {
                this.topLayout.addView(view, layoutParams);
            }
        }
    }

    public void setKeyboardStateChangeListener(KeyboardStateChangeListener keyboardStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4dc792", new Object[]{this, keyboardStateChangeListener});
        } else {
            this.keyboardStateChangeListener = keyboardStateChangeListener;
        }
    }

    public void setNumKeyRandom(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51636d4f", new Object[]{this, new Boolean(z)});
            return;
        }
        int length = NUM.length;
        if (z) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                String[] strArr = NUM;
                if (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            while (i < length) {
                this.numViewList.get(i).setText(getRandomNum(arrayList));
                i++;
            }
            return;
        }
        while (i < length) {
            this.numViewList.get(i).setText(NUM[i]);
            i++;
        }
    }

    public void setStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e94e4d", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.styleView.setText(".");
            showStyleView();
        } else if (i == 2) {
            this.styleView.setText("X");
            showStyleView();
        } else if (i == 3) {
            this.styleView.setText("");
            if (this.mIsOldLayout) {
                showStyleView();
            } else {
                hideStyleView();
            }
        } else if (i == 4) {
            this.styleView.setText("-");
            showStyleView();
        }
    }

    public void setWindowStateChangeListener(WindowStateChangeListener windowStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a662f9b2", new Object[]{this, windowStateChangeListener});
        } else {
            this.windowStateChangeListener = windowStateChangeListener;
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        int visibility = getVisibility();
        setVisibility(0);
        WindowStateChangeListener windowStateChangeListener = this.windowStateChangeListener;
        if (windowStateChangeListener != null) {
            windowStateChangeListener.stateChange(true, SdkUtils.dip2px(getContext(), 222.0f));
        }
        KeyboardStateChangeListener keyboardStateChangeListener = this.keyboardStateChangeListener;
        if (keyboardStateChangeListener != null && visibility != 0) {
            keyboardStateChangeListener.onKeyboardStageChanged(true);
        }
    }

    public void showAlipaySafeTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c81192e", new Object[]{this});
        }
    }

    public AUNumberKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 1, false, null);
    }

    private int checkKeyboardTheme(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd30cde0", new Object[]{this, attributeSet})).intValue();
        }
        try {
            this.closeVibrator = "true".equals(AntuiServiceAdapter.getAntuiSwitch().getConfig(CLOSE_KEYBOARD_VIBRATOR_CONFIG_KEY));
        } catch (Exception e) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            antuiLogger.error(TAG, "FALLBACK_KEYBOARD_THEME_CONFIG_KEY 配置错误: " + e);
        }
        int i = this.keyboardTheme;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AUNumberKeyboardView);
            i = obtainStyledAttributes.getInt(R.styleable.AUNumberKeyboardView_keyboardTheme, this.keyboardTheme);
            obtainStyledAttributes.recycle();
        }
        if (i >= 2) {
            return i;
        }
        return 2;
    }

    public AUNumberKeyboardView(Context context, int i, boolean z) {
        this(context, null, i, z, null);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        if (view.getId() == R.id.au_key_delete) {
            this.startLongDelete = true;
            AntuiServiceAdapter.getAntuiLogger().debug(TAG, "startLongDelete = true");
            if (this.actionClickListener != null) {
                postDelayed(new Runnable() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (AUNumberKeyboardView.access$100(AUNumberKeyboardView.this) && AUNumberKeyboardView.access$200(AUNumberKeyboardView.this) != null) {
                            AUNumberKeyboardView.access$200(AUNumberKeyboardView.this).onDeleteClick(view);
                            AUNumberKeyboardView.this.postDelayed(this, 150L);
                        }
                    }
                }, 150L);
            }
        }
        return false;
    }

    public AUNumberKeyboardView(Context context, int i, boolean z, int i2) {
        this(context, null, i, z, i2, null);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (view.getId() != R.id.au_key_delete) {
            return true;
        }
        AntuiServiceAdapter.getAntuiLogger().debug(TAG, "onTouch");
        if (motionEvent.getAction() == 0) {
            vibrate(view);
        }
        int action = motionEvent.getAction() & 255;
        if ((action == 1 || action == 3) && this.startLongDelete) {
            AntuiServiceAdapter.getAntuiLogger().debug(TAG, "startLongDelete = false");
            this.startLongDelete = false;
        }
        return false;
    }

    public AUNumberKeyboardView(Context context, int i, OnActionClickListener onActionClickListener) {
        this(context, null, i, false, onActionClickListener);
    }

    private void initNewTheme(int i, Context context) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc223b65", new Object[]{this, new Integer(i), context});
            return;
        }
        int[] screenWidth_Height = SdkUtils.getScreenWidth_Height(context);
        int i4 = screenWidth_Height[1];
        int i5 = screenWidth_Height[0];
        int i6 = 1200;
        try {
            String config = AntuiServiceAdapter.getAntuiSwitch().getConfig("AUNumberKeyboardView_small_keyboard_height");
            if (!TextUtils.isEmpty(config)) {
                i6 = Integer.parseInt(config);
            }
        } catch (Throwable th) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            antuiLogger.error(TAG, "屏幕高度开关解释异常: " + th);
        }
        IAntuiLogger antuiLogger2 = AntuiServiceAdapter.getAntuiLogger();
        antuiLogger2.info(TAG, "initNewTheme,screenHeight=" + i4 + ",keyboardTheme=" + i);
        this.bigKeyboard = true;
        if (i == 3) {
            this.bigKeyboard = false;
        }
        if (this.bigKeyboard && i == 2 && i4 < i6) {
            this.bigKeyboard = false;
        }
        if (i == 4) {
            this.bigKeyboard = true;
        }
        if (this.bigKeyboard) {
            LayoutInflater from = LayoutInflater.from(context);
            if (this.mIsOldLayout) {
                i3 = R.layout.au_number_keyboard_view_theme_v2;
            } else {
                i3 = R.layout.au_number_keyboard_view_v2_theme_v2;
            }
            from.inflate(i3, (ViewGroup) this, true);
            return;
        }
        LayoutInflater from2 = LayoutInflater.from(context);
        if (this.mIsOldLayout) {
            i2 = R.layout.au_number_keyboard_view_theme_v2_small;
        } else {
            i2 = R.layout.au_number_keyboard_view_v2_theme_v2_small;
        }
        from2.inflate(i2, (ViewGroup) this, true);
    }

    public AUNumberKeyboardView(Context context, AttributeSet attributeSet, int i, boolean z, OnActionClickListener onActionClickListener) {
        this(context, attributeSet, i, z, 2, onActionClickListener);
    }

    public AUNumberKeyboardView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, OnActionClickListener onActionClickListener) {
        super(context, attributeSet);
        this.startLongDelete = false;
        this.numViewList = new ArrayList();
        this.keyboardTheme = 2;
        this.closeVibrator = false;
        this.vibrateToucheListener = new View.OnTouchListener() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    AUNumberKeyboardView.access$000(AUNumberKeyboardView.this, view);
                }
                return false;
            }
        };
        this.bigKeyboard = true;
        this.mIsOldLayout = z;
        this.actionClickListener = onActionClickListener;
        this.keyboardTheme = (i2 < 2 || i2 > 4) ? 2 : i2;
        init(context, attributeSet, i);
    }
}
