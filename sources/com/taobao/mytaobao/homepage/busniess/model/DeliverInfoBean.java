package com.taobao.mytaobao.homepage.busniess.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DeliverInfoBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_CODE_CONSIGN = 1;
    public static final int STATUS_CODE_DELIVERING = 3;
    public static final int STATUS_CODE_FAILED = 5;
    public static final int STATUS_CODE_SIGN = 4;
    public static final int STATUS_CODE_TRANSPORT = 2;
    public static final int STATUS_CODE_WAITTING_DELIVERY = 6;
    public JSONObject args;
    public BgLinearGradient bgLinearGradient;
    public String bounderColor;
    public String buttonText;
    public ClickParamBean clickParam;
    public String countdownTextColor;
    public String cpCode;
    public String cpName;
    public String expectArriveTime;
    public Object ext;
    public ExtraInfo extraInfo;
    public int fatigue = Integer.MAX_VALUE;
    public String futureTime;
    public String goodsName;
    public Integer goodsNum;
    public String goodsUrl;
    public String icon;
    public String id;
    public int index;
    public String isShowButton;
    public String isStressed;
    public String isWhiteBgd;
    public String jumpUrl;
    public String lastDetail;
    public String orderCode;
    public String orderId;
    public Long packageId;
    public String scm;
    public String spm;
    public String status;
    public String statusDesc;
    public String statusIcon;
    public String time;
    public String tip;
    public String tips;
    public String tips2020;
    public String title;
    public String titleColor;
    public String traceNo;
    public String tradeId;
    public int type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class BgLinearGradient implements Serializable {
        public String endColor;
        public String startColor;

        static {
            t2o.a(745537732);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ExtraInfo implements Serializable {
        public String displayName;
        public String moreUrl;

        static {
            t2o.a(745537734);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f11214a = "CREATE";
        public static final String b = "WAREHOUSE_ACCEPT";
        public static final String c = "WAREHOUSE_PROCESS";
        public static final String d = "WAREHOUSE_CONFIRMED";
        public static final String e = "CONSIGN";
        public static final String f = "ACCEPT";
        public static final String g = "LH_HO";
        public static final String h = "CC_HO";
        public static final String i = "TRANSPORT";
        public static final String j = "DELIVERING";
        public static final String k = "FAILED";
        public static final String l = "WAITTING_DELIVERY";
        public static final String m = "AGENT_SIGN";
        public static final String n = "SIGN";

        static {
            t2o.a(745537733);
        }
    }

    static {
        t2o.a(745537731);
    }

    public int getStatusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        String str = this.status;
        if (str == null || a.k.equals(str)) {
            return 5;
        }
        if (a.n.equals(this.status) || a.m.equals(this.status)) {
            return 4;
        }
        if (a.j.equals(this.status)) {
            return 3;
        }
        if (a.l.equals(this.status)) {
            return 6;
        }
        if (a.i.equals(this.status) || a.f.equals(this.status) || a.h.equals(this.status) || a.g.equals(this.status)) {
            return 2;
        }
        if (a.e.equals(this.status) || a.f11214a.equals(this.status) || a.d.equals(this.status) || a.c.equals(this.status) || a.b.equals(this.status)) {
            return 1;
        }
        return 5;
    }
}
