package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.model.SmallHandleData;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(467664984);
    }

    public static synchronized void a(qg0 qg0Var) {
        synchronized (bh0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da3328ce", new Object[]{qg0Var});
                return;
            }
            qg0Var.z = true;
            if (qg0Var.y != null) {
                pg0.i().z(qg0Var, qg0Var.y);
            }
        }
    }

    public static synchronized void c(qg0 qg0Var, Map<String, Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        int parseInt;
        synchronized (bh0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("241ea733", new Object[]{qg0Var, map});
                return;
            }
            vp9.a("linkx", "AfcXbsManager === showXbsWithContext === 开始绘制小把手");
            AfcXbsData afcXbsData = new AfcXbsData();
            try {
                afcXbsData.appKey = qg0Var.f26733a;
                afcXbsData.backUrl = qg0Var.g;
                if (map.get("tipsType") == null) {
                    str = "";
                } else {
                    str = (String) map.get("tipsType");
                }
                afcXbsData.type = str;
                if (map.get("appName") == null) {
                    str2 = "";
                } else {
                    str2 = (String) map.get("appName");
                }
                afcXbsData.appName = str2;
                if (map.get("tipsIcon") == null) {
                    str3 = "";
                } else {
                    str3 = (String) map.get("tipsIcon");
                }
                afcXbsData.tipsIcon = str3;
                if (map.get("time") == null) {
                    str4 = "86400";
                } else {
                    str4 = (String) map.get("time");
                }
                afcXbsData.expireTime = Long.parseLong(str4);
                Object obj = map.get("tipsStrategy");
                if (obj instanceof Integer) {
                    int intValue = ((Integer) obj).intValue();
                    if (intValue >= AfcXbsData.STRATEGY_0 && intValue <= AfcXbsData.STRATEGY_4) {
                        afcXbsData.tipsStrategy = intValue;
                    }
                } else if ((obj instanceof String) && (parseInt = Integer.parseInt((String) obj)) >= AfcXbsData.STRATEGY_0 && parseInt <= AfcXbsData.STRATEGY_4) {
                    afcXbsData.tipsStrategy = parseInt;
                }
            } catch (Exception unused) {
                vp9.a("linkx", "AFCXbsRouter  === execute ==  afcXbsData" + afcXbsData);
            }
            qg0Var.y = afcXbsData;
            if (qg0Var.z) {
                pg0.i().z(qg0Var, afcXbsData);
            }
        }
    }

    public static boolean d(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b77c37f9", new Object[]{afcXbsData})).booleanValue();
        }
        if (afcXbsData == null) {
            return false;
        }
        int i = afcXbsData.tipsStrategy;
        if (i == AfcXbsData.STRATEGY_0 || i == AfcXbsData.STRATEGY_1) {
            return true;
        }
        return false;
    }

    public static boolean e(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed1c2815", new Object[]{afcXbsData})).booleanValue();
        }
        if (afcXbsData == null) {
            return false;
        }
        int i = afcXbsData.tipsStrategy;
        if (i == AfcXbsData.STRATEGY_0 || i == AfcXbsData.STRATEGY_1 || i == AfcXbsData.STRATEGY_2 || i == AfcXbsData.STRATEGY_3) {
            return true;
        }
        return false;
    }

    public static boolean f(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("575ceaf6", new Object[]{afcXbsData})).booleanValue();
        }
        if (afcXbsData == null) {
            return false;
        }
        int i = afcXbsData.tipsStrategy;
        if (i == AfcXbsData.STRATEGY_0 || i == AfcXbsData.STRATEGY_2) {
            return true;
        }
        return false;
    }

    public static synchronized void b(qg0 qg0Var, SmallHandleData.BackAppInfos backAppInfos) {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 0;
        synchronized (bh0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("490ef594", new Object[]{qg0Var, backAppInfos});
            } else if (backAppInfos != null) {
                vp9.a("linkx", "AfcXbsManager === showXbsWithContext === 开始绘制小把手");
                AfcXbsData afcXbsData = new AfcXbsData();
                try {
                    afcXbsData.appKey = qg0Var.f26733a;
                    afcXbsData.backUrl = qg0Var.g;
                    if (backAppInfos.getShowMode() == null) {
                        str = "";
                    } else {
                        str = backAppInfos.getShowMode();
                    }
                    afcXbsData.type = str;
                    if (backAppInfos.getAppName() == null) {
                        str2 = "";
                    } else {
                        str2 = backAppInfos.getAppName();
                    }
                    afcXbsData.appName = str2;
                    if (backAppInfos.getAppIcon() == null) {
                        str3 = "";
                    } else {
                        str3 = backAppInfos.getAppIcon();
                    }
                    afcXbsData.tipsIcon = str3;
                    if (backAppInfos.getTime() == null) {
                        str4 = "86400";
                    } else {
                        str4 = backAppInfos.getTime();
                    }
                    afcXbsData.expireTime = Long.parseLong(str4);
                    if (backAppInfos.getShowStrategy() != null) {
                        i = Integer.parseInt(backAppInfos.getShowStrategy());
                    }
                    if (i >= AfcXbsData.STRATEGY_0 && i <= AfcXbsData.STRATEGY_4) {
                        afcXbsData.tipsStrategy = i;
                    }
                } catch (Exception unused) {
                    vp9.a("linkx", "AFCXbsRouter  === execute ==  afcXbsData" + afcXbsData);
                }
                qg0Var.y = afcXbsData;
                if (qg0Var.z) {
                    pg0.i().z(qg0Var, afcXbsData);
                }
            }
        }
    }
}
