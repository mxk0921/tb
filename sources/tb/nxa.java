package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.uikit.feature.features.RoundRectShapeFeature;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782363);
    }

    public View a(View view, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("490951ff", new Object[]{this, view, bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        Context context = view.getContext();
        HImageView hImageView = new HImageView(context);
        hImageView.setImageDrawable(new BitmapDrawable(context.getResources(), bitmap));
        hImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
        layoutParams.gravity = 17;
        hImageView.setLayoutParams(layoutParams);
        return hImageView;
    }

    public View b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("120658dc", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        Bitmap d = d(view);
        if (d == null) {
            return null;
        }
        Context context = view.getContext();
        HImageView hImageView = new HImageView(context);
        hImageView.setImageDrawable(new BitmapDrawable(context.getResources(), d));
        hImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
        layoutParams.gravity = 51;
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        hImageView.setLayoutParams(layoutParams);
        return hImageView;
    }

    public ViewGroup c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6e3b9960", new Object[]{this, view});
        }
        Context context = view.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        HImageView hImageView = new HImageView(context);
        hImageView.setBackgroundColor(-1);
        RoundRectShapeFeature roundRectShapeFeature = new RoundRectShapeFeature();
        roundRectShapeFeature.setCornerRadius(pb6.c(context, 6.0f));
        hImageView.addFeature(roundRectShapeFeature);
        frameLayout.addView(hImageView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipChildren(true);
        return frameLayout;
    }

    public Bitmap d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("53e829a2", new Object[]{this, view});
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
