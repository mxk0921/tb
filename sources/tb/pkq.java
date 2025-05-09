package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pkq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_CONNECT_FAILED = "ERR_CONNECT_FAILED";
    public static final String ERR_INVALID_REQUEST = "ERR_INVALID_REQUEST";
    public static final String UNKNOWN_STATUS = "unknown status";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f26147a;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc1df45a", new Object[]{str});
        }
        Map<String, String> map = f26147a;
        if (!((HashMap) map).containsKey(str)) {
            return "unknown status";
        }
        return (String) ((HashMap) map).get(str);
    }

    static {
        t2o.a(843055230);
        HashMap hashMap = new HashMap();
        f26147a = hashMap;
        hashMap.put("100", "Continue");
        hashMap.put("101", "Switching Protocol");
        hashMap.put("200", mj4.CONTROL_NAME_OK);
        hashMap.put("201", "Created");
        hashMap.put("202", "Accepted");
        hashMap.put("203", "Non-Authoritative Information");
        hashMap.put("204", "No Content");
        hashMap.put("205", "Reset Content");
        hashMap.put("206", "Partial Content");
        hashMap.put("300", "Multiple Choice");
        hashMap.put("301", "Moved Permanently");
        hashMap.put("302", "Found");
        hashMap.put("303", "See Other");
        hashMap.put("304", "Not Modified");
        hashMap.put("305", "Use Proxy");
        hashMap.put("306", "unused");
        hashMap.put("307", "Temporary Redirect");
        hashMap.put("308", "Permanent Redirect");
        hashMap.put("400", "Bad Request");
        hashMap.put("401", "Unauthorized");
        hashMap.put("402", "Payment Required");
        hashMap.put("403", "Forbidden");
        hashMap.put("404", "Not Found");
        hashMap.put("405", "Method Not Allowed");
        hashMap.put("406", "Not Acceptable");
        hashMap.put("407", "Proxy Authentication Required");
        hashMap.put("408", "Request Timeout");
        hashMap.put("409", "Conflict");
        hashMap.put("410", "Gone");
        hashMap.put("411", "Length Required");
        hashMap.put("412", "Precondition Failed");
        hashMap.put("413", "Payload Too Large");
        hashMap.put("414", "URI Too Long");
        hashMap.put("415", "Unsupported Media Type");
        hashMap.put("416", "Requested Range Not Satisfiable");
        hashMap.put("417", "Expectation Failed");
        hashMap.put("418", "I'm a teapot");
        hashMap.put("421", "Misdirected Request");
        hashMap.put("426", "Upgrade Required");
        hashMap.put("428", "Precondition Required");
        hashMap.put("429", "Too Many Requests");
        hashMap.put("431", "Request Header Fields Too Large");
        hashMap.put("500", "Internal Server Error");
        hashMap.put("501", "Not Implemented");
        hashMap.put("502", "Bad Gateway");
        hashMap.put("503", "Service Unavailable");
        hashMap.put(TaobaoConstants.DEVICETOKEN_ERROR, "Gateway Timeout");
        hashMap.put("505", "HTTP Version Not Supported");
        hashMap.put("506", "Variant Also Negotiates");
        hashMap.put("507", "Variant Also Negotiates");
        hashMap.put("511", "Network Authentication Required");
    }
}
