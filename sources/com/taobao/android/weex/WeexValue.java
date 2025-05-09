package com.taobao.android.weex;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.f4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface WeexValue extends Serializable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Type {
        UNDEFINED,
        NULL,
        LONG,
        DOUBLE,
        BOOL,
        STRING,
        ARRAY,
        OBJECT,
        ARRAY_BUFFER,
        FUNCTION;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValue$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("982b2f03", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }
    }

    JSONArray getArray();

    byte[] getArrayBuffer();

    boolean getBool();

    double getDouble();

    int getFunctionID();

    int getInt();

    long getLong();

    JSONObject getObject();

    String getString();

    Type getType();

    Object getValue();

    boolean isArray();

    boolean isArrayBuffer();

    boolean isBool();

    boolean isDouble();

    boolean isInt();

    boolean isLong();

    boolean isNull();

    boolean isObject();

    boolean isString();

    boolean isUndefined();

    boolean isUndefinedOrNull();

    byte[] toArrayBufferOrNull();

    boolean toBoolValue() throws Exception;

    boolean toBoolValueSafe(boolean z);

    double toDoubleValue() throws Exception;

    double toDoubleValueSafe(double d);

    float toFloatValue() throws Exception;

    float toFloatValueSafe(float f);

    f4x toFunctionOrNull(WeexInstance weexInstance) throws Exception;

    int toIntValue() throws Exception;

    int toIntValueSafe(int i);

    JSONArray toJSONArrayOrNulSafe();

    JSONArray toJSONArrayOrNull() throws Exception;

    JSONObject toJSONObjectOrNull() throws Exception;

    JSONObject toJSONObjectOrNullSafe();

    String toJSONString();

    long toLongValue() throws Exception;

    long toLongValueSafe(long j);

    String toStringValue();

    String toStringValueOrNull();
}
