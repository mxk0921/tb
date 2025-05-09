package com.taobao.android.weex_uikit.widget.slide.effect;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScaleEffect implements ViewPager.PageTransformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f10027a;

    static {
        t2o.a(986710250);
    }

    public ScaleEffect(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f10027a = 1.0f;
            return;
        }
        try {
            this.f10027a = Float.parseFloat(jSONObject.getString("scale"));
        } catch (Exception e) {
            dwh.i(e);
        }
        a();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdaa3ca9", new Object[]{this});
        } else if (this.f10027a < 0.0f) {
            throw new IllegalArgumentException("scale must be positive");
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
            return;
        }
        float f2 = this.f10027a;
        float f3 = 1.0f - f2;
        if (f < -1.0f) {
            view.setScaleX(f2);
            view.setScaleY(this.f10027a);
        } else if (f <= 0.0f) {
            float f4 = (f * f3) + 1.0f;
            view.setScaleX(f4);
            view.setScaleY(f4);
        } else if (f <= 1.0f) {
            float f5 = 1.0f - (f * f3);
            view.setScaleX(f5);
            view.setScaleY(f5);
        } else {
            view.setScaleX(f2);
            view.setScaleY(this.f10027a);
        }
    }
}
