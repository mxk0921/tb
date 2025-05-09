package com.taobao.android.tschedule.task;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.taskcontext.TaskContext;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bns;
import tb.cls;
import tb.dms;
import tb.els;
import tb.fls;
import tb.gls;
import tb.nms;
import tb.t2o;
import tb.wp8;
import tb.zdh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ScheduleTask<T extends TaskContext> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.ScheduleTask";
    public JSONObject originConfig;
    public ScheduleProtocolCallback taskCallback;
    public T taskContext;
    public String taskKey;
    public int runTimes = 0;
    private Set<String> strKey = new HashSet();
    private Set<String> encodeKey = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum THREAD_TYPE {
        MAIN("main"),
        BACKGROUND("background"),
        CURRENT("current");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;

        THREAD_TYPE(String str) {
            this.name = str;
        }

        public static THREAD_TYPE getType(String str) {
            THREAD_TYPE[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (THREAD_TYPE) ipChange.ipc$dispatch("ae5c234a", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return BACKGROUND;
            }
            for (THREAD_TYPE thread_type : values()) {
                if (TextUtils.equals(str, thread_type.name)) {
                    return thread_type;
                }
            }
            return BACKGROUND;
        }

        public static /* synthetic */ Object ipc$super(THREAD_TYPE thread_type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/task/ScheduleTask$THREAD_TYPE");
        }

        public static THREAD_TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (THREAD_TYPE) ipChange.ipc$dispatch("37cd36d2", new Object[]{str});
            }
            return (THREAD_TYPE) Enum.valueOf(THREAD_TYPE.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9716a;
        public final /* synthetic */ Object[] b;

        public a(String str, Object[] objArr) {
            this.f9716a = str;
            this.b = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                zdh.a(ScheduleTask.TAG, "start task, type=" + ScheduleTask.this.taskContext.type + ScheduleTask.this.taskContext.version);
                long uptimeMillis = SystemClock.uptimeMillis();
                ScheduleTask.this.realExecute(this.f9716a, this.b);
                zdh.a(ScheduleTask.TAG, "end task, type=" + ScheduleTask.this.taskContext.type + ScheduleTask.this.taskContext.version + this.f9716a + ", executeTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th) {
                zdh.b(ScheduleTask.TAG, "execute ScheduleTask error, type=" + ScheduleTask.this.taskContext.type, th);
                T t = ScheduleTask.this.taskContext;
                dms.a("downgrade", t.bizCode, t.version, "TSchedule", t.type, null, "EXCEPTION", th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$tschedule$task$ScheduleTask$THREAD_TYPE;

        static {
            int[] iArr = new int[THREAD_TYPE.values().length];
            $SwitchMap$com$taobao$android$tschedule$task$ScheduleTask$THREAD_TYPE = iArr;
            try {
                iArr[THREAD_TYPE.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$tschedule$task$ScheduleTask$THREAD_TYPE[THREAD_TYPE.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$tschedule$task$ScheduleTask$THREAD_TYPE[THREAD_TYPE.CURRENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(329252988);
    }

    public ScheduleTask(String str, T t) {
        this.taskKey = str;
        this.taskContext = t;
    }

    private void parseArrayExpr(String str, JSONArray jSONArray) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68602ff4", new Object[]{this, str, jSONArray});
            return;
        }
        if (jSONArray == null) {
            i = 0;
        } else {
            i = jSONArray.size();
        }
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = jSONArray.get(i2);
                if (obj != null) {
                    if (obj instanceof JSONObject) {
                        parseExpr((JSONObject) obj);
                    } else if (obj instanceof JSONArray) {
                        parseArrayExpr(str + i2, (JSONArray) obj);
                    } else {
                        jSONArray.set(i2, parserSingleExpr(str + i2, obj));
                    }
                }
            }
        }
    }

    private void parseExpr(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96555901", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            i = jSONObject.size();
        }
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(value == null || key == null)) {
                    if (value instanceof JSONObject) {
                        parseExpr((JSONObject) value);
                    } else if (value instanceof JSONArray) {
                        parseArrayExpr(key, (JSONArray) value);
                    } else {
                        jSONObject.put(key, parserSingleExpr(key, value));
                    }
                    if (key.startsWith("@")) {
                        arrayList.add(key);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Object remove = jSONObject.remove(str);
                if (!TextUtils.isEmpty(str) && remove != null) {
                    if (str.startsWith(wp8.STR_PREFIX)) {
                        String substring = str.substring(5);
                        this.strKey.add(substring);
                        jSONObject.put(substring, remove);
                    } else if (str.startsWith(wp8.ENCODE_PREFIX)) {
                        String substring2 = str.substring(8);
                        this.encodeKey.add(substring2);
                        jSONObject.put(substring2, remove);
                    }
                }
            }
        }
    }

    private Object parserSingleExpr(String str, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("55230249", new Object[]{this, str, obj});
        }
        String obj3 = obj.toString();
        if (obj3.startsWith("@")) {
            obj2 = wp8.c(obj3);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return obj;
        }
        return obj2;
    }

    private JSONArray prepareArrayParams(wp8 wp8Var, String str, JSONArray jSONArray) {
        int i;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c6f88f2b", new Object[]{this, wp8Var, str, jSONArray});
        }
        if (jSONArray == null) {
            i = 0;
        } else {
            i = jSONArray.size();
        }
        if (i <= 0) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = jSONArray.get(i2);
            if (obj2 != null) {
                if (obj2 instanceof JSONObject) {
                    obj = prepareParams(wp8Var, (JSONObject) obj2);
                } else if (obj2 instanceof JSONArray) {
                    obj = prepareArrayParams(wp8Var, str + i2, (JSONArray) obj2);
                } else {
                    obj = wp8Var.l(obj2);
                }
                if (obj != null) {
                    jSONArray2.add(obj);
                }
            }
        }
        return jSONArray2;
    }

    private JSONObject prepareParams(wp8 wp8Var, JSONObject jSONObject) {
        Object obj;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9614a19a", new Object[]{this, wp8Var, jSONObject});
        }
        if (jSONObject != null) {
            i = jSONObject.size();
        }
        if (i <= 0) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject(i);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!(value == null || key == null)) {
                if (value instanceof JSONObject) {
                    obj = prepareParams(wp8Var, (JSONObject) value);
                } else if (value instanceof JSONArray) {
                    obj = prepareArrayParams(wp8Var, key, (JSONArray) value);
                } else {
                    obj = wp8Var.l(value);
                }
                if (obj != null) {
                    if ((obj instanceof JSONObject) && ((value instanceof gls) || (value instanceof els) || (value instanceof fls) || (value instanceof cls))) {
                        jSONObject2.putAll((JSONObject) obj);
                    } else if (this.strKey.contains(key)) {
                        jSONObject2.put(key, (Object) JSON.toJSONString(obj));
                    } else if (this.encodeKey.contains(key)) {
                        String obj2 = obj.toString();
                        try {
                            jSONObject2.put(key, (Object) Uri.encode(obj2));
                        } catch (Throwable th) {
                            zdh.b(TAG, "encode result error, result=" + obj2, th);
                        }
                    } else {
                        jSONObject2.put(key, obj);
                    }
                }
            }
        }
        return jSONObject2;
    }

    public abstract boolean cancel();

    public abstract boolean isFinished();

    public JSONObject parseKangarooTaskParams(String str, JSONObject jSONObject, List<String> list, Intent intent, List<TimeContent> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82acd000", new Object[]{this, str, jSONObject, list, intent, list2});
        }
        if (!(jSONObject == null || jSONObject.get("url") == null)) {
            wp8 wp8Var = new wp8(new ExprParserParams(str, list, intent, list2), TScheduleInitialize.d());
            Object obj = jSONObject.get("url");
            Object l = wp8Var.l(obj);
            zdh.a(TAG, "parseKangarooTaskParams url = " + l);
            if (l instanceof String) {
                jSONObject.put("url", l);
                JSONObject parseTaskParams = parseTaskParams((String) l, jSONObject, list, intent, list2);
                jSONObject.put("url", obj);
                return parseTaskParams;
            }
        }
        return parseTaskParams(str, jSONObject, list, intent, list2);
    }

    public Map<String, String> parseTaskHeaders(String str, Map<String, String> map, List<String> list, Intent intent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("90f936e9", new Object[]{this, str, map, list, intent});
        }
        wp8 wp8Var = new wp8(new ExprParserParams(str, list, intent), TScheduleInitialize.d());
        if (map != null) {
            i = map.size();
        }
        if (i <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!(value == null || key == null)) {
                Object l = wp8Var.l(parserSingleExpr(key, value));
                if (l instanceof String) {
                    hashMap.put(key, (String) l);
                }
            }
        }
        return hashMap;
    }

    public JSONObject parseTaskParams(String str, JSONObject jSONObject, List<String> list, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e991760f", new Object[]{this, str, jSONObject, list, intent}) : prepareParams(new wp8(new ExprParserParams(str, list, intent), TScheduleInitialize.d()), jSONObject);
    }

    public void prepareTaskParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617bceb7", new Object[]{this, jSONObject});
        } else {
            parseExpr(jSONObject);
        }
    }

    public abstract void realExecute(String str, Object... objArr);

    public abstract boolean validate(String str, Object... objArr);

    public THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this});
        }
        return THREAD_TYPE.BACKGROUND;
    }

    public JSONObject parseTaskParams(String str, JSONObject jSONObject, List<String> list, Intent intent, List<TimeContent> list2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("432a4100", new Object[]{this, str, jSONObject, list, intent, list2}) : prepareParams(new wp8(new ExprParserParams(str, list, intent, list2), TScheduleInitialize.d()), jSONObject);
    }

    public final void execute(String str, Object... objArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e992d2b", new Object[]{this, str, objArr});
        } else if (!validate(str, new Object[0])) {
            StringBuilder sb = new StringBuilder("task valid failed, type=");
            T t = this.taskContext;
            if (t == null) {
                str2 = "null";
            } else {
                str2 = t.type;
            }
            sb.append(str2);
            zdh.a(TAG, sb.toString());
        } else {
            int i = this.taskContext.runTimes;
            if (i < 0 || this.runTimes < i) {
                this.runTimes++;
                a aVar = new a(str, objArr);
                int i2 = b.$SwitchMap$com$taobao$android$tschedule$task$ScheduleTask$THREAD_TYPE[workThread().ordinal()];
                if (i2 == 1) {
                    zdh.a(TAG, "post to mainThread, type=" + this.taskContext.type);
                    bns.a().f(aVar);
                } else if (i2 == 2) {
                    zdh.a(TAG, "post to asyncThread, type=" + this.taskContext.type);
                    bns.a().d(aVar);
                } else if (i2 == 3) {
                    zdh.a(TAG, "run in currentThread, type=" + this.taskContext.type);
                    aVar.run();
                }
            } else {
                zdh.a(TAG, "beyond runTimes limit, limit=" + this.taskContext.runTimes + ", currentTimes=" + this.runTimes);
                nms.g(this.taskKey, this);
            }
        }
    }

    public ScheduleTask(String str, T t, ScheduleProtocolCallback scheduleProtocolCallback) {
        this.taskKey = str;
        this.taskContext = t;
        this.taskCallback = scheduleProtocolCallback;
    }
}
