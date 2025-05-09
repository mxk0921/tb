package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f22097a = new ConcurrentHashMap();

    static {
        t2o.a(613417126);
    }

    public static Object a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c4b9f788", new Object[]{context, str, obj});
        }
        if (context == null) {
            return obj;
        }
        Map<String, Object> map = f22097a;
        Object obj2 = ((ConcurrentHashMap) map).get(str);
        if (obj2 != null) {
            return obj2;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("orange", 0);
            if (obj instanceof String) {
                obj2 = sharedPreferences.getString(str, (String) obj);
            } else if (obj instanceof Integer) {
                obj2 = Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            } else if (obj instanceof Boolean) {
                obj2 = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            } else if (obj instanceof Float) {
                obj2 = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            } else if (obj instanceof Long) {
                obj2 = Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
            if (obj2 != null) {
                ((ConcurrentHashMap) map).put(str, obj2);
                return obj2;
            }
        } catch (Throwable th) {
            OLog.e("SPUtil", "get from share preference failed", th.toString());
        }
        return obj;
    }

    public static Object b(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("303e21a5", new Object[]{context, str, obj});
        }
        if (context == null) {
            return obj;
        }
        try {
            sharedPreferences = context.getSharedPreferences("orange", 0);
        } catch (Throwable th) {
            OLog.e("SPUtil", "get from share preference failed", th.toString());
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    public static Set<String> c(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d16e25e7", new Object[]{context, str, set});
        }
        if (context == null) {
            return set;
        }
        try {
            return new HashSet(context.getSharedPreferences("orange", 0).getStringSet(str, set));
        } catch (Throwable th) {
            OLog.e("SPUtil", "get set from share preference failed", th.toString());
            return set;
        }
    }

    public static void d(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd9642e", new Object[]{context, str, set});
        } else if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("orange", 0).edit();
                edit.putStringSet(str, set);
                edit.apply();
            } catch (Throwable th) {
                OLog.e("SPUtil", "save set to share preference failed", th.toString());
            }
        }
    }

    public static void e(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8655532", new Object[]{context, str, obj});
        } else if (context != null) {
            try {
                ((ConcurrentHashMap) f22097a).put(str, obj);
                SharedPreferences.Editor edit = context.getSharedPreferences("orange", 0).edit();
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str, ((Long) obj).longValue());
                } else {
                    edit.putString(str, obj.toString());
                }
                edit.apply();
            } catch (Throwable th) {
                OLog.e("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }

    public static void f(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f405e5", new Object[]{context, str, obj});
        } else if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("orange", 0).edit();
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str, ((Long) obj).longValue());
                } else {
                    edit.putString(str, obj.toString());
                }
                edit.apply();
            } catch (Throwable th) {
                OLog.e("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }
}
