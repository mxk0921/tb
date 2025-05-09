package com.taobao.runtimepermission;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsPermissionAbility;
import com.taobao.android.abilityidl.ability.PermissionRequestPermissionEvent;
import com.taobao.android.abilityidl.ability.PermissionResult;
import java.util.HashMap;
import java.util.List;
import tb.gjb;
import tb.k8d;
import tb.kdb;
import tb.lzl;
import tb.myl;
import tb.mzl;
import tb.o8d;
import tb.p8d;
import tb.qzl;
import tb.xla;
import tb.yla;
import tb.zla;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MegaPermissionAbility extends AbsPermissionAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements zla.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o8d f11496a;

        public a(MegaPermissionAbility megaPermissionAbility, o8d o8dVar) {
            this.f11496a = o8dVar;
        }

        public void a(yla ylaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fad10902", new Object[]{this, ylaVar});
            } else if (ylaVar.f32166a) {
                this.f11496a.b(MegaPermissionAbility.access$000(ylaVar));
            } else {
                this.f11496a.O(new ErrorResult(ylaVar.c, ylaVar.d));
            }
        }
    }

    public static PermissionResult a(yla ylaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("fc7b6e9d", new Object[]{ylaVar});
        }
        PermissionResult permissionResult = new PermissionResult();
        permissionResult.COARSE_LOCATION = ylaVar.b.get("COARSE_LOCATION");
        permissionResult.FINE_LOCATION = ylaVar.b.get("FINE_LOCATION");
        permissionResult.READ_CALENDAR = ylaVar.b.get("READ_CALENDAR");
        permissionResult.WRITE_CALENDAR = ylaVar.b.get("WRITE_CALENDAR");
        permissionResult.READ_CONTACTS = ylaVar.b.get("READ_CONTACTS");
        permissionResult.WRITE_CONTACTS = ylaVar.b.get("WRITE_CONTACTS");
        permissionResult.READ_IMAGES = ylaVar.b.get("READ_IMAGES");
        permissionResult.WRITE_IMAGES = ylaVar.b.get("WRITE_IMAGES");
        permissionResult.READ_VIDEO = ylaVar.b.get("READ_VIDEO");
        permissionResult.WRITE_VIDEO = ylaVar.b.get("WRITE_VIDEO");
        permissionResult.READ_AUDIO = ylaVar.b.get("READ_AUDIO");
        permissionResult.WRITE_AUDIO = ylaVar.b.get("WRITE_AUDIO");
        permissionResult.RECORD_AUDIO = ylaVar.b.get("RECORD_AUDIO");
        permissionResult.TAKE_CAMERA = ylaVar.b.get("TAKE_CAMERA");
        permissionResult.READ_PASTEBOARD = ylaVar.b.get("READ_PASTEBOARD");
        return permissionResult;
    }

    public static /* synthetic */ PermissionResult access$000(yla ylaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("782491f8", new Object[]{ylaVar});
        }
        return a(ylaVar);
    }

    public static /* synthetic */ Object ipc$super(MegaPermissionAbility megaPermissionAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/runtimepermission/MegaPermissionAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPermissionAbility
    public void check(kdb kdbVar, myl mylVar, k8d k8dVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8b9f3c", new Object[]{this, kdbVar, mylVar, k8dVar});
            return;
        }
        String[] strArr = null;
        if (kdbVar.a() == null) {
            context = null;
        } else {
            context = kdbVar.a().getContext();
        }
        List<String> list = mylVar.f24393a;
        if (list != null) {
            strArr = (String[]) list.toArray(new String[0]);
        }
        yla a2 = zla.a(context, mylVar.b, strArr);
        if (a2.f32166a) {
            k8dVar.b(a(a2));
        } else {
            k8dVar.O(new ErrorResult(a2.c, a2.d));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPermissionAbility
    public void request(kdb kdbVar, lzl lzlVar, o8d o8dVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b23c35", new Object[]{this, kdbVar, lzlVar, o8dVar});
            return;
        }
        String[] strArr = null;
        if (kdbVar.a() == null) {
            context = null;
        } else {
            context = kdbVar.a().getContext();
        }
        List<String> list = lzlVar.f23665a;
        if (list != null) {
            strArr = (String[]) list.toArray(new String[0]);
        }
        xla xlaVar = new xla();
        xlaVar.f31453a = context;
        xlaVar.b = strArr;
        xlaVar.c = lzlVar.b;
        xlaVar.d = lzlVar.c;
        xlaVar.g = lzlVar.d;
        xlaVar.e = true;
        xlaVar.f = true;
        zla.b(xlaVar, new a(this, o8dVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPermissionAbility
    public void requestPermission(kdb kdbVar, mzl mzlVar, p8d p8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9d2306", new Object[]{this, kdbVar, mzlVar, p8dVar});
        } else {
            b.b(kdbVar, mzlVar, p8dVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a implements gjb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p8d f11497a;

            public a(p8d p8dVar) {
                this.f11497a = p8dVar;
            }

            @Override // tb.gjb
            public void a(qzl qzlVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
                } else {
                    this.f11497a.q1(b.a(qzlVar));
                }
            }
        }

        public static /* synthetic */ PermissionRequestPermissionEvent a(qzl qzlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PermissionRequestPermissionEvent) ipChange.ipc$dispatch("11fb801e", new Object[]{qzlVar});
            }
            return c(qzlVar);
        }

        public static void b(kdb kdbVar, mzl mzlVar, p8d p8dVar) {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f9d2306", new Object[]{kdbVar, mzlVar, p8dVar});
                return;
            }
            String[] strArr = null;
            if (kdbVar.a() == null) {
                context = null;
            } else {
                context = kdbVar.a().getContext();
            }
            List<String> list = mzlVar.f24412a;
            if (list != null) {
                strArr = (String[]) list.toArray(new String[0]);
            }
            if (context == null || TextUtils.isEmpty(mzlVar.b) || strArr == null || strArr.length == 0) {
                p8dVar.O(new ErrorResult("UNKNOWN_BIZ_ERROR", "invalid parameter"));
                return;
            }
            String[] strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr2[i] = "android.permission." + strArr[i];
            }
            try {
                com.taobao.runtimepermission.a.c(context, strArr2).x(true).t(mzlVar.b).B(true).w(mzlVar.c).y(mzlVar.d).u(new a(p8dVar)).m();
            } catch (Exception e) {
                p8dVar.O(new ErrorResult("UNKNOWN_BIZ_ERROR", e.toString()));
            }
        }

        public static PermissionRequestPermissionEvent c(qzl qzlVar) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PermissionRequestPermissionEvent) ipChange.ipc$dispatch("1f410cd8", new Object[]{qzlVar});
            }
            PermissionRequestPermissionEvent permissionRequestPermissionEvent = new PermissionRequestPermissionEvent();
            if (!(qzlVar.f27021a == null || qzlVar.b == null)) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr = qzlVar.f27021a;
                    if (i >= strArr.length) {
                        break;
                    }
                    String replace = strArr[i].replace("android.permission.", "");
                    int i2 = qzlVar.b[i];
                    if (i2 == -1) {
                        hashMap.put(replace, "denied");
                    } else if (i2 != 0) {
                        hashMap.put(replace, "unsupport");
                    } else {
                        hashMap.put(replace, "authorized");
                    }
                    i++;
                }
                permissionRequestPermissionEvent.result = hashMap;
            }
            return permissionRequestPermissionEvent;
        }
    }
}
