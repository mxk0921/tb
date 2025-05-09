package tb;

import com.alibaba.alibity.container.file.FileAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wc9 INSTANCE = new wc9();

    static {
        t2o.a(843055204);
    }

    public final void a(bbs bbsVar, String str, String str2, String str3, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925d1104", new Object[]{this, bbsVar, str, str2, str3, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(str2, "data");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "appendFileWithString: path: " + str + ", data size: " + str2.length() + ", encoding: " + ((Object) str3));
        vbs.g(bbsVar, str3 == null ? "utf-8" : str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        jSONObject.put((JSONObject) "data", str2);
        if (str3 != null) {
            jSONObject.put((JSONObject) "encoding", str3);
        }
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_APPEND_FILE, jSONObject, uqVar);
    }

    public final void b(bbs bbsVar, String str, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739fc353", new Object[]{this, bbsVar, str, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "src");
        ckf.g(str2, "dest");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "copyFile: src: " + str + ", dest: " + str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "src", str);
        jSONObject.put((JSONObject) "dest", str2);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_COPY_FILE, jSONObject, uqVar);
    }

    public final void c(bbs bbsVar, String str, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3291b2", new Object[]{this, bbsVar, str, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", ckf.p("exists: path: ", str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_EXISTS, jSONObject, uqVar);
    }

    public final void d(bbs bbsVar, String str, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfaaa549", new Object[]{this, bbsVar, str, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", ckf.p("getDirInfo: path: ", str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_GET_DIR_INFO, jSONObject, uqVar);
    }

    public final void e(bbs bbsVar, String str, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5cc104", new Object[]{this, bbsVar, str, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "getFileInfo: path: " + str + ", digestAlgorithm: " + ((Object) str2));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        if (!(str2 == null || str2.length() == 0)) {
            jSONObject.put((JSONObject) "digestAlgorithm", str2);
        }
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_GET_FILE_INFO, jSONObject, uqVar);
    }

    public final void f(bbs bbsVar, String str, Boolean bool, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282ae55a", new Object[]{this, bbsVar, str, bool, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "makeDir: path: " + str + ", recursive: " + bool);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        if (bool != null) {
            jSONObject.put((JSONObject) "recursive", (String) bool);
        }
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_MAKE_DIR, jSONObject, uqVar);
    }

    public final void g(bbs bbsVar, String str, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67332bfd", new Object[]{this, bbsVar, str, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", ckf.p("readAsArrayBuffer: path: ", str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_READ_AS_ARRAY_BUFFER, jSONObject, uqVar);
    }

    public final void h(bbs bbsVar, String str, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc3f04b", new Object[]{this, bbsVar, str, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "readAsString: path: " + str + ", encoding: " + ((Object) str2));
        vbs.g(bbsVar, str2 == null ? "utf-8" : str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        if (str2 != null) {
            jSONObject.put((JSONObject) "encoding", str2);
        }
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_READ_AS_STRING, jSONObject, uqVar);
    }

    public final void i(bbs bbsVar, String str, Boolean bool, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d343b684", new Object[]{this, bbsVar, str, bool, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "removeDir: path: " + str + ", recursive: " + bool);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        if (bool != null) {
            jSONObject.put((JSONObject) "recursive", (String) bool);
        }
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_REMOVE_DIR, jSONObject, uqVar);
    }

    public final void j(bbs bbsVar, String str, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9f396e", new Object[]{this, bbsVar, str, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", ckf.p("removeFile: path: ", str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_REMOVE_FILE, jSONObject, uqVar);
    }

    public final void k(bbs bbsVar, String str, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42112546", new Object[]{this, bbsVar, str, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "src");
        ckf.g(str2, "dest");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "rename: src: " + str + ", dest: " + str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "src", str);
        jSONObject.put((JSONObject) "dest", str2);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_RENAME, jSONObject, uqVar);
    }

    public final void l(bbs bbsVar, String str, String str2, String str3, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efade792", new Object[]{this, bbsVar, str, str2, str3, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "src");
        ckf.g(str2, "dest");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "unzip: src: " + str + ", dest: " + str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "src", str);
        jSONObject.put((JSONObject) "dest", str2);
        jSONObject.put((JSONObject) "limitRootDicPath", str3);
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_UNZIP, jSONObject, uqVar);
    }

    public final void m(bbs bbsVar, String str, String str2, String str3, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27aaff9f", new Object[]{this, bbsVar, str, str2, str3, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(str2, "data");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "writeFileWithString: path: " + str + ", data size: " + str2.length() + ", encoding: " + ((Object) str3));
        vbs.g(bbsVar, str3 == null ? "utf-8" : str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        jSONObject.put((JSONObject) "data", str2);
        if (str3 != null) {
            jSONObject.put((JSONObject) "encoding", str3);
        }
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_WRITE_FILE, jSONObject, uqVar);
    }

    public final void n(bbs bbsVar, String str, ByteBuffer byteBuffer, String str2, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49086776", new Object[]{this, bbsVar, str, byteBuffer, str2, uqVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "path");
        ckf.g(byteBuffer, "data");
        ckf.g(uqVar, "callback");
        TMSLogger.a("FileMegaAbility", "writeFileWithString: path: " + str + ", data size: " + byteBuffer.capacity() + ", encoding: " + ((Object) str2));
        vbs.g(bbsVar, str2 == null ? "ArrayBuffer" : str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "path", str);
        jSONObject.put((JSONObject) "data", (String) byteBuffer);
        if (str2 != null) {
            jSONObject.put((JSONObject) "encoding", str2);
        }
        k8s.j().d(bbsVar, TMSCalendarBridge.namespace, null, null, "file", FileAbility.API_WRITE_FILE, jSONObject, uqVar);
    }
}
