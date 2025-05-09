package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.fatigue.FatigueData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f32457a;
    public Map<String, FatigueData> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<Map<String, FatigueData>> {
        public a(z19 z19Var) {
        }
    }

    static {
        t2o.a(573571137);
    }

    public z19(nwi nwiVar) {
        this.f32457a = nwiVar;
        b();
    }

    public boolean a(String str, int i) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7d711de", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FatigueData fatigueData = this.b.get(str);
        if (fatigueData == null) {
            fatigueData = new FatigueData();
        }
        if (fatigueData.times < i) {
            z = true;
        } else {
            z = false;
        }
        jgh.a("FatigueManager", "checkInfoFatigueAvailable timesAvailable=" + z + ", fatigueRecord.times=" + fatigueData.times + ", times=" + i);
        if (fatigueData.nextShowTime <= System.currentTimeMillis()) {
            z2 = true;
        } else {
            z2 = false;
        }
        jgh.a("FatigueManager", "checkInfoFatigueAvailable nextShowTimeAvailable=" + z2 + ", fatigueRecord.nextShowTime=" + fatigueData.nextShowTime + ", currentTime=" + System.currentTimeMillis());
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340a7639", new Object[]{this});
            return;
        }
        String a2 = ino.a("FatigueManager", null);
        if (!TextUtils.isEmpty(a2)) {
            try {
                this.b = (Map) JSON.parseObject(a2, new a(this), new Feature[0]);
            } catch (Exception e) {
                jgh.b("FatigueManager", "loadFatigueRecord error ", e);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b79fe0", new Object[]{this});
            return;
        }
        String str = this.f32457a.d().a().itemId;
        int i = this.f32457a.d().a().periodSeconds;
        if (!TextUtils.isEmpty(str)) {
            Map<String, FatigueData> map = this.b;
            if (map == null) {
                this.b = new ConcurrentHashMap();
                return;
            }
            FatigueData fatigueData = map.get(str);
            if (fatigueData == null) {
                fatigueData = new FatigueData();
            }
            fatigueData.times++;
            fatigueData.nextShowTime = (i * 1000) + System.currentTimeMillis();
            this.b.put(str, fatigueData);
            try {
                ino.b("FatigueManager", JSON.toJSONString(this.b));
                jgh.a("FatigueManager", "saveInfoShowRecord itemId=" + str + ", fatigueRecord=" + fatigueData);
            } catch (Exception e) {
                jgh.b("FatigueManager", "saveInfoShowRecord error ", e);
            }
        }
    }
}
