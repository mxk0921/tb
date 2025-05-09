package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.TBUrlRuleDownloader;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import com.taobao.tao.shop.rule.data.TBUrlRuleResponse;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class myr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile myr c = null;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, TBUrlRuleResponse> f24395a = new ConcurrentHashMap<>();
    public final pvd b = lyr.c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AsyncTask<Object, Object, TBUrlRuleResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBBundleUrlRuleInfo f24396a;

        public a(TBBundleUrlRuleInfo tBBundleUrlRuleInfo) {
            this.f24396a = tBBundleUrlRuleInfo;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/rule/TBUrlRuleDataManager$1");
        }

        /* renamed from: a */
        public TBUrlRuleResponse doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBUrlRuleResponse) ipChange.ipc$dispatch("9ec15e6a", new Object[]{this, objArr});
            }
            TBUrlRuleResponse a2 = hio.a(this.f24396a.mBundleName, myr.a(myr.this).a(this.f24396a.mBundleName));
            if (a2 != null) {
                return a2;
            }
            mvr.d(" initRule() -  load rule from assets ");
            String a3 = iyr.a(this.f24396a.mRuleFileName);
            TBUrlRuleResponse a4 = hio.a(this.f24396a.mBundleName, a3);
            if (a4 != null) {
                myr.b(myr.this, this.f24396a.mBundleName, a3, a4.version);
                return a4;
            }
            mvr.d(" initRule() -  assets rule not working , wired ");
            myr.b(myr.this, this.f24396a.mBundleName, "", "");
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(TBUrlRuleResponse tBUrlRuleResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5692851", new Object[]{this, tBUrlRuleResponse});
                return;
            }
            super.onPostExecute(tBUrlRuleResponse);
            if (tBUrlRuleResponse != null) {
                myr.c(myr.this).put(this.f24396a.mBundleName, tBUrlRuleResponse);
                TBUrlRuleDownloader.a(this.f24396a.mBundleName, tBUrlRuleResponse.version);
                mvr.d(" initRule() -  success ");
                return;
            }
            mvr.d(" initRule() -  both ruleCache and assets not work, impossible ");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Object, Object, TBUrlRuleResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24397a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.f24397a = str;
            this.b = str2;
            this.c = str3;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/rule/TBUrlRuleDataManager$2");
        }

        /* renamed from: a */
        public TBUrlRuleResponse doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBUrlRuleResponse) ipChange.ipc$dispatch("9ec15e6a", new Object[]{this, objArr});
            }
            myr.b(myr.this, this.f24397a, this.b, this.c);
            return hio.a(this.f24397a, this.b);
        }

        /* renamed from: b */
        public void onPostExecute(TBUrlRuleResponse tBUrlRuleResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5692851", new Object[]{this, tBUrlRuleResponse});
                return;
            }
            super.onPostExecute(tBUrlRuleResponse);
            if (tBUrlRuleResponse != null) {
                myr.c(myr.this).put(this.f24397a, tBUrlRuleResponse);
                mvr.d(" refreshRule() -  success ");
                return;
            }
            mvr.d(" refreshRule() -  download rule is not valid  ");
        }
    }

    static {
        t2o.a(668991550);
    }

    public static /* synthetic */ pvd a(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvd) ipChange.ipc$dispatch("201b8ad4", new Object[]{myrVar});
        }
        return myrVar.b;
    }

    public static /* synthetic */ void b(myr myrVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45557ce7", new Object[]{myrVar, str, str2, str3});
        } else {
            myrVar.i(str, str2, str3);
        }
    }

    public static /* synthetic */ ConcurrentHashMap c(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("a3a5007e", new Object[]{myrVar});
        }
        return myrVar.f24395a;
    }

    public static myr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("eced0c3", new Object[0]);
        }
        if (c == null) {
            synchronized (myr.class) {
                try {
                    if (c == null) {
                        c = new myr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e578e694", new Object[]{this, str});
            return;
        }
        TBUrlRuleResponse tBUrlRuleResponse = this.f24395a.get(str);
        if (tBUrlRuleResponse == null) {
            mvr.d(" TBUrlRuleDataManager.checkRuleNeedUpdate() -  tbUrlRuleResponse == null  ");
        } else {
            TBUrlRuleDownloader.a(str, tBUrlRuleResponse.version);
        }
    }

    public TBUrlRuleResponse f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBUrlRuleResponse) ipChange.ipc$dispatch("45d09fc1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            mvr.d("bundleName  is  empty");
            return null;
        }
        TBBundleUrlRuleInfo a2 = o7r.a(str);
        if (a2 == null) {
            mvr.d("not support bundleName=" + str);
            return null;
        }
        TBUrlRuleResponse tBUrlRuleResponse = this.f24395a.get(str);
        if (tBUrlRuleResponse == null) {
            g(a2);
            mvr.d(" TBUrlRuleResponse did not initialized " + str);
            return null;
        }
        TBUrlRuleDownloader.a(a2.mBundleName, tBUrlRuleResponse.version);
        return tBUrlRuleResponse;
    }

    public void g(TBBundleUrlRuleInfo tBBundleUrlRuleInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468f7990", new Object[]{this, tBBundleUrlRuleInfo});
        } else if (tBBundleUrlRuleInfo == null) {
            mvr.d(" initRule() -  bundleInfo is null");
        } else {
            new a(tBBundleUrlRuleInfo).execute(new Object[0]);
        }
    }

    public void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3320dc", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            new b(str, str2, str3).execute(new Object[0]);
        }
    }

    public final void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d5802f", new Object[]{this, str, str2, str3});
        } else if (((lyr) this.b).e(str, str2)) {
            ((lyr) this.b).d(str, str3);
        } else {
            mvr.d(" saveToCache() -  saveRuleToFile=false  ");
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dfce02", new Object[]{this});
            return;
        }
        o7r.d();
        g(o7r.a(o7r.f25192a));
    }
}
