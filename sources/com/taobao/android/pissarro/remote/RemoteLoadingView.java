package com.taobao.android.pissarro.remote;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.bc7;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteLoadingView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LottieAnimationView mAnimationView;
    private LinearLayout mContentLayout;
    private TextView mProgressTv;

    static {
        t2o.a(623902789);
    }

    public RemoteLoadingView(Context context, TaopaiLoadConfig taopaiLoadConfig, View.OnClickListener onClickListener) {
        super(context);
        initView(taopaiLoadConfig);
    }

    private void addContentParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29b2e9", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mContentLayout = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.mContentLayout, layoutParams);
    }

    private void addLoadingAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d34e893", new Object[]{this});
            return;
        }
        CirclePointLoadingView circlePointLoadingView = new CirclePointLoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.mContentLayout.addView(circlePointLoadingView, layoutParams);
        circlePointLoadingView.startAnim();
    }

    private void addLogo(TaopaiLoadConfig taopaiLoadConfig) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543083fc", new Object[]{this, taopaiLoadConfig});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bc7.a(getContext(), 114.0f), bc7.a(getContext(), 114.0f));
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = bc7.a(getContext(), 24.0f);
        this.mContentLayout.addView(frameLayout, layoutParams);
        View view = new View(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{Color.parseColor("#FF5900"), Color.parseColor("#FF8002")});
        view.setBackgroundDrawable(gradientDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(bc7.a(getContext(), 62.0f), bc7.a(getContext(), 62.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(view, layoutParams2);
        this.mAnimationView = new LottieAnimationView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        frameLayout.addView(this.mAnimationView, layoutParams3);
        this.mAnimationView.setAnimation(R.raw.taopai_loading_logo_anim);
        this.mAnimationView.loop(true);
        this.mAnimationView.playAnimation();
        ImageView imageView = new ImageView(getContext());
        if (taopaiLoadConfig == null || taopaiLoadConfig.getLogoResId() == 0) {
            i = R.drawable.taopai_logo;
        } else {
            i = taopaiLoadConfig.getLogoResId();
        }
        imageView.setImageResource(i);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(bc7.a(getContext(), 30.0f), bc7.a(getContext(), 27.0f));
        layoutParams4.gravity = 17;
        frameLayout.addView(imageView, layoutParams4);
    }

    private void addProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6734b75", new Object[]{this});
            return;
        }
        TextView textView = new TextView(getContext());
        this.mProgressTv = textView;
        textView.setTextColor(Color.parseColor("#999999"));
        this.mProgressTv.setTextSize(16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = bc7.a(getContext(), 12.0f);
        this.mContentLayout.addView(this.mProgressTv, layoutParams);
        TextView textView2 = this.mProgressTv;
        textView2.setText(getContext().getString(R.string.pissarro_try_loading) + " 0%");
    }

    private void addTitle(TaopaiLoadConfig taopaiLoadConfig) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a94e11", new Object[]{this, taopaiLoadConfig});
        } else if (taopaiLoadConfig == null || taopaiLoadConfig.isTitleEnable()) {
            TextView textView = new TextView(getContext());
            textView.setTextColor(Color.parseColor("#111111"));
            textView.setTextSize(21.0f);
            if (taopaiLoadConfig == null || TextUtils.isEmpty(taopaiLoadConfig.getTitle())) {
                str = getContext().getString(R.string.pissarro_taopai);
            } else {
                str = taopaiLoadConfig.getTitle();
            }
            textView.setText(str);
            textView.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            layoutParams.bottomMargin = bc7.a(getContext(), 12.0f);
            this.mContentLayout.addView(textView, layoutParams);
        }
    }

    private void initView(TaopaiLoadConfig taopaiLoadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d91e33", new Object[]{this, taopaiLoadConfig});
            return;
        }
        setBackgroundColor(-1);
        addContentParent();
        addLogo(taopaiLoadConfig);
        addTitle(taopaiLoadConfig);
        addProgress();
        addLoadingAnim();
    }

    public static /* synthetic */ Object ipc$super(RemoteLoadingView remoteLoadingView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/pissarro/remote/RemoteLoadingView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        LottieAnimationView lottieAnimationView = this.mAnimationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.pauseAnimation();
            this.mAnimationView.clearAnimation();
        }
    }

    public void updateProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mProgressTv;
        textView.setText(getContext().getString(R.string.pissarro_try_loading) + i + f7l.MOD);
    }
}
