package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000OO {
    private static int O000000o(int i) {
        int i2 = -101;
        if (i != -101) {
            i2 = -1;
            if (i != -1) {
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 2;
                    case 13:
                    case 18:
                    case 19:
                        return 3;
                    default:
                        return i;
                }
            }
        }
        return i2;
    }

    public static boolean O00000Oo(Context context) {
        try {
            NetworkInfo O000000o = O000000o(context);
            if (O000000o == null) {
                return false;
            }
            if (O000000o.isAvailable()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static boolean O00000o(Context context) {
        if (context == null) {
            return true;
        }
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
        } catch (Throwable th) {
            try {
                O000000o.O000000o("NetUtil", "isMobileEnable error ", th);
                return true;
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return false;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return false;
                }
            }
        }
    }

    public static boolean O00000o0(Context context) {
        try {
            NetworkInfo O000000o = O000000o(context);
            if (O000000o != null) {
                if (O000000o.getType() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static String O00000oO(Context context) {
        try {
            int O0000OoO = O0000OoO(context);
            if (O0000OoO == -101) {
                return "WIFI";
            }
            if (O0000OoO == -1 || O0000OoO == 0) {
                return "null";
            }
            if (O0000OoO == 1) {
                return "2G";
            }
            if (O0000OoO == 2) {
                return "3G";
            }
            if (O0000OoO != 3) {
                return Integer.toString(O0000OoO);
            }
            return "4G";
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static String O00000oo(Context context) {
        try {
            String O00000oO = O00000oO(context);
            if (O00000oO != null && O00000oO.equals("WIFI")) {
                if (O00000o(context)) {
                    return "BOTH";
                }
            }
            return O00000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static String O0000O0o(Context context) {
        try {
            String O00000oo = O00000oo(context);
            if (!TextUtils.isEmpty(O00000oo) && !O00000oo.equals("null")) {
                if (O00000oo.equals("2G")) {
                    return "10";
                }
                if (O00000oo.equals("3G")) {
                    return "11";
                }
                if (O00000oo.equals("4G")) {
                    return "12";
                }
                if (O00000oo.equals("WIFI")) {
                    return "13";
                }
                if (O00000oo.equals("BOTH")) {
                    return "14";
                }
            }
            return "15";
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static String O0000OOo(Context context) {
        try {
            if (System.currentTimeMillis() - O0000Oo0(context) > AuthenticatorCache.MAX_CACHE_TIME) {
                return "1";
            }
            try {
                return O00oOooO.O00000Oo(context, "key_s_p_dm", "1");
            } catch (Exception e) {
                e.printStackTrace();
                return "1";
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static String O0000Oo(Context context) {
        try {
            String O0000OOo = O0000OOo(context);
            if (TextUtils.isEmpty(O0000OOo) || O0000OOo.equals("1")) {
                return "https://id6.me/auth/preauth.do";
            }
            if (O0000OOo.equals("2")) {
                return "https://card.e.189.cn/auth/preauth.do";
            }
            return "https://id6.me/auth/preauth.do";
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static long O0000Oo0(Context context) {
        Long l;
        try {
            try {
                l = Long.valueOf(O00oOooO.O00000Oo(context, "key_s_p_dm_time", 0L));
            } catch (Exception e) {
                e.printStackTrace();
                l = null;
            }
            return l.longValue();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1L;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1L;
            }
        }
    }

    private static int O0000OoO(Context context) {
        int i = 0;
        try {
            try {
                NetworkInfo O000000o = O000000o(context);
                if (O000000o == null || !O000000o.isAvailable() || !O000000o.isConnected()) {
                    i = -1;
                } else {
                    int type = O000000o.getType();
                    if (type == 1) {
                        i = -101;
                    } else if (type == 0) {
                        i = O000000o.getSubtype();
                    }
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return -1;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return -1;
                }
            }
        } catch (NullPointerException | Exception e) {
            e.printStackTrace();
        }
        return O000000o(i);
    }

    public static NetworkInfo O000000o(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static void O000000o(Context context, long j) {
        try {
            try {
                O00oOooO.O000000o(context, "key_s_p_dm_time", j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O000000o(Context context, String str) {
        try {
            try {
                O00oOooO.O000000o(context, "key_s_p_dm", str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
