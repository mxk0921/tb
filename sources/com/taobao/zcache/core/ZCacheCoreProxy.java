package com.taobao.zcache.core;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.ali.user.mobile.exception.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.zcache.Error;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.taobao.zcache.ZCacheConfig;
import com.taobao.zcache.core.NetworkUtils;
import com.taobao.zcache.core.a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.bkv;
import tb.cfe;
import tb.ekl;
import tb.fkl;
import tb.hzu;
import tb.ial;
import tb.iv7;
import tb.kan;
import tb.lcn;
import tb.ru7;
import tb.t2o;
import tb.v5n;
import tb.xyi;
import tb.y8o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ZCacheCoreProxy implements IZCacheCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ResourceResponse InvalidURLResponse = ResourceResponse.getErrorResponse(new Error(ErrorCode.CLIENT_NETWORK_ERROR, "invalid url"));
    private final AssetManager _assetManager;
    private cfe _pushService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements NetworkUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.zcache.core.NetworkUtils.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f616de17", new Object[]{this, new Integer(i)});
                return;
            }
            lcn.a(RVLLevel.Verbose, "ZCache/Info").j("NetworkStatus").a("status", Integer.valueOf(i)).f();
            ZCacheCoreProxy.access$000(ZCacheCoreProxy.this, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f14185a;

        public b(long j) {
            this.f14185a = j;
        }

        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("178b8c55", new Object[]{this, str, jSONObject});
            } else {
                ZCacheCoreProxy.access$100(ZCacheCoreProxy.this, this.f14185a, str, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements ru7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f14186a;

        public c(long j) {
            this.f14186a = j;
        }

        public void a(int i, long j, Map<String, String> map, Error error, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e391910", new Object[]{this, new Integer(i), new Long(j), map, error, bArr});
            } else {
                ZCacheCoreProxy.access$200(ZCacheCoreProxy.this, this.f14186a, i, j, map, error, bArr);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements v5n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f14187a;

        public d(long j) {
            this.f14187a = j;
        }

        public void a(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154560a6", new Object[]{this, list});
            } else {
                ZCacheCoreProxy.access$300(ZCacheCoreProxy.this, this.f14187a, list);
            }
        }
    }

    static {
        t2o.a(996147268);
        t2o.a(996147250);
    }

    public ZCacheCoreProxy(AssetManager assetManager) {
        this._assetManager = assetManager;
        setNetworkStatusNative(NetworkUtils.b());
        NetworkUtils.c(new a());
    }

    public static /* synthetic */ void access$000(ZCacheCoreProxy zCacheCoreProxy, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647339a8", new Object[]{zCacheCoreProxy, new Integer(i)});
        } else {
            zCacheCoreProxy.setNetworkStatusNative(i);
        }
    }

    public static /* synthetic */ void access$100(ZCacheCoreProxy zCacheCoreProxy, long j, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d287e9ec", new Object[]{zCacheCoreProxy, new Long(j), str, jSONObject});
        } else {
            zCacheCoreProxy.onConfigUpdatedNative(j, str, jSONObject);
        }
    }

    public static /* synthetic */ void access$200(ZCacheCoreProxy zCacheCoreProxy, long j, int i, long j2, Map map, Error error, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23be0297", new Object[]{zCacheCoreProxy, new Long(j), new Integer(i), new Long(j2), map, error, bArr});
        } else {
            zCacheCoreProxy.onSendRequestFinishedNative(j, i, j2, map, error, bArr);
        }
    }

    public static /* synthetic */ void access$300(ZCacheCoreProxy zCacheCoreProxy, long j, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416e3f7", new Object[]{zCacheCoreProxy, new Long(j), list});
        } else {
            zCacheCoreProxy.onPushMessageNative(j, list);
        }
    }

    private native void cleanupNative();

    private native void clearNative(String str);

    private native void clearResourceNative(String str, String str2, String str3);

    private native void clientActivedNative();

    private native void clientDeactivedNative();

    private void commitMonitor(String str, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b300d4", new Object[]{this, str, map, map2});
        } else {
            xyi.a(str, map, map2);
        }
    }

    private String[] enumerateAssetPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("eaad0c51", new Object[]{this, str});
        }
        try {
            String[] proxy_list = AssetsDelegate.proxy_list(this._assetManager, str);
            for (int i = 0; i < proxy_list.length; i++) {
                AssetManager assetManager = this._assetManager;
                if (AssetsDelegate.proxy_list(assetManager, str + proxy_list[i]).length > 0) {
                    proxy_list[i] = proxy_list[i] + "/";
                }
            }
            return proxy_list;
        } catch (IOException unused) {
            return new String[0];
        }
    }

    private native String getACacheRootPathNative(String str, String str2);

    private native long getAccessAPINative();

    private JSONObject getCrowdConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5099a2d8", new Object[]{this, str});
        }
        if (!hzu.f20993a) {
            return null;
        }
        return hzu.a(str);
    }

    private native ResourceResponse getResourceNative(String str, String str2, Map<String, String> map, String str3, int i);

    private native void getResourceNative(String str, String str2, Map<String, String> map, String str3, int i, ResourceResponseCallback resourceResponseCallback);

    private native void installPreloadNative(String str);

    private native boolean isInstalledNative(String str, String str2, String str3);

    private native boolean isResourceInstalledNative(String str, String str2, Map<String, String> map, String str3);

    private native void onConfigUpdatedNative(long j, String str, JSONObject jSONObject);

    private void onPackUpdated(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b68354b", new Object[]{this, str, strArr});
        } else if (str != null) {
            bkv.a(str, strArr);
        }
    }

    private native void onPushMessageNative(long j, List<String> list);

    private native void onSendRequestFinishedNative(long j, int i, long j2, Map<String, String> map, Error error, byte[] bArr);

    private void onUpdateFinished(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc30d382", new Object[]{this, new Integer(i)});
        } else {
            bkv.b(i);
        }
    }

    private native void prefetchNative(List<String> list, String str);

    private native void registerAcceptNative(String str, String str2, String str3);

    private void registerConfigUpdateListener(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef924451", new Object[]{this, str, new Long(j)});
        } else {
            com.taobao.zcache.core.a.a(str, new b(j));
        }
    }

    private static native void registerPushServiceNative();

    public static native void registerUpdateListenerNative(String str);

    private native void removePackNative(String str, String str2, String str3);

    private native void setDefaultConfigNative(String str, String str2, String str3, double d2);

    public static native void setEnvNative(int i);

    public static native void setLocaleNative(String str);

    private native void setNetworkStatusNative(int i);

    private native void setPackMinSeqNative(String str, long j, String str2);

    public static native boolean setProxyNative(ZCacheCoreProxy zCacheCoreProxy, AssetManager assetManager, String str, boolean z, boolean z2);

    private native void setupNative(String str, String str2, int i);

    private native void setupSubProcessNative();

    private native void startUpdateNative();

    private void subscribePushMessage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969b4f10", new Object[]{this, str, new Long(j)});
            return;
        }
        cfe cfeVar = this._pushService;
        if (cfeVar != null) {
            ((ial) cfeVar).a(str, new d(j));
        }
    }

    private native void syncSubProcessConfigNative();

    public static native void unregisterUpdateListenerNative(String str);

    private native void updatePackNative(String str, String str2, String str3, PackUpdateCallback packUpdateCallback, Object obj);

    private boolean verifySignV1(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f61eca", new Object[]{this, bArr, bArr2})).booleanValue();
        }
        return kan.b(bArr, bArr2);
    }

    private boolean verifySignV2(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953a8dcb", new Object[]{this, bArr, bArr2})).booleanValue();
        }
        return kan.c(bArr, bArr2);
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void cleanup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792e92b", new Object[]{this});
        } else {
            cleanupNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void clear(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{this, str});
        } else {
            clearNative(str);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void clearResource(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f99ce0", new Object[]{this, str, str2, str3});
        } else {
            clearResourceNative(str, str2, str3);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore, com.taobao.zcache.IZCacheClientListener
    public void clientActived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706a9eda", new Object[]{this});
        } else {
            clientActivedNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore, com.taobao.zcache.IZCacheClientListener
    public void clientDeactived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ce6e79", new Object[]{this});
        } else {
            clientDeactivedNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public String getACacheRootPath(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ad4dc7", new Object[]{this, str, str2});
        }
        return getACacheRootPathNative(str, str2);
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public long getAccessAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c1ae3db", new Object[]{this})).longValue();
        }
        return getAccessAPINative();
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public ResourceResponse getResource(y8o y8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceResponse) ipChange.ipc$dispatch("c4515e99", new Object[]{this, y8oVar});
        }
        if (y8oVar == null || TextUtils.isEmpty(y8oVar.e())) {
            return InvalidURLResponse;
        }
        return getResourceNative(y8oVar.e(), y8oVar.b(), y8oVar.a(), y8oVar.d(), y8oVar.c().value);
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void installPreload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e6dfff", new Object[]{this, str});
        } else {
            installPreloadNative(str);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public boolean isInstalled(ekl eklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b67064ac", new Object[]{this, eklVar})).booleanValue();
        }
        if (eklVar == null) {
            return false;
        }
        return isInstalledNative(eklVar.b(), eklVar.a(), eklVar.c());
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public boolean isResourceInstalled(y8o y8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c45ac78f", new Object[]{this, y8oVar})).booleanValue();
        }
        if (y8oVar == null) {
            return false;
        }
        return isResourceInstalledNative(y8oVar.e(), y8oVar.b(), y8oVar.a(), y8oVar.d());
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void prefetch(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec6aff9", new Object[]{this, list, str});
        } else {
            prefetchNative(list, str);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void registerAccept(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc730f0", new Object[]{this, str, str2, str3});
        } else {
            registerAcceptNative(str, str2, str3);
        }
    }

    public void registerPushService(cfe cfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facc7990", new Object[]{this, cfeVar});
        } else if (cfeVar != null) {
            this._pushService = cfeVar;
            registerPushServiceNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void removePack(ekl eklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa47063b", new Object[]{this, eklVar});
        } else {
            removePackNative(eklVar.b(), eklVar.a(), eklVar.c());
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setDefaultConfig(ZCacheConfig zCacheConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b12299", new Object[]{this, zCacheConfig});
        } else {
            setDefaultConfigNative(zCacheConfig.configPrefixRelease, zCacheConfig.zipPrefixRelease, zCacheConfig.ACacheZipPrefixRelease, zCacheConfig.configUpdateInterval);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setPackMinSeq(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce16b435", new Object[]{this, str, new Long(j), str2});
        } else {
            setPackMinSeqNative(str, j, str2);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setup(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d16a6b", new Object[]{this, str, str2, new Integer(i)});
        } else {
            setupNative(str, str2, i);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setupSubProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83eebcf3", new Object[]{this});
        } else {
            setupSubProcessNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void startUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8e3ed2", new Object[]{this});
        } else {
            startUpdateNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void syncSubProcessConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6e4f73", new Object[]{this});
        } else {
            syncSubProcessConfigNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void updatePack(ekl eklVar, PackUpdateCallback packUpdateCallback, fkl fklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f575c72f", new Object[]{this, eklVar, packUpdateCallback, fklVar});
        } else {
            updatePackNative(eklVar.b(), eklVar.a(), eklVar.c(), packUpdateCallback, fklVar);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void getResource(y8o y8oVar, ResourceResponseCallback resourceResponseCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985a830", new Object[]{this, y8oVar, resourceResponseCallback});
        } else if (resourceResponseCallback != null) {
            if (y8oVar == null || TextUtils.isEmpty(y8oVar.e())) {
                resourceResponseCallback.finish(InvalidURLResponse);
            } else {
                getResourceNative(y8oVar.e(), y8oVar.b(), y8oVar.a(), y8oVar.d(), y8oVar.c().value, resourceResponseCallback);
            }
        }
    }

    private void sendRequest(String str, int i, String str2, HashMap<String, String> hashMap, String str3, String str4, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d94d156", new Object[]{this, str, new Integer(i), str2, hashMap, str3, str4, obj, new Long(j)});
            return;
        }
        fkl fklVar = obj instanceof fkl ? (fkl) obj : null;
        if (str == null) {
            onSendRequestFinishedNative(j, 0, 0L, null, new Error(1001, "request \"null\" invalid URL"), null);
        } else {
            iv7.m(new iv7(str, i, str2, hashMap, str3, str4, fklVar, new c(j)));
        }
    }
}
