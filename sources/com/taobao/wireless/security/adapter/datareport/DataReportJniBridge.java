package com.taobao.wireless.security.adapter.datareport;

import android.content.Context;
import android.util.Log;
import com.taobao.wireless.security.adapter.common.C0806;
import com.taobao.wireless.security.adapter.common.C0807;
import com.taobao.wireless.security.adapter.common.C0808;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes.dex */
public class DataReportJniBridge {

    /* renamed from: а  reason: contains not printable characters */
    private static final boolean f604 = false;

    /* renamed from: б  reason: contains not printable characters */
    private static final String f605 = "DataReportJniBridge";

    /* renamed from: в  reason: contains not printable characters */
    private static volatile int f606;

    /* renamed from: г  reason: contains not printable characters */
    private static volatile int f607;

    /* renamed from: д  reason: contains not printable characters */
    private static Class f608;

    /* renamed from: е  reason: contains not printable characters */
    private static Method f609;

    /* renamed from: ж  reason: contains not printable characters */
    private static volatile int f610;

    /* renamed from: з  reason: contains not printable characters */
    private static volatile int f611;

    /* renamed from: и  reason: contains not printable characters */
    private static volatile int f612;

    /* renamed from: й  reason: contains not printable characters */
    private static Class f613;

    /* renamed from: к  reason: contains not printable characters */
    private static Class f614;

    /* renamed from: л  reason: contains not printable characters */
    private static Method f615;

    /* renamed from: м  reason: contains not printable characters */
    private static Method f616;

    /* renamed from: н  reason: contains not printable characters */
    private static Context f617;

    /* renamed from: ё  reason: contains not printable characters */
    private static volatile int f618;

    public static int accsAvaiableBridge() {
        if (f607 == 0) {
            synchronized (DataReportJniBridge.class) {
                if (f607 == 0) {
                    try {
                        f608 = Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.AccsAdapter");
                        Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.AccsListner");
                        f609 = f608.getMethod("registerListner", Context.class);
                        f606 = 1;
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    }
                    f607 = 1;
                }
            }
        }
        return f606;
    }

    public static void initialize(Context context) {
        f617 = context;
    }

    public static int orangeAvailableBridge() {
        if (f611 == 0) {
            synchronized (DataReportJniBridge.class) {
                if (f611 == 0) {
                    try {
                        f613 = Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeAdapter");
                        Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeListener");
                        f615 = f613.getMethod("registerListener", Context.class);
                        f618 = 1;
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    }
                    f611 = 1;
                }
            }
        }
        return f618;
    }

    public static int registerAccsListnerBridge() {
        try {
            if (!(accsAvaiableBridge() == 0 || f617 == null)) {
                f609.invoke(f608, f617);
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int registerOrangeListenerBridge() {
        try {
            if (!(orangeAvailableBridge() == 0 || f617 == null)) {
                f615.invoke(f613, f617);
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int registerWindVaneListenerBridge() {
        Exception e;
        int i = 1;
        try {
            if (!(windVaneCallBackAvailableBridge() == 0 || f617 == null)) {
                f616.invoke(f614, f617);
                try {
                    Log.e(f605, "registerWindVaneListenerBridge invoke success !!!");
                    return 1;
                } catch (Exception e2) {
                    e = e2;
                    Log.e(f605, e.toString());
                    return i;
                }
            }
            return 0;
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
    }

    public static String sendReportBridge(String str, String str2, Map<String, String> map, byte[] bArr) {
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        if (C0806.m349(str2)) {
            hashMap.put("keyindex", str2);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        C0807 r6 = C0808.m354(str, hashMap, bArr, null, IMediaPlayer.MEDIA_INFO_VIDEO_FOV_CHANGE, IMediaPlayer.MEDIA_INFO_VIDEO_FOV_CHANGE);
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(r6.f543));
        sb.append("|");
        int i = r6.f543;
        if (i == 200) {
            str4 = r6.f542;
        } else {
            if (i == 1002 && (str3 = r6.f544) != null && str3.length() > 0) {
                str4 = r6.f544;
            }
            return sb.toString();
        }
        sb.append(str4);
        return sb.toString();
    }

    public static String sendReportBridge(String str, String str2, byte[] bArr) {
        return sendReportBridge(str, str2, null, bArr);
    }

    public static String sendReportBridgeHttps(String str, String str2, byte[] bArr) {
        HashMap hashMap;
        String str3;
        String str4;
        if (C0806.m349(str2)) {
            hashMap = new HashMap();
            hashMap.put("keyindex", str2);
        } else {
            hashMap = null;
        }
        C0807 r7 = C0808.m354(str, hashMap, bArr, null, IMediaPlayer.MEDIA_INFO_VIDEO_FOV_CHANGE, IMediaPlayer.MEDIA_INFO_VIDEO_FOV_CHANGE);
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(r7.f543));
        sb.append("|");
        int i = r7.f543;
        if (i == 200) {
            str4 = r7.f542;
        } else {
            if (i == 1002 && (str3 = r7.f544) != null && str3.length() > 0) {
                str4 = r7.f544;
            }
            return sb.toString();
        }
        sb.append(str4);
        return sb.toString();
    }

    public static int windVaneCallBackAvailableBridge() {
        if (f612 == 0) {
            synchronized (DataReportJniBridge.class) {
                if (f612 == 0) {
                    try {
                        f614 = Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.WindvaneAdapter");
                        Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.WindvaneListener");
                        f616 = f614.getMethod("registerWindVaneListener", Context.class);
                        f610 = 1;
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    }
                    f612 = 1;
                }
            }
        }
        return f610;
    }
}
