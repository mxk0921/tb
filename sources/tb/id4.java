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
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class id4 extends kd7<hd4> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout h;
    public LinearLayout i;
    public ArrayList<md7> j = new ArrayList<>();
    public String k;
    public TextView l;
    public LinearLayout m;

    static {
        t2o.a(912262355);
    }

    public id4(Context context) {
        super(context);
        this.h = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_containerstyle4, (ViewGroup) null);
    }

    public static /* synthetic */ Object ipc$super(id4 id4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/CompositeContainerViewHolder");
    }

    public final void A(hd4 hd4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fd52ce", new Object[]{this, hd4Var});
            return;
        }
        this.i = (LinearLayout) this.h.findViewById(R.id.childrenContainer);
        String str = hd4Var.k;
        if (!ar3.b(str)) {
            this.k = str;
        }
        this.m = (LinearLayout) this.h.findViewById(R.id.btnMore);
        if (TextUtils.isEmpty(this.k)) {
            this.k = this.c.getString(R.string.tt_detail_desc_see_more);
        }
        if (this.j.size() > 0) {
            z(this.k, this);
            this.m.addView(this.l);
            w(this.j.get(0), false);
            if (this.j.size() > 1) {
                C(true);
            } else {
                C(false);
            }
        }
    }

    public final void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40919fe9", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void h(hd4 hd4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca44e41", new Object[]{this, hd4Var});
        }
    }

    /* renamed from: k */
    public boolean m(hd4 hd4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("608cb7c5", new Object[]{this, hd4Var})).booleanValue();
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int childCount = this.i.getChildCount();
        if (childCount == 1) {
            this.l.setText(this.c.getString(R.string.tt_detail_desc_pack_up));
            if (1 < this.j.size()) {
                for (int i = 1; i < this.j.size(); i++) {
                    w(this.j.get(i), false);
                }
            }
        } else if (childCount > 1) {
            this.l.setText(this.k);
            for (int i2 = childCount - 1; i2 >= 1; i2--) {
                this.i.removeViewAt(i2);
            }
        }
    }

    public final void w(md7 md7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3247ffe9", new Object[]{this, md7Var, new Boolean(z)});
            return;
        }
        kd7<? extends md7> a2 = ld7.a(this.f22590a, md7Var);
        View o = a2.o(md7Var);
        a2.g(md7Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.topMargin = mr7.a(15.0f);
        }
        this.i.addView(o, layoutParams);
    }

    /* renamed from: y */
    public View j(hd4 hd4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("82b7dc11", new Object[]{this, hd4Var});
        }
        this.j = hd4Var.b();
        A(hd4Var);
        return this.h;
    }

    public View z(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8b29bd", new Object[]{this, str, onClickListener});
        }
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.f22590a);
        }
        if (this.l == null) {
            TextView textView = new TextView(this.f22590a);
            this.l = textView;
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.l.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
            this.l.setPadding(0, mr7.a(10.0f), 0, mr7.a(10.0f));
            this.l.setGravity(17);
            this.l.setTextColor(this.c.getColor(R.color.tt_detail_gray));
            this.l.setTextSize(1, 14.0f);
        }
        this.l.setText(str);
        this.l.setOnClickListener(onClickListener);
        return this.l;
    }
}
