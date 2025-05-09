package com.mobile.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class O00oOooO {
    private static SharedPreferences O000000o(Context context) {
        try {
            return context.getSharedPreferences(O00000Oo(context), 0);
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

    public static int O00000Oo(Context context, String str, int i) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return O000000o(context).getInt(str, i);
                    } catch (Exception e) {
                        e.printStackTrace();
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
        }
        return i;
    }

    public static void O000000o(Context context, String str, int i) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        O000000o(context).edit().putInt(str, i).commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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

    public static long O00000Oo(Context context, String str, long j) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return O000000o(context).getLong(str, j);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
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
        return j;
    }

    public static void O000000o(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        O000000o(context).edit().putString(str, str2).commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private static java.lang.String O00000Oo(android.content.Context r1) {
        /*
            java.lang.String r1 = "ct_account_api_sdk"
            return r1
        L_0x0003:
            r1 = move-exception
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r1)     // Catch: all -> 0x0009
            return r0
        L_0x0009:
            r1 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00oOooO.O00000Oo(android.content.Context):java.lang.String");
    }

    public static boolean O000000o(Context context, String str, long j) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return O000000o(context).edit().putLong(str, j).commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return false;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
        return false;
    }

    public static String O00000Oo(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return O000000o(context).getString(str, str2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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
        return str2;
    }
}
