package com.alipay.mobile.verifyidentity.module.password.pay.customized.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextManager;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextUtil;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.utils.SecureAccessibilityDelegate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SimplePassword extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f4330a;
    private List<ImageView> b;
    private EditText c;
    private String d;
    private int e;
    private OnConfirmListener f;
    private View.OnFocusChangeListener g;
    private EditTextUtil h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class TextWatcherImpl implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f4331a = false;
        public boolean b = false;

        public TextWatcherImpl() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                return;
            }
            try {
                int length = editable.length();
                for (int i = 0; i < length; i++) {
                    if (editable.charAt(i) != '0') {
                        this.f4331a = true;
                        editable.replace(i, i + 1, "0");
                    }
                }
                SimplePassword simplePassword = SimplePassword.this;
                SimplePassword.access$102(simplePassword, SimplePassword.access$200(simplePassword).getText().toString());
                SimplePassword simplePassword2 = SimplePassword.this;
                SimplePassword.access$300(simplePassword2, SimplePassword.access$100(simplePassword2).length());
                if (SimplePassword.access$100(SimplePassword.this).length() == 6) {
                    if (SimplePassword.access$400(SimplePassword.this) != null && !this.b) {
                        SimplePassword.access$400(SimplePassword.this).onUserConfirm(SimplePassword.access$600(SimplePassword.this).getText(SimplePassword.access$500(SimplePassword.this)));
                    }
                    if (!this.b) {
                        this.b = true;
                        return;
                    }
                    return;
                }
                this.b = false;
            } catch (Exception unused) {
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
            if (!this.f4331a) {
                try {
                    SimplePassword.access$600(SimplePassword.this).OnTextChanged(SimplePassword.access$500(SimplePassword.this), charSequence.toString(), i, i2, i3);
                } catch (Throwable unused) {
                }
            }
            this.f4331a = false;
        }
    }

    public SimplePassword(Context context) {
        super(context);
        this.e = 0;
        this.h = EditTextManager.getEditTextUtils();
    }

    public static /* synthetic */ View.OnFocusChangeListener access$000(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnFocusChangeListener) ipChange.ipc$dispatch("dc9f97bf", new Object[]{simplePassword});
        }
        return simplePassword.g;
    }

    public static /* synthetic */ String access$100(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1221db2b", new Object[]{simplePassword});
        }
        return simplePassword.d;
    }

    public static /* synthetic */ String access$102(SimplePassword simplePassword, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71445b63", new Object[]{simplePassword, str});
        }
        simplePassword.d = str;
        return str;
    }

    public static /* synthetic */ EditText access$200(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("2dffad63", new Object[]{simplePassword});
        }
        return simplePassword.c;
    }

    public static /* synthetic */ void access$300(SimplePassword simplePassword, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c539e110", new Object[]{simplePassword, new Integer(i)});
        } else {
            simplePassword.setPointView(i);
        }
    }

    public static /* synthetic */ OnConfirmListener access$400(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnConfirmListener) ipChange.ipc$dispatch("44d95bc3", new Object[]{simplePassword});
        }
        return simplePassword.f;
    }

    public static /* synthetic */ int access$500(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bebd284", new Object[]{simplePassword})).intValue();
        }
        return simplePassword.e;
    }

    public static /* synthetic */ EditTextUtil access$600(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("168e5cca", new Object[]{simplePassword});
        }
        return simplePassword.h;
    }

    public static /* synthetic */ Object ipc$super(SimplePassword simplePassword, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/password/pay/customized/ui/SimplePassword");
    }

    private void setPointView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca96529", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (i2 < i) {
                this.b.get(i2).setVisibility(0);
            } else {
                this.b.get(i2).setVisibility(8);
            }
        }
    }

    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        EditText editText = this.c;
        if (editText != null) {
            editText.setText("");
        }
    }

    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this});
        }
        return this.c;
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.f4330a.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else {
            this.g = onFocusChangeListener;
        }
    }

    public void setmSubmitInterface(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e2745c", new Object[]{this, onConfirmListener});
        } else {
            this.f = onConfirmListener;
        }
    }

    public SimplePassword(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.h = EditTextManager.getEditTextUtils();
        LayoutInflater.from(context).inflate(R.layout.mybank_safe_input_simple_password, (ViewGroup) this, true);
        this.f4330a = (LinearLayout) findViewById(R.id.mini_linSimplePwdComponent);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add((ImageView) findViewById(R.id.mini_spwd_iv_1));
        this.b.add((ImageView) findViewById(R.id.mini_spwd_iv_2));
        this.b.add((ImageView) findViewById(R.id.mini_spwd_iv_3));
        this.b.add((ImageView) findViewById(R.id.mini_spwd_iv_4));
        this.b.add((ImageView) findViewById(R.id.mini_spwd_iv_5));
        this.b.add((ImageView) findViewById(R.id.mini_spwd_iv_6));
        EditText editText = (EditText) findViewById(R.id.mini_spwd_input);
        this.c = editText;
        editText.setFocusable(true);
        this.c.addTextChangedListener(new TextWatcherImpl());
        this.c.setInputType(2);
        this.c.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.c.setTypeface(Typeface.MONOSPACE);
        this.c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SimplePassword.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (SimplePassword.access$000(SimplePassword.this) != null) {
                    SimplePassword.access$000(SimplePassword.this).onFocusChange(view, z);
                }
            }
        });
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SimplePassword.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 6) {
                    return true;
                }
                return false;
            }
        });
        this.c.setAccessibilityDelegate(new SecureAccessibilityDelegate());
    }
}
