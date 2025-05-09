package com.alipay.android.msp.ui.widget.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.edit.EditTextManager;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PasswordInputPlugin extends AbsFBPlugin implements View.OnClickListener, View.OnFocusChangeListener, View.OnTouchListener, FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int A;
    public int B;
    public final Context q;
    public final FBPluginCtx r;
    public final int s;
    public View u;
    public View v;
    public EditText w;
    public int y;
    public int z;
    public Drawable x = null;
    public boolean C = false;
    public boolean D = true;
    public String E = "";
    public boolean F = false;
    public String G = "";
    public View H = null;
    public String I = "";
    public String[] J = null;
    public TemplatePasswordService t = h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DecorViewInfo {
        public View decorView;
        public boolean isDialog;

        public DecorViewInfo() {
        }
    }

    public PasswordInputPlugin(Context context, FBPluginCtx fBPluginCtx, int i) {
        this.q = context;
        this.r = fBPluginCtx;
        this.s = i;
    }

    public static /* synthetic */ FBPluginCtx access$000(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBPluginCtx) ipChange.ipc$dispatch("b470773e", new Object[]{passwordInputPlugin});
        }
        return passwordInputPlugin.r;
    }

    public static /* synthetic */ View access$100(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d8706f8", new Object[]{passwordInputPlugin});
        }
        return passwordInputPlugin.d();
    }

    public static /* synthetic */ View access$1000(PasswordInputPlugin passwordInputPlugin, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("83dcc026", new Object[]{passwordInputPlugin, view, view2});
        }
        return passwordInputPlugin.b(view, view2);
    }

    public static /* synthetic */ Context access$200(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ce62f5ef", new Object[]{passwordInputPlugin});
        }
        return passwordInputPlugin.q;
    }

    public static /* synthetic */ boolean access$300(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8feec7bc", new Object[]{passwordInputPlugin})).booleanValue();
        }
        return passwordInputPlugin.D;
    }

    public static /* synthetic */ EditText access$400(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("823570a8", new Object[]{passwordInputPlugin});
        }
        return passwordInputPlugin.w;
    }

    public static /* synthetic */ String access$500(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12ab50a6", new Object[]{passwordInputPlugin});
        }
        return passwordInputPlugin.I;
    }

    public static /* synthetic */ String access$502(PasswordInputPlugin passwordInputPlugin, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aed27f5a", new Object[]{passwordInputPlugin, str});
        }
        passwordInputPlugin.I = str;
        return str;
    }

    public static /* synthetic */ String access$600(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5aaaaf05", new Object[]{passwordInputPlugin});
        }
        return passwordInputPlugin.E;
    }

    public static /* synthetic */ void access$700(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef4b6bc", new Object[]{passwordInputPlugin});
        } else {
            passwordInputPlugin.m();
        }
    }

    public static /* synthetic */ View access$800(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("34fe057f", new Object[]{passwordInputPlugin});
        }
        return passwordInputPlugin.H;
    }

    public static /* synthetic */ void access$900(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b677ae3e", new Object[]{passwordInputPlugin});
        } else {
            passwordInputPlugin.p();
        }
    }

    public static /* synthetic */ Object ipc$super(PasswordInputPlugin passwordInputPlugin, String str, Object... objArr) {
        if (str.hashCode() == -740778895) {
            return new Boolean(super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/input/PasswordInputPlugin");
    }

    public final View b(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("206955a2", new Object[]{this, view, view2});
        }
        if (view != null) {
            return view;
        }
        o(view2.findViewById(R.id.flybird_main_layout));
        return g();
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        EditText editText = new EditText(context);
        this.w = editText;
        editText.setBackgroundDrawable(null);
        this.w.setCursorVisible(true);
        this.w.setPadding(0, 0, 0, 0);
        this.r.setHasInput(true);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.w, 0);
        } catch (Exception unused) {
        }
        this.x = UIUtil.getPaddingDrawable(R.drawable.mini_template_clean_icon, context);
        k();
        j();
        EditText editText2 = this.w;
        this.u = editText2;
        return editText2;
    }

    public final View d() {
        FBPluginCtx fBPluginCtx = this.r;
        if (!(fBPluginCtx == null || fBPluginCtx.getBodyView() == null)) {
            Object bodyView = fBPluginCtx.getBodyView();
            try {
                return (View) bodyView.getClass().getMethod("getInnerView", new Class[0]).invoke(bodyView, new Object[0]);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void doDestroy() {
        TemplatePasswordService passwordService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        if (!(this.r == null || (passwordService = getPasswordService()) == null)) {
            passwordService.clear(this.s);
        }
        this.H = null;
        this.w = null;
        this.x = null;
    }

    public final float e() {
        Object bodyView = this.r.getBodyView();
        if (bodyView == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(bodyView.getClass().getMethod("getOpacity", new Class[0]).invoke(bodyView, new Object[0]).toString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return 1.0f;
        }
    }

    public final DecorViewInfo f() {
        View view;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecorViewInfo) ipChange.ipc$dispatch("531ab3b2", new Object[]{this});
        }
        DecorViewInfo decorViewInfo = new DecorViewInfo();
        if (this.r.getShowingDialog() != null && this.r.getShowingDialog().isShowing()) {
            z = true;
        }
        if (!z) {
            view = ((Activity) this.q).getWindow().getDecorView();
        } else {
            view = this.r.getShowingDialog().getWindow().getDecorView();
        }
        decorViewInfo.decorView = view;
        decorViewInfo.isDialog = z;
        return decorViewInfo;
    }

    public final View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e8befb5", new Object[]{this});
        }
        return this.v;
    }

    public int getBusinessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("544634eb", new Object[]{this})).intValue();
        }
        return this.s;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public String getEncryptValue() {
        TemplatePasswordService passwordService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71c53bb7", new Object[]{this});
        }
        if ((TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_PAYSPWD) || TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_PAYPWD)) && (passwordService = getPasswordService()) != null) {
            return passwordService.getText(this.s);
        }
        return "";
    }

    public View getInnerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this});
        }
        return this.u;
    }

    public TemplatePasswordService getPasswordService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplatePasswordService) ipChange.ipc$dispatch("32d3322c", new Object[]{this});
        }
        return this.t;
    }

    public final TemplatePasswordService h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplatePasswordService) ipChange.ipc$dispatch("1170c352", new Object[]{this});
        }
        if (this.t == null) {
            this.t = new TemplatePasswordService() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.template.TemplatePasswordService
                public void clear(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d17cb12f", new Object[]{this, new Integer(i)});
                    } else {
                        EditTextManager.getEditTextUtils().clear(i);
                    }
                }

                @Override // com.alipay.android.app.template.TemplatePasswordService
                public String getText(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)});
                    }
                    return EditTextManager.getEditTextUtils().getText(i);
                }

                @Override // com.alipay.android.app.template.TemplatePasswordService
                public void onTextChanged(int i, String str, int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b6a2a25", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
                    } else {
                        EditTextManager.getEditTextUtils().OnTextChanged(i, str, i2, i3, i4);
                    }
                }
            };
        }
        return this.t;
    }

    public final boolean i(View view, boolean z) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78fdd11", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        if (!l()) {
            z2 = this.r.getTemplateKeyboardService().hideKeyboard(view);
        } else {
            z2 = false;
        }
        if (!z) {
            return z2;
        }
        if (!z2 && !this.r.getDefaultKeyboardService().hideKeyboard(view)) {
            z3 = false;
        }
        return z3;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abd4f0d", new Object[]{this});
            return;
        }
        EditText editText = this.w;
        if (editText != null) {
            editText.setImeOptions(6);
            this.w.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    View access$100;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (i != 6 || PasswordInputPlugin.access$000(PasswordInputPlugin.this) == null || PasswordInputPlugin.access$000(PasswordInputPlugin.this).getBodyView() == null || (access$100 = PasswordInputPlugin.access$100(PasswordInputPlugin.this)) == null) {
                        return false;
                    }
                    PasswordInputPlugin.access$000(PasswordInputPlugin.this).getDefaultKeyboardService().hideKeyboard(((Activity) PasswordInputPlugin.access$200(PasswordInputPlugin.this)).getWindow().getDecorView());
                    access$100.setFocusable(true);
                    access$100.setFocusableInTouchMode(true);
                    access$100.requestFocus();
                    return true;
                }
            });
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a005a6", new Object[]{this});
            return;
        }
        EditText editText = this.w;
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                        return;
                    }
                    if (PasswordInputPlugin.access$300(PasswordInputPlugin.this)) {
                        String obj = PasswordInputPlugin.access$400(PasswordInputPlugin.this).getText().toString();
                        if (!TextUtils.equals(obj, PasswordInputPlugin.access$500(PasswordInputPlugin.this))) {
                            PasswordInputPlugin.access$502(PasswordInputPlugin.this, obj);
                            if (TextUtils.equals(PasswordInputPlugin.access$600(PasswordInputPlugin.this), UiUtil.INPUT_TYPE_VALUE_MONTH)) {
                                PasswordInputPlugin.access$000(PasswordInputPlugin.this).deliverOnInput(PasswordInputPlugin.this.getNode(), obj.replaceAll("/", ""));
                            } else {
                                PasswordInputPlugin.access$000(PasswordInputPlugin.this).deliverOnInput(PasswordInputPlugin.this.getNode(), obj);
                            }
                        }
                    }
                    PasswordInputPlugin.access$700(PasswordInputPlugin.this);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }
            });
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87984449", new Object[]{this})).booleanValue();
        }
        if (this.r.getTemplateKeyboardService() == null || this.r.getDefaultKeyboardService().equals(this.r.getTemplateKeyboardService())) {
            return true;
        }
        return false;
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5062bda", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.w.setHint(str);
    }

    public final void o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38714033", new Object[]{this, view});
        } else {
            this.v = view;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
        } else {
            if (!TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) {
                try {
                    p();
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            } else {
                this.r.deliverOnBlur(getNode());
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else if (this.r != null && this.q != null && e() > 0.1d && this.r.isOnloadFinish()) {
            if (z && view.isEnabled()) {
                if (TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
                    EditText editText = this.w;
                    editText.setSelection(editText.getEditableText().length());
                }
                if (this.r != null && !UIUtil.isUseDefaultKeyboard(this.E, this.G) && !l()) {
                    this.r.getTemplateKeyboardService().hideKeyboard(f().decorView);
                }
                p();
            }
            m();
            if (z) {
                this.r.deliverOnFocus(getNode());
            } else {
                this.r.deliverOnBlur(getNode());
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.C && this.x != null) {
            int width = this.w.getWidth();
            int height = this.w.getHeight();
            int intrinsicWidth = this.x.getIntrinsicWidth();
            int intrinsicHeight = this.x.getIntrinsicHeight();
            int i = (width - intrinsicWidth) - (intrinsicWidth / 4);
            this.y = i;
            int i2 = (height - intrinsicHeight) / 2;
            this.A = i2;
            this.z = i + intrinsicWidth;
            this.B = i2 + intrinsicHeight;
        }
        if (this.y > 0 && this.C) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.y && x <= this.z && y >= this.A && y <= this.B) {
                if (motionEvent.getAction() == 1) {
                    this.w.setText("");
                    TemplatePasswordService passwordService = getPasswordService();
                    if (passwordService != null) {
                        passwordService.clear(this.s);
                    }
                }
                return true;
            }
        }
        return this.w.onTouchEvent(motionEvent);
    }

    @Override // com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        View view = this.u;
        if (view != null) {
            try {
                view.requestFocus();
                p();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public void setPasswordService(TemplatePasswordService templatePasswordService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54586f52", new Object[]{this, templatePasswordService});
        } else {
            this.t = templatePasswordService;
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d89c71", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        return super.setRect(f, f2, f3, f4);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9446144c", new Object[]{this, str, str2})).booleanValue();
        }
        if (!TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) {
            if (str.equals(Constants.Event.FOCUS)) {
                this.F = true;
                this.r.setAutoFocus(this);
                if (this.r.isOnloadFinish()) {
                    this.w.requestFocus();
                    p();
                }
                return true;
            } else if (str.equals(Constants.Event.BLUR)) {
                this.F = false;
                i(f().decorView, true);
                return true;
            }
        }
        return false;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a715c0a7", new Object[]{this});
        } else if (this.w.isEnabled() && !TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
            if (TextUtils.isEmpty(this.w.getText()) || this.x == null || !this.w.isFocused()) {
                this.C = false;
                this.w.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            this.C = true;
            this.w.setOnTouchListener(this);
            this.w.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.x, (Drawable) null);
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23670e3", new Object[]{this})).booleanValue();
        }
        m();
        if (!TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_CHECKBOX) && !TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
            if (TextUtils.isEmpty(this.E)) {
                this.w.setSingleLine();
                this.w.setHorizontallyScrolling(true);
                UIUtil.setSafeKeyboardSoftInput(this.w);
                this.w.setOnFocusChangeListener(this);
                this.w.setOnClickListener(this);
            }
            if (this.F) {
                this.r.setAutoFocus(this);
                View view = (View) this.w.getParent();
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
            }
            Editable editableText = this.w.getEditableText();
            if (editableText != null) {
                String obj = editableText.toString();
                if (!TextUtils.isEmpty(obj)) {
                    this.w.setSelection(obj.length());
                }
            }
        } else if (TextUtils.equals(this.E, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
            this.D = false;
            String obj2 = this.w.getEditableText().toString();
            if (!TextUtils.isEmpty(obj2) && obj2.length() == 4) {
                EditText editText = this.w;
                editText.setText(obj2.substring(0, 2) + "/" + obj2.substring(2));
            }
            this.D = true;
        }
        return false;
    }

    public final void p() {
        final View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9488b", new Object[]{this});
        } else if (this.r != null && getInnerView().isEnabled()) {
            if (l() || UIUtil.isUseDefaultKeyboard(this.E, this.G)) {
                if (!l()) {
                    this.r.getTemplateKeyboardService().hideKeyboard(f().decorView);
                }
                int i = !this.r.isOnloadFinish() ? 600 : 0;
                try {
                    TemplateKeyboardService defaultKeyboardService = this.r.getDefaultKeyboardService();
                    if (defaultKeyboardService != null) {
                        defaultKeyboardService.showKeyboard(this.w, null, null, null, false, i);
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.s);
                    if (mspContextByBizId != null) {
                        mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_KEYBOARD_ERROR, ErrorCode.DEFAULT_KEYBOARD_ERROR);
                    }
                }
            } else {
                DecorViewInfo f = f();
                final View view = f.decorView;
                final boolean z = f.isDialog;
                boolean hideKeyboard = this.r.getDefaultKeyboardService().hideKeyboard(view);
                final boolean z2 = !z && !this.r.isFullscreen();
                if (z) {
                    findViewById = view.findViewById(ResUtils.getResourceId("dialog_linear_layout", "id", null));
                } else if (this.r.isFullscreen()) {
                    findViewById = g();
                } else {
                    findViewById = view.findViewById(16908290);
                }
                if (!this.r.isOnloadFinish()) {
                    this.w.postDelayed(new Runnable() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            View view2 = findViewById;
                            if (!z2) {
                                view2 = PasswordInputPlugin.access$1000(PasswordInputPlugin.this, view2, view);
                            }
                            try {
                                PasswordInputPlugin.access$000(PasswordInputPlugin.this).getTemplateKeyboardService().showKeyboard(PasswordInputPlugin.access$400(PasswordInputPlugin.this), UIUtil.getKeyboardType(PasswordInputPlugin.access$600(PasswordInputPlugin.this)), view, view2, z, 0);
                            } catch (Exception e2) {
                                LogUtil.printExceptionStackTrace(e2);
                            }
                        }
                    }, 600L);
                    return;
                }
                try {
                    this.r.getTemplateKeyboardService().showKeyboard(this.w, UIUtil.getKeyboardType(this.E), view, !z2 ? b(findViewById, view) : findViewById, z, hideKeyboard ? 500 : 0);
                } catch (Exception e2) {
                    LogUtil.printExceptionStackTrace(e2);
                }
                if (UIUtil.isGTP8600()) {
                    this.w.postDelayed(new Runnable() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                PasswordInputPlugin.access$000(PasswordInputPlugin.this).getDefaultKeyboardService().hideKeyboard(PasswordInputPlugin.access$400(PasswordInputPlugin.this));
                            }
                        }
                    }, 200L);
                }
            }
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c310ec99", new Object[]{this, str, str2})).booleanValue();
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1586082113:
                if (str.equals(pg1.ATOM_EXT_UDL_font_size)) {
                    c = 0;
                    break;
                }
                break;
            case -611277766:
                if (str.equals("background-image:disabled")) {
                    c = 1;
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 2;
                    break;
                }
                break;
            case 598800822:
                if (str.equals(pg1.ATOM_EXT_UDL_font_weight)) {
                    c = 3;
                    break;
                }
                break;
            case 610793468:
                if (str.equals(pg1.ATOM_EXT_UDL_background_image)) {
                    c = 4;
                    break;
                }
                break;
            case 746232421:
                if (str.equals(pg1.ATOM_EXT_UDL_text_align)) {
                    c = 5;
                    break;
                }
                break;
            case 2018420361:
                if (str.equals("placeholder-color")) {
                    c = 6;
                    break;
                }
                break;
            case 2099328553:
                if (str.equals("background-image:checked")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.w.setTextSize(1, Float.parseFloat(str2.substring(0, str2.indexOf("px"))));
                break;
            case 1:
                if (str2.startsWith("url")) {
                    str2 = str2.substring(4, str2.length() - 1);
                }
                if (this.J == null) {
                    this.J = new String[3];
                }
                this.J[2] = str2;
                break;
            case 2:
                this.w.setTextColor(UIUtil.parseColor(str2));
                break;
            case 3:
                if (!str2.equals("bold")) {
                    this.w.getPaint().setFakeBoldText(false);
                    break;
                } else {
                    this.w.getPaint().setFakeBoldText(true);
                    break;
                }
            case 4:
                if (str2.startsWith("url")) {
                    str2 = str2.substring(4, str2.length() - 1);
                }
                if (this.J == null) {
                    this.J = new String[3];
                }
                this.J[0] = str2;
                break;
            case 5:
                str2.hashCode();
                if (!str2.equals("center")) {
                    if (str2.equals("right")) {
                        this.w.setGravity(21);
                        break;
                    } else {
                        this.w.setGravity(19);
                        break;
                    }
                } else {
                    this.w.setGravity(17);
                    break;
                }
            case 6:
                this.w.setHintTextColor(UIUtil.parseColor(str2));
                break;
            case 7:
                if (str2.startsWith("url")) {
                    str2 = str2.substring(4, str2.length() - 1);
                }
                if (this.J == null) {
                    this.J = new String[3];
                }
                this.J[1] = str2;
                break;
            default:
                return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r9.equals("disabled") == false) goto L_0x002c;
     */
    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean updateAttr(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.updateAttr(java.lang.String, java.lang.String):boolean");
    }
}
