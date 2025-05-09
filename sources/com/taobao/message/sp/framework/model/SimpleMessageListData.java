package com.taobao.message.sp.framework.model;

import com.taobao.message.datasdk.facade.model.ResultData;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageListData implements Serializable {
    public static final String KEY_REASONS = "reasons";
    public static final String REASON_ARRIVE = "messageArrive";
    public static final String REASON_SEND = "messageSend";
    public static final String SOURCE_NAME_MESSAGE = "messageSource";
    public int changeType;
    public boolean forward = true;
    public List<ResultData<SimpleMessage>> list;
    public boolean newHasMore;
    public boolean oldHasMore;
    public String reason;

    static {
        t2o.a(552599666);
    }
}
