package com.taobao.themis.canvas.extension.instance;

import android.app.Activity;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.canvas.ui.GameForceUpdateGuide;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Result;
import kotlin.b;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.j4a;
import tb.n51;
import tb.q9s;
import tb.t2o;
import tb.t4c;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSGameForceUpdateExtension implements t4c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TMSGameForceUpdateExtension";

    /* renamed from: a  reason: collision with root package name */
    public final bbs f13473a;
    public final n51.e b;
    public GameForceUpdateGuide c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666539);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(834666536);
        t2o.a(839909557);
    }

    public TMSGameForceUpdateExtension(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f13473a = bbsVar;
        n51.e eVar = new n51.e() { // from class: com.taobao.themis.canvas.extension.instance.TMSGameForceUpdateExtension.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.n51.e
            public void a(AppModel appModel) {
                Object obj;
                JSONObject jSONObject;
                Boolean bool;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f1bd7c98", new Object[]{this, appModel});
                    return;
                }
                TMSGameForceUpdateExtension tMSGameForceUpdateExtension = TMSGameForceUpdateExtension.this;
                if (appModel != null) {
                    try {
                    } catch (Throwable th) {
                        obj = Result.m1108constructorimpl(b.a(th));
                    }
                    if (tMSGameForceUpdateExtension.y().U() != null) {
                        String appId = appModel.getAppId();
                        TMSMetaInfoWrapper U = tMSGameForceUpdateExtension.y().U();
                        ckf.d(U);
                        if (ckf.b(appId, U.b())) {
                            StringBuilder sb = new StringBuilder("onUpdate current version: ");
                            TMSMetaInfoWrapper U2 = tMSGameForceUpdateExtension.y().U();
                            String str = null;
                            sb.append((Object) (U2 == null ? null : U2.l()));
                            sb.append(", new version : ");
                            sb.append((Object) appModel.getAppInfoModel().getDeveloperVersion());
                            TMSLogger.b(TMSGameForceUpdateExtension.TAG, sb.toString());
                            String developerVersion = appModel.getAppInfoModel().getDeveloperVersion();
                            TMSMetaInfoWrapper U3 = tMSGameForceUpdateExtension.y().U();
                            ckf.d(U3);
                            if (!ckf.b(developerVersion, U3.l()) && (jSONObject = appModel.getExtendInfos().getJSONObject("forceUpdateInfo")) != null) {
                                String string = jSONObject.getString("releaseNotes");
                                ckf.f(string, AdvanceSetting.NETWORK_TYPE);
                                if (wsq.a0(string)) {
                                    string = null;
                                }
                                if (string != null && (bool = jSONObject.getBoolean("forceUpdate")) != null) {
                                    boolean booleanValue = bool.booleanValue();
                                    j4a j4aVar = new j4a();
                                    j4aVar.g(string);
                                    String string2 = jSONObject.getString("updateTitle");
                                    String str2 = "版本更新";
                                    if (string2 != null) {
                                        if (!wsq.a0(string2)) {
                                            str = string2;
                                        }
                                        if (str != null) {
                                            str2 = str;
                                        }
                                    }
                                    j4aVar.h(str2);
                                    j4aVar.e(appModel.getAppInfoModel().getLogo());
                                    j4aVar.f(booleanValue);
                                    if (TMSGameForceUpdateExtension.b(tMSGameForceUpdateExtension) == null) {
                                        Activity I = tMSGameForceUpdateExtension.y().I();
                                        ckf.f(I, "instance.activity");
                                        TMSGameForceUpdateExtension.t(tMSGameForceUpdateExtension, new GameForceUpdateGuide(I, j4aVar, tMSGameForceUpdateExtension.y()));
                                        CommonExtKt.o(new TMSGameForceUpdateExtension$1$onUpdate$1$1(tMSGameForceUpdateExtension));
                                        obj = Result.m1108constructorimpl(xhv.INSTANCE);
                                        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                                        if (th2 != null) {
                                            TMSLogger.d(TMSGameForceUpdateExtension.TAG, th2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };
        this.b = eVar;
        if (q9s.INSTANCE.z0()) {
            n51.i().k(eVar);
        }
    }

    public static final /* synthetic */ GameForceUpdateGuide b(TMSGameForceUpdateExtension tMSGameForceUpdateExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GameForceUpdateGuide) ipChange.ipc$dispatch("c632990d", new Object[]{tMSGameForceUpdateExtension});
        }
        return tMSGameForceUpdateExtension.c;
    }

    public static final /* synthetic */ void t(TMSGameForceUpdateExtension tMSGameForceUpdateExtension, GameForceUpdateGuide gameForceUpdateGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5f3df3", new Object[]{tMSGameForceUpdateExtension, gameForceUpdateGuide});
        } else {
            tMSGameForceUpdateExtension.c = gameForceUpdateGuide;
        }
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            t4c.a.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        n51.e eVar = this.b;
        if (eVar != null) {
            n51.i().m(eVar);
        }
    }

    public final bbs y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.f13473a;
    }
}
