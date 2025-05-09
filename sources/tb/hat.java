package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.tkcps.TaokeParam;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hat b = new hat();

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, TaokeParam> f20520a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends TypeReference<ConcurrentHashMap<String, TaokeParam>> {
        public a(hat hatVar) {
        }
    }

    static {
        t2o.a(1020264472);
    }

    public static hat b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hat) ipChange.ipc$dispatch("ef9b92a9", new Object[0]);
        }
        return b;
    }

    public String a(String str) {
        TaokeParam taokeParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf0db78", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (taokeParam = this.f20520a.get(str)) != null && TimeStampManager.instance().getCurrentTimeStamp() <= taokeParam.expireTime.longValue()) {
            return taokeParam.content;
        }
        return null;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        if (this.f20520a.isEmpty()) {
            SharedPreferencesUtils.removeKey("tk_cps_param");
        } else {
            SharedPreferencesUtils.putString("tk_cps_param", JSON.toJSONString(this.f20520a));
        }
    }

    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed056aa3", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && str2 != null) {
            TaokeParam taokeParam = new TaokeParam();
            taokeParam.content = str2;
            taokeParam.expireTime = Long.valueOf(TimeStampManager.instance().getCurrentTimeStamp() + 1296000000);
            this.f20520a.put(str, taokeParam);
        }
    }

    public synchronized void c() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7157237", new Object[]{this});
                return;
            }
            String string = SharedPreferencesUtils.getString("tk_cps_param", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    ConcurrentHashMap<String, TaokeParam> concurrentHashMap = (ConcurrentHashMap) JSON.parseObject(string, new a(this), new Feature[0]);
                    if (concurrentHashMap != null) {
                        Iterator<Map.Entry<String, TaokeParam>> it = concurrentHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            if (TimeStampManager.instance().getCurrentTimeStamp() > it.next().getValue().expireTime.longValue()) {
                                it.remove();
                                z = true;
                            }
                        }
                        if (z) {
                            d();
                        }
                        this.f20520a = concurrentHashMap;
                        String jSONString = JSON.toJSONString(concurrentHashMap);
                        TaoLog.Logd("AlimamaSdk", "loaded tk_cps_param: " + jSONString);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
