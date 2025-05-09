package tb;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import tb.hme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pj3 extends kd7<qj3> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RelativeLayout h;
    public final TextView i;
    public final TextView j;
    public final DetailImageView k;
    public final hme l;

    static {
        t2o.a(912262354);
    }

    public pj3(Context context) {
        super(context);
        RelativeLayout relativeLayout = (RelativeLayout) this.b.inflate(R.layout.tt_detail_desc_charity, (ViewGroup) null);
        this.h = relativeLayout;
        this.i = (TextView) relativeLayout.findViewById(R.id.title);
        this.j = (TextView) relativeLayout.findViewById(R.id.text);
        this.k = (DetailImageView) relativeLayout.findViewById(R.id.image);
        hme.a aVar = new hme.a();
        int i = R.drawable.tt_detail_img_load_fail;
        this.l = aVar.p(i).q(i).t(ImageView.ScaleType.CENTER_CROP).m();
    }

    public static /* synthetic */ Object ipc$super(pj3 pj3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/CharityViewHolder");
    }

    /* renamed from: w */
    public void h(qj3 qj3Var) {
        TextView textView;
        TextView textView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0820d26", new Object[]{this, qj3Var});
        } else if (qj3Var != null) {
            String str = qj3Var.k;
            String str2 = qj3Var.l;
            String str3 = qj3Var.m;
            if (!TextUtils.isEmpty(str) && (textView2 = this.i) != null) {
                textView2.setText(str);
                this.i.setVisibility(0);
            }
            if (!TextUtils.isEmpty(str2) && (textView = this.j) != null) {
                textView.setText(Html.fromHtml(str2));
                this.j.setVisibility(0);
            }
            n(this.k, str3, null, null, this.l);
        }
    }

    /* renamed from: x */
    public View j(qj3 qj3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("490dfe36", new Object[]{this, qj3Var});
        }
        return this.h;
    }

    /* renamed from: y */
    public boolean m(qj3 qj3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f5796aa", new Object[]{this, qj3Var})).booleanValue();
        }
        return qj3Var.g();
    }
}
