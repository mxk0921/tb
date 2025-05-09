package com.taobao.android.detail.ttdetail.floatview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.Iterator;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.d1i;
import tb.eo7;
import tb.hzh;
import tb.mwy;
import tb.nb4;
import tb.oa4;
import tb.pb6;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0363a Companion = new C0363a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6783a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.floatview.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class C0363a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261780);
        }

        public C0363a() {
        }

        public final List<oa4<nb4>> a(ze7 ze7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("7a9d7514", new Object[]{this, ze7Var});
            }
            ckf.h(ze7Var, "detailContext");
            d1i d1iVar = (d1i) ze7Var.e().e(hzh.PARSER_ID);
            if (d1iVar == null) {
                return null;
            }
            List<oa4<nb4>> g = DataUtils.g(d1iVar.t(), ze7Var.d());
            List<oa4<nb4>> list = g;
            if (list == null || list.isEmpty()) {
                return null;
            }
            return g;
        }

        public /* synthetic */ C0363a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261779);
    }

    public a(ze7 ze7Var) {
        ckf.h(ze7Var, "mDetailContext");
        this.f6783a = ze7Var;
    }

    public final void a(FrameLayout frameLayout, List<? extends oa4<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1aa341", new Object[]{this, frameLayout, list});
            return;
        }
        ckf.h(frameLayout, "ttFloatList");
        ckf.h(list, "mainList");
        Iterator<? extends oa4<?>> it = list.iterator();
        while (it.hasNext()) {
            oa4 oa4Var = (oa4) it.next();
            if (!(oa4Var instanceof mwy)) {
                oa4Var.create();
                View componentView = oa4Var.getComponentView(null);
                nb4 componentData = oa4Var.getComponentData();
                ckf.c(componentData, "component.componentData");
                JSONObject jSONObject = componentData.f().getJSONObject(MspEventTypes.ACTION_INVOKE_LOC);
                ckf.c(componentView, "componentView");
                b(frameLayout, componentView, jSONObject);
                oa4Var.willAppear();
                oa4Var.didAppear();
            }
        }
    }

    public final void b(FrameLayout frameLayout, View view, JSONObject jSONObject) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7f73e", new Object[]{this, frameLayout, view, jSONObject});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (jSONObject == null) {
            layoutParams.gravity = 85;
            frameLayout.addView(view, layoutParams);
            return;
        }
        String string = jSONObject.getString("top");
        String string2 = jSONObject.getString("bottom");
        String string3 = jSONObject.getString("left");
        String string4 = jSONObject.getString("right");
        if (!TextUtils.isEmpty(string)) {
            eo7 g = this.f6783a.g();
            ckf.c(g, "mDetailContext.dinamicXEngine");
            DinamicXEngine o = g.o();
            Context c = this.f6783a.c();
            ckf.c(string, "top");
            i = pb6.d(o, c, Float.parseFloat(string));
        } else {
            i = 0;
        }
        layoutParams.topMargin = i;
        if (!TextUtils.isEmpty(string2)) {
            eo7 g2 = this.f6783a.g();
            ckf.c(g2, "mDetailContext.dinamicXEngine");
            DinamicXEngine o2 = g2.o();
            Context c2 = this.f6783a.c();
            ckf.c(string2, "bottom");
            i2 = pb6.d(o2, c2, Float.parseFloat(string2));
        } else {
            i2 = 0;
        }
        layoutParams.bottomMargin = i2;
        if (!TextUtils.isEmpty(string3)) {
            eo7 g3 = this.f6783a.g();
            ckf.c(g3, "mDetailContext.dinamicXEngine");
            DinamicXEngine o3 = g3.o();
            Context c3 = this.f6783a.c();
            ckf.c(string3, "left");
            i3 = pb6.d(o3, c3, Float.parseFloat(string3));
        } else {
            i3 = 0;
        }
        layoutParams.leftMargin = i3;
        if (!TextUtils.isEmpty(string4)) {
            eo7 g4 = this.f6783a.g();
            ckf.c(g4, "mDetailContext.dinamicXEngine");
            DinamicXEngine o4 = g4.o();
            Context c4 = this.f6783a.c();
            ckf.c(string4, "right");
            i4 = pb6.d(o4, c4, Float.parseFloat(string4));
        }
        layoutParams.rightMargin = i4;
        if (TextUtils.isEmpty(string4) || TextUtils.isEmpty(string2)) {
            if (!TextUtils.isEmpty(string4)) {
                layoutParams.gravity = GravityCompat.END;
            }
            if (!TextUtils.isEmpty(string2)) {
                layoutParams.gravity = 80;
            }
        } else {
            layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        }
        frameLayout.addView(view, layoutParams);
    }
}
