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
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mlt extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f24125a;
    public EditText b;
    public c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            mlt.this.dismiss();
            if (mlt.a(mlt.this) != null && mlt.b(mlt.this) != null) {
                c b = mlt.b(mlt.this);
                mlt mltVar = mlt.this;
                b.onClick(mltVar, mlt.a(mltVar).getText());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            mlt.this.dismiss();
            if (mlt.a(mlt.this) != null && mlt.c(mlt.this) != null) {
                Editable text = mlt.a(mlt.this).getText();
                mlt.d(mlt.this).setText(text);
                mlt.c(mlt.this).onClick(mlt.this, text);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void onClick(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        t2o.a(442499382);
    }

    public mlt(Context context) {
        super(context);
    }

    public static /* synthetic */ EditText a(mlt mltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("6998ffda", new Object[]{mltVar});
        }
        return mltVar.b;
    }

    public static /* synthetic */ c b(mlt mltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ee77abe3", new Object[]{mltVar});
        }
        mltVar.getClass();
        return null;
    }

    public static /* synthetic */ c c(mlt mltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("648dce42", new Object[]{mltVar});
        }
        return mltVar.c;
    }

    public static /* synthetic */ EditText d(mlt mltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b49cf4b7", new Object[]{mltVar});
        }
        return mltVar.f24125a;
    }

    public static /* synthetic */ Object ipc$super(mlt mltVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/sku/widget/TextInputDialog");
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
        EditText editText = this.f24125a;
        if (editText != null && this.b != null) {
            Object tag = editText.getTag(nlt.ID_KEY_BOARD);
            if (tag instanceof Integer) {
                ao7.c(this.b, ((Integer) tag).intValue());
            }
            Object tag2 = this.f24125a.getTag(nlt.ID_MAX_LENGTH);
            if (tag2 instanceof Integer) {
                ao7.d(this.b, ((Integer) tag2).intValue());
            }
            Object tag3 = this.f24125a.getTag(nlt.ID_PLACE_HOLDER);
            if (tag3 != null) {
                ao7.a(this.b, tag3.toString());
            }
            Object tag4 = this.f24125a.getTag(nlt.ID_PLACE_HOLDER_COLOR);
            if (tag4 instanceof Integer) {
                ao7.b(this.b, ((Integer) tag4).intValue());
            }
            Object tag5 = this.f24125a.getTag(nlt.ID_TV_TEXT);
            if (tag5 != null) {
                ao7.e(this.b, tag5.toString());
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
        setContentView(R.layout.xsku_text_input);
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
        this.f24125a = editText;
        e();
    }

    public void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b378a53", new Object[]{this, cVar});
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
        if (cjz.a()) {
            SkuLogUtils.x("TextInputDialog.show");
        }
    }
}
