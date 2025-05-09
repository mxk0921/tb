package com.taobao.android.icart.weex.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import kotlin.Metadata;
import tb.be3;
import tb.ckf;
import tb.g1a;
import tb.pb6;
import tb.t2o;
import tb.wmc;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DebugDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f8044a;
    public g1a<? super String, xhv> b;
    public final String c = "请输入需要替换的购物车url";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Editable text;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            DebugDialog.this.dismiss();
            g1a a2 = DebugDialog.a(DebugDialog.this);
            if (a2 != null) {
                EditText b = DebugDialog.b(DebugDialog.this);
                if (b == null || (text = b.getText()) == null) {
                    str = null;
                } else {
                    str = text.toString();
                }
                xhv xhvVar = (xhv) a2.invoke(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                DebugDialog.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            EditText b = DebugDialog.b(DebugDialog.this);
            if (b != null) {
                b.requestFocus();
            }
            Object systemService = DebugDialog.this.getContext().getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null) {
                inputMethodManager.toggleSoftInput(1, 2);
            }
        }
    }

    static {
        t2o.a(478150976);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugDialog(Activity activity) {
        super(activity, R.style.CartReorderDialogStyle);
        ckf.g(activity, "context");
    }

    public static final /* synthetic */ g1a a(DebugDialog debugDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("2cd1cb24", new Object[]{debugDialog});
        }
        return debugDialog.b;
    }

    public static final /* synthetic */ EditText b(DebugDialog debugDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("7bee8596", new Object[]{debugDialog});
        }
        return debugDialog.f8044a;
    }

    public static /* synthetic */ Object ipc$super(DebugDialog debugDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/weex/dialog/DebugDialog");
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            EditText editText = this.f8044a;
            if (editText != null) {
                editText.setText(str);
            }
            EditText editText2 = this.f8044a;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        } else {
            EditText editText3 = this.f8044a;
            if (editText3 != null) {
                editText3.setText("");
            }
        }
    }

    public final DebugDialog d(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DebugDialog) ipChange.ipc$dispatch("703d2aa5", new Object[]{this, g1aVar});
        }
        ckf.g(g1aVar, "confirmClick");
        this.b = g1aVar;
        return this;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
            return;
        }
        super.show();
        if (str == null) {
            str = "";
        }
        c(str);
        f();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd2fa4a", new Object[]{this});
            return;
        }
        EditText editText = this.f8044a;
        if (editText != null) {
            editText.postDelayed(new c(), 200L);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            e("");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        TIconFontTextView tIconFontTextView = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.cart_weex_input_dialog_layout, (ViewGroup) null);
        ckf.f(inflate, "LayoutInflater.from(cont…nput_dialog_layout, null)");
        inflate.setClickable(true);
        setContentView(inflate);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.clearFlags(131080);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setSoftInputMode(48);
        }
        View findViewById = inflate.findViewById(R.id.edit_text);
        if (!(findViewById instanceof EditText)) {
            findViewById = null;
        }
        EditText editText = (EditText) findViewById;
        this.f8044a = editText;
        if (editText != null) {
            editText.setHint(this.c);
        }
        EditText editText2 = this.f8044a;
        if (editText2 != null) {
            editText2.setInputType(1);
        }
        EditText editText3 = this.f8044a;
        if (editText3 != null) {
            editText3.setImeOptions(4);
        }
        EditText editText4 = this.f8044a;
        if (editText4 != null) {
            editText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
        }
        View findViewById2 = inflate.findViewById(R.id.close_btn);
        if (findViewById2 instanceof TIconFontTextView) {
            tIconFontTextView = findViewById2;
        }
        TIconFontTextView tIconFontTextView2 = tIconFontTextView;
        if (tIconFontTextView2 != null) {
            tIconFontTextView2.setText(wmc.CONFIRM);
        }
        if (tIconFontTextView2 != null) {
            tIconFontTextView2.setTextSize(20.0f);
        }
        if (tIconFontTextView2 != null) {
            tIconFontTextView2.setTextAlignment(4);
        }
        if (!(tIconFontTextView2 == null || (layoutParams2 = tIconFontTextView2.getLayoutParams()) == null)) {
            layoutParams2.width = pb6.c(getContext(), 50.0f);
        }
        if (!(tIconFontTextView2 == null || (layoutParams = tIconFontTextView2.getLayoutParams()) == null)) {
            layoutParams.height = pb6.c(getContext(), 50.0f);
        }
        if (tIconFontTextView2 != null) {
            tIconFontTextView2.setOnClickListener(new a());
        }
        EditText editText5 = this.f8044a;
        if (editText5 != null) {
            editText5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.icart.weex.dialog.DebugDialog$onCreate$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    Editable text;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (i != 4) {
                        return false;
                    }
                    ckf.f(textView, "v");
                    String obj = textView.getText().toString();
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } else if (TextUtils.isEmpty(wsq.Q0(obj).toString())) {
                        Context context = DebugDialog.this.getContext();
                        ckf.f(context, "context");
                        be3.c(context, "输入的url为空");
                        return true;
                    } else {
                        DebugDialog.this.dismiss();
                        g1a a2 = DebugDialog.a(DebugDialog.this);
                        if (a2 != null) {
                            EditText b2 = DebugDialog.b(DebugDialog.this);
                            xhv xhvVar = (xhv) a2.invoke((b2 == null || (text = b2.getText()) == null) ? null : text.toString());
                        }
                        return true;
                    }
                }
            });
        }
        ViewProxy.setOnClickListener(inflate, new b());
        f();
    }
}
