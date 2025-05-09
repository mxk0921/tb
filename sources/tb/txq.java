package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.common.EffectType;
import com.taobao.android.artry.constants.ARType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class txq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_SUPPORT_RESULT_KEY = "isAllSupport";
    public static final String EFFECT_TYPE_KEY = "effect_type";
    public static final String ENGINE_TYPE_KEY = "engine_type";
    public static final String IN_EXTRA_DATA_KEY = "inExtraData";
    public static final String IS_SUPPORT_KEY = "isSupport";
    public static final String OUT_EXTRA_DATA = "outExtraData";
    public static final String QUERY_CODES_KEY = "queryCodes";
    public static final String QUERY_CODE_KEY = "queryCode";
    public static final String RETURN_EFFECT_LIST_KEY = "return_support_effect_list";
    public static final String SUPPORT_EFFECT_LIST_KEY = "support_effect_list";
    public static final String SUPPORT_RESULTS_KEY = "supportResults";

    /* renamed from: a  reason: collision with root package name */
    public static final String f29022a = txq.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$artry$constants$ARType;

        static {
            int[] iArr = new int[ARType.values().length];
            $SwitchMap$com$taobao$android$artry$constants$ARType = iArr;
            try {
                iArr[ARType.MAKEUP_WANMEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        t2o.a(396361783);
    }

    public static JSONArray a(ARType aRType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c877b51a", new Object[]{aRType});
        }
        JSONArray jSONArray = new JSONArray();
        if (aRType == null) {
            return jSONArray;
        }
        if (a.$SwitchMap$com$taobao$android$artry$constants$ARType[aRType.ordinal()] == 1) {
            for (EffectType effectType : EffectType.values()) {
                jSONArray.add(effectType.name());
            }
        }
        return jSONArray;
    }

    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        ARType aRType;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3079965b", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        EffectType effectType = null;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.getString(ENGINE_TYPE_KEY);
        }
        if (jSONObject == null) {
            str2 = null;
        } else {
            str2 = jSONObject.getString(EFFECT_TYPE_KEY);
        }
        try {
            aRType = ARType.valueOf(str);
        } catch (Throwable unused) {
            aRType = null;
        }
        if (aRType != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && a.$SwitchMap$com$taobao$android$artry$constants$ARType[aRType.ordinal()] == 1) {
            try {
                effectType = EffectType.valueOf(str2);
            } catch (Throwable unused2) {
            }
            if (effectType != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            z &= z3;
        }
        if (jSONObject != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!jSONObject.containsKey(EFFECT_TYPE_KEY) && !jSONObject.containsKey(ENGINE_TYPE_KEY)) {
                z4 = false;
            }
            z2 &= z4;
        }
        if (z2) {
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put(EFFECT_TYPE_KEY, (Object) jSONObject.getString(EFFECT_TYPE_KEY));
            jSONObject2.put(ENGINE_TYPE_KEY, (Object) jSONObject.getString(ENGINE_TYPE_KEY));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson.JSONObject b(boolean r4, int r5, com.alibaba.fastjson.JSONObject r6) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.txq.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0025
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r4)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r3 = 0
            r5[r3] = r2
            r5[r0] = r4
            r4 = 2
            r5[r4] = r6
            java.lang.String r4 = "73258475"
            java.lang.Object r4 = r1.ipc$dispatch(r4, r5)
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4
            return r4
        L_0x0025:
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r3 = "queryCode"
            r1.put(r3, r2)
            r2 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r3 = "isSupport"
            if (r5 == r2) goto L_0x0095
            r2 = 3001(0xbb9, float:4.205E-42)
            if (r5 == r2) goto L_0x008c
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r5 == r2) goto L_0x0083
            switch(r5) {
                case 1000: goto L_0x0095;
                case 1001: goto L_0x0095;
                case 1002: goto L_0x0095;
                case 1003: goto L_0x007b;
                case 1004: goto L_0x0072;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r5) {
                case 2000: goto L_0x0058;
                case 2001: goto L_0x0058;
                case 2002: goto L_0x004f;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.put(r3, r4)
            goto L_0x009a
        L_0x004f:
            r4 = r4 ^ r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r4)
            goto L_0x009a
        L_0x0058:
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            r4.<init>()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r5 != r0) goto L_0x0066
            boolean r5 = d(r6, r4)
            goto L_0x006a
        L_0x0066:
            boolean r5 = e(r6, r4)
        L_0x006a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1.put(r3, r5)
            goto L_0x009b
        L_0x0072:
            r4 = r4 ^ r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r4)
            goto L_0x009a
        L_0x007b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r4)
            goto L_0x009a
        L_0x0083:
            r4 = r4 ^ r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r4)
            goto L_0x009a
        L_0x008c:
            r4 = r4 ^ r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r4)
            goto L_0x009a
        L_0x0095:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r1.put(r3, r4)
        L_0x009a:
            r4 = 0
        L_0x009b:
            if (r4 == 0) goto L_0x00a3
            java.lang.String r5 = "outExtraData"
            r1.put(r5, r4)
        L_0x00a3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.txq.b(boolean, int, com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson.JSONObject c(boolean r11, com.alibaba.fastjson.JSONObject r12) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.txq.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r11)
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r1] = r3
            r11[r0] = r12
            java.lang.String r12 = "e7360c08"
            java.lang.Object r11 = r2.ipc$dispatch(r12, r11)
            com.alibaba.fastjson.JSONObject r11 = (com.alibaba.fastjson.JSONObject) r11
            return r11
        L_0x001d:
            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject
            r2.<init>()
            java.lang.String r3 = "isAllSupport"
            if (r12 == 0) goto L_0x00cd
            java.lang.String r4 = "queryCodes"
            com.alibaba.fastjson.JSONArray r12 = r12.getJSONArray(r4)
            boolean r4 = tb.dxv.h(r12)
            if (r4 == 0) goto L_0x0036
            goto L_0x00cd
        L_0x0036:
            com.alibaba.fastjson.JSONArray r4 = new com.alibaba.fastjson.JSONArray
            int r5 = r12.size()
            r4.<init>(r5)
            java.util.Iterator r12 = r12.iterator()
        L_0x0043:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00bf
            java.lang.Object r5 = r12.next()
            if (r5 == 0) goto L_0x0043
            boolean r6 = r5 instanceof com.alibaba.fastjson.JSONObject
            if (r6 != 0) goto L_0x0054
            goto L_0x0043
        L_0x0054:
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            java.lang.String r6 = "queryCode"
            java.lang.Object r7 = r5.get(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r8 = java.lang.Integer.parseInt(r7)     // Catch: all -> 0x0066
            goto L_0x007f
        L_0x0066:
            java.lang.String r8 = tb.txq.f29022a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "could not parse the queryCode["
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r10 = "]..."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r8, r9)
            r8 = -1
        L_0x007f:
            java.lang.String r9 = "inExtraData"
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r9)
            if (r8 <= 0) goto L_0x0095
            com.alibaba.fastjson.JSONObject r5 = b(r11, r8, r5)     // Catch: all -> 0x008d
            goto L_0x0096
        L_0x008d:
            java.lang.String r5 = tb.txq.f29022a
            java.lang.String r8 = "some exceptions happened, when invoking isSupport method..."
            android.util.Log.e(r5, r8)
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 != 0) goto L_0x009d
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
        L_0x009d:
            boolean r8 = r5.containsKey(r6)
            if (r8 != 0) goto L_0x00a6
            r5.put(r6, r7)
        L_0x00a6:
            java.lang.String r6 = "isSupport"
            boolean r7 = r5.containsKey(r6)
            if (r7 != 0) goto L_0x00b4
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r5.put(r6, r7)
        L_0x00b4:
            boolean r6 = r5.getBooleanValue(r6)
            if (r6 != 0) goto L_0x00bb
            r0 = 0
        L_0x00bb:
            r4.add(r5)
            goto L_0x0043
        L_0x00bf:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r11)
            java.lang.String r11 = "supportResults"
            r2.put(r11, r4)
            return r2
        L_0x00cd:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r2.put(r3, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.txq.c(boolean, com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55c665cc", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        ARType aRType = null;
        String string = jSONObject == null ? null : jSONObject.getString(ENGINE_TYPE_KEY);
        boolean booleanValue = jSONObject == null ? false : jSONObject.getBooleanValue(RETURN_EFFECT_LIST_KEY);
        try {
            aRType = ARType.valueOf(string);
        } catch (Throwable unused) {
        }
        if (aRType == null) {
            z = false;
        }
        if (aRType == ARType.MAKEUP_WANMEI && booleanValue) {
            jSONObject2.put(SUPPORT_EFFECT_LIST_KEY, (Object) a(aRType));
        }
        return z;
    }
}
