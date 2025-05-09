package com.taobao.homepage.business.getconfig;

import android.graphics.Color;
import com.alibaba.ability.localization.Localization;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultRefreshConfig extends RefreshConfig {
    static {
        t2o.a(729808970);
    }

    public DefaultRefreshConfig() {
        this.pullToRefreshText = Localization.q(R.string.taobao_app_1000_1_16141);
        this.releaseToRefreshText = Localization.q(R.string.app_release_to_reload);
        this.refreshingText = Localization.q(R.string.taobao_app_1000_1_16173);
        this.refreshFinishedText = Localization.q(R.string.taobao_app_1000_1_16144);
        this.pullTextColor = "#999999";
        this.parsePullTextColor = Integer.valueOf(Color.parseColor("#999999"));
        this.pullTextSize = 12;
        this.pullRefreshHeight = 40;
    }
}
