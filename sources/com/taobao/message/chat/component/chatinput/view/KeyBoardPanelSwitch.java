package com.taobao.message.chat.component.chatinput.view;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class KeyBoardPanelSwitch implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEF_KEYBOARD_HEIGHT = 214;
    private static final String TAG = "KeyBoardPanelSwitch";
    public static final int heightThreshold = 180;
    private Activity mActivity;
    private View mFocus;
    private InputMethodManager mInputManager;
    private View mResize;
    private View mTarget;
    private final int minHeight;
    private boolean shouldPanelOn;
    public static int SOFT_KEYBOARD_HEIGHT = 0;
    private static long lastClickTime = 0;
    private int mKeyboardHeight = 0;
    private List<IStopInputLisenter> stopInputLisenterList = new ArrayList(5);
    private int minHeightInDip = DEF_KEYBOARD_HEIGHT;
    private int preDiff = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface IStopInputLisenter {
        void onStop();
    }

    static {
        t2o.a(552599577);
    }

    private KeyBoardPanelSwitch(Activity activity) {
        this.mActivity = activity;
        this.minHeight = DisplayUtil.dip2px(activity, (float) DEF_KEYBOARD_HEIGHT);
        this.mInputManager = (InputMethodManager) activity.getSystemService("input_method");
    }

    public static /* synthetic */ View access$000(KeyBoardPanelSwitch keyBoardPanelSwitch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("72447756", new Object[]{keyBoardPanelSwitch});
        }
        return keyBoardPanelSwitch.mFocus;
    }

    public static /* synthetic */ InputMethodManager access$100(KeyBoardPanelSwitch keyBoardPanelSwitch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputMethodManager) ipChange.ipc$dispatch("427aabd6", new Object[]{keyBoardPanelSwitch});
        }
        return keyBoardPanelSwitch.mInputManager;
    }

    private void addIntSharedpreferences(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3194c2f7", new Object[]{this, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.mActivity.getApplication()).edit();
        edit.putInt("Preference_KeyBoardHeight", i);
        edit.apply();
    }

    private void changeKeyboardHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85525e", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.minHeight;
        if (i < i2) {
            i = i2;
        }
        if (this.mKeyboardHeight != i) {
            this.mKeyboardHeight = i;
            SOFT_KEYBOARD_HEIGHT = i;
            addIntSharedpreferences(i);
            if (ApplicationUtil.isDebug()) {
                TLog.logd(TAG, "changeKeyboardHeight mKeyboardHeight=" + this.mKeyboardHeight);
            }
        }
    }

    private int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        int keyBoardHeight = getKeyBoardHeight();
        int i = this.minHeight;
        if (keyBoardHeight < i) {
            return i;
        }
        return keyBoardHeight;
    }

    public static int getKeyBoardHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cb41f3e", new Object[0])).intValue();
        }
        return SharedPreferencesUtil.getIntSharedPreference("Preference_KeyBoardHeight", DisplayUtil.dip2px(214.0f));
    }

    private void hide(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300cdb2b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            if (!this.shouldPanelOn) {
                this.mActivity.getWindow().setSoftInputMode(18);
                for (IStopInputLisenter iStopInputLisenter : this.stopInputLisenterList) {
                    if (iStopInputLisenter != null) {
                        iStopInputLisenter.onStop();
                    }
                }
            }
        } else if (this.mActivity.getWindow().getDecorView().getSystemUiVisibility() == 0) {
            this.mFocus.requestFocus();
        }
        View view = this.mResize;
        if (!this.shouldPanelOn) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private boolean hideSoftInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c129029", new Object[]{this})).booleanValue();
        }
        this.mFocus.clearFocus();
        return this.mInputManager.hideSoftInputFromWindow(this.mTarget.getWindowToken(), 0);
    }

    public static boolean isFastDoubleClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a022624f", new Object[]{new Integer(i)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - lastClickTime;
        if (0 < j && j < i) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }

    private void resizeLayout4KeyBoard(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579e4d55", new Object[]{this, view, new Integer(i)});
            return;
        }
        TLog.loge(TAG, "resizeLayout4KeyBoard height:" + i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static KeyBoardPanelSwitch with(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyBoardPanelSwitch) ipChange.ipc$dispatch("baec9374", new Object[]{activity});
        }
        return new KeyBoardPanelSwitch(activity);
    }

    public KeyBoardPanelSwitch addStopInputLisenter(IStopInputLisenter iStopInputLisenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyBoardPanelSwitch) ipChange.ipc$dispatch("b3669895", new Object[]{this, iStopInputLisenter});
        }
        this.stopInputLisenterList.add(iStopInputLisenter);
        return this;
    }

    public KeyBoardPanelSwitch build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyBoardPanelSwitch) ipChange.ipc$dispatch("37e12f1e", new Object[]{this});
        }
        this.mActivity.getWindow().setSoftInputMode(19);
        measureKeyBoard();
        return this;
    }

    public KeyBoardPanelSwitch focusOn(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyBoardPanelSwitch) ipChange.ipc$dispatch("6357643f", new Object[]{this, view});
        }
        this.mFocus = view;
        return this;
    }

    public KeyBoardPanelSwitch focusWith(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyBoardPanelSwitch) ipChange.ipc$dispatch("f00ea0a6", new Object[]{this, view});
        }
        this.mTarget = view;
        return this;
    }

    public boolean hideAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c261f20a", new Object[]{this})).booleanValue();
        }
        this.shouldPanelOn = false;
        if (hideSoftInput() && this.mResize.getVisibility() == 8) {
            return false;
        }
        this.mActivity.getWindow().setSoftInputMode(18);
        this.mResize.setVisibility(8);
        this.mFocus.clearFocus();
        for (IStopInputLisenter iStopInputLisenter : this.stopInputLisenterList) {
            if (iStopInputLisenter != null) {
                iStopInputLisenter.onStop();
            }
        }
        return true;
    }

    public void measureKeyBoard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5159a94c", new Object[]{this});
        } else {
            this.mActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.stopInputLisenterList.clear();
    }

    public KeyBoardPanelSwitch resizeOn(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyBoardPanelSwitch) ipChange.ipc$dispatch("dd04a31b", new Object[]{this, view});
        }
        this.mResize = view;
        return this;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.shouldPanelOn = true;
        if (!hideSoftInput() || this.mResize.getVisibility() != 0) {
            resizeLayout4KeyBoard(this.mResize, getHeight());
            this.mActivity.getWindow().setSoftInputMode(34);
            this.mResize.setVisibility(0);
        }
    }

    public void showSoftInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd2fa4a", new Object[]{this});
        } else if (!isFastDoubleClick(600)) {
            this.mFocus.requestFocus();
            this.mFocus.postDelayed(new Runnable() { // from class: com.taobao.message.chat.component.chatinput.view.KeyBoardPanelSwitch.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        KeyBoardPanelSwitch.access$100(KeyBoardPanelSwitch.this).showSoftInput(KeyBoardPanelSwitch.access$000(KeyBoardPanelSwitch.this), 0);
                    }
                }
            }, 100L);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        Rect rect = new Rect();
        this.mTarget.getWindowVisibleDisplayFrame(rect);
        int height = this.mTarget.getRootView().getHeight();
        int i = height - rect.bottom;
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "screenHeight:" + height + " r.bottom:" + rect.bottom + " heightDifference:" + i);
        }
        if (i > 180) {
            if (Math.abs(this.preDiff - i) > 180) {
                int i2 = this.preDiff;
                if (i2 > 180) {
                    i2 = i > i2 ? i - i2 : 0;
                }
                changeKeyboardHeight(i - i2);
                this.shouldPanelOn = false;
                hide(false);
                this.mActivity.getWindow().setSoftInputMode(18);
            }
            this.preDiff = i;
        } else if (i <= 180) {
            if (this.preDiff != i) {
                hide(true);
            }
            this.preDiff = i;
        }
    }
}
