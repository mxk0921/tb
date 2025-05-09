package tb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hfi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f20603a;
    public ImageView b;

    static {
        t2o.a(774897716);
    }

    public hfi(MediaContext mediaContext) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        this.f20603a = new FrameLayout(mediaContext.getContext());
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f20603a;
    }

    public void b(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
            return;
        }
        this.b = imageView;
        this.f20603a.removeAllViews();
        this.f20603a.setVisibility(0);
        this.f20603a.addView(this.b, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
