package com.mobile.auth;

import android.util.SparseArray;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import com.mobile.auth.gatewayauth.model.psc_info_upload.AllRBInfo;
import com.mobile.auth.gatewayauth.model.psc_info_upload.Module;
import com.mobile.auth.gatewayauth.model.psc_info_upload.ModuleList;
import com.mobile.auth.gatewayauth.model.psc_info_upload.PnsVendorQueryResponse;
import com.mobile.auth.gatewayauth.model.psc_info_upload.Result;
import com.mobile.auth.gatewayauth.utils.AESUtils;
import com.mobile.auth.gatewayauth.utils.O00000Oo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO000o0 extends OO000OO {
    private SparseArray<VendorConfig> O000000o = new SparseArray<>(3);

    public OO000o0(boolean z, String str, String str2) {
        super(z, str, str2);
        O00000oo();
    }

    private synchronized void O000000o(AllRBInfo allRBInfo, String str) {
        Result result;
        ModuleList moduleList;
        try {
            PnsVendorQueryResponse response = allRBInfo.getResponse();
            List<Module> list = null;
            if (response != null) {
                result = response.getResult();
            } else {
                result = null;
            }
            if (result != null) {
                moduleList = result.getModule_list();
            } else {
                moduleList = null;
            }
            if (moduleList != null) {
                list = moduleList.getModule();
            }
            for (Module module : list) {
                VendorConfig vendorConfig = new VendorConfig();
                vendorConfig.setRequestId(response.getRequest_id());
                vendorConfig.setVendorAccessId(AESUtils.decrypt(module.getVendor_access_id(), str));
                vendorConfig.setVendorAccessSecret(AESUtils.decrypt(module.getVendor_access_secret(), str));
                vendorConfig.setVendorKey(AESUtils.decrypt(module.getVendor_key(), str));
                int O000000o = O00000Oo.O000000o(vendorConfig.getVendorKey());
                if (O000000o != 4) {
                    this.O000000o.put(O000000o, vendorConfig);
                }
            }
        } finally {
        }
    }

    private void O00000oo() {
        PnsVendorQueryResponse response;
        ModuleList module_list;
        List<Module> module;
        try {
            AllRBInfo fromJson = AllRBInfo.fromJson(O00000o0());
            if (!(fromJson == null || (response = fromJson.getResponse()) == null)) {
                O000000o(response.getRequest_id());
                Result result = response.getResult();
                if (!(result == null || (module_list = result.getModule_list()) == null || (module = module_list.getModule()) == null || module.size() <= 0 || module.get(0) == null)) {
                    O000000o(true);
                    O000000o(fromJson, O00000o());
                    return;
                }
            }
            O000000o(false);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // com.mobile.auth.OO000OO
    public synchronized SparseArray<VendorConfig> O00000oO() {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.O000000o;
    }

    @Override // tb.qvt
    public boolean isResultTimeout() {
        PnsVendorQueryResponse response;
        Result result;
        try {
            AllRBInfo fromJson = AllRBInfo.fromJson(O00000o0());
            if (!(fromJson == null || (response = fromJson.getResponse()) == null || (result = response.getResult()) == null)) {
                if (ResultCode.CODE_ERROR_FUNCTION_TIME_OUT.equals(result.getCode())) {
                    return true;
                }
            }
            return false;
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
