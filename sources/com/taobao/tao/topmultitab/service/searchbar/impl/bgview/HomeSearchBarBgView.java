package com.taobao.tao.topmultitab.service.searchbar.impl.bgview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.view.HImageView;
import tb.bqa;
import tb.i2b;
import tb.kkc;
import tb.oza;
import tb.p2b;
import tb.t2o;
import tb.w0p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeSearchBarBgView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeSearchBarBgView";
    private HImageView mBgView;

    static {
        t2o.a(729810334);
    }

    public HomeSearchBarBgView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        HImageView hImageView = new HImageView(getContext());
        this.mBgView = hImageView;
        hImageView.setFadeIn(true);
        this.mBgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.mBgView, new ViewGroup.LayoutParams(-1, -1));
        initDefaultBg();
    }

    public static /* synthetic */ Object ipc$super(HomeSearchBarBgView homeSearchBarBgView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/searchbar/impl/bgview/HomeSearchBarBgView");
    }

    private boolean isDarkMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79643682", new Object[]{this, context})).booleanValue();
        }
        return oza.a(context);
    }

    private void showFestivalBg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0bba41", new Object[]{this});
            return;
        }
        int c = w0p.c();
        String d = w0p.d();
        if (TextUtils.isEmpty(d)) {
            bqa.d(TAG, "festivalImg is null");
            return;
        }
        p2b.q(this.mBgView, d, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
        this.mBgView.setBackgroundColor(c);
        this.mBgView.setImageUrl(d);
    }

    public void updateCustomBg(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849c4c33", new Object[]{this, str, new Integer(i)});
            return;
        }
        p2b.q(this.mBgView, str, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
        if (!TextUtils.isEmpty(str)) {
            this.mBgView.setBackgroundColor(i);
            this.mBgView.setImageUrl(str);
            return;
        }
        this.mBgView.setImageUrl(null);
        this.mBgView.setBackgroundColor(i);
    }

    private void initDefaultBg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a7b8bd", new Object[]{this});
            return;
        }
        kkc b = w0p.b();
        if (b != null) {
            bqa.d(TAG, "updateDefaultBgView");
            this.mBgView.setVisibility(0);
            updateBgView(b);
        }
    }

    public HomeSearchBarBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void updateBgView(kkc kkcVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5574102", new Object[]{this, kkcVar});
        } else if (this.mBgView != null) {
            if (kkcVar.f() || TextUtils.isEmpty(FestivalMgr.i().l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG))) {
                z = false;
            }
            int e = kkcVar.e();
            String d = kkcVar.d();
            if (isDarkMode(this.mBgView.getContext())) {
                updateCustomBg(null, 0);
                bqa.d(TAG, "开启了深色模式");
            } else if (TextUtils.isEmpty(d)) {
                bqa.d(TAG, "没有tab氛围结构时不展示");
            } else if (z) {
                showFestivalBg();
                bqa.d(TAG, "有皮肤 重置背景层");
            } else {
                bqa.d(TAG, "更新背景层，bgImageUrl： " + d);
                updateCustomBg(d, e);
            }
        }
    }

    public HomeSearchBarBgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
