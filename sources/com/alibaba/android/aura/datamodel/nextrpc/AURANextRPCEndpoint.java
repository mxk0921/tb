package com.alibaba.android.aura.datamodel.nextrpc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.rk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURANextRPCEndpoint implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_RETRY_TIME = 1;
    private static final int INVALID_BIZID = -1;
    private int mAllTimeOutSeconds;
    private String mApi;
    private AttachedResponseStrategy mAttachedResponseStrategy;
    private int mBizId;
    private Map<String, String> mDataParams;
    private String mDomain;
    private boolean mMainThread;
    private boolean mNeedEncode;
    private boolean mNeedSession;
    private rk mNextRPCPrefetch;
    private String mPageUrl;
    private boolean mPostMethod;
    private MtopPrefetch.IPrefetchComparator mPrefetchComparator;
    private int mPrefetchMode;
    private Map<String, String> mRequestHeaders;
    private int mRetryTime;
    private int mSingleRequestTimeout;
    private int mSocketTimeoutMilliSecond;
    private boolean mStreamModel;
    private String mTTid;
    private String mTopic;
    private String mUnitStrategy;
    private boolean mUseWua;
    private String mVersion;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum AttachedResponseStrategy {
        IMMEDIATELY,
        FULL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AttachedResponseStrategy attachedResponseStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/datamodel/nextrpc/AURANextRPCEndpoint$AttachedResponseStrategy");
        }

        public static AttachedResponseStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttachedResponseStrategy) ipChange.ipc$dispatch("a039eb5a", new Object[]{str});
            }
            return (AttachedResponseStrategy) Enum.valueOf(AttachedResponseStrategy.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2132a;
        public String f;
        public String g;
        public Map<String, String> j;
        public Map<String, String> k;
        public String l;
        public String m;
        public int o;
        public int q;
        public String s;
        public rk t;
        public boolean u;
        public int v;
        public MtopPrefetch.IPrefetchComparator w;
        public String b = "1.0";
        public boolean c = true;
        public boolean d = false;
        public boolean e = true;
        public int h = -1;
        public boolean i = false;
        public final int n = 15000;
        public int p = 1;
        public boolean r = true;

        static {
            t2o.a(80740384);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2b79795d", new Object[]{aVar});
            }
            return aVar.f2132a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bfb413c", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("494f6bd6", new Object[]{aVar})).booleanValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("17b2eed", new Object[]{aVar});
            }
            return aVar.l;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e1fcf6cc", new Object[]{aVar});
            }
            return aVar.m;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5eca1288", new Object[]{aVar})).intValue();
            }
            return aVar.n;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65f2f4c9", new Object[]{aVar})).intValue();
            }
            return aVar.o;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6d1bd70a", new Object[]{aVar})).intValue();
            }
            return aVar.p;
        }

        public static /* synthetic */ AttachedResponseStrategy i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AttachedResponseStrategy) ipChange.ipc$dispatch("524a0ff9", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ int j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7b6d9b8c", new Object[]{aVar})).intValue();
            }
            return aVar.q;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("82967dde", new Object[]{aVar})).booleanValue();
            }
            return aVar.r;
        }

        public static /* synthetic */ rk l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rk) ipChange.ipc$dispatch("1b5fb30e", new Object[]{aVar});
            }
            return aVar.t;
        }

        public static /* synthetic */ Map m(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("87a4c79a", new Object[]{aVar});
            }
            return aVar.j;
        }

        public static /* synthetic */ String n(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50b09b0f", new Object[]{aVar});
            }
            return aVar.s;
        }

        public static /* synthetic */ boolean o(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2e6bb3f6", new Object[]{aVar})).booleanValue();
            }
            return aVar.u;
        }

        public static /* synthetic */ int p(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("35949626", new Object[]{aVar})).intValue();
            }
            return aVar.v;
        }

        public static /* synthetic */ MtopPrefetch.IPrefetchComparator q(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopPrefetch.IPrefetchComparator) ipChange.ipc$dispatch("cfc0b2d2", new Object[]{aVar});
            }
            return aVar.w;
        }

        public static /* synthetic */ Map r(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6d50241b", new Object[]{aVar});
            }
            return aVar.k;
        }

        public static /* synthetic */ String s(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad8098d9", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ String t(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8e0260b8", new Object[]{aVar});
            }
            return aVar.g;
        }

        public static /* synthetic */ boolean u(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4f25632d", new Object[]{aVar})).booleanValue();
            }
            return aVar.i;
        }

        public static /* synthetic */ boolean v(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("564e456e", new Object[]{aVar})).booleanValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ int w(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5d77279e", new Object[]{aVar})).intValue();
            }
            return aVar.h;
        }

        public static /* synthetic */ boolean x(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64a009f0", new Object[]{aVar})).booleanValue();
            }
            return aVar.d;
        }

        public a A(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34e959f4", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public AURANextRPCEndpoint B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURANextRPCEndpoint) ipChange.ipc$dispatch("af3e4ba4", new Object[]{this});
            }
            C();
            return new AURANextRPCEndpoint(this);
        }

        public final void C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63bd6235", new Object[]{this});
            } else if (this.f2132a == null) {
                throw new IllegalArgumentException("param api can not be null");
            } else if (this.b == null) {
                throw new IllegalArgumentException("param version can not be null");
            }
        }

        public a D(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a667aa4d", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a E(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f0008918", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public a F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("831aa4c1", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a G(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2e5dd995", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a H(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("957ba831", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public a I(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e083286a", new Object[]{this, map});
            }
            this.k = map;
            return this;
        }

        public a J(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d3e11896", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a K(rk rkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dbd51871", new Object[]{this, rkVar});
            }
            this.t = rkVar;
            return this;
        }

        public a L(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e82b4d5e", new Object[]{this, iPrefetchComparator});
            }
            this.w = iPrefetchComparator;
            return this;
        }

        public a M(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e1a026a0", new Object[]{this, new Integer(i)});
            }
            this.v = i;
            return this;
        }

        public a N(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e634719b", new Object[]{this, map});
            }
            this.j = map;
            return this;
        }

        public a O(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3448977b", new Object[]{this, new Integer(i)});
            }
            this.p = i;
            return this;
        }

        public a P(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("154e5039", new Object[]{this, new Integer(i)});
            }
            this.o = i;
            return this;
        }

        public a Q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bf7f4a7e", new Object[]{this, new Boolean(z)});
            }
            this.u = z;
            return this;
        }

        public a R(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("235d45c2", new Object[]{this, str});
            }
            this.s = str;
            return this;
        }

        public a S(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("224a1ed6", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public a T(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("32501eda", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a U(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf820b1", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a V(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3f8f6ab9", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a y(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3686cce5", new Object[]{this, new Integer(i)});
            }
            this.q = i;
            return this;
        }

        public a z(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2517cb7", new Object[]{this, str});
            }
            this.f2132a = str;
            return this;
        }
    }

    static {
        t2o.a(80740382);
    }

    public AURANextRPCEndpoint(a aVar) {
        this.mApi = "";
        this.mVersion = "1.0";
        this.mNeedSession = false;
        this.mNeedEncode = false;
        this.mDataParams = null;
        this.mPostMethod = true;
        this.mDomain = "";
        this.mUnitStrategy = "";
        this.mBizId = -1;
        this.mUseWua = false;
        this.mRequestHeaders = null;
        this.mRetryTime = 1;
        this.mMainThread = true;
        if (aVar != null) {
            this.mApi = a.a(aVar);
            this.mVersion = a.b(aVar);
            this.mRequestHeaders = a.m(aVar);
            this.mDataParams = a.r(aVar);
            this.mDomain = a.s(aVar);
            this.mUnitStrategy = a.t(aVar);
            this.mUseWua = a.u(aVar);
            this.mPostMethod = a.v(aVar);
            this.mBizId = a.w(aVar);
            this.mNeedSession = a.x(aVar);
            this.mNeedEncode = a.c(aVar);
            this.mTTid = a.d(aVar);
            this.mPageUrl = a.e(aVar);
            this.mSingleRequestTimeout = a.f(aVar);
            this.mSocketTimeoutMilliSecond = a.g(aVar);
            this.mRetryTime = a.h(aVar);
            this.mAttachedResponseStrategy = a.i(aVar);
            this.mAllTimeOutSeconds = a.j(aVar);
            this.mMainThread = a.k(aVar);
            this.mNextRPCPrefetch = a.l(aVar);
            this.mTopic = a.n(aVar);
            this.mStreamModel = a.o(aVar);
            this.mPrefetchMode = a.p(aVar);
            this.mPrefetchComparator = a.q(aVar);
        }
    }

    private JSONObject getJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a8ea448f", new Object[]{this, str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private void replaceMapValue(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ac5fc9", new Object[]{this, map, str, str2});
        } else if (map.containsKey(str)) {
            JSONObject json = getJson(str2);
            JSONObject json2 = getJson(map.get(str));
            if (json == null || json2 == null) {
                map.put(str, str2);
                return;
            }
            json2.putAll(json);
            map.put(str, json2.toJSONString());
        } else {
            map.put(str, str2);
        }
    }

    public void appendHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac539d92", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            Map<String, String> map2 = this.mRequestHeaders;
            if (map2 != null) {
                map2.putAll(map);
            } else {
                this.mRequestHeaders = map;
            }
        }
    }

    public void appendParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761956de", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            if (this.mDataParams != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        replaceMapValue(this.mDataParams, entry.getKey(), entry.getValue());
                    }
                }
                return;
            }
            this.mDataParams = map;
        }
    }

    public int getAllTimeOutSeconds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8066943", new Object[]{this})).intValue();
        }
        return this.mAllTimeOutSeconds;
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.mApi;
    }

    public AttachedResponseStrategy getAttachedResponseStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AttachedResponseStrategy) ipChange.ipc$dispatch("84c3eb36", new Object[]{this});
        }
        return this.mAttachedResponseStrategy;
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.mBizId;
    }

    public Map<String, String> getDataParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42c19ec2", new Object[]{this});
        }
        return this.mDataParams;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.mDomain;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        if (StringUtils.isBlank(this.mApi) || StringUtils.isBlank(this.mVersion)) {
            return null;
        }
        return StringUtils.concatStr2LowerCase(this.mApi, this.mVersion);
    }

    public rk getNextRPCPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rk) ipChange.ipc$dispatch("b20d2bef", new Object[]{this});
        }
        return this.mNextRPCPrefetch;
    }

    public String getPageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        return this.mPageUrl;
    }

    public MtopPrefetch.IPrefetchComparator getPrefetchComparator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.IPrefetchComparator) ipChange.ipc$dispatch("89482c5c", new Object[]{this});
        }
        return this.mPrefetchComparator;
    }

    public int getPrefetchMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93d69b2a", new Object[]{this})).intValue();
        }
        return this.mPrefetchMode;
    }

    public Map<String, String> getRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a1965029", new Object[]{this});
        }
        return this.mRequestHeaders;
    }

    public int getRetryTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue();
        }
        return this.mRetryTime;
    }

    public int getSocketTimeoutMilliSecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2f434c3", new Object[]{this})).intValue();
        }
        return this.mSocketTimeoutMilliSecond;
    }

    public boolean getStreamModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4755d55e", new Object[]{this})).booleanValue();
        }
        return this.mStreamModel;
    }

    public int getTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.mSingleRequestTimeout;
    }

    public String getTopic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.mTopic;
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return this.mTTid;
    }

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return this.mUnitStrategy;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.mVersion;
    }

    public boolean isNeedEncode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("597a70a1", new Object[]{this})).booleanValue();
        }
        return this.mNeedEncode;
    }

    public boolean isNeedSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a44321", new Object[]{this})).booleanValue();
        }
        return this.mNeedSession;
    }

    public boolean isPostMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a99b176", new Object[]{this})).booleanValue();
        }
        return this.mPostMethod;
    }

    public boolean isUseWua() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return this.mUseWua;
    }

    public boolean useMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return this.mMainThread;
    }
}
