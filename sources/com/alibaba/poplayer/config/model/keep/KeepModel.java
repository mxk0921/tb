package com.alibaba.poplayer.config.model.keep;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.alibaba.poplayer.config.model.trigger.UriModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class KeepModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODE_KEEP_LIVE = "keepLive";
    public static final String MODE_PAGE_LIVE = "pageLive";
    public static final String STRATEGY_BLACK_LIST = "blackList";
    public static final String STRATEGY_WHITE_LIST = "whiteList";
    @JSONField(name = "mode")
    public String mode;
    @JSONField(name = "pages")
    public List<UriModel> pages;
    @JSONField(name = "strategy")
    public String strategy;

    static {
        t2o.a(625999897);
        t2o.a(625999896);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        List<UriModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mode) || TextUtils.isEmpty(this.strategy) || (list = this.pages) == null || list.isEmpty()) {
            return false;
        }
        if (MODE_PAGE_LIVE.equals(this.mode) || MODE_KEEP_LIVE.equals(this.mode)) {
            return STRATEGY_WHITE_LIST.equals(this.strategy) || STRATEGY_BLACK_LIST.equals(this.strategy);
        }
        return false;
    }
}
