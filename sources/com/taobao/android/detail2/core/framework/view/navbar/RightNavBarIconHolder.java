package com.taobao.android.detail2.core.framework.view.navbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.cxj;
import tb.dh7;
import tb.seo;
import tb.t2o;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class RightNavBarIconHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cxj f7194a;
    public final dh7 b;
    public seo c;

    static {
        t2o.a(352322095);
    }

    public RightNavBarIconHolder(View view, dh7 dh7Var, cxj cxjVar) {
        super(view);
        this.b = dh7Var;
        this.f7194a = cxjVar;
    }

    public static View b0(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4c35412a", new Object[]{context, viewGroup});
        }
        return LayoutInflater.from(context).inflate(R.layout.detail_nav_item_layout_new, viewGroup, false);
    }

    public static /* synthetic */ Object ipc$super(RightNavBarIconHolder rightNavBarIconHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarIconHolder");
    }

    public abstract void c0(seo seoVar);

    public void d0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1aa06b", new Object[]{this, seoVar});
        } else if (seoVar != null) {
            this.c = seoVar;
            c0(seoVar);
        }
    }

    public void e0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f811e34", new Object[]{this, seoVar});
        } else if (seoVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MspWebActivity.BTN_TYPE, (Object) seoVar.d());
            jSONObject.put("bizType", (Object) seoVar.c());
            x3w b = seoVar.b();
            if (b != null) {
                jSONObject.put("nid", (Object) b.h);
            }
            this.b.M0("onUserNavBarClick", jSONObject);
        }
    }
}
