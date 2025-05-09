package com.alipay.mobile.verifyidentity.safepaybase.widget;

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
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.safepaybase.TextWatcherListener;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureAccessbilityDelegate;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextManager;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SimplePassword extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ImageView> mBlackPointList;
    private EditText mEditText;
    private LinearLayout mLayout;
    private View.OnFocusChangeListener mOnFocusChangeListener;
    private TextWatcherListener mProxyWatcher;
    private String mSimplePassword;
    private OnConfirmListener mSubmitInterface;
    private int mBizId = 0;
    private EditTextUtil util = EditTextManager.a();
    private String mRsaPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
    private String mEncryptRandomString = "";
    private EncryptRandomType mType = EncryptRandomType.randomafter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class TextWatcherImpl implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean b = false;
        public boolean c = false;

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
                        this.b = true;
                        editable.replace(i, i + 1, "0");
                    }
                }
                SimplePassword simplePassword = SimplePassword.this;
                SimplePassword.access$102(simplePassword, SimplePassword.access$200(simplePassword).getText().toString());
                SimplePassword simplePassword2 = SimplePassword.this;
                SimplePassword.access$300(simplePassword2, SimplePassword.access$100(simplePassword2).length());
                if (SimplePassword.access$100(SimplePassword.this).length() == 6) {
                    if (SimplePassword.access$400(SimplePassword.this) != null && !this.c) {
                        SimplePassword.access$400(SimplePassword.this).onUserConfirm(SimplePassword.access$900(SimplePassword.this).a(SimplePassword.access$500(SimplePassword.this), SimplePassword.access$600(SimplePassword.this), SimplePassword.access$700(SimplePassword.this), SimplePassword.access$800(SimplePassword.this)));
                    }
                    if (!this.c) {
                        this.c = true;
                        return;
                    }
                    return;
                }
                this.c = false;
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
            if (!this.b) {
                try {
                    SimplePassword.access$900(SimplePassword.this).a(SimplePassword.access$500(SimplePassword.this), charSequence.toString(), i, i2, i3);
                } catch (Throwable unused) {
                }
                if (SimplePassword.access$1000(SimplePassword.this) != null) {
                    SimplePassword.access$1000(SimplePassword.this).onTextChanged();
                }
            }
            this.b = false;
        }
    }

    public SimplePassword(Context context) {
        super(context);
    }

    public static /* synthetic */ View.OnFocusChangeListener access$000(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnFocusChangeListener) ipChange.ipc$dispatch("beafb5c", new Object[]{simplePassword});
        }
        return simplePassword.mOnFocusChangeListener;
    }

    public static /* synthetic */ String access$100(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8358accc", new Object[]{simplePassword});
        }
        return simplePassword.mSimplePassword;
    }

    public static /* synthetic */ TextWatcherListener access$1000(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextWatcherListener) ipChange.ipc$dispatch("51ed0885", new Object[]{simplePassword});
        }
        return simplePassword.mProxyWatcher;
    }

    public static /* synthetic */ String access$102(SimplePassword simplePassword, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f5c000", new Object[]{simplePassword, str});
        }
        simplePassword.mSimplePassword = str;
        return str;
    }

    public static /* synthetic */ EditText access$200(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("a159fe44", new Object[]{simplePassword});
        }
        return simplePassword.mEditText;
    }

    public static /* synthetic */ void access$300(SimplePassword simplePassword, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3b5ded", new Object[]{simplePassword, new Integer(i)});
        } else {
            simplePassword.setPointView(i);
        }
    }

    public static /* synthetic */ OnConfirmListener access$400(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnConfirmListener) ipChange.ipc$dispatch("e14847fe", new Object[]{simplePassword});
        }
        return simplePassword.mSubmitInterface;
    }

    public static /* synthetic */ int access$500(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9003654b", new Object[]{simplePassword})).intValue();
        }
        return simplePassword.mBizId;
    }

    public static /* synthetic */ String access$600(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f1979a7", new Object[]{simplePassword});
        }
        return simplePassword.mRsaPublicKey;
    }

    public static /* synthetic */ String access$700(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e400906", new Object[]{simplePassword});
        }
        return simplePassword.mEncryptRandomString;
    }

    public static /* synthetic */ EncryptRandomType access$800(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EncryptRandomType) ipChange.ipc$dispatch("88416eed", new Object[]{simplePassword});
        }
        return simplePassword.mType;
    }

    public static /* synthetic */ EditTextUtil access$900(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("a4009f48", new Object[]{simplePassword});
        }
        return simplePassword.util;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mLayout = (LinearLayout) findViewById(R.id.mini_linSimplePwdComponent);
        ArrayList arrayList = new ArrayList();
        this.mBlackPointList = arrayList;
        arrayList.add((ImageView) findViewById(R.id.mini_spwd_iv_1));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_2));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_3));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_4));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_5));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_6));
        EditText editText = (EditText) findViewById(R.id.mini_spwd_input);
        this.mEditText = editText;
        editText.setFocusable(true);
        this.mEditText.addTextChangedListener(new TextWatcherImpl());
        this.mEditText.setInputType(2);
        this.mEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mEditText.setTypeface(Typeface.MONOSPACE);
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.widget.SimplePassword.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (SimplePassword.access$000(SimplePassword.this) != null) {
                    SimplePassword.access$000(SimplePassword.this).onFocusChange(view, z);
                }
            }
        });
        this.mEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.widget.SimplePassword.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 6) {
                    return true;
                }
                return false;
            }
        });
        this.mEditText.setAccessibilityDelegate(new SecureAccessbilityDelegate());
    }

    public static /* synthetic */ Object ipc$super(SimplePassword simplePassword, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/safepaybase/widget/SimplePassword");
    }

    private void setPointView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca96529", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.mBlackPointList.size(); i2++) {
            if (i2 < i) {
                this.mBlackPointList.get(i2).setVisibility(0);
            } else {
                this.mBlackPointList.get(i2).setVisibility(8);
            }
        }
    }

    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setText("");
        }
    }

    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this});
        }
        return this.mEditText;
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.mBizId = i;
        }
    }

    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
            return;
        }
        this.mEncryptRandomString = str;
        this.mType = encryptRandomType;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.mLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else {
            this.mOnFocusChangeListener = onFocusChangeListener;
        }
    }

    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        } else {
            this.mRsaPublicKey = str;
        }
    }

    public void setTextWatcherListener(TextWatcherListener textWatcherListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff30b6d9", new Object[]{this, textWatcherListener});
        } else {
            this.mProxyWatcher = textWatcherListener;
        }
    }

    public void setmSubmitInterface(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e2745c", new Object[]{this, onConfirmListener});
        } else {
            this.mSubmitInterface = onConfirmListener;
        }
    }

    public SimplePassword(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.vi_safe_input_simple_password, (ViewGroup) this, true);
        initView();
    }
}
