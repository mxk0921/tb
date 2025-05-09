package com.taobao.accs.ut.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import anet.channel.Constants;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.h5d;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "accs", monitorPoint = "foreground")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsForegroundMonitor extends BaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AccsForegroundMonitor";
    private static SharedPreferences mSP;
    @Dimension
    public String keepAlive;
    @Measure
    public long onlineTime;
    @Dimension
    public String process = h5d.f();
    private static final AtomicLong connectedTimeInMill = new AtomicLong();
    private static final AtomicLong onlineTotalTimeInMill = new AtomicLong();
    private static volatile Integer dayOfYear = null;
    private static final AtomicBoolean initialized = new AtomicBoolean();

    static {
        t2o.a(343933205);
    }

    private AccsForegroundMonitor() {
    }

    private static int getCurDay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25a09fac", new Object[0])).intValue();
        }
        return Calendar.getInstance().get(6);
    }

    public static /* synthetic */ Object ipc$super(AccsForegroundMonitor accsForegroundMonitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/ut/monitor/AccsForegroundMonitor");
    }

    public static void offline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e77e8ea", new Object[0]);
            return;
        }
        ALog.e(TAG, "offline", new Object[0]);
        connectedTimeInMill.set(0L);
        onlineTotalTimeInMill.set(getSp(GlobalClientInfo.getContext()).getLong("online", 0L));
    }

    private static SharedPreferences getSp(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("cca12b02", new Object[]{context});
        }
        if (mSP == null) {
            String f = h5d.f();
            int indexOf = f.indexOf(":");
            if (indexOf > 0) {
                str = f.substring(indexOf);
            } else {
                str = "main";
            }
            mSP = context.getSharedPreferences("accs_process_record_" + str, 0);
        }
        return mSP;
    }

    public static void online(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b450bae", new Object[]{context});
            return;
        }
        if (!initialized.getAndSet(true)) {
            report(context, null);
        }
        AtomicLong atomicLong = connectedTimeInMill;
        atomicLong.set(SystemClock.elapsedRealtime());
        ALog.e(TAG, "online", "connectedTimeInMill", Long.valueOf(atomicLong.get()));
    }

    public static void refreshOnlineTime(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bd2e06", new Object[]{context});
            return;
        }
        AtomicLong atomicLong = connectedTimeInMill;
        if (atomicLong.get() <= 0) {
            online(context);
        } else if (TimeMeter.a(TimeMeter.TAG_ONLINE_MONITOR, Constants.RECV_TIMEOUT)) {
            AtomicLong atomicLong2 = onlineTotalTimeInMill;
            long elapsedRealtime = (SystemClock.elapsedRealtime() - atomicLong.get()) + atomicLong2.get();
            ALog.e(TAG, "refreshOnlineTime save", "time", Long.valueOf(elapsedRealtime));
            getSp(context).edit().putLong("online", elapsedRealtime).apply();
            int curDay = getCurDay();
            if (!(dayOfYear == null || dayOfYear.intValue() == curDay)) {
                ALog.e(TAG, "DAY_OF_YEAR changed", new Object[0]);
                report(context, Long.valueOf(elapsedRealtime));
                online(context);
                atomicLong2.set(0L);
            }
            dayOfYear = Integer.valueOf(curDay);
        }
    }

    private static void report(Context context, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc7ec2ac", new Object[]{context, l});
            return;
        }
        if (l == null) {
            l = Long.valueOf(getSp(context).getLong("online", 0L));
        }
        ALog.e(TAG, "report", "onlineTime", l);
        if (l.longValue() > 0) {
            AccsForegroundMonitor accsForegroundMonitor = new AccsForegroundMonitor();
            accsForegroundMonitor.keepAlive = String.valueOf(UtilityImpl.isAppKeepAlive());
            accsForegroundMonitor.onlineTime = l.longValue();
            AppMonitor.getInstance().commitStat(accsForegroundMonitor);
            getSp(context).edit().remove("online").apply();
        }
    }
}
