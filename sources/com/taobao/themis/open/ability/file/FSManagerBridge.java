package com.taobao.themis.open.ability.file;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.alibity.container.file.FileAbility;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.utils.ApPathType;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import tb.a07;
import tb.aqo;
import tb.bbs;
import tb.ckf;
import tb.f4w;
import tb.gbs;
import tb.gcs;
import tb.gpe;
import tb.gpo;
import tb.has;
import tb.j8s;
import tb.t2o;
import tb.uj3;
import tb.vg9;
import tb.vva;
import tb.ws4;
import tb.zht;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0003¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/open/ability/file/FSManagerBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/fastjson/JSONObject;", "params", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "Ltb/xhv;", "fsManage", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "onInitialized", "onFinalized", "Companion", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class FSManagerBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055203);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(843055202);
        t2o.a(839909427);
    }

    public static /* synthetic */ void writeFile$default(FSManagerBridge fSManagerBridge, bbs bbsVar, JSONObject jSONObject, boolean z, BridgeCallback bridgeCallback, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1fc75b", new Object[]{fSManagerBridge, bbsVar, jSONObject, new Boolean(z), bridgeCallback, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        fSManagerBridge.q(bbsVar, jSONObject, z, bridgeCallback);
    }

    public final void a(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a01f813", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "path");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        has.INSTANCE.a(bbsVar, d, bridgeCallback);
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d10349", new Object[]{this, str});
        }
        return TextUtils.isEmpty(str) ? str : (TextUtils.equals(str, "ucs2") || TextUtils.equals(str, "ucs-2") || TextUtils.equals(str, "utf16le") || TextUtils.equals(str, "utf-16le")) ? "UTF-16LE" : str;
    }

    public final void c(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910df500", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("srcPath");
        if (string == null || string.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "oldPath is empty or null");
            return;
        }
        ApPathType d = ws4.d(string, bbsVar);
        ApPathType apPathType = ApPathType.AP_PATH_TYPE_USR;
        if (!(d == apPathType || d == ApPathType.AP_PATH_TYPE_TEMP)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("FSManagerBridge", "param is invalid! only handle usr/tmp path");
        }
        String string2 = jSONObject.getString("destPath");
        if (string2 == null || string2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "oldPath is empty or null");
            return;
        }
        if (ws4.d(string2, bbsVar) != apPathType) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("FSManagerBridge", "param is invalid! only handle usr path");
        }
        has.INSTANCE.e(bbsVar, string, string2, bridgeCallback);
    }

    public final void d(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ad6f", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "filePath");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        String d2 = gbs.d(jSONObject, "digestAlgorithm");
        has hasVar = has.INSTANCE;
        ckf.f(d, "path");
        ckf.f(d2, "digestAlgorithm");
        hasVar.m(bbsVar, d, d2, bridgeCallback);
    }

    public final void e(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58865a1a", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
        } else {
            has.INSTANCE.n(bbsVar, "https://usr/saved/", bridgeCallback);
        }
    }

    public final void g(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0a1206", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "dirPath");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        has.INSTANCE.r(bbsVar, d, bridgeCallback);
    }

    public final void i(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d828656e", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("filePath");
        if (string == null || string.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "removeSavedFile, filePath is empty or null");
            return;
        }
        ApPathType d = ws4.d(string, bbsVar);
        if (d == ApPathType.AP_PATH_TYPE_USR || d == ApPathType.AP_PATH_TYPE_TEMP) {
            has.INSTANCE.w(bbsVar, string, bridgeCallback);
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        TMSLogger.b("FSManagerBridge", "removeSavedFile, param is invalid! only handle usr/temp path");
    }

    public final void j(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c8d16d", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("oldPath");
        if (string == null || string.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "oldPath is empty or null");
            return;
        }
        ApPathType d = ws4.d(string, bbsVar);
        ApPathType apPathType = ApPathType.AP_PATH_TYPE_USR;
        if (d != apPathType) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("FSManagerBridge", "param is invalid! only handle usr path");
        }
        String string2 = jSONObject.getString("newPath");
        if (string2 == null || string2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "newPath is empty or null");
            return;
        }
        ApPathType d2 = ws4.d(string2, bbsVar);
        if (!(d2 == apPathType || d2 == ApPathType.AP_PATH_TYPE_TEMP)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("FSManagerBridge", "param is invalid! only handle usr/tmp path");
        }
        has.INSTANCE.t(bbsVar, string, string2, bridgeCallback);
    }

    public final void l(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e05908", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String string = jSONObject.getString("tempFilePath");
        if (string == null || string.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "saveFile, tempFilePath is empty or null");
            return;
        }
        if (ws4.d(string, bbsVar) != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("FSManagerBridge", "saveFile, only temp path is allowed to be saved");
        }
        String string2 = jSONObject.getString("filePath");
        if (string2 == null || string2.length() == 0) {
            has.INSTANCE.v(bbsVar, string, "https://usr/saved/", bridgeCallback);
            return;
        }
        if (ws4.d(string2, bbsVar) != ApPathType.AP_PATH_TYPE_USR) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("FSManagerBridge", "only usr path is allowed to be saved");
        }
        has.INSTANCE.v(bbsVar, string, string2, bridgeCallback);
    }

    public final void o(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9014e02", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "filePath");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        has hasVar = has.INSTANCE;
        ckf.f(d, "path");
        hasVar.w(bbsVar, d, bridgeCallback);
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

    public final void p(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef96c397", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "zipFilePath");
        String d2 = gbs.d(jSONObject, "targetPath");
        if (d2 == null || d2.length() == 0 || d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "zipFilePath[" + ((Object) d) + "] or targetPath[" + ((Object) d2) + "]  is empty or null");
            return;
        }
        has.INSTANCE.x(bbsVar, d, d2, bridgeCallback);
    }

    public final void q(bbs bbsVar, JSONObject jSONObject, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02e1afa", new Object[]{this, bbsVar, jSONObject, new Boolean(z), bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "filePath");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        String string = jSONObject.getString("data");
        if (string == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", f4w.LOAD_DATA_NULL);
            return;
        }
        String e = gbs.e(jSONObject, "encoding", "utf8");
        ckf.f(e, "getString(params, \"encoding\", \"utf8\")");
        has.INSTANCE.y(bbsVar, d, string, ckf.b(jSONObject.getString("dataType"), "ArrayBuffer") ? "base64" : e, z, bridgeCallback);
    }

    public final void f(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e97b1e", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "dirPath");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        has.INSTANCE.p(bbsVar, d, gbs.a(jSONObject, "recursive", false), bridgeCallback);
    }

    public final void h(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea04c161", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "filePath");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        String string = jSONObject.getString("dataType");
        String d2 = gbs.d(jSONObject, "encoding");
        if (d2 == null || d2.length() == 0 || ckf.b(string, "ArrayBuffer")) {
            d2 = "ArrayBuffer";
        }
        if (ws4.d(d, bbsVar) == ApPathType.AP_PATH_TYPE_PKG) {
            byte[] b = gcs.b(d, bbsVar);
            if (b == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.b("FSManagerBridge", "param is invalid! can't find the resource");
            } else if (ckf.b(d2, "ArrayBuffer")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "success", (String) Boolean.TRUE);
                jSONObject2.put((JSONObject) "dataType", "ArrayBuffer");
                jSONObject2.put((JSONObject) "data", (String) b);
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject2));
            } else {
                int hashCode = d2.hashCode();
                if (hashCode == -1396204209) {
                    if (d2.equals("base64")) {
                        str = Base64.encodeToString(b, 2);
                    }
                    Charset forName = Charset.forName(b(d2));
                    ckf.f(forName, "forName(convertEncoding(encoding))");
                    str = new String(b, forName);
                } else if (hashCode != -1388966911) {
                    if (hashCode == 103195 && d2.equals("hex")) {
                        str = vva.a(b);
                    }
                    try {
                        Charset forName2 = Charset.forName(b(d2));
                        ckf.f(forName2, "forName(convertEncoding(encoding))");
                        str = new String(b, forName2);
                    } catch (Exception unused) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                        return;
                    }
                } else {
                    if (d2.equals(gpe.BIN_TAG)) {
                        str = new String(b, uj3.UTF_8);
                    }
                    Charset forName22 = Charset.forName(b(d2));
                    ckf.f(forName22, "forName(convertEncoding(encoding))");
                    str = new String(b, forName22);
                }
                if (str != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((JSONObject) "success", (String) Boolean.TRUE);
                    jSONObject3.put((JSONObject) "data", str);
                    bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject3));
                    return;
                }
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("FSManagerBridge", "param is invalid! can't find the resource");
            }
        } else {
            has.INSTANCE.s(bbsVar, d, d2, bridgeCallback);
        }
    }

    public final void k(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d542f1a1", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "dirPath");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "path is empty or null");
            return;
        }
        has.INSTANCE.u(bbsVar, d, gbs.a(jSONObject, "recursive", false), bridgeCallback);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void fsManage(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c131a2", new Object[]{this, apiContext, jSONObject, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(jSONObject, "params");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.b("FSManagerBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        String d = gbs.d(jSONObject, "action");
        if (d == null || d.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("FSManagerBridge", "fsManage action is null or empty");
            return;
        }
        switch (d.hashCode()) {
            case -2139808842:
                if (d.equals(FileAbility.API_APPEND_FILE)) {
                    q(b, jSONObject, true, bridgeCallback);
                    return;
                }
                return;
            case -2073025383:
                if (d.equals("saveFile")) {
                    l(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case -1995982721:
                if (d.equals("removeSavedFile")) {
                    i(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case -1851124693:
                if (d.equals("getSavedFileList")) {
                    e(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case -1423461020:
                if (d.equals(zht.TAG_ACCESS)) {
                    a(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case -1406748165:
                if (d.equals(FileAbility.API_WRITE_FILE)) {
                    q(b, jSONObject, false, bridgeCallback);
                    return;
                }
                return;
            case -934594754:
                if (d.equals(FileAbility.API_RENAME)) {
                    j(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case -867956686:
                if (d.equals("readFile")) {
                    h(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case -840447469:
                if (d.equals("unlink")) {
                    o(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case -506374511:
                if (d.equals(FileAbility.API_COPY_FILE)) {
                    c(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case 3540564:
                if (d.equals("stat")) {
                    n(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case 103950895:
                if (d.equals("mkdir")) {
                    f(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case 108628082:
                if (d.equals("rmdir")) {
                    k(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case 111449576:
                if (d.equals(FileAbility.API_UNZIP)) {
                    p(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case 1080408887:
                if (d.equals("readdir")) {
                    g(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            case 1342041536:
                if (d.equals(FileAbility.API_GET_FILE_INFO)) {
                    d(b, jSONObject, bridgeCallback);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void m(JSONArray jSONArray, File file, File file2, boolean z) {
        File[] listFiles;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab63a6c3", new Object[]{this, jSONArray, file, file2, new Boolean(z)});
            return;
        }
        String path = file2.getPath();
        ckf.f(path, "current.path");
        String substring = path.substring(file.getPath().length());
        ckf.f(substring, "this as java.lang.String).substring(startIndex)");
        boolean isDirectory = file2.isDirectory();
        boolean isFile = file2.isFile();
        aqo a2 = gpo.a(file2.getPath());
        ckf.f(a2, "stat(current.path)");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(substring)) {
            jSONObject.put((JSONObject) "path", substring);
        } else if (file2.isDirectory()) {
            jSONObject.put((JSONObject) "path", "/");
        }
        jSONObject.put((JSONObject) "mode", (String) Integer.valueOf(a2.f15941a));
        jSONObject.put((JSONObject) "size", (String) Long.valueOf(a2.b));
        jSONObject.put((JSONObject) "lastAccessedTime", (String) Long.valueOf(a2.c));
        jSONObject.put((JSONObject) "lastModifiedTime", (String) Long.valueOf(a2.d));
        jSONObject.put((JSONObject) "is_directory", (String) Boolean.valueOf(isDirectory));
        jSONObject.put((JSONObject) "is_file", (String) Boolean.valueOf(isFile));
        jSONArray.add(jSONObject);
        if (z && isDirectory && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
            int length = listFiles.length;
            while (i < length) {
                File file3 = listFiles[i];
                i++;
                ckf.f(file3, "file");
                m(jSONArray, file, file3, z);
            }
        }
    }

    public final void n(bbs bbsVar, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b494dd03", new Object[]{this, bbsVar, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "path");
        ckf.f(d, "getString(params, \"path\")");
        if (vg9.a(d)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        String b = ws4.b(TMSInstanceExtKt.f(bbsVar), d, null, 4, null);
        if (b == null || b.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            return;
        }
        File file = new File(b);
        if (!file.exists()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(123, ckf.p("文件不存在 ", d)));
        } else if (!file.canRead()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(123, ckf.p("指定的 path 路径没有读权限 ", d)));
        } else {
            boolean a2 = gbs.a(jSONObject, "recursive", false);
            JSONArray jSONArray = new JSONArray();
            m(jSONArray, file, file, a2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "success", (String) Boolean.TRUE);
            if (a2 && file.isDirectory()) {
                jSONObject2.put((JSONObject) "stats", (String) jSONArray);
            } else if (jSONArray.size() > 0) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                jSONObject3.remove("path");
                jSONObject2.put((JSONObject) "stats", (String) jSONObject3);
            }
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }
}
