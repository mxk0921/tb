package com.taobao.accs;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ErrorCode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCS_DISABLEED = -17;
    public static final int APPKEY_NULL = -14;
    public static final int APPRECEIVER_NULL = -16;
    public static final int APPSECRET_NULL = -15;
    public static final int APP_NOT_BIND = 300;
    public static final int AUTH_EXCEPTION = -7;
    public static final int AUTH_PARAM_ERROR = -6;
    public static final int CON_DISCONNECTED = -10;
    public static final int DM_APPKEY_INVALID = 303;
    public static final int DM_DEVICEID_INVALID = 302;
    public static final int DM_PACKAGENAME_INVALID = 304;
    public static final int DM_TAIR_ERROR = 102;
    public static final int MESSAGE_HOST_NULL = -5;
    public static final int MESSAGE_QUEUE_FULL = 70008;
    public static final int MESSAGE_TOO_LARGE = -4;
    public static final int NETWORK_FAIL = -1;
    public static final int NO_NETWORK = -13;
    public static final int PARAMETER_ERROR = -2;
    public static final int PING_TIME_OUT = -12;
    public static final int REQ_TIME_OUT = -9;
    public static final int SEND_TIME_OUT = -18;
    public static final int SERVICE_NOT_AVAILABLE = -3;
    public static final int SERVIER_ANTI_BRUSH = 70022;
    public static final int SERVIER_HIGH_LIMIT = 70021;
    public static final int SERVIER_HIGH_LIMIT_BRUSH = 70023;
    public static final int SERVIER_LOW_LIMIT = 70020;
    public static final int SESSION_NULL = -11;
    public static final int SUCCESS = 200;
    public static final int UNKNOWN_ERROR = -8;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum INIT_ERROR {
        NO_NETWORK,
        APPKEY_NULL,
        APPSECRET_NULL,
        APPRECEIVER_NULL,
        REQ_TIME_OUT,
        CONN_INVALID,
        NO_CONNECTTION,
        UNKNOWN_ERROR,
        SERVER_TAIR_ERROR,
        SERVER_DEVICEID_INVALID,
        SERVER_APPKEY_INVALID,
        SERVER_PACKAGENAME_INVALID,
        SUCCESS;
        
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int BASE_ORDINAL = 1000;

        public static /* synthetic */ Object ipc$super(INIT_ERROR init_error, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/ErrorCode$INIT_ERROR");
        }

        public static INIT_ERROR valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (INIT_ERROR) ipChange.ipc$dispatch("4fc4c71a", new Object[]{str});
            }
            return (INIT_ERROR) Enum.valueOf(INIT_ERROR.class, str);
        }

        public int getErrorCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
            }
            return ordinal() + 1000;
        }
    }

    static {
        t2o.a(343932944);
    }

    public static INIT_ERROR convertError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INIT_ERROR) ipChange.ipc$dispatch("5a67c32c", new Object[]{new Integer(i)});
        }
        INIT_ERROR init_error = INIT_ERROR.UNKNOWN_ERROR;
        if (i == -301) {
            return INIT_ERROR.CONN_INVALID;
        }
        if (i == -11) {
            return INIT_ERROR.NO_CONNECTTION;
        }
        if (i == 102) {
            return INIT_ERROR.SERVER_TAIR_ERROR;
        }
        if (i == 200) {
            return INIT_ERROR.SUCCESS;
        }
        if (i == -9) {
            return INIT_ERROR.REQ_TIME_OUT;
        }
        if (i == -8) {
            return init_error;
        }
        switch (i) {
            case -16:
                return INIT_ERROR.APPRECEIVER_NULL;
            case -15:
                return INIT_ERROR.APPSECRET_NULL;
            case -14:
                return INIT_ERROR.APPKEY_NULL;
            case -13:
                return INIT_ERROR.NO_NETWORK;
            default:
                switch (i) {
                    case 302:
                        return INIT_ERROR.SERVER_DEVICEID_INVALID;
                    case 303:
                        return INIT_ERROR.SERVER_APPKEY_INVALID;
                    case 304:
                        return INIT_ERROR.SERVER_PACKAGENAME_INVALID;
                    default:
                        return init_error;
                }
        }
    }

    public static boolean isChannelError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf2cfb1", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == -1 || i == -9 || i == -11 || i == -7) {
            return true;
        }
        return false;
    }
}
