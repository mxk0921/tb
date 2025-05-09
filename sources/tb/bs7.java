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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bs7 extends kd7<cs7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout h;
    public final View i;
    public final View j;
    public final TextView k;

    static {
        t2o.a(912262365);
    }

    public bs7(Context context) {
        super(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_divider, (ViewGroup) null);
        this.h = linearLayout;
        linearLayout.setBackgroundColor(this.c.getColor(R.color.tt_detail_e));
        this.i = linearLayout.findViewById(R.id.detail_main_divider_line_top);
        this.j = linearLayout.findViewById(R.id.detail_main_divider_blank);
        this.k = (TextView) linearLayout.findViewById(R.id.detail_main_divider_text);
    }

    public static /* synthetic */ Object ipc$super(bs7 bs7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/DividerViewHolder");
    }

    /* renamed from: e */
    public void h(cs7 cs7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf1ac15", new Object[]{this, cs7Var});
        }
    }

    /* renamed from: k */
    public boolean m(cs7 cs7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c084f299", new Object[]{this, cs7Var})).booleanValue();
        }
        return false;
    }

    /* renamed from: x */
    public View j(cs7 cs7Var) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9fa83109", new Object[]{this, cs7Var});
        }
        this.h.setBackgroundColor(w14.a(cs7Var.k));
        int i3 = cs7Var.m;
        if (i3 == 100) {
            View view = this.i;
            if (cs7Var.l == 0) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            View view2 = this.j;
            if (cs7Var.l == 0) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (cs7Var.l * mr7.b);
            }
            this.j.setLayoutParams(layoutParams);
            this.k.setVisibility(8);
        } else if (i3 == 101) {
            this.k.setVisibility(0);
            this.j.setVisibility(8);
            if (!TextUtils.isEmpty(cs7Var.n)) {
                this.k.setText(cs7Var.n);
            }
        }
        return this.h;
    }
}
