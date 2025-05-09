package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.testutils.log.LogUtils;
import java.util.HashMap;
import java.util.Map;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class uct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BHREvent f29298a;
    public final BHRTaskConfigBase b;
    public final JSONObject c;
    public final kq4 d;

    static {
        t2o.a(404750411);
        t2o.a(404750406);
    }

    public uct(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        this.b = bHRTaskConfigBase;
        this.f29298a = bHREvent;
        this.c = bHRTaskConfigBase.getTaskInfo();
        this.d = new kq4(bHREvent, bHRTaskConfigBase);
    }

    public final Map<String, String> b(BHRTaskConfigBase bHRTaskConfigBase) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35a5c2d8", new Object[]{this, bHRTaskConfigBase});
        }
        JSONObject taskInfo = bHRTaskConfigBase.getTaskInfo();
        HashMap hashMap = new HashMap();
        if (taskInfo != null && !taskInfo.isEmpty()) {
            for (Map.Entry<String, Object> entry : taskInfo.entrySet()) {
                String str2 = "br_" + entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    str = "";
                } else {
                    str = value.toString();
                }
                hashMap.put(str2, str);
            }
        }
        return hashMap;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return v82.e.m("enableInternalEvent", true, true);
    }

    public void d(Map<String, Object> map) {
        BHRTaskConfigBase bHRTaskConfigBase;
        Map<String, String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf0bfbb", new Object[]{this, map});
        } else if (!c()) {
            LogUtils.e(LogUtils.BR_BIZ_NAME, "BHRTask", "dispatchInternalEvent isEnableInternalEvent is false.");
        } else {
            gm1 f = f();
            if (f != null && (bHRTaskConfigBase = this.b) != null) {
                BHREvent buildInternalEvent = BHREvent.buildInternalEvent(bHRTaskConfigBase.getConfigName(), this.b.getTaskType(), "");
                buildInternalEvent.bizArgsMap = b(this.b);
                if (!(map == null || map.isEmpty() || (b = hqv.b(map)) == null)) {
                    buildInternalEvent.bizArgsMap.putAll(b);
                }
                f.a(buildInternalEvent);
            }
        }
    }

    public kq4 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kq4) ipChange.ipc$dispatch("1e5a1b39", new Object[]{this});
        }
        return this.d;
    }

    public gm1 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gm1) ipChange.ipc$dispatch("a85409ac", new Object[]{this});
        }
        return null;
    }

    public abstract void g();

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            g();
        }
    }
}
