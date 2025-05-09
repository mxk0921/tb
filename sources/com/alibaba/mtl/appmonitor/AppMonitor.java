package com.alibaba.mtl.appmonitor;

import android.app.Application;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.analytics.IAnalytics;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.m2v;
import tb.nhh;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AppMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AppMonitor";

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class OffLineCounter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593090);
        }

        public static boolean checkSampled(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            return false;
        }

        public static void commit(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9042c22c", new Object[]{str, str2, new Double(d)});
            } else {
                Counter.commit(str, str2, d);
            }
        }

        public static void setSampling(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            }
        }

        public static void setStatisticsInterval(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Stat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593091);
        }

        public static void begin(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a24ade8e", new Object[]{str, str2, str3});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Stat.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.stat_begin(str, str2, str3);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static boolean checkSampled(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            IAnalytics iAnalytics = AnalyticsMgr.b;
            if (iAnalytics == null) {
                return false;
            }
            try {
                return iAnalytics.stat_checkSampled(str, str2);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public static void commit(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9042c22c", new Object[]{str, str2, new Double(d)});
            } else {
                commit(str, str2, (DimensionValueSet) null, d);
            }
        }

        public static Transaction createTransaction(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Transaction) ipChange.ipc$dispatch("471af995", new Object[]{str, str2}) : createTransaction(str, str2, null);
        }

        public static void end(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eac5ec40", new Object[]{str, str2, str3});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Stat.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.stat_end(str, str2, str3);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void setSampling(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Stat.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.stat_setSampling(i);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void setStatisticsInterval(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Stat.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.stat_setStatisticsInterval(i);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void commit(final String str, final String str2, final DimensionValueSet dimensionValueSet, final double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94480723", new Object[]{str, str2, dimensionValueSet, new Double(d)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Stat.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.stat_commit2(str, str2, dimensionValueSet, d);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static Transaction createTransaction(String str, String str2, DimensionValueSet dimensionValueSet) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Transaction) ipChange.ipc$dispatch("acdc9ccc", new Object[]{str, str2, dimensionValueSet}) : new Transaction(Integer.valueOf(EventType.STAT.getEventId()), str, str2, dimensionValueSet);
        }

        public static void commit(final String str, final String str2, final DimensionValueSet dimensionValueSet, final MeasureValueSet measureValueSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1b73ec", new Object[]{str, str2, dimensionValueSet, measureValueSet});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Stat.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.stat_commit3(str, str2, dimensionValueSet, measureValueSet);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void commit(String str, String str2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
            DimensionValueSet dimensionValueSet;
            double doubleValue;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c88fa092", new Object[]{str, str2, strArr, strArr2, strArr3, strArr4});
                return;
            }
            nhh.f("[commit from jni]", new Object[0]);
            MeasureValueSet measureValueSet = null;
            if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
                dimensionValueSet = null;
            } else {
                dimensionValueSet = DimensionValueSet.create();
                for (int i = 0; i < strArr2.length; i++) {
                    dimensionValueSet.setValue(strArr[i], strArr2[i]);
                }
            }
            if (strArr3 == null || strArr4 == null || strArr3.length != strArr4.length) {
                nhh.f("measure is null ,or lenght not match", new Object[0]);
            } else {
                measureValueSet = MeasureValueSet.create();
                for (int i2 = 0; i2 < strArr4.length; i2++) {
                    if (!TextUtils.isEmpty(strArr4[i2])) {
                        try {
                            doubleValue = Double.valueOf(strArr4[i2]).doubleValue();
                        } catch (Exception unused) {
                            nhh.f("measure's value cannot convert to double. measurevalue:" + strArr4[i2], new Object[0]);
                        }
                        measureValueSet.setValue(strArr3[i2], doubleValue);
                    }
                    doubleValue = vu3.b.GEO_NOT_SUPPORT;
                    measureValueSet.setValue(strArr3[i2], doubleValue);
                }
            }
            commit(str, str2, dimensionValueSet, measureValueSet);
        }
    }

    static {
        t2o.a(962593072);
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return checkInit();
    }

    private static boolean checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[0])).booleanValue();
        }
        if (!AnalyticsMgr.g) {
            nhh.f("AppMonitor", "Please call init() before call other method");
        }
        return AnalyticsMgr.g;
    }

    @Deprecated
    public static synchronized void destroy() {
        synchronized (AppMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[0]);
            }
        }
    }

    public static void enableLog(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b0dd0c", new Object[]{new Boolean(z)});
        } else if (checkInit()) {
            ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AnalyticsMgr.b.enableLog(z);
                    } catch (RemoteException e) {
                        AnalyticsMgr.O(e);
                    }
                }
            });
        }
    }

    private static int getEvent(EventType eventType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ec09043", new Object[]{eventType})).intValue();
        }
        return eventType.getEventId();
    }

    public static String getGlobalProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ee50ae1", new Object[]{str});
        }
        return AnalyticsMgr.K(str);
    }

    @Deprecated
    public static synchronized void init(Application application) {
        synchronized (AppMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            } else {
                AnalyticsMgr.P(application);
            }
        }
    }

    public static void register(String str, String str2, MeasureSet measureSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d0b9ae", new Object[]{str, str2, measureSet});
        } else {
            register(str, str2, measureSet, (DimensionSet) null, false);
        }
    }

    public static void removeGlobalProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286ea5cd", new Object[]{str});
        } else {
            AnalyticsMgr.V(str);
        }
    }

    @Deprecated
    public static void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{str});
        } else {
            AnalyticsMgr.Z(str);
        }
    }

    public static void setGlobalProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56d47b5", new Object[]{str, str2});
        } else {
            AnalyticsMgr.b0(str, str2);
        }
    }

    @Deprecated
    public static void setRequestAuthInfo(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276167be", new Object[]{new Boolean(z), str, str2});
            return;
        }
        throw new RuntimeException("this interface is deprecated after sdk version 6.3.0，please call Analytics.getInstance().setAppApplicationInstance(Application application,IUTApplication utcallback) ");
    }

    public static void setSampling(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
        } else if (checkInit()) {
            ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AnalyticsMgr.b.setSampling(i);
                    } catch (RemoteException e) {
                        AnalyticsMgr.O(e);
                    }
                }
            });
        }
    }

    public static void setStatisticsInterval(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
        } else if (checkInit()) {
            ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AnalyticsMgr.b.setStatisticsInterval1(i);
                    } catch (RemoteException e) {
                        AnalyticsMgr.O(e);
                    }
                }
            });
        }
    }

    @Deprecated
    public static synchronized void triggerUpload() {
        synchronized (AppMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("711015e0", new Object[0]);
            }
        }
    }

    @Deprecated
    public static void turnOffRealTimeDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[0]);
        } else {
            AnalyticsMgr.e0();
        }
    }

    @Deprecated
    public static void turnOnRealTimeDebug(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{map});
        } else {
            AnalyticsMgr.g0(map);
        }
    }

    public static void updateMeasure(final String str, final String str2, final String str3, final double d, final double d2, final double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205fd704", new Object[]{str, str2, str3, new Double(d), new Double(d2), new Double(d3)});
            return;
        }
        nhh.f("AppMonitor", "[updateMeasure]");
        if (checkInit()) {
            ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AnalyticsMgr.b.updateMeasure(str, str2, str3, d, d2, d3);
                    } catch (RemoteException e) {
                        AnalyticsMgr.O(e);
                    }
                }
            });
        }
    }

    public static void register(String str, String str2, MeasureSet measureSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1472ee6", new Object[]{str, str2, measureSet, new Boolean(z)});
        } else {
            register(str, str2, measureSet, (DimensionSet) null, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Alarm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593078);
        }

        @Deprecated
        public static boolean checkSampled(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            IAnalytics iAnalytics = AnalyticsMgr.b;
            if (iAnalytics == null) {
                return false;
            }
            try {
                return iAnalytics.alarm_checkSampled(str, str2);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public static void commitFail(final String str, final String str2, final String str3, final String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Alarm.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.alarm_commitFail1(str, str2, str3, str4);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void commitSuccess(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Alarm.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.alarm_commitSuccess1(str, str2);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void setSampling(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Alarm.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.alarm_setSampling(i);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void setStatisticsInterval(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Alarm.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.alarm_setStatisticsInterval(i);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void commitFail(final String str, final String str2, final String str3, final String str4, final String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49c1ffee", new Object[]{str, str2, str3, str4, str5});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Alarm.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.alarm_commitFail2(str, str2, str3, str4, str5);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void commitSuccess(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d3416f1", new Object[]{str, str2, str3});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Alarm.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.alarm_commitSuccess2(str, str2, str3);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Counter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593085);
        }

        @Deprecated
        public static boolean checkSampled(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            IAnalytics iAnalytics = AnalyticsMgr.b;
            if (iAnalytics == null) {
                return false;
            }
            try {
                return iAnalytics.counter_checkSampled(str, str2);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public static void commit(final String str, final String str2, final double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9042c22c", new Object[]{str, str2, new Double(d)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Counter.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.counter_commit1(str, str2, d);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void setSampling(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Counter.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.counter_setSampling(i);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void setStatisticsInterval(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Counter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.counter_setStatisticsInterval(i);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }

        public static void commit(final String str, final String str2, final String str3, final double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d137222", new Object[]{str, str2, str3, new Double(d)});
            } else if (AppMonitor.access$000()) {
                ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.Counter.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AnalyticsMgr.b.counter_commit2(str, str2, str3, d);
                        } catch (RemoteException e) {
                            AnalyticsMgr.O(e);
                        }
                    }
                });
            }
        }
    }

    public static void register(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701c9b46", new Object[]{str, str2, measureSet, dimensionSet});
        } else {
            register(str, str2, measureSet, dimensionSet, false);
        }
    }

    public static void register(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377804e", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z)});
        } else {
            AnalyticsMgr.U(str, str2, measureSet, dimensionSet, z);
        }
    }

    public static void setStatisticsInterval(EventType eventType, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30fd404d", new Object[]{eventType, new Integer(i)});
        } else if (checkInit()) {
            final int event = getEvent(eventType);
            ((m2v) AnalyticsMgr.c).a(new Runnable() { // from class: com.alibaba.mtl.appmonitor.AppMonitor.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AnalyticsMgr.b.setStatisticsInterval2(event, i);
                    } catch (RemoteException e) {
                        AnalyticsMgr.O(e);
                    }
                }
            });
        }
    }

    public static void register(String str, String str2, String[] strArr, String[] strArr2, boolean z) {
        DimensionSet dimensionSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e165b6", new Object[]{str, str2, strArr, strArr2, new Boolean(z)});
            return;
        }
        nhh.f("AppMonitor", "[c interface] module", str, "monitorPoint", str2);
        if (strArr != null) {
            MeasureSet create = MeasureSet.create();
            for (String str3 : strArr) {
                create.addMeasure(str3);
            }
            if (strArr2 != null) {
                dimensionSet = DimensionSet.create();
                for (String str4 : strArr2) {
                    dimensionSet.addDimension(str4);
                }
            } else {
                dimensionSet = null;
            }
            register(str, str2, create, dimensionSet, z);
            return;
        }
        nhh.f("AppMonitor", "register failed:no measure");
    }
}
