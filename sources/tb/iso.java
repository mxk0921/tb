package tb;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class iso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ArrayList<h> SCAN_INTENT_MATCHERS;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iso.h
        public boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3dbc089", new Object[]{this, intent})).booleanValue();
            }
            Uri data = intent.getData();
            if (data == null || !data.getBooleanQueryParameter("fromScan", false)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iso.h
        public boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3dbc089", new Object[]{this, intent})).booleanValue();
            }
            IntentFilter intentFilter = new IntentFilter("com.taobao.huoyan.scan");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            return intentFilter.matchAction(intent.getAction());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface h {
        boolean a(Intent intent);
    }

    static {
        t2o.a(481296723);
        ArrayList<h> arrayList = new ArrayList<>(10);
        SCAN_INTENT_MATCHERS = arrayList;
        arrayList.add(new a());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new g());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iso.h
        public boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3dbc089", new Object[]{this, intent})).booleanValue();
            }
            IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
            intentFilter.addCategory("android.intent.category.BROWSABLE");
            intentFilter.addDataScheme("http");
            intentFilter.addDataScheme("https");
            intentFilter.addDataAuthority("tb.cn", null);
            intentFilter.addDataPath("/x/hy/", 1);
            return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iso.h
        public boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3dbc089", new Object[]{this, intent})).booleanValue();
            }
            IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            intentFilter.addCategory("android.intent.category.BROWSABLE");
            intentFilter.addDataScheme("http");
            intentFilter.addDataScheme("https");
            intentFilter.addDataAuthority("m.taobao.com", null);
            intentFilter.addDataPath("/scancode/scan", 0);
            return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iso.h
        public boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3dbc089", new Object[]{this, intent})).booleanValue();
            }
            IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            intentFilter.addCategory("android.intent.category.BROWSABLE");
            intentFilter.addDataScheme("http");
            intentFilter.addDataScheme("https");
            intentFilter.addDataAuthority("tb.cn", null);
            intentFilter.addDataPath("/n/scancode", 0);
            return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iso.h
        public boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3dbc089", new Object[]{this, intent})).booleanValue();
            }
            IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            intentFilter.addCategory("android.intent.category.BROWSABLE");
            intentFilter.addDataScheme("http");
            intentFilter.addDataScheme("https");
            intentFilter.addDataAuthority("tb.cn", null);
            intentFilter.addDataPath("/n/scancode", 0);
            return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iso.h
        public boolean a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3dbc089", new Object[]{this, intent})).booleanValue();
            }
            IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            intentFilter.addCategory("android.intent.category.BROWSABLE");
            intentFilter.addDataScheme("http");
            intentFilter.addDataScheme("https");
            intentFilter.addDataScheme("taobao");
            intentFilter.addDataAuthority("h5.m.taobao.com", null);
            intentFilter.addDataPath("/tusou/capture_sys.html", 0);
            return intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData()) > 0;
        }
    }

    public static boolean a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dadf2859", new Object[]{intent})).booleanValue();
        }
        Iterator<h> it = SCAN_INTENT_MATCHERS.iterator();
        while (it.hasNext()) {
            if (it.next().a(intent)) {
                Uri data = intent.getData();
                if (data == null) {
                    str = intent.getAction();
                } else {
                    str = data.toString();
                }
                if (str == null) {
                    str = "unknown";
                }
                if (caa.q()) {
                    i0u.b().d(caa.c(), "matchIntent: ".concat(str));
                }
                mzu.n(p73.f25916a, "matchScanUri", 19999, "param", str);
                return true;
            }
        }
        return false;
    }
}
