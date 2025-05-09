package com.taobao.themis.open.ability.file;

import com.alibaba.alibity.container.file.FileAbility;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.has;
import tb.j8s;
import tb.nc9;
import tb.t2o;
import tb.vg9;
import tb.ws4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0003¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/open/ability/file/TMSFileBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "path", "digestAlgorithm", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", FileAbility.API_GET_FILE_INFO, "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "saveFile", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getSavedFileInfo", "getSavedFileList", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "removeSavedFile", "onInitialized", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSFileBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055222);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055221);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getFileInfo(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String str, @BindingParam(name = {"digestAlgorithm"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a96f24", new Object[]{this, apiContext, str, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "path");
        ckf.g(str2, "digestAlgorithm");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSFileBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        has.INSTANCE.m(b, str, str2, bridgeCallback);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getSavedFileInfo(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b307d3", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSFileBridge", "getSavedFileInfo, access failed! instance is not a TMSInstance");
        } else if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileBridge", "getSavedFileInfo, param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileBridge", "getSavedFileInfo, param is invalid! path contains relative parent!");
        } else {
            ApPathType d = ws4.d(str, b);
            if (d == ApPathType.AP_PATH_TYPE_USR || d == ApPathType.AP_PATH_TYPE_TEMP) {
                String a2 = ws4.a(TMSInstanceExtKt.f(b), str, d);
                if (a2 == null || a2.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.b("TMSFileBridge", "getSavedFileInfo, access failed! convert to local path error!");
                    return;
                }
                File file = new File(a2);
                long c = nc9.c(file);
                long b2 = nc9.b(file);
                if (c == 0 || b2 == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.b("TMSFileBridge", "getSavedFileInfo, access failed! file size or create time is zero!");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
                jSONObject.put((JSONObject) "size", (String) Long.valueOf(c));
                jSONObject.put((JSONObject) "createTime", (String) Long.valueOf(b2));
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
                return;
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileBridge", "getSavedFileInfo, param is invalid! only handle usr/tmp path");
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getSavedFileList(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303e632d", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSFileBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        has.INSTANCE.n(b, "https://usr/saved/", bridgeCallback);
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void removeSavedFile(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b86430f", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSFileBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        ApPathType d = ws4.d(str, b);
        if (!(d == ApPathType.AP_PATH_TYPE_USR || d == ApPathType.AP_PATH_TYPE_TEMP)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSFileBridge", "param is invalid! only handle usr/tmp path");
        }
        has.INSTANCE.w(b, str, bridgeCallback);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void saveFile(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89a85b5", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSFileBridge", "saveFile, access failed! instance is not a TMSInstance");
            return;
        }
        if (ws4.d(str, b) != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("TMSFileBridge", "saveFile, only temp path is allowed to be saved");
        }
        has.INSTANCE.v(b, str, "https://usr/saved/", bridgeCallback);
    }
}
