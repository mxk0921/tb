package com.taobao.tao.flexbox.layoutmanager.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import tb.igs;
import tb.t2o;
import tb.tfs;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f12216a;
        public int b = 0;

        static {
            t2o.a(503317041);
        }

        public a(byte[] bArr) {
            this.f12216a = bArr;
        }

        public static int m(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a89f614", new Object[]{bArr, new Integer(i)})).intValue();
            }
            int i2 = 2 + i;
            return ((bArr[i + 3] & 255) << 24) | ((bArr[1 + i] & 255) << 8) | (bArr[i] & 255) | ((bArr[i2] & 255) << 16);
        }

        public static long n(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("28f086d2", new Object[]{bArr, new Integer(i)})).longValue();
            }
            return ((((bArr[i + 7] & 255) << 24) | (((bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8)) | ((bArr[i + 6] & 255) << 16))) << 32) | ((((bArr[1 + i] & 255) << 8) | (bArr[i] & 255) | ((bArr[2 + i] & 255) << 16) | ((bArr[i + 3] & 255) << 24)) & tiv.INT_MASK);
        }

        public static short o(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bb433e31", new Object[]{bArr, new Integer(i)})).shortValue();
            }
            return (short) ((bArr[i] & 255) | (bArr[1 + i] << 8));
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab4a9b58", new Object[]{this})).booleanValue();
            }
            if (this.b > this.f12216a.length - 1) {
                return true;
            }
            return false;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c64e37d", new Object[]{this})).booleanValue();
            }
            if (c() != 0) {
                return true;
            }
            return false;
        }

        public byte c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c765ef1", new Object[]{this})).byteValue();
            }
            byte[] bArr = this.f12216a;
            int i = this.b;
            byte b = bArr[i];
            this.b = i + 1;
            return b;
        }

        public byte[] d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("8f3337f6", new Object[]{this, new Integer(i)});
            }
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr2 = this.f12216a;
                int i3 = this.b;
                bArr[i2] = bArr2[i3];
                this.b = i3 + 1;
            }
            return bArr;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b268c8b3", new Object[]{this})).intValue();
            }
            int m = m(this.f12216a, this.b);
            this.b += 4;
            return m;
        }

        public long g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22ea6d", new Object[]{this})).longValue();
            }
            long n = n(this.f12216a, this.b);
            this.b += 8;
            return n;
        }

        public short h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8679dc4a", new Object[]{this})).shortValue();
            }
            short o = o(this.f12216a, this.b);
            this.b += 2;
            return o;
        }

        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5d5a5b2d", new Object[]{this})).intValue();
            }
            return c() & 255;
        }

        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("521566ab", new Object[]{this})).intValue();
            }
            return h() & 65535;
        }

        public String k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6faa3475", new Object[]{this, new Integer(i)});
            }
            try {
                String str = new String(this.f12216a, this.b, i, "utf-8");
                this.b += i;
                return str;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "";
            }
        }

        public long l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4635f07a", new Object[]{this})).longValue();
            }
            long b = d.b(this.f12216a, this.b);
            this.b += d.a(b);
            return b;
        }

        public void p(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("455ade67", new Object[]{this, bArr});
                return;
            }
            this.f12216a = bArr;
            this.b = 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final long f12217a = (long) Math.pow(2.0d, 7.0d);
        public static final long b = (long) Math.pow(2.0d, 14.0d);
        public static final long c = (long) Math.pow(2.0d, 21.0d);
        public static final long d = (long) Math.pow(2.0d, 28.0d);
        public static final long e = (long) Math.pow(2.0d, 35.0d);
        public static final long f = (long) Math.pow(2.0d, 42.0d);
        public static final long g = (long) Math.pow(2.0d, 49.0d);
        public static final long h = (long) Math.pow(2.0d, 56.0d);
        public static final long i = (long) Math.pow(2.0d, 63.0d);

        static {
            t2o.a(503317044);
        }

        public static int a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a32451e2", new Object[]{new Long(j)})).intValue();
            }
            if (j < f12217a) {
                return 1;
            }
            if (j < b) {
                return 2;
            }
            if (j < c) {
                return 3;
            }
            if (j < d) {
                return 4;
            }
            if (j < e) {
                return 5;
            }
            if (j < f) {
                return 6;
            }
            if (j < g) {
                return 7;
            }
            if (j < h) {
                return 8;
            }
            if (j < i) {
                return 9;
            }
            return 10;
        }

        public static long b(byte[] bArr, int i2) {
            double d2;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65e1f77b", new Object[]{bArr, new Integer(i2)})).longValue();
            }
            int length = bArr.length;
            long j = 0;
            while (true) {
                if (i2 >= length || i3 > 49) {
                    tfs.d("Could not decode varint");
                }
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                int i5 = b2 & 255;
                double d3 = j;
                int i6 = b2 & Byte.MAX_VALUE;
                if (i3 < 28) {
                    d2 = i6 << i3;
                } else {
                    d2 = i6 * Math.pow(2.0d, i3);
                }
                j = (long) (d3 + d2);
                i3 += 7;
                if (i5 < 128) {
                    return j;
                }
                i2 = i4;
            }
        }

        public static List<Number> c(List<Number> list) {
            Number number;
            int i2;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("1f09c3c6", new Object[]{list});
            }
            ArrayList arrayList = new ArrayList(list.size());
            while (i3 < list.size()) {
                Number number2 = list.get(i3);
                if (number2.longValue() == 0) {
                    i2 = list.get(i3 + 1).intValue();
                    i3 += 2;
                    number = list.get(i3);
                } else {
                    number = number2;
                    i2 = 1;
                }
                while (true) {
                    int i4 = i2 - 1;
                    if (i2 > 0) {
                        if (number instanceof Long) {
                            arrayList.add(Long.valueOf(number.longValue() - 1));
                        } else {
                            arrayList.add(Integer.valueOf(number.intValue() - 1));
                        }
                        i2 = i4;
                    }
                }
                i3++;
            }
            return arrayList;
        }

        public static long d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e09740bb", new Object[]{new Long(j)})).longValue();
            }
            return (-(j & 1)) ^ (j >> 1);
        }
    }

    static {
        t2o.a(503317040);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr2;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d66581c", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        byte[] bArr3 = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        byteArrayOutputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr, i, bArr.length);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    try {
                        byte[] bArr4 = new byte[1024];
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(i2);
                        while (true) {
                            try {
                                int read = gZIPInputStream.read(bArr4, 0, 1024);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr4, 0, read);
                            } catch (Exception e2) {
                                e = e2;
                                bArr2 = bArr3;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                e.printStackTrace();
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                return bArr2;
                            } catch (Throwable th2) {
                                th = th2;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException e8) {
                                        e8.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                        bArr3 = byteArrayOutputStream2.toByteArray();
                        byteArrayOutputStream2.flush();
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                        try {
                            gZIPInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        try {
                            byteArrayInputStream.close();
                            return bArr3;
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            return bArr3;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        bArr2 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e13) {
                e = e13;
                gZIPInputStream = null;
                bArr2 = null;
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
            }
        } catch (Exception e14) {
            e = e14;
            gZIPInputStream = null;
            bArr2 = null;
            byteArrayInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
        }
    }

    public static void a(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b80a25", new Object[]{obj});
        } else if (obj instanceof List) {
            while (true) {
                List list = (List) obj;
                if (i < list.size()) {
                    f.h b2 = f.h.b((Map) list.get(i));
                    list.set(i, b2);
                    List list2 = b2.c;
                    if (list2 != null) {
                        a(list2);
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            for (Map.Entry entry : map.entrySet()) {
                if ((entry.getValue() instanceof Map) && ((Map) entry.getValue()).containsKey("uid")) {
                    f.h b3 = f.h.b((Map) entry.getValue());
                    map.put(entry.getKey(), b3);
                    a(b3.c);
                }
            }
        }
    }

    public static Object b(byte[] bArr) {
        Object obj;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9d3db81a", new Object[]{bArr});
        }
        a aVar = new a(bArr);
        if (aVar.i() == 116) {
            int i = aVar.i();
            boolean b2 = aVar.b();
            int i2 = aVar.i();
            int f = aVar.f();
            if (b2) {
                aVar.p(c(bArr, aVar.e(), f));
            }
            if (i == 1) {
                igs.a("parse Binary DSL V1");
                obj = c.a(aVar);
            } else {
                igs.a("parse Binary DSL V0");
                if (i2 == 1) {
                    z = true;
                }
                obj = b.b(aVar, z);
            }
            igs.c();
            return obj;
        }
        igs.a("parse JSON DSL");
        try {
            JSONObject parseObject = JSON.parseObject(new String(bArr, 0, bArr.length, "utf-8"));
            a(parseObject);
            igs.c();
            return parseObject;
        } catch (Exception e) {
            e.printStackTrace();
            igs.c();
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int t_bin = 7;
        public static final int t_bool_false = 0;
        public static final int t_bool_true = 1;
        public static final int t_float = 5;
        public static final int t_int = 4;
        public static final int t_list = 3;
        public static final int t_map = 2;
        public static final int t_max = 10;
        public static final int t_string = 6;

        static {
            t2o.a(503317043);
        }

        public static Object a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("ec36ae21", new Object[]{aVar});
            }
            ArrayList arrayList = new ArrayList();
            long l = aVar.l();
            ArrayList arrayList2 = new ArrayList((int) l);
            while (true) {
                l--;
                if (l <= 0) {
                    break;
                }
                arrayList2.add(Long.valueOf(aVar.l()));
            }
            List<Number> c = d.c(arrayList2);
            long longValue = c.get(0).longValue();
            ArrayList arrayList3 = new ArrayList((int) longValue);
            int i = 1;
            while (true) {
                longValue--;
                if (longValue <= 0) {
                    break;
                }
                i++;
                arrayList3.add(Integer.valueOf(c.get(i).intValue()));
            }
            int i2 = i + 1;
            long longValue2 = c.get(i).longValue();
            ArrayList arrayList4 = new ArrayList((int) longValue2);
            while (true) {
                longValue2--;
                if (longValue2 <= 0) {
                    break;
                }
                i2++;
                arrayList4.add(Long.valueOf(d.d(c.get(i2).longValue())));
            }
            int i3 = i2 + 1;
            long longValue3 = c.get(i2).longValue();
            ArrayList arrayList5 = new ArrayList((int) longValue3);
            while (true) {
                longValue3--;
                if (longValue3 <= 0) {
                    break;
                }
                i3++;
                arrayList5.add(Long.valueOf(c.get(i3).longValue()));
            }
            List<Number> subList = c.subList(i3, c.size());
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.k(((Integer) it.next()).intValue()));
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList.add((Number) it2.next());
            }
            long l2 = aVar.l();
            while (true) {
                l2--;
                if (l2 <= 0) {
                    break;
                }
                arrayList.add(Double.valueOf(Double.longBitsToDouble(aVar.g())));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList.add(aVar.d((int) ((Long) it3.next()).longValue()));
            }
            ArrayList arrayList6 = new ArrayList();
            int i4 = 0;
            while (i4 < subList.size()) {
                int intValue = subList.get(i4).intValue();
                if (intValue == 0) {
                    arrayList6.add(Boolean.FALSE);
                } else if (intValue == 1) {
                    arrayList6.add(Boolean.TRUE);
                } else if (intValue == 2) {
                    HashMap hashMap = new HashMap();
                    i4++;
                    int intValue2 = subList.get(i4).intValue();
                    ArrayList arrayList7 = new ArrayList();
                    while (true) {
                        intValue2--;
                        if (intValue2 <= 0) {
                            break;
                        }
                        arrayList7.add(arrayList6.remove(arrayList6.size() - 1));
                    }
                    Iterator it4 = arrayList7.iterator();
                    boolean z = false;
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        Object remove = arrayList6.remove(arrayList6.size() - 1);
                        if ("uid".equals(remove)) {
                            z = true;
                        }
                        hashMap.put(remove, next);
                    }
                    if (z) {
                        arrayList6.add(f.h.b(hashMap));
                    } else {
                        arrayList6.add(hashMap);
                    }
                } else if (intValue == 3) {
                    ArrayList arrayList8 = new ArrayList();
                    i4++;
                    int intValue3 = subList.get(i4).intValue();
                    while (true) {
                        intValue3--;
                        if (intValue3 <= 0) {
                            break;
                        }
                        arrayList8.add(arrayList6.remove(arrayList6.size() - 1));
                    }
                    arrayList6.add(arrayList8);
                } else if (intValue != 4) {
                    arrayList6.add(arrayList.get(intValue - 10));
                } else {
                    i4++;
                    arrayList6.add(subList.get(i4));
                }
                i4++;
            }
            return arrayList6.get(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int t_boolean = 7;
        public static final int t_double = 6;
        public static final int t_float = 5;
        public static final int t_list = 1;
        public static final int t_lstring = 4;
        public static final int t_map = 0;
        public static final int t_mref = 13;
        public static final int t_mstring = 3;
        public static final int t_ref = 12;
        public static final int t_ref0 = 14;
        public static final int t_ref1 = 15;
        public static final int t_ref2 = 16;
        public static final int t_ref3 = 17;
        public static final int t_ref4 = 18;
        public static final int t_ref5 = 19;
        public static final int t_ref6 = 20;
        public static final int t_ref7 = 21;
        public static final int t_ref8 = 22;
        public static final int t_ref9 = 23;
        public static final int t_string = 2;
        public static final int t_uint16 = 9;
        public static final int t_uint32 = 10;
        public static final int t_uint64 = 11;
        public static final int t_uint8 = 8;

        static {
            t2o.a(503317042);
        }

        public static Object b(a aVar, boolean z) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("b0b32dcf", new Object[]{aVar, new Boolean(z)});
            }
            ArrayList arrayList = new ArrayList(200);
            int j = aVar.j();
            ArrayList arrayList2 = new ArrayList(j);
            while (true) {
                int i2 = j - 1;
                if (j > 0) {
                    if (z) {
                        i = aVar.j();
                    } else {
                        i = aVar.i();
                    }
                    if (i > 0) {
                        arrayList2.add(aVar.k(i));
                    } else {
                        arrayList2.add("");
                    }
                    j = i2;
                }
            }
            while (!aVar.a()) {
                a(aVar.i(), aVar, arrayList, arrayList2);
            }
            return arrayList.get(0);
        }

        public static void a(int i, a aVar, List list, List list2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfb5f5eb", new Object[]{new Integer(i), aVar, list, list2});
            } else if (i != 255) {
                switch (i) {
                    case 0:
                        int j = aVar.j();
                        HashMap hashMap = new HashMap(j);
                        int size = list.size();
                        int i2 = j;
                        while (true) {
                            i2--;
                            if (i2 > 0) {
                                size--;
                                Object obj = list.get(size);
                                String str = (String) list.get(size - j);
                                hashMap.put(str, obj);
                                if (str.equals("uid")) {
                                    z = true;
                                }
                            } else {
                                int size2 = list.size();
                                for (int i3 = size2 - 1; i3 >= size2 - (j * 2); i3--) {
                                    list.remove(i3);
                                }
                                if (z) {
                                    list.add(f.h.b(hashMap));
                                    return;
                                } else {
                                    list.add(hashMap);
                                    return;
                                }
                            }
                        }
                    case 1:
                        int j2 = aVar.j();
                        ArrayList arrayList = new ArrayList(j2);
                        int size3 = list.size();
                        while (true) {
                            j2--;
                            if (j2 > 0) {
                                size3--;
                                arrayList.add(list.remove(size3));
                            } else {
                                list.add(arrayList);
                                return;
                            }
                        }
                    case 2:
                        int i4 = aVar.i();
                        if (i4 > 0) {
                            list.add(aVar.k(i4));
                            return;
                        } else {
                            list.add("");
                            return;
                        }
                    case 3:
                        int j3 = aVar.j();
                        if (j3 > 0) {
                            list.add(aVar.k(j3));
                            return;
                        } else {
                            list.add("");
                            return;
                        }
                    case 4:
                        int f = aVar.f();
                        if (f > 0) {
                            list.add(aVar.k(f));
                            return;
                        } else {
                            list.add("");
                            return;
                        }
                    case 5:
                        list.add(Float.valueOf(Float.intBitsToFloat(aVar.f())));
                        return;
                    case 6:
                        list.add(Double.valueOf(Double.longBitsToDouble(aVar.g())));
                        return;
                    case 7:
                        list.add(Boolean.valueOf(aVar.b()));
                        return;
                    case 8:
                        list.add(Integer.valueOf(aVar.i()));
                        return;
                    case 9:
                        list.add(Integer.valueOf(aVar.j()));
                        return;
                    case 10:
                        list.add(Integer.valueOf(aVar.f()));
                        return;
                    case 11:
                        list.add(Long.valueOf(aVar.g()));
                        return;
                    case 12:
                        list.add(list2.get(aVar.j()));
                        return;
                    case 13:
                        list.add(list2.get(aVar.i()));
                        return;
                    case 14:
                        list.add(list2.get(0));
                        return;
                    case 15:
                        list.add(list2.get(1));
                        return;
                    case 16:
                        list.add(list2.get(2));
                        return;
                    case 17:
                        list.add(list2.get(3));
                        return;
                    case 18:
                        list.add(list2.get(4));
                        return;
                    case 19:
                        list.add(list2.get(5));
                        return;
                    case 20:
                        list.add(list2.get(6));
                        return;
                    case 21:
                        list.add(list2.get(7));
                        return;
                    case 22:
                        list.add(list2.get(8));
                        return;
                    case 23:
                        list.add(list2.get(9));
                        return;
                    default:
                        return;
                }
            } else {
                int i5 = aVar.i();
                int i6 = aVar.i();
                while (true) {
                    i6--;
                    if (i6 > 0) {
                        a(i5, aVar, list, list2);
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
