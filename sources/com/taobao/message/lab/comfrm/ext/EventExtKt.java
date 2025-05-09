package com.taobao.message.lab.comfrm.ext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Event;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n¢\u0006\u0002\u0010\u000b\u001a\u0014\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\r"}, d2 = {"getBooleanFromData", "", "Lcom/taobao/message/lab/comfrm/core/Event;", "key", "", "getIntFromData", "", "getObjectFromData", "T", "cls", "Ljava/lang/Class;", "(Lcom/taobao/message/lab/comfrm/core/Event;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getStringFromData", "message_comfrm_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class EventExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919563);
    }

    public static final boolean getBooleanFromData(Event event, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8f49fee", new Object[]{event, str})).booleanValue();
        }
        ckf.g(event, "$this$getBooleanFromData");
        ckf.g(str, "key");
        Object data = event.getData();
        if (!(data instanceof Map)) {
            data = null;
        }
        Map map = (Map) data;
        if (map != null) {
            return ValueUtil.getBoolean(map, str);
        }
        return false;
    }

    public static final int getIntFromData(Event event, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8074d1a4", new Object[]{event, str})).intValue();
        }
        ckf.g(event, "$this$getIntFromData");
        ckf.g(str, "key");
        Object data = event.getData();
        if (!(data instanceof Map)) {
            data = null;
        }
        Map map = (Map) data;
        if (map != null) {
            return ValueUtil.getInteger(map, str);
        }
        return 0;
    }

    public static final <T> T getObjectFromData(Event event, String str, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7b95a982", new Object[]{event, str, cls});
        }
        ckf.g(event, "$this$getObjectFromData");
        ckf.g(str, "key");
        ckf.g(cls, "cls");
        Object data = event.getData();
        if (!(data instanceof Map)) {
            data = null;
        }
        Map map = (Map) data;
        if (map != null) {
            t = (T) map.get(str);
        } else {
            t = null;
        }
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public static final String getStringFromData(Event event, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ce26481", new Object[]{event, str});
        }
        ckf.g(event, "$this$getStringFromData");
        ckf.g(str, "key");
        Object data = event.getData();
        if (!(data instanceof Map)) {
            data = null;
        }
        Map map = (Map) data;
        if (map != null) {
            return ValueUtil.getString(map, str);
        }
        return null;
    }
}
