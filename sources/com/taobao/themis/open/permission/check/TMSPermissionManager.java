package com.taobao.themis.open.permission.check;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.orange.OConstant;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import tb.bbs;
import tb.ckf;
import tb.e0m;
import tb.g0m;
import tb.h11;
import tb.q9s;
import tb.t2o;
import tb.t6s;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSPermissionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TMSPermissionManager INSTANCE = new TMSPermissionManager();
    public static final String TAG = "TMSPermissionManager";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f13679a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/themis/open/permission/check/TMSPermissionManager$SpecialConfigType;", "", OConstant.DIMEN_CONFIG_NAME, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getConfigName", "()Ljava/lang/String;", "HTTPREQUET", "WEBSOCKET", "RESOURCE", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class SpecialConfigType extends Enum<SpecialConfigType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String configName;
        public static final SpecialConfigType HTTPREQUET = new SpecialConfigType("HTTPREQUET", 0, h11.HTTPREQUET);
        public static final SpecialConfigType WEBSOCKET = new SpecialConfigType("WEBSOCKET", 1, h11.WEBSOCKET);
        public static final SpecialConfigType RESOURCE = new SpecialConfigType("RESOURCE", 2, "resource");
        private static final /* synthetic */ SpecialConfigType[] $VALUES = $values();

        private static final /* synthetic */ SpecialConfigType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SpecialConfigType[]) ipChange.ipc$dispatch("71a33ff4", new Object[0]) : new SpecialConfigType[]{HTTPREQUET, WEBSOCKET, RESOURCE};
        }

        private SpecialConfigType(String str, int i, String str2) {
            this.configName = str2;
        }

        public static /* synthetic */ Object ipc$super(SpecialConfigType specialConfigType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/check/TMSPermissionManager$SpecialConfigType");
        }

        public static SpecialConfigType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("d3f3665f", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(SpecialConfigType.class, str);
            }
            return (SpecialConfigType) valueOf;
        }

        public static SpecialConfigType[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("93a804d0", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (SpecialConfigType[]) clone;
        }

        public final String getConfigName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d054f1f6", new Object[]{this});
            }
            return this.configName;
        }
    }

    public final PermissionResult a(String str, ApiContext apiContext) {
        TMSMetaInfoWrapper U;
        PermissionModel w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("7e5ffc64", new Object[]{this, str, apiContext});
        }
        bbs b = apiContext.b();
        apiContext.c();
        if (f13679a.contains(str)) {
            TMSLogger.a(TAG, "checkInvokePermission is in white list, ignore");
            return PermissionResult.IGNORE;
        } else if (apiContext.d() == ApiContext.Source.FRAMEWORK) {
            TMSLogger.a(TAG, "checkInvokePermission is from framework, ignore");
            return PermissionResult.IGNORE;
        } else if (!e0m.INSTANCE.c(b)) {
            TMSLogger.a(TAG, "checkInvokePermission do not need check, ignore");
            return PermissionResult.IGNORE;
        } else {
            Set<String> set = null;
            if (!(b == null || (U = b.U()) == null || (w = U.w()) == null)) {
                set = w.getJsapiList();
            }
            if (set != null) {
                for (String str2 : set) {
                    if (ckf.b(str, str2)) {
                        TMSLogger.a(TAG, "checkInvokePermission in jsapi list, allow");
                        return PermissionResult.ALLOW;
                    }
                }
            }
            TMSLogger.g(TAG, "checkInvokePermission deny");
            return PermissionResult.DENY_N22104;
        }
    }

    public final PermissionResult b(String str, JSONObject jSONObject, ApiContext apiContext) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("fb077e9c", new Object[]{this, str, jSONObject, apiContext});
        }
        if (apiContext == null) {
            bbsVar = null;
        } else {
            bbsVar = apiContext.b();
        }
        if (TextUtils.isEmpty(str) || bbsVar == null) {
            TMSLogger.b(TAG, "checkPermission,instance is null");
            return PermissionResult.DENY_N22101;
        }
        ckf.d(str);
        PermissionResult a2 = a(str, apiContext);
        if (a2 == PermissionResult.ALLOW) {
            return c(str, jSONObject, apiContext);
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r7.equals(tb.h11.HTTPREQUET) == false) goto L_0x00d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (r7.equals("request") == false) goto L_0x00d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r7.equals(tb.h11.UPLOAD_FILE) == false) goto L_0x00d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if (r8 != null) goto L_0x00ac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r5 = r8.getString("url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (r5 != null) goto L_0x00b5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
        return com.taobao.themis.open.permission.check.PermissionResult.IGNORE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        r7 = android.net.Uri.parse(r5).getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r7 != null) goto L_0x00c2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        return com.taobao.themis.open.permission.check.PermissionResult.IGNORE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
        return tb.e0m.INSTANCE.b(r9, r0, "JSAPI_SP_Config_httpRequest_allowedDomain", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.themis.open.permission.check.PermissionResult c(java.lang.String r7, com.alibaba.fastjson.JSONObject r8, com.taobao.themis.kernel.ability.base.ApiContext r9) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.permission.check.TMSPermissionManager.c(java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.themis.kernel.ability.base.ApiContext):com.taobao.themis.open.permission.check.PermissionResult");
    }

    public final boolean e(bbs bbsVar, String str, JSONObject jSONObject) {
        String L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb5b8e46", new Object[]{this, bbsVar, str, jSONObject})).booleanValue();
        }
        ckf.g(str, "apiName");
        q9s q9sVar = q9s.INSTANCE;
        String str2 = "null";
        if (!(bbsVar == null || (L = bbsVar.L()) == null)) {
            str2 = L;
        }
        return q9sVar.J(str2);
    }

    public final boolean d(bbs bbsVar, String str, SpecialConfigType specialConfigType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37097264", new Object[]{this, bbsVar, str, specialConfigType})).booleanValue();
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "url");
        ckf.g(specialConfigType, "configType");
        if (!q9s.y0()) {
            return true;
        }
        String host = Uri.parse(str).getHost();
        if (host == null) {
            return false;
        }
        String str2 = "JSAPI_SP_Config_" + specialConfigType.getConfigName() + "_allowedDomain";
        h11 a2 = g0m.a(bbsVar);
        return a2 == null || e0m.INSTANCE.b(bbsVar, a2, str2, host) == PermissionResult.IGNORE;
    }

    static {
        t2o.a(843055380);
        List<String> m = yz3.m("showNetWorkCheckActivity", "showUCFailDialog", "setKeyboardType", "monitorH5Performance", "monitorH5Performance", "getStartupParams", "inputBlurEvent", "hideCustomKeyBoard", "hideCustomInputMethod4NativeInput", "updateNativeKeyBoardInput", "setInputTextChanged", "tinyAppStandardLog", "tinyDebugConsole", "needShowAuthSettingEntry", "sendMtop", "remoteLog", "tyroRequest", "showRemoteDebugMask", "needShowAuthSettingEntry", "reportCicadaStatus", t6s.BRIDGE_ACTION_GETPREFETCHDATA, "checkTinyAppPermission", "checkJSPermission");
        f13679a = m;
        try {
            List parseArray = JSON.parseArray(q9s.z3(), String.class);
            ckf.f(parseArray, AdvanceSetting.NETWORK_TYPE);
            Result.m1108constructorimpl(Boolean.valueOf(m.addAll(parseArray)));
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }
}
