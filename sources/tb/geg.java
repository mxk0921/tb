package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class geg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TTID = "hybrid@lightvane_android_1.0.0";
    public static final String DEFAULT_UA = " LightVane/1.0.0";
    public static final String VERSION = "1.0.0";

    /* renamed from: a  reason: collision with root package name */
    public static String f19928a = null;
    public static String b = null;
    public static String c = null;

    static {
        t2o.a(507510789);
    }

    public static boolean a(Application application, udg udgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9c90929", new Object[]{application, udgVar})).booleanValue();
        }
        if (udgVar == null) {
            return false;
        }
        if (TextUtils.isEmpty(null)) {
            f19928a = DEFAULT_TTID;
        } else {
            f19928a = null;
        }
        b = udgVar.f29306a;
        c = udgVar.b;
        return true;
    }
}
