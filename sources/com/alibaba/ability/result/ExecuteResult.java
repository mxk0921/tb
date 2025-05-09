package com.alibaba.ability.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.tsq;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ExecuteResult implements IAbilityResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DATA = "data";
    public static final String DEFAULT_TYPE = "result";
    public static final String ERR_CODE = "code";
    public static final String ERR_MSG = "msg";
    public static final String STATUS_CODE = "statusCode";
    public static final String TYPE = "type";
    private final Map<String, Object> data;
    public int mStatusCode;
    private final String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(144703594);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(144703593);
        t2o.a(144703597);
    }

    private ExecuteResult(Map<String, ? extends Object> map, String str) {
        this.data = map;
        this.type = str;
    }

    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.data;
    }

    public final int getStatusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        return this.mStatusCode;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public final boolean isFailure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("275e7d8b", new Object[]{this})).booleanValue();
        }
        if (this.mStatusCode > 99) {
            return true;
        }
        return false;
    }

    public final boolean isFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5fb8c68", new Object[]{this})).booleanValue();
        }
        if (this.mStatusCode == 99) {
            return true;
        }
        return false;
    }

    public final boolean isNone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24a67f0d", new Object[]{this})).booleanValue();
        }
        if (this.mStatusCode == 2) {
            return true;
        }
        return false;
    }

    public final boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        if (this.mStatusCode < 99) {
            return true;
        }
        return false;
    }

    public Map<String, Object> toFormattedData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f6bb7987", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (getData() != null) {
            hashMap.put("data", getData());
        }
        if (this.mStatusCode <= 99) {
            String type = getType();
            if (wsq.a0(type)) {
                type = "result";
            }
            hashMap.put("type", type);
        }
        hashMap.put("statusCode", Integer.valueOf(this.mStatusCode));
        return hashMap;
    }

    public /* synthetic */ ExecuteResult(Map map, String str, a07 a07Var) {
        this(map, str);
    }

    public /* synthetic */ ExecuteResult(Map map, String str, int i, a07 a07Var) {
        this(map, (i & 2) != 0 ? "result" : str);
    }

    public final String getModType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("243c6d93", new Object[]{this});
        }
        if (tsq.I(getType(), "on", false, 2, null)) {
            return getType();
        }
        StringBuilder sb = new StringBuilder("on");
        String type = getType();
        if (type != null) {
            String substring = type.substring(0, 1);
            ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String upperCase = substring.toUpperCase();
            ckf.f(upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String type2 = getType();
            if (type2 != null) {
                String substring2 = type2.substring(1);
                ckf.f(substring2, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                String sb2 = sb.toString();
                ckf.f(sb2, "StringBuilder().append(\"….substring(1)).toString()");
                return sb2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
