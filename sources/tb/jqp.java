package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.shop.widget.bar.ShopSearchBarPresenter;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.h3p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jqp implements p9e<LinearLayout, ShopSearchBarPresenter> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EditText f22162a;
    private TextView b;
    private FrameLayout c;
    private TUrlImageView d;
    private TextView e;
    private ImageView f;
    private LinearLayout g;
    private LinearLayout h;
    private ShopSearchBarPresenter i;
    private TextView j;
    private Handler k = new Handler(Looper.getMainLooper());
    private boolean l = false;
    private boolean m = !l3p.INSTANCE.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputMethodManager f22163a;

        public a(InputMethodManager inputMethodManager) {
            this.f22163a = inputMethodManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f22163a.showSoftInput(jqp.b(jqp.this), 1);
            }
        }
    }

    static {
        t2o.a(815793315);
        t2o.a(993002004);
    }

    private void R(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1a99d", new Object[]{this, view});
            return;
        }
        this.f22162a = (EditText) view.findViewById(R.id.et_input);
        this.f = (ImageView) view.findViewById(R.id.iv_back);
        this.e = (TextView) view.findViewById(R.id.tv_delete);
        this.b = (TextView) view.findViewById(R.id.tv_search);
        this.c = (FrameLayout) view.findViewById(R.id.fl_oversea_search);
        this.d = (TUrlImageView) view.findViewById(R.id.iv_search_icon);
        this.h = (LinearLayout) view.findViewById(R.id.ll_input);
        TextView textView = (TextView) view.findViewById(R.id.photoBtn);
        this.j = textView;
        if (this.m) {
            textView.setVisibility(0);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            this.h.setBackgroundResource(R.drawable.tbsearch_searchbar_input_background);
            this.f.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        } else {
            this.g.setBackgroundColor(-1);
            this.g.findViewById(R.id.ll_wrap).setBackgroundColor(-1);
            this.j.setVisibility(8);
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            this.d.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN0190h4nA1n8f2Ld4Pk8_!!6000000005045-2-tps-216-216.png");
            this.h.setBackgroundResource(R.drawable.tbsearch_active_search_bg);
            int b = o1p.b(14);
            int b2 = o1p.b(7);
            this.f.setPadding(b2, b, b2, b);
            this.f.setImageResource(R.drawable.tbsearch_ck_android_light_2024_new);
        }
        this.f22162a.setOnEditorActionListener(this.i);
        if (!TextUtils.isEmpty(this.i.getDisplayHint())) {
            this.f22162a.setHint(this.i.getDisplayHint());
        }
        if (this.i.getDisplayQuery() != null) {
            this.f22162a.setText(this.i.getDisplayQuery());
        }
        this.f.setOnClickListener(this.i);
        this.e.setOnClickListener(this.i);
        this.b.setOnClickListener(this.i);
        this.c.setOnClickListener(this.i);
        this.j.setOnClickListener(this.i);
        this.f22162a.addTextChangedListener(this.i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(view.getResources().getColor(R.color.orange));
        gradientDrawable.setCornerRadius(o1p.b(4));
        this.b.setBackground(gradientDrawable);
    }

    public static /* synthetic */ EditText b(jqp jqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("3120b6e", new Object[]{jqpVar});
        }
        return jqpVar.f22162a;
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76acf4b7", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            if (this.m) {
                linearLayout.setBackgroundResource(R.drawable.tbsearch_style_searchbar_promotion);
            }
            int b = o1p.b(6);
            this.h.setPadding(b, 0, b, 0);
            if (this.m) {
                this.f.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            this.b.setBackgroundResource(R.drawable.tbsearch_search_btn_promotion);
            this.b.setTextColor(ContextCompat.getColor(Globals.getApplication(), R.color.tbsearch_search_btn_double11_textcolor));
        }
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b757838", new Object[]{this});
        }
        EditText editText = this.f22162a;
        if (editText == null || editText.getText() == null) {
            return "";
        }
        return this.f22162a.getText().toString().trim();
    }

    /* renamed from: Q */
    public LinearLayout getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("bd406c79", new Object[]{this});
        }
        return this.g;
    }

    public void S() {
        ShopSearchBarPresenter shopSearchBarPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        EditText editText = this.f22162a;
        if (editText != null && (shopSearchBarPresenter = this.i) != null) {
            editText.removeTextChangedListener(shopSearchBarPresenter);
        }
    }

    public void T() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        if (this.f22162a.getText() != null) {
            i = this.f22162a.getText().length();
        }
        this.f22162a.requestFocus();
        this.f22162a.setSelection(i);
        this.k.postDelayed(new a((InputMethodManager) Globals.getApplication().getSystemService("input_method")), 100L);
    }

    public void U(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea7db48", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.e;
        if (textView != null) {
            if (!z) {
                i = 4;
            }
            textView.setVisibility(i);
        }
    }

    public void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eed1339", new Object[]{this, str});
        } else if (this.f22162a != null) {
            X(str);
        }
    }

    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f90480", new Object[]{this, str});
        } else if (this.f22162a != null && !TextUtils.isEmpty(str)) {
            this.f22162a.setHint(str);
        }
    }

    public void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85774aa6", new Object[]{this, str});
            return;
        }
        EditText editText = this.f22162a;
        if (editText != null && str != null) {
            editText.setText(str);
            this.f22162a.setSelection(str.length());
        }
    }

    public void Y(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdda2d3", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.j;
        if (textView != null && this.m) {
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    @Override // tb.p9e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    /* renamed from: g */
    public void d(ShopSearchBarPresenter shopSearchBarPresenter, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f643202", new Object[]{this, shopSearchBarPresenter, ykoVar});
        } else {
            this.i = shopSearchBarPresenter;
        }
    }

    @Override // tb.p9e
    public void init(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{this, activity});
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b11b6f", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            if (this.m) {
                linearLayout.setBackgroundResource(R.drawable.tbsearch_searchbar_input_background);
            }
            if (this.m) {
                this.f.getDrawable().setColorFilter(ContextCompat.getColor(Globals.getApplication(), R.color.tf_D_black), PorterDuff.Mode.SRC_IN);
            }
            this.b.setBackgroundResource(R.drawable.tbsearch_search_btn);
            this.b.setTextColor(ContextCompat.getColor(Globals.getApplication(), R.color.tbsearch_white));
        }
    }

    /* renamed from: u */
    public LinearLayout t(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("b5d44816", new Object[]{this, context, viewGroup});
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tbsearch_inshop_input_view, viewGroup, false);
        this.g = linearLayout;
        R(linearLayout);
        boolean equals = "true".equals(this.i.getWidget().getModel().w().get(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        this.l = equals;
        if (equals) {
            this.f22162a.setTextSize(1, h3p.c(14, true));
            this.b.getLayoutParams().width = o1p.b(87);
            this.b.getLayoutParams().height = o1p.b(30);
            this.b.setTextSize(1, h3p.b(h3p.a.INSTANCE.a(), true));
            this.e.setTextSize(1, h3p.c(14, true));
        }
        return linearLayout;
    }
}
