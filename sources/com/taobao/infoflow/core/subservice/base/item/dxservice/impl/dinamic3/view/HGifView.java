package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.uikit.feature.features.RatioFeature;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HGifView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HGifView";
    private HImageView bottomImageView;
    private HImageView gifImageView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements HImageView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
            } else {
                HGifView.access$000(HGifView.this).setVisibility(8);
            }
        }
    }

    static {
        t2o.a(486539401);
    }

    public HGifView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ HImageView access$000(HGifView hGifView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("48d6d372", new Object[]{hGifView});
        }
        return hGifView.bottomImageView;
    }

    public static /* synthetic */ Object ipc$super(HGifView hGifView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/HGifView");
    }

    public HImageView getBottomImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("a39c9427", new Object[]{this});
        }
        return this.bottomImageView;
    }

    public HImageView getGifImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("f038199a", new Object[]{this});
        }
        return this.gifImageView;
    }

    public void setBottomImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f036403f", new Object[]{this, str});
        } else {
            this.bottomImageView.setImageUrl(str);
        }
    }

    public void setBottomImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61e2717", new Object[]{this, drawable});
        } else {
            this.bottomImageView.setImageDrawable(drawable);
        }
    }

    public void setBottomImageRatio(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae08562", new Object[]{this, str, str2, str3});
        } else {
            updateViewWithApectRatio(this.bottomImageView, str, str2, str3);
        }
    }

    public void setBottomImageRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea94fd0a", new Object[]{this, new Integer(i)});
        } else {
            this.bottomImageView.setImageResource(i);
        }
    }

    public void setGifImageRatio(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0a61b7", new Object[]{this, str, str2, str3});
        } else {
            updateViewWithApectRatio(this.gifImageView, str, str2, str3);
        }
    }

    public void setGifUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3850de", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.bottomImageView.setVisibility(0);
        }
        this.gifImageView.setSkipAutoSize(true);
        this.gifImageView.setImageUrl(str);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        this.bottomImageView.setScaleType(scaleType);
        this.gifImageView.setScaleType(scaleType);
    }

    public void setStrategyConfig(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4afa", new Object[]{this, obj});
            return;
        }
        this.bottomImageView.setStrategyConfig(obj);
        this.gifImageView.setStrategyConfig(obj);
    }

    public HGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.bottomImageView = new HImageView(getContext());
        HImageView hImageView = new HImageView(getContext());
        this.gifImageView = hImageView;
        hImageView.setSuccListener(new a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.bottomImageView, 0, layoutParams);
        addView(this.gifImageView, 1, layoutParams);
    }

    private void updateViewWithApectRatio(HImageView hImageView, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af32e10", new Object[]{this, hImageView, str, str2, str3});
            return;
        }
        boolean z = !TextUtils.equals(str, "match_content") && TextUtils.equals(str2, "match_content");
        if (z || (TextUtils.equals(str, "match_content") && !TextUtils.equals(str2, "match_content"))) {
            double d = -1.0d;
            try {
                if (!TextUtils.isEmpty(str3)) {
                    d = Double.valueOf(str3).doubleValue();
                }
            } catch (Throwable unused) {
            }
            if (z) {
                if (d > vu3.b.GEO_NOT_SUPPORT) {
                    hImageView.setAspectRatio((float) (1.0d / d));
                    ((RatioFeature) hImageView.findFeature(RatioFeature.class)).setOrientation(0);
                } else if (hImageView.getLayoutParams() != null) {
                    hImageView.removeFeature(RatioFeature.class);
                    hImageView.getLayoutParams().height = 0;
                }
            } else if (d > vu3.b.GEO_NOT_SUPPORT) {
                hImageView.setAspectRatio((float) d);
                ((RatioFeature) hImageView.findFeature(RatioFeature.class)).setOrientation(1);
            } else if (hImageView.getLayoutParams() != null) {
                hImageView.removeFeature(RatioFeature.class);
                hImageView.getLayoutParams().width = 0;
            }
        }
    }

    public HGifView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
