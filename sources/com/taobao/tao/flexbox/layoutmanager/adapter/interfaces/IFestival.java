package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IFestival {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class FestivalInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String color;
        public String festivalCode;
        public boolean hasTabbarFestival;
        public String highlightTextColor;
        public boolean isFestivalOn;
        public boolean isTabbarTitleSplit;
        public int mode = 0;
        public String naviStyle;
        public String navigationColor;
        public String navigationImage;
        public String statusBarStyle;
        public String subTextColor;
        public String textColor;
        public String textColorStyle;
        public String url;

        static {
            t2o.a(503316585);
        }

        public Map toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            return JSON.parseObject(JSON.toJSONString(this));
        }
    }

    FestivalInfo t();
}
