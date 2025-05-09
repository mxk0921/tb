package tb;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.DateUtils;
import com.taobao.media.MediaConstant;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vqq implements k2a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f30187a;
    public final Class b;

    public vqq(Class cls, Object obj) {
        this.b = cls;
        this.f30187a = obj;
    }

    @Override // tb.k2a
    public Object apply(Object obj) {
        String str = (String) obj;
        if (str == null || "null".equals(str) || "".equals(str)) {
            return this.f30187a;
        }
        Class cls = Byte.TYPE;
        Class cls2 = this.b;
        if (cls2 == cls || cls2 == Byte.class) {
            return Byte.valueOf(Byte.parseByte(str));
        }
        if (cls2 == Short.TYPE || cls2 == Short.class) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (cls2 == Integer.TYPE || cls2 == Integer.class) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (cls2 == Long.TYPE || cls2 == Long.class) {
            if (b2d.h(str) || str.length() != 19) {
                return Long.valueOf(Long.parseLong(str));
            }
            return Long.valueOf(DateUtils.f0(str, wqx.d));
        } else if (cls2 == Float.TYPE || cls2 == Float.class) {
            return Float.valueOf(Float.parseFloat(str));
        } else {
            if (cls2 == Double.TYPE || cls2 == Double.class) {
                return Double.valueOf(Double.parseDouble(str));
            }
            if (cls2 == Character.TYPE || cls2 == Character.class) {
                return Character.valueOf(str.charAt(0));
            }
            if (cls2 == Boolean.TYPE || cls2 == Boolean.class) {
                return Boolean.valueOf("true".equals(str));
            }
            if (cls2 == BigDecimal.class) {
                return new BigDecimal(str);
            }
            if (cls2 == BigInteger.class) {
                return new BigInteger(str);
            }
            if ((cls2 == Collections.class || cls2 == List.class || cls2 == JSONArray.class) && MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(str)) {
                return new JSONArray();
            }
            throw new JSONException("can not convert to " + cls2 + ", value : " + str);
        }
    }
}
