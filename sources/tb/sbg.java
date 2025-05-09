package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.android.litecreator.widgets.SqTUrlImageView;
import com.taobao.android.mediapick.a;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sbg extends a<VideoMedia> implements kec {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TUrlImageView i;
    public TextView j;
    public View k;
    public AppCompatCheckedTextView l;
    public final g8h<VideoMedia, kec> m = new g8h<>();
    public final s6w n = new s6w();

    static {
        t2o.a(511705576);
        t2o.a(511705589);
    }

    public static /* synthetic */ Object ipc$super(sbg sbgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/uikit/album/cellview/LCVideoCellView");
    }

    @Override // com.taobao.android.mediapick.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60755c2b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.mediapick.a
    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0d48fe5", new Object[]{this});
        }
        return null;
    }

    @Override // tb.kec
    public ImageView getImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("5c716d3f", new Object[]{this});
        }
        return this.i;
    }

    @Override // com.taobao.android.mediapick.a
    public View k(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e28ede9b", new Object[]{this, activity, view});
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        SqTUrlImageView sqTUrlImageView = new SqTUrlImageView(activity);
        this.i = sqTUrlImageView;
        sqTUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.i.setFadeIn(true);
        TextView textView = new TextView(activity);
        this.j = textView;
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, a65.a(23.0f), 80));
        this.j.setBackgroundResource(R.drawable.dw_lc_mediapick_video_duration_bg);
        this.j.setGravity(8388629);
        this.j.setPadding(0, 0, a65.a(6.0f), 0);
        this.j.setMaxLines(1);
        this.j.setTextColor(-1);
        this.j.setTextSize(1, 12.0f);
        View view2 = new View(activity);
        this.k = view2;
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.k.setBackgroundResource(R.drawable.dw_lc_mediapick_cellview_disable);
        int a2 = a65.a(6.0f);
        int a3 = a65.a(6.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a65.a(23.0f), a65.a(23.0f), BadgeDrawable.TOP_END);
        layoutParams.setMargins(a2, a2, a2, a2);
        AppCompatCheckedTextView appCompatCheckedTextView = new AppCompatCheckedTextView(activity);
        this.l = appCompatCheckedTextView;
        appCompatCheckedTextView.setLayoutParams(layoutParams);
        this.l.setBackgroundResource(R.drawable.dw_lc_mediapick_select_cb);
        this.l.setGravity(17);
        this.l.setMaxLines(1);
        this.l.setPadding(a3, 0, a3, 0);
        this.l.setTextColor(-1);
        this.l.setTextSize(1, 13.0f);
        this.l.setVisibility(0);
        this.l.setTextAlignment(4);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(a65.a(60.0f), a65.a(60.0f), BadgeDrawable.TOP_END));
        frameLayout2.addView(this.l);
        frameLayout.addView(this.i);
        frameLayout.addView(this.j);
        frameLayout.addView(this.k);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    /* renamed from: o */
    public void i(VideoMedia videoMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfde92c", new Object[]{this, videoMedia, new Boolean(z)});
            return;
        }
        this.m.e(videoMedia, this);
        this.n.a(videoMedia, this.j);
        if (z) {
            this.k.setVisibility(0);
            this.l.setVisibility(0);
            AppCompatCheckedTextView appCompatCheckedTextView = this.l;
            appCompatCheckedTextView.setBackgroundDrawable(appCompatCheckedTextView.getResources().getDrawable(R.drawable.common_item_confirm_icon));
        } else {
            this.l.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setBackgroundDrawable(null);
        }
        this.l.setChecked(z);
    }
}
