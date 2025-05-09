package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qrp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714092);
    }

    public static ImageView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("e36e3b0e", new Object[]{context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.imv_play_public_pause);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        imageView.setImageResource(R.drawable.fluid_sdk_video_play_public_pause);
        imageView.setVisibility(8);
        return imageView;
    }

    public static View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1b21a1f7", new Object[]{context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.time_layout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, 0, 0, pr9.c(context, 55));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        TextView textView = new TextView(context);
        textView.setId(R.id.current_time);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int c = pr9.c(context, 12);
        layoutParams2.setMargins(0, 0, c, 0);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(21);
        textView.setTextSize(1, 22.0f);
        textView.setTextColor(-1);
        textView.setText("00:00");
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, 0, c, 0);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(16);
        textView2.setTextSize(1, 22.0f);
        textView2.setTextColor(-1711276033);
        textView2.setText("/");
        textView2.setTypeface(typeface);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setId(R.id.total_time);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView3.setGravity(16);
        textView3.setTextSize(1, 22.0f);
        textView3.setTextColor(-1711276033);
        textView3.setText("00:00");
        textView3.setTypeface(typeface);
        linearLayout.addView(textView3);
        return linearLayout;
    }

    public static LinearLayout.LayoutParams g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("210963ec", new Object[0]);
        }
        return new LinearLayout.LayoutParams(-1, 0, 1.0f);
    }

    public static FrameLayout.LayoutParams h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("25c4e94d", new Object[0]);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public final View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2dfd5d7f", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.favor_frame);
        frameLayout.setBackgroundColor(Color.parseColor("#111111"));
        frameLayout.setLayoutParams(g());
        VideoRoundCornerLayout videoRoundCornerLayout = new VideoRoundCornerLayout(context);
        videoRoundCornerLayout.setId(R.id.video_host);
        frameLayout.addView(videoRoundCornerLayout, h());
        View view = new View(context);
        view.setId(R.id.v_graymask_top);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, pr9.c(context, 50), 48));
        view.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
        frameLayout.addView(view);
        View view2 = new View(context);
        view2.setId(R.id.v_graymask_bottom);
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, pr9.c(context, 285), 80));
        view2.setBackgroundResource(R.drawable.fluid_sdk_video_background_bottom);
        frameLayout.addView(view2);
        frameLayout.addView(b(context));
        return frameLayout;
    }

    public final View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4d93eb13", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.seek_bar_layout);
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        relativeLayout.setGravity(15);
        RangeSeekBar rangeSeekBar = new RangeSeekBar(context);
        rangeSeekBar.setId(R.id.seek_bar);
        rangeSeekBar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int c = pr9.c(context, 9);
        int c2 = pr9.c(context, 20);
        rangeSeekBar.setPadding(c, c2, c, c2);
        rangeSeekBar.setBackgroundDrawable(null);
        relativeLayout.addView(rangeSeekBar);
        return relativeLayout;
    }

    public final View e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("44c4a030", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.vg_content);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(a(context));
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bottom_label_frame_long);
        viewStub.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(viewStub);
        return linearLayout;
    }

    public View f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        FscrmidFavorFrameLayout fscrmidFavorFrameLayout = new FscrmidFavorFrameLayout(context);
        fscrmidFavorFrameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        fscrmidFavorFrameLayout.setId(R.id.carditem_root_host);
        fscrmidFavorFrameLayout.addView(e(context));
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bottom_label_frame_short);
        viewStub.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        fscrmidFavorFrameLayout.addView(viewStub);
        fscrmidFavorFrameLayout.addView(c(context));
        return fscrmidFavorFrameLayout;
    }
}
