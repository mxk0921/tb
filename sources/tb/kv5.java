package tb;

import com.heytap.mcssdk.constant.MessageConstant$CommandId;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kv5 {

    /* renamed from: a  reason: collision with root package name */
    public final int f22945a;
    public final String b;
    public static final kv5 EVENT_CHAIN_ERROR_ABILITY_IS_NULL = new kv5(1, "event ability is null");
    public static final kv5 EVENT_CHAIN_ERROR_ABILITY_EXEC_RESULT_IS_NULL = new kv5(2, "event ability callback params is null");
    public static final kv5 EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_CONTEXT_IS_NULL = new kv5(4097, "event atomic execute context is null");
    public static final kv5 EVENT_CHAIN_ERROR_ATOMIC_EXECUTE_ABILITY_IS_NULL = new kv5(4098, "event atomic execute ability is null");
    public static final kv5 EVENT_CHAIN_ERROR_EXECUTE_CONTEXT_IS_NULL = new kv5(8193, "event chain execute context is null");
    public static final kv5 EVENT_CHAIN_ERROR_EXECUTE_EVENTCHIAN_CONTEXT_IS_NULL = new kv5(MessageConstant$CommandId.COMMAND_UNREGISTER, "event chain execute eventchian context is null");
    public static final kv5 EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_CONTEXT_IS_NULL = new kv5(MessageConstant$CommandId.COMMAND_STATISTIC, "event chain execute atomic context is null");
    public static final kv5 EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_NODE_IS_NULL = new kv5(MessageConstant$CommandId.COMMAND_SET_ALIAS, "event chain execute atomic eventnode is null");
    public static final kv5 EVENT_CHAIN_ERROR_MEGAC_EXECUTE_CONTEXT_IS_NULL = new kv5(12293, "event mega execute context is null");
    public static final kv5 EVENT_CHAIN_ERROR_MEGA_EXECUTE_ENGINE_IS_NULL = new kv5(12294, "event mega execute context is null");

    static {
        t2o.a(444596675);
    }

    public kv5(int i, String str) {
        this.f22945a = i;
        this.b = str;
    }
}
