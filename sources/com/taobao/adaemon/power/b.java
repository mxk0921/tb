package com.taobao.adaemon.power;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.g;
import com.taobao.adaemon.power.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tb.f2d;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Comparator<a> COMPARATOR_BY_CPU_DIFF_TIME_DESCENDING = new Comparator() { // from class: tb.oxm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d;
                d = b.a.d((b.a) obj, (b.a) obj2);
                return d;
            }
        };
        public static final Comparator<a> COMPARATOR_BY_EXEC_TIME_DESC = new Comparator() { // from class: tb.pxm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e;
                e = b.a.e((b.a) obj, (b.a) obj2);
                return e;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public int f6165a;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public double g;
        public double h;

        static {
            t2o.a(349175937);
        }

        public static /* synthetic */ int d(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5d288453", new Object[]{aVar, aVar2})).intValue();
            }
            return Long.compare(aVar2.e + aVar2.f, aVar.e + aVar.f);
        }

        public static /* synthetic */ int e(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("60b02754", new Object[]{aVar, aVar2})).intValue();
            }
            return Double.compare(aVar2.c + aVar2.d, aVar.c + aVar.d);
        }

        public void c(StringBuilder sb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cff7e8aa", new Object[]{this, sb});
            } else if (sb != null) {
                sb.append(this.f6165a);
                sb.append("|");
                sb.append(this.b);
                sb.append("|");
                sb.append(g.d(this.c));
                sb.append("|");
                sb.append(g.d(this.d));
                sb.append("|");
                sb.append(this.g);
                sb.append("|");
                sb.append((int) this.h);
            }
        }
    }

    static {
        t2o.a(349175936);
    }

    public static a d(String str) {
        Throwable th;
        BufferedReader bufferedReader;
        String readLine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("71915630", new Object[]{str});
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (Throwable th3) {
            th = th3;
            try {
                s55.h("ProcStatParser", "readStatFile fail", th, new Object[0]);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        s55.h("ProcStatParser", "readStatFile close", e, new Object[0]);
                    }
                }
                return null;
            } catch (Throwable th4) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        s55.h("ProcStatParser", "readStatFile close", e2, new Object[0]);
                    }
                }
                throw th4;
            }
        }
        if (readLine != null) {
            a b = b(readLine);
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                s55.h("ProcStatParser", "readStatFile close", e3, new Object[0]);
            }
            return b;
        }
        try {
            bufferedReader.close();
        } catch (IOException e4) {
            s55.h("ProcStatParser", "readStatFile close", e4, new Object[0]);
        }
        return null;
    }

    public static List<a> c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9dfdedd9", new Object[]{new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        try {
            String str = "/proc/" + i + "/task";
            String[] list = new File(str).list();
            if (list != null) {
                for (String str2 : list) {
                    a d = d(str + "/" + str2 + "/stat");
                    if (d != null && d.c + d.d > 0) {
                        arrayList.add(d);
                    }
                }
            }
        } catch (Throwable th) {
            s55.h("ProcStatParser", "readProcTaskStats", th, new Object[0]);
        }
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static String a(int i) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4da9137d", new Object[]{new Integer(i)});
        }
        List<a> c = c(Process.myPid());
        BufferedReader bufferedReader = null;
        if (c.isEmpty()) {
            return null;
        }
        Collections.sort(c, a.COMPARATOR_BY_EXEC_TIME_DESC);
        int min = Math.min(i, c.size());
        s55.i("ProcStatParser", "dumpTopThreadInfo", "len", Integer.valueOf(min));
        StringBuilder sb = new StringBuilder(min * 50);
        String str = "/proc/" + Process.myPid() + "/task/";
        for (int i2 = 0; i2 < min; i2++) {
            a aVar = c.get(i2);
            try {
                bufferedReader = new BufferedReader(new FileReader(str + aVar.f6165a + "/sched"));
                int i3 = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("avg_per_cpu")) {
                            aVar.g = Double.parseDouble(readLine.substring(readLine.lastIndexOf(" ") + 1));
                        } else if (readLine.startsWith("se.sum_exec_runtime")) {
                            aVar.h = Double.parseDouble(readLine.substring(readLine.lastIndexOf(" ") + 1));
                        } else {
                            continue;
                        }
                        i3++;
                        continue;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            s55.h("ProcStatParser", "dumpTopThreadInfo err", th, new Object[0]);
                            f2d.a(bufferedReader);
                            bufferedReader = bufferedReader;
                        } catch (Throwable th3) {
                            f2d.a(bufferedReader);
                            throw th3;
                        }
                    }
                } while (i3 != 2);
                aVar.c(sb);
                if (i2 < min - 1) {
                    sb.append(",");
                }
            } catch (Throwable th4) {
                th = th4;
            }
            f2d.a(bufferedReader);
            bufferedReader = bufferedReader;
        }
        return sb.toString();
    }

    public static a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f632959", new Object[]{str});
        }
        String[] split = str.split(" ");
        a aVar = new a();
        try {
            if (split.length > 16) {
                aVar.f6165a = Integer.parseInt(split[0]);
                aVar.b = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
                String str2 = split[2];
                if (str2 != null && str2.length() == 1) {
                    split[2].charAt(0);
                }
                aVar.c = Long.parseLong(split[13]);
                aVar.d = Long.parseLong(split[14]);
            } else {
                s55.i("ProcStatParser", "parseProcStat error", "parts", split);
            }
        } catch (Throwable th) {
            s55.h("ProcStatParser", "parseProcStat", th, new Object[0]);
        }
        return aVar;
    }
}
