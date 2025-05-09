package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class f10 implements hi9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<yib> f18930a = new LinkedList();
    public final List<reb> b = new LinkedList();

    static {
        t2o.a(589299841);
        t2o.a(589299839);
    }

    public void a(reb rebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1b714b", new Object[]{this, rebVar});
        } else {
            this.b.add(rebVar);
        }
    }

    public void b(yib yibVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e3913f", new Object[]{this, yibVar});
        } else {
            this.f18930a.add(yibVar);
        }
    }

    public void c(String str, w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce07b8bb", new Object[]{this, str, w4jVar});
            return;
        }
        boolean isBlank = StringUtils.isBlank(str);
        for (reb rebVar : this.b) {
            if (!isBlank) {
                if (str.equals(rebVar.getName())) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.AbstractFilterManager", w4jVar.h, "[callback]jump to afterFilter:".concat(str));
                    }
                    isBlank = true;
                } else {
                    continue;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            String c = rebVar.c(w4jVar);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                String str2 = w4jVar.h;
                TBSdkLog.d("mtopsdk.AbstractFilterManager", str2, "[callback]execute AfterFilter: " + rebVar.getName() + ",time(ms)= " + (System.currentTimeMillis() - currentTimeMillis));
            }
            if (c == null || FilterManager.STOP.equals(c)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    String str3 = w4jVar.h;
                    TBSdkLog.i("mtopsdk.AbstractFilterManager", str3, "[callback]execute AfterFilter: " + rebVar.getName() + ",result=" + c);
                    return;
                }
                return;
            }
        }
    }

    public void d(String str, w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffb8b58", new Object[]{this, str, w4jVar});
            return;
        }
        boolean isBlank = StringUtils.isBlank(str);
        for (yib yibVar : this.f18930a) {
            if (!isBlank) {
                if (str.equals(yibVar.getName())) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.AbstractFilterManager", w4jVar.h, "[start]jump to beforeFilter:".concat(str));
                    }
                    isBlank = true;
                } else {
                    continue;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = yibVar.a(w4jVar);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                String str2 = w4jVar.h;
                TBSdkLog.d("mtopsdk.AbstractFilterManager", str2, "[start]execute BeforeFilter: " + yibVar.getName() + ",time(ms)= " + (System.currentTimeMillis() - currentTimeMillis));
            }
            if (a2 == null || FilterManager.STOP.equals(a2)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    String str3 = w4jVar.h;
                    TBSdkLog.i("mtopsdk.AbstractFilterManager", str3, "[start]execute BeforeFilter: " + yibVar.getName() + ",result=" + a2);
                    return;
                }
                return;
            }
        }
    }
}
