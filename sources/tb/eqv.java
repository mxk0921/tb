package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eqv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CURRENT_SCENE_EXPOSE_APPEAR_MAX_CAPACITY = 15;
    public static final int MAX_REQUEST_NODE = 20;
    public static final int NODE_INTERIM_MAX_CAPACITY = 200;
    public static final String TAG = "UserActionTrack";
    public static Map<String, Map<String, bp8>> currentSceneExposeNode = new HashMap();
    public static Map<String, String> enterSessionIdsMap = new HashMap();
    public static Map<String, String> newEnterSessionIdsMap = new HashMap();

    static {
        t2o.a(404750470);
    }

    private static void clearExposeAction(String str, Map<String, bp8> map, long j) {
        WeakReference<View> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ece137", new Object[]{str, map, new Long(j)});
        } else if (map != null) {
            if (TextUtils.equals(str, "scrollStart") || TextUtils.equals(str, "leave") || TextUtils.equals(str, "pv")) {
                Iterator<Map.Entry<String, bp8>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    bp8 value = it.next().getValue();
                    if ("pv".equals(str) || "leave".equals(str)) {
                        if (value == null || (weakReference = value.c) == null) {
                            it.remove();
                        } else {
                            View view = weakReference.get();
                            if (view == null) {
                                it.remove();
                            } else if (!view.isAttachedToWindow()) {
                                it.remove();
                            }
                        }
                    }
                    cp8.f(value, str, j);
                }
            }
        }
    }

    public static String getSource(Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22e9e84e", new Object[]{map, strArr});
        }
        if (map != null) {
            if (map.containsKey("BXUtListener")) {
                return BHRTaskConfigBase.TYPE_CONFIG_UT;
            }
            if (map.containsKey("BXInnerCall")) {
                return "inner";
            }
            return NativeDelegate.SETTING_BIZ;
        } else if (isFromUTListener(strArr)) {
            return BHRTaskConfigBase.TYPE_CONFIG_UT;
        } else {
            return NativeDelegate.SETTING_BIZ;
        }
    }

    public static boolean isContainsKeyValue(String[] strArr, int i, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366fe6f4", new Object[]{strArr, new Integer(i), str})).booleanValue();
        }
        if (strArr != null) {
            try {
                if (strArr.length >= i + 1 && (str2 = strArr[i]) != null) {
                    if (TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                q82.f("isContainsKeyValue", null, null, e);
            }
        }
        return false;
    }

    public static boolean isFromUTListener(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd4631f5", new Object[]{strArr})).booleanValue();
        }
        return isContainsKeyValue(strArr, 2, "BXUtListener=true");
    }

    public static void triggerExposeCurrentStatus(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fd16f4", new Object[]{str, str2, str3});
            return;
        }
        Map<String, bp8> map = currentSceneExposeNode.get(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            clearExposeAction(str3, map, currentTimeMillis);
            if (TextUtils.equals("scrollEnd", str3)) {
                xzh.a().post(new a(new HashMap(map), str3, currentTimeMillis, str2));
            }
        }
    }

    public static void tryClearMap(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252c0134", new Object[]{map});
        } else {
            tryClearMap(map, 200);
        }
    }

    public static void tryClearMap(Map map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8054984f", new Object[]{map, new Integer(i)});
        } else if (map != null && map.size() > i) {
            map.clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f18768a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;

        public a(Map map, String str, long j, String str2) {
            this.f18768a = map;
            this.b = str;
            this.c = j;
            this.d = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r27v0, types: [com.alibaba.fastjson.JSONArray] */
        @Override // java.lang.Runnable
        public void run() {
            Exception e;
            WeakReference<View> weakReference;
            View view;
            JSONArray jSONArray;
            JSONArray jSONArray2;
            JSONObject jSONObject;
            long j;
            long j2;
            long j3;
            float f;
            JSONArray jSONArray3;
            a aVar = this;
            int i = 0;
            String str = "triggerExposeFocusDur";
            String str2 = "exposeSeries";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{aVar});
                return;
            }
            long nanoTime = System.nanoTime();
            try {
                Iterator it = aVar.f18768a.values().iterator();
                while (it.hasNext()) {
                    bp8 bp8Var = (bp8) it.next();
                    if (!(bp8Var == null || (weakReference = bp8Var.c) == null || (view = weakReference.get()) == null)) {
                        if (bp8Var.f16524a == null) {
                            bp8Var.f16524a = new JSONObject();
                        }
                        if (bp8Var.f16524a.getJSONArray(str2) == null) {
                            jSONArray = new JSONArray();
                            bp8Var.f16524a.put(str2, (Object) jSONArray);
                        } else {
                            jSONArray = bp8Var.f16524a.getJSONArray(str2);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        if (v82.p()) {
                            Rect rect = new Rect();
                            long width = view.getWidth();
                            long height = view.getHeight();
                            try {
                                j = 0;
                                if (!view.getGlobalVisibleRect(rect) || width <= 0 || height <= 0) {
                                    str2 = str2;
                                    nanoTime = nanoTime;
                                    it = it;
                                    j2 = width;
                                    jSONArray3 = jSONArray;
                                    f = 0.0f;
                                    j3 = 0;
                                } else {
                                    it = it;
                                    long j4 = width * height;
                                    try {
                                        j2 = width;
                                        long width2 = rect.width();
                                        jSONArray3 = jSONArray;
                                        long height2 = rect.height();
                                        str2 = str2;
                                        nanoTime = nanoTime;
                                        f = ((float) (width2 * height2)) / ((float) j4);
                                        j = width2;
                                        j3 = height2;
                                    } catch (Exception e2) {
                                        e = e2;
                                        nanoTime = nanoTime;
                                        str = str;
                                        q82.f(str, null, null, e);
                                        TLog.logd("BehaviX", str, "main thread dur=" + (System.nanoTime() - nanoTime));
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                q82.f(str, null, null, e);
                                TLog.logd("BehaviX", str, "main thread dur=" + (System.nanoTime() - nanoTime));
                            }
                            try {
                                jSONObject2.put("exposeArea", (Object) Float.valueOf(f));
                                aVar = this;
                            } catch (Exception e4) {
                                e = e4;
                                str = str;
                                q82.f(str, null, null, e);
                                TLog.logd("BehaviX", str, "main thread dur=" + (System.nanoTime() - nanoTime));
                            }
                            try {
                                str = str;
                                jSONObject = jSONObject2;
                            } catch (Exception e5) {
                                e = e5;
                                str = str;
                                q82.f(str, null, null, e);
                                TLog.logd("BehaviX", str, "main thread dur=" + (System.nanoTime() - nanoTime));
                            }
                            try {
                                cp8.g(bp8Var, aVar.b, aVar.c, j3, j, height, j2, gwv.q());
                                i = 0;
                                jSONArray2 = jSONArray3;
                            } catch (Exception e6) {
                                e = e6;
                                q82.f(str, null, null, e);
                                TLog.logd("BehaviX", str, "main thread dur=" + (System.nanoTime() - nanoTime));
                            }
                        } else {
                            str = str;
                            str2 = str2;
                            nanoTime = nanoTime;
                            it = it;
                            jSONArray2 = jSONArray;
                            jSONObject = jSONObject2;
                            aVar = aVar;
                            jSONObject.put("exposeArea", (Object) Integer.valueOf(i));
                            jSONObject.put("exposePositionX", (Object) Integer.valueOf(i));
                            jSONObject.put("exposePositionY", (Object) Integer.valueOf(i));
                        }
                        jSONObject.put("triggerTime", (Object) Long.valueOf(aVar.c));
                        jSONObject.put("triggerSeqId", (Object) aVar.d);
                        jSONObject.put("triggerAction", (Object) aVar.b);
                        jSONArray2.add(jSONObject);
                    }
                    str = str;
                    str2 = str2;
                    nanoTime = nanoTime;
                    it = it;
                    aVar = aVar;
                }
                nanoTime = nanoTime;
            } catch (Exception e7) {
                e = e7;
            }
            TLog.logd("BehaviX", str, "main thread dur=" + (System.nanoTime() - nanoTime));
        }
    }
}
