package com.taobao.favorites.favoritesdk.base;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.is6;
import tb.rt6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ModelSdkBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RemoteBusiness f10547a;
    public final is6 b;

    static {
        t2o.a(707788831);
        t2o.a(707788830);
    }

    public ModelSdkBusiness(is6 is6Var) {
        this(is6Var, null);
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "ModelSdkBusiness(DataRequest dataRequest)", "20180112");
    }

    public static ModelSdkBusiness b(is6 is6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelSdkBusiness) ipChange.ipc$dispatch("6bd48317", new Object[]{is6Var});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public static ModelSdkBusiness create(DataRequest dataRequest)", "20180112");
        return new ModelSdkBusiness(is6Var);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a20bc", new Object[]{this});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public void cancelRequest()", "20180112");
        this.f10547a.cancelRequest();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9d3c13", new Object[]{this})).booleanValue();
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public boolean isTaskCanceled()", "20180112");
        return this.f10547a.isTaskCanceled();
    }

    public ModelSdkBusiness d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelSdkBusiness) ipChange.ipc$dispatch("9f8eb77e", new Object[]{this, obj});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public ModelSdkBusiness reqContext(Object requestContext)", "20180112");
        this.f10547a.reqContext(obj);
        return this;
    }

    public ModelSdkBusiness e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelSdkBusiness) ipChange.ipc$dispatch("1a1e11da", new Object[]{this, new Boolean(z)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public ModelSdkBusiness setErrorNotifyAfterCache(boolean bNotify)", "20180112");
        this.f10547a.setErrorNotifyAfterCache(z);
        return this;
    }

    public final void f(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af16977c", new Object[]{this, mtopListener});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "private void setRemoteListener(MtopListener listener)", "20180112");
        if (mtopListener instanceof CacheLisener) {
            final rt6 a2 = this.b.a();
            final CacheLisener cacheLisener = (CacheLisener) mtopListener;
            this.f10547a.registeListener(new IRemoteCacheListener() { // from class: com.taobao.favorites.favoritesdk.base.ModelSdkBusiness.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
                public void onCached(MtopCacheEvent mtopCacheEvent, final BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                    } else if (a2 != null) {
                        BaseOutDo baseOutDo2 = new BaseOutDo() { // from class: com.taobao.favorites.favoritesdk.base.ModelSdkBusiness.1.1
                            @Override // mtopsdk.mtop.domain.BaseOutDo
                            public Object getData() {
                                BaseOutDo baseOutDo3 = baseOutDo;
                                if (baseOutDo3 == null || baseOutDo3.getData() == null) {
                                    return null;
                                }
                                return a2.a(baseOutDo.getData());
                            }
                        };
                        baseOutDo2.setApi(baseOutDo.getApi());
                        baseOutDo2.setRet(baseOutDo.getRet());
                        baseOutDo2.setV(baseOutDo.getV());
                        cacheLisener.onCached(mtopCacheEvent, baseOutDo2, obj);
                    } else {
                        cacheLisener.onCached(mtopCacheEvent, baseOutDo, obj);
                    }
                }
            });
        }
        if (mtopListener instanceof ResultListener) {
            final rt6 a3 = this.b.a();
            final ResultListener resultListener = (ResultListener) mtopListener;
            this.f10547a.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.favorites.favoritesdk.base.ModelSdkBusiness.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    rt6 rt6Var = a3;
                    if (rt6Var != null) {
                        mtopResponse = rt6Var.b(mtopResponse);
                    }
                    resultListener.onError(i, mtopResponse, obj);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, final BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    rt6 rt6Var = a3;
                    if (rt6Var != null) {
                        MtopResponse b = rt6Var.b(mtopResponse);
                        BaseOutDo baseOutDo2 = new BaseOutDo() { // from class: com.taobao.favorites.favoritesdk.base.ModelSdkBusiness.2.1
                            @Override // mtopsdk.mtop.domain.BaseOutDo
                            public Object getData() {
                                BaseOutDo baseOutDo3 = baseOutDo;
                                if (baseOutDo3 == null || baseOutDo3.getData() == null) {
                                    return null;
                                }
                                return a3.a(baseOutDo.getData());
                            }
                        };
                        baseOutDo2.setApi(baseOutDo.getApi());
                        baseOutDo2.setRet(baseOutDo.getRet());
                        baseOutDo2.setV(baseOutDo.getV());
                        resultListener.onSuccess(i, b, baseOutDo2, obj);
                        return;
                    }
                    resultListener.onSuccess(i, mtopResponse, baseOutDo, obj);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    rt6 rt6Var = a3;
                    if (rt6Var != null) {
                        mtopResponse = rt6Var.b(mtopResponse);
                    }
                    resultListener.onSystemError(i, mtopResponse, obj);
                }
            });
        }
    }

    public ModelSdkBusiness g(int i, Class<?> cls, MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelSdkBusiness) ipChange.ipc$dispatch("e28309ab", new Object[]{this, new Integer(i), cls, mtopListener});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public ModelSdkBusiness startRequest(int requestType, Class<?> responseClass, MtopListener listener)", "20180112");
        f(mtopListener);
        TLog.logi("modelget", " favoritesdk is using".concat(this.b.b().getClass().getSimpleName()));
        this.f10547a.startRequest(i, cls);
        TLog.logd("modelget", " sdkmtoprequest = " + this.f10547a.request.toString());
        return this;
    }

    public MtopResponse i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("bac48c0", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public MtopResponse syncRequest()", "20180112");
        TLog.logi("modelget", " favoritesdk is using".concat(this.b.b().getClass().getSimpleName()));
        return this.f10547a.syncRequest();
    }

    public ModelSdkBusiness j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelSdkBusiness) ipChange.ipc$dispatch("14173390", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public ModelSdkBusiness useCache()", "20180112");
        this.f10547a.useCache();
        return this;
    }

    public ModelSdkBusiness h(Class<?> cls, MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelSdkBusiness) ipChange.ipc$dispatch("24edc990", new Object[]{this, cls, mtopListener});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "public ModelSdkBusiness startRequest(Class<?> responseClass, MtopListener listener)", "20180112");
        g(0, cls, mtopListener);
        return this;
    }

    public ModelSdkBusiness(is6 is6Var, String str) {
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.ModelSdkBusiness", "ModelSdkBusiness(DataRequest dataRequest, String ttid)", "20180112");
        this.f10547a = RemoteBusiness.build(is6Var.b(), str);
        this.b = is6Var;
    }
}
