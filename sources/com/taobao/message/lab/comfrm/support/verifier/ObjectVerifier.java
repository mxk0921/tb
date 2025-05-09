package com.taobao.message.lab.comfrm.support.verifier;

import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.support.model.Action1;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ObjectVerifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<Object, Pair<String, String>> objectPool = new ConcurrentHashMap();
    private static int sCheckLevel = Integer.parseInt(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "ObjectVerifier", "1"));

    public static /* synthetic */ String access$000(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a928056d", new Object[]{obj});
        }
        return toJSON(obj);
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return objectPool;
    }

    public static void addCheckObject(final Object obj, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef328b3", new Object[]{obj, str});
        } else if (ApplicationUtil.isDebug() && sCheckLevel > 0 && obj != null) {
            Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ObjectVerifier.access$100().put(obj, new Pair(str, ObjectVerifier.access$000(obj)));
                    }
                }
            });
        }
    }

    public static void check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17afa58f", new Object[0]);
        } else {
            check(null);
        }
    }

    private static String toJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8a3a71a", new Object[]{obj});
        }
        if (obj instanceof Action) {
            return ((Action) obj).toJSON().toJSONString();
        }
        if (obj instanceof Event) {
            return ((Event) obj).toJSON().toJSONString();
        }
        return JSON.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString);
    }

    public static void check(final Action1 action1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d6420f", new Object[]{action1});
        } else if (ApplicationUtil.isDebug() && sCheckLevel > 0) {
            Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (Map.Entry entry : new HashMap(ObjectVerifier.access$100()).entrySet()) {
                        Object key = entry.getKey();
                        ObjectVerifier.access$100().remove(key);
                        String access$000 = ObjectVerifier.access$000(key);
                        if (!access$000.equals(((Pair) entry.getValue()).second)) {
                            String str = "tag|" + ((String) ((Pair) entry.getValue()).first) + "|new|" + access$000 + "|old|" + ((String) ((Pair) entry.getValue()).second);
                            Logger.e("ObjectVerifier", str);
                            Action1 action12 = Action1.this;
                            if (action12 != null) {
                                action12.call(str);
                            }
                            throw new IllegalStateException(str);
                        }
                    }
                }
            });
        }
    }

    static {
        t2o.a(537919869);
    }
}
