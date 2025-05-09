package tb;

import com.taobao.android.weex.WeexInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface xpc {
    public static final String RECORD_APPEAR = "appear";
    public static final String RECORD_CALLMODULEMETHOD = "callModuleMethod";
    public static final String RECORD_CREATE_CANAL_CHILD_INSTANCE = "createChildInstance";
    public static final String RECORD_CREATE_CANAL_MAIN_INSTANCE = "createCanalMainInstance";
    public static final String RECORD_DISAPPEAR = "disappear";
    public static final String RECORD_ENVIRONMENT = "environment";
    public static final String RECORD_EXECUTE = "execute";
    public static final String RECORD_FIREEVENT = "fireEvent";
    public static final String RECORD_INIT_WITH_DATA = "initWithData";
    public static final String RECORD_INVOKE_CALLBACK = "invokeCallback";
    public static final String RECORD_PREPARE = "prepare";
    public static final String RECORD_RENDER = "render";
    public static final int RECORD_WIDGET_INSTANCE_ID = 999;

    void a(int i);

    void b(WeexInstance weexInstance);

    void c(int i);
}
