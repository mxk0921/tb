package tb;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive.GuangguangShareNavIntercept;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.backflow.dialog.NewTaoPasswordDialog;
import com.taobao.tao.util.TaoHelper;
import com.ut.share.business.ShareBusiness;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h6r implements igb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f20444a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements mzp<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20445a;

        public a(h6r h6rVar, String str) {
            this.f20445a = str;
        }

        public void subscribe(azp<String> azpVar) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d0f4dd3", new Object[]{this, azpVar});
                return;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.f20445a);
                azpVar.onSuccess(hhi.b(false, mediaMetadataRetriever.getFrameAtTime(blo.i() * 1000000, 2), ShareBizAdapter.getInstance().getAppEnv().getApplication().getCacheDir(), ShareBizAdapter.getInstance().getAppEnv().getApplication()));
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        boolean intercept(Context context, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final h6r f20446a = new h6r(null);

        static {
            t2o.a(793772046);
        }

        public static /* synthetic */ h6r a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h6r) ipChange.ipc$dispatch("5f4475d7", new Object[0]);
            }
            return f20446a;
        }
    }

    static {
        t2o.a(793772043);
        t2o.a(665845801);
    }

    public /* synthetic */ h6r(a aVar) {
        this();
    }

    public static h6r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6r) ipChange.ipc$dispatch("c40cb031", new Object[0]);
        }
        return c.a();
    }

    @Override // tb.igb
    public String b() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b68c695", new Object[]{this});
        }
        String str = null;
        try {
            if (!(ClipUrlWatcherControl.z().s() == null || (activity = ClipUrlWatcherControl.z().s().get()) == null)) {
                if (TBMainHost.fromActivity(activity) == null) {
                    str = activity.getClass().getName();
                } else if (TBMainHost.b().getCurrentFragment() != null) {
                    str = TBMainHost.b().getCurrentFragment().getClass().getName();
                }
            }
        } catch (Throwable th) {
            fwr.b("TBAppEnv", "getCurPageName err" + th.getMessage());
        }
        return str;
    }

    @Override // tb.igb
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b76d18c8", new Object[]{this});
        }
        return ShareBusiness.getCacheTaopassword();
    }

    @Override // tb.igb
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dff16f29", new Object[]{this})).booleanValue();
        }
        Dialog u = ClipUrlWatcherControl.z().u();
        if (!(u instanceof NewTaoPasswordDialog)) {
            return false;
        }
        NewTaoPasswordDialog newTaoPasswordDialog = (NewTaoPasswordDialog) u;
        if (!newTaoPasswordDialog.isShowing()) {
            return false;
        }
        return TextUtils.equals(newTaoPasswordDialog.q(), b());
    }

    @Override // tb.igb
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1d5dc3a", new Object[]{this})).booleanValue();
        }
        return t.a(Globals.getApplication(), "welBreak");
    }

    @Override // tb.igb
    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return Globals.getApplication();
    }

    @Override // tb.igb
    public String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this});
        }
        return TaoHelper.getTTID();
    }

    @Override // tb.igb
    public Activity getTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1d7099f3", new Object[]{this});
        }
        return c21.i();
    }

    @Override // tb.igb
    public void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8056250b", new Object[]{this, application});
        } else {
            new TaoApplication().onCreate(application);
        }
    }

    @Override // tb.igb
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d539b50b", new Object[]{this, str});
        }
        return (String) yyp.create(new a(this, str)).blockingGet();
    }

    @Override // tb.igb
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e771b9b", new Object[]{this, str});
        } else {
            ShareBusiness.putCacheTaopassword(str);
        }
    }

    @Override // tb.igb
    public List<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("495743ef", new Object[]{this});
        }
        return null;
    }

    public h6r() {
        ArrayList arrayList = new ArrayList();
        this.f20444a = arrayList;
        try {
            IpChange ipChange = GuangguangShareNavIntercept.$ipChange;
            arrayList.add((b) GuangguangShareNavIntercept.class.newInstance());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.igb
    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbad9c6b", new Object[]{this, str})).booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "ShareNavIntercept", "false"))) {
            Iterator it = ((ArrayList) this.f20444a).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null && bVar.intercept(getTopActivity(), str)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // tb.igb
    public boolean g() {
        j9t e;
        dhb b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("642edb74", new Object[]{this})).booleanValue();
        }
        if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share", "useTbSettingService", "true")) || (e = j9t.e(getApplication(), "mytaobao")) == null || (b2 = e.b()) == null) {
            return false;
        }
        return b2.g(true);
    }
}
