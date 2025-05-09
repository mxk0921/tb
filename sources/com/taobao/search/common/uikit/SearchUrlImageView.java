package com.taobao.search.common.uikit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.uikit.RoundedCornersBitmapProcessor;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.b4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchUrlImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "SearchUrlImageView";
    private static final int TYPE_ALL = 0;
    private static final int TYPE_BOTTOM = 2;
    private static final int TYPE_LEFT = 3;
    private static final int TYPE_RIGHT = 4;
    private static final int TYPE_TOP = 1;
    private int mCornerRadius;
    private int mCornerType;
    private static boolean sIsFadeInEnabled = false;
    public static final ImageStrategyConfig STRATEGY_CONFIG = ImageStrategyConfig.w("search", String.valueOf(89)).a();
    public static final ImageStrategyConfig STRATEGY_MAIN_SEARCH_AUCTION = ImageStrategyConfig.w("search", String.valueOf(8910)).a();
    public static final ImageStrategyConfig STRATEGY_P4P_AUCTION = ImageStrategyConfig.w("search", String.valueOf(8911)).a();

    public SearchUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        setStrategyConfig(STRATEGY_CONFIG);
        setFadeIn(sIsFadeInEnabled);
        if (attributeSet != null && (obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SearchUrlImageView, 0, 0)) != null) {
            this.mCornerType = obtainStyledAttributes.getInt(R.styleable.SearchUrlImageView_corner_type, -1);
            this.mCornerRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SearchUrlImageView_corner_radius, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ Object ipc$super(SearchUrlImageView searchUrlImageView, String str, Object... objArr) {
        if (str.hashCode() == -826210649) {
            super.setImageUrl((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/uikit/SearchUrlImageView");
    }

    public static void setFadeInEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05d63ef", new Object[]{new Boolean(z)});
            return;
        }
        sIsFadeInEnabled = z;
        b4p.g(LOG_TAG, "setFadeInEnabled:" + z);
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setImageUrl(String str) {
        RoundedCornersBitmapProcessor roundedCornersBitmapProcessor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else if (this.mCornerType < 0 || this.mCornerRadius <= 0) {
            super.setImageUrl(str);
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                super.setImageUrl(str);
                return;
            }
            int i = layoutParams.width;
            if (i < 0) {
                i = getWidth();
            }
            int i2 = layoutParams.height;
            if (i2 < 0) {
                i2 = getHeight();
            }
            int i3 = this.mCornerType;
            if (i3 == 0) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(i, i2, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.ALL, getScaleType());
            } else if (i3 == 1) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(i, i2, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.TOP, getScaleType());
            } else if (i3 == 2) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(i, i2, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.BOTTOM, getScaleType());
            } else if (i3 == 3) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(i, i2, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.LEFT, getScaleType());
            } else if (i3 != 4) {
                roundedCornersBitmapProcessor = null;
            } else {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(i, i2, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.RIGHT, getScaleType());
            }
            if (roundedCornersBitmapProcessor == null) {
                super.setImageUrl(str);
            } else {
                setImageUrl(str, new PhenixOptions().bitmapProcessors(roundedCornersBitmapProcessor));
            }
        }
    }

    public SearchUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    static {
        t2o.a(815792201);
    }

    public SearchUrlImageView(Context context) {
        super(context);
        init(null);
    }
}
