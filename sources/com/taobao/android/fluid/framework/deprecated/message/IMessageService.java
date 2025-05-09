package com.taobao.android.fluid.framework.deprecated.message;

import com.taobao.android.fluid.core.FluidService;
import tb.aca;
import tb.ar9;
import tb.hmi;
import tb.htc;
import tb.lr9;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IMessageService extends FluidService {
    public static final ar9 ERROR_CODE_GET_CARD_DATA_MESSAGE_FIELDS_THROWABLE = new ar9("MESSAGE-1", "获取卡片数据消息的参数字段异常");
    public static final String SERVICE_NAME = "IMessageService";

    /* synthetic */ void addMessageListener(String str, htc htcVar);

    aca getGlobalNativeMessageHandler();

    hmi getMessageCenter();

    /* synthetic */ void onDestroy();

    /* synthetic */ void registerMessageHandler(lr9 lr9Var);

    /* synthetic */ void removeMessageListener(String str, htc htcVar);

    /* synthetic */ void sendMessage(vrp vrpVar);

    /* synthetic */ void unRegisterMessageHandler(lr9 lr9Var);
}
