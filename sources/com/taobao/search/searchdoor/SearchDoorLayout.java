package com.taobao.search.searchdoor;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.ImmersiveRelativeLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.p1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchDoorLayout extends ImmersiveRelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FrameLayout activateContainer;
    private final TUrlImageView atmosphereImg;
    private final TUrlImageView headerImg;
    private final LinearLayout searchBarContainer;
    private final FrameLayout speechContainer;
    private final FrameLayout suggestContainer;

    static {
        t2o.a(815792948);
    }

    public SearchDoorLayout(Context context) {
        super(context);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.headerImg = tUrlImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.searchBarContainer = linearLayout;
        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
        this.atmosphereImg = tUrlImageView2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.activateContainer = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.suggestContainer = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.speechContainer = frameLayout3;
        setId(R.id.tbsearch_searchdoor);
        tUrlImageView.setId(R.id.imv_searchdoor_header);
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tUrlImageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, p1p.a(150.0f)));
        addView(tUrlImageView);
        int i = R.id.tbsearch_searchbar_container;
        linearLayout.setId(i);
        linearLayout.setOrientation(1);
        addView(linearLayout, new RelativeLayout.LayoutParams(-1, -2));
        int i2 = R.id.tbsearch_atmosphere_logo;
        tUrlImageView2.setId(i2);
        tUrlImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tUrlImageView2.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, i);
        addView(tUrlImageView2, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, i2);
        frameLayout.setId(R.id.tbsearch_activate_container);
        frameLayout.setBackgroundResource(R.drawable.tbsearch_sortbar_background);
        addView(frameLayout, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(3, i2);
        frameLayout2.setId(R.id.tbsearch_suggest_container);
        addView(frameLayout2, layoutParams3);
        frameLayout3.setId(R.id.tbsearch_realtime_speech_container);
        addView(frameLayout3, new RelativeLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ Object ipc$super(SearchDoorLayout searchDoorLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorLayout");
    }

    public final View removeHeaderImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c877315b", new Object[]{this});
        }
        removeView(this.headerImg);
        return this.headerImg;
    }
}
