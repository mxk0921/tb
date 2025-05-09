package tb;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.alipay2.AlipaySSOResultActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ws0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements DataCallback<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f30883a;

        /* compiled from: Taobao */
        /* renamed from: tb.ws0$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class AsyncTaskC1089a extends AsyncTask<Object, Void, Boolean> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f30884a;

            public AsyncTaskC1089a(String str) {
                this.f30884a = str;
            }

            public static /* synthetic */ Object ipc$super(AsyncTaskC1089a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sns4android/alipay2/AlipayAuthSso$1$1");
            }

            /* renamed from: a */
            public Boolean doInBackground(Object... objArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Boolean) ipChange.ipc$dispatch("91b7eba9", new Object[]{this, objArr});
                }
                try {
                    yeq.d(a.this.f30883a, DataProviderFactory.getDataProvider().getAlipaySsoDesKey(), this.f30884a, DataProviderFactory.getDataProvider().getContext().getPackageName(), AlipaySSOResultActivity.class.getName());
                    return Boolean.TRUE;
                } catch (Exception e) {
                    e.printStackTrace();
                    return Boolean.FALSE;
                }
            }

            /* renamed from: b */
            public void onPostExecute(Boolean bool) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b98eb50", new Object[]{this, bool});
                } else if (!bool.booleanValue()) {
                    ws0.a();
                }
            }
        }

        public a(Activity activity) {
            this.f30883a = activity;
        }

        /* renamed from: a */
        public void result(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dec15eee", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                new CoordinatorWrapper().execute(new AsyncTaskC1089a(str), new Object[0]);
            } else {
                ws0.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(DataProviderFactory.getApplicationContext(), ResourceUtil.getNetworkError(), 0).show();
            }
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            c();
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff1c12b", new Object[]{activity});
        } else {
            AlipayInfo.getInstance().getApdidToken(new a(activity));
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1246f03", new Object[0]);
            return;
        }
        try {
            new Handler(Looper.getMainLooper()).post(new b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
