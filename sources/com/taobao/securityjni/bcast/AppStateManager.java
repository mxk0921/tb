package com.taobao.securityjni.bcast;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.ArrayList;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AppStateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DNS_ACTION = "setaobao.bbox.DNS";
    public static final String EXTRA_DNS_IP = "IPAddress";
    public static final String EXTRA_DNS_LOCAL = "DNSinfolocal";
    public static final String EXTRA_DNS_NET = "DNSinfonet";
    public static final String EXTRA_RT = "RTinfo";
    public static final String EXTRA_SPITEP = "SPITEPinfo";
    private static final int IPV4_SIZE = 4;
    public static int Init = 0;
    public static final String RT_ACTION = "setaobao.bbox.RT";
    public static final int RT_VALUE_100_PERMISSION = 10;
    public static final int RT_VALUE_INVALID = -1;
    public static final int RT_VALUE_LIKELY_1 = 1;
    public static final int RT_VALUE_LIKELY_2 = 2;
    public static final int RT_VALUE_LIKELY_3 = 3;
    public static final int RT_VALUE_LIKELY_4 = 4;
    public static final int RT_VALUE_LIKELY_5 = 5;
    public static final int RT_VALUE_LIKELY_6 = 6;
    public static final int RT_VALUE_LIKELY_7 = 7;
    public static final int RT_VALUE_LIKELY_8 = 8;
    public static final int RT_VALUE_LIKELY_9 = 9;
    public static final int RT_VALUE_UNDETECTABLE = 0;
    public static final String SPITEP_ACTION = "setaobao.bbox.SPITEP";
    public static final int SPITEP_VALUE_NS_0 = 0;
    public static final int SPITEP_VALUE_NS_1 = 1;
    public static final int SPITEP_VALUE_NS_2 = 2;
    public static final int SPITEP_VALUE_NS_3 = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class DoaminIP {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public byte[][] ip;
        public String name;

        static {
            t2o.a(421527574);
        }

        private String IpToString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("99167806", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            if (this.ip == null) {
                return "null";
            }
            int i = 0;
            while (true) {
                byte[][] bArr = this.ip;
                if (i >= bArr.length) {
                    return sb.toString();
                }
                byte[] bArr2 = bArr[i];
                sb.append("ip[");
                sb.append(i);
                sb.append("]=");
                if (bArr2 != null) {
                    for (int i2 = 0; i2 < bArr2.length; i2++) {
                        sb.append(bArr2[i2] & 255);
                        if (i2 != bArr2.length - 1) {
                            sb.append(f7l.CONDITION_IF_MIDDLE);
                        }
                    }
                } else {
                    sb.append("null");
                }
                sb.append("  ");
                i++;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DoaminIP [name=" + this.name + ", ip=" + IpToString() + "]";
        }
    }

    static {
        t2o.a(421527573);
    }

    public static final ArrayList<DoaminIP> parserDomainIP(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fc945348", new Object[]{intent});
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra(EXTRA_DNS_IP);
        byte[][] bArr = null;
        if (byteArrayExtra == null) {
            return null;
        }
        ArrayList<DoaminIP> arrayList = new ArrayList<>();
        int i = 0;
        while (i < byteArrayExtra.length) {
            int i2 = byteArrayExtra[i] & 255;
            String str = new String(byteArrayExtra, i + 1, i2);
            int i3 = i + i2;
            int i4 = i3 + 1;
            int i5 = byteArrayExtra[i4] & 255;
            int i6 = i4 + i5;
            if (i6 > byteArrayExtra.length - 1) {
                break;
            }
            int i7 = i5 / 4;
            if (i7 > 0) {
                bArr = (byte[][]) Array.newInstance(Byte.TYPE, i7, 4);
                for (int i8 = 0; i8 < i7; i8++) {
                    System.arraycopy(byteArrayExtra, i3 + 2 + (i8 * 4), bArr[i8], 0, 4);
                }
            }
            i = i6 + 1;
            DoaminIP doaminIP = new DoaminIP();
            doaminIP.name = str;
            doaminIP.ip = bArr;
            arrayList.add(doaminIP);
        }
        return arrayList;
    }
}
