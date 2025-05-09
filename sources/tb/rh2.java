package tb;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.NetWorkUtils;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f27376a;
        public final /* synthetic */ String b;

        public a(List list, String str) {
            this.f27376a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (qt7 qt7Var : this.f27376a) {
                if (qt7Var.e == 1) {
                    hashMap.put(qt7Var.f25507a, Boolean.FALSE);
                }
                String str4 = "";
                if (qt7Var.e == 0 && gov.a(qt7Var.f25507a, gov.SUFFIX_MP4)) {
                    if (TextUtils.isEmpty(qt7Var.c)) {
                        str2 = str4;
                    } else {
                        str2 = qt7Var.c;
                    }
                    qt7Var.c = str2;
                    if (TextUtils.isEmpty(qt7Var.d)) {
                        str3 = rh2.a(qt7Var.f25507a);
                    } else {
                        str3 = qt7Var.d;
                    }
                    qt7Var.d = str3;
                    arrayList.add(qt7Var);
                }
                if (qt7Var.e == 2) {
                    if (!TextUtils.isEmpty(qt7Var.c)) {
                        str4 = qt7Var.c;
                    }
                    qt7Var.c = str4;
                    if (TextUtils.isEmpty(qt7Var.d)) {
                        str = rh2.a(qt7Var.f25507a);
                    } else {
                        str = qt7Var.d;
                    }
                    qt7Var.d = str;
                    arrayList.add(qt7Var);
                }
            }
            rh2.b(hashMap, this.b);
            rh2.c(arrayList, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements s8d<lqm> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27377a;

        public b(String str) {
            this.f27377a = str;
        }

        /* renamed from: a */
        public boolean onHappen(lqm lqmVar) {
            String str;
            String str2;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f8c43379", new Object[]{this, lqmVar})).booleanValue();
            }
            k9h.n();
            List<String> list = lqmVar.f;
            k9h.m(this.f27377a, list);
            if (list == null || list.isEmpty()) {
                z = true;
            }
            String str3 = this.f27377a;
            if (z) {
                str = wzi.DOWNLOAD_SUCCESS;
            } else {
                str = wzi.DOWNLOAD_ERROR;
            }
            if (z) {
                str2 = null;
            } else {
                str2 = wzi.CODE_DOWNLOAD_IMAGE_FAIL;
            }
            rh2.d(str3, str, str2);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27378a;

        public c(String str) {
            this.f27378a = str;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            tm1.a("2ARCH_DownLoader", "download error url：" + str + "，path" + str2);
            rh2.d(this.f27378a, wzi.DOWNLOAD_ERROR, wzi.CODE_DOWNLOAD_VIDEO_FAIL);
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            tm1.a("2ARCH_DownLoader", "download finish url：" + str + "，path" + str2);
            rh2.d(this.f27378a, wzi.DOWNLOAD_SUCCESS, null);
            k9h.l(str2, this.f27378a);
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            } else {
                k9h.o();
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    static {
        t2o.a(736100389);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str});
        }
        return j(str);
    }

    public static /* synthetic */ void b(Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99240257", new Object[]{map, str});
        } else {
            g(map, str);
        }
    }

    public static /* synthetic */ void c(List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a47c34", new Object[]{list, str});
        } else {
            i(list, str);
        }
    }

    public static /* synthetic */ void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac340b98", new Object[]{str, str2, str3});
        } else {
            e(str, str2, str3);
        }
    }

    public static void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8931e988", new Object[]{str, str2, str3});
        } else {
            usg.d().e().d(str, "HotStart", str2, null, str3, null);
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8355d13", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || str.toLowerCase().endsWith(".gif")) {
            return str;
        }
        DisplayMetrics displayMetrics = uy3.a().getResources().getDisplayMetrics();
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels), null);
    }

    public static void g(Map<String, Boolean> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c09427", new Object[]{map, str});
        } else if (map != null && !map.isEmpty()) {
            tm1.a("2ARCH_DownLoader", "downloadImageResource: " + map.size() + " ,businessCode: " + str);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                String key = entry.getKey();
                String f = (entry.getValue() == null || !entry.getValue().booleanValue()) ? key : f(key);
                arrayList.add(f);
                k9h.k(str, key, f);
                tm1.a("2ARCH_DownLoader", "suffixMaps key: " + key + ",item: " + f);
            }
            s0m.B().e0(BootImageDataMgr.IMAGE_MODULE_NAME, arrayList).a(new b(str)).b();
        }
    }

    public static void h(List<qt7> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1460f78", new Object[]{list, str});
        } else {
            Coordinator.execute(new a(list, str));
        }
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e83a6fb", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(url.getFile())) {
                return null;
            }
            String name = new File(url.getFile()).getName();
            tm1.a("2ARCH_DownLoader", "get file name. url:" + str);
            return name;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void i(List<qt7> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d30ec83", new Object[]{list, str});
        } else if (list == null || list.isEmpty()) {
            k9h.e(str);
        } else {
            tm1.a("2ARCH_DownLoader", "downloadVideoResource: " + list.size());
            NetWorkUtils.ConnectType connectType = NetWorkUtils.getConnectType(uy3.a());
            ArrayList arrayList = new ArrayList();
            for (qt7 qt7Var : list) {
                if (TextUtils.isEmpty(ph2.h(str, qt7Var.f25507a))) {
                    arrayList.add(qt7Var);
                }
            }
            tm1.a("2ARCH_DownLoader", "needVideoResource: " + arrayList.size());
            ArrayList arrayList2 = new ArrayList();
            if (NetWorkUtils.ConnectType.CONNECT_TYPE_WIFI.equals(connectType)) {
                arrayList2.addAll(arrayList);
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qt7 qt7Var2 = (qt7) it.next();
                    if (qt7Var2.f) {
                        arrayList2.add(qt7Var2);
                    }
                }
            }
            zu7 zu7Var = new zu7();
            zu7Var.f33016a = arrayList2;
            upl uplVar = new upl();
            zu7Var.b = uplVar;
            uplVar.f29547a = "TBBootImage";
            uplVar.g = di2.k(str);
            zu7Var.b.h = false;
            rv7.e().b(zu7Var, new c(str));
        }
    }
}
