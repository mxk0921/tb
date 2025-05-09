package com.taobao.android.weex_framework;

import android.os.AsyncTask;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import java.io.Serializable;
import java.util.concurrent.Executor;
import tb.dwh;
import tb.f7l;
import tb.k68;
import tb.pg1;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MUSValue implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARRAY_BUFFER = 9;
    public static final int FALSE = 6;
    public static final int FLOAT = 3;
    public static final int FUNCTION = 7;
    public static final int ID = 1;
    public static final int INT = 2;
    public static final int JSON_VALUE = 8;
    private static final String LOG_TAG = "MUSValue";
    public static final int NILL = 0;
    public static final int STRING = 4;
    public static final int TRUE = 5;
    private static final int TYPE_MAX = 10;
    private volatile JSON mCachedJSON;
    private final double mFloatValue;
    private final long mIntValue;
    private final Object mObjValue;
    private final int mType;
    private static String[] TYPE_NAMES = {"NILL", "ID", k68.TYPE_INT, "FLOAT", k68.TYPE_STRING, "TRUE", "FALSE", "FUNCTION", "JSON", "ARRAY_BUFFER"};
    private static final String STRING_CACHE_MARK = new String();
    private static final Runnable OOM_DETECTOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            System.gc();
            Log.e(dwh.TAG, "Weex OOM WTF detector alloc: " + new Object());
            synchronized (MUSValue.access$000()) {
                MUSValue.access$000().notify();
            }
            Log.e(dwh.TAG, "Weex OOM WTF detector finished");
        }
    }

    static {
        t2o.a(982516035);
    }

    public MUSValue(int i, long j, double d, Object obj) {
        String str;
        int i2 = i;
        int i3 = 0;
        if (i2 >= 10 || i2 < 0) {
            dwh.f(LOG_TAG, "Construct MUSValue of error type: " + i2);
            this.mType = 0;
            this.mIntValue = 0L;
            this.mFloatValue = vu3.b.GEO_NOT_SUPPORT;
            this.mObjValue = null;
            return;
        }
        if (i2 == 1) {
            String[] strArr = pg1.ARRAY;
            if (j >= strArr.length || j < 0) {
                dwh.f(LOG_TAG, "Construct MUSValue of error id: " + j);
                this.mType = 0;
                this.mIntValue = 0L;
                this.mFloatValue = vu3.b.GEO_NOT_SUPPORT;
                this.mObjValue = null;
                return;
            }
            str = strArr[(int) j];
            i2 = 4;
        } else {
            str = obj;
        }
        this.mType = ((i2 == 4 || i2 == 8 || i2 == 9) && str == null) ? i3 : i2;
        this.mIntValue = j;
        this.mFloatValue = d;
        this.mObjValue = str;
    }

    public static MUSValue CreateMUSValue(int i, long j, double d, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("85e20933", new Object[]{new Integer(i), new Long(j), new Double(d), obj});
        }
        try {
            try {
                return new MUSValue(i, j, d, obj);
            } catch (OutOfMemoryError unused) {
                Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                Runnable runnable = OOM_DETECTOR;
                executor.execute(runnable);
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (runnable) {
                    runnable.wait(10000L);
                    return null;
                }
            }
        } catch (Throwable th) {
            Log.e(dwh.TAG, "throwable", th);
            return null;
        }
    }

    public static /* synthetic */ Runnable access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("fae3e4bd", new Object[0]);
        }
        return OOM_DETECTOR;
    }

    private JSON getJSONValue() {
        Exception e;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("f967aef9", new Object[]{this});
        }
        if (this.mType == 8) {
            if (this.mCachedJSON == null) {
                try {
                    if (((String) this.mObjValue).startsWith("[")) {
                        try {
                            this.mCachedJSON = JSON.parseArray((String) this.mObjValue);
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                if (z) {
                                    this.mCachedJSON = JSON.parseObject((String) this.mObjValue);
                                } else {
                                    this.mCachedJSON = JSON.parseArray((String) this.mObjValue);
                                }
                            } catch (Exception unused) {
                                dwh.g(LOG_TAG, "getJSONValue err", e);
                            }
                            return this.mCachedJSON;
                        }
                    } else {
                        this.mCachedJSON = JSON.parseObject((String) this.mObjValue);
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                }
            }
            return this.mCachedJSON;
        }
        throw new IllegalStateException("Cant't getJSONValue from " + toString());
    }

    public static boolean isNill(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41e677d", new Object[]{mUSValue})).booleanValue();
        }
        if (mUSValue == null || mUSValue.getType() == 0) {
            return true;
        }
        return false;
    }

    public static MUSValue ofArrayBuffer(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("be5752d3", new Object[]{bArr});
        }
        if (bArr == null) {
            return ofNill();
        }
        return new MUSValue(9, 0L, vu3.b.GEO_NOT_SUPPORT, bArr);
    }

    public static MUSValue ofBool(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("f4ae9697", new Object[]{new Boolean(z)});
        }
        if (z) {
            i = 5;
        } else {
            i = 6;
        }
        return new MUSValue(i, 0L, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofFloat(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("1b29e78f", new Object[]{new Float(f)}) : new MUSValue(3, 0L, f, null);
    }

    public static MUSValue ofFunction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("8c3f8076", new Object[]{new Integer(i)});
        }
        return new MUSValue(7, i, vu3.b.GEO_NOT_SUPPORT, "");
    }

    public static MUSValue ofID(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("eeefecd9", new Object[]{new Integer(i)});
        }
        return new MUSValue(1, i, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("bf54fa3f", new Object[]{new Integer(i)}) : new MUSValue(2, i, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("479c24a1", new Object[]{obj});
        }
        if (obj == null) {
            return ofNill();
        }
        return new MUSValue(8, 0L, vu3.b.GEO_NOT_SUPPORT, JSON.toJSONString(obj));
    }

    public static MUSValue ofJSONArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("25ae51da", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return ofNill();
        }
        MUSValue mUSValue = new MUSValue(8, 0L, vu3.b.GEO_NOT_SUPPORT, STRING_CACHE_MARK);
        mUSValue.mCachedJSON = jSONArray;
        return mUSValue;
    }

    public static MUSValue ofJSONObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("653a0cf8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return ofNill();
        }
        MUSValue mUSValue = new MUSValue(8, 0L, vu3.b.GEO_NOT_SUPPORT, STRING_CACHE_MARK);
        mUSValue.mCachedJSON = jSONObject;
        return mUSValue;
    }

    public static MUSValue ofJSONStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("c0099520", new Object[]{str});
        }
        if (str == null) {
            return ofNill();
        }
        return new MUSValue(8, 0L, vu3.b.GEO_NOT_SUPPORT, str);
    }

    public static MUSValue ofNill() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("33f6586a", new Object[0]);
        }
        return new MUSValue(0, 0L, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public static MUSValue ofString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("6b6a8d8a", new Object[]{str});
        }
        if (str == null) {
            return ofNill();
        }
        return new MUSValue(4, 0L, vu3.b.GEO_NOT_SUPPORT, str);
    }

    public byte[] UNSAFE_getArrayBufferValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("96d7de01", new Object[]{this});
        }
        return (byte[]) this.mObjValue;
    }

    public double UNSAFE_getDoubleValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("718e8198", new Object[]{this})).doubleValue();
        }
        return this.mFloatValue;
    }

    public long UNSAFE_getLongValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec126c13", new Object[]{this})).longValue();
        }
        return this.mIntValue;
    }

    public String UNSAFE_getStringValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("480ad076", new Object[]{this});
        }
        if (this.mObjValue != STRING_CACHE_MARK || this.mCachedJSON == null) {
            return (String) this.mObjValue;
        }
        return this.mCachedJSON.toJSONString();
    }

    public float convertToFloat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a450e5", new Object[]{this})).floatValue();
        }
        int i = this.mType;
        if (i == 2) {
            return (float) this.mIntValue;
        }
        if (i == 3) {
            return (float) this.mFloatValue;
        }
        if (i == 4) {
            return Float.parseFloat((String) this.mObjValue);
        }
        throw new IllegalStateException("MUSValue can't convert to float, type: " + this.mType);
    }

    public int convertToInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c05da17b", new Object[]{this})).intValue();
        }
        int i = this.mType;
        if (i == 2) {
            return (int) this.mIntValue;
        }
        if (i == 3) {
            return (int) this.mFloatValue;
        }
        if (i == 4) {
            return (int) Float.parseFloat((String) this.mObjValue);
        }
        throw new IllegalStateException("MUSValue can't convert to float, type: " + this.mType);
    }

    public String convertToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("819f4b1a", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return "null";
            case 1:
            case 7:
                return "";
            case 2:
                return String.valueOf(this.mIntValue);
            case 3:
                return String.valueOf(this.mFloatValue);
            case 4:
                return (String) this.mObjValue;
            case 5:
                return "true";
            case 6:
                return "false";
            case 8:
                Object obj = this.mObjValue;
                if (obj == STRING_CACHE_MARK) {
                    return this.mCachedJSON.toJSONString();
                }
                return (String) obj;
            case 9:
                return this.mObjValue.toString();
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }

    public WeexValue convertWeex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("faa51697", new Object[]{this});
        }
        try {
            switch (this.mType) {
                case 0:
                    return WeexValueImpl.ofNull();
                case 1:
                case 2:
                    return WeexValueImpl.ofInt((int) this.mIntValue);
                case 3:
                    return WeexValueImpl.ofDouble(this.mFloatValue);
                case 4:
                    return WeexValueImpl.ofString((String) this.mObjValue);
                case 5:
                    return WeexValueImpl.ofBool(true);
                case 6:
                    return WeexValueImpl.ofBool(false);
                case 7:
                    return WeexValueImpl.ofFunction((int) this.mIntValue);
                case 8:
                    JSON jSONValue = getJSONValue();
                    if (jSONValue instanceof JSONArray) {
                        return WeexValueImpl.ofJSONArray((JSONArray) jSONValue);
                    }
                    return WeexValueImpl.ofJSONObject((JSONObject) jSONValue);
                case 9:
                    return WeexValueImpl.ofArrayBuffer(getArrayBuffer());
                default:
                    throw new IllegalStateException("convertWeex Invalid MUSValue type " + this.mType);
            }
        } catch (Throwable th) {
            dwh.g(LOG_TAG, "convertWeex err", th);
            return WeexValueImpl.ofNull();
        }
    }

    public byte[] getArrayBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("deaefc53", new Object[]{this});
        }
        if (this.mType == 9) {
            return (byte[]) this.mObjValue;
        }
        throw new IllegalStateException("Cant't getArrayBuffer from " + toString());
    }

    public boolean getBoolValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49703dfc", new Object[]{this})).booleanValue();
        }
        int i = this.mType;
        if (i != 5 && i != 6) {
            throw new IllegalStateException("Cant't getBool from " + toString());
        } else if (i == 5) {
            return true;
        } else {
            return false;
        }
    }

    public float getDoubleValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c562661", new Object[]{this})).floatValue();
        }
        if (this.mType == 3) {
            return (float) this.mFloatValue;
        }
        throw new IllegalStateException("Cant't getFloatValue from " + toString());
    }

    public float getFloatValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47eea762", new Object[]{this})).floatValue();
        }
        if (this.mType == 3) {
            return (float) this.mFloatValue;
        }
        throw new IllegalStateException("Cant't getFloatValue from " + toString());
    }

    public int getFunctionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9aaf7703", new Object[]{this})).intValue();
        }
        if (this.mType == 7) {
            return (int) this.mIntValue;
        }
        throw new IllegalStateException("Cant't getFunctionId from " + toString());
    }

    public int getID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c17beeb", new Object[]{this})).intValue();
        }
        if (this.mType == 1) {
            return (int) this.mIntValue;
        }
        throw new IllegalStateException("Cant't getID from " + toString());
    }

    public int getIntValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e178cb2", new Object[]{this})).intValue();
        }
        if (this.mType == 2) {
            return (int) this.mIntValue;
        }
        throw new IllegalStateException("Cant't getIntValue from " + toString());
    }

    public String getJSONStringValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76041c77", new Object[]{this});
        }
        if (this.mType == 8) {
            Object obj = this.mObjValue;
            if (obj == STRING_CACHE_MARK) {
                return this.mCachedJSON.toJSONString();
            }
            return (String) obj;
        }
        throw new IllegalStateException("Cant't getJSONStringValue from " + toString());
    }

    public long getLongValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("403a969a", new Object[]{this})).longValue();
        }
        if (this.mType == 2) {
            return this.mIntValue;
        }
        throw new IllegalStateException("Cant't getIntValue from " + toString());
    }

    public String getStringValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a666728f", new Object[]{this});
        }
        if (this.mType == 4) {
            return (String) this.mObjValue;
        }
        throw new IllegalStateException("Cant't getStringValue from " + toString());
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.mType;
    }

    public Object getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return null;
            case 1:
            case 2:
            case 7:
                return Long.valueOf(this.mIntValue);
            case 3:
                return Double.valueOf(this.mFloatValue);
            case 4:
                return this.mObjValue;
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.FALSE;
            case 8:
                return getJSONValue();
            case 9:
                return getArrayBuffer();
            default:
                throw new IllegalStateException("Invalid MUSValue type " + this.mType);
        }
    }

    public boolean isArrayBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38cc5d7a", new Object[]{this})).booleanValue();
        }
        if (this.mType == 9) {
            return true;
        }
        return false;
    }

    public boolean isFloat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8525add", new Object[]{this})).booleanValue();
        }
        if (this.mType == 3) {
            return true;
        }
        return false;
    }

    public boolean isFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue();
        }
        if (this.mType == 7) {
            return true;
        }
        return false;
    }

    public boolean isID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df2d8dd0", new Object[]{this})).booleanValue();
        }
        if (this.mType == 1) {
            return true;
        }
        return false;
    }

    public boolean isInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("520cd470", new Object[]{this})).booleanValue();
        }
        if (this.mType == 2) {
            return true;
        }
        return false;
    }

    public boolean isNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue();
        }
        if (this.mType == 0) {
            return true;
        }
        return false;
    }

    public boolean isString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
        }
        if (this.mType == 4) {
            return true;
        }
        return false;
    }

    public static MUSValue ofFloat(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("a83acc51", new Object[]{new Double(d)}) : new MUSValue(3, 0L, d, null);
    }

    public static MUSValue ofInt(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("78cc87de", new Object[]{new Long(j)}) : new MUSValue(2, j, vu3.b.GEO_NOT_SUPPORT, null);
    }

    public String printToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("452fd060", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return "null";
            case 1:
                return "ID(not support yet)";
            case 2:
                return String.valueOf(this.mIntValue);
            case 3:
                return String.valueOf(this.mFloatValue);
            case 4:
                return "\"" + ((String) this.mObjValue) + "\"";
            case 5:
                return "true";
            case 6:
                return "false";
            case 7:
                return String.format("function(%d)", Long.valueOf(this.mIntValue));
            case 8:
                Object obj = this.mObjValue;
                if (obj == STRING_CACHE_MARK) {
                    return this.mCachedJSON.toJSONString();
                }
                return (String) obj;
            case 9:
                return "array_buffer";
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }

    public String toShortString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16a01007", new Object[]{this});
        }
        switch (this.mType) {
            case 0:
                return "null";
            case 1:
                return "ID(not support yet)";
            case 2:
                return String.valueOf(this.mIntValue);
            case 3:
                return String.valueOf(this.mFloatValue);
            case 4:
                return "\"" + this.mObjValue + "\"";
            case 5:
                return "true";
            case 6:
                return "false";
            case 7:
                return String.format("func(%d)", Long.valueOf(this.mIntValue));
            case 8:
                Object obj = this.mObjValue;
                if (obj != STRING_CACHE_MARK) {
                    return String.format("json(%s)", obj);
                }
                String jSONString = this.mCachedJSON.toJSONString();
                return "json(" + jSONString + f7l.BRACKET_END_STR;
            case 9:
                int length = ((byte[]) this.mObjValue).length;
                return "array_buffer(" + length + f7l.BRACKET_END_STR;
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.mType;
        switch (i) {
            case 0:
            case 5:
            case 6:
                String str = TYPE_NAMES[i];
                return "{" + str + "}";
            case 1:
            case 2:
            case 7:
                return String.format("{%s, %d}", TYPE_NAMES[i], Long.valueOf(this.mIntValue));
            case 3:
                return String.format("{%s : %f}", TYPE_NAMES[i], Double.valueOf(this.mFloatValue));
            case 4:
                return String.format("{%s : %s}", TYPE_NAMES[i], this.mObjValue);
            case 8:
                Object obj = this.mObjValue;
                if (obj != STRING_CACHE_MARK) {
                    return String.format("{%s : %s}", TYPE_NAMES[i], obj);
                }
                String str2 = TYPE_NAMES[i];
                String jSONString = this.mCachedJSON.toJSONString();
                return "{" + str2 + " : " + jSONString + "}";
            case 9:
                String str3 = TYPE_NAMES[i];
                String obj2 = this.mObjValue.toString();
                return "{" + str3 + " : " + obj2 + "}";
            default:
                throw new IllegalStateException("MUSValue err type: " + this.mType);
        }
    }
}
