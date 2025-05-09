package com.taobao.message.lab.comfrm.ext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Action;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002\u001a-\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\f¢\u0006\u0002\u0010\r\u001a\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"getBooleanFromData", "", "Lcom/taobao/message/lab/comfrm/core/Action;", "key", "", "getIntFromData", "", "getJSONObjectData", "Lcom/alibaba/fastjson/JSONObject;", "getObjectFromData", "T", "cls", "Ljava/lang/Class;", "(Lcom/taobao/message/lab/comfrm/core/Action;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getStringFromData", "message_comfrm_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ActionExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919562);
    }

    public static final boolean getBooleanFromData(Action action, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89235cae", new Object[]{action, str})).booleanValue();
        }
        ckf.g(action, "$this$getBooleanFromData");
        ckf.g(str, "key");
        Object data = action.getData();
        if (!(data instanceof Map)) {
            data = null;
        }
        Map map = (Map) data;
        if (map != null) {
            return ValueUtil.getBoolean(map, str);
        }
        return false;
    }

    public static final int getIntFromData(Action action, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1a963b6", new Object[]{action, str})).intValue();
        }
        ckf.g(action, "$this$getIntFromData");
        ckf.g(str, "key");
        Object data = action.getData();
        if (!(data instanceof Map)) {
            data = null;
        }
        Map map = (Map) data;
        if (map != null) {
            return ValueUtil.getInteger(map, str);
        }
        return 0;
    }

    public static final JSONObject getJSONObjectData(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8b06a0ff", new Object[]{action});
        }
        ckf.g(action, "$this$getJSONObjectData");
        Object data = action.getData();
        if (data == null) {
            return null;
        }
        if (data instanceof JSONObject) {
            return (JSONObject) data;
        }
        return JSON.parseObject(JSON.toJSONString(data));
    }

    public static final <T> T getObjectFromData(Action action, String str, Class<T> cls) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("523d819c", new Object[]{action, str, cls});
        }
        ckf.g(action, "$this$getObjectFromData");
        ckf.g(str, "key");
        ckf.g(cls, "cls");
        Object data = action.getData();
        if (!(data instanceof Map)) {
            data = null;
        }
        Map map = (Map) data;
        if (map == null || (obj = map.get(str)) == null || !cls.isInstance(obj)) {
            return null;
        }
        return cls.cast(obj);
    }

    public static final String getStringFromData(Action action, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d97940b", new Object[]{action, str});
        }
        ckf.g(action, "$this$getStringFromData");
        ckf.g(str, "key");
        Object data = action.getData();
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
