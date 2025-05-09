package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import tb.bpr;
import tb.hlc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nmr implements hlc.a, bpr.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_ANCHOR_BACK = 4;
    public static final int STATUS_ANCHOR_END = 5;
    public static final int STATUS_ANCHOR_LEAVE = 3;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_INIT_FAIL = 2;
    public static final int STATUS_INIT_SUCCESS = 1;
    public static nmr n;

    /* renamed from: a  reason: collision with root package name */
    public String f24831a;
    public String b;
    public String c;
    public String d;
    public String e;
    public JSONObject f;
    public hlc i;
    public TBLiveDataModel j;
    public bpr k;
    public Object l;
    public ArrayList<k9e> g = new ArrayList<>();
    public final String h = "0";
    public HashMap<bpr.c, MessageTypeFilter> m = new HashMap<>();

    static {
        t2o.a(779092037);
        t2o.a(806356090);
        t2o.a(779092002);
    }

    public nmr() {
        if (imr.b().a() == null) {
            imr.b().h(Globals.getApplication(), "TAOBAO");
        }
    }

    public static nmr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmr) ipChange.ipc$dispatch("e57e434e", new Object[0]);
        }
        if (n == null) {
            synchronized (nmr.class) {
                try {
                    if (n == null) {
                        n = new nmr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return n;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        hlc hlcVar = this.i;
        if (hlcVar != null) {
            hlcVar.destroy();
            this.i = null;
        }
        this.j = null;
        b();
        ArrayList<k9e> arrayList = this.g;
        if (arrayList != null) {
            arrayList.clear();
            this.g = null;
        }
        n = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c0894a", new Object[]{this});
            return;
        }
        bpr bprVar = this.k;
        if (bprVar != null) {
            bprVar.j();
            this.k.v();
            this.k = null;
        }
        HashMap<bpr.c, MessageTypeFilter> hashMap = this.m;
        if (hashMap != null) {
            hashMap.clear();
            this.m = null;
        }
    }

    public final void c(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75cf76b", new Object[]{this, new Integer(i), obj});
            return;
        }
        try {
            HashMap<bpr.c, MessageTypeFilter> hashMap = this.m;
            if (hashMap != null && hashMap.size() > 0) {
                Set<bpr.c> keySet = this.m.keySet();
                if (keySet.size() > 0) {
                    for (bpr.c cVar : keySet) {
                        MessageTypeFilter messageTypeFilter = this.m.get(cVar);
                        if (messageTypeFilter != null && messageTypeFilter.filter(i)) {
                            cVar.onMessageReceived(i, obj);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1af4e40a", new Object[]{this});
        }
        return this.f24831a;
    }

    public final void f(String str, String str2, boolean z, boolean z2) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0eff4", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.j == null) {
            this.j = new TBLiveDataModel();
        }
        this.j.mRoomInfo = new ChatRoomInfo();
        this.j.mRoomInfo.roomId = str;
        if (qvs.P0()) {
            bpr bprVar = this.k;
            if (bprVar != null) {
                bprVar.j();
                this.k.v();
            }
            if (!z2) {
                if (qvs.n0()) {
                    VideoInfo videoInfo = this.j.mVideoInfo;
                    if (videoInfo.fetchItemUseCdn && !TextUtils.isEmpty(videoInfo.fetchItemUseCdnUrl)) {
                        z3 = true;
                        VideoInfo videoInfo2 = this.j.mVideoInfo;
                        this.k = new glr(videoInfo2.roomType, str, str2, z, videoInfo2.forceCommentsUseCdn, false, z3, this);
                    }
                }
                z3 = false;
                VideoInfo videoInfo22 = this.j.mVideoInfo;
                this.k = new glr(videoInfo22.roomType, str, str2, z, videoInfo22.forceCommentsUseCdn, false, z3, this);
            } else if (this.j.mVideoInfo != null) {
                VideoInfo videoInfo3 = this.j.mVideoInfo;
                this.k = new bpr(videoInfo3.roomType, videoInfo3.topic, z, videoInfo3.forceCommentsUseCdn, this);
            } else {
                return;
            }
            this.k.n(false);
            this.k.t(this.j.mVideoInfo.liveId);
            this.k.u();
            this.k.i();
        }
    }

    public final void g(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eecf7ad", new Object[]{this, new Integer(i), obj});
        } else if (5 == i && s7t.j().o() == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            this.l = obj;
        } else {
            ArrayList<k9e> arrayList = this.g;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<k9e> it = this.g.iterator();
                while (it.hasNext()) {
                    it.next().onStatusChange(i, obj);
                }
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        bpr bprVar = this.k;
        if (bprVar != null) {
            bprVar.j();
        }
    }

    public void i(bpr.c cVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547a494a", new Object[]{this, cVar, messageTypeFilter});
            return;
        }
        if (this.m == null) {
            this.m = new HashMap<>();
        }
        if (cVar != null) {
            this.m.put(cVar, messageTypeFilter);
        }
    }

    public void j(k9e k9eVar) {
        ArrayList<k9e> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0f858b", new Object[]{this, k9eVar});
        } else if (k9eVar != null && (arrayList = this.g) != null) {
            arrayList.add(k9eVar);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        bpr bprVar = this.k;
        if (bprVar != null) {
            bprVar.i();
        }
    }

    public void l(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aecb085", new Object[]{this, str, str2, str3, str4, str5, str6, jSONObject});
            return;
        }
        this.f24831a = str;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.b = str6;
        this.f = jSONObject;
    }

    public void n(bpr.c cVar) {
        HashMap<bpr.c, MessageTypeFilter> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f696216", new Object[]{this, cVar});
        } else if (cVar != null && (hashMap = this.m) != null) {
            hashMap.remove(cVar);
        }
    }

    public void o(k9e k9eVar) {
        ArrayList<k9e> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456cb832", new Object[]{this, k9eVar});
        } else if (k9eVar != null && (arrayList = this.g) != null) {
            arrayList.remove(k9eVar);
        }
    }

    @Override // tb.hlc.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
        } else {
            g(2, str);
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
        } else if (videoInfo != null) {
            if (this.j == null) {
                this.j = new TBLiveDataModel();
            }
            TBLiveDataModel tBLiveDataModel = this.j;
            tBLiveDataModel.mVideoInfo = videoInfo;
            tBLiveDataModel.mRoomInfo = new ChatRoomInfo();
            TBLiveDataModel tBLiveDataModel2 = this.j;
            ChatRoomInfo chatRoomInfo = tBLiveDataModel2.mRoomInfo;
            String str2 = videoInfo.topic;
            chatRoomInfo.roomId = str2;
            tBLiveDataModel2.mRawData = str;
            int i = videoInfo.status;
            if (i == 4 || i == 0 || i == 3 || i == 1) {
                String str3 = videoInfo.channel;
                boolean z2 = videoInfo.fetchCommentsUseMtop;
                if (i == 1) {
                    z = true;
                }
                f(str2, str3, z2, z);
            }
            g(1, this.j);
        }
    }

    @Override // tb.bpr.c
    public void onMessageReceived(int i, Object obj) {
        VideoInfo videoInfo;
        JoinNotifyMessage joinNotifyMessage;
        VideoInfo videoInfo2;
        VideoInfo videoInfo3;
        VideoInfo videoInfo4;
        ShareGoodsListMessage shareGoodsListMessage;
        VideoInfo videoInfo5;
        VideoInfo videoInfo6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (i == 102) {
            TBLiveDataModel tBLiveDataModel = this.j;
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || videoInfo.status == 1 || (joinNotifyMessage = (JoinNotifyMessage) obj) == null)) {
                videoInfo.joinCount = joinNotifyMessage.onlineCount;
                videoInfo.totalJoinCount = joinNotifyMessage.totalCount;
                videoInfo.viewCount = joinNotifyMessage.pageViewCount;
            }
        } else if (i == 1002) {
            TBLiveDataModel tBLiveDataModel2 = this.j;
            if (!(tBLiveDataModel2 == null || (videoInfo2 = tBLiveDataModel2.mVideoInfo) == null || videoInfo2.status == 1)) {
                videoInfo2.praiseCount = ((Long) obj).longValue();
            }
        } else if (i == 1004) {
            TBLiveDataModel tBLiveDataModel3 = this.j;
            if (!(tBLiveDataModel3 == null || (videoInfo3 = tBLiveDataModel3.mVideoInfo) == null)) {
                videoInfo3.status = 1;
            }
            g(5, obj);
        } else if (i == 1009) {
            TBLiveDataModel tBLiveDataModel4 = this.j;
            if (!(tBLiveDataModel4 == null || (videoInfo4 = tBLiveDataModel4.mVideoInfo) == null || videoInfo4.status == 1 || (shareGoodsListMessage = (ShareGoodsListMessage) obj) == null)) {
                videoInfo4.curItemNum = shareGoodsListMessage.totalCount;
                if (shareGoodsListMessage.goodsList != null) {
                    videoInfo4.curItemList = new ArrayList<>();
                    for (ShareGoodMessage shareGoodMessage : shareGoodsListMessage.goodsList) {
                        this.j.mVideoInfo.curItemList.add(u2j.d(shareGoodMessage));
                    }
                }
            }
        } else if (i == 1006) {
            TBLiveDataModel tBLiveDataModel5 = this.j;
            if (!(tBLiveDataModel5 == null || (videoInfo5 = tBLiveDataModel5.mVideoInfo) == null)) {
                videoInfo5.status = 3;
            }
            g(3, null);
            return;
        } else if (i == 1007) {
            TBLiveDataModel tBLiveDataModel6 = this.j;
            if (!(tBLiveDataModel6 == null || (videoInfo6 = tBLiveDataModel6.mVideoInfo) == null)) {
                videoInfo6.status = 0;
            }
            g(4, null);
            return;
        }
        if (!(1004 == i && s7t.j().o() == VideoStatus.VIDEO_TIMESHIFT_STATUS)) {
            c(i, obj);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        hlc c = imr.b().c();
        this.i = c;
        if (c != null) {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.c)) {
                jSONObject.put("itemid", (Object) this.c);
            }
            jSONObject.put("guardAnchorSwitch", (Object) Boolean.valueOf(v2s.o().I("enableAnchorGuard")));
            jSONObject.put("version", (Object) "202003");
            JSONObject jSONObject2 = this.f;
            if (jSONObject2 != null) {
                jSONObject.putAll(jSONObject2);
            }
            this.i.getVideoInfo(new jg7(this.f24831a, "").D(this.d).B(this.e).w(this.b).s(jSONObject.toString()), this.h, this);
        }
        g(0, null);
    }
}
