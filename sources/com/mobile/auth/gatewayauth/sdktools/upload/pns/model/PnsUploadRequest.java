package com.mobile.auth.gatewayauth.sdktools.upload.pns.model;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.Serializable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PnsUploadRequest implements pxf, Serializable {
    private static final long serialVersionUID = -7838291328068778271L;
    private List<UploadLogDTO> uploadLogDTOList;
    private List<UploadMonitorDTO> uploadMonitorDTOList;

    @Override // tb.pxf
    public void fromJson(JSONObject jSONObject) {
        try {
            setUploadLogDTOList(wrf.l(jSONObject.optJSONArray("uploadLogDTOList"), new swf<UploadLogDTO>() { // from class: com.mobile.auth.gatewayauth.sdktools.upload.pns.model.PnsUploadRequest.1
            }));
            setUploadMonitorDTOList(wrf.l(jSONObject.optJSONArray("uploadMonitorDTOList"), new swf<UploadMonitorDTO>() { // from class: com.mobile.auth.gatewayauth.sdktools.upload.pns.model.PnsUploadRequest.2
            }));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public List<UploadLogDTO> getUploadLogDTOList() {
        try {
            return this.uploadLogDTOList;
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

    public List<UploadMonitorDTO> getUploadMonitorDTOList() {
        try {
            return this.uploadMonitorDTOList;
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

    public PnsUploadRequest setUploadLogDTOList(List<UploadLogDTO> list) {
        try {
            this.uploadLogDTOList = list;
            return this;
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

    public PnsUploadRequest setUploadMonitorDTOList(List<UploadMonitorDTO> list) {
        try {
            this.uploadMonitorDTOList = list;
            return this;
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

    @Override // tb.pxf
    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uploadLogDTOList", wrf.j(this.uploadLogDTOList));
                jSONObject.put("uploadMonitorDTOList", wrf.j(this.uploadMonitorDTOList));
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

    public String toString() {
        try {
            return "PnsUploadRequest{uploadLogDTOList=" + this.uploadLogDTOList + ", uploadMonitorDTOList=" + this.uploadMonitorDTOList + '}';
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
