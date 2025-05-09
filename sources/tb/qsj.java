package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f26909a;
    public static final HashMap<String, String> b;

    static {
        t2o.a(806356489);
        HashMap hashMap = new HashMap(128);
        HashMap<String, String> hashMap2 = new HashMap<>(24);
        f26909a = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>(64);
        b = hashMap3;
        hashMap3.put("FAIL_SYS_API_STOP_SERVICE", "ES10000");
        hashMap3.put("FAIL_SYS_SM_ODD_REQUEST", "ES10001");
        hashMap3.put("FAIL_SYS_API_NOT_FOUNDED", "ES10002");
        hashMap3.put("FAIL_SYS_SESSION_EXPIRED", "ES10003");
        hashMap3.put("FAIL_SYS_SYSTEM_BUSY_ERROR", "ES10004");
        hashMap3.put("FAIL_SYS_SERVLET_ASYNC_START_FAIL", "ES10005");
        hashMap3.put("FAIL_SYS_FLOWLIMIT", "ES10006");
        hashMap3.put("FAIL_SYS_API_UNAUTHORIZED", "ES10007");
        hashMap3.put("FAIL_SYS_PROTOPARAM_MISSED", "ES10008");
        hashMap3.put("FAIL_SYS_PROTOVER_MISSED", "ES10009");
        hashMap3.put("FAIL_SYS_REQUEST_EXPIRED", "ES10010");
        hashMap3.put("FAIL_SYS_ILEGEL_SIGN", "ES10011");
        hashMap3.put("FAIL_SYS_INVALID_HTTP_METHOD", "ES10012");
        hashMap3.put("FAIL_SYS_BADARGUMENT_T", "ES10013");
        hashMap3.put("FAIL_SYS_UNKNOWN_APP", "ES10014");
        hashMap3.put("FAIL_SYS_INTERNAL_FAULT", "ES10015");
        hashMap3.put(q5j.TRAFFIC_LIMIT_STATUS, "ES10016");
        hashMap3.put("FAIL_SYS_BIZPARAM_TYPE_ERROR", "ES10017");
        hashMap3.put("FAIL_SYS_BIZPARAM_MISSED", "ES10018");
        hashMap3.put("FAIL_SYS_TOPAUTHPARAM_MISSED", "ES10019");
        hashMap3.put("FAIL_SYS_TOPAUTH_FAILED", "ES10020");
        hashMap3.put("FAIL_SYS_TOPAUTH_ACCESSTOKENEXPIRED_ERROR", "ES10021");
        hashMap3.put("FAIL_SYS_TOPAUTH_TRAFFICLIMIT_ERROR", "ES10022");
        hashMap3.put("FAIL_SYS_TOPUNAUTHAPI_ERROR", "ES10023");
        hashMap3.put("FAIL_SYS_TOPAUTH_FAULT", "ES10024");
        hashMap3.put("FAIL_SYS_RETMISSED_ERROR", "ES10025");
        hashMap3.put("FAIL_SYS_PARAMINVALID_ERROR", "ES10026");
        hashMap3.put("SYSTEM_ERROR", "ES10027");
        hashMap3.put("FAIL_SYS_UNAUTHORIZED_ENTRANCE", "ES10028");
        hashMap3.put("FAIL_SYS_SESSION_ERROR", "ES10029");
        hashMap3.put("FAIL_SYS_MT_ODD_REQUEST", "ES10030");
        hashMap3.put("FAIL_SYS_EXPIRED_REQUEST", "ES10031");
        hashMap3.put("FAIL_SYS_PORTOCOLPARAM_INVALID", "ES10032");
        hashMap3.put("FAIL_SYS_INVALID_PROTOCOLVERSION", "ES10033");
        hashMap3.put("FAIL_SYS_PARAM_MISSING", "ES10035");
        hashMap3.put("FAIL_SYS_PARAM_FORMAT_ERROR", "ES10036");
        hashMap3.put("FAIL_SYS_ILLEGAL_ARGUMENT_TTID", "ES10034");
        hashMap3.put(ErrorConstant.ERRCODE_FAIL_SYS_ILLEGAL_ACCESS_TOKEN, "ES10037");
        hashMap3.put("FAIL_SYS_ACCESS_TOKEN_STOP_SERVICE", "ES10038");
        hashMap3.put("FAIL_SYS_ACCESS_TOKEN_INTERNAL_FAULT", "ES10039");
        hashMap3.put("FAIL_SYS_ACCESS_TOKEN_TRAFFIC_LIMIT", "ES10040");
        hashMap3.put(ErrorConstant.ERRCODE_FAIL_SYS_ACCESS_TOKEN_EXPIRED, "ES10041");
        hashMap3.put("FAIL_SYS_ACCESS_TOKEN_PARAM_INVALID", "ES10042");
        hashMap3.put("FAIL_SYS_ACCESS_TOKEN_UNKNOWN_ERROR", "ES10043");
        hashMap3.put(ErrorConstant.ERRCODE_FAIL_SYS_REQUEST_QUEUED, "ES10044");
        hashMap3.put("FAIL_SYS_SERVICE_NOT_EXIST", "ES20000");
        hashMap3.put("FAIL_SYS_SERVICE_TIMEOUT", "ES20001");
        hashMap3.put("FAIL_SYS_SERVICE_FAULT", "ES20002");
        hashMap3.put("FAIL_SYS_HTTP_QUERYIP_ERROR", "ES30000");
        hashMap3.put("FAIL_SYS_HTTP_REQUESTSUBMIT_FAILED", "ES30001");
        hashMap3.put("FAIL_SYS_HTTP_INVOKE_ERROR", "ES30002");
        hashMap3.put("FAIL_SYS_HTTP_RESPONSE_TIMEOUT", "ES30003");
        hashMap3.put("FAIL_SYS_HTTP_CONNECT_TIMEOUT", "ES30004");
        hashMap3.put("UNKNOWN_FAIL_CODE", "ES40000");
        hashMap3.put("FAIL_SYS_HSF_THROWN_EXCEPTION", "ES40001");
        hashMap3.put("FAIL_SYS_HTTP_RESULT_FIELDMISSED", "ES40003");
        hashMap3.put("FAIL_SYS_SERVICE_INNER_FAULT", "ES40002");
        hashMap2.put(ErrorConstant.ERRCODE_NO_NETWORK, "EC10000");
        hashMap2.put("ANDROID_SYS_NETWORK_ERROR", "EC10001");
        hashMap2.put(ErrorConstant.ERRCODE_JSONDATA_BLANK, "EC30000");
        hashMap2.put(ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR, "EC30001");
        hashMap2.put(ErrorConstant.ERRCODE_MTOPSDK_INIT_ERROR, "EC40000");
        hashMap2.put(ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, "EC40001");
        hashMap2.put(ErrorConstant.ERRCODE_GENERATE_MTOP_SIGN_ERROR, ErrorConstant.MAPPING_CODE_GENERATE_MTOP_SIGN_ERROR);
        hashMap2.put(ErrorConstant.ERRCODE_NETWORK_REQUEST_CONVERT_ERROR, "EC40003");
        hashMap2.put("ANDROID_SYS_API_FLOW_LIMIT_LOCKED", "EC20000");
        hashMap2.put(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, "EC20001");
        hashMap2.put(ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT, "EC40004");
        hashMap2.put(ErrorConstant.ERRCODE_INIT_MTOP_ISIGN_ERROR, "EC40005");
        hashMap2.put(ErrorConstant.ERRCODE_MTOP_MISS_CALL_FACTORY, "EC40006");
        hashMap2.put(ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL, "EC40007");
        hashMap2.put("ANDROID_SYS_LOGIN_CANCEL", "EC40008");
        hashMap2.put(ErrorConstant.ERRCODE_ILLEGAL_JSPARAM_ERROR, "EC40009");
        hashMap2.put(ErrorConstant.ERRCODE_PARSE_JSPARAM_ERROR, "EC40010");
        hashMap2.put(ErrorConstant.ERRCODE_BUILD_PROTOCOL_PARAMS_ERROR, "EC40011");
        hashMap.putAll(hashMap3);
        hashMap.putAll(hashMap2);
        hashMap.put("SUCCESS", "SUCCESS");
    }

    public static NetRequest b(INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("7df8e228", new Object[]{iNetDataObject});
        }
        NetRequest netRequest = new NetRequest();
        if (iNetDataObject != null) {
            l(netRequest, iNetDataObject);
        }
        return netRequest;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239553a3", new Object[]{str})).booleanValue();
        }
        return ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK.equals(str);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b9057cc", new Object[]{str})).booleanValue();
        }
        return "ANDROID_SYS_API_FLOW_LIMIT_LOCKED".equals(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2537309", new Object[]{str})).booleanValue();
        }
        if ("FAIL_SYS_EXPIRED_REQUEST".equals(str) || "FAIL_SYS_REQUEST_EXPIRED".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7aef8b5", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || f26909a.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35bab659", new Object[]{str})).booleanValue();
        }
        if ("ANDROID_SYS_NETWORK_ERROR".equals(str) || ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean h(NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d01225b1", new Object[]{netResponse})).booleanValue();
        }
        if (netResponse == null) {
            return false;
        }
        if ("FAIL_SYS_SESSION_EXPIRED".equals(netResponse.getRetCode()) || ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL.equals(netResponse.getRetCode())) {
            return true;
        }
        return false;
    }

    public static boolean i(NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("847b00f5", new Object[]{netResponse})).booleanValue();
        }
        if (netResponse == null) {
            return false;
        }
        String retCode = netResponse.getRetCode();
        if (j(retCode) || g(retCode) || e(retCode) || c(retCode) || d(retCode) || f(retCode)) {
            return true;
        }
        return false;
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a10226e4", new Object[]{str})).booleanValue();
        }
        return b.containsKey(str);
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f6669d", new Object[]{str})).booleanValue();
        }
        if (q5j.TRAFFIC_LIMIT_STATUS.equals(str) || d(str)) {
            return true;
        }
        return false;
    }

    public static void l(NetRequest netRequest, Object obj) {
        char c;
        try {
            HashMap hashMap = new HashMap();
            Class<?> cls = obj.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(cls.getFields()));
            hashSet.addAll(Arrays.asList(cls.getDeclaredFields()));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                String name = field.getName();
                if (!name.contains("$") && !name.equals("serialVersionUID") && !name.equals("ORIGINALJSON")) {
                    field.setAccessible(true);
                    switch (name.hashCode()) {
                        case -513196083:
                            if (name.equals("NEED_SESSION")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 397645513:
                            if (name.equals("NEED_ECODE")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1069590712:
                            if (name.equals("VERSION")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1779423664:
                            if (name.equals("API_NAME")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            netRequest.setApiName(obj2.toString());
                        }
                    } else if (c == 1) {
                        Object obj3 = field.get(obj);
                        if (obj3 != null) {
                            netRequest.setVersion(obj3.toString());
                        }
                    } else if (c == 2) {
                        netRequest.setNeedEcode(field.getBoolean(obj));
                    } else if (c != 3) {
                        Object obj4 = field.get(obj);
                        if (obj4 != null) {
                            if (obj4 instanceof String) {
                                hashMap.put(name, obj4.toString());
                            } else {
                                hashMap.put(name, JSON.toJSONString(obj4));
                            }
                        }
                    } else {
                        netRequest.setNeedSession(field.getBoolean(obj));
                    }
                }
            }
            netRequest.dataParams = hashMap;
            netRequest.setData(a(hashMap));
        } catch (Exception e) {
            cwd A = v2s.o().A();
            A.c("mtopsdk.ReflectUtil", "parseParams failed." + e.toString());
        }
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("795aad45", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("{");
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!(key == null || value == null)) {
                    try {
                        sb.append(JSON.toJSONString(key));
                        sb.append(":");
                        sb.append(JSON.toJSONString(value));
                        sb.append(",");
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder(64);
                        sb2.append("[convertMapToDataStr] convert key=");
                        sb2.append(key);
                        sb2.append(",value=");
                        sb2.append(value);
                        sb2.append(" to dataStr error.");
                        cwd A = v2s.o().A();
                        A.c("mtopsdk.ReflectUtil", sb2.toString() + th);
                    }
                }
            }
            int length = sb.length();
            if (length > 1) {
                sb.deleteCharAt(length - 1);
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
