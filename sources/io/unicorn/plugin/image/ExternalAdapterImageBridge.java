package io.unicorn.plugin.image;

import android.graphics.Bitmap;
import android.text.TextUtils;
import io.unicorn.plugin.image.ExternalAdapterImageProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dwh;
import tb.t2o;
import tb.ts8;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ExternalAdapterImageBridge {
    private static Map<String, b> allTasks = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements ExternalAdapterImageProvider.Response {

        /* renamed from: a  reason: collision with root package name */
        public final String f15199a;
        public final long b;

        static {
            t2o.a(945815782);
            t2o.a(945815788);
        }

        public a(String str, long j) {
            this.f15199a = str;
            this.b = j;
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.Response
        public void finish(ExternalAdapterImageProvider.Image image) {
            ExternalAdapterImageBridge.finish(this.f15199a, this.b, image);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ExternalAdapterImageProvider.Request f15200a;

        static {
            t2o.a(945815783);
        }

        public b(ExternalAdapterImageProvider.Request request, a aVar) {
            this.f15200a = request;
        }
    }

    static {
        t2o.a(945815781);
    }

    public static void DispatchAsyncThread(long j) {
        ExternalAdapterImageProvider a2 = ts8.c().a();
        if (a2 != null) {
            a2.dispatchAsyncThread(j);
        }
    }

    private static native void asyncRequest(long j);

    public static void cancel(String str) {
        ExternalAdapterImageProvider.Request request;
        b remove = allTasks.remove(str);
        if (remove != null && (request = remove.f15200a) != null) {
            request.cancel();
        }
    }

    public static void dispatchAsyncRequest(long j) {
        asyncRequest(j);
    }

    public static void finish(String str, long j, ExternalAdapterImageProvider.Image image) {
        boolean z;
        Bitmap[] bitmapArr;
        int i;
        int i2;
        double d;
        boolean z2;
        boolean z3;
        int i3;
        Bitmap bitmap;
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
        if (image != null) {
            z3 = image.isAnimatedEnd();
        } else {
            z3 = false;
        }
        if (image != null) {
            i3 = image.getCacheType();
        } else {
            i3 = 0;
        }
        notifyExternalImageFinish(str, j, image, bitmapArr, i, i2, d, z2, z3, z, i3);
        allTasks.remove(str);
    }

    private static native void notifyExternalImageFinish(String str, long j, ExternalAdapterImageProvider.Image image, Bitmap[] bitmapArr, int i, int i2, double d, boolean z, boolean z2, boolean z3, int i3);

    public static boolean request(String str, String str2, int i, int i2, String str3, String str4) {
        try {
            ExternalAdapterImageProvider a2 = ts8.c().a();
            if (a2 == null) {
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
                dwh.i(e);
            }
            String str5 = (String) hashMap2.get("instance_id");
            if (TextUtils.isEmpty(str5)) {
                str5 = "0";
            }
            a aVar = new a(str, Long.parseLong(str5));
            hashMap2.put("id", str);
            allTasks.put(str, new b(a2.request(str2, i, i2, hashMap, hashMap2, aVar), aVar));
            return true;
        } catch (Throwable th) {
            dwh.i(th);
            return false;
        }
    }
}
