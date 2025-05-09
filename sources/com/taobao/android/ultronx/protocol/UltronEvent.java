package com.taobao.android.ultronx.protocol;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import com.taobao.android.ultronx.json.JsonObjectX;
import tb.fr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UltronEvent extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JsonObjectX mFields;
    private String mName;
    private String mType;

    static {
        t2o.a(939524113);
    }

    public UltronEvent(CPointer cPointer) {
        super(cPointer);
    }

    public static /* synthetic */ Object ipc$super(UltronEvent ultronEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/protocol/UltronEvent");
    }

    public native long _getFields(long j);

    public native String _getName(long j);

    public native String _getType(long j);

    public JsonObjectX getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonObjectX) ipChange.ipc$dispatch("9de6a03f", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        JsonObjectX jsonObjectX = this.mFields;
        if (jsonObjectX != null) {
            return jsonObjectX;
        }
        long _getFields = _getFields(j);
        if (_getFields == 0) {
            return null;
        }
        JsonObjectX jsonObjectX2 = new JsonObjectX(new CPointer(_getFields));
        this.mFields = jsonObjectX2;
        return jsonObjectX2;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return "";
        }
        if (this.mName == null) {
            this.mName = _getName(j);
        }
        return this.mName;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return "";
        }
        if (this.mType == null) {
            this.mType = _getType(j);
        }
        return this.mType;
    }
}
