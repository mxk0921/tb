package com.alipay.android.phone.mobilesdk.socketcraft.util;

import com.alipay.android.phone.mobilesdk.socketcraft.api.BasicWebSocketContext;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WSContextUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final WebSocketContext getInnerWebSocketContext(WebSocketContext webSocketContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocketContext) ipChange.ipc$dispatch("4803f827", new Object[]{webSocketContext});
        }
        if (webSocketContext != null) {
            Object attribute = webSocketContext.getAttribute(WSContextConstant.INNER_WS_CONTEXT);
            if (attribute != null && (attribute instanceof WebSocketContext)) {
                return (WebSocketContext) attribute;
            }
            synchronized (WSContextUtil.class) {
                try {
                    Object attribute2 = webSocketContext.getAttribute(WSContextConstant.INNER_WS_CONTEXT);
                    if (attribute2 != null && (attribute2 instanceof WebSocketContext)) {
                        return (WebSocketContext) attribute2;
                    }
                    BasicWebSocketContext basicWebSocketContext = new BasicWebSocketContext();
                    webSocketContext.setAttribute(WSContextConstant.INNER_WS_CONTEXT, basicWebSocketContext);
                    return basicWebSocketContext;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new IllegalArgumentException("webSocketContext parameter can't null");
        }
    }
}
