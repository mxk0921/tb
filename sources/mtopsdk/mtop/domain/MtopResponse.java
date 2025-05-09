package mtopsdk.mtop.domain;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopStatistics;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.jpq;
import tb.rb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopResponse implements Serializable, IMTOPDataObject {
    private static final String SHARP = "::";
    private static final String TAG = "mtopsdk.MtopResponse";
    private static final long serialVersionUID = 1566423746968673499L;
    private String api;
    private byte[] bytedata;
    @Deprecated
    private byte[] data;
    private JSONObject dataJsonObject;
    private Map<String, List<String>> headerFields;
    public String mappingCode;
    public String mappingCodeSuffix;
    private MtopStatistics mtopStat;
    private com.alibaba.fastjson.JSONObject originJsonObject;
    private int responseCode;
    @Deprecated
    private String[] ret;
    private String retCode;
    private String retMsg;
    private jpq streamModeData;
    private boolean supportStreamJson;
    private String v;
    private volatile boolean bParsed = false;
    private volatile boolean allowParseJson = true;
    private ResponseSource responseSource = ResponseSource.NETWORK_REQUEST;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ResponseSource {
        FRESH_CACHE,
        EXPIRED_CACHE,
        NETWORK_REQUEST;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ResponseSource responseSource, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/domain/MtopResponse$ResponseSource");
        }

        public static ResponseSource valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResponseSource) ipChange.ipc$dispatch("ae9b21d4", new Object[]{str});
            }
            return (ResponseSource) Enum.valueOf(ResponseSource.class, str);
        }
    }

    static {
        t2o.a(589299911);
        t2o.a(589299906);
    }

    public MtopResponse() {
    }

    public String getApi() {
        if (this.api == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.api;
    }

    public byte[] getBytedata() {
        return this.bytedata;
    }

    @Deprecated
    public byte[] getData() {
        return this.data;
    }

    public JSONObject getDataJsonObject() {
        if (this.dataJsonObject == null && !this.bParsed && this.allowParseJson && !this.supportStreamJson) {
            parseJsonByte();
        }
        return this.dataJsonObject;
    }

    public String getFalcoId() {
        MtopStatistics mtopStatistics = this.mtopStat;
        if (mtopStatistics != null) {
            return mtopStatistics.falcoId;
        }
        return "";
    }

    public String getFullKey() {
        if (StringUtils.isBlank(this.api) || StringUtils.isBlank(this.v)) {
            return null;
        }
        return StringUtils.concatStr2LowerCase(this.api, this.v);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.headerFields;
    }

    public String getMappingCode() {
        return this.mappingCode;
    }

    public MtopStatistics getMtopStat() {
        return this.mtopStat;
    }

    public com.alibaba.fastjson.JSONObject getOriginFastJsonObject() {
        if (!this.supportStreamJson) {
            return null;
        }
        if (this.originJsonObject == null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.originJsonObject = JSON.parseObject(new String(this.bytedata));
                String str = this.mtopStat.seqNo;
                TBSdkLog.e(TAG, str, "[getOriginFastJsonObject] parse json cost=" + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.mtopStat.seqNo, "[getOriginFastJsonObject] parse json error.", th);
            }
        }
        return this.originJsonObject;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getResponseLog() {
        StringBuilder sb = new StringBuilder(128);
        try {
            sb.append("MtopResponse[ api=");
            sb.append(this.api);
            sb.append(",v=");
            sb.append(this.v);
            sb.append(",retCode=");
            sb.append(this.retCode);
            sb.append(",retMsg=");
            sb.append(this.retMsg);
            sb.append(",mappingCode=");
            sb.append(this.mappingCode);
            sb.append(",mappingCodeSuffix=");
            sb.append(this.mappingCodeSuffix);
            sb.append(",ret=");
            sb.append(Arrays.toString(this.ret));
            sb.append(",responseCode=");
            sb.append(this.responseCode);
            sb.append(",headerFields=");
            sb.append(this.headerFields);
            sb.append("]");
            return sb.toString();
        } catch (Throwable unused) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e(TAG, "[getResponseLog]MtopResponse get log error, api=" + this.api + ",v=" + this.v);
            }
            return super.toString();
        }
    }

    @Deprecated
    public String[] getRet() {
        if (this.ret == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.ret;
    }

    public String getRetCode() {
        return this.retCode;
    }

    public String getRetMsg() {
        if (this.retMsg == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.retMsg;
    }

    public ResponseSource getSource() {
        return this.responseSource;
    }

    public jpq getStreamModeData() {
        return this.streamModeData;
    }

    public String getV() {
        if (this.v == null && !this.bParsed && this.allowParseJson) {
            parseJsonByte();
        }
        return this.v;
    }

    public boolean is41XResult() {
        return ErrorConstant.is41XResult(getRetCode());
    }

    public boolean isApiLockedAndRequestQueued() {
        if (420 != this.responseCode || !ErrorConstant.ERRCODE_FAIL_SYS_REQUEST_QUEUED.equalsIgnoreCase(getRetCode())) {
            return false;
        }
        return true;
    }

    public boolean isApiLockedResult() {
        if (420 == this.responseCode || ErrorConstant.isApiLockedResult(getRetCode())) {
            return true;
        }
        return false;
    }

    public boolean isApiSuccess() {
        if (!ErrorConstant.isSuccess(getRetCode()) || getBytedata() == null) {
            return false;
        }
        return true;
    }

    public boolean isExpiredRequest() {
        return ErrorConstant.isExpiredRequest(getRetCode());
    }

    @Deprecated
    public boolean isIllegelSign() {
        return ErrorConstant.isIllegelSign(getRetCode());
    }

    public boolean isMtopSdkError() {
        return ErrorConstant.isMtopSdkError(getRetCode());
    }

    public boolean isMtopServerError() {
        return ErrorConstant.isMtopServerError(getRetCode());
    }

    public boolean isNetworkError() {
        return ErrorConstant.isNetworkError(getRetCode());
    }

    public boolean isNoNetwork() {
        return ErrorConstant.isNoNetwork(getRetCode());
    }

    public boolean isSessionInvalid() {
        return ErrorConstant.isSessionInvalid(getRetCode());
    }

    @Deprecated
    public boolean isSystemError() {
        return ErrorConstant.isSystemError(getRetCode());
    }

    public boolean isUnitProtect() {
        return ErrorConstant.isUnitProtect(getRetCode());
    }

    public void parseJsonByte() {
        String[] split;
        com.alibaba.fastjson.JSONObject jSONObject;
        String[] split2;
        if (!this.bParsed) {
            synchronized (this) {
                try {
                    if (!this.bParsed) {
                        if (!this.supportStreamJson || (jSONObject = this.originJsonObject) == null) {
                            byte[] bArr = this.bytedata;
                            if (bArr == null || bArr.length == 0) {
                                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                                    TBSdkLog.e(TAG, "[parseJsonByte]MtopResponse bytedata is blank,api=" + this.api + ",v=" + this.v);
                                }
                                if (StringUtils.isBlank(this.retCode)) {
                                    this.retCode = ErrorConstant.ERRCODE_JSONDATA_BLANK;
                                }
                                if (StringUtils.isBlank(this.retMsg)) {
                                    this.retMsg = ErrorConstant.ERRMSG_JSONDATA_BLANK;
                                }
                                this.bParsed = true;
                                return;
                            }
                            String str = new String(bArr);
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                                TBSdkLog.d(TAG, "[parseJsonByte]MtopResponse bytedata : ".concat(str));
                            }
                            JSONObject jSONObject2 = new JSONObject(str);
                            if (this.api == null) {
                                this.api = jSONObject2.getString("api");
                            }
                            if (this.v == null) {
                                this.v = jSONObject2.getString("v");
                            }
                            JSONArray jSONArray = jSONObject2.getJSONArray(rb.RESULT_KEY);
                            int length = jSONArray.length();
                            this.ret = new String[length];
                            for (int i = 0; i < length; i++) {
                                this.ret[i] = jSONArray.getString(i);
                            }
                            if (length > 0) {
                                String str2 = this.ret[0];
                                if (StringUtils.isNotBlank(str2) && (split = str2.split(SHARP)) != null && split.length > 1) {
                                    if (StringUtils.isBlank(this.retCode)) {
                                        this.retCode = split[0];
                                    }
                                    if (StringUtils.isBlank(this.retMsg)) {
                                        this.retMsg = split[1];
                                    }
                                }
                            }
                            this.dataJsonObject = jSONObject2.optJSONObject("data");
                            this.bParsed = true;
                            return;
                        }
                        if (this.api == null) {
                            this.api = jSONObject.getString("api");
                        }
                        if (this.v == null) {
                            this.v = this.originJsonObject.getString("v");
                        }
                        com.alibaba.fastjson.JSONArray jSONArray2 = this.originJsonObject.getJSONArray(rb.RESULT_KEY);
                        int size = jSONArray2.size();
                        this.ret = new String[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            this.ret[i2] = jSONArray2.getString(i2);
                        }
                        if (size > 0) {
                            String str3 = this.ret[0];
                            if (StringUtils.isNotBlank(str3) && (split2 = str3.split(SHARP)) != null && split2.length > 1) {
                                if (StringUtils.isBlank(this.retCode)) {
                                    this.retCode = split2[0];
                                }
                                if (StringUtils.isBlank(this.retMsg)) {
                                    this.retMsg = split2[1];
                                }
                            }
                        }
                        this.bParsed = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAllowParseJson(boolean z) {
        this.allowParseJson = z;
    }

    public void setApi(String str) {
        this.api = str;
    }

    public void setBytedata(byte[] bArr) {
        this.bytedata = bArr;
    }

    @Deprecated
    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setDataJsonObject(JSONObject jSONObject) {
        this.dataJsonObject = jSONObject;
    }

    public void setHeaderFields(Map<String, List<String>> map) {
        this.headerFields = map;
    }

    public void setMtopStat(MtopStatistics mtopStatistics) {
        this.mtopStat = mtopStatistics;
    }

    public void setOriginFastJsonObject(com.alibaba.fastjson.JSONObject jSONObject) {
        this.originJsonObject = jSONObject;
    }

    public void setResponseCode(int i) {
        this.responseCode = i;
    }

    @Deprecated
    public void setRet(String[] strArr) {
        this.ret = strArr;
    }

    public void setRetCode(String str) {
        this.retCode = str;
    }

    public void setRetMsg(String str) {
        this.retMsg = str;
    }

    public void setSource(ResponseSource responseSource) {
        this.responseSource = responseSource;
    }

    public void setStreamModeData(jpq jpqVar) {
        this.streamModeData = jpqVar;
    }

    public void setSupportStreamJson(boolean z) {
        this.supportStreamJson = z;
    }

    public void setV(String str) {
        this.v = str;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(128);
        try {
            sb.append("MtopResponse[ api=");
            sb.append(this.api);
            sb.append(",v=");
            sb.append(this.v);
            sb.append(",retCode=");
            sb.append(this.retCode);
            sb.append(",retMsg=");
            sb.append(this.retMsg);
            sb.append(",mappingCode=");
            sb.append(this.mappingCode);
            sb.append(",mappingCodeSuffix=");
            sb.append(this.mappingCodeSuffix);
            sb.append(",ret=");
            sb.append(Arrays.toString(this.ret));
            sb.append(",data=");
            sb.append(this.dataJsonObject);
            sb.append(",responseCode=");
            sb.append(this.responseCode);
            sb.append(",headerFields=");
            sb.append(this.headerFields);
            sb.append(",bytedata=");
            byte[] bArr = this.bytedata;
            if (bArr == null) {
                str = null;
            } else {
                str = new String(bArr);
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return super.toString();
        }
    }

    public MtopResponse(String str, String str2) {
        this.retCode = str;
        this.retMsg = str2;
    }

    public MtopResponse(String str, String str2, String str3, String str4) {
        this.api = str;
        this.v = str2;
        this.retCode = str3;
        this.retMsg = str4;
    }
}
