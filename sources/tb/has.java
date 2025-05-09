package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class has {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_TYPE_ARRAY_BUFFER = "ArrayBuffer";
    public static final has INSTANCE = new has();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20505a;

        public a(BridgeCallback bridgeCallback) {
            this.f20505a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20505a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20505a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20506a;

        public b(BridgeCallback bridgeCallback) {
            this.f20506a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20506a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20506a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20507a;

        public c(BridgeCallback bridgeCallback) {
            this.f20507a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject a2 = jrVar.a();
                Map map = null;
                Object obj = a2 == null ? null : a2.get("data");
                if (obj instanceof Map) {
                    map = (Map) obj;
                }
                if (map == null) {
                    this.f20507a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "can't get data from mega");
                    return;
                }
                Object obj2 = map.get("size");
                Object obj3 = map.get(Constants.CodeCache.BANNER_DIGEST);
                BridgeCallback bridgeCallback = this.f20507a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
                jSONObject.put((JSONObject) "size", (String) obj2);
                jSONObject.put((JSONObject) Constants.CodeCache.BANNER_DIGEST, (String) obj3);
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
                TMSLogger.a("TMSFileAbility", "getFileInfo success, size: " + obj2 + ", digest: " + obj3);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20507a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20509a;

        public e(BridgeCallback bridgeCallback) {
            this.f20509a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20509a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20509a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20510a;

        public f(BridgeCallback bridgeCallback) {
            this.f20510a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            Object obj;
            Map map;
            ArrayList arrayList;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject a2 = jrVar.a();
                if (a2 == null) {
                    obj = null;
                } else {
                    obj = a2.get("data");
                }
                if (obj instanceof Map) {
                    map = (Map) obj;
                } else {
                    map = null;
                }
                if (map == null) {
                    this.f20510a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "can't get data from mega");
                    return;
                }
                Object obj2 = map.get(vs3.FILES_DIR_NAME);
                if (obj2 instanceof ArrayList) {
                    arrayList = (ArrayList) obj2;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof Map) {
                        Object obj3 = ((Map) next).get(UploadConstants.FILE_NAME);
                        if (obj3 instanceof String) {
                            str = (String) obj3;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                }
                this.f20510a.sendBridgeResponse(BridgeResponse.newValue(vs3.FILES_DIR_NAME, arrayList2));
            } else {
                has.b(has.INSTANCE, jrVar, this.f20510a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20511a;

        public g(BridgeCallback bridgeCallback) {
            this.f20511a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject a2 = jrVar.a();
                ByteBuffer byteBuffer = null;
                Object obj = a2 == null ? null : a2.get("data");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map == null) {
                    this.f20511a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "can't get data from mega");
                    return;
                }
                Object obj2 = map.get("data");
                if (obj2 instanceof ByteBuffer) {
                    byteBuffer = (ByteBuffer) obj2;
                }
                if (byteBuffer == null) {
                    this.f20511a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "can't get byteBuffer data from mega");
                    return;
                }
                BridgeCallback bridgeCallback = this.f20511a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
                jSONObject.put((JSONObject) "dataType", "ArrayBuffer");
                jSONObject.put((JSONObject) "data", (String) byteBuffer.array());
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
            } else {
                has.b(has.INSTANCE, jrVar, this.f20511a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20512a;

        public h(BridgeCallback bridgeCallback) {
            this.f20512a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject a2 = jrVar.a();
                String str = null;
                Object obj = a2 == null ? null : a2.get("data");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map == null) {
                    this.f20512a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "can't get data from mega");
                    return;
                }
                Object obj2 = map.get("data");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
                if (str == null) {
                    this.f20512a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "can't get data from mega");
                    return;
                }
                BridgeCallback bridgeCallback = this.f20512a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "success", (String) Boolean.TRUE);
                jSONObject.put((JSONObject) "data", str);
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
            } else {
                has.b(has.INSTANCE, jrVar, this.f20512a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class i implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20513a;

        public i(BridgeCallback bridgeCallback) {
            this.f20513a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20513a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20513a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class j implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20514a;

        public j(BridgeCallback bridgeCallback) {
            this.f20514a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20514a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20514a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class k implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20515a;
        public final /* synthetic */ bbs b;

        public k(BridgeCallback bridgeCallback, bbs bbsVar) {
            this.f20515a = bridgeCallback;
            this.b = bbsVar;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject a2 = jrVar.a();
                String str = null;
                Object obj = a2 == null ? null : a2.get("data");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map == null) {
                    this.f20515a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "saveFile, can't get data from mega");
                    return;
                }
                Object obj2 = map.get("savedFilePath");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
                if (str == null || str.length() == 0) {
                    this.f20515a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "saveFile, can't get savedFilePath from mega");
                    return;
                }
                String f = ws4.f(TMSInstanceExtKt.f(this.b), str, ApPathType.AP_PATH_TYPE_USR);
                if (f == null || f.length() == 0) {
                    this.f20515a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "saveFile, can't get apPath");
                    return;
                }
                this.f20515a.sendBridgeResponse(BridgeResponse.newValue("apFilePath", f));
            } else {
                has.b(has.INSTANCE, jrVar, this.f20515a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class l implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20516a;

        public l(BridgeCallback bridgeCallback) {
            this.f20516a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20516a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20516a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class m implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20517a;

        public m(BridgeCallback bridgeCallback) {
            this.f20517a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20517a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20517a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class n implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20518a;

        public n(BridgeCallback bridgeCallback) {
            this.f20518a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20518a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20518a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class o implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20519a;

        public o(BridgeCallback bridgeCallback) {
            this.f20519a = bridgeCallback;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                this.f20519a.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                has.b(has.INSTANCE, jrVar, this.f20519a);
            }
        }
    }

    static {
        t2o.a(843055205);
    }

    public static final /* synthetic */ void b(has hasVar, jr jrVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a233278", new Object[]{hasVar, jrVar, bridgeCallback});
        } else {
            hasVar.o(jrVar, bridgeCallback);
        }
    }

    public final void a(bbs bbsVar, String str, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1983bd4b", new Object[]{this, bbsVar, str, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            ApPathType d2 = ws4.d(str, bbsVar);
            if (d2 != ApPathType.AP_PATH_TYPE_PKG) {
                String a2 = ws4.a(TMSInstanceExtKt.f(bbsVar), str, d2);
                if (a2 == null || a2.length() == 0) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                    return;
                }
                wc9.INSTANCE.c(bbsVar, a2, new a(bridgeCallback));
            } else if (gcs.a(str, bbsVar)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                bridgeCallback.sendBridgeResponse(j(ckf.p("文件/目录不存在 ", str)));
                TMSLogger.b("TMSFileAbility", "file/dir not found");
            }
        }
    }

    public final BridgeResponse c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("349dbebd", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(10024, str);
        ckf.f(newError, "newError(10024, msg)");
        return newError;
    }

    public final boolean d(Context context, String str, String str2) {
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a7a936", new Object[]{this, context, str, str2})).booleanValue();
        }
        if (!(TextUtils.isEmpty(str) || (d2 = bit.Companion.a(str2, context).d()) == null || d2.length() == 0)) {
            long c2 = nc9.c(new File(d2));
            long length = new File(str).length();
            TMSLogger.a("TMSFileAbility", "checkFolderSizeLimited appendSize=" + length + ",folderSize=" + c2);
            if (c2 + length > r9s.f27214a) {
                TMSLogger.b("TMSFileAbility", "checkFolderSizeLimited file exceed limited size");
                return true;
            }
        }
        return false;
    }

    public final BridgeResponse f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("13661ca5", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(17, str);
        ckf.f(newError, "newError(17, msg)");
        return newError;
    }

    public final BridgeResponse g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("e3e2c247", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(16, str);
        ckf.f(newError, "newError(16, msg)");
        return newError;
    }

    public final BridgeResponse h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("c541d248", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(10027, str);
        ckf.f(newError, "newError(10027, msg)");
        return newError;
    }

    public final BridgeResponse i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("658dd4b8", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(10025, str);
        ckf.f(newError, "newError(10025, msg)");
        return newError;
    }

    public final BridgeResponse j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("e104b181", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(10022, str);
        ckf.f(newError, "newError(10022, msg)");
        return newError;
    }

    public final BridgeResponse k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("658b4f8b", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(r9s.c, str);
        ckf.f(newError, "newError(TMSConstants.Fi…_FILE_EXCEEDS_LIMIT, msg)");
        return newError;
    }

    public final void n(bbs bbsVar, String str, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4e797f", new Object[]{this, bbsVar, str, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            ApPathType d2 = ws4.d(str, bbsVar);
            if (!(d2 == ApPathType.AP_PATH_TYPE_USR || d2 == ApPathType.AP_PATH_TYPE_TEMP)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.b("TMSFileAbility", "param is invalid! path can't support");
            }
            String a2 = ws4.a(TMSInstanceExtKt.f(bbsVar), str, d2);
            if (a2 == null || a2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.d(bbsVar, a2, new d(bridgeCallback, bbsVar, a2, d2));
        }
    }

    public final BridgeResponse q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("fa750228", new Object[]{this, str});
        }
        BridgeResponse.Error newError = BridgeResponse.newError(10026, str);
        ckf.f(newError, "newError(10026, msg)");
        return newError;
    }

    public static /* synthetic */ BridgeResponse l(has hasVar, String str, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("7a2929db", new Object[]{hasVar, str, new Integer(i2), obj});
        }
        if ((i2 & 1) != 0) {
            str = "单个文件大小超限";
        }
        return hasVar.k(str);
    }

    public final void e(bbs bbsVar, String str, String str2, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c8fc74", new Object[]{this, bbsVar, str, str2, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "srcPath");
        ckf.g(str2, "destPath");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0 || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str) || vg9.a(str2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            String b3 = ws4.b(TMSInstanceExtKt.f(bbsVar), str2, null, 4, null);
            if (b3 == null || b3.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.b(bbsVar, b2, b3, new b(bridgeCallback));
        }
    }

    public final void m(bbs bbsVar, String str, String str2, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777db9a5", new Object[]{this, bbsVar, str, str2, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(str2, "digestAlgorithm");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.e(bbsVar, b2, str2, new c(bridgeCallback));
        }
    }

    public final void o(jr jrVar, BridgeCallback bridgeCallback) {
        BridgeResponse bridgeResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33de77c", new Object[]{this, jrVar, bridgeCallback});
            return;
        }
        try {
            JSONObject a2 = jrVar.a();
            JSONObject jSONObject = a2 == null ? null : a2.getJSONObject("errorMessage");
            if (jSONObject == null) {
                TMSLogger.b("TMSFileAbility", "mega fail! no error message");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            int intValue = jSONObject.getIntValue("code");
            String string = jSONObject.getString("msg");
            if (string == null) {
                string = "";
            }
            if (intValue == 1016) {
                bridgeResponse = g(string);
            } else if (intValue != 1017) {
                switch (intValue) {
                    case 1021:
                        bridgeResponse = j(string);
                        break;
                    case 1022:
                        bridgeResponse = j(string);
                        break;
                    case 1023:
                        bridgeResponse = c(string);
                        break;
                    case 1024:
                        bridgeResponse = c(string);
                        break;
                    case 1025:
                        bridgeResponse = i(string);
                        break;
                    case 1026:
                        bridgeResponse = h(string);
                        break;
                    case 1027:
                        bridgeResponse = q(string);
                        break;
                    case yj4.VIEW_TYPE_NEW_HOMEPAGE_ONLOOK_HEAD /* 1028 */:
                        bridgeResponse = q(string);
                        break;
                    case 1029:
                        bridgeResponse = q(string);
                        break;
                    case yj4.VIEW_TYPE_NEW_HOMEPAGE_ONLOOK /* 1030 */:
                        bridgeResponse = k(string);
                        break;
                    default:
                        bridgeResponse = BridgeResponse.newError(3, string);
                        break;
                }
            } else {
                bridgeResponse = f(string);
            }
            bridgeCallback.sendBridgeResponse(bridgeResponse);
            TMSLogger.b("TMSFileAbility", "mega fail! code:" + intValue + " msg:" + string);
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            TMSLogger.c("TMSFileAbility", th.getMessage(), th);
        }
    }

    public final void p(bbs bbsVar, String str, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f26804", new Object[]{this, bbsVar, str, new Boolean(z), bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.f(bbsVar, b2, Boolean.valueOf(z), new e(bridgeCallback));
        }
    }

    public final void r(bbs bbsVar, String str, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91275bb8", new Object[]{this, bbsVar, str, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "readDir, param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "readDir, param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "readDir, access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.d(bbsVar, b2, new f(bridgeCallback));
        }
    }

    public final void s(bbs bbsVar, String str, String str2, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efac873", new Object[]{this, bbsVar, str, str2, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(str2, "encoding");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! encoding is empty!");
        } else if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
            } else if (ckf.b(str2, "ArrayBuffer")) {
                wc9.INSTANCE.g(bbsVar, b2, new g(bridgeCallback));
            } else {
                wc9.INSTANCE.h(bbsVar, b2, str2, new h(bridgeCallback));
            }
        }
    }

    public final void t(bbs bbsVar, String str, String str2, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9022ce7", new Object[]{this, bbsVar, str, str2, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "srcPath");
        ckf.g(str2, "destPath");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0 || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str) || vg9.a(str2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            String b3 = ws4.b(TMSInstanceExtKt.f(bbsVar), str2, null, 4, null);
            if (b3 == null || b3.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.k(bbsVar, b2, b3, new i(bridgeCallback));
        }
    }

    public final void u(bbs bbsVar, String str, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d22fc7", new Object[]{this, bbsVar, str, new Boolean(z), bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.i(bbsVar, b2, Boolean.valueOf(z), new j(bridgeCallback));
        }
    }

    public final void v(bbs bbsVar, String str, String str2, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2fbb6c", new Object[]{this, bbsVar, str, str2, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "tempFilePath");
        ckf.g(str2, "filePath");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0 || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str) || vg9.a(str2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            if (ws4.d(str2, bbsVar) != ApPathType.AP_PATH_TYPE_USR) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "only usr path is allowed to save");
            }
            String b3 = ws4.b(TMSInstanceExtKt.f(bbsVar), str2, null, 4, null);
            if (b3 == null || b3.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            String f2 = TMSInstanceExtKt.f(bbsVar);
            if (f2 == null || f2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "saveFile, access failed! bizId is null or empty");
                return;
            }
            Activity I = bbsVar.I();
            ckf.f(I, "instance.activity");
            if (d(I, b2, f2)) {
                bridgeCallback.sendBridgeResponse(k("文件存储大小限制为 10M"));
                TMSLogger.b("TMSFileAbility", "file size limited!");
                return;
            }
            wc9.INSTANCE.k(bbsVar, b2, b3, new k(bridgeCallback, bbsVar));
        }
    }

    public final void w(bbs bbsVar, String str, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477273c", new Object[]{this, bbsVar, str, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            wc9.INSTANCE.j(bbsVar, b2, new l(bridgeCallback));
        }
    }

    public final void x(bbs bbsVar, String str, String str2, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492a127d", new Object[]{this, bbsVar, str, str2, bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "unZipFilePath");
        ckf.g(str2, "targetPath");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str.length() == 0 || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str) || vg9.a(str2)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            String b3 = ws4.b(TMSInstanceExtKt.f(bbsVar), str2, null, 4, null);
            if (b3 == null || b3.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            String b4 = ws4.b(TMSInstanceExtKt.f(bbsVar), bvv.PATH_PREFIX, null, 4, null);
            if (b4 == null || b4.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.b("TMSFileAbility", "can't get usrRootDir");
            }
            wc9.INSTANCE.l(bbsVar, b2, b3, b4, new m(bridgeCallback));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f20508a;
        public final /* synthetic */ bbs b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ApPathType d;

        public d(BridgeCallback bridgeCallback, bbs bbsVar, String str, ApPathType apPathType) {
            this.f20508a = bridgeCallback;
            this.b = bbsVar;
            this.c = str;
            this.d = apPathType;
        }

        @Override // tb.uq
        public final void a(jr jrVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
            } else if (jrVar.d()) {
                JSONObject a2 = jrVar.a();
                Object obj = a2 == null ? null : a2.get("data");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map == null) {
                    this.f20508a.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    TMSLogger.b("TMSFileAbility", "can't get data from mega");
                    return;
                }
                Object obj2 = map.get(vs3.FILES_DIR_NAME);
                ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof Map) {
                        Map map2 = (Map) next;
                        Object obj3 = map2.get(UploadConstants.FILE_NAME);
                        String str = obj3 instanceof String ? (String) obj3 : null;
                        if (str != null) {
                            String f = TMSInstanceExtKt.f(this.b);
                            String f2 = ws4.f(f, ((Object) this.c) + wh6.DIR + str, this.d);
                            if (f2 != null) {
                                Object obj4 = map2.get("createTime");
                                String str2 = obj4 instanceof String ? (String) obj4 : null;
                                if (str2 != null) {
                                    Object obj5 = map2.get("size");
                                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                                    if (str3 != null) {
                                        arrayList2.add(kotlin.collections.a.j(jpu.a("apFilePath", f2), jpu.a("createTime", str2), jpu.a("size", str3)));
                                    }
                                }
                            }
                        }
                    }
                }
                this.f20508a.sendBridgeResponse(BridgeResponse.newValue("fileList", arrayList2));
            } else {
                has.b(has.INSTANCE, jrVar, this.f20508a);
            }
        }
    }

    public final void y(bbs bbsVar, String str, String str2, String str3, boolean z, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174cbee4", new Object[]{this, bbsVar, str, str2, str3, new Boolean(z), bridgeCallback});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(str2, "data");
        ckf.g(str3, "encoding");
        ckf.g(bridgeCallback, "bridgeCallback");
        if (str3.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! encoding is empty!");
        } else if (str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path is empty!");
        } else if (vg9.a(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.b("TMSFileAbility", "param is invalid! path contains relative parent!");
        } else {
            String b2 = ws4.b(TMSInstanceExtKt.f(bbsVar), str, null, 4, null);
            if (b2 == null || b2.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.b("TMSFileAbility", "access failed! convert to local path error!");
                return;
            }
            long length = str2.length();
            if (z) {
                length += vg9.c(b2);
            }
            if (length > r9s.f27214a) {
                bridgeCallback.sendBridgeResponse(l(this, null, 1, null));
                TMSLogger.b("TMSFileAbility", "file size too large!");
                return;
            }
            String b3 = ws4.b(TMSInstanceExtKt.f(bbsVar), bvv.PATH_PREFIX, null, 4, null);
            if (b3 == null || b3.length() == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                TMSLogger.b("TMSFileAbility", "can't get usrRootDir");
            }
            if (vg9.c(b3) + length > r9s.b) {
                bridgeCallback.sendBridgeResponse(l(this, null, 1, null));
                TMSLogger.b("TMSFileAbility", "file size too large!");
            } else if (z) {
                wc9.INSTANCE.a(bbsVar, b2, str2, str3, new n(bridgeCallback));
            } else {
                wc9.INSTANCE.m(bbsVar, b2, str2, str3, new o(bridgeCallback));
            }
        }
    }
}
