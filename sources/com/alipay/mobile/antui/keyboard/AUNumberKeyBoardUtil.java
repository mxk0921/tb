package com.alipay.mobile.antui.keyboard;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ScrollView;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.mobile.antui.keyboard.AUNumberKeyboardView;
import com.alipay.mobile.antui.service.AntuiServiceAdapter;
import com.alipay.mobile.antui.service.IAntuiLogger;
import com.alipay.mobile.antui.utils.SdkUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AUNumberKeyBoardUtil implements AUNumberKeyboardView.OnActionClickListener, View.OnKeyListener, WindowStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public final AUNumberKeyboardView c;
    public final EditText d;
    public ScrollView e;
    public final boolean g;
    public AUNumberKeyboardView.OnConfirmClickListener h;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3878a = new Handler(Looper.getMainLooper());
    public boolean f = false;

    public AUNumberKeyBoardUtil(Context context, EditText editText, AUNumberKeyboardView aUNumberKeyboardView, int i) {
        this.g = true;
        this.b = context;
        this.d = editText;
        this.c = aUNumberKeyboardView;
        b();
        a();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().setSoftInputMode(i | 3);
        }
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (AUNumberKeyBoardUtil.access$000(AUNumberKeyBoardUtil.this).isFocused()) {
                    AUNumberKeyBoardUtil.this.showKeyboard();
                }
                return false;
            }
        });
        editText.setOnKeyListener(this);
        if ("true".equals(AntuiServiceAdapter.getAntuiSwitch().getConfig("NUMKEYBOARD_TALKBACK_INPUTFIX_DISABLE"))) {
            this.g = false;
        }
    }

    public static /* synthetic */ EditText access$000(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("e0de01f5", new Object[]{aUNumberKeyBoardUtil});
        }
        return aUNumberKeyBoardUtil.d;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "AUNumberKeyBoardUtil";
    }

    public static /* synthetic */ boolean access$200(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c068b08", new Object[]{aUNumberKeyBoardUtil})).booleanValue();
        }
        return aUNumberKeyBoardUtil.f;
    }

    public static /* synthetic */ AUNumberKeyboardView access$300(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AUNumberKeyboardView) ipChange.ipc$dispatch("f43338cd", new Object[]{aUNumberKeyBoardUtil});
        }
        return aUNumberKeyBoardUtil.c;
    }

    public static /* synthetic */ Handler access$400(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7ded4944", new Object[]{aUNumberKeyBoardUtil});
        }
        return aUNumberKeyBoardUtil.f3878a;
    }

    public static /* synthetic */ ScrollView access$500(AUNumberKeyBoardUtil aUNumberKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollView) ipChange.ipc$dispatch("6c0b2eb5", new Object[]{aUNumberKeyBoardUtil});
        }
        return aUNumberKeyBoardUtil.e;
    }

    public static boolean rollbackSkipTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("242630c3", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(AntuiServiceAdapter.getAntuiSwitch().getConfig("AUNumberKeyBoardUtil_rollback_skip_transition"));
        } catch (Exception e) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            antuiLogger.error("AUNumberKeyBoardUtil", "ConfigService 配置错误: " + e);
            return false;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dc6ee3", new Object[]{this});
            return;
        }
        this.c.setActionClickListener(this);
        this.c.setWindowStateChangeListener(this);
        if (rollbackSkipTransition()) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            ((ViewGroup) this.c.getParent()).setLayoutTransition(layoutTransition);
        }
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onCloseClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d41fa5c", new Object[]{this, view});
        } else {
            hideKeyboard();
        }
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onConfirmClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348892e4", new Object[]{this, view});
            return;
        }
        AUNumberKeyboardView.OnConfirmClickListener onConfirmClickListener = this.h;
        if (onConfirmClickListener != null) {
            onConfirmClickListener.onConfirmClick(view);
        }
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onDeleteClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd84fed", new Object[]{this, view});
            return;
        }
        Editable text = this.d.getText();
        int selectionStart = this.d.getSelectionStart();
        if (selectionStart > 0) {
            text.delete(selectionStart - 1, selectionStart);
            return;
        }
        int length = text.length();
        if (length > 0 && this.g && isTouchExplorationEnabled(this.b)) {
            text.delete(length - 1, length);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || !this.c.isShow()) {
            return false;
        }
        hideKeyboard();
        return true;
    }

    @Override // com.alipay.mobile.antui.keyboard.AUNumberKeyboardView.OnActionClickListener
    public void onNumClick(View view, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2f91ce", new Object[]{this, view, charSequence});
            return;
        }
        Editable text = this.d.getText();
        int selectionStart = this.d.getSelectionStart();
        if (selectionStart != -1) {
            text.insert(selectionStart, charSequence);
        } else if (this.g && isTouchExplorationEnabled(this.b)) {
            text.insert(text.length(), charSequence);
        }
    }

    public void setConfirmClickListener(AUNumberKeyboardView.OnConfirmClickListener onConfirmClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36a4ffc", new Object[]{this, onConfirmClickListener});
        } else {
            this.h = onConfirmClickListener;
        }
    }

    public void setScrollView(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f3aca9", new Object[]{this, scrollView});
        } else {
            this.e = scrollView;
        }
    }

    public static boolean isTouchExplorationEnabled(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("714a4152", new Object[]{context})).booleanValue();
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null) {
                return accessibilityManager.isTouchExplorationEnabled();
            }
        } catch (Throwable th) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            antuiLogger.error("AUNumberKeyBoardUtil", "isTouchExplorationEnabled出错：" + th);
        }
        return false;
    }

    public void hideKeyboard() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
        StringBuilder sb = new StringBuilder("will hideKeyboard,mKeyboardView=");
        sb.append(this.c);
        sb.append(",isShow()=");
        AUNumberKeyboardView aUNumberKeyboardView = this.c;
        if (aUNumberKeyboardView != null) {
            obj = Boolean.valueOf(aUNumberKeyboardView.isShow());
        } else {
            obj = "null";
        }
        sb.append(obj);
        antuiLogger.debug("AUNumberKeyBoardUtil", sb.toString());
        this.f = true;
        AUNumberKeyboardView aUNumberKeyboardView2 = this.c;
        if (aUNumberKeyboardView2 != null && aUNumberKeyboardView2.isShow()) {
            AntuiServiceAdapter.getAntuiLogger().debug("AUNumberKeyBoardUtil", MspEventTypes.ACTION_STRING_HIDE_KEYBOARD);
            this.c.hide();
        }
    }

    public boolean hideSysKeyboard() {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf562bd", new Object[]{this})).booleanValue();
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.d.getContext().getSystemService("input_method");
        if (!inputMethodManager.isActive() || (editText = this.d) == null || editText.getWindowToken() == null) {
            return false;
        }
        boolean hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(this.d.getWindowToken(), 2, new ResultReceiver(null) { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.2
            @Override // android.os.ResultReceiver
            public void onReceiveResult(final int i, Bundle bundle) {
                AntuiServiceAdapter.getAntuiLogger().debug(AUNumberKeyBoardUtil.access$100(), "onReceiveResult");
                AUNumberKeyBoardUtil.access$400(AUNumberKeyBoardUtil.this).postDelayed(new Runnable() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
                        String access$100 = AUNumberKeyBoardUtil.access$100();
                        antuiLogger.debug(access$100, "onReceiveResult show,resultCode=" + i + ",hideKeyboardAction=" + AUNumberKeyBoardUtil.access$200(AUNumberKeyBoardUtil.this));
                        if (!AUNumberKeyBoardUtil.access$200(AUNumberKeyBoardUtil.this)) {
                            AUNumberKeyBoardUtil.access$300(AUNumberKeyBoardUtil.this).show();
                        }
                    }
                }, 200L);
            }
        });
        IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
        antuiLogger.debug("AUNumberKeyBoardUtil", "hideSoftInputFromWindow hide = " + hideSoftInputFromWindow);
        return hideSoftInputFromWindow;
    }

    public void showKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9488b", new Object[]{this});
            return;
        }
        this.f = false;
        AntuiServiceAdapter.getAntuiLogger().debug("AUNumberKeyBoardUtil", "will showKeyboard");
        AUNumberKeyboardView aUNumberKeyboardView = this.c;
        if (aUNumberKeyboardView != null && !aUNumberKeyboardView.isShow()) {
            AntuiServiceAdapter.getAntuiLogger().debug("AUNumberKeyBoardUtil", "showKeyboard");
            if (!hideSysKeyboard()) {
                this.c.show();
            }
        }
    }

    public final void a() {
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(this.d, Boolean.FALSE);
        } catch (Exception e) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            antuiLogger.error("AUNumberKeyBoardUtil", "disableShowSoftInput Exception" + e);
        }
    }

    @Override // com.alipay.mobile.antui.keyboard.WindowStateChangeListener
    public void stateChange(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a8f057", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (z && this.f) {
            hideKeyboard();
        }
        if (this.e != null) {
            IAntuiLogger antuiLogger = AntuiServiceAdapter.getAntuiLogger();
            antuiLogger.debug("AUNumberKeyBoardUtil", "isShow = " + z);
            if (z) {
                int[] iArr = new int[2];
                this.d.getLocationOnScreen(iArr);
                int height = this.d.getHeight() + iArr[1];
                int i2 = SdkUtils.getScreenWidth_Height(this.b)[1];
                if (height > i2 - i) {
                    IAntuiLogger antuiLogger2 = AntuiServiceAdapter.getAntuiLogger();
                    antuiLogger2.debug("AUNumberKeyBoardUtil", "currentLocY = " + height + ", height=" + i);
                    final int i3 = (height + i) - i2;
                    this.f3878a.postDelayed(new Runnable() { // from class: com.alipay.mobile.antui.keyboard.AUNumberKeyBoardUtil.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            IAntuiLogger antuiLogger3 = AntuiServiceAdapter.getAntuiLogger();
                            String access$100 = AUNumberKeyBoardUtil.access$100();
                            antuiLogger3.debug(access$100, "mScrollView to  = " + i3);
                            AUNumberKeyBoardUtil.access$500(AUNumberKeyBoardUtil.this).smoothScrollTo(0, i3);
                        }
                    }, 200L);
                }
            }
        }
    }
}
