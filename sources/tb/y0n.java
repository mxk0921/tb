package tb;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y0n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f31763a;
    public PopupWindow c;
    public View d;
    public boolean b = false;
    public int e = 0;
    public int f = 0;
    public final qtd g = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements qtd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.qtd
        public void a(lcu lcuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaee5f8e", new Object[]{this, lcuVar});
            } else if (lcuVar != null) {
                int intValue = ((Integer) lcuVar.e("lifecycle")).intValue();
                if (intValue == 10002) {
                    y0n y0nVar = y0n.this;
                    if (y0nVar.b) {
                        y0nVar.h(y0n.a(y0nVar), y0n.b(y0n.this));
                    }
                } else if (intValue == 10005) {
                    if (y0n.c(y0n.this) == null || !y0n.c(y0n.this).isShowing()) {
                        y0n.this.b = false;
                        return;
                    }
                    y0n y0nVar2 = y0n.this;
                    y0nVar2.b = true;
                    y0nVar2.e();
                }
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
            y0n.c(y0n.this).dismiss();
            juv.b(y0n.d(y0n.this), "Page_ShoppingCart_Submit_OverMaxTipsClose", new String[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f31766a;
        public final /* synthetic */ DXRootView b;

        public c(ViewGroup viewGroup, DXRootView dXRootView) {
            this.f31766a = viewGroup;
            this.b = dXRootView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!y0n.d(y0n.this).R().isResumed()) {
                UnifyLog.e("PromotionManager", "pop return, fragment is not resume");
            } else if (!y0n.d(y0n.this).e().y() && !y0n.d(y0n.this).d().K()) {
                y0n.c(y0n.this).showAtLocation(this.b, 0, 0, (this.f31766a.getMeasuredHeight() - (this.b.getMeasuredHeight() * 2)) + 40);
            }
        }
    }

    static {
        t2o.a(479199605);
    }

    public y0n(kmb kmbVar) {
        this.f31763a = kmbVar;
    }

    public static /* synthetic */ int a(y0n y0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a57f022", new Object[]{y0nVar})).intValue();
        }
        return y0nVar.e;
    }

    public static /* synthetic */ int b(y0n y0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d83a363", new Object[]{y0nVar})).intValue();
        }
        return y0nVar.f;
    }

    public static /* synthetic */ PopupWindow c(y0n y0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("38b4a763", new Object[]{y0nVar});
        }
        return y0nVar.c;
    }

    public static /* synthetic */ kmb d(y0n y0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("d13c73bb", new Object[]{y0nVar});
        }
        return y0nVar.f31763a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e8212c", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.c;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.c.dismiss();
        }
    }

    public final String f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc125e80", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i == i2) {
            return this.f31763a.getContext().getResources().getString(R.string.cart_choice_50_quantity, Integer.valueOf(i));
        }
        if (i <= i2) {
            return null;
        }
        String format = String.format(this.f31763a.getContext().getResources().getString(R.string.cart_choice_max_quantity), String.valueOf(i));
        ub3.g("checkOverMax", format);
        return format;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6bbc16", new Object[]{this});
        } else if (!this.f31763a.d().K() && !this.f31763a.e().y()) {
            int d = sca.d(this.f31763a.d());
            int e = CheckHoldManager.i().e();
            if (e >= d) {
                h(e, d);
            } else {
                e();
            }
        }
    }

    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325c93f9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.c == null || this.d == null) {
            this.d = View.inflate(this.f31763a.getContext(), R.layout.icart_promotion_max_count_bubble, null);
            PopupWindow popupWindow = new PopupWindow(this.d, -2, -2, true);
            this.c = popupWindow;
            popupWindow.setFocusable(false);
            this.c.setOutsideTouchable(false);
            this.c.setBackgroundDrawable(new BitmapDrawable());
            ViewProxy.setOnClickListener(this.d.findViewById(R.id.close), new b());
            this.f31763a.g().c("cartLifecycle", this.g);
        }
        ((TUrlImageView) this.d.findViewById(R.id.image_bg)).setImageUrl("https://gw.alicdn.com/tfs/TB11JU5xhD1gK0jSZFsXXbldVXa-726-221.png");
        this.e = i;
        this.f = i2;
        String f = f(i, i2);
        if (!TextUtils.isEmpty(f)) {
            ((TextView) this.d.findViewById(R.id.tv_content)).setText(f);
        }
        if (!this.c.isShowing()) {
            ViewGroup p = this.f31763a.e().p();
            ViewGroup o0 = this.f31763a.e().o0();
            DXRootView c2 = bd4.c(p, "submit");
            if (c2 != null) {
                c2.post(new c(o0, c2));
            }
        }
        juv.e(this.f31763a, "Page_ShoppingCart_Submit_OverMaxTips_Show", new String[0]);
    }
}
