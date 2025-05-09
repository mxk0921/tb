package tb;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.Globals;
import com.taobao.tao.util.StringUtil;
import com.ut.device.UTDevice;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class di2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f17834a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                di2.a(di2.b());
            }
        }
    }

    static {
        t2o.a(736100473);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        f17834a = str;
        return str;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return o();
    }

    public static int d(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue();
        }
        if (context == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e83a6fb", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(url.getFile())) {
                return null;
            }
            String name = new File(url.getFile()).getName();
            tm1.a(oh2.TAG, "get file name. url:" + str);
            return name;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7557897c", new Object[]{jSONObject});
        }
        String str = "topview_trace_" + SystemClock.uptimeMillis() + "_" + UTDevice.getUtdid(uy3.a());
        String l = l(jSONObject);
        if (TextUtils.isEmpty(l)) {
            return str;
        }
        return str + "_" + l;
    }

    public static long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b05fddf1", new Object[0])).longValue();
        }
        return System.currentTimeMillis() + (SDKUtils.getTimeOffset() * 1000);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9d1bc16", new Object[0]);
        }
        if (!TextUtils.isEmpty(f17834a)) {
            return f17834a;
        }
        String string = nh2.k().getString("oaid", "");
        if (!TextUtils.isEmpty(string)) {
            f17834a = string;
            return string;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Coordinator.execute(new a());
        } else {
            f17834a = o();
        }
        return f17834a;
    }

    public static String[] i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8e3fe9cd", new Object[]{context});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new String[]{String.valueOf(displayMetrics.widthPixels), String.valueOf(displayMetrics.heightPixels)};
    }

    public static String l(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("522f29d8", new Object[]{jSONObject});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("item");
        if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("0")) == null || (jSONObject3 = jSONObject2.getJSONObject("content")) == null) {
            return null;
        }
        return jSONObject3.getString("itemId");
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("914f6fad", new Object[0]);
        }
        String a2 = k3l.a(Globals.getApplication());
        nh2.k().edit().putString("oaid", a2).apply();
        return a2;
    }

    public static int j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        try {
            return context.getResources().getDimensionPixelOffset(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static LinkedSplashData m(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str2;
        List<BootImageInfo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedSplashData) ipChange.ipc$dispatch("bf3125dd", new Object[]{jSONObject, str});
        }
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("subSection")) != null && !jSONObject2.isEmpty() && (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null && !jSONObject3.isEmpty()) {
            if (StringUtil.isEmpty(str)) {
                str = f(jSONObject3);
            }
            for (String str3 : jSONObject2.keySet()) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject(str3);
                if (jSONObject4 != null) {
                    jSONObject4.put("traceId", (Object) str);
                }
            }
            if (jSONObject2.containsKey(rr6.TYPE_BANNER)) {
                str2 = "TopView";
            } else {
                str2 = nwi.BIZ_CODE;
            }
            BootImageData c = c(jSONObject3, str2);
            if (!(c == null || (list = c.result) == null || list.size() < 1)) {
                return new LinkedSplashData(jSONObject2, str, c);
            }
        }
        return null;
    }

    public static BootImageData c(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        BootImageInfo bootImageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageData) ipChange.ipc$dispatch("948dfb44", new Object[]{jSONObject, str});
        }
        BootImageData bootImageData = null;
        if (jSONObject != null && jSONObject.containsKey("item") && (jSONObject2 = jSONObject.getJSONObject("item")) != null && jSONObject2.containsKey("0")) {
            bootImageData = new BootImageData();
            bootImageData.result = new ArrayList();
            for (int i = 0; i < 10 && jSONObject2.containsKey(String.valueOf(i)); i++) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(String.valueOf(i));
                if (!(jSONObject3 == null || !jSONObject3.containsKey("content") || (bootImageInfo = (BootImageInfo) JSON.parseObject(jSONObject3.getString("content"), BootImageInfo.class)) == null)) {
                    bootImageInfo.sceneType = str;
                    bootImageData.result.add(bootImageInfo);
                }
            }
        }
        return bootImageData;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9220dce", new Object[]{str});
        }
        File filesDir = uy3.a().getFilesDir();
        if (filesDir == null) {
            return null;
        }
        File file = new File(filesDir, File.separator + "bootimageresources");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    tm1.a("BootImageUtil", "delete file:" + file2.getAbsolutePath() + ",isDelete:" + file2.delete());
                }
            }
            tm1.a("BootImageUtil", "delete old file:" + file.delete());
        }
        if (TextUtils.isEmpty(str)) {
            str = nwi.BIZ_CODE;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = File.separator;
        sb.append(str2);
        sb.append("boot_image_resource");
        sb.append(str2);
        sb.append(str);
        File file3 = new File(filesDir, sb.toString());
        if (!file3.exists()) {
            tm1.a("BootImageUtil", "localResourcesRootPath createFile: " + file3.mkdirs());
        }
        String absolutePath = file3.getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath)) {
            tm1.a(oh2.TAG, "get rootPath:" + absolutePath);
        }
        return absolutePath;
    }

    public static List<LinkedSplashData> n(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9cbc0887", new Object[]{jSONArray, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        String string = jSONObject.getString("traceId");
        for (int i = 0; i < jSONArray.size(); i++) {
            try {
                LinkedSplashData m = m(jSONArray.getJSONObject(i), string);
                if (m != null) {
                    arrayList.add(m);
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
