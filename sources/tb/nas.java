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
public final class nas implements c9d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f24609a;

    static {
        t2o.a(834666535);
        t2o.a(843055257);
    }

    public nas(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f24609a = bbsVar;
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
            return (JSONObject) ipChange.ipc$dispatch("691beaa5", new Object[]{this, tMSMetaInfoWrapper});
        }
        ckf.d(tMSMetaInfoWrapper);
        JSONObject e = tMSMetaInfoWrapper.e();
        if (e == null) {
            return null;
        }
        return e.getJSONObject("byteCacheInfo");
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
        if (this.f24609a.P() == null) {
            return null;
        }
        return t(this.f24609a.P());
    }

    @Override // tb.c9d
    public String l() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf330ae5", new Object[]{this});
        }
        TMSMetaInfoWrapper U = this.f24609a.U();
        if (U == null) {
            str = null;
        } else {
            str = U.d();
        }
        if (str != null) {
            return str;
        }
        TMSMetaInfoWrapper U2 = this.f24609a.U();
        if (U2 == null) {
            return null;
        }
        return U2.f();
    }

    @Override // tb.c9d
    public String m0(String str) {
        String str2;
        AppModel c;
        AppInfoModel appInfoModel;
        JSONObject subPackages;
        JSONObject h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("321fa0dc", new Object[]{this, str});
        }
        ckf.g(str, "id");
        TMSMetaInfoWrapper U = this.f24609a.U();
        if (U == null || (h = U.h()) == null) {
            str2 = null;
        } else {
            str2 = h.getString(str);
        }
        if (str2 != null) {
            return str2;
        }
        TMSMetaInfoWrapper U2 = this.f24609a.U();
        if (U2 == null || (c = U2.c()) == null || (appInfoModel = c.getAppInfoModel()) == null || (subPackages = appInfoModel.getSubPackages()) == null) {
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
        if (this.f24609a.U() == null) {
            return null;
        }
        JSONObject b = b(this.f24609a.U());
        if (b == null) {
            return t(this.f24609a.U());
        }
        return b;
    }

    @Override // tb.c9d
    public String p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cde006e8", new Object[]{this});
        }
        if (this.f24609a.P() == null) {
            return null;
        }
        TMSMetaInfoWrapper P = this.f24609a.P();
        ckf.d(P);
        return P.f();
    }

    public final JSONObject t(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
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

    @Override // tb.c9d
    public JSONObject x(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cde8e9b9", new Object[]{this, pluginModel});
        }
        if (pluginModel == null) {
            return null;
        }
        return y(pluginModel);
    }

    public final JSONObject y(PluginModel pluginModel) {
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
}
