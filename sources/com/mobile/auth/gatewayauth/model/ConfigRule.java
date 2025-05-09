package com.mobile.auth.gatewayauth.model;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ConfigRule {
    private LimitConfig auth_token;
    private DowngradeInfoList downgrade_info_list;
    private LimitConfig get_config;
    private LimitConfig get_vendor_list;
    private String is_auth_demoted;
    private String is_crash_demoted;
    private String is_demoted;
    private String is_login_demoted;
    private String is_sls_demoted;
    private LimitConfig login_page;
    private LimitConfig login_phone;
    private LimitConfig login_token;
    private LimitConfig sls;
    private UploadLog upload_log;

    public static ConfigRule fromJson(String str) {
        try {
            ConfigRule configRule = new ConfigRule();
            try {
                if (!TextUtils.isEmpty(str)) {
                    return fromJson(new JSONObject(str));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return configRule;
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

    public LimitConfig getAuth_token() {
        try {
            return this.auth_token;
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

    public DowngradeInfoList getDowngradeInfoList() {
        try {
            return this.downgrade_info_list;
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

    public LimitConfig getGet_config() {
        try {
            return this.get_config;
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

    public LimitConfig getGet_vendor_list() {
        try {
            return this.get_vendor_list;
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

    public String getIs_auth_demoted() {
        try {
            return this.is_auth_demoted;
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

    public String getIs_crash_demoted() {
        try {
            return this.is_crash_demoted;
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

    public String getIs_demoted() {
        try {
            return this.is_demoted;
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

    public String getIs_login_demoted() {
        try {
            return this.is_login_demoted;
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

    public String getIs_sls_demoted() {
        try {
            return this.is_sls_demoted;
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

    public LimitConfig getLogin_page() {
        try {
            return this.login_page;
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

    public LimitConfig getLogin_phone() {
        try {
            return this.login_phone;
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

    public LimitConfig getLogin_token() {
        try {
            return this.login_token;
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

    public LimitConfig getSls() {
        try {
            return this.sls;
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

    public UploadLog getUpload_log() {
        try {
            return this.upload_log;
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

    public void setAuth_token(LimitConfig limitConfig) {
        try {
            this.auth_token = limitConfig;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setDowngradeInfoList(DowngradeInfoList downgradeInfoList) {
        try {
            this.downgrade_info_list = downgradeInfoList;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setGet_config(LimitConfig limitConfig) {
        try {
            this.get_config = limitConfig;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setGet_vendor_list(LimitConfig limitConfig) {
        try {
            this.get_vendor_list = limitConfig;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIs_auth_demoted(String str) {
        try {
            this.is_auth_demoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIs_crash_demoted(String str) {
        try {
            this.is_crash_demoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIs_demoted(String str) {
        try {
            this.is_demoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setIs_login_demoted(String str) {
        try {
            this.is_login_demoted = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public ConfigRule setIs_sls_demoted(String str) {
        try {
            this.is_sls_demoted = str;
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

    public void setLogin_page(LimitConfig limitConfig) {
        try {
            this.login_page = limitConfig;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setLogin_phone(LimitConfig limitConfig) {
        try {
            this.login_phone = limitConfig;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setLogin_token(LimitConfig limitConfig) {
        try {
            this.login_token = limitConfig;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setSls(LimitConfig limitConfig) {
        try {
            this.sls = limitConfig;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public ConfigRule setUpload_log(UploadLog uploadLog) {
        try {
            this.upload_log = uploadLog;
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

    public JSONObject toJson() {
        try {
            JSONObject n = wrf.n(this, new ArrayList());
            try {
                LimitConfig limitConfig = this.auth_token;
                Object obj = "";
                n.put("auth_token", limitConfig == null ? obj : limitConfig.toJson());
                LimitConfig limitConfig2 = this.get_config;
                n.put("get_config", limitConfig2 == null ? obj : limitConfig2.toJson());
                LimitConfig limitConfig3 = this.get_vendor_list;
                n.put("get_vendor_list", limitConfig3 == null ? obj : limitConfig3.toJson());
                LimitConfig limitConfig4 = this.login_page;
                n.put("login_page", limitConfig4 == null ? obj : limitConfig4.toJson());
                LimitConfig limitConfig5 = this.login_phone;
                n.put("login_phone", limitConfig5 == null ? obj : limitConfig5.toJson());
                LimitConfig limitConfig6 = this.login_token;
                n.put("login_token", limitConfig6 == null ? obj : limitConfig6.toJson());
                LimitConfig limitConfig7 = this.sls;
                n.put("sls", limitConfig7 == null ? obj : limitConfig7.toJson());
                UploadLog uploadLog = this.upload_log;
                n.put("upload_log", uploadLog == null ? obj : uploadLog.toJson());
                DowngradeInfoList downgradeInfoList = this.downgrade_info_list;
                if (downgradeInfoList != null) {
                    if (downgradeInfoList != null) {
                        obj = downgradeInfoList.toJson();
                    }
                    n.put("downgrade_info_list", obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return n;
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

    public String toJsonString() {
        try {
            JSONObject n = wrf.n(this, new ArrayList());
            try {
                LimitConfig limitConfig = this.auth_token;
                Object obj = "";
                n.put("auth_token", limitConfig == null ? obj : limitConfig.toJson());
                LimitConfig limitConfig2 = this.get_config;
                n.put("get_config", limitConfig2 == null ? obj : limitConfig2.toJson());
                LimitConfig limitConfig3 = this.get_vendor_list;
                n.put("get_vendor_list", limitConfig3 == null ? obj : limitConfig3.toJson());
                LimitConfig limitConfig4 = this.login_page;
                n.put("login_page", limitConfig4 == null ? obj : limitConfig4.toJson());
                LimitConfig limitConfig5 = this.login_phone;
                n.put("login_phone", limitConfig5 == null ? obj : limitConfig5.toJson());
                LimitConfig limitConfig6 = this.login_token;
                n.put("login_token", limitConfig6 == null ? obj : limitConfig6.toJson());
                LimitConfig limitConfig7 = this.sls;
                n.put("sls", limitConfig7 == null ? obj : limitConfig7.toJson());
                UploadLog uploadLog = this.upload_log;
                n.put("upload_log", uploadLog == null ? obj : uploadLog.toJson());
                DowngradeInfoList downgradeInfoList = this.downgrade_info_list;
                if (downgradeInfoList != null) {
                    obj = downgradeInfoList.toJson();
                }
                n.put("downgrade_info_list", obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return n.toString();
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
            return "ConfigRule{auth_token=" + this.auth_token + ", get_config=" + this.get_config + ", get_vendor_list=" + this.get_vendor_list + ", is_auth_demoted='" + this.is_auth_demoted + "', is_demoted='" + this.is_demoted + "', is_login_demoted='" + this.is_login_demoted + "', is_sls_demoted='" + this.is_sls_demoted + "', is_crash_demoted='" + this.is_crash_demoted + "', downgrade_info_list='" + this.downgrade_info_list + "', login_page=" + this.login_page + ", login_phone=" + this.login_phone + ", login_token=" + this.login_token + ", sls=" + this.sls + ", upload_log=" + this.upload_log + '}';
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

    public static ConfigRule fromJson(JSONObject jSONObject) {
        try {
            ConfigRule configRule = new ConfigRule();
            if (jSONObject != null) {
                wrf.a(jSONObject, configRule, null);
                configRule.setAuth_token((LimitConfig) wrf.b(jSONObject.optJSONObject("auth_token"), new swf<LimitConfig>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.1
                }, null));
                configRule.setGet_config((LimitConfig) wrf.b(jSONObject.optJSONObject("get_config"), new swf<LimitConfig>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.2
                }, null));
                configRule.setGet_vendor_list((LimitConfig) wrf.b(jSONObject.optJSONObject("get_vendor_list"), new swf<LimitConfig>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.3
                }, null));
                configRule.setLogin_page((LimitConfig) wrf.b(jSONObject.optJSONObject("login_page"), new swf<LimitConfig>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.4
                }, null));
                configRule.setLogin_phone((LimitConfig) wrf.b(jSONObject.optJSONObject("login_phone"), new swf<LimitConfig>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.5
                }, null));
                configRule.setLogin_token((LimitConfig) wrf.b(jSONObject.optJSONObject("login_token"), new swf<LimitConfig>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.6
                }, null));
                configRule.setSls((LimitConfig) wrf.b(jSONObject.optJSONObject("sls"), new swf<LimitConfig>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.7
                }, null));
                configRule.setUpload_log((UploadLog) wrf.b(jSONObject.optJSONObject("upload_log"), new swf<UploadLog>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.8
                }, null));
                configRule.setDowngradeInfoList((DowngradeInfoList) wrf.b(jSONObject.optJSONObject("downgrade_info_list"), new swf<DowngradeInfoList>() { // from class: com.mobile.auth.gatewayauth.model.ConfigRule.9
                }, null));
            }
            return configRule;
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
