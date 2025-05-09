package tb;

import android.content.SharedPreferences;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999916);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108d0e42", new Object[]{str});
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                Set<String> i = i();
                if (i == null) {
                    i = new HashSet<>();
                }
                i.add(str);
                l.edit().putStringSet(g("mock_checked_index_ids"), i).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference addMockCheckedIndexID error.", th);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d819e9e", new Object[0]);
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                l.edit().remove(g("mock_checked_index_ids")).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference clearMockCheckInfo error.", th);
        }
    }

    public static Map<String, ?> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9c4c1bf1", new Object[0]);
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return new HashMap();
            }
            return l.getAll();
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getAllData error.", th);
            return new HashMap();
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89a0851", new Object[]{str})).booleanValue();
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return false;
            }
            return l.getBoolean(str, false);
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getBooleanData error.", th);
            return false;
        }
    }

    public static boolean e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aa7b42b", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return z;
            }
            return l.getBoolean(str, z);
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getBooleanData with defaultValue error.", th);
            return z;
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e02db7cd", new Object[0]);
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return "";
            }
            return l.getString("mock_data", "");
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getPersistentMockData error.", th);
            return "";
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18fd8f34", new Object[]{str});
        }
        return "Page_" + str;
    }

    public static long h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c11910b", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return j;
            }
            return l.getLong(str, j);
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getLongData error.", th);
            return j;
        }
    }

    public static Set<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d451ea43", new Object[0]);
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return null;
            }
            return l.getStringSet(g("mock_checked_index_ids"), null);
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getMockCheckedIndexIDs error.", th);
            return null;
        }
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e274ba2", new Object[0]);
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return "";
            }
            return l.getString("mock_params", "");
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getMockParamData error.", th);
            return "";
        }
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7814ef8", new Object[0])).longValue();
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return 0L;
            }
            return l.getLong("mock_time_travel", 0L);
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getPersistentTimeTravelSec error.", th);
            return 0L;
        }
    }

    public static SharedPreferences l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        if (PopLayer.getReference() == null || PopLayer.getReference().getApp() == null) {
            return null;
        }
        return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_info_v2", 0);
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5837d9be", new Object[]{str});
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return "";
            }
            return l.getString(str, "");
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getStringData error.", th);
            return "";
        }
    }

    public static List<String> n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca121b67", new Object[]{str});
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return new ArrayList();
            }
            return new ArrayList(l.getStringSet(str, new HashSet()));
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference getStringListData error.", th);
            return new ArrayList();
        }
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07c4776", new Object[]{str});
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                l.edit().putString("mock_data", str).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference putConfigMockData error.", th);
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e76caf", new Object[]{str});
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                l.edit().putString("mock_params", str).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference putMockParamData error.", th);
        }
    }

    public static void q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa2cc79", new Object[]{new Long(j)});
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                l.edit().putLong("mock_time_travel", j).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference putPersistentTimeTravelSec error.", th);
        }
    }

    public static void r(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689a510a", new Object[]{str, list});
            return;
        }
        if (list == null) {
            try {
                list = new ArrayList<>();
            } catch (Throwable th) {
                wdm.h("PoplayerInfoSharePreference putStringListData error.", th);
                return;
            }
        }
        SharedPreferences l = l();
        if (l != null) {
            l.edit().putStringSet(str, new HashSet(list)).apply();
        }
    }

    public static SharedPreferences.Editor s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("88a0023e", new Object[0]);
        }
        try {
            SharedPreferences l = l();
            if (l == null) {
                return null;
            }
            return l.edit();
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference startEdit error.", th);
            return null;
        }
    }

    public static void t(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631a40da", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                l.edit().putBoolean(str, z).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference updateBooleanData error.", th);
        }
    }

    public static void u(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662a7944", new Object[]{str, new Long(j)});
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                l.edit().putLong(str, j).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference updateLongData error.", th);
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9424af1f", new Object[]{str, str2});
            return;
        }
        try {
            SharedPreferences l = l();
            if (l != null) {
                l.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            wdm.h("PoplayerInfoSharePreference updateStringData error.", th);
        }
    }
}
