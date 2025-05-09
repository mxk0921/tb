package com.mobile.auth.gatewayauth.manager;

import android.text.TextUtils;
import android.util.SparseArray;
import com.mobile.auth.O0Oo000;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.O0000O0o;
import com.mobile.auth.gatewayauth.manager.base.O000000o;
import com.mobile.auth.gatewayauth.model.MonitorStruct;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import tb.ln8;
import tb.swf;
import tb.sy4;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VendorSdkInfoManager {
    private SparseArray<VendorConfig> O000000o = new O000000o(3);
    private SparseArray<VendorConfig> O00000Oo = new O000000o(3);
    private String O00000o;
    private String O00000o0;
    private O00000o O00000oO;
    private SystemManager O00000oo;
    private O0Oo000 O0000O0o;

    public VendorSdkInfoManager(O00000o o00000o, SystemManager systemManager) {
        this.O00000oO = o00000o;
        this.O0000O0o = o00000o.O000000o();
        this.O00000oo = systemManager;
    }

    public static /* synthetic */ SparseArray O000000o(VendorSdkInfoManager vendorSdkInfoManager) {
        try {
            return vendorSdkInfoManager.O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ String O00000Oo(VendorSdkInfoManager vendorSdkInfoManager) {
        try {
            return vendorSdkInfoManager.O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ O0Oo000 O00000o(VendorSdkInfoManager vendorSdkInfoManager) {
        try {
            return vendorSdkInfoManager.O0000O0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ O00000o O00000o0(VendorSdkInfoManager vendorSdkInfoManager) {
        try {
            return vendorSdkInfoManager.O00000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void loadVendorConfigsBySceneCodeFromDisk(String str) {
        String str2 = "";
        try {
            String str3 = (String) UTSharedPreferencesHelper.get(this.O00000oo.O00000oO(), UTSharedPreferencesHelper.FILE_VENDOR_CONFIG_KEY, str, str2);
            try {
                str2 = sy4.e(str3, this.O00000oo.O000000o() + this.O00000oo.O00000Oo());
            } catch (Exception e) {
                this.O0000O0o.O00000o("Loading vendorConfigs from disk failed!", ln8.a(e));
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.O00000Oo.clear();
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys != null) {
                        if (keys.hasNext()) {
                            String next = keys.next();
                            this.O00000Oo.put(Integer.parseInt(next), wrf.b(jSONObject.optJSONObject(next), new swf<VendorConfig>() { // from class: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager.4
                            }, null));
                        } else {
                            return;
                        }
                    }
                } catch (Exception e2) {
                    this.O0000O0o.O00000o("Loading vendorConfigs from disk failed!", ln8.a(e2));
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void storeVendorConfigsBySceneCodeToDisk(String str) {
        try {
            if (this.O00000Oo.size() > 0 && str != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    int size = this.O00000Oo.size();
                    for (int i = 0; i < size; i++) {
                        int keyAt = this.O00000Oo.keyAt(i);
                        jSONObject.put(String.valueOf(keyAt), this.O00000Oo.get(keyAt).toJson());
                    }
                    String jSONObject2 = jSONObject.toString();
                    String i2 = sy4.i(jSONObject2, this.O00000oo.O000000o() + this.O00000oo.O00000Oo());
                    if (i2 != null) {
                        UTSharedPreferencesHelper.put(this.O00000oo.O00000oO(), UTSharedPreferencesHelper.FILE_VENDOR_CONFIG_KEY, str, i2);
                    }
                } catch (Exception e) {
                    this.O0000O0o.O00000o("Store vendorConfigs to disk failed!", ln8.a(e));
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setLocalVendorSdkInfo(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    String e = sy4.e(str, this.O00000oo.O000000o() + this.O00000oo.O00000Oo());
                    if (!TextUtils.isEmpty(e)) {
                        String[] split = e.split(",");
                        O000000o(split, this.O000000o);
                        O000000o(split);
                        O00000Oo(split);
                    }
                } catch (Exception e2) {
                    this.O0000O0o.O00000o("setAuthSDKInfo exception:", ln8.a(e2));
                }
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private MonitorStruct O000000o(String str) {
        try {
            MonitorStruct monitorStruct = new MonitorStruct();
            monitorStruct.setStartTime(System.currentTimeMillis());
            monitorStruct.setSessionId(str);
            monitorStruct.setRequestId(this.O00000oO.O00000oO());
            monitorStruct.setAction(Constant.ACTION_QUERY_VENDOR_LIST);
            return monitorStruct;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private void O00000Oo(String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length >= 10) {
                    this.O00000o = strArr[9];
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public boolean O00000o() {
        return false;
    }

    public String O00000o0() {
        try {
            return this.O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public VendorConfig O000000o(int i) {
        try {
            VendorConfig vendorConfig = this.O00000Oo.get(i);
            return vendorConfig != null ? vendorConfig : this.O000000o.get(i);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public boolean O00000Oo() {
        try {
            if (this.O00000Oo.size() <= 0) {
                if (this.O000000o.size() <= 0) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public String O000000o(boolean z) {
        if (z) {
            return "SceneCode";
        }
        try {
            String str = this.O00000o0;
            return str == null ? UUID.randomUUID().toString() : str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ void O000000o(VendorSdkInfoManager vendorSdkInfoManager, MonitorStruct monitorStruct) {
        try {
            vendorSdkInfoManager.O000000o(monitorStruct);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ void O000000o(VendorSdkInfoManager vendorSdkInfoManager, String str) {
        try {
            vendorSdkInfoManager.storeVendorConfigsBySceneCodeToDisk(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private void O000000o(final MonitorStruct monitorStruct) {
        try {
            ln8.b().h(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        VendorSdkInfoManager.O00000o(VendorSdkInfoManager.this).O000000o(VendorSdkInfoManager.O00000o0(VendorSdkInfoManager.this).O000000o(monitorStruct), 2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(String str, final RequestCallback<Void, String> requestCallback, O0000O0o o0000O0o) {
        if (requestCallback != null && o0000O0o != null) {
            try {
                final MonitorStruct O000000o = O000000o(str);
                o0000O0o.O000000o(new O0000O0o.O000000o() { // from class: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager.2
                    @Override // com.mobile.auth.gatewayauth.manager.O0000O0o.O000000o
                    public void O000000o(String str2, String str3) {
                        try {
                            O000000o.setEndTime(System.currentTimeMillis());
                            O000000o.setSuccess(false);
                            O000000o.setTopTraceId(str3);
                            O000000o.setFailRet(str2);
                            VendorSdkInfoManager.O000000o(VendorSdkInfoManager.this, O000000o);
                            requestCallback.onError(str2);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.O0000O0o.O000000o
                    public void O000000o(String str2, String str3, SparseArray<VendorConfig> sparseArray) {
                        if (sparseArray != null) {
                            try {
                                if (sparseArray.size() > 0) {
                                    synchronized (VendorSdkInfoManager.this) {
                                        for (int i = 0; i < sparseArray.size(); i++) {
                                            VendorSdkInfoManager.O000000o(VendorSdkInfoManager.this).put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                                        }
                                    }
                                    VendorSdkInfoManager vendorSdkInfoManager = VendorSdkInfoManager.this;
                                    VendorSdkInfoManager.O000000o(vendorSdkInfoManager, VendorSdkInfoManager.O00000Oo(vendorSdkInfoManager));
                                    O000000o.setEndTime(System.currentTimeMillis());
                                    O000000o.setSuccess(true);
                                    O000000o.setTopTraceId(str3);
                                    VendorSdkInfoManager.O000000o(VendorSdkInfoManager.this, O000000o);
                                    requestCallback.onSuccess(null);
                                    return;
                                }
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                    return;
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                    return;
                                }
                            }
                        }
                        O000000o(str2, str3);
                    }
                });
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    private void O000000o(String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length >= 8) {
                    String str = strArr[6];
                    this.O00000o0 = str;
                    this.O00000oO.O000000o(str);
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    private void O000000o(String[] strArr, SparseArray<VendorConfig> sparseArray) {
        if (strArr != null) {
            try {
                if (strArr.length >= 6 && sparseArray != null) {
                    for (int i = 0; i < 3; i++) {
                        VendorConfig vendorConfig = new VendorConfig();
                        int i2 = i * 2;
                        vendorConfig.setVendorAccessId(strArr[i2]);
                        vendorConfig.setVendorAccessSecret(strArr[i2 + 1]);
                        if (i == 0) {
                            vendorConfig.setVendorKey(Constant.VENDOR_CMCC);
                            sparseArray.put(1, vendorConfig);
                        } else if (i == 1) {
                            vendorConfig.setVendorKey(Constant.VENDOR_CUCC);
                            sparseArray.put(2, vendorConfig);
                        } else if (i == 2) {
                            vendorConfig.setVendorKey(Constant.VENDOR_CTCC);
                            sparseArray.put(3, vendorConfig);
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public boolean O000000o() {
        try {
            return !TextUtils.isEmpty(this.O00000o0);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public boolean O000000o(final String str, final O0000O0o o0000O0o) {
        try {
            if (!O00000Oo()) {
                try {
                    ln8.b().h(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                final CountDownLatch countDownLatch = new CountDownLatch(1);
                                VendorSdkInfoManager.this.O000000o(str, new RequestCallback<Void, String>() { // from class: com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager.1.1
                                    public void O000000o(String str2) {
                                        try {
                                            countDownLatch.countDown();
                                        } catch (Throwable th) {
                                            try {
                                                ExceptionProcessor.processException(th);
                                            } catch (Throwable th2) {
                                                ExceptionProcessor.processException(th2);
                                            }
                                        }
                                    }

                                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                                    public /* synthetic */ void onError(String str2) {
                                        try {
                                            O000000o(str2);
                                        } catch (Throwable th) {
                                            try {
                                                ExceptionProcessor.processException(th);
                                            } catch (Throwable th2) {
                                                ExceptionProcessor.processException(th2);
                                            }
                                        }
                                    }

                                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                                    public /* synthetic */ void onSuccess(Void r1) {
                                        try {
                                            O000000o(r1);
                                        } catch (Throwable th) {
                                            try {
                                                ExceptionProcessor.processException(th);
                                            } catch (Throwable th2) {
                                                ExceptionProcessor.processException(th2);
                                            }
                                        }
                                    }

                                    public void O000000o(Void r1) {
                                        try {
                                            countDownLatch.countDown();
                                        } catch (Throwable th) {
                                            try {
                                                ExceptionProcessor.processException(th);
                                            } catch (Throwable th2) {
                                                ExceptionProcessor.processException(th2);
                                            }
                                        }
                                    }
                                }, o0000O0o);
                                try {
                                    countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
                                } catch (InterruptedException unused) {
                                }
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                }
                            }
                        }
                    }).get(3000L, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
            return O00000Oo();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
