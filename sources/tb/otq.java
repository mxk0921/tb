package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class otq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jl1 f25647a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ StyleModel c;

        public a(jl1 jl1Var, Context context, StyleModel styleModel) {
            this.f25647a = jl1Var;
            this.b = context;
            this.c = styleModel;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/StyleRender$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f25647a.c(this.b, this.c.borderRadius));
            }
        }
    }

    static {
        t2o.a(790626429);
    }

    public static void a(oe8 oe8Var, View view, ComponentBaseModel componentBaseModel, StyleModel styleModel) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb1e136", new Object[]{oe8Var, view, componentBaseModel, styleModel});
            return;
        }
        Context e = oe8Var.j().e();
        jl1 g = oe8Var.g();
        if (styleModel.borderRadius > 0) {
            view.setOutlineProvider(new a(g, e, styleModel));
            view.setClipToOutline(true);
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (!TextUtils.isEmpty(styleModel.background)) {
                gradientDrawable.setColor(Color.parseColor(a1n.h(oe8Var, styleModel.background, false)));
                z2 = true;
            }
            int i = styleModel.borderRadius;
            if (i > 0) {
                gradientDrawable.setCornerRadius(g.c(e, i));
            } else {
                z = z2;
            }
            if (z) {
                view.setBackground(gradientDrawable);
            }
        } catch (IllegalArgumentException e2) {
            wdm.h("PopComponent.initLayoutParams.parseBorderBg.error.id=" + componentBaseModel.id, e2);
            oe8Var.s("RenderFailed.parseBorderBg.id=" + componentBaseModel.id, "");
        }
        if (!TextUtils.isEmpty(styleModel.opacity)) {
            try {
                view.setAlpha(Float.parseFloat(styleModel.opacity));
            } catch (NumberFormatException e3) {
                wdm.h("PopComponent.initLayoutParams.setAlpha.error.id=" + componentBaseModel.id, e3);
                oe8Var.s("RenderFailed.setAlpha.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.translateX)) {
            try {
                view.setTranslationX(g.c(e, Float.parseFloat(styleModel.translateX)));
            } catch (NumberFormatException e4) {
                wdm.h("PopComponent.initLayoutParams.setTranslationX.error.id=" + componentBaseModel.id, e4);
                oe8Var.s("RenderFailed.setTranslationX.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.translateY)) {
            try {
                view.setTranslationY(g.c(e, Float.parseFloat(styleModel.translateY)));
            } catch (NumberFormatException e5) {
                wdm.h("PopComponent.initLayoutParams.setTranslationY.error.id=" + componentBaseModel.id, e5);
                oe8Var.s("RenderFailed.setTranslationY.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.rotateX)) {
            try {
                view.setRotationX(g.c(e, Float.parseFloat(styleModel.rotateX)));
            } catch (NumberFormatException e6) {
                wdm.h("PopComponent.initLayoutParams.setRotationX.error.id=" + componentBaseModel.id, e6);
                oe8Var.s("RenderFailed.setRotationX.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.rotateY)) {
            try {
                view.setRotationY(g.c(e, Float.parseFloat(styleModel.rotateY)));
            } catch (NumberFormatException e7) {
                wdm.h("PopComponent.initLayoutParams.setRotationY.error.id=" + componentBaseModel.id, e7);
                oe8Var.s("RenderFailed.setRotationY.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.rotate)) {
            try {
                view.setRotation(g.c(e, Float.parseFloat(styleModel.rotate)));
            } catch (NumberFormatException e8) {
                wdm.h("PopComponent.initLayoutParams.setRotation.error.id=" + componentBaseModel.id, e8);
                oe8Var.s("RenderFailed.setRotation.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.scaleX)) {
            try {
                view.setScaleX(g.c(e, Float.parseFloat(styleModel.scaleX)));
            } catch (NumberFormatException e9) {
                wdm.h("PopComponent.initLayoutParams.setScaleX.error.id=" + componentBaseModel.id, e9);
                oe8Var.s("RenderFailed.setScaleX.id=" + componentBaseModel.id, "");
            }
        }
        if (!TextUtils.isEmpty(styleModel.scaleY)) {
            try {
                view.setScaleY(g.c(e, Float.parseFloat(styleModel.scaleY)));
            } catch (NumberFormatException e10) {
                wdm.h("PopComponent.initLayoutParams.setScaleY.error.id=" + componentBaseModel.id, e10);
                oe8Var.s("RenderFailed.setScaleY.id=" + componentBaseModel.id, "");
            }
        }
    }
}
