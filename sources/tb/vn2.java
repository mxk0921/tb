package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vn2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f30117a = new ConcurrentHashMap();
    public final Map<String, Integer> b = new ConcurrentHashMap();
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements kmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.vn2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C1079a extends TypeReference<Map<String, Integer>> {
            public C1079a(a aVar) {
            }
        }

        public a() {
        }

        @Override // tb.kmc
        public void a(String str) {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7839eaea", new Object[]{this, str});
            } else if (TextUtils.isEmpty(str)) {
                tm1.a("BusinessFatigueRecord", vn2.a(vn2.this) + ",fatigueRecordMap cache null");
            } else {
                try {
                    map = (Map) JSON.parseObject(str, new C1079a(this), new Feature[0]);
                } catch (Exception e) {
                    tm1.b("BusinessFatigueRecord", "loadBusinessFatigueRecord fatigueRecordMap error", e);
                    map = null;
                }
                if (map != null) {
                    vn2.b(vn2.this).putAll(map);
                }
                tm1.a("BusinessFatigueRecord", vn2.a(vn2.this) + ",fatigueRecordMap:" + vn2.b(vn2.this).size());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements kmc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends TypeReference<Map<String, Integer>> {
            public a(b bVar) {
            }
        }

        public b() {
        }

        @Override // tb.kmc
        public void a(String str) {
            Map map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7839eaea", new Object[]{this, str});
            } else if (TextUtils.isEmpty(str)) {
                tm1.a("BusinessFatigueRecord", vn2.a(vn2.this) + ",remoteFatigueMap cache null");
            } else {
                try {
                    map = (Map) JSON.parseObject(str, new a(this), new Feature[0]);
                } catch (Exception e) {
                    tm1.b("BusinessFatigueRecord", "loadBusinessFatigueRecord remoteFatigueMap error", e);
                    map = null;
                }
                if (map != null) {
                    vn2.c(vn2.this).putAll(map);
                }
                tm1.a("BusinessFatigueRecord", vn2.a(vn2.this) + ",remoteFatigueMap:" + vn2.c(vn2.this).size());
            }
        }
    }

    static {
        t2o.a(736100367);
    }

    public vn2(String str) {
        this.c = str + "Record";
    }

    public static /* synthetic */ String a(vn2 vn2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9b91b00", new Object[]{vn2Var});
        }
        return vn2Var.c;
    }

    public static /* synthetic */ Map b(vn2 vn2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("880ae634", new Object[]{vn2Var});
        }
        return vn2Var.f30117a;
    }

    public static /* synthetic */ Map c(vn2 vn2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d00a4493", new Object[]{vn2Var});
        }
        return vn2Var.b;
    }

    public boolean d(BootImageInfo bootImageInfo) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8672ab43", new Object[]{this, bootImageInfo})).booleanValue();
        }
        if (TextUtils.isEmpty(bootImageInfo.itemId)) {
            return false;
        }
        Integer num2 = (Integer) ((ConcurrentHashMap) this.f30117a).get(bootImageInfo.itemId);
        if (num2 == null || (num = (Integer) ((ConcurrentHashMap) this.b).get(bootImageInfo.itemId)) == null) {
            return true;
        }
        tm1.a("BusinessFatigueRecord", this.c + ",itemId:" + bootImageInfo.itemId + " fatigueRecord:" + num2 + ",remoteFatigue:" + num);
        if (num2.intValue() < num.intValue()) {
            return true;
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340a7639", new Object[]{this});
            return;
        }
        kt2 c = kt2.c();
        c.d(this.c + "Local", new a());
        kt2 c2 = kt2.c();
        c2.d(this.c + "Remote", new b());
    }

    public void f(BootImageInfo bootImageInfo) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ca4b4", new Object[]{this, bootImageInfo});
        } else if (!TextUtils.isEmpty(bootImageInfo.itemId)) {
            Integer num = (Integer) ((ConcurrentHashMap) this.f30117a).get(bootImageInfo.itemId);
            if (num != null) {
                i = 1 + num.intValue();
            }
            Integer valueOf = Integer.valueOf(i);
            ((ConcurrentHashMap) this.f30117a).put(bootImageInfo.itemId, valueOf);
            tm1.a("BusinessFatigueRecord", this.c + ",saveFatigueRecord,itemId:" + bootImageInfo.itemId + ",count:" + valueOf);
            kt2 c = kt2.c();
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("Local");
            c.e(sb.toString(), JSON.toJSONString(this.f30117a));
        }
    }

    public void g(List<BootImageInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca27d4d0", new Object[]{this, list});
            return;
        }
        ((ConcurrentHashMap) this.b).clear();
        for (BootImageInfo bootImageInfo : list) {
            if (!TextUtils.isEmpty(bootImageInfo.itemId)) {
                tm1.a("BusinessFatigueRecord", this.c + ",updateRemoteFatigue,itemId:" + bootImageInfo.itemId + ",times:" + bootImageInfo.times);
                ((ConcurrentHashMap) this.b).put(bootImageInfo.itemId, Integer.valueOf(bootImageInfo.times));
            }
        }
        kt2 c = kt2.c();
        c.e(this.c + "Remote", JSON.toJSONString(this.b));
        for (Map.Entry entry : ((ConcurrentHashMap) this.f30117a).entrySet()) {
            if (!((ConcurrentHashMap) this.b).containsKey(entry.getKey())) {
                tm1.a("BusinessFatigueRecord", this.c + ",removeFatigueRecordMap,itemId:" + ((String) entry.getKey()));
                ((ConcurrentHashMap) this.f30117a).remove(entry.getKey());
            }
        }
        kt2 c2 = kt2.c();
        c2.e(this.c + "Local", JSON.toJSONString(this.f30117a));
    }
}
