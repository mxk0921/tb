package tb;

import android.app.Activity;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.open.permission.auth.ui.LocalAuthDialog;
import com.taobao.weex.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d7h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONST_SCOPE_ADDRESS = "scope.address";
    public static final String CONST_SCOPE_ALI_RUN = "scope.alirun";
    public static final String CONST_SCOPE_BLUETOOTH = "scope.bluetooth";
    public static final String CONST_SCOPE_CAMERA = "scope.camera";
    public static final String CONST_SCOPE_CLIPBOARD = "scope.clipBoard";
    public static final String CONST_SCOPE_CONTACT = "scope.contact";
    public static final String CONST_SCOPE_INVOICE_TITLE = "scope.invoiceTitle";
    public static final String CONST_SCOPE_MAINCITY = "scope.mainCity";
    public static final String CONST_SCOPE_RECORD = "scope.audioRecord";
    public static final String CONST_SCOPE_TB_AUTH = "scope.ta_tb_auth";
    public static final String CONST_SCOPE_USERINFO = "scope.userInfo";
    public static final String CONST_SCOPE_USERLOCATION = "scope.location";
    public static final String CONST_SCOPE_WRITE_PHOTOS_ALBUM = "scope.album";
    public static final d7h INSTANCE = new d7h();
    public static final String TAG = "LocalAuthManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onFail();

        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements LocalAuthDialog.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f17637a;
        public final /* synthetic */ a b;
        public final /* synthetic */ bbs c;

        public b(Map<String, String> map, a aVar, bbs bbsVar) {
            this.f17637a = map;
            this.b = aVar;
            this.c = bbsVar;
        }

        @Override // com.taobao.themis.open.permission.auth.ui.LocalAuthDialog.a
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            TMSLogger.a(d7h.TAG, "LocalAuthDialog cancel, callback failed");
            Set<String> keySet = this.f17637a.keySet();
            bbs bbsVar = this.c;
            for (String str : keySet) {
                ck1.INSTANCE.t(r8s.j(bbsVar), str, false);
            }
            this.b.onFail();
        }

        @Override // com.taobao.themis.open.permission.auth.ui.LocalAuthDialog.a
        public void onConfirm() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310393e8", new Object[]{this});
                return;
            }
            TMSLogger.a(d7h.TAG, "LocalAuthDialog confirm, callback success");
            Set<String> keySet = this.f17637a.keySet();
            bbs bbsVar = this.c;
            for (String str : keySet) {
                ck1.INSTANCE.t(r8s.j(bbsVar), str, true);
            }
            this.b.onSuccess();
        }
    }

    static {
        t2o.a(843055316);
    }

    public final void a(String str, JSONObject jSONObject, ApiContext apiContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4f5671", new Object[]{this, str, jSONObject, apiContext, aVar});
            return;
        }
        ckf.g(str, "apiName");
        ckf.g(apiContext, "apiContext");
        ckf.g(aVar, "callback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            aVar.onSuccess();
            TMSLogger.a(TAG, "instance is null, callback success");
        } else if (r8s.C(b2)) {
            TMSLogger.a(TAG, "instance is inner, callback success");
            aVar.onSuccess();
        } else {
            TMSMetaInfoWrapper U = b2.U();
            JSONArray jSONArray = null;
            String c = c(str, U == null ? null : U.w());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c.length() > 0) {
                TMSMetaInfoWrapper U2 = b2.U();
                linkedHashMap.put(c, d(c, U2 == null ? null : U2.w()));
            }
            if (ckf.b(str, "chooseImage") || ckf.b(str, "chooseVideo")) {
                if (jSONObject != null) {
                    jSONArray = jSONObject.getJSONArray("sourceType");
                }
                if (jSONArray == null) {
                    linkedHashMap.put(CONST_SCOPE_WRITE_PHOTOS_ALBUM, "访问你的相册");
                    linkedHashMap.put(CONST_SCOPE_CAMERA, "使用你的摄像头");
                } else {
                    if (jSONArray.contains("album")) {
                        linkedHashMap.put(CONST_SCOPE_WRITE_PHOTOS_ALBUM, "访问你的相册");
                    }
                    if (jSONArray.contains("camera")) {
                        linkedHashMap.put(CONST_SCOPE_CAMERA, "使用你的摄像头");
                    }
                }
            }
            b(b2, linkedHashMap, aVar);
        }
    }

    public final void b(bbs bbsVar, Map<String, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ff6cf7", new Object[]{this, bbsVar, map, aVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(map, "permissionDesMap");
        ckf.g(aVar, "callback");
        for (String str : i04.B0(map.keySet())) {
            TMSLogger.a(TAG, ckf.p("check local auth status for : ", str));
            if (ckf.b(ck1.INSTANCE.i(r8s.j(bbsVar), str), Boolean.TRUE)) {
                TMSLogger.a(TAG, ckf.p(str, " has local auth"));
                map.remove(str);
            }
        }
        if (map.isEmpty()) {
            aVar.onSuccess();
            TMSLogger.a(TAG, "all permission has been authed");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value != null && value.length() > 0) {
                sb.append(entry.getValue());
                sb.append("，");
            }
        }
        if (!wsq.a0(sb)) {
            sb.deleteCharAt(wsq.S(sb));
        }
        if (wsq.a0(sb)) {
            TMSLogger.a(TAG, "dialogContent is blank, callback success");
            aVar.onSuccess();
            return;
        }
        Activity I = bbsVar.I();
        ckf.f(I, "instance.activity");
        String sb2 = sb.toString();
        ckf.f(sb2, "dialogContent.toString()");
        new LocalAuthDialog(I, sb2, new b(map, aVar, bbsVar)).d();
    }

    public final String d(String str, PermissionModel permissionModel) {
        JSONObject nativeApiScopeConfig;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c66f3f74", new Object[]{this, str, permissionModel});
        }
        ckf.g(str, Constants.Name.SCOPE);
        if (permissionModel == null || (nativeApiScopeConfig = permissionModel.getNativeApiScopeConfig()) == null || (jSONObject = nativeApiScopeConfig.getJSONObject(str)) == null) {
            return null;
        }
        return jSONObject.getString("desc");
    }

    public final String c(String str, PermissionModel permissionModel) {
        JSONObject nativeApiUserAuth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5271afd", new Object[]{this, str, permissionModel});
        }
        String string = (permissionModel == null || (nativeApiUserAuth = permissionModel.getNativeApiUserAuth()) == null) ? null : nativeApiUserAuth.getString(str);
        if (string != null && string.length() != 0) {
            return string;
        }
        if (ckf.b("scan", str)) {
            string = CONST_SCOPE_CAMERA;
        } else if (ckf.b("saveImage", str) || ckf.b("saveVideoToPhotosAlbum", str) || ckf.b("shareTokenImageSilent", str)) {
            string = CONST_SCOPE_WRITE_PHOTOS_ALBUM;
        } else if (wsq.O(str, "Location", false, 2, null) || ckf.b("getMainSelectedCity", str)) {
            string = CONST_SCOPE_USERLOCATION;
        } else if (wsq.O(str, "AudioRecord", false, 2, null)) {
            string = CONST_SCOPE_RECORD;
        } else if (ckf.b(str, "enableBluetooth") || ckf.b(str, "openBluetoothAdapter") || ckf.b(str, "connectBLEDevice") || ckf.b(str, "getBeacons")) {
            string = CONST_SCOPE_BLUETOOTH;
        } else if (ckf.b("contact", str) || ckf.b("chooseContact", str) || ckf.b("APSocialNebulaPlugin.selectContactJSAPI", str)) {
            string = CONST_SCOPE_CONTACT;
        } else if (ckf.b("getClipboard", str)) {
            string = CONST_SCOPE_CLIPBOARD;
        }
        return string == null ? "" : string;
    }
}
