package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.avplayer.s;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.login4android.api.Coordinator;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.ui.view.NewDetailMaskFrameLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q3h implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f26484a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f26485a;
        public final /* synthetic */ double b;
        public final /* synthetic */ int c;

        public a(Uri uri, double d, int i) {
            this.f26485a = uri;
            this.b = d;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f26485a != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("action", "process");
                hashMap.put("currentTimeOpt", String.valueOf(this.b));
                hashMap.put("liveId", String.valueOf(this.f26485a.getQueryParameter("id")));
                hashMap.put("livesource", this.f26485a.getQueryParameter("livesource"));
                hashMap.put("deviceLevel", String.valueOf(xj7.a()));
                hashMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
                hashMap.put("liveSession", String.valueOf(this.c));
                rbu.K(null, "NewArchitecturePlayStart", hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements scd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f26486a;
        public final /* synthetic */ ViewGroup[] b;

        public b(ViewGroup viewGroup, ViewGroup[] viewGroupArr) {
            this.f26486a = viewGroup;
            this.b = viewGroupArr;
        }

        @Override // tb.scd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe17d436", new Object[]{this});
            }
        }

        @Override // tb.scd
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82c35aa2", new Object[]{this});
            }
        }

        @Override // tb.scd
        public void c(BaseStatePlayer baseStatePlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdb6d58f", new Object[]{this, baseStatePlayer, new Long(j), new Long(j2), new Long(j3), obj});
            }
        }

        @Override // tb.scd
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7d615fd", new Object[]{this});
            }
        }

        @Override // tb.scd
        public void e(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97b6435a", new Object[]{this, viewGroup});
                return;
            }
            ViewGroup viewGroup2 = this.f26486a;
            if (viewGroup2 != null && viewGroup != null) {
                this.b[0] = viewGroup;
                viewGroup2.addView(viewGroup, 0, new ViewGroup.LayoutParams(1, 1));
            }
        }

        @Override // tb.scd
        public void f(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93f493d0", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.scd
        public void g(mcd mcdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616bf76b", new Object[]{this, mcdVar});
            }
        }

        @Override // tb.scd
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bed2268", new Object[]{this});
            }
        }

        @Override // tb.scd
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                q3h.a(q3h.this, this.f26486a, this.b[0]);
            }
        }

        @Override // tb.scd
        public void onTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a13bc209", new Object[]{this});
            } else {
                q3h.a(q3h.this, this.f26486a, this.b[0]);
            }
        }
    }

    static {
        t2o.a(779092732);
        t2o.a(578814049);
    }

    public static /* synthetic */ void a(q3h q3hVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c690cf9", new Object[]{q3hVar, viewGroup, viewGroup2});
        } else {
            q3hVar.x(viewGroup, viewGroup2);
        }
    }

    public final void A(Intent intent, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349d4cfc", new Object[]{this, intent, activity, str});
            return;
        }
        MediaLiveInfo mediaLiveInfo = (MediaLiveInfo) fkx.f(str, MediaLiveInfo.class);
        if (activity == null) {
            activity = c21.i();
        }
        if (activity != null && mediaLiveInfo != null && !mediaLiveInfo.liveUrlList.isEmpty() && intent.getData() != null) {
            if (s.c.g(s.c.h(mediaLiveInfo, null))) {
                s("已经存在播放器实例，不预热");
                return;
            }
            String b2 = new lxw(activity, mediaLiveInfo).b();
            Uri.Builder buildUpon = intent.getData().buildUpon();
            buildUpon.appendQueryParameter(yj4.PARAM_PLAY_MODE, "liveUrlList");
            buildUpon.appendQueryParameter(yj4.WARMUP_PLAYER_TOKEN, b2);
            intent.setData(buildUpon.build());
        }
    }

    public final String[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6d303c5a", new Object[]{this});
        }
        return v2s.o().p().b("tblive", "cdnPreRequestBlackList", "cjtj").split(",");
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50a7da9f", new Object[]{this, str})).booleanValue();
        }
        String P2 = pvs.P2();
        if (P2 != null) {
            String[] split = P2.split(",");
            if (split.length > 0) {
                return Arrays.asList(split).contains(str);
            }
        }
        return false;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c661c3b8", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enablePreRequestTimeMove", "true"));
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38821b8", new Object[]{this});
        }
        return i9l.b("tblive", "liveRoomUrls", "[\"market.m.taobao.com/app/mtb/app-live-h5-room/home/index.html\",\"market.wapa.taobao.com/app/mtb/app-live-h5-room/home/index.html\",\"h5.m.taobao.com/taolive/video.html\",\"h5.m.taobao.com/taolive/room.html\",\"wapp.m.taobao.com/taolive/video.html\",\"h5.wapa.taobao.com/taolive/video.html\",\"huodong.m.taobao.com/act/talent/live.html\",\"h5.m.taobao.com/taolive/video-multi.html\"]");
    }

    public final void k(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c1ba1f", new Object[]{this, intent, zmjVar});
            return;
        }
        if (zmjVar != null && r(zmjVar.d())) {
            m(intent, zmjVar);
        }
        if (bl9.g().b() && d9m.e().getBackwardX() != null) {
            d9m.e().getBackwardX().a(intent, zmjVar);
        }
        Uri data = intent.getData();
        if (data != null && !p(data.getQueryParameter("livesource"))) {
            NewDetailMaskFrameLayout.startCheckCurrentDeviceStatus(3);
        }
    }

    public final void l(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a26d078", new Object[]{this, intent});
            return;
        }
        o(intent);
        z(intent);
    }

    public final void m(Intent intent, zmj zmjVar) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20975b23", new Object[]{this, intent, zmjVar});
        } else if (intent != null && intent.getData() != null && zmjVar != null && r(zmjVar.d())) {
            Uri data = intent.getData();
            String queryParameter = data.getQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY);
            if (TextUtils.isEmpty(queryParameter)) {
                uri = data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
            } else {
                String uri2 = data.toString();
                uri = Uri.parse(uri2.replace("largescreenstyle=" + queryParameter, "largescreenstyle=fullscreen"));
            }
            intent.setData(uri);
        }
    }

    public final void n(Intent intent, zmj zmjVar) {
        Activity activity;
        String str;
        MediaData mediaData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5affba3", new Object[]{this, intent, zmjVar});
        } else if (f() && zmjVar != null) {
            if (((zmjVar.d() instanceof Activity) || c21.i() != null) && intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                if (TextUtils.isEmpty(data.getQueryParameter(yj4.PARAM_PLAY_VIEW_TOKEN))) {
                    if (RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(data.getQueryParameter(yj4.PARAM_PRODUCT_TYPE)) || y(data.getQueryParameter("livesource"))) {
                        x5t.c("看点/回放，不预播");
                        return;
                    }
                    if (zmjVar.d() instanceof Activity) {
                        activity = (Activity) zmjVar.d();
                    } else {
                        activity = c21.i();
                    }
                    if (activity != null) {
                        Window window = activity.getWindow();
                        if (window == null) {
                            x5t.h("LiveRoomProcessor", "[Metrics-VideoPrePlay: window is null");
                            return;
                        }
                        View decorView = window.getDecorView();
                        if (!(decorView instanceof ViewGroup)) {
                            x5t.h("LiveRoomProcessor", "[Metrics-VideoPrePlay: intent not contains mediaInfo");
                            return;
                        }
                        String queryParameter = data.getQueryParameter("id");
                        String queryParameter2 = data.getQueryParameter("livesource");
                        if (intent.getExtras() != null && intent.getExtras().getString(yj4.PARAM_MEDIA_INFO) != null) {
                            mediaData = mxg.a(fkx.d(intent.getExtras().getString(yj4.PARAM_MEDIA_INFO)));
                            str = "prePlayMediaInfo";
                        } else if (data.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL) != null) {
                            if (e(queryParameter2)) {
                                mediaData = mxg.a(fkx.d(data.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL)));
                                str = "prePlayCustomPlayCtrlParams";
                            } else {
                                if (pvs.E0()) {
                                    A(intent, activity, data.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL));
                                }
                                mediaData = null;
                                str = null;
                            }
                        } else if (data.getQueryParameter("id") == null) {
                            String queryParameter3 = data.getQueryParameter(yj4.PARAM_NEED_RECOMMEND);
                            if (queryParameter == null && queryParameter2 != null && Boolean.parseBoolean(queryParameter3)) {
                                if (vnm.c().e(vnm.PRE_CREATE_ROOM_REC.concat(queryParameter2))) {
                                    String b2 = gsm.a().b(queryParameter2);
                                    if (b2 == null || gsm.a().c(b2) == null) {
                                        mediaData = null;
                                    } else {
                                        MediaData mediaData2 = gsm.a().c(b2).f23322a;
                                        intent.putExtra("liveUrlList", mediaData2.liveUrlList);
                                        intent.setData(Uri.parse(data.toString().replace("needRecommend=true", "needRecommend=false") + "&id=" + b2));
                                        mediaData = mediaData2;
                                    }
                                    str = "prePlayRecommend";
                                } else if (g(intent)) {
                                    v(intent, data, "mtopLiveUrlListRecPreRequest");
                                }
                            }
                            mediaData = null;
                            str = null;
                        } else if (gsm.a().c(data.getQueryParameter("id")) != null) {
                            mediaData = gsm.a().c(queryParameter).f23322a;
                            intent.putExtra("liveUrlList", mediaData.liveUrlList);
                            str = yj4.URL_PLAY_MODE_PRE_CREATE;
                        } else {
                            if (c(intent)) {
                                v(intent, data, "cdnLiveUrlListPreRequest");
                            }
                            mediaData = null;
                            str = null;
                        }
                        if (mediaData == null) {
                            o3s.b("LiveRoomProcessor", "非预播");
                            return;
                        }
                        Uri data2 = intent.getData();
                        mcd u = u(zmjVar, mediaData, data2, (ViewGroup) decorView);
                        if (u != null && !TextUtils.isEmpty(u.c())) {
                            Uri.Builder buildUpon = data2.buildUpon();
                            buildUpon.appendQueryParameter(yj4.PARAM_PLAY_VIEW_TOKEN, u.c());
                            buildUpon.appendQueryParameter(yj4.PARAM_PLAY_MODE, str);
                            intent.setData(buildUpon.build());
                        }
                    }
                }
            }
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "LiveRoomProcessor";
    }

    public final void o(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a294b94", new Object[]{this, intent});
            return;
        }
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("livesource");
        HashMap hashMap = new HashMap();
        hashMap.put("livesource", queryParameter);
        hashMap.put("entryLiveSource", queryParameter);
        Set<String> queryParameterNames = data.getQueryParameterNames();
        if (queryParameterNames.contains("spm")) {
            hashMap.put("spm-url", data.getQueryParameter("spm"));
        }
        if (queryParameterNames.contains("id")) {
            hashMap.put("id", data.getQueryParameter("id"));
        }
        if (queryParameterNames.contains("bizFrom")) {
            hashMap.put("bizCode", data.getQueryParameter("bizFrom"));
        }
        if (!(v2s.o() == null || v2s.o().h() == null)) {
            hashMap.put("brandLevel", String.valueOf(v2s.o().h().getDeviceLevel()));
        }
        uvg.g().k("LIVE_CODE_BOOT_STAGE", hashMap);
        x5t.f("LiveRoomProcessor", "initMonitorParams success");
    }

    public final boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41e0200a", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("homepage".equals(str) || "follow".equals(str) || str.contains("homepage.") || str.contains("follow.")) {
            return true;
        }
        return false;
    }

    public final boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dd8e493", new Object[]{this, str})).booleanValue();
        }
        try {
            if (this.f26484a == null) {
                this.f26484a = (JSONArray) JSON.parseObject(j(), JSONArray.class);
            }
            for (int i = 0; i < this.f26484a.size(); i++) {
                if (str.contains(this.f26484a.getString(i))) {
                    return true;
                }
            }
        } catch (Exception unused) {
            o3s.b("LiveRoomProcessor", "live room url parse error");
        }
        return false;
    }

    public final boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291a7758", new Object[]{this, context})).booleanValue();
        }
        if (!vc.a() || (!vc.i(context) && !vc.d(context))) {
            return false;
        }
        return true;
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            v2s.o().A().c("LiveRoomProcessor", str);
        }
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void t(Activity activity, Intent intent, LiveItem.SpfPlayVideo spfPlayVideo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50498", new Object[]{this, activity, intent, spfPlayVideo, str, str2, str3});
            return;
        }
        String b2 = vnm.c().b(str, str2, str3);
        if (intent.getData() != null) {
            Uri data = intent.getData();
            new vtt().c(activity, data.toString());
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(yj4.P2FF_REUSE_TOKEN, b2);
            intent.setData(buildUpon.build());
        }
    }

    public final void v(Intent intent, Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc98cb27", new Object[]{this, intent, uri, str});
        } else if (pvs.f1()) {
            String e = wnm.b().e(intent, uri);
            if (!zqq.a(e)) {
                intent.putExtra("mediaInfoPreRequestKey", e);
                intent.putExtra("preRequestUrlPlayMode", str);
            }
        }
    }

    public final void w(zmj zmjVar, Intent intent) {
        Activity i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec0bdf", new Object[]{this, zmjVar, intent});
            return;
        }
        Uri data = intent.getData();
        if (data != null && RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(data.getQueryParameter(yj4.PARAM_PRODUCT_TYPE))) {
            if (!zqq.a(data.getQueryParameter(yj4.PARAM_SJSD_ITEM_ID)) || !zqq.a(data.getQueryParameter(yj4.PARAM_TIMEMOVING_ITEM_ID)) || !zqq.a(data.getQueryParameter("timeMovingSpfPlayVideo"))) {
                String queryParameter = data.getQueryParameter("id");
                String queryParameter2 = data.getQueryParameter(yj4.PARAM_TIMEMOVING_ITEM_ID);
                String queryParameter3 = data.getQueryParameter(yj4.PARAM_SJSD_ITEM_ID);
                if (h()) {
                    if (queryParameter == null || (queryParameter2 == null && queryParameter3 == null)) {
                        s("看点id 和 sjsdItemId 为空");
                        return;
                    } else {
                        s("看点预请求");
                        vnm.c().h(xnm.b(data), queryParameter, queryParameter2, queryParameter3);
                    }
                }
                if (nqo.k()) {
                    if (zmjVar.d() instanceof Activity) {
                        i = (Activity) zmjVar.d();
                    } else {
                        i = c21.i();
                    }
                    LiveItem.SpfPlayVideo spfPlayVideo = (LiveItem.SpfPlayVideo) fkx.f(data.getQueryParameter("timeMovingSpfPlayVideo"), LiveItem.SpfPlayVideo.class);
                    if (i != null && spfPlayVideo != null) {
                        t(i, intent, spfPlayVideo, queryParameter, queryParameter2, queryParameter3);
                    }
                }
            }
        }
    }

    public final void x(ViewGroup viewGroup, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261de8ce", new Object[]{this, viewGroup, viewGroup2});
        } else if (viewGroup != null && viewGroup2 != null && viewGroup.indexOfChild(viewGroup2) != -1) {
            viewGroup.removeView(viewGroup2);
        }
    }

    public final boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4baa0f2b", new Object[]{this, str})).booleanValue();
        }
        String Q2 = pvs.Q2();
        if (!zqq.a(Q2)) {
            String[] split = Q2.split(",");
            if (split.length > 0) {
                return Arrays.asList(split).contains(str);
            }
        }
        return false;
    }

    public final void z(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b1180b", new Object[]{this, intent});
        } else if (qvs.v()) {
            Uri data = intent.getData();
            if (data.getQueryParameterNames().contains("isSmallWindowBack") && TextUtils.equals("1", data.getQueryParameter("isSmallWindowBack"))) {
                x5t.f("LiveRoomProcessor", "hit smallWindow and return");
            } else if (data.getQueryParameterNames().contains(yj4.PARAM_PLAY_VIEW_TOKEN)) {
                x5t.f("LiveRoomProcessor", "hit playViewToken");
            } else if (data.getQueryParameterNames().contains(yj4.PARAM_CUSTOM_PLAY_CTRL)) {
                x5t.f("LiveRoomProcessor", "hit customPlayCtrlParams");
            } else if (!TextUtils.equals("detailLive", data.getQueryParameter("livesource"))) {
                x5t.f("LiveRoomProcessor", "livesource is not detailLive");
            } else {
                String queryParameter = data.getQueryParameter("id");
                if (TextUtils.isEmpty(queryParameter)) {
                    x5t.f("LiveRoomProcessor", "liveId is null");
                } else if (TextUtils.isEmpty(up6.k(vx9.d())) || !TextUtils.equals(queryParameter, up6.k(vx9.d()))) {
                    vnm.c().f(intent, xnm.a(intent));
                    x5t.f("LiveRoomProcessor", "start preRequest");
                } else {
                    x5t.f("LiveRoomProcessor", "liveId hit the same room");
                }
            }
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef94d4d", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableLiveroomProcessLiveOpt", "false"));
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f27ba17", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().getStringSharedPreference("tblive", "enablePrePlayNew", "true"));
        }
        return true;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee04a188", new Object[]{this})).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableTbliveUtBugfix", "true"));
        }
        return false;
    }

    public final boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c1dffe", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        if (!zqq.a(data.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL)) || !zqq.a(data.getQueryParameter(yj4.PARAM_LIVE_PLAY_URL))) {
            s("存在秒开参数，屏蔽CDN预请求 ");
            return false;
        } else if (!Arrays.asList(b()).contains(data.getQueryParameter("livesource"))) {
            return true;
        } else {
            s("cdn 预请求黑名单，屏蔽CDN预请求");
            return false;
        }
    }

    public final boolean g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5d067c4", new Object[]{this, intent})).booleanValue();
        }
        if (bqg.b(intent)) {
            s("屏蔽极简唤端");
            return false;
        } else if (intent.getData() == null) {
            return false;
        } else {
            String queryParameter = intent.getData().getQueryParameter("livesource");
            if (zqq.a(queryParameter)) {
                s("liveSource 为空，屏蔽");
                return false;
            }
            String R2 = pvs.R2();
            if (!zqq.a(R2)) {
                for (String str : R2.split(",")) {
                    if (queryParameter.startsWith(str)) {
                        s("livesource: " + queryParameter + " 黑名单屏蔽");
                        return false;
                    }
                }
            }
            return true;
        }
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        h4s.b("KLifecycle_route");
        h4s.e();
        com.android.tools.ir.runtime.a.a("com.taobao.taolive", null);
        if (intent != null && i()) {
            double currentTimeMillis = System.currentTimeMillis();
            Uri data = intent.getData();
            if (data != null) {
                int hashCode = (data.getQueryParameter("id") + currentTimeMillis).hashCode();
                intent.putExtra("newLiveSession", String.valueOf(hashCode));
                Coordinator.execute(new a(data, currentTimeMillis, hashCode));
            }
        }
        if (pvs.w0() || NetworkStatusHelper.isConnected()) {
            if (intent.getData() != null) {
                String uri = intent.getData().toString();
                if (TextUtils.isEmpty(uri) || ((pvs.B0() && !q(uri)) || (!pvs.B0() && !uri.contains("h5.m.taobao.com/taolive/video.html")))) {
                    return true;
                }
                n(intent, zmjVar);
                k(intent, zmjVar);
                if (d()) {
                    l(intent);
                }
            }
            w(zmjVar, intent);
            return true;
        }
        if (!(v2s.o().f() == null || v2s.o().f().getApplication() == null)) {
            x0u.a(v2s.o().f().getApplication(), "网络异常，暂时无法进入直播间");
        }
        o3s.b("LiveRoomProcessor", "process isConnected false return");
        return false;
    }

    public final mcd u(zmj zmjVar, MediaData mediaData, Uri uri, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mcd) ipChange.ipc$dispatch("e03bfbb0", new Object[]{this, zmjVar, mediaData, uri, viewGroup});
        }
        ufi ufiVar = new ufi();
        String b2 = com.taobao.taolive.sdk.ui.media.a.b(mediaData, null);
        ufiVar.b = b2;
        ufiVar.f29342a = tfi.h(b2);
        if (tfi.i().j(ufiVar.f29342a, ufiVar.b)) {
            return null;
        }
        o3s.b("LiveRoomProcessor", "拦截器预创建播放器");
        PreloadParams G = new PreloadParams.a(zmjVar.d()).f0(ufiVar).Q(mediaData).b0(1).I(false).V(new b(viewGroup, new ViewGroup[1])).H(ejr.a()).G();
        x5t.h("LiveRoomProcessor", "[VideoPrePlay_startTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        mcd a2 = zrm.a(G);
        a2.b();
        a2.a(true);
        x5t.h("LiveRoomProcessor", "[VideoPrePlay_endTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        return a2;
    }
}
