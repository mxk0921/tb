package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e6m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18323a;
    public PlayControllerConfig b;
    public PlayControllerConfig c;
    public Boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PlayControllerConfig f18324a;
        public final /* synthetic */ String b;

        public a(PlayControllerConfig playControllerConfig, String str) {
            this.f18324a = playControllerConfig;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PlayControllerConfig playControllerConfig = this.f18324a;
            if (playControllerConfig == null) {
                str = null;
            } else {
                str = JSON.toJSONString(playControllerConfig);
            }
            tlp.c(e6m.a(e6m.this, this.b), str);
        }
    }

    static {
        t2o.a(491782761);
    }

    public e6m(cfc cfcVar) {
        this.f18323a = cfcVar.getContainerType().getContainerId();
    }

    public static /* synthetic */ String a(e6m e6mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a0d4a6b", new Object[]{e6mVar, str});
        }
        return e6mVar.c(str);
    }

    public final JSONObject b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91e03649", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            fve.e("PlayControllerConfigParser", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e("PlayControllerConfigParser", "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            return ext.getJSONObject("homeGlobalABTest");
        }
        fve.e("PlayControllerConfigParser", "ext == null");
        return null;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cd663b9", new Object[]{this, str});
        }
        return "PlayControllerConfig" + str;
    }

    public PlayControllerConfig d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("d2a819ae", new Object[]{this});
        }
        PlayControllerConfig playControllerConfig = this.b;
        if (playControllerConfig != null) {
            return playControllerConfig;
        }
        PlayControllerConfig f = f(this.f18323a);
        this.b = f;
        if (f == null) {
            this.b = new PlayControllerConfig();
            fve.e("PlayControllerConfigParser", "使用默认配置 ： " + this.b.toString());
        } else {
            fve.e("PlayControllerConfigParser", "文件读取的配置 ： " + this.b.toString());
        }
        g(this.b);
        PlayControllerConfig playControllerConfig2 = this.b;
        this.c = playControllerConfig2;
        return playControllerConfig2;
    }

    public PlayControllerConfig e(IContainerDataModel<?> iContainerDataModel) {
        PlayControllerConfig playControllerConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("e555d45a", new Object[]{this, iContainerDataModel});
        }
        PlayControllerConfig d = d();
        JSONObject b = b(iContainerDataModel);
        String str = null;
        PlayControllerConfig playControllerConfig2 = b != null ? (PlayControllerConfig) JSON.parseObject(b.toJSONString(), PlayControllerConfig.class) : null;
        StringBuilder sb = new StringBuilder("服务端下发的配置： ");
        if (playControllerConfig2 != null) {
            str = playControllerConfig2.toString();
        }
        sb.append(str);
        fve.e("PlayControllerConfigParser", sb.toString());
        if (!ObjectUtils.b(this.c, playControllerConfig2)) {
            this.c = playControllerConfig2;
            h(this.f18323a, playControllerConfig2);
        }
        if (playControllerConfig2 == null || !playControllerConfig2.isValid()) {
            playControllerConfig = new PlayControllerConfig();
        } else {
            playControllerConfig = d.deepCopy();
        }
        playControllerConfig.setPlayControlEnable(d.isPlayControlEnable());
        return playControllerConfig;
    }

    public final PlayControllerConfig f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("b410c8c7", new Object[]{this, str});
        }
        String b = tlp.b(c(str), null);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return (PlayControllerConfig) JSON.parseObject(b, PlayControllerConfig.class);
    }

    public final void g(PlayControllerConfig playControllerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1104e11c", new Object[]{this, playControllerConfig});
            return;
        }
        if (this.d == null) {
            this.d = Boolean.valueOf(mve.a("enablePlayControllerByService", true));
        }
        playControllerConfig.setPlayControlEnable(this.d.booleanValue());
    }

    public final void h(String str, PlayControllerConfig playControllerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ac2a68", new Object[]{this, str, playControllerConfig});
        } else {
            get.a().e(new a(playControllerConfig, str));
        }
    }
}
