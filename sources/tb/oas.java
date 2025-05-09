package tb;

import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import tb.c9d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class oas implements c9d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f25264a;

    static {
        t2o.a(834666540);
        t2o.a(843055257);
    }

    public oas(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f25264a = bbsVar;
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

    public final JSONObject b(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9fe1cf4d", new Object[]{this, tMSMetaInfoWrapper});
        }
        ckf.d(tMSMetaInfoWrapper);
        JSONObject e = tMSMetaInfoWrapper.e();
        if (e == null) {
            return null;
        }
        return e.getJSONObject("cacheInfo");
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7a37e48f", new Object[]{this});
        }
        if (this.f25264a.P() == null) {
            return null;
        }
        return b(this.f25264a.P());
    }

    @Override // tb.c9d
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf330ae5", new Object[]{this});
        }
        TMSMetaInfoWrapper U = this.f25264a.U();
        if (U == null) {
            return null;
        }
        return U.f();
    }

    @Override // tb.c9d
    public String m0(String str) {
        AppModel c;
        AppInfoModel appInfoModel;
        JSONObject subPackages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("321fa0dc", new Object[]{this, str});
        }
        ckf.g(str, "id");
        TMSMetaInfoWrapper U = this.f25264a.U();
        if (U == null || (c = U.c()) == null || (appInfoModel = c.getAppInfoModel()) == null || (subPackages = appInfoModel.getSubPackages()) == null) {
            return null;
        }
        return subPackages.getString(str);
    }

    @Override // tb.c9d
    public JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e61a9cc", new Object[]{this});
        }
        if (this.f25264a.U() == null) {
            return null;
        }
        return b(this.f25264a.U());
    }

    @Override // tb.c9d
    public String p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cde006e8", new Object[]{this});
        }
        if (this.f25264a.P() == null) {
            return null;
        }
        TMSMetaInfoWrapper P = this.f25264a.P();
        ckf.d(P);
        return P.f();
    }

    public final JSONObject t(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dc0ae7bc", new Object[]{this, pluginModel});
        }
        JSONObject extendInfo = pluginModel.getExtendInfo();
        if (extendInfo == null) {
            return null;
        }
        return extendInfo.getJSONObject("cacheInfo");
    }

    @Override // tb.c9d
    public JSONObject x(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cde8e9b9", new Object[]{this, pluginModel});
        }
        if (pluginModel == null) {
            return null;
        }
        return t(pluginModel);
    }
}
