package com.taobao.runtimepermission.group.strategy;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.MegaPermissionAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gjb;
import tb.p10;
import tb.qzl;
import tb.xla;
import tb.xyl;
import tb.yla;
import tb.zla;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MediaPermissionStrategy extends p10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f11508a = p();
    public final Map<String, String> b = q();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements gjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xla f11509a;
        public final /* synthetic */ zla.a b;

        public a(xla xlaVar, zla.a aVar) {
            this.f11509a = xlaVar;
            this.b = aVar;
        }

        @Override // tb.gjb
        public void a(qzl qzlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
            } else {
                ((MegaPermissionAbility.a) this.b).a(MediaPermissionStrategy.i(qzlVar, MediaPermissionStrategy.h(MediaPermissionStrategy.this), this.f11509a.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements gjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xla f11510a;
        public final /* synthetic */ zla.a b;

        public b(xla xlaVar, zla.a aVar) {
            this.f11510a = xlaVar;
            this.b = aVar;
        }

        @Override // tb.gjb
        public void a(qzl qzlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
            } else {
                ((MegaPermissionAbility.a) this.b).a(MediaPermissionStrategy.j(qzlVar, MediaPermissionStrategy.h(MediaPermissionStrategy.this), this.f11510a.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements gjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f11511a;
        public final /* synthetic */ xla b;
        public final /* synthetic */ zla.a c;

        public c(MediaPermissionStrategy mediaPermissionStrategy, Map map, xla xlaVar, zla.a aVar) {
            this.f11511a = map;
            this.b = xlaVar;
            this.c = aVar;
        }

        @Override // tb.gjb
        public void a(qzl qzlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
            } else {
                ((MegaPermissionAbility.a) this.c).a(MediaPermissionStrategy.i(qzlVar, this.f11511a, this.b.b));
            }
        }
    }

    public static yla A(qzl qzlVar, Map<String, String> map, String[] strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("4707a7e7", new Object[]{qzlVar, map, strArr});
        }
        int i2 = -1;
        while (true) {
            String[] strArr2 = qzlVar.f27021a;
            if (i >= strArr2.length) {
                return B(qzlVar, qzl.a(new String[]{xyl.READ_MEDIA_VISUAL_USER_SELECTED}, new int[]{i2}), map, strArr);
            }
            if (xyl.READ_MEDIA_VISUAL_USER_SELECTED.equals(strArr2[i])) {
                i2 = qzlVar.b[i];
            }
            i++;
        }
    }

    public static yla B(qzl qzlVar, qzl qzlVar2, Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("4a9d637", new Object[]{qzlVar, qzlVar2, map, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String str2 = map.get(str);
            if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str2)) {
                hashMap.put(str, "AUTHORIZED");
            } else {
                int i = 0;
                while (true) {
                    String[] strArr2 = qzlVar.f27021a;
                    if (i >= strArr2.length) {
                        break;
                    } else if (strArr2[i].equals(str2)) {
                        hashMap.put(str, p10.e(qzlVar.b[i]));
                        break;
                    } else {
                        i++;
                    }
                }
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, "UNSUPPORTED");
                } else if ((xyl.READ_MEDIA_IMAGES.equals(str2) || xyl.READ_MEDIA_VIDEO.equals(str2)) && "DENIED".equals(hashMap.get(str)) && qzlVar2.b[0] == 0) {
                    hashMap.put(str, "PARTIAL_AUTHORIZED");
                }
            }
        }
        return new yla(true, hashMap, null, null);
    }

    public static /* synthetic */ Map h(MediaPermissionStrategy mediaPermissionStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("50134aaa", new Object[]{mediaPermissionStrategy});
        }
        return mediaPermissionStrategy.b;
    }

    public static /* synthetic */ yla i(qzl qzlVar, Map map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("4eb40d2a", new Object[]{qzlVar, map, strArr});
        }
        return z(qzlVar, map, strArr);
    }

    public static /* synthetic */ Object ipc$super(MediaPermissionStrategy mediaPermissionStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/runtimepermission/group/strategy/MediaPermissionStrategy");
    }

    public static /* synthetic */ yla j(qzl qzlVar, Map map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("88415eeb", new Object[]{qzlVar, map, strArr});
        }
        return A(qzlVar, map, strArr);
    }

    public static Map<String, String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5360e788", new Object[0]);
        }
        return Collections.unmodifiableMap(new HashMap<String, String>() { // from class: com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy.1
            {
                put("READ_IMAGES", "android.permission.READ_EXTERNAL_STORAGE");
                put("WRITE_IMAGES", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_VIDEO", "android.permission.READ_EXTERNAL_STORAGE");
                put("WRITE_VIDEO", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_AUDIO", "android.permission.READ_EXTERNAL_STORAGE");
                put("WRITE_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        });
    }

    public static Map<String, String> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("69047361", new Object[0]);
        }
        return Collections.unmodifiableMap(new HashMap<String, String>() { // from class: com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy.2
            {
                put("READ_IMAGES", xyl.READ_MEDIA_IMAGES);
                put("WRITE_IMAGES", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_VIDEO", xyl.READ_MEDIA_VIDEO);
                put("WRITE_VIDEO", "android.permission.WRITE_EXTERNAL_STORAGE");
                put("READ_AUDIO", "android.permission.READ_MEDIA_AUDIO");
                put("WRITE_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        });
    }

    public static yla r(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("f6ac5688", new Object[]{strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, "AUTHORIZED");
        }
        return new yla(true, hashMap, null, null);
    }

    public static List<String> y(Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6d91731e", new Object[]{map, strArr});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String str2 = map.get(str);
            if (!"android.permission.WRITE_EXTERNAL_STORAGE".equals(str2) && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static yla z(qzl qzlVar, Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("af20b638", new Object[]{qzlVar, map, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String str2 = map.get(str);
            if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str2)) {
                hashMap.put(str, "AUTHORIZED");
            } else {
                int i = 0;
                while (true) {
                    String[] strArr2 = qzlVar.f27021a;
                    if (i >= strArr2.length) {
                        break;
                    } else if (strArr2[i].equals(str2)) {
                        hashMap.put(str, p10.e(qzlVar.b[i]));
                        break;
                    } else {
                        i++;
                    }
                }
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, "UNSUPPORTED");
                }
            }
        }
        return new yla(true, hashMap, null, null);
    }

    @Override // tb.p10
    public yla a(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("e19bf5b9", new Object[]{this, context, str, strArr});
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return m(context, str, strArr);
        }
        if (i == 33) {
            return o(context, str, strArr);
        }
        if (i >= 29) {
            return l(context, str, strArr);
        }
        return n(context, str, strArr);
    }

    @Override // tb.p10
    public void c(xla xlaVar, zla.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de6e0f8", new Object[]{this, xlaVar, aVar});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            v(xlaVar, aVar);
        } else if (i == 33) {
            x(xlaVar, aVar);
        } else if (i >= 29) {
            u(xlaVar, aVar);
        } else {
            w(xlaVar, aVar);
        }
    }

    public final yla l(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("5059cb3b", new Object[]{this, context, str, strArr});
        }
        return k(this.f11508a, context, str, strArr);
    }

    public final yla n(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("f7f64027", new Object[]{this, context, str, strArr});
        }
        return p10.b(context, str, strArr, this.f11508a);
    }

    public final yla o(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("8f27d74b", new Object[]{this, context, str, strArr});
        }
        return k(this.b, context, str, strArr);
    }

    public final void s(String[] strArr, xla xlaVar, gjb gjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca353c32", new Object[]{this, strArr, xlaVar, gjbVar});
        } else {
            com.taobao.runtimepermission.a.c(xlaVar.f31453a, strArr).x(xlaVar.e).B(xlaVar.f).w(xlaVar.d).t(xlaVar.c).y(xlaVar.g).u(gjbVar).m();
        }
    }

    public final void t(Map<String, String> map, xla xlaVar, zla.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5207", new Object[]{this, map, xlaVar, aVar});
            return;
        }
        List<String> y = y(map, xlaVar.b);
        if (y.isEmpty()) {
            ((MegaPermissionAbility.a) aVar).a(r(xlaVar.b));
        } else {
            s((String[]) y.toArray(new String[0]), xlaVar, new c(this, map, xlaVar, aVar));
        }
    }

    public final void u(xla xlaVar, zla.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32bb23a", new Object[]{this, xlaVar, aVar});
        } else {
            t(this.f11508a, xlaVar, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(tb.xla r6, tb.zla.a r7) {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "9d0d3d60"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r0 = 1
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.b
            java.lang.String[] r2 = r6.b
            java.util.List r1 = y(r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0032
            java.lang.String[] r6 = r6.b
            tb.yla r6 = r(r6)
            com.taobao.runtimepermission.MegaPermissionAbility$a r7 = (com.taobao.runtimepermission.MegaPermissionAbility.a) r7
            r7.a(r6)
            return
        L_0x0032:
            java.util.Iterator r2 = r1.iterator()
        L_0x0036:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "android.permission.READ_MEDIA_IMAGES"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0052
            java.lang.String r4 = "android.permission.READ_MEDIA_VIDEO"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0036
        L_0x0052:
            java.lang.String r2 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            r1.add(r2)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy$b r1 = new com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy$b
            r1.<init>(r6, r7)
            goto L_0x0072
        L_0x0065:
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy$a r1 = new com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy$a
            r1.<init>(r6, r7)
        L_0x0072:
            r5.s(r0, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.runtimepermission.group.strategy.MediaPermissionStrategy.v(tb.xla, tb.zla$a):void");
    }

    public final void w(xla xlaVar, zla.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17552126", new Object[]{this, xlaVar, aVar});
        } else {
            p10.d(xlaVar, aVar, this.f11508a);
        }
    }

    public final void x(xla xlaVar, zla.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b60f64a", new Object[]{this, xlaVar, aVar});
        } else {
            t(this.b, xlaVar, aVar);
        }
    }

    public static yla k(Map<String, String> map, Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("8573b688", new Object[]{map, context, str, strArr});
        }
        List<String> y = y(map, strArr);
        if (y.isEmpty()) {
            return r(strArr);
        }
        qzl d = com.taobao.runtimepermission.a.d(context, str, (String[]) y.toArray(new String[0]));
        if (d == null) {
            return new yla(false, null, "UNKNOWN_BIZ_ERROR", "permission result is null");
        }
        return z(d, map, strArr);
    }

    public final yla m(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("36cf161", new Object[]{this, context, str, strArr});
        }
        List<String> y = y(this.b, strArr);
        if (y.isEmpty()) {
            return r(strArr);
        }
        qzl d = com.taobao.runtimepermission.a.d(context, str, (String[]) y.toArray(new String[0]));
        qzl d2 = com.taobao.runtimepermission.a.d(context, str, new String[]{xyl.READ_MEDIA_VISUAL_USER_SELECTED});
        if (d == null || d2 == null) {
            return new yla(false, null, "UNKNOWN_BIZ_ERROR", "permission result is null");
        }
        return B(d, d2, this.b, strArr);
    }
}
