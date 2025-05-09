package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.ApiRequestListener;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.CouponBussiness;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.Unit;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hjh;
import tb.kd7;
import tb.lwm;
import tb.mv4;
import tb.qc7;
import tb.t2o;
import tb.ux1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CouponViewHolder extends kd7<mv4> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RelativeLayout h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public String l;
    public String m;
    public Unit n;
    public CouponBussiness o;

    static {
        t2o.a(912262356);
    }

    public CouponViewHolder(Context context) {
        super(context);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_coupon, (ViewGroup) null);
        this.h = relativeLayout;
        this.k = (TextView) relativeLayout.findViewById(R.id.tvTitle);
        this.i = (TextView) relativeLayout.findViewById(R.id.tvPeriod);
        this.j = (TextView) relativeLayout.findViewById(R.id.tvPrice);
    }

    public static /* synthetic */ Object ipc$super(CouponViewHolder couponViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/CouponViewHolder");
    }

    public static /* synthetic */ void w(CouponViewHolder couponViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d8cc58", new Object[]{couponViewHolder, str});
        } else {
            couponViewHolder.B(str);
        }
    }

    /* renamed from: A */
    public boolean m(mv4 mv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c42180f6", new Object[]{this, mv4Var})).booleanValue();
        }
        if (mv4Var.k == null && this.m == null && mv4Var.l == null) {
            return true;
        }
        return false;
    }

    public final void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Toast.makeText(this.f22590a, str, 0).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!hjh.c()) {
            hjh.d(true);
        } else {
            y();
            List<ux1> list = ((mv4) this.g).j;
            if (list != null && !((ArrayList) list).isEmpty()) {
                qc7.a(this.f22590a, ((mv4) this.g).j);
            }
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128491a3", new Object[]{this});
        } else if (this.n == null) {
            B("领取失败！");
        } else {
            if (this.o == null) {
                this.o = new CouponBussiness(this.f22590a);
            }
            this.o.g(this.n, null, new ApiRequestListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.CouponViewHolder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.ApiRequestListener
                public void onSuccess(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    } else {
                        CouponViewHolder.w(CouponViewHolder.this, "领取成功，尽情购物吧！");
                    }
                }

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.ApiRequestListener
                public void onError(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                    } else if (mtopResponse != null && mtopResponse.isSessionInvalid()) {
                        hjh.d(true);
                    } else if (mtopResponse == null || TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                        CouponViewHolder.w(CouponViewHolder.this, "领取失败！");
                    } else {
                        CouponViewHolder.w(CouponViewHolder.this, mtopResponse.getRetMsg());
                    }
                }
            });
        }
    }

    /* renamed from: z */
    public View j(mv4 mv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("50174902", new Object[]{this, mv4Var});
        }
        return this.h;
    }

    /* renamed from: x */
    public void h(mv4 mv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32779772", new Object[]{this, mv4Var});
            return;
        }
        String str = mv4Var.k;
        String str2 = mv4Var.l;
        this.m = mv4Var.m;
        this.l = mv4Var.n;
        if (!TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(lwm.unit + str);
            spannableString.setSpan(new AbsoluteSizeSpan((int) (this.f22590a.getResources().getDisplayMetrics().density * 18.0f)), 0, 1, 33);
            spannableString.setSpan(new AbsoluteSizeSpan((int) (this.f22590a.getResources().getDisplayMetrics().density * 34.0f)), 1, str.length() + 1, 33);
            spannableString.setSpan(new StyleSpan(1), 1, str.length() + 1, 33);
            this.j.setText(spannableString);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.i.setText(str2);
        }
        if (!TextUtils.isEmpty(this.l) || !TextUtils.isEmpty(this.m)) {
            this.k.setTextSize(1, 10.0f);
            this.k.setText(this.m);
        }
        this.n = mv4Var.o;
        this.h.setOnClickListener(this);
    }
}
