package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.detail2.core.framework.base.widget.MaskImageView;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.android.detail2.core.mainpic.GestureRoundRectCardRoot;
import com.taobao.android.detail2.core.mainpic.MainPicHorizontalRecyclerView;
import com.taobao.android.detail2.core.optimize.prerender.NDFeedsPullBase;
import com.taobao.android.detail2.core.optimize.prerender.NDMainPicPullBase;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322203);
    }

    public static View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("be0e09b7", new Object[]{context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        GestureRoundRectCardRoot gestureRoundRectCardRoot = new GestureRoundRectCardRoot(context);
        gestureRoundRectCardRoot.setId(R.id.half_screen_round_root);
        gestureRoundRectCardRoot.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(gestureRoundRectCardRoot);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.main_render_fl);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.default_layout);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        AliUrlImageView aliUrlImageView = new AliUrlImageView(context);
        aliUrlImageView.setId(R.id.center_default_img);
        aliUrlImageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aliUrlImageView.getLayoutParams();
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, 0, ec7.a(context, 10.0f));
        aliUrlImageView.setScaleType(ImageView.ScaleType.FIT_END);
        aliUrlImageView.setVisibility(8);
        relativeLayout.addView(aliUrlImageView);
        frameLayout.addView(relativeLayout);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.main_pic_open_immediately_gaussian_blur);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        frameLayout.addView(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.main_pic_open_immediately_gaussian_blur_mask);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView2.setScaleType(scaleType);
        frameLayout.addView(imageView2);
        RoundRectCardRoot roundRectCardRoot = new RoundRectCardRoot(context);
        roundRectCardRoot.setId(R.id.main_pic_open_immediately_rr);
        roundRectCardRoot.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(R.id.main_pic_open_immediately);
        imageView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        roundRectCardRoot.addView(imageView3);
        frameLayout.addView(roundRectCardRoot);
        View viewStub = new ViewStub(context);
        viewStub.setId(R.id.media_layout);
        viewStub.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(viewStub);
        NDMainPicPullBase nDMainPicPullBase = new NDMainPicPullBase(context);
        nDMainPicPullBase.setId(R.id.mainpic_feeds_pullbase);
        nDMainPicPullBase.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        nDMainPicPullBase.setMode(PullBase.Mode.PULL_FROM_END);
        MainPicHorizontalRecyclerView mainPicHorizontalRecyclerView = new MainPicHorizontalRecyclerView(context);
        mainPicHorizontalRecyclerView.setId(R.id.mainpic_layout);
        mainPicHorizontalRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        nDMainPicPullBase.addView(mainPicHorizontalRecyclerView);
        frameLayout.addView(nDMainPicPullBase);
        View viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.weex_layout);
        viewStub2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(viewStub2);
        gestureRoundRectCardRoot.addView(frameLayout);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.nav_bg);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.new_detail_nav_bar_height)));
        gestureRoundRectCardRoot.addView(frameLayout2);
        return gestureRoundRectCardRoot;
    }

    public static FrameLayout c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("158aa391", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RoundRectCardRoot roundRectCardRoot = new RoundRectCardRoot(context);
        roundRectCardRoot.setId(R.id.iv_blur_round_rect);
        roundRectCardRoot.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.iv_blur);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        roundRectCardRoot.addView(imageView);
        MaskImageView maskImageView = new MaskImageView(context);
        maskImageView.setId(R.id.mask_iv_blur);
        maskImageView.setVisibility(8);
        maskImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        roundRectCardRoot.addView(maskImageView);
        frameLayout.addView(roundRectCardRoot);
        View view = new View(context);
        view.setId(R.id.iv_blur_mask);
        view.setVisibility(4);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.video_host);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(frameLayout2);
        View view2 = new View(context);
        view2.setId(R.id.v_graymask_top);
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, ec7.a(context, 180.0f)));
        view2.setBackgroundResource(R.drawable.detail_video_background_top);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        layoutParams.gravity = 48;
        view2.setLayoutParams(layoutParams);
        frameLayout.addView(view2);
        View view3 = new View(context);
        view3.setId(R.id.v_graymask_bottom);
        view3.setLayoutParams(new FrameLayout.LayoutParams(-1, ec7.a(context, 285.0f)));
        view3.setBackgroundResource(R.drawable.detail_video_background_bottom);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view3.getLayoutParams();
        layoutParams2.gravity = 80;
        view3.setLayoutParams(layoutParams2);
        frameLayout.addView(view3);
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.imv_play_public_pause);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(ec7.a(context, 82.0f), ec7.a(context, 97.0f)));
        imageView2.setImageResource(R.drawable.tbvideo_video_play_public_pause);
        imageView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams3.gravity = 17;
        imageView2.setLayoutParams(layoutParams3);
        frameLayout.addView(imageView2);
        return frameLayout;
    }

    public static View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("431fefaf", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.instance_default_layout);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(context.getResources().getColor(R.color.new_detail_card_default_bg_color));
        frameLayout.addView(relativeLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.half_screen_second_card_default_fl);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setVisibility(8);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.half_screen_second_card_default_img);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        TextView textView = new TextView(context);
        textView.setId(R.id.half_screen_second_card_default_text);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        textView.setText("加载中...");
        sqj.a(textView);
        textView.setTextColor(context.getResources().getColor(R.color.white));
        frameLayout2.addView(imageView);
        frameLayout2.addView(textView);
        relativeLayout.addView(frameLayout2);
        AliUrlImageView aliUrlImageView = new AliUrlImageView(context);
        aliUrlImageView.setId(R.id.nav_bg_img);
        aliUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aliUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
        frameLayout.addView(aliUrlImageView);
        NDFeedsPullBase nDFeedsPullBase = new NDFeedsPullBase(context);
        nDFeedsPullBase.setId(R.id.detail_feeds_pullbase);
        nDFeedsPullBase.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nDFeedsPullBase.setMode(PullBase.Mode.PULL_FROM_END);
        frameLayout.addView(nDFeedsPullBase);
        DetailVerticalRecyclerView detailVerticalRecyclerView = new DetailVerticalRecyclerView(context);
        detailVerticalRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        detailVerticalRecyclerView.setId(R.id.root_recycler_view);
        nDFeedsPullBase.addView(detailVerticalRecyclerView);
        View viewStub = new ViewStub(context);
        viewStub.setId(R.id.nav_weex);
        viewStub.setLayoutParams(new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.new_detail_nav_bar_bg_height)));
        frameLayout.addView(viewStub);
        View frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.nav_container_root_frame_layout);
        frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.new_detail_nav_bar_height)));
        frameLayout.addView(frameLayout3);
        View view = new View(context);
        view.setId(R.id.instance_bottom_stub);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        frameLayout.addView(view);
        return frameLayout;
    }
}
