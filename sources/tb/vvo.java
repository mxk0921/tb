package tb;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.OrderConfigs;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vvo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME_ORDER_DETAIL3 = "Page_OrderDetail_V3";
    public static final String h = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString() + yhs.DEFAULT_PLAN_B_PASSWORD_REGEX;
    public static final String i = MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString() + yhs.DEFAULT_PLAN_B_PASSWORD_REGEX;
    public static final String[] j = {"_display_name", "_data", "date_added"};
    public static volatile vvo k;

    /* renamed from: a  reason: collision with root package name */
    public ContentObserver f30282a;
    public HandlerThread b;
    public Handler c;
    public com.taobao.android.order.core.a d;
    public OrderConfigs e;
    public String f;
    public Map<String, juk> g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f30283a = 0;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Handler handler, Context context) {
            super(handler);
            this.b = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/ScreenShotHelper$1");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
            return;
         */
        @Override // android.database.ContentObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onChange(boolean r8, android.net.Uri r9) {
            /*
                Method dump skipped, instructions count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.vvo.a.onChange(boolean, android.net.Uri):void");
        }
    }

    static {
        t2o.a(713031804);
    }

    public vvo() {
        m();
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ String[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("15262588", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ boolean d(vvo vvoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62332c03", new Object[]{vvoVar, str, str2})).booleanValue();
        }
        return vvoVar.o(str, str2);
    }

    public static /* synthetic */ boolean e(vvo vvoVar, Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85de09d", new Object[]{vvoVar, context, cursor})).booleanValue();
        }
        return vvoVar.n(context, cursor);
    }

    public static /* synthetic */ void f(vvo vvoVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc76cc3c", new Object[]{vvoVar, map});
        } else {
            vvoVar.u(map);
        }
    }

    public static /* synthetic */ String g(vvo vvoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("785ee998", new Object[]{vvoVar});
        }
        return vvoVar.f;
    }

    public static /* synthetic */ Map h(vvo vvoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("196351dc", new Object[]{vvoVar});
        }
        return vvoVar.g;
    }

    public static /* synthetic */ com.taobao.android.order.core.a i(vvo vvoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.order.core.a) ipChange.ipc$dispatch("2b3e8604", new Object[]{vvoVar});
        }
        return vvoVar.d;
    }

    public static vvo k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vvo) ipChange.ipc$dispatch("d97909e7", new Object[0]);
        }
        if (k == null) {
            synchronized (vvo.class) {
                try {
                    if (k == null) {
                        k = new vvo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.f;
    }

    public ContentObserver l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentObserver) ipChange.ipc$dispatch("27a6d4fb", new Object[]{this, context});
        }
        ContentObserver contentObserver = this.f30282a;
        if (contentObserver != null) {
            return contentObserver;
        }
        a aVar = new a(this.c, context);
        this.f30282a = aVar;
        return aVar;
    }

    public final vvo m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vvo) ipChange.ipc$dispatch("c2f3f6c", new Object[]{this});
        }
        try {
            if (this.b == null) {
                HandlerThread a2 = wsa.a("order_screen_thread");
                this.b = a2;
                a2.start();
            }
            if (this.c == null) {
                this.c = new Handler(this.b.getLooper());
            }
            if (this.g == null) {
                this.g = new HashMap();
            }
            return k;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean n(Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56776af9", new Object[]{this, context, cursor})).booleanValue();
        }
        try {
            long j2 = cursor.getLong(cursor.getColumnIndex("date_added"));
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis - j2 < 0) {
                j2 /= 1000;
            }
            if (currentTimeMillis - j2 > 30) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public void p(String str, juk jukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856fcff7", new Object[]{this, str, jukVar});
        } else {
            ((HashMap) this.g).put(str, jukVar);
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void r(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75e57c", new Object[]{this, orderConfigs});
        } else {
            this.e = orderConfigs;
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143a63c6", new Object[]{this, str});
        } else {
            ((HashMap) this.g).remove(str);
        }
    }

    public void t(com.taobao.android.order.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53dbbfbd", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public final void u(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf05e00f", new Object[]{this, map});
            return;
        }
        OrderConfigs orderConfigs = this.e;
        if (orderConfigs != null) {
            String q = orderConfigs.q();
            String p = this.e.p();
            if (!TextUtils.isEmpty(q) && !TextUtils.isEmpty(p)) {
                map.put("searchKey", q);
                map.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID, p);
            }
        }
    }

    public final boolean o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93f4e49", new Object[]{this, str, str2})).booleanValue();
        }
        return (TextUtils.isEmpty(str) || (!str.toLowerCase().contains("tencent") && !str.toLowerCase().contains("qq") && !str.toLowerCase().contains(tn1.KEY_SHARE_CONFIG_WEIXIN) && !str.toLowerCase().contains("wechat"))) && str != null && str2 != null && (str2.toLowerCase().contains("screenshot") || str.toLowerCase().contains("screenshot") || str2.toLowerCase().contains("截屏") || str.toLowerCase().contains("截屏"));
    }
}
