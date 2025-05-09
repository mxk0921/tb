package com.taobao.fscrmid.nav;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ShotVideoNavProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f10581a = false;
    public static long b = -1;
    public static long c = -1;

    static {
        t2o.a(468714782);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        b = -1L;
        c = -1L;
        f10581a = false;
    }

    public static void setNavStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2f0375", new Object[0]);
        } else if (!f10581a) {
            b = SystemClock.elapsedRealtime();
            c = System.currentTimeMillis();
            f10581a = true;
        }
    }

    public static void a(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5140e9e", new Object[]{intent, zmjVar});
        } else if (!f10581a && (data = intent.getData()) != null) {
            String host = data.getHost();
            String path = data.getPath();
            if (("market.m.taobao.com".equals(host) || "market.wapa.taobao.com".equals(host)) && "/app/tb-source-app/video-fullpage/pages/index2".equals(path)) {
                b = SystemClock.elapsedRealtime();
                c = System.currentTimeMillis();
                f10581a = true;
                intent.setData(data);
            }
        }
    }
}
