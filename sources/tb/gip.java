package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gip extends rnf<mi3> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f20028a;
    public View b;
    public TUrlImageView c;
    public final Context d;
    public TextView e;
    public JSONObject f = new JSONObject();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mi3 f20029a;
        public final /* synthetic */ int b;

        public a(mi3 mi3Var, int i) {
            this.f20029a = mi3Var;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f20029a.a().b().a(new mjp(this.f20029a.c().desc, this.f20029a), gip.d(gip.this), this.b);
            }
        }
    }

    static {
        t2o.a(666894549);
    }

    public gip(Context context) {
        super(context);
        this.d = context;
    }

    public static /* synthetic */ Context d(gip gipVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b0f0cce0", new Object[]{gipVar});
        }
        return gipVar.d;
    }

    public static /* synthetic */ Object ipc$super(gip gipVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/common/ShareChannelItemAdapter");
    }

    @Override // tb.rnf
    public View b(boolean z, JSONObject jSONObject) {
        float f;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d48435a6", new Object[]{this, new Boolean(z), jSONObject});
        }
        if (z) {
            if (jSONObject == null || jSONObject.getFloatValue(pg1.ATOM_EXT_column) <= 0.0f) {
                f = 5.5f;
            } else {
                f = jSONObject.getFloat(pg1.ATOM_EXT_column).floatValue();
            }
            i = lr7.b(this.d, 60.0f);
            this.f20028a = LayoutInflater.from(this.d).inflate(R.layout.share_new_weex_channel_item_layout, (ViewGroup) null);
        } else {
            i = lr7.b(this.d, 70.0f);
            this.f20028a = LayoutInflater.from(this.d).inflate(R.layout.share_new_channel_item_layout, (ViewGroup) null);
            f = 4.5f;
        }
        this.c = (TUrlImageView) this.f20028a.findViewById(R.id.share_channel_item_image);
        this.e = (TextView) this.f20028a.findViewById(R.id.tv_channel_name);
        int c = (int) (c(this.d) / f);
        if (c > i) {
            i = c;
        }
        this.b = this.f20028a.findViewById(R.id.rl_item);
        f(i, jSONObject);
        return this.f20028a;
    }

    /* renamed from: e */
    public void a(mi3 mi3Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4215197b", new Object[]{this, mi3Var, new Integer(i)});
            return;
        }
        vi3 g = mi3Var.g();
        this.c.setWhenNullClearImg(true);
        String string = this.f.getString(g.k());
        if (!TextUtils.isEmpty(string)) {
            this.c.setImageUrl(null);
            this.c.setImageUrl(string);
        } else if (!TextUtils.isEmpty(g.e())) {
            this.c.setImageUrl(null);
            this.c.setImageUrl(g.e());
        } else if (g.c() == -1 && g.d() > 0) {
            this.c.setImageResource(g.d());
        }
        if (g.g() != null) {
            this.e.setText(g.g());
        }
        if (!TextUtils.isEmpty(g.b())) {
            this.f20028a.setContentDescription(g.b());
        }
        ViewProxy.setOnClickListener(this.f20028a, new a(mi3Var, i));
    }

    public final void f(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87ba0d5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.width = i;
        if (jSONObject == null) {
            this.b.setLayoutParams(layoutParams);
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("iconMap");
        this.f = jSONObject2;
        if (jSONObject2 == null) {
            this.f = new JSONObject();
        }
        int intValue = jSONObject.getIntValue("height");
        if (intValue > 0) {
            layoutParams.height = lr7.b(this.d, intValue / 2);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        int intValue2 = jSONObject.getIntValue("iconSize");
        int b = lr7.b(this.d, intValue2 / 2);
        if (intValue2 > 0) {
            layoutParams2.width = b;
            layoutParams2.height = b;
            this.c.setLayoutParams(layoutParams2);
        }
        int intValue3 = jSONObject.getIntValue("textSize");
        if (intValue3 > 0) {
            this.e.setTextSize(1, intValue3 / 2);
        }
        String string = jSONObject.getString("textColor");
        if (!TextUtils.isEmpty(string)) {
            this.e.setTextColor(Color.parseColor(string));
        }
        int b2 = lr7.b(this.d, jSONObject.getIntValue("space") / 2);
        if (b2 > 0) {
            TextView textView = this.e;
            textView.setPadding(textView.getPaddingLeft(), b2, this.e.getPaddingRight(), this.e.getPaddingBottom());
        }
        int textSize = (int) ((((layoutParams.height - this.e.getTextSize()) - b) - b2) / 2.0f);
        View view = this.b;
        view.setPadding(view.getPaddingLeft(), textSize, this.b.getPaddingRight(), this.b.getBottom());
        this.b.setLayoutParams(layoutParams);
    }
}
