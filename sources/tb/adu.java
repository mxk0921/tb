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
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class adu extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f15685a;
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
            adu.this.dismiss();
            if (adu.a(adu.this) != null && adu.b(adu.this) != null) {
                c b = adu.b(adu.this);
                adu aduVar = adu.this;
                b.onClick(aduVar, adu.a(aduVar).getText());
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
            adu.this.dismiss();
            if (adu.a(adu.this) != null && adu.c(adu.this) != null) {
                Editable text = adu.a(adu.this).getText();
                adu.d(adu.this).setText(text);
                adu.c(adu.this).onClick(adu.this, text);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void onClick(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        t2o.a(155189274);
    }

    public adu(Context context) {
        super(context);
    }

    public static /* synthetic */ EditText a(adu aduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("1699a5ae", new Object[]{aduVar});
        }
        return aduVar.b;
    }

    public static /* synthetic */ c b(adu aduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("23ba8e8b", new Object[]{aduVar});
        }
        aduVar.getClass();
        return null;
    }

    public static /* synthetic */ c c(adu aduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f054d6ea", new Object[]{aduVar});
        }
        return aduVar.c;
    }

    public static /* synthetic */ EditText d(adu aduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("6fb4138b", new Object[]{aduVar});
        }
        return aduVar.f15685a;
    }

    public static /* synthetic */ Object ipc$super(adu aduVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/trade/dinamicX/widget/TradeTextInputDialog");
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
        EditText editText = this.f15685a;
        if (editText != null && this.b != null) {
            Object tag = editText.getTag(TradeTextInputConstructor.ID_KEY_BOARD);
            if (tag != null) {
                do7.c(this.b, tag.toString());
            }
            Object tag2 = this.f15685a.getTag(TradeTextInputConstructor.ID_MAX_LENGTH);
            if (tag2 != null) {
                do7.d(this.b, tag2.toString());
            }
            Object tag3 = this.f15685a.getTag(TradeTextInputConstructor.ID_PLACE_HOLDER);
            if (tag3 != null) {
                do7.a(this.b, tag3.toString());
            }
            Object tag4 = this.f15685a.getTag(TradeTextInputConstructor.ID_PLACE_HOLDER_COLOR);
            if (tag4 != null) {
                do7.b(this.b, tag4.toString());
            }
            Object tag5 = this.f15685a.getTag(TradeTextInputConstructor.ID_TV_TEXT);
            if (tag5 != null) {
                do7.e(this.b, tag5.toString());
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
        this.f15685a = editText;
        e();
    }

    public void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb4d127", new Object[]{this, cVar});
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
        super.show();
        f(getContext());
        g();
        e();
    }
}
