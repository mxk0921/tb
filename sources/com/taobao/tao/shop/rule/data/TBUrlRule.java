package com.taobao.tao.shop.rule.data;

import java.io.Serializable;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBUrlRule implements Serializable {
    public String content;
    public String name;
    public String regex;
    public ArrayList<TBUrlRule> subRules;
    @Deprecated
    public String target;
    public String type;

    static {
        t2o.a(668991561);
    }
}
