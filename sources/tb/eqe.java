package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.hme;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eqe extends kd7<u2m> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout h;
    public final TextView i;
    public final DetailImageView j;
    public final int k = this.c.getDimensionPixelOffset(R.dimen.tt_detail_desc_picwithtitle_picwidth);
    public final hme l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18758a;

        public a(String str) {
            this.f18758a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            z3a z3aVar = new z3a();
            z3aVar.f32510a = true;
            z3aVar.b = 0;
            z3aVar.e = view;
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(fpe.a(eqe.this.f22590a, this.f18758a, 430));
            z3aVar.d.add(this.f18758a);
            z3aVar.a(arrayList);
            q84.f(eqe.this.f22590a, new lvp(z3aVar));
        }
    }

    static {
        t2o.a(912262372);
    }

    public eqe(Context context) {
        super(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_image_with_title, (ViewGroup) null);
        this.h = linearLayout;
        this.i = (TextView) linearLayout.findViewById(R.id.title);
        this.j = (DetailImageView) linearLayout.findViewById(R.id.image);
        hme.a aVar = new hme.a();
        int i = R.drawable.tt_detail_img_load_fail;
        this.l = aVar.p(i).q(i).t(ImageView.ScaleType.CENTER_CROP).m();
    }

    public static /* synthetic */ Object ipc$super(eqe eqeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/ImageWithTitleViewHolder");
    }

    /* renamed from: w */
    public void h(u2m u2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ac4514", new Object[]{this, u2mVar});
            return;
        }
        String str = u2mVar.k;
        String str2 = u2mVar.l;
        if (!TextUtils.isEmpty(str)) {
            this.i.setText(str);
            this.i.setVisibility(0);
        }
        DetailImageView detailImageView = this.j;
        int i = this.k;
        n(detailImageView, str2, new koe(i, i), null, this.l);
        this.j.setOnClickListener(new a(str2));
    }

    /* renamed from: x */
    public View j(u2m u2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c76f7fa4", new Object[]{this, u2mVar});
        }
        return this.h;
    }

    /* renamed from: y */
    public boolean m(u2m u2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fa10e98", new Object[]{this, u2mVar})).booleanValue();
        }
        if (u2mVar.l == null) {
            return true;
        }
        return false;
    }
}
