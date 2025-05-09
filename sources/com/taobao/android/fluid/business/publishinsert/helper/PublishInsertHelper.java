package com.taobao.android.fluid.business.publishinsert.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Pair;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.IPublishInsertService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.TaskList;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.c4o;
import tb.fkg;
import tb.gix;
import tb.ir9;
import tb.kon;
import tb.l4w;
import tb.nql;
import tb.o6d;
import tb.pep;
import tb.rg7;
import tb.sz3;
import tb.t2o;
import tb.tg7;
import tb.yao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PublishInsertHelper implements o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int NORMAL_PUBLISH = 0;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f7678a = new HashMap<>();
    public final Context b;
    public final FluidContext c;
    public PublishInsertBroadcastReceiver d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements gix.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                ir9.b("PublishInsertHelper", "--Windvane调用失败");
            }
        }

        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                ir9.b("PublishInsertHelper", "--Windvane调用成功");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements rg7.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7680a;

        public b(String str) {
            this.f7680a = str;
        }

        @Override // tb.rg7.c
        public void onStartRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
            }
        }

        @Override // tb.rg7.c
        public void onResult(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
            } else if (yaoVar != null && yaoVar.c() != null && yaoVar.c().first != null && !sz3.a(((com.taobao.android.fluid.framework.data.datamodel.a) yaoVar.c().first).f7799a)) {
                ir9.b("PublishInsertHelper", "根据contentId请求Detail接口成功");
                a.d dVar = ((com.taobao.android.fluid.framework.data.datamodel.a) yaoVar.c().first).f7799a.get(0);
                IFeedsListService iFeedsListService = (IFeedsListService) PublishInsertHelper.a(PublishInsertHelper.this).getService(IFeedsListService.class);
                List unmodifiableMediaSetList = ((IDataService) PublishInsertHelper.a(PublishInsertHelper.this).getService(IDataService.class)).getUnmodifiableMediaSetList();
                int a2 = a(unmodifiableMediaSetList);
                if (a2 >= 0) {
                    JSONObject jSONObject = dVar.d;
                    MediaContentDetailData g = dVar.g();
                    a.d e = unmodifiableMediaSetList.get(a2).e();
                    g.publishStatus = "publishSuccess";
                    g.content.elements = e.g().content.elements;
                    e.E(g);
                    e.d = jSONObject;
                    iFeedsListService.notifyItemChanged(a2);
                    PublishInsertHelper.b(PublishInsertHelper.this);
                    PublishInsertHelper.j(PublishInsertHelper.this);
                    return;
                }
                ir9.b("PublishInsertHelper", "上墙内容不存在" + a2);
            }
        }

        public final int a(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("888bac64", new Object[]{this, list})).intValue();
            }
            Integer num = (Integer) PublishInsertHelper.k(PublishInsertHelper.this).get(this.f7680a);
            if (list.size() > num.intValue() && TextUtils.equals(fkg.PAGE_PUBLISH, list.get(num.intValue()).m())) {
                return num.intValue();
            }
            for (int i = 0; i < list.size(); i++) {
                if (TextUtils.equals(fkg.PAGE_PUBLISH, list.get(i).m())) {
                    return i;
                }
            }
            return -1;
        }
    }

    static {
        t2o.a(468713536);
        t2o.a(468714445);
    }

    public PublishInsertHelper(FluidContext fluidContext) {
        this.c = fluidContext;
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        this.b = fluidContext.getContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r6.equals("campus") == false) goto L_0x0025;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String F(java.lang.String r6) {
        /*
            java.lang.String r0 = "video"
            java.lang.String r1 = "campus"
            r2 = 0
            r3 = 1
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001a
            java.lang.String r0 = "457ee7d7"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.Object r6 = r4.ipc$dispatch(r0, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x001a:
            r6.hashCode()
            r4 = -1
            int r5 = r6.hashCode()
            switch(r5) {
                case -1367741217: goto L_0x003c;
                case 3357525: goto L_0x0030;
                case 112202875: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            r2 = -1
            goto L_0x0043
        L_0x0027:
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x0025
        L_0x002e:
            r2 = 2
            goto L_0x0043
        L_0x0030:
            java.lang.String r2 = "more"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x003a
            goto L_0x0025
        L_0x003a:
            r2 = 1
            goto L_0x0043
        L_0x003c:
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0043
            goto L_0x0025
        L_0x0043:
            switch(r2) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0049;
                case 2: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            r6 = 0
            return r6
        L_0x0048:
            return r0
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.F(java.lang.String):java.lang.String");
    }

    public static List<Map> I(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cf14782f", new Object[]{aVar});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JSONObject> it = aVar.e().g().content.elements.iterator();
        while (it.hasNext()) {
            JSONObject next = it.next();
            Object obj = next == null ? null : next.get("url");
            if (obj != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", (String) obj);
                hashMap.put("width", (String) next.get("width"));
                hashMap.put("height", (String) next.get("height"));
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ FluidContext a(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("d6a7c0b5", new Object[]{publishInsertHelper});
        }
        return publishInsertHelper.c;
    }

    public static /* synthetic */ void b(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278a5d74", new Object[]{publishInsertHelper});
        } else {
            publishInsertHelper.Q();
        }
    }

    public static /* synthetic */ void j(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf063735", new Object[]{publishInsertHelper});
        } else {
            publishInsertHelper.R();
        }
    }

    public static /* synthetic */ HashMap k(PublishInsertHelper publishInsertHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2f7334d9", new Object[]{publishInsertHelper});
        }
        return publishInsertHelper.f7678a;
    }

    public static /* synthetic */ boolean l(PublishInsertHelper publishInsertHelper, TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660a0f1e", new Object[]{publishInsertHelper, taskList})).booleanValue();
        }
        return publishInsertHelper.r(taskList);
    }

    public static /* synthetic */ void m(PublishInsertHelper publishInsertHelper, TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f246c479", new Object[]{publishInsertHelper, taskList});
        } else {
            publishInsertHelper.M(taskList);
        }
    }

    public static /* synthetic */ void n(PublishInsertHelper publishInsertHelper, TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8379d8", new Object[]{publishInsertHelper, taskList});
        } else {
            publishInsertHelper.N(taskList);
        }
    }

    public static void o(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c9a1dd", new Object[]{fluidContext, aVar});
        } else if (((IPublishInsertService) fluidContext.getService(IPublishInsertService.class)).isPublishIInsertEnable() && aVar.m() != null && !TextUtils.equals("finish", aVar.m()) && !TextUtils.equals("publishSuccess", aVar.m())) {
            gix.c(fluidContext.getContext(), UmiWvPlugin.PLUGIN_NAME, UmiWvPlugin.ASYNC_PUBLISH_FIRE_NOTIFICATION, new JSONObject(), new a());
        }
    }

    public static kon.h t(FluidContext fluidContext, List<JSONObject> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kon.h) ipChange.ipc$dispatch("6eb4d17e", new Object[]{fluidContext, list, str, str2});
        }
        if (((IDataService) fluidContext.getService(IDataService.class)).getUnmodifiableMediaSetList().size() != 0) {
            return com.taobao.android.fluid.framework.data.datamodel.a.b(list, str, str2);
        }
        ir9.b("PublishInsertHelper", "MediasetList为空");
        return null;
    }

    public static kon.h u(FluidContext fluidContext, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kon.h) ipChange.ipc$dispatch("1e07fec0", new Object[]{fluidContext, str, str2, str3, str4, str5});
        }
        if (((IDataService) fluidContext.getService(IDataService.class)).getUnmodifiableMediaSetList().size() != 0) {
            return com.taobao.android.fluid.framework.data.datamodel.a.c(str, str2, str3, str4, str5);
        }
        ir9.b("PublishInsertHelper", "MediasetList为空");
        return null;
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487965f0", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enablePublishInsert", true);
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5487fd4c", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enablePublishInsertV2", false);
    }

    public final void E(TaskList taskList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda9382e", new Object[]{this, taskList, str});
        } else {
            ((IDataService) this.c.getService(IDataService.class)).fetchContentDetail(G(taskList), new b(str));
        }
    }

    public final tg7 G(TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg7) ipChange.ipc$dispatch("58e425c9", new Object[]{this, taskList});
        }
        String str = taskList.tasks.get(0).data.contentId;
        String tab3ComponentSource = this.c.getInstanceConfig().getTab3ComponentSource();
        String detailRequestRefreshType = ((IDataService) this.c.getService(IDataService.class)).getDetailRequestRefreshType();
        pep sessionParams = ((ISceneConfigService) this.c.getService(ISceneConfigService.class)).getSessionParams();
        tg7 b2 = nql.b(sessionParams, str, null);
        String c = nql.c(sessionParams, null);
        c4o.a f = nql.f(sessionParams, tab3ComponentSource, false, false, detailRequestRefreshType, this.c);
        f.c(true).h(false);
        b2.j(JSON.toJSONString(f.a())).h(c);
        return b2;
    }

    public final void K(FluidContext fluidContext, String str, kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f505a57", new Object[]{this, fluidContext, str, hVar});
        } else if (hVar != null) {
            ((IDataService) fluidContext.getService(IDataService.class)).insertDetailListAtCurrent(hVar);
            int currentMediaPosition = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaPosition();
            StringBuilder sb = new StringBuilder();
            int i = currentMediaPosition + 1;
            sb.append(i);
            sb.append("--curPosition 插入的位置为");
            ir9.b("PublishInsertHelper", sb.toString());
            this.f7678a.put(str, Integer.valueOf(i));
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else if (this.d == null) {
            this.d = new PublishInsertBroadcastReceiver();
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.d, new IntentFilter("UmiAsyncPublishNotification"));
        }
    }

    public void P(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70c8265", new Object[]{this, context});
        } else if (this.d != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.d);
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e03dff", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "UmiVideoPublishSuccess");
        jSONObject.put("args", (Object) new JSONObject());
        d.j jVar = new d.j(null, jSONObject, null);
        ir9.b("PublishInsertHelper", "发送了Detai成功的广播");
        NotifyModule.postNotify(jVar);
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c335a96", new Object[]{this});
        } else if (akt.w2("viborateForPubslishTime", 150) > 0 && l4w.a(this.b)) {
            ((Vibrator) this.b.getSystemService("vibrator")).vibrate(150L);
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (B() && !C()) {
            O();
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            P(this.b);
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb041a5", new Object[]{this});
        } else {
            ((IFeedsListService) this.c.getService(IFeedsListService.class)).publicNextVideo();
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae4e2b1f", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.disableAsyncPublishInsert", false);
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5c42e8e", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.disablePhotoInsertV2", false);
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f2bc78", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableCampusPublish", true);
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed19cfba", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enablePublishImage", true);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class PublishInsertBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468713539);
        }

        public PublishInsertBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(PublishInsertBroadcastReceiver publishInsertBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/publishinsert/helper/PublishInsertHelper$PublishInsertBroadcastReceiver");
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:12:0x003f, B:15:0x0050, B:17:0x005e, B:22:0x006d, B:27:0x007a, B:34:0x0089, B:35:0x008f), top: B:38:0x003f }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.PublishInsertBroadcastReceiver.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = "3c04d85a"
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r5
                r4[r0] = r6
                r6 = 2
                r4[r6] = r7
                r2.ipc$dispatch(r3, r4)
                return
            L_0x0018:
                android.os.Bundle r6 = r7.getExtras()
                if (r6 == 0) goto L_0x00ac
                java.util.Set r7 = r6.keySet()
                com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject
                r2.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x002b:
                boolean r3 = r7.hasNext()
                if (r3 == 0) goto L_0x003f
                java.lang.Object r3 = r7.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r6.get(r3)
                r2.put(r3, r4)
                goto L_0x002b
            L_0x003f:
                java.lang.Class<com.taobao.android.fluid.framework.data.remote.TaskList> r6 = com.taobao.android.fluid.framework.data.remote.TaskList.class
                java.lang.Object r6 = com.alibaba.fastjson.JSON.toJavaObject(r2, r6)     // Catch: all -> 0x0078
                com.taobao.android.fluid.framework.data.remote.TaskList r6 = (com.taobao.android.fluid.framework.data.remote.TaskList) r6     // Catch: all -> 0x0078
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.this     // Catch: all -> 0x0078
                boolean r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.l(r7, r6)     // Catch: all -> 0x0078
                if (r7 != 0) goto L_0x0050
                return
            L_0x0050:
                java.util.List<com.taobao.android.fluid.framework.data.remote.TaskList$Task> r7 = r6.tasks     // Catch: all -> 0x0078
                java.lang.Object r7 = r7.get(r1)     // Catch: all -> 0x0078
                com.taobao.android.fluid.framework.data.remote.TaskList$Task r7 = (com.taobao.android.fluid.framework.data.remote.TaskList.Task) r7     // Catch: all -> 0x0078
                com.taobao.android.fluid.framework.data.remote.TaskList$Data r7 = r7.data     // Catch: all -> 0x0078
                java.lang.String r7 = r7.type     // Catch: all -> 0x0078
                if (r7 == 0) goto L_0x00ac
                int r2 = r7.hashCode()     // Catch: all -> 0x0078
                r3 = 100313435(0x5faa95b, float:2.3572098E-35)
                if (r2 == r3) goto L_0x007a
                r1 = 112202875(0x6b0147b, float:6.6233935E-35)
                if (r2 == r1) goto L_0x006d
                goto L_0x0083
            L_0x006d:
                java.lang.String r1 = "video"
                boolean r7 = r7.equals(r1)     // Catch: all -> 0x0078
                if (r7 == 0) goto L_0x0083
                r1 = 1
                goto L_0x0084
            L_0x0078:
                r6 = move-exception
                goto L_0x0095
            L_0x007a:
                java.lang.String r2 = "image"
                boolean r7 = r7.equals(r2)     // Catch: all -> 0x0078
                if (r7 == 0) goto L_0x0083
                goto L_0x0084
            L_0x0083:
                r1 = -1
            L_0x0084:
                if (r1 == 0) goto L_0x008f
                if (r1 == r0) goto L_0x0089
                goto L_0x00ac
            L_0x0089:
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.this     // Catch: all -> 0x0078
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.n(r7, r6)     // Catch: all -> 0x0078
                goto L_0x00ac
            L_0x008f:
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper r7 = com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.this     // Catch: all -> 0x0078
                com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.m(r7, r6)     // Catch: all -> 0x0078
                goto L_0x00ac
            L_0x0095:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r0 = "error:"
                r7.<init>(r0)
                java.lang.String r6 = r6.getMessage()
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                java.lang.String r7 = "PublishInsertHelper"
                tb.ir9.b(r7, r6)
            L_0x00ac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper.PublishInsertBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public static boolean L(String str, TaskList.ExtraParams extraParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d34ab3f", new Object[]{str, extraParams})).booleanValue();
        }
        if (TextUtils.equals("video", str)) {
            return extraParams.videoWidth == null || extraParams.videoHeight == null;
        }
        return false;
    }

    public static Map c(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar, Map map, String str) {
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e64f761b", new Object[]{fluidContext, aVar, map, str});
        }
        if (!(aVar == null || aVar.e() == null || aVar.m() == null)) {
            if (TextUtils.equals(aVar.m(), fkg.PAGE_PUBLISH)) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                aVar.e().c = str;
                if (aVar.j(0) == 3) {
                    hashMap2.put("publishPic", I(aVar));
                }
                hashMap2.put("status", fkg.PAGE_PUBLISH);
                hashMap.put("extraMap", hashMap2);
                ir9.b("PublishInsertHelper", "发送了publish消息");
                return hashMap;
            } else if (TextUtils.equals(aVar.m(), "publishSuccess")) {
                a.d e = aVar.e();
                e.c = str;
                if (e.o() == null) {
                    map2 = new HashMap();
                } else {
                    map2 = e.o();
                }
                if (map2.get("status") == null || (!TextUtils.equals("publishSuccess", map2.get("status").toString()) && !TextUtils.equals("finish", map2.get("status").toString()))) {
                    map2.put("status", "publishSuccess");
                } else {
                    map2.put("status", "finish");
                    ((IPublishInsertService) fluidContext.getService(IPublishInsertService.class)).setPublishIInsertEnable(false);
                }
                if (aVar.j(0) == 3) {
                    map2.put("publishPic", I(aVar));
                }
                ir9.b("PublishInsertHelper", "发送了publishSuccess消息:" + map2.get("status"));
                return e.h(fluidContext);
            }
        }
        return map;
    }

    public final void M(TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447c8c1c", new Object[]{this, taskList});
            return;
        }
        TaskList.Task task = taskList.tasks.get(0);
        List<TaskList.Media> list = task.data.publishInfo.inputInfo.media;
        ArrayList arrayList = new ArrayList();
        for (TaskList.Media media : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", (Object) media.path);
            jSONObject.put("url", (Object) media.path);
            jSONObject.put("type", (Object) "PICTURE_ALBUM");
            jSONObject.put("height", (Object) media.height);
            jSONObject.put("width", (Object) media.width);
            arrayList.add(jSONObject);
        }
        String str = task.progress;
        String str2 = task.taskId;
        String str3 = task.status;
        TaskList.Music music = task.data.publishInfo.inputInfo.music;
        String str4 = music != null ? music.url : null;
        ir9.b("PublishInsertHelper", str + "--progress" + str3 + "--status" + str4 + "--musicUrl");
        ((IPublishInsertService) this.c.getService(IPublishInsertService.class)).setPublishIInsertEnable(true);
        if (!this.f7678a.containsKey(str2)) {
            IFeedsListService iFeedsListService = (IFeedsListService) this.c.getService(IFeedsListService.class);
            K(this.c, str2, t(this.c, arrayList, str2, str4));
            p();
        }
        if (TextUtils.equals("success", str3)) {
            E(taskList, str2);
        } else if (TextUtils.equals("fail", str3)) {
            ir9.b("PublishInsertHelper", "发布失败:" + task.data.failedCode);
        }
    }

    public final void N(TaskList taskList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("344327e0", new Object[]{this, taskList});
            return;
        }
        TaskList.Task task = taskList.tasks.get(0);
        TaskList.PublishInfo publishInfo = task.data.publishInfo;
        List<TaskList.Media> list = publishInfo.inputInfo.media;
        TaskList.ExtraParams extraParams = publishInfo.extraParams;
        String str = extraParams.videoHeight;
        String str2 = extraParams.videoWidth;
        String str3 = list.get(0).path;
        String str4 = list.size() > 1 ? task.data.publishInfo.inputInfo.media.get(1).path : null;
        String str5 = task.progress;
        String str6 = task.taskId;
        String str7 = task.status;
        ir9.b("PublishInsertHelper", str5 + "--progress" + str7 + "--status");
        ((IPublishInsertService) this.c.getService(IPublishInsertService.class)).setPublishIInsertEnable(true);
        if (!this.f7678a.containsKey(str6)) {
            IFeedsListService iFeedsListService = (IFeedsListService) this.c.getService(IFeedsListService.class);
            K(this.c, str6, u(this.c, str3, str, str2, str4, str6));
            p();
        }
        if (TextUtils.equals("success", str7)) {
            E(taskList, str6);
        } else if (TextUtils.equals("fail", str7)) {
            ir9.b("PublishInsertHelper", "发布失败:" + task.data.failedCode);
        }
    }

    public final boolean r(TaskList taskList) {
        String str;
        TaskList.PublishInfo publishInfo;
        TaskList.InputInfo inputInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("466617ec", new Object[]{this, taskList})).booleanValue();
        }
        if (!(taskList == null || sz3.a(taskList.tasks) || taskList.tasks.get(0).backParams == null)) {
            TaskList.Task task = taskList.tasks.get(0);
            if (TextUtils.isEmpty(task.backParams.subId)) {
                str = task.backParams.tabId;
            } else {
                str = task.backParams.subId;
            }
            if (!v() || task.type == 0) {
                String F = F(str);
                String tabId = this.c.getInstanceConfig().getTabId();
                if (!TextUtils.equals(F, tabId)) {
                    ir9.b("PublishInsertHelper", "发布跳转到的tab:" + str + "当前的tab" + tabId);
                    return false;
                } else if (x() || !TextUtils.equals(F, "campus")) {
                    TaskList.Data data = task.data;
                    if (data == null || (publishInfo = data.publishInfo) == null || (inputInfo = publishInfo.inputInfo) == null || task.progress == null) {
                        ir9.b("PublishInsertHelper", "发布task为空:" + task);
                    } else {
                        List<TaskList.Media> list = inputInfo.media;
                        if (sz3.a(list)) {
                            ir9.b("PublishInsertHelper", "发布的media内容为空");
                            return false;
                        }
                        String str2 = list.get(0).mediaType;
                        if (TextUtils.equals("photo", str2) && w()) {
                            ir9.b("PublishInsertHelper", " 发布的内容是图片, 互动暂不兼容");
                            return false;
                        } else if (!TextUtils.equals("video", str2) && !TextUtils.equals("photo", str2)) {
                            ir9.b("PublishInsertHelper", " 发布的内容不是视频和图片：" + str2);
                            return false;
                        } else if (z() || !TextUtils.equals("photo", str2)) {
                            TaskList.ExtraParams extraParams = taskList.tasks.get(0).data.publishInfo.extraParams;
                            if (extraParams == null) {
                                ir9.b("PublishInsertHelper", " extraParams为空：");
                                return false;
                            }
                            String str3 = extraParams.online_time;
                            if (str3 != null && str3.length() > 0) {
                                ir9.b("PublishInsertHelper", str3.concat("--isTimingPublish 定时发布"));
                                return false;
                            } else if (L(str2, extraParams)) {
                                ir9.b("PublishInsertHelper", "视频宽高为空");
                                return false;
                            } else if (!TextUtils.isEmpty(list.get(0).path)) {
                                return true;
                            } else {
                                ir9.b("PublishInsertHelper", "媒体的url 为空");
                                return false;
                            }
                        } else {
                            ir9.b("PublishInsertHelper", "图片发布上墙关闭");
                            return false;
                        }
                    }
                } else {
                    ir9.b("PublishInsertHelper", "校园tab上墙关闭:" + F);
                    return false;
                }
            } else {
                ir9.b("PublishInsertHelper", "异步发布内容不上墙:" + str);
                return false;
            }
        }
        return false;
    }
}
