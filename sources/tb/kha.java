package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.android.detail.ttdetail.widget.desc.WavingSymbolView;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import tb.hme;
import tb.lha;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kha extends kd7<lha> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RelativeLayout h;
    public final DetailImageView i;
    public final LinearLayout j;
    public final TextView k;
    public final int l;
    public int m = (int) (mr7.f(this.f22590a) * 1.2d);
    public final int n = this.c.getDimensionPixelOffset(R.dimen.tt_detail_desc_goodsmatching_itempicwidth);
    public final hme o;

    static {
        t2o.a(912262369);
    }

    public kha(Context context) {
        super(context);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_goodsmatching, (ViewGroup) null);
        this.h = relativeLayout;
        DetailImageView detailImageView = (DetailImageView) relativeLayout.findViewById(R.id.mainImg);
        this.i = detailImageView;
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.matchingContainer);
        this.j = linearLayout;
        this.k = (TextView) relativeLayout.findViewById(R.id.tvTitle);
        int f = mr7.f(this.f22590a);
        this.l = f;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) detailImageView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(f, this.m);
        } else {
            layoutParams.width = f;
            layoutParams.height = this.m;
        }
        detailImageView.setLayoutParams(layoutParams);
        linearLayout.getBackground().setAlpha(127);
        hme.a aVar = new hme.a();
        int i = R.drawable.tt_detail_img_load_fail;
        hme.a p = aVar.p(i);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        this.o = p.n(scaleType).q(i).s(scaleType).t(ImageView.ScaleType.CENTER_CROP).m();
    }

    public static /* synthetic */ Object ipc$super(kha khaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/GoodsMatchingViewHolder");
    }

    /* renamed from: e */
    public void h(lha lhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1416f", new Object[]{this, lhaVar});
        }
    }

    /* renamed from: k */
    public boolean m(lha lhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df65a7f3", new Object[]{this, lhaVar})).booleanValue();
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view instanceof ImageView) {
            Object tag = view.getTag(R.id.tt_detail_goodsmatching_position);
            if (tag != null && (tag instanceof Integer)) {
                Integer num = (Integer) tag;
            }
            String obj = view.getTag().toString();
            if (!TextUtils.isEmpty(obj)) {
                xq0.c().a(this.f22590a).c(obj);
            }
        }
    }

    public final View w(lha.b bVar, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("abb2cec9", new Object[]{this, bVar, new Boolean(z), num});
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.f22590a);
        DetailImageView detailImageView = new DetailImageView(this.f22590a);
        detailImageView.setId(bVar.hashCode());
        detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int i = this.n;
        detailImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        detailImageView.setTag(bVar.b);
        String str = bVar.f23340a;
        int i2 = this.n;
        n(detailImageView, str, new koe(i2, i2), null, this.o);
        detailImageView.setTag(R.id.tt_detail_goodsmatching_position, num);
        detailImageView.setOnClickListener(this);
        relativeLayout.addView(detailImageView);
        WavingSymbolView wavingSymbolView = new WavingSymbolView(this.f22590a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(5, detailImageView.getId());
        layoutParams.addRule(8, detailImageView.getId());
        layoutParams.leftMargin = mr7.a(12.0f);
        layoutParams.bottomMargin = mr7.a(12.0f);
        relativeLayout.addView(wavingSymbolView, layoutParams);
        if (!z) {
            return relativeLayout;
        }
        LinearLayout linearLayout = new LinearLayout(this.f22590a);
        linearLayout.setOrientation(1);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.f22590a);
        tIconFontTextView.setGravity(1);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setText(this.c.getString(R.string.tt_detail_iconfont_add));
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        tIconFontTextView.setTextColor(-1);
        tIconFontTextView.setTextSize(1, 18.0f);
        tIconFontTextView.setPadding(0, mr7.a(9.0f), 0, mr7.a(9.0f));
        linearLayout.addView(tIconFontTextView, layoutParams2);
        linearLayout.addView(relativeLayout);
        return linearLayout;
    }

    /* renamed from: y */
    public View j(lha lhaVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("799da663", new Object[]{this, lhaVar});
        }
        if (lhaVar == null) {
            return this.h;
        }
        int i2 = lhaVar.o;
        if (i2 > 0 && (i = lhaVar.n) > 0) {
            this.m = (this.l * i) / i2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams.height = this.m;
            this.i.setLayoutParams(layoutParams);
        }
        hme.a aVar = new hme.a();
        int i3 = R.drawable.tt_detail_img_load_fail;
        n(this.i, lhaVar.l, new koe(this.l, this.m), null, aVar.p(i3).q(i3).t(this.i.getScaleType()).m());
        if (TextUtils.isEmpty(lhaVar.k)) {
            this.k.setVisibility(8);
        } else {
            this.k.setText(lhaVar.k);
        }
        for (lha.b bVar : lhaVar.m) {
            int indexOf = lhaVar.m.indexOf(bVar);
            if (indexOf == 0) {
                this.j.addView(w(bVar, false, Integer.valueOf(indexOf)));
            } else {
                this.j.addView(w(bVar, true, Integer.valueOf(indexOf)));
            }
        }
        return this.h;
    }
}
