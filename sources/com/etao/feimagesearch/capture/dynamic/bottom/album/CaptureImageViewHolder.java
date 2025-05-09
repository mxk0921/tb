package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.d22;
import tb.nhi;
import tb.pei;
import tb.t2o;
import tb.uu6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CaptureImageViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TUrlImageView f4650a;
    public TextView b;
    public pei c;
    public final nhi d;
    public TUrlImageView e;
    public View f;
    public final boolean g;

    static {
        t2o.a(481296574);
    }

    public CaptureImageViewHolder(Context context, int i, boolean z, d22 d22Var, View view) {
        super(view);
        this.g = z;
        int k0 = CaptureAlbumView.k0(context, i);
        this.itemView.getLayoutParams().width = k0;
        this.itemView.getLayoutParams().height = k0;
        this.d = new nhi(d22Var);
        d0();
        this.f4650a.setPlaceHoldImageResId(R.color.feis_image_placeholder);
    }

    public static /* synthetic */ Object ipc$super(CaptureImageViewHolder captureImageViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureImageViewHolder");
    }

    public final void d0() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        this.f4650a = (TUrlImageView) this.itemView.findViewById(R.id.iv_image);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_duration);
        this.b = textView;
        if (this.g) {
            f = 13.0f;
        } else {
            f = 10.0f;
        }
        textView.setTextSize(1, f);
        this.f = this.itemView.findViewById(R.id.ll_auth_more_hint);
        this.e = (TUrlImageView) this.itemView.findViewById(R.id.iv_add_hint);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_add_hint);
        if (this.g) {
            f2 = 15.0f;
        } else {
            f2 = 12.0f;
        }
        textView2.setTextSize(1, f2);
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41374de6", new Object[]{this});
            return;
        }
        this.c = null;
        this.itemView.setBackgroundColor(Color.parseColor("#1F1F1F"));
        this.f4650a.setVisibility(8);
        this.b.setVisibility(8);
        this.f.setVisibility(0);
        this.e.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01QUbazh1IHagZinAox_!!6000000000868-49-tps-120-120.webp");
        this.itemView.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18922) + "，" + Localization.q(R.string.taobao_app_1007_button));
    }

    public void c0(pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed855e", new Object[]{this, peiVar});
            return;
        }
        this.f.setVisibility(8);
        if (peiVar != null && this.c != peiVar) {
            this.f4650a.setVisibility(0);
            this.f4650a.setImageBitmap(null);
            this.c = peiVar;
            this.d.a(peiVar, this.f4650a);
            if (peiVar.p()) {
                this.b.setText(peiVar.d());
                this.b.setVisibility(0);
            } else {
                this.b.setVisibility(8);
            }
            StringBuilder sb = new StringBuilder();
            if (peiVar.p()) {
                sb.append(Localization.q(R.string.taobao_app_1007_item_video));
                sb.append("，");
            } else {
                sb.append(Localization.q(R.string.taobao_app_1007_item_image));
                sb.append("，");
            }
            String c = uu6.c(uu6.INSTANCE.b(), Long.valueOf(peiVar.c()));
            if (TextUtils.isEmpty(c)) {
                sb.append(Localization.q(R.string.taobao_app_1007_unknown_time));
            } else {
                sb.append(c);
            }
            sb.append("，");
            sb.append(Localization.q(R.string.taobao_app_1007_append_take_pic));
            this.itemView.setContentDescription(sb.toString());
        }
    }
}
