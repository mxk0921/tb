package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.gbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PermissionModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PermissionModel> CREATOR = new Parcelable.Creator<PermissionModel>() { // from class: com.alibaba.ariver.resource.api.models.PermissionModel.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionModel createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PermissionModel) ipChange.ipc$dispatch("dfa018c6", new Object[]{this, parcel}) : new PermissionModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionModel[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PermissionModel[]) ipChange.ipc$dispatch("850c34af", new Object[]{this, new Integer(i)}) : new PermissionModel[i];
        }
    };
    private static final String KEY_ENABLE_PROXY = "enableProxy";
    private static final String KEY_ENABLE_PROXY_LEGACY = "Enable_Proxy";
    private static final String KEY_EVENT_LIST = "eventList";
    private static final String KEY_EVENT_LIST_LEGACY = "EVENT_List";
    private static final String KEY_FORCE_USE_SSL = "forceUseSsl";
    private static final String KEY_FORCE_USE_SSL_LEGACY = "ForceUseSSL";
    private static final String KEY_HTTP_RES_MIME_LIST = "httpLinkSubResMimeList";
    private static final String KEY_HTTP_RES_MIME_LIST_LEGACY = "HttpLink_SubResMimeList";
    private static final String KEY_IGNORECHECK_MTOP_API = "ignorePermissionCheckMtopApi";
    private static final String KEY_IGNORE_PERMISSION_CHECK = "ignorePermissionCheck";
    private static final String KEY_JSAPI_LIST = "jsapiNameList";
    private static final String KEY_JSAPI_LIST_LEGACY = "JSAPI_List";
    private static final String KEY_JSAPI_SP_CONFIG = "jsapiSpConfig";
    private static final String KEY_JSAPI_SP_CONFIG_LEGACY = "JSAPI_SP_Config";
    private static final String KEY_NATIVE_API_SCOPE_CONFIG = "nativeApiScopeConfig";
    private static final String KEY_NATIVE_API_USER_AUTH = "nativeApiUserAuth";
    private static final String KEY_SUB_RES_MIME_LIST = "validSubResMimeList";
    private static final String KEY_SUB_RES_MIME_LIST_LEGACY = "Valid_SubResMimeList";
    private static final String KEY_VALID_DOMAIN = "validDomain";
    private static final String KEY_WEBVIEW_CONFIG = "webViewConfig";
    private static final String KEY_WEBVIEW_CONFIG_LEGACY = "Webview_Config";
    private static final long serialVersionUID = 7945824571470124314L;
    @JSONField(name = KEY_ENABLE_PROXY)
    private String enableProxy;
    @JSONField(name = "eventList")
    private Set<String> eventList;
    @JSONField(name = KEY_FORCE_USE_SSL)
    private String forceUseSsl;
    @JSONField(name = KEY_HTTP_RES_MIME_LIST)
    private Set<String> httpLinkSubResMimeList;
    @JSONField(name = KEY_IGNORE_PERMISSION_CHECK)
    private Set<String> ignorePermissionCheck;
    @JSONField(name = KEY_IGNORECHECK_MTOP_API)
    private Set<String> ignorePermissionCheckMtopApi;
    @JSONField(name = KEY_JSAPI_LIST)
    private Set<String> jsapiList;
    @JSONField(name = KEY_NATIVE_API_SCOPE_CONFIG)
    private JSONObject nativeApiScopeConfig;
    @JSONField(name = KEY_NATIVE_API_USER_AUTH)
    private JSONObject nativeApiUserAuth;
    @JSONField(deserialize = false, serialize = false)
    private Map<String, PermissionModel> pluginPermissions;
    @JSONField(name = KEY_JSAPI_SP_CONFIG)
    private JSONObject specialConfigs;
    @JSONField(name = "validDomain")
    private Set<String> validDomains;
    @JSONField(name = KEY_SUB_RES_MIME_LIST)
    private Set<String> validSubResMimeList;
    @JSONField(name = KEY_WEBVIEW_CONFIG)
    private JSONObject webviewConfigs;

    public PermissionModel() {
    }

    public static PermissionModel generateFromJSON(byte[] bArr) {
        return generateFromJSON(gbs.i(bArr));
    }

    private void readToArray(Set<String> set, Parcel parcel) {
        if (parcel.readByte() == 1) {
            for (Object obj : parcel.readArray(PermissionModel.class.getClassLoader())) {
                set.add((String) obj);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getEnableProxy() {
        return this.enableProxy;
    }

    public Set<String> getEventList() {
        return this.eventList;
    }

    public String getForceUseSsl() {
        return this.forceUseSsl;
    }

    public Set<String> getHttpLinkSubResMimeList() {
        return this.httpLinkSubResMimeList;
    }

    public Set<String> getIgnorePermissionCheck() {
        return this.ignorePermissionCheck;
    }

    public Set<String> getIgnorePermissionCheckMtopApi() {
        return this.ignorePermissionCheckMtopApi;
    }

    public Set<String> getJsapiList() {
        return this.jsapiList;
    }

    public JSONObject getNativeApiScopeConfig() {
        return this.nativeApiScopeConfig;
    }

    public JSONObject getNativeApiUserAuth() {
        return this.nativeApiUserAuth;
    }

    @JSONField(deserialize = false, serialize = false)
    public Map<String, PermissionModel> getPluginPermissions() {
        return this.pluginPermissions;
    }

    public JSONObject getSpecialConfigs() {
        return this.specialConfigs;
    }

    public Set<String> getValidDomains() {
        return this.validDomains;
    }

    public Set<String> getValidSubResMimeList() {
        return this.validSubResMimeList;
    }

    public JSONObject getWebviewConfigs() {
        return this.webviewConfigs;
    }

    public void setEnableProxy(String str) {
        this.enableProxy = str;
    }

    public void setEventList(Set<String> set) {
        this.eventList = set;
    }

    public void setForceUseSsl(String str) {
        this.forceUseSsl = str;
    }

    public void setHttpLinkSubResMimeList(Set<String> set) {
        this.httpLinkSubResMimeList = set;
    }

    public void setIgnorePermissionCheck(Set<String> set) {
        this.ignorePermissionCheck = set;
    }

    public void setIgnorePermissionCheckMtopApi(Set<String> set) {
        this.ignorePermissionCheckMtopApi = set;
    }

    public void setJsapiList(Set<String> set) {
        this.jsapiList = set;
    }

    public void setNativeApiScopeConfig(JSONObject jSONObject) {
        this.nativeApiScopeConfig = jSONObject;
    }

    public void setNativeApiUserAuth(JSONObject jSONObject) {
        this.nativeApiUserAuth = jSONObject;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setPluginPermissions(Map<String, PermissionModel> map) {
        this.pluginPermissions = map;
    }

    public void setSpecialConfigs(JSONObject jSONObject) {
        this.specialConfigs = jSONObject;
    }

    public void setValidDomains(Set<String> set) {
        this.validDomains = set;
    }

    public void setValidSubResMimeList(Set<String> set) {
        this.validSubResMimeList = set;
    }

    public void setWebviewConfigs(JSONObject jSONObject) {
        this.webviewConfigs = jSONObject;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder("PermissionModel{validDomains=");
        sb.append(this.validDomains);
        sb.append(", ignorePermissionCheckMtopApi=");
        sb.append(this.ignorePermissionCheckMtopApi);
        sb.append(", specialConfigs=");
        sb.append(this.specialConfigs);
        sb.append(", webviewConfigs=");
        sb.append(this.webviewConfigs);
        sb.append(", jsapiList=$list(");
        Set<String> set = this.jsapiList;
        if (set == null) {
            i = 0;
        } else {
            i = set.size();
        }
        sb.append(i);
        sb.append("), ignorePermissionCheck=");
        sb.append(this.ignorePermissionCheck);
        sb.append(", nativeApiUserAuth=");
        sb.append(this.nativeApiUserAuth);
        sb.append(", nativeApiScopeConfig=");
        sb.append(this.nativeApiScopeConfig);
        sb.append(", validSubResMimeList=");
        sb.append(this.validSubResMimeList);
        sb.append(", httpLinkSubResMimeList=");
        sb.append(this.httpLinkSubResMimeList);
        sb.append(", enableProxy='");
        sb.append(this.enableProxy);
        sb.append("', eventList=");
        sb.append(this.eventList);
        sb.append(", forceUseSsl=");
        sb.append(this.forceUseSsl);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.validDomains != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        Set<String> set = this.validDomains;
        if (set != null) {
            parcel.writeArray(set.toArray());
        }
        parcel.writeSerializable(this.specialConfigs);
        parcel.writeSerializable(this.webviewConfigs);
        if (this.jsapiList != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeByte((byte) i3);
        Set<String> set2 = this.jsapiList;
        if (set2 != null) {
            parcel.writeArray(set2.toArray());
        }
        if (this.ignorePermissionCheck != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        parcel.writeByte((byte) i4);
        Set<String> set3 = this.ignorePermissionCheck;
        if (set3 != null) {
            parcel.writeArray(set3.toArray());
        }
        if (this.ignorePermissionCheckMtopApi != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        parcel.writeByte((byte) i5);
        Set<String> set4 = this.ignorePermissionCheckMtopApi;
        if (set4 != null) {
            parcel.writeArray(set4.toArray());
        }
        parcel.writeSerializable(this.nativeApiUserAuth);
        parcel.writeSerializable(this.nativeApiScopeConfig);
        if (this.validSubResMimeList != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        parcel.writeByte((byte) i6);
        Set<String> set5 = this.validSubResMimeList;
        if (set5 != null) {
            parcel.writeArray(set5.toArray());
        }
        parcel.writeString(this.enableProxy);
        if (this.httpLinkSubResMimeList != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        parcel.writeByte((byte) i7);
        Set<String> set6 = this.httpLinkSubResMimeList;
        if (set6 != null) {
            parcel.writeArray(set6.toArray());
        }
        if (this.eventList != null) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        parcel.writeByte((byte) i8);
        Set<String> set7 = this.eventList;
        if (set7 != null) {
            parcel.writeArray(set7.toArray());
        }
        parcel.writeString(this.forceUseSsl);
        Map<String, PermissionModel> map = this.pluginPermissions;
        if (map == null) {
            i9 = 0;
        } else {
            i9 = map.size();
        }
        parcel.writeInt(i9);
        if (i9 > 0) {
            String[] strArr = new String[i9];
            Parcelable[] parcelableArr = new Parcelable[i9];
            int i10 = 0;
            for (Map.Entry<String, PermissionModel> entry : this.pluginPermissions.entrySet()) {
                strArr[i10] = entry.getKey();
                parcelableArr[i10] = entry.getValue();
                i10++;
            }
            parcel.writeStringArray(strArr);
            parcel.writeParcelableArray(parcelableArr, 0);
        }
    }

    public PermissionModel(Parcel parcel) {
        HashSet hashSet = new HashSet();
        this.validDomains = hashSet;
        readToArray(hashSet, parcel);
        this.specialConfigs = (JSONObject) parcel.readSerializable();
        this.webviewConfigs = (JSONObject) parcel.readSerializable();
        HashSet hashSet2 = new HashSet();
        this.jsapiList = hashSet2;
        readToArray(hashSet2, parcel);
        HashSet hashSet3 = new HashSet();
        this.ignorePermissionCheck = hashSet3;
        readToArray(hashSet3, parcel);
        HashSet hashSet4 = new HashSet();
        this.ignorePermissionCheckMtopApi = hashSet4;
        readToArray(hashSet4, parcel);
        this.nativeApiUserAuth = (JSONObject) parcel.readSerializable();
        this.nativeApiScopeConfig = (JSONObject) parcel.readSerializable();
        HashSet hashSet5 = new HashSet();
        this.validSubResMimeList = hashSet5;
        readToArray(hashSet5, parcel);
        this.enableProxy = parcel.readString();
        HashSet hashSet6 = new HashSet();
        this.httpLinkSubResMimeList = hashSet6;
        readToArray(hashSet6, parcel);
        HashSet hashSet7 = new HashSet();
        this.eventList = hashSet7;
        readToArray(hashSet7, parcel);
        this.forceUseSsl = parcel.readString();
        this.pluginPermissions = new HashMap();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(PermissionModel.class.getClassLoader());
            for (int i = 0; i < readInt; i++) {
                Parcelable parcelable = readParcelableArray[i];
                if (parcelable instanceof PermissionModel) {
                    this.pluginPermissions.put(strArr[i], (PermissionModel) parcelable);
                }
            }
        }
    }

    public static PermissionModel generateFromJSON(String str) {
        return generateFromJSON(gbs.h(str));
    }

    public static PermissionModel generateFromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        PermissionModel permissionModel = new PermissionModel();
        JSONArray b = gbs.b(jSONObject, "validDomain", null);
        if (b != null) {
            HashSet hashSet = new HashSet();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                hashSet.add(b.getString(i));
            }
            permissionModel.setValidDomains(hashSet);
        }
        JSONObject c = gbs.c(jSONObject, KEY_JSAPI_SP_CONFIG, null);
        if (c == null) {
            c = gbs.c(jSONObject, "JSAPI_SP_Config", null);
        }
        if (c != null) {
            permissionModel.setSpecialConfigs(c);
        }
        JSONObject c2 = gbs.c(jSONObject, KEY_WEBVIEW_CONFIG, null);
        if (c2 == null) {
            c2 = gbs.c(jSONObject, "Webview_Config", null);
        }
        if (c2 != null) {
            permissionModel.setWebviewConfigs(c2);
        }
        JSONArray b2 = gbs.b(jSONObject, KEY_JSAPI_LIST, null);
        if (b2 == null) {
            b2 = gbs.b(jSONObject, "JSAPI_List", null);
        }
        if (b2 != null) {
            HashSet hashSet2 = new HashSet();
            int size2 = b2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet2.add(b2.getString(i2));
            }
            permissionModel.setJsapiList(hashSet2);
        }
        JSONArray b3 = gbs.b(jSONObject, KEY_IGNORE_PERMISSION_CHECK, null);
        if (b3 != null) {
            HashSet hashSet3 = new HashSet();
            int size3 = b3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                hashSet3.add(b3.getString(i3));
            }
            permissionModel.setIgnorePermissionCheck(hashSet3);
        }
        JSONObject c3 = gbs.c(jSONObject, KEY_NATIVE_API_USER_AUTH, null);
        if (c3 != null) {
            permissionModel.setNativeApiUserAuth(c3);
        }
        JSONObject c4 = gbs.c(jSONObject, KEY_NATIVE_API_SCOPE_CONFIG, null);
        if (c4 != null) {
            permissionModel.setNativeApiScopeConfig(c4);
        }
        JSONArray b4 = gbs.b(jSONObject, "eventList", null);
        if (b4 == null) {
            b4 = gbs.b(jSONObject, "EVENT_List", null);
        }
        if (b4 != null) {
            HashSet hashSet4 = new HashSet();
            int size4 = b4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                hashSet4.add(b4.getString(i4));
            }
            permissionModel.setEventList(hashSet4);
        }
        String e = gbs.e(jSONObject, KEY_ENABLE_PROXY, null);
        if (e == null) {
            e = gbs.e(jSONObject, "Enable_Proxy", null);
        }
        if (e != null) {
            permissionModel.setEnableProxy(e);
        }
        JSONArray b5 = gbs.b(jSONObject, KEY_SUB_RES_MIME_LIST, null);
        if (b5 == null) {
            b5 = gbs.b(jSONObject, "Valid_SubResMimeList", null);
        }
        if (b5 != null) {
            HashSet hashSet5 = new HashSet();
            int size5 = b5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                hashSet5.add(b5.getString(i5));
            }
            permissionModel.setValidSubResMimeList(hashSet5);
        }
        JSONArray b6 = gbs.b(jSONObject, KEY_HTTP_RES_MIME_LIST, null);
        if (b6 == null) {
            b6 = gbs.b(jSONObject, "HttpLink_SubResMimeList", null);
        }
        if (b6 != null) {
            HashSet hashSet6 = new HashSet();
            int size6 = b6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                hashSet6.add(b6.getString(i6));
            }
            permissionModel.setHttpLinkSubResMimeList(hashSet6);
        }
        String e2 = gbs.e(jSONObject, KEY_FORCE_USE_SSL, null);
        if (e2 == null) {
            e2 = gbs.e(jSONObject, "ForceUseSSL", null);
        }
        if (e2 != null) {
            permissionModel.setForceUseSsl(e2);
        }
        return permissionModel;
    }
}
