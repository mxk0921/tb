package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class on4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_ID = -1;
    public static final String TAG = "ContainerStorage";

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f25501a = new AtomicInteger(1);
    public final Map<String, String> b = new HashMap();
    public final Map<String, List<Map.Entry<Integer, a>>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(String str, String str2);
    }

    static {
        t2o.a(442499253);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        SkuLogUtils.l(TAG, "clear data");
        ((HashMap) this.b).clear();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((HashMap) this.b).clear();
        ((HashMap) this.c).clear();
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e7d20f", new Object[]{this, str});
        }
        SkuLogUtils.l(TAG, "getData: key is " + str);
        if (str == null) {
            return null;
        }
        return (String) ((HashMap) this.b).get(str);
    }

    public int d(String str, a aVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbe42765", new Object[]{this, str, aVar})).intValue();
        }
        StringBuilder sb = new StringBuilder("registerObserver: key is ");
        sb.append(str);
        sb.append(" ,listener is ");
        if (aVar == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        sb.append(str2);
        SkuLogUtils.l(TAG, sb.toString());
        if (TextUtils.isEmpty(str) || aVar == null) {
            return -1;
        }
        List<Map.Entry> list = (List) ((HashMap) this.c).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.c).put(str, list);
        }
        for (Map.Entry entry : list) {
            if (((a) entry.getValue()).equals(aVar)) {
                SkuLogUtils.l(TAG, "registerObserver: found same listener, id is " + entry.getKey());
                return ((Integer) entry.getKey()).intValue();
            }
        }
        int andIncrement = this.f25501a.getAndIncrement();
        list.add(new AbstractMap.SimpleEntry(Integer.valueOf(andIncrement), aVar));
        SkuLogUtils.l(TAG, "registerObserver: new observerId " + andIncrement);
        return andIncrement;
    }

    public boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cde6", new Object[]{this, str, str2})).booleanValue();
        }
        SkuLogUtils.l(TAG, "saveData: key is " + str + " ,value is " + str2);
        if (str == null) {
            SkuLogUtils.l(TAG, "saveData: key is null");
            return false;
        }
        String str3 = (String) ((HashMap) this.b).get(str);
        ((HashMap) this.b).put(str, str2);
        if (TextUtils.equals(str3, str2)) {
            SkuLogUtils.l(TAG, "saveData: oldValue and newValue is same");
            return true;
        }
        List<Map.Entry> list = (List) ((HashMap) this.c).get(str);
        if (list == null) {
            return true;
        }
        SkuLogUtils.l(TAG, "notifyDataChanged: observer size: " + list.size());
        for (Map.Entry entry : list) {
            String c = c(str);
            if (TextUtils.equals(str3, str2)) {
                SkuLogUtils.l(TAG, "notifyDataChanged: has set same value internal");
            } else {
                ((a) entry.getValue()).a(str3, c);
                SkuLogUtils.l(TAG, "notifyDataChanged: observer id: " + entry.getKey());
            }
        }
        return true;
    }

    public boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb9adf6e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        SkuLogUtils.l(TAG, "unregisterObserver: observerId is " + i);
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Map.Entry entry2 = (Map.Entry) list.get(i2);
                if (((Integer) entry2.getKey()).intValue() == i) {
                    list.remove(i2);
                    SkuLogUtils.l(TAG, "unregisterObserver: found observerId " + entry2.getKey());
                    return true;
                }
            }
        }
        return false;
    }
}
