package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nc4 implements cqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<cqk> f24633a = new ArrayList();
    public lc4 b;
    public JSONObject c;
    public NetResponse d;
    public NetBaseOutDo e;
    public Object f;
    public boolean g;
    public boolean h;
    public boolean i;
    public khf j;

    static {
        t2o.a(295699859);
        t2o.a(806356561);
    }

    public nc4(Context context, khf khfVar) {
        this.j = khfVar;
    }

    public final void a(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2a883", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        jbu.a("TaoLiveRoomTest", "getComponentList end:" + System.currentTimeMillis());
        khf khfVar = this.j;
        if (khfVar != null) {
            khfVar.k(true);
        }
        this.d = netResponse;
        this.e = netBaseOutDo;
        this.f = obj;
        this.i = true;
        this.h = true;
        int size = ((ArrayList) this.f24633a).size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ArrayList) this.f24633a).get(i2) != null) {
                ((cqk) ((ArrayList) this.f24633a).get(i2)).onSuccess(i, netResponse, netBaseOutDo, obj);
            }
        }
    }

    public synchronized void b(b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3058e23d", new Object[]{this, b0dVar});
            return;
        }
        List<cqk> list = this.f24633a;
        if (list != null) {
            ((ArrayList) list).remove(b0dVar);
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (!this.h) {
            jbu.b("getComponentList_track", "errorCode=destroy_" + this.g + "_" + this.i + "_" + this.h);
        }
        List<cqk> list = this.f24633a;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        lc4 lc4Var = this.b;
        if (lc4Var != null) {
            lc4Var.destroy();
            this.b = null;
        }
        this.j = null;
    }

    public final void d(VideoInfo videoInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4459dedf", new Object[]{this, videoInfo, str, str2, str3});
            return;
        }
        if (this.b == null) {
            this.b = new lc4(this);
        }
        this.b.K(videoInfo.liveId, str3, str, str2, videoInfo.roomType, videoInfo.newRoomType);
    }

    public synchronized void e(cqk cqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b741b85", new Object[]{this, cqkVar});
        } else {
            f(cqkVar, false);
        }
    }

    public synchronized void f(cqk cqkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131007ef", new Object[]{this, cqkVar, new Boolean(z)});
        } else if (cqkVar == null) {
            jbu.b("getComponentList_track", "errorCode=listener is null");
        } else {
            if (this.h) {
                if (this.i) {
                    JSONObject jSONObject = this.c;
                    if (jSONObject == null) {
                        cqkVar.onSuccess(0, this.d, this.e, this.f);
                    } else {
                        cqkVar.R1(jSONObject);
                    }
                } else {
                    cqkVar.onError(0, this.d, this.f);
                }
            } else if (z) {
                ((ArrayList) this.f24633a).add(0, cqkVar);
            } else {
                ((ArrayList) this.f24633a).add(cqkVar);
            }
        }
    }

    public synchronized void g(ux9 ux9Var, VideoInfo videoInfo, String str, String str2, String str3, f7a f7aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786b6194", new Object[]{this, ux9Var, videoInfo, str, str2, str3, f7aVar});
            return;
        }
        Log.e("TaoLiveRoomTest", "getComponentList start:" + System.currentTimeMillis());
        if (!this.g) {
            if (videoInfo != null) {
                if (f7aVar == null || !tws.s()) {
                    d(videoInfo, str, str2, str3);
                } else {
                    f7aVar.a(this);
                }
                this.g = true;
            }
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        jbu.a("TaoLiveRoomTest", "getComponentList end onError:" + System.currentTimeMillis() + " type " + i);
        khf khfVar = this.j;
        if (khfVar != null) {
            khfVar.k(false);
        }
        this.d = netResponse;
        this.f = obj;
        this.i = false;
        this.h = true;
        int size = ((ArrayList) this.f24633a).size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ArrayList) this.f24633a).get(i2) != null) {
                ((cqk) ((ArrayList) this.f24633a).get(i2)).onError(i, netResponse, obj);
            }
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            a(i, netResponse, netBaseOutDo, obj);
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

    @Override // tb.cqk
    public void R1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f21fde", new Object[]{this, jSONObject});
            return;
        }
        jbu.a("TaoLiveRoomTest", "smartlanding getComponentList end:" + System.currentTimeMillis());
        khf khfVar = this.j;
        if (khfVar != null) {
            khfVar.k(true);
        }
        this.c = jSONObject;
        this.i = true;
        this.h = true;
        int size = ((ArrayList) this.f24633a).size();
        for (int i = 0; i < size; i++) {
            if (((ArrayList) this.f24633a).get(i) != null) {
                ((cqk) ((ArrayList) this.f24633a).get(i)).R1(jSONObject);
            }
        }
    }
}
