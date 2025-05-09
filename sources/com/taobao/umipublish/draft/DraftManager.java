package com.taobao.umipublish.draft;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.umipublish.draft.DraftMediaHelper;
import com.taobao.umipublish.draft.b;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.d70;
import tb.eag;
import tb.fno;
import tb.gjh;
import tb.odg;
import tb.r6w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DraftManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_DELETE = "delete";
    public static final String ACTION_TYPE_SAVE = "save";
    public static final String DRAFT_ACTION = "com.taobao.umipublish.draft.DraftManager.action";
    public static final String DRAFT_URL_KEY = "umi_local_draft";
    public static final String KEY_ACTION_TYPE = "actionType";
    public static final String KEY_AUTO_SAVE = "autoSave";
    public static final String KEY_BIZ = "biz";
    public static final String KEY_DRAFT_IDS = "draftIds";
    public static final String KEY_SESSION_IDS = "sessionIds";
    public static final String TAG = "umi_draft_log";
    public static volatile DraftManager d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13978a;
    public final com.taobao.umipublish.draft.b b;
    public final ThreadPoolExecutor c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(DraftManager draftManager) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "umi_draft_work_thread");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUGCMedia f13980a;
        public final /* synthetic */ DraftModel b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements DraftMediaHelper.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
            public void onError(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                    return;
                }
                UmiPublishMonitor.B(DraftManager.TAG, "saveVideoDraftError" + str);
            }

            @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
            public void onSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    UmiPublishMonitor.B(DraftManager.TAG, "saveVideoDraftSuccess");
                }
            }
        }

        public b(IUGCMedia iUGCMedia, DraftModel draftModel) {
            this.f13980a = iUGCMedia;
            this.b = draftModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                new r6w(this.f13980a).b(this.f13980a, this.b, new a(this));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static {
        t2o.a(944766986);
    }

    public DraftManager(Context context) {
        this.f13978a = context.getApplicationContext();
        this.b = new com.taobao.umipublish.draft.a(context.getApplicationContext());
        LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.umipublish.draft.DraftManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/draft/DraftManager$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else {
                    DraftManager.a(DraftManager.this, intent);
                }
            }
        });
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this));
        this.c = threadPoolExecutor;
        if (eag.O()) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    public static /* synthetic */ void a(DraftManager draftManager, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d4d18b", new Object[]{draftManager, intent});
        } else {
            draftManager.b(intent);
        }
    }

    public static DraftManager l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftManager) ipChange.ipc$dispatch("c1a933f7", new Object[]{context});
        }
        if (d == null) {
            synchronized (DraftManager.class) {
                try {
                    if (d == null) {
                        d = new DraftManager(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void b(Intent intent) {
        LoginAction valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a2755e", new Object[]{this, intent});
        } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null && valueOf == LoginAction.NOTIFY_LOGIN_SUCCESS) {
            ((com.taobao.umipublish.draft.a) this.b).t();
        }
    }

    public b.a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("b279ab7f", new Object[]{this, str});
        }
        if (o()) {
            return ((com.taobao.umipublish.draft.a) this.b).c(str, n());
        }
        return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    public b.a e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("a682c937", new Object[]{this, str, str2});
        }
        return g(str, Collections.singletonList(str2));
    }

    public b.a f(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("ddf1811c", new Object[]{this, str, jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            UmiPublishMonitor.w().q("draftIds is empty");
            return new b.a("102", b.a.ERROR_MSG_INVALID_PARAM);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        b.a g = g(str, arrayList);
        if (!g.c) {
            UmiPublishMonitor.w().q(jSONArray.toJSONString());
        }
        return g;
    }

    public b.a g(String str, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("74cb1e65", new Object[]{this, str, collection});
        }
        if (o()) {
            b.a b2 = ((com.taobao.umipublish.draft.a) this.b).b(str, n(), collection);
            if (b2.c && collection.contains(j(str))) {
                c(str);
            }
            if (b2.c) {
                q(str, collection);
            }
            return b2;
        }
        UmiPublishMonitor.B(TAG, "no login: userid:" + n());
        return new b.a("105", b.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    public DraftModel h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("cd38b18f", new Object[]{this, str, str2});
        }
        if (!o()) {
            return null;
        }
        DraftModel o = ((com.taobao.umipublish.draft.a) this.b).o(str, n(), str2);
        if (o != null) {
            return o;
        }
        UmiPublishMonitor w = UmiPublishMonitor.w();
        w.u("draftId=" + str2);
        return null;
    }

    public Collection<DraftModel> i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a4fe3b09", new Object[]{this, str, new Boolean(z)});
        }
        if (!o()) {
            return null;
        }
        Collection<DraftModel> q = ((com.taobao.umipublish.draft.a) this.b).q(str, n());
        if (q == null) {
            UmiPublishMonitor.w().t("");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (DraftModel draftModel : q) {
            if (draftModel == null || !d70.Companion.a(draftModel.urlParams)) {
                arrayList2.add(draftModel);
            } else {
                arrayList.add(draftModel);
            }
        }
        if (z) {
            return arrayList;
        }
        return arrayList2;
    }

    public String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fae1198", new Object[]{this, str});
        }
        String k = k(str);
        if (TextUtils.isEmpty(k)) {
            return null;
        }
        return fno.h(this.f13978a, k, null);
    }

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95438b8", new Object[]{this, str});
        }
        if (!o() || TextUtils.isEmpty(str)) {
            return null;
        }
        Locale.getDefault();
        String n = n();
        return "umi_local_draft_" + str + "_" + n;
    }

    public DraftModel m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("c4f5dc6b", new Object[]{this, str});
        }
        if (!o() || TextUtils.isEmpty(str)) {
            return null;
        }
        return ((com.taobao.umipublish.draft.a) this.b).r(str, n());
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return gjh.a();
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(n());
    }

    public b.a p(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("e93185e5", new Object[]{this, str, str2, str3, str4});
        }
        DraftModel h = l(this.f13978a).h(str, str3);
        if (h != null) {
            h.draftId = null;
            h.biz = str2;
            h.failedCode = str4;
            String uuid = UUID.randomUUID().toString();
            h.urlParams.put("umi_pub_session", uuid);
            DraftMediaHelper draftMediaHelper = new DraftMediaHelper(Globals.getApplication());
            File h2 = draftMediaHelper.h(h.urlParams.get("umi_pub_session"), h);
            File h3 = draftMediaHelper.h(uuid, h);
            if (!(h2 == null || h3 == null)) {
                h2.renameTo(h3);
            }
            b.a u = ((com.taobao.umipublish.draft.a) this.b).u(str2, n(), h);
            if (u != null && u.c) {
                return u;
            }
        }
        return new b.a("106", b.a.ERROR_MSG_DRAFT_MOVE_FAILED);
    }

    public final void q(String str, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f407f4a5", new Object[]{this, str, collection});
        } else {
            LocalBroadcastManager.getInstance(this.f13978a).sendBroadcast(s("delete", str, new ArrayList<>(collection)));
        }
    }

    public final void r(DraftModel draftModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b0f297", new Object[]{this, draftModel});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(Collections.singletonList(draftModel.draftId));
        Map<String, String> map = draftModel.urlParams;
        if (map == null || !map.containsKey("umi_pub_session")) {
            str = "";
        } else {
            str = map.get("umi_pub_session");
        }
        ArrayList<String> arrayList2 = new ArrayList<>(Collections.singletonList(str));
        Intent s = s(ACTION_TYPE_SAVE, draftModel.biz, arrayList);
        s.putExtra(KEY_AUTO_SAVE, draftModel.autoSave);
        s.putStringArrayListExtra(KEY_SESSION_IDS, arrayList2);
        LocalBroadcastManager.getInstance(this.f13978a).sendBroadcast(s);
    }

    public final Intent s(String str, String str2, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("b8d81d1c", new Object[]{this, str, str2, arrayList});
        }
        Intent intent = new Intent(DRAFT_ACTION);
        intent.putExtra("actionType", str);
        intent.putExtra("biz", str2);
        intent.putStringArrayListExtra(KEY_DRAFT_IDS, arrayList);
        return intent;
    }

    public b.a u(String str, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("e7bfa0f6", new Object[]{this, str, draftModel});
        }
        if (o()) {
            return ((com.taobao.umipublish.draft.a) this.b).u(str, n(), draftModel);
        }
        return new b.a("104", b.a.ERROR_MSG_DRAFT_SAVE_FAILED);
    }

    public void v(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdbdc42", new Object[]{this, runnable});
        } else {
            this.c.submit(runnable);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305047f1", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            try {
                String k = k(str);
                if (!TextUtils.isEmpty(k)) {
                    fno.o(this.f13978a, k, "");
                    odg.b(TAG, "clear auto save marker");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b.a t(IUGCMedia iUGCMedia, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("3a68c16a", new Object[]{this, iUGCMedia, draftModel});
        }
        if (draftModel == null) {
            return new b.a("102", b.a.ERROR_MSG_INVALID_PARAM);
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(iUGCMedia, draftModel));
        b.a u = u(draftModel.biz, draftModel);
        DraftModel draftModel2 = u.f13982a;
        if (draftModel2 != null) {
            if (draftModel2.autoSave) {
                fno.o(this.f13978a, k(draftModel2.biz), u.f13982a.draftId);
                odg.b(TAG, "put auto save marker: " + u.f13982a.draftId);
            } else if (TextUtils.equals(draftModel2.draftId, j(draftModel2.biz))) {
                c(u.f13982a.biz);
            }
            r(u.f13982a);
        } else {
            UmiPublishMonitor w = UmiPublishMonitor.w();
            w.P(u.d + "," + u.e + ":" + draftModel.toString());
        }
        return u;
    }
}
