package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.sso.v2.model.SSOIPCConstants;
import com.taobao.tao.log.TLog;
import java.util.Map;
import java.util.Set;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class znj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMENT_DIALOG_TAG = "socialsdk_comment_dialog_fragment";
    public static final String COMMENT_DSL = "https://g.alicdn.com/taobao_interaction/comment_tnode/";
    public static final String CUSTOM_DSL = "tnodedsl";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements b02.b<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f32892a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Uri c;
        public final /* synthetic */ FragmentManager d;

        public b(Activity activity, Context context, Uri uri, FragmentManager fragmentManager) {
            this.f32892a = activity;
            this.b = context;
            this.c = uri;
            this.d = fragmentManager;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
                return;
            }
            l0u.c(this.f32892a, "加载失败，请稍后再试");
            s4v.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Reply", "error", str, "context", this.b.getClass().getName());
        }

        /* renamed from: c */
        public void b(Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ca65d0a", new Object[]{this, fragment, bundle});
            } else if (this.f32892a.isDestroyed()) {
                l0u.c(this.f32892a, "加载异常，请稍后再试");
                s4v.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Reply", "error", "activity.isDestroyed", "context", this.b.getClass().getName());
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("bundleUrl", this.c.toString());
                fragment.setArguments(bundle2);
                if (!fragment.isAdded()) {
                    this.d.beginTransaction().add(fragment, znj.COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                    this.d.executePendingTransactions();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f32893a;

        public c(Uri uri) {
            this.f32893a = uri;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, String> b = vyv.b(this.f32893a);
            if (!b.containsKey(znj.CUSTOM_DSL)) {
                uqm.c(znj.COMMENT_DSL, b);
            }
        }
    }

    static {
        t2o.a(817889353);
    }

    public static boolean b(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("111ccb62", new Object[]{intent, zmjVar})).booleanValue();
        }
        s4v.d();
        g(intent, "http://h5.m.taobao.com/comment/poplist_new2.htm");
        h(intent, "2");
        Context d = zmjVar.d();
        s4v.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Dialog", "originUri", intent.getDataString(), "context", d.getClass().getName());
        return f(intent, d);
    }

    public static String d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebebae0f", new Object[]{uri});
        }
        if (TextUtils.equals(uri.getQueryParameter("useSendInterface"), "false")) {
            return "com.taobao.android.commentpanel.container.CommentPanelFragment";
        }
        return "com.taobao.vividsocial.dialog.CmtReplyFragment";
    }

    public static void e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10e171f", new Object[]{uri});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new c(uri));
        }
    }

    public static void g(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85756ca5", new Object[]{intent, str});
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            String encodedQuery = data.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                str = str + "?" + encodedQuery;
            }
        }
        intent.setData(Uri.parse(str));
    }

    public static void h(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ed8b31", new Object[]{intent, str});
        } else if (intent != null && intent.getData() != null && !TextUtils.isEmpty(str)) {
            Uri.Builder buildUpon = intent.getData().buildUpon();
            buildUpon.appendQueryParameter("tnodeTime", String.valueOf(System.nanoTime()));
            String valueOf = String.valueOf(ggs.a("comment_reUseEngine"));
            if (k9l.e() && TextUtils.equals(valueOf, "true")) {
                buildUpon.appendQueryParameter("reUseEngine", "true");
            }
            Map<String, String> b2 = vyv.b(intent.getData());
            if (!b2.containsKey("commentSourceType")) {
                buildUpon.appendQueryParameter("commentSourceType", str);
            }
            JSONObject f = k9l.f(b2.get("namespace"));
            if (f != null) {
                for (Map.Entry<String, Object> entry : f.entrySet()) {
                    String key = entry.getKey();
                    String valueOf2 = String.valueOf(entry.getValue());
                    if (f.containsKey(key) && !b2.containsKey(key)) {
                        buildUpon.appendQueryParameter(key, valueOf2);
                    }
                }
            }
            intent.setData(buildUpon.build());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements b02.b<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f32891a;
        public final /* synthetic */ Uri b;
        public final /* synthetic */ FragmentManager c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;

        public a(Activity activity, Uri uri, FragmentManager fragmentManager, boolean z, String str) {
            this.f32891a = activity;
            this.b = uri;
            this.c = fragmentManager;
            this.d = z;
            this.e = str;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
                return;
            }
            l0u.c(this.f32891a, "加载失败，请稍后再试");
            s4v.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Dialog", "error", str);
        }

        /* renamed from: c */
        public void b(Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ca65d0a", new Object[]{this, fragment, bundle});
            } else if (this.f32891a.isDestroyed()) {
                l0u.c(this.f32891a, "加载异常，请稍后再试");
                s4v.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Dialog", "error", "activity.isDestroyed");
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("bundleUrl", this.b.toString());
                fragment.setArguments(bundle2);
                if (!fragment.isAdded()) {
                    this.c.beginTransaction().add(fragment, znj.COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                    this.c.executePendingTransactions();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("openState", (Object) Boolean.TRUE);
                jSONObject.put("interacted", (Object) Boolean.valueOf(this.d));
                aix.commentCallback(this.e, true, true, false, jSONObject);
            }
        }
    }

    public static boolean a(Intent intent, zmj zmjVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41e7339", new Object[]{intent, zmjVar})).booleanValue();
        }
        s4v.d();
        g(intent, "http://h5.m.taobao.com/comment/comment_detail_new2.htm");
        h(intent, "3");
        try {
            str = zmjVar.d().getClass().getCanonicalName();
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        if (intent.getData() != null) {
            Map<String, String> b2 = vyv.b(intent.getData());
            if (!b2.containsKey(CUSTOM_DSL)) {
                uqm.c(COMMENT_DSL, b2);
            }
        }
        s4v.a("Page_commentNav", TBBuyPreloadScene.NAV, SSOIPCConstants.IPC_JUMP_URL, "Detail", "originContext", str, "originUri", intent.getDataString());
        return true;
    }

    public static boolean f(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa45e416", new Object[]{intent, context})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            Map<String, String> b2 = vyv.b(intent.getData());
            if (!b2.containsKey(CUSTOM_DSL)) {
                uqm.c(COMMENT_DSL, b2);
            }
            String queryParameter = data.getQueryParameter("sessionId");
            Set<String> queryParameterNames = data.getQueryParameterNames();
            boolean z = queryParameterNames.contains("animContainerOffset") && queryParameterNames.contains("animTop");
            if (k9l.d() && "com.taobao.tao.welcome.Welcome".equals(context.getClass().getName())) {
                context = c21.i();
            }
            if (context instanceof FragmentActivity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing()) {
                    FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(COMMENT_DIALOG_TAG);
                    if (findFragmentByTag == null) {
                        vcq.a(activity).c(xcq.c().i(new q17(activity)).p(true).j(ix9.h(activity, "com.taobao.vividsocial.dialog.CmtDialogFragment").f(new a(activity, data, supportFragmentManager, z, queryParameter)).a()).n());
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("bundleUrl", data.toString());
                        findFragmentByTag.setArguments(bundle);
                        if (!findFragmentByTag.isAdded()) {
                            supportFragmentManager.beginTransaction().add(findFragmentByTag, COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                            supportFragmentManager.executePendingTransactions();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("openState", (Object) Boolean.TRUE);
                        jSONObject.put("interacted", (Object) Boolean.valueOf(z));
                        aix.commentCallback(queryParameter, true, true, false, jSONObject);
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean c(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6233dea", new Object[]{intent, context})).booleanValue();
        }
        s4v.d();
        g(intent, "http://h5.m.taobao.com/comment/commentReply_new2.htm");
        h(intent, "4");
        s4v.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Reply", "originUri", intent.getDataString(), "context", context.getClass().getName());
        Context i = (!k9l.d() || !"com.taobao.tao.welcome.Welcome".equals(context.getClass().getName())) ? context : c21.i();
        Uri data = intent.getData();
        if (data == null || !(i instanceof FragmentActivity)) {
            return true;
        }
        e(data);
        Activity activity = (Activity) i;
        if (!activity.isFinishing()) {
            FragmentManager supportFragmentManager = ((FragmentActivity) i).getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(COMMENT_DIALOG_TAG);
            if (findFragmentByTag == null) {
                String d = d(data);
                TLog.loge("commentSDK", "dealReply, originUri: " + intent.getDataString() + ", replyFragmentName: " + d);
                s4v.a("Page_commentNav", "featureRequest", SSOIPCConstants.IPC_JUMP_URL, "Reply", "originUri", intent.getDataString(), "context", i.getClass().getName(), "replyFragmentName", d);
                vcq.a(activity).c(xcq.c().i(new q17(activity)).p(true).j(ix9.h(activity, d).f(new b(activity, i, data, supportFragmentManager)).a()).n());
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("bundleUrl", data.toString());
                findFragmentByTag.setArguments(bundle);
                if (!findFragmentByTag.isAdded()) {
                    supportFragmentManager.beginTransaction().add(findFragmentByTag, COMMENT_DIALOG_TAG).commitAllowingStateLoss();
                    supportFragmentManager.executePendingTransactions();
                }
            }
        }
        return false;
    }
}
