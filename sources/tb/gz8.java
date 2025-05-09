package tb;

import com.taobao.phenix.compat.stat.TBImageFlowMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface gz8 extends sy8 {
    public static final uqq URL = new uqq("url");
    public static final uqq HOST = new uqq("host");
    public static final uqq IP = new uqq(pod.IP);
    public static final bef RETRY_TIMES = new bef("retryTimes");
    public static final uqq NET_TYPE = new uqq("netType");
    public static final uqq PROTOCOL_TYPE = new uqq("protocolType");
    public static final bef RET = new bef(rb.RESULT_KEY);
    public static final uqq BIZ_ID = new uqq("bizID");
    public static final ckh REQ_INFLATE_SIZE = new ckh("reqInflateSize");
    public static final ckh REQ_DEFLATE_SIZE = new ckh("reqDeflateSize");
    public static final ckh RSP_INFLATE_SIZE = new ckh("rspInflateSize");
    public static final ckh RSP_DEFLATE_SIZE = new ckh("rspDeflateSize");
    public static final ckh SEND_DATA_TIME = new ckh("sendDataTime");
    public static final ckh FIRST_DATA_TIME = new ckh("firstDataTime");
    public static final ckh DESERIALIZE_TIME = new ckh("deserializeTime");
    public static final ckh DISK_CACHE_LOOKUP_TIME = new ckh("diskCacheLookupTime");
    public static final bef IS_REQ_SYNC = new bef("isReqSync");
    public static final bef IS_REQ_MAIN = new bef("isReqMain");
    public static final bef IS_CB_MAIN = new bef("isCbMain");
    public static final uqq API_NAME = new uqq("apiName");
    public static final uqq SERVER_TRACE_ID = new uqq("serverTraceID");
    public static final ckh MTOP_SIGN_TIME = new ckh("signTime");
    public static final ckh MTOP_BIZ_FIRST_CHUNK_INFLATE_SIZE = new ckh("bizFirstChunkInflateSize");
    public static final ckh MTOP_BIZ_FIRST_CHUNK_TIME = new ckh("bizFirstChunkTime");
    public static final bef PIC_DATA_FROM = new bef(TBImageFlowMonitor.DATA_FROM_DIMEN);
    public static final bef PAGE_INDEX = new bef("pageIndex");
    public static final uqq TOPIC = new uqq("topic");
    public static final bef LAUNCH_TYPE = new bef("launchType");
    public static final ckh SERVER_BIZ_RT = new ckh("serverBizRT");
    public static final bef SERVER_CROSS_UNIT = new bef("serverCrossUnit");
    public static final uqq IMAGE_FORMAT = new uqq("format");

    void W(Long l);

    void Y(Long l);

    void b0(Long l);

    void i0(Long l);

    void k0(Long l);

    void l(Long l);

    void m0(Long l);

    void o0(Long l);

    void s(long j);

    void x(Long l);
}
