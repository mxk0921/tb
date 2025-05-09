package com.taobao.search.searchdoor.activate.guess;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GuessDiscoveryVO {
    @JSONField(name = "changeOnReturn")
    public boolean changeOnReturn;
    @JSONField(name = "discover_rownum")
    public int discoverRowNum;
    @JSONField(name = "isChangeButton")
    public boolean isChangeButton;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "result")
    public a result;
    @JSONField(name = "sfStratage")
    public String sfStratage;
    @JSONField(name = "simplyStyle")
    public boolean simplyStyle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        @JSONField(name = "text")
        public List<ActivateGuessBean> text;

        static {
            t2o.a(815792973);
        }
    }

    static {
        t2o.a(815792972);
    }
}
