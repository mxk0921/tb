package com.alipay.mobile.common.transportext.amnet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Baggage {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Amnet {
        public static final String ADDRESS_ALL = "all-link";
        public static final String ADDRESS_LONG = "long-link";
        public static final String ADDRESS_MULTIPLEX = "multiplex-link";
        public static final String ADDRESS_SHORT = "short-link";
        public static final int ALT_ADDRESS = 8;
        public static final int ALT_GROUND = 1;
        public static final int ALT_HEARTBEAT = 5;
        public static final int ALT_HUAWEI = 10;
        public static final int ALT_NET = 0;
        public static final int ALT_PROCESS = 3;
        public static final int ALT_RESND_INIT = 14;
        public static final int ALT_RESND_SESSIONID = 15;
        public static final int ALT_RTT = 7;
        public static final int ALT_SCENE = 11;
        public static final int ALT_SCREEN = 2;
        public static final int ALT_SECURITY = 6;
        public static final int ALT_SINGLE = 9;
        public static final int ALT_SWITCH = 12;
        public static final int ALT_USER = 4;
        public static final int BIFROST_HTTP2_TARGET = 1;
        public static final int BIFROST_MMTP_TARGET = 0;
        public static final int BIFROST_MQTT_TARGET = 2;
        public static final String CFG_ADDR = "server-address";
        public static final String CFG_CA = "top-CA";
        public static final String CFG_CERT = "certificate-name";
        public static final String CFG_SSL = "security";
        public static final String FALSE = "0";
        public static final String GROUND_BACK = "background";
        public static final String GROUND_FORE = "foreground";
        public static final String HEARTBEAT_DYNAMIC = "dynamic";
        public static final String HEARTBEAT_STATIC = "static";
        public static final String KEY_BIND_HOSTS = "bind_hosts";
        public static final String KEY_CHECK_CERT = "check_cert";
        public static final String KEY_SUB_TARGET_TYPE = "sub_target_type";
        public static final String LVL_DEBUG = "DEBUG";
        public static final String LVL_ERROR = "ERROR";
        public static final String LVL_FATAL = "FATAL";
        public static final String LVL_INF = "INFO";
        public static final String LVL_VERBOSE = "VERBOSE";
        public static final String LVL_WARN = "WARN";
        public static final String NET_2G = "2g";
        public static final String NET_3G = "3g";
        public static final String NET_4G = "4g";
        public static final String NET_NONE = "none";
        public static final String NET_UNKNOWN = "unknown";
        public static final String NET_WIFI = "wifi";
        public static final String PROCESS_I = "live";
        public static final String PROCESS_O = "dead";
        public static final String RTT_NORMAL = "normal";
        public static final String RTT_ZERO = "fast";
        public static final String SCREEN_I = "enable";
        public static final String SCREEN_O = "disable";
        public static final String SECURITY_DELAYED = "delayed";
        public static final String SECURITY_INSTANT = "instant";
        public static final String SSL_DFT = "*";
        public static final String SSL_MTLS = "mtls";
        public static final String SSL_STD = "standard";
        public static final String TRUE = "1";
        public static final String TURN_OFF = "off";
        public static final String TURN_ON = "on";
        public static final String USER_I = "login";
        public static final String USER_O = "logout";
        public static final String VALUE_SUB_TARGET_TYPE_ONLY_RPC_MODEL = "1";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Linkage {
        public static final String AMNET_DIAGNOSE_LOGTYPE = "amnetDiagnose";
        public static final String AMNET_ST_LOGTYPE = "st";
        public static final int ERR_ADDRESS = 1;
        public static final int ERR_GZIP_DE = 24;
        public static final String ERR_GZIP_DE_MSG = "gzip decompress error";
        public static final int ERR_HANDSHAKE = 7;
        public static final int ERR_HPACK_DE = 21;
        public static final String ERR_HPACK_DE_MSG = "hpack error";
        public static final int ERR_HTTP = 10;
        public static final int ERR_INIT_MSG = 67;
        public static final int ERR_LINK = 6;
        public static final int ERR_MEMORY = 5;
        public static final int ERR_MMTP = 11;
        public static final int ERR_RECEIVE = 2;
        public static final int ERR_SEND = 3;
        public static final int ERR_SHUTDOWN = 9;
        public static final int ERR_SP_GZIP_DE = 76;
        public static final String ERR_SP_GZIP_DE_MSG = "spanner gzip decompress error";
        public static final int ERR_SP_HPACK_DE = 79;
        public static final String ERR_SP_HPACK_DE_MSG = "spanner hpack decompress error";
        public static final int ERR_SP_UN_DICT = 73;
        public static final String ERR_SP_UN_DICT_MSG = "spanner zstd unknown dictionary";
        public static final int ERR_SP_UN_ZIP = 74;
        public static final String ERR_SP_UN_ZIP_MSG = "spanner unknown zip type";
        public static final int ERR_SP_ZSTD_DE = 75;
        public static final String ERR_SP_ZSTD_DE_MSG = "spanner zstd decompress error";
        public static final int ERR_SSL_IO = 8;
        public static final int ERR_SYSTEM = 4;
        public static final int ERR_TIME_OUT = -1;
        public static final String ERR_UN_DICT_MSG = "zstd unknown dictionary";
        public static final String ERR_UN_ZIP_MSG = "unknown zip type";
        public static final int ERR_UN_ZIP_TYPE = 23;
        public static final int ERR_ZSTD_COMP = 69;
        public static final int ERR_ZSTD_DE = 68;
        public static final String ERR_ZSTD_DE_MSG = "zstd decompress error";
        public static final int ERR_ZSTD_UN_DICT = 70;
        public static final String GIFT_NOTIFYLOGINOUT = "notifyLoginOut";
        public static final String GIFT_SHORTCUT = "shortcut_mode";
        public static final String GIFT_VAL_FALSE = "false";
        public static final String GIFT_VAL_START = "start";
        public static final String GIFT_VAL_STOP = "stop";
        public static final String GIFT_VAL_TRUE = "true";
        public static final int RE_CONN_TO = 7;
        public static final int RE_HB_TO = 5;
        public static final int RE_INIT_TO = 12;
        public static final int RE_NET_ERR = 3;
        public static final int RE_NET_SHIFT = 2;
        public static final int RE_OTHERS = 99;
        public static final int RE_PROTOCOL = 11;
        public static final int RE_REMOTE = 4;
        public static final int RE_RESTRICT = 9;
        public static final int RE_RPC_TO = 6;
        public static final int RE_SSL = 8;
        public static final int RE_START = 1;
        public static final int RE_STATUS_TO = 13;
        public static final int RE_SYS = 10;
        public static final int RE_ZIP = 14;
        public static final String RPT_ATTEMPT_COUNT = "attempt count";
        public static final String RPT_ATTEMPT_DURATION = "attempt duration";
        public static final String RPT_DNS = "DNS";
        public static final String RPT_FIRST_FRAME = "first frame";
        public static final String RPT_HEARTBEAT_RTT = "heartbeat RTT";
        public static final String RPT_JVM_SSL_INIT = "JVM SSL handshake";
        public static final String RPT_JVM_TCP_INIT = "JVM TCP connect";
        public static final String RPT_LINK_LIFE = "link life";
        public static final String RPT_NTV_DATA_SEND = "native data send";
        public static final String RPT_NTV_SSL_INIT = "native SSL handshake";
        public static final String RPT_NTV_TCP_INIT = "native TCP connect";
        public static final String RPT_TICKET = "ticket";
        public static final String RPT_ZERO_RTT = "0-RTT";
        public static final int STATE_BROKEN = 0;
        public static final int STATE_CONNECTED = 2;
        public static final int STATE_ESTABLISHED = 4;
        public static final int STATE_HANDSHAKING = 3;
        public static final int STATE_LINKING = 1;
        public static final int STATE_SHUTTING = 5;
    }
}
