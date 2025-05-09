package com.taobao.android.weex;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex_framework.MUSValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import tb.dwh;
import tb.f4x;
import tb.g4x;
import tb.p9x;
import tb.pg1;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class WeexValueImpl implements WeexValue, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "WeexValueImpl";
    private final WeexValue.Type mType;
    private static final WeexValueImpl UNDEFINED = new WeexValueUndefinedImpl();
    private static final WeexValueImpl NULL = new WeexValueNullImpl();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueArrayBufferImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final byte[] mValue;

        static {
            t2o.a(982515823);
        }

        public WeexValueArrayBufferImpl(byte[] bArr) {
            super(WeexValue.Type.ARRAY_BUFFER, null);
            this.mValue = bArr;
        }

        public static /* synthetic */ Object ipc$super(WeexValueArrayBufferImpl weexValueArrayBufferImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueArrayBufferImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to JSONArray");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return "null";
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert ArrayBuffer to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return "[WeexValue ArrayBuffer]";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueArrayImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final JSONArray mValue;

        static {
            t2o.a(982515824);
        }

        public WeexValueArrayImpl(JSONArray jSONArray) {
            super(WeexValue.Type.ARRAY, null);
            this.mValue = jSONArray;
        }

        public static /* synthetic */ Object ipc$super(WeexValueArrayImpl weexValueArrayImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueArrayImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert JSONArray to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return this.mValue.toJSONString();
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert JSONArray to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return this.mValue.toJSONString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueBoolImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean mValue;
        public static final WeexValueBoolImpl TRUE = new WeexValueBoolImpl(true);
        public static final WeexValueBoolImpl FALSE = new WeexValueBoolImpl(false);

        static {
            t2o.a(982515825);
        }

        public WeexValueBoolImpl(boolean z) {
            super(WeexValue.Type.BOOL, null);
            this.mValue = z;
        }

        public static /* synthetic */ Object ipc$super(WeexValueBoolImpl weexValueBoolImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueBoolImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return Boolean.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert bool to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert bool to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert bool to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert bool to JSONArray");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert bool to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return String.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert bool to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return String.valueOf(this.mValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueDoubleImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double mValue;

        static {
            t2o.a(982515826);
        }

        public WeexValueDoubleImpl(double d) {
            super(WeexValue.Type.DOUBLE, null);
            this.mValue = d;
        }

        public static /* synthetic */ Object ipc$super(WeexValueDoubleImpl weexValueDoubleImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueDoubleImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return Double.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            if (this.mValue != vu3.b.GEO_NOT_SUPPORT) {
                return true;
            }
            return false;
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            return (float) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            return (int) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert double to JSONArray");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert double to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return JSON.toJSONString(Double.valueOf(this.mValue));
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            return (long) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return String.valueOf(this.mValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueLongImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final long mValue;

        static {
            t2o.a(982515827);
        }

        public WeexValueLongImpl(WeexValue.Type type, long j) {
            super(type, null);
            this.mValue = j;
        }

        public static /* synthetic */ Object ipc$super(WeexValueLongImpl weexValueLongImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueLongImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return Long.valueOf(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            if (this.mValue != 0) {
                return true;
            }
            return false;
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            return (float) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            return (int) this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert long to JSONArray");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert long to JSONObject");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return JSON.toJSONString(Long.valueOf(this.mValue));
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return String.valueOf(this.mValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueNullImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(982515828);
        }

        public WeexValueNullImpl() {
            super(WeexValue.Type.NULL, null);
        }

        public static /* synthetic */ Object ipc$super(WeexValueNullImpl weexValueNullImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueNullImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert null to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert null to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert null to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert null to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return "null";
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert null to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return "null";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueObjectImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final JSONObject mValue;

        static {
            t2o.a(982515829);
        }

        public WeexValueObjectImpl(JSONObject jSONObject) {
            super(WeexValue.Type.OBJECT, null);
            this.mValue = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(WeexValueObjectImpl weexValueObjectImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueObjectImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            throw new IllegalArgumentException("can't convert JSONObject to JSONArray");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return this.mValue.toJSONString();
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert JSONObject to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return this.mValue.toJSONString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueStringImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String mValue;

        static {
            t2o.a(982515830);
        }

        public WeexValueStringImpl(String str) {
            super(WeexValue.Type.STRING, null);
            this.mValue = str;
        }

        public static /* synthetic */ Object ipc$super(WeexValueStringImpl weexValueStringImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueStringImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return this.mValue;
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            return Boolean.parseBoolean(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            return Double.parseDouble(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            return Float.parseFloat(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            return Integer.parseInt(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            return JSON.parseArray(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            return JSON.parseObject(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return JSON.toJSONString(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            return Long.parseLong(this.mValue);
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return this.mValue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class WeexValueUndefinedImpl extends WeexValueImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(982515831);
        }

        public WeexValueUndefinedImpl() {
            super(WeexValue.Type.UNDEFINED, null);
        }

        public static /* synthetic */ Object ipc$super(WeexValueUndefinedImpl weexValueUndefinedImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexValueImpl$WeexValueUndefinedImpl");
        }

        public static void preloadClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        @Override // com.taobao.android.weex.WeexValue
        public Object getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public boolean toBoolValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("624642f7", new Object[]{this})).booleanValue();
            }
            throw new IllegalArgumentException("can't convert undefined to bool");
        }

        @Override // com.taobao.android.weex.WeexValue
        public double toDoubleValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97bed89a", new Object[]{this})).doubleValue();
            }
            throw new IllegalArgumentException("can't convert undefined to double");
        }

        @Override // com.taobao.android.weex.WeexValue
        public float toFloatValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d941c7", new Object[]{this})).floatValue();
            }
            throw new IllegalArgumentException("can't convert undefined to float");
        }

        @Override // com.taobao.android.weex.WeexValue
        public int toIntValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3f7c57", new Object[]{this})).intValue();
            }
            throw new IllegalArgumentException("can't convert undefined to int");
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONArray toJSONArrayOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("912b34f7", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public JSONObject toJSONObjectOrNull() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2d004553", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            return "null";
        }

        @Override // com.taobao.android.weex.WeexValue
        public long toLongValue() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("59109b95", new Object[]{this})).longValue();
            }
            throw new IllegalArgumentException("can't convert undefined to long");
        }

        @Override // com.taobao.android.weex.WeexValue
        public String toStringValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("64d71db4", new Object[]{this});
            }
            return "undefined";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$weex$WeexValue$Type;

        static {
            int[] iArr = new int[WeexValue.Type.values().length];
            $SwitchMap$com$taobao$android$weex$WeexValue$Type = iArr;
            try {
                iArr[WeexValue.Type.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.BOOL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.ARRAY_BUFFER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$android$weex$WeexValue$Type[WeexValue.Type.FUNCTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        t2o.a(982515821);
        t2o.a(982515817);
    }

    public /* synthetic */ WeexValueImpl(WeexValue.Type type, a aVar) {
        this(type);
    }

    public static String ConvertAtomToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c7220d4", new Object[]{new Integer(i)});
        }
        try {
            String[] strArr = pg1.ARRAY;
            if (i < strArr.length && i >= 0) {
                return strArr[i];
            }
            dwh.f(LOG_TAG, "Construct MUSValue of error id: " + i);
            return null;
        } catch (Throwable th) {
            dwh.h(LOG_TAG, th);
            return null;
        }
    }

    public static void ConvertJavaToCpp(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa14dd4e", new Object[]{obj, new Long(j)});
            return;
        }
        try {
            createCppValue(obj, j);
        } catch (Throwable th) {
            dwh.h("WeexValue convert exception, value lost", th);
        }
    }

    public static WeexValueImpl convert(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("79456152", new Object[]{obj});
        }
        if (obj == null) {
            return ofNull();
        }
        if (obj instanceof WeexValueImpl) {
            return (WeexValueImpl) obj;
        }
        Class<?> cls = obj.getClass();
        if (String.class == cls) {
            return ofString((String) obj);
        }
        if (Integer.class == cls) {
            return ofInt(((Integer) obj).intValue());
        }
        if (Long.class == cls) {
            return ofLong(((Long) obj).longValue());
        }
        if (Float.class == cls) {
            return ofDouble(((Float) obj).floatValue());
        }
        if (Double.class == cls) {
            return ofDouble(((Double) obj).doubleValue());
        }
        if (Boolean.class == cls) {
            return ofBool(((Boolean) obj).booleanValue());
        }
        if (Map.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof String) {
                    jSONObject.put((String) key, value);
                }
            }
            return ofJSONObject(jSONObject);
        } else if (List.class.isAssignableFrom(cls)) {
            return ofJSONArray(new JSONArray((List) obj));
        } else {
            if (byte[].class == cls) {
                return ofArrayBuffer((byte[]) obj);
            }
            if (MUSValue.class == cls) {
                return (WeexValueImpl) ((MUSValue) obj).convertWeex();
            }
            return ofUndefined();
        }
    }

    private static void createCppValue(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9106b497", new Object[]{obj, new Long(j)});
        } else if (obj == null) {
            WeexPlatformCommonBridge.createCppNull(j);
        } else if (obj instanceof WeexValue) {
            WeexValue weexValue = (WeexValue) obj;
            switch (a.$SwitchMap$com$taobao$android$weex$WeexValue$Type[weexValue.getType().ordinal()]) {
                case 1:
                    WeexPlatformCommonBridge.createCppUndefined(j);
                    return;
                case 2:
                    WeexPlatformCommonBridge.createCppNull(j);
                    return;
                case 3:
                    WeexPlatformCommonBridge.createCppLong(weexValue.getLong(), j);
                    return;
                case 4:
                    WeexPlatformCommonBridge.createCppDouble(weexValue.getDouble(), j);
                    return;
                case 5:
                    WeexPlatformCommonBridge.createCppBoolean(weexValue.getBool(), j);
                    return;
                case 6:
                    WeexPlatformCommonBridge.createCppString(weexValue.getString(), j);
                    return;
                case 7:
                    p9x p9xVar = new p9x(weexValue.getArray());
                    if (p9xVar.p()) {
                        WeexPlatformCommonBridge.createCppValuePack(p9xVar.k(), p9xVar.l(), j);
                    } else {
                        WeexPlatformCommonBridge.createCppNull(j);
                    }
                    p9xVar.i();
                    return;
                case 8:
                    p9x p9xVar2 = new p9x(weexValue.getObject());
                    if (p9xVar2.p()) {
                        WeexPlatformCommonBridge.createCppValuePack(p9xVar2.k(), p9xVar2.l(), j);
                    } else {
                        WeexPlatformCommonBridge.createCppNull(j);
                    }
                    p9xVar2.i();
                    return;
                case 9:
                    WeexPlatformCommonBridge.createCppArrayBuffer(weexValue.getArrayBuffer(), j);
                    return;
                case 10:
                    WeexPlatformCommonBridge.createCppUndefined(j);
                    return;
                default:
                    WeexPlatformCommonBridge.createCppUndefined(j);
                    return;
            }
        } else {
            Class<?> cls = obj.getClass();
            if (String.class == cls) {
                WeexPlatformCommonBridge.createCppString((String) obj, j);
            } else if (Integer.class == cls) {
                WeexPlatformCommonBridge.createCppLong(((Integer) obj).intValue(), j);
            } else if (BigInteger.class == cls) {
                WeexPlatformCommonBridge.createCppLong(((BigInteger) obj).longValue(), j);
            } else if (Long.class == cls) {
                WeexPlatformCommonBridge.createCppLong(((Long) obj).longValue(), j);
            } else if (BigDecimal.class == cls) {
                WeexPlatformCommonBridge.createCppDouble(((BigDecimal) obj).doubleValue(), j);
            } else if (Float.class == cls) {
                WeexPlatformCommonBridge.createCppDouble(((Float) obj).floatValue(), j);
            } else if (Double.class == cls) {
                WeexPlatformCommonBridge.createCppDouble(((Double) obj).doubleValue(), j);
            } else if (Boolean.class == cls) {
                WeexPlatformCommonBridge.createCppBoolean(((Boolean) obj).booleanValue(), j);
            } else if (Map.class.isAssignableFrom(cls)) {
                p9x p9xVar3 = new p9x(obj);
                if (p9xVar3.p()) {
                    WeexPlatformCommonBridge.createCppValuePack(p9xVar3.k(), p9xVar3.l(), j);
                } else {
                    WeexPlatformCommonBridge.createCppNull(j);
                }
                p9xVar3.i();
            } else if (List.class.isAssignableFrom(cls)) {
                p9x p9xVar4 = new p9x(obj);
                if (p9xVar4.p()) {
                    WeexPlatformCommonBridge.createCppValuePack(p9xVar4.k(), p9xVar4.l(), j);
                } else {
                    WeexPlatformCommonBridge.createCppNull(j);
                }
                p9xVar4.i();
            } else if (byte[].class == cls) {
                WeexPlatformCommonBridge.createCppArrayBuffer((byte[]) obj, j);
            } else {
                try {
                    Object json = JSON.toJSON(obj);
                    if ((json instanceof JSONObject) || (json instanceof JSONArray)) {
                        createCppValue(json, j);
                    } else {
                        WeexPlatformCommonBridge.createCppUndefined(j);
                    }
                } catch (Exception unused) {
                    WeexPlatformCommonBridge.createCppUndefined(j);
                }
            }
        }
    }

    public static WeexValueImpl ofArrayBuffer(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("befcf36c", new Object[]{bArr});
        }
        if (bArr == null) {
            return ofNull();
        }
        return new WeexValueArrayBufferImpl(bArr);
    }

    public static WeexValueImpl ofBool(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("92d36528", new Object[]{new Boolean(z)});
        }
        if (z) {
            return WeexValueBoolImpl.TRUE;
        }
        return WeexValueBoolImpl.FALSE;
    }

    public static WeexValueImpl ofDouble(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("3e6e18b", new Object[]{new Double(d)});
        }
        return new WeexValueDoubleImpl(d);
    }

    public static WeexValueImpl ofFunction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("19818be9", new Object[]{new Integer(i)});
        }
        return new WeexValueLongImpl(WeexValue.Type.FUNCTION, i);
    }

    public static WeexValueImpl ofInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("f1d75880", new Object[]{new Integer(i)});
        }
        return new WeexValueLongImpl(WeexValue.Type.LONG, i);
    }

    public static WeexValueImpl ofJSON(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("89549ba6", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return ofNull();
        }
        return new WeexValueObjectImpl(jSONObject);
    }

    public static WeexValueImpl ofJSONArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("cbe66c05", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return ofNull();
        }
        return new WeexValueArrayImpl(jSONArray);
    }

    public static WeexValueImpl ofJSONObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("9f5db627", new Object[]{jSONObject});
        }
        return ofJSON(jSONObject);
    }

    public static WeexValueImpl ofLong(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("f6576246", new Object[]{new Long(j)});
        }
        return new WeexValueLongImpl(WeexValue.Type.LONG, j);
    }

    public static WeexValueImpl ofNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("45c1a981", new Object[0]);
        }
        return NULL;
    }

    public static WeexValueImpl ofString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("5bffa255", new Object[]{str});
        }
        if (str == null) {
            return ofNull();
        }
        return new WeexValueStringImpl(str);
    }

    public static WeexValueImpl ofUndefined() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("712280fc", new Object[0]);
        }
        return UNDEFINED;
    }

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
            return;
        }
        WeexValueUndefinedImpl.preloadClass();
        WeexValueNullImpl.preloadClass();
        WeexValueObjectImpl.preloadClass();
        WeexValueStringImpl.preloadClass();
        WeexValueArrayImpl.preloadClass();
        WeexValueArrayBufferImpl.preloadClass();
        WeexValueLongImpl.preloadClass();
        WeexValueDoubleImpl.preloadClass();
        WeexValueBoolImpl.preloadClass();
        WeexValue.Type.values();
    }

    public final MUSValue convertMUSValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("95c35143", new Object[]{this});
        }
        switch (a.$SwitchMap$com$taobao$android$weex$WeexValue$Type[this.mType.ordinal()]) {
            case 3:
                return MUSValue.ofInt(getLong());
            case 4:
                return MUSValue.ofFloat(getDouble());
            case 5:
                return MUSValue.ofBool(getBool());
            case 6:
                return MUSValue.ofString(getString());
            case 7:
                return MUSValue.ofJSONArray(getArray());
            case 8:
                return MUSValue.ofJSONObject(getObject());
            case 9:
                return MUSValue.ofArrayBuffer(getArrayBuffer());
            case 10:
                return MUSValue.ofFunction(getFunctionID());
            default:
                return null;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONArray getArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d4a9154", new Object[]{this});
        }
        if (this.mType == WeexValue.Type.ARRAY) {
            return ((WeexValueArrayImpl) this).mValue;
        }
        throw new IllegalStateException("Cant't getJSONArrayValue from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final byte[] getArrayBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("deaefc53", new Object[]{this});
        }
        if (this.mType == WeexValue.Type.ARRAY_BUFFER) {
            return ((WeexValueArrayBufferImpl) this).mValue;
        }
        throw new IllegalStateException("Cant't getArrayBuffer from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean getBool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f35277eb", new Object[]{this})).booleanValue();
        }
        if (this.mType != WeexValue.Type.BOOL) {
            throw new IllegalStateException("Cant't getBool from " + toString());
        } else if (this == WeexValueBoolImpl.TRUE) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final double getDouble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c9967bc", new Object[]{this})).doubleValue();
        }
        if (this.mType == WeexValue.Type.DOUBLE) {
            return ((WeexValueDoubleImpl) this).mValue;
        }
        throw new IllegalStateException("Cant't getDoubleValue from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final int getFunctionID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98ec86e3", new Object[]{this})).intValue();
        }
        if (this.mType == WeexValue.Type.FUNCTION) {
            return Long.valueOf(((WeexValueLongImpl) this).mValue).intValue();
        }
        throw new IllegalStateException("Cant't getFunctionValue from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final int getInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b268c8b3", new Object[]{this})).intValue();
        }
        if (this.mType == WeexValue.Type.LONG) {
            return (int) ((WeexValueLongImpl) this).mValue;
        }
        throw new IllegalStateException("Cant't getIntValue from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final long getLong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ea6d", new Object[]{this})).longValue();
        }
        if (this.mType == WeexValue.Type.LONG) {
            return ((WeexValueLongImpl) this).mValue;
        }
        throw new IllegalStateException("Cant't getLongValue from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONObject getObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5f3e35c", new Object[]{this});
        }
        if (this.mType == WeexValue.Type.OBJECT) {
            return ((WeexValueObjectImpl) this).mValue;
        }
        throw new IllegalStateException("Cant't getJSONArrayValue from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final String getString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06a652", new Object[]{this});
        }
        if (this.mType == WeexValue.Type.STRING) {
            return ((WeexValueStringImpl) this).mValue;
        }
        throw new IllegalStateException("Cant't getStringValue from " + toString());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final WeexValue.Type getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue.Type) ipChange.ipc$dispatch("57b208c5", new Object[]{this});
        }
        return this.mType;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c645a", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isArrayBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38cc5d7a", new Object[]{this})).booleanValue();
        }
        if (this.mType != WeexValue.Type.ARRAY_BUFFER) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isBool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("482fe1bf", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.BOOL) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isDouble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afc3aca6", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.DOUBLE) {
            return true;
        }
        return false;
    }

    public final boolean isFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.FUNCTION) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("520cd470", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.LONG) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isLong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55005451", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.LONG) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.NULL) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0ef6d14", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.OBJECT) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.STRING) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isUndefined() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("774314d1", new Object[]{this})).booleanValue();
        }
        if (this.mType == WeexValue.Type.UNDEFINED) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean isUndefinedOrNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9500ad7b", new Object[]{this})).booleanValue();
        }
        WeexValue.Type type = this.mType;
        if (type == WeexValue.Type.UNDEFINED || type == WeexValue.Type.NULL) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex.WeexValue
    public final byte[] toArrayBufferOrNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c0fc180e", new Object[]{this});
        }
        if (isUndefinedOrNull()) {
            return null;
        }
        return getArrayBuffer();
    }

    @Override // com.taobao.android.weex.WeexValue
    public final boolean toBoolValueSafe(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1434b8", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            return toBoolValue();
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final double toDoubleValueSafe(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9160f7f3", new Object[]{this, new Double(d)})).doubleValue();
        }
        try {
            return toDoubleValue();
        } catch (Exception unused) {
            return d;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final float toFloatValueSafe(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95c0992c", new Object[]{this, new Float(f)})).floatValue();
        }
        try {
            return toFloatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final f4x toFunctionOrNull(WeexInstance weexInstance) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("7980cd82", new Object[]{this, weexInstance});
        }
        if (isUndefinedOrNull()) {
            return null;
        }
        return new g4x(weexInstance, getFunctionID());
    }

    @Override // com.taobao.android.weex.WeexValue
    public final int toIntValueSafe(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ec9fa05", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            return toIntValue();
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONArray toJSONArrayOrNulSafe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9327967e", new Object[]{this});
        }
        try {
            return toJSONArrayOrNull();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final JSONObject toJSONObjectOrNullSafe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("174b3080", new Object[]{this});
        }
        try {
            return toJSONObjectOrNull();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final long toLongValueSafe(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8ebdcaa", new Object[]{this, new Long(j)})).longValue();
        }
        try {
            return toLongValue();
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // com.taobao.android.weex.WeexValue
    public final String toStringValueOrNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("836a398a", new Object[]{this});
        }
        if (isNull() || isUndefined()) {
            return null;
        }
        return toStringValue();
    }

    private WeexValueImpl(WeexValue.Type type) {
        this.mType = type;
    }
}
