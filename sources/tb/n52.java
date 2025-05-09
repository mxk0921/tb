package tb;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n52 extends pqu<m52> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Application k;
    public final BatteryManager l;
    public Boolean m;
    public boolean n = false;

    public n52(Application application) {
        this.k = application;
        this.l = (BatteryManager) application.getSystemService("batterymanager");
    }

    public static /* synthetic */ Object ipc$super(n52 n52Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1436277928) {
            super.d(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        } else if (hashCode == -1261975280) {
            return super.b();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/metrickit/collector/battery/BatteryCapacityCollector");
        }
    }

    @Override // tb.pqu, tb.k04
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b4c7c910", new Object[]{this});
        }
        return rz3.b(super.b(), new int[]{90, 91});
    }

    @Override // tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    @Override // tb.pqu, tb.k04
    public void d(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa642358", new Object[]{this, new Integer(i), map});
            return;
        }
        super.d(i, map);
        if (i == 90) {
            this.m = Boolean.TRUE;
        } else if (i == 91) {
            if (this.m == null) {
                this.m = Boolean.FALSE;
            } else {
                this.n = true;
            }
        }
    }

    /* renamed from: l */
    public m52 e(oqu oquVar, int i, Map<String, ?> map) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m52) ipChange.ipc$dispatch("34866dd7", new Object[]{this, oquVar, new Integer(i), map});
        }
        m52 m52Var = null;
        if (this.l != null) {
            try {
                if (Build.VERSION.SDK_INT > 22) {
                    Intent registerReceiver = this.k.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    int m = m(registerReceiver);
                    i2 = n(registerReceiver);
                    i3 = m;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                m52Var = new m52(i, map, oquVar, this.l.getLongProperty(1), this.m.booleanValue(), i3, i2, SystemClock.uptimeMillis());
            } catch (Throwable th) {
                TLog.loge("MetricKit.BatteryCollector", th.getMessage(), th);
            }
            if (this.n) {
                this.n = false;
                this.m = Boolean.FALSE;
            }
        }
        if (m52Var != null) {
            return m52Var;
        }
        return new m52(i, map, oquVar, 0L, true, -1, -1, SystemClock.uptimeMillis());
    }

    public final int m(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abd301a4", new Object[]{this, intent})).intValue();
        }
        return (intent.getIntExtra(m09.TASK_TYPE_LEVEL, 100) * 100) / intent.getIntExtra("scale", 100);
    }

    public final int n(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4967d0d4", new Object[]{this, intent})).intValue();
        }
        return intent.getIntExtra("temperature", 0) / 10;
    }
}
