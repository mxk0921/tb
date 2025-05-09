package com.alibaba.analytics;

import android.app.Application;
import android.os.RemoteException;
import com.alibaba.analytics.IAnalytics;
import com.alibaba.analytics.core.sync.c;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.mtl.appmonitor.Transaction;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import java.util.Map;
import tb.iv6;
import tb.j71;
import tb.nhh;
import tb.o2w;
import tb.ozu;
import tb.t2o;
import tb.tdu;
import tb.vep;
import tb.w2v;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AnalyticsImp extends IAnalytics.Stub {
    private static Application mApplication;

    static {
        t2o.a(962592769);
    }

    public AnalyticsImp(Application application) {
        mApplication = application;
    }

    public static Application getApplication() {
        return mApplication;
    }

    private EventType getEventType(int i) {
        return EventType.getEventType(i);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean alarm_checkSampled(String str, String str2) throws RemoteException {
        try {
            return j71.a.a(str, str2);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
            return false;
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitFail1(String str, String str2, String str3, String str4) throws RemoteException {
        try {
            j71.a.b(str, str2, str3, str4);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitFail2(String str, String str2, String str3, String str4, String str5) throws RemoteException {
        try {
            j71.a.c(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitSuccess1(String str, String str2) throws RemoteException {
        try {
            j71.a.d(str, str2);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_commitSuccess2(String str, String str2, String str3) throws RemoteException {
        try {
            j71.a.e(str, str2, str3);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_setSampling(int i) throws RemoteException {
        try {
            j71.a.f(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void alarm_setStatisticsInterval(int i) throws RemoteException {
        try {
            j71.a.g(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean counter_checkSampled(String str, String str2) throws RemoteException {
        try {
            return j71.b.a(str, str2);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
            return false;
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_commit1(String str, String str2, double d) throws RemoteException {
        try {
            j71.b.b(str, str2, d);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_commit2(String str, String str2, String str3, double d) throws RemoteException {
        try {
            j71.b.c(str, str2, str3, d);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_setSampling(int i) throws RemoteException {
        try {
            j71.b.d(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void counter_setStatisticsInterval(int i) throws RemoteException {
        try {
            j71.b.e(i);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void destroy() throws RemoteException {
        try {
            j71.a();
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void dispatchLocalHits() throws RemoteException {
        try {
            c.p().l();
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void enableLog(boolean z) throws RemoteException {
        try {
            j71.b(z);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void init() throws RemoteException {
        try {
            initUT();
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean offlinecounter_checkSampled(String str, String str2) throws RemoteException {
        return j71.c.a(str, str2);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void offlinecounter_commit(String str, String str2, double d) throws RemoteException {
        j71.c.b(str, str2, d);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void offlinecounter_setSampling(int i) throws RemoteException {
        j71.c.c(i);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void offlinecounter_setStatisticsInterval(int i) throws RemoteException {
        try {
            j71.c.d(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void onBackground() throws RemoteException {
        try {
            saveCacheDataToLocal();
            w2v.a();
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void onForeground() throws RemoteException {
        try {
            w2v.b();
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    @Deprecated
    public void register1(String str, String str2, MeasureSet measureSet) throws RemoteException {
        try {
            j71.f(str, str2, measureSet, null, false);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    @Deprecated
    public void register2(String str, String str2, MeasureSet measureSet, boolean z) throws RemoteException {
        try {
            j71.f(str, str2, measureSet, null, z);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    @Deprecated
    public void register3(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet) throws RemoteException {
        try {
            j71.f(str, str2, measureSet, dimensionSet, false);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void register4(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) throws RemoteException {
        try {
            j71.f(str, str2, measureSet, dimensionSet, z);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void removeGlobalProperty(String str) throws RemoteException {
        try {
            j71.g(str);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void saveCacheDataToLocal() throws RemoteException {
        try {
            ozu.getInstance().saveCacheDataToLocal();
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public String selfCheck(String str) throws RemoteException {
        return null;
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void sessionTimeout() throws RemoteException {
        try {
            ozu.getInstance().sessionTimeout();
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setAppVersion(String str) throws RemoteException {
        try {
            ozu.getInstance().setAppVersion(str);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setChannel(String str) throws RemoteException {
        try {
            ozu.getInstance().setChannel(str);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setGlobalProperty(String str, String str2) throws RemoteException {
        try {
            j71.h(str, str2);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setRequestAuthInfo(boolean z, boolean z2, String str, String str2) throws RemoteException {
        try {
            j71.i(z, z2, str, str2);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setSampling(int i) throws RemoteException {
        try {
            j71.j(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setSessionProperties(Map map) throws RemoteException {
        try {
            ozu.getInstance().setSessionProperties(map);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setStatisticsInterval1(int i) throws RemoteException {
        try {
            j71.k(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void setStatisticsInterval2(int i, int i2) throws RemoteException {
        try {
            j71.l(getEventType(i), i2);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_begin(String str, String str2, String str3) throws RemoteException {
        try {
            j71.d.a(str, str2, str3);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public boolean stat_checkSampled(String str, String str2) throws RemoteException {
        return j71.d.b(str, str2);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_commit1(String str, String str2, double d) throws RemoteException {
        try {
            j71.d.c(str, str2, d);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_commit2(String str, String str2, DimensionValueSet dimensionValueSet, double d) throws RemoteException {
        try {
            j71.d.d(str, str2, dimensionValueSet, d);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_commit3(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) throws RemoteException {
        try {
            j71.d.e(str, str2, dimensionValueSet, measureValueSet);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_end(String str, String str2, String str3) throws RemoteException {
        try {
            j71.d.f(str, str2, str3);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_setSampling(int i) throws RemoteException {
        try {
            j71.d.g(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void stat_setStatisticsInterval(int i) throws RemoteException {
        try {
            j71.d.h(i);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void transaction_begin(Transaction transaction, String str) throws RemoteException {
        try {
            tdu.b(transaction, str);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void transaction_end(Transaction transaction, String str) throws RemoteException {
        try {
            tdu.c(transaction, str);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void transferLog(Map map) throws RemoteException {
        try {
            if (!o2w.k().I()) {
                o2w.k().y(mApplication);
            }
            ozu.getInstance().transferLog(map);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void triggerUpload() throws RemoteException {
        try {
            j71.m();
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void turnOffRealTimeDebug() throws RemoteException {
        try {
            o2w.k().d0();
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void turnOnDebug() throws RemoteException {
        try {
            ozu.getInstance().turnOnDebug();
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void turnOnRealTimeDebug(Map map) throws RemoteException {
        try {
            o2w.k().f0(map);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void updateMeasure(String str, String str2, String str3, double d, double d2, double d3) throws RemoteException {
        j71.n(str, str2, str3, d, d2, d3);
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void updateSessionProperties(Map map) throws RemoteException {
        try {
            ozu.getInstance().updateSessionProperties(map);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void updateUserAccount(String str, String str2, String str3, String str4) throws RemoteException {
        try {
            ozu.getInstance().updateUserAccount(str, str2, str3, str4);
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public String getValue(String str) throws RemoteException {
        try {
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
        if (iv6.KEY.equals(str)) {
            return x2r.f().e(str);
        }
        if ("tpk_md5".equals(str)) {
            return o2w.k().u();
        }
        if ("tpk_string".equals(str)) {
            return o2w.k().t();
        }
        if ("session_timestamp".equals(str)) {
            return vep.a().c();
        }
        if ("autoExposure".equalsIgnoreCase(str)) {
            return x2r.f().e(str);
        }
        return null;
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void initUT() throws RemoteException {
        nhh.m("AnalyticsImp", "initUT start..");
        o2w.k().y(mApplication);
        nhh.m("AnalyticsImp", "initUT end..");
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void sessionUpdateInChannel(long j) throws RemoteException {
        try {
            nhh.f("AnalyticsImp", "sessionUpdateInChannel", Long.valueOf(j));
            if (j != 0) {
                vep.a().h(j);
            }
        } catch (VerifyError e) {
            nhh.h(null, e, new Object[0]);
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
    }

    @Override // com.alibaba.analytics.IAnalytics
    public void startMainProcess(long j) throws RemoteException {
    }
}
