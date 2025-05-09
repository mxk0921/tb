package com.taobao.tbpoplayer.watermask;

import android.text.TextUtils;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.a9l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WaterMaskInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Scene> blackPageList;
    public String imgCode;
    public String imgUrl;
    public boolean needReportLog;
    public List<Scene> reportLogBlackPageList;
    public String watermarkMode;
    public List<Scene> whitePageList;
    public boolean enable = false;
    public int defaultAlpha = 3;
    public long reportLogInterval = 60;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Scene implements Serializable {
        public String alpha;
        public String filter;
        public String matchId;
        public List<String> uris;

        static {
            t2o.a(790626557);
        }
    }

    static {
        t2o.a(790626556);
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!this.enable || TextUtils.isEmpty(this.imgUrl) || TextUtils.isEmpty(this.imgCode)) {
            return false;
        }
        return true;
    }

    public boolean useBlackListMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe720244", new Object[]{this})).booleanValue();
        }
        if (!KeepModel.STRATEGY_BLACK_LIST.equals(this.watermarkMode) || !a9l.w().Q()) {
            return false;
        }
        return true;
    }
}
