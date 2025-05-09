package tb;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x1s extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f31076a;
    public EditText b;
    public c c;
    public String d;
    public TextView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            x1s.this.dismiss();
            if (x1s.a(x1s.this) != null && x1s.b(x1s.this) != null) {
                c b = x1s.b(x1s.this);
                x1s x1sVar = x1s.this;
                b.onClick(x1sVar, x1s.a(x1sVar).getText());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            x1s.this.dismiss();
            if (x1s.a(x1s.this) != null && x1s.c(x1s.this) != null) {
                Editable text = x1s.a(x1s.this).getText();
                x1s.d(x1s.this).setText(text);
                x1s.c(x1s.this).onClick(x1s.this, text);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void onClick(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        t2o.a(301989925);
    }

    public x1s(Context context) {
        super(context);
    }

    public static /* synthetic */ EditText a(x1s x1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("d10dbc81", new Object[]{x1sVar});
        }
        return x1sVar.f31076a;
    }

    public static /* synthetic */ c b(x1s x1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("677310cd", new Object[]{x1sVar});
        }
        x1sVar.getClass();
        return null;
    }

    public static /* synthetic */ c c(x1s x1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7187feac", new Object[]{x1sVar});
        }
        return x1sVar.c;
    }

    public static /* synthetic */ EditText d(x1s x1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("8c250b84", new Object[]{x1sVar});
        }
        return x1sVar.b;
    }

    public static /* synthetic */ Object ipc$super(x1s x1sVar, String str, Object... objArr) {
        if (str.hashCode() == -340027132) {
            super.show();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/dinamicX/widget/TDTextInputDialog");
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a595e046", new Object[]{this});
            return;
        }
        EditText editText = this.b;
        if (editText != null && this.f31076a != null) {
            Object tag = editText.getTag(a2s.ID_KEY_BOARD);
            if (tag instanceof Integer) {
                xn7.c(this.f31076a, ((Integer) tag).intValue());
            }
            Object tag2 = this.b.getTag(a2s.ID_MAX_LENGTH);
            if (tag2 instanceof Integer) {
                xn7.d(this.f31076a, ((Integer) tag2).intValue());
            }
            Object tag3 = this.b.getTag(a2s.ID_PLACE_HOLDER);
            if (tag3 != null) {
                xn7.a(this.f31076a, tag3.toString());
            }
            Object tag4 = this.b.getTag(a2s.ID_PLACE_HOLDER_COLOR);
            if (tag4 instanceof Integer) {
                xn7.b(this.f31076a, ((Integer) tag4).intValue());
            }
            Object tag5 = this.b.getTag(a2s.ID_TV_TEXT);
            if (tag5 != null) {
                xn7.e(this.f31076a, tag5.toString());
            }
            Editable text = this.f31076a.getText();
            if (!TextUtils.isEmpty(text)) {
                this.f31076a.setSelection(text.length());
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f3caff", new Object[]{this});
            return;
        }
        setContentView(R.layout.alibuy_text_input_dialog);
        this.f31076a = (EditText) findViewById(R.id.et_input);
        this.e = (TextView) findViewById(R.id.tv_title);
        if (this.f31076a != null) {
            if (!TextUtils.isEmpty(this.d)) {
                this.e.setText(this.d);
            } else {
                this.e.setText(getContext().getString(R.string.taobao_app_1029_1_37090));
            }
        }
        ViewProxy.setOnClickListener(findViewById(R.id.tv_cancel), new a());
        ViewProxy.setOnClickListener(findViewById(R.id.tv_confirm), new b());
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58615a7", new Object[]{this});
            return;
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = -1;
            attributes.height = -2;
            attributes.x = 0;
            attributes.y = 0;
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(17170445);
            window.clearFlags(131072);
            window.setSoftInputMode(5);
        }
    }

    public void h(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867d050e", new Object[]{this, editText});
            return;
        }
        this.b = editText;
        e();
    }

    public void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2145340", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b25594a", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        f();
        g();
        e();
    }
}
