package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long b;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f25581a = new HashMap();
    public final AtomicBoolean d = new AtomicBoolean(true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends TypeReference<Map<String, Long>> {
        public a(oqs oqsVar) {
        }
    }

    static {
        t2o.a(729809484);
    }

    public oqs() {
        c();
    }

    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("518fc8a9", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.c == 0) {
            this.d.set(true);
            return true;
        }
        this.d.set(false);
        if (this.c > i2) {
            d9j.c("TabFatigue", "gif次数疲劳度拦截");
            return false;
        } else if (TimeUnit.MILLISECONDS.toHours(currentTimeMillis - this.b) < i) {
            d9j.c("TabFatigue", "gif次数疲劳度时间段拦截");
            return false;
        } else {
            this.d.set(true);
            return true;
        }
    }

    public boolean b(String str, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14337efb", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (!((HashMap) this.f25581a).containsKey(str)) {
            d(str);
            return true;
        }
        Long l = (Long) ((HashMap) this.f25581a).get(str);
        if (l == null) {
            d(str);
            return true;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(System.currentTimeMillis());
        if (instance2.get(1) < instance.get(1) || instance2.get(6) < instance.get(6) + i) {
            z = false;
        }
        bqa.d("TabFatigue", "allowShowTabBubble:" + z);
        if (z) {
            d(str);
        }
        return z;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a564cd08", new Object[]{this});
            return;
        }
        try {
            ((HashMap) this.f25581a).putAll((Map) JSON.parseObject(qy8.b.e("homepage_switch", vaj.BUBBLE_FATIGUE, ""), new a(this), new Feature[0]));
        } catch (Exception e) {
            bqa.b("TabFatigue", "load bubbleFatigue error", e);
        }
        try {
            this.b = Long.parseLong(qy8.b.e("homepage_switch", "firstShowGifTime", "0"));
            this.c = Integer.parseInt(qy8.b.e("homepage_switch", "gifAlreadyShowCount", "0"));
        } catch (Exception e2) {
            bqa.b("TabFatigue", "load gifFatigue error", e2);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f4c51d", new Object[]{this, str});
        } else if (((HashMap) this.f25581a).containsKey(str)) {
            ((HashMap) this.f25581a).remove(str);
            qy8.b.i("homepage_switch", vaj.BUBBLE_FATIGUE, JSON.toJSONString(this.f25581a));
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233da763", new Object[]{this, str});
            return;
        }
        ((HashMap) this.f25581a).put(str, Long.valueOf(System.currentTimeMillis()));
        qy8.b.i("homepage_switch", vaj.BUBBLE_FATIGUE, JSON.toJSONString(this.f25581a));
    }

    public void f() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a353293", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.d.get()) {
            i = 1 + this.c;
        }
        this.c = i;
        if (!this.d.get()) {
            currentTimeMillis = this.b;
        }
        this.b = currentTimeMillis;
        qy8.b.i("homepage_switch", "firstShowGifTime", String.valueOf(currentTimeMillis));
        qy8.b.i("homepage_switch", "gifAlreadyShowCount", String.valueOf(this.c));
    }
}
