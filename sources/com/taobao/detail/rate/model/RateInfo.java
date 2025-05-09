package com.taobao.detail.rate.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RateInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long clickTimeMS;
    private String commentCount;
    private JSONObject detailRate;
    private JSONObject exParams;
    private String expression;
    private long feedId;
    private int foldFlag;
    private String groupId;
    private int invokeSource;
    private String itemId;
    private JSONObject itemInfo;
    private String mQuestionIcon;
    private String mQuestionLink;
    private String mQuestionText;
    private String mSelectTag;
    private long navTimeMS;
    public String openMode;
    private JSONObject rateExtParams;
    private List<RateKeyword> rateKeywordList;
    private String rateType;
    private String selectSku;
    private String sellerId;
    private String sellerType;
    private String shopId;
    private JSONObject skuInfo;
    private String skuVids;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10342a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public JSONObject i;
        public String j;
        public int k;
        public long l;
        public List<RateKeyword> m;
        public JSONObject n;
        public String o;
        public String p;
        public JSONObject q;
        public JSONObject r;
        public int s;
        public String t;
        public String u;
        public long v;
        public long w;
        public JSONObject x;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6463f845", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("478fab86", new Object[]{aVar});
            }
            return aVar.f10342a;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5ddd6fcc", new Object[]{aVar});
            }
            return aVar.n;
        }

        public static /* synthetic */ JSONObject d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("a37eb26b", new Object[]{aVar});
            }
            return aVar.q;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c0f53f6", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("55cef07c", new Object[]{aVar})).intValue();
            }
            return aVar.k;
        }

        public static /* synthetic */ long g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6fea6f1c", new Object[]{aVar})).longValue();
            }
            return aVar.l;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("45926db9", new Object[]{aVar});
            }
            return aVar.o;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("28be20fa", new Object[]{aVar});
            }
            return aVar.p;
        }

        public static /* synthetic */ JSONObject j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("45464225", new Object[]{aVar});
            }
            return aVar.r;
        }

        public static /* synthetic */ int k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d8586997", new Object[]{aVar})).intValue();
            }
            return aVar.s;
        }

        public static /* synthetic */ JSONObject l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d088c763", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ String m(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2abb5ec7", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ String n(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5802a253", new Object[]{aVar});
            }
            return aVar.t;
        }

        public static /* synthetic */ String o(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3b2e5594", new Object[]{aVar});
            }
            return aVar.u;
        }

        public static /* synthetic */ long p(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6507c71f", new Object[]{aVar})).longValue();
            }
            return aVar.v;
        }

        public static /* synthetic */ long q(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f2345be", new Object[]{aVar})).longValue();
            }
            return aVar.w;
        }

        public static /* synthetic */ JSONObject r(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("e2e98b89", new Object[]{aVar});
            }
            return aVar.x;
        }

        public static /* synthetic */ String s(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de71208", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ String t(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f112c549", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ String u(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d43e788a", new Object[]{aVar});
            }
            return aVar.g;
        }

        public static /* synthetic */ List v(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6d1fd832", new Object[]{aVar});
            }
            return aVar.m;
        }

        public static /* synthetic */ String w(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9a95df0c", new Object[]{aVar});
            }
            return aVar.h;
        }

        public static /* synthetic */ String x(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7dc1924d", new Object[]{aVar});
            }
            return aVar.j;
        }

        public static /* synthetic */ String y(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("60ed458e", new Object[]{aVar});
            }
            return aVar.c;
        }

        public int A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("79f9b923", new Object[]{this})).intValue();
            }
            return this.k;
        }

        public String B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
            }
            return this.b;
        }

        public void C(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b5387a4", new Object[]{this, new Long(j)});
            } else {
                this.v = j;
            }
        }

        public a D(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8a192345", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public void E(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adaa2c56", new Object[]{this, jSONObject});
            } else {
                this.x = jSONObject;
            }
        }

        public a F(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6bfde510", new Object[]{this, jSONObject});
            }
            if ("true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tb_ratedisplay_Android", "use_ex_params", "false"))) {
                this.r = jSONObject;
            }
            return this;
        }

        public a G(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1f32846d", new Object[]{this, str});
            }
            this.t = str;
            return this;
        }

        public void H(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa30eda2", new Object[]{this, new Long(j)});
            } else {
                this.l = j;
            }
        }

        public a I(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e3bb186f", new Object[]{this, new Integer(i)});
            }
            this.s = i;
            return this;
        }

        public void J(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
            } else {
                this.p = str;
            }
        }

        public void K(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0d3ec47", new Object[]{this, new Integer(i)});
            } else {
                this.k = i;
            }
        }

        public a L(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b8e8b363", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a M(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ce6fdc8", new Object[]{this, jSONObject});
            }
            this.q = jSONObject;
            return this;
        }

        public void N(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53041da9", new Object[]{this, new Long(j)});
            } else {
                this.w = j;
            }
        }

        public void O(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("144f52e0", new Object[]{this, str});
            } else {
                this.u = str;
            }
        }

        public a P(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3f67e419", new Object[]{this, jSONObject});
            }
            if (jSONObject != null) {
                this.f = jSONObject.getString("askText");
                this.g = jSONObject.getString("linkUrl");
                this.h = jSONObject.getString("askIcon");
            }
            return this;
        }

        public a Q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1db7bf54", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a R(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eac90255", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a S(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2511ae08", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a T(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ce39aa6", new Object[]{this, jSONObject});
            }
            this.i = jSONObject;
            return this;
        }

        public a U(List<RateKeyword> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5d7dc8a6", new Object[]{this, list});
            }
            if (list != null && list.size() > 0) {
                for (RateKeyword rateKeyword : list) {
                    if (rateKeyword.type == 1) {
                        rateKeyword.type = -1;
                    } else {
                        rateKeyword.type = 1;
                    }
                }
            }
            this.m = list;
            return this;
        }

        public a V(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26634d8f", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public a W(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f6b1ae4f", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a X(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("91259cae", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a Y(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2d31c506", new Object[]{this, str});
            }
            this.f10342a = str;
            return this;
        }

        public a Z(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f1cc8442", new Object[]{this, jSONObject});
            }
            this.n = jSONObject;
            return this;
        }

        public void a0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ca3ad4e", new Object[]{this, str});
            } else {
                this.o = str;
            }
        }

        public RateInfo z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateInfo) ipChange.ipc$dispatch("2e2d922e", new Object[]{this});
            }
            return new RateInfo(this);
        }
    }

    public RateInfo() {
    }

    public long getClickTimeMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90c0b9a0", new Object[]{this})).longValue();
        }
        return this.clickTimeMS;
    }

    public String getCommentCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e2a6253", new Object[]{this});
        }
        return this.commentCount;
    }

    public JSONObject getDetailRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9478bcee", new Object[]{this});
        }
        return this.detailRate;
    }

    public JSONObject getExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("512995b6", new Object[]{this});
        }
        return this.exParams;
    }

    public String getExpression() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17aea92b", new Object[]{this});
        }
        return this.expression;
    }

    public long getFeedId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea71e74a", new Object[]{this})).longValue();
        }
        return this.feedId;
    }

    public int getFoldFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e955f7d", new Object[]{this})).intValue();
        }
        return this.foldFlag;
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
        }
        return this.groupId;
    }

    public int getInvokeSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79f9b923", new Object[]{this})).intValue();
        }
        return this.invokeSource;
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.itemId;
    }

    public JSONObject getItemInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("440443fe", new Object[]{this});
        }
        return this.itemInfo;
    }

    public long getNavTimeMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f5301fb", new Object[]{this})).longValue();
        }
        return this.navTimeMS;
    }

    public String getOpenMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9985256", new Object[]{this});
        }
        return this.openMode;
    }

    public String getQuestionIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a22a8e24", new Object[]{this});
        }
        return this.mQuestionIcon;
    }

    public String getQuestionLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39020543", new Object[]{this});
        }
        return this.mQuestionLink;
    }

    public String getQuestionText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b21bdf0", new Object[]{this});
        }
        return this.mQuestionText;
    }

    public JSONObject getRateExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7dafdd78", new Object[]{this});
        }
        return this.rateExtParams;
    }

    public List<RateKeyword> getRateKeywordList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19ff584f", new Object[]{this});
        }
        return this.rateKeywordList;
    }

    public String getRateType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44197f49", new Object[]{this});
        }
        return this.rateType;
    }

    public String getSelectSku() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("168ffc0e", new Object[]{this});
        }
        return this.selectSku;
    }

    public String getSelectTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d15159b1", new Object[]{this});
        }
        return this.mSelectTag;
    }

    public String getSellerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        return this.sellerId;
    }

    public String getSellerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3157730a", new Object[]{this});
        }
        return this.sellerType;
    }

    public String getShopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this});
        }
        return this.shopId;
    }

    public JSONObject getSkuInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2509985c", new Object[]{this});
        }
        return this.skuInfo;
    }

    public String getSkuVids() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c918d90", new Object[]{this});
        }
        return this.skuVids;
    }

    public void setClickTimeMS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5387a4", new Object[]{this, new Long(j)});
        } else {
            this.clickTimeMS = j;
        }
    }

    public void setCommentCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c05c83", new Object[]{this, str});
        } else {
            this.commentCount = str;
        }
    }

    public void setDetailRate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaa2c56", new Object[]{this, jSONObject});
        } else {
            this.detailRate = jSONObject;
        }
    }

    public void setExParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a0398e", new Object[]{this, jSONObject});
        } else {
            this.exParams = jSONObject;
        }
    }

    public void setExpression(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551003ab", new Object[]{this, str});
        } else {
            this.expression = str;
        }
    }

    public void setFeedId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa30eda2", new Object[]{this, new Long(j)});
        } else {
            this.feedId = j;
        }
    }

    public void setGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
        } else {
            this.groupId = str;
        }
    }

    public void setInvokeSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d3ec47", new Object[]{this, new Integer(i)});
        } else {
            this.invokeSource = i;
        }
    }

    public void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.itemId = str;
        }
    }

    public void setItemInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b5446", new Object[]{this, jSONObject});
        } else {
            this.itemInfo = jSONObject;
        }
    }

    public void setNavTimeMS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53041da9", new Object[]{this, new Long(j)});
        } else {
            this.navTimeMS = j;
        }
    }

    public void setOpenMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144f52e0", new Object[]{this, str});
        } else {
            this.openMode = str;
        }
    }

    public void setQuestionIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c5aad2", new Object[]{this, str});
        } else {
            this.mQuestionIcon = str;
        }
    }

    public void setQuestionLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dd1793", new Object[]{this, str});
        } else {
            this.mQuestionLink = str;
        }
    }

    public void setQuestionText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b47486", new Object[]{this, str});
        } else {
            this.mQuestionText = str;
        }
    }

    public void setRateExtParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3623a5a4", new Object[]{this, jSONObject});
        } else {
            this.rateExtParams = jSONObject;
        }
    }

    public void setRateKeywordList(List<RateKeyword> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90851f5d", new Object[]{this, list});
            return;
        }
        if (list != null && list.size() > 0) {
            for (RateKeyword rateKeyword : list) {
                if (rateKeyword.type == 1) {
                    rateKeyword.type = -1;
                } else {
                    rateKeyword.type = 1;
                }
            }
        }
        this.rateKeywordList = list;
    }

    public void setRateType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f3c44d", new Object[]{this, str});
        } else {
            this.rateType = str;
        }
    }

    public void setSelectSku(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dad4190", new Object[]{this, str});
        } else {
            this.selectSku = str;
        }
    }

    public void setSelectTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db17984d", new Object[]{this, str});
        } else {
            this.mSelectTag = str;
        }
    }

    public void setSellerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3d490d", new Object[]{this, str});
        } else {
            this.sellerId = str;
        }
    }

    public void setSellerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708075ac", new Object[]{this, str});
        } else {
            this.sellerType = str;
        }
    }

    public void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    public void setSkuInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfac040", new Object[]{this, jSONObject});
        } else {
            this.skuInfo = jSONObject;
        }
    }

    public void setSkuVids(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca3ad4e", new Object[]{this, str});
        } else {
            this.skuVids = str;
        }
    }

    public RateInfo(a aVar) {
        this.itemId = a.a(aVar);
        this.shopId = a.b(aVar);
        this.sellerType = a.m(aVar);
        this.commentCount = a.s(aVar);
        this.mQuestionText = a.t(aVar);
        this.mQuestionLink = a.u(aVar);
        this.rateKeywordList = a.v(aVar);
        this.mQuestionIcon = a.w(aVar);
        this.mSelectTag = a.x(aVar);
        this.sellerId = a.y(aVar);
        this.skuInfo = a.c(aVar);
        this.itemInfo = a.d(aVar);
        this.selectSku = a.e(aVar);
        this.invokeSource = a.f(aVar);
        this.feedId = a.g(aVar);
        this.skuVids = a.h(aVar);
        this.groupId = a.i(aVar);
        this.exParams = a.j(aVar);
        this.foldFlag = a.k(aVar);
        this.rateExtParams = a.l(aVar);
        this.expression = a.n(aVar);
        this.openMode = a.o(aVar);
        this.clickTimeMS = a.p(aVar);
        this.navTimeMS = a.q(aVar);
        this.detailRate = a.r(aVar);
    }
}
