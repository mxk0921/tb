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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y1s extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f31791a;
    public EditText b;
    public c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            y1s.this.dismiss();
            if (y1s.a(y1s.this) != null && y1s.b(y1s.this) != null) {
                c b = y1s.b(y1s.this);
                y1s y1sVar = y1s.this;
                b.onClick(y1sVar, y1s.a(y1sVar).getText());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            y1s.this.dismiss();
            if (y1s.a(y1s.this) != null && y1s.c(y1s.this) != null) {
                Editable text = y1s.a(y1s.this).getText();
                y1s.d(y1s.this).setText(text);
                y1s.c(y1s.this).onClick(y1s.this, text);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void onClick(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        t2o.a(155189299);
    }

    public y1s(Context context) {
        super(context);
    }

    public static /* synthetic */ EditText a(y1s y1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("69f62da5", new Object[]{y1sVar});
        }
        return y1sVar.b;
    }

    public static /* synthetic */ c b(y1s y1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d21872f9", new Object[]{y1sVar});
        }
        y1sVar.getClass();
        return null;
    }

    public static /* synthetic */ c c(y1s y1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("baabc2d8", new Object[]{y1sVar});
        }
        return y1sVar.c;
    }

    public static /* synthetic */ EditText d(y1s y1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("939c6ec2", new Object[]{y1sVar});
        }
        return y1sVar.f31791a;
    }

    public static /* synthetic */ Object ipc$super(y1s y1sVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/trade/dinamicx3/widget/TDTextInputDialog");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            super.dismiss();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a595e046", new Object[]{this});
            return;
        }
        EditText editText = this.f31791a;
        if (editText != null && this.b != null) {
            Object tag = editText.getTag(z1s.ID_KEY_BOARD);
            if (tag instanceof Integer) {
                yn7.c(this.b, ((Integer) tag).intValue());
            }
            Object tag2 = this.f31791a.getTag(z1s.ID_MAX_LENGTH);
            if (tag2 instanceof Integer) {
                yn7.d(this.b, ((Integer) tag2).intValue());
            }
            Object tag3 = this.f31791a.getTag(z1s.ID_PLACE_HOLDER);
            if (tag3 != null) {
                yn7.a(this.b, tag3.toString());
            }
            Object tag4 = this.f31791a.getTag(z1s.ID_PLACE_HOLDER_COLOR);
            if (tag4 instanceof Integer) {
                yn7.b(this.b, ((Integer) tag4).intValue());
            }
            Object tag5 = this.f31791a.getTag(z1s.ID_TV_TEXT);
            if (tag5 != null) {
                yn7.e(this.b, tag5.toString());
            }
            Editable text = this.b.getText();
            if (!TextUtils.isEmpty(text)) {
                this.b.setSelection(text.length());
            }
        }
    }

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392bcda9", new Object[]{this, context});
            return;
        }
        setContentView(R.layout.trade_text_input);
        this.b = (EditText) findViewById(R.id.et_input);
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

    public void h(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867d050e", new Object[]{this, editText});
            return;
        }
        this.f31791a = editText;
        e();
    }

    public void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f9c5e", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            super.show();
            f(getContext());
            g();
            e();
        } catch (Throwable th) {
            hav.a("TDTextInputDialog", th.getMessage());
        }
    }
}
