package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bwr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GENPASSWORD = "mtop.taobao.sharepassword.genpassword";
    public static final String GETBIZCONFIG = "mtop.taobao.sharepassword.getNewBizConfig";
    public static final String NAV_URL_DETAIL_BASE = "https://a.m.taobao.com/i";
    public static final String QUERYPASSEORD = "mtop.taobao.sharepassword.querypassword";
    public static bwr i;

    /* renamed from: a  reason: collision with root package name */
    public TBShareContent f16688a;
    public WeakReference<Activity> b;
    public String d;
    public String f;
    public boolean c = false;
    public boolean e = false;
    public boolean g = false;
    public final Map<String, String> h = new HashMap();

    static {
        t2o.a(665845783);
    }

    public static bwr h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwr) ipChange.ipc$dispatch("bb33ba46", new Object[0]);
        }
        if (i == null) {
            i = new bwr();
        }
        return i;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e0e619", new Object[]{this, str, str2});
        } else if (this.f16688a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            TBShareContent tBShareContent = this.f16688a;
            if (tBShareContent.extraParams == null) {
                tBShareContent.extraParams = new HashMap();
            }
            this.f16688a.extraParams.put(str, str2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5f4356", new Object[]{this});
        } else {
            ((HashMap) this.h).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:23:0x009c, B:25:0x00a2, B:26:0x00a6, B:28:0x00ac, B:30:0x00ba, B:32:0x00c5, B:35:0x00d7), top: B:62:0x009c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bwr.d():void");
    }

    public TBShareContent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBShareContent) ipChange.ipc$dispatch("3cf6aea7", new Object[]{this});
        }
        return this.f16688a;
    }

    public final void f() {
        Map<String, String> i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d2db8", new Object[]{this});
            return;
        }
        TBShareContent tBShareContent = this.f16688a;
        if (tBShareContent != null && !TextUtils.isEmpty(tBShareContent.url) && TextUtils.equals("item", this.f16688a.shareScene)) {
            if (this.f16688a.url.startsWith(NAV_URL_DETAIL_BASE)) {
                this.d = this.f16688a.url.substring(24, this.f16688a.url.indexOf(".htm"));
            }
            if (TextUtils.isEmpty(this.d)) {
                try {
                    this.d = this.f16688a.url.substring(this.f16688a.url.indexOf("/i") + 2, this.f16688a.url.indexOf(".htm"));
                } catch (Exception e) {
                    TLog.loge("taobao_contacts", e.getMessage());
                }
            }
            if (TextUtils.isEmpty(this.d) && (i2 = kwr.i(this.f16688a.url)) != null && i2.size() > 0) {
                this.d = i2.get("id");
            }
            if (TextUtils.isEmpty(this.d)) {
                this.f16688a.shareScene = "other";
            }
        }
    }

    public Context g() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity != null) {
            return activity;
        }
        return ShareBizAdapter.getInstance().getAppEnv().getApplication();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9122f290", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.d;
    }

    public View k() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3c945ca9", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = ShareBizAdapter.getInstance().getAppEnv().getTopActivity();
        }
        if (activity != null) {
            return activity.getWindow().getDecorView();
        }
        TLog.logi("TBShareContentContainer", "getParent activity is null");
        return null;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
        }
        return this.f;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ab18a61", new Object[]{this});
        }
        return "serverDataTrackMap=" + JSON.toJSONString(this.h);
    }

    public gwr n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwr) ipChange.ipc$dispatch("e4567334", new Object[]{this});
        }
        return null;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c62001ee", new Object[]{this});
        }
        TBShareContent tBShareContent = this.f16688a;
        if (tBShareContent != null) {
            return tBShareContent.shareScene;
        }
        return "";
    }

    public WeakReference<Activity> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("a4ff6cc9", new Object[]{this});
        }
        return this.b;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("142cfdc0", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void r(WeakReference<Activity> weakReference, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac5f248", new Object[]{this, weakReference, tBShareContent});
            return;
        }
        this.f16688a = null;
        this.b = weakReference;
        this.c = false;
        this.d = null;
        c(tBShareContent);
        f();
        b();
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3385356", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3279d4", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4489bf", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            ((HashMap) this.h).put(str, str2);
            TBShareContent tBShareContent = this.f16688a;
            if (tBShareContent != null) {
                tBShareContent.serverDataTrackMap = JSON.toJSONString(this.h);
            }
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c9c348", new Object[]{this, str});
            return;
        }
        if (this.f16688a == null) {
            this.f16688a = new TBShareContent();
        }
        this.f16688a.shareScene = str;
    }

    public final void c(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad2ca79", new Object[]{this, tBShareContent});
            return;
        }
        this.f16688a = tBShareContent;
        tBShareContent.setDefault();
        if (TextUtils.isEmpty(tBShareContent.businessId)) {
            TLog.logw("TBShareContentContainer", "警告：BusinessId 为空，无法完成数据统计和对应业务的管理，请务必传入！");
        }
        if (!TextUtils.isEmpty(this.f16688a.weixinAppId)) {
            this.c = true;
        }
        d();
    }
}
