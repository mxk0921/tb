package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.action.UploadTLogAction;
import com.taobao.android.diagnose.scene.engine.config.ActionsExecuteRecord;
import com.taobao.android.diagnose.scene.engine.config.SceneRunningRecord;
import com.taobao.android.diagnose.scene.engine.config.TLogUploadActionConfig;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SceneRunningRecord f25646a;
    public static File b;
    public static long c = 0;

    static {
        t2o.a(615514197);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4da2b448", new Object[0])).booleanValue();
        }
        if (f25646a == null) {
            return false;
        }
        if (c > 0 && System.currentTimeMillis() - f25646a.sceneLastUpdateTime <= c * 60000) {
            return false;
        }
        return true;
    }

    public static boolean b(String str, String str2, int i, int i2) {
        char c2 = 3;
        char c3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("699f4e1a", new Object[]{str, str2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        SceneRunningRecord sceneRunningRecord = f25646a;
        if (sceneRunningRecord == null) {
            return false;
        }
        if (i == 0) {
            TLog.loge("SceneUpload", "SceneRunningManager", "Can't execute action: " + str2 + ". MaxExecuteCount=0");
            return false;
        }
        List<ActionsExecuteRecord> list = sceneRunningRecord.rulesRecordList.get(str);
        if (list != null && !list.isEmpty()) {
            for (ActionsExecuteRecord actionsExecuteRecord : list) {
                if (actionsExecuteRecord.actionID.equals(str2)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (i <= 0 || actionsExecuteRecord.executeCount < i || !e(actionsExecuteRecord.firstExecuteTime, currentTimeMillis)) {
                        long j = i2 * 60000;
                        if (currentTimeMillis - actionsExecuteRecord.lastExecuteTime < j) {
                            TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute action: %s. curTime=%d, lastExecuteTime=%d， executeInterval=%d", str2, Long.valueOf(currentTimeMillis), Long.valueOf(actionsExecuteRecord.lastExecuteTime), Long.valueOf(j)));
                            return false;
                        }
                        c3 = 2;
                    } else {
                        Integer valueOf = Integer.valueOf(i);
                        Integer valueOf2 = Integer.valueOf(actionsExecuteRecord.executeCount);
                        Long valueOf3 = Long.valueOf(actionsExecuteRecord.firstExecuteTime);
                        Object[] objArr = new Object[4];
                        objArr[0] = str2;
                        objArr[1] = valueOf;
                        objArr[c3] = valueOf2;
                        objArr[c2] = valueOf3;
                        TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute action: %s. MaxExecuteCount=%d, ExecuteCount=%d， FirstExecuteTime=%d", objArr));
                        return false;
                    }
                }
                c2 = 3;
            }
        }
        return true;
    }

    public static boolean c(Context context, String str, x80 x80Var, UploadTLogAction.TLogActionConfig tLogActionConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da0b8d18", new Object[]{context, str, x80Var, tLogActionConfig})).booleanValue();
        }
        TLogUploadActionConfig h = mk7.h();
        long currentTimeMillis = System.currentTimeMillis();
        if (!tLogActionConfig.needWifi || uk7.i().g().f().getType() == 7) {
            SceneRunningRecord sceneRunningRecord = f25646a;
            long j = sceneRunningRecord.tlogUploadLastTime;
            if (currentTimeMillis - j <= h.uploadInterval * 1000) {
                TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute tlog upload! tlogUploadLastTime=%d, curTime=%d， uploadInterval=%d", Long.valueOf(j), Long.valueOf(currentTimeMillis), Integer.valueOf(h.uploadInterval)));
                return false;
            }
            int i = h.maxLimit;
            if (i <= 0 || sceneRunningRecord.tlogUploadCount < i || !e(sceneRunningRecord.tlogUploadFirstTime, currentTimeMillis)) {
                return b(str, x80Var.b(), x80Var.d(), tLogActionConfig.actionInterval);
            }
            TLog.loge("SceneUpload", "SceneRunningManager", String.format("Can't execute tlog upload! MaxCount=%d, CurCount=%d， LimitTimeStart=%d", Integer.valueOf(h.maxLimit), Integer.valueOf(f25646a.tlogUploadCount), Long.valueOf(f25646a.tlogUploadFirstTime)));
            return false;
        }
        TLog.loge("SceneUpload", "SceneRunningManager", "Can't upload tlog! Not in wifi!!");
        return false;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        f25646a = null;
        b = new File(uk7.i().k(), "rules_record.json");
        f();
    }

    public static boolean e(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76a09e84", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        if (j2 - j < 86400000) {
            return true;
        }
        return false;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[0]);
            return;
        }
        String h = cl7.h(b);
        if (!TextUtils.isEmpty(h)) {
            try {
                f25646a = (SceneRunningRecord) JSON.parseObject(h, SceneRunningRecord.class);
            } catch (Exception e) {
                idh.c("SceneRunningManager", "load: ", e);
                b.delete();
            }
        } else {
            f25646a = new SceneRunningRecord();
        }
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e1ce1e", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            long currentTimeMillis = System.currentTimeMillis();
            List<ActionsExecuteRecord> list = f25646a.rulesRecordList.get(str);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ActionsExecuteRecord actionsExecuteRecord = new ActionsExecuteRecord();
                actionsExecuteRecord.ruleID = str;
                actionsExecuteRecord.actionID = str2;
                actionsExecuteRecord.firstExecuteTime = currentTimeMillis;
                actionsExecuteRecord.lastExecuteTime = currentTimeMillis;
                actionsExecuteRecord.executeCount = 1;
                arrayList.add(actionsExecuteRecord);
                f25646a.rulesRecordList.put(str, arrayList);
                return;
            }
            ActionsExecuteRecord actionsExecuteRecord2 = null;
            for (ActionsExecuteRecord actionsExecuteRecord3 : list) {
                if (actionsExecuteRecord3.ruleID.equals(str)) {
                    actionsExecuteRecord2 = actionsExecuteRecord3;
                }
            }
            if (actionsExecuteRecord2 == null) {
                ActionsExecuteRecord actionsExecuteRecord4 = new ActionsExecuteRecord();
                actionsExecuteRecord4.ruleID = str;
                actionsExecuteRecord4.actionID = str2;
                actionsExecuteRecord4.firstExecuteTime = currentTimeMillis;
                actionsExecuteRecord4.lastExecuteTime = currentTimeMillis;
                actionsExecuteRecord4.executeCount = 1;
                list.add(actionsExecuteRecord4);
                return;
            }
            if (e(actionsExecuteRecord2.firstExecuteTime, currentTimeMillis)) {
                actionsExecuteRecord2.executeCount++;
            } else {
                actionsExecuteRecord2.firstExecuteTime = currentTimeMillis;
                actionsExecuteRecord2.executeCount = 1;
            }
            actionsExecuteRecord2.lastExecuteTime = currentTimeMillis;
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9a369d", new Object[0]);
            return;
        }
        f25646a.sceneLastUpdateTime = System.currentTimeMillis();
        k();
    }

    public static void i(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5296381", new Object[]{context, str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (e(f25646a.tlogUploadFirstTime, currentTimeMillis)) {
            f25646a.tlogUploadCount++;
        } else {
            SceneRunningRecord sceneRunningRecord = f25646a;
            sceneRunningRecord.tlogUploadCount = 1;
            sceneRunningRecord.tlogUploadFirstTime = currentTimeMillis;
        }
        f25646a.tlogUploadLastTime = currentTimeMillis;
        g(str, str2);
        k();
    }

    public static void j(String str) {
        Map<String, List<ActionsExecuteRecord>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2fa47b", new Object[]{str});
            return;
        }
        SceneRunningRecord sceneRunningRecord = f25646a;
        if (sceneRunningRecord != null && (map = sceneRunningRecord.rulesRecordList) != null && map.remove(str) != null) {
            idh.a("SceneRunningManager", "Remove rule running data: " + str);
            k();
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84643f84", new Object[0]);
            return;
        }
        try {
            cl7.i(b, JSON.toJSONString(f25646a));
        } catch (Exception e) {
            idh.c("SceneRunningManager", "save: ", e);
        }
    }

    public static void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70665da5", new Object[]{new Long(j)});
        } else {
            c = j;
        }
    }
}
