package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import java.util.ArrayList;
import java.util.List;
import tb.m09;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "rate")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Rate extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<Keywords> keywords;
    private final JSONObject rateExtParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Keywords {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6756a;
        public final String b;
        public final String c;
        public final RateKeywordType d;
        public final int e;
        public final JSONArray f;
        public final String g;
        public final String h;
        public final String i;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public enum RateKeywordType {
            POSITIVE,
            NEGATIVE;
            
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(RateKeywordType rateKeywordType, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Rate$Keywords$RateKeywordType");
            }

            public static RateKeywordType valueOf(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RateKeywordType) ipChange.ipc$dispatch("3a532b57", new Object[]{str});
                }
                return (RateKeywordType) Enum.valueOf(RateKeywordType.class, str);
            }
        }

        static {
            t2o.a(912261684);
        }

        public Keywords(JSONObject jSONObject) {
            RateKeywordType rateKeywordType;
            this.f6756a = jSONObject.getString(TaoliveSearchHotWords.TYPE_WORD);
            this.b = jSONObject.getString("count");
            this.c = jSONObject.getString("attribute");
            if (jSONObject.getIntValue("type") > 0) {
                rateKeywordType = RateKeywordType.POSITIVE;
            } else {
                rateKeywordType = RateKeywordType.NEGATIVE;
            }
            this.d = rateKeywordType;
            this.e = jSONObject.getIntValue("type");
            this.g = jSONObject.getString(m09.TASK_TYPE_LEVEL);
            this.h = jSONObject.getString("attributeId");
            this.f = jSONObject.getJSONArray("subImprList");
            this.i = jSONObject.getString("rateType");
        }

        public static Keywords a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Keywords) ipChange.ipc$dispatch("5b089154", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new Keywords(jSONObject);
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("510a9ed3", new Object[]{this});
            }
            return this.c;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("934fa9f8", new Object[]{this});
            }
            return this.h;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("21147940", new Object[]{this});
            }
            return this.b;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("33eab9eb", new Object[]{this});
            }
            return this.g;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44197f49", new Object[]{this});
            }
            return this.i;
        }

        public int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
            }
            return this.e;
        }

        public JSONArray h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("3ec8d09", new Object[]{this});
            }
            return this.f;
        }

        public RateKeywordType i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateKeywordType) ipChange.ipc$dispatch("564fcc19", new Object[]{this});
            }
            return this.d;
        }

        public String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d644af79", new Object[]{this});
            }
            return this.f6756a;
        }
    }

    static {
        t2o.a(912261683);
    }

    public Rate(JSONObject jSONObject) {
        super(jSONObject);
        this.keywords = initKeywords(jSONObject);
        this.rateExtParams = jSONObject.getJSONObject("rateExtParams");
    }

    private List<Keywords> initKeywords(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("857593b8", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("keywords");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                arrayList.add(Keywords.a(jSONObject2));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(Rate rate, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Rate");
    }

    public List<Keywords> getKeywords() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("80669dc0", new Object[]{this});
        }
        return this.keywords;
    }

    public JSONObject getRateExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7dafdd78", new Object[]{this});
        }
        return this.rateExtParams;
    }
}
