package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.NewDetailBucketModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eyj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreLoadModel f18889a;

        public a(PreLoadModel preLoadModel) {
            this.f18889a = preLoadModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ftm a2 = eyj.a(this.f18889a.getBizName());
                if (a2 == null) {
                    fve.e("NewDetailPreLoadNotification", "doPreLoadOnScreen preloadTaskLoader is null");
                    return;
                }
                fve.e("NewDetailPreLoadNotification", "doPreLoadOnScreen");
                a2.k(JSON.toJSONString(this.f18889a), !mve.a("disableNdPreloadInit", false));
                fyj.c(fyj.UMBRELLA_ON_SCREEN_TAG_ID, this.f18889a);
            } catch (Throwable th) {
                fve.e("NewDetailPreLoadNotification", "doPreLoadOnScreen error." + th.getMessage());
                fyj.b(fyj.UMBRELLA_ON_SCREEN_TAG_ID, this.f18889a, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreLoadModel f18890a;

        public b(PreLoadModel preLoadModel) {
            this.f18890a = preLoadModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ftm a2 = eyj.a(this.f18890a.getBizName());
                if (a2 == null) {
                    fve.e("NewDetailPreLoadNotification", "doPreLoadOnLayPage preloadTaskLoader is null");
                    return;
                }
                fve.e("NewDetailPreLoadNotification", "doPreLoadOnLayPage");
                a2.u(JSON.toJSONString(this.f18890a));
                fyj.c(fyj.UMBRELLA_LAY_PAGE_TAG_ID, this.f18890a);
            } catch (Throwable th) {
                fve.e("NewDetailPreLoadNotification", "doPreLoadOnLayPage error." + th.getMessage());
                fyj.b(fyj.UMBRELLA_LAY_PAGE_TAG_ID, this.f18890a, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreLoadModel f18891a;

        public c(PreLoadModel preLoadModel) {
            this.f18891a = preLoadModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ftm a2 = eyj.a(this.f18891a.getBizName());
                if (a2 == null) {
                    fve.e("NewDetailPreLoadNotification", "doClearDataSource preloadTaskLoader is null");
                    return;
                }
                fve.e("NewDetailPreLoadNotification", "doClearDataSource");
                a2.h(JSON.toJSONString(this.f18891a));
            } catch (Throwable th) {
                fve.e("NewDetailPreLoadNotification", "doClearDataSource error." + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f18892a;

        public d(JSONObject jSONObject) {
            this.f18892a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ftm a2 = eyj.a(null);
                if (a2 == null) {
                    fve.e("NewDetailPreLoadNotification", "syncPreLoadSignal preloadTaskLoader is null");
                    return;
                }
                NewDetailBucketModel newDetailBucketModel = new NewDetailBucketModel();
                newDetailBucketModel.setBucketId(JSON.toJSONString(this.f18892a));
                String jSONString = JSON.toJSONString(newDetailBucketModel);
                fve.e("NewDetailPreLoadNotification", "updateBucket ： " + jSONString);
                a2.t(jSONString);
            } catch (Throwable th) {
                fve.e("NewDetailPreLoadNotification", "syncPreLoadSignal error." + th.getMessage());
            }
        }
    }

    static {
        t2o.a(491782432);
    }

    public static /* synthetic */ ftm a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ftm) ipChange.ipc$dispatch("50bea25c", new Object[]{str});
        }
        return e(str);
    }

    public static void b(PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9cade6", new Object[]{preLoadModel});
        } else {
            get.a().e(new c(preLoadModel));
        }
    }

    public static void c(PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136d8f97", new Object[]{preLoadModel});
        } else {
            get.a().e(new b(preLoadModel));
        }
    }

    public static void d(PreLoadModel preLoadModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409fd1c4", new Object[]{preLoadModel});
        } else {
            get.a().e(new a(preLoadModel));
        }
    }

    public static ftm e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ftm) ipChange.ipc$dispatch("6ca3b341", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "new_detail";
        }
        return itm.b(str);
    }

    public static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529cf16", new Object[]{jSONObject});
        } else {
            get.a().e(new d(jSONObject));
        }
    }
}
