package com.alipay.android.msp.ui.base.keyboard;

import android.app.Activity;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.android.app.safepaybase.alikeyboard.AliKeyboardType;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.KeyboardManager;
import com.alipay.android.app.template.KeyboardType;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspKeyboardService implements TemplateKeyboardService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSIST_SERVICE = "assist_service";
    public static final String BIRDNEST_RENDER = "birdnest_render";

    /* renamed from: a  reason: collision with root package name */
    public final String f3727a;

    public MspKeyboardService(String str) {
        this.f3727a = str;
    }

    @Override // com.alipay.android.app.template.TemplateKeyboardService
    public void destroyKeyboard(View view) {
        AlipayKeyboard keyboard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb8b1ca", new Object[]{this, view});
            return;
        }
        LogUtil.record(4, "", "MspKeyboardService::destroyKeyboard", "MspKeyboardService-destroyKeyboard:::enter");
        if (view == null) {
            LogUtil.record(4, "", "MspKeyboardService::destroyKeyboard", "MspKeyboardService-destroyKeyboard:::decorView is null");
        } else if (!TextUtils.equals(this.f3727a, BIRDNEST_RENDER) && (keyboard = KeyboardManager.getKeyboard(view.hashCode())) != null) {
            keyboard.hideKeyboard();
            KeyboardManager.unBindKeyboard(view.hashCode());
            LogUtil.record(4, "", "MspKeyboardService::destroyKeyboard", "MspKeyboardService-destroyKeyboard:::unBindKeyboard");
        }
    }

    public void destroyKeyboardForCashier(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600563f0", new Object[]{this, view});
            return;
        }
        LogUtil.record(4, "", "MspKeyboardService::destroyKeyboardForCashier", "MspKeyboardService-destroyKeyboard:::enter");
        if (view == null) {
            LogUtil.record(4, "", "MspKeyboardService::destroyKeyboardForCashier", "MspKeyboardService-destroyKeyboard:::decorView is null");
            return;
        }
        AlipayKeyboard keyboard = KeyboardManager.getKeyboard(view.hashCode());
        if (keyboard != null) {
            keyboard.hideKeyboard();
            KeyboardManager.unBindKeyboard(view.hashCode());
            LogUtil.record(4, "", "MspKeyboardService::destroyKeyboardForCashier", "MspKeyboardService-destroyKeyboard:::unBindKeyboard");
        }
    }

    @Override // com.alipay.android.app.template.TemplateKeyboardService
    public boolean hideKeyboard(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc85cb86", new Object[]{this, view})).booleanValue();
        }
        LogUtil.record(4, "", "MspKeyboardService::hideKeyboard", "MspKeyboardService-hideKeyboard:::enter");
        if (view == null) {
            LogUtil.record(4, "", "MspKeyboardService::hideKeyboard", "MspKeyboardService-hideKeyboard:::decorView is null");
            return false;
        }
        AlipayKeyboard keyboard = KeyboardManager.getKeyboard(view.hashCode());
        if (keyboard == null) {
            return false;
        }
        boolean isShowKeyboard = keyboard.isShowKeyboard();
        keyboard.hideKeyboard();
        LogUtil.record(4, "", "MspKeyboardService::hideKeyboard", "MspKeyboardService-hideKeyboard:::isShowKeyboard:".concat(String.valueOf(isShowKeyboard)));
        return isShowKeyboard;
    }

    @Override // com.alipay.android.app.template.TemplateKeyboardService
    public boolean showKeyboard(EditText editText, KeyboardType keyboardType, View view, View view2, boolean z, int i) {
        FrameLayout frameLayout;
        AlipayKeyboard alipayKeyboard;
        AliKeyboardType aliKeyboardType;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bce61c5", new Object[]{this, editText, keyboardType, view, view2, new Boolean(z), new Integer(i)})).booleanValue();
        }
        LogUtil.record(4, "", "MspKeyboardService::showKeyboard", "MspKeyboardService-showKeyboard-enter");
        if (editText != null && (editText.getContext() instanceof Activity)) {
            editText.getContext();
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount();
        while (true) {
            frameLayout = null;
            if (i2 >= childCount) {
                alipayKeyboard = null;
                break;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AlipayKeyboard) {
                alipayKeyboard = (AlipayKeyboard) childAt;
                break;
            }
            i2++;
        }
        if (alipayKeyboard == null) {
            LogUtil.record(4, "", "MspKeyboardService::showKeyboard", "MspKeyboardService-showKeyboard-addKeyboard");
            alipayKeyboard = new AlipayKeyboard(view.getContext());
            if (view instanceof FrameLayout) {
                frameLayout = (FrameLayout) view;
            }
            alipayKeyboard.initializeKeyboard(frameLayout);
            if (view2 instanceof LinearLayout) {
                alipayKeyboard.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                ((LinearLayout) view2).addView(alipayKeyboard);
            } else if (view2 instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                alipayKeyboard.setLayoutParams(layoutParams);
                ((FrameLayout) view2).addView(alipayKeyboard);
            }
        }
        KeyboardManager.bindKeyboard(view.hashCode(), alipayKeyboard);
        if (keyboardType == KeyboardType.money) {
            aliKeyboardType = AliKeyboardType.money;
        } else if (keyboardType == KeyboardType.num) {
            aliKeyboardType = AliKeyboardType.num;
        } else {
            if (keyboardType != KeyboardType.text) {
                if (keyboardType == KeyboardType.idcard) {
                    aliKeyboardType = AliKeyboardType.idcard;
                } else if (keyboardType == KeyboardType.phone) {
                    aliKeyboardType = AliKeyboardType.phone;
                } else if (keyboardType == KeyboardType.customnumber) {
                    aliKeyboardType = AliKeyboardType.spwd;
                }
            }
            aliKeyboardType = AliKeyboardType.abc;
        }
        if (keyboardType == KeyboardType.customalphabet) {
            editText.setInputType(129);
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (keyboardType == KeyboardType.customnumber) {
            editText.setInputType(8194);
        }
        alipayKeyboard.showKeyboard(aliKeyboardType, editText, i);
        LogUtil.record(4, "", "MspKeyboardService::showKeyboard", "type=" + keyboardType + " ,height = " + alipayKeyboard.getMeasuredHeight());
        return true;
    }
}
