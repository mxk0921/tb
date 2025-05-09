package com.alibaba.android.icart.core.data.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.lcu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_ID = "instanceId";
    public static final String NO_CACHE_OF_FIRST_PAGE = "noCacheOfFirstPage";
    public static final String sKeyRequestTimestamp = "requestTimeStamp";

    /* renamed from: a  reason: collision with root package name */
    public IDMComponent f2191a;
    public lcu b;
    public Object c;
    public Map<String, String> d;
    public RequestType e;
    public boolean f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public MtopResponse k;
    public long l;
    public boolean m;
    public int n = 0;
    public long o = -1;
    public static final String IS_PRE_LOADV2 = "isPreLoadV2";
    public static final String IS_POP_LAYER_FIRST_PAGE = "isPopLayerFirstPage";
    public static final String IS_POP_LAYE_RQUERY = "isPopLayerRequest";
    public static final String CHECKED_COUNT = "checkedCount";
    public static final String IS_FULL_DATA_QUERY = "isFullDataQuery";
    public static final String IS_ICART_CHANGE_MODE = "iCartChangeMode";
    public static final String IS_ICART_IS_FIRST_REQUEST = "isFirstRequest";
    public static final String CUSTOM_EXPARAMS = "customExParams";
    public static final String FIRST_PAGE_PRELOAD = "firstPagePreLoad";
    public static final String IS_SUPPORT_WIDGET = "isSupportWidget";
    public static final String IS_WIDGET_INSTALLED = "isWidgetInstalled";
    public static final List<String> p = new ArrayList(Arrays.asList(IS_PRE_LOADV2, IS_POP_LAYER_FIRST_PAGE, IS_POP_LAYE_RQUERY, CHECKED_COUNT, IS_FULL_DATA_QUERY, IS_ICART_CHANGE_MODE, IS_ICART_IS_FIRST_REQUEST, CUSTOM_EXPARAMS, FIRST_PAGE_PRELOAD, IS_SUPPORT_WIDGET, IS_WIDGET_INSTALLED));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum RequestType {
        LOAD_CACHE_DATA,
        QUERY_CART_PAGE,
        QUERY_CART_NEXT_PAGE,
        UPDATE,
        UPDATE_STRUCTURE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RequestType requestType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/RequestConfig$RequestType");
        }

        public static RequestType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestType) ipChange.ipc$dispatch("58946287", new Object[]{str});
            }
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }
    }

    static {
        t2o.a(479199299);
    }

    public static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb1ee15b", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (((ArrayList) p).contains(str)) {
                hashMap.put(str, map.get(str));
            }
        }
        return hashMap;
    }

    public RequestConfig A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("d5ca0afb", new Object[]{this, new Boolean(z)});
        }
        this.j = z;
        return this;
    }

    public RequestConfig B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("dd29b800", new Object[]{this, obj});
        }
        this.c = obj;
        return this;
    }

    public RequestConfig C(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("c1bcd611", new Object[]{this, new Long(j)});
        }
        this.o = j;
        return this;
    }

    public RequestConfig D(RequestType requestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("9d5cc12d", new Object[]{this, requestType});
        }
        this.e = requestType;
        return this;
    }

    public void E(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
        } else {
            this.l = j;
        }
    }

    public RequestConfig F(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("ade57451", new Object[]{this, lcuVar});
        }
        this.b = lcuVar;
        return this;
    }

    public IDMComponent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("80a38852", new Object[]{this});
        }
        return this.f2191a;
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62345009", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60675578", new Object[]{this});
        }
        return this.g;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be3cf212", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public MtopResponse f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("5c6f0275", new Object[]{this});
        }
        return this.k;
    }

    public Object g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("340f8235", new Object[]{this});
        }
        return this.c;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fa32c98", new Object[]{this})).longValue();
        }
        return this.o;
    }

    public RequestType i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestType) ipChange.ipc$dispatch("1b9cf2a6", new Object[]{this});
        }
        return this.e;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.l;
    }

    public lcu k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("4c248d98", new Object[]{this});
        }
        return this.b;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("222ae560", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3db85b", new Object[]{this})).booleanValue();
        }
        if (this.e == RequestType.LOAD_CACHE_DATA) {
            return true;
        }
        return false;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e10043d", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f16fd4e3", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa683b66", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea4816fc", new Object[]{this})).booleanValue();
        }
        RequestType requestType = this.e;
        if (requestType == RequestType.QUERY_CART_PAGE || requestType == RequestType.QUERY_CART_NEXT_PAGE || m()) {
            return true;
        }
        return false;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93bacb07", new Object[]{this})).booleanValue();
        }
        RequestType requestType = this.e;
        if (requestType == RequestType.UPDATE || requestType == RequestType.UPDATE_STRUCTURE) {
            return true;
        }
        return false;
    }

    public RequestConfig s(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("542ab613", new Object[]{this, iDMComponent});
        }
        this.f2191a = iDMComponent;
        return this;
    }

    public RequestConfig t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("876ef6a0", new Object[]{this, map});
        }
        this.d = map;
        return this;
    }

    public RequestConfig u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("bcc16875", new Object[]{this, new Boolean(z)});
        }
        this.h = z;
        return this;
    }

    public RequestConfig v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("483c9b12", new Object[]{this, new Boolean(z)});
        }
        this.f = z;
        return this;
    }

    public RequestConfig w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("e2262f67", new Object[]{this, str});
        }
        this.g = str;
        return this;
    }

    public RequestConfig x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("d6fbf06d", new Object[]{this, new Integer(i)});
        }
        this.n = i;
        return this;
    }

    public void y(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7d11f7", new Object[]{this, mtopResponse});
        } else {
            this.k = mtopResponse;
        }
    }

    public RequestConfig z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestConfig) ipChange.ipc$dispatch("b76ea5a8", new Object[]{this, new Boolean(z)});
        }
        this.i = z;
        return this;
    }
}
