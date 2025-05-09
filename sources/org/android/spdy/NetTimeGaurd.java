package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetTimeGaurd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CREATE = 0;
    public static final int ERROR = 2;
    public static final int PING = 1;
    public static final int STREAM = 3;
    private static final long calltime = 10;
    private static final long total = 50;
    private static long[] totaltime = new long[4];

    public static long begin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bffb80a4", new Object[0])).longValue();
        }
        if (SpdyAgent.enableTimeGaurd) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    public static void end(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9840a64d", new Object[]{str, new Integer(i), new Long(j)});
        } else if (SpdyAgent.enableTimeGaurd) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            long[] jArr = totaltime;
            jArr[i] = jArr[i] + currentTimeMillis;
            StringBuilder sb = new StringBuilder("NetTimeGaurd[end]");
            sb.append(str);
            sb.append(" time=");
            sb.append(currentTimeMillis);
            sb.append(" total=");
            sb.append(totaltime[i]);
            if (currentTimeMillis > 10) {
                throw new SpdyErrorException("CallBack:" + str + " timeconsuming:" + currentTimeMillis + "  mustlessthan:10", -1);
            }
        }
    }

    public static void finish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d81d6a9", new Object[]{new Integer(i)});
        } else if (SpdyAgent.enableTimeGaurd) {
            new StringBuilder("NetTimeGaurd[finish]:time=").append(totaltime[i]);
            if (totaltime[i] > 50) {
                throw new SpdyErrorException("CallBack totaltimeconsuming:" + totaltime[i] + "  mustlessthan:50", -1);
            }
        }
    }

    public static void start(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f66283a", new Object[]{new Integer(i)});
        } else if (SpdyAgent.enableTimeGaurd) {
            totaltime[i] = 0;
        }
    }
}
