package com.taobao.android.fcanvas.integration.image;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ExternalAdapterImageBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, b> allTasks = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ExternalAdapterImageProvider.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7658a;

        static {
            t2o.a(945815595);
            t2o.a(945815601);
        }

        public a(String str) {
            this.f7658a = str;
        }

        public void a(ExternalAdapterImageProvider.Image image) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5990ad15", new Object[]{this, image});
            } else {
                ExternalAdapterImageBridge.finish(this.f7658a, image);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ExternalAdapterImageProvider.b f7659a;

        static {
            t2o.a(945815596);
        }

        public b(ExternalAdapterImageProvider.b bVar, a aVar) {
            this.f7659a = bVar;
        }
    }

    static {
        t2o.a(945815594);
    }

    public static void cancel(String str) {
        ExternalAdapterImageProvider.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5301f18b", new Object[]{str});
            return;
        }
        b remove = allTasks.remove(str);
        if (remove != null && (bVar = remove.f7659a) != null) {
            bVar.cancel();
        }
    }

    public static void finish(String str, ExternalAdapterImageProvider.Image image) {
        boolean z;
        Bitmap[] bitmapArr;
        int i;
        int i2;
        double d;
        boolean z2;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa88030b", new Object[]{str, image});
            return;
        }
        if (image == null || (bitmap = image.getBitmap()) == null) {
            z = false;
        } else {
            z = bitmap.isPremultiplied();
        }
        if (image != null) {
            bitmapArr = image.getBitmaps();
        } else {
            bitmapArr = null;
        }
        if (image != null) {
            i = image.getBitmapCount();
        } else {
            i = 0;
        }
        if (image != null) {
            i2 = image.getFrameCount();
        } else {
            i2 = 1;
        }
        if (image != null) {
            d = image.getDuration();
        } else {
            d = vu3.b.GEO_NOT_SUPPORT;
        }
        if (image != null) {
            z2 = image.isSingleBitmapAnimated();
        } else {
            z2 = false;
        }
        notifyExternalImageFinish(str, image, bitmapArr, i, i2, d, z2, z);
        allTasks.remove(str);
    }

    private static native void notifyExternalImageFinish(String str, ExternalAdapterImageProvider.Image image, Bitmap[] bitmapArr, int i, int i2, double d, boolean z, boolean z2);

    public static boolean request(String str, String str2, int i, int i2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac568fa2", new Object[]{str, str2, new Integer(i), new Integer(i2), str3, str4})).booleanValue();
        }
        ExternalAdapterImageProvider externalAdapterImageProvider = FCanvasJNIBridge.getExternalAdapterImageProvider();
        if (externalAdapterImageProvider == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str3);
            JSONArray names = jSONObject.names();
            if (names != null) {
                for (int i3 = 0; i3 < names.length(); i3++) {
                    String string = names.getString(i3);
                    hashMap.put(string, jSONObject.getString(string));
                }
            }
            JSONObject jSONObject2 = new JSONObject(str4);
            JSONArray names2 = jSONObject2.names();
            if (names2 != null) {
                for (int i4 = 0; i4 < names2.length(); i4++) {
                    String string2 = names2.getString(i4);
                    hashMap2.put(string2, jSONObject2.getString(string2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        a aVar = new a(str);
        ExternalAdapterImageProvider.b request = externalAdapterImageProvider.request(str2, i, i2, hashMap, hashMap2, aVar);
        if (request != null) {
            allTasks.put(str, new b(request, aVar));
        }
        return true;
    }
}
