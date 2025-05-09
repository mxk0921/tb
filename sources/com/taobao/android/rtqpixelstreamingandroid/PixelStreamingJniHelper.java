package com.taobao.android.rtqpixelstreamingandroid;

import android.os.Build;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PixelStreamingJniHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final HashMap<String, ArrayList<a>> cachedEventMap = new HashMap<>();
    public static HashMap<String, RTQPixelStreamingEmbededView> embededViews = new HashMap<>();
    public static HashMap<String, Boolean> sessionDestroyedMap = new HashMap<>();
    public static float videoWidth = 720.0f;
    public static float videoHeight = 1560.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9313a;
        public final String b;

        static {
            t2o.a(316669956);
        }

        public a(String str, String str2) {
            this.f9313a = str;
            this.b = str2;
        }
    }

    static {
        t2o.a(316669955);
    }

    public static void dispatchSessionCachedEvent(String str) {
        RTQPixelStreamingEmbededView sessionView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0a2dcd", new Object[]{str});
            return;
        }
        HashMap<String, ArrayList<a>> hashMap = cachedEventMap;
        ArrayList<a> arrayList = hashMap.get(str);
        hashMap.remove(str);
        if (!(arrayList == null || arrayList.size() <= 0 || (sessionView = getSessionView(str)) == null)) {
            for (int i = 0; i < arrayList.size(); i++) {
                a aVar = arrayList.get(i);
                WVStandardEventCenter.postNotificationToJS(sessionView.webView, aVar.f9313a, aVar.b);
            }
        }
    }

    public static String getBuildVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f1fc5f9", new Object[0]);
        }
        return Build.VERSION.RELEASE;
    }

    private static RTQPixelStreamingEmbededView getSessionView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RTQPixelStreamingEmbededView) ipChange.ipc$dispatch("351eecc5", new Object[]{str});
        }
        return embededViews.get(str);
    }

    public static String getXQuicLibFullPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18042ce0", new Object[0]);
        }
        return RTQPixelStreaming.xquicLibraryPath;
    }

    public static boolean hasValidTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6efd4d2", new Object[0])).booleanValue();
        }
        return !embededViews.isEmpty();
    }

    public static int isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])) ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean isSessionDestroyed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75593442", new Object[]{str})).booleanValue();
        }
        return sessionDestroyedMap.containsKey(str);
    }

    public static void onSessionDestroyed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93080533", new Object[]{str});
            return;
        }
        sessionDestroyedMap.put(str, Boolean.TRUE);
        embededViews.remove(str);
        cachedEventMap.remove(str);
    }

    public static void onSessionStarted(String str, RTQPixelStreamingEmbededView rTQPixelStreamingEmbededView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("227bd780", new Object[]{str, rTQPixelStreamingEmbededView});
        } else if (rTQPixelStreamingEmbededView != null) {
            embededViews.put(str, rTQPixelStreamingEmbededView);
            dispatchSessionCachedEvent(str);
        } else {
            embededViews.remove(str);
        }
    }

    public static void postJSEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0393e16", new Object[]{str, str2, str3});
            return;
        }
        RTQPixelStreamingEmbededView sessionView = getSessionView(str);
        if (sessionView == null) {
            putEventToCache(str, str2, str3);
            return;
        }
        if (str2.equals("RTQ_requestVideoFrameCallback")) {
            sessionView.onVideoFrameCallback();
        }
        WVStandardEventCenter.postNotificationToJS(sessionView.webView, str2, str3);
    }

    private static void putEventToCache(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee03aa1", new Object[]{str, str2, str3});
        } else if (!isSessionDestroyed(str)) {
            HashMap<String, ArrayList<a>> hashMap = cachedEventMap;
            if (hashMap.containsKey(str)) {
                hashMap.get(str).add(new a(str2, str3));
                return;
            }
            ArrayList<a> arrayList = new ArrayList<>();
            arrayList.add(new a(str2, str3));
            hashMap.put(str, arrayList);
        }
    }

    public static void udpateVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6d09d2", new Object[]{new Integer(i), new Integer(i2)});
        } else if (i > 0 && i2 > 0) {
            videoWidth = i;
            videoHeight = i2;
        }
    }

    public static void postJSDataChannelMessageEvent(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2ae55b", new Object[]{str, bArr});
            return;
        }
        try {
            RTQPixelStreamingEmbededView rTQPixelStreamingEmbededView = embededViews.get(str);
            String encodeToString = Base64.encodeToString(bArr, 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtq_session_id", str);
            jSONObject.put("message", encodeToString);
            String jSONObject2 = jSONObject.toString();
            if (rTQPixelStreamingEmbededView == null) {
                putEventToCache(str, "RTQ_OnDataChannelMessage", jSONObject2);
            } else {
                WVStandardEventCenter.postNotificationToJS(rTQPixelStreamingEmbededView.webView, "RTQ_OnDataChannelMessage", jSONObject2);
            }
        } catch (Exception unused) {
        }
    }
}
