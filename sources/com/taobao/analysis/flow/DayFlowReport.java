package com.taobao.analysis.flow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.HttpUrl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.FlowCenter;
import com.taobao.analysis.stat.DayFlowStatistic;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.srj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DayFlowReport {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NET_TYPE_SIZE = 12;
    public static final SimpleDateFormat g = new SimpleDateFormat("yyyyMMdd");
    public static volatile DayFlowReport h;

    /* renamed from: a  reason: collision with root package name */
    public long f6223a;
    public final long[] b = new long[12];
    public long c = 0;
    public long d = 0;
    public final HashMap<String, Long> e = new HashMap<>();
    public final HashMap<String, Long> f = new HashMap<>();

    public DayFlowReport() {
        if (FlowCenter.isMainProcess) {
            srj.b.registerReceiver(new FlowCollectBroadcast(), new IntentFilter("netAnalysis.day.flow.collect"));
        }
        srj.a();
        AppMonitor.getInstance().register(DayFlowStatistic.class);
        k();
    }

    public static /* synthetic */ long[] a(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("cb57a87c", new Object[]{dayFlowReport});
        }
        return dayFlowReport.b;
    }

    public static /* synthetic */ long b(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a553afbe", new Object[]{dayFlowReport})).longValue();
        }
        return dayFlowReport.c;
    }

    public static /* synthetic */ long c(DayFlowReport dayFlowReport, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7811db6c", new Object[]{dayFlowReport, new Long(j)})).longValue();
        }
        dayFlowReport.c = j;
        return j;
    }

    public static /* synthetic */ long d(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1acdd5ff", new Object[]{dayFlowReport})).longValue();
        }
        return dayFlowReport.d;
    }

    public static /* synthetic */ long e(DayFlowReport dayFlowReport, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1dc7d4b", new Object[]{dayFlowReport, new Long(j)})).longValue();
        }
        dayFlowReport.d = j;
        return j;
    }

    public static /* synthetic */ HashMap f(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c0f136af", new Object[]{dayFlowReport});
        }
        return dayFlowReport.e;
    }

    public static /* synthetic */ HashMap g(DayFlowReport dayFlowReport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("eb0aeb0", new Object[]{dayFlowReport});
        }
        return dayFlowReport.f;
    }

    public static DayFlowReport j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DayFlowReport) ipChange.ipc$dispatch("f619dc56", new Object[0]);
        }
        if (h == null) {
            synchronized (DayFlowReport.class) {
                try {
                    if (h == null) {
                        h = new DayFlowReport();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final void h() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2277be48", new Object[]{this});
            return;
        }
        while (true) {
            long[] jArr = this.b;
            if (i < jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                this.c = 0L;
                this.d = 0L;
                this.e.clear();
                this.f.clear();
                return;
            }
        }
    }

    public final void k() {
        Throwable th;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b0bdc", new Object[]{this});
        } else if (FlowCenter.isMainProcess) {
            DataInputStream dataInputStream = null;
            try {
                File file = new File(srj.b.getFilesDir(), "NetDayFlows");
                if (file.exists()) {
                    DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));
                    try {
                        if (dataInputStream2.readBoolean()) {
                            try {
                                dataInputStream2.close();
                            } catch (IOException unused) {
                            }
                            if (this.f6223a == 0) {
                                this.f6223a = System.currentTimeMillis();
                                return;
                            }
                            return;
                        }
                        this.f6223a = dataInputStream2.readLong();
                        while (true) {
                            long[] jArr = this.b;
                            if (i >= jArr.length) {
                                break;
                            }
                            jArr[i] = dataInputStream2.readLong();
                            i++;
                        }
                        this.c = dataInputStream2.readLong();
                        this.d = dataInputStream2.readLong();
                        for (int readInt = dataInputStream2.readInt(); readInt > 0; readInt--) {
                            this.e.put(dataInputStream2.readUTF(), Long.valueOf(dataInputStream2.readLong()));
                        }
                        for (int readInt2 = dataInputStream2.readInt(); readInt2 > 0; readInt2--) {
                            this.f.put(dataInputStream2.readUTF(), Long.valueOf(dataInputStream2.readLong()));
                        }
                        dataInputStream = dataInputStream2;
                    } catch (Exception unused2) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (this.f6223a != 0) {
                            return;
                        }
                        this.f6223a = System.currentTimeMillis();
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (this.f6223a == 0) {
                            this.f6223a = System.currentTimeMillis();
                        }
                        throw th;
                    }
                }
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                if (this.f6223a != 0) {
                    return;
                }
            } catch (Exception unused6) {
            } catch (Throwable th3) {
                th = th3;
            }
            this.f6223a = System.currentTimeMillis();
        }
    }

    public final void n(DataOutputStream dataOutputStream, Map<String, Long> map) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40bd099", new Object[]{this, dataOutputStream, map});
            return;
        }
        int size = map.size();
        dataOutputStream.writeInt(size);
        Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
        while (it.hasNext() && size > 0) {
            Map.Entry<String, Long> next = it.next();
            dataOutputStream.writeUTF(next.getKey());
            dataOutputStream.writeLong(next.getValue().longValue());
            size--;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class FlowCollectBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public FlowCollectBroadcast() {
        }

        public static /* synthetic */ Object ipc$super(FlowCollectBroadcast flowCollectBroadcast, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/flow/DayFlowReport$FlowCollectBroadcast");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (context != null && intent != null) {
                try {
                    if ("netAnalysis.day.flow.collect".equals(intent.getAction())) {
                        long[] longArrayExtra = intent.getLongArrayExtra("nettype_flow_array");
                        long longExtra = intent.getLongExtra("bgFlow", 0L);
                        long longExtra2 = intent.getLongExtra("fgFlow", 0L);
                        Map map = (Map) intent.getSerializableExtra("refer_flow_map");
                        Map map2 = (Map) intent.getSerializableExtra("domain_flow_map");
                        synchronized (FlowCenter.class) {
                            if (longArrayExtra != null && longArrayExtra.length == 12) {
                                for (int i = 0; i < DayFlowReport.a(DayFlowReport.this).length; i++) {
                                    long[] a2 = DayFlowReport.a(DayFlowReport.this);
                                    a2[i] = a2[i] + longArrayExtra[i];
                                }
                            }
                            DayFlowReport dayFlowReport = DayFlowReport.this;
                            DayFlowReport.c(dayFlowReport, DayFlowReport.b(dayFlowReport) + longExtra2);
                            DayFlowReport dayFlowReport2 = DayFlowReport.this;
                            DayFlowReport.e(dayFlowReport2, DayFlowReport.d(dayFlowReport2) + longExtra);
                            DayFlowReport.f(DayFlowReport.this).putAll(map);
                            DayFlowReport.g(DayFlowReport.this).putAll(map2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void m(boolean z) {
        Throwable th;
        DataOutputStream dataOutputStream;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4bc935", new Object[]{this, new Boolean(z)});
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                File file = new File(srj.b.getFilesDir(), "NetDayFlows");
                if (!file.exists()) {
                    file.createNewFile();
                }
                dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            } catch (IOException unused) {
                return;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            dataOutputStream.writeBoolean(z);
            if (!z) {
                dataOutputStream.writeLong(this.f6223a);
                while (true) {
                    long[] jArr = this.b;
                    if (i >= jArr.length) {
                        break;
                    }
                    dataOutputStream.writeLong(jArr[i]);
                    i++;
                }
                dataOutputStream.writeLong(this.c);
                dataOutputStream.writeLong(this.d);
                n(dataOutputStream, this.e);
                n(dataOutputStream, this.f);
            }
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Exception unused3) {
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                dataOutputStream2.close();
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public synchronized void i(String str, boolean z, String str2, long j, long j2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8617688", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Long(j2)});
        } else if (j != 0 || j2 != 0) {
            if (TextUtils.isEmpty(str)) {
                str = "other";
            }
            l(false);
            long[] jArr = this.b;
            int i = srj.f28231a;
            int i2 = i * 2;
            jArr[i2] = jArr[i2] + j;
            int i3 = (i * 2) + 1;
            jArr[i3] = jArr[i3] + j2;
            long j3 = j + j2;
            if (z) {
                this.d += j3;
            } else {
                this.c += j3;
            }
            Long l = this.e.get(str);
            if (l == null) {
                this.e.put(str, Long.valueOf(j3));
            } else {
                this.e.put(str, Long.valueOf(l.longValue() + j3));
            }
            HttpUrl parse = HttpUrl.parse(str2);
            if (parse != null) {
                str3 = parse.host();
            } else {
                str3 = "other";
            }
            Long l2 = this.f.get(str3);
            if (l2 == null) {
                this.f.put(str3, Long.valueOf(j3));
            } else {
                this.f.put(str3, Long.valueOf(l2.longValue() + j3));
            }
        }
    }

    public synchronized void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89603e75", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (FlowCenter.isMainProcess) {
            long j = this.f6223a;
            if (j / 3600000 < currentTimeMillis / 3600000) {
                DayFlowStatistic dayFlowStatistic = new DayFlowStatistic(this.b, this.c, this.d, this.e, this.f);
                Date date = new Date(this.f6223a);
                dayFlowStatistic.date = g.format(date);
                dayFlowStatistic.hour = date.getHours();
                AppMonitor.getInstance().commitStat(dayFlowStatistic);
                h();
                this.f6223a = currentTimeMillis;
                m(true);
            } else if (j < currentTimeMillis - 300000 || z) {
                this.f6223a = currentTimeMillis;
                m(false);
            }
        } else if (this.f6223a < currentTimeMillis - 300000) {
            Intent intent = new Intent("netAnalysis.day.flow.collect");
            intent.putExtra("nettype_flow_array", this.b);
            intent.putExtra("fgFlow", this.c);
            intent.putExtra("bgFlow", this.d);
            intent.putExtra("refer_flow_map", this.e);
            intent.putExtra("domain_flow_map", this.f);
            srj.b.sendBroadcast(intent);
            h();
            this.f6223a = currentTimeMillis;
        }
    }
}
