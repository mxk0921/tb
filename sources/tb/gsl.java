package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gsl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465651);
    }

    public static String a(Object[] objArr, int i, Class[] clsArr) {
        Class cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f827786", new Object[]{objArr, new Integer(i), clsArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "operationList is null or 0";
        }
        if (i <= 0) {
            int abs = Math.abs(i);
            if (objArr.length != abs) {
                return "operationList expected length is " + abs + ", but is " + objArr.length;
            }
        } else if (objArr.length < i) {
            return "operationList expected length is more then " + i + ", but is " + objArr.length;
        }
        if (clsArr != null && clsArr.length > 0) {
            for (int i2 = 0; i2 < clsArr.length; i2++) {
                Object obj = objArr[i2];
                if (obj == null || (cls = clsArr[i2]) == null || cls.isInstance(obj)) {
                    Class cls2 = clsArr[i2];
                    if (cls2 != null && objArr[i2] == null) {
                        return "operationList`s item type is wrong. Number " + i2 + " is null, but expected type is " + clsArr[i2];
                    } else if (objArr[i2] != null && cls2 == null) {
                        return null;
                    }
                } else {
                    return "operationList`s item type is wrong. Number " + i2 + " is " + objArr[i2].getClass() + ", but expected type is " + clsArr[i2];
                }
            }
        }
        return null;
    }
}
