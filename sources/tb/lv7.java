package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714706);
    }

    public static int a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4f77351", new Object[]{new Long(j)})).intValue();
        }
        if (j == -1) {
            return -1;
        }
        return b(j);
    }

    public static int b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c31d9269", new Object[]{new Long(j)})).intValue();
        }
        if (j > 5242880) {
            return 5242880;
        }
        return (int) j;
    }

    public static HashMap<String, String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4f4b6861", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("from", str);
        hashMap.put(a7m.VIDEO_PLAY_SCENES, sj4.PLAY_SCENES);
        return hashMap;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23590a;
        public final /* synthetic */ h9e b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String[] d;

        public a(String str, h9e h9eVar, JSONObject jSONObject, String[] strArr) {
            this.f23590a = str;
            this.b = h9eVar;
            this.c = jSONObject;
            this.d = strArr;
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            zpm.g().n(this.f23590a, i);
            VideoControllerManager.w(this.c, i, false);
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onProgress(i);
            }
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            ir9.b("DownloadVideoUtils", "download onstart :" + this.f23590a + ":" + str);
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onStart(str);
            }
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            zpm.g().n(this.f23590a, i);
            VideoControllerManager.w(this.c, i, true);
            try {
                str = Uri.parse(this.d[0]).getQueryParameter(a7m.VIDEO_CACHE_ID);
            } catch (Exception e) {
                ir9.c("DownloadVideoUtils", "down load get cache key error", e);
                str = "";
            }
            r6m.b(this.f23590a, str, i, "download");
            ir9.b("DownloadVideoUtils", "download onFinish :" + this.f23590a + ":" + i);
            h9e h9eVar = this.b;
            if (h9eVar != null) {
                h9eVar.onFinish(i);
            }
        }
    }

    @Deprecated
    public static void c(Context context, String str, long j, String str2, wbd wbdVar) {
        Exception e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205fc510", new Object[]{context, str, new Long(j), str2, wbdVar});
            return;
        }
        int a2 = a(j);
        JSONObject jSONObject2 = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception e2) {
                e = e2;
            }
            try {
                jSONObject2 = VideoControllerManager.e(jSONObject, true);
                ir9.b("DownloadVideoUtils", "preDownloadCurrent start 码率决策");
            } catch (Exception e3) {
                e = e3;
                jSONObject2 = jSONObject;
                ir9.c("DownloadVideoUtils", "", e);
                if (jSONObject2 == null) {
                }
                String k = qmm.k(context, jSONObject2, a2, wbdVar, e(str));
                ir9.b("DownloadVideoUtils", "preDownloadCurrent start downloadSize=" + a2 + "url=" + k);
            }
        }
        if (jSONObject2 == null || a2 >= 0) {
            String k2 = qmm.k(context, jSONObject2, a2, wbdVar, e(str));
            ir9.b("DownloadVideoUtils", "preDownloadCurrent start downloadSize=" + a2 + "url=" + k2);
        }
    }

    public static String d(Context context, String str, JSONObject jSONObject, int i, HashMap<String, String> hashMap, h9e h9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad9c7db8", new Object[]{context, str, jSONObject, new Integer(i), hashMap, h9eVar});
        }
        if (jSONObject == null || i < 0) {
            ir9.b("DownloadVideoUtils", "preload videoResourceJson invalid :" + str);
            if (h9eVar != null) {
                h9eVar.onError("videoResourceJson invalid :" + str);
            }
            return null;
        }
        String[] strArr = {null};
        String k = qmm.k(context, jSONObject, i, new a(str, h9eVar, jSONObject, strArr), hashMap);
        strArr[0] = k;
        return k;
    }
}
