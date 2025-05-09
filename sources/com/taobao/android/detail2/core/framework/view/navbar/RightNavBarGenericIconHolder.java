package com.taobao.android.detail2.core.framework.view.navbar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.cxj;
import tb.dh7;
import tb.iy4;
import tb.seo;
import tb.t2o;
import tb.txj;
import tb.vp0;
import tb.xp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class RightNavBarGenericIconHolder extends RightNavBarIconHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TIconFontTextView d;
    public final AliUrlImageView e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements xp0<vp0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ seo f7192a;

        public a(seo seoVar) {
            this.f7192a = seoVar;
        }

        /* renamed from: b */
        public boolean a(vp0 vp0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("432ffc2f", new Object[]{this, vp0Var})).booleanValue();
            }
            RightNavBarGenericIconHolder.this.h0(this.f7192a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public abstract class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322094);
        }

        public b() {
        }

        public abstract void a(View view);

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a(view);
            RightNavBarGenericIconHolder rightNavBarGenericIconHolder = RightNavBarGenericIconHolder.this;
            seo seoVar = rightNavBarGenericIconHolder.c;
            if (seoVar != null) {
                rightNavBarGenericIconHolder.e0(seoVar);
            }
        }
    }

    static {
        t2o.a(352322092);
    }

    public RightNavBarGenericIconHolder(View view, dh7 dh7Var, cxj cxjVar) {
        super(view, dh7Var, cxjVar);
        TIconFontTextView tIconFontTextView = (TIconFontTextView) view.findViewById(R.id.nav_icon);
        this.d = tIconFontTextView;
        tIconFontTextView.setVisibility(0);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.nav_icon_image);
        this.e = aliUrlImageView;
        aliUrlImageView.setVisibility(8);
        b g0 = g0();
        tIconFontTextView.setOnClickListener(g0);
        aliUrlImageView.setOnClickListener(g0);
    }

    public static View f0(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f220daae", new Object[]{context, viewGroup});
        }
        if (context == null || viewGroup == null) {
            return null;
        }
        return RightNavBarIconHolder.b0(context, viewGroup);
    }

    public static /* synthetic */ Object ipc$super(RightNavBarGenericIconHolder rightNavBarGenericIconHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarGenericIconHolder");
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarIconHolder
    public void c0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1c4ea", new Object[]{this, seoVar});
        } else if (TextUtils.isEmpty(seoVar.i())) {
            h0(seoVar);
        } else {
            i0(seoVar);
        }
    }

    public abstract b g0();

    public void h0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3f65af", new Object[]{this, seoVar});
            return;
        }
        txj.e(txj.TAG_RENDER, "显示iconfont类型的通用按钮，按钮类型" + seoVar.d() + "，按钮iconfont" + seoVar.h());
        this.d.setText(seoVar.h());
        this.d.setTextColor(seoVar.g());
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }

    public final void i0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271b6c9f", new Object[]{this, seoVar});
            return;
        }
        txj.e(txj.TAG_RENDER, "显示url类型的通用按钮，按钮类型" + seoVar.d() + "，按钮url" + seoVar.i());
        PhenixOptions phenixOptions = new PhenixOptions();
        phenixOptions.bitmapProcessors(new iy4());
        this.e.setImageUrl(seoVar.i(), phenixOptions);
        this.e.failListener(new a(seoVar));
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }
}
