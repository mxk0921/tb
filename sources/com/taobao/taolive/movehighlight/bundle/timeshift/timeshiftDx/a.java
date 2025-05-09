package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cdr;
import tb.cxg;
import tb.d47;
import tb.dwt;
import tb.dxa;
import tb.exa;
import tb.fkx;
import tb.gxa;
import tb.iba;
import tb.ixa;
import tb.iz1;
import tb.nsm;
import tb.t2o;
import tb.ufo;
import tb.uwa;
import tb.ux9;
import tb.vx9;
import tb.wwa;
import tb.yj4;
import tb.ztt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBLiveDataModel f13058a;
    public ixa b;
    public int c = 0;
    public int d = 5;
    public final View e;
    public final ux9 f;
    public dwt g;
    public String h;
    public String i;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0744a extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f13059a;

        public C0744a(c cVar) {
            this.f13059a = cVar;
        }

        public static /* synthetic */ Object ipc$super(C0744a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/TimeShiftRequestDx$1");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onSystemError(i, netResponse, obj);
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else {
                a.a(a.this, netResponse, this.f13059a);
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a.b(a.this, this.f13059a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f13060a;
        public final WeakReference<a> b;
        public final c c;
        public final iz1 d;
        public String e;
        public VideoInfo f;
        public String g;
        public boolean h;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a$b$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0745a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nsm f13061a;

            public RunnableC0745a(nsm nsmVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.this.b.get() != null && b.this.c != null) {
                    this.f13061a.getClass();
                    this.f13061a.getClass();
                    a.b(b.this.b.get(), b.this.c);
                }
            }
        }

        static {
            t2o.a(779092530);
        }

        public b(View view, a aVar, c cVar, iz1 iz1Var, VideoInfo videoInfo, String str) {
            super("taolive_highlight_preloadThread");
            this.f13060a = new WeakReference<>(view);
            this.b = new WeakReference<>(aVar);
            this.c = cVar;
            this.f = videoInfo;
            this.g = str;
            a();
        }

        private void a() {
            LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7b88aec", new Object[]{this});
                return;
            }
            VideoInfo videoInfo = this.f;
            if (videoInfo != null && (timeMovingPlayInfo = videoInfo.timeMovingPlayInfo) != null) {
                if (!TextUtils.isEmpty(timeMovingPlayInfo.keyPointId)) {
                    this.e = this.f.timeMovingPlayInfo.keyPointId;
                } else if (!TextUtils.isEmpty(this.f.timeMovingPlayInfo.timeMovingId)) {
                    this.e = this.f.timeMovingPlayInfo.timeMovingId;
                } else {
                    this.e = null;
                }
            }
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1548812690) {
                super.run();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/TimeShiftRequestDx$MyPreloadThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                super.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(JSONObject jSONObject);
    }

    static {
        t2o.a(779092528);
    }

    public a(TBLiveDataModel tBLiveDataModel, View view, ux9 ux9Var) {
        this.f13058a = tBLiveDataModel;
        this.e = view;
        this.f = ux9Var;
        l();
    }

    public static /* synthetic */ void a(a aVar, NetResponse netResponse, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8e17df", new Object[]{aVar, netResponse, cVar});
        } else {
            aVar.d(netResponse, cVar);
        }
    }

    public static /* synthetic */ void b(a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46de186", new Object[]{aVar, cVar});
        } else {
            aVar.g(cVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        ixa ixaVar = this.b;
        if (ixaVar != null) {
            ixaVar.destroy();
            this.b = null;
        }
    }

    public final void e(String str, c cVar, iz1 iz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df95efbf", new Object[]{this, str, cVar, iz1Var});
            return;
        }
        VideoInfo e = cxg.e(this.f13058a);
        if (this.c != 0) {
            this.h = ufo.b(this.h);
        }
        if (e != null && !TextUtils.isEmpty(e.liveId)) {
            uwa.i();
            j(str, cVar, e);
        }
    }

    public void f(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1940525", new Object[]{this, cVar});
            return;
        }
        this.d = 15;
        e(null, cVar, null);
    }

    public final void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90eb3973", new Object[]{this, cVar});
        } else if (this.f13058a != null && this.c == 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hideStructList", (Object) Boolean.TRUE);
            cVar.a(jSONObject);
            VideoInfo e = cxg.e(this.f13058a);
            if (e != null && !TextUtils.isEmpty(e.replayUrl)) {
                HashMap hashMap = new HashMap();
                hashMap.put(yj4.PARAM_PLAY_URL, e.replayUrl);
                hashMap.put("type", "video");
                dxa b2 = dxa.b(this.f);
                if (b2.f() != null) {
                    b2.f().m(this.f, hashMap);
                }
                if (b2.i() != null) {
                    b2.i().a(null);
                }
            }
        }
    }

    public final void h(LiveTimemovingModel liveTimemovingModel) {
        LiveItem.Ext ext;
        LiveItem.Ext ext2;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae3c53ef", new Object[]{this, liveTimemovingModel});
            return;
        }
        dxa b2 = dxa.b(this.f);
        if (liveTimemovingModel != null && (ext2 = liveTimemovingModel.extendVal) != null && !TextUtils.isEmpty(ext2.timeMovingPlayInfo) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) fkx.f(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
            HashMap<String, String> b3 = gxa.b(timeMovingPlayInfo, liveTimemovingModel.extendVal.playUrl, this.f);
            if (b2.f() != null) {
                b2.f().m(this.f, b3);
            }
        } else if (liveTimemovingModel != null && (ext = liveTimemovingModel.extendVal) != null && !TextUtils.isEmpty(ext.playUrl)) {
            HashMap hashMap = new HashMap();
            hashMap.put(yj4.PARAM_PLAY_URL, liveTimemovingModel.extendVal.playUrl);
            hashMap.put("type", "video");
            hashMap.put("loop", "true");
            if (b2.f() != null) {
                b2.f().m(this.f, hashMap);
            }
        }
    }

    public final void j(String str, c cVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73bcdc0e", new Object[]{this, str, cVar, videoInfo});
            return;
        }
        ixa ixaVar = new ixa(this.f, new C0744a(cVar));
        this.b = ixaVar;
        ixaVar.K(videoInfo.liveId, this.c, this.d, str, this.h, this.i);
    }

    public a k(dwt dwtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6bc66bfd", new Object[]{this, dwtVar});
        }
        this.g = dwtVar;
        return this;
    }

    public final void l() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb6b274", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.f13058a;
        if (tBLiveDataModel != null && (map = tBLiveDataModel.mInitParams) != null) {
            String str = this.f13058a.mInitParams.get(yj4.PARAM_TRANSPARENT_PARAMS);
            this.h = str;
            this.h = ufo.c(str, map.get("timeMovingPcmIdParam"));
        }
    }

    public void m(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e47a1c", new Object[]{this, tBLiveDataModel});
        } else {
            this.f13058a = tBLiveDataModel;
        }
    }

    public final void d(NetResponse netResponse, c cVar) {
        JSONObject jSONObject;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6225764", new Object[]{this, netResponse, cVar});
        } else if (netResponse != null && netResponse.getDataJsonObject() != null && (jSONObject = (JSONObject) fkx.a(netResponse.getDataJsonObject().toString())) != null && jSONObject.get("model") != null) {
            JSONObject jSONObject2 = (JSONObject) jSONObject.get("model");
            if (jSONObject2 != null) {
                JSONArray jSONArray = jSONObject2.getJSONArray("timeMovingList");
                if (this.c == 0) {
                    if (jSONArray == null || jSONArray.size() <= 0) {
                        jSONObject.put("hideStructList", (Object) Boolean.TRUE);
                        g(cVar);
                    } else {
                        LiveTimemovingModel liveTimemovingModel = (LiveTimemovingModel) JSON.parseObject(((JSONObject) jSONArray.get(0)).toJSONString(), LiveTimemovingModel.class);
                        if (liveTimemovingModel != null) {
                            h(liveTimemovingModel);
                            dwt dwtVar = this.g;
                            if (dwtVar != null) {
                                dwtVar.o(liveTimemovingModel);
                            }
                            ux9 ux9Var = this.f;
                            if ((ux9Var instanceof cdr) && ((cdr) ux9Var).p0) {
                                iba.l0(liveTimemovingModel.timeMovingId, vx9.f(ux9Var));
                            }
                            jSONObject.put("selectedItemId", (Object) liveTimemovingModel.itemId);
                            ux9 ux9Var2 = this.f;
                            if (ux9Var2 != null && (ux9Var2.l() instanceof wwa)) {
                                ((wwa) this.f.l()).d = liveTimemovingModel.itemId;
                            }
                            jSONObject.put("selectedItemIndex", (Object) 0);
                            LiveItem.TimeMovingPlayInfo a2 = ztt.a(liveTimemovingModel);
                            List<LiveItem.TimeMovingLabelInfos> b2 = ztt.b(JSON.toJSONString(a2));
                            if (a2 != null) {
                                if (b2.size() != 0) {
                                    z = false;
                                }
                                jSONObject.put("hideStructList", (Object) Boolean.valueOf(z));
                                jSONObject.put("itemIsSpeaking", (Object) Boolean.valueOf(a2.isSpeaking));
                            }
                            jSONObject.put("kandianNewLayout", (Object) "new_layout_newCard");
                            exa.b(this.f, this.f13058a, liveTimemovingModel);
                        }
                    }
                }
                if (jSONArray != null && jSONArray.size() > 0) {
                    this.c += this.d;
                }
            }
            cVar.a((JSONObject) jSONObject.clone());
        }
    }

    public void i(ux9 ux9Var, iz1 iz1Var, String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42d675d", new Object[]{this, ux9Var, iz1Var, str, str2, cVar});
            return;
        }
        this.c = 0;
        this.d = 5;
        this.i = str2;
        Map<String, String> A = iba.A(vx9.f(ux9Var), this.f13058a);
        if (A != null && !TextUtils.isEmpty(A.get(yj4.PARAM_TIMEMOVING_ITEM_ID)) && TextUtils.isEmpty(str)) {
            str = A.get(yj4.PARAM_TIMEMOVING_ITEM_ID);
        }
        e(str, cVar, iz1Var);
    }
}
