package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tx1 extends bmi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_STATE_CHANGE_ARGS_CHANGE_TYPE = "changeType";
    public static final String PAGE_STATE_CHANGE_ARGS_CHANGE_TYPE_NAVIGATION = "navigation";
    public static final String PAGE_STATE_CHANGE_ARGS_CHANGE_TYPE_OTHER = "other";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE = "state";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_CREATE = "create";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_DESTROY = "destroy";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_START = "start";
    public static final String PAGE_STATE_CHANGE_ARGS_STATE_STOP = "stop";
    public static final String PAGE_URL_QUERY_CHANGE_ARGS_URL_QUERY = "urlQuery";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE = "changeType";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE_NAVIGATION = "navigation";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE_OTHER = "other";
    public static final String TAB_STATE_CHANGE_ARGS_CHANGE_TYPE_TAB = "tab";
    public static final String TAB_STATE_CHANGE_ARGS_ID = "id";
    public static final String TAB_STATE_CHANGE_ARGS_STATE = "state";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_CREATE = "create";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_DESTROY = "destroy";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_START = "start";
    public static final String TAB_STATE_CHANGE_ARGS_STATE_STOP = "stop";
    public static final String TAB_STATE_CHANGE_ARGS_TYPE = "type";
    public static final String TAB_URL_QUERY_CHANGE_ARGS_ID = "id";
    public static final String TAB_URL_QUERY_CHANGE_ARGS_URL_QUERY = "urlQuery";
    public static final a Companion = new a(null);
    public static final String PAGE_STATE_CHANGE_NAME = "GIMSG_pageStateChange";
    public static final String TAB_STATE_CHANGE_NAME = "GIMSG_tabStateChange";
    public static final String PAGE_URL_QUERY_CHANGE_NAME = "GIMSG_pageURLQueryChange";
    public static final String TAB_URL_QUERY_CHANGE_NAME = "GIMSG_tabURLQueryChange";
    public static final List<String> g = yz3.l(PAGE_STATE_CHANGE_NAME, TAB_STATE_CHANGE_NAME, PAGE_URL_QUERY_CHANGE_NAME, TAB_URL_QUERY_CHANGE_NAME);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(689963134);
        }

        public a() {
        }

        public final boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16a7286c", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "name");
            return tx1.h().contains(str);
        }

        public final tx1 b(String str, JSONObject jSONObject, long j, bmi.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tx1) ipChange.ipc$dispatch("9061db06", new Object[]{this, str, jSONObject, new Long(j), aVar});
            }
            ckf.g(str, "name");
            vgh.c(this, "BaseMessage", "解析基础消息实体，name=" + str + "，args=" + jSONObject + "，timestamp=" + j);
            if (a(str)) {
                return new tx1(str, jSONObject, j, aVar, null);
            }
            vgh.c(this, "BaseMessage", "解析基础消息实体，非基础消息名");
            return null;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963133);
    }

    public /* synthetic */ tx1(String str, JSONObject jSONObject, long j, bmi.a aVar, a07 a07Var) {
        this(str, jSONObject, j, aVar);
    }

    public static final /* synthetic */ List h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ba7f351", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ Object ipc$super(tx1 tx1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/message/BaseMessage");
    }

    public tx1(String str, JSONObject jSONObject, long j, bmi.a aVar) {
        super(str, jSONObject, j, "Interact", "Interact", aVar);
    }
}
