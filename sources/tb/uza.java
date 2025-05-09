package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808907);
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205b1de7", new Object[]{context, new Integer(i)});
        } else {
            new w78(context, i, (HomeLocationResult) null).show();
        }
    }

    public static void b(z6d z6dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d5bcef", new Object[]{z6dVar, new Integer(i)});
        } else {
            c(z6dVar, i, null);
        }
    }

    public static void c(z6d z6dVar, int i, HomeLocationResult homeLocationResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f544fb9e", new Object[]{z6dVar, new Integer(i), homeLocationResult});
        } else {
            wcm.a(z6dVar.getClass().getName()).b(new w78(z6dVar, i, homeLocationResult));
        }
    }

    public static int[] d(String[] strArr, String str, String str2) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("59da9cd", new Object[]{strArr, str, str2});
        }
        int[] iArr = new int[strArr.length];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str3 = strArr[i4];
            if (str3.equals(str)) {
                if (str3.equals(str2)) {
                    i2 = i4;
                    i3 = i2;
                } else {
                    i2 = i4;
                }
            } else if (str3.equals(str2)) {
                i3 = i4;
            } else if (str3.equals("GLOBAL")) {
                iArr[strArr.length - 1] = i4;
            } else {
                linkedHashMap.put(str3, Integer.valueOf(i4));
            }
        }
        iArr[0] = i2;
        if (i2 != i3) {
            iArr[1] = i3;
        } else {
            i = 1;
        }
        for (Integer num : linkedHashMap.values()) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }
}
