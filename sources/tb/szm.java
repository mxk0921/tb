package tb;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.UserModel;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import tb.at4;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class szm extends qr1<UserModel, FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public ImageView c;
    public TUrlImageView d;
    public TextView e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            szm.n(szm.this);
            szm.m(szm.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        static {
            t2o.a(916455678);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455677);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szm(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(szm szmVar, String str, Object... objArr) {
        if (str.hashCode() == -41557118) {
            super.l(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/ProfileButtonComponent");
    }

    public static final /* synthetic */ void m(szm szmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e716adcf", new Object[]{szmVar});
        } else {
            szmVar.p();
        }
    }

    public static final /* synthetic */ void n(szm szmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d5b84c", new Object[]{szmVar});
        } else {
            szmVar.u();
        }
    }

    @Override // tb.qr1
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd85e382", new Object[]{this, new Integer(i)});
            return;
        }
        super.l(i);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final Map<String, Object> o() {
        String str;
        UserModel.AvatarIcon avatarIcon;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebf7080e", new Object[]{this});
        }
        UserModel data = getData();
        String lightType = (data == null || (avatarIcon = data.getAvatarIcon()) == null) ? null : avatarIcon.getLightType();
        if (ckf.b(lightType, UserModel.AvatarIcon.LIGHT_TYPE_RED_POINT) || ckf.b(lightType, "text")) {
            str = "redpoint";
        } else {
            str = "default";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        return v3i.f(jpu.a("utLogMap", jSONObject));
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79264c7", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "ProfileButtonComponent", "处理点击", null, 4, null);
        ((c1c) k().getService(c1c.class)).V(DrawerModel.DrawerGravity.LEFT);
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc1681", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedb9d35", new Object[]{this});
            return;
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5460e626", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView == null) {
            tUrlImageView = new TUrlImageView(getContext());
            at4.a aVar = at4.Companion;
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(aVar.d(getContext(), 8, true), aVar.d(getContext(), 8, true), GravityCompat.END));
            tUrlImageView.setImageUrl("https://img.alicdn.com/tfs/TB1oyqFUBr0gK0jSZFnXXbRRXXa-27-27.png");
            FrameLayout frameLayout = (FrameLayout) getView();
            if (frameLayout != null) {
                frameLayout.addView(tUrlImageView);
            }
            this.d = tUrlImageView;
        }
        tUrlImageView.setVisibility(0);
    }

    public final void t(UserModel userModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2642ab", new Object[]{this, userModel});
            return;
        }
        TextView textView = this.e;
        String str = null;
        if (textView == null) {
            textView = new TextView(getContext());
            at4.a aVar = at4.Companion;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, at4.a.c(aVar, getContext(), 32, false, 4, null), GravityCompat.END);
            layoutParams.topMargin = at4.a.c(aVar, getContext(), -16, false, 4, null);
            layoutParams.setMarginEnd(at4.a.c(aVar, getContext(), -16, false, 4, null));
            textView.setLayoutParams(layoutParams);
            textView.setMinWidth(at4.a.c(aVar, getContext(), 32, false, 4, null));
            textView.setMaxWidth(at4.a.c(aVar, getContext(), 64, false, 4, null));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#ff5000"));
            gradientDrawable.setCornerRadius(at4.a.c(aVar, getContext(), 16, false, 4, null));
            gradientDrawable.setStroke(at4.a.c(aVar, getContext(), 1, false, 4, null), Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
            textView.setBackground(gradientDrawable);
            textView.setTextSize(0, at4.a.c(aVar, getContext(), 18, false, 4, null));
            textView.setTextColor(-1);
            textView.setTypeface(null, 1);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            textView.setPadding(at4.a.c(aVar, getContext(), 6, false, 4, null), 0, at4.a.c(aVar, getContext(), 6, false, 4, null), 0);
            FrameLayout frameLayout = (FrameLayout) getView();
            if (frameLayout != null) {
                frameLayout.addView(textView);
            }
            this.e = textView;
        }
        UserModel.AvatarIcon avatarIcon = userModel.getAvatarIcon();
        if (avatarIcon != null) {
            str = avatarIcon.getLightValue();
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ab904", new Object[]{this});
        } else {
            ((f2e) k().getService(f2e.class)).q("Mypage", o(), "topbar.1");
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd09d2f9", new Object[]{this});
        } else {
            ((f2e) k().getService(f2e.class)).D0("Mypage", o(), "topbar.1");
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a802518", new Object[]{this});
        } else {
            ((f2e) k().getService(f2e.class)).D0("Messagenotice", null, "topbar.1");
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e85ca3f", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView == null || tUrlImageView.getVisibility() != 0) {
            w();
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3fcde5", new Object[]{this});
            return;
        }
        TextView textView = this.e;
        if (textView == null || textView.getVisibility() != 0) {
            w();
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setContentDescription("个人主页，按钮");
        frameLayout.setOnClickListener(new a());
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setImageResource(R.drawable.top_bar_profile_icon);
        frameLayout.addView(imageView);
        this.c = imageView;
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateDataImpl(com.taobao.android.turbo.model.UserModel r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.szm.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "6e43c115"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            java.lang.String r1 = "data"
            tb.ckf.g(r6, r1)
            com.taobao.android.turbo.model.UserModel$AvatarIcon r1 = r6.getAvatarIcon()
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r1.getLightType()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 != 0) goto L_0x0029
            goto L_0x005e
        L_0x0029:
            int r2 = r1.hashCode()
            r3 = -799318145(0xffffffffd05b5f7f, float:-1.47218749E10)
            if (r2 == r3) goto L_0x004b
            r3 = 3556653(0x36452d, float:4.983932E-39)
            if (r2 == r3) goto L_0x0038
            goto L_0x005e
        L_0x0038:
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005e
            r5.y()
            r5.t(r6)
            r5.q()
            goto L_0x0064
        L_0x004b:
            java.lang.String r6 = "redPoint"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x005e
            r5.x()
            r5.s()
            r5.r()
            goto L_0x0064
        L_0x005e:
            r5.q()
            r5.r()
        L_0x0064:
            boolean r6 = r5.f
            if (r6 != 0) goto L_0x006d
            r5.v()
            r5.f = r0
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.szm.updateDataImpl(com.taobao.android.turbo.model.UserModel):void");
    }
}
