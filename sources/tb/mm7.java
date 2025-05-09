package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE_BYTE_READ_ERROR = "byteReadError";
    public static final String ERROR_CODE_BYTE_TO_PARSER_ERROR = "byteToParserError";
    public static final String ERROR_CODE_EVENT_HANDLER_EXCEPTION = "eventHandlerException";
    public static final String ERROR_CODE_EVENT_HANDLER_NOT_FOUND = "eventHandlerNotFound";
    public static final String ERROR_CODE_OTHER = "other";
    public static final String ERROR_CODE_TEMPLATE_FILE_EMPTY = "templateFileEmpty";
    public static final String ERROR_CODE_TEMPLATE_FILE_LOST = "templateFileLost";
    public static final String ERROR_CODE_TEMPLATE_INFO_ERROR = "templateInfoError";
    public static final String ERROR_CODE_TEMPLATE_NOT_FOUND = "templateNotFound";
    public static final String ERROR_CODE_TEMPLATE_PARSER_EXCEPTION = "parserException";
    public static final String ERROR_CODE_TEMPLATE_PARSER_NOT_FOUND = "parserNotFound";
    public static final String ERROR_CODE_VIEW_EXCEPTION = "viewException";
    public static final String ERROR_CODE_VIEW_NOT_FOUND = "viewNotFound";
    public static final String ERROR_CODE_XML_BLOCK_CONSTRUCTOR_REFLECT_ERROR = "xmlBlockConstructorReflectError";
    public static final String ERROR_CODE_XML_RES_PARSER_ERROR = "xmlResourceParserError";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f24133a = new HashMap<>();
    public final String b;

    static {
        t2o.a(444596420);
    }

    public mm7(String str) {
        this.b = str;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69cdd43", new Object[]{this, str, str2});
            return;
        }
        if (!this.f24133a.containsKey(str)) {
            HashMap<String, String> hashMap = this.f24133a;
            hashMap.put(str, this.b + ":" + str2 + ";");
        }
        HashMap<String, String> hashMap2 = this.f24133a;
        hashMap2.put(str, this.f24133a.get(str) + str2 + ";");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77c312fa", new Object[]{this});
        }
        return this.f24133a.toString();
    }

    public HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("aaf3c654", new Object[]{this});
        }
        return this.f24133a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.f24133a.isEmpty();
    }
}
