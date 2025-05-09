package tb;

import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface hmc {
    public static final int STATUS_ANCHOR_BACK = 4;
    public static final int STATUS_ANCHOR_END = 5;
    public static final int STATUS_ANCHOR_LEAVE = 3;
    public static final int STATUS_ENTER_UT_TRACK = 11;
    public static final int STATUS_FANDOM_INIT_FAIL = 10;
    public static final int STATUS_FANDOM_INIT_SUCCESS = 9;
    public static final int STATUS_HEADER_FIELD = 8;
    public static final int STATUS_IDLE = -1;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_INIT_FAIL = 2;
    public static final int STATUS_INIT_SUCCESS = 1;
    public static final int STATUS_LIVE_PUNISH = 12;
    public static final int STATUS_LIVE_PUNISH_CANCEL = 13;
    public static final int STATUS_PARSE_DATA_START = 7;
    public static final int STATUS_TBTV_CHANGED = 6;

    void a(gtc gtcVar);

    void c(String str);

    void e(hbd hbdVar);

    void i();

    void j();

    void k(TLiveMsg tLiveMsg);

    void l(gtc gtcVar, MessageTypeFilter messageTypeFilter);
}
