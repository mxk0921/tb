package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class fx1<BEAN> extends phw<BEAN, RelativeLayout, b64> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f19592a;
    public int b;
    public int c;
    public ViewGroup d;

    static {
        t2o.a(815793612);
    }

    public fx1(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        ensureView();
    }

    public static /* synthetic */ Object ipc$super(fx1 fx1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/layer/longpress/BaseLongPressLayerWidget");
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.f19592a.setContentDescription(Localization.q(R.string.taobao_app_1005_1_22844));
        this.f19592a.setOnClickListener(this);
        this.b = DensityUtil.dip2px(getActivity(), 60.0f);
        this.c = DensityUtil.dip2px(getActivity(), 21.0f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.f19592a) {
            w2();
        }
    }

    public void q2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de8ccf6", new Object[]{this, viewGroup});
        } else if (viewGroup != null) {
            viewGroup.addView(this.f19592a, new RelativeLayout.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            this.d = viewGroup;
        }
    }

    public void s2(TextView textView, boolean z, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e7c931", new Object[]{this, textView, new Boolean(z), str, str2, str3, str4});
        } else if (z) {
            textView.setTextColor(srl.c(str2, Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR)));
            textView.setText(str);
            textView.setContentDescription(str);
        } else {
            textView.setTextColor(srl.c(str4, Color.parseColor("#99ffffff")));
            textView.setText(str3);
            textView.setContentDescription(str3);
        }
    }

    public TextView t2(String str, int i, int i2, int i3, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("3e3782c3", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), onClickListener});
        }
        TextView textView = new TextView(getActivity());
        textView.setText(str);
        textView.setTextColor(i3);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setContentDescription(str);
        this.f19592a.addView(textView);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        int i4 = this.b;
        layoutParams.height = i4;
        layoutParams.width = i4;
        textView.setBackgroundResource(R.drawable.tbsearch_longpress_layer_round_button_bg);
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
        gradientDrawable.mutate();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{i, i2});
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    /* renamed from: u2 */
    public RelativeLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("f5824c57", new Object[]{this});
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_longpress_layer_layout, (ViewGroup) null, false);
        this.f19592a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ude parent = getRoot().getParent();
        if ((parent instanceof vyd) && ((vyd) parent).Q()) {
            this.f19592a.setBackgroundResource(R.drawable.tbsearch_inshop_longpress_2021_bg);
        }
        return this.f19592a;
    }

    public void v2(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d01b8bd", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (!z && i >= 4) {
            ArrayList arrayList = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList.add(this.f19592a.getChildAt(i2));
            }
            this.f19592a.removeAllViews();
            for (int i3 = 0; i3 < 2; i3++) {
                LinearLayout linearLayout = new LinearLayout(getActivity());
                this.f19592a.addView(linearLayout);
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setOrientation(0);
                int i4 = i3 * 2;
                View view = (View) arrayList.get(i4 + 1);
                linearLayout.addView((View) arrayList.get(i4));
                linearLayout.addView(view);
                ((LinearLayout.LayoutParams) view.getLayoutParams()).setMargins(this.c, 0, 0, 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public void w2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a94c534", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != 0) {
            viewGroup.removeView(getView());
            ((RelativeLayout) getView()).removeAllViews();
        }
    }

    public void x2() {
        String str;
        fx1<BEAN> fx1Var = this;
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767e9adb", new Object[]{fx1Var});
            return;
        }
        boolean z = fx1Var.d.getWidth() > fx1Var.d.getHeight();
        fx1Var.v2(z, fx1Var.f19592a.getChildCount());
        int childCount = fx1Var.f19592a.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(fx1Var.f19592a, fx1Var.d.getWidth() / 2, fx1Var.d.getHeight() / 2, 0.0f, Math.max(fx1Var.d.getHeight(), fx1Var.d.getWidth()));
        createCircularReveal.setDuration(300L);
        arrayList.add(createCircularReveal);
        if (z) {
            str = "translationX";
        } else {
            str = "translationY";
        }
        boolean z2 = childCount % 2 == 0;
        int i = fx1Var.c + fx1Var.b;
        int round = Math.round(childCount / 2);
        if (z2) {
            round--;
        }
        int i2 = z2 ? (-i) / 2 : 0;
        int i3 = 0;
        while (i3 < childCount) {
            if (i3 == round) {
                i2 = z2 ? (-i) / 2 : 0;
            } else {
                i2 = i3 > round ? i2 + i : i2 - i;
            }
            View childAt = fx1Var.f19592a.getChildAt(i3);
            float[] fArr = new float[2];
            fArr[c] = 0.0f;
            fArr[1] = i2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, str, fArr);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new OvershootInterpolator());
            arrayList.add(ofFloat);
            i3++;
            fx1Var = this;
            c = 0;
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }
}
