package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.friends.model.SourceType;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nip extends rnf<rk4> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f24756a;
    public final Context b;
    public TUrlImageView c;
    public TextView d;
    public TextView e;
    public boolean f;
    public float g = 5.5f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk4 f24757a;
        public final /* synthetic */ int b;

        public a(rk4 rk4Var, int i) {
            this.f24757a = rk4Var;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f24757a.a().b().a(new mjp(this.f24757a.c().desc, this.f24757a), nip.d(nip.this), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            nip.e(nip.this).setCompoundDrawables(null, null, null, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            nip.f(nip.this, succPhenixEvent.getDrawable());
            return true;
        }
    }

    static {
        t2o.a(666894551);
    }

    public nip(Context context) {
        super(context);
        this.b = context;
    }

    public static /* synthetic */ Context d(nip nipVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4bc3363d", new Object[]{nipVar});
        }
        return nipVar.b;
    }

    public static /* synthetic */ TextView e(nip nipVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("8dc744ba", new Object[]{nipVar});
        }
        return nipVar.d;
    }

    public static /* synthetic */ void f(nip nipVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c2d1eb", new Object[]{nipVar, drawable});
        } else {
            nipVar.h(drawable);
        }
    }

    public static /* synthetic */ Object ipc$super(nip nipVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/common/ShareContactItemAdapter");
    }

    @Override // tb.rnf
    public View b(boolean z, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d48435a6", new Object[]{this, new Boolean(z), jSONObject});
        }
        this.f = z;
        if (z) {
            this.g = 5.5f;
            i = lr7.b(this.b, 60.0f);
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.share_weex_contact_item_layout, (ViewGroup) null);
            this.f24756a = inflate;
            this.e = (TextView) inflate.findViewById(R.id.tv_recommend);
        } else {
            this.g = 4.5f;
            i = lr7.b(this.b, 70.0f);
            this.f24756a = LayoutInflater.from(this.b).inflate(R.layout.share_contact_item_layout, (ViewGroup) null);
        }
        int c2 = (int) (c(this.b) / this.g);
        this.c = (TUrlImageView) this.f24756a.findViewById(R.id.share_contact_item_image);
        this.d = (TextView) this.f24756a.findViewById(R.id.share_contact_nick);
        View findViewById = this.f24756a.findViewById(R.id.rl_item);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        if (c2 > i) {
            i = c2;
        }
        layoutParams.width = i;
        findViewById.setLayoutParams(layoutParams);
        return this.f24756a;
    }

    /* renamed from: g */
    public void a(rk4 rk4Var, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef4c96d", new Object[]{this, rk4Var, new Integer(i)});
            return;
        }
        uk4 g = rk4Var.g();
        if (!TextUtils.isEmpty(g.b) && !g.b.startsWith("http")) {
            g.b = h1p.HTTP_PREFIX + g.b;
        }
        this.c.setImageUrl(g.b);
        if (TextUtils.isEmpty(g.f29428a)) {
            this.d.setVisibility(8);
        } else {
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
            this.d.setText(g.f29428a);
        }
        ViewProxy.setOnClickListener(this.f24756a, new a(rk4Var, i));
        this.d.setTextColor(this.b.getResources().getColor(R.color.share_text_color));
        if (!this.f) {
            this.d.setBackgroundResource(R.drawable.cancle_rectangle_grey);
        }
        if (this.f) {
            TextView textView = this.e;
            if (textView != null) {
                if (SourceType.RECOMMEND != rk4Var.n()) {
                    i2 = 8;
                }
                textView.setVisibility(i2);
            }
        } else if (SourceType.RECOMMEND == rk4Var.n()) {
            s0m.B().N0(hjp.a().getApplicationContext()).T(rk4Var.k()).succListener(new c()).failListener(new b()).fetch();
        } else {
            this.d.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void h(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b8873e", new Object[]{this, drawable});
        } else if (drawable != null) {
            drawable.setBounds(0, 0, lr7.b(this.b, 7.0f), lr7.b(this.b, 10.0f));
            this.d.setCompoundDrawables(drawable, null, null, null);
            this.d.setCompoundDrawablePadding(lr7.b(this.b, 5.0f));
        }
    }
}
