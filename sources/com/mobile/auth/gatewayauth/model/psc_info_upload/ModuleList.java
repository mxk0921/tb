package com.mobile.auth.gatewayauth.model.psc_info_upload;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ModuleList implements pxf {
    private List<Module> module;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                setModule(wrf.l(jSONObject.optJSONArray("module"), new swf<Module>() { // from class: com.mobile.auth.gatewayauth.model.psc_info_upload.ModuleList.1
                }));
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }

    public List<Module> getModule() {
        try {
            return this.module;
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

    public void setModule(List<Module> list) {
        try {
            this.module = list;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    @Override // tb.pxf
    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("module", wrf.j(this.module));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
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
}
