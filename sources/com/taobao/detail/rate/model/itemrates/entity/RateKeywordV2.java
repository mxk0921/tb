package com.taobao.detail.rate.model.itemrates.entity;

import com.alibaba.fastjson.JSONArray;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateKeywordV2 implements Serializable {
    public static final int RATE_TYPE_NEGATIVE = 1;
    public static final int RATE_TYPE_POSITIVE = 0;
    public String attribute;
    public String attributeId;
    public String count;
    public String level;
    public JSONArray subImprList;
    public String word;
    public int type = 0;
    public int status = 1;
    public int rateType = 100;
}
