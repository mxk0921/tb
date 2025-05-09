package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fkx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356417);
    }

    public static final Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fe642ae", new Object[]{str});
        }
        try {
            Object parse = JSON.parse(str, JSON.DEFAULT_PARSER_FEATURE);
            igq.n().d("XJSON");
            return parse;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("1c9581e7", new Object[]{str});
        }
        try {
            JSONArray parseArray = JSON.parseArray(str);
            igq.n().d("XJSON");
            return parseArray;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final <T> List<T> c(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bd8806e1", new Object[]{str, cls});
        }
        try {
            List<T> parseArray = JSON.parseArray(str, cls);
            igq.n().d("XJSON");
            return parseArray;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f057a803", new Object[]{str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            igq.n().d("XJSON");
            return parseObject;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final <T> T f(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7e42d1b8", new Object[]{str, cls});
        }
        try {
            T t = (T) JSON.parseObject(str, cls);
            igq.n().d("XJSON");
            return t;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final <T> T g(byte[] bArr, Type type, Feature... featureArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("13f18a87", new Object[]{bArr, type, featureArr});
        }
        try {
            T t = (T) JSON.parseObject(bArr, type, featureArr);
            igq.n().d("XJSON");
            return t;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final Object h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c5e0c9ac", new Object[]{obj});
        }
        try {
            Object json = JSON.toJSON(obj);
            igq.n().d("XJSON");
            return json;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final String i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57f6b409", new Object[]{obj});
        }
        try {
            String jSONString = JSON.toJSONString(obj);
            igq.n().d("XJSON");
            return jSONString;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }

    public static final <T> T j(JSON json, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("36b5e941", new Object[]{json, cls});
        }
        try {
            T t = (T) JSON.toJavaObject(json, cls);
            igq.n().d("XJSON");
            return t;
        } catch (Throwable th) {
            igq.n().b("XJSON", igq.n().k(th), th.toString());
            return null;
        }
    }
}
