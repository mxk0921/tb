package com.taobao.android.searchbaseframe.track;

import android.app.Activity;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSWeexRenderTrackEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERR_DEGRADE = 4;
    public static final int ERR_TEMPLATE = 3;
    public static final int ERR_WEEX_EXCEPTION = 2;
    public static final int SUCC_REFRESH = 1;
    public static final int SUCC_RENDER = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f9347a;
    public String b;
    public String c;
    public TemplateBean d;
    public String e;
    public String f;
    public double g;
    public final boolean h = true;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface EventType {
    }

    static {
        t2o.a(993001948);
    }

    public static XSWeexRenderTrackEvent a(Activity activity, TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("4ba93ee3", new Object[]{activity, templateBean, str, str2});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f9347a = 2;
        xSWeexRenderTrackEvent.d = templateBean;
        xSWeexRenderTrackEvent.e = str;
        xSWeexRenderTrackEvent.f = str2;
        d(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }

    public static XSWeexRenderTrackEvent b(Activity activity, TemplateBean templateBean, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("b42a4b8c", new Object[]{activity, templateBean, new Double(d)});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f9347a = 1;
        xSWeexRenderTrackEvent.d = templateBean;
        xSWeexRenderTrackEvent.g = d;
        d(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }

    public static XSWeexRenderTrackEvent c(Activity activity, TemplateBean templateBean, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("cc51c531", new Object[]{activity, templateBean, new Double(d)});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f9347a = 0;
        xSWeexRenderTrackEvent.d = templateBean;
        xSWeexRenderTrackEvent.g = d;
        d(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }

    public static void d(Activity activity, XSWeexRenderTrackEvent xSWeexRenderTrackEvent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c384a943", new Object[]{activity, xSWeexRenderTrackEvent});
            return;
        }
        try {
            Uri data = activity.getIntent().getData();
            if (data == null) {
                str = "";
            } else {
                str = data.toString();
            }
            xSWeexRenderTrackEvent.c = str;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static XSWeexRenderTrackEvent e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("a96ecb95", new Object[]{str, str2});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f9347a = 4;
        xSWeexRenderTrackEvent.b = str;
        xSWeexRenderTrackEvent.f = str2;
        return xSWeexRenderTrackEvent;
    }

    public static XSWeexRenderTrackEvent f(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("25efe22f", new Object[]{activity, str});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f9347a = 3;
        xSWeexRenderTrackEvent.b = str;
        d(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }
}
