package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.android.split.PatchSplitFileInfo;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.l0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dyn<Param> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<SplitFileInfo> f18158a;
    public final Param b;
    public final boolean c;
    public final SplitInstallServiceImpl.b d;
    public final List e;
    public final Map<String, Intent> f;
    public final Map<String, Intent> g;
    public final boolean h;
    public final l0c i;
    public final Context j;
    public final jvc k;
    public final v02 l;
    public final b4d m;
    public final wnc n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f18162a;
        public l0c b;
        public boolean c;
        public List<SplitFileInfo> d;
        public boolean e;
        public List<String> f;
        public SplitInstallServiceImpl.b g;
        public Map<String, Intent> h;
        public Map<String, Intent> i;

        static {
            t2o.a(683671575);
        }

        public /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public dyn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dyn) ipChange.ipc$dispatch("f36a5dca", new Object[]{this});
            }
            return new dyn(this.f18162a, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.c, null);
        }

        public b b(SplitInstallServiceImpl.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e9f28d24", new Object[]{this, bVar});
            }
            this.g = bVar;
            return this;
        }

        public b c(List<SplitFileInfo> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("acf59851", new Object[]{this, list});
            }
            this.d = list;
            return this;
        }

        public b d(l0c l0cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("61d5e688", new Object[]{this, l0cVar});
            }
            this.b = l0cVar;
            return this;
        }

        public b e(Map<String, Intent> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b0e996b", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public b f(Map<String, Intent> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ae7ddb3f", new Object[]{this, map});
            }
            this.h = map;
            return this;
        }

        public b g(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ece4b0f6", new Object[]{this, list});
            }
            this.f = list;
            return this;
        }

        public b h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8e98aeba", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public b i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bd5a9cb9", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b(Context context) {
            this.c = false;
            this.f18162a = context;
        }
    }

    static {
        t2o.a(683671571);
    }

    public /* synthetic */ dyn(Context context, l0c l0cVar, List list, boolean z, List list2, SplitInstallServiceImpl.b bVar, Map map, Map map2, boolean z2, a aVar) {
        this(context, l0cVar, list, z, list2, bVar, map, map2, z2);
    }

    public static /* synthetic */ boolean a(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4d285b3", new Object[]{dynVar})).booleanValue();
        }
        return dynVar.h;
    }

    public static /* synthetic */ v02 b(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v02) ipChange.ipc$dispatch("6a4b820d", new Object[]{dynVar});
        }
        return dynVar.l;
    }

    public static /* synthetic */ b4d c(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b4d) ipChange.ipc$dispatch("74b3ab09", new Object[]{dynVar});
        }
        return dynVar.m;
    }

    public static /* synthetic */ List d(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5e306d5", new Object[]{dynVar});
        }
        return dynVar.f18158a;
    }

    public static /* synthetic */ Map e(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16df9ca8", new Object[]{dynVar});
        }
        return dynVar.f;
    }

    public static /* synthetic */ Map f(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dd0a2569", new Object[]{dynVar});
        }
        return dynVar.g;
    }

    public static /* synthetic */ String g(dyn dynVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef203741", new Object[]{dynVar, str});
        }
        return dynVar.s(str);
    }

    public static /* synthetic */ jvc h(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvc) ipChange.ipc$dispatch("b9c46b3c", new Object[]{dynVar});
        }
        return dynVar.k;
    }

    public static /* synthetic */ Object i(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7607ba4f", new Object[]{dynVar});
        }
        return dynVar.b;
    }

    public static /* synthetic */ Context j(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9b9bbcbc", new Object[]{dynVar});
        }
        return dynVar.j;
    }

    public static /* synthetic */ boolean k(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cde849", new Object[]{dynVar})).booleanValue();
        }
        return dynVar.c;
    }

    public static /* synthetic */ int l(dyn dynVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60a7aa", new Object[]{dynVar, list})).intValue();
        }
        return dynVar.t(list);
    }

    public static /* synthetic */ wnc m(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("59afd30e", new Object[]{dynVar});
        }
        return dynVar.n;
    }

    public static /* synthetic */ List n(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("62ef657f", new Object[]{dynVar});
        }
        return dynVar.e;
    }

    public static /* synthetic */ SplitInstallServiceImpl.b o(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplitInstallServiceImpl.b) ipChange.ipc$dispatch("c5f36ad3", new Object[]{dynVar});
        }
        return dynVar.d;
    }

    public static b q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("92fd0142", new Object[]{context});
        }
        return new b(context, null);
    }

    public void p(List<SplitFileInfo> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d51b860", new Object[]{this, list, new Integer(i), new Integer(i2)});
        } else if (list != null && list.size() != 0) {
            HashMap hashMap = new HashMap(list.size());
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            AtomicInteger atomicInteger = new AtomicInteger();
            atomicInteger.set(this.i.b(list, this.b, null, null, new a(list, i2, i, atomicInteger, currentTimeMillis, hashMap, arrayList)));
            SplitInstallServiceImpl.b bVar = this.d;
            if (bVar != null) {
                bVar.a(SplitInstallServiceImpl.c.a(2, atomicInteger.get(), 0, "", 0, t(list), this.e));
            }
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503a4a7", new Object[]{this, new Integer(i)});
            return;
        }
        l0c l0cVar = this.i;
        if (l0cVar != null) {
            l0cVar.c(i);
        }
    }

    public final String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("781e2331", new Object[]{this, str});
        }
        return str.concat(jcq.APK_EXTENSION);
    }

    public final int t(List<SplitFileInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb476c50", new Object[]{this, list})).intValue();
        }
        long j = 0;
        for (SplitFileInfo splitFileInfo : list) {
            j = splitFileInfo.fileSize;
        }
        return (int) j;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements l0c.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f18159a = null;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ AtomicInteger e;
        public final /* synthetic */ long f;
        public final /* synthetic */ Map g;
        public final /* synthetic */ List h;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f18161a;

            public b(boolean z) {
                this.f18161a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (dyn.k(dyn.this)) {
                    try {
                        if (!this.f18161a || a.this.h.size() != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("session_id", a.this.d);
                            bundle.putInt("status", 6);
                            bundle.putInt("error_code", -6);
                            bundle.putLong("bytes_downloaded", ((SplitFileInfo) a.this.b.get(0)).fileSize);
                            bundle.putLong("total_bytes_to_download", ((SplitFileInfo) a.this.b.get(0)).fileSize);
                            ArrayList<String> arrayList = new ArrayList<>();
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            for (SplitFileInfo splitFileInfo : a.this.b) {
                                arrayList.add(splitFileInfo.splitName);
                                Intent intent = new Intent();
                                intent.putExtra("split_id", splitFileInfo.splitName);
                                a aVar = a.this;
                                String str = (String) aVar.g.get(dyn.g(dyn.this, splitFileInfo.splitName));
                                if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                                    intent.setData(Uri.fromFile(new File(str)));
                                }
                                arrayList2.add(intent);
                            }
                            bundle.putStringArrayList("module_names", arrayList);
                            bundle.putParcelableArrayList("split_file_intents", arrayList2);
                            dmi.b(dyn.j(dyn.this), dyn.j(dyn.this).getPackageName(), bundle);
                            return;
                        }
                        dyn.d(dyn.this).addAll(a.this.b);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("session_id", a.this.d);
                        bundle2.putInt("status", 3);
                        bundle2.putInt("error_code", 0);
                        bundle2.putLong("bytes_downloaded", ((SplitFileInfo) a.this.b.get(0)).fileSize);
                        bundle2.putLong("total_bytes_to_download", ((SplitFileInfo) a.this.b.get(0)).fileSize);
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        for (SplitFileInfo splitFileInfo2 : dyn.d(dyn.this)) {
                            if (!dyn.e(dyn.this).keySet().contains(splitFileInfo2.splitName) && !dyn.f(dyn.this).keySet().contains(splitFileInfo2.splitName)) {
                                arrayList3.add(splitFileInfo2.splitName);
                                Intent intent2 = new Intent();
                                intent2.putExtra("split_id", splitFileInfo2.splitName);
                                String str2 = (String) a.this.g.get(splitFileInfo2.splitName);
                                if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
                                    intent2.setData(Uri.fromFile(new File(str2)));
                                }
                                arrayList4.add(intent2);
                            }
                        }
                        for (Map.Entry entry : dyn.e(dyn.this).entrySet()) {
                            arrayList3.add((String) entry.getKey());
                            arrayList4.add((Intent) entry.getValue());
                        }
                        for (Map.Entry entry2 : dyn.f(dyn.this).entrySet()) {
                            arrayList3.add((String) entry2.getKey());
                            arrayList4.add((Intent) entry2.getValue());
                        }
                        if (arrayList3.size() > 0) {
                            bundle2.putStringArrayList("module_names", arrayList3);
                            bundle2.putParcelableArrayList("split_file_intents", arrayList4);
                            dmi.b(dyn.j(dyn.this), dyn.j(dyn.this).getPackageName(), bundle2);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (this.f18161a && a.this.h.size() == 0) {
                    dyn.d(dyn.this).addAll(a.this.b);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("session_id", a.this.d);
                    bundle3.putInt("status", 3);
                    bundle3.putInt("error_code", 0);
                    dyn dynVar = dyn.this;
                    bundle3.putLong("bytes_downloaded", dyn.l(dynVar, dyn.d(dynVar)));
                    dyn dynVar2 = dyn.this;
                    bundle3.putLong("total_bytes_to_download", dyn.l(dynVar2, dyn.d(dynVar2)));
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (SplitFileInfo splitFileInfo3 : dyn.d(dyn.this)) {
                        if (!dyn.e(dyn.this).keySet().contains(splitFileInfo3.splitName) && !dyn.f(dyn.this).keySet().contains(splitFileInfo3.splitName)) {
                            arrayList5.add(splitFileInfo3.splitName);
                            Intent intent3 = new Intent();
                            intent3.putExtra("split_id", splitFileInfo3.splitName);
                            a aVar2 = a.this;
                            String str3 = (String) aVar2.g.get(dyn.g(dyn.this, splitFileInfo3.splitName));
                            if (!TextUtils.isEmpty(str3) && new File(str3).exists()) {
                                intent3.setData(Uri.fromFile(new File(str3)));
                            }
                            arrayList6.add(intent3);
                        }
                    }
                    for (Map.Entry entry3 : dyn.e(dyn.this).entrySet()) {
                        arrayList5.add((String) entry3.getKey());
                        arrayList6.add((Intent) entry3.getValue());
                    }
                    for (Map.Entry entry4 : dyn.f(dyn.this).entrySet()) {
                        arrayList5.add((String) entry4.getKey());
                        arrayList6.add((Intent) entry4.getValue());
                    }
                    bundle3.putStringArrayList("module_names", new ArrayList<>(arrayList5));
                    bundle3.putParcelableArrayList("split_file_intents", new ArrayList<>(arrayList6));
                    dmi.b(dyn.j(dyn.this), dyn.j(dyn.this).getPackageName(), bundle3);
                    if (dyn.o(dyn.this) != null) {
                        SplitInstallServiceImpl.b o = dyn.o(dyn.this);
                        int i = a.this.e.get();
                        a aVar3 = a.this;
                        int l = dyn.l(dyn.this, aVar3.b);
                        a aVar4 = a.this;
                        o.a(SplitInstallServiceImpl.c.a(3, i, 0, "", l, dyn.l(dyn.this, aVar4.b), dyn.n(dyn.this)));
                    }
                } else if (dyn.o(dyn.this) != null) {
                    dyn.o(dyn.this).a(SplitInstallServiceImpl.c.a(6, a.this.e.get(), -6, "download failed", 0, 0, dyn.n(dyn.this)));
                }
            }
        }

        public a(List list, int i, int i2, AtomicInteger atomicInteger, long j, Map map, List list2) {
            this.b = list;
            this.c = i;
            this.d = i2;
            this.e = atomicInteger;
            this.f = j;
            this.g = map;
            this.h = list2;
        }

        @Override // tb.l0c.a
        public void a(int i, Object obj, l0c.a.AbstractC0976a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33b7709", new Object[]{this, new Integer(i), obj, aVar});
            }
        }

        @Override // tb.l0c.b
        public void b(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("589e0d7d", new Object[]{this, str, map});
                return;
            }
            for (SplitFileInfo splitFileInfo : this.b) {
                if (!TextUtils.isEmpty(this.f18159a) && this.f18159a.equals(str)) {
                    dyn.h(dyn.this).b(splitFileInfo.splitName, false, "download", 0L, Integer.parseInt(map.get("error_code")), map.get(MUSAppMonitor.ERROR_MSG), this.c);
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", this.d);
            bundle.putInt("status", 13);
            bundle.putString("arg", dyn.i(dyn.this).toString());
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitFileInfo splitFileInfo2 = (SplitFileInfo) it.next();
                if (splitFileInfo2.url.equals(str)) {
                    arrayList.add(splitFileInfo2.splitName);
                    Intent intent = new Intent();
                    intent.putExtra("split_id", splitFileInfo2.splitName);
                    arrayList2.add(intent);
                    break;
                }
            }
            bundle.putStringArrayList("module_names", arrayList);
            bundle.putParcelableArrayList("split_file_intents", arrayList2);
            dmi.b(dyn.j(dyn.this), dyn.j(dyn.this).getPackageName(), bundle);
        }

        @Override // tb.l0c.a
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            } else {
                rdq.b().a(new RunnableC0908a(str2, str));
            }
        }

        @Override // tb.l0c.a
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.l0c.a
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            } else {
                rdq.b().a(new b(z));
            }
        }

        @Override // tb.l0c.a
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            } else if (dyn.k(dyn.this)) {
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", this.d);
                bundle.putInt("status", 2);
                bundle.putInt("error_code", 0);
                bundle.putLong("bytes_downloaded", i);
                bundle.putLong("total_bytes_to_download", dyn.l(dyn.this, this.b));
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                for (SplitFileInfo splitFileInfo : this.b) {
                    arrayList.add(splitFileInfo.splitName);
                    Intent intent = new Intent();
                    intent.putExtra("split_id", splitFileInfo.splitName);
                    arrayList2.add(intent);
                }
                bundle.putStringArrayList("module_names", arrayList);
                bundle.putParcelableArrayList("split_file_intents", arrayList2);
                dmi.b(dyn.j(dyn.this), dyn.j(dyn.this).getPackageName(), bundle);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.dyn$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0908a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f18160a;
            public final /* synthetic */ String b;

            public RunnableC0908a(String str, String str2) {
                this.f18160a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                a aVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TextUtils.isEmpty(this.f18160a) && new File(this.f18160a).exists()) {
                    if (new File(this.f18160a).getName().endsWith(jcq.APK_EXTENSION)) {
                        str = new File(this.f18160a).getName().replace(jcq.APK_EXTENSION, "");
                    } else {
                        str = new File(this.f18160a).getName().endsWith(".patch") ? new File(this.f18160a).getName().replace(".patch", "") : null;
                    }
                    if (o49.b().a(str) < 1 || (ddq.a() != null && !ddq.a().a(str, "baseline").equals("baseline"))) {
                        dyn.h(dyn.this).b(str, true, "download_" + dyn.a(dyn.this), System.currentTimeMillis() - a.this.f, 0, "", aVar.c);
                        for (SplitFileInfo splitFileInfo : a.this.b) {
                            if (splitFileInfo.splitName.equals(str)) {
                                if (splitFileInfo instanceof PatchSplitFileInfo) {
                                    wli wliVar = new wli();
                                    PatchSplitFileInfo patchSplitFileInfo = (PatchSplitFileInfo) splitFileInfo;
                                    wliVar.e = patchSplitFileInfo.baseMd5;
                                    wliVar.f = patchSplitFileInfo.newMd5;
                                    try {
                                        wliVar.d = bcq.a().e().K(str);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (dyn.c(dyn.this).b(dyn.b(dyn.this).a(splitFileInfo.splitName, patchSplitFileInfo.baseAppVersion).getAbsolutePath(), this.f18160a, wliVar.d.getAbsolutePath(), wliVar.f)) {
                                        dyn.h(dyn.this).b(splitFileInfo.splitName, true, "merge_" + patchSplitFileInfo.baseAppVersion, System.currentTimeMillis() - currentTimeMillis, 0, "", a.this.c);
                                        o49.b().c().b(splitFileInfo.splitName, 1);
                                        a.this.g.put(str, wliVar.d.getAbsolutePath());
                                    } else {
                                        dyn.h(dyn.this).b(splitFileInfo.splitName, false, "merge_" + patchSplitFileInfo.baseAppVersion, System.currentTimeMillis() - currentTimeMillis, wliVar.b, wliVar.c, a.this.c);
                                        u48.c().a(str);
                                        a.this.h.add(splitFileInfo);
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("session_id", a.this.d);
                                        bundle.putInt("status", 6);
                                        bundle.putInt(PushMessageHelper.ERROR_TYPE, -202);
                                        bundle.putInt("error_code", -21);
                                        bundle.putString("arg", "merge failed");
                                        bundle.putLong("bytes_downloaded", 0L);
                                        bundle.putLong("total_bytes_to_download", splitFileInfo.fileSize);
                                        ArrayList<String> arrayList = new ArrayList<>();
                                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                        for (SplitFileInfo splitFileInfo2 : a.this.b) {
                                            arrayList.add(splitFileInfo2.splitName);
                                            Intent intent = new Intent();
                                            intent.putExtra("split_id", splitFileInfo2.splitName);
                                            arrayList2.add(intent);
                                        }
                                        bundle.putStringArrayList("module_names", arrayList);
                                        bundle.putParcelableArrayList("split_file_intents", arrayList2);
                                        dmi.b(dyn.j(dyn.this), dyn.j(dyn.this).getPackageName(), bundle);
                                    }
                                } else {
                                    o49.b().c().b(splitFileInfo.splitName, 1);
                                    a.this.g.put(str, c2d.b(this.f18160a, str));
                                }
                            }
                        }
                        return;
                    }
                    dyn.m(dyn.this).c("second downloadFinish......%s...%s", this.b, this.f18160a);
                }
            }
        }

        @Override // tb.l0c.a
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            dyn.m(dyn.this).c("onDownloadError......%s...%s...%s", str, Integer.valueOf(i), str2);
            this.f18159a = str;
            if (dyn.k(dyn.this)) {
                if (i == -14) {
                    dyn.h(dyn.this).b((String) dyn.n(dyn.this).get(0), false, "download", 0L, -14, "network disconnected", this.c);
                } else if (i == -16) {
                    dyn.h(dyn.this).b((String) dyn.n(dyn.this).get(0), false, "download", 0L, -16, "network timeout", this.c);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", this.d);
                bundle.putInt("status", 6);
                bundle.putInt(PushMessageHelper.ERROR_TYPE, -200);
                bundle.putInt("error_code", i);
                bundle.putString("arg", str2);
                bundle.putLong("bytes_downloaded", 0L);
                bundle.putLong("total_bytes_to_download", ((SplitFileInfo) this.b.get(0)).fileSize);
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                for (SplitFileInfo splitFileInfo : this.b) {
                    arrayList.add(splitFileInfo.splitName);
                    Intent intent = new Intent();
                    intent.putExtra("split_id", splitFileInfo.splitName);
                    arrayList2.add(intent);
                }
                bundle.putStringArrayList("module_names", arrayList);
                bundle.putParcelableArrayList("split_file_intents", arrayList2);
                dmi.b(dyn.j(dyn.this), dyn.j(dyn.this).getPackageName(), bundle);
                if (dyn.o(dyn.this) != null) {
                    dyn.o(dyn.this).a(SplitInstallServiceImpl.c.a(6, this.e.get(), i, str2, 0, 0, dyn.n(dyn.this)));
                }
            }
        }
    }

    public dyn(Context context, l0c<Param> l0cVar, List<SplitFileInfo> list, boolean z, List list2, SplitInstallServiceImpl.b bVar, Map<String, Intent> map, Map<String, Intent> map2, boolean z2) {
        this.i = null;
        this.k = (jvc) d62.a(jvc.class, new Object[0]);
        this.l = null;
        this.m = (b4d) d62.a(b4d.class, new Object[0]);
        this.n = (wnc) d62.b(wnc.class, "RemoteDownloderFacade");
        this.i = l0cVar;
        this.j = context;
        this.h = z2;
        this.l = new v02(context);
        this.f18158a = list;
        this.b = l0cVar.a();
        this.c = z;
        this.e = list2;
        this.d = bVar;
        this.f = map;
        this.g = map2;
    }
}
