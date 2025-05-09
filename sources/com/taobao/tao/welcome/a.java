package com.taobao.tao.welcome;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class a extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d f12886a;
    public final int[] b;
    public final int[] c;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.welcome.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class View$OnClickListenerC0731a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0731a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                a.a(a.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                a.b(a.this, view.getId());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f12889a;

        public c(TextView textView) {
            this.f12889a = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int width = (this.f12889a.getWidth() - this.f12889a.getPaddingLeft()) - this.f12889a.getPaddingRight();
            int textSize = (int) this.f12889a.getTextSize();
            CharSequence text = this.f12889a.getText();
            Paint paint = new Paint();
            paint.setTextSize(textSize);
            float f = width;
            if (paint.measureText(text, 0, text.length()) > f) {
                int i = 0;
                while (i < textSize) {
                    int i2 = ((textSize - i) / 2) + i;
                    paint.setTextSize(i2);
                    if (i2 != i && i2 != textSize) {
                        if (paint.measureText(text, 0, text.length()) <= f) {
                            if (paint.measureText(text, 0, text.length()) >= f) {
                                break;
                            }
                            i = i2;
                        } else {
                            textSize = i2;
                        }
                    } else {
                        break;
                    }
                }
                this.f12889a.setTextSize(0, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void a(int i);

        void onPositive();
    }

    static {
        t2o.a(734003231);
    }

    public a(Context context, String str, int[] iArr, int[] iArr2) {
        super(context, R.style.MyDialog);
        if (str == null || iArr2 == null) {
            throw new IllegalArgumentException();
        } else if (iArr2.length < 2 || !(iArr == null || iArr.length == iArr2.length)) {
            throw new IllegalArgumentException();
        } else {
            this.b = iArr2;
            this.c = iArr;
            f();
        }
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d15f6", new Object[]{aVar});
        } else {
            aVar.i();
        }
    }

    public static /* synthetic */ void b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1750bdac", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.h(i);
        }
    }

    public static void d(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a376cced", new Object[]{textView});
        } else {
            textView.post(new c(textView));
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/ProvisionDialog");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416be", new Object[]{this});
        }
    }

    public <T extends View> T e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("727edd23", new Object[]{this, new Integer(i)}));
        }
        return (T) findViewById(i);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public abstract int g();

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35cb2312", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.f12886a;
        if (dVar != null) {
            dVar.a(i);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09fbad5", new Object[]{this});
            return;
        }
        d dVar = this.f12886a;
        if (dVar != null) {
            dVar.onPositive();
        }
    }

    public void j(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc80498c", new Object[]{this, dVar});
        } else {
            this.f12886a = dVar;
        }
    }

    public final void k(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2db402", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setVisibility(0);
        textView.setText(i);
        textView.setOnClickListener(new b());
        d(textView);
    }

    public final void l(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a8d0c6", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setVisibility(0);
        textView.setText(i);
        textView.setOnClickListener(new View$OnClickListenerC0731a());
        d(textView);
    }

    public final void m() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423b649", new Object[]{this});
        } else if (this.c == null) {
            k((TextView) e(R.id.provision_negative_button), this.b[0]);
            l((TextView) e(R.id.provision_positive_button), this.b[1]);
        } else {
            while (true) {
                int[] iArr = this.c;
                if (i < iArr.length - 1) {
                    k((TextView) e(iArr[i]), this.b[i]);
                    i++;
                } else {
                    l((TextView) e(iArr[iArr.length - 1]), this.b[this.c.length - 1]);
                    return;
                }
            }
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
        setContentView(g());
        m();
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setBackgroundDrawable(new ColorDrawable(0));
        }
        c();
    }
}
