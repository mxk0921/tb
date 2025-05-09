package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262792);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a63cff37", new Object[0])).booleanValue();
        }
        return Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sEnableImageBlur));
    }

    public static int c(Context context, DinamicXEngine dinamicXEngine, wua wuaVar) {
        c1n C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a499333e", new Object[]{context, dinamicXEngine, wuaVar})).intValue();
        }
        if (a()) {
            return 250;
        }
        if (wuaVar == null || (C = wuaVar.C()) == null) {
            return 0;
        }
        float a2 = C.a();
        try {
            return pb6.d(dinamicXEngine, context, a2);
        } catch (Exception e) {
            tgh.c("HeaderBlurUtils", "getBlurHeight with headerComponent error", e);
            return mr7.a(a2);
        }
    }

    public static int e(Context context, float f) {
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ece6a2c1", new Object[]{context, new Float(f)})).intValue();
        }
        if ((context instanceof Activity) && (width = ((Activity) context).findViewById(R.id.rv_main_screen_container).getWidth()) > 0) {
            return (int) (width * f);
        }
        return 0;
    }

    public static JSONObject f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5f818dc2", new Object[]{jSONObject});
        }
        try {
            JSONObject h = DynamicMergeUtils.h(jSONObject.getJSONObject("data"));
            if (h == null || (jSONObject2 = h.getJSONObject("model")) == null) {
                return null;
            }
            return jSONObject2.getJSONObject("headerPic");
        } catch (Throwable th) {
            tgh.c("HeaderBlurUtils", "getHeaderPic error", th);
            return null;
        }
    }

    public static boolean g(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b42f2b4", new Object[]{context, jSONObject})).booleanValue();
        }
        if (b(context, null, jSONObject) > 0) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context, wua wuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e2b53d", new Object[]{context, wuaVar})).booleanValue();
        }
        if (c(context, null, wuaVar) > 0) {
            return true;
        }
        return false;
    }

    public static int b(Context context, DinamicXEngine dinamicXEngine, JSONObject jSONObject) {
        JSONObject jSONObject2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9450dfb5", new Object[]{context, dinamicXEngine, jSONObject})).intValue();
        }
        if (a()) {
            return 250;
        }
        JSONObject f = f(jSONObject);
        if (f == null || (jSONObject2 = f.getJSONObject(wua.KEY_PROPERTIES)) == null) {
            return 0;
        }
        try {
            i = Integer.parseInt(jSONObject2.getString(c1n.KEY_STRETCH_HEIGHT));
        } catch (Throwable th) {
            tgh.c("HeaderBlurUtils", "getBlurHeight with rootData error", th);
        }
        float f2 = i;
        try {
            return pb6.d(dinamicXEngine, context, f2);
        } catch (Throwable th2) {
            tgh.c("HeaderBlurUtils", "getBlurHeight with rootData error", th2);
            return mr7.a(f2);
        }
    }

    public static List<SimpleEntry<String, Integer>> d(JSONObject jSONObject, boolean z) {
        List<SimpleEntry<String, Integer>> list;
        Throwable th;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4dbd4b3a", new Object[]{jSONObject, new Boolean(z)});
        }
        try {
            JSONObject f2 = f(jSONObject);
            if (f2 == null) {
                return null;
            }
            JSONArray jSONArray = f2.getJSONArray("groups");
            if (jSONArray != null) {
                try {
                    if (!jSONArray.isEmpty()) {
                        boolean z2 = mtm.d(jSONObject.getJSONObject("data")) || Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sHeaderFlingMode));
                        int f3 = mr7.f(o91.a());
                        if (z) {
                            f = cva.b();
                        } else {
                            f = cva.c();
                        }
                        ArrayList arrayList = new ArrayList(2);
                        int size = jSONArray.size();
                        int i = 0;
                        int i2 = 1;
                        for (int i3 = 0; i3 < size; i3++) {
                            JSONArray jSONArray2 = jSONArray.getJSONObject(i3).getJSONArray("items");
                            i += jSONArray2.size();
                            int size2 = jSONArray2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
                                String string = jSONObject2.getString("dimension");
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("content").getJSONObject("fields");
                                String string2 = jSONObject3.getString("type");
                                if (i3 == 0 && i4 == 0) {
                                    i2 = mtm.b(z2, string);
                                }
                                float a2 = cva.a(mr7.h(string), f, 1.0f) * f3;
                                if ("image".equals(string2)) {
                                    arrayList.add(new SimpleEntry(jov.e(jSONObject3.getString("url"), true), Integer.valueOf((int) a2)));
                                } else if ("video".equals(string2)) {
                                    arrayList.add(new SimpleEntry(jov.e(jSONObject3.getString("thumbnailUrl"), true), Integer.valueOf((int) a2)));
                                }
                                if (arrayList.size() >= i2) {
                                    if (i == 1 && arrayList.size() == 1) {
                                        ((SimpleEntry) arrayList.get(0)).setValue(Integer.valueOf(f3));
                                    }
                                    return arrayList;
                                }
                            }
                        }
                        if (i == 1 && arrayList.size() == 1) {
                            ((SimpleEntry) arrayList.get(0)).setValue(Integer.valueOf(f3));
                        }
                        return arrayList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    list = null;
                    tgh.c("HeaderBlurUtils", "getMainPicInfo error", th);
                    return list;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            list = null;
        }
    }
}
