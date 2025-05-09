package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.alibaba.android.icart.core.groupcharge.ui.CartGroupChargeAdapter;
import com.alibaba.android.icart.core.widget.CartScrollRelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View b;
    public CartScrollRelativeLayout e;
    public Button f;
    public ViewGroup h;
    public TextView i;
    public ImageView j;
    public ListView k;
    public View l;
    public CartGroupChargeAdapter m;
    public final tka n;
    public final kmb o;
    public final IDMComponent p;
    public e r;

    /* renamed from: a  reason: collision with root package name */
    public final String f22527a = kb3.class.getSimpleName();
    public int c = 0;
    public int d = 500;
    public boolean g = false;
    public final Handler q = new d(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.kb3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0967a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0967a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    kb3.a(kb3.this);
                }
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                view.postDelayed(new RunnableC0967a(), 1000L);
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
            } else {
                kb3.a(kb3.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                kb3.a(kb3.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/groupcharge/ui/CartGroupChargeFloatLayer$4");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                kb3.b(kb3.this).clearAnimation();
                kb3.c(kb3.this, false);
            } else if (i == 2) {
                kb3.b(kb3.this).clearAnimation();
                kb3.this.r().setVisibility(4);
                kb3.d(kb3.this, false);
                if (kb3.e(kb3.this) != null) {
                    kb3.e(kb3.this).onDismiss();
                }
            } else if (i == 3) {
                if (!(kb3.f(kb3.this) == null || kb3.f(kb3.this).getBackground() == null)) {
                    kb3.f(kb3.this).getBackground().setAlpha((int) ((kb3.j(kb3.this) / 500.0d) * 255.0d));
                }
                if (kb3.j(kb3.this) > 0) {
                    kb3.l(kb3.this);
                    return;
                }
                kb3.k(kb3.this, 500);
                if (kb3.f(kb3.this) != null && kb3.f(kb3.this).getBackground() != null) {
                    kb3.f(kb3.this).getBackground().setAlpha(0);
                }
            } else if (i == 4) {
                if (!(kb3.f(kb3.this) == null || kb3.f(kb3.this).getBackground() == null)) {
                    kb3.f(kb3.this).getBackground().setAlpha((int) ((kb3.g(kb3.this) / 600.0d) * 255.0d));
                }
                if (kb3.g(kb3.this) < 600) {
                    kb3.i(kb3.this);
                } else {
                    kb3.h(kb3.this, 0);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface e {
        void onDismiss();
    }

    static {
        t2o.a(479199466);
    }

    public kb3(kmb kmbVar, tka tkaVar, IDMComponent iDMComponent) {
        this.o = kmbVar;
        this.n = tkaVar;
        this.p = iDMComponent;
        s();
        m();
        u();
        juv.e(kmbVar, "Page_ShoppingCart_AccountArea-SplitExpo", new String[0]);
    }

    public static /* synthetic */ void a(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bb5f18", new Object[]{kb3Var});
        } else {
            kb3Var.p();
        }
    }

    public static /* synthetic */ CartScrollRelativeLayout b(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartScrollRelativeLayout) ipChange.ipc$dispatch("ec3da4e9", new Object[]{kb3Var});
        }
        return kb3Var.e;
    }

    public static /* synthetic */ boolean c(kb3 kb3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0f5a744", new Object[]{kb3Var, new Boolean(z)})).booleanValue();
        }
        kb3Var.g = z;
        return z;
    }

    public static /* synthetic */ boolean d(kb3 kb3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b16efd45", new Object[]{kb3Var, new Boolean(z)})).booleanValue();
        }
        kb3Var.getClass();
        return z;
    }

    public static /* synthetic */ e e(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("eef7e9d8", new Object[]{kb3Var});
        }
        return kb3Var.r;
    }

    public static /* synthetic */ ViewGroup f(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6f846c42", new Object[]{kb3Var});
        }
        return kb3Var.h;
    }

    public static /* synthetic */ int g(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e96fc245", new Object[]{kb3Var})).intValue();
        }
        return kb3Var.c;
    }

    public static /* synthetic */ int h(kb3 kb3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52dabf66", new Object[]{kb3Var, new Integer(i)})).intValue();
        }
        kb3Var.c = i;
        return i;
    }

    public static /* synthetic */ void i(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7632831", new Object[]{kb3Var});
        } else {
            kb3Var.o();
        }
    }

    public static /* synthetic */ int j(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5568e03", new Object[]{kb3Var})).intValue();
        }
        return kb3Var.d;
    }

    public static /* synthetic */ int k(kb3 kb3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13cd6b68", new Object[]{kb3Var, new Integer(i)})).intValue();
        }
        kb3Var.d = i;
        return i;
    }

    public static /* synthetic */ void l(kb3 kb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8349f3ef", new Object[]{kb3Var});
        } else {
            kb3Var.n();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7640f9ea", new Object[]{this});
            return;
        }
        ptq.c(this.i, "group_charge_title");
        ptq.c(this.f, "group_charge_close_btn");
        ptq.c(this.j, "groupCharge_tipsIcon");
        ptq.c(this.l, "groupCharge_titleContainer");
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff940f3", new Object[]{this});
        } else if (this.i != null) {
            this.d -= 20;
            this.q.sendEmptyMessageDelayed(3, 20L);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc634bee", new Object[]{this});
        } else if (this.i != null) {
            this.c += 20;
            this.q.sendEmptyMessageDelayed(4, 20L);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            q();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (r() != null) {
            if (r().getVisibility() == 0 && !this.g) {
                n();
                CartScrollRelativeLayout cartScrollRelativeLayout = this.e;
                cartScrollRelativeLayout.smoothScrollIn(cartScrollRelativeLayout.getHeight(), 500);
                this.q.sendEmptyMessageDelayed(2, 400L);
            }
            r().setFocusable(false);
        }
    }

    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.b;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(this.o.getContext()).inflate(R.layout.icart_view_group_charge, (ViewGroup) null);
        this.b = inflate;
        inflate.setTag(this.f22527a);
        this.e = (CartScrollRelativeLayout) this.b.findViewById(R.id.layout_cart_group_charge_content);
        this.f = (Button) this.b.findViewById(R.id.button_group_charge_closecard);
        LinearLayout linearLayout = (LinearLayout) this.b.findViewById(R.id.layout_cart_group_charge);
        this.h = linearLayout;
        linearLayout.getBackground().setAlpha(0);
        this.i = (TextView) this.b.findViewById(R.id.textview_cart_group_charge_title);
        this.j = (ImageView) this.b.findViewById(R.id.imageview_cart_group_charge_icon);
        this.k = (ListView) this.b.findViewById(R.id.listview_cart_group_charge);
        this.l = this.b.findViewById(R.id.textview_cart_group_charge_title_container);
        if (this.m == null) {
            CartGroupChargeAdapter cartGroupChargeAdapter = new CartGroupChargeAdapter(this.o, this.p);
            this.m = cartGroupChargeAdapter;
            cartGroupChargeAdapter.setListener(new a());
        }
        this.k.setAdapter((ListAdapter) this.m);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        View r = r();
        if (r != null) {
            tka tkaVar = this.n;
            if (tkaVar != null) {
                v(tkaVar.a());
                if (!TextUtils.isEmpty(this.n.b())) {
                    this.i.setText(this.n.b());
                }
            }
            this.k.setSelection(0);
            r.setVisibility(0);
            r.bringToFront();
            o();
            this.e.bringToFront();
            CartScrollRelativeLayout cartScrollRelativeLayout = this.e;
            cartScrollRelativeLayout.smoothScrollOut(cartScrollRelativeLayout.getHeight(), 900);
            this.f.bringToFront();
            this.g = true;
            this.q.sendEmptyMessageDelayed(1, 900L);
            r.setFocusable(true);
            r.requestFocus();
            r.requestLayout();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3036a894", new Object[]{this});
            return;
        }
        this.f.setOnClickListener(new b());
        ViewProxy.setOnClickListener(this.b.findViewById(R.id.layout_cart_group_charge_top), new c());
    }

    public void v(List<ska> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        CartGroupChargeAdapter cartGroupChargeAdapter = this.m;
        if (cartGroupChargeAdapter != null) {
            cartGroupChargeAdapter.setGroupDatas(list);
            this.m.notifyDataSetChanged();
        }
    }

    public void w(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f638390", new Object[]{this, eVar});
        } else {
            this.r = eVar;
        }
    }
}
