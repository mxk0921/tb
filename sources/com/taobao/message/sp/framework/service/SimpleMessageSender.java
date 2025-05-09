package com.taobao.message.sp.framework.service;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleMessageSender;", "", "<init>", "()V", "", "text", "buildTextMessageBody", "(Ljava/lang/String;)Ljava/lang/String;", "Ltb/xhv;", "buildImageMessageBody", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleMessageSender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleMessageSender INSTANCE = new SimpleMessageSender();

    static {
        t2o.a(552599710);
    }

    private SimpleMessageSender() {
    }

    public final void buildImageMessageBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c834cf03", new Object[]{this});
        }
    }

    public final String buildTextMessageBody(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d1bbe1", new Object[]{this, str});
        }
        ckf.h(str, "text");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "text", str);
        jSONObject.put((JSONObject) "templateId", "101");
        jSONObject.put((JSONObject) "templateData", (String) jSONObject2);
        String jSONString = jSONObject.toJSONString();
        ckf.c(jSONString, "body.toJSONString()");
        return jSONString;
    }
}
