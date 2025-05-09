package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h6g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(407896107);
    }

    public static Map<String, ?> a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1432cb64", new Object[]{file});
        }
        return y5g.d(new cli(file));
    }

    public static void b(Map<String, ?> map, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23518948", new Object[]{map, outputStream});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            arrayList.add(new i6g(entry.getKey()));
            if (value instanceof Boolean) {
                arrayList.add(new t5g(((Boolean) value).booleanValue()));
            } else if (value instanceof Integer) {
                arrayList.add(new v5g(((Integer) value).intValue()));
            } else if (value instanceof Float) {
                arrayList.add(new u5g(((Float) value).floatValue()));
            } else if (value instanceof Long) {
                arrayList.add(new w5g(((Long) value).longValue()));
            } else if (value instanceof String) {
                arrayList.add(new i6g((String) value));
            } else if (value instanceof Set) {
                arrayList.add(new j6g((Set) value));
            } else {
                throw new IllegalArgumentException("Not Support Type:" + value);
            }
        }
        new b6g(new Date(), arrayList).a(outputStream);
    }
}
