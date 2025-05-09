package com.taobao.tao.shop.rule.data;

import java.io.Serializable;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBUrlRuleSet implements Serializable {
    public String actionAfterMatch;
    public String actionAfterMiss;
    public String handleType;
    public String name;
    public String regex;
    public ArrayList<TBUrlRule> subRules;
    public TBUrlRuleSet successor;
    public String target;
    public String type;

    static {
        t2o.a(668991563);
    }
}
