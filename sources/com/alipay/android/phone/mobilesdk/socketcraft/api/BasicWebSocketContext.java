package com.alipay.android.phone.mobilesdk.socketcraft.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BasicWebSocketContext implements WebSocketContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WebSocketContext f3751a;
    public Map b;

    public BasicWebSocketContext() {
        this(null);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        Map map = this.b;
        if (map != null) {
            ((HashMap) map).clear();
        }
        WebSocketContext webSocketContext = this.f3751a;
        if (webSocketContext != null) {
            webSocketContext.clear();
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public Object getAttribute(String str) {
        Object obj;
        WebSocketContext webSocketContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("60511e1b", new Object[]{this, str});
        }
        if (str != null) {
            Map map = this.b;
            if (map != null) {
                obj = ((HashMap) map).get(str);
            } else {
                obj = null;
            }
            if (obj != null || (webSocketContext = this.f3751a) == null) {
                return obj;
            }
            return webSocketContext.getAttribute(str);
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public Object removeAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d7e3349", new Object[]{this, str});
        }
        if (str != null) {
            Map map = this.b;
            if (map != null) {
                return map.remove(str);
            }
            return null;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketContext
    public void setAttribute(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd20287", new Object[]{this, str, obj});
        } else if (str != null) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(str, obj);
        } else {
            throw new IllegalArgumentException("Id may not be null");
        }
    }

    public BasicWebSocketContext(WebSocketContext webSocketContext) {
        this.b = null;
        this.f3751a = webSocketContext;
    }
}
