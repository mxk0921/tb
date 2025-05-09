package com.taobao.message.kit.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.ckf;
import tb.kyn;
import tb.t2o;
import tb.xz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\fJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0013J5\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\fJ\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u001bJ'\u0010#\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010-\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010&R\u0014\u0010.\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010&R\u0014\u0010/\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010&R\u0014\u00100\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00101\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010&R\u0014\u00102\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010&R\u0014\u00104\u001a\u0002038\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/taobao/message/kit/util/RemoteMonitorUtil;", "", "<init>", "()V", "", "isSuccess", "", "source", "errorMsg", "errorCode", "Ltb/xhv;", "directLoadAlarm", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mappingUri", "(Ljava/lang/String;)Ljava/lang/String;", "remoteInstallAlarm", "", "time", "loadingDurationStat", "(JLjava/lang/String;)V", "remoteAssembleStat", "(J)V", "remoteInstallStat", "remoteClazzAlarm", "name", "remoteClazzStat", "remoteLoadCount", "(Ljava/lang/String;)V", "remoteLoadBackCount", "remoteLoadFailCount", "(Ljava/lang/String;Ljava/lang/String;)V", "remoteLoadTimeoutCount", "Landroid/content/Context;", "context", "result", "directLoadAlarm4Source", "(Landroid/content/Context;Ljava/lang/String;Z)V", "MODULE", "Ljava/lang/String;", "POINT_INSTALL_ALARM", "POINT_INSTALL_STAT", "POINT_CLASS_ALARM", "POINT_CLASS_STAT", "POINT_ASSEMBLE_STAT", "POINT_LOAD_STAT", "POINT_LOAD_ALARM", "POINT_LOAD_COUNT", "POINT_LOAD_FAIL_COUNT", "POINT_LOAD_BACK_COUNT", "POINT_LOAD_TIMEOUT_COUNT", "FEATURE_NAME", "", "MAX_DURATION", TLogTracker.LEVEL_INFO, "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteMonitorUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_NAME = "taobao_wangxin";
    public static final RemoteMonitorUtil INSTANCE = new RemoteMonitorUtil();
    public static final int MAX_DURATION = 100000;
    public static final String MODULE = "msgRemote";
    public static final String POINT_ASSEMBLE_STAT = "assembleStat";
    public static final String POINT_CLASS_ALARM = "classAlarm";
    public static final String POINT_CLASS_STAT = "classStat";
    public static final String POINT_INSTALL_ALARM = "installAlarm";
    public static final String POINT_INSTALL_STAT = "installStat";
    public static final String POINT_LOAD_ALARM = "loadAlarm";
    public static final String POINT_LOAD_BACK_COUNT = "loadBackCount";
    public static final String POINT_LOAD_COUNT = "loadCount";
    public static final String POINT_LOAD_FAIL_COUNT = "loadFailCount";
    public static final String POINT_LOAD_STAT = "loadStat";
    public static final String POINT_LOAD_TIMEOUT_COUNT = "loadTimeCount";

    private RemoteMonitorUtil() {
    }

    private final void directLoadAlarm(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2c20e9", new Object[]{this, new Boolean(z), str, str2, str3});
        } else if (z) {
            AppMonitor.Alarm.commitSuccess(MODULE, POINT_LOAD_ALARM, str);
        } else {
            AppMonitor.Alarm.commitFail(MODULE, POINT_LOAD_ALARM, str, str2, str3);
        }
    }

    public static /* synthetic */ void directLoadAlarm$default(RemoteMonitorUtil remoteMonitorUtil, boolean z, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd836cb", new Object[]{remoteMonitorUtil, new Boolean(z), str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        remoteMonitorUtil.directLoadAlarm(z, str, str2, str3);
    }

    private final String mappingUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ec5dab1", new Object[]{this, str});
        }
        if (ckf.b(str, "chat")) {
            return "https://tb.cn/n/im/dynamic/chat.html";
        }
        return "http://message/root";
    }

    public static /* synthetic */ void remoteClazzAlarm$default(RemoteMonitorUtil remoteMonitorUtil, boolean z, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e417d44e", new Object[]{remoteMonitorUtil, new Boolean(z), str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        remoteMonitorUtil.remoteClazzAlarm(z, str, str2, str3);
    }

    public static /* synthetic */ void remoteInstallAlarm$default(RemoteMonitorUtil remoteMonitorUtil, boolean z, String str, String str2, String str3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9ad951", new Object[]{remoteMonitorUtil, new Boolean(z), str, str2, str3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        remoteMonitorUtil.remoteInstallAlarm(z, str, str2, str3);
    }

    public final void directLoadAlarm4Source(final Context context, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cff6d96", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        ckf.h(str, "source");
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.message.kit.util.RemoteMonitorUtil$directLoadAlarm4Source$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(RemoteMonitorUtil$directLoadAlarm4Source$1 remoteMonitorUtil$directLoadAlarm4Source$1, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/kit/util/RemoteMonitorUtil$directLoadAlarm4Source$1");
            }

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                Context context2 = context;
                if (context2 != null) {
                    SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences(RemoteMonitorUtil.MODULE, 0);
                    if (!sharedPreferences.getBoolean(str + "Flag", false)) {
                        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(RemoteMonitorUtil.MODULE, 0).edit();
                        edit.putBoolean(str + "Flag", true).apply();
                        if (z) {
                            RemoteMonitorUtil.directLoadAlarm$default(RemoteMonitorUtil.INSTANCE, true, str, null, null, 12, null);
                        } else {
                            RemoteMonitorUtil.directLoadAlarm$default(RemoteMonitorUtil.INSTANCE, false, str, null, null, 12, null);
                        }
                    }
                }
            }
        });
    }

    public final void loadingDurationStat(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3795c3", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.h(str, "source");
        if (j <= 100000) {
            kyn.c("taobao_wangxin", mappingUri(str), j);
            DimensionValueSet dimensionValueSet = new DimensionValueSet();
            dimensionValueSet.setValue("source", str);
            MeasureValueSet measureValueSet = new MeasureValueSet();
            measureValueSet.setValue("time", j);
            AppMonitor.Stat.commit(MODULE, POINT_LOAD_STAT, dimensionValueSet, measureValueSet);
        }
    }

    public final void remoteAssembleStat(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae3bbf1", new Object[]{this, new Long(j)});
        } else if (j <= 100000) {
            MeasureValueSet measureValueSet = new MeasureValueSet();
            measureValueSet.setValue("time", j);
            AppMonitor.Stat.commit(MODULE, POINT_ASSEMBLE_STAT, (DimensionValueSet) null, measureValueSet);
        }
    }

    public final void remoteClazzAlarm(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672ce2c", new Object[]{this, new Boolean(z), str, str2, str3});
            return;
        }
        ckf.h(str, "source");
        if (z) {
            AppMonitor.Alarm.commitSuccess(MODULE, POINT_CLASS_ALARM, str);
        } else {
            AppMonitor.Alarm.commitFail(MODULE, POINT_CLASS_ALARM, str, str2, str3);
        }
    }

    public final void remoteClazzStat(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171205c1", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.h(str, "name");
        if (j <= 100000) {
            DimensionValueSet dimensionValueSet = new DimensionValueSet();
            dimensionValueSet.setValue("name", str);
            MeasureValueSet measureValueSet = new MeasureValueSet();
            measureValueSet.setValue("time", j);
            AppMonitor.Stat.commit(MODULE, POINT_CLASS_STAT, dimensionValueSet, measureValueSet);
        }
    }

    public final void remoteInstallAlarm(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12c42ef", new Object[]{this, new Boolean(z), str, str2, str3});
            return;
        }
        ckf.h(str, "source");
        if (z) {
            AppMonitor.Alarm.commitSuccess(MODULE, POINT_INSTALL_ALARM, str);
        } else {
            AppMonitor.Alarm.commitFail(MODULE, POINT_INSTALL_ALARM, str, str2, str3);
        }
    }

    public final void remoteInstallStat(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c2171e", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.h(str, "source");
        if (j <= 100000) {
            DimensionValueSet dimensionValueSet = new DimensionValueSet();
            dimensionValueSet.setValue("source", str);
            MeasureValueSet measureValueSet = new MeasureValueSet();
            measureValueSet.setValue("time", j);
            AppMonitor.Stat.commit(MODULE, POINT_INSTALL_STAT, dimensionValueSet, measureValueSet);
        }
    }

    public final void remoteLoadBackCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24b610d", new Object[]{this, str});
            return;
        }
        ckf.h(str, "source");
        kyn.d("taobao_wangxin", mappingUri(str));
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_BACK_COUNT, str, 1.0d);
    }

    public final void remoteLoadCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f38074", new Object[]{this, str});
            return;
        }
        ckf.h(str, "source");
        kyn.e("taobao_wangxin", mappingUri(str));
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_COUNT, str, 1.0d);
    }

    public final void remoteLoadFailCount(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17c1cc0", new Object[]{this, str, str2});
            return;
        }
        ckf.h(str, "source");
        kyn.b("taobao_wangxin", mappingUri(str), str2);
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_FAIL_COUNT, str, 1.0d);
    }

    public final void remoteLoadTimeoutCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26893ab", new Object[]{this, str});
            return;
        }
        ckf.h(str, "source");
        AppMonitor.Counter.commit(MODULE, POINT_LOAD_TIMEOUT_COUNT, str, 1.0d);
    }

    static {
        t2o.a(529531013);
        MeasureSet create = MeasureSet.create(xz3.e("time"));
        DimensionSet create2 = DimensionSet.create(xz3.e("source"));
        AppMonitor.register(MODULE, POINT_INSTALL_STAT, create, create2);
        AppMonitor.register(MODULE, POINT_LOAD_STAT, create, create2);
        AppMonitor.register(MODULE, POINT_CLASS_STAT, create, DimensionSet.create(xz3.e("name")));
        AppMonitor.register(MODULE, POINT_ASSEMBLE_STAT, create, (DimensionSet) null);
    }
}
