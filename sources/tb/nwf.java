package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcError;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import org.java_websocket.WebSocket;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nwf extends xx<JsonRpcRequest, JsonRpcResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001601);
    }

    public nwf(dti<JsonRpcRequest> dtiVar, hho<JsonRpcRequest, JsonRpcResponse> hhoVar, si4<JsonRpcRequest, JsonRpcResponse> si4Var, tix tixVar) {
        super(dtiVar, hhoVar, si4Var, tixVar);
    }

    public static /* synthetic */ Object ipc$super(nwf nwfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/rpc/JsonRpcHandler");
    }

    /* renamed from: j */
    public void k(JsonRpcRequest jsonRpcRequest, Throwable th, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ffa298", new Object[]{this, jsonRpcRequest, th, webSocket});
        } else {
            t(webSocket, jsonRpcRequest.getId(), JsonRpcError.ERROR_INTERNAL, th.getMessage(), qxv.e(th));
        }
    }

    /* renamed from: l */
    public void d(JsonRpcRequest jsonRpcRequest, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ac4fbb", new Object[]{this, jsonRpcRequest, webSocket});
        } else {
            s(webSocket, jsonRpcRequest.getId(), JsonRpcError.ERROR_METHOD_NOT_FOUND);
        }
    }

    /* renamed from: m */
    public void n(JsonRpcRequest jsonRpcRequest, Object obj, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69a634a", new Object[]{this, jsonRpcRequest, obj, webSocket});
        } else if (obj != null && !TextUtils.isEmpty(jsonRpcRequest.getId())) {
            u(webSocket, jsonRpcRequest.getId(), obj);
        }
    }

    /* renamed from: q */
    public boolean g(JsonRpcRequest jsonRpcRequest, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9857b581", new Object[]{this, jsonRpcRequest, webSocket})).booleanValue();
        }
        if (TextUtils.isEmpty(jsonRpcRequest.getMethod())) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public boolean h(JsonRpcResponse jsonRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b1c32f7", new Object[]{this, jsonRpcResponse})).booleanValue();
        }
        if (TextUtils.isEmpty(jsonRpcResponse.getId())) {
            return false;
        }
        return true;
    }

    public final void s(WebSocket webSocket, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33e218f", new Object[]{this, webSocket, str, new Integer(i)});
        } else {
            t(webSocket, str, i, null, null);
        }
    }

    public final void t(WebSocket webSocket, String str, int i, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc22c135", new Object[]{this, webSocket, str, new Integer(i), str2, obj});
        } else if (webSocket.isOpen()) {
            i(webSocket, nho.b(i, str, str2, obj).toString());
        }
    }

    public final void u(WebSocket webSocket, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5830b8", new Object[]{this, webSocket, str, obj});
        } else if (webSocket.isOpen()) {
            i(webSocket, nho.c(str, obj).toString());
        }
    }

    /* renamed from: o */
    public JsonRpcRequest e(String str, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("ecaea60e", new Object[]{this, str, webSocket});
        }
        try {
            return (JsonRpcRequest) JSON.parseObject(str, JsonRpcRequest.class);
        } catch (Throwable th) {
            c4p.C("JsonRpcHandler", "parse request failed", th);
            s(webSocket, "", JsonRpcError.ERROR_PARSE);
            return null;
        }
    }

    /* renamed from: p */
    public JsonRpcResponse f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcResponse) ipChange.ipc$dispatch("6c203dc2", new Object[]{this, str});
        }
        try {
            return (JsonRpcResponse) JSON.parseObject(str, JsonRpcResponse.class);
        } catch (Throwable th) {
            c4p.C("JsonRpcHandler", "parse response failed", th);
            return null;
        }
    }
}
