package com.taobao.android.ultronx.protocol;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import com.taobao.android.ultronx.json.JsonObjectX;
import tb.fr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UltronProtocol extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JsonObjectX mEndpoint;
    private JsonObjectX mGlobal;
    private JsonObjectX mHierarchyStructure;
    private JsonObjectX mLinkage;

    static {
        t2o.a(939524114);
    }

    public UltronProtocol(CPointer cPointer) {
        super(cPointer);
    }

    public static /* synthetic */ Object ipc$super(UltronProtocol ultronProtocol, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/protocol/UltronProtocol");
    }

    public native long _getEndpoint(long j);

    public native long _getGlobal(long j);

    public native long _getHierarchyStructure(long j);

    public native long _getLinkage(long j);

    public JsonObjectX getEndpoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonObjectX) ipChange.ipc$dispatch("1628b19b", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        JsonObjectX jsonObjectX = this.mEndpoint;
        if (jsonObjectX != null) {
            return jsonObjectX;
        }
        long _getEndpoint = _getEndpoint(j);
        if (_getEndpoint == 0) {
            return null;
        }
        JsonObjectX jsonObjectX2 = new JsonObjectX(new CPointer(_getEndpoint));
        this.mEndpoint = jsonObjectX2;
        return jsonObjectX2;
    }

    public JsonObjectX getGlobal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonObjectX) ipChange.ipc$dispatch("b4f8e929", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        JsonObjectX jsonObjectX = this.mGlobal;
        if (jsonObjectX != null) {
            return jsonObjectX;
        }
        long _getGlobal = _getGlobal(j);
        if (_getGlobal == 0) {
            return null;
        }
        JsonObjectX jsonObjectX2 = new JsonObjectX(new CPointer(_getGlobal));
        this.mGlobal = jsonObjectX2;
        return jsonObjectX2;
    }

    public JsonObjectX getHierarchyStructure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonObjectX) ipChange.ipc$dispatch("9a41c944", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        JsonObjectX jsonObjectX = this.mHierarchyStructure;
        if (jsonObjectX != null) {
            return jsonObjectX;
        }
        long _getHierarchyStructure = _getHierarchyStructure(j);
        if (_getHierarchyStructure == 0) {
            return null;
        }
        JsonObjectX jsonObjectX2 = new JsonObjectX(new CPointer(_getHierarchyStructure));
        this.mHierarchyStructure = jsonObjectX2;
        return jsonObjectX2;
    }

    public JsonObjectX getLinkage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonObjectX) ipChange.ipc$dispatch("fe9c091f", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        JsonObjectX jsonObjectX = this.mLinkage;
        if (jsonObjectX != null) {
            return jsonObjectX;
        }
        long _getLinkage = _getLinkage(j);
        if (_getLinkage == 0) {
            return null;
        }
        JsonObjectX jsonObjectX2 = new JsonObjectX(new CPointer(_getLinkage));
        this.mLinkage = jsonObjectX2;
        return jsonObjectX2;
    }
}
