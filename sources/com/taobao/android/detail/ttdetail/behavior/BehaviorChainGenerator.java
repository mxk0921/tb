package com.taobao.android.detail.ttdetail.behavior;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BehaviorChainGenerator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPONENT_BEHAVIOR_TYPE_APPEAR = 1;
    public static final int COMPONENT_BEHAVIOR_TYPE_DISAPPEAR = 2;
    public static final int FLOAT_BEHAVIOR_TYPE_APPEAR = 1;
    public static final int FLOAT_BEHAVIOR_TYPE_DISAPPEAR = 2;
    public static final String NAME_COMPONENT_BEHAVIOR_TYPE_APPEAR = "appear";
    public static final String NAME_COMPONENT_BEHAVIOR_TYPE_DISAPPEAR = "disappear";
    public static final String NAME_COMPONENT_BEHAVIOR_TYPE_UNKNOWN = "unknown";
    public static final String NAME_FLOAT_BEHAVIOR_TYPE_APPEAR = "appear";
    public static final String NAME_FLOAT_BEHAVIOR_TYPE_DISAPPEAR = "disappear";
    public static final String NAME_FLOAT_BEHAVIOR_TYPE_UNKNOWN = "unknown";

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Integer> f6695a = new HashSet<Integer>() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator.1
        {
            add(2);
        }
    };

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class AnonymousClass4 extends JSONObject {
        public final /* synthetic */ int val$floatBehaviorType;
        public final /* synthetic */ Map val$floatContentInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, int i, Map map) {
            super(z);
            this.val$floatBehaviorType = i;
            this.val$floatContentInfo = map;
            put("behavior_type", (Object) BehaviorChainGenerator.f(i));
            put("time_stamp", (Object) String.valueOf(System.currentTimeMillis()));
            if (map != null && !map.isEmpty()) {
                put("content_info", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator.4.1
                    {
                        putAll(AnonymousClass4.this.val$floatContentInfo);
                    }
                });
            }
        }
    }

    static {
        t2o.a(912261288);
        new HashSet<Integer>() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator.2
            {
                add(2);
            }
        };
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49ab45f0", new Object[]{new Integer(i)})).booleanValue();
        }
        return ((HashSet) f6695a).contains(Integer.valueOf(i));
    }

    public static JSONObject b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1612f542", new Object[]{new Integer(i)});
        }
        return new JSONObject(true, i) { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator.3
            public final /* synthetic */ int val$componentBehaviorType;

            {
                this.val$componentBehaviorType = i;
                put("behavior_type", (Object) BehaviorChainGenerator.d(i));
                put("time_stamp", (Object) String.valueOf(System.currentTimeMillis()));
            }
        };
    }

    public static JSONObject c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2e3b1b3", new Object[]{str, str2, map});
        }
        return new JSONObject(true, str, str2, map) { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator.5
            public final /* synthetic */ Map val$eventInfo;
            public final /* synthetic */ String val$eventType;
            public final /* synthetic */ String val$triggerComponent;

            {
                this.val$triggerComponent = str;
                this.val$eventType = str2;
                this.val$eventInfo = map;
                put("component_name", (Object) str);
                put("event_type", (Object) str2);
                put("time_stamp", (Object) String.valueOf(System.currentTimeMillis()));
                if (map != null && !map.isEmpty()) {
                    put("event_info", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator.5.1
                        {
                            putAll(AnonymousClass5.this.val$eventInfo);
                        }
                    });
                }
            }
        };
    }

    public static String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eac1a900", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "appear";
        }
        if (i != 2) {
            return "unknown";
        }
        return "disappear";
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63e88530", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "hoverShow";
        }
        if (i != 2) {
            return "unknown";
        }
        return "hoverHide";
    }

    public static String f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ccbe81f", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "appear";
        }
        if (i != 2) {
            return "unknown";
        }
        return "disappear";
    }
}
