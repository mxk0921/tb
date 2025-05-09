package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i2q extends kd7<j2q> implements View.OnClickListener, ntc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Map<String, String> q;
    public float h;
    public float i;
    public final LinearLayout j;
    public TextView k;
    public String l;
    public String m;
    public boolean n;
    public final int o = R.drawable.tt_detail_desc_skubar_checked_bg;
    public final int p = R.drawable.tt_detail_desc_skubar_unchecked_bg;

    static {
        t2o.a(912262399);
        t2o.a(912261362);
    }

    public i2q(Context context) {
        super(context);
        this.j = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_skubar, (ViewGroup) null);
        F(context);
    }

    public static /* synthetic */ Object ipc$super(i2q i2qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/SkuBarViewHolder");
    }

    /* renamed from: A */
    public View j(j2q j2qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3ce3aa92", new Object[]{this, j2qVar});
        }
        if (TextUtils.isEmpty(j2qVar.k)) {
            this.j.setVisibility(8);
            return new View(this.f22590a);
        }
        this.j.setVisibility(0);
        this.l = j2qVar.k;
        this.m = j2qVar.l;
        this.h = j2qVar.m;
        this.i = j2qVar.n;
        K();
        return this.j;
    }

    public float B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75536689", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public float C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd349368", new Object[]{this})).floatValue();
        }
        return this.i;
    }

    public boolean E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b9bb93d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a2 = jmm.a(str);
        if (!TextUtils.isEmpty(a2) && !ar3.d(q) && q.containsKey(a2) && q.get(a2).equals(str)) {
            return true;
        }
        return false;
    }

    public final void F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
        } else {
            q84.i(context, m2q.class, this);
        }
    }

    public final void G(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d46035", new Object[]{this, str, str2});
        } else if (!ar3.d(q) && !TextUtils.isEmpty(str) && ((ConcurrentHashMap) q).containsKey(str) && ar3.a(str2, (String) ((ConcurrentHashMap) q).get(str))) {
            ((ConcurrentHashMap) q).remove(str);
        }
    }

    public boolean H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("249d8b2f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        G(jmm.a(str), str);
        return false;
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cea4712", new Object[]{this});
        } else {
            q84.l(this.f22590a, m2q.class);
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a4363d", new Object[]{this});
            return;
        }
        List<String> z = z();
        if (!ar3.c(z)) {
            J(z.contains(this.l));
        } else {
            J(false);
        }
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    /* renamed from: e */
    public boolean m(j2q j2qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5162686", new Object[]{this, j2qVar})).booleanValue();
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!TextUtils.isEmpty(this.l)) {
            w(this.l, true ^ this.n);
            q84.f(this.f22590a, new zq3());
            K();
            List<ux1> list = ((j2q) this.g).j;
            if (list != null && !((ArrayList) list).isEmpty()) {
                qc7.a(this.f22590a, ((j2q) this.g).j);
            }
        }
    }

    @Override // tb.kd7
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) q).clear();
        I();
    }

    public boolean w(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e847d28e", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return x(str);
        }
        return H(str);
    }

    public boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd7cb36", new Object[]{this, str})).booleanValue();
        }
        if (E(str)) {
            return true;
        }
        String a2 = jmm.a(str);
        if (q == null) {
            q = new ConcurrentHashMap();
        }
        if (((ConcurrentHashMap) q).containsKey(a2)) {
            G(a2, (String) ((ConcurrentHashMap) q).get(a2));
        }
        ((ConcurrentHashMap) q).put(a2, str);
        return true;
    }

    /* renamed from: y */
    public void h(j2q j2qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736c3d02", new Object[]{this, j2qVar});
        } else {
            this.j.setOnClickListener(this);
        }
    }

    @Override // tb.ntc
    public boolean y1(dtc dtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7cc73d0", new Object[]{this, dtcVar})).booleanValue();
        }
        if (!(dtcVar instanceof m2q)) {
            return false;
        }
        K();
        return true;
    }

    public List<String> z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ec1d150a", new Object[]{this});
        }
        return gt4.a(q);
    }

    public final void J(boolean z) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533c3430", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n = z;
        LinearLayout linearLayout = this.j;
        if (z) {
            i = this.o;
        } else {
            i = this.p;
        }
        linearLayout.setBackgroundResource(i);
        if (!TextUtils.isEmpty(this.m)) {
            StringBuilder sb = new StringBuilder();
            if (this.n) {
                str = "已选: ";
            } else {
                str = "选择: ";
            }
            sb.append(str);
            sb.append(this.m);
            String sb2 = sb.toString();
            if (this.k == null) {
                TextView textView = new TextView(this.f22590a);
                this.k = textView;
                textView.setTextColor(this.c.getColor(R.color.tt_detail_ff));
                this.k.setTextSize(1, 12.0f);
                this.k.setGravity(16);
                this.k.setLayoutParams(new ViewGroup.LayoutParams((int) Math.ceil(this.k.getPaint().measureText(sb2)), -2));
                this.j.addView(this.k);
            }
            this.k.setText(sb2);
        }
    }
}
