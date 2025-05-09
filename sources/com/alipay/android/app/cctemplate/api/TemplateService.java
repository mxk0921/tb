package com.alipay.android.app.cctemplate.api;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.cctemplate.preload.DynamicTemplateQuickPayCache;
import com.alipay.android.app.cctemplate.storage.TemplateAssetsStorage;
import com.alipay.android.app.cctemplate.transport.TemplateManager;
import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.android.app.render.api.ITemplateLoadStatusCallback;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.callback.b;
import com.flybird.deploy.callback.c;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBSimpleTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.FBUpdatePolicy$DeploymentType;
import com.flybird.deploy.model.a;
import com.flybird.deploy.model.b;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import tb.nmg;
import tb.tu8;
import tb.uu8;
import tb.vu8;
import tb.y0a;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TemplateService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITplProvider f3475a;
    public ICashierRender.PreRenderResultClearHandler c;
    public volatile FBTemplateDecider e;
    public final ConditionVariable d = new ConditionVariable();
    public final TemplateManager b = new TemplateManager();

    public TemplateService(ITplProvider iTplProvider) {
        this.f3475a = iTplProvider;
        try {
            nmg.a("QUICKPAY", new tu8.b().b(iTplProvider.getContext().getApplicationContext()).d("").c(FBUpdatePolicy$DeploymentType.EnhancedDeployment).h(new vu8() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.vu8
                public void onStatusNotify(String str, String str2, int i, int i2) {
                    ICashierRender.PreRenderResultClearHandler access$200;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("897ed895", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：监听到模板更新任务状态变更, tplId=" + str + " status=" + i + " downloadMode=" + i2);
                    if (i == 7 && (access$200 = TemplateService.access$200(TemplateService.this)) != null) {
                        LogUtils.record(2, "TemplateService", "fb_v2:收银台：尝试清空预渲染结果, tplId=" + str + " status=" + i + " downloadMode=" + i2);
                        access$200.clearResultsWithTplId(str);
                    }
                }
            }).g(new c() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.flybird.deploy.callback.c
                public void askUserShouldRetry(y0a<Boolean, Void, Void> y0aVar, a.C0245a aVar) {
                    Object obj;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c626cc57", new Object[]{this, y0aVar, aVar});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？" + aVar);
                    if (aVar == null || (obj = aVar.customToken) == null) {
                        LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？ -> 异常，false");
                        y0aVar.apply(Boolean.FALSE);
                        return;
                    }
                    ICashierRender.RenderParams access$100 = TemplateService.access$100(TemplateService.this, obj);
                    if (access$100 == null) {
                        LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？ -> 异常，false");
                        y0aVar.apply(Boolean.FALSE);
                        return;
                    }
                    ITemplateLoadStatusCallback iTemplateLoadStatusCallback = access$100.mStatusCallback;
                    if (iTemplateLoadStatusCallback == null) {
                        LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？ -> 异常，false");
                        y0aVar.apply(Boolean.FALSE);
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：正在咨询用户是否需要继续强制更新");
                    boolean onNewBnDeployAskingUserShouldContinue = iTemplateLoadStatusCallback.onNewBnDeployAskingUserShouldContinue();
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：强制更新咨询返回了 " + onNewBnDeployAskingUserShouldContinue);
                    y0aVar.apply(Boolean.valueOf(onNewBnDeployAskingUserShouldContinue));
                }
            }).e(new b() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
                    if (r12.equals("CT") == false) goto L_0x00fd;
                 */
                @Override // com.flybird.deploy.callback.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void handleLogMap(java.util.HashMap<java.lang.String, java.lang.String> r18, com.flybird.deploy.callback.a.C0245a r19) {
                    /*
                        Method dump skipped, instructions count: 328
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.cctemplate.api.TemplateService.AnonymousClass2.handleLogMap(java.util.HashMap, com.flybird.deploy.callback.a$a):void");
                }
            }).f(new uu8() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.uu8
                public void onError(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：监听到模板部署异常, errCode=" + str + ", errDesc=" + str2);
                }
            }).a(), new y0a<FBTemplateDecider, Void, Void>() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void error(Void r5) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("387cab6", new Object[]{this, r5});
                    }
                }

                public Void apply(FBTemplateDecider fBTemplateDecider) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Void) ipChange.ipc$dispatch("96146916", new Object[]{this, fBTemplateDecider});
                    }
                    TemplateService.access$300(TemplateService.this, fBTemplateDecider);
                    return null;
                }
            });
        } catch (Throwable th) {
            LogUtils.record(8, "TemplateService", "fb_v2:收银台：模板更新部署创建异常");
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ Object access$000(TemplateService templateService, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("29ce53a2", new Object[]{templateService, obj});
        }
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 2 || (obj2 = objArr[0]) == null) {
            return null;
        }
        return obj2;
    }

    public static /* synthetic */ ICashierRender.RenderParams access$100(TemplateService templateService, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierRender.RenderParams) ipChange.ipc$dispatch("27f829f9", new Object[]{templateService, obj});
        }
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 2) {
            return null;
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof ICashierRender.RenderParams) {
            return (ICashierRender.RenderParams) obj2;
        }
        return null;
    }

    public static /* synthetic */ ICashierRender.PreRenderResultClearHandler access$200(TemplateService templateService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierRender.PreRenderResultClearHandler) ipChange.ipc$dispatch("57b01dcb", new Object[]{templateService});
        }
        return templateService.c;
    }

    public static /* synthetic */ void access$300(TemplateService templateService, FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb31ca3", new Object[]{templateService, fBTemplateDecider});
            return;
        }
        templateService.e = fBTemplateDecider;
        templateService.d.open();
    }

    public static /* synthetic */ Object access$400(TemplateService templateService, Object obj, ICashierRender.RenderParams renderParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9753fea4", new Object[]{templateService, obj, renderParams});
        }
        return b(obj, renderParams);
    }

    public static /* synthetic */ FBTemplateDecider access$500(TemplateService templateService, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateDecider) ipChange.ipc$dispatch("ee962e73", new Object[]{templateService, new Long(j)});
        }
        return templateService.a(j);
    }

    public static Object b(Object obj, ICashierRender.RenderParams renderParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c4fb3dc", new Object[]{obj, renderParams}) : new Object[]{obj, renderParams};
    }

    public static String getBirdNestVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d8848e8", new Object[0]);
        }
        String version = BirdNestEngine.getVersion();
        LogUtils.record(2, "TemplateService::getBirdNestVersion", "bv:" + version);
        return version;
    }

    public final FBTemplateDecider a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateDecider) ipChange.ipc$dispatch("9a9d874c", new Object[]{this, new Long(j)});
        }
        if (Looper.myLooper() != Looper.getMainLooper() && j > 0) {
            this.d.block(j);
        }
        if (this.e == null) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "decider-create-timeout", Thread.currentThread().getName());
        }
        return this.e;
    }

    public Template getLocalTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("24a01415", new Object[]{this, str});
        }
        FBTemplateDecider a2 = a(1000L);
        if (a2 != null) {
            return Template.fromFBTemplateContent(a2.l(FBSimpleTplInfo.a(str)));
        }
        LogUtils.record(8, "getLocalTemplate", "missing decider, id=" + str);
        return null;
    }

    public boolean needUpdateLocalTpl(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51d0d0ad", new Object[]{this, template, template2})).booleanValue();
        }
        return TemplateManager.whetherNeedUpdate(template2, template);
    }

    public void preLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c2a30", new Object[]{this});
        } else {
            preLoad(null);
        }
    }

    public String readAssets(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87964fe2", new Object[]{this, str, context});
        }
        return TemplateAssetsStorage.readAssetsFile(str, this.f3475a.getResources().getAssets(), context);
    }

    public void registerPreRenderResultClearHandler(ICashierRender.PreRenderResultClearHandler preRenderResultClearHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e499d7e", new Object[]{this, preRenderResultClearHandler});
        } else {
            this.c = preRenderResultClearHandler;
        }
    }

    public void sendRenderEventReportForDecider(Template template, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788fb8c7", new Object[]{this, template, new Boolean(z), new Long(j)});
            return;
        }
        FBTemplateDecider a2 = a(1000L);
        if (a2 == null || template == null) {
            LogUtils.record(8, "sendRenderEventReport", "missing decider");
        } else {
            a2.p(template.tplId, template.getAttachedFBTemplateContent(), z, j);
        }
    }

    public void triggerTemplateUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae071cc2", new Object[]{this});
        } else {
            SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.flybird.deploy.model.a b = new a.b().c(TemplateService.access$400(TemplateService.this, StatisticCollector.GLOBAL_AGENT, null)).a("fb::deploy::log_need_render", "N").a("fb::deploy::log_update_source", LogItem.TemplateUpdateScene.Unset.logValue).b();
                    FBTemplateDecider access$500 = TemplateService.access$500(TemplateService.this, 1000L);
                    if (access$500 != null) {
                        access$500.q(b, new com.flybird.deploy.callback.a() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.7.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.flybird.deploy.callback.a
                            public void onFailure(a.C0245a aVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("830cf543", new Object[]{this, aVar});
                                    return;
                                }
                                LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知更新失败, 上下文 " + aVar);
                            }

                            @Override // com.flybird.deploy.callback.a
                            public void onSuccess(List<FBTemplateContent> list, a.C0245a aVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("bf2b4919", new Object[]{this, list, aVar});
                                    return;
                                }
                                LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知延迟更新成功，结果 " + list + ", 上下文 " + aVar);
                            }
                        });
                    }
                }
            });
        }
    }

    public Template getServerTemplate(String str, String str2) {
        String str3;
        Template localTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("7be17b87", new Object[]{this, str, str2});
        }
        Template templateItem = str2 != null ? this.b.getTemplateItem(str2.trim()) : null;
        if (templateItem != null) {
            return templateItem;
        }
        TemplateManager templateManager = this.b;
        LogUtils.record(2, "CdynamicTemplateEngine:birdParams", "id=" + str);
        if (TextUtils.isEmpty(str) || (localTemplate = getLocalTemplate(str)) == null) {
            str3 = "{\"tplVersion\":\"" + getBirdNestVersion() + "\", \"platform\":\"android\"}";
        } else {
            str3 = this.b.createBirdParamsFromTemplate(localTemplate);
        }
        return templateManager.getTemplateItem(str3);
    }

    public void preLoad(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053798", new Object[]{this, context});
        } else {
            DynamicTemplateQuickPayCache.getInstance().preLoad(this.f3475a);
        }
    }

    public Template loadTemplate(String str, String str2, String str3, Object obj, ICashierRender.RenderParams renderParams) {
        FBFullTplInfo fBFullTplInfo;
        String str4;
        FBFullTplInfo fBFullTplInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("dff39e5c", new Object[]{this, str, str2, str3, obj, renderParams});
        }
        FBTemplateDecider a2 = a(1000L);
        if (a2 != null) {
            if (renderParams.isPreRender) {
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次预渲染，尝试取出本地模板触发更新, tplId=" + str);
                FBTemplateContent l = a2.l(FBSimpleTplInfo.a(str));
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次预渲染，已经取出了本地模板来触发更新, tplToPrerender=" + l);
                fBFullTplInfo = FBTemplateContent.asFullTplInfo(l);
            } else {
                if (TextUtils.isEmpty(str2) || str2.charAt(0) != '{') {
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：Desc 是空的，特殊处理");
                    fBFullTplInfo2 = FBTemplateContent.asFullTplInfo(a2.l(FBSimpleTplInfo.a(str)));
                } else {
                    fBFullTplInfo2 = FBFullTplInfo.fromJSONString(str2);
                }
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次真实渲染，提交给鸟巢的 tplDesc = " + str2 + " info=" + fBFullTplInfo2);
                fBFullTplInfo = fBFullTplInfo2;
            }
            if (!TextUtils.isEmpty(str) && fBFullTplInfo != null && !TextUtils.equals(fBFullTplInfo.getTplId(), str)) {
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次渲染发现 tplId 不同，兼容处理");
                try {
                    JSONObject jSONObject = FBFullTplInfo.toJSONObject(fBFullTplInfo);
                    jSONObject.put("tplId", str);
                    fBFullTplInfo = FBFullTplInfo.fromJSONObject(jSONObject);
                } catch (Throwable th) {
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：兼容处理过程中发生异常");
                    a2.n(str, "cashier:comp:err", "", "error: " + th.getMessage());
                }
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final ArrayList arrayList = new ArrayList();
            LogUtils.record(2, "TemplateService", "fb_v2:收银台：提交更新任务给鸟巢，更新单个模板");
            LogItem.TemplateUpdateScene templateUpdateScene = renderParams.updateScene;
            b.C0247b a3 = new b.C0247b().a("fb::deploy::log_update_source", templateUpdateScene.logValue);
            if (templateUpdateScene == LogItem.TemplateUpdateScene.Unset) {
                str4 = "Y";
            } else {
                str4 = "N";
            }
            final Throwable[] thArr = new Throwable[1];
            a2.r(fBFullTplInfo, a3.a("fb::deploy::log_need_render", str4).c(b(obj, renderParams)).b(), new com.flybird.deploy.callback.a() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.flybird.deploy.callback.a
                public void onFailure(a.C0245a aVar) {
                    Throwable th2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("830cf543", new Object[]{this, aVar});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知更新失败, 上下文 " + aVar);
                    Throwable[] thArr2 = thArr;
                    if (!aVar.errors.isEmpty()) {
                        th2 = aVar.errors.get(0);
                    } else {
                        th2 = null;
                    }
                    thArr2[0] = th2;
                    countDownLatch.countDown();
                }

                @Override // com.flybird.deploy.callback.a
                public void onSuccess(List<FBTemplateContent> list, a.C0245a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bf2b4919", new Object[]{this, list, aVar});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知更新成功，结果 " + list + ", 上下文 " + aVar);
                    arrayList.addAll(list);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            if (!arrayList.isEmpty()) {
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢模板更新全部完成, 成功更新了 " + arrayList);
                renderParams.mStatusCallback.onTemplateLoadResult(ICashierRender.TemplateLoadStatus.SUCCESS);
                return Template.fromFBTemplateContent((FBTemplateContent) arrayList.get(0));
            }
            LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢模板更新全部失败 " + arrayList);
            renderParams.mStatusCallback.onTemplateLoadResult(ICashierRender.TemplateLoadStatus.FAILED);
            a2.o(str, null, false);
            throw new RuntimeException("Failed to update tpl " + str, thArr[0]);
        }
        throw new RuntimeException("Failed to acquire decider");
    }
}
