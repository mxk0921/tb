package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavix.bhxbridge.BHXCXXActionBridge;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.v82;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cqv extends eqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f17237a;
    public static int b;
    public static double c;
    public static String d;
    public static List<BHXVisualCenterItem> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17238a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ String[] f;

        public a(String str, String str2, String str3, long j, Map map, String[] strArr) {
            this.f17238a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
            this.e = map;
            this.f = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                BHXCXXActionBridge.commitRequest(NativeDelegate.SETTING_BIZ, gwv.h(this.f17238a), this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17239a;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Map d;

        public b(String str, List list, boolean z, Map map) {
            this.f17239a = str;
            this.b = list;
            this.c = z;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                BHXCXXActionBridge.commitVisualCenter(gwv.h(this.f17239a), this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f17240a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public c(WeakReference weakReference, String str, long j) {
            this.f17240a = weakReference;
            this.b = str;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                oo2.f("initConfig");
                Object obj = this.f17240a.get();
                if (obj == null || TextUtils.isEmpty(this.b)) {
                    TLog.loge("behavix_track", eqv.TAG, "commitAppIn context or scene empty");
                    q82.b("logic", this.b, null, "logic_error", "commitAppIn context or scene empty");
                    return;
                }
                BHXCXXActionBridge.commitAppIn(this.b, obj.hashCode() + this.b, this.c);
                uep.b();
                o82.c().d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f17241a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public d(WeakReference weakReference, String str, long j) {
            this.f17241a = weakReference;
            this.b = str;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                Object obj = this.f17241a.get();
                if (obj == null || TextUtils.isEmpty(this.b)) {
                    TLog.loge("behavix_track", eqv.TAG, "commitAppOut context or scene empty");
                    q82.b("logic", this.b, null, "logic_error", "commitAppOut context or scene empty");
                    return;
                }
                BHXCXXActionBridge.commitAppOut(this.b, obj.hashCode() + this.b, this.c);
                o82.c().f();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17242a;
        public final /* synthetic */ WeakReference b;
        public final /* synthetic */ Map c;

        public e(String str, WeakReference weakReference, Map map) {
            this.f17242a = str;
            this.b = weakReference;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                String h = gwv.h(this.f17242a);
                if (this.b.get() == null || TextUtils.isEmpty(h)) {
                    TLog.loge("behavix_track", eqv.TAG, "updateSceneBizArgs context or scene empty");
                    return;
                }
                Map map = this.c;
                BHXCXXActionBridge.updateEnterEvent(h, obj.hashCode() + h, map, hqv.d(map));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17243a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ WeakReference d;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;

        public f(String str, Map map, String[] strArr, WeakReference weakReference, String str2, long j) {
            this.f17243a = str;
            this.b = map;
            this.c = strArr;
            this.d = weakReference;
            this.e = str2;
            this.f = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.cqv.f.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17244a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ WeakReference d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;

        public g(String str, Map map, String[] strArr, WeakReference weakReference, String str2, String str3, long j) {
            this.f17244a = str;
            this.b = map;
            this.c = strArr;
            this.d = weakReference;
            this.e = str2;
            this.f = str3;
            this.g = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                String h = gwv.h(this.f17244a);
                if (!TextUtils.equals(h, SkuLogUtils.PAGE_NAME) || v82.h("enableSKUPV", false)) {
                    String source = eqv.getSource(this.b, this.c);
                    Object obj = this.d.get();
                    if (obj == null || TextUtils.isEmpty(h)) {
                        TLog.loge("behavix_track", eqv.TAG, "commitLeave context or scene empty");
                        return;
                    }
                    BHXCXXActionBridge.commitLeave(source, h, this.e, this.f, this.g, obj.hashCode() + h, i5k.b(obj), this.b, this.c);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17245a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;

        public h(String str, Map map, String[] strArr, String str2, String str3, String str4, long j) {
            this.f17245a = str;
            this.b = map;
            this.c = strArr;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                BHXCXXActionBridge.commitTap(eqv.getSource(this.b, this.c), gwv.h(this.f17245a), this.d, this.e, this.f, this.g, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17246a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public i(String str, Map map, String[] strArr, String str2, String str3) {
            this.f17246a = str;
            this.b = map;
            this.c = strArr;
            this.d = str2;
            this.e = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                String h = gwv.h(this.f17246a);
                String source = eqv.getSource(this.b, this.c);
                if (TextUtils.equals(source, BHRTaskConfigBase.TYPE_CONFIG_UT) || TextUtils.equals(source, "inner")) {
                    BHXCXXActionBridge.commitCustom(source, h, this.d, this.e, this.b, this.c);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17247a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ List g;
        public final /* synthetic */ long h;

        public j(String str, Map map, String[] strArr, String str2, int i, int i2, List list, long j) {
            this.f17247a = str;
            this.b = map;
            this.c = strArr;
            this.d = str2;
            this.e = i;
            this.f = i2;
            this.g = list;
            this.h = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                String h = gwv.h(this.f17247a);
                String source = eqv.getSource(this.b, this.c);
                String str = this.d;
                int i = this.e;
                int i2 = this.f;
                BHXCXXActionBridge.commitScroll(source, h, "scrollStart", str, i, i2, i, i2, "", this.g, this.h, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17248a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ String i;
        public final /* synthetic */ List j;
        public final /* synthetic */ long k;

        public k(String str, Map map, String[] strArr, String str2, int i, int i2, int i3, int i4, String str3, List list, long j) {
            this.f17248a = str;
            this.b = map;
            this.c = strArr;
            this.d = str2;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = str3;
            this.j = list;
            this.k = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                BHXCXXActionBridge.commitScroll(eqv.getSource(this.b, this.c), gwv.h(this.f17248a), fzo.SCROLLING, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17249a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ List h;
        public final /* synthetic */ long i;
        public final /* synthetic */ Map j;
        public final /* synthetic */ String[] k;

        public l(String str, String str2, int i, int i2, int i3, int i4, String str3, List list, long j, Map map, String[] strArr) {
            this.f17249a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = str3;
            this.h = list;
            this.i = j;
            this.j = map;
            this.k = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                BHXCXXActionBridge.commitScroll("", gwv.h(this.f17249a), "scrollEnd", this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17250a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String[] c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ View f;
        public final /* synthetic */ long g;

        public m(String str, Map map, String[] strArr, String str2, String str3, View view, long j) {
            this.f17250a = str;
            this.b = map;
            this.c = strArr;
            this.d = str2;
            this.e = str3;
            this.f = view;
            this.g = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                BHXCXXActionBridge.commitExposeStart(eqv.getSource(this.b, this.c), gwv.h(this.f17250a), this.d, this.e, this.f, this.g, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17251a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ View d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Map f;
        public final /* synthetic */ String[] g;

        public n(String str, String str2, String str3, View view, long j, Map map, String[] strArr) {
            this.f17251a = str;
            this.b = str2;
            this.c = str3;
            this.d = view;
            this.e = j;
            this.f = map;
            this.g = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (v82.r()) {
                BHXCXXActionBridge.commitExposeEnd(gwv.h(this.f17251a), this.b, this.c, this.d, this.e, null, this.f, this.g);
            }
        }
    }

    static {
        t2o.a(404750455);
    }

    public static void A(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761a6532", new Object[]{str, str2, str3, view, strArr});
        } else {
            z(str, str2, str3, view, null, strArr);
        }
    }

    public static void B(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d71aa0f", new Object[]{str, str2, str3, view, map, strArr});
        } else if (!c()) {
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
            u82.f(new n(str, str2, str3, view, System.currentTimeMillis(), hashMap, strArr), str, "expose", str2, strArr);
        }
    }

    public static void C(String str, String str2, String str3, View view, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af0d2a", new Object[]{str, str2, str3, view, strArr});
        } else {
            B(str, str2, str3, view, null, strArr);
        }
    }

    public static void D(String str, String str2, float f2, float f3, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af72b956", new Object[]{str, str2, new Float(f2), new Float(f3), list, map});
        } else {
            E(str, str2, (int) f2, (int) f3, list, map, null);
        }
    }

    public static void F(String str, String str2, int i2, int i3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6050abb8", new Object[]{str, str2, new Integer(i2), new Integer(i3), map, strArr});
        } else {
            E(str, str2, i2, i3, null, null, strArr);
        }
    }

    public static void G(String str, String str2, int i2, int i3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc0ea1", new Object[]{str, str2, new Integer(i2), new Integer(i3), strArr});
        } else {
            F(str, str2, i2, i3, null, strArr);
        }
    }

    public static void H(String str, String str2, float f2, float f3, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681797af", new Object[]{str, str2, new Float(f2), new Float(f3), list, map});
        } else {
            I(str, str2, (int) f2, (int) f3, list, map, null);
        }
    }

    public static void J(String str, String str2, int i2, int i3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3f82bf", new Object[]{str, str2, new Integer(i2), new Integer(i3), map, strArr});
        } else {
            I(str, str2, i2, i3, null, map, strArr);
        }
    }

    public static void K(String str, String str2, int i2, int i3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee0ea7a", new Object[]{str, str2, new Integer(i2), new Integer(i3), strArr});
        } else {
            J(str, str2, i2, i3, null, strArr);
        }
    }

    public static void L(String str, String str2, float f2, float f3, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a08060f", new Object[]{str, str2, new Float(f2), new Float(f3), list, map});
        } else {
            M(str, str2, (int) f2, (int) f3, list, map, null);
        }
    }

    public static void N(String str, String str2, bp8 bp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113d67be", new Object[]{str, str2, bp8Var});
            return;
        }
        if (eqv.currentSceneExposeNode.get(str) == null) {
            eqv.currentSceneExposeNode.put(str, new HashMap());
        }
        Map<String, bp8> map = eqv.currentSceneExposeNode.get(str);
        if (map != null) {
            if (map.size() > v82.k("exposeMaxRecordCount", 15)) {
                map.clear();
            }
            map.put(str2, bp8Var);
        }
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return e(str);
    }

    public static void b(double d2, double d3) {
        double d4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0efa28", new Object[]{new Double(d2), new Double(d3)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        double d5 = c;
        if (d5 > vu3.b.GEO_NOT_SUPPORT) {
            double d6 = currentTimeMillis - d5;
            if (d2 > d3) {
                d4 = d2 / d6;
            } else {
                d4 = d3 / d6;
            }
            String format = new DecimalFormat("#.##").format(d4);
            if (!TextUtils.isEmpty(d)) {
                d += "_" + format;
            } else {
                d = format;
            }
        }
        c = currentTimeMillis;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!v82.s() || v82.r() || v82.t()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String[] d(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e9f57a3c", new Object[]{str, strArr});
        }
        return f(str, strArr);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!"taobao".equals(f82.c())) {
            return "";
        }
        if (TextUtils.equals(str, "Page_Home")) {
            return "a2141.1";
        }
        if (TextUtils.equals(str, u3j.b)) {
            return "a2141.7631743";
        }
        if (TextUtils.equals(str, "Page_MiniDetail")) {
            return "a218fy.minidetail";
        }
        return "";
    }

    public static String[] f(String str, String[] strArr) {
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("eff9459b", new Object[]{str, strArr});
        }
        if (TextUtils.isEmpty(str)) {
            return strArr;
        }
        if (strArr == null || strArr.length == 0) {
            strArr2 = new String[1];
        } else {
            strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static void g(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c137d5c", new Object[]{str, obj});
        } else if (!c()) {
            u82.f(new c(new WeakReference(obj), str, System.currentTimeMillis()), str, "appIn", str, new String[0]);
        }
    }

    public static void h(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c787c1b1", new Object[]{str, obj});
        } else if (!c()) {
            u82.f(new d(new WeakReference(obj), str, System.currentTimeMillis()), str, "appOut", str, new String[0]);
        }
    }

    public static void i(String str, String str2, String str3, Map<String, String> map, String... strArr) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2c5ae7", new Object[]{str, str2, str3, map, strArr});
        } else if (!c()) {
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
            u82.f(new i(str, hashMap, strArr, str2, str3), str, "custom", str2, strArr);
        }
    }

    public static /* synthetic */ Object ipc$super(cqv cqvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/UserActionTrack");
    }

    public static void j(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b473c752", new Object[]{str, str2, str3, strArr});
        } else {
            i(str, str2, str3, null, strArr);
        }
    }

    public static void k(String str, String str2, Object obj, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd6c152", new Object[]{str, str2, obj, map, strArr});
        } else if (!c()) {
            u82.f(new f(str, map != null ? new HashMap(map) : null, strArr, new WeakReference(obj), str2, System.currentTimeMillis()), str, "pv", str, strArr);
        }
    }

    public static void l(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c564b847", new Object[]{str, str2, obj, strArr});
        } else {
            k(str, str2, obj, null, strArr);
        }
    }

    public static void m(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38feac8", new Object[]{str, str2, obj, strArr});
        } else {
            o(str, str2, null, obj, strArr);
        }
    }

    public static void n(String str, String str2, String str3, Object obj, Map<String, String> map, String... strArr) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b14bb", new Object[]{str, str2, str3, obj, map, strArr});
        } else if (!c()) {
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
            u82.f(new g(str, hashMap, strArr, new WeakReference(obj), str2, str3, System.currentTimeMillis()), str, "leave", str, strArr);
        }
    }

    public static void o(String str, String str2, String str3, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb1ffe", new Object[]{str, str2, str3, obj, strArr});
        } else {
            n(str, str2, str3, obj, null, strArr);
        }
    }

    public static void p(String str, String str2, String str3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7fba59", new Object[]{str, str2, str3, map, strArr});
        } else {
            t(str, str2, "", str3, map, strArr);
        }
    }

    public static void q(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5efb220", new Object[]{str, str2, str3, strArr});
        } else {
            t(str, str2, "", str3, null, strArr);
        }
    }

    public static void r(String str, String str2, String str3, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d24cb7", new Object[]{str, str2, str3, map, strArr});
        } else if (!c()) {
            u82.f(new a(str, str2, str3, System.currentTimeMillis(), map != null ? new HashMap(map) : null, strArr), str, "request", str2, strArr);
        }
    }

    public static void s(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce026f82", new Object[]{str, str2, str3, strArr});
        } else {
            r(str, str2, str3, null, strArr);
        }
    }

    public static void t(String str, String str2, String str3, String str4, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5c6555", new Object[]{str, str2, str3, str4, map, strArr});
        } else if (!c()) {
            u82.f(new h(str, map != null ? new HashMap(map) : null, strArr, str2, str3, str4, System.currentTimeMillis()), str, "tap", str2, strArr);
        }
    }

    public static void u(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c09eea4", new Object[]{str, str2, str3, str4, strArr});
        } else {
            t(str, str2, "", str4, null, strArr);
        }
    }

    public static void v(String str, List<BHXVisualCenterItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31362586", new Object[]{str, list, new Boolean(z)});
        } else {
            w(str, list, z, null);
        }
    }

    public static bp8 x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bp8) ipChange.ipc$dispatch("81f14cd", new Object[]{str, str2});
        }
        Map<String, bp8> map = eqv.currentSceneExposeNode.get(str);
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    public static void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0238d98", new Object[]{str, str2});
            return;
        }
        Map<String, bp8> map = eqv.currentSceneExposeNode.get(str);
        if (map != null) {
            map.remove(str2);
        }
    }

    public static void z(String str, String str2, String str3, View view, Map<String, String> map, String... strArr) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7a4107", new Object[]{str, str2, str3, view, map, strArr});
        } else if (!c()) {
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
            u82.f(new m(str, hashMap, strArr, str2, str3, view, System.currentTimeMillis()), str, "expose", str2, strArr);
        }
    }

    public static void O(String str, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7f5f4b", new Object[]{str, obj, map});
        } else if (map != null && !c()) {
            u82.f(new e(str, new WeakReference(obj), map), str, "pvUpdate", "pvUpdate", new String[0]);
        }
    }

    public static void w(String str, List<BHXVisualCenterItem> list, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc7393f", new Object[]{str, list, new Boolean(z), map});
        } else if (!c() && !TextUtils.isEmpty(str) && !pz3.a(list)) {
            u6a.w();
            e = list;
            u82.f(new b(str, list, z, map), str, "visualCenterExpose", null, new String[0]);
        }
    }

    public static void I(String str, String str2, int i2, int i3, List<rm1> list, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60e6970", new Object[]{str, str2, new Integer(i2), new Integer(i3), list, map, strArr});
        } else if (!c()) {
            HashMap hashMap = map != null ? new HashMap(map) : null;
            long currentTimeMillis = System.currentTimeMillis();
            f17237a = i2;
            b = i3;
            c = System.currentTimeMillis();
            d = "";
            u82.f(new j(str, hashMap, strArr, str2, i2, i3, list, currentTimeMillis), str, "scroll", str2, strArr);
        }
    }

    public static void E(String str, String str2, int i2, int i3, List<rm1> list, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a088069", new Object[]{str, str2, new Integer(i2), new Integer(i3), list, map, strArr});
        } else if (!c()) {
            HashMap hashMap = map != null ? new HashMap(map) : null;
            long currentTimeMillis = System.currentTimeMillis();
            b(Math.abs(i2 - f17237a), Math.abs(i3 - b));
            String str3 = d;
            int i4 = f17237a;
            int i5 = b;
            f17237a = i2;
            b = i3;
            d = "";
            c = vu3.b.GEO_NOT_SUPPORT;
            u82.f(new l(str, str2, i2, i3, i4, i5, str3, list, currentTimeMillis, hashMap, strArr), str, "scroll", str2, strArr);
        }
    }

    public static void M(String str, String str2, int i2, int i3, List<rm1> list, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4eb9f10", new Object[]{str, str2, new Integer(i2), new Integer(i3), list, map, strArr});
        } else if (!c()) {
            int abs = Math.abs(i2 - f17237a);
            int abs2 = Math.abs(i3 - b);
            b(abs, abs2);
            float r = u6a.r();
            float s = u6a.s();
            float u = r * v82.c.u();
            float u2 = s * v82.c.u();
            if (abs >= u || abs2 >= u2) {
                int i4 = f17237a;
                int i5 = b;
                f17237a = i2;
                b = i3;
                String str3 = d;
                d = "";
                u82.f(new k(str, map != null ? new HashMap(map) : null, strArr, str2, i2, i3, i4, i5, str3, list, System.currentTimeMillis()), str, "scroll", str2, strArr);
            }
        }
    }
}
