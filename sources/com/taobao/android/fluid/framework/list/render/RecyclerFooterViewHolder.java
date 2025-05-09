package com.taobao.android.fluid.framework.list.render;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.taobao.R;
import tb.igs;
import tb.ir9;
import tb.pr9;
import tb.t2o;
import tb.uq9;
import tb.wq9;
import tb.xau;
import tb.yre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class RecyclerFooterViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7860a;
    public uq9 b;
    public long c;
    public int d;
    public int e;
    public String f;
    public boolean g = false;
    public int h = -1;

    static {
        t2o.a(468714482);
    }

    public RecyclerFooterViewHolder(FluidContext fluidContext, View view) {
        super(view);
        view.setTag(R.id.fluid_sdk_footer_loading, Boolean.TRUE);
        this.f7860a = fluidContext;
        ImageView imageView = new ImageView(view.getContext());
        int c = pr9.c(view.getContext(), 30);
        int c2 = pr9.c(view.getContext(), 15);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c, c, 17);
        layoutParams.topMargin = c2;
        layoutParams.bottomMargin = c2;
        imageView.setLayoutParams(layoutParams);
        FluidSDK.getImageAdapter().load("https://img.alicdn.com/imgextra/i3/O1CN01YTVEsl1h0WJG5PebB_!!6000000004215-54-tps-117-117.apng", imageView);
        ((ViewGroup) view).addView(imageView);
        ir9.b("RecyclerFooterViewHolder", "RecyclerFooterViewHolder init");
    }

    public static /* synthetic */ Object ipc$super(RecyclerFooterViewHolder recyclerFooterViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/RecyclerFooterViewHolder");
    }

    public uq9 b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("7cfdbcdb", new Object[]{this});
        }
        return this.b;
    }

    public boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be9b0b41", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void f0(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363174fe", new Object[]{this, new Integer(i2), str});
            return;
        }
        this.e = i2;
        this.f = str;
    }

    public void g0(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3141c7d1", new Object[]{this, uq9Var});
        } else {
            this.b = uq9Var;
        }
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        igs.a("LoadingviewOnShow");
        this.g = true;
        this.h = getAdapterPosition();
        ir9.b("RecyclerFooterViewHolder", "onShow Position = " + this.h + " opacityCard=" + this.b);
        uq9 uq9Var = this.b;
        if (uq9Var != null) {
            wq9.d(uq9Var);
        } else {
            yre.c(this.f7860a, "1", null, "0", null, null);
        }
        this.c = SystemClock.elapsedRealtime();
        this.d = getAdapterPosition();
        this.e = i;
        igs.c();
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        this.g = false;
        ir9.b("RecyclerFooterViewHolder", "onHide Position=" + this.h);
        xau.M(this.d - 1, this.e, SystemClock.elapsedRealtime() - this.c, this.f);
    }
}
