package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.revisitedu.data.RevisitEduDialogModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import org.ifaa.android.manager.face.IFAAFaceManager;
import tb.at4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cvy extends yey<RevisitEduDialogModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963106);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Context context, RevisitEduDialogModel revisitEduDialogModel) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                cvy.a(cvy.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(Context context) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                cvy.a(cvy.this);
            }
        }
    }

    static {
        t2o.a(689963105);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvy(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ void a(cvy cvyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ba81", new Object[]{cvyVar});
        } else {
            cvyVar.c();
        }
    }

    public static /* synthetic */ Object ipc$super(cvy cvyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode == -893949262) {
            super.onDismiss();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/component/revisitedu/view/RevisitEduDialogPop");
        }
    }

    /* renamed from: b */
    public View onCreateView(Context context, RevisitEduDialogModel revisitEduDialogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3737a41c", new Object[]{this, context, revisitEduDialogModel});
        }
        ckf.g(context, "context");
        ckf.g(revisitEduDialogModel, "data");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(Color.parseColor("#B3000000"));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(s6o.S(context, 590), s6o.S(context, 680)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        at4.a aVar = at4.Companion;
        gradientDrawable.setCornerRadius(at4.a.c(aVar, context, 12, false, 4, null));
        xhv xhvVar = xhv.INSTANCE;
        linearLayout2.setBackground(gradientDrawable);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout.addView(linearLayout2);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = s6o.S(context, 44);
        textView.setLayoutParams(layoutParams);
        textView.setText(revisitEduDialogModel.getRevisitEduDialogPopViewModel().c().a().a());
        textView.setTextSize(0, s6o.S(context, 34));
        textView.setTextColor(Color.parseColor("#11192D"));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        linearLayout2.addView(textView);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(s6o.S(context, 450), s6o.S(context, IFAAFaceManager.STATUS_FACE_OFFSET_LEFT));
        layoutParams2.topMargin = s6o.S(context, 30);
        tUrlImageView.setLayoutParams(layoutParams2);
        tUrlImageView.setImageUrl(revisitEduDialogModel.getRevisitEduDialogPopViewModel().b().a().a());
        linearLayout2.addView(tUrlImageView);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(s6o.S(context, TypedValues.PositionType.TYPE_POSITION_TYPE), s6o.S(context, 80));
        layoutParams3.topMargin = s6o.S(context, 32);
        textView2.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#FF6200"));
        gradientDrawable2.setCornerRadius(at4.a.c(aVar, context, 12, false, 4, null));
        textView2.setBackground(gradientDrawable2);
        textView2.setText(revisitEduDialogModel.getRevisitEduDialogPopViewModel().a().a().a());
        textView2.setTextSize(0, s6o.S(context, 30));
        textView2.setTextColor(-1);
        textView2.setTypeface(typeface);
        textView2.setGravity(17);
        textView2.setOnClickListener(new b(context, revisitEduDialogModel));
        linearLayout2.addView(textView2);
        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(s6o.S(context, 72), s6o.S(context, 72));
        layoutParams4.topMargin = s6o.S(context, 48);
        tUrlImageView2.setLayoutParams(layoutParams4);
        tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01Wos2P21kJhu10LkA2_!!6000000004663-2-tps-144-144.png");
        tUrlImageView2.setOnClickListener(new c(context));
        linearLayout.addView(tUrlImageView2);
        return linearLayout;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ee394b", new Object[]{this});
            return;
        }
        t0j.d("RevisitEduPopViewClick", null);
        d();
        dismiss();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3410455f", new Object[]{this});
            return;
        }
        vgh.c(this, "RevisitEduDialogPop", "View点击埋点");
        cbu.b("Button-ChannelBackGuide", null);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6400fb", new Object[]{this});
            return;
        }
        vgh.c(this, "RevisitEduDialogPop", "View曝光埋点");
        cbu.d("Page_VideoCash_Show-ChannelBackGuide", null);
    }

    @Override // tb.yey
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        getDismissCallback().invoke(kotlin.collections.a.h());
    }

    @Override // tb.yey
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        t0j.d("RevisitEduPopViewExpose", null);
        e();
    }
}
