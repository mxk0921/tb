package com.taobao.android.icart.weex.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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
import kotlin.Metadata;
import tb.be3;
import tb.ckf;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ReorderInputDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f8052a;
    public View.OnClickListener b;
    public final String c = "请输入组名";
    public final String d = "请输入组名，最多为十个字哦";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ReorderInputDialog.this.dismiss();
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
                ReorderInputDialog.this.dismiss();
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
            EditText c = ReorderInputDialog.c(ReorderInputDialog.this);
            if (c != null) {
                c.requestFocus();
            }
            Object systemService = ReorderInputDialog.this.getContext().getSystemService("input_method");
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
        t2o.a(478150985);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderInputDialog(Activity activity) {
        super(activity, R.style.CartReorderDialogStyle);
        ckf.g(activity, "context");
    }

    public static final /* synthetic */ String a(ReorderInputDialog reorderInputDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eac06e68", new Object[]{reorderInputDialog});
        }
        return reorderInputDialog.c;
    }

    public static final /* synthetic */ View.OnClickListener b(ReorderInputDialog reorderInputDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("5d1f986f", new Object[]{reorderInputDialog});
        }
        return reorderInputDialog.b;
    }

    public static final /* synthetic */ EditText c(ReorderInputDialog reorderInputDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("52e5a0a6", new Object[]{reorderInputDialog});
        }
        return reorderInputDialog.f8052a;
    }

    public static /* synthetic */ Object ipc$super(ReorderInputDialog reorderInputDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/weex/dialog/ReorderInputDialog");
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            EditText editText = this.f8052a;
            if (editText != null) {
                editText.setText(str);
            }
            EditText editText2 = this.f8052a;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        } else {
            EditText editText3 = this.f8052a;
            if (editText3 != null) {
                editText3.setText("");
            }
        }
    }

    public final void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2590c6e8", new Object[]{this, onClickListener});
        } else {
            this.b = onClickListener;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
            return;
        }
        ckf.g(str, "defaultContent");
        super.show();
        d(str);
        g();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd2fa4a", new Object[]{this});
            return;
        }
        EditText editText = this.f8052a;
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
            f("");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        EditText editText = null;
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
        if (findViewById instanceof EditText) {
            editText = findViewById;
        }
        EditText editText2 = editText;
        this.f8052a = editText2;
        if (editText2 != null) {
            editText2.setHint(this.d);
        }
        EditText editText3 = this.f8052a;
        if (editText3 != null) {
            editText3.setInputType(1);
        }
        EditText editText4 = this.f8052a;
        if (editText4 != null) {
            editText4.setImeOptions(4);
        }
        View findViewById2 = inflate.findViewById(R.id.close_btn);
        ckf.f(findViewById2, "view.findViewById(R.id.close_btn)");
        ViewProxy.setOnClickListener(findViewById2, new a());
        EditText editText5 = this.f8052a;
        if (editText5 != null) {
            editText5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.icart.weex.dialog.ReorderInputDialog$onCreate$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
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
                        Context context = ReorderInputDialog.this.getContext();
                        ckf.f(context, "context");
                        be3.c(context, ReorderInputDialog.a(ReorderInputDialog.this));
                        return true;
                    } else {
                        if (ReorderInputDialog.b(ReorderInputDialog.this) != null) {
                            View.OnClickListener b2 = ReorderInputDialog.b(ReorderInputDialog.this);
                            ckf.d(b2);
                            b2.onClick(textView);
                        }
                        ReorderInputDialog.this.dismiss();
                        return true;
                    }
                }
            });
        }
        ViewProxy.setOnClickListener(inflate, new b());
        g();
    }
}
