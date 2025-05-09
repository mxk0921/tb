package tb;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import tb.c9d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class afs implements c9d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f15715a;

    static {
        t2o.a(852492370);
        t2o.a(843055257);
    }

    public afs(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f15715a = bbsVar;
    }

    @Override // tb.c9d
    public String A(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a58185c", new Object[]{this, pluginModel});
        }
        if (pluginModel == null) {
            return null;
        }
        return pluginModel.getPackageUrl();
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            c9d.a.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            c9d.a.b(this);
        }
    }

    @Override // tb.c9d
    public JSONObject j() {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7a37e48f", new Object[]{this});
        }
        TMSMetaInfoWrapper P = this.f15715a.P();
        if (P == null || (e = P.e()) == null) {
            return null;
        }
        return e.getJSONObject("cacheInfo");
    }

    @Override // tb.c9d
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf330ae5", new Object[]{this});
        }
        return r8s.A(this.f15715a);
    }

    @Override // tb.c9d
    public String m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("321fa0dc", new Object[]{this, str});
        }
        ckf.g(str, "id");
        return null;
    }

    @Override // tb.c9d
    public JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e61a9cc", new Object[]{this});
        }
        return r8s.z(this.f15715a);
    }

    @Override // tb.c9d
    public String p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cde006e8", new Object[]{this});
        }
        TMSMetaInfoWrapper P = this.f15715a.P();
        if (P == null) {
            return null;
        }
        return P.f();
    }

    @Override // tb.c9d
    public JSONObject x(PluginModel pluginModel) {
        JSONObject extendInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cde8e9b9", new Object[]{this, pluginModel});
        }
        if (pluginModel == null || (extendInfo = pluginModel.getExtendInfo()) == null) {
            return null;
        }
        return extendInfo.getJSONObject("cacheInfo");
    }
}
