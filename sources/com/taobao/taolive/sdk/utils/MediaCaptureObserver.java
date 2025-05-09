package com.taobao.taolive.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.h4s;
import tb.o3s;
import tb.t2o;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MediaCaptureObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CAPTURE_THRESHOLD_TIME = 10000;
    public static final String[] j = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "screenrecorder", "screen record"};
    public static final String[] k = {"_data", "date_modified", "duration"};

    /* renamed from: a  reason: collision with root package name */
    public final Context f13317a;
    public ContentObserver b;
    public ContentObserver c;
    public ContentObserver d;
    public ContentObserver e;
    public ContentResolver f;
    public b g;
    public final Map<String, CapatureData> h = new HashMap();
    public final Handler i = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class CapatureData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String endNTP;
        public String endPTS;
        public String startNTP;
        public String startPTS;
        public String type;

        static {
            t2o.a(806356482);
        }

        public CapatureData() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CapatureData{type='" + this.type + "', startNTP='" + this.startNTP + "', endNTP='" + this.endNTP + "'}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f13318a;

        public a(List list) {
            this.f13318a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MediaCaptureObserver.a(MediaCaptureObserver.this).a(this.f13318a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(List<CapatureData> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13319a;

        static {
            t2o.a(806356484);
        }

        public c(Uri uri, Handler handler) {
            super(handler);
            this.f13319a = uri;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1222901218) {
                super.onChange(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/utils/MediaCaptureObserver$MediaContentObserver");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                return;
            }
            super.onChange(z);
            h4s.c("MediaCaptureObserver", "onChange");
            MediaCaptureObserver.b(MediaCaptureObserver.this, this.f13319a);
            h4s.e();
        }
    }

    public MediaCaptureObserver(Context context, String str) {
        this.f13317a = context;
    }

    public static /* synthetic */ b a(MediaCaptureObserver mediaCaptureObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2a010084", new Object[]{mediaCaptureObserver});
        }
        return mediaCaptureObserver.g;
    }

    public static /* synthetic */ void b(MediaCaptureObserver mediaCaptureObserver, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb98c11d", new Object[]{mediaCaptureObserver, uri});
        } else {
            mediaCaptureObserver.g(uri);
        }
    }

    public final Bundle c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("a87e889d", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putInt("android:query-arg-limit", 1);
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_modified"});
        bundle.putInt("android:query-arg-sort-direction", 1);
        return bundle;
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        if (v2s.o().C() == null) {
            return 0L;
        }
        return v2s.o().C().getServerTime();
    }

    public final void e(String str, CapatureData capatureData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd86816", new Object[]{this, str, capatureData});
        } else if (!((HashMap) this.h).containsKey(str)) {
            ((HashMap) this.h).put(str, capatureData);
            if (this.g != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((HashMap) this.h).entrySet()) {
                    arrayList.add(entry.getValue());
                }
                this.i.post(new a(arrayList));
            }
        }
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15f6269b", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : j) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc2eab9", new Object[]{this});
            return;
        }
        o3s.b("MediaCaptureObserver", "注销截屏/录屏监听");
        this.f.unregisterContentObserver(this.b);
        this.f.unregisterContentObserver(this.c);
        this.f.unregisterContentObserver(this.d);
        this.f.unregisterContentObserver(this.e);
        this.f = null;
    }

    public void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413a7d79", new Object[]{this, bVar});
            return;
        }
        o3s.b("MediaCaptureObserver", "注册截屏/录屏监听");
        this.g = bVar;
        this.f = this.f13317a.getContentResolver();
        Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        this.b = new c(uri, null);
        Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        this.c = new c(uri2, null);
        this.f.registerContentObserver(uri, true, this.b);
        this.f.registerContentObserver(uri2, true, this.c);
        Uri uri3 = MediaStore.Video.Media.INTERNAL_CONTENT_URI;
        this.d = new c(uri3, null);
        Uri uri4 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        this.e = new c(uri4, null);
        this.f.registerContentObserver(uri3, true, this.d);
        this.f.registerContentObserver(uri4, true, this.e);
    }

    static {
        t2o.a(806356480);
    }

    public final void g(Uri uri) {
        Throwable th;
        String str;
        String str2;
        Exception e;
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9e8b9a", new Object[]{this, uri});
            return;
        }
        Cursor cursor2 = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    cursor2 = this.f.query(uri, k, c(), null);
                } else {
                    cursor2 = this.f.query(uri, k, null, null, "date_modified desc limit 1");
                }
                if (cursor2 != null) {
                    try {
                        if (cursor2.moveToFirst()) {
                            int columnIndex = cursor2.getColumnIndex("_data");
                            int columnIndex2 = cursor2.getColumnIndex("date_modified");
                            int columnIndex3 = cursor2.getColumnIndex("duration");
                            String string = cursor2.getString(columnIndex);
                            long j2 = cursor2.getLong(columnIndex2) * 1000;
                            long j3 = cursor2.getLong(columnIndex3);
                            if (f(string)) {
                                long d = d();
                                long currentTimeMillis = System.currentTimeMillis();
                                long j4 = currentTimeMillis - j2;
                                str = "查询媒体库发生错误：";
                                long j5 = d - j3;
                                cursor = cursor2;
                                try {
                                    try {
                                        str2 = "MediaCaptureObserver";
                                    } catch (Exception e2) {
                                        e = e2;
                                        str2 = "MediaCaptureObserver";
                                    }
                                    try {
                                        o3s.b(str2, "捕捉到截屏/录屏：：" + string + ", 本地添加时间：" + j2 + ", 本地当前时间：" + currentTimeMillis + ", duration：" + j3 + ", 录制开始时间：" + j5 + ", 录制结束时间：" + d + ", 本地时间差：" + j4);
                                        if (j4 < 10000) {
                                            if (j3 > 0) {
                                                CapatureData capatureData = new CapatureData();
                                                capatureData.type = "screenRecord";
                                                capatureData.endNTP = String.valueOf(d);
                                                capatureData.startNTP = String.valueOf(j5);
                                                e(string, capatureData);
                                            } else {
                                                CapatureData capatureData2 = new CapatureData();
                                                capatureData2.type = "screenShot";
                                                capatureData2.endNTP = String.valueOf(d);
                                                capatureData2.startNTP = String.valueOf(d);
                                                e(string, capatureData2);
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        cursor2 = cursor;
                                        o3s.a(str2, str + e);
                                        if (cursor2 != null && !cursor2.isClosed()) {
                                            cursor2.close();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor;
                                    if (cursor2 != null && !cursor2.isClosed()) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } else {
                                cursor = cursor2;
                            }
                            if (!cursor.isClosed()) {
                                cursor.close();
                            }
                        } else if (!cursor2.isClosed()) {
                            cursor2.close();
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str2 = "MediaCaptureObserver";
                        str = "查询媒体库发生错误：";
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else if (cursor2 != null && !cursor2.isClosed()) {
                    cursor2.close();
                }
            } catch (Exception e5) {
                e = e5;
                str2 = "MediaCaptureObserver";
                str = "查询媒体库发生错误：";
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
