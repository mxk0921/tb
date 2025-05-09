package com.taobao.weex.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXReflectionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661823);
    }

    public static Field getDeclaredField(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("7e82c4d4", new Object[]{obj, str});
        }
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object parseArgument(Type type, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b13a890", new Object[]{type, obj});
        }
        if (obj != null) {
            if (obj.getClass() == type) {
                return obj;
            }
            if ((type instanceof Class) && ((Class) type).isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        if (type != String.class) {
            Class<?> cls = Integer.TYPE;
            if (type != cls) {
                Class<?> cls2 = Long.TYPE;
                if (type != cls2) {
                    Class<?> cls3 = Double.TYPE;
                    if (type != cls3) {
                        Class<?> cls4 = Float.TYPE;
                        if (type == cls4) {
                            if (obj.getClass().isAssignableFrom(cls4)) {
                                return obj;
                            }
                            return Float.valueOf(WXUtils.getFloat(obj));
                        } else if (type == JSONArray.class && obj != null && obj.getClass() == JSONArray.class) {
                            return obj;
                        } else {
                            if (type == JSONObject.class && obj != null && obj.getClass() == JSONObject.class) {
                                return obj;
                            }
                            if (obj instanceof String) {
                                str = (String) obj;
                            } else {
                                str = JSON.toJSONString(obj);
                            }
                            return JSON.parseObject(str, type, new Feature[0]);
                        }
                    } else if (obj.getClass().isAssignableFrom(cls3)) {
                        return obj;
                    } else {
                        return Double.valueOf(WXUtils.getDouble(obj));
                    }
                } else if (obj.getClass().isAssignableFrom(cls2)) {
                    return obj;
                } else {
                    return Long.valueOf(WXUtils.getLong(obj));
                }
            } else if (obj.getClass().isAssignableFrom(cls)) {
                return obj;
            } else {
                return Integer.valueOf(WXUtils.getInt(obj));
            }
        } else if (obj instanceof String) {
            return obj;
        } else {
            return JSON.toJSONString(obj);
        }
    }

    public static void setProperty(Object obj, Field field, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj != null && field != null) {
            try {
                field.setAccessible(true);
                field.set(obj, obj2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: Exception -> 0x00c3, TryCatch #0 {Exception -> 0x00c3, blocks: (B:9:0x0022, B:12:0x002c, B:14:0x0030, B:16:0x0034, B:18:0x003c, B:21:0x0045, B:23:0x004d, B:26:0x0056, B:28:0x005e, B:31:0x0067, B:33:0x006d, B:37:0x0078, B:38:0x0081, B:39:0x008f, B:40:0x009c, B:41:0x00a8, B:43:0x00b0, B:46:0x00b8, B:47:0x00c0), top: B:50:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setValue(java.lang.Object r4, java.lang.String r5, java.lang.Object r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weex.utils.WXReflectionUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "8de60fb8"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            if (r4 == 0) goto L_0x00c3
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0022
            goto L_0x00c3
        L_0x0022:
            java.lang.reflect.Field r5 = getDeclaredField(r4, r5)     // Catch: Exception -> 0x00c3
            boolean r0 = r6 instanceof java.math.BigDecimal     // Catch: Exception -> 0x00c3
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof java.lang.Number     // Catch: Exception -> 0x00c3
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof java.lang.String     // Catch: Exception -> 0x00c3
            if (r0 == 0) goto L_0x0076
        L_0x0034:
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r0 == r2) goto L_0x009c
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch: Exception -> 0x00c3
            if (r0 != r2) goto L_0x0045
            goto L_0x009c
        L_0x0045:
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            if (r0 == r2) goto L_0x008f
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch: Exception -> 0x00c3
            if (r0 != r2) goto L_0x0056
            goto L_0x008f
        L_0x0056:
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r0 == r2) goto L_0x0081
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: Exception -> 0x00c3
            if (r0 != r2) goto L_0x0067
            goto L_0x0081
        L_0x0067:
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            if (r0 == r1) goto L_0x0078
            java.lang.Class r0 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: Exception -> 0x00c3
            if (r0 != r2) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r0 = r6
            goto L_0x00a8
        L_0x0078:
            java.lang.String r0 = r6.toString()     // Catch: Exception -> 0x00c3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: Exception -> 0x00c3
            goto L_0x00a8
        L_0x0081:
            java.lang.String r0 = r6.toString()     // Catch: Exception -> 0x00c3
            double r2 = java.lang.Double.parseDouble(r0)     // Catch: Exception -> 0x00c3
            int r0 = (int) r2     // Catch: Exception -> 0x00c3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: Exception -> 0x00c3
            goto L_0x00a8
        L_0x008f:
            java.lang.String r0 = r6.toString()     // Catch: Exception -> 0x00c3
            double r2 = java.lang.Double.parseDouble(r0)     // Catch: Exception -> 0x00c3
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch: Exception -> 0x00c3
            goto L_0x00a8
        L_0x009c:
            java.lang.String r0 = r6.toString()     // Catch: Exception -> 0x00c3
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: Exception -> 0x00c3
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: Exception -> 0x00c3
        L_0x00a8:
            java.lang.Class r2 = r5.getType()     // Catch: Exception -> 0x00c3
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: Exception -> 0x00c3
            if (r2 == r3) goto L_0x00b6
            java.lang.Class r2 = r5.getType()     // Catch: Exception -> 0x00c3
            if (r2 != r1) goto L_0x00c0
        L_0x00b6:
            if (r6 == 0) goto L_0x00c0
            java.lang.String r6 = r6.toString()     // Catch: Exception -> 0x00c3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: Exception -> 0x00c3
        L_0x00c0:
            setProperty(r4, r5, r0)     // Catch: Exception -> 0x00c3
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.utils.WXReflectionUtils.setValue(java.lang.Object, java.lang.String, java.lang.Object):void");
    }
}
