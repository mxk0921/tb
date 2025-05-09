package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b1x INSTANCE = new b1x();

    /* renamed from: a  reason: collision with root package name */
    public static final BridgeResponse.Error f16132a;
    public static final BridgeResponse.Error b;
    public static final BridgeResponse.Error c;
    public static final BridgeResponse.Error d;
    public static final BridgeResponse.Error e;
    public static final BridgeResponse.Error f;
    public static final BridgeResponse.Error g;
    public static final BridgeResponse.Error h;
    public static final BridgeResponse.Error i;
    public static final BridgeResponse.Error j;
    public static final BridgeResponse.Error k;
    public static final BridgeResponse.Error l;

    public final BridgeResponse.Error a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("a673d823", new Object[]{this});
        }
        return j;
    }

    public final BridgeResponse.Error b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("bf16b769", new Object[]{this});
        }
        return f;
    }

    public final BridgeResponse.Error c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("5f7d6a07", new Object[]{this});
        }
        return k;
    }

    public final BridgeResponse.Error d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("53d1eb83", new Object[]{this});
        }
        return h;
    }

    public final BridgeResponse.Error e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("64bdc9b7", new Object[]{this});
        }
        return i;
    }

    public final BridgeResponse.Error f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("fbef0bca", new Object[]{this});
        }
        return g;
    }

    public final BridgeResponse.Error g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("54f35063", new Object[]{this});
        }
        return l;
    }

    public final BridgeResponse.Error h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("b3d1afb0", new Object[]{this});
        }
        return f16132a;
    }

    public final BridgeResponse.Error i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("b36c69cb", new Object[]{this});
        }
        return c;
    }

    public final BridgeResponse.Error j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("9d685fa9", new Object[]{this});
        }
        return d;
    }

    public final BridgeResponse.Error k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("fd1b73ff", new Object[]{this});
        }
        return e;
    }

    public final BridgeResponse.Error l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse.Error) ipChange.ipc$dispatch("fe83fad7", new Object[]{this});
        }
        return b;
    }

    static {
        t2o.a(843055136);
        BridgeResponse.Error newError = BridgeResponse.newError(-1, "未知错误");
        ckf.f(newError, "newError(-1, \"未知错误\")");
        f16132a = newError;
        BridgeResponse.Error newError2 = BridgeResponse.newError(-1, "当前存在一个已有的连接");
        ckf.f(newError2, "newError(-1, \"当前存在一个已有的连接\")");
        b = newError2;
        BridgeResponse.Error newError3 = BridgeResponse.newError(-1, "URL 为空.");
        ckf.f(newError3, "newError(-1, \"URL 为空.\")");
        c = newError3;
        BridgeResponse.Error newError4 = BridgeResponse.newError(-1, "URL 格式不合法.");
        ckf.f(newError4, "newError(-1, \"URL 格式不合法.\")");
        d = newError4;
        BridgeResponse.Error newError5 = BridgeResponse.newError(-1, "URL 地址不是 ws 或者 wss.");
        ckf.f(newError5, "newError(-1, \"URL 地址不是 ws 或者 wss.\")");
        e = newError5;
        BridgeResponse.Error newError6 = BridgeResponse.newError(-1, "建连超时.");
        ckf.f(newError6, "newError(-1, \"建连超时.\")");
        f = newError6;
        BridgeResponse.Error newError7 = BridgeResponse.newError(-1, "SSL 握手失败.");
        ckf.f(newError7, "newError(-1, \"SSL 握手失败.\")");
        g = newError7;
        BridgeResponse.Error newError8 = BridgeResponse.newError(-1, "Invalid Sec-WebSocket-Accept response.");
        ckf.f(newError8, "newError(-1, \"Invalid Se…Socket-Accept response.\")");
        h = newError8;
        BridgeResponse.Error newError9 = BridgeResponse.newError(-1, "Server specified Sec-WebSocket-Protocol that wasn't requested.");
        ckf.f(newError9, "newError(\n        -1,\n  … wasn't requested.\"\n    )");
        i = newError9;
        BridgeResponse.Error newError10 = BridgeResponse.newError(-1, "没有建连成功之前无法发送消息.");
        ckf.f(newError10, "newError(-1, \"没有建连成功之前无法发送消息.\")");
        j = newError10;
        BridgeResponse.Error newError11 = BridgeResponse.newError(-1, "Error writing to stream.");
        ckf.f(newError11, "newError(-1, \"Error writing to stream.\")");
        k = newError11;
        BridgeResponse.Error newError12 = BridgeResponse.newError(-1, "不能分配内存给当前的 Websocket 连接使用.");
        ckf.f(newError12, "newError(-1, \"不能分配内存给当前的 Websocket 连接使用.\")");
        l = newError12;
    }
}
