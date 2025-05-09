package com.taobao.mytaobao.biztool;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.ckf;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/biztool/MyToolViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MyToolViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TUrlImageView f11204a;
    public final TUrlImageView b;
    public JSONObject c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public a(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (MyToolViewHolder.this.c0()) {
                this.b.onClick(view);
            }
        }
    }

    static {
        t2o.a(745537670);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyToolViewHolder(View view, int i, int i2, int i3) {
        super(view);
        ckf.h(view, "view");
        View findViewById = this.itemView.findViewById(R.id.ivBg);
        if (findViewById != null) {
            TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
            this.f11204a = tUrlImageView;
            View findViewById2 = this.itemView.findViewById(R.id.ivAction);
            if (findViewById2 != null) {
                TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById2;
                this.b = tUrlImageView2;
                View view2 = this.itemView;
                ckf.c(view2, "itemView");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.width = i2;
                layoutParams.height = i3;
                View view3 = this.itemView;
                ckf.c(view3, "itemView");
                view3.setLayoutParams(layoutParams);
                if (i == 0) {
                    tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN015PRwuk1RRVsWPLHYC_!!6000000002108-2-tps-54-54.png");
                } else {
                    tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01rWQC74297foYwhurq_!!6000000008021-2-tps-54-54.png");
                }
                ViewGroup.LayoutParams layoutParams2 = tUrlImageView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int c = pb6.c(Globals.getApplication(), 3.0f);
                    int c2 = pb6.c(Globals.getApplication(), 6.0f);
                    marginLayoutParams.setMargins(c, 0, c, c2);
                    tUrlImageView.setLayoutParams(marginLayoutParams);
                    ViewGroup.LayoutParams layoutParams3 = tUrlImageView2.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams2.setMargins(0, c2, pb6.c(Globals.getApplication(), 9.0f), 0);
                        tUrlImageView2.setLayoutParams(marginLayoutParams2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
    }

    public static /* synthetic */ Object ipc$super(MyToolViewHolder myToolViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/biztool/MyToolViewHolder");
    }

    public final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97a72ff", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.c;
        return ckf.b(jSONObject != null ? jSONObject.getString("canRemove") : null, "true");
    }

    public final void b0(JSONObject jSONObject, View.OnClickListener onClickListener) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6df42d7", new Object[]{this, jSONObject, onClickListener});
            return;
        }
        ckf.h(jSONObject, "data");
        ckf.h(onClickListener, "delClickListener");
        this.c = jSONObject;
        String string = jSONObject.getString("pic");
        if (string != null) {
            this.f11204a.setImageUrl(string);
        }
        this.b.setOnClickListener(new a(onClickListener));
        TUrlImageView tUrlImageView = this.b;
        if (!c0()) {
            i = 8;
        }
        tUrlImageView.setVisibility(i);
    }
}
