package com.taobao.taolive.room.business.mess;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.InteractBusiness;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.model.common.UserLevelAvatar;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.b0d;
import tb.clo;
import tb.dyg;
import tb.e7w;
import tb.fgv;
import tb.ggv;
import tb.jlc;
import tb.m09;
import tb.qsj;
import tb.sjr;
import tb.t2o;
import tb.up6;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.yj4;
import tb.zrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a implements b0d, jlc, fgv.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f13137a;
    public boolean b;
    public boolean c;
    public dyg d;
    public final List<b0d> e = new ArrayList();
    public NetResponse f;
    public NetBaseOutDo g;
    public Object h;
    public ux9 i;
    public LiveDetailMessinfoResponseData j;

    static {
        t2o.a(779092825);
        t2o.a(806355932);
        t2o.a(806355012);
        t2o.a(806356153);
    }

    @Override // tb.jlc
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4f6420a", new Object[]{this})).booleanValue();
        }
        if (this.j != null) {
            return true;
        }
        return false;
    }

    @Override // tb.jlc
    public void b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        } else {
            this.i = ux9Var;
        }
    }

    @Override // tb.jlc
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfa3c754", new Object[]{this});
        }
        return this.j.snsNick;
    }

    @Override // tb.jlc
    public synchronized void d(b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6476d7bb", new Object[]{this, b0dVar});
        } else if (b0dVar != null) {
            if (!this.b) {
                ((ArrayList) this.e).add(b0dVar);
            } else if (this.c) {
                b0dVar.onSuccess(0, this.f, this.g, this.h);
            } else {
                b0dVar.onError(0, this.f, this.h);
            }
        }
    }

    @Override // tb.jlc
    public synchronized void e(b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3058e23d", new Object[]{this, b0dVar});
            return;
        }
        List<b0d> list = this.e;
        if (list != null) {
            ((ArrayList) list).remove(b0dVar);
        }
    }

    @Override // tb.jlc
    public LiveDetailMessinfoResponseData f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData) ipChange.ipc$dispatch("f2ed0bfb", new Object[]{this});
        }
        return this.j;
    }

    public final void g() {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f62f26b", new Object[]{this});
            return;
        }
        VideoInfo c0 = up6.c0(this.i);
        if (c0 != null && c0.broadCaster != null && !TextUtils.isEmpty(c0.topic) && v2s.o().u() != null) {
            UserLevelAvatar userLevelAvatar = new UserLevelAvatar();
            userLevelAvatar.userid = v2s.o().u().getUserId();
            userLevelAvatar.nick = v2s.o().u().getNick();
            LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = this.j;
            if (liveDetailMessinfoResponseData == null || (hashMap = liveDetailMessinfoResponseData.visitorIdentity) == null) {
                HashMap<String, String> hashMap2 = c0.visitorIdentity;
                if (hashMap2 != null) {
                    userLevelAvatar.identify = hashMap2;
                }
            } else {
                userLevelAvatar.identify = hashMap;
            }
            userLevelAvatar.isMember = c0.shopVip;
            userLevelAvatar.flowSource = h();
            InteractBusiness.l(c0.liveId, c0.broadCaster.accountId, c0.topic, PowerMsgType.userLevelEnter, JSON.toJSONString(userLevelAvatar), null, null, e7w.i(this.i));
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f940d7a", new Object[]{this});
        }
        Map<String, String> J = up6.J(this.i);
        if (J == null || J.isEmpty()) {
            return "";
        }
        return J.get(yj4.PARAM_FLOW_SOURCE);
    }

    public final void i(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        LiveDetailMessinfoResponseData data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ee3624", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        LiveDetailMessinfoResponse liveDetailMessinfoResponse = (LiveDetailMessinfoResponse) netBaseOutDo;
        if (!(liveDetailMessinfoResponse == null || (data = liveDetailMessinfoResponse.getData()) == null)) {
            this.j = data;
            g();
            if (data.visitorIdentity != null) {
                m09.e().g(data.visitorIdentity.get(m09.FANS_LEVEL_RENDER));
            }
            LiveDetailMessinfoResponseData.ActivityInfo activityInfo = data.activity;
            if (activityInfo != null) {
                up6.D0(activityInfo.bizData, this.i);
            } else {
                up6.D0(null, this.i);
            }
        }
        this.f = netResponse;
        this.g = netBaseOutDo;
        this.h = obj;
        this.c = true;
        this.b = true;
        int size = ((ArrayList) this.e).size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b0d) ((ArrayList) this.e).get(i2)).onSuccess(i, netResponse, netBaseOutDo, obj);
        }
    }

    public final void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35eb780", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.d == null) {
                this.d = new dyg(this);
            }
            this.d.K(str, str2, this.i);
        }
    }

    @Override // tb.jlc
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        dyg dygVar = this.d;
        if (dygVar != null) {
            dygVar.destroy();
            this.d = null;
        }
        ((ArrayList) this.e).clear();
        this.f13137a = false;
        this.b = false;
        this.j = null;
        this.i = null;
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (obj instanceof dyg) {
            i(i, netResponse, netBaseOutDo, obj);
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
            return;
        }
        LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = (LiveDetailMessinfoResponseData) zrl.b(unImportantLiveInfoResponseData.messData, LiveDetailMessinfoResponseData.class);
        if (liveDetailMessinfoResponseData != null) {
            LiveDetailMessinfoResponse liveDetailMessinfoResponse = new LiveDetailMessinfoResponse();
            liveDetailMessinfoResponse.setData(liveDetailMessinfoResponseData);
            i(i, netResponse, liveDetailMessinfoResponse, obj);
        }
    }

    @Override // tb.fgv.e
    public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.jlc
    public synchronized void start(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4e7c7d", new Object[]{this, str, str2});
            return;
        }
        if (!this.f13137a) {
            if (ggv.a()) {
                ux9 ux9Var = this.i;
                if ((ux9Var instanceof clo) && ((clo) ux9Var).t0() != null) {
                    ((clo) this.i).t0().i(this);
                }
            } else {
                j(str, str2);
            }
            this.f13137a = true;
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (netResponse != null) {
            if (qsj.c(netResponse.getRetCode())) {
                sjr.g().d(uyg.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW);
            }
            this.j = null;
            g();
            this.f = netResponse;
            this.h = obj;
            this.c = false;
            this.b = true;
            int size = ((ArrayList) this.e).size();
            for (int i2 = 0; i2 < size; i2++) {
                ((b0d) ((ArrayList) this.e).get(i2)).onError(i, netResponse, obj);
            }
            if (v2s.o().e() != null) {
                v2s.o().e().commitFail("taolive", netResponse.getApi(), netResponse.getRetCode(), netResponse.getRetMsg());
            }
        }
    }
}
