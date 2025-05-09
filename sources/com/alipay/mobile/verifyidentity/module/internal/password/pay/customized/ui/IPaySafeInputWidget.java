package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.EditTextManager;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.EditTextUtil;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.APButton;
import com.alipay.mobile.verifyidentity.ui.utils.ResUtils;
import com.alipay.mobile.verifyidentity.ui.utils.SecureAccessibilityDelegate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IPaySafeInputWidget implements View.OnTouchListener, VISafeInputInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f4321a;
    public APButton d;
    public final Drawable g;
    public String j;
    public int m;
    public int n;
    public int o;
    public int p;
    public View b = null;
    public EditText c = null;
    public View.OnFocusChangeListener e = null;
    public OnConfirmListener f = null;
    public boolean h = false;
    public final EditTextUtil i = EditTextManager.getEditTextUtils();
    public String k = "";
    public EncryptRandomType l = EncryptRandomType.randomafter;

    public IPaySafeInputWidget(Activity activity) {
        this.f4321a = -1;
        this.g = null;
        VerifyLogCat.d("PwdInputAdapter", "进入自定义密码页面");
        this.f4321a = hashCode();
        initView(activity);
        this.g = ResUtils.getPaddingDrawable(-1, R.drawable.input_clean_icon, activity);
        this.c.setVisibility(0);
        this.c.setAccessibilityDelegate(new SecureAccessibilityDelegate());
        this.c.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget.3
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
                IPaySafeInputWidget.access$600(IPaySafeInputWidget.this).OnTextChanged(IPaySafeInputWidget.access$200(IPaySafeInputWidget.this), charSequence.toString(), i, i2, i3);
                if (IPaySafeInputWidget.access$700(IPaySafeInputWidget.this) != null) {
                    if (TextUtils.isEmpty(charSequence)) {
                        IPaySafeInputWidget.access$700(IPaySafeInputWidget.this).setEnabled(false);
                    } else {
                        IPaySafeInputWidget.access$700(IPaySafeInputWidget.this).setEnabled(true);
                    }
                }
                IPaySafeInputWidget.access$800(IPaySafeInputWidget.this);
            }
        });
    }

    public static /* synthetic */ View.OnFocusChangeListener access$000(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnFocusChangeListener) ipChange.ipc$dispatch("c1167268", new Object[]{iPaySafeInputWidget});
        }
        return iPaySafeInputWidget.e;
    }

    public static /* synthetic */ OnConfirmListener access$100(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnConfirmListener) ipChange.ipc$dispatch("e9e38637", new Object[]{iPaySafeInputWidget});
        }
        return iPaySafeInputWidget.f;
    }

    public static /* synthetic */ int access$200(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42c3f450", new Object[]{iPaySafeInputWidget})).intValue();
        }
        return iPaySafeInputWidget.f4321a;
    }

    public static /* synthetic */ String access$300(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87e726e4", new Object[]{iPaySafeInputWidget});
        }
        return iPaySafeInputWidget.j;
    }

    public static /* synthetic */ String access$400(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1672a7e5", new Object[]{iPaySafeInputWidget});
        }
        return iPaySafeInputWidget.k;
    }

    public static /* synthetic */ EncryptRandomType access$500(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EncryptRandomType) ipChange.ipc$dispatch("e7aa45ae", new Object[]{iPaySafeInputWidget});
        }
        return iPaySafeInputWidget.l;
    }

    public static /* synthetic */ EditTextUtil access$600(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("79bad3cf", new Object[]{iPaySafeInputWidget});
        }
        return iPaySafeInputWidget.i;
    }

    public static /* synthetic */ APButton access$700(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (APButton) ipChange.ipc$dispatch("fb5e6633", new Object[]{iPaySafeInputWidget});
        }
        return iPaySafeInputWidget.d;
    }

    public static /* synthetic */ void access$800(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b30c997", new Object[]{iPaySafeInputWidget});
        } else if (!iPaySafeInputWidget.c.isEnabled()) {
        } else {
            if (TextUtils.isEmpty(iPaySafeInputWidget.c.getText()) || iPaySafeInputWidget.g == null || !iPaySafeInputWidget.c.isFocused()) {
                iPaySafeInputWidget.h = false;
                iPaySafeInputWidget.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            iPaySafeInputWidget.h = true;
            iPaySafeInputWidget.c.setOnTouchListener(iPaySafeInputWidget);
            iPaySafeInputWidget.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iPaySafeInputWidget.g, (Drawable) null);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        this.c.setText("");
        this.i.clear(this.f4321a);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public String getEditContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef64dac0", new Object[]{this});
        }
        return this.i.getText(this.f4321a, this.j, this.k, this.l);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this});
        }
        return this.c;
    }

    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        View inflate = View.inflate(context, R.layout.ipay_safe_pwd_input_widget_internal, null);
        this.b = inflate;
        EditText editText = (EditText) inflate.findViewById(R.id.input_et_password);
        this.c = editText;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (IPaySafeInputWidget.access$000(IPaySafeInputWidget.this) != null) {
                    IPaySafeInputWidget.access$000(IPaySafeInputWidget.this).onFocusChange(view, z);
                }
            }
        });
        this.c.setSelection(0);
        this.c.setCursorVisible(true);
        APButton aPButton = (APButton) this.b.findViewById(R.id.button_ok);
        this.d = aPButton;
        aPButton.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (IPaySafeInputWidget.access$100(IPaySafeInputWidget.this) != null) {
                    IPaySafeInputWidget.access$100(IPaySafeInputWidget.this).onUserConfirm(IPaySafeInputWidget.access$600(IPaySafeInputWidget.this).getText(IPaySafeInputWidget.access$200(IPaySafeInputWidget.this), IPaySafeInputWidget.access$300(IPaySafeInputWidget.this), IPaySafeInputWidget.access$400(IPaySafeInputWidget.this), IPaySafeInputWidget.access$500(IPaySafeInputWidget.this)));
                }
            }
        });
        this.d.setEnabled(false);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.h && this.g != null) {
            int width = this.c.getWidth();
            int height = this.c.getHeight();
            int intrinsicWidth = this.g.getIntrinsicWidth();
            int intrinsicHeight = this.g.getIntrinsicHeight();
            int i = (width - intrinsicWidth) - (intrinsicWidth / 4);
            this.m = i;
            int i2 = (height - intrinsicHeight) / 2;
            this.o = i2;
            this.n = i + intrinsicWidth;
            this.p = i2 + intrinsicHeight;
        }
        if (this.m > 0 && this.h) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.m && x <= this.n && y >= this.o && y <= this.p) {
                if (motionEvent.getAction() == 1) {
                    clearText();
                }
                return true;
            }
        }
        return this.c.onTouchEvent(motionEvent);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setEditTextHint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d79e991", new Object[]{this, str});
        } else {
            this.c.setHint(str);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
            return;
        }
        this.k = str;
        this.l = encryptRandomType;
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setNeedConfirmButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e1ee93", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            this.d.setVisibility(8);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOkButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af3ace", new Object[]{this, str});
            return;
        }
        APButton aPButton = this.d;
        if (aPButton != null) {
            aPButton.setText(str);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.c.setOnClickListener(onClickListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a628919", new Object[]{this, onConfirmListener});
        } else {
            this.f = onConfirmListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else {
            this.e = onFocusChangeListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }
}
