package com.taobao.taopai.material.request.base;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taopai.material.MaterialRequestStrategy;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import java.io.File;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dai;
import tb.ovu;
import tb.pjd;
import tb.px1;
import tb.t2o;
import tb.uf9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class BaseMaterialBusiness<T> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "material_request";
    private pjd mFailListener;
    private boolean mIsRequestingCache;
    private px1 mParams;
    public boolean mIsReturnData = false;
    public MaterialRequestStrategy mRequestStrategy = MaterialRequestStrategy.CACHE_NET;
    private Runnable mTimeOutRunnable = new a();
    private long mStartTime = SystemClock.elapsedRealtime();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BaseMaterialBusiness.access$000(BaseMaterialBusiness.this) != null) {
                BaseMaterialBusiness baseMaterialBusiness = BaseMaterialBusiness.this;
                if (!baseMaterialBusiness.mIsReturnData) {
                    BaseMaterialBusiness.access$000(baseMaterialBusiness).onFail("-1001", "timeout");
                    BaseMaterialBusiness.this.mIsReturnData = true;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37ffa79e", new Object[]{this});
            } else {
                BaseMaterialBusiness.access$000(BaseMaterialBusiness.this).onFail("-1000", "cache_empty");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6aa1c53b", new Object[]{this, obj});
            } else {
                BaseMaterialBusiness.this.handleCacheLoaded(obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final Object access$100 = BaseMaterialBusiness.access$100(BaseMaterialBusiness.this);
            BaseMaterialBusiness.access$202(BaseMaterialBusiness.this, false);
            if (access$100 != null) {
                ovu.b(new Runnable() { // from class: tb.ox1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseMaterialBusiness.b.this.d(access$100);
                    }
                });
                BaseMaterialBusiness.access$400(BaseMaterialBusiness.this);
            } else if (BaseMaterialBusiness.access$300(BaseMaterialBusiness.this)) {
                ovu.b(new Runnable() { // from class: tb.nx1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseMaterialBusiness.b.this.c();
                    }
                });
            } else {
                BaseMaterialBusiness.this.requestNet();
            }
        }
    }

    static {
        t2o.a(782237790);
        t2o.a(782237794);
        t2o.a(589299719);
    }

    public BaseMaterialBusiness(px1 px1Var, pjd pjdVar) {
        this.mParams = px1Var;
        this.mFailListener = pjdVar;
    }

    public static /* synthetic */ pjd access$000(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pjd) ipChange.ipc$dispatch("958c9dc2", new Object[]{baseMaterialBusiness});
        }
        return baseMaterialBusiness.mFailListener;
    }

    public static /* synthetic */ Object access$100(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba53a03f", new Object[]{baseMaterialBusiness});
        }
        return baseMaterialBusiness.readFromCache();
    }

    public static /* synthetic */ boolean access$202(BaseMaterialBusiness baseMaterialBusiness, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbdf4f42", new Object[]{baseMaterialBusiness, new Boolean(z)})).booleanValue();
        }
        baseMaterialBusiness.mIsRequestingCache = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed5c659", new Object[]{baseMaterialBusiness})).booleanValue();
        }
        return baseMaterialBusiness.isOnlyUseCache();
    }

    public static /* synthetic */ void access$400(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2755d6", new Object[]{baseMaterialBusiness});
        } else {
            baseMaterialBusiness.statSuccessFromCache();
        }
    }

    private boolean isCacheInvalid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50434fb4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (!file.exists() || System.currentTimeMillis() - file.lastModified() > getCacheTime()) {
            return true;
        }
        return false;
    }

    private boolean isOnlyUseCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4201545c", new Object[]{this})).booleanValue();
        }
        if (this.mRequestStrategy == MaterialRequestStrategy.ONLY) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveCache$33(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5824bf", new Object[]{this, obj});
            return;
        }
        String cacheFilePath = getCacheFilePath();
        if (!TextUtils.isEmpty(cacheFilePath)) {
            try {
                uf9.j(cacheFilePath, JSON.toJSONString(obj));
            } catch (Exception e) {
                Log.e(TAG, "save cache fail " + e.toString());
            }
        }
    }

    private T readFromCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca355c9", new Object[]{this});
        }
        String cacheFilePath = getCacheFilePath();
        if (isCacheInvalid(cacheFilePath)) {
            return null;
        }
        try {
            String i = uf9.i(cacheFilePath);
            if (!TextUtils.isEmpty(i)) {
                return parseCacheData(i);
            }
        } catch (Exception e) {
            Log.e(TAG, "parseCacheData fail " + e.toString());
        }
        return null;
    }

    private void statFail(MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b1e89e", new Object[]{this, mtopResponse});
            return;
        }
        String str2 = "";
        if (mtopResponse != null) {
            str = mtopResponse.getRetCode();
        } else {
            str = str2;
        }
        if (mtopResponse != null) {
            str2 = mtopResponse.getRetMsg();
        }
        dai.b(this.mParams.a(), getUtRequestKey(), this.mParams.toString(), str, str2, SystemClock.elapsedRealtime() - this.mStartTime);
    }

    private void statSuccessFromCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3017bfb0", new Object[]{this});
        } else {
            dai.f(this.mParams.a(), getUtRequestKey());
        }
    }

    private void statSuccessFromNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3805320b", new Object[]{this});
        } else {
            dai.g(this.mParams.a(), getUtRequestKey(), SystemClock.elapsedRealtime() - this.mStartTime);
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        ovu.d(this.mTimeOutRunnable);
        this.mIsReturnData = true;
    }

    public abstract String getCacheFilePath();

    public long getCacheTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd97d6b4", new Object[]{this})).longValue();
        }
        return this.mParams.b() * 1000;
    }

    public abstract String getUtRequestKey();

    public abstract void handleCacheLoaded(T t);

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        ovu.d(this.mTimeOutRunnable);
        statFail(mtopResponse);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        ovu.d(this.mTimeOutRunnable);
        statSuccessFromNet();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        ovu.d(this.mTimeOutRunnable);
        statFail(mtopResponse);
    }

    public abstract T parseCacheData(String str);

    public void request() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
        } else if (this.mParams.c()) {
            requestCache();
        } else {
            requestNet();
        }
    }

    public void requestCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec8413a", new Object[]{this});
        } else if (!this.mIsRequestingCache) {
            this.mIsRequestingCache = true;
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b());
        }
    }

    public abstract /* synthetic */ void requestNet();

    public void saveCache(final T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51562e8", new Object[]{this, t});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.mx1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseMaterialBusiness.this.lambda$saveCache$33(t);
                }
            });
        }
    }
}
