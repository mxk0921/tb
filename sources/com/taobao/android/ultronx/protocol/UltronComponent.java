package com.taobao.android.ultronx.protocol;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultronx.base.CPointer;
import com.taobao.android.ultronx.json.JsonObjectX;
import tb.fr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UltronComponent extends fr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JsonObjectX mFields;
    private JsonObjectX mRaw;
    private String mTag;

    static {
        t2o.a(939524112);
    }

    public UltronComponent(CPointer cPointer) {
        super(cPointer);
    }

    public static /* synthetic */ Object ipc$super(UltronComponent ultronComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/protocol/UltronComponent");
    }

    public native long _getFields(long j);

    public native long _getRaw(long j);

    public native String _getTag(long j);

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

    public JsonObjectX getRaw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonObjectX) ipChange.ipc$dispatch("700bb582", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return null;
        }
        JsonObjectX jsonObjectX = this.mRaw;
        if (jsonObjectX != null) {
            return jsonObjectX;
        }
        long _getRaw = _getRaw(j);
        if (_getRaw == 0) {
            return null;
        }
        JsonObjectX jsonObjectX2 = new JsonObjectX(new CPointer(_getRaw));
        this.mRaw = jsonObjectX2;
        return jsonObjectX2;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        long j = this.mPointer.f9875a;
        if (j == 0) {
            return "";
        }
        if (this.mTag == null) {
            this.mTag = _getTag(j);
        }
        return this.mTag;
    }
}
