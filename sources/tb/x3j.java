package tb;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.mytaobao.pagev2.MtbBizProxyV2;
import com.taobao.mytaobao.pagev2.MtbWeexManager;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class x3j implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f31114a;
    public final zot b;
    public final MtbWeexManager c;
    public final MtbBizProxyV2 d;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x3j.d(x3j.this).A();
            x3j.c(x3j.this).N();
        }
    }

    static {
        t2o.a(745537992);
    }

    public x3j(Activity activity, zot zotVar, MtbWeexManager mtbWeexManager, MtbBizProxyV2 mtbBizProxyV2) {
        ckf.h(activity, "aty");
        ckf.h(zotVar, "themeHelper");
        ckf.h(mtbWeexManager, "mtbWeexManager");
        ckf.h(mtbBizProxyV2, "mtbBizProxy");
        this.f31114a = activity;
        this.b = zotVar;
        this.c = mtbWeexManager;
        this.d = mtbBizProxyV2;
    }

    public static final /* synthetic */ MtbBizProxyV2 c(x3j x3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbBizProxyV2) ipChange.ipc$dispatch("ec870f27", new Object[]{x3jVar});
        }
        return x3jVar.d;
    }

    public static final /* synthetic */ MtbWeexManager d(x3j x3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbWeexManager) ipChange.ipc$dispatch("74f5f153", new Object[]{x3jVar});
        }
        return x3jVar.c;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ed4244", new Object[]{this});
        } else if (TBDeviceUtils.p(this.f31114a) || TBDeviceUtils.P(this.f31114a)) {
            TBAutoSizeConfig.x().d0(this);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c00bfd", new Object[]{this});
        } else {
            TBAutoSizeConfig.x().h0(this);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onActivityChanged(Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
        } else {
            ckf.h(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        ckf.h(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
        Rect a2 = rhx.a(this.f31114a);
        TLog.loge("mtbMainLink", "onScreenChanged windowRect.width()=" + a2.width() + " windowRect.height()=" + a2.height());
        zot zotVar = this.b;
        s3j i2 = MtbDataServiceFacade.i();
        zotVar.a(false, (i2 == null || (c = i2.c()) == null) ? null : c.getJSONObject("skinConfig"));
        MTPtrRecyclerView l = this.d.l();
        if (l != null) {
            l.post(new a());
        }
    }
}
