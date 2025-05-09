package com.alibaba.android.nextrpc.streamv2.trace;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/trace/TraceName;", "", "(Ljava/lang/String;I)V", "NEXTRPC_CREATE_CLIENT", "NEXTRPC_CREATE_REQUEST", "NEXTRPC_EXECUTE_TASK", "NEXTRPC_SEND_MTOP", "NEXTRPC_RECEIVE_ACCS", "NEXTRPC_QUEUE_ATTACHED_RESPONSE", "NEXTRPC_QUEUE_MAIN_RESPONSE", "NEXTRPC_RESULT_ATTACHED_RESPONSE", "NEXTRPC_RESULT_MAIN_RESPONSE", "NEXTRPC_CREATE_MAIN_RESPONSE", "NEXTRPC_PARSE_JSON_OBJECT", "NEXTRPC_PARSE_STAT", "NEXTRPC_PARSE_RET", "NEXTRPC_CREATE_ATTACHED_RESPONSE", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum TraceName {
    NEXTRPC_CREATE_CLIENT,
    NEXTRPC_CREATE_REQUEST,
    NEXTRPC_EXECUTE_TASK,
    NEXTRPC_SEND_MTOP,
    NEXTRPC_RECEIVE_ACCS,
    NEXTRPC_QUEUE_ATTACHED_RESPONSE,
    NEXTRPC_QUEUE_MAIN_RESPONSE,
    NEXTRPC_RESULT_ATTACHED_RESPONSE,
    NEXTRPC_RESULT_MAIN_RESPONSE,
    NEXTRPC_CREATE_MAIN_RESPONSE,
    NEXTRPC_PARSE_JSON_OBJECT,
    NEXTRPC_PARSE_STAT,
    NEXTRPC_PARSE_RET,
    NEXTRPC_CREATE_ATTACHED_RESPONSE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TraceName traceName, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/streamv2/trace/TraceName");
    }

    public static TraceName valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("230761fb", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(TraceName.class, str);
        }
        return (TraceName) valueOf;
    }
}
