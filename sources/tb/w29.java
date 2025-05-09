package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.tao.favorite.aidl.IFavContent;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w29 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "com.taobao.tao.mytaobao.FavoriteContent";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f30405a;
        public final /* synthetic */ IFavContentCallBack b;
        public final /* synthetic */ Bundle c;

        public a(Activity activity, IFavContentCallBack iFavContentCallBack, Bundle bundle) {
            this.f30405a = activity;
            this.b = iFavContentCallBack;
            this.c = bundle;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/favorite/content/FavoriteContent$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IFavContent iFavContent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                iFavContent = (IFavContent) Services.get((Context) this.f30405a, (Class<IInterface>) IFavContent.class);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (iFavContent == null) {
                w29.a(this.b);
                return null;
            }
            iFavContent.addFavContent(this.c, this.b);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f30406a;
        public final /* synthetic */ IFavContentCallBack b;
        public final /* synthetic */ Bundle c;

        public b(Activity activity, IFavContentCallBack iFavContentCallBack, Bundle bundle) {
            this.f30406a = activity;
            this.b = iFavContentCallBack;
            this.c = bundle;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/favorite/content/FavoriteContent$2");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IFavContent iFavContent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                iFavContent = (IFavContent) Services.get((Context) this.f30406a, (Class<IInterface>) IFavContent.class);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (iFavContent == null) {
                w29.a(this.b);
                return null;
            }
            iFavContent.deleteFavContent(this.c, this.b);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f30407a;
        public final /* synthetic */ IFavContentCallBack b;
        public final /* synthetic */ Bundle c;

        public c(Activity activity, IFavContentCallBack iFavContentCallBack, Bundle bundle) {
            this.f30407a = activity;
            this.b = iFavContentCallBack;
            this.c = bundle;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/favorite/content/FavoriteContent$3");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IFavContent iFavContent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                iFavContent = (IFavContent) Services.get((Context) this.f30407a, (Class<IInterface>) IFavContent.class);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (iFavContent == null) {
                w29.a(this.b);
                return null;
            }
            iFavContent.isFavContent(this.c, this.b);
            return null;
        }
    }

    static {
        t2o.a(462422044);
    }

    public static /* synthetic */ void a(IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c3166", new Object[]{iFavContentCallBack});
        } else {
            e(iFavContentCallBack);
        }
    }

    public static void b(Activity activity, Bundle bundle, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e762bc54", new Object[]{activity, bundle, iFavContentCallBack});
        } else if (activity == null) {
            e(iFavContentCallBack);
        } else {
            new a(activity, iFavContentCallBack, bundle).execute(new Void[0]);
        }
    }

    public static void c(Activity activity, Bundle bundle, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5115d85", new Object[]{activity, bundle, iFavContentCallBack});
        } else if (activity == null) {
            e(iFavContentCallBack);
        } else {
            new b(activity, iFavContentCallBack, bundle).execute(new Void[0]);
        }
    }

    public static void d(Activity activity, Bundle bundle, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d897e6", new Object[]{activity, bundle, iFavContentCallBack});
        } else if (activity == null) {
            e(iFavContentCallBack);
        } else {
            new c(activity, iFavContentCallBack, bundle).execute(new Void[0]);
        }
    }

    public static void e(IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3babfa", new Object[]{iFavContentCallBack});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("com.taobao.tao.mytaobao.favContent.result", "fail");
            iFavContentCallBack.onResult(hashMap);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
