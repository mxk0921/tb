package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092454);
    }

    public static float a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99c74cc1", new Object[]{context, str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        return owo.e(context, str, 0);
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f0ddbfd", new Object[]{str})).intValue();
        }
        if ("center".equals(str)) {
            return 17;
        }
        if ("left".equals(str)) {
            return 3;
        }
        if ("center_horizontal".equals(str)) {
            return 1;
        }
        return 17;
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc914f52", new Object[]{str})).intValue();
        }
        if ("liveFlag".equals(str)) {
            return R.drawable.tbliveuikit_status_live_dynamic;
        }
        if ("replayFlag".equals(str)) {
            return R.drawable.tbliveuikit_video_type_replay;
        }
        if ("previewFlag".equals(str) || "preliveFlag".equals(str)) {
            return R.drawable.tbliveuikit_status_prelive;
        }
        if ("liveCenterFlg".equals(str)) {
            return R.drawable.tbliveuikit_weitao_live;
        }
        if ("replayCenterFlg".equals(str)) {
            return R.drawable.tbliveuikit_weitao_playback;
        }
        if ("goodNumberBg".equals(str)) {
            return R.drawable.tbliveuikit_goodnumber_backgd;
        }
        if ("cardBottomBg".equals(str)) {
            return R.drawable.tbliveuikit_card_bottom_bg_48;
        }
        if ("cardBottomBgRightCorner".equals(str)) {
            return R.drawable.tbliveuikit_card_bottom_bg_right_corner;
        }
        if ("cardTopBg".equals(str)) {
            return R.drawable.tbliveuikit_card_top_bg_48;
        }
        if ("cardTopBgRightCorner".equals(str)) {
            return R.drawable.tbliveuikit_card_top_bg_right_corner;
        }
        if ("replayCenterFlg".equals(str)) {
            return R.drawable.tbliveuikit_home_item_replay_btn;
        }
        if ("liveCoverMask".equals(str)) {
            return R.drawable.tbliveuikit_small_img_cover_mask;
        }
        if ("goodBubbleBg".equals(str)) {
            return R.drawable.tbliveuikit_card_good_bubble_bg;
        }
        if ("taoliveDefault".equals(str)) {
            return R.drawable.tbliveuikit_default;
        }
        if ("taoliveDefaultIcon".equals(str)) {
            return R.drawable.tbliveuikit_default_icon;
        }
        return -1;
    }

    public static ImageView.ScaleType e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("b30ed0a0", new Object[]{str});
        }
        if ("centerCrop".equals(str)) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if ("center".equals(str)) {
            return ImageView.ScaleType.CENTER;
        }
        if ("centerInside".equals(str)) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        if ("fitCenter".equals(str)) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if ("fitXY".equals(str)) {
            return ImageView.ScaleType.FIT_XY;
        }
        if ("fitStart".equals(str)) {
            return ImageView.ScaleType.FIT_START;
        }
        if ("fitEnd".equals(str)) {
            return ImageView.ScaleType.FIT_END;
        }
        if ("matrix".equals(str)) {
            return ImageView.ScaleType.MATRIX;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a79d3b55", new Object[]{str})).intValue();
        }
        return (!TextUtils.isEmpty(str) && !"oval".equals(str) && "roundRect".equals(str)) ? 1 : 0;
    }
}
