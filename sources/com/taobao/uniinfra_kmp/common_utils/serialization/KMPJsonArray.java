package com.taobao.uniinfra_kmp.common_utils.serialization;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "Lcom/alibaba/fastjson/JSONArray;", "", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArrayNativePayload;", "payload", "<init>", "(Lcom/alibaba/fastjson/JSONArray;)V", "", "toJsonString", "()Ljava/lang/String;", "anObject", "", "add", "(Ljava/lang/Object;)Z", "", "index", "Ltb/xhv;", "(ILjava/lang/Object;)V", "getInt", "(I)Ljava/lang/Integer;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getJsonObject", "(I)Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getJsonArray", "(I)Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "nativePayload", "()Ljava/lang/Object;", "removeAt", "(I)Ljava/lang/Boolean;", "", "toList", "()Ljava/util/List;", "getSize", "()I", "size", "common_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class KMPJsonArray extends JSONArray {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701704);
        t2o.a(1029701711);
    }

    public KMPJsonArray() {
        this(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(KMPJsonArray kMPJsonArray, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -744798299:
                return super.toJSONString();
            case -509383267:
                return super.getJSONArray(((Number) objArr[0]).intValue());
            case -475350822:
                return super.remove(((Number) objArr[0]).intValue());
            case 195222152:
                return new Boolean(super.add(objArr[0]));
            case 497758839:
                super.add(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 845773819:
                return new Integer(super.size());
            case 1482398075:
                return super.getInteger(((Number) objArr[0]).intValue());
            case 2140714623:
                return super.getJSONObject(((Number) objArr[0]).intValue());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray");
        }
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, obj})).booleanValue() : super.add(obj);
    }

    public final Integer getInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d55d76aa", new Object[]{this, new Integer(i)});
        }
        return super.getInteger(i);
    }

    public final KMPJsonArray getJsonArray(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonArray) ipChange.ipc$dispatch("113b792b", new Object[]{this, new Integer(i)});
        }
        JSONArray jSONArray = super.getJSONArray(i);
        if (jSONArray != null) {
            return new KMPJsonArray(jSONArray);
        }
        return null;
    }

    public final KMPJsonObject getJsonObject(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("b0a326f5", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = super.getJSONObject(i);
        if (jSONObject != null) {
            return new KMPJsonObject(jSONObject);
        }
        return null;
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return super.size();
    }

    public Object nativePayload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("27378074", new Object[]{this});
        }
        return this;
    }

    public Boolean removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("88b12022", new Object[]{this, new Integer(i)});
        }
        super.remove(i);
        return Boolean.TRUE;
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public final String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        return super.toJSONString();
    }

    public final List<Object> toList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9a521c87", new Object[]{this});
        }
        return this;
    }

    public KMPJsonArray(JSONArray jSONArray) {
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                super.add(jSONArray.get(i));
            }
        }
    }

    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public void add(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dab3277", new Object[]{this, new Integer(i), obj});
        } else {
            super.add(i, obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, boolean] */
    @Override // com.alibaba.fastjson.JSONArray, java.util.List
    public final /* bridge */ Object remove(int i) {
        return removeAt(i).booleanValue();
    }

    public /* synthetic */ KMPJsonArray(JSONArray jSONArray, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : jSONArray);
    }
}
