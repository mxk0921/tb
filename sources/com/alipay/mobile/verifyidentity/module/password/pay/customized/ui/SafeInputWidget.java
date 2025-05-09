package com.alipay.mobile.verifyidentity.module.password.pay.customized.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextManager;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextUtil;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.utils.ResUtils;
import com.alipay.mobile.verifyidentity.ui.utils.SecureAccessibilityDelegate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SafeInputWidget implements View.OnTouchListener, VISafeInputInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Button c;
    public final boolean g;
    public final int h;
    public final Drawable l;
    public int m;
    public int n;
    public int o;
    public int p;

    /* renamed from: a  reason: collision with root package name */
    public EditText f4329a = null;
    public SimplePassword b = null;
    public View d = null;
    public final EditTextUtil e = EditTextManager.getEditTextUtils();
    public View f = null;
    public OnConfirmListener i = null;
    public View.OnFocusChangeListener j = null;
    public boolean k = false;

    public SafeInputWidget(Activity activity, boolean z) {
        this.g = false;
        this.h = -1;
        this.l = null;
        VerifyLogCat.d("PwdInputAdapter", "进入自定义密码页面");
        int hashCode = hashCode();
        this.h = hashCode;
        this.g = z;
        initView(activity);
        if (z) {
            this.f4329a.setVisibility(8);
            this.f.findViewById(R.id.common_input_item).setVisibility(8);
            this.b.setVisibility(0);
            this.b.setBizId(hashCode);
            return;
        }
        this.l = ResUtils.getPaddingDrawable(-1, R.drawable.input_clean_icon, activity);
        this.f4329a.setVisibility(0);
        this.f4329a.setAccessibilityDelegate(new SecureAccessibilityDelegate());
        this.b.setVisibility(8);
        this.f4329a.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                SafeInputWidget.access$100(SafeInputWidget.this).OnTextChanged(SafeInputWidget.access$000(SafeInputWidget.this), charSequence.toString(), i, i2, i3);
                if (SafeInputWidget.access$200(SafeInputWidget.this) != null) {
                    if (TextUtils.isEmpty(charSequence)) {
                        SafeInputWidget.access$200(SafeInputWidget.this).setTextColor(tkt.DEFAULT_SHADOW_COLOR);
                        SafeInputWidget.access$200(SafeInputWidget.this).setClickable(false);
                    } else {
                        SafeInputWidget.access$200(SafeInputWidget.this).setTextColor(Color.parseColor("#1677ff"));
                        SafeInputWidget.access$200(SafeInputWidget.this).setClickable(true);
                    }
                }
                SafeInputWidget.access$300(SafeInputWidget.this);
            }
        });
    }

    public static /* synthetic */ int access$000(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b556cbdf", new Object[]{safeInputWidget})).intValue();
        }
        return safeInputWidget.h;
    }

    public static /* synthetic */ EditTextUtil access$100(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("d2fc3aad", new Object[]{safeInputWidget});
        }
        return safeInputWidget.e;
    }

    public static /* synthetic */ Button access$200(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("dbf22462", new Object[]{safeInputWidget});
        }
        return safeInputWidget.c;
    }

    public static /* synthetic */ void access$300(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6662f", new Object[]{safeInputWidget});
        } else if (!safeInputWidget.f4329a.isEnabled()) {
        } else {
            if (TextUtils.isEmpty(safeInputWidget.f4329a.getText()) || safeInputWidget.l == null || !safeInputWidget.f4329a.isFocused()) {
                safeInputWidget.k = false;
                safeInputWidget.f4329a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            safeInputWidget.k = true;
            safeInputWidget.f4329a.setOnTouchListener(safeInputWidget);
            safeInputWidget.f4329a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, safeInputWidget.l, (Drawable) null);
        }
    }

    public static /* synthetic */ View.OnFocusChangeListener access$400(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnFocusChangeListener) ipChange.ipc$dispatch("9e73f9b9", new Object[]{safeInputWidget});
        }
        return safeInputWidget.j;
    }

    public static /* synthetic */ OnConfirmListener access$500(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnConfirmListener) ipChange.ipc$dispatch("fa78cfa4", new Object[]{safeInputWidget});
        }
        return safeInputWidget.i;
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        if (this.g) {
            this.b.clearText();
        } else {
            this.f4329a.setText("");
        }
        this.e.clear(this.h);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.f;
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public String getEditContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef64dac0", new Object[]{this});
        }
        return this.e.getText(this.h);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this});
        }
        if (this.g) {
            return this.b.getEditText();
        }
        return this.f4329a;
    }

    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        View inflate = View.inflate(context, R.layout.custom_safe_pwd_input_widget, null);
        this.f = inflate;
        EditText editText = (EditText) inflate.findViewById(R.id.input_et_password);
        this.f4329a = editText;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (SafeInputWidget.access$400(SafeInputWidget.this) != null) {
                    SafeInputWidget.access$400(SafeInputWidget.this).onFocusChange(view, z);
                }
            }
        });
        SimplePassword simplePassword = (SimplePassword) this.f.findViewById(R.id.spwd_input);
        this.b = simplePassword;
        simplePassword.setmSubmitInterface(this.i);
        Button button = (Button) this.f.findViewById(R.id.button_ok);
        this.c = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (SafeInputWidget.access$500(SafeInputWidget.this) != null) {
                    SafeInputWidget.access$500(SafeInputWidget.this).onUserConfirm(SafeInputWidget.access$100(SafeInputWidget.this).getText(SafeInputWidget.access$000(SafeInputWidget.this)));
                }
            }
        });
        this.c.setTextColor(tkt.DEFAULT_SHADOW_COLOR);
        this.c.setClickable(false);
        this.d = this.f.findViewById(R.id.button_ok_verticalline);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.k && this.l != null) {
            int width = this.f4329a.getWidth();
            int height = this.f4329a.getHeight();
            int intrinsicWidth = this.l.getIntrinsicWidth();
            int intrinsicHeight = this.l.getIntrinsicHeight();
            int i = (width - intrinsicWidth) - (intrinsicWidth / 4);
            this.m = i;
            int i2 = (height - intrinsicHeight) / 2;
            this.o = i2;
            this.n = i + intrinsicWidth;
            this.p = i2 + intrinsicHeight;
        }
        if (this.m > 0 && this.k) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.m && x <= this.n && y >= this.o && y <= this.p) {
                if (motionEvent.getAction() == 1) {
                    clearText();
                }
                return true;
            }
        }
        return this.f4329a.onTouchEvent(motionEvent);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setNeedConfirmButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e1ee93", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOkButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af3ace", new Object[]{this, str});
            return;
        }
        Button button = this.c;
        if (button != null) {
            button.setText(str);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else if (this.g) {
            this.b.setOnClickListener(onClickListener);
        } else {
            this.f4329a.setOnClickListener(onClickListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a628919", new Object[]{this, onConfirmListener});
            return;
        }
        this.i = onConfirmListener;
        if (this.g) {
            this.b.setmSubmitInterface(onConfirmListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else if (this.g) {
            this.b.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.j = onFocusChangeListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        }
    }
}
